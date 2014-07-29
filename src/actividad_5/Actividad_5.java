/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actividad_5;

/**
 *
 * @author KrRD
 */
public class Actividad_5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int empleados[][] = {{105, 4, 2, 8, 10, 3, 1},
        {143, 5, 4, 3, 8, 10, 20},
        {135, 3, 50, 32, 1, 0, 0},
        {170, 2, 55, 0, 1, 1, 10},
        {193, 8, 0, 0, 0, 0, 80}};

        int precios[] = {10, 5, 2, 20, 15, 12};

        System.out.println("Esta es la comisión para cada uno de los empleados: ");
        System.out.println("");

        int comision[] = new int[6];

        for (int i = 0; i < empleados.length; i++) {
            for (int j = 0; j < empleados[i].length - 1; j++) {

                comision[i] += empleados[i][j + 1] * precios[j];

            }
        }
        double pago = 0;
        for (int i = 0; i < empleados.length; i++) {

            pago = comision[i] * 5 / 100;
            System.out.println("La comisión del empleado " + empleados[i][0] + " es de: $" + pago);

        }
        System.out.println("");
        System.out.println("Esta es la suma de articulos vendidos por empleado: ");

        System.out.println(" ");
        int j, suma = 0;

        for (int i = 0; i < empleados.length; i++) {
            j = 1;
            while (j < empleados[i].length) {
                suma += empleados[i][j];
                j++;
            }
            System.out.println("El empleado " + empleados[i][0] + " vendio " + suma + " articulos");
            suma = 0;
        }
        System.out.println(" ");
        System.out.println("Esta es la cantidad vendida por cada articulo:");
        System.out.println(" ");

        int sum[] = new int[6];
        int m=0;
        for (int i = 0; i < empleados[0].length - 1; i++) {
            if(m<7)m++;
            for (int k = 0; k < empleados.length; k++) {

                sum[i] += empleados[k][i + 1];
            }
            System.out.println("Articulo "+ m +" = "+sum[i]);
        }
        System.out.println(" ");
    }
}
 