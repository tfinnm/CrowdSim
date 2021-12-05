import java.util.ArrayList;

public class agent implements Runnable{

	public static ArrayList<agent> agents = new ArrayList<agent>();
	public static enum trait {
		shy,
		socialite,
		follower
	}
	public static void simulate() {
		for (agent a: agents) {
			a.move();
		}
	}
	
	/***
	 * 		Switch from static to local here.
	 */
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	private ArrayList<trait> traits = new ArrayList<trait>();
	private int popularity = 50;
	private int xPos = 0;
	private int yPos = 0;
	public agent() {
		agents.add(this);
		new Thread(this).start();
	}
	public void move() {
		
	}
	
}
