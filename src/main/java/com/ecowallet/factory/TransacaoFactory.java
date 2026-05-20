package com.ecowallet.factory;

import com.ecowallet.model.*;

import java.time.LocalDate;

public class TransacaoFactory {

    public static Transacao criarTransacao(
        String tipo,
        String descricao,
        double valor,
        LocalDate data,
        Categoria categoria) {

    if(tipo.equalsIgnoreCase("RECEITA")) {

        return new Receita(descricao, valor, data, categoria);
    }

        return new Despesa(descricao, valor, data, categoria);
      
    }
}