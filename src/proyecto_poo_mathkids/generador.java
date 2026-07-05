/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_poo_mathkids;
import java.util.Random;

public class generador {
    
    public static Pregunta generarNuevaOperacion() {
        Random rand = new Random();
        int num1 = 0;
        int num2 = 0;
        int respuesta = 0;

        switch (gestor.dificultadActual) {
            case 1:
                num1 = rand.nextInt(11); 
                num2 = rand.nextInt(11);
                break;
            case 2: 
                num1 = rand.nextInt(41) + 10; 
                num2 = rand.nextInt(41) + 10;
                break;
            case 3: 
                num1 = rand.nextInt(51) + 50; 
                num2 = rand.nextInt(51) + 50;
                break;
        }
        
        String signo = " + ";
        
        switch (gestor.operacionActual) {
            case "suma":
                signo = " + ";
                respuesta = num1 + num2;
                break;
                
            case "resta":
                signo = " - ";

                if (num1 < num2) {
                    int temporal = num1;
                    num1 = num2;
                    num2 = temporal;
                }
                respuesta = num1 - num2;
                break;
                
            case "multiplicacion":
                signo = " × ";

                if (gestor.dificultadActual == 1) {
                    num1 = rand.nextInt(6); // 0 a 5
                    num2 = rand.nextInt(6);
                }
                respuesta = num1 * num2;
                break;
                
            case "division":
                signo = " ÷ ";

                if (num2 == 0) num2 = 2; 
                if (gestor.dificultadActual == 1) {
                    num2 = rand.nextInt(4) + 1; 
                    int resultadoExacto = rand.nextInt(6); 
                    num1 = num2 * resultadoExacto; 
                } else {
                    num2 = rand.nextInt(9) + 2; 
                    int resultadoExacto = rand.nextInt(11) + 1; 
                    num1 = num2 * resultadoExacto;
                }
                respuesta = num1 / num2;
                break;
                
            case "reto":  
                int tipoReto = rand.nextInt(3);     
                int a, b, c;
    
                if (tipoReto == 0) {      
                    a = rand.nextInt(5) + 2;         
                    b = rand.nextInt(5) + 2;        
                    c = rand.nextInt(10) + 1; 
                    respuesta = (a * b) + c;
                    return new Pregunta(a + " × " + b + " + " + c + " =", respuesta);         
                } else if (tipoReto == 1) {         
                    a = rand.nextInt(5) + 2;     
                    b = rand.nextInt(5) + 2;      
                    c = rand.nextInt(a * b) + 1;                
                    respuesta = (a * b) - c;        
                    return new Pregunta(a + " × " + b + " - " + c + " =", respuesta);           
                } else {       
                    a = rand.nextInt(15) + 10;         
                    b = rand.nextInt(10) + 5;         
                    c = rand.nextInt(a + b) + 1;              
                    respuesta = (a + b) - c;       
                    return new Pregunta(a + " + " + b + " - " + c + " =", respuesta);    
                }      
        }               
        return new Pregunta(num1 + signo + num2 + " =", respuesta);
    }
}
