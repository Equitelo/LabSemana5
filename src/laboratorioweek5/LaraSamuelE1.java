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
            }else if(menu==3){
            }else if(menu==4){
            }else{
                System.out.println("HASTA LUEGO.");
            }
        }
    }
}
