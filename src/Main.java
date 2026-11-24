/**
 * Plantilla base para probar los 3 casos de eliminación y el análisis de balanceo en ArbolBST.
 */
public class Main {
    public static void main(String[] args) {
        ArbolBST arbol = new ArbolBST();
        int[] secuencia = { 50, 30, 70, 20, 40, 60, 80 };
        for (int numero : secuencia) {
            arbol.insertar(numero);
        }

        System.out.println("Inorden inicial: " + String.join(" -> ", arbol.recorridoInorden()));

        // TODO A: Eliminar el nodo hoja 20 y mostrar el recorrido Inorden resultante.

        // TODO B: Eliminar el nodo 30 (que ahora tiene un solo hijo) y luego el nodo 50 (dos hijos),
        // imprimiendo el recorrido Inorden tras cada operación y la nueva raíz.

        // TODO C: Crear un segundo ArbolBST con la secuencia ordenada {10, 20, 30, 40, 50},
        // imprimir su altura, factor de equilibrio de la raíz y el resultado de estaBalanceado().
        System.out.println("Plantilla ArbolBST lista para completar (altura inicial: " + arbol.calcularAltura() + ")");
    }
}
