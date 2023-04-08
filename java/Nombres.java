import java.util.Scanner;
public class Nombres{
    public static void main(String args[]){
        
        int edad=0;
        String nombre="", nombre_1="";
        Scanner entrada =new Scanner(System.in);
        System.out.print("Por favor ingrese el primer nombre: ");
        nombre=entrada.nextLine();  
        System.out.print("Por favor ingresa el segundo nombre: ");
        nombre_1= entrada.nextLine();
        if(nombre.equalsIgnoreCase(nombre_1) ){
            System.out.println("Los nombres son iguales");
        }else{
            System.out.println("Los nombres son diferentes");
        }
    }
}