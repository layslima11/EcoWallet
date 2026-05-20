package com.ecowallet.service;

import com.ecowallet.model.Transacao;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFinancas {

    private List<Transacao> transacoes;

    public GerenciadorFinancas() {

        transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {

        transacoes.add(transacao);
    }

    public double calcularSaldo() {

        double saldo = 0;

        for (Transacao transacao : transacoes) {

            saldo += transacao.getValorParaSaldo(); 
        }

        return saldo;
    }

    public List<Transacao> getTransacoes() {

        return transacoes;
    }
}