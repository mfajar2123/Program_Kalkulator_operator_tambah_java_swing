/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utspbo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class utspbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // container / wadah
        JFrame cFrame = new JFrame();
        
        cFrame.setTitle("Operator penjumlahan");
        
        cFrame.setSize(800,500);
        
        cFrame.setVisible(true);
        //container//
        //membuat objek tabel
        JLabel label101 = new JLabel("Angka 1");
        cFrame.add(label101);
        label101.setBounds(20,50,150,30);
        //membuat objek JtextField
        JTextField text01 = new JTextField();
        cFrame.add(text01);
        text01.setBounds(150,50,230,30);
        
        
        
        
    }
    
}
