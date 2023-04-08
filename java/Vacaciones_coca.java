import java.util.Scanner;
public class Vacaciones_coca{
 public static void main(String arg[]){
    Scanner in = new Scanner(System.in);
    String nombre_trabajador="";
    int antiguedad_laboral=0, clave=0;
    System.out.println("**************************************");
    System.out.println("* Bienvenido a la Compania Coca-Cola *");
    System.out.println("**************************************");
    System.out.println("");
    System.out.println("");
    System.out.println("Ingrese el nombre del trabajador");
    nombre_trabajador= in.nextLine();
    System.out.println("Ingrese la antiguedad laboral en nuestra empresa");
    antiguedad_laboral=in.nextInt();
    System.out.println("Ingrese el departameto a que pertenece:");
    System.out.println("1-Administracion");
    System.out.println("2- Logistica");
    System.out.println("3-Gerencia");
    clave=  in.nextInt();
            //Clave=1 Tiempo vacacional de deparatamento de administracion
    if(clave==1){
         if(antiguedad_laboral==1){

        System.out.println(nombre_trabajador+" "+ clave + " Antiguedad laboral es: "+ antiguedad_laboral);
        System.out.println("Merece 6 dias de vacaciones");
        }else if( antiguedad_laboral>2 && antiguedad_laboral<=6){
        
          System.out.println(nombre_trabajador+" "+ clave+" Antiguedad laboral es: "+ antiguedad_laboral);
          System.out.println("Merece 14 dias de vacaciones");
         }else if(antiguedad_laboral>=7){
            System.out.println(nombre_trabajador+" "+ clave+" Antiguedad laboral es: "+ antiguedad_laboral);
            System.out.println("Merece 20 dias de vacaciones ");
         }
    }
    //Clave=2 Tiempo vacacional de deparatamento de logistica
    else if(clave==2){
        if(antiguedad_laboral==1){

        System.out.println(nombre_trabajador+" "+ clave + " Antiguedad laboral es: "+ antiguedad_laboral);
        System.out.println("Merece 7 dias de vacaciones");
        }else if( antiguedad_laboral>2 && antiguedad_laboral<=6){
        
          System.out.println(nombre_trabajador+" "+ clave+" Antiguedad laboral es: "+ antiguedad_laboral);
          System.out.println("Merece 15 dias de vacaciones");
         }else if(antiguedad_laboral>=7){
            System.out.println(nombre_trabajador+" "+ clave+" Antiguedad laboral es: "+ antiguedad_laboral);
            System.out.println("Merece 22 dias de vacaciones ");
         }
    }
    //Clave=3 Tiempo vacacional de deparatamento de gerencia
     else if(clave==3){
         if(antiguedad_laboral==1){

        System.out.println(nombre_trabajador+" "+ clave + " Antiguedad laboral es: "+ antiguedad_laboral);
        System.out.println("Merece 10 dias de vacaciones");
        }else if( antiguedad_laboral>2 && antiguedad_laboral<=6){
        
          System.out.println(nombre_trabajador+" "+ clave+" Antiguedad laboral es: "+ antiguedad_laboral);
          System.out.println("Merece 20 dias de vacaciones");
         }else if(antiguedad_laboral>=7){
            System.out.println(nombre_trabajador+" "+ clave+" Antiguedad laboral es: "+ antiguedad_laboral);
            System.out.println("Merece 30 dias de vacaciones ");
         }
     }else{
        System.out.println("Error de departamento");
     }

 }

}