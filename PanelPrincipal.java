import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JFrame {
    private PanelExpendedor exp;
    private PanelComprador com;
    public PanelPrincipal() {
        exp = new PanelExpendedor();
        com = new PanelComprador();
    }
    public void paint () {
        com.paint();
        exp.paint();
    }}
class PanelComprador extends JFrame{
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    private JLabel label1;

    public PanelComprador(){
        setSize(600, 800);
        setLocation(790,0);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Comprador");

        panel1 = new JPanel();
        panel1.setBounds(130, 338, 70, 70);
        panel1.setOpaque(false);

        panel2 = new JPanel();
        panel2.setBounds(210, 338, 70, 70);
        panel2.setOpaque(false);

        panel3 = new JPanel();
        panel3.setBounds(290, 338, 70, 70);
        panel3.setOpaque(false);

        panel4 = new JPanel();
        panel4.setBounds(370, 338, 70, 70);
        panel4.setOpaque(false);

        label1 = new JLabel("Haz click sobre una moneda para pagar tu producto...");
        label1.setBounds(100, 250, 600, 50);
        Font font = new Font("Helvica", Font.BOLD, 14);
        label1.setFont(font);

    }

    public void paint() {
        ImageIcon imagenicon = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/barra.png");
        Image imagen1 = imagenicon.getImage();
        Image nuevaimagen = imagen1.getScaledInstance(370, 70, Image.SCALE_SMOOTH);
        JLabel principal1 = new JLabel(new ImageIcon(nuevaimagen));
        principal1.setBounds(0, 300, 370, 70);
        setContentPane(principal1);

        ImageIcon imagenboton1 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/100.jpg");
        Image imagenbot1 = imagenboton1.getImage();
        Image nuevoboton1 = imagenbot1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon boton1escalado= new ImageIcon(nuevoboton1);

        ImageIcon imagenboton2 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/500.png");
        Image imagenbot2 = imagenboton2.getImage();
        Image nuevoboton2 = imagenbot2.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon boton1escalado2= new ImageIcon(nuevoboton2);

        ImageIcon imagenboton3 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1000.jpg");
        Image imagenbot3 = imagenboton3.getImage();
        Image nuevoboton3 = imagenbot3.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon boton1escalado3= new ImageIcon(nuevoboton3);

        ImageIcon imagenboton4 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1500.jpg");
        Image imagenbot4 = imagenboton4.getImage();
        Image nuevoboton4 = imagenbot4.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon boton1escalado4= new ImageIcon(nuevoboton4);

        boton1= new JButton();
        boton1.setIcon(boton1escalado);
        boton1.setPreferredSize(new Dimension(70, 70));
        panel1.add(boton1);

        boton2= new JButton();
        boton2.setIcon(boton1escalado2);
        boton2.setPreferredSize(new Dimension(70, 70));
        panel2.add(boton2);

        boton3= new JButton();
        boton3.setIcon(boton1escalado3);
        boton3.setPreferredSize(new Dimension(70, 70));
        panel3.add(boton3);

        boton4= new JButton();
        boton4.setIcon(boton1escalado4);
        boton4.setPreferredSize(new Dimension(70, 70));
        panel4.add(boton4);

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(label1);
        setVisible(true);
    }
}
class PanelExpendedor extends JFrame {
    private JPanel panel1;
    private JPanel panel2;

    private JPanel panel3;
    private JPanel panel4;

    private JPanel panel5;
    private Botonredondo boton1;
    private Botonredondo boton2;
    private Botonredondo boton3;
    private Botonredondo boton4;
    private Botonredondo boton5;

    public PanelExpendedor(){
        setSize(800, 800);
        setLocation(0,0);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Expendedor");

        panel1 = new JPanel();
        panel1.setBounds(490, 285, 30, 35);
        panel1.setOpaque(false); //panel opaco

        panel2 = new JPanel();
        panel2.setBounds(528, 285, 30, 35);
        panel2.setOpaque(false);

        panel3 = new JPanel();
        panel3.setBounds(566, 285, 30, 35);
        panel3.setOpaque(false);

        panel4 = new JPanel();
        panel4.setBounds(490, 328, 30, 35);
        panel4.setOpaque(false);

        panel5 = new JPanel();
        panel5.setBounds(528, 328, 30, 35);
        panel5.setOpaque(false);


    }

    public void paint() {
        ImageIcon imagenicon2 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/maquina-expendedora.png");
        Image imagen2 = imagenicon2.getImage();
        Image nuevaimagen2 = imagen2.getScaledInstance(600, 650, Image.SCALE_SMOOTH);
        JLabel principal2 = new JLabel(new ImageIcon(nuevaimagen2));
        principal2.setBounds(0, 0, 600, 650);
        setContentPane(principal2);

        boton1= new Botonredondo("1");
        boton1.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        boton1.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel1.add(boton1);

        boton2 = new Botonredondo("2");
        boton2.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        boton2.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel2.add(boton2);

        boton3 = new Botonredondo("3");
        boton3.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        boton3.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel3.add(boton3);

        boton4 = new Botonredondo("4");
        boton4.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        boton4.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel4.add(boton4);

        boton5 = new Botonredondo("5");
        boton5.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        boton5.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel5.add(boton5);

        ImageIcon imagenicon3 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/Imagen1.jpg");
        Image imagen3 = imagenicon3.getImage();
        Image nuevaimagen3 = imagen3.getScaledInstance(30, 70, Image.SCALE_SMOOTH);
        JLabel coca = new JLabel(new ImageIcon(nuevaimagen3));
        coca.setBounds(215, 115, 30, 70);
        add(coca);

        ImageIcon imagenicon4 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/sprite.png");
        Image imagen4 = imagenicon4.getImage();
        Image nuevaimagen4 = imagen4.getScaledInstance(25, 65, Image.SCALE_SMOOTH);
        JLabel sprite = new JLabel(new ImageIcon(nuevaimagen4));
        sprite.setBounds(300, 115, 25, 65);
        add(sprite);

        ImageIcon imagenicon5 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/snicke2.png");
        Image imagen5 = imagenicon5.getImage();
        Image nuevaimagen5 = imagen5.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        JLabel snickers = new JLabel(new ImageIcon(nuevaimagen5));
        snickers.setBounds(380, 120, 50, 50);
        add(snickers);

        ImageIcon imagenicon6 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/super8.png");
        Image imagen6 = imagenicon6.getImage();
        Image nuevaimagen6 = imagen6.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        JLabel super8 = new JLabel(new ImageIcon(nuevaimagen6));
        super8.setBounds(205, 260, 60, 60);
        add(super8);

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);

        setVisible(true);

    }

}
