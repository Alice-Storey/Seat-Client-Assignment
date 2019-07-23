import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonControl implements ActionListener {
	private SeatPanel[][] seatPanels;
	private JPanel panel;
	
	public ButtonControl(Room room) {
		panel = new JPanel();
		panel.setLayout(new GridLayout(room.getNumRows(),room.getNumCols()));
		
		
		seatPanels = new SeatPanel[room.getNumRows()][room.getNumCols()];
		
		for (int r=0; r<room.getNumRows(); r++) {
			for (int c=0; c<room.getNumCols(); c++) {
				seatPanels[r][c] = new SeatPanel(room.get(r, c));
				seatPanels[r][c].addTo(panel);
			}
		}
	}
	
	public void addTo(JFrame frame, String pos) {
		frame.add(panel, pos);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
