/*
*	grupo  : GDAM 1.1
*	alumno : Alonso Hernandez
*	n.exp. : 7075
*	fecha  :  01/06/2022
 */
package Cheese;

/**
 *
 * @author ___
 */
public class Main {
    
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         
         ListaProductos lp = new ListaProductos();
         
         Producto pro1 = new Producto("1234","semi",50,2);
         Producto pro2 = new Producto("1235","entera",40,1);
         Producto pro3 = new Producto("1236","semi",60,2);
         
         
         lp.addProducto(pro1);
         lp.addProducto(pro2);
         lp.addProducto(pro3);
         
         pro1.imprime_detalle();
         pro2.imprime_detalle();
         pro3.imprime_detalle();
         
         
         
         
    }
}
