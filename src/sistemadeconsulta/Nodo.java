package sistemadeconsulta;

import java.util.List;

public class Nodo<E> {
    private E objeto;
    private Nodo<E> nodoSiguiente;

    public Nodo(E objeto) {
        this.objeto = objeto;
    }

    public E getObjeto() {
        return objeto;
    }

    public void setObjeto(E objeto) {
        this.objeto = objeto;
    }

    public Nodo<E> getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo<E> nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
        List<String> e;
    }
}
