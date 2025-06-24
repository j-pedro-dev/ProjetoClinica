import javax.swing.*;
import java.awt.*;

public class Recepcionista extends JFrame {
    public Recepcionista() {
        setTitle("Recepcionista");
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 5, 5));

        panel.add(new JLabel("ID Recepcionista")); panel.add(new JTextField(20));
        panel.add(new JLabel("Nome")); panel.add(new JTextField(20));
        panel.add(new JLabel("Telefone")); panel.add(new JTextField(20));

        
        JButton btn1 = new JButton("Consultar Consultas");
        btn1.addActionListener(e -> {
            new Consulta().setVisible(true);
        });
        panel.add(btn1);
        
        
        JButton btn2 = new JButton("Confirmar Consulta");
        btn2.addActionListener(e -> {
            new Consulta().setVisible(true);
        });
        panel.add(btn2);
        

        JButton fechar = new JButton("Fechar");
        fechar.addActionListener(e -> dispose());
        panel.add(fechar);

        add(panel);
    }
}