import javax.swing.*;
import java.awt.*;

public class Endereco extends JFrame {
    public Endereco() {
        setTitle("Endereco");
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 5, 5));

        panel.add(new JLabel("Rua")); panel.add(new JTextField(20));
        panel.add(new JLabel("Bairro")); panel.add(new JTextField(20));
        panel.add(new JLabel("CEP")); panel.add(new JTextField(20));
        panel.add(new JLabel("Cidade")); panel.add(new JTextField(20));
        panel.add(new JLabel("Estado")); panel.add(new JTextField(20));

        
        JButton btn1 = new JButton("Salvar Endereço ");
        btn1.addActionListener(e -> {
            
        });
        panel.add(btn1);
        

        JButton fechar = new JButton("Fechar");
        fechar.addActionListener(e -> dispose());
        panel.add(fechar);

        add(panel);
    }
}