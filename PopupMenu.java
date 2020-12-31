/**
 *
 * @author f_hack
 * 
 * 
 * HardHack Entertainment Roleplay Organizer (H.E.R.O)
 *                              2020
 * 
 *      Fabian Hack
 * 
 *   toss some coins via Paypal!
 * 
 */

package CDTOOL;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.undo.UndoManager;


public class PopupMenu {
    
    public static void addTo(JTextArea txtArea) {
        
        JPopupMenu popup = new JPopupMenu();
        UndoManager undoManager = new UndoManager();
        txtArea.getDocument().addUndoableEditListener(undoManager);

        Action undoAction = new AbstractAction("Undo") {

            public void actionPerformed(ActionEvent ae) {
                if (undoManager.canUndo()) {
                    undoManager.undo();
                }
                else {
                   System.out.println("No Undo Buffer.");
                }
            }
        };

       Action copyAction = new AbstractAction("Copy") {

            public void actionPerformed(ActionEvent ae) {
                txtArea.copy();
            }
        };

        Action cutAction = new AbstractAction("Cut") {

            public void actionPerformed(ActionEvent ae) {
                txtArea.cut();
            }
        };

        Action pasteAction = new AbstractAction("Paste") {

            public void actionPerformed(ActionEvent ae) {
                txtArea.paste();
            }
        };

        Action selectAllAction = new AbstractAction("Select All") {

            public void actionPerformed(ActionEvent ae) {
                txtArea.selectAll();
            }
        };

        //cutAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control X"));
        //copyAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control C"));
        //pasteAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control V"));
        //selectAllAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control A"));

        popup.add (undoAction);
        popup.addSeparator();
        popup.add (cutAction);
        popup.add (copyAction);
        popup.add (pasteAction);
        popup.addSeparator();
        popup.add (selectAllAction);

       txtArea.setComponentPopupMenu(popup);
    }
    
    public static void addTo(JTextField txtField) {
        
        JPopupMenu popup = new JPopupMenu();
        UndoManager undoManager = new UndoManager();
        txtField.getDocument().addUndoableEditListener(undoManager);

        Action undoAction = new AbstractAction("Undo") {

            public void actionPerformed(ActionEvent ae) {
                if (undoManager.canUndo()) {
                    undoManager.undo();
                }
                else {
                   System.out.println("No Undo Buffer.");
                }
            }
        };

       Action copyAction = new AbstractAction("Copy") {

            public void actionPerformed(ActionEvent ae) {
                txtField.copy();
            }
        };

        Action cutAction = new AbstractAction("Cut") {

            public void actionPerformed(ActionEvent ae) {
                txtField.cut();
            }
        };

        Action pasteAction = new AbstractAction("Paste") {

            public void actionPerformed(ActionEvent ae) {
                txtField.paste();
            }
        };

        Action selectAllAction = new AbstractAction("Select All") {

            public void actionPerformed(ActionEvent ae) {
                txtField.selectAll();
            }
        };

        cutAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control X"));
        copyAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control C"));
        pasteAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control V"));
        selectAllAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control A"));

        popup.add (undoAction);
        popup.addSeparator();
        popup.add (cutAction);
        popup.add (copyAction);
        popup.add (pasteAction);
        popup.addSeparator();
        popup.add (selectAllAction);

       txtField.setComponentPopupMenu(popup);
    }
}