import javax.swing.*;
import java.awt.*;

public class ProntuarioMedico extends JFrame {
    public ProntuarioMedico() {
        setTitle("ProntuarioMedico");
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 5, 5));

        panel.add(new JLabel("ID Prontuário")); panel.add(new JTextField(20));
        panel.add(new JLabel("Registros")); panel.add(new JTextField(20));

        
        JButton btn1 = new JButton("Adicionar Registro");
        btn1.addActionListener(e -> {
            // ação visual
        });
        panel.add(btn1);
        
        
        JButton btn2 = new JButton("Consultar");
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