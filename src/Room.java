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
	
	public void assign(int r, int c, Client client) {
		if (r<getNumRows() && c<getNumCols()) {
			seats[r][c].setClient(client);
		}
	}
	
	public void assign(char r, int c, Client client) {
		assign(Seat.rowNum(r), c, client);
	}
	
	public void assign(Seat.Row r, int c, Client client) {
		assign(r.ordinal(), c, client);
	}
}
