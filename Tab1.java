/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ask2_ted;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nik
 */
public class Tab1 {
    public static String calculate(String name1,int m, String name2,int n, int tab , double epsilon, int threshold){
        if(tab==0){//EDW ANTI GIA a 8a MPEI Sun8hkh sthn opoia pathse o xrhsths sto GUI
            //EDW BRISKEI TO LCSS meta3u 2 Subsequences (Erwthma 1 askhshs)
            int i=0,j=0;
            
            /*ANOIGW TA ARXEIA KAI GRAFW MESA se katalhlous pinakes ta dedomena tous*/
            /****ARXEIO 1****/
            FileReader fin=null;
            try {
                fin = new FileReader("datasets/datasets/"+m+"Points/"+name1); //datasets/datasets/1000Points/
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Tab1.class.getName()).log(Level.SEVERE, null, ex);
                return "Problem while opening file";
            }
            Scanner src = new Scanner(fin);

            /*KANW allocate to matrix trajectory1*/
            CoordinatesClass[] trajectory1 = new CoordinatesClass[m];
            Initializer ini = new Initializer();
            ini.AllocateTrajectory(trajectory1, m);           

            src.useDelimiter("\\s*,\\s*|\\n");            

            // Read 
            //System.out.println("Longitude   Latitude");
            while (src.hasNextLine()) {
                src.next(); //taxi driver id
                src.next(); // date            
                trajectory1[i].x = Double.parseDouble(src.next());
                trajectory1[i].y = Double.parseDouble(src.next());                
                src.nextLine();
                i++;
            }
            
            try {
                fin.close();
            } catch (IOException ex) {
                Logger.getLogger(Tab1.class.getName()).log(Level.SEVERE, null, ex);
            }
            src.close();
            //reader.close();
            /****ARXEIO 2****/            
            FileReader fin2=null;
            try {
                fin2 = new FileReader("datasets/datasets/"+n+"Points/"+name1);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Tab1.class.getName()).log(Level.SEVERE, null, ex);
            }
            Scanner src2 = new Scanner(fin2);

            /*KANW allocate to matrix trajectory2*/
            CoordinatesClass[] trajectory2 = new CoordinatesClass[n];
            ini.AllocateTrajectory(trajectory2, n);            
            src2.useDelimiter("\\s*,\\s*|\\n");

            // Read 
            i=0;
            while (src2.hasNextLine()) {

                src2.next(); //taxi driver id
                src2.next(); // date            
                trajectory2[i].x = Double.parseDouble(src2.next());
                trajectory2[i].y = Double.parseDouble(src2.next());                
                src2.nextLine();
                i++;

            }
            try {
                fin2.close();
            } catch (IOException ex) {
                Logger.getLogger(Tab1.class.getName()).log(Level.SEVERE, null, ex);
            }
            src2.close();
            
            
            LCSS lcss = new LCSS(epsilon,threshold);
            

            int[][] c = new int[m+1][n+1];//distances twn stoixeiwn twn 2 trajectories
            char[][] b = new char[m+1][n+1];//backtracking information gia to lcs
            ini.InitializeMatrixBorder(c, b, m, n);
            lcss.setC(c);
            lcss.setB(b);
            lcss.compare(trajectory1, m, trajectory2,n,0,n);            
            /*Ftiaxnoume lista me ta shmeia tou LCSS*/
            ArrayList<CoordinatesClass> lcssList = new ArrayList<CoordinatesClass>();
            
            int sum;//posa stoixeia sunolika twn troxiwn einai koina 
            sum = lcss.backtrack(lcssList, trajectory1, m, n);
            int min;
            int similarity_percentage;/*Pososto omoiothtas meta3u trajectory1 kai trajectoey2*/
            
            min = lcss.min(m, n);           
            
            similarity_percentage = (int)((sum * 100.0f)/min);
            System.out.println("similarity_percentage="+similarity_percentage+"%");
            return("similarity_percentage="+similarity_percentage+"%");
        }
        else if (tab==1 ){//Edw anti gia a ,8a mpei to action pou exei ginei sto GUI
            /*KAI KALA Gia na ektelestei o kwdikas gia to 3o erwthma ts askhshs*/            
            int i=0,j=0;
    //        Scanner reader = new Scanner(System.in);
            /*DIABAZW TO ARXEIO APO TO OPOIO 8A PARW TO TRAJECTORY,KAI TO MEGE8OS TOU*/
            /***********ARXEIO 1************************************************/
            //System.out.println("Enter the trajectory1 filename:");
            //get user input for tr1
            //String name1=reader.nextLine();
            //System.out.println("Enter the trajectory1 size");
            //get user input for tr1
            //int m=reader.nextInt();

            /***********ARXEIO 2************************************************/
            //Scanner reader2 = new Scanner(System.in);
            //System.out.println("Enter the trajectory2 filename:");
            //String name2=reader2.nextLine();
            //System.out.println("Enter the trajectory2 size");
            //int n=reader2.nextInt();
            
            /*ANOIGW TA ARXEIA KAI GRAFW MESA se katallhlous pinakes ta dedomena tous*/
            /****ARXEIO 1****/
            FileReader fin=null;
            try {
                fin = new FileReader("datasets/datasets/"+m+"Points/"+name1); //datasets/datasets/1000Points/
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Tab1.class.getName()).log(Level.SEVERE, null, ex);
            }
            Scanner src = new Scanner(fin);

            /*KANW allocate to matrix trajectory1*/
            CoordinatesClass[] trajectory1 = new CoordinatesClass[m];
            Initializer ini = new Initializer();
            ini.AllocateTrajectory(trajectory1, m);           

            src.useDelimiter("\\s*,\\s*|\\n");            

            // Read 
            //System.out.println("Longitude   Latitude");
            while (src.hasNextLine()) {
                src.next(); //taxi driver id
                src.next(); // date            
                trajectory1[i].x = Double.parseDouble(src.next());
                trajectory1[i].y = Double.parseDouble(src.next());                
                src.nextLine();
                i++;
            }
            
            try {
                fin.close();
            } catch (IOException ex) {
                Logger.getLogger(Tab1.class.getName()).log(Level.SEVERE, null, ex);
            }
            src.close();
            //reader.close();
            /****ARXEIO 2****/            
            FileReader fin2=null;
            try {
                fin2 = new FileReader("datasets/datasets/"+n+"Points/"+name1);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Tab1.class.getName()).log(Level.SEVERE, null, ex);
            }
            Scanner src2 = new Scanner(fin2);

            /*KANW allocate to matrix trajectory2*/
            CoordinatesClass[] trajectory2 = new CoordinatesClass[n];
            ini.AllocateTrajectory(trajectory2, n);            
            src2.useDelimiter("\\s*,\\s*|\\n");

            // Read 
            i=0;
            while (src2.hasNextLine()) {

                src2.next(); //taxi driver id
                src2.next(); // date            
                trajectory2[i].x = Double.parseDouble(src2.next());
                trajectory2[i].y = Double.parseDouble(src2.next());                
                src2.nextLine();
                i++;

            }
            try {
                fin2.close();
            } catch (IOException ex) {
                Logger.getLogger(Tab1.class.getName()).log(Level.SEVERE, null, ex);
            }
            src2.close();
            //reader2.close();
            
            /*            -
            Kanoume ton algori8mo pou leei edw gia lcss:
            http://www.cs.umd.edu/~meesh/351/mount/lectures/lect25-longest-common-subseq.pdf            
            */
            
            //double epsilon = 0.05;
            //int threshold = 100;
            
            LCSS lcss = new LCSS(epsilon,threshold);
            
            ArrayList<CoordinatesClass> result_subsequence = new ArrayList<CoordinatesClass>();
            // to n einai to megalo arxeio

            int[][] c = new int[m+1][m+threshold+1];//distances twn stoixeiwn twn 2 trajectories
            char[][] b = new char[m+1][m+threshold+1];//backtracking information gia to lcs
            int max_percent=0;//to max pososto omoiothtas.
            
            
            ini.InitializeMatrixBorder(c, b, m, m+threshold+1);            
            lcss.setC(c);
            lcss.setB(b);
            int subsequence_size = m+threshold;
            int cmpfrom=0;
            int cmpto=subsequence_size;
            
            
            while(cmpto < n){                
               
                lcss.compare(trajectory1, m, trajectory2,subsequence_size,cmpfrom,cmpto);
                //compare(troxia1,mege8os ths,troxia2,"mege8os ths h mege8os upotroxias",
                //cmpfrom= apo pou diabazoume mesa stn troxia,cmpto=mexri pou,gia thn
                //upotroxia mas)
                /*Ftiaxnoume lista me ta shmeia tou LCSS*/
                ArrayList<CoordinatesClass> lcssList = new ArrayList<CoordinatesClass>();

                int sum=0;//posa stoixeia sunolika twn troxiwn einai koina 
                sum = lcss.backtrack(lcssList, trajectory1, m, n);
                int min;
                int similarity_percentage;/*Pososto omoiothtas meta3u trajectory1 kai trajectoey2*/

                min = lcss.min(m, n);

                similarity_percentage = (int)((sum * 100.0f)/min);
                
                if(similarity_percentage > max_percent){
                    //EDW Kanw overwrite thn result_subsequence me to portion tou trajectory
                    //p einai to max
                    max_percent = similarity_percentage;
                    result_subsequence.clear();
                    for(int k=cmpfrom; k<cmpto; k++){
                        result_subsequence.add(trajectory2[k]);
                    }                    
                }
                lcssList.clear();
                
                cmpfrom++;//Na 3ekinaei to trajectory apo to t
                cmpto++;
                
                System.out.println("similarity_percentage="+similarity_percentage+"%");
            }
            
        }
        
        return "ma min ektipwsw kai egw kati sto gui?";
    }
    
    private static void subFunction()
    {
    }
}
