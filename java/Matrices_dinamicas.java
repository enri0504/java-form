import java.util.Scanner;
public class Matrices_dinamicas{
    public static void main(String args[]){

        Scanner entrada= new Scanner(System.in);
        int filas=0, columnas=0, contador=1;
        System.out.print("Ingrese el tamaño de la matriz de filas:");
        filas=entrada.nextInt();
        System.out.print("Ingrese el tamaño de la matriz de columnas:");
        columnas=entrada.nextInt();
        int numeros[][]= new int[filas][columnas];

        for(int i=0;i<filas; i++){
            for(int j=0; j<columnas; j++){
               numeros[i][j]= contador;
               contador++;
               System.out.print("["+numeros[i][j] +"]");     
            }
            System.out.println("");
        }

    }
}