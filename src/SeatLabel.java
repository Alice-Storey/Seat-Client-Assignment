import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SeatLabel {
	private int position;
	private JLabel label;
	private JPanel panel;
	
	SeatLabel() {
		
	}
	
	JLabel setLabel(String labelName, JPanel panel) {
		this.position = JLabel.CENTER;
		this.label = new JLabel(labelName, position);
		this.panel = panel;
		setLabelInLayout();
		return this.label;
	}
	
	private void setLabelInLayout() {
		panel.add(label);
	}
	
	JPanel getPanel() {
		return panel;
	}
}
