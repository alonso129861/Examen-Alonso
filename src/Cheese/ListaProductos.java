/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;


public class ListaProductos {

    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    
    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    }

    
    /**
     * Añade un producto a la lista de productos
     * @param prod producto que se agrega
     * @return el producto añadido o en caso de existir devuelve nulo
     */
    public Producto addProducto(Producto prod) {
        
        if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
    }

    
    /**
     * elimina un producto de la lista
     * @param codigo se busca el productoo con el codigo 
     * @return devuelve el producto que se elimina
     */
    public Producto eliminarProducto(String codigo) { 
        
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        return prod;
    }

    /**
     * busca productos que ya existen
     * @param codigo se busca el productoo con el codigo 
     * @return devuelve una lista de productos con el codigo indicado
     */
    
    public Producto buscarProducto(String codigo) { 
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }

    
    /**
     * genera una la lista conlos productos existentes
     * @return devuelve una lista con los productos existentes
     */
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    
    
    /**
     * busca el numero de productos que ya existen
     * @return devuelve el numero de productos que existen
     */
    public int totalProductos(){
            return this.getN();
    }
}
