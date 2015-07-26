package ask2_gui;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;

import java.awt.List;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GUIView extends JFrame {

    private JTabbedPane tabbedPane;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    GUIModel model;

    private JButton browseFileButton;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JButton ADDPOI;
    private JTextPane textPane3;
    private JButton FINDPOI;
    private JLabel trajectoryLabel_1_1;
    private JTextField userentrytextField_1;
    private JLabel trajectoryLabel_2_1;
    private JTextField pass1entrytextField_1;
    private JLabel thresholdLabel;
    private JLabel epsylonLabel;
    private JTextField pass2entrytextField_1;
    private DefaultListModel list1_1;
    private JList listFinal1_1;
    private JScrollPane scrollFrame1_1;
    private DefaultListModel list2_1;
    private JList listFinal2_1;
    private JScrollPane scrollFrame2_1;
    private DefaultListModel list3_1;
    private JList listFinal3_1;
    private JScrollPane scrollFrame3_1;
    private DefaultListModel list4_1;
    private JList listFinal4_1;
    private JScrollPane scrollFrame4_1;

    private JLabel trajectoryLabel_1_2;
    private JTextField userentrytextField_2;
    private JLabel trajectoryLabel_2_2;
    private JTextField pass1entrytextField_2;
    private JLabel nameOfPointLabel;
    private JTextField nameOfPoint_2;
    private DefaultListModel list1_2;
    private JList listFinal1_2;
    private JScrollPane scrollFrame1_2;
    private DefaultListModel list2_2;
    private JList listFinal2_2;
    private JScrollPane scrollFrame2_2;
    private DefaultListModel list3_2;
    private JList listFinal3_2;
    private JScrollPane scrollFrame3_2;
    private DefaultListModel list4_2;
    private JList listFinal4_2;
    private JScrollPane scrollFrame4_2;
    private JTextField textFieldPOIX_2;
    private JTextField textFieldPOIY_2;

    private JLabel trajectoryLabel_1_3;
    private JTextField userentrytextField_3;
    private JLabel trajectoryLabel_2_3;
    private JTextField pass1entrytextField_3;
    private DefaultListModel list1_3;
    private JList listFinal1_3;
    private JScrollPane scrollFrame1_3;
    private DefaultListModel list2_3;
    private JList listFinal2_3;
    private JScrollPane scrollFrame2_3;
    private DefaultListModel list3_3;
    private JList listFinal3_3;
    private JScrollPane scrollFrame3_3;
    private DefaultListModel list4_3;
    private JList listFinal4_3;
    private JScrollPane scrollFrame4_3;
    private JTextField epsylonText_1,epsylonText_2,epsylonText_3;
    private JTextComponent threashold_1,threashold_2,threashold_3;
    Timer timer;
    private final static int ONE_SECOND = 1000;
    private JButton refreshButton_1;
    private JButton refreshButton_2;
    private JButton LCSSButton,LCSSButton_2,LCSSButton_3;

    public GUIView() {

        setTitle("LCSS GUI");
        setSize(800, 600);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // content pages
        createPage1();
        createPage2();
        createPage3();
        // Create a tabbed pane
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("LCSS", panel1);
        tabbedPane.addTab("Tab 2", panel2);

        tabbedPane.addTab("Tab 3", panel3);

        topPanel.add(tabbedPane, BorderLayout.CENTER);

        model = new GUIModel();
    }

    public void createPage1() {
        panel1 = new JPanel();
        panel1.setLayout(null);

        textPane1 = new JTextPane();
        textPane1.setEditable(false);
        textPane1.setBounds(10, 270, 70, 80);
        textPane1.setText("Enter the trajectory1 filename:");
        panel1.add(textPane1);

        trajectoryLabel_1_1 = new JLabel("Choose trajectory 1:");
        trajectoryLabel_1_1.setBounds(45, 25, 160, 25);
        panel1.add(trajectoryLabel_1_1);

        trajectoryLabel_2_1 = new JLabel("Choose trajectory 2:");
        trajectoryLabel_2_1.setBounds(440, 25, 160, 25);
        panel1.add(trajectoryLabel_2_1);

        ///////LISTS/////////////
        list1_1 = new DefaultListModel();
        list2_1 = new DefaultListModel();
        list3_1 = new DefaultListModel();
        list4_1 = new DefaultListModel();
        listFinal1_1 = new JList(list1_1);
        listFinal2_1 = new JList(list2_1);
        listFinal3_1 = new JList(list3_1);
        listFinal4_1 = new JList(list4_1);
        listFinal1_1.setBounds(10, 70, 160, 72);
        listFinal2_1.setBounds(180, 70, 160, 72);
        listFinal3_1.setBounds(350, 70, 160, 72);
        listFinal4_1.setBounds(520, 70, 160, 72);
        
        list1_1.addElement("10000");
        list1_1.addElement("5000");
        list1_1.addElement("1000");
        listFinal1_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFinal1_1.setSelectedIndex(0);
        scrollFrame1_1 = new JScrollPane(listFinal1_1);
        listFinal1_1.setAutoscrolls(true);
        scrollFrame1_1.setBounds(30, 70, 160, 72);

        list2_1.addElement("3579");
        list2_1.addElement("3781");
        list2_1.addElement("4798");
        list2_1.addElement("5075");
        listFinal2_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFinal2_1.setSelectedIndex(0);
        scrollFrame2_1 = new JScrollPane(listFinal2_1);
        listFinal2_1.setAutoscrolls(true);
        scrollFrame2_1.setBounds(200, 70, 160, 72);

        list3_1.addElement("10000");
        list3_1.addElement("5000");
        list3_1.addElement("1000");
        listFinal3_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFinal3_1.setSelectedIndex(0);
        scrollFrame3_1 = new JScrollPane(listFinal3_1);
        listFinal3_1.setAutoscrolls(true);
        scrollFrame3_1.setBounds(430, 70, 160, 72);

        list4_1.addElement("3579");
        list4_1.addElement("3781");
        list4_1.addElement("4798");
        list4_1.addElement("5075");
        listFinal4_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFinal4_1.setSelectedIndex(0);
        scrollFrame4_1 = new JScrollPane(listFinal4_1);
        listFinal4_1.setAutoscrolls(true);
        scrollFrame4_1.setBounds(600, 70, 160, 72);

					//addListSelectionListener_3();
        panel1.add(scrollFrame1_1);
        panel1.add(scrollFrame2_1);
        panel1.add(scrollFrame3_1);
        panel1.add(scrollFrame4_1);

	////////POI XY DOUBLES//////////
        epsylonLabel = new JLabel("Choose ε : ");
        epsylonLabel.setBounds(20, 180, 100, 25);
        panel1.add(epsylonLabel);
        
        epsylonText_1 = new JTextField();
        epsylonText_1.setText("0");
        epsylonText_1.setBounds(100, 180, 100, 25);
        panel1.add(epsylonText_1);

        thresholdLabel = new JLabel("Choose δ : ");
        thresholdLabel.setBounds(20, 220, 160, 25);
        panel1.add(thresholdLabel);

        threashold_1 = new JTextField();
        threashold_1.setText("0");
        threashold_1.setBounds(100, 220, 100, 25);
        panel1.add(threashold_1);

        LCSSButton = new JButton("LCSS");
        LCSSButton.setBounds(250, 200, 150, 24);

        panel1.add(LCSSButton);

    }

    private void createPage2() {
       panel2 = new JPanel();
        panel2.setLayout(null);

        textPane2 = new JTextPane();
        textPane2.setEditable(false);
        textPane2.setBounds(10, 270, 70, 80);
        textPane2.setText("Enter a trajectory  filename:");
        panel2.add(textPane2);
        
        trajectoryLabel_1_2 = new JLabel("<html>Choose a file and a trajectory filename to " +
                    "compare<br> with all the other trajectories in the selected file:</html>");
        trajectoryLabel_1_2.setBounds(45, 20, 400, 30);
        panel2.add(trajectoryLabel_1_2);

        ///////LISTS/////////////
        list1_2 = new DefaultListModel();
        list2_2 = new DefaultListModel();
        listFinal1_2 = new JList(list1_2);
        listFinal2_2 = new JList(list2_2);
        listFinal1_2.setBounds(10, 70, 160, 72);
        listFinal2_2.setBounds(180, 70, 160, 72);
        
        list1_2.addElement("10000");
        list1_2.addElement("5000");
        list1_2.addElement("1000");
        listFinal1_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFinal1_2.setSelectedIndex(0);
        scrollFrame1_2 = new JScrollPane(listFinal1_2);
        listFinal1_2.setAutoscrolls(true);
        scrollFrame1_2.setBounds(30, 70, 160, 72);

        list2_2.addElement("3579");
        list2_2.addElement("3781");
        list2_2.addElement("4798");
        list2_2.addElement("5075");
        listFinal2_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFinal2_2.setSelectedIndex(0);
        scrollFrame2_2 = new JScrollPane(listFinal2_2);
        listFinal2_2.setAutoscrolls(true);
        scrollFrame2_2.setBounds(200, 70, 160, 72);

        panel2.add(scrollFrame1_2);
        panel2.add(scrollFrame2_2);

	////////POI XY DOUBLES//////////
        epsylonLabel = new JLabel("Choose ε : ");
        epsylonLabel.setBounds(20, 180, 100, 25);
        panel2.add(epsylonLabel);
        
        epsylonText_2 = new JTextField();
        epsylonText_2.setText("0");
        epsylonText_2.setBounds(100, 180, 100, 25);
        panel2.add(epsylonText_2);

        thresholdLabel = new JLabel("Choose δ : ");
        thresholdLabel.setBounds(20, 220, 160, 25);
        panel2.add(thresholdLabel);

        threashold_2 = new JTextField();
        threashold_2.setText("0");
        threashold_2.setBounds(100, 220, 100, 25);
        panel2.add(threashold_2);

        LCSSButton_2 = new JButton("LCSS");
        LCSSButton_2.setBounds(250, 200, 150, 24);

        panel2.add(LCSSButton_2);

    }

    private void createPage3() {
        panel3 = new JPanel();
        panel3.setLayout(null);

        textPane3 = new JTextPane();
        textPane3.setEditable(false);
        textPane3.setBounds(10, 270, 70, 80);
        textPane3.setText("Enter the trajectory1 filename:");
        panel3.add(textPane3);

        trajectoryLabel_1_3 = new JLabel("Choose trajectory 1:");
        trajectoryLabel_1_3.setBounds(45, 25, 160, 25);
        panel3.add(trajectoryLabel_1_3);

        trajectoryLabel_2_3 = new JLabel("Choose trajectory 2:");
        trajectoryLabel_2_3.setBounds(440, 25, 160, 25);
        panel3.add(trajectoryLabel_2_3);

        ///////LISTS/////////////
        list1_3 = new DefaultListModel();
        list2_3 = new DefaultListModel();
        list3_3 = new DefaultListModel();
        list4_3 = new DefaultListModel();
        listFinal1_3 = new JList(list1_3);
        listFinal2_3 = new JList(list2_3);
        listFinal3_3 = new JList(list3_3);
        listFinal4_3 = new JList(list4_3);
        listFinal1_3.setBounds(10, 70, 160, 72);
        listFinal2_3.setBounds(180, 70, 160, 72);
        listFinal3_3.setBounds(350, 70, 160, 72);
        listFinal4_3.setBounds(520, 70, 160, 72);
        
        list1_3.addElement("10000");
        list1_3.addElement("5000");
        //list1_3.addElement("1000");
        listFinal1_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFinal1_3.setSelectedIndex(0);
        scrollFrame1_3 = new JScrollPane(listFinal1_3);
        listFinal1_3.setAutoscrolls(true);
        scrollFrame1_3.setBounds(30, 70, 160, 72);

        list2_3.addElement("3579");
        list2_3.addElement("3781");
        list2_3.addElement("4798");
        list2_3.addElement("5075");
        listFinal2_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFinal2_3.setSelectedIndex(0);
        scrollFrame2_3 = new JScrollPane(listFinal2_3);
        listFinal2_3.setAutoscrolls(true);
        scrollFrame2_3.setBounds(200, 70, 160, 72);

        //list3_3.addElement("10000");
        list3_3.addElement("5000");
        list3_3.addElement("1000");
        listFinal3_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFinal3_3.setSelectedIndex(0);
        scrollFrame3_3 = new JScrollPane(listFinal3_3);
        listFinal3_3.setAutoscrolls(true);
        scrollFrame3_3.setBounds(430, 70, 160, 72);

        list4_3.addElement("3579");
        list4_3.addElement("3781");
        list4_3.addElement("4798");
        list4_3.addElement("5075");
        listFinal4_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFinal4_3.setSelectedIndex(0);
        scrollFrame4_3 = new JScrollPane(listFinal4_3);
        listFinal4_3.setAutoscrolls(true);
        scrollFrame4_3.setBounds(600, 70, 160, 72);

					//addListSelectionListener_3();
        panel3.add(scrollFrame1_3);
        panel3.add(scrollFrame2_3);
        panel3.add(scrollFrame3_3);
        panel3.add(scrollFrame4_3);

	////////POI XY DOUBLES//////////
        epsylonLabel = new JLabel("Choose ε : ");
        epsylonLabel.setBounds(20, 180, 100, 25);
        panel3.add(epsylonLabel);
        
        epsylonText_3 = new JTextField();
        epsylonText_3.setText("0");
        epsylonText_3.setBounds(100, 180, 100, 25);
        panel3.add(epsylonText_3);

        thresholdLabel = new JLabel("Choose δ : ");
        thresholdLabel.setBounds(20, 220, 160, 25);
        panel3.add(thresholdLabel);

        threashold_3 = new JTextField();
        threashold_3.setText("0");
        threashold_3.setBounds(100, 220, 100, 25);
        panel3.add(threashold_3);
        
        browseFileButton= new JButton("File");
        browseFileButton.setBounds(250, 240, 150, 24);

        LCSSButton_3 = new JButton("LCSS");
        LCSSButton_3.setBounds(250, 200, 150, 24);

        panel3.add(LCSSButton_3);
        panel3.add(browseFileButton);

    }

    public void valueChanged_1_1() {
        list2_1.clear();
        if (listFinal1_1.isSelectedIndex(0)) {
            list2_1.addElement("3579");
            list2_1.addElement("3781");
            list2_1.addElement("4798");
            list2_1.addElement("5075");
            listFinal2_1.setSelectedIndex(0);
        }

        else if (listFinal1_1.isSelectedIndex(1)) {
            list2_1.addElement("3579");
            list2_1.addElement("6275");
            list2_1.addElement("7146");
            list2_1.addElement("9109");
            listFinal2_1.setSelectedIndex(0);
        }

        else if (listFinal1_1.isSelectedIndex(2)) {
            list2_1.addElement("366");
            list2_1.addElement("3557");
            list2_1.addElement("5099");
            list2_1.addElement("6665");
            listFinal2_1.setSelectedIndex(0);
        }
    }

    public void valueChanged_3_1() {
        list4_1.clear();
        if (listFinal3_1.isSelectedIndex(0)) {
            list4_1.addElement("3579");
            list4_1.addElement("3781");
            list4_1.addElement("4798");
            list4_1.addElement("5075");
            listFinal4_1.setSelectedIndex(0);
        }

        else if (listFinal3_1.isSelectedIndex(1)) {
            list4_1.addElement("3579");
            list4_1.addElement("6275");
            list4_1.addElement("7146");
            list4_1.addElement("9109");
            listFinal4_1.setSelectedIndex(0);
        }

        else if (listFinal3_1.isSelectedIndex(2)) {
            list4_1.addElement("366");
            list4_1.addElement("3557");
            list4_1.addElement("5099");
            list4_1.addElement("6665");
            listFinal4_1.setSelectedIndex(0);
        }
    }
    
    public void addListSelectionListener_1_1(ListSelectionListener listen) {
        listFinal1_1.addListSelectionListener(listen);
    }

    public void addListSelectionListener_3_1(ListSelectionListener listen) {
        listFinal3_1.addListSelectionListener(listen);
    }

    
    public void valueChanged_1_2() {
        list2_2.clear();
        if (listFinal1_2.isSelectedIndex(0)) {
            list2_2.addElement("3579");
            list2_2.addElement("3781");
            list2_2.addElement("4798");
            list2_2.addElement("5075");
            listFinal2_2.setSelectedIndex(0);
        }

        else if (listFinal1_2.isSelectedIndex(1)) {
            list2_2.addElement("3579");
            list2_2.addElement("6275");
            list2_2.addElement("7146");
            list2_2.addElement("9109");
            listFinal2_2.setSelectedIndex(0);
        }

        else if (listFinal1_2.isSelectedIndex(2)) {
            list2_2.addElement("366");
            list2_2.addElement("3557");
            list2_2.addElement("5099");
            list2_2.addElement("6665");
            listFinal2_2.setSelectedIndex(0);
        }
    }

    public void addListSelectionListener_1_2(ListSelectionListener listen) {
        listFinal1_2.addListSelectionListener(listen);
    }

    public void valueChanged_1_3() {
        list2_3.clear();
        if (listFinal1_3.isSelectedIndex(0)) {
            list3_3.clear();
            list3_3.addElement("5000");
            list3_3.addElement("1000");
            listFinal3_3.setSelectedIndex(0);
            list2_3.addElement("3579");
            list2_3.addElement("3781");
            list2_3.addElement("4798");
            list2_3.addElement("5075");
            listFinal2_3.setSelectedIndex(0);
        }

        else if (listFinal1_3.isSelectedIndex(1)) {
            list3_3.clear();
            list3_3.addElement("1000");
            listFinal3_3.setSelectedIndex(0);
            list2_3.addElement("3579");
            list2_3.addElement("6275");
            list2_3.addElement("7146");
            list2_3.addElement("9109");
            listFinal2_3.setSelectedIndex(0);
        }

        /*else if (listFinal1_3.isSelectedIndex(2)) {
            list2_3.addElement("366");
            list2_3.addElement("3557");
            list2_3.addElement("5099");
            list2_3.addElement("6665");
            listFinal2_3.setSelectedIndex(0);
        }*/
    }

    public void valueChanged_3_3() {
        list4_3.clear();
        /*if (listFinal3_3.isSelectedIndex(0)) {
            list4_3.addElement("3579");
            list4_3.addElement("3781");
            list4_3.addElement("4798");
            list4_3.addElement("5075");
            listFinal4_3.setSelectedIndex(0);
        }

        else */if (String.valueOf(listFinal3_3.getSelectedValue()).equals("5000")) {
            list4_3.addElement("3579");
            list4_3.addElement("6275");
            list4_3.addElement("7146");
            list4_3.addElement("9109");
            listFinal4_3.setSelectedIndex(0);
        }

        else if (String.valueOf(listFinal3_3.getSelectedValue()).equals("1000")) {
            list4_3.addElement("366");
            list4_3.addElement("3557");
            list4_3.addElement("5099");
            list4_3.addElement("6665");
            listFinal4_3.setSelectedIndex(0);
        }
    }
    
    public void addListSelectionListener_1_3(ListSelectionListener listen) {
        listFinal1_3.addListSelectionListener(listen);
    }

    public void addListSelectionListener_3_3(ListSelectionListener listen) {
        listFinal3_3.addListSelectionListener(listen);
    }
    
    
    public void addActionListenerFile(ActionListener listen) {
        browseFileButton.addActionListener(listen);
    }

    public void addActionListenerTab(ChangeListener listen) {
        tabbedPane.addChangeListener(listen);
    }

    public boolean isPanel2Visible() {
        return panel2.isVisible();
    }

    public boolean isPanel3Visible() {
        return panel3.isVisible();
    }

    public String getUsername_1() {
        return this.userentrytextField_1.getText();
    }

    public String getPassword_1() {
        return this.pass1entrytextField_1.getText();
    }

    public String getRePassword_1() {
        return this.pass2entrytextField_1.getText();
    }

    public void setTextPane1(String result) {
        textPane1.setText(result);
    }

}
