package br.org.coletivoJava.fw.api.erp.contaPagarReceber.apiCore;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.financeiro.ItfPessoaFisicoJuridico;
import java.util.List;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.assinatura.ItfFaturaAssinatura;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.valormoedaFuturo.ItfPrevisaoValorMoeda;
import br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.valormoedaFuturo.ItfPrevisaoValorMoedaRecorrente;
import java.util.Date;

/**
 * @author desenvolvedorninja01
 * @since 16/10/2019
 * @version 1.0
 */
public interface ItfERPContaPagarReceber {

    public ItfPrevisaoValorMoeda getCobrancaSazonal(Date pDataVencimento, double pValor, ItfPessoaFisicoJuridico pDevedor);

    public ItfPrevisaoValorMoedaRecorrente getCobrancaAssinatura(Date pDataVencimento, double pValor, ItfPessoaFisicoJuridico pDevedor);

    public ItfFaturaAssinatura getAssinatura(ItfFaturaAssinatura pFaturaRecorrente);

    public List<ItfPrevisaoValorMoeda> getCobrancasSazonaisEmAberto(ItfPessoaFisicoJuridico pPessoas);

    public List<ItfFaturaAssinatura> getAssinaturasAtivas(ItfPessoaFisicoJuridico pPessoas);

    public List<ItfPessoaFisicoJuridico> getDevedoresRegistrados();

    public ItfPessoaFisicoJuridico getDevedorByCNPJ(String pCNPJ);

    public List<ItfPessoaFisicoJuridico> getDevedorByIdExterno(String pIDplataforma);

    public List<ItfPessoaFisicoJuridico> getDevedorByIdAplicacao(int pIdLocal);

}
