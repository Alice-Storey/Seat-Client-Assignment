import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SeatPanel implements ActionListener {
	private Seat seat;
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public SeatPanel(Seat seat) {
		this.seat = seat;
		label = new JLabel(seat.toString(), JLabel.CENTER);
		panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		panel.add(label);
		
		button = new JButton("Unbook");
		panel.add(button);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	
	public void addTo(JPanel panel) {
		//panel.add(this.panel);
		panel.add(this.panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
