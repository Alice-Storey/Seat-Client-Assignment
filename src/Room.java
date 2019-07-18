public class Room {
	private Seat[][] seats; //row, col
	
	public Room(int rows, int cols) {
		seats = new Seat[rows][cols];
	}
	
	public int getNumRows() {
		return seats.length;
	}
	
	public int getNumCols() {
		return seats.length>0 ? seats[0].length : 0;
	}
	
	public boolean assign(int r, int c, Client client) {
		if (r<getNumRows() && c<getNumCols() && seats[r][c].canBeAssigned()) {
			seats[r][c].setClient(client);
			return true;
		}
		return false;
	}
	
	public boolean assign(char r, int c, Client client) {
		return assign(Seat.rowNum(r), c, client);
	}
	
	public boolean assign(Seat.Row r, int c, Client client) {
		return assign(r.ordinal(), c, client);
	}
	
	public String toString() {
		String output = "";
		
		output += String.format("%7s", " ");
		for (int i=0; i<getNumCols(); ++i) {
			output += String.format("%15s", "Seat "+i);
		}
		
		int rowcount = 0;
		for (Seat[] row : seats) {
			output += String.format("%7s","Row "+Seat.rowChar(++rowcount));
			for (Seat seat : row) {
				output += String.format("%15s", seat);
			}
			output += "\n";
		}
		
		return output;
	}
}
