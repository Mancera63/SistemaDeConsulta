/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeconsulta;

/**
 *
 * @author Equipo verde
 */

import java.io.*;
import java.util.Scanner;

public class ManejadorDeArchivos {
    int i;
    
    void escribir() throws IOException{
        String[] datos = new String[5];
        Scanner entrada = new Scanner(System.in);
        
        DataOutputStream archi = new DataOutputStream(new FileOutputStream("archivo"));
        
        System.out.println("Escribe 5 datos");
        for (int j = 0; j < 5; j++) {
            archi.writeUTF(entrada.next());
        }
        archi.close();
    }
    
    void leerEnfermedades() throws IOException{
        long ap_actual, ap_final;
        RandomAccessFile arch = new RandomAccessFile("archivo", "r");
        
        System.out.println("Muestra Archivo");
        while ((ap_actual = arch.getFilePointer()) != (ap_final = arch.length())) {
            System.out.println(arch.readUTF());
        }
        arch.close();
    }
}
