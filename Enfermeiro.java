import javax.swing.*;
import java.awt.*;

public class Enfermeiro extends JFrame {
    public Enfermeiro() {
        setTitle("Enfermeiro");
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 5, 5));

        panel.add(new JLabel("ID Enfermeiro")); panel.add(new JTextField(20));
        panel.add(new JLabel("Nome")); panel.add(new JTextField(20));
        panel.add(new JLabel("Turno")); panel.add(new JTextField(20));

        
        JButton btn1 = new JButton("Auxiliar Médico");
        btn1.addActionListener(e -> {
            // ação visual
        });
        panel.add(btn1);
        

        JButton fechar = new JButton("Fechar");
        fechar.addActionListener(e -> dispose());
        panel.add(fechar);

        add(panel);
    }
}