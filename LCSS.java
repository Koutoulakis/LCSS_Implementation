/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ask2_ted;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author john
 */
public class LCSS {
    private double epsilon;
    private int threshold;
    private int[][] c;
    private char[][] b;
    
   /* public LCSS(int m, int n)
    {
        c = new int[m+1][n+1];//distances twn stoixeiwn twn 2 trajectories
        b = new char[m+1][n+1];
        epsilon = 0.05;
        threshold = 100;
    }*/
    
    public LCSS(int[][] c, char[][] b,double epsilon, int threashold)
    {
        this.c = c;//distances twn stoixeiwn twn 2 trajectories
        this.b = b;
        this.epsilon = epsilon;
        this.threshold = threashold;
    }
    
    public LCSS()
    {
        epsilon = 0.05;
        threshold = 100;
        c=null;
        b=null;
    }

    
    public LCSS(double eps, int thres)
    {
        this.epsilon = eps;
        this.threshold = thres;
        c=null;
        b=null;
    }
    
    public int backtrack(ArrayList<CoordinatesClass> lcssList,CoordinatesClass[] trajectory1, int m, int n)
    {
        int i,j;
        i=m;j=n;
        int sum=0;
        while(i!=0 && j!=0){
            if(b[i][j]=='1'){
                lcssList.add(trajectory1[i-1]);
                i--;
                j--;
                sum++;
            }else if(b[i][j]=='2'){
                i--;
            }else {
                j--;
            }
        }
       return sum; 
    }
    
    public void compare(CoordinatesClass[] trajectory1,int m,CoordinatesClass[] trajectory2,int n,int from,int max)
    {
        int i,j;     
                       
        for( i=1; i<m+1 ;i++){
            for( j=1; j<n+1 && from<max ;j++,from++){
                if( Math.abs(trajectory1[i-1].x - trajectory2[from].x) <= epsilon 
                        && Math.abs(trajectory1[i-1].y - trajectory2[from].y) <= epsilon 
                        && Math.abs(i-j) <= threshold){
                    c[i][j] = c[i-1][j-1] + 1;
                    b[i][j] = '1';//addxy element
                }else if( c[i-1][j] >= c[i][j-1]){//X[i-1] not in LCS
                    
                    c[i][j] = c[i-1][j];
                    b[i][j] = '2';
                }else{
                    c[i][j] = c[i][j-1];
                    b[i][j] = '3';
                }
            }
        }
        return;
    }
    
    public int min(int m, int n){
        if(m<=n){
            return m;
        }else{
            return n;
        }
    }
    /**
     * @return the epsilon
     */
    public double getEpsilon() {
        return epsilon;
    }

    /**
     * @param epsilon the epsilon to set
     */
    public void setEpsilon(double epsilon) {
        this.epsilon = epsilon;
    }

    /**
     * @return the threshold
     */
    public int getThreshold() {
        return threshold;
    }

    /**
     * @param threshold the threshold to set
     */
    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    /**
     * @return the c
     */
    public int[][] getC() {
        return c;
    }

    public void setC(int[][] c) {
        this.c = c;
    }

    public char[][] getB() {
        return b;
    }

    public void setB(char[][] b) {
        this.b = b;
    }
    
}
