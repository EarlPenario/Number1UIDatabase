package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Frame extends JFrame {
    JLabel lName,fName,position,salary,present, absent;
    JTextField lField, fField, positionField, salaryField,presentField, absentField;
    JTable employeeTable;
    Table table;
    JButton add, update, delete;
    Container container;
    GridBagLayout layout;
    GridBagConstraints constraints;
    FireStoreConnection fireStoreConnection;
    public Frame(){
        lName=new JLabel("Last Name");
        fName=new JLabel("First Name");
        position=new JLabel("Position");
        salary=new JLabel("Daily Salary");
        present=new JLabel("Days Present");
        absent=new JLabel("Days Absent");

        lField=new JTextField(10);
        fField=new JTextField(10);
        positionField=new JTextField(10);
        salaryField=new JTextField(10);
        presentField=new JTextField(10);
        absentField=new JTextField(10);

        table=new Table();
        employeeTable=new JTable(table);

        add=new JButton("Add");
        update=new JButton("Update");
        delete=new JButton("Delete");

        container=this.getContentPane();
        layout=new GridBagLayout();
        container.setLayout(layout);
        constraints=new GridBagConstraints();

        constraints.gridx=0;
        constraints.gridy=0;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(lName,constraints);

        constraints.gridx=1;
        constraints.gridy=0;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(lField,constraints);

        constraints.gridx=2;
        constraints.gridy=0;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(fName,constraints);

        constraints.gridx=3;
        constraints.gridy=0;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(fField,constraints);

        constraints.gridx=0;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(position,constraints);

        constraints.gridx=1;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(positionField,constraints);

        constraints.gridx=2;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(salary,constraints);

        constraints.gridx=3;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(salaryField,constraints);

        constraints.gridx=4;
        constraints.gridy=0;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(present,constraints);

        constraints.gridx=5;
        constraints.gridy=0;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(presentField,constraints);

        constraints.gridx=4;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(absent,constraints);

        constraints.gridx=5;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(absentField,constraints);

        constraints.gridx=6;
        constraints.gridy=0;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(add,constraints);

        constraints.gridx=7;
        constraints.gridy=0;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(delete,constraints);

        constraints.gridx=6;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        container.add(update,constraints);

        constraints.gridx=0;
        constraints.gridy=2;
        constraints.gridwidth=6;
        constraints.gridheight=1;
        container.add(new JScrollPane(employeeTable),constraints);

        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}

