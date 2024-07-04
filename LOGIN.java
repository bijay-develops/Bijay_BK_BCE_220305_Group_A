package sahin.three.lll;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

public class LOGIN {
    public static void main(String[] args) {
        Frame frame = new Frame("LOGIN PAGE");

        Label lbl1 = new Label("Username");
        lbl1.setBounds(50, 100, 100, 50);
        frame.add(lbl1);

        TextField txt1 = new TextField();
        txt1.setBounds(150, 100, 200, 50);
        frame.add(txt1);

        Label lbl2 = new Label("Password");
        lbl2.setBounds(50, 200, 100, 50);
        frame.add(lbl2);

        TextField txt2 = new TextField();
        txt2.setBounds(150, 200, 200, 50);
        frame.add(txt2);

        Button loginButton = new Button("Login");
        loginButton.setBounds(150, 300, 100, 50);
        frame.add(loginButton);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
