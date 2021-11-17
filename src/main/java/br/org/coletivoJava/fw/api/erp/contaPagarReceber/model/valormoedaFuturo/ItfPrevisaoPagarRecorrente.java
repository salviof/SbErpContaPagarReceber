/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.valormoedaFuturo;

import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.assinatura.ItfFaturaAssinatura;

/**
 *
 * @author sfurbino
 */
public interface ItfPrevisaoPagarRecorrente extends ItfPrevisaoValorMoedaRecorrente {

    @Override
    public double getParcelaNumero();

    @Override
    public void setParcelaNumero(double parcelaNumero);
}
