/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.valormoedaFuturo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.util.Date;

/**
 * @author sfurbino
 * @since 19/02/2020
 * @version 1.0
 */
@InfoObjetoSB(tags = "Previsao Recurso futuro", plural = "Previsoes de Recursos futuros")
public interface ItfValorMoedaFuturo extends ItfBeanSimples {

    @InfoCampo(tipo = FabTipoAtributoObjeto.MOEDA_REAL)
    public double getValor();

    @InfoCampo(tipo = FabTipoAtributoObjeto.MOEDA_REAL)
    public double getValorRealizado();

    public void setValor(double valor);

    @InfoCampo(tipo = FabTipoAtributoObjeto.DATA)
    public Date getDataPrevista();

    public void setDataPrevista(Date pDataPrevista);

    @InfoCampo(tipo = FabTipoAtributoObjeto.VERDADEIRO_FALSO, somenteLeitura = true)
    //@InfoCampoVerdadeiroOuFalso(textoPositivo = "Sim", textoNegativo = "NÃO")
    public boolean isPagamentoEfetuado();

    @InfoCampo(tipo = FabTipoAtributoObjeto.VERDADEIRO_FALSO, somenteLeitura = true)
    public boolean isUmValorPersonalizado();

    @InfoCampo(tipo = FabTipoAtributoObjeto.PERCENTUAL, somenteLeitura = true)
    public double getParcelaNumero();

    public void setParcelaNumero(double parcelaNumero);

}
