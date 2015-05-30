import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;

/**
 * 
 * @author chloe mo
 Write a program for a network version of the Battleships game.
 the game is played between two players, each on a separate computer.


 */
public class Main {
	final static int DISPLAY_WIDTH = 850;
	final static int DISPLAY_HEIGHT = 700;
	public static Display display;
	
	public static void main(String[] args) throws UnknownHostException {
		// Bring up a JFrame with squares to represent the cells
		display = new Display(DISPLAY_WIDTH, DISPLAY_HEIGHT);
		display.setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
		
		display.setLayout(null);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setTitle("Battleship");
		display.setVisible(true);
		display.requestFocus();
		try {
			InetAddress host = InetAddress.getLocalHost();
			Socket socket = new Socket(host.getHostName(), 7777);
		/*	
			ObjectOutputStream oos = new ObjectOutputStream(
					socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(
					socket.getInputStream());
			System.out.println("------------------------------------------");
			String message = "hello ! this is a test";
			System.out.println("send message: " + message);
			oos.writeObject(message);
			message = (String) ois.readObject();
			System.out.println("received message: " + message); */
		} catch (IOException e /* | ClassNotFoundException e*/) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

/*
 * OUTPUT: none, all done in application window

 */
