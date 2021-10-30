package br.org.coletivoJava.fw.api.erp.contaPagarReceber.apiCore;

import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.faturamento.ItfFatura;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.regsitroCobranca.ItfRegistroCobranca;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.regsitroCobranca.ItfRegistroCobrancaAssinatura;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.valormoedaFuturo.ItfValorMoedaFuturo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.financeiro.ItfPessoaFisicoJuridico;
import java.util.List;

/**
 * @author desenvolvedorninja01
 * @since 16/10/2019
 * @version 1.0
 */
public interface ItfERPContaPagarReceber {

    public ItfRegistroCobranca getRegistroCobranca(ItfValorMoedaFuturo pValor);

    public ItfRegistroCobrancaAssinatura getRegistroAssinatura(ItfFatura pFaturaRecorrente);

    public List<ItfRegistroCobranca> getRegistrosEmAberto(ItfPessoaFisicoJuridico pPessoas);

    public List<ItfRegistroCobrancaAssinatura> getAssinaturasAtivas(ItfPessoaFisicoJuridico pPessoas);

    public List<ItfPessoaFisicoJuridico> getClientesRegistrados();

    public List<ItfPessoaFisicoJuridico> getDevedorByCNPJ(String pCNPJ);

    public List<ItfPessoaFisicoJuridico> getDevedorByIdExterno(String pCNPJ);

    public List<ItfPessoaFisicoJuridico> getDevedorByIdAplicacao(int pId);

}
