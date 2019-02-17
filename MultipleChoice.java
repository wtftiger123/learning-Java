import javax.swing.*;		// Resolve class Jframe, JCheckBox
import java.awt.*; 			// Resolve class GridLayout
import java.awt.event.*; 	// Resolve class ActionListener

public class MultipleChoice extends JFrame implements ActionListener {
	private JLabel aLabel= new JLabel("Which of the following is false?");
	private JRadioButton ChoiceA= new JRadioButton("More than one check boxes can be selected");
	private JRadioButton ChoiceB= new JRadioButton("More than one radio button can be selected");
	private JRadioButton ChoiceC= new JRadioButton("There are at most five components in Border Layout Manager");
	private ButtonGroup optionGroup= new ButtonGroup();
	private JButton submitButton= new JButton("Submint");
public MultipleChoice(){
	setLayout(new GridLayout(5,1));
	add(aLabel);
	add(ChoiceA);
	add(ChoiceB);
	add(ChoiceC);
	optionGroup.add(ChoiceA);
	optionGroup.add(ChoiceB);
	optionGroup.add(ChoiceC);
	add(submitButton);
	submitButton.addActionListener(this);
	setDefaultCloseOperation(EXIT_ON_CLOSE);  // need to comment out this line if invoked by PullDownMenu
	pack();
}
public void actionPerformed(ActionEvent event){
	Object e= event.getSource();
	if(e==submitButton){
		if (ChoiceB.isSelected()){
			submitButton.setText("Your choice is Correct!");
		}else{
			submitButton.setText("Your choice is Wrong!");
		}
	}
}
public static void main(String[] args){
	MultipleChoice tempFrame = new MultipleChoice();
    tempFrame.setVisible(true);
}
	



}