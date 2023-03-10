/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class InvoCustomerDialog extends JDialog {
    private JTextField clientNameField;
    private JTextField invDateField;
    private JLabel clientNameLbl;
    private JLabel invDateLbl;
    private JButton okBtn;
    private JButton cancelBtn;

    public InvoCustomerDialog(InvoFrame frame) {
        clientNameLbl = new JLabel("Customer Name:");
        clientNameField = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date (dd-MM-YYYY):");
        invDateField = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createInvOK");
        cancelBtn.setActionCommand("createInvCancel");
        
        okBtn.addActionListener(frame.getListener());
        cancelBtn.addActionListener(frame.getListener());
        setLayout(new GridLayout(3, 2));
        
        add(invDateLbl);
        add(invDateField);
        add(clientNameLbl);
        add(clientNameField);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustNameField() {
        return clientNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }
    
}
