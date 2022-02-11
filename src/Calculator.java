import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.math.BigDecimal;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMultiplication = new JButton("×");
    JButton buttonDivision = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("−");
    JButton buttonRemainder = new JButton("%");
    JButton buttonOpenParenthesis = new JButton("(");
    JButton buttonCloseParenthesis = new JButton(")");
    JButton buttonSinusoidal = new JButton("sin");
    JButton buttonCoSinusoidal = new JButton("cos");
    JButton buttonTangent = new JButton("tan");
    JButton buttonInverseSinusoidal = new JButton("sin⁻¹");
    JButton buttonInverseCoSinusoidal = new JButton("cos⁻¹");
    JButton buttonInverseTangent = new JButton("tan⁻¹");

    Calculator() {
        prepareGUI();
        addComponents();
        addActionEvents();
    }

    public void prepareGUI() {
        frame = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.jpeg ");
        frame.setIconImage(icon);
        frame.setTitle("Calculator");
        frame.setSize(380, 675);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new Color(26, 26, 26));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        Font font1 = new Font("JetBrains Mono Bold", Font.PLAIN, 20);
        Font font2 = new Font("JetBrains Mono Bold", Font.PLAIN, 28);
        Color color1 = new Color(28, 28, 28);
        Color color2 = new Color(40, 40, 40);
        Color color3 = new Color(254, 97, 90);
        Color color4 = new Color(58, 175, 144);
        Color color5 = new Color(91, 148, 147);
        Color color6 = new Color(183, 216, 214);
        int width = 80, height = 60;

        textField2.setBounds(0, 0, 366, 90);
        textField2.setFont(font1);
        textField2.setBackground(Color.black);
        textField2.setForeground(color6);
        textField2.setBorder(BorderFactory.createEmptyBorder());
        textField2.setEditable(false);
        textField2.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField2);

        textField1.setBounds(0, 55, 366, 100);
        textField1.setFont(new Font("JetBrains Mono Bold", Font.PLAIN, 35));
        textField1.setBackground(Color.black);
        textField1.setForeground(color6);
        textField1.setBorder(BorderFactory.createEmptyBorder());
        textField1.setEditable(false);
        textField1.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField1);

        buttonOpenParenthesis.setBounds(15, 170, width, height);
        buttonOpenParenthesis.setFont(font1);
        buttonOpenParenthesis.setBackground(color1);
        buttonOpenParenthesis.setForeground(color4);
        buttonOpenParenthesis.setBorderPainted(false);
        frame.add(buttonOpenParenthesis);

        buttonCloseParenthesis.setBounds(100, 170, width, height);
        buttonCloseParenthesis.setFont(font1);
        buttonCloseParenthesis.setBackground(color1);
        buttonCloseParenthesis.setForeground(color4);
        buttonCloseParenthesis.setBorderPainted(false);
        frame.add(buttonCloseParenthesis);

        buttonDelete.setBounds(185, 170, width, height);
        buttonDelete.setFont(font1);
        buttonDelete.setBackground(color1);
        buttonDelete.setForeground(color3);
        buttonDelete.setBorderPainted(false);
        frame.add(buttonDelete);

        buttonClear.setBounds(270, 170, width, height);
        buttonClear.setFont(font1);
        buttonClear.setBackground(color1);
        buttonClear.setForeground(color3);
        buttonClear.setBorderPainted(false);
        frame.add(buttonClear);

        buttonSinusoidal.setBounds(15, 235, width, height);
        buttonSinusoidal.setFont(font1);
        buttonSinusoidal.setBackground(color1);
        buttonSinusoidal.setForeground(color5);
        buttonSinusoidal.setBorderPainted(false);
        frame.add(buttonSinusoidal);

        buttonCoSinusoidal.setBounds(100, 235, width, height);
        buttonCoSinusoidal.setFont(font1);
        buttonCoSinusoidal.setBackground(color1);
        buttonCoSinusoidal.setForeground(color5);
        buttonCoSinusoidal.setBorderPainted(false);
        frame.add(buttonCoSinusoidal);

        buttonTangent.setBounds(185, 235, width, height);
        buttonTangent.setFont(font1);
        buttonTangent.setBackground(color1);
        buttonTangent.setForeground(color5);
        buttonTangent.setBorderPainted(false);
        frame.add(buttonTangent);

        buttonRemainder.setBounds(270, 235, width, height);
        buttonRemainder.setFont(font1);
        buttonRemainder.setBackground(color1);
        buttonRemainder.setForeground(color4);
        buttonRemainder.setBorderPainted(false);
        frame.add(buttonRemainder);

        buttonInverseSinusoidal.setBounds(15, 300, width, height);
        buttonInverseSinusoidal.setFont(font1);
        buttonInverseSinusoidal.setBackground(color1);
        buttonInverseSinusoidal.setForeground(color5);
        buttonInverseSinusoidal.setBorderPainted(false);
        frame.add(buttonInverseSinusoidal);

        buttonInverseCoSinusoidal.setBounds(100, 300, width, height);
        buttonInverseCoSinusoidal.setFont(font1);
        buttonInverseCoSinusoidal.setBackground(color1);
        buttonInverseCoSinusoidal.setForeground(color5);
        buttonInverseCoSinusoidal.setBorderPainted(false);
        frame.add(buttonInverseCoSinusoidal);

        buttonInverseTangent.setBounds(185, 300, width, height);
        buttonInverseTangent.setFont(font1);
        buttonInverseTangent.setBackground(color1);
        buttonInverseTangent.setForeground(color5);
        buttonInverseTangent.setBorderPainted(false);
        frame.add(buttonInverseTangent);

        buttonDivision.setBounds(270, 300, width, height);
        buttonDivision.setFont(font2);
        buttonDivision.setBackground(color1);
        buttonDivision.setForeground(color4);
        buttonDivision.setBorderPainted(false);
        frame.add(buttonDivision);

        buttonSeven.setBounds(15, 365, width, height);
        buttonSeven.setFont(font1);
        buttonSeven.setBackground(color1);
        buttonSeven.setForeground(color6);
        buttonSeven.setBorderPainted(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(100, 365, width, height);
        buttonEight.setFont(font1);
        buttonEight.setBackground(color1);
        buttonEight.setForeground(color6);
        buttonEight.setBorderPainted(false);
        frame.add(buttonEight);

        buttonNine.setBounds(185, 365, width, height);
        buttonNine.setFont(font1);
        buttonNine.setBackground(color1);
        buttonNine.setForeground(color6);
        buttonNine.setBorderPainted(false);
        frame.add(buttonNine);

        buttonMultiplication.setBounds(270, 365, width, height);
        buttonMultiplication.setFont(font2);
        buttonMultiplication.setBackground(color1);
        buttonMultiplication.setForeground(color4);
        buttonMultiplication.setBorderPainted(false);
        frame.add(buttonMultiplication);

        buttonFour.setBounds(15, 430, width, height);
        buttonFour.setFont(font1);
        buttonFour.setBackground(color1);
        buttonFour.setForeground(color6);
        buttonFour.setBorderPainted(false);
        frame.add(buttonFour);

        buttonFive.setBounds(100, 430, width, height);
        buttonFive.setFont(font1);
        buttonFive.setBackground(color1);
        buttonFive.setForeground(color6);
        buttonFive.setBorderPainted(false);
        frame.add(buttonFive);

        buttonSix.setBounds(185, 430, width, height);
        buttonSix.setFont(font1);
        buttonSix.setBackground(color1);
        buttonSix.setForeground(color6);
        buttonSix.setBorderPainted(false);
        frame.add(buttonSix);

        buttonMinus.setBounds(270, 430, width, height);
        buttonMinus.setFont(font2);
        buttonMinus.setBackground(color1);
        buttonMinus.setForeground(color4);
        buttonMinus.setBorderPainted(false);
        frame.add(buttonMinus);

        buttonOne.setBounds(15, 495, width, height);
        buttonOne.setFont(font1);
        buttonOne.setBackground(color1);
        buttonOne.setForeground(color6);
        buttonOne.setBorderPainted(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(100, 495, width, height);
        buttonTwo.setFont(font1);
        buttonTwo.setBackground(color1);
        buttonTwo.setForeground(color6);
        buttonTwo.setBorderPainted(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(185, 495, width, height);
        buttonThree.setFont(font1);
        buttonThree.setBackground(color1);
        buttonThree.setForeground(color6);
        buttonThree.setBorderPainted(false);
        frame.add(buttonThree);

        buttonPlus.setBounds(270, 495, width, height);
        buttonPlus.setFont(font2);
        buttonPlus.setBackground(color1);
        buttonPlus.setForeground(color4);
        buttonPlus.setBorderPainted(false);
        frame.add(buttonPlus);

        buttonDot.setBounds(15, 560, width, height);
        buttonDot.setFont(font1);
        buttonDot.setBackground(color1);
        buttonDot.setForeground(color6);
        buttonDot.setBorderPainted(false);
        frame.add(buttonDot);

        buttonZero.setBounds(100, 560, width, height);
        buttonZero.setFont(font1);
        buttonZero.setBackground(color1);
        buttonZero.setForeground(color6);
        buttonZero.setBorderPainted(false);
        frame.add(buttonZero);

        buttonEqual.setBounds(185, 560, width * 2 + 5, height);
        buttonEqual.setFont(font2);
        buttonEqual.setBackground(color2);
        buttonEqual.setForeground(color6);
        buttonEqual.setBorderPainted(false);
        frame.add(buttonEqual);
    }

    public void addActionEvents() {
        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonMultiplication.addActionListener(this);
        buttonDivision.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonRemainder.addActionListener(this);
        buttonOpenParenthesis.addActionListener(this);
        buttonCloseParenthesis.addActionListener(this);
        buttonSinusoidal.addActionListener(this);
        buttonCoSinusoidal.addActionListener(this);
        buttonTangent.addActionListener(this);
        buttonInverseSinusoidal.addActionListener(this);
        buttonInverseCoSinusoidal.addActionListener(this);
        buttonInverseTangent.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();

        if (source == buttonClear) {
            textField1.setText("");
            textField2.setText("");
        } else if (source == buttonDelete) {
            int length = textField1.getText().length();
            int number = length - 1;

            if (number > 0) {
                StringBuilder back = new StringBuilder(textField1.getText());
                back.deleteCharAt(number);
                textField1.setText(back.toString());
            } else {
                textField1.setText("");
            }
        } else if (source == buttonZero) {
            textField1.setText(textField1.getText() + "0");
        } else if (source == buttonOne) {
            textField1.setText(textField1.getText() + "1");
        } else if (source == buttonTwo) {
            textField1.setText(textField1.getText() + "2");
        } else if (source == buttonThree) {
            textField1.setText(textField1.getText() + "3");
        } else if (source == buttonFour) {
            textField1.setText(textField1.getText() + "4");
        } else if (source == buttonFive) {
            textField1.setText(textField1.getText() + "5");
        } else if (source == buttonSix) {
            textField1.setText(textField1.getText() + "6");
        } else if (source == buttonSeven) {
            textField1.setText(textField1.getText() + "7");
        } else if (source == buttonEight) {
            textField1.setText(textField1.getText() + "8");
        } else if (source == buttonNine) {
            textField1.setText(textField1.getText() + "9");
        } else if (source == buttonDot) {
            if (!textField1.getText().contains(".")) {
                textField1.setText(textField1.getText() + ".");
            }
        } else if (source == buttonPlus) {
            textField1.setText(textField1.getText() + "+");
        } else if (source == buttonMinus) {
            textField1.setText(textField1.getText() + "-");
        } else if (source == buttonMultiplication) {
            textField1.setText(textField1.getText() + "*");
        } else if (source == buttonDivision) {
            textField1.setText(textField1.getText() + "/");
        } else if (source == buttonRemainder) {
            textField1.setText(textField1.getText() + "%");
        } else if (source == buttonOpenParenthesis) {
            textField1.setText(textField1.getText() + "(");
        } else if (source == buttonCloseParenthesis) {
            textField1.setText(textField1.getText() + ")");
        } else if (source == buttonEqual) {
            String str = textField1.getText();
            textField2.setText(str + " = ");
            textField1.setText(getAnswer(str));
        } else if (source == buttonSinusoidal) {
            textField1.setText(textField1.getText() + "sin(");
        } else if (source == buttonCoSinusoidal) {
            textField1.setText(textField1.getText() + "cos(");
        } else if (source == buttonTangent) {
            textField1.setText(textField1.getText() + "tan(");
        } else if (source == buttonInverseSinusoidal) {
            textField1.setText(textField1.getText() + "asin(");
        } else if (source == buttonInverseCoSinusoidal) {
            textField1.setText(textField1.getText() + "acos(");
        } else if (source == buttonInverseTangent) {
            textField1.setText(textField1.getText() + "atan(");
        }
    }

    public String getAnswer(String str) {
        String ans = "";
        try {
            ans = extractTrigonometry(str);

        } catch (Exception e) {
            ans = "error";
            e.printStackTrace();
        }
        return ans;
    }



    public static String extractTrigonometry(String s) throws Exception {
        char[] cArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        String trigF = "";
        String extracted = "";

        boolean tFlag = true;

        int index = -1, start = -1;
        for (int i = 0; i < s.length(); i++) {

            if (i != 0 && Character.isAlphabetic(cArray[i])) {
                if (Character.isDigit(cArray[i - 1])) {
                    throw new Exception("Error!");
                }
            }

            if (cArray[i] == 'a' && cArray[i + 1] == 'n') {
                trigF = "tan";
                index = start =  i + 2;
                tFlag = false;
            } else if (cArray[i] == 'a') {
                if (cArray[i + 1] == 's') {
                    trigF = "asin";
                } else if (cArray[i + 1] == 'c') {
                    trigF = "acos";
                } else {
                    trigF = "atan";
                }

                index = start = i + 4;
                tFlag = false;
            } else if (cArray[i] == 'i' && cArray[i + 1] == 'n') {
                trigF = "sin";
                index = start =  i + 2;
                tFlag = false;
            } else if (cArray[i] == 'o' && cArray[i + 1] == 's') {
                trigF = "cos";
                index = start =  i + 2;
                tFlag = false;
            }

            if (!tFlag) {
                stack.push(cArray[index]);
                while (!stack.empty()) {
                    index++;
                    if (cArray[index] == ')') stack.pop();
                    if (cArray[index] == '(') stack.push('(');
                }

                extracted = s.substring(start + 1, index);
                s = s.replace(trigF + "(" + extracted + ")", trigF + "()");
                break;
            }
        }

        if (tFlag) {
            return Double.toString(evaluateNumbers(s));
        } else {
            double value = 0;
            switch (trigF) {
                case "sin" :
                    value = Math.sin(Math.toRadians(Double.parseDouble(extractTrigonometry(extracted))));break;
                case "cos" :
                    value = Math.cos(Math.toRadians(Double.parseDouble(extractTrigonometry(extracted))));break;
                case "tan" :
                    value = Math.tan(Math.toRadians(Double.parseDouble(extractTrigonometry(extracted))));break;
                case "atan":
                    value = Math.toDegrees(Math.atan(Double.parseDouble(extractTrigonometry(extracted))));break;
                case "acos":
                    value = Math.toDegrees(Math.acos(Double.parseDouble(extractTrigonometry(extracted))));break;
                case "asin":
                    value = Math.toDegrees(Math.asin(Double.parseDouble(extractTrigonometry(extracted))));break;
                default :System.out.println("invalid Trig Function");
            }

            s = s.replace(trigF + "()", new BigDecimal(value).toPlainString());
        }

        return extractTrigonometry(s);

    }

    public static double evaluateNumbers(String tokens) throws Exception {
        int i;

        char[] token = plusMinus(tokens);
        Stack<Double> values = new Stack<>();
        Stack<Character> ops = new Stack<>();
        ops.push('(');

        for (i = 0; i < token.length; i++) {

            if (token[i] == '(') {
                ops.push(token[i]);
            } else if (Character.isDigit(token[i])) {
                String val = "";

                while (i < token.length &&
                        (Character.isDigit(token[i]) || token[i] == '.')) {
                    if (Character.isDigit(token[i]))
                        val = val + String.valueOf((token[i] - '0'));
                    else
                        val = val + ".";

                    i++;
                }

                values.push(Double.parseDouble(val));

                i--;
            } else if (token[i] == ')') {
                while (!ops.empty() && ops.peek() != '(') {
                    double val2 = values.peek();
                    values.pop();

                    double val1 = values.peek();
                    values.pop();

                    char op = ops.peek();
                    ops.pop();

                    values.push(applyOperation(val1, val2, op));
                }

                if (!ops.empty())
                    ops.pop();
            } else {
                while (!ops.empty() && precedence(ops.peek())
                        >= precedence(token[i])) {
                    double val2 = values.peek();
                    values.pop();

                    double val1 = values.peek();
                    values.pop();

                    char op = ops.peek();
                    ops.pop();

                    values.push(applyOperation(val1, val2, op));
                }

                ops.push(token[i]);
            }
        }

        while (ops.size() > 1) {
            double val2 = values.peek();
            values.pop();

            double val1 = values.peek();
            values.pop();

            char op = ops.peek();
            ops.pop();

            values.push(applyOperation(val1, val2, op));
        }


        return values.peek();
    }

    public static char[] plusMinus(String tokens) {
        tokens = tokens.replace("++", "+");
        tokens = tokens.replace("+-", "-");
        tokens = tokens.replace("-+", "-");
        tokens = tokens.replace("--", "+");
        int end = -1;

        StringBuilder str = new StringBuilder(tokens);
        if (tokens.charAt(0) == '+') {
            str.deleteCharAt(0);
        } else if (tokens.charAt(0) == '-') {

            for (int i = 1; i < tokens.length(); i++) {
                if (!Character.isDigit(tokens.charAt(i))) {
                    if (tokens.charAt(i) != '.') {
                        end = i;
                        break;
                    }

                }

            }
            str.insert(end, ')');
            str.insert(0, '(');
            str.insert(1, '0');

        }
        boolean flag = true;
        while (flag && str.length() > 1) {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == '-' && !Character.isDigit(str.charAt(i - 1)) && str.charAt(i - 1) != ')') {
                    str.insert(i, '(');
                    str.insert(i + 1, '0');

                    for (int j = i + 3; j < str.length(); j++) {
                        if (!Character.isDigit(str.charAt(j)) || j == str.length() - 1) {
                            if (str.charAt(j) != '.') {
                                end = j;
                                if (j == str.length() - 1) end++;
                                break;
                            }
                        }

                    }
                    str.insert(end, ')');
                    break;
                }
                if (i == str.length() - 1) {
                    flag = false;
                }
            }
        }


        return str.toString().toCharArray();


    }

    public static double precedence(char op) {
        if (op == '+' || op == '-')
            return 1;
        if (op == '*' || op == '/' || op == '%')
            return 2;
        return 0;
    }

    public static double applyOperation(double a, double b, char op) throws Exception {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            default:
                throw new Exception("Invalid Operation");
        }
    }


    public static void main(String[] args) {
        new Calculator();
    }

}
