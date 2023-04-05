import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;
import java.awt.Dimension;


/**
 * Screen: Our main screen for anything we are going
 * to show to our player .. mainly text but maybe some
 * pictures of items, monsters, treasure, etc. 
 * 
 * @author (YOUR NAME)
 * @version (OCDSB 2022)
 */
public class Screen extends JPanel
{
    // INSTANCE DATA ( global to this class )
    final int WIDTH = 640;  // classic retro screen size
    final int HEIGHT = 480;
    Room start;
    // The Constructor of the class
    public Screen()
    {
        start = new Room("src/resources/start.txt","src/resources/welcome.png");
        
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color
    }

    public void paintComponent(Graphics page)
    {
        // CALL PARENT - THEN USE DRAWING AREA
        super.paintComponent(page);
        
        /*
         * Consistantly draw the current state of a helper
         * Object called room -- we move room to room in a
         * retro RPG dungeon / game 
         */
         start.display(this,page,2,2); // 2 pixels away from the edge.
    }
    public void startingScreen(){
        start.newRoom("src/resources/starting.txt","src/resources/starting.png");
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color
        repaint();
    }
    public void step3(){
        start.newRoom("src/resources/step3.txt","src/resources/step3.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }
    public void reset(){
        start.newRoom("src/resources/start.txt","src/resources/welcome.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }
    public void inventory(){
        start.newRoom("src/inventory.txt","src/resources/treasure.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }

    public void step4() {
        start.newRoom("src/resources/step4.txt","src/resources/step4.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }

    public void step4_2() {
        start.newRoom("src/resources/step4-2.txt","src/resources/step4.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }

    public void step5() {
        start.newRoom("src/resources/step5.txt","src/resources/step5.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }
    public void gameOver(){
        start.newRoom("src/resources/gameover.txt","src/resources/gameover.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }

    public void step6() {
        start.newRoom("src/resources/step6.txt","src/resources/step6.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();

    }

    public void step4_3() {
        start.newRoom("src/resources/step4-3.txt","src/resources/step4-3.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }

    public void step6_2() {
        start.newRoom("src/resources/step6-2.txt","src/resources/step6.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }

    public void step7() {
        start.newRoom("src/resources/step7.txt","src/resources/step6.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }

    public void step7_2() {
        start.newRoom("src/resources/step7-2.txt","src/resources/step7-2.png");

        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }

    public void step7_3() {
        start.newRoom("src/resources/step7-3.txt","src/resources/step7-2.png");
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color

        repaint();
    }

    public void step8() {
        start.newRoom("src/resources/step8.txt","src/resources/step8.png");
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color
        repaint();
    }

    public void step9() {
        start.newRoom("src/resources/step9.txt","src/resources/step9.png");
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color
        repaint();
    }

    public void step10() {
        start.newRoom("src/resources/step10.txt","src/resources/step10.png");
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color
        repaint();
    }

    public void step11() {
        start.newRoom("src/resources/step11.txt","src/resources/step11.png");
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color
        repaint();
    }

    public void step12() {
        start.newRoom("src/resources/step12.txt","src/resources/step12.png");
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color
        repaint();
    }

    public void step13() {
        start.newRoom("src/resources/step13.txt","src/resources/step13.png");
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color
        repaint();
    }

    public void step13_2() {
        start.newRoom("src/resources/step13-2.txt","src/resources/last scene.png");
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black); // retro color
        repaint();
    }


    // Interface Methods - called by the driver runing game
    
}
