import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("Sistema de Gestão Médica");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 10, 10));
        String[] telas = {
            "Endereco", "Paciente", "Medico", "Enfermeiro", "Recepcionista", "Triagem", "Consulta", "ProntuarioMedico"
        };

        for (String tela : telas) {
            JButton btn = new JButton("Abrir " + tela);
            btn.addActionListener(e -> {
                try {
                    Class<?> clazz = Class.forName(tela);
                    JFrame frame = (JFrame) clazz.getDeclaredConstructor().newInstance();
                    frame.setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
            panel.add(btn);
        }

        JButton sair = new JButton("Sair");
        sair.addActionListener(e -> System.exit(0));
        panel.add(sair);

        add(panel);
    }

    public static void main(String[] args) {
        new MainMenu().setVisible(true);
    }
}