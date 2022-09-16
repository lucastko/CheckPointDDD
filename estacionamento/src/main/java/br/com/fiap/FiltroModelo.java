package br.com.fiap;

import java.util.Comparator;

public class FiltroModelo implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) {

        return o1.getModelo().compareTo(o2.getModelo());
    }
    
}
