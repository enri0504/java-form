import java.util.Scanner;
public class Login{
    public static void main(String args[]){
        Scanner entrada= new Scanner(System.in);
    String cadena_principal="", cadena_subtraccion="";
    int num_caracteres=0, desde=0, hasta=0;
    System.out.print("Introduce una cadena de caractes: ");
    cadena_principal=entrada.nextLine();

    num_caracteres=cadena_principal.length();

    System.out.println("La cadena de caracteres "+ cadena_principal +" posee " +
                        num_caracteres + " caracteres. ");

    System.out.print("¿desde que caracteres deseas obtener la nueva cadena? ");
    desde= entrada.nextInt();
    System.out.print("¿Hasta que caracter deseas obtener la nueva cadena de caracter? ");
    hasta= entrada.nextInt();
    cadena_subtraccion=  cadena_principal.substring(desde, hasta);
    System.out.print("la nueva cadena es: "+ cadena_subtraccion);
    }
}