/*
 * This file is part of HortonMachine (http://www.hortonmachine.org)
 * (C) HydroloGIS - www.hydrologis.com 
 * 
 * The HortonMachine is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.hortonmachine.gui.utils.monitor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.hortonmachine.gears.utils.StringUtilities;

/**
 * An action that uses a progress monitor to update.
 * 
 * @author Antonello Andrea (www.hydrologis.com)
 */
@SuppressWarnings("serial")
public abstract class ActionWithProgress extends AbstractAction {

    protected Component parent;
    private int total;
    private boolean indeterminate;
    private String progressTitle;
    protected List<AbstractAction> connectedActions = new ArrayList<>();

    /**
     * Constructor.
     * 
     * @param parent the parent component.
     * @param progressTitle the initial title of the progress.
     * @param total the total count of work.
     * @param indeterminate if <code>true</code>, the dialog is indeterminate.
     */
    public ActionWithProgress( Component parent, String progressTitle, int total, boolean indeterminate ) {
        this.parent = parent;
        this.progressTitle = progressTitle;
        this.total = total;
        this.indeterminate = indeterminate;
    }

    @Override
    public void actionPerformed( ActionEvent event ) {
        setEnabled(false);
        for( AbstractAction abstractAction : connectedActions ) {
            abstractAction.setEnabled(false);
        }

        new Thread(() -> {
            ProgressMonitor monitor = null;
            try {
                monitor = ProgressUtil.createModalProgressMonitor(parent, total, indeterminate, 100);
                monitor.start(progressTitle);

                backGroundWork(monitor);

                for( AbstractAction abstractAction : connectedActions ) {
                    abstractAction.setEnabled(true);
                }

                postWork();
            } catch (Exception e) {
                onError(e);
            } finally {
                setEnabled(true);
                // to ensure that progress dlg is closed in case of any exception
                if (monitor != null && monitor.getCurrent() != monitor.getTotal())
                    monitor.setCurrent(null, monitor.getTotal());
            }
        }, "ActionWithPogress -> " + progressTitle).start();

    }

    /**
     * Implements here the heavy work to be done.
     * 
     * @param monitor the monitor that can be used to update the user.
     * @throws Exception
     */
    public abstract void backGroundWork( ProgressMonitor monitor ) throws Exception;

    /**
     * This is run once the heavy work is done and the button of the action has been enabled again.
     * 
     * @throws Exception
     */
    public void postWork() throws Exception {

    }

    public void addConnectedAction( AbstractAction action ) {
        if (!connectedActions.contains(action))
            connectedActions.add(action);
    }

    /**
     * Called if an error occurrs. Can be overridden. SHows dialog by default.
     * 
     * @param e the exception thrown.
     */
    public void onError( Exception e ) {
        e.printStackTrace();
        String localizedMessage = e.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = e.getMessage();
        }
        if (localizedMessage == null || localizedMessage.trim().length() == 0) {
            localizedMessage = "An undefined error was thrown. Please send the below trace to your technical contact:\n";
            localizedMessage += ExceptionUtils.getStackTrace(e);
        }

        String _localizedMessage = localizedMessage;
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                JOptionPane.showMessageDialog(parent, _localizedMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

}
