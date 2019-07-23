import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SeatPanel implements ActionListener {
	private Seat seat;
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public SeatPanel(Seat seat) {
		this.seat = seat;
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		label = new JLabel(seat.toString(),JLabel.CENTER);
		
		button = new JButton(seat.seatName());
		button.setFont(new Font("Arial", Font.PLAIN, 8));
		
		panel.add(label);
		panel.add(button);
	}
	
	public void addTo(JPanel panel) {
		panel.add(this.panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
