package br.org.coletivoJava.fw.api.erp.contapagarreceber;

import javax.inject.Qualifier;
import com.super_bits.modulosSB.SBCore.modulos.erp.InfoReferenciaApiErp;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.apiCore.ERPContaPagarReceber;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.apiCore.ItfERPContaPagarReceber;

@Qualifier
@InfoReferenciaApiErp(tipoObjeto = ERPContaPagarReceber.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CtPagarReceberGalaxPayTestes {
}