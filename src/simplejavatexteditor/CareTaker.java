package simplejavatexteditor;

import java.util.ArrayList;
import javax.swing.JTextArea;

public class CareTaker {
	private ArrayList<Originator> states;
	
	public CareTaker(){
		states = new ArrayList<Originator>();
	}
	
	public void add(Originator memento){
		states.add(memento);
	}
	
	public String getLastState(){
		if(states.size() <= 0){
			return "";
		}
		else{
			Originator newstate = states.get(states.size()-1);
			states.remove(states.size()-1);
			return newstate.getState().getText();
		}
	}
}
