import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener {

    TextField t1, t2, t3;
    Button addBtn;

    Calculator() {

        setTitle("Simple Calculator");
        setLayout(new FlowLayout());

        // TextFields
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t3.setEditable(false);

        // Button
        addBtn = new Button("Add");

        // Add components
        add(new Label("Enter First Number:"));
        add(t1);

        add(new Label("Enter Second Number:"));
        add(t2);

        add(addBtn);

        add(new Label("Result:"));
        add(t3);

        // Button action
        addBtn.addActionListener(this);

        setSize(300, 200);
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
