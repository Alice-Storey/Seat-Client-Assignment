import javax.swing.JFrame;
import javax.swing.JLabel;

public class SeatLabel {
	private String position;
	private JLabel label;
	private JFrame frame;
	
	SeatLabel() {
		
	}
	
	JLabel setLabel(String labelName, String position, JFrame frame) {
		this.position = position;
		this.label = new JLabel(labelName, JLabel.CENTER);
		this.frame = frame;
		setLabelInLayout();
		return this.label;
	}
	
	private void setLabelInLayout() {
		frame.add(label, position);
	}
	
	JFrame getFrame() {
		return frame;
	}
}
