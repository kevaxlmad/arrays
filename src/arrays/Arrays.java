/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite,suma=0,promedio,may=0,men=0,inversa,op,posmay = 0,posmen = 0,temp;
        Scanner Lectura=new Scanner(System.in);
        System.out.println("Digite un limite");
        limite=Lectura.nextInt();
        int [] Vector= new int[limite];
        do {
            System.out.println("1) llenar el arreglo");
            System.out.println("2) sumar el arreglo");
            System.out.println("3) promedio");
            System.out.println("4) mayor y menor del arreglo y  la posicion de ellos");
            System.out.println("5) inversa");
            System.out.println("6) salir");
            op=Lectura.nextInt();
            switch(op)
            {
                case 1:for (int i = 0; i < limite; i++) 
                        {
                            System.out.println("digite el valor de la posicion "+i);
                            Vector[i]=Lectura.nextInt();                                            
                        }
                        
                    break;
                case 2:for (int i = 0; i < limite; i++) 
                        {
                          suma+=Vector[i];  
                        }System.out.println("la suma total de su vector es de "+suma);
                    break;
                case 3: promedio=suma/3;
                        System.out.println("el promedio es de "+promedio);
                    break;
                case 4: for (int i = 0; i < limite; i++) 
                        {
                        men=Vector[0];
                        may=Vector[0];
                        if (men>Vector[i]) 
                            {
                                men=Vector[i];
                                posmen=i;
                            }else if (may<Vector[i]) 
                            {
                                may=Vector[i];
                                posmay=i;
                                ;
                            }
                        }System.out.println("el menor es "+men+" y su posicion es "+posmen);
                        System.out.println();
                         System.out.println("el mayor es "+may+" y su posicion es "+posmay);
                    break;
                case 5: inversa=limite-1;
                        for (int i = 0; i < (limite/2); i++) 
                            {
                                temp=Vector[i];
                                Vector[i]=Vector[inversa];
                                Vector[inversa]=temp;
                                inversa--;
                            }
                        System.out.println("la inversa es :");
                        for (int i = 0; i < limite; i++) 
                        {
                            System.out.println("posicion "+i+") "+Vector[i]+"");
                            System.out.println("");
                        }
                    break;
                case 6:System.out.println("gracias "); 
                break;
                default:    System.err.println("Digite una opcion valida");
                break;
            }
        } while ((op<6)||(op>6));
        
    }
    
}
