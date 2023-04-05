import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.io.*;

/**
 * Game: This is a graphical Retro RPG Game 
 * Text based style but using the Swing tools
 * to create a graphical-ish interface.
 * JOptionPane.showInputDialog( main-panel , "message")
 * returns a string of text we can examine for commands
 * in the game not handled strictly by buttons.
 * @author (NAME HERE)
 * @version (OCDSB 2022)
 */
public class Game implements ActionListener
{
    // INSTANCE DATA HERE
    JButton btnPlay, btnReset, btnNext, btnInventory;
    Screen display;
    int count = 0;
    // METHOD TO USE BUTTONS HERE

    public void actionPerformed(ActionEvent ae)
    {
        /*
         *  JButton source = (JButton) ae.getSource();
         *  used for multiple buttons to identify them
         *  using simple if-blocks chained together
         */

        JButton source = (JButton) ae.getSource () ;
        if(btnInventory == source){
            display.inventory();
        }
        if(btnPlay == source){
            display.startingScreen();
            btnNext.setEnabled(true);
            btnReset.setEnabled(true);
            btnPlay.setEnabled(false);
            btnInventory.setEnabled(true);

        }
        if (btnNext == source) {
            btnPlay.setEnabled(false);
            count++;
            if (count == 1){
                display.step3();
            }
            if (count == 2){
                display.step4();
            }
            if (count == 3){
                display.step4_2();
            }
            if (count == 4){
                display.step4_3();
            }
            if (count == 5){
                display.step5();
                String inp = JOptionPane.showInputDialog("Please Enter Your Choice (a/b)");
                inp = inp.toLowerCase();
                while (true) {
                    if (!(inp.equals("a")) && !(inp.equals("b"))) {
                        inp = JOptionPane.showInputDialog("Please Enter Correct Choice Again (a/b)");
                        inp = inp.toLowerCase();
                    }
                    else {
                        break;
                    }
                }
                if (inp.equals("a")){
                    display.gameOver();
                    btnNext.setEnabled(false);
                } else if (inp.equals("b")) {
                    display.step6();

                }
            }
            if (count == 6){
                display.step6_2();
                String inp = JOptionPane.showInputDialog("Please Enter Your Choice (a/b)");
                inp = inp.toLowerCase();
                while (true) {
                    if (!(inp.equals("a")) && !(inp.equals("b"))) {
                        inp = JOptionPane.showInputDialog("Please Enter Correct Choice Again (a/b)");
                        inp = inp.toLowerCase();
                    }
                    else {
                        break;
                    }
                }
                if (inp.equals("a")) {
                    display.gameOver();
                    btnNext.setEnabled(false);
                }
                else if (inp.equals("b")) {
                    try {
                        FileWriter writer = new FileWriter("inventory.txt");
                        writer.write("Inventory Item: 1) Map");
                        writer.close();
                    }
                    catch (IOException e) {

                        e.printStackTrace();
                    }
                    display.step7();

                }
            }
            if (count == 7) {
                display.step7_2();
            }

            if (count == 9) {
                display.step13_2();
                btnNext.setEnabled(false);
            }
            if (count == 8) {
                display.step7_3();
                String inp = JOptionPane.showInputDialog("Please Enter Your Choice (a/b)");
                inp = inp.toLowerCase();
                while (true) {
                    if (!(inp.equals("a")) && !(inp.equals("b"))) {
                        inp = JOptionPane.showInputDialog("Please Enter Correct Choice Again (a/b)");
                        inp = inp.toLowerCase();
                    }
                    else {
                        break;
                    }
                }
                if (inp.equals("b")) {
                    display.gameOver();
                    btnNext.setEnabled(false);
                }
                else if (inp.equals("a")) {
                    display.step8();
                    String inp1 = JOptionPane.showInputDialog("Please Enter Your Choice (a/b)");
                    inp1 = inp1.toLowerCase();
                    while (true) {
                        if (!(inp1.equals("a")) && !(inp1.equals("b"))) {
                            inp1 = JOptionPane.showInputDialog("Please Enter Correct Choice Again (a/b)");
                            inp1 = inp1.toLowerCase();
                        }
                        else {
                            break;
                        }
                    }
                    if (inp1.equals("b")) {
                        display.gameOver();
                        btnNext.setEnabled(false);
                    }
                    else if (inp1.equals("a")) {
                        display.step9();
                        String inp2 = JOptionPane.showInputDialog("Please Enter Your Choice (a/b)");
                        inp2 = inp2.toLowerCase();
                        while (true) {
                            if (!(inp2.equals("a")) && !(inp2.equals("b"))) {
                                inp2 = JOptionPane.showInputDialog("Please Enter Correct Choice Again (a/b)");
                                inp2 = inp2.toLowerCase();
                            }
                            else {
                                break;
                            }
                        }
                        if (inp2.equals("a")) {
                            display.gameOver();
                            btnNext.setEnabled(false);
                        }
                        else if (inp2.equals("b")) {
                            display.step10();
                            String inp3 = JOptionPane.showInputDialog("Please Enter Your Choice (a/b)");
                            inp3 = inp3.toLowerCase();
                            while (true) {
                                if (!(inp3.equals("a")) && !(inp3.equals("b"))) {
                                    inp3 = JOptionPane.showInputDialog("Please Enter Correct Choice Again (a/b)");
                                    inp3 = inp3.toLowerCase();
                                }
                                else {
                                    break;
                                }
                            }
                            if (inp3.equals("b")) {
                                display.gameOver();
                                btnNext.setEnabled(false);
                            }
                            else if (inp3.equals("a")) {
                                display.step11();
                                String inp4 = JOptionPane.showInputDialog("Please Enter Your Choice (a/b)");
                                inp4 = inp4.toLowerCase();
                                while (true) {
                                    if (!(inp4.equals("a")) && !(inp4.equals("b"))) {
                                        inp4 = JOptionPane.showInputDialog("Please Enter Correct Choice Again (a/b)");
                                        inp4 = inp4.toLowerCase();
                                    }
                                    else {
                                        break;
                                    }
                                }
                                if (inp4.equals("a")) {
                                    display.gameOver();
                                    btnNext.setEnabled(false);
                                }
                                else if (inp4.equals("b")) {
                                    display.step12();
                                    String inp5 = JOptionPane.showInputDialog("Please Enter Your Choice (a/b)");
                                    inp5 = inp5.toLowerCase();
                                    while (true) {
                                        if (!(inp5.equals("a")) && !(inp5.equals("b"))) {
                                            inp5 = JOptionPane.showInputDialog("Please Enter Correct Choice Again (a/b)");
                                            inp5 = inp5.toLowerCase();
                                        }
                                        else {
                                            break;
                                        }
                                    }
                                    if (inp5.equals("b")) {
                                        display.gameOver();
                                        btnNext.setEnabled(false);
                                    }
                                    else if (inp5.equals("a")) {
                                        display.step13();



                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println(count);
        }
        if(btnReset == source){
            btnNext.setEnabled(false);
            btnReset.setEnabled(false);
            btnPlay.setEnabled(true);
            btnInventory.setEnabled(false);
            count = 0;
            try {
                FileWriter writer = new FileWriter("inventory.txt");
                writer.write("");
                writer.close();
            }
            catch (IOException e) {

                e.printStackTrace();
            }
            display.reset();


        }
    }
    
    // CONSTRUCTOR HERE
    public Game()
    {

         // setup the window frame
        JFrame frame = new JFrame();
        frame.setTitle("Adventure Game Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        display = new Screen(); // a screen to display our game
        JPanel buttonPanel = new JPanel(); // area to organize buttons
        
        btnPlay = new JButton("Play"); // create our play button
        btnPlay.addActionListener(this);
        btnPlay.setFont( new Font("Arial", Font.PLAIN, 24) );
        btnPlay.setMnemonic(KeyEvent.VK_P);

        btnNext = new JButton("Next");
        btnNext.addActionListener(this);
        btnNext.setFont( new Font ("Arial", Font.PLAIN, 24) ); 
        btnNext.setMnemonic(KeyEvent.VK_N);

        btnInventory = new JButton("Inventory");
        btnInventory.addActionListener(this);
        btnInventory.setFont( new Font ("Arial", Font.PLAIN, 24) );
        btnInventory.setMnemonic(KeyEvent.VK_N);

        btnReset = new JButton("Reset");
        btnReset.addActionListener(this);
        btnReset.setFont( new Font ("Arial", Font.PLAIN, 24) );
        btnReset.setMnemonic(KeyEvent.VK_N);




        buttonPanel.add(btnPlay);
        buttonPanel.add(btnNext);
        buttonPanel.add(btnInventory);
        buttonPanel.add(btnReset);


        btnNext.setEnabled(false);
        btnReset.setEnabled(false);
        btnInventory.setEnabled(false);

        
        frame.getContentPane().add(display,BorderLayout.CENTER);
        frame.getContentPane().add(buttonPanel,BorderLayout.SOUTH);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        try {
            FileWriter writer = new FileWriter("inventory.txt");
            writer.write("");
            writer.close();
        }
        catch (IOException e) {

            e.printStackTrace();
        }
        Game app = new Game();
    }
}
