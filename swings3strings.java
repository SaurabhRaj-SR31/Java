

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class swings3strings {
    public static void main(String[] args) {
        append c = new append();
    }
}

class append implements ActionListener {

    JFrame f = new JFrame("swing1");
    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);
    JLabel l1 = new JLabel("enter string:");
    JLabel l2 = new JLabel("enter position:");
    JLabel l3 = new JLabel("result:");
    JButton b = new JButton("ok");

    public append() {

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);

        f.add(l3);

        // ActionListener al = new ActionListener() {
        // public void actionPerformed(ActionEvent ae) {
        // int n1 = Integer.parseInt(t1.getText());
        // int n2 = Integer.parseInt(t2.getText());
        // int val = 0;
        // if (ae.getSource() == b) {
        // val = n1 + n2;
        // }
        // else if (ae.getSource() == b1) {
        // val = n1 - n2;
        // }
        // else if (ae.getSource() == b2) {
        // val = n1 *n2;
        // }
        // else if (ae.getSource() == b3) {
        // val = n1 / n2;
        // }
        // l3.setText(val + "");
        // }
        // };

        // b.addActionListener(al);
        // b1.addActionListener(al);
        // b2.addActionListener(al);
        // b3.addActionListener(al);

        b.addActionListener(this);

        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        String s1 = t1.getText();
       int t1= Integer.parseInt(t2.getText());
    

        if (s1.length() == 0 ) {
            // l3.setText("empty textfield");
            JOptionPane.showMessageDialog(l3,"empty textfield" );
        } 
        else {
            for (int i = 0; i <s1.length(); i++) {
                if(s1.charAt(t1)==s1.charAt(i))
                JOptionPane.showMessageDialog(l3,s1.charAt(i));
            }
            
            

        }
    }
}