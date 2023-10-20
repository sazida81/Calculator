import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaCalculator {


    public javaCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btnOne.getText();
                textField1.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField1.getText() + btnTwo.getText();
                textField1.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textField1.getText() + btnThree.getText();
                textField1.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textField1.getText() + btnFour.getText();
                textField1.setText(btnFourText);
            }
        });
        btnFIve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFIveText = textField1.getText() + btnFIve.getText();
                textField1.setText(btnFIveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField1.getText() + btnSix.getText();
                textField1.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField1.getText() + btnSeven.getText();
                textField1.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField1.getText() + btnEight.getText();
                textField1.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField1.getText() + btnNine.getText();
                textField1.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textField1.getText() + btnZero.getText();
                textField1.setText(btnZeroText);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
                                       @Override
                                       public void actionPerformed(ActionEvent e) {
                                           if (textField1.getText().equals("")) {
                                               textField1.setText("0.");
                                           } else if (textField1.getText().contains(".")) {
                                               btnPoint.setEnabled(false);
                                           } else {
                                               String btnPointText = textField1.getText() + btnPoint.getText();
                                               textField1.setText(btnPointText);
                                           }
                                           btnPoint.setEnabled(true);
                                       }
                                   });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    switch(math_operator){
                        case '+' : {
                            total2 = total1 + Double.parseDouble(textField1.getText());
                            break;
                        }
                        case '-' : {
                            total2 = total1 - Double.parseDouble(textField1.getText());
                            break;
                        }
                        case '*' : {
                            total2 = total1 * Double.parseDouble(textField1.getText());
                            break;
                        }
                        case '/' : {
                            total2 = total1 / Double.parseDouble(textField1.getText());
                            break;
                        }
                    }

               textField1.setText(Double.toString(total2) );
            total1 = 0;

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textField1.setText("");
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("javaCalculator");
        frame.setContentPane(new javaCalculator().javaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    private JPanel javaCalculator;
    private JTextField textField1;
    private JButton btnClear;
    private JButton btnNine;
    private JButton btnMultiply;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnThree;
    private JButton btnFIve;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnSix;
    private JButton btnEqual;
    public void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
