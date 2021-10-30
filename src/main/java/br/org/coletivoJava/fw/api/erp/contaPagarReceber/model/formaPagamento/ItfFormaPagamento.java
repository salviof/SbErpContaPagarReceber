/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.formaPagamento;

/**
 *
 * @author sfurbino
 */
public interface ItfFormaPagamento {

    public String getDescricao();

    public String getIcone();

    public int getId();

    public String getNome();

    public void setDescricao(String descricao);

    public void setIcone(String icone);

    public void setId(int id);

    public void setNome(String nome);

}
