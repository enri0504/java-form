import java.util.Scanner;
public class Usuario{
    public static void main (String args[]){
        String usuario="", Password="";
        Scanner entrada= new Scanner(System.in);
        System.out.print("Ingresa el nombre del usuario: ");
        usuario=entrada.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        Password=entrada.nextLine();
        if(usuario.equals("Enrique") && Password.equals("123456")){
            System.out.println("Inicio de seccion correcto");

        }else{
            System.out.println("Nombre de usuario o contraseña es incorrecta");
        }
    }   
}