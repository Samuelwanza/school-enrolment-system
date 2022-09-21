//Our project is within the java_summative assignment
package Java_summative;

//We then import the javax.swing library for the initialization of the GUI
import javax.swing.*;
//We then create the login class which has the main method and thus acts the driver code for the enrollment application

public class Login{
    //Creation of the main method
    public static void main(String arg[])
    {
        try
        {

            //create instance of the Enrollment_application
            Enrollment_application form = new Enrollment_application();
            form.setSize(900,150);  //set size of the frame
            form.setVisible(true);  //make form visible to the user
            form.setLocation(300,300);
            form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
        catch(Exception e)
        {

            //handle exception and display it to the user using the JoptionPane.showMessageDialog
            JOptionPane.showMessageDialog(null, e.getMessage());

            //For purposes of testing, you can try the following login creditials
            //username=assassin
            //password=kranko
        }
    }
}
