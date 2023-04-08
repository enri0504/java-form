import javax.swing.*;
public class Formulario2  extends JFrame{
    private JLabel Datos_personales;
    private JLabel nombres;
    public Formulario2(){
        setLayout(null);
        Datos_personales= new JLabel("Interfaz grafica. ");
        Datos_personales.setBounds(10,20,300,30);
        add(Datos_personales);
        nombres=new JLabel("Version 1.0 ");
        nombres.setBounds(10,100,100,30);
        add(nombres);
    } 
    public static void main(String args[]){
        Formulario2 formulario1=new Formulario2();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}