import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Main {
	private static Room room;
	private static ClientStore myStore;
	private static int width = 500;
	private static int height = 500;
	
	public static void startApp() {
		System.out.println("startApp()");
		System.out.println("\n");
		
		SwingUtilities.invokeLater(new Runnable() {
			AssignmentFrame app;
			JFrame frame;			
			
			public void run() {
				app = new AssignmentFrame("My 2nd Matrix Demo");
				frame = app.getFrame();
				frame = setupFrame(frame, JFrame.EXIT_ON_CLOSE, 400, 400);
				frame.setVisible(true);
			}
		});
		
	}
	
	public static JLabel setHeaderLabel(JFrame frame) {
		JLabel headerLabel = new JLabel("My 2nd Matrix Demo", JLabel.CENTER);
		headerLabel.setSize(width, 30);
		frame.add(headerLabel);
		
		return headerLabel;
	}
	
	public static JFrame setupFrame(JFrame frame, int onExit, int width, int height) {
		centerAndSizeJFrameOnScreen(frame, width, height);
		frame.setDefaultCloseOperation(onExit);
		
		setHeaderLabel(frame);
		
		
		
		
		return frame;
	}
	
	public static void centerAndSizeJFrameOnScreen(JFrame frm, int width, int height) {
		frm.setSize(width, height);
		frm.setLocationRelativeTo(null);
	}
	
	public static void getInput() throws CloneNotSupportedException {

		// quick test of the client data structure
		/*
		System.out.println("getInput()\n");
		System.out.println("- We are going to create a Client class that will hold data and return itself or some info about it");
		Client testClient = new Client("Gauthier", "Claude", 2);
		System.out.println("Lastname: " + testClient.getClientLastName() + " " + "Firstname: " + testClient.getClientFirstName() + " " + "ID: " + testClient.getClientId());
		System.out.println("\n\n");
		*/
		
		// quick test to see if we can load data from a CSV file
		// and at least get an accurate count of the rows loaded in
		//System.out.println("- Testing the ClientStore class\n");
		myStore = new ClientStore("clients_list.csv");
		ClientStore shuffledStore;
		try {
			shuffledStore = (ClientStore) myStore.clone();
			
		}
		catch (CloneNotSupportedException e) {
			throw e;
		}
		shuffledStore.shuffle();
		room = new Room(5,5);
		
		/*
		System.out.println("- DataCount: " + myStore.getClientDataCount());
		System.out.println("\nThis is a list of all the data in the store\n");
		*/
		
		// iterate via the array of store.
		Client[] store = shuffledStore.getClientStore();
		for(int i=0; i<store.length; i++) {
			Client client = store[i];
			if(client != null) {
				//System.out.println(c.getFullClientString());
				int r = i/room.getNumRows();
				int c = i%room.getNumCols();
				System.out.printf("Assigning %d, %d to %s\n", r, c, client);
				room.assign(r, c, client);
			}
		}
		System.out.println(room);
		System.out.println(myStore);
		
		
	}	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		startApp();
		try {
			getInput();
		}
		catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
	}

}
