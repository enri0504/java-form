import javax.swing.*;
import java.awt.event.*;
 
 public class Formu extends JFrame implements ActionListener {
    private JLabel label1,label2,label3;
    private JButton boton1,boton2,boton3;
    private JTextField textfield1, textfields2,textfield3;

    public Formu(){
        setLayout(null);
        label1=new JLabel("Nombre:");
        label1.setBounds(10,10,100,30);
        add(label1);
        label2=new JLabel("edad:");
        label2.setBounds(10,50,100,30);
        add(label2);
        label3=new JLabel("Estado civil:");
        label3.setBounds(10,90,100,30);
        add(label3);

        textfield1= new JTextField();
        textfield1.setBounds(120,17,250,20);
        add(textfield1);

        textfields2= new JTextField();
        textfields2.setBounds(120,50,250,20);
        add(textfields2);

        textfield3= new JTextField();
        textfield3.setBounds(120,90,250,20);
        add(textfield3);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(50,300,100,30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Editar");
        boton2.setBounds(150,300,100,30);
        add(boton2);
        boton2.addActionListener(this);
        
        boton3= new JButton("Cerrar");
        boton3.setBounds(250,300,100,30);
        add(boton3);
        boton3.addActionListener(this);
    }
        
     public void actionPerformed(ActionEvent a) {
            if (a.getSource() == boton1){
                String texto= textfield1.getText();
                setTitle(texto);
            }
            if(a.getSource() == boton3){
                System.exit(0);
            }
     }

    
    public static void main(String args[]){
        Formu formulario1= new Formu();
        formulario1.setBounds(0,0,400,400);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);

    }

 }