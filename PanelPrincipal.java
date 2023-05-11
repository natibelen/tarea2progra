import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class PanelPrincipal extends JFrame {
    private PanelExpendedor exp;
    private PanelComprador com;
    public PanelPrincipal() {
        setSize(800, 800);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mi ventana");

        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setBackground(Color.white);

    }
    @Override
    public void paint (Graphics g) {
        super.paint(g);
        com.paint(g);
        exp.paint(g);
    }}
class PanelComprador extends JFrame{

    public void paint(Graphics g) {

    }
}
class PanelExpendedor extends JFrame{
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

    public PanelExpendedor(){

        panel1 = new JPanel();
        panel1.setBounds(490, 285, 30, 35);
        panel1.setOpaque(false); // Hacer el panel transparente para que se muestre la imagen de fondo

        panel2 = new JPanel();
        panel2.setBounds(528, 285, 30, 35);
        panel2.setOpaque(false); // Hacer el panel transparente para que se muestre la imagen de fondo

        panel3 = new JPanel();
        panel3.setBounds(566, 285, 30, 35);
        panel3.setOpaque(false); // Hacer el panel transparente para que se muestre la imagen de fondo

        panel4 = new JPanel();
        panel4.setBounds(490, 328, 30, 35);
        panel4.setOpaque(false); // Hacer el panel transparente para que se muestre la imagen de fondo

        panel5 = new JPanel();
        panel5.setBounds(528, 328, 30, 35);
        panel5.setOpaque(false); // Hacer el panel transparente para que se muestre la imagen de fondo


    }

    public void paint(Graphics g) {
        ImageIcon imageIcon = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/maquina-expendedora.png");
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(600, 650, Image.SCALE_SMOOTH);
        JLabel background = new JLabel(new ImageIcon(newImage));
        background.setBounds(0, 0, 600, 650);
        setContentPane(background);

        button = new RoundButton("1");
        button.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        button.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel1.add(button);

        button2 = new RoundButton("2");
        button2.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        button2.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel2.add(button2);

        button3 = new RoundButton("3");
        button3.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        button3.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel3.add(button3);

        button4 = new RoundButton("4");
        button4.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        button4.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel4.add(button4);

        button5 = new RoundButton("5");
        button5.setBackground(new Color(128, 128, 128)); // Establecer el color del botón
        button5.setPreferredSize(new Dimension(30, 30)); // Establecer el tamaño del botón
        panel5.add(button5);

        ImageIcon imageIcon2 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/Imagen1.jpg");
        Image image2 = imageIcon2.getImage();
        Image newImage2 = image2.getScaledInstance(30, 70, Image.SCALE_SMOOTH);
        JLabel newLabel = new JLabel(new ImageIcon(newImage2));
        newLabel.setBounds(215, 115, 30, 70);
        add(newLabel);

        ImageIcon imageIcon3 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/sprite.png");
        Image image3 = imageIcon3.getImage();
        Image newImage3 = image3.getScaledInstance(25, 65, Image.SCALE_SMOOTH);
        JLabel newLabel3 = new JLabel(new ImageIcon(newImage3));
        newLabel3.setBounds(300, 115, 25, 65);
        add(newLabel3);

        ImageIcon imageIcon4 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/snicke2.png");
        Image image4 = imageIcon4.getImage();
        Image newImage4 = image4.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        JLabel newLabel4 = new JLabel(new ImageIcon(newImage4));
        newLabel4.setBounds(380, 120, 50, 50);
        add(newLabel4);

        ImageIcon imageIcon5 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/tarea2progra/src/imagenes/super8.png");
        Image image5 = imageIcon5.getImage();
        Image newImage5 = image5.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        JLabel newLabel5 = new JLabel(new ImageIcon(newImage5));
        newLabel5.setBounds(205, 260, 60, 60);
        add(newLabel5);

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);

        setVisible(true);

    }


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
