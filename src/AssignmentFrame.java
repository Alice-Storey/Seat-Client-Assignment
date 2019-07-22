import java.awt.FlowLayout;

import javax.swing.JFrame;

public class AssignmentFrame {
	private JFrame jfrm;
	AssignmentFrame(String title) {
		jfrm = new JFrame(title);
		jfrm.setLayout(new FlowLayout());
	}
	public JFrame getFrame() {
		return jfrm;
	}
}
