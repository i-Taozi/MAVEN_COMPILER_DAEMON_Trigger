package mage.cards;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class TextPopup extends javax.swing.JPanel {
    private String text;
    private boolean needsUpdate;

    /** Creates new form TextPopup */
    public TextPopup() {
        initComponents();
    }

    public void setText(String text) {
        if(!text.equals(this.text)) {
            this.text = text;
            this.needsUpdate = true;
        }
    }

    public void updateText() {
        if(this.needsUpdate) {
            popupText.setText(this.text);
            this.needsUpdate = false;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupText = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.BorderLayout());

        popupText.setBackground(new java.awt.Color(204, 204, 204));
        popupText.setColumns(20);
        popupText.setEditable(false);
        popupText.setLineWrap(true);
        popupText.setRows(1);
        popupText.setWrapStyleWord(true);
        popupText.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        add(popupText, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea popupText;
    // End of variables declaration//GEN-END:variables

}
