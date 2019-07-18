
public class Seat {
	enum Row {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
	}
	
	private String initials,
	clientid;
	private boolean assignable;
	private Row r;
	private int c;
	
	Seat(int r, int c) {
		this.r = Row.values()[r];
		this.c = c;
	}
	
	Seat(char r, int c) {
		this.r = Row.valueOf(Character.toString(r));
		this.c = c;
	}
	
	public static int rowNum(char r) {
		return Row.valueOf(Character.toString(r)).ordinal();
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
	
	public boolean canBeAssigned() {
		return assignable;
	}
	
	public void setCanBeAssigned(boolean assignable) {
		this.assignable = assignable;
	}
}
