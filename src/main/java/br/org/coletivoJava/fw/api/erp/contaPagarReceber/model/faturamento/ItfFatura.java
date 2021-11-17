/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.faturamento;

import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.formaPagamento.ItfFormaPagamento;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.financeiro.ItfPessoaFisicoJuridico;
import java.util.Date;
import java.util.List;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.valormoedaFuturo.ItfPrevisaoValorMoeda;

/**
 *
 *
 * @author sfurbino
 */
public interface ItfFatura extends ItfBeanSimples {

    public List<ItfPrevisaoValorMoeda> getParcelas();

    public double getValorTotal();

    public ItfFormaPagamento getFormaPagamento();

    public int getDiaDoMesVencimento();

    public Date getDataPrimeiroPagamento();

    public int getQtdParcelas();

    void setDataPrimeiroPagamento(Date dataPrimeiroPagamento);

    void setDiaDoMesVencimento(int diaDoMesPagamento);

    void setFormaPagamento(ItfFormaPagamento formaPagamento);

    void setParcelas(List<ItfPrevisaoValorMoeda> parcelas);

    void setQtdParcelas(int qtdParcelas);

    void setTipoFatura(String tipoFatura);

    void setValorTotal(double valorTotal);

    public ItfPessoaFisicoJuridico getDevedor();
}
