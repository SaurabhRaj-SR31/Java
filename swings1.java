import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class divisonby0exception extends RuntimeException {
    divisonby0exception(String msg) {
        super(msg);

    }
}

class swings1 {
    public static void main(String[] args) {
        calculate c = new calculate();
    }
}

class calculate implements ActionListener {

    JFrame f = new JFrame("swing1");
    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);
    JLabel l1 = new JLabel("enter no.-1:");
    JLabel l2 = new JLabel("enter no.-2:");
    JLabel l3 = new JLabel("result:");
    JButton b = new JButton("add");
    JButton b1 = new JButton("subtract");
    JButton b2 = new JButton("multiply");
    JButton b3 = new JButton("divide");

    public calculate() {

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);

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
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int val = 0;
            if (ae.getSource() == b) {
                val = n1 + n2;
            } else if (ae.getSource() == b1) {
                val = n1 - n2;
            } else if (ae.getSource() == b2) {
                val = n1 * n2;
            } else if (ae.getSource() == b3) {
                if (n2 == 0) {
                    throw new divisonby0exception("not possible");

                } else
                    val = n1 / n2;
            }
            l3.setText(val + "");
        } catch (divisonby0exception e) {
            JOptionPane.showMessageDialog(l3, e.getMessage());

        }
    }

}