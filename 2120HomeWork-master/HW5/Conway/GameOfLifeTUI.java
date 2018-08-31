import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Observer;
import java.util.Observable;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class GameOfLifeTUI extends JPanel implements Observer {

    private Grid myGrid;
	private JPanel board;
	private Graphics g;
	private static final int cellSize = 10;
	private int yDim;
	private int xDim;

    public GameOfLifeTUI(int xDim, int yDim) {
		super();
		xDim = xDim;
		yDim = yDim;
		myGrid = new Grid(xDim,yDim);
		myGrid.gliderSetup();
		this.board = new JPanel();
		//run();
    }

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
			g.setColor(Color.black);
			g.drawRect(0,0,500,500);
			g.fillRect(0,0,20, 20);
	}

	public void repaint(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(0,0,500,500);
		g.fillRect(0,0,xDim,yDim);
		if (myGrid.cellIsAlive(xDim, yDim)) {
			g.setColor(Color.red);
			g.fillRect(xDim*cellSize, yDim*cellSize, cellSize, cellSize);
		}
	}
	public void update(Observable obs, Object obj) {
		this.repaint();
	}

    public void run() {
       // on purpose an endless loop
       clearScreen();
		while (true) {	
			displayGrid();
		}
    }

    public void displayGrid() {
       System.out.print(myGrid);
    }

   public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
