import java.util.Scanner;
public class Vectores_dinamicos{
    public static void main(String args[]){
        int longitud=0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuantos numeros desea ingresar?");
        longitud= entrada.nextInt();

        int numero[]=new int[longitud];
        
        for(int i=0; i<numero.length; i++){

            System.out.print(" Por favor dame el valor numero " + ( i+1) );
            numero[i]=entrada.nextInt();
        }
        for(int i=0; i< numero.length; i++){
            System.out.println("["+ numero[i]+"]");
        }
    
    }
}