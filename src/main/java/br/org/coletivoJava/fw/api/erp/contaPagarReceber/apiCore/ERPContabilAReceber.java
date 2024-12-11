/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.contaPagarReceber.apiCore;

/**
 *
 * @author desenvolvedorninja01
 */
import com.super_bits.modulosSB.SBCore.modulos.erp.ApiERPColetivoJavaFW;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;

@ApiERPColetivoJavaFW(descricaoApi = "Codigo Postal BR", nomeApi = "ContaPagarReceber", slugInicial = "CtPagarReceber")
public enum ERPContabilAReceber implements ItfApiErpSuperBits<ItfERPContabilAReceber> {

    GALAX_PAY,
    PAGUE_SEGURO,
    COLETIVO_JAVA_SERVICES;

    @Override
    public Class<? extends ItfERPContabilAReceber> getInterface() {

        return ItfERPContabilAReceber.class;
    }
}
