import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Write a description of class ChatGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChatGUI implements ActionListener, Runnable{
    JFrame frame;
    JTextArea display;
    JTextField entry;
    JButton submit;
    OutputStream out;
    InputStream in;
    Socket s;
    public ChatGUI() {
        this.frame = new JFrame("ChatGUI");
        this.display = new JTextArea(50, 50);
        this.display.setEnabled(false);
        this.display.setLineWrap(true);
        this.frame.add(display, BorderLayout.NORTH);
        this.entry = new JTextField(50);
        this.frame.add(entry, BorderLayout.CENTER);
        this.submit = new JButton("Send");
        this.submit.addActionListener(this);
        this.frame.add(submit, BorderLayout.EAST);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        this.frame.setSize(new Dimension(1000, 1000));
        this.s = new Socket(
    }
    
    public static void main(String[] args) {
        new ChatGUI();
    }
    
    public void actionPerformed(ActionEvent e) {
        this.display.append(entry.getText() + "\n");
        try {
            this.out.write(this.display.getText().getBytes());
        } catch (Exception ee) {
        }
    }
    
    public void run(){
        Scanner s = new Scanner(in);
        s.useDelimiter("SA5DFHAS5DIFHASDOIFH55665340093cxlkv328068EOIROIRWEOIHRWERWE");
        while(true) {
            if (s.hasNext()) {
                this.display.setText(s.next());
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }
}