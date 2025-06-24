import javax.swing.*;
import java.awt.*;

public class Paciente extends JFrame {
    public Paciente() {
        setTitle("Paciente");
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 5, 5));

        panel.add(new JLabel("ID Paciente")); panel.add(new JTextField(20));
        panel.add(new JLabel("Nome")); panel.add(new JTextField(20));
        panel.add(new JLabel("Data de Nascimento")); panel.add(new JTextField(20));
        panel.add(new JLabel("Histórico Médico")); panel.add(new JTextField(20));

        
        JButton btn1 = new JButton("Salvar");
        btn1.addActionListener(e -> {
            // ação visual
        });
        panel.add(btn1);
        
        
        JButton btn2 = new JButton("Consultar Paciente");
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