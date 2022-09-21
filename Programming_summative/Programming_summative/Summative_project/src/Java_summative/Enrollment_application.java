//Enrollement_application is within the java_summative package
//Enrollment_application contains the login form and links it with setup file where the rest of the build up of setup
//depending on what we want to achieve at a particular point
package Java_summative;
//We then import the required modules for the application development

//First on the list is the the javax.swing library that is key for Gui development
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//Next we have the java.awt class that is instrumental in the implementation of action listeners
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//We then import the java.sql library that is instrumental in sql database connection
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//We then import the java.time module that is instrumental in obtaining current date and time
import java.time.Year;
//We then import the java.util.Hashmap package for linking of key value pairs

import java.util.HashMap;
//We then import the Jtable class for implementation of a table in our GUI
import javax.swing.JTable;
//We then define our Enrollment_application and inherit all the JFrame class to implement our GUI
public class Enrollment_application extends JFrame {
    //initialize button, panel, label, and text field
    JButton b1;
    JButton b2;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField  textField1, textField2;

    //calling constructor
    Enrollment_application()
    {

        //create label for username
        userLabel = new JLabel();
        userLabel.setText("Username");      //set label value for textField1

        //create text field to get username from the user
        textField1 = new JTextField(15);    //set length of the text

        //create label for password
        passLabel = new JLabel();
        passLabel.setText("Password");      //set label value for textField2

        //create text field to get password from the user
        textField2 = new JPasswordField(15);    //set length for the password

        //create login button
        b1 = new JButton("LOGIN"); //set label to button
        //We then create the Sign up Button
        b2 = new JButton("SIGN UP");

        //create panel to put form elements
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);    //set username label to panel
        newPanel.add(textField1);   //set text field to panel
        newPanel.add(passLabel);    //set password label to panel
        newPanel.add(textField2);   //set text field to panel
        newPanel.add(b1);           ///set button to panel
        newPanel.add(b2);

        //set border to panel
        add(newPanel, BorderLayout.CENTER);

        //perform action on button click
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String userValue = textField1.getText();        //get user entered username from the textField1
                String passValue = textField2.getText();        //get user entered pasword from the textField2

                //check whether the credentials are authentic or not
                try {
                    //Instantiating our database connection by first declaring the driver we are using to link Java and database
                    //It is the API we are using
                    Class.forName("com.mysql.jdbc.Driver");
                    //We then initialize the requirements for this connection to happen

                    String url = "jdbc:mysql://127.0.0.1:3307/student_enrollment";
                    String username = "root";
                    String password = "Munguti610.";
                    //We then implement the connection using the getconnection method
                    Connection conn = DriverManager.getConnection(url, username, password);
                    //we then implement our statement
                    Statement statement = conn.createStatement();
                    //we then implement our sql query
                    ResultSet resultSet = statement.executeQuery("select * from student");
                    //We then iterate through the data in our sdatabase
                    while (resultSet.next()) {
                        //Each column item is stored in a specific variable
                        int student_ids = resultSet.getInt("student_id");
                        String usernames = resultSet.getString("username");
                        String passwords = resultSet.getString("password");
                        String admission_numbers = resultSet.getString("admission_number");
                        String first_names = resultSet.getString("first_name");
                        String last_names = resultSet.getString("last_name");
                        String genders = resultSet.getString("gender");
                        String gradess = resultSet.getString("grade");
                        String mark_awarded = resultSet.getString("marks_awarded");
                        String courses_selected = resultSet.getString("course_selected");
                        //We then check whether the input username and password matches the one in the database

                        if (userValue.equals(usernames) && passValue.equals(passwords)) {  //if authentic, navigate user to a new main_screen


                            //create instance of the NewPage
                            setup main_screen = new setup();

                            //make main_screen visible to the user
                            main_screen.setVisible(true);


                            //We then initialize the properties of our mainscreem
                            
                            JLabel title;
                            JLabel name;
                            JTextField First_name;
                            JLabel tlastname;
                            JTextField last_name;
                            JLabel gender;
                            JLabel f;

                            JRadioButton male;
                            JRadioButton female;
                            ButtonGroup gengp;
                            JLabel gd;
                            JComboBox date;
                            JCheckBox term;
                            JButton sub;
                            JTextArea tout;
                            JLabel res;
                            JTextArea resadd;
                            JButton comp;
                            JButton bs;
                            JButton gc;



                            // We then store the range of grades a user can choose from in an array
                            String grades[]
                                    = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E", "F"};
                            //We then set the properties, names and entry fields of the main screen
                            title = new JLabel("Student Enrollment");
                            title.setFont(new Font("Arial", Font.PLAIN, 30));
                            title.setSize(300, 30);
                            title.setLocation(300, 30);
                            main_screen.getContentPane().add(title);

                            name = new JLabel("First Name");
                            name.setFont(new Font("Arial", Font.PLAIN, 20));
                            name.setSize(100, 20);
                            name.setLocation(100, 100);
                            main_screen.getContentPane().add(name);

                            First_name = new JTextField();
                            First_name.setFont(new Font("Arial", Font.PLAIN, 15));
                            First_name.setSize(190, 20);
                            First_name.setLocation(200, 100);
                            main_screen.getContentPane().add(First_name);

                            tlastname = new JLabel("Last Name");
                            tlastname.setFont(new Font("Arial", Font.PLAIN, 20));
                            tlastname.setSize(100, 20);
                            tlastname.setLocation(100, 150);
                            main_screen.getContentPane().add(tlastname);


                            last_name = new JTextField();
                            last_name.setFont(new Font("Arial", Font.PLAIN, 15));
                            last_name.setSize(150, 20);
                            last_name.setLocation(200, 150);
                            main_screen.getContentPane().add(last_name);

                            gender = new JLabel("Gender");
                            gender.setFont(new Font("Arial", Font.PLAIN, 20));
                            gender.setSize(100, 20);
                            gender.setLocation(100, 200);
                            main_screen.getContentPane().add(gender);

                            male = new JRadioButton("Male");
                            male.setFont(new Font("Arial", Font.PLAIN, 15));
                            male.setSelected(true);
                            male.setSize(75, 20);
                            male.setLocation(200, 200);
                            main_screen.getContentPane().add(male);

                            female = new JRadioButton("Female");
                            female.setFont(new Font("Arial", Font.PLAIN, 15));
                            female.setSelected(false);
                            female.setSize(80, 20);
                            female.setLocation(275, 200);
                            main_screen.getContentPane().add(female);

                            gengp = new ButtonGroup();
                            gengp.add(male);
                            gengp.add(female);

                            gd = new JLabel("Grade");
                            gd.setFont(new Font("Arial", Font.PLAIN, 20));
                            gd.setSize(100, 20);
                            gd.setLocation(100, 250);
                            main_screen.getContentPane().add(gd);

                            date = new JComboBox(grades);
                            date.setFont(new Font("Arial", Font.PLAIN, 15));
                            date.setSize(50, 20);
                            date.setLocation(200, 250);
                            main_screen.getContentPane().add(date);



                            term = new JCheckBox("Accept Terms And Conditions.");
                            term.setFont(new Font("Arial", Font.PLAIN, 15));
                            term.setSize(250, 20);
                            term.setLocation(150, 400);
                            main_screen.getContentPane().add(term);

                            sub = new JButton("REGISTER");
                            sub.setFont(new Font("Arial", Font.PLAIN, 15));
                            sub.setSize(100, 20);
                            sub.setLocation(150, 450);
                            sub.addActionListener(this);
                            main_screen.getContentPane().add(sub);

                            comp = new JButton("CS STUDENTS");
                            comp.setFont(new Font("Arial", Font.PLAIN, 15));
                            comp.setSize(250, 20);
                            comp.setLocation(300, 450);
                            main_screen.getContentPane().add(comp);

                            bs = new JButton("BS STUDENTS");
                            bs.setFont(new Font("Arial", Font.PLAIN, 15));
                            bs.setSize(250, 20);
                            bs.setLocation(560, 450);
                            main_screen.getContentPane().add(bs);

                            gc = new JButton("GC STUDENTS");
                            gc.setFont(new Font("Arial", Font.PLAIN, 15));
                            gc.setSize(250, 20);
                            gc.setLocation(860, 450);
                            main_screen.getContentPane().add(gc);


                            f = new JLabel("Profile");
                            f.setFont(new Font("Arial", Font.PLAIN, 20));
                            f.setSize(100, 20);
                            f.setLocation(500, 80);
                            main_screen.getContentPane().add(f);


                            tout = new JTextArea();
                            tout.setFont(new Font("Arial", Font.PLAIN, 15));
                            tout.setSize(350, 400);
                            tout.setLocation(500, 100);
                            tout.setLineWrap(true);
                            tout.setEditable(false);
                            main_screen.getContentPane().add(tout);
                            //We then set the text  for the tout textfield
                            String data1 = "Username\t:" + usernames + "\n";
                            String data2 = "password\t:" + passwords + "\n";
                            String data3 = "Admission_number\t:" + admission_numbers + "\n";
                            String data4 = "First Name\t:" + first_names + "\n";
                            String data5 = "Last Name\t:" + last_names + "\n";
                            String data6 = "Gender\t:" + genders + "\n";
                            String data7 = "Grade\t:" + gradess + "\n";
                            String data8 = "Marks_Awarded\t:" + mark_awarded + "\n";
                            String data9 = "Course Selected\t:" + courses_selected + "\n";
                            tout.setText(data1 + data2 + data3 + data4 + data5 + data6 + data7 + data8 + data9);


                            res = new JLabel("");
                            res.setFont(new Font("Arial", Font.PLAIN, 20));
                            res.setSize(500, 25);
                            res.setLocation(100, 500);
                            main_screen.getContentPane().add(res);
                            //We then set the field for displaying that that registration was done successfully within the mainscreen
                            resadd = new JTextArea();
                            resadd.setFont(new Font("Arial", Font.PLAIN, 15));
                            resadd.setSize(200, 75);
                            resadd.setLocation(580, 175);
                            resadd.setLineWrap(true);
                            main_screen.getContentPane().add(resadd);
                            main_screen.setBackground(Color.green);



                            //We then define what should happen when the sub button/registration is clicked
                            sub.addActionListener(new ActionListener() {
                                //adActionListener being an interface, we have to implement it fully
                                @Override
                                //First, we shall implement the action performed method
                                public void actionPerformed(ActionEvent e) {
                                    //For the registration to be succefull, one has to tick the the terms and conditions box
                                    if (term.isSelected()) {
                                        //We then obtain the data that is input
                                        String gen;

                                        String first = First_name.getText();

                                        String last = last_name.getText();

                                        if (male.isSelected())
                                            gen = "Male";
                                        else
                                            gen = "Female";

                                        String gr = (String) date.getSelectedItem();
                                        Year years = Year.now();

                                        int year = years.getValue();
                                        //We then create the admission number from the current year the student_id that is generated in the database
                                        String admn = year + "/" + student_ids;
                                        System.out.println(year);
                                        //We then initialize pur Hashmap, to store the grade and the assigned marks
                                        HashMap<String, String> grademarks = new HashMap<String, String>();
                                        grademarks.put("A", "20");
                                        grademarks.put("A-", "19");
                                        grademarks.put("B+", "18");
                                        grademarks.put("B", "17");
                                        grademarks.put("B-", "16");
                                        grademarks.put("C+", "15");
                                        grademarks.put("C", "14");
                                        grademarks.put("C-", "12");
                                        grademarks.put("D+", "11");
                                        grademarks.put("D", "10");
                                        grademarks.put("D-", "9");
                                        grademarks.put("E", "8");
                                        grademarks.put("F", "0");
                                        String marks = grademarks.get(gr);
                                        //We then convert the marks to integer datatype
                                        int mark_int = Integer.parseInt(marks);
                                        //We then initilize the variable course
                                        String course;
                                        //We shall then assign a course depending on the marks the student has
                                        if (mark_int > 17 && mark_int <= 20) {
                                            course ="Computer Science";
                                        } else if (mark_int > 14 && mark_int <= 17) {
                                            course = "Global Challenges";
                                        } else if (mark_int > 11 && mark_int <= 14) {
                                            course = "Business Studies";

                                        } else {
                                            course = "Unqualified for Admission";
                                        }

                                        //We then store the registration information in the database
                                        String query = "update student set " +
                                                "admission_number='"+admn+"', first_name='"+first+"',last_name='"+last+"', gender='"+gen+"',grade='"+gr+"',marks_awarded='"+mark_int+"',course_selected='"+course+"' where student_id='"+student_ids+"'";

                                        try{
                                            //We then execute the update
                                            statement.executeUpdate(query);
                                        }catch (SQLException ex){
                                            throw new RuntimeException(ex);
                                        }


                                        tout.setEditable(false);
                                        res.setText("Registration Successfully..");
                                    } else {
                                        //if the terms and conditions box is not ticked, then the set the registration won't happen
                                        tout.setText("");
                                        resadd.setText("");
                                        res.setText("Please accept the"
                                                + " terms & conditions..");
                                    }


                                }
                            });
                            //We then implement what should happen when the computer science students button is clicked
                            comp.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    try {
                                        //The Data shall be didsplayed in table format and thus the use of the Jtable
                                        //we shall then DefaultTableModel for easy implemtation
                                        DefaultTableModel tb=new DefaultTableModel();
                                        JTable t;
                                        t=new JTable(tb);
                                        //We then add the column name
                                        tb.addColumn("First Name");
                                        tb.addColumn("Last Name");
                                        tb.addColumn("Admission Number");
                                        //The information displayed will be from our database directly
                                        // and thus we have to set the connection
                                        Class.forName("com.mysql.jdbc.Driver");

                                        String url = "jdbc:mysql://127.0.0.1:3307/student_enrollment";
                                        String username = "root";
                                        String password = "Munguti610.";
                                        Connection conn = DriverManager.getConnection(url, username, password);
                                        Statement statement = conn.createStatement();
                                        //We then query the database to obtain the computer science students only
                                        ResultSet resultSet = statement.executeQuery("select admission_number,first_name,last_name from student where course_selected like'Computer Science'");
                                        while (resultSet.next()){
                                            String fn=resultSet.getString("first_name");
                                            String ln=resultSet.getString("last_name");
                                            String ad=resultSet.getString("admission_number");
                                            String[] data={fn,ln,ad};
                                            tb.addRow(data);
                                        }
                                        //We then set up the frame this information will be hosted
                                        main_screen.setVisible(true);
                                        JFrame f = new JFrame();
                                        //we set its defaults
                                        f.setTitle("COMPUTER SCIENCE STUDENTS");
                                        f.setSize(300, 300);
                                        f.setLocation(900,7);
                                        f.setBackground(Color.gray);
                                        f.add(new JScrollPane(t));
                                        f.setVisible(true);





                                    //If the database connection does not happen we have to catch the error
                                    }catch (Exception ey){
                                        System.out.println(ey);
                                    }

                                }
                            });
                            //we then define what should happen when the business studies button is clicked

                            bs.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    try {
                                        // This information will be displayed in table format
                                        //The code is the same has the computer science students button,the only difference being,in this instance we shall obtain the business studies students from our database
                                        DefaultTableModel tb=new DefaultTableModel();
                                        JTable t;
                                        t=new JTable(tb);
                                        tb.addColumn("First Name");
                                        tb.addColumn("Last Name");
                                        tb.addColumn("Admission Number");

                                        Class.forName("com.mysql.jdbc.Driver");

                                        String url = "jdbc:mysql://127.0.0.1:3307/student_enrollment";
                                        String username = "root";
                                        String password = "Munguti610.";
                                        Connection conn = DriverManager.getConnection(url, username, password);
                                        Statement statement = conn.createStatement();
                                        ResultSet resultSet = statement.executeQuery("select admission_number,first_name,last_name from student where course_selected like 'Business Studies'");
                                        while (resultSet.next()){
                                            String fn=resultSet.getString("first_name");
                                            String ln=resultSet.getString("last_name");
                                            String ad=resultSet.getString("admission_number");
                                            String[] data={fn,ln,ad};
                                            tb.addRow(data);
                                        }
                                        main_screen.setVisible(true);
                                        JFrame f = new JFrame();
                                        f.setTitle("BUSINESS STUDIES STUDENTS");
                                        f.setSize(300, 300);
                                        f.setLocation(900,7);
                                        f.setBackground(Color.gray);
                                        f.add(new JScrollPane(t));
                                        f.setVisible(true);






                                    }catch (Exception ey){
                                        System.out.println(ey);
                                    }

                                }
                            });
                            //We then set what should happen when the GC students button is clicked
                            //The code is the same as above, the only difference being we are querying the database to obtain theBusiness studies students
                            gc.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    try {
                                        DefaultTableModel tb=new DefaultTableModel();
                                        JTable t;
                                        t=new JTable(tb);
                                        tb.addColumn("First Name");
                                        tb.addColumn("Last Name");
                                        tb.addColumn("Admission Number");

                                        Class.forName("com.mysql.jdbc.Driver");

                                        String url = "jdbc:mysql://127.0.0.1:3307/student_enrollment";
                                        String username = "root";
                                        String password = "Munguti610.";
                                        Connection conn = DriverManager.getConnection(url, username, password);
                                        Statement statement = conn.createStatement();
                                        ResultSet resultSet = statement.executeQuery("select admission_number,first_name,last_name from student where course_selected like 'Global Challenges'");
                                        while (resultSet.next()){
                                            String fn=resultSet.getString("first_name");
                                            String ln=resultSet.getString("last_name");
                                            String ad=resultSet.getString("admission_number");
                                            String[] data={fn,ln,ad};
                                            tb.addRow(data);
                                        }
                                        main_screen.setVisible(true);
                                        JFrame f = new JFrame();
                                        f.setTitle("GC STUDENTS");
                                        f.setSize(300, 300);
                                        f.setLocation(900,7);
                                        f.setBackground(Color.gray);
                                        f.add(new JScrollPane(t));
                                        f.setVisible(true);






                                    }catch (Exception ey){
                                        System.out.println(ey);
                                    }

                                }
                            });



                        } else {
                            //show error message
                            System.out.println("Please enter valid username and password");
                        }
                    }
                    //This the completion of the login code
                    System.out.println("Connected");


                }catch (Exception ef) {
                    System.out.println("Not connected");
                    System.out.println(ef);
                }
            }
        });
        //we then define what should happen when the SIGN UP button is clicked
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //We shall obtain the entered information and store in our database.
                // The user can then login in with this data
                //We first check that the entry fields are not empty
                if(textField1.getText().equals("")||textField2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Username or password is missing");

                }
                else{
                    //If they are not empty, then input the information to the database
                    String pass=textField2.getText();
                    String user=textField1.getText();
                    try {
                        Class.forName("com.mysql.jdbc.Driver");

                        String url = "jdbc:mysql://127.0.0.1:3307/student_enrollment";
                        String username = "root";
                        String password = "Munguti610.";
                        Connection conn = DriverManager.getConnection(url, username, password);
                        Statement statement = conn.createStatement();
                        //below is the insertion query
                        String SQL = "INSERT INTO student(username,password) VALUES('"+user+"','"+pass+"')";
                        statement.executeUpdate(SQL);
                        System.out.println("successfull");

                    }catch (Exception et){
                        System.out.println(et);
                    }

                    //We then notify the user that the account was created successfully and that she can now login with those
                    //credentials
                    JOptionPane.showMessageDialog(null,"Created successfully\n You can now Login");
                }


            }
        });







            //add action listener to button

        setTitle("LOGIN FORM");//set title to the login form


    }

    //define abstract method actionPerformed() which will be called on button click

}
