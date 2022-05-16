package edu.fci.cs102;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame {
    private JPanel panel1;
    private JList list1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;

    StudentForm() {
        Student [] students = new Student[3];
        students[0] = new Student("abc1", "xyz1",20,"A");
        students[1] = new Student("abc2", "xyz2",21,"B");
        students[2] = new Student("abc3", "xyz3",22,"C");
        list1.setListData(students);
        list1.addListSelectionListener(e -> {
            int selected = list1.getSelectedIndex();
            textField1.setText(students[selected].getFname());
            textField2.setText(students[selected].getLname());
            textField3.setText(students[selected].getAge()+"");
            textField4.setText(students[selected].getGrade());
        });
        setTitle("Student Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setVisible(true);

    }
}
