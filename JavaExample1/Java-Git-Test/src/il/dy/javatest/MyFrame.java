package il.dy.javatest;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyFrame extends JFrame{
	public MyFrame(){
		this.setVisible(true);
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 11, 85, 239);
		this.add(scrollPane);
		JTextArea textArea = new JTextArea();
		textArea.setText("adsgfasghdasfghdsgfhdaghfsdghdsghdsghlkbldijbl;ijkgds");
		scrollPane.setViewportView(textArea);
	}
}
