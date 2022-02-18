package org.hortonmachine.database;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;


public class DatabaseView extends JPanel
{
   JSplitPane _mainSplitPane = new JSplitPane();
   JButton _newDbButton = new JButton();
   JButton _connectDbButton = new JButton();
   JButton _disconnectDbButton = new JButton();
   JButton _historyButton = new JButton();
   JButton _templatesButton = new JButton();
   JButton _connectRemoteDbButton = new JButton();

   /**
    * Default constructor
    */
   public DatabaseView()
   {
      initializePanel();
   }

   /**
    * Adds fill components to empty cells in the first row and first column of the grid.
    * This ensures that the grid spacing will be the same as shown in the designer.
    * @param cols an array of column indices in the first row where fill components should be added.
    * @param rows an array of row indices in the first column where fill components should be added.
    */
   void addFillComponents( Container panel, int[] cols, int[] rows )
   {
      Dimension filler = new Dimension(10,10);

      boolean filled_cell_11 = false;
      CellConstraints cc = new CellConstraints();
      if ( cols.length > 0 && rows.length > 0 )
      {
         if ( cols[0] == 1 && rows[0] == 1 )
         {
            /** add a rigid area  */
            panel.add( Box.createRigidArea( filler ), cc.xy(1,1) );
            filled_cell_11 = true;
         }
      }

      for( int index = 0; index < cols.length; index++ )
      {
         if ( cols[index] == 1 && filled_cell_11 )
         {
            continue;
         }
         panel.add( Box.createRigidArea( filler ), cc.xy(cols[index],1) );
      }

      for( int index = 0; index < rows.length; index++ )
      {
         if ( rows[index] == 1 && filled_cell_11 )
         {
            continue;
         }
         panel.add( Box.createRigidArea( filler ), cc.xy(1,rows[index]) );
      }

   }

   /**
    * Helper method to load an image file from the CLASSPATH
    * @param imageName the package and name of the file to load relative to the CLASSPATH
    * @return an ImageIcon instance with the specified image file
    * @throws IllegalArgumentException if the image resource cannot be loaded.
    */
   public ImageIcon loadImage( String imageName )
   {
      try
      {
         ClassLoader classloader = getClass().getClassLoader();
         java.net.URL url = classloader.getResource( imageName );
         if ( url != null )
         {
            ImageIcon icon = new ImageIcon( url );
            return icon;
         }
      }
      catch( Exception e )
      {
         e.printStackTrace();
      }
      throw new IllegalArgumentException( "Unable to load image: " + imageName );
   }

   /**
    * Method for recalculating the component orientation for 
    * right-to-left Locales.
    * @param orientation the component orientation to be applied
    */
   public void applyComponentOrientation( ComponentOrientation orientation )
   {
      // Not yet implemented...
      // I18NUtils.applyComponentOrientation(this, orientation);
      super.applyComponentOrientation(orientation);
   }

   public JPanel createPanel()
   {
      JPanel jpanel1 = new JPanel();
      FormLayout formlayout1 = new FormLayout("FILL:DEFAULT:NONE,FILL:250PX:GROW(0.3),FILL:DEFAULT:NONE","CENTER:DEFAULT:NONE,CENTER:DEFAULT:NONE,FILL:2DLU:GROW(1.0),FILL:DEFAULT:NONE");
      CellConstraints cc = new CellConstraints();
      jpanel1.setLayout(formlayout1);

      _mainSplitPane.setDividerLocation(113);
      _mainSplitPane.setLastDividerLocation(-1);
      _mainSplitPane.setName("mainSplitPane");
      jpanel1.add(_mainSplitPane,cc.xy(2,3));

      jpanel1.add(createPanel1(),cc.xy(2,2));
      addFillComponents(jpanel1,new int[]{ 1,2,3 },new int[]{ 1,2,3,4 });
      return jpanel1;
   }

   public JPanel createPanel1()
   {
      JPanel jpanel1 = new JPanel();
      FormLayout formlayout1 = new FormLayout("FILL:DEFAULT:NONE,FILL:4DLU:NONE,FILL:DEFAULT:NONE,FILL:4DLU:NONE,FILL:DEFAULT:NONE,FILL:4DLU:NONE,FILL:DEFAULT:NONE,FILL:4DLU:NONE,FILL:DEFAULT:NONE,FILL:4DLU:NONE,FILL:DEFAULT:NONE,FILL:4DLU:NONE,FILL:DEFAULT:NONE,FILL:DEFAULT:NONE,FILL:DEFAULT:NONE","CENTER:DEFAULT:NONE");
      CellConstraints cc = new CellConstraints();
      jpanel1.setLayout(formlayout1);

      _newDbButton.setActionCommand("New");
      _newDbButton.setName("newDbButton");
      _newDbButton.setText("New");
      jpanel1.add(_newDbButton,cc.xy(1,1));

      _connectDbButton.setActionCommand("Connect");
      _connectDbButton.setName("connectDbButton");
      _connectDbButton.setText("Connect");
      jpanel1.add(_connectDbButton,cc.xy(3,1));

      _disconnectDbButton.setActionCommand("Disconnect");
      _disconnectDbButton.setName("disconnectDbButton");
      _disconnectDbButton.setText("Disconnect");
      jpanel1.add(_disconnectDbButton,cc.xy(7,1));

      _historyButton.setActionCommand("History");
      _historyButton.setName("historyButton");
      _historyButton.setText("History");
      jpanel1.add(_historyButton,cc.xy(9,1));

      _templatesButton.setActionCommand("Templates");
      _templatesButton.setName("templatesButton");
      _templatesButton.setText("Templates");
      jpanel1.add(_templatesButton,cc.xy(11,1));

      _connectRemoteDbButton.setActionCommand("Connect");
      _connectRemoteDbButton.setName("connectRemoteDbButton");
      _connectRemoteDbButton.setText("Connect Remote");
      jpanel1.add(_connectRemoteDbButton,cc.xy(5,1));

      addFillComponents(jpanel1,new int[]{ 2,4,6,8,10,12,13,14,15 },new int[0]);
      return jpanel1;
   }

   /**
    * Initializer
    */
   protected void initializePanel()
   {
      setLayout(new BorderLayout());
      add(createPanel(), BorderLayout.CENTER);
   }


}
