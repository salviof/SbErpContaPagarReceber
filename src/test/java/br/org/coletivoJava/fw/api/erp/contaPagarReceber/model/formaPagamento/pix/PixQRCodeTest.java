/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.formaPagamento.pix;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author salvio
 */
public class PixQRCodeTest {

    public PixQRCodeTest() {
    }

    @Test
    public void testePagamento2() {
        final PixQRCode myPixWithoutValue;
        try {
            myPixWithoutValue = new PixQRCodeBuilder()
                    .receiverFullName("CAMILA MIGUEL BISSIGUINI")
                    .transactionIdentifier("doacaoprojeto")
                    .descricao("Pagamento referente ao recibo 123")
                    .receiverCity("Belo Horizonte")
                    .pixKey("plataforma@casanovadigital.com.br")
                    .withValue(true)
                    .value(1.2)
                    .build();
            System.out.println(myPixWithoutValue.getAsText());
        } catch (InvalidValueFormatException ex) {
            Logger.getLogger(PixQRCodeTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
