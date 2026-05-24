package com.ecowallet.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TelaPrincipalController {

    @FXML
    private TextField campoDescricao;

    @FXML
    private TextField campoValor;

    @FXML
    private ComboBox<String> comboTipo;

    @FXML
    private ComboBox<String> comboCategoria;

    @FXML
    private DatePicker campoData;

    @FXML
    private Label labelSaldo;

    private double saldo = 0;

    private ObservableList<String> transacoes =
        FXCollections.observableArrayList();

    @FXML
    public void initialize() {

    comboTipo.getItems().clear();
    comboCategoria.getItems().clear();

    comboTipo.getItems().add("Receita");
    comboTipo.getItems().add("Despesa");
    comboCategoria.getItems().add("Alimentação");
    comboCategoria.getItems().add("Transporte");
    comboCategoria.getItems().add("Saúde");
    comboCategoria.getItems().add("Lazer");
    comboCategoria.getItems().add("Salário");
    comboCategoria.getItems().add("Outros");

}

    public TelaPrincipalController() {

    }

    @FXML
    public void adicionarReceita() {

        double valor = Double.parseDouble(
            campoValor.getText().replace(",", ".")
        );

        saldo += valor;
        transacoes.add(
            campoDescricao.getText()
        );
        labelSaldo.setText(
            "Saldo Total: R$ " + saldo
        );
    }

    @FXML
    public void adicionarDespesa() {

        double valor = Double.parseDouble(
            campoValor.getText().replace(",", ".")
        );

        saldo -= valor;
        transacoes.add(
           campoDescricao.getText()
        );

        labelSaldo.setText(
            "Saldo Total: R$ " + saldo
        );

    }

}