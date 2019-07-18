
public class Seat {
	enum Row {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
	}
	
	private String initials,
	clientid;
	private boolean canBeAssigned;
	private Row r;
	private int c;
	
	Seat(int r, int c) {
		this.r = Row.values()[r];
		this.c = c;
	}
	
	public int[] coords() {
		int[] rowcol =  { r.ordinal(), c };
		return rowcol;
	}
	
	public int getRow () {
		return coords()[0];
	}
	
	public int getCol() {
		return coords()[1];
	}
}
