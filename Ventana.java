import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ventana extends JFrame{
    private JPanel panel1;
    private JPanel panel2;

    private JPanel panel3;

    private JPanel panel4;

    private JPanel panel5;
    private RoundButton button;
    private RoundButton button2;

    private RoundButton button3;

    private RoundButton button4;

    private RoundButton button5;

    public Ventana(){
        // Configurar la ventana principal
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mi ventana");

        // Cargar la imagen de fondo
        ImageIcon imageIcon = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/maquina-expendedora.png");
        Image image = imageIcon.getImage();

        // Escalar la imagen a un tamaño mayor
        Image newImage = image.getScaledInstance(600, 650, Image.SCALE_SMOOTH);

        // Crear una etiqueta para mostrar la imagen de fondo y establecer su posición y tamaño
        JLabel background = new JLabel(new ImageIcon(newImage));
        background.setBounds(0, 0, 600, 650);

        // Agregar la etiqueta al panel principal utilizando el método setContentPane()
        setContentPane(background);

        // Agregar los componentes sobre la etiqueta de fondo
        panel1 = new JPanel();
        panel1.setBounds(490, 285, 30, 35);
        panel1.setOpaque(false); // Hacer el panel transparente para que se muestre la imagen de fondo

        panel2 = new JPanel();
        panel2.setBounds(530, 285, 30, 35);
        panel2.setOpaque(false); // Hacer el panel transparente para que se muestre la imagen de fondo

       /* panel3 = new JPanel();
        panel3.setBounds(570, 285, 30, 35);
        panel3.setOpaque(false); // Hacer el panel transparente para que se muestre la imagen de fondo

        panel4 = new JPanel();
        panel4.setBounds(490, 300, 30, 35);
        panel4.setOpaque(false); // Hacer el panel transparente para que se muestre la imagen de fondo

        panel5 = new JPanel();
        panel5.setBounds(530, 300, 30, 35);
        panel5.setOpaque(false); // Hacer el panel transparente para que se muestre la imagen de fondo
*/
        // Crear el botón redondo
        button = new RoundButton("Mi botón");
        button.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        button.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel1.add(button);

        button2 = new RoundButton("Mi botón");
        button2.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        button2.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel2.add(button2);

  /*      button3 = new RoundButton("Mi botón");
        button3.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        button3.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel3.add(button2);

        button4 = new RoundButton("Mi botón");
        button4.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        button4.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel4.add(button2);

        button4 = new RoundButton("Mi botón");
        button4.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        button4.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel4.add(button2);*/

        add(panel1);
        add(panel2);
        /*add(panel3);
        add(panel4);
        add(panel5);*/

        // Hacer visible la ventana
        setVisible(true);
    }

    // Clase RoundButton
    public class RoundButton extends JButton {
        public RoundButton(String text) {
            super(text);
            setBackground(new Color(255, 255, 255, 0)); // Hacer el fondo del botón transparente
            setOpaque(false); // Hacer el botón transparente
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isArmed()) {
                g.setColor(Color.lightGray);
            } else {
                g.setColor(getBackground());
            }
            g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
            super.paintComponent(g);
        }

        @Override
        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
        }

        @Override
        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
            }
            return shape.contains(x, y);
        }

        private Shape shape;
    }
}

