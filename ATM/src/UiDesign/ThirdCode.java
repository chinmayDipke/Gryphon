package UiDesign;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class PanelMake extends Frame{
	Label l;
	PanelMake(){
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				
				System.exit(0);
				
			}
		});
		
		l = new Label("This is the Window Closing Example");
		this.add(l);
		
		setTitle("Window Closing");
		setSize(300,300);
		setVisible(true);
	}
}

public class ThirdCode {

	public static void main(String[] args) {
		new PanelMake();

	}

}
