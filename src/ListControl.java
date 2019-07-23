import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListControl implements ActionListener {
	private static JList<Client> jlist;
	private static DefaultListModel<Client> listmodel;
	private static JScrollPane scrollPane;
	
	public ListControl(int width, int height) {
		listmodel = new DefaultListModel<Client>();
		jlist = new JList<Client>(listmodel);
		scrollPane = new JScrollPane(jlist);
		scrollPane.setSize( width/3, height-60 );
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void populate(ClientStore store) {
		Client[] clientarr = store.getClientStore();
		
		for (Client client : clientarr) {
			listmodel.addElement(client);
		}
		
	}
	
	public void addTo(JFrame frame, String pos) {
		frame.add(scrollPane, pos);
	}

}
