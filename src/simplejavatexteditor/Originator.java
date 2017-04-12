package simplejavatexteditor;

import javax.swing.JTextArea;

public class Originator{
	private JTextArea state;
	
	public Originator(JTextArea text){
		state = text;
	}
	
	public JTextArea getState(){
		return state;
	}
}
