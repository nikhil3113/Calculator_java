import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainFrame extends JFrame{
    Container c;
    JButton btn1, btn2, btn3, btn4, btn5,btn6, btn7, btn8, btn9, btn0, btnEqual, btnAdd, btnSub, btnDiv, btnMul, btnMod, btnDot,btnClear,btnBackspace;
    JTextField txtAns;
    JTextArea labAns;
    double temp, solveTemp;
    boolean addBool=false;
    boolean subBool=false;
    boolean mulBool=false;
    boolean divBool=false;
    boolean modBool=false;
    MainFrame(){
        c=getContentPane();
        c.setLayout(null);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");

        btnEqual = new JButton("=");
        btnAdd = new JButton("+");
        btnSub = new JButton("-");
        btnMul = new JButton("x");
        btnDiv = new JButton("\u00F7");
        btnMod = new JButton("%");
        btnDot = new JButton(".");
        btnClear= new JButton("C");

        txtAns = new JTextField(10);
        labAns = new JTextArea("");
        btnBackspace=new JButton("<-");
       

        Font f = new Font("Arial", Font.BOLD, 40);
        btn1.setFont(f);
        btn2.setFont(f);
        btn3.setFont(f);
        btn4.setFont(f);
        btn5.setFont(f);
        btn6.setFont(f);
        btn7.setFont(f);
        btn8.setFont(f);
        btn9.setFont(f);
        btn0.setFont(f);

        btnEqual.setFont(f);
        btnAdd.setFont(f);
        btnSub.setFont(f);
        btnMul.setFont(f);
        btnDiv.setFont(f);
        btnMod.setFont(f);
        btnDot.setFont(f);
        btnClear.setFont(f);

        txtAns.setFont(f);
        labAns.setFont(f);
        btnBackspace.setFont(f);

        labAns.setSize(380, 100);
        labAns.setEditable(false);

        txtAns.setBounds(0, 100, 380, 40);
        labAns.setBounds(0,50,380,40);

        btn1.setBounds(10,200,80,40);
        btn2.setBounds(100,200,80,40);
        btn3.setBounds(190,200,80,40);
        btn4.setBounds(10,250,80,40);
        btn5.setBounds(100,250,80,40);
        btn6.setBounds(190,250,80,40);
        btn7.setBounds(10,300,80,40);
        btn8.setBounds(100,300,80,40);
        btn9.setBounds(190,300,80,40);
        btn0.setBounds(10,350,80,40);

        btnDot.setBounds(100,350,80,40);
        btnEqual.setBounds(190,350,80,40);
        btnAdd.setBounds(280,200,80,40);
        btnSub.setBounds(280,250,80,40);
        btnMul.setBounds(280,300,80,40);
        btnDiv.setBounds(280,350,80,40);
        btnMod.setBounds(280,150,80,40);
        btnClear.setBounds(10,150,80,40);
        btnBackspace.setBounds(190,150,80,40);
        
    

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);
        c.add(btn0);
        c.add(btnDot);
        c.add(btnEqual);
        c.add(btnAdd);
        c.add(btnAdd);
        c.add(btnSub);
        c.add(btnMul);
        c.add(btnDiv);
        c.add(btnMod);
        c.add(btnClear);
        c.add(txtAns);
        c.add(labAns);
        // c.add(btnBackspace);


        setTitle("Calculator");
        setSize(400, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + "1");
                labAns.setText(labAns.getText()+"1");
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + "2");
                labAns.setText(labAns.getText()+"2");
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + "3");
                labAns.setText(labAns.getText()+"3");
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + "4");
                labAns.setText(labAns.getText()+"4");
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + "5");
                labAns.setText(labAns.getText()+"5");
            }
        });

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + "6");
                labAns.setText(labAns.getText()+"6");
            }
        });

        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + "7");
                labAns.setText(labAns.getText()+"7");
            }
        });

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + "8");
                labAns.setText(labAns.getText()+"8");
            }
        });

        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + "9");
                labAns.setText(labAns.getText()+"9");
            }
        });

        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + "0");
                labAns.setText(labAns.getText()+"0");
            }
        });

        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtAns.setText(txtAns.getText() + ".");
                labAns.setText(labAns.getText()+".");
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAns.setText("");
                labAns.setText("");
                addBool = false;
                subBool=false;
                mulBool=false;
                divBool=false;
                modBool=false;

                temp=0;
                solveTemp=0;
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               
                try {
                    temp = Double.parseDouble(txtAns.getText());
                    txtAns.setText("");
                    labAns.setText(labAns.getText() + "+");
                    addBool = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid operation", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
              
        try {
            temp = Double.parseDouble(txtAns.getText());
            txtAns.setText("");
            labAns.setText(labAns.getText() + "-");
            subBool = true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
            }
        });

        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
             try {
            temp = Double.parseDouble(txtAns.getText());
            txtAns.setText("");
            labAns.setText(labAns.getText() + "x");
            mulBool = true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               try {
            temp = Double.parseDouble(txtAns.getText());
            txtAns.setText("");
            labAns.setText(labAns.getText() + "\u00F7");
            divBool = true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
            }
        });

        btnMod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               try {
                    temp = Double.parseDouble(txtAns.getText());
                    txtAns.setText("");
                    labAns.setText(labAns.getText() + "%");
                    modBool = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid operation", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

                btnBackspace.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        String currentText = txtAns.getText();
        String currentLabel = labAns.getText();
        
        if (!currentText.isEmpty()) {
            int length = currentText.length();
            String updatedText = "";

            if (length > 1) {
                String lastChar = currentText.substring(length - 1);
                String secondLastChar = currentText.substring(length - 2, length - 1);

                if (lastChar.matches("[+\\-*/%]") && secondLastChar.matches("[+\\-*/%]")) {
                    updatedText = currentText.substring(0, length - 2);
                } else {
                    updatedText = currentText.substring(0, length - 1);
                }
            } else {
                updatedText = "";
            }

            txtAns.setText(updatedText);
        }

        if (!currentLabel.isEmpty()) {
            currentLabel = currentLabel.substring(0, currentLabel.length() - 1);
            labAns.setText(currentLabel);
        }
    }
});

       btnEqual.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
            solveTemp = Double.parseDouble(txtAns.getText());
            
             if (addBool) 
                solveTemp = temp + solveTemp;
            else if (subBool)
                solveTemp = temp - solveTemp;
            else if (mulBool)
                solveTemp = temp * solveTemp;
            else if (divBool)
                solveTemp = temp / solveTemp;
            else if (modBool) {
                solveTemp = temp % solveTemp;
            }
            
            txtAns.setText(Double.toString(solveTemp));
          
            addBool = false;
            subBool=false;
            mulBool=false;
            divBool=false;
            modBool=false;
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Invalid input in textfield", "Error", JOptionPane.ERROR_MESSAGE);
        txtAns.setText("");
        txtAns.requestFocus();
    }
    //   System.out.println(Double.toString(solveTemp));
    }
    });

}
}

