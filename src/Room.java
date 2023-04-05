import javax.swing.ImageIcon;
import java.io.File; // reading files part 1
import java.io.FileNotFoundException; // failure class
import java.util.Scanner; // to read files
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

/**
 * Room: a representation of a location in a Retro RPG game
 * where the "player" experiences the environment of the 
 * location.  This room will look a bit like the following:
 * +=================================================+
 * + The text description of the location the player +
 * + will see when they enter the room and may be    +
 * + simple stuff they want to touch, pick up or,    +
 * + fight (monster), or person to "talk with"       +
 * +==================================================
 * .. Picture of monster, item, person optional
 * Note: buttons / OptionPane in driver class only. 
 *
 * @author (YOUR NAME)
 * @version (OCDSB 2022)
 */
public class Room
{
    // INSTANCE DATA PERSONALIZED FOR EACH ROOM
    private String description; 
    private ImageIcon picture;

    // will load the description and image from files
    public Room(String filePath, String imagePath)
    {
        description = ""; // start with an empty string
        try{
            File fname = new File(filePath);
            Scanner sc = new Scanner(fname);
            
            // provided the path and file name correct
            picture = new ImageIcon(imagePath); 
            // here we read in the text file line by line
            while(sc.hasNextLine())
            {
                description += sc.nextLine(); 
            }
        }
        catch(FileNotFoundException e){
            System.err.println("wrong file name?");
            e.printStackTrace();
        }
    }
    public void newRoom(String filePath, String imagePath)
    {
        description = ""; // start with an empty string
        try{
            File fname = new File(filePath);
            Scanner sc = new Scanner(fname);

            // provided the path and file name correct
            picture = new ImageIcon(imagePath);
            // here we read in the text file line by line
            while(sc.hasNextLine())
            {
                description += sc.nextLine();
            }
        }
        catch(FileNotFoundException e){
            System.err.println("wrong file name?");
            e.printStackTrace();
        }
    }
    
    /*
     * A bit complicated, but we use the canvas as an 'observer' for drawing
     * ImageIcons to it using the Graphics context.  This method should draw
     * an outline rectangel around the text to be displayed and display the
     * picture directly under it. 
     */
    public void display(JPanel canvas, Graphics page, int xLoc,int yLoc)
    {
        // deal with the description and fit it into a 600 wide by 400 tall
        // box . . . think about the description storage . . . use drawstring()
        Graphics2D g2d = (Graphics2D) page;
        g2d.setColor(Color.white);
        g2d.setStroke( new BasicStroke(3) );

        // area for text to appear
        int WIDTH = 600;
        int HEIGHT = 300;
        g2d.drawRoundRect(xLoc,yLoc, WIDTH, HEIGHT,20,20);
        
        g2d.setFont(new Font("Arial",Font.PLAIN,24) );
        
        // we need a more advanced technique to draw the string maybe?
        String[] text = description.split("#"); // marker in our file
        for(int i = 0; i < text.length; i++)
        {
             g2d.drawString(text[i],xLoc + 10, yLoc + 40 + (40 * i));
        }
       
        // then we draw the picture 
        picture.paintIcon(canvas, page,xLoc,yLoc + HEIGHT + 10);
        
    }
}
