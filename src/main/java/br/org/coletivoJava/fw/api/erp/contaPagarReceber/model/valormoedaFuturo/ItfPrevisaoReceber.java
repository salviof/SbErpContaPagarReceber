/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.valormoedaFuturo;

import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.assinatura.ItfFaturaAssinatura;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.faturamento.ItfFatura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.financeiro.ItfPessoaFisicoJuridico;

/**
 * @author sfurbino
 * @since 19/02/2020
 * @version 1.0
 */
public interface ItfPrevisaoReceber extends ItfPrevisaoValorMoeda {

    @InfoCampo(tipo = FabTipoAtributoObjeto.OBJETO_DE_UMA_LISTA)
    public ItfPessoaFisicoJuridico getDevedor();

    public ItfFatura getFatura();

    /**
     *
     * @return @deprecated Substituido por getComoRecorrente
     */
    @Deprecated
    public default ItfPrevisaoReceberRecorrente getComoMensalidade() {
        return (ItfPrevisaoReceberRecorrente) this;
    }

    public default ItfPrevisaoReceberRecorrente getComoRecorrente() {
        return (ItfPrevisaoReceberRecorrente) this;
    }

    public default ItfPrevisaoReceber getComoSazonal() {
        return (ItfPrevisaoReceber) this;
    }
}
