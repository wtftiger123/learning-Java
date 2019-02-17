import javax.swing.*;		// Resolve class Jframe, JCheckBox
import java.awt.*; 			// Resolve class GridLayout
import java.awt.event.*; 	// Resolve class ActionListener

public class ComputerPrice extends JFrame implements ActionListener {
private JCheckBox cboxL = new JCheckBox("Laptop:$12000.00");
private JCheckBox cboxS	= new JCheckBox("Speaker:$700.00");
private JCheckBox cboxB = new JCheckBox("Bluetooth keyboard:$300.00");
private JButton checkButton = new JButton("Check price");

public ComputerPrice(){
	super("ComputerPrice");
	setLayout(new GridLayout(4,1));
	add(cboxL);
	add(cboxS);
	add(cboxB);
	add(checkButton);
	checkButton.addActionListener(this);
	setDefaultCloseOperation(EXIT_ON_CLOSE);  // need to comment out this line if invoked by PullDownMenu
	pack();
}
public void actionPerformed(ActionEvent event) {
double checkPrice=0;
String output="";
if (event.getSource() == checkButton){
	if (cboxL.isSelected()){
        checkPrice+=Double.parseDouble(cboxL.getText().substring(cboxL.getText().indexOf("$")+1));
        output=output.concat(cboxL.getText()+"\n");
    }
    if (cboxS.isSelected()){
        checkPrice+=Double.parseDouble(cboxS.getText().substring(cboxS.getText().indexOf("$")+1));
        output=output.concat(cboxS.getText()+"\n");
    }
    if (cboxB.isSelected()){
        checkPrice+=Double.parseDouble(cboxB.getText().substring(cboxB.getText().indexOf("$")+1));
        output=output.concat(cboxB.getText()+"\n");
    }
}
	checkButton.setText("Total price is:"+ checkPrice);
	
	
	output= output.concat("-----------------------------------------\nTotal: ");
	JOptionPane.showMessageDialog(null,output+" "+checkPrice);
}
public static void main(String[] args) {
   ComputerPrice tempFrame = new ComputerPrice();
    tempFrame.setVisible(true);

}
}