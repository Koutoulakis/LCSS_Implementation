package ask2_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GUIController {
	private GUIView theView;
	private GUIModel theModel;
	private int currentTime;
	private int timeT;
	private boolean tab1=true;
	private boolean tab2=false;
	private boolean tab3=false;
	private boolean register=false;
	private boolean set=false;
	private boolean get=false;
	
	public GUIController(GUIView theView, GUIModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		currentTime=0;
		this.theView.addActionListenerFile(new ActionListener_file());
                this.theView.addListSelectionListener_1_1(new addListSelectionListener_File_1_1());
                this.theView.addListSelectionListener_3_1(new addListSelectionListener_File_3_1());
                this.theView.addListSelectionListener_1_2(new addListSelectionListener_File_1_2());
                this.theView.addListSelectionListener_1_3(new addListSelectionListener_File_1_3());
                this.theView.addListSelectionListener_3_3(new addListSelectionListener_File_3_3());
	}
	
	class ActionListener_file implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                //Handle open button action.
                
                final JFileChooser fc = new JFileChooser();
                //In response to a button click:
                int returnVal = fc.showOpenDialog((JButton)e.getSource());

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    //This is where a real application would open the file.
                    System.out.append("Opening: " + file.getName() + "." + "\n");
                } else {
                    System.out.append("Open command cancelled by user." + "\n");
                }

                return;
            }
        }
	
        
        class addListSelectionListener_File_1_1 implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent evt) {
			theView.valueChanged_1_1();
		}
	}
	
        class addListSelectionListener_File_3_1 implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent evt) {
			theView.valueChanged_3_1();
		}
	}
        
        class addListSelectionListener_File_1_2 implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent evt) {
			theView.valueChanged_1_2();
		}
	}
        
        class addListSelectionListener_File_1_3 implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent evt) {
			theView.valueChanged_1_3();
		}
	}
	
        class addListSelectionListener_File_3_3 implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent evt) {
			theView.valueChanged_3_3();
		}
	}
        
}

