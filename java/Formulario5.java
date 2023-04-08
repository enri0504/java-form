import javax.swing.*;

public class Formulario5 extends JFrame{

    private JTextField  textfield1;
    private JScrollPane scrolpane1;
    private JTextArea textarea1;
    public Formulario5(){
    
        setLayout(null);
        textfield1= new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);

        textarea1=new JTextArea();
        scrolpane1= new JScrollPane(textarea1);
        scrolpane1.setBounds(10,50,400,300);
        add(scrolpane1);


    }

    public static void main(String args []){
        Formulario5 formu= new Formulario5();
        formu.setBounds(0,0,540,400);
        formu.setVisible(true);
        formu.setResizable(false);
        formu.setLocationRelativeTo(null); 

    }
} 