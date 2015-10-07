

package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {

    
    public static void main(String[] args) {
        float num1, num2, suma,resta,multi,cociente;
        Scanner obx= new Scanner(System.in);
        System.out.println("introduce el primer numero : ");
        num1=obx.nextFloat();
        System.out.println("introduce el segundo numero : ");
        num2=obx.nextFloat();
        suma=num1+num2;
        resta=num1-num2;
        multi=num1*num2;
        cociente=num1/num2;
        System.out.println("suma : "+suma);
        System.out.println("resta : "+resta);
        System.out.println("multiplicacion : "+multi);
        System.out.println("cociente : "+cociente);
    }
    
}
