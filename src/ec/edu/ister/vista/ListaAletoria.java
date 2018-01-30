package ec.edu.ister.vista;
import ec.edu.ister.modelo.Lista;
import java.util.Random;

/**
 *
 * Nombre: Cristian Calle
 */
/* 
Ejercicio 8.1
Crear una lista de números aleatorios. Insertar los nuevos nodos por la cabeza de la lista. Un vez 
creada la lista, se han de recorrer los nodos para mostrar los número pares.
*/
public class ListaAletoria {
    public static void main(String[] args) {
        Random r;
        int d;
        Lista lista;
        int k;
        r=new Random(); 
        lista=new Lista();                      // Crea una lista vacia
        k=Math.abs(r.nextInt()%55);             //Numero de nodos
                                                //Se insertan elementos de la lista
        for(;k>0;k--){
            d=r.nextInt()%99;
            lista.insertarCabezaLista(d);   
        }
                                                //Recorre la lista para escribir sus elementos
        System.out.println("Elementos de la lista generados al azar");
        lista.visualizar();    
    }

}
