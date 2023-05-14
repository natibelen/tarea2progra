import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JFrame {
    private PanelExpendedor exp;
    public PanelPrincipal()
    {
        exp = new PanelExpendedor();
    }
    public void paint () {

        exp.paint();
    }
    public PanelExpendedor panelito(){
        return exp;
    }

}
class PanelComprador extends JFrame{
    private JButton boton1,boton2,boton3,boton4;
    private JPanel panel1,panel2,panel3,panel4;
    private JLabel label1,label2;
    private Moneda m;
    public Expendedor expende;
    public Comprador persona;

    public PanelComprador(){
        setSize(600, 800);
        setLocation(790,0);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Comprador");

        m=null;
        expende= new Expendedor(5,800,400);

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

        label2 = new JLabel("Esta es tu billetera...");
        label2.setBounds(100, 250, 600, 20);
        Font font2 = new Font("Helvica", Font.BOLD, 14);
        label2.setFont(font2);


        label1 = new JLabel("Haz click sobre una moneda para pagar tu producto...");
        label1.setBounds(100, 270, 600, 20);
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
        add(label2);

        if(m==null) {
            boton1.addActionListener(i -> {
                m = new Moneda100();
                persona = new Comprador(m, PanelExpendedor.getCual(), expende);
                System.out.println(persona.queSacaste()+", "+persona.cuantoVuelto());
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/100.jpg");
                Image imagenbot21 = imagenboton21.getImage();
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                JLabel img = new JLabel(new ImageIcon(nuevoboton21));
                img.setBounds(boton1.getBounds());
                add(img);

                Timer timer = new Timer(2, new ActionListener() {
                    int x = 130; // La posición x de la imagen
                    int y = 338; // La posición y de la imagen
                    int destinoX = 600; // La posición x final
                    int destinoY = 400; // La posición y final

                    public void actionPerformed(ActionEvent e) {
                        // Calcular la nueva posición de la imagen
                        if (x < destinoX) {
                            x++;
                        }
                        if (y < destinoY) {
                            y++;
                        }

                        // Mover la imagen
                        img.setLocation(x, y);

                        // Si llegamos a la posición final, detener el Timer y eliminar la imagen
                        if (x == destinoX && y == destinoY) {
                            ((Timer)e.getSource()).stop();
                            remove(img);
                            repaint();
                        }
                    }
                });

                // Iniciar el Timer
                timer.start();
                PanelExpendedor panelito=new PanelExpendedor();
                panelito.operador=1;
                panelito.cual=PanelExpendedor.getCual();
                panelito.paint();
            });

            boton2.addActionListener(i -> {
                m = new Moneda500();
                persona = new Comprador(m, PanelExpendedor.getCual(), expende);
                System.out.println(persona.queSacaste()+", "+persona.cuantoVuelto());
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/500.png");
                Image imagenbot21 = imagenboton21.getImage();
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                JLabel img = new JLabel(new ImageIcon(nuevoboton21));
                img.setBounds(boton1.getBounds());
                add(img);

                Timer timer = new Timer(2, new ActionListener() {
                    int x = 210; // La posición x de la imagen
                    int y = 338; // La posición y de la imagen
                    int destinoX = 600; // La posición x final
                    int destinoY = 400; // La posición y final

                    public void actionPerformed(ActionEvent e) {
                        // Calcular la nueva posición de la imagen
                        if (x < destinoX) {
                            x++;
                        }
                        if (y < destinoY) {
                            y++;
                        }

                        // Mover la imagen
                        img.setLocation(x, y);

                        // Si llegamos a la posición final, detener el Timer y eliminar la imagen
                        if (x == destinoX && y == destinoY) {
                            ((Timer)e.getSource()).stop();
                            remove(img);
                            repaint();
                        }
                    }
                });

                // Iniciar el Timer
                timer.start();
                PanelExpendedor panelito=new PanelExpendedor();
                panelito.operador=2;
                panelito.cual=PanelExpendedor.getCual();
                panelito.paint();

            });

            boton3.addActionListener(i -> {
                m = new Moneda1000();
                //System.out.println(m.getValor());
                persona = new Comprador(m, PanelExpendedor.getCual(), expende);
                System.out.println(persona.queSacaste()+", "+persona.cuantoVuelto());
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1000.jpg");
                Image imagenbot21 = imagenboton21.getImage();
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                JLabel img = new JLabel(new ImageIcon(nuevoboton21));
                img.setBounds(boton1.getBounds());
                add(img);

                Timer timer = new Timer(2, new ActionListener() {
                    int x = 290; // La posición x de la imagen
                    int y = 338; // La posición y de la imagen
                    int destinoX = 600; // La posición x final
                    int destinoY = 400; // La posición y final

                    public void actionPerformed(ActionEvent e) {
                        // Calcular la nueva posición de la imagen
                        if (x < destinoX) {
                            x++;
                        }
                        if (y < destinoY) {
                            y++;
                        }

                        // Mover la imagen
                        img.setLocation(x, y);

                        // Si llegamos a la posición final, detener el Timer y eliminar la imagen
                        if (x == destinoX && y == destinoY) {
                            ((Timer)e.getSource()).stop();
                            remove(img);
                            repaint();
                        }
                    }
                });

                // Iniciar el Timer
                timer.start();
                PanelExpendedor panelito=new PanelExpendedor();
                panelito.operador=3;
                panelito.cual=PanelExpendedor.getCual();
                panelito.paint();

            });

            boton4.addActionListener(i -> {
                m = new Moneda1500();
                persona = new Comprador(m, PanelExpendedor.getCual(), expende);
                System.out.println(persona.queSacaste()+", "+persona.cuantoVuelto());
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1500.jpg");
                Image imagenbot21 = imagenboton21.getImage();
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                JLabel img = new JLabel(new ImageIcon(nuevoboton21));
                img.setBounds(boton1.getBounds());
                add(img);

                Timer timer = new Timer(2, new ActionListener() {
                    int x = 370; // La posición x de la imagen
                    int y = 338; // La posición y de la imagen
                    int destinoX = 600; // La posición x final
                    int destinoY = 400; // La posición y final

                    public void actionPerformed(ActionEvent e) {
                        // Calcular la nueva posición de la imagen
                        if (x < destinoX) {
                            x++;
                        }
                        if (y < destinoY) {
                            y++;
                        }

                        // Mover la imagen
                        img.setLocation(x, y);

                        // Si llegamos a la posición final, detener el Timer y eliminar la imagen
                        if (x == destinoX && y == destinoY) {
                            ((Timer)e.getSource()).stop();
                            remove(img);
                            repaint();
                        }
                    }
                });

                // Iniciar el Timer
                timer.start();
                PanelExpendedor panelito=new PanelExpendedor();
                panelito.operador=4;
                panelito.cual=PanelExpendedor.getCual();
                panelito.paint();

            });
            //persona.getVuelto() el vuelto que hay que devolverle a persona
            //persona.queSacaste()
            //expende.getMoneda() --> hay que sacarle a la moneda q devuelve getmoneda el valor y iterar hasta que el valor sea igual al vuelto
        }


        setVisible(true);
    }

    public Moneda BotonMoneda(){
        return m;
    }
}
class PanelExpendedor extends JFrame {
    private JPanel panel1, panel2, panel3, panel4, panel5;
    private Botonredondo boton1, boton2, boton3, boton4, boton5;
    private JLabel apretar1, apretar2, apretar3;
    public static int cual=0;
    public int operador=0;
    public PanelComprador panelcomprador;
    public PanelExpendedor() {
        setSize(800, 800);
        setLocation(0, 0);
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

        ImageIcon imagenicon2 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/maquina-expendedora.png");
        Image imagen2 = imagenicon2.getImage();
        Image nuevaimagen2 = imagen2.getScaledInstance(600, 650, Image.SCALE_SMOOTH);
        JLabel principal2 = new JLabel(new ImageIcon(nuevaimagen2));
        principal2.setBounds(0, 0, 600, 650);
        setContentPane(principal2);

        boton1 = new Botonredondo("1");
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


    }

    public  void paint() {
        if(operador==0) {
            panelcomprador = new PanelComprador();
        }

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
        System.out.println(cual);

        setVisible(true);

        apretar1 = new JLabel("Haz click sobre un");
        apretar1.setBounds(650, 250, 130, 20);
        Font font = new Font("Helvica", Font.BOLD, 14);
        apretar1.setFont(font);
        apretar2 = new JLabel("boton para elegir");
        apretar2.setBounds(650, 270, 130, 20);
        Font font2 = new Font("Helvica", Font.BOLD, 14);
        apretar2.setFont(font2);
        apretar3 = new JLabel("el producto... ");
        apretar3.setBounds(650, 290, 130, 20);
        Font font3 = new Font("Helvica", Font.BOLD, 14);
        apretar3.setFont(font3);
        add(apretar1);
        add(apretar2);
        add(apretar3);

        if(operador==0){
            apretar1.setVisible(true);
            apretar2.setVisible(true);
            apretar3.setVisible(true);
        }
        else{
            apretar1.setVisible(false);
            apretar2.setVisible(false);
            apretar3.setVisible(false);
        }

        if (operador==0) {
            boton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    apretar1.setVisible(false); // Ocultar el mensaje
                    apretar2.setVisible(false);
                    apretar3.setVisible(false);
                    cual = 1;
                    System.out.println(cual);
                    panelcomprador.paint();
                }
            });

            boton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    apretar1.setVisible(false); // Ocultar el mensaje
                    apretar2.setVisible(false);
                    apretar3.setVisible(false);
                    cual = 2;
                    panelcomprador.paint();
                }
            });

            boton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    apretar1.setVisible(false); // Ocultar el mensaje
                    apretar2.setVisible(false);
                    apretar3.setVisible(false);
                    cual = 3;
                    panelcomprador.paint();
                }
            });

            boton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    apretar1.setVisible(false); // Ocultar el mensaje
                    apretar2.setVisible(false);
                    apretar3.setVisible(false);
                    cual = 4;
                    panelcomprador.paint();
                }
            });

            boton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    apretar1.setVisible(false); // Ocultar el mensaje
                    apretar2.setVisible(false);
                    apretar3.setVisible(false);
                    cual = 5;
                    panelcomprador.paint();
                }
            });
        }


        else if (operador!=0){
            if(operador==1){
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/100.jpg");
                Image imagenbot21 = imagenboton21.getImage();
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                JLabel imagen = new JLabel(new ImageIcon(nuevoboton21));
                imagen.setVisible(false);
                imagen.setBounds(70,70,70,70);
                add(imagen);

                Timer time= new Timer(8000,new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        imagen.setVisible(true);
                        Timer temporizador = new Timer(1, new ActionListener() {
                            int x = 70; // La posición x de la imagen
                            int y = 70; // La posición y de la imagen
                            int destinoX = 520; // La posición x final
                            int destinoY = 200; // La posición y final

                            public void actionPerformed(ActionEvent e) {
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }

                                // Mover la imagen
                                imagen.setLocation(x, y);
                                // Si llegamos a la posición final, detener el Timer y eliminar la imagen
                                if (x == destinoX && y == destinoY) {
                                    ((Timer) e.getSource()).stop();
                                    remove(imagen);
                                    repaint();
                                }
                            }
                        });
                         // Solo se ejecutará una vez
                        temporizador.start();
                    }
                });
                time.setRepeats(false); // Solo se ejecutará una vez
                time.start();

            }
            else if(operador==2){
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/500.png");
                Image imagenbot21 = imagenboton21.getImage();
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                JLabel imagen = new JLabel(new ImageIcon(nuevoboton21));
                imagen.setVisible(false);
                imagen.setBounds(70,70,70,70);
                add(imagen);

                Timer time= new Timer(6000,new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        imagen.setVisible(true);
                        Timer temporizador = new Timer(1, new ActionListener() {
                            int x = 70; // La posición x de la imagen
                            int y = 70; // La posición y de la imagen
                            int destinoX = 520; // La posición x final
                            int destinoY = 200; // La posición y final

                            public void actionPerformed(ActionEvent e) {
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }

                                // Mover la imagen
                                imagen.setLocation(x, y);
                                // Si llegamos a la posición final, detener el Timer y eliminar la imagen
                                if (x == destinoX && y == destinoY) {
                                    ((Timer) e.getSource()).stop();
                                    remove(imagen);
                                    repaint();
                                }
                            }
                        });
                        // Solo se ejecutará una vez
                        temporizador.start();
                    }
                });
                time.setRepeats(false); // Solo se ejecutará una vez
                time.start();

            }
            else if(operador==3){
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1000.jpg");
                Image imagenbot21 = imagenboton21.getImage();
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                JLabel imagen = new JLabel(new ImageIcon(nuevoboton21));
                imagen.setVisible(false);
                imagen.setBounds(70,70,70,70);
                add(imagen);

                Timer time= new Timer(5000,new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        imagen.setVisible(true);
                        Timer temporizador = new Timer(1, new ActionListener() {
                            int x = 70; // La posición x de la imagen
                            int y = 70; // La posición y de la imagen
                            int destinoX = 520; // La posición x final
                            int destinoY = 200; // La posición y final

                            public void actionPerformed(ActionEvent e) {
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }

                                // Mover la imagen
                                imagen.setLocation(x, y);
                                // Si llegamos a la posición final, detener el Timer y eliminar la imagen
                                if (x == destinoX && y == destinoY) {
                                    ((Timer) e.getSource()).stop();
                                    remove(imagen);
                                    repaint();
                                }
                            }
                        });
                        // Solo se ejecutará una vez
                        temporizador.start();
                    }
                });
                time.setRepeats(false); // Solo se ejecutará una vez
                time.start();


            }
            else if(operador==4){
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1500.jpg");
                Image imagenbot21 = imagenboton21.getImage();
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                JLabel imagen = new JLabel(new ImageIcon(nuevoboton21));
                imagen.setVisible(false);
                imagen.setBounds(70,70,70,70);
                add(imagen);

                Timer time= new Timer(4000,new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        imagen.setVisible(true);
                        Timer temporizador = new Timer(1, new ActionListener() {
                            int x = 70; // La posición x de la imagen
                            int y = 70; // La posición y de la imagen
                            int destinoX = 520; // La posición x final
                            int destinoY = 200; // La posición y final

                            public void actionPerformed(ActionEvent e) {
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }

                                // Mover la imagen
                                imagen.setLocation(x, y);
                                // Si llegamos a la posición final, detener el Timer y eliminar la imagen
                                if (x == destinoX && y == destinoY) {
                                    ((Timer) e.getSource()).stop();
                                    remove(imagen);
                                    repaint();
                                }
                            }
                        });
                        // Solo se ejecutará una vez
                        temporizador.start();
                    }
                });
                time.setRepeats(false); // Solo se ejecutará una vez
                time.start();

            }
        }


    }

    public static int getCual() {
        return cual;
    }

}
