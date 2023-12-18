/*
 *
/*
 * MMedia ponderada de una matriz 5x2, dónde se guarda valor y peso
 */


package on.croncero.mediavector;

/**
 *
 * @author croncero
 */


public class MediaVector {

    public static double mediaPonderada(int t[][],int filas)
    {
      int sumaVal =0; //almaceno las sumas de valor * pond
      int sumaPon = 0; //almaceno las sumas de las ponderaciones
      
      for (int i=0;i<filas;i++)
          {
          sumaVal+=t[i][0]* t[i][1];//Multiplico valor por su peso y llevo la suma
          sumaPon+=t[i][1];//En la columna 1 tenemos los Pesos
          }//for de j
      return (sumaVal/sumaPon);
    }
    
    public static void main(String[] args) {
          System.out.println("Hago las medias de un vector");
        int v[][]=new int [3][2];
        v[0][0]=5;
        v[0][1]=2;
        v[1][0]=7;
        v[1][1]=3;
        v[2][0]=8;
        v[2][1]=1;
        System.out.println("La media aritmética es = " + mediaPonderada(v,3)); 
    }
}




