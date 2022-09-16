package br.com.fiap;

import java.util.Comparator;

public class FiltroValor implements Comparator<Cliente> {

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return Double.compare(o1.getValor(), o2.getValor());
    }
    
}