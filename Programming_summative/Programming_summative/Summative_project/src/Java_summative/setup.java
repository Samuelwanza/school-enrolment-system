//Our application is within theJava_summative package
package Java_summative;
//We then import the javax.swing library for GUI creation and generation

import javax.swing.*;
//We then create the setup class which will extend the JFrame class from the java.swing library

public class setup extends JFrame {
    //We then define our constructor for our real application away from the login
    setup()
    {
        //We then set the defaults of GUI,the title and the size of the window/frame
        setDefaultCloseOperation(javax.swing.
                WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("STUDENT ENROLLMENT SYSTEM");



        setSize( 1350, 800);

    }

}
