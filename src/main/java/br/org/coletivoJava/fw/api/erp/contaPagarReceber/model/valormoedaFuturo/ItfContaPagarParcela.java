/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.valormoedaFuturo;

import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.faturamento.ItfFatura;

/**
 *
 * @author sfurbino
 */
public interface ItfContaPagarParcela extends ItfContaPagar {

    public ItfFatura getFatura();

    public double getParcelaNumero();

    public void setParcelaNumero(double parcelaNumero);
}
