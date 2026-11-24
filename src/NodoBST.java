/**
 * Nodo para un Árbol Binario de Búsqueda (BST) de valores enteros.
 */
public class NodoBST {
    public int dato;
    public NodoBST izquierdo;
    public NodoBST derecho;

    public NodoBST(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
}
