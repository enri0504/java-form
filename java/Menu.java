import java.util.Scanner;
public class Menu{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nombre="";
        int num_1, num_2, resultado, opcion;
        System.out.println("Ingrese el Nombre del usuario");
        nombre= in.nextLine();
        System.out.println("*****************************************");
        System.out.println("* Bienvenido Ingrese Una Opcion de menu *");
        System.out.println("*****************************************");
        System.out.println("");
        System.out.println("1-SUMA");
        System.out.println("2-RESTA");    
        System.out.println("3-MULTIPLICACION");   
        System.out.println("4-DIVISION");
        System.out.println("Ingrese la Opcion de la operacion que desea realizar");
        opcion=in.nextInt();

        switch(opcion){
            case 1: System.out.println("Ingrese un numero");
                    num_1= in.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num_2=in.nextInt();
                    resultado=num_1+num_2;
                    System.out.println("El resultado de los valores ingresado es: "+ resultado);
            break;
            case 2:System.out.println("Ingrese un numero");
                    num_1= in.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num_2=in.nextInt();
                    resultado=num_1-num_2;
                    System.out.println("El resultado de los valores ingresado es: "+ resultado);
            break;
            
            case 3:System.out.println("Ingrese un numero");
                    num_1= in.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num_2=in.nextInt();
                    resultado=num_1*num_2;
                    System.out.println("El resultado de los valores ingresado es: "+ resultado);
            break;
            
            case 4:System.out.println("Ingrese un numero");
                    num_1= in.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num_2=in.nextInt();
                    resultado=num_1/num_2;
                    System.out.println("El resultado de los valores ingresado es: "+ resultado);
            break;
            
            default: System.out.println("Error, La opcion del menu es invalida");
            break;
        }


    }
}