package Nusput;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\"Belajar JAVA\"");
        System.out.println("\"Sangat mudah sekali\"");
        System.out.println("\"dan sangat menyenangkan\"");


        String inputText=JOptionPane.showInputDialog("Anda sedang belajar apa?");
        JOptionPane.showMessageDialog(null,"Belajar "+inputText+" sangat mudah");
    }
}
