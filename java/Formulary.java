import javax.swing.*;
import java.awt.event.*;

public class Formulary extends JFrame implements ActionListener{
   private JButton boton1, boton2, boton3;
   private JLabel label1;
    public Formulary(){
        setLayout(null);
        boton1=new JButton("Cerrar");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2= new JButton("Abrir");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
        boton3=new JButton("texto");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);

        label1= new JLabel("En espera... ");
        label1.setBounds(10,10,300,30);
        add(label1);
    }


    public void actionPerformed(ActionEvent accion){
        if(accion.getSource()==boton1){
            System.exit(0);
        }
        if(accion.getSource()==boton2){
            label1.setText("Has presionado el boton Abrir...");
        }
        if(accion.getSource()==boton3){
            label1.setText("Has presionado el boton Texto...");
        }
        

    }
    public static void main(String args[]){
        Formulary formulario3= new Formulary();
        formulario3.setBounds(0,0,450,250);
        formulario3.setVisible(true);
        formulario3.setResizable(false);
        formulario3.setLocationRelativeTo(null);

    }
}
