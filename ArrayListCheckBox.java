import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class ArrayListCheckBox extends JFrame implements ActionListener{
	private ArrayList<JCheckBox> checkList=new ArrayList<>();
	private JLabel label= new JLabel("Computer Price");
	private JButton checkButton= new JButton ("Check Price");
	
	public ArrayListCheckBox(){
		super("ComputerPrice");
		
		checkList.add(new JCheckBox("Laptop:$ 12000"));
	  	checkList.add(new JCheckBox("Speaker:$700"));
	  	checkList.add(new JCheckBox("Bluetooth keyboard:$ 300"));
	
	  	setLayout(new GridLayout(4, 1));
	    add(label); 
	    
	     for(JCheckBox checkbox: checkList){
	    	add(checkbox);
	    	add(checkButton);
	    	checkButton.addActionListener(this);
	    	setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	pack();
		}
	}
	
	public void actionPerformed(ActionEvent event) {
		double total=0;
		String msg="";
		if(event.getSource()==checkButton){
			for(JCheckBox checkbox:checkList){
				if(checkbox.isSelected()){
					total+= 
					Double.parseDouble(checkbox.getText().substring(checkbox.getText().indexOf("$")+1));
					msg+=checkbox.getText()+"\n";
				}
				}
				checkButton.setText("Total price is "+total);
				msg+="-----------------------------------\n";
				JOptionPane.showMessageDialog(this,msg+" Total: "+total);
				
				pack();
			}
		}
 public static void main(String[] args) {
    ComputerPrice tempFrame = new ComputerPrice();
    tempFrame.setVisible(true);
  }
}

  