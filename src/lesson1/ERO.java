package lesson1;
import java.util.Scanner;

public class ERO {
    public static double[] Multi(double[] Col0,double[] Coli){
        double mi =Coli[0]/Col0[0];
        double[] BeiC =new double[Coli.length];
        for(int i=0;i<Coli.length;i++){
            BeiC[i]=Coli[i]-Col0[i]*mi;
        }
        return BeiC;
    }

    public static double[][] STMatrix(double[][] Matrix){
        int col=Matrix.length;
        int row=Matrix[0].length;
        double[][] SMatrix =new double[col][row];
        double[][] SMatrix2 =new double[col-1][row-1];
        for(int i=0;i<col;i++){
            SMatrix[i]=Multi(Matrix[0],Matrix[i]);
            for(int j=0;j<row;j++){
                SMatrix2[i][j]=SMatrix[i+1][j+1];
            }
        }
        if(SMatrix2.length==1&&SMatrix2[0].length==2){
        return SMatrix2;
        }
        else {STMatrix(SMatrix2);}
        return null;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row =scan.nextInt();
        int col =scan.nextInt();
        double[][] Matrix =new double[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                Matrix[i][j]=scan.nextDouble();
            }
        }
        double[][] NSolution =new double[1][2];
        NSolution =STMatrix(Matrix);



    }
}
