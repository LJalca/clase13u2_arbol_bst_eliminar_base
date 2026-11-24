# Guía de Estudio Individual (TA • 1.0h): Reconexión de Enlaces al Eliminar Nodos con Dos Hijos

**Asignatura:** Estructuras de Datos y Algoritmos (`CDS-0202`) — Unidad 2 • Sesión 13 (24/11/2026)  
**Tema:** Eliminación Caso 3 en un Árbol Binario de Búsqueda (BST) mediante el Sucesor Inorden

---

## 1. ¿Por qué el Caso 3 Requiere Cuidado Especial?
Cuando eliminamos un nodo que posee **subárbol izquierdo y subárbol derecho** (por ejemplo, la raíz `50`), no podemos desconectar simplemente el nodo porque dejaríamos dos subárboles sueltos. Tampoco podemos subir directamente cualquiera de sus hijos sin revisar el orden de todo el resto del árbol.

## 2. Cómo Funciona el Sucesor Inorden
El **Sucesor Inorden** de un nodo `X` es el número más pequeño que sea mayor que `X`. En cualquier BST se encuentra aplicando siempre la misma ruta:
1. Dar **un paso a la derecha** (`X.derecho`).
2. Bajar **siempre a la izquierda** hasta encontrar un nodo cuyo enlace `izquierdo` sea `null`.

### Trazado Guiado sobre `{50, 30, 70, 20, 40, 60, 80, 55}` (Eliminar `50`):
- **Paso 1:** Entramos a `50.derecho` (`70`) y bajamos hacia la izquierda: `70 -> 60 -> 55`. El Sucesor Inorden es **`55`**.
- **Paso 2:** Copiamos `55` en el lugar de `50`. Ahora `55` cumple que todo lo que está a su izquierda (`20, 30, 40`) es menor y todo lo que está a su derecha (`60, 70, 80`) es mayor.
- **Paso 3:** Eliminamos el nodo original `55` dentro del subárbol derecho. Como `55` nunca puede tener hijo izquierdo, su borrado siempre será **Caso 1 (hoja)** o **Caso 2 (solo hijo derecho)**.

## 3. Preguntas de Estudio (Incluir en el Informe PDF)
1. Si el Sucesor Inorden tiene un hijo derecho (por ejemplo, `55` tuviera a `57` a su derecha), ¿qué ocurre con `57` al eliminar el duplicado `55`?
2. ¿Qué valor reemplazaría a `50` si utilizáramos el **Predecesor Inorden** en lugar del Sucesor Inorden?
3. ¿Por qué borrar repetidamente nodos eligiendo siempre el Sucesor Inorden puede desbalancear el árbol hacia la izquierda con el tiempo?
