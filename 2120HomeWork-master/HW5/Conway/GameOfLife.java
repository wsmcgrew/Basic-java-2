import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

public class GameOfLife extends JFrame {
    public static void main(String[] args) throws InterruptedException {
       //GameOfLifeTUI theTUI = new GameOfLifeTUI(75, 100);
	   GameOfLife theTUI;
		JFrame window = new JFrame();
		window.getContentPane().add(new GameOfLifeTUI(75, 100));
		window.setSize(600,600);
		
	   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   window.setSize (600, 600);
       window.setVisible(true);

    }
}
