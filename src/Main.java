public class Main {

	public static void startApp() {
		System.out.println("startApp()");
		System.out.println("\n");
		
	}
	
	public static void getInput() {

		// quick test of the client data structure
		System.out.println("getInput()\n");
		System.out.println("- We are going to create a Client class that will hold data and return itself or some info about it");
		Client testClient = new Client("Gauthier", "Claude", 2);
		System.out.println("Lastname: " + testClient.getClientLastName() + " " + "Firstname: " + testClient.getClientFirstName() + " " + "ID: " + testClient.getClientId());
		System.out.println("\n\n");
		// quick test to see if we can load data from a CSV file
		// and at least get an accurate count of the rows loaded in
		System.out.println("- Testing the ClientStore class\n");
		ClientStore myStore = new ClientStore("clients_list.csv");
		Client[] store = myStore.getClientStore();
		System.out.println("\n");
		System.out.println("- DataCount: " + myStore.getClientDataCount());
		System.out.println("\nThis is a list of all the data in the store\n");
		// iterate via the array of store.
		for(Client c : store) {
			if(c != null) {
				System.out.println(c.getFullClientString());
			}
		}
		
	}	
	
	public static void main(String[] args) {
		startApp();
		getInput();
	}

}
