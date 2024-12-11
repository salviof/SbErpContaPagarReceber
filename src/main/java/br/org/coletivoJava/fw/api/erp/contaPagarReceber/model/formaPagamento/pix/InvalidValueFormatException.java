/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.formaPagamento.pix;

import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ErroValidacao;

/**
 *
 * @author salvio
 */
public class InvalidValueFormatException extends ErroValidacao {

    public InvalidValueFormatException(String pMensagem) {
        super(pMensagem);
    }

}
