import javax.swing.*;
public class Formulario1 extends JFrame{
    public Formulario1(){
        setLayout(null);

    }
    public static void main(String args[]){
        Formulario1 formulario_personales= new Formulario1();
        formulario_personales.setBounds(0,0,800,500);
        formulario_personales.setVisible(true);
        formulario_personales.setLocationRelativeTo(null);
        formulario_personales.setResizable(false);
    }
} 