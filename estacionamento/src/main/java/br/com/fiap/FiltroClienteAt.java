package br.com.fiap;

import java.util.Comparator;

public class FiltroClienteAt implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) {

        return o1.getClienteAtivo().compareTo(o2.getClienteAtivo());
    }
    
}