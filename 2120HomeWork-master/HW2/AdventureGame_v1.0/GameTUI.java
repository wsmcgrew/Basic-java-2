import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.Serializable;
import java.util.*;

/*****************************************************************
 * Game TUI:Run Adventure Game
 * 
 * Description:Runs the general gameplay including
 * the serialization/deserilization for SAVE/LOAD
 ***************************************************************/


public class GameTUI implements Serializable
{

    private Config itsConfig;
    private Dungeon itsDungeon;

    public GameTUI (Config c, Dungeon d) {

        itsConfig = c;
        itsDungeon = d;
    }

    // this is the main loop - very little logic here in the TUI
    // but all the input and output should be controlled from here

    public void run() {
        while (itsDungeon.getHero().getHealth() > 0)
        {
            //clear previous screen 
            StdDraw.clear();
            
            //draw the game world
            //drawScreen();
            itsDungeon.draw();

            String heroMenu = itsConfig.setupHeroText(itsDungeon.getHero());
            StdDraw.drawText(heroMenu);
            String monsterMenu = itsConfig.setupMonsterText(itsDungeon.getAdjacentMonsters());
            StdDraw.drawText(monsterMenu);
        
            //Get player's action from input
            String userInput = StdIn.readString();
            Action action = itsConfig.mapKeyToAction(userInput);
			
			if(action == Action.SAVE){
					 //Open OutputStream and write itsDungeon in it
					 try{
						ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SaveGame.dat"));
						out.writeObject(itsDungeon);
						out.close();// close stream
						System.out.println("Saved to file");
					} catch (IOException e){
						 System.out.println("Error saving game data");
						 e.printStackTrace();//print stack for troubleshooting
					 }
			}
				 if (action == Action.LOAD){
						ObjectInputStream in = null;//initializion of null
						try{
							in = new ObjectInputStream(new FileInputStream("SaveGame.dat"));
							itsDungeon = ((Dungeon) in.readObject());//read object into instance variable
						} catch (IOException e) {
							System.out.println("Error translating object");
						} catch (ClassNotFoundException e){
							System.out.println("No saved games found");
						}
						//close InputStream
						try{
							in.close();//close stream
						} catch (IOException e){
							System.out.println("Error closing file");
						} 
				}else {//Execute player's action and Update game 
					itsDungeon.execute(action);}
		}//end while loop
	StdDraw.drawText("You died!\n");

    }//end run

    public void drawScreen() {
        // Draw game map!
        StdDraw.initGameMap(itsDungeon.getWidth(), itsDungeon.getHeight());
        drawDungeon();
        drawHero();
        drawMonsters();
        //Render display
        StdDraw.draw(); //change to call called render
    }

    public void drawDungeon() {
        Cell[][] map = itsDungeon.getMap();
        for (int i=0;i<itsDungeon.getWidth();i++) 
        {
             for (int j=0;j<itsDungeon.getHeight();j++)
             {
                   map[i][j].draw(itsConfig, i,j);
             }
        }
    }

    //Draw hero
    public void drawHero() {
        Cell[][] map = itsDungeon.getMap();
        Hero stanley = itsDungeon.getHero();
        Tile heroTile = map[stanley.getX()][stanley.getY()].getTile();  //Get background tile
        stanley.draw(heroTile);                                      //Draw hero ontop that background
    }

    //Draw monsters
    public void drawMonsters() {
        Cell[][] map = itsDungeon.getMap();
        ArrayList<Monster> monsters = itsDungeon.getMonsters();
        for (Monster creature: monsters)
        {
            Tile monsterTile = map[creature.getX()][creature.getY()].getTile();  //Get background tile  
            creature.draw(monsterTile);
        }
    }

    
}//end GameTUI
