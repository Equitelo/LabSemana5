/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorioweek5;

import java.util.Scanner;

public class LaraSamuelE1 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        
        int menu=0;
        while(menu!=5){
            do{
                System.out.println("1 - PIRAMIDE");
                System.out.println("2 - EL MAYOR");
                System.out.println("3 - CAJA");
                System.out.println("4 - CARACTERES VOCALES");
                System.out.println("5 - SALIR DEL SISTEMA");
                System.out.print("Ingresar opcion a realizar: ");
                menu=lea.nextInt();
                if(menu<1||menu>5){
                    System.out.println("Ingrese una de las opciones solicitadas.");
                }
            }while(menu<1||menu>5);
            
            if(menu==1){
            
            }else if(menu==2){
                int mayor=0;
                //para promedio
                int vecesIngreso=0;
                int suma=0;
                double promedio=0;
                String respuesta="no";
                do{
                    vecesIngreso++;
                    System.out.print("Ingresar numeros enteros: ");
                    int numeros=lea.nextInt();
                    
                    while(numeros>mayor){
                        mayor=numeros;
                    }
                    suma+=numeros;
                    promedio=suma/vecesIngreso;
                    System.out.println("Desea terminar de ingresar numeros?(SI/NO): ");
                    respuesta=lea.next().toLowerCase();
                }while(respuesta.equals("no"));
                System.out.println("El numero mayor ingresado: "+mayor);
                System.out.println("El promedio de los numeros ingresados: "+promedio);
            }else if(menu==3){
            }else if(menu==4){
            }else{
                System.out.println("HASTA LUEGO.");
            }
        }
    }
}
