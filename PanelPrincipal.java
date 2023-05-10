import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JFrame {
    private PanelExpendedor exp;
    private PanelComprador com;
    public PanelPrincipal() {
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
class PanelComprador {
    public void paint(Graphics g) {
    }
}
class PanelExpendedor{
    public void paint (Graphics g) {
    }
    }