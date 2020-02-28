/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmost2;

import java.util.Scanner;

/**
 *
 * @author 204
 */
public class AlgoritmosT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       //Punto 1
        int pc = 4,//puntaje correcto
            pi =-1, //puntaje incorrecto
            pb = 0, // puentaje en blanco
            cc, // Cantidad correctas
            ci, // Cantidad incorrectas
            cb; // cantidad blanco
        Scanner sc = new Scanner(System.in);
        
        //Proceso
        System.out.println("Cantidad de respuestas incorrectas");
        ci = sc.nextInt();
        
        System.out.println("Cantidad de respuestas incorrectas");
        cc = sc.nextInt();
        
        System.out.println("Cantidad de respuestas incorrectas");
        cb = sc.nextInt();
        
        //Salida
        
        System.out.println("///////*******//////");
        
        System.out.println("Tu Puntuacion");
        
        System.out.println("///////*******//////");
        System.out.println((cb*pb)+(cc*pc)+(ci*pi));
        
    }
    
}
