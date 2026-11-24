import java.util.ArrayList;
import java.util.List;

/**
 * Plantilla base para la práctica de Eliminación en BST y Balanceo (Sesión 13).
 * Los métodos insertar(), buscar() y recorridoInorden() ya vienen listos desde la Sesión 12.
 * Completa los bloques TODO 1, TODO 2 y TODO 3.
 */
public class ArbolBST {
    private NodoBST raiz;

    public ArbolBST() {
        this.raiz = null;
    }

    public NodoBST getRaiz() {
        return raiz;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private NodoBST insertarRecursivo(NodoBST actual, int valor) {
        if (actual == null) {
            return new NodoBST(valor);
        }
        if (valor < actual.dato) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.dato) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        return actual;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(NodoBST actual, int valor) {
        if (actual == null) {
            return false;
        }
        if (valor == actual.dato) {
            return true;
        }
        return (valor < actual.dato)
                ? buscarRecursivo(actual.izquierdo, valor)
                : buscarRecursivo(actual.derecho, valor);
    }

    /**
     * TODO 1: Implementar encontrarMinimo(NodoBST nodo).
     * Debe descender por actual.izquierdo mientras no sea null y retornar actual.dato.
     */
    public int encontrarMinimo(NodoBST nodo) {
        // Completa aquí el recorrido hacia el extremo izquierdo del subárbol
        return nodo.dato;
    }

    /**
     * TODO 2: Completar eliminar(int valor) y eliminarRecursivo(NodoBST actual, int valor).
     */
    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    private NodoBST eliminarRecursivo(NodoBST actual, int valor) {
        if (actual == null) {
            return null;
        }

        // TODO 2A: Si valor < actual.dato bajar por actual.izquierdo; si valor > actual.dato bajar por actual.derecho.
        // TODO 2B: Cuando valor == actual.dato resolver los 3 casos:
        //   - Caso 1 (Hoja): izquierdo == null && derecho == null -> return null;
        //   - Caso 2 (Un hijo): retornar el hijo existente (derecho o izquierdo);
        //   - Caso 3 (Dos hijos): buscar sucesor = encontrarMinimo(actual.derecho),
        //     copiar actual.dato = sucesor y eliminar el duplicado en actual.derecho.
        return actual;
    }

    public List<String> recorridoInorden() {
        List<String> resultado = new ArrayList<>();
        inordenRecursivo(raiz, resultado);
        return resultado;
    }

    private void inordenRecursivo(NodoBST actual, List<String> resultado) {
        if (actual == null) {
            return;
        }
        inordenRecursivo(actual.izquierdo, resultado);
        resultado.add(String.valueOf(actual.dato));
        inordenRecursivo(actual.derecho, resultado);
    }

    public int calcularAltura() {
        return calcularAlturaRecursivo(raiz);
    }

    private int calcularAlturaRecursivo(NodoBST nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + Math.max(calcularAlturaRecursivo(nodo.izquierdo), calcularAlturaRecursivo(nodo.derecho));
    }

    /**
     * TODO 3: Implementar calcularFactorEquilibrio(NodoBST nodo) y estaBalanceado().
     * Factor de equilibrio = altura(izquierdo) - altura(derecho).
     * Un árbol está balanceado si en todo nodo |factor| <= 1 y ambos subárboles también lo están.
     */
    public int calcularFactorEquilibrio(NodoBST nodo) {
        // Completa aquí el cálculo de altura(izquierdo) - altura(derecho)
        return 0;
    }

    public boolean estaBalanceado() {
        return estaBalanceadoRecursivo(raiz);
    }

    private boolean estaBalanceadoRecursivo(NodoBST nodo) {
        // Completa aquí la verificación recursiva de equilibrio
        return false;
    }
}
