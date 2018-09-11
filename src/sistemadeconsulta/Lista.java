/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeconsulta;

import java.util.List;

/**
 *
 * @author Equipo verde
 */
public class Lista<E> {
    private Nodo<E> nodoInicial;


    public void agregar(E elemento) {
        if(nodoInicial == null) {
            nodoInicial = new Nodo<>(elemento);
        } else {
            Nodo<E> puntero = nodoInicial;
            while (puntero.getNodoSiguiente() != null) {
                puntero = puntero.getNodoSiguiente();
            }
            puntero.setNodoSiguiente(new Nodo(elemento));
        }
    }

    public int tamanio() {
        int tamanio = 0;
        Nodo<E> puntero = nodoInicial;
        if(nodoInicial != null) {
            tamanio++;
        }
        while(puntero.getNodoSiguiente() != null) {
            tamanio++;
            puntero = puntero.getNodoSiguiente();
        }
        return tamanio;
    }

    public E obtener(int indice) {
        Nodo<E> puntero = nodoInicial;
        int indiceActual = 0;
        if(indice==0)
            return nodoInicial.getObjeto();
        indiceActual++;
        while(puntero.getNodoSiguiente()!=null) {
            if(indiceActual == indice)
                return puntero.getObjeto();
            else
                puntero = puntero.getNodoSiguiente();
            indiceActual++;
        }
        return null;
    }
}
