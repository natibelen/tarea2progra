import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Botonredondo extends JButton {
    public Botonredondo(String text) {
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
