/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author RA21551794
 */
public class Soket {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        try{
        Socket clientSocket = new Socket("localhost", 5555); // Conecta-se ao servidor remoto na porta indicada - Cliente
        
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in)); //Prepara para ler do teclado - Cliente
        
        String read = inFromUser.readLine();
        
        JOptionPane.showMessageDialog(null, read);
        System.exit(0);
        } catch(Exception e){
            System.out.println("Erro ao conectar");
        }
        
    }
}
