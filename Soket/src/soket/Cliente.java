/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author RA21551794
 */
public class Cliente {
    public static void main(String[] args) {
        
        
        
        try{
            System.out.println("Conectando ao servidor pela porta 1234");
            
            Socket clientSocket = new Socket("10.61.16.58", 1234); // Conecta-se ao servidor remoto na porta indicada
            
            System.out.println("Conectado");
            
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in)); //Prepara para ler do teclado
            
            String sentence = inFromUser.readLine(); //Le do teclado
            
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream()); //Prepara as classes para envio dos dados 
                    
            out.writeBytes(sentence + '\n'); //envia a mensagem (msg deve ser String)
            out.close();
            
        } catch(Exception e){
            System.out.println("Error ao conectar");
        }
    }
}
