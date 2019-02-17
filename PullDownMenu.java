import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PullDownMenu extends JFrame implements ActionListener{
	private JMenu file= new JMenu("File");
	private JMenuBar bar= new JMenuBar();
	private JMenuItem exit= new JMenuItem("Exit");

	private JMenu run= new JMenu("Run");
	private JMenuItem computer= new JMenuItem("Computer Price");
	private JMenuItem multiple= new JMenuItem("Multiple Choice");

public PullDownMenu(){
	setJMenuBar(bar);
	bar.add(file);
	file.add(exit);

	bar.add(run);
	run.add(computer);
	run.add(multiple);

	exit.addActionListener(this);
	computer.addActionListener(this);
	multiple.addActionListener(this);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();

}
public void actionPerformed(ActionEvent event){
Object source = event.getSource();
	 if (source == exit) {
	System.exit(0);
	}
    if (source == computer) {
      ComputerPrice newFrame  = new ComputerPrice();
      newFrame.setVisible(true);   
    } 
    if (source== multiple){
    MultipleChoice newFrame = new MultipleChoice();   
      newFrame.setVisible(true);  
    }
}


  public static void main(String[] args) {    
    // create a frame 
    PullDownMenu aMenu = new PullDownMenu();   
    // set the frame visible
    aMenu.setVisible(true);    
		}
}