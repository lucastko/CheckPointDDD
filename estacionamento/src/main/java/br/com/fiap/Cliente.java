package br.com.fiap;

public class Cliente {
    
    private String nome;
    private String marca;
    private String modelo;
    private double valor;
    private String ClienteAtivo;
    
    
    public Cliente(String nome, String marca, String modelo, double valor, String clienteAtivo) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.ClienteAtivo = clienteAtivo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getClienteAtivo() {
        return ClienteAtivo;
    }
    public void setClienteAtivo(String clienteAtivo) {
        ClienteAtivo = clienteAtivo;
    }
    
    @Override
    public String toString() {
        return "Cliente: " + nome + "\nModelo do Veículo: " +  modelo + "\nMarca do Veículo: " + marca + "\nValor: R$" + valor + "\nStatus: " + ClienteAtivo;
    }
    
  
}





