public class Calcular{
    public static void main(String args[]){

        int num_1=10;
        int num_2=5;
        int resultado=0;
        int Operacion_realizar=3;

        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");

        if(Operacion_realizar==1){
            resultado=num_1+num_2;
            System.out.println("El resultado de la suma es: "+ resultado);
        } else if(Operacion_realizar==2){
            resultado=num_1-num_2;
            System.out.println("El resultado de la resta es: "+ resultado);
         }else if(Operacion_realizar==3){
            resultado=num_1*num_2;
            System.out.println("El resultado de la multiplicacion es: "+ resultado);
          }else if(Operacion_realizar==4){
            resultado= num_1/num_2;
            System.out.println("El resultado de la division es: "+ resultado);
            }else{
                System.out.println("La opcion ingresada no es valida");
            }
        
    }
}