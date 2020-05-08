import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktekFrame extends JFrame {
    JLabel label1 = new JLabel("Ini Sebuah Label");
    JTextField tf1 = new JTextField();
    JButton btn1 = new JButton("Click Me");
    public PraktekFrame(){
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Frame Pertama");
        setLocationRelativeTo(null);
    }

    void meletakkanKomponen(){
        getContentPane().setLayout(null);

        getContentPane().add(label1);
        getContentPane().add(tf1);
        getContentPane().add(btn1);

        label1.setBounds(16,32,100,20);
        tf1.setBounds(124,32,100,20);
        btn1.setBounds(124,60,100,20);
    }

    void menambahkanListener(){
        btn1.addActionListener(e -> {
            String nama = tf1.getText();
            JOptionPane.showMessageDialog(null,
                    "Hai, " + nama);
        });
    }
}
