package laboratorioweek5;

import java.util.InputMismatchException;
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
                int filas=0;
                int numeros=1;
                do{
                    try{
                    System.out.print("Ingresar el numero de filas: ");
                    filas=lea.nextInt();
                    }catch(InputMismatchException e){
                        System.out.println("No puede ingresar letras o decimales");
                        lea.nextLine();
                    }
                }while(filas<=0);
                for(int contador=1;contador<=filas;contador++){
                    int suma=0;
                    for(int espacio=1;espacio<=contador;espacio++){
                        System.out.print(" "+numeros);
                        suma+=numeros;
                        numeros+=2;
                    }
                    System.out.println(" = "+suma);
                }
            }else if(menu==2){
                int numeros=0;
                //mayor numero
                int mayor=0;
                //para promedio
                int vecesIngreso=0;
                int suma=0;
                double promedio=0;
                String respuesta="si";
                do{
                    try{
                    System.out.print("Ingresar numeros enteros: ");
                    numeros=lea.nextInt();
                    }catch(InputMismatchException e){
                        System.out.println("No puede ingresar decimales y menos letras.");
                        lea.nextLine();
                    }
                    while(numeros>mayor){
                        mayor=numeros;
                    }
                    suma+=numeros;
                    vecesIngreso++;
                    promedio=suma/vecesIngreso;
                    do{
                    System.out.println("Desea seguir ingresando numeros(SI/NO): ");
                    respuesta=lea.next().toLowerCase();
                    }while(!respuesta.equals("no")&&!respuesta.equals("si"));
                }while(respuesta.equals("si"));
                System.out.println("El numero mayor ingresado: "+mayor);
                System.out.println("El promedio de los numeros ingresados: "+String.format("%.2f", promedio));
            }else if(menu==3){
                String canal;
                //contadores
                int normal=0;
                int hd=0;
                //
                String digital;
                //billete
                int dinero=0;
                //impuesto
                double impuesto=0;
                //total
                double total=0;
                String pregunta="si";
                System.out.print("Ingrese nombre del cliente: ");
                String nombre=lea.next();
                do{
                    do{
                        System.out.println("Tipos de canales: NORMAL/HD");
                        System.out.print("Ingrese tipo de canal: ");
                        canal=lea.next().toUpperCase();
                        if(!canal.equals("NORMAL")&&!canal.equals("HD")){
                            System.out.println("Ingrese HD o Normal");
                        }
                    }while(!canal.equals("NORMAL")&&!canal.equals("HD"));
                    if(canal.equals("NORMAL")){
                        normal++;
                        dinero+=20;
                    }
                    if(canal.equals("HD")){
                        hd++;
                        dinero+=30;
                    }
                    do{
                    System.out.print("Desea otro canal?(SI/NO): ");
                    pregunta=lea.next();
                    }while(!pregunta.equals("no")&&!pregunta.equals("si"));
                }while(pregunta.equalsIgnoreCase("si"));
                do{
                    System.out.println("50 lps por tener una LIGHTBOX\n100 por una HDBOX\n150 si se tiene una DVRBOX.");
                    System.out.print("Que tipo de caja digital desea: ");
                    digital=lea.next().toUpperCase();
                }while(!digital.equals("LIGHTBOX")&&!digital.equals("HDBOX")&&!digital.equals("DVRBOX"));
                if(digital.equals("LIGHTBOX")){
                    dinero+=50;
                }
                if(digital.equals("HDBOX")){
                    dinero+=100;
                }
                if(digital.equals("DVRBOX")){
                    dinero+=150;
                }
                impuesto=dinero*0.15;
                //
                total=dinero+impuesto;
                //factura
                System.out.println("");
                System.out.println("NORMALES ingresados: "+normal);
                System.out.println("HD ingresados: "+hd);
                System.out.println("Subtotal a pagar: L."+dinero);
                System.out.println("Impuesto con el 15%: L."+String.format("%.2f", impuesto));
                System.out.println("Total a pagar del cliente "+nombre+": L."+String.format("%.2f", total));
            }else if(menu==4){
                int sumaVocales=0;
                String palabra="";
                System.out.print("Ingresar cadena de texto: ");
                palabra=lea.next().toLowerCase();
                
                for(int contador=0;contador<palabra.length();contador++){
                    char letras=palabra.charAt(contador);
                    
                    switch(letras){
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            sumaVocales++;
                    }
                }
                System.out.println("La palabra que se ingreso tiene "+sumaVocales+" vocales.");
            }else{
                System.out.println("HASTA LUEGO.");
            }
        }
    }
}
