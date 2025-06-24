import javax.swing.*;
import java.awt.*;

public class Triagem extends JFrame {
    public Triagem() {
        setTitle("Triagem");
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 5, 5));

        panel.add(new JLabel("ID Triagem")); panel.add(new JTextField(20));
        panel.add(new JLabel("Sintomas")); panel.add(new JTextField(20));

        
        JButton btn1 = new JButton("Avaliar Sintomas");
        btn1.addActionListener(e -> {
            // ação visual
        });
        panel.add(btn1);
        
        
        JButton btn2 = new JButton("Priorizar Casos");
        btn2.addActionListener(e -> {
            // ação visual
        });
        panel.add(btn2);
        

        JButton fechar = new JButton("Fechar");
        fechar.addActionListener(e -> dispose());
        panel.add(fechar);

        add(panel);
    }
}