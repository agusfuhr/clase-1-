/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

import java.util.Scanner;

public class Ejercicio1
{

    public static void main(String[] args)
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numero = lector.nextInt();

        Scanner lector2 = new Scanner(System.in);
        System.out.println("Ingrese segundo numero");
        float numero2 = lector2.nextInt();

        System.out.println("la suma es " + (numero + numero2));
        System.out.println("la resta es " + (numero - numero2));

        float multiplicacion = (numero * numero2);
        float division = (numero / numero2);
        System.out.println("la multiplicacion es " + multiplicacion);
        System.out.println("la division es " + division);

        float aa = (numero % numero2);
        System.out.println("el operador resto " + aa);
      
       
    }

}
