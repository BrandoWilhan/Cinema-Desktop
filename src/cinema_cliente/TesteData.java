/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinema_cliente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author caioa
 */
public class TesteData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();  
        
        String input = entrada.next();
        
        System.out.println(input);
        System.out.println(dtf.format(now));
        System.out.println(dtf.format(now).equals(input));
        
        boolean aniversariante = dtf.format(now).equals(input);
        String[] options = {"Acei", "Rec"};
        if (aniversariante){
            System.out.println("hahahahahah");
            int a = JOptionPane.showOptionDialog(null,"Haaaaaaaaaa", "Click ir motherfucker", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            System.out.println("sdhfkjadhfj");
            System.out.println(a);
        }
    }
    
}
