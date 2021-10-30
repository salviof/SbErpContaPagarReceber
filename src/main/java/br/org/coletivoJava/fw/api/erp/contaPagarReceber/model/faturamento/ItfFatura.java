/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.faturamento;

import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.formaPagamento.ItfFormaPagamento;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.valormoedaFuturo.ItfValorMoedaFuturo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.util.Date;
import java.util.List;

/**
 *
 *
 * @author sfurbino
 */
public interface ItfFatura extends ItfBeanSimples {

    public List<ItfValorMoedaFuturo> getParcelas();

    public double getValorTotal();

    public ItfFormaPagamento getFormaPagamento();

    public int getDiaDoMesPagamento();

    public Date getDataPrimeiroPagamento();

    public int getQtdParcelas();

    void setDataPrimeiroPagamento(Date dataPrimeiroPagamento);

    void setDiaDoMesPagamento(int diaDoMesPagamento);

    void setFormaPagamento(ItfFormaPagamento formaPagamento);

    void setParcelas(List<ItfValorMoedaFuturo> parcelas);

    void setQtdParcelas(int qtdParcelas);

    void setTipoFatura(String tipoFatura);

    void setValorTotal(double valorTotal);
}
