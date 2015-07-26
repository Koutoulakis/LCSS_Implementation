/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ask2_ted;

/**
 *
 * @author john
 */
public class Initializer {
   
    public static void InitializeMatrixBorder(int[][] c,char[][] b,int m/*grammes*/, int n/*sthles*/){
        int i;
        for(i=0;i<m+1;i++){//Grammes
            c[i][0] = 0;
            b[i][0] = '0';
        }
        for(i=0;i<n+1;i++){//Sthles
            c[0][i] = 0;
            b[0][i] = '0';
        }
    }
    public static void AllocateTrajectory(CoordinatesClass[] traject, int m){
        int i;        
        for(i=0 ; i<m; i++){
            traject[i] = new CoordinatesClass();
        }
    }
}
