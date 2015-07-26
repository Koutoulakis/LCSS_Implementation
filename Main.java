/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ask2_ted;

import ask2_gui.TheGUI;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author john
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        /*
        edw diabazoume 2 txts pou pairnoume apo to args eite apo kapoio scanner
        ta bazoume se 2 pinakes(trajectory1,trajectory2)
        mege8ous oso ta arxeia, me tupo CoordinatesClass
        */
        //TheGUI gui = new TheGUI();
        Tab1.calculate("366.txt", 1000, "3557.txt", 1000, 0, 1, 990);
    }
}