import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

    private JTextField GrantsomeJTextField;

    private JButton GrantsomeJButton;

    private String s = new String();

    private Computer cp;

    public Calculator() {
        super("表达式计算");
        GrantsomeJTextField = new JTextField();
        GrantsomeJTextField.setSize(250, 30);
        GrantsomeJTextField.setLocation(10, 10);
        GrantsomeJButton = new JButton("计算");
        GrantsomeJButton.addActionListener(this);
        GrantsomeJButton.setSize(70, 30);
        GrantsomeJButton.setLocation(10, 50);

        setLayout(null);
        add(GrantsomeJTextField);
        add(GrantsomeJButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(getToolkit().getScreenSize().width / 2 - 150, getToolkit()
                .getScreenSize().height / 2 - 150, 300, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        this.s = GrantsomeJTextField.getText();
        int result = this.count(s);
        s += " = " + result;

        this.GrantsomeJTextField.setText(s);
    }

    public int count(String s) {
        int result = 0;
        cp = new Computer(s);

        result = cp.getResult();
        return result;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
