package edu.fci.cs102;

import javax.swing.*;

public class MyListFrame extends JFrame {
    private JList list1;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    MyListFrame(){
        Student [] students = new Student[3];
        students[0] = new Student("Ahmed", "Mohamed", 20, "A");
        students[1] = new Student("Mohamed", "Ahmed", 15, "B");
        students[2] = new Student("Ali", "Mohamed", 25, "C");

        setTitle("My List Frame");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        list1.setListData(students);
        list1.setSelectedIndex(0);
        list1.addListSelectionListener(e -> {
            int selected = list1.getSelectedIndex();
            Student student = students[selected];
            textField1.setText(student.getFname());
            textField2.setText(student.getLname());
            textField3.setText(String.valueOf(student.getAge()));
            textField4.setText(student.getGrade());
        });
        setVisible(true);

    }
}
