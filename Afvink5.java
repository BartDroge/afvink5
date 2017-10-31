/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
      

/**
 *
 * @author Bartdroge
 */
public class Afvink5 extends JFrame implements ActionListener {

    static JTextField tekst1 = new JTextField(10);
    static JButton button1 = new JButton("translate 1 naar 3 lettercode");
    static JTextField tekst2 = new JTextField(10);
    static JButton button2 = new JButton("translate 3 naar 1 lettercode");


public static void main(String[] args) {
    Afvink5 frame = new Afvink5();
    frame.setTitle("afvink5");
    frame.setSize(new Dimension(200,200));
    frame.createGUI();
    frame.setVisible(true);
    
    }

private void createGUI(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container window = getContentPane();
    tekst1.setMaximumSize(new Dimension (50,50));
    tekst2.setMaximumSize(new Dimension(50,50));
    button1.setMaximumSize(new Dimension(30,30));
    button2.setMaximumSize(new Dimension(30,30));
    window.setLayout(new FlowLayout());
    window.setBackground(Color.gray);
    
    window.add(tekst1);
    window.add(tekst2);
    window.add(button1);
    window.add(button2);
    
   

    
    button1.addActionListener(this);
    button2.addActionListener(this);
}
 
    @Override
    public void actionPerformed(ActionEvent event) {
    String Eennaar3;
    String Drienaar1;
    if (event.getSource()==button1){
        Eennaar3 = tekst1.getText().toUpperCase();
        Drienaar1 = "";
        for (char x : Eennaar3.toCharArray()){
            try { 
                String a = String.valueOf(x);
                Drienaar1 += Translator.one2three(a)+" ";
            }
            catch (NotAnAA a) {
                int i = 1;
                while(i < 70){
                    JOptionPane.showMessageDialog(null, "Dit is geen aminozuur");
                    i++;
                
                
                    
                    }
            }
        }
        Drienaar1 = Drienaar1.substring(0, Drienaar1.length()-1);
        tekst2.setText(Drienaar1);
        
    } else {
        Eennaar3 = "";
        Drienaar1 = tekst2.getText().toUpperCase();
        try {
            Eennaar3 += Translator.three2one(Drienaar1);
        }
            catch (NotAnAA a) {
                int i = 1;
                while(i < 70){
                    JOptionPane.showMessageDialog(null, "Dit is geen aminozuur");
                    i++;
                    
                    }
        }
        tekst1.setText(Eennaar3);
    }
    
    
    
}
}
