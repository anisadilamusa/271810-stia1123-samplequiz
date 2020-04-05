/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window1;

/**
 *
 * @author SAYA
 */
import javax.swing.*;


public class Window1 extends JFrame {
   
    public Window1 () {
        setTitle("Hello World");
        setSize( 400,300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public static void main(String[] args) {
      new Window1();
       
    }
    
}
