package br.com.fiap;



import java.util.List;
import java.util.ResourceBundle;
import java.util.ArrayList;
import java.util.Collections;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;


public class PrimaryController implements Initializable {
    

    @FXML private TextField textFieldNome;
    @FXML private TextField textFieldMarca;
    @FXML private TextField textFieldModelo;
    @FXML private TextField textFieldValor;
    @FXML private ListView<Cliente> listView;
    @FXML ChoiceBox <String> choiceBoxClienteAtivo;

    private List<Cliente> lista = new ArrayList<>();


    private void botaoLimpar(){
    
        textFieldNome.setText("");
        textFieldMarca.setText("");
        textFieldModelo.setText("");
        textFieldValor.setText("");
    
    }

    public Cliente clienteFormulario(){
        String Nome = textFieldNome.getText();
        String Marca = textFieldMarca.getText();
        String Modelo = textFieldModelo.getText();
        String ClienteAtivo = choiceBoxClienteAtivo.getValue();
        Double Valor = Double.valueOf(textFieldValor.getText());
        
        
        return new Cliente(Nome, Marca, Modelo, Valor, ClienteAtivo);
            
    }

    private void atualizarLista() {
        listView.getItems().clear();
        listView.getItems().addAll(lista);
    }
    
    public void salvar(){
        lista.add(clienteFormulario());
        mostrarAlerta("Cliente Cadastrado!");
        botaoLimpar();
        atualizarLista();

    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }

     @Override

    public void initialize(URL arg0, ResourceBundle arg1) {
            choiceBoxClienteAtivo.getItems().addAll(List.of("ATIVO", "INATIVO"));
  

    }

    public void FiltroValor(){
        
        lista.sort((o1, o2) -> Double.compare(o1.getValor(), o2.getValor()) );
        atualizarLista();
    }
    public void FiltroNome(){
        
        lista.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome())); 
        atualizarLista();
    }
    public void FiltroModelo(){
        
        lista.sort((o1, o2) -> o1.getModelo().compareTo(o2.getModelo())); 
        atualizarLista();
    }
    public void FiltroClienteAt(){
        
        lista.sort((o1, o2) -> o1.getClienteAtivo().compareTo(o2.getClienteAtivo())); 
        atualizarLista();
    }


    }







///Definir função de cada atributo (GET E SET).
///Definir função do botão salvar e alert.
///Definir função do toolbar (Consultar(Nome, modelo, valor e marca)).
///Ver como deixar o cadastro ativo.
///Criar consulta apenas para clientes ativos.
///Usar collection 
///Usar Exception

