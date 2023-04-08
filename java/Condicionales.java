public class Condicionales {
    public static void main(String args[]){

        int nota_mate = 5;
        int nota_bio = 5;
        int nota_qui = 7;
        int promedio = 0;

        promedio=(nota_bio+nota_mate+nota_qui)/3;

        if (promedio>=6){
            System.out.println("El alumno Aprobo"+ promedio);
            }else{
                System.out.println("El alumno Reprobo" + promedio);
            }
                    

    }
}