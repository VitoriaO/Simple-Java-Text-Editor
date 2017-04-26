package simplejavatexteditor;

import javax.swing.JTextArea;

public class Originator{
	private JTextArea state;
	
	public JTextArea getState(){
		return state;
	}
	
	public void setState(JTextArea stateToSave){
		this.state = stateToSave;
	}
	
	public Memento saveToMemento(){
		return new Memento(this.state);
	}
	
	public void restoreFromMemento(Memento memento){
		this.state = memento.getSavedState();
	}
	
	public class Memento{
		private JTextArea state;
		
		public Memento(JTextArea stateToSave){
			JTextArea nText = new JTextArea();
			nText.setText(stateToSave.getText());
			state = nText;
		}
		
		public JTextArea getSavedState(){
			return state;
		}
	}
}
