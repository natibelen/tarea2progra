import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 Panel Principal que será creado en Aplicación.
 Extiende JFrame que significa que será un marco para una ventana (que en este caso es nuestro PanelExpendedor)
 */
public class PanelPrincipal extends JFrame {
    /**
     Crea un puntero a la clase PanelExpendedor.
     */
    private PanelExpendedor exp;
    /**
     Constructor de PanelPrincipal. Crea una nueva instancia de PanelExpendedor.
     */
    public PanelPrincipal()
    {
        exp = new PanelExpendedor();
    }
    /**
     Método paint para poder pintar JFrame.
     */
    public void paint () {
        exp.paint();
    }
}
/**
 * Clase PanelComprador que define la interfaz gráfica para que un comprador pueda interactuar
 * con el expendedor y realizar compras usando diferentes botones y paneles.
 */
class PanelComprador extends JFrame{
    /**
     Crea 4 botones privados.
     */
    private JButton boton1,boton2,boton3,boton4;

    /**
     Crea 4 paneles privados.
     */
    private JPanel panel1,panel2,panel3,panel4;
    /**
     *
     Crea 6 etiquetas de texto.
     */
    private JLabel label1,label2,label3,label4,label5,label6;
    /**
     Crea un puntero a Moneda.
     */
    private Moneda m;
    /**
     Crea un puntero a Expendedor.
     */
    public Expendedor expende;
    /**
     * Crea un puntero a Comprador.
     */
    public Comprador persona;
    /**
     * Constructor que se encarga de iniciar los atributos de la clase y configurar la ventana de la interfaz de usuario.
     */
    public PanelComprador(){
        /**
         * Establece el tamaño de la ventana.
         */
        setSize(600, 800);
        /**
         * Establece la posición de la ventana.
         */
        setLocation(790,0);
        /**
         * Establece que la ventana no se puede redimensionar.
         */
        setResizable(false);
        /**
         * Establece que componentes en la ventana serán colocados manualmente.
         */
        setLayout(null);

        /**
         * Establece que se debe cerrar la aplicación cuando se cierre la ventana.
         */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * Título de la ventana.
         */
        setTitle("Comprador");

/**
 * Nuestra Moneda m es null.
 */
        m=null;
        /**
         * Le va valores a nuestra máquina expendedora.
         */
        expende= new Expendedor(100,800,400);

        /**
         * Crea panel1.
         */
        panel1 = new JPanel();
        /**
         * Establece posición y tamaño del panel1.
         */
        panel1.setBounds(130, 338, 70, 70);
        /**
         * Establece que no hay opacidad.
         */
        panel1.setOpaque(false);

        /**
         * Crea panel2.
         */
        panel2 = new JPanel();
        /**
         * Establece posición y tamaño del panel2.
         */
        panel2.setBounds(210, 338, 70, 70);
        /**
         * Establece que no hay opacidad.
         */
        panel2.setOpaque(false);

        /**
         * Crea panel3.
         */
        panel3 = new JPanel();
        /**
         * Establece posición y tamaño del panel3.
         */
        panel3.setBounds(290, 338, 70, 70);
        /**
         * Establece que no hay opacidad.
         */
        panel3.setOpaque(false);

        /**
         * Crea panel4.
         */
        panel4 = new JPanel();
        /**
         * Establece posición y tamaño del panel4.
         */
        panel4.setBounds(370, 338, 70, 70);
        /**
         * Establece que no hay opacidad.
         */
        panel4.setOpaque(false);

/**
 * Le da texto a nuestra 2da etiqueta.
 */
        label2 = new JLabel("Esta es tu billetera...");
        /**
         * Establece posición y tamaño de la etiqueta.
         */
        label2.setBounds(100, 420, 600, 20);
        /**
         * Establece el tipo de letra y su tamaño.
         */
        Font font2 = new Font("Helvica", Font.BOLD, 14);
        /**
         * Establece la fuente en negrita y con el tamaño 14.
         */
        label2.setFont(font2);

        /**
         * Le da texto a nuestra 1ra etiqueta.
         */
        label1 = new JLabel("Haz click sobre una moneda para pagar tu producto...");
        /**
         * Establece posición y tamaño de la etiqueta.
         */
        label1.setBounds(100, 440, 600, 20);
        /**
         * Establece el tipo de letra y su tamaño.
         */
        Font font = new Font("Helvica", Font.BOLD, 14);
        /**
         * Establece la fuente en negrita y con el tamaño 14.
         */
        label1.setFont(font);

        /**
         * Le da texto a nuestra 3ra etiqueta.
         */
        label3 = new JLabel("Si quieres sacar un producto nuevamente puedes esperar");
        /**
         * Establece posición y tamaño de la etiqueta.
         */
        label3.setBounds(100, 470, 600, 20);
        /**
         * Establece el tipo de letra y su tamaño.
         */
        Font font3 = new Font("Helvica", Font.BOLD, 14);
        /**
         * Establece la fuente en negrita y con el tamaño 14.
         */
        label3.setFont(font3);

        /**
         * Le da texto a nuestra 4ta etiqueta.
         */
        label4 = new JLabel("a que aparezca por segunda vez el mensaje en el expendedor...");
        /**
         * Establece posición y tamaño de la etiqueta.
         */
        label4.setBounds(100, 490, 600, 20);
        /**
         * Establece el tipo de letra y su tamaño.
         */
        Font font4 = new Font("Helvica", Font.BOLD, 14);
        /**
         * Establece la fuente en negrita y con el tamaño 14.
         */
        label4.setFont(font4);

        /**
         * Le da texto a nuestra 5ta etiqueta.
         */
        label5 = new JLabel("Si ya no quieres sacar productos tan solo");
        /**
         * Establece posición y tamaño de la etiqueta.
         */
        label5.setBounds(100, 520, 600, 20);
        /**
         * Establece el tipo de letra y su tamaño.
         */
        Font font5 = new Font("Helvica", Font.BOLD, 14);
        /**
         * Establece la fuente en negrita y con el tamaño 14.
         */
        label5.setFont(font5);

        /**
         * Le da texto a nuestra 6ta etiqueta.
         */
        label6 = new JLabel("cierra alguna de las ventanas...");
        /**
         * Establece posición y tamaño de la etiqueta.
         */
        label6.setBounds(100, 540, 600, 20);
        /**
         * Establece el tipo de letra y su tamaño.
         */
        Font font6 = new Font("Helvica", Font.BOLD, 14);
        /**
         * Establece la fuente en negrita y con el tamaño 14.
         */
        label6.setFont(font6);
    }

    /**
     Método paint.
     Se encarga de crear una interfaz gráfica que muestra cuatro botones con imágenes de monedas de diferentes
     denominaciones y un label para mostrar el saldo actual de un comprador en una máquina expendedora.
     */
    public void paint() {
        /**
         Crea un objeto con la imagen dada.
         */
        ImageIcon imagenicon = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/barra.png");
        /**
         Almacena la imagen.
         */
        Image imagen1 = imagenicon.getImage();
/**
 Establece el tamaño y el suavizado de la imagen.
 */
        Image nuevaimagen = imagen1.getScaledInstance(370, 70, Image.SCALE_SMOOTH);
        /**
         Crea un JLabel con una imagen dada.
         */
        JLabel principal1 = new JLabel(new ImageIcon(nuevaimagen));
        /**
         Establece el tamaño y posición de la imagen.
         */
        principal1.setBounds(0, 300, 370, 70);
        /**
         Hace que el objeto principal1, que contiene una imagen, sea el componente principal que se muestra en la ventana.
         */
        setContentPane(principal1);

        /**
         Crea una imagen con la imagen dada.
         */
        ImageIcon imagenboton1 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/100.jpg");
        /**
         Almacena la imagen.
         */
        Image imagenbot1 = imagenboton1.getImage();
        /**
         Establece el tamaño y el suavizado de la imagen.
         */
        Image nuevoboton1 = imagenbot1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        /**
         Crea un objeto con la imagen dada.
         */
        ImageIcon boton1escalado= new ImageIcon(nuevoboton1);

        /**
         Crea un objeto con la imagen dada.
         */
        ImageIcon imagenboton2 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/500.png");
        /**
         Almacena la imagen.
         */
        Image imagenbot2 = imagenboton2.getImage();
        /**
         Establece el tamaño y el suavizado de la imagen.
         */
        Image nuevoboton2 = imagenbot2.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        /**
         Crea un objeto con la imagen dada.
         */
        ImageIcon boton1escalado2= new ImageIcon(nuevoboton2);


        /**
         Crea una imagen con la imagen dada.
         */
        ImageIcon imagenboton3 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1000.jpg");
        /**
         Establece el tamaño y el suavizado de la imagen.
         */
        Image imagenbot3 = imagenboton3.getImage();
        /**
         Establece el tamaño y el suavizado de la imagen.
         */
        Image nuevoboton3 = imagenbot3.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        /**
         Crea una imagen con la imagen dada.
         */
        ImageIcon boton1escalado3= new ImageIcon(nuevoboton3);

        /**
         Crea una imagen con la imagen dada.
         */
        ImageIcon imagenboton4 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1500.jpg");
        /**
         Establece el tamaño y el suavizado de la imagen.
         */
        Image imagenbot4 = imagenboton4.getImage();
        /**
         Establece el tamaño y el suavizado de la imagen.
         */
        Image nuevoboton4 = imagenbot4.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        /**
         Crea una imagen con la imagen dada.
         */
        ImageIcon boton1escalado4= new ImageIcon(nuevoboton4);

        /**
         * Crea un boton1.
         */
        boton1= new JButton();
        /**
         * Le da imagen al boton1.
         */
        boton1.setIcon(boton1escalado);
        /**
         * Establece las dimensiones del boton1.
         */
        boton1.setPreferredSize(new Dimension(70, 70));
        /**
         * Añade el boton1 al panel1.
         */
        panel1.add(boton1);

        /**
         * Crea un boton2.
         */
        boton2= new JButton();
        /**
         * Le da imagen al boton2.
         */
        boton2.setIcon(boton1escalado2);
        /**
         * Establece las dimensiones del boton2.
         */
        boton2.setPreferredSize(new Dimension(70, 70));
        /**
         * Añade el boton2 al panel2.
         */
        panel2.add(boton2);

        /**
         * Crea un boton3.
         */
        boton3= new JButton();
        /**
         * Le da imagen al boton3.
         */
        boton3.setIcon(boton1escalado3);
        /**
         * Establece las dimensiones del boton3.
         */
        boton3.setPreferredSize(new Dimension(70, 70));
        /**
         * Añade el boton3 al panel3.
         */
        panel3.add(boton3);

        /**
         * Crea un boton4.
         */
        boton4= new JButton();
        /**
         * Le da imagen al boton4.
         */
        boton4.setIcon(boton1escalado4);
        /**
         * Establece las dimensiones del boton4.
         */
        boton4.setPreferredSize(new Dimension(70, 70));
        /**
         * Añade el boton4 al panel4.
         */
        panel4.add(boton4);

        /**
         * Añade el panel a la ventana.
         */
        add(panel1);
        /**
         * Añade el panel a la ventana.
         */
        add(panel2);
        /**
         * Añade el panel a la ventana.
         */
        add(panel3);
        /**
         * Añade el panel a la ventana.
         */
        add(panel4);
        /**
         * Añade la etiqueta a la ventana.
         */
        add(label1);
        /**
         * Añade la etiqueta a la ventana.
         */
        add(label2);
        /**
         * Añade la etiqueta a la ventana.
         */
        add(label3);
        /**
         * Añade la etiqueta a la ventana.
         */
        add(label4);
        /**
         * Añade la etiqueta a la ventana.
         */
        add(label5);
        /**
         * Añade la etiqueta a la ventana.
         */
        add(label6);

        /**
         * Establece los parámetros para cuando la moneda es null.
         */
        if(m==null) {
            /**
             Establece que el código será ejecutado cuando el botón es presionado.
             */
            boton1.addActionListener(i -> {
                /**
                 * Crea moneda de 100.
                 */
                m = new Moneda100();
                /**
                 * Crea una nueva persona y sus instancias.
                 */
                persona = new Comprador(m, PanelExpendedor.getCual(), expende);
                /**
                 * Imprime el producto que eligió la persona y su vuelto.
                 */
                System.out.println(persona.queSacaste()+", "+persona.cuantoVuelto());
                /**
                 * Crea una imagen con la imagen dada.
                 */
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/100.jpg");
                /**
                 * Almacena la imagen.
                 */
                Image imagenbot21 = imagenboton21.getImage();
                /**
                 * Establece las dimensiones y suavizado de la imagen.
                 */
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                /**
                 * Establece un nuevo JLabel con una imagen de tipo ícono.
                 */
                JLabel img = new JLabel(new ImageIcon(nuevoboton21));
                /**
                 *Establece la posición y el tamaño de "img" para que sean iguales a la posición y el tamaño de "boton1".
                 */
                img.setBounds(boton1.getBounds());
                /**
                 * Añade la imagen.
                 */
                add(img);

                /**
                 * Timer que se ejecuta casa dos segundos con respecto a la imagen.
                 */
                Timer timer = new Timer(2, new ActionListener() {
                    /**
                     * Posición x de la imagen.
                     */
                    int x = 130;
                    /**
                     * Posición y de la imagen.
                     */
                    int y = 338;
                    /**
                     * Posición x final.
                     */
                    int destinoX = 0;
                    /**
                     * Posición y final.
                     */
                    int destinoY = 220;

                    /**
                     * Método de respuesta de eventos
                     * @param e Evento a ser procesado.
                     */
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Calcula la nueva posición de la imágen con respecto a x.
                         */
                        if (x < destinoX) {
                            x++;
                        }
                        else{
                            x--;
                        }
                        /**
                         * Calcula la nueva posición de la imágen con respecto a y.
                         */
                        if (y < destinoY) {
                            y++;
                        }
                        else{
                            y--;
                        }

                        /**
                         * Mueve la imagen.
                         */
                        img.setLocation(x, y);

                        /**
                         * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                         */
                        if (x == destinoX && y == destinoY) {
                            /**
                             * Detiene el timer.
                             */
                            ((Timer)e.getSource()).stop();
                            /**
                             * Remueve la imagen.
                             */
                            remove(img);
                            /**
                             * Solicita que se vuelva a pintar la imagen.
                             */
                            repaint();
                        }
                    }
                });

                /**
                 * Inicia el Timer.
                 */
                timer.start();
                /**
                 * Crea un nuevo PanelExpendedor.
                 */
                PanelExpendedor panelito=new PanelExpendedor();
                /**
                 * Le da valor 1 al operador.
                 */
                panelito.operador=1;
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor dependiendo cual producto eligió.
                 */
                panelito.cual=PanelExpendedor.getCual();
                /**
                 * Le da valor a panelito con respecto a la persona dependiendo cuanto vuelto tiene.
                 */
                panelito.vuelto=persona.cuantoVuelto();
                /**
                 * Le da valor a panelito con respecto a la persona dependiendo cual producto sacó.
                 */
                panelito.quesacaste=persona.queSacaste();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor dependiendo cual producto eligió.
                 */
                panelito.producto=PanelExpendedor.getCual();
                /**
                 * Le da valor a panelito con respecto a su moneda dependiendo cual moneda eligió.
                 */
                panelito.moneda=m.getValor();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor dependiendo cual moneda eligió.
                 */
                panelito.expendedor=expende;
                /**
                 * Le da valor a panelito con respecto a la persona dependiendo cual moneda eligió.
                 */
                panelito.persona=persona;
                /**
                 * Le otorga el método paint.
                 */
                panelito.paint();
                /**
                 * Crea un Timer.
                 */
                Timer timer1 = new Timer(12000, new ActionListener() {
                    /**
                     * Hace override.
                     * @param e evento a ser procesado.
                     */
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Lo vuelve no visible.
                         */
                        setVisible(false);
                    }
                });
                /**
                 * Establece que el timer no se repetirá
                 */
                timer1.setRepeats(false);
                /**
                 * Comienza el Timer.
                 */
                timer1.start();


            });

            /**
             Establece que el código será ejecutado cuando el botón es presionado.
             */
            boton2.addActionListener(i -> {
                /**
                 * Crea moneda de 500.
                 */
                m = new Moneda500();
                /**
                 * Crea una nueva persona y sus instancias.
                 */
                persona = new Comprador(m, PanelExpendedor.getCual(), expende);
                /**
                 * Imprime el producto que eligió la persona y su vuelto.
                 */
                System.out.println(persona.queSacaste()+", "+persona.cuantoVuelto());
                /**
                 * Crea una imagen con la imagen dada.
                 */
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/500.png");
                /**
                 * Almacena la imagen.
                 */
                Image imagenbot21 = imagenboton21.getImage();
                /**
                 * Establece las dimensiones y suavizado de la imagen.
                 */
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                /**
                 * Establece un nuevo JLabel con una imagen de tipo ícono.
                 */
                JLabel img = new JLabel(new ImageIcon(nuevoboton21));
                /**
                 *Establece la posición y el tamaño de "img" para que sean iguales a la posición y el tamaño de "boton1".
                 */
                img.setBounds(boton1.getBounds());
                /**
                 * Añade la imágen.
                 */
                add(img);

                /**
                 * Timer que se ejecuta casa dos segundos con respecto a la imagen.
                 */
                Timer timer = new Timer(2, new ActionListener() {
                    /**
                     * Posición x de la imagen.
                     */
                    int x = 210;
                    /**
                     * Posición y de la imagen.
                     */
                    int y = 338;
                    /**
                     * Posición x final.
                     */
                    int destinoX = 0;
                    /**
                     * Posición y final.
                     */
                    int destinoY = 220;

                    /**
                     * Método de respuesta de eventos
                     * @param e Evento a ser procesado.
                     */
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Calcula la nueva posición de la imágen con respecto a x.
                         */
                        if (x < destinoX) {
                            x++;
                        }
                        else{
                            x--;
                        }
                        /**
                         * Calcula la nueva posición de la imágen con respecto a y.
                         */
                        if (y < destinoY) {
                            y++;
                        }
                        else{
                            y--;
                        }

/**
 * Mueve la imágen.
 */
                        img.setLocation(x, y);

                        /**
                         * Si llegamos a la posición final, detener el Timer y eliminar la imagen
                         */
                        if (x == destinoX && y == destinoY) {
                            /**
                             * Detiene el Timer.
                             */
                            ((Timer)e.getSource()).stop();
                            /**
                             * Remueve la imágen.
                             */
                            remove(img);
                            /**
                             * Solicita que se vuelva a pintar la imágen.
                             */
                            repaint();
                        }
                    }
                });

                /**
                 * Inicia el Timer.
                 */
                timer.start();
                /**
                 * Crea un nuevo PanelExpendedor.
                 */
                PanelExpendedor panelito=new PanelExpendedor();
                /**
                 * Le da valor 2 al operador.
                 */
                panelito.operador=2;
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor respecto a cual producto eligió.
                 */
                panelito.cual=PanelExpendedor.getCual();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor respecto a cuanto vuelto tiene.
                 */
                panelito.vuelto=persona.cuantoVuelto();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor respecto a cual producto sacó.
                 */
                panelito.quesacaste=persona.queSacaste();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor respecto a cual producto eligió.
                 */
                panelito.producto=PanelExpendedor.getCual();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor respecto a cual moneda eligió.
                 */
                panelito.moneda=m.getValor();
                /**
                 * Le otorga el método paint.
                 */
                panelito.paint();
                /**
                 * Crea un Timer.
                 */
                Timer timer1 = new Timer(25000, new ActionListener() {
                    /**
                     * Hace override.
                     * @param e evento a ser procesado.
                     */
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Lo vuelve no visible.
                         */
                        setVisible(false);
                    }
                });
                /**
                 * Establece que el Timer no se repetirá.
                 */
                timer1.setRepeats(false);
                /**
                 * Inicia el Timer.
                 */
                timer1.start();


            });

            /**
             Establece que el código será ejecutado cuando el botón es presionado.
             */
            boton3.addActionListener(i -> {
                /**
                 * Crea moneda de 1000.
                 */
                m = new Moneda1000();
                /**
                 * Crea una nueva persona y sus instancias.
                 */
                persona = new Comprador(m, PanelExpendedor.getCual(), expende);
                /**
                 * Imprime el producto que eligió la persona y su vuelto.
                 */
                System.out.println(persona.queSacaste()+", "+persona.cuantoVuelto());
                /**
                 * Crea una imagen con la imagen dada.
                 */
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1000.jpg");
                /**
                 * Almacena la imagen.
                 */
                Image imagenbot21 = imagenboton21.getImage();
                /**
                 * Establece las dimensiones y suavizado de la imagen.
                 */
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                /**
                 * Establece un nuevo JLabel con una imagen dada.
                 */
                JLabel img = new JLabel(new ImageIcon(nuevoboton21));
                /**
                 *Establece la posición y el tamaño de "img" para que sean iguales a la posición y el tamaño de "boton1".
                 */
                img.setBounds(boton1.getBounds());
                /**
                 * Añade la imágen.
                 */
                add(img);


/**
 * Timer que se ejecuta casa dos segundos con respecto a la imagen.
 */
                Timer timer = new Timer(2, new ActionListener() {
                    /**
                     * Posición x de la imagen.
                     */
                    int x = 290;
                    /**
                     * Posición y de la imagen.
                     */
                    int y = 338;
                    /**
                     * Posición x final.
                     */
                    int destinoX = 0;
                    /**
                     * Posición y final.
                     */
                    int destinoY = 220;

                    /**
                     * Método de respuesta de eventos
                     * @param e Evento a ser procesado.
                     */
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Calcula la nueva posición de la imágen con respecto a x.
                         */
                        if (x < destinoX) {
                            x++;
                        }
                        else{
                            x--;
                        }
                        /**
                         * Calcula la nueva posición de la imágen con respecto a y.
                         */
                        if (y < destinoY) {
                            y++;
                        }
                        else{
                            y--;
                        }

                        /**
                         * Mueve la imagen.
                         */
                        img.setLocation(x, y);

                        /**
                         * Si llegamos a la posición final, detener el Timer y eliminar la imagen
                         */
                        if (x == destinoX && y == destinoY) {
                            /**
                             * Detiene el Timer.
                             */
                            ((Timer)e.getSource()).stop();
                            /**
                             * Remueve la imágen.
                             */
                            remove(img);
                            /**
                             * Solicita a repaint.
                             */
                            repaint();
                        }
                    }
                });

                /**
                 * Inicia el Timer.
                 */
                timer.start();
                /**
                 * Crea un nuevo PanelExpendedor.
                 */
                PanelExpendedor panelito=new PanelExpendedor();
                /**
                 * Le da valor 3 al operador.
                 */
                panelito.operador=3;
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor respecto a cual producto eligió.
                 */
                panelito.cual=PanelExpendedor.getCual();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor respecto a cuanto vuelto tiene.
                 */
                panelito.vuelto=persona.cuantoVuelto();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor respecto a cual producto sacó.
                 */
                panelito.quesacaste=persona.queSacaste();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor respecto a cual producto eligió.
                 */
                panelito.producto=PanelExpendedor.getCual();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor respecto a cual moneda eligió.
                 */
                panelito.moneda=m.getValor();
                /**
                 * Le otorga el método paint.
                 */
                panelito.paint();
                /**
                 * Crea un Timer.
                 */
                Timer timer1 = new Timer(25000, new ActionListener() {
                    /**
                     * Crea un override
                     * @param e evento a ser procesado.
                     */
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Establece que no será visible.
                         */
                        setVisible(false);
                    }
                });
                /**
                 * Establece que el Timer no se repetirá.
                 */
                timer1.setRepeats(false);
                /**
                 * Inicia el Timer.
                 */
                timer1.start();


            });

            /**
             Establece que el código será ejecutado cuando el botón es presionado.
             */
            boton4.addActionListener(i -> {
                /**
                 * Crea moneda de 1500.
                 */
                m = new Moneda1500();
                /**
                 * Crea una nueva persona y sus instancias.
                 */
                persona = new Comprador(m, PanelExpendedor.getCual(), expende);
                /**
                 * Imprime el producto que eligió la persona y su vuelto.
                 */
                System.out.println(persona.queSacaste()+", "+persona.cuantoVuelto());
                /**
                 * Crea una imagen con la imagen dada.
                 */
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1500.jpg");
                /**
                 * Almacena la imagen.
                 */
                Image imagenbot21 = imagenboton21.getImage();
                /**
                 * Establece las dimensiones y suavizado de la imagen.
                 */
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                /**
                 * Establece un nuevo JLabel con una imagen de tipo ícono.
                 */
                JLabel img = new JLabel(new ImageIcon(nuevoboton21));
                /**
                 *Establece la posición y el tamaño de "img" para que sean iguales a la posición y el tamaño de "boton1".
                 */
                img.setBounds(boton1.getBounds());
                /**
                 * Añade la imágen.
                 */
                add(img);

                /**
                 * Timer que se ejecuta casa dos segundos con respecto a la imagen.
                 */
                Timer timer = new Timer(2, new ActionListener() {
                    /**
                     * Posición x de la imagen.
                     */
                    int x = 370;
                    /**
                     * Posición y de la imagen.
                     */
                    int y = 338;
                    /**
                     * Posición x final.
                     */
                    int destinoX = 0;
                    /**
                     * Posición y final.
                     */
                    int destinoY = 220;

                    /**
                     * Método de respuesta de eventos
                     * @param e Evento a ser procesado.
                     */
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Calcula la nueva posición de la imágen con respecto a x.
                         */
                        if (x < destinoX) {
                            x++;
                        }
                        else{
                            x--;
                        }
                        /**
                         * Calcula la nueva posición de la imágen con respecto a y.
                         */
                        if (y < destinoY) {
                            y++;
                        }
                        else{
                            y--;
                        }

                        /**
                         * Mueve la imagen.
                         */
                        img.setLocation(x, y);

                        /**
                         * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                         */
                        if (x == destinoX && y == destinoY) {
                            /**
                             * Detiene el Timer.
                             */
                            ((Timer)e.getSource()).stop();
                            /**
                             * Remueve la imágen.
                             */
                            remove(img);
                            /**
                             * Solicita que se vuelva a pintar la imágen.
                             */
                            repaint();
                        }
                    }
                });

                /**
                 * Inicia el Timer.
                 */
                timer.start();
                /**
                 * Crea un nuevo PanelExpendedor.
                 */
                PanelExpendedor panelito=new PanelExpendedor();
                /**
                 * Le da valor 4 al operador.
                 */
                panelito.operador=4;
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor dependiendo cual producto eligió.
                 */
                panelito.cual=PanelExpendedor.getCual();
                /**
                 * Le da valor a panelito con respecto a la persona dependiendo cuanto vuelto tiene.
                 */
                panelito.vuelto=persona.cuantoVuelto();
                /**
                 * Le da valor a panelito con respecto a la persona dependiendo cual producto sacó.
                 */
                panelito.quesacaste=persona.queSacaste();
                /**
                 * Le da valor a panelito con respecto al PanelExpendedor dependiendo cual producto eligió.
                 */
                panelito.producto=PanelExpendedor.getCual();
                /**
                 * Le da valor a panelito con respecto a su moneda dependiendo cual moneda eligió.
                 */
                panelito.moneda=m.getValor();
                /**
                 * Le otorga el método paint.
                 */
                panelito.paint();
                /**
                 * Crea un Timer.
                 */
                Timer timer1 = new Timer(25000, new ActionListener() {
                    /**
                     * Crea un override
                     * @param e evento a ser procesado.
                     */
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Establece que no es visible.
                         */
                        setVisible(false);
                    }
                });
                /**
                 * Establece que el Timer no se repetirá.
                 */
                timer1.setRepeats(false);
                /**
                 * Inicia el Timer.
                 */
                timer1.start();//CAMBIO

            });
        }

/**
 * Lo vuelve visible.
 */
        setVisible(true);
    }

}
/**
 * Crea el PanelExpendedor que extiende JFrame para poder crear una ventana que interactúe con los productos
 * y con el comprador.
 */
class PanelExpendedor extends JFrame {
    /**
     * Crea 5 paneles privados.
     */
    private JPanel panel1, panel2, panel3, panel4, panel5;
    /**
     * Crea 5 botones privados.
     */
    private Botonredondo boton1, boton2, boton3, boton4, boton5;
    /**
     * Crea 6 etiquetas de textos privadas.
     */
    private JLabel apretar1, apretar2, apretar3,label1,label2,label3,label4;
    /**
     * Crea una variable estática con valor 0.
     */
    public static int cual=0;
    /**
     * Crea una variable con valor 0.
     */
    public int operador=0;
    /**
     * Crea una variable vuelto.
     */
    public int vuelto;
    /**
     * Crea una variable producto.
     */
    public int producto;
    /**
     * Crea un string para saber que producto se sacó.
     */
    public String quesacaste;
    /**
     * Crea un puntero a Comprador.
     */
    public Comprador persona;
    /**
     * Crea un puntero a Expendedor.
     */
    public Expendedor expendedor;
    /**
     * Crea una variable moneda.
     */
    public int moneda;
    /**
     * Constructor de PanelExpendedor. Permite la creación de los paneles y la ventana.
     */
    public PanelExpendedor() {
        /**
         * Establece el tamaño de la ventana.
         */
        setSize(800, 800);
        /**
         * Establece la posición de la ventana.
         */
        setLocation(0, 0);
        /**
         * Se establece que no se puede redimensionar.
         */
        setResizable(false);
        /**
         * Establece que el contenedor no tendrá ningún diseño predeterminado.
         */
        setLayout(null);
        /**
         * Establece que se terminará la aplicación cuando se cierre la ventana.
         */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * Le da el título a la ventana.
         */
        setTitle("Expendedor");

        /**
         * Crea un nuevo panel1.
         */
        panel1 = new JPanel();
        /**
         * Establece la posición y dimensiones del panel.
         */
        panel1.setBounds(490, 285, 30, 35);
        /**
         * Establece la opacidad del panel como falso.
         * Los componentes situados detrás del panel se hacen visibles a través de él.
         */
        panel1.setOpaque(false);

        /**
         * Crea un nuevo panel2.
         */
        panel2 = new JPanel();
        /**
         * Establece la posición y dimensiones del panel.
         */
        panel2.setBounds(528, 285, 30, 35);
        /**
         * Establece la opacidad del panel como falso.
         * Los componentes situados detrás del panel se hacen visibles a través de él.
         */
        panel2.setOpaque(false);

/**
 * Crea un nuevo panel3.
 */
        panel3 = new JPanel();
        /**
         * Establece la posición y dimensiones del panel.
         */
        panel3.setBounds(566, 285, 30, 35);
        /**
         * Establece la opacidad del panel como falso.
         * Los componentes situados detrás del panel se hacen visibles a través de él.
         */
        panel3.setOpaque(false);

        /**
         * Crea un nuevo panel4.
         */
        panel4 = new JPanel();
        /**
         * Establece la posición y dimensiones del panel.
         */
        panel4.setBounds(490, 328, 30, 35);
        /**
         * Establece la opacidad del panel como falso.
         * Los componentes situados detrás del panel se hacen visibles a través de él.
         */
        panel4.setOpaque(false);

        /**
         * Crea un nuevo panel5.
         */
        panel5 = new JPanel();
        /**
         * Establece la posición y dimensiones del panel.
         */
        panel5.setBounds(528, 328, 30, 35);
        /**
         * Establece la opacidad del panel como falso.
         * Los componentes situados detrás del panel se hacen visibles a través de él.
         */
        panel5.setOpaque(false);

        /**
         * Crea una nueva imagen con la imagen dada.
         */
        ImageIcon imagenicon2 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/maquina-expendedora.png");
        /**
         * Almacena la imagen.
         */
        Image imagen2 = imagenicon2.getImage();
        /**
         * Establece la posición y suavizado de la imagen.
         */
        Image nuevaimagen2 = imagen2.getScaledInstance(600, 650, Image.SCALE_SMOOTH);
        /**
         * Crea un nuevo JLavel con la imagen dada.
         */
        JLabel principal2 = new JLabel(new ImageIcon(nuevaimagen2));
        /**
         * Establece la posición y dimensiones del JLabel.
         */
        principal2.setBounds(0, 0, 600, 650);
        /**
         * Establece el JLabel.
         */
        setContentPane(principal2);

        /**
         * Crea un boton.
         */
        boton1 = new Botonredondo("1");
        /**
         * Establece el color del botón
         */
        boton1.setBackground(new Color(128, 128, 128));
        /**
         * Establece el tamaño del botón.
         */
        boton1.setPreferredSize(new Dimension(30, 30));
        /**
         * Añade el botón al panel.
         */
        panel1.add(boton1);

        /**
         * Crea un boton.
         */
        boton2 = new Botonredondo("2");
        /**
         * Establece el color del botón
         */
        boton2.setBackground(new Color(128, 128, 128));
        /**
         * Establece el tamaño del botón.
         */
        boton2.setPreferredSize(new Dimension(30, 30));
        /**
         * Añade el botón al panel.
         */
        panel2.add(boton2);

        /**
         * Crea un boton.
         */
        boton3 = new Botonredondo("3");
        /**
         * Establece el color del botón
         */
        boton3.setBackground(new Color(128, 128, 128));
        /**
         * Establece el tamaño del botón.
         */
        boton3.setPreferredSize(new Dimension(30, 30));
        /**
         * Añade el botón al panel.
         */
        panel3.add(boton3);

        /**
         * Crea un boton.
         */
        boton4 = new Botonredondo("4");
        /**
         * Establece el color del botón
         */
        boton4.setBackground(new Color(128, 128, 128));
        /**
         * Establece el tamaño del botón.
         */
        boton4.setPreferredSize(new Dimension(30, 30));
        /**
         * Añade el botón al panel.
         */
        panel4.add(boton4);

        /**
         * Crea un boton.
         */
        boton5 = new Botonredondo("5");
        /**
         * Establece el color del botón
         */
        boton5.setBackground(new Color(128, 128, 128));
        /**
         * Establece el tamaño del botón.
         */
        boton5.setPreferredSize(new Dimension(30, 30));
        /**
         * Añade el botón al panel.
         */
        panel5.add(boton5);


    }


    /**
     * Método paint.
     */
    public  void paint() {

        /**
         * Crea una imagen con la imagen dada.
         */
        ImageIcon imagenicon3 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/Imagen1.jpg");
        /**
         * Almacena la imagen.
         */
        Image imagen3 = imagenicon3.getImage();
        /**
         * Establece la posición y suavizado de la imagen.
         */
        Image nuevaimagen3 = imagen3.getScaledInstance(30, 70, Image.SCALE_SMOOTH);
        /**
         * Crea un nuevo JLavel con la imagen dada.
         */
        JLabel coca = new JLabel(new ImageIcon(nuevaimagen3));
        /**
         * Establece la posición y dimensiones del JLabel.
         */
        coca.setBounds(215, 115, 30, 70);
        /**
         * Añade el JLabel.
         */
        add(coca);

        /**
         * Crea una imagen con la imagen dada.
         */
        ImageIcon imagenicon4 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/sprite.png");
        /**
         * Almacena la imagen.
         */
        Image imagen4 = imagenicon4.getImage();
        /**
         * Establece la posición y suavizado de la imagen.
         */
        Image nuevaimagen4 = imagen4.getScaledInstance(25, 65, Image.SCALE_SMOOTH);
        /**
         * Crea un nuevo JLavel con la imagen dada.
         */
        JLabel sprite = new JLabel(new ImageIcon(nuevaimagen4));
        /**
         * Establece la posición y dimensiones del JLabel.
         */
        sprite.setBounds(300, 115, 25, 65);
        /**
         * Añade el JLabel.
         */
        add(sprite);

        /**
         * Crea una imagen con la imagen dada.
         */
        ImageIcon imagenicon5 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/snicke2.png");
        /**
         * Almacena la imagen.
         */
        Image imagen5 = imagenicon5.getImage();
        /**
         * Establece la posición y suavizado de la imagen.
         */
        Image nuevaimagen5 = imagen5.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        /**
         * Crea un nuevo JLavel con la imagen dada.
         */
        JLabel snickers = new JLabel(new ImageIcon(nuevaimagen5));
        /**
         * Establece la posición y dimensiones del JLabel.
         */
        snickers.setBounds(380, 120, 50, 50);
        /**
         * Añade el JLabel.
         */
        add(snickers);

        /**
         * Crea una imagen con la imagen dada.
         */
        ImageIcon imagenicon6 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/super8.png");
        /**
         * Almacena la imagen.
         */
        Image imagen6 = imagenicon6.getImage();
        /**
         * Establece la posición y suavizado de la imagen.
         */
        Image nuevaimagen6 = imagen6.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        /**
         * Crea un nuevo JLavel con la imagen dada.
         */
        JLabel super8 = new JLabel(new ImageIcon(nuevaimagen6));
        /**
         * Establece la posición y dimensiones del JLabel.
         */
        super8.setBounds(205, 260, 60, 60);
        /**
         * Añade el JLabel.
         */
        add(super8);

        /**
         * Añade el panel1.
         */
        add(panel1);
        /**
         * Añade el panel2.
         */
        add(panel2);
        /**
         * Añade el panel3.
         */
        add(panel3);
        /**
         * Añade el panel4.
         */
        add(panel4);
        /**
         * Añade el panel5.
         */
        add(panel5);

        /**
         * Permite que sea visible.
         */
        setVisible(true);

        /**
         * Crea un nuevo JLabel con etiqueta de texto.
         */
        apretar1 = new JLabel("Haz click sobre un");
        /**
         * Establece la posición y dimensiones del JLabel.
         */
        apretar1.setBounds(650, 250, 130, 20);
        /**
         * Establece la fuente de texto y su tamaño en negrita.
         */
        Font font = new Font("Helvica", Font.BOLD, 14);
        /**
         * Establece la fuente de texto.
         */
        apretar1.setFont(font);

        /**
         * Crea un nuevo JLabel con etiqueta de texto.
         */
        apretar2 = new JLabel("boton para elegir");
        /**
         * Establece la posición y dimensiones del JLabel.
         */
        apretar2.setBounds(650, 270, 130, 20);
        /**
         * Establece la fuente de texto y su tamaño en negrita.
         */
        Font font2 = new Font("Helvica", Font.BOLD, 14);
        /**
         * Establece la fuente de texto.
         */
        apretar2.setFont(font2);

        /**
         * Crea un nuevo JLabel con etiqueta de texto.
         */
        apretar3 = new JLabel("el producto... ");
        /**
         * Establece la posición y dimensiones del JLabel.
         */
        apretar3.setBounds(650, 290, 130, 20);
        /**
         * Establece la fuente de texto y su tamaño en negrita.
         */
        Font font3 = new Font("Helvica", Font.BOLD, 14);
        /**
         * Establece la fuente de texto.
         */
        apretar3.setFont(font3);

/**
 * Añade el JLabel al panel.
 */
        add(apretar1);
        /**
         * Añade el JLabel al panel.
         */
        add(apretar2);
        /**
         * Añade el JLabel al panel.
         */
        add(apretar3);

        /**
         * Si el operador tiene valor 0 volverá visibles los JLabel.
         */
        if(operador==0){
            apretar1.setVisible(true);
            apretar2.setVisible(true);
            apretar3.setVisible(true);
        }
        /**
         * De lo contrario, no serán visibles.
         */
        else{
            apretar1.setVisible(false);
            apretar2.setVisible(false);
            apretar3.setVisible(false);
        }

        /**
         * Si el operador tiene valor 0
         */
        if (operador==0) {
            /**
             * Crea un nuevo PanelComprador.
             */
            PanelComprador panelcomprador= new PanelComprador();
/**
 * Establece que el código será ejecutado cuando el botón es presionado..
 */
            boton1.addActionListener(new ActionListener() {
                /**
                 * Método de respuesta de eventos
                 * @param e Evento a ser procesado.
                 */
                public void actionPerformed(ActionEvent e) {
                    /**
                     * Oculta el mensaje.
                     */
                    apretar1.setVisible(false);
                    /**
                     * Oculta el mensaje.
                     */
                    apretar2.setVisible(false);
                    /**
                     * Oculta el mensaje.
                     */
                    apretar3.setVisible(false);
/**
 * Le da valor 1 a nuestra variable cual.
 */
                    cual = 1;
                    /**
                     * Si nuestro expendedor está vacío (null).
                     */
                    if(expendedor!=null){
                        /**
                         * El expendedor del panel comprador será igual al expendedor.
                         */
                        panelcomprador.expende=expendedor;
                    }
                    /**
                     * Le otorga el método paint.
                     */
                    panelcomprador.paint();

                    /**
                     * Crea un Timer.
                     */
                    Timer timer = new Timer(10000, new ActionListener() {
                        /**
                         * Hace override.
                         * @param e evento a ser procesado.
                         */
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            /**
                             * Lo vuelve no visible.
                             */
                            setVisible(false);
                        }
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    timer.setRepeats(false);
                    /**
                     * Inicia el Timer.
                     */
                    timer.start();
                }
            });
/**
 * Establece que el código será ejecutado cuando el botón es presionado..
 */
            boton2.addActionListener(new ActionListener() {
                /**
                 * Método de respuesta de eventos
                 * @param e Evento a ser procesado.
                 */
                public void actionPerformed(ActionEvent e) {
                    /**
                     * Oculta el mensaje.
                     */
                    apretar1.setVisible(false);
                    /**
                     * Oculta el mensaje.
                     */
                    apretar2.setVisible(false);
                    /**
                     * Oculta el mensaje.
                     */
                    apretar3.setVisible(false);
                    /**
                     * Le da valor 2 a nuestra variable cual.
                     */
                    cual = 2;
                    /**
                     * Si nuestro expendedor está vacío (null).
                     */
                    if(expendedor!=null){
                        /**
                         * El expendedor del panel comprador será igual al expendedor.
                         */
                        panelcomprador.expende=expendedor;
                    }
                    /**
                     * Le otorga el método paint.
                     */
                    panelcomprador.paint();
                    /**
                     * Crea un Timer.
                     */
                    Timer timer = new Timer(12000, new ActionListener() {
                        /**
                         * Hace override.
                         * @param e evento a ser procesado.
                         */
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            /**
                             * Lo vuelve no visible.
                             */
                            setVisible(false);
                        }
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    timer.setRepeats(false);
                    /**
                     * Inicia el Timer.
                     */
                    timer.start();
                }
            });


/**
 * Establece que el código será ejecutado cuando el botón es presionado.
 */
            boton3.addActionListener(new ActionListener() {
                /**
                 * Método de respuesta de eventos
                 * @param e Evento a ser procesado.
                 */
                public void actionPerformed(ActionEvent e) {
                    /**
                     * Oculta el mensaje.
                     */
                    apretar1.setVisible(false);
                    /**
                     * Oculta el mensaje.
                     */
                    apretar2.setVisible(false);
                    /**
                     * Oculta el mensaje.
                     */
                    apretar3.setVisible(false);
                    /**
                     * Le da valor 3 a nuestra variable cual.
                     */
                    cual = 3;
                    /**
                     * Si nuestro expendedor está vacío (null).
                     */
                    if(expendedor!=null){
                        /**
                         * El expendedor del panel comprador será igual al expendedor.
                         */
                        panelcomprador.expende=expendedor;
                    }
                    /**
                     * Le otorga el método paint.
                     */
                    panelcomprador.paint();
                    /**
                     * Crea un Timer.
                     */
                    Timer timer = new Timer(12000, new ActionListener() {
                        /**
                         * Hace override.
                         * @param e evento a ser procesado.
                         */
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            /**
                             * Lo vuelve no visible.
                             */
                            setVisible(false);
                        }
                    });
                    /**
                     * Establece que el Timer no será repetido.
                     */
                    timer.setRepeats(false);
                    /**
                     * Inicia el Timer.
                     */
                    timer.start();
                }
            });

            /**
             * Establece que el código será ejecutado cuando el botón es presionado.
             */
            boton4.addActionListener(new ActionListener() {
                /**
                 * Método de respuesta de eventos
                 * @param e Evento a ser procesado.
                 */
                public void actionPerformed(ActionEvent e) {
                    /**
                     * Oculta el mensaje.
                     */
                    apretar1.setVisible(false);
                    /**
                     * Oculta el mensaje.
                     */
                    apretar2.setVisible(false);
                    /**
                     * Oculta el mensaje.
                     */
                    apretar3.setVisible(false);
                    /**
                     * Le da valor 4 a nuestra variable cual.
                     */
                    cual = 4;
                    /**
                     * Si nuestro expendedor está vacío (null).
                     */
                    if(expendedor!=null){
                        /**
                         * El expendedor del panel comprador será igual al expendedor.
                         */
                        panelcomprador.expende=expendedor;
                    }
                    /**
                     * Le otorga el método paint.
                     */
                    panelcomprador.paint();
                    /**
                     * Crea un Timer.
                     */
                    Timer timer = new Timer(12000, new ActionListener() {
                        /**
                         * Hace override.
                         * @param e evento a ser procesado.
                         */
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            /**
                             * Lo vuelve no visible.
                             */
                            setVisible(false);
                        }
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    timer.setRepeats(false);
                    /**
                     * Inicia el Timer.
                     */
                    timer.start();
                }
            });

            /**
             * Establece que el código será ejecutado cuando el botón es presionado.
             */
            boton5.addActionListener(new ActionListener() {
                /**
                 * Método de respuesta de eventos
                 * @param e Evento a ser procesado.
                 */
                public void actionPerformed(ActionEvent e) {
                    /**
                     * Oculta el mensaje.
                     */
                    apretar1.setVisible(false);
                    /**
                     * Oculta el mensaje.
                     */
                    apretar2.setVisible(false);
                    /**
                     * Oculta el mensaje.
                     */
                    apretar3.setVisible(false);
                    /**
                     * Le da valor 5 a nuestra variable cual.
                     */
                    cual = 5;
                    /**
                     * Si nuestro expendedor está vacío (null).
                     */
                    if(expendedor!=null){
                        /**
                         * El expendedor del panel comprador será igual al expendedor.
                         */
                        panelcomprador.expende=expendedor;
                    }
                    /**
                     * Le otorga el método paint.
                     */
                    panelcomprador.paint();
                    /**
                     * Crea un Timer.
                     */
                    Timer timer = new Timer(12000, new ActionListener() {
                        /**
                         * Hace override.
                         * @param e evento a ser procesado.
                         */
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            /**
                             * Lo vuelve no visible.
                             */
                            setVisible(false);
                        }
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    timer.setRepeats(false);
                    /**
                     * Inicia el Timer.
                     */
                    timer.start();
                }
            });
        }

////////////////////////////////////////////////////////////////////////////////////////////////

        /**
         * Establece que pasa si el operador no tiene valor 0.
         */
        else if (operador!=0){
            /**
             * Establece que sucede si el operador tiene valor 1.
             */
            if(operador==1){
                /**
                 * Crea una nueva imagen con la imagen dada.
                 */
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/100.jpg");
                /**
                 * Almacena la imagen.
                 */
                Image imagenbot21 = imagenboton21.getImage();
                /**
                 * Establece las dimensiones y el suavizado de la imagen.
                 */
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                /**
                 * Crea un nuevo JLabel.
                 */
                JLabel imagen = new JLabel(new ImageIcon(nuevoboton21));
                /**
                 * Vuelve el JLabel no visible.
                 */
                imagen.setVisible(false);
                /**
                 * Establece la posición y dimensiones del JLabel.
                 */
                imagen.setBounds(800,220,70,70);
                /**
                 * Añade el JLabel al panel.
                 */
                add(imagen);


/**
 * Crea un Timer.
 */
                Timer time= new Timer(3000,new ActionListener(){
                    /**
                     * Método de respuesta de eventos
                     * @param e Evento a ser procesado.
                     */
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Vuelve la imagen JLabel visible.
                         */
                        imagen.setVisible(true);
                        /**
                         * Crea un nuevo Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 800;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 220;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 520;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 200;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                else{
                                    x--;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
                                else{
                                    y--;
                                }
/**
 * Establece la posición de la imagen.
 */
                                imagen.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el Timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Elimina la imagen.
                                     */
                                    remove(imagen);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    }
                });
                /**
                 * Establece que el Timer no se repetirá.
                 */
                time.setRepeats(false);
                /**
                 * Inicia el Timer.
                 */
                time.start();

            }

            /**
             * Establece que pasa si el operador tiene valor 2.
             */
            else if(operador==2){
                /**
                 * Crea una nueva imagen con la imagen dada
                 */
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/500.png");
                /**
                 * Almacena la imagen.
                 */
                Image imagenbot21 = imagenboton21.getImage();
                /**
                 * Establece las dimensiones y el suavizado de la imagen.
                 */
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                /**
                 * Crea un nuevo JLabel con la imagen dada.
                 */
                JLabel imagen = new JLabel(new ImageIcon(nuevoboton21));
                /**
                 * Establece que el JLabel no es visible.
                 */
                imagen.setVisible(false);
                /**
                 * Establece la posición y dimensiones del JLabel.
                 */
                imagen.setBounds(800,220,70,70);
                /**
                 * Añade el JLabel al panel.
                 */
                add(imagen);

                /**
                 * Crea un Timer.
                 */
                Timer time= new Timer(4000,new ActionListener(){
                    /**
                     * Método de respuesta de eventos
                     * @param e Evento a ser procesado.
                     */
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Vuelve visible la imagen JLabel.
                         */
                        imagen.setVisible(true);
                        /**
                         * Crea un Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 800;
                            /**
                             * Posición Y de la imagen.
                             */
                            int y = 220;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 520;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 200;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                else{
                                    x--;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
                                else{
                                    y--;
                                }
/**
 * Establece la posición de la imagen.
 */
                                imagen.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el timer
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(imagen);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    }
                });
                /**
                 * Establece que el Timer no se repetirá.
                 */
                time.setRepeats(false);
                /**
                 * Comienza el Timer.
                 */
                time.start();

            }

            /**
             * Establece que pasa si el operador tiene valor 3.
             */
            else if(operador==3){
                /**
                 * Crea una nueva imagen con la imagen dada.
                 */
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1000.jpg");
                /**
                 * Almacena la imagen.
                 */
                Image imagenbot21 = imagenboton21.getImage();
                /**
                 * Establece las dimensiones y el suavizado de la imagen.
                 */
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                /**
                 * Crea un nuevo JLabel con la imagen dada.
                 */
                JLabel imagen = new JLabel(new ImageIcon(nuevoboton21));
                /**
                 * Establece que el JLabel no es visible.
                 */
                imagen.setVisible(false);
                /**
                 * Establece la posición y dimensiones del JLabel.
                 */
                imagen.setBounds(800,220,70,70);
                /**
                 * Añade el JLabel al panl.
                 */
                add(imagen);

                /**
                 * Crea un Timer.
                 */
                Timer time= new Timer(5000,new ActionListener(){
                    /**
                     * Método de respuesta de eventos
                     * @param e Evento a ser procesado.
                     */
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Vuelve visible la imagen JLabel.
                         */
                        imagen.setVisible(true);
                        /**
                         * Crea un nuevo Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 800;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 220;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 520;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 200;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                else{
                                    x--;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
                                else{
                                    y--;
                                }
/**
 * Establece las posición de la imagen.
 */
                                imagen.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(imagen);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Inicia el Timer.
                         */
                        temporizador.start();
                    }
                });
                /**
                 * Establece que el timer no se repetirá.
                 */
                time.setRepeats(false);
                /**
                 * Comienza el Timer.
                 */
                time.start();

            }

            /**
             * Establece que sucede cuando el operador tiene valor 4.
             */
            else if(operador==4){
                /**
                 * Crea una imagen con la imagen dada.
                 */
                ImageIcon imagenboton21 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1500.jpg");
                /**
                 * Almacena la imagen.
                 */
                Image imagenbot21 = imagenboton21.getImage();
                /**
                 * Establece las dimensiones y el suavizado de la imagen.
                 */
                Image nuevoboton21 = imagenbot21.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                /**
                 * Crea un nuevo JLabel
                 */
                JLabel imagen = new JLabel(new ImageIcon(nuevoboton21));
                /**
                 * Vuelve el JLabel no visible.
                 */
                imagen.setVisible(false);
                /**
                 * Establece las dimensiones del JLabel.
                 */
                imagen.setBounds(800,220,70,70);
                /**
                 * Añade el JLabel al panel.
                 */
                add(imagen);

                /**
                 * Crea un Timer.
                 */
                Timer time= new Timer(7000,new ActionListener(){
                    /**
                     * Método de respuesta de eventos
                     * @param e Evento a ser procesado.
                     */
                    public void actionPerformed(ActionEvent e) {
                        /**
                         * Vuelve la imagen JLabel visible.
                         */
                        imagen.setVisible(true);
                        /**
                         * Crea un Timer.
                         */
                        Timer temporizador = new Timer(5, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 800;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 220;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 520;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 200;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                else{
                                    x--;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
                                else{
                                    y--;
                                }
/**
 * Establece la posición de la imagen.
 */
                                imagen.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el Timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(imagen);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    }
                });
                /**
                 * Establece que no se repetirá el Timer.
                 */
                time.setRepeats(false);
                /**
                 * Comienza el Timer.
                 */
                time.start();

            }

            /**
             * Establece que pasa si el vuelto es mayor a 0, o producto seleccionado no quedan..
             */
            if(vuelto>0 && quesacaste!=null){
                /**
                 * Crea una variable i con valor 0.
                 */
                int i=0;
                /**
                 * Crea un bucle mientras el vuelto sea mayor que 0.
                 */
                while(vuelto>0){
                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/100.jpg");
                    /**
                     * Almacena la imagen.
                     */
                    Image imagenbot1 = imagenv.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image imagen100 = imagenbot1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel vueltito = new JLabel(new ImageIcon(imagen100));
                    /**
                     * Establece que no es visible el JLabel.
                     */
                    vueltito.setVisible(false);
                    /**
                     * Establece las posiciones y dimensiones del JLabel.
                     */
                    vueltito.setBounds(450+i, 500, 70, 70);
                    /**
                     * Añade el JLabel al panel.
                     */
                    add(vueltito);
                    /**
                     * Crea una variable con valor i.
                     */
                    int finalI = i;
                    /**
                     * Crea un Timer.
                     */
                    Timer time= new Timer(12000,new ActionListener(){
                        /**
                         * Método de respuesta de eventos
                         * @param e Evento a ser procesado.
                         */
                        public void actionPerformed(ActionEvent e) {
                            /**
                             * Vuelve visible el JLabel.
                             */
                            vueltito.setVisible(true);
                            /**
                             * Crea un Timer.
                             */
                            Timer temporizador = new Timer(15, new ActionListener() {
                                /**
                                 * Posición x de la imagen.
                                 */
                                int x = 450+ finalI;
                                /**
                                 * Posición y de la imagen.
                                 */
                                int y = 500;
                                /**
                                 * Posición x final.
                                 */
                                int destinoX = 500+ finalI;
                                /**
                                 * Posición y final.
                                 */
                                int destinoY = 800;

                                /**
                                 * Método de respuesta de eventos
                                 * @param e Evento a ser procesado.
                                 */
                                public void actionPerformed(ActionEvent e) {
                                    /**
                                     * Mueve la imagen.
                                     */
                                    if (x < destinoX) {
                                        x++;
                                    }
                                    if (y < destinoY) {
                                        y++;
                                    }
                                    /**
                                     * Establece la posición de la imagen.
                                     */
                                    vueltito.setLocation(x, y);
                                    /**
                                     * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                     */
                                    if (x == destinoX && y == destinoY) {
                                        /**
                                         * Detiene el Timer.
                                         */
                                        ((Timer) e.getSource()).stop();
                                        /**
                                         * Remueve la imagen.
                                         */
                                        remove(vueltito);
                                        /**
                                         * Vuelve a pintar la imagen.
                                         */
                                        repaint();
                                    }
                                }
                            });
                            /**
                             * Comienza el Timer.
                             */
                            temporizador.start();
                        }
                    });
                    /**
                     * Establece que el timer no se repetirá.
                     */
                    time.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time.start();

                    /**
                     * Descuenta 100 pesos del vuelto para así poder imprimir de monedas de 100.
                     */
                    vuelto=vuelto-100;
                    /**
                     * Le suma a la variable i.
                     */
                    i=i+40;
                }

                /**
                 * Establece que pasa si nuestra variable cual (eligiendo producto) tiene valor 1 (eligió cocacola).
                 */
                if(cual==1){
                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/Imagen1.jpg");
                    /**
                     * Almacena la imagen.
                     */
                    Image imagen1 = imagenv.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image cocacola = imagen1.getScaledInstance(30, 70, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel productito = new JLabel(new ImageIcon(cocacola));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    productito.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    productito.setBounds(215, 115, 30, 70);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(productito);
                    /**
                     * Crea un Timer.
                     */
                    Timer time= new Timer(16000, e -> {
                        /**
                         * Establece que el JLabel es visible.
                         */
                        productito.setVisible(true);
                        /**
                         * Crea un Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 215;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 115;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 300;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 390;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
/**
 * Establece la posición de la imagen.
 */
                                productito.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el Timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(productito);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time.start();

                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv11 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/Imagen1.jpg");
                    /**
                     * Almacena la imagen dada.
                     */
                    Image imagen11 = imagenv11.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image cocacola1 = imagen11.getScaledInstance(30, 70, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel productito1= new JLabel(new ImageIcon(cocacola1));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    productito1.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    productito1.setBounds(300, 510, 30, 70);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(productito1);

                    /**
                     * Crea un Timer.
                     */
                    Timer time1= new Timer(22000, e -> {
                        /**
                         * Establece que JLabel es visible.
                         */
                        productito1.setVisible(true);
                        /**
                         * Crea un Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 300;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 510;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 300;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 800;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
/**
 * Establece la posición de la imagen.
 */
                                productito1.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el Timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(productito1);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time1.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time1.start();
                }

                /**
                 * Establece que pasa si nuestra variable cual (eligiendo producto) tiene valor 2 (eligió sprite).
                 */
                else if(cual==2){
                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/sprite.png");
                    /**
                     * Almacena la imagen.
                     */
                    Image imagen1 = imagenv.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image sprite11 = imagen1.getScaledInstance(25, 65, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel productito = new JLabel(new ImageIcon(sprite11));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    productito.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    productito.setBounds(300, 115, 25, 65);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(productito);
                    /**
                     * Crea un Timer.
                     */
                    Timer time= new Timer(16000, e -> {
                        /**
                         * Establece que el JLabel es visible.
                         */
                        productito.setVisible(true);
                        /**
                         * Crea un Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 300;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 115;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 300;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 390;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
/**
 * Establece la posición de la imagen.
 */
                                productito.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el Timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(productito);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time.start();

                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv11 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/sprite.png");
                    /**
                     * Almacena la imagen dada.
                     */
                    Image imagen11 = imagenv11.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image sprite1 = imagen11.getScaledInstance(25, 65, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel productito1= new JLabel(new ImageIcon(sprite1));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    productito1.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    productito1.setBounds(300, 510, 25, 65);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(productito1);

                    /**
                     * Crea un Timer.
                     */
                    Timer time1= new Timer(22000, e -> {
                        /**
                         * Establece que JLabel es visible.
                         */
                        productito1.setVisible(true);
                        /**
                         * Crea un Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 300;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 510;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 300;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 800;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
/**
 * Establece la posición de la imagen.
 */
                                productito1.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el Timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(productito1);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time1.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time1.start();
                }

                /**
                 * Establece que pasa si nuestra variable cual (eligiendo producto) tiene valor 3 (eligió snickers).
                 */
                else if(cual==3){
                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/snicke2.png");
                    /**
                     * Almacena la imagen.
                     */
                    Image imagen1 = imagenv.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image snickers1 = imagen1.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel productito = new JLabel(new ImageIcon(snickers1));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    productito.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    productito.setBounds(380, 120, 50, 50);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(productito);
                    /**
                     * Crea un Timer.
                     */
                    Timer time= new Timer(16000, e -> {
                        /**
                         * Establece que el JLabel es visible.
                         */
                        productito.setVisible(true);
                        /**
                         * Crea un Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 380;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 120;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 380;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 390;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
/**
 * Establece la posición de la imagen.
 */
                                productito.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el Timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(productito);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time.start();

                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv11 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/snicke2.png");
                    /**
                     * Almacena la imagen dada.
                     */
                    Image imagen11 = imagenv11.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image snicke1 = imagen11.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel productito1= new JLabel(new ImageIcon(snicke1));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    productito1.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    productito1.setBounds(300, 510, 50, 50);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(productito1);

                    /**
                     * Crea un Timer.
                     */
                    Timer time1= new Timer(22000, e -> {
                        /**
                         * Establece que JLabel es visible.
                         */
                        productito1.setVisible(true);
                        /**
                         * Crea un Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 300;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 510;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 300;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 800;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
/**
 * Establece la posición de la imagen.
 */
                                productito1.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el Timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(productito1);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time1.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time1.start();
                }

                /**
                 * Establece que pasa si nuestra variable cual (eligiendo producto) tiene valor 4 (eligió super8).
                 */
                else if(cual==4){
                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/super8.png");
                    /**
                     * Almacena la imagen.
                     */
                    Image imagen1 = imagenv.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image super1 = imagen1.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel productito = new JLabel(new ImageIcon(super1));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    productito.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    productito.setBounds(205, 260, 50, 50);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(productito);

                    /**
                     * Crea un Timer.
                     */
                    Timer time= new Timer(16000, e -> {
                        /**
                         * Establece que el JLabel es visible.
                         */
                        productito.setVisible(true);
                        /**
                         * Crea un Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 205;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 260;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 300;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 390;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
/**
 * Establece la posición de la imagen.
 */
                                productito.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el Timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(productito);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time.start();

                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv11 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/super8.png");
                    /**
                     * Almacena la imagen dada.
                     */
                    Image imagen11 = imagenv11.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image super81 = imagen11.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel productito1= new JLabel(new ImageIcon(super81));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    productito1.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    productito1.setBounds(300, 510, 50, 50);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(productito1);

                    /**
                     * Crea un Timer.
                     */
                    Timer time1= new Timer(19000, e -> {
                        /**
                         * Establece que JLabel es visible.
                         */
                        productito1.setVisible(true);
                        /**
                         * Crea un Timer.
                         */
                        Timer temporizador = new Timer(1, new ActionListener() {
                            /**
                             * Posición x de la imagen.
                             */
                            int x = 300;
                            /**
                             * Posición y de la imagen.
                             */
                            int y = 510;
                            /**
                             * Posición x final.
                             */
                            int destinoX = 300;
                            /**
                             * Posición y final.
                             */
                            int destinoY = 800;

                            /**
                             * Método de respuesta de eventos
                             * @param e Evento a ser procesado.
                             */
                            public void actionPerformed(ActionEvent e) {
                                /**
                                 * Mueve la imagen.
                                 */
                                if (x < destinoX) {
                                    x++;
                                }
                                if (y < destinoY) {
                                    y++;
                                }
/**
 * Establece la posición de la imagen.
 */
                                productito1.setLocation(x, y);
                                /**
                                 * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                 */
                                if (x == destinoX && y == destinoY) {
                                    /**
                                     * Detiene el Timer.
                                     */
                                    ((Timer) e.getSource()).stop();
                                    /**
                                     * Remueve la imagen.
                                     */
                                    remove(productito1);
                                    /**
                                     * Vuelve a pintar la imagen.
                                     */
                                    repaint();
                                }
                            }
                        });
                        /**
                         * Comienza el Timer.
                         */
                        temporizador.start();
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time1.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time1.start();
                }

            }

            /**
             * Establece que sucede si el vuelto es mayor a 0 y no hay producto.
             */
            else if(vuelto>0 && quesacaste==null){
                /**
                 * Crea una moneda de 500.
                 */
                Moneda m1= new Moneda500();
                /**
                 * Crea una moneda de 1000.
                 */
                Moneda m2= new Moneda1000();
                /**
                 * Crea una moneda de 1500.
                 */
                Moneda m3= new Moneda1500();
                /**
                 * Crea una moneda de 100.
                 */
                Moneda m4= new Moneda100();

                /**
                 * Establece que sucede si la moneda tiene el mismo valor que obtuvimos con m1.getValor()
                 */
                if(moneda==m1.getValor()){
                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/500.png");
                    /**
                     * Almacena la imagen dada.
                     */
                    Image imagenbot1 = imagenv.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image imagen100 = imagenbot1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel vueltito = new JLabel(new ImageIcon(imagen100));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    vueltito.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    vueltito.setBounds(500,500,70,70);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(vueltito);

                    /**
                     * Crea un Timer.
                     */
                    Timer time= new Timer(10000,new ActionListener(){
                        /**
                         * Método de respuesta de eventos
                         * @param e Evento a ser procesado.
                         */
                        public void actionPerformed(ActionEvent e) {
                            /**
                             * Establece que el JLabel es visible.
                             */
                            vueltito.setVisible(true);
                            /**
                             * Crea un Timer.
                             */
                            Timer temporizador = new Timer(1, new ActionListener() {
                                /**
                                 * Posición x de la imagen.
                                 */
                                int x = 500;
                                /**
                                 * Posición y de la imagen.
                                 */
                                int y = 500;
                                /**
                                 * Posición x final.
                                 */
                                int destinoX = 500;
                                /**
                                 * Posición y final.
                                 */
                                int destinoY = 800;

                                /**
                                 * Método de respuesta de eventos
                                 * @param e Evento a ser procesado.
                                 */
                                public void actionPerformed(ActionEvent e) {
                                    /**
                                     * Mueve la imagen.
                                     */
                                    if (x < destinoX) {
                                        x++;
                                    }
                                    if (y < destinoY) {
                                        y++;
                                    }
/**
 * Establece la posición de la imagen.
 */
                                    vueltito.setLocation(x, y);
                                    /**
                                     * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                     */
                                    if (x == destinoX && y == destinoY) {
                                        /**
                                         * Detiene el Timer.
                                         */
                                        ((Timer) e.getSource()).stop();
                                        /**
                                         * Remueve la imagen.
                                         */
                                        remove(vueltito);
                                        /**
                                         * Vuelve a pintar la imagen.
                                         */
                                        repaint();
                                    }
                                }
                            });
                            /**
                             * Comienza el Timer.
                             */
                            temporizador.start();
                        }
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time.start();
                }

                /**
                 * Establece que sucede si moneda es igual a el valor obtenido en m2.getValor()
                 */
                else if(moneda==m2.getValor()){
                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1000.jpg");
                    /**
                     * Almacena la imagen dada.
                     */
                    Image imagenbot1 = imagenv.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image imagen100 = imagenbot1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel vueltito = new JLabel(new ImageIcon(imagen100));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    vueltito.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    vueltito.setBounds(500,500,70,70);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(vueltito);
                    /**
                     * Crea un Timer.
                     */
                    Timer time= new Timer(14000,new ActionListener(){
                        /**
                         * Método de respuesta de eventos
                         * @param e Evento a ser procesado.
                         */
                        public void actionPerformed(ActionEvent e) {
                            /**
                             * Establece que JLabel es visible.
                             */
                            vueltito.setVisible(true);
                            /**
                             * Crea un Timer.
                             */
                            Timer temporizador = new Timer(1, new ActionListener() {
                                /**
                                 * Posición x de la imagen.
                                 */
                                int x = 500;
                                /**
                                 * Posición y de la imagen.
                                 */
                                int y = 500;
                                /**
                                 * Posición x final.
                                 */
                                int destinoX = 500;
                                /**
                                 * Posición y final.
                                 */
                                int destinoY = 800;

                                /**
                                 * Método de respuesta de eventos
                                 * @param e Evento a ser procesado.
                                 */
                                public void actionPerformed(ActionEvent e) {
                                    /**
                                     * Mueve la imagen.
                                     */
                                    if (x < destinoX) {
                                        x++;
                                    }
                                    if (y < destinoY) {
                                        y++;
                                    }
/**
 * Establece la posición de la imagen.
 */
                                    vueltito.setLocation(x, y);
                                    /**
                                     * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                     */
                                    if (x == destinoX && y == destinoY) {
                                        /**
                                         * Detiene el Timer.
                                         */
                                        ((Timer) e.getSource()).stop();
                                        /**
                                         * Remueve la imagen.
                                         */
                                        remove(vueltito);
                                        /**
                                         * Vuelve a pintar la imagen.
                                         */
                                        repaint();
                                    }
                                }
                            });
                            /**
                             * Comienza el Timer.
                             */
                            temporizador.start();
                        }
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time.start();
                }

                /**
                 * Establece que pasa si moneda es igual al valor obtenido en m3.getValor().
                 */
                else if(moneda==m3.getValor()){
                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/1500.jpg");
                    /**
                     * Almacena la imagen dada.
                     */
                    Image imagenbot1 = imagenv.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image imagen100 = imagenbot1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel vueltito = new JLabel(new ImageIcon(imagen100));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    vueltito.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    vueltito.setBounds(500,500,70,70);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(vueltito);

                    /**
                     * Crea un Timer.
                     */
                    Timer time= new Timer(14000,new ActionListener(){
                        /**
                         * Método de respuesta de eventos
                         * @param e Evento a ser procesado.
                         */
                        public void actionPerformed(ActionEvent e) {
                            /**
                             * Establece que JLabel es visible.
                             */
                            vueltito.setVisible(true);
                            /**
                             * Crea un Timer.
                             */
                            Timer temporizador = new Timer(1, new ActionListener() {
                                /**
                                 * Posición x de la imagen.
                                 */
                                int x = 500;
                                /**
                                 * Posición y de la imagen.
                                 */
                                int y = 500;
                                /**
                                 * Posición x final.
                                 */
                                int destinoX = 500;
                                /**
                                 * Posición y final.
                                 */
                                int destinoY = 800;

                                /**
                                 * Método de respuesta de eventos
                                 * @param e Evento a ser procesado.
                                 */
                                public void actionPerformed(ActionEvent e) {
                                    /**
                                     * Mueve la imagen.
                                     */
                                    if (x < destinoX) {
                                        x++;
                                    }
                                    if (y < destinoY) {
                                        y++;
                                    }
/**
 * Establece la posición de la imagen.
 */
                                    vueltito.setLocation(x, y);
                                    /**
                                     * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                     */
                                    if (x == destinoX && y == destinoY) {
                                        /**
                                         * Detiene el Timer.
                                         */
                                        ((Timer) e.getSource()).stop();
                                        /**
                                         * Remueve la imagen.
                                         */
                                        remove(vueltito);
                                        /**
                                         * Vuelve a pintar la imagen.
                                         */
                                        repaint();
                                    }
                                }
                            });
                            /**
                             * Comienza el Timer.
                             */
                            temporizador.start();
                        }
                    });

                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time.start();
                }

                /**
                 * Establece que pasa si moneda no es igual al valor obtenido en m4.getValor()
                 */
                else if(moneda==m4.getValor()){
                    /**
                     * Crea una imagen con la imagen dada.
                     */
                    ImageIcon imagenv = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/100.jpg");
                    /**
                     * Almacena la imagen dada.
                     */
                    Image imagenbot1 = imagenv.getImage();
                    /**
                     * Establece las dimensiones y suavizado de la imagen.
                     */
                    Image imagen100 = imagenbot1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                    /**
                     * Crea un JLabel con la imagen dada.
                     */
                    JLabel vueltito = new JLabel(new ImageIcon(imagen100));
                    /**
                     * Establece que JLabel no es visible.
                     */
                    vueltito.setVisible(false);
                    /**
                     * Establece la posición y dimensiones de JLabel.
                     */
                    vueltito.setBounds(500, 500, 70, 70);
                    /**
                     * Añade JLabel al panel.
                     */
                    add(vueltito);

                    /**
                     * Crea un Timer.
                     */
                    Timer time = new Timer(9000, new ActionListener() {
                        /**
                         * Método de respuesta de eventos
                         * @param e Evento a ser procesado.
                         */
                        public void actionPerformed(ActionEvent e) {
                            /**
                             * Establece que JLabel es visible.
                             */
                            vueltito.setVisible(true);
                            /**
                             * Crea un Timer.
                             */
                            Timer temporizador = new Timer(1, new ActionListener() {
                                /**
                                 * Posición x de la imagen.
                                 */
                                int x = 500;
                                /**
                                 * Posición y de la imagen.
                                 */
                                int y = 500;
                                /**
                                 * Posición x final.
                                 */
                                int destinoX = 500;
                                /**
                                 * Posición y final.
                                 */
                                int destinoY = 800;

                                /**
                                 * Método de respuesta de eventos
                                 * @param e Evento a ser procesado.
                                 */
                                public void actionPerformed(ActionEvent e) {
                                    /**
                                     * Mueve la imagen.
                                     */
                                    if (x < destinoX) {
                                        x++;
                                    }
                                    if (y < destinoY) {
                                        y++;
                                    }
/**
 * Establece la posición de la imagen.
 */
                                    vueltito.setLocation(x, y);
                                    /**
                                     * Si llegamos a la posición final, detener el Timer y eliminar la imagen.
                                     */
                                    if (x == destinoX && y == destinoY) {
                                        /**
                                         * Detiene el Timer.
                                         */
                                        ((Timer) e.getSource()).stop();
                                        /**
                                         * Remueve la imagen.
                                         */
                                        remove(vueltito);
                                        /**
                                         * Vuelve a pintar la imagen.
                                         */
                                        repaint();
                                    }
                                }
                            });
                            /**
                             * Comienza el Timer.
                             */
                            temporizador.start();
                        }
                    });
                    /**
                     * Establece que el Timer no se repetirá.
                     */
                    time.setRepeats(false);
                    /**
                     * Comienza el Timer.
                     */
                    time.start();
                }
            }

            /**
             * Crea un Timer
             */
            Timer timer = new Timer(26000, new ActionListener() {
                /**
                 * Hace override.
                 * @param e evento a ser procesado.
                 */
                @Override
                public void actionPerformed(ActionEvent e) {
                    /**
                     * Establece que no será visible.
                     */
                    setVisible(false);
                    /**
                     * Crea un nuevo PanelExpendedor.
                     */
                    PanelExpendedor panelito2=new PanelExpendedor();
                    /**
                     * Le da valor 0 a la variable cual (ningún producto).
                     */
                    panelito2.cual=0;
                    /**
                     * Le da valor el mismo valor del expendedor PanelExpendedor al expendedor.
                     */
                    panelito2.expendedor=expendedor;
                    /**
                     * Le da valor el mismo valor del expendedor PanelComprador a la persona.
                     */
                    panelito2.persona=persona;
                    /**
                     * Le da valor 0 al operador.
                     */
                    panelito2.operador=0;
                    /**
                     * Le otorga el método paint.
                     */
                    panelito2.paint();
                }
            });
            /**
             * Establece que el Timer no se repetirá.
             */
            timer.setRepeats(false);
            /**
             * Comienza el Timer.
             */
            timer.start();

        }
    }

    /**
     * Clase pública estática encargada de ver cuál producto fue elegido. Retorna el producto elegido.
     * @return cual.
     */
    public static int getCual() {
        /**
         * Retorna cual (producto elegido)
         */
        return cual;
    }
}