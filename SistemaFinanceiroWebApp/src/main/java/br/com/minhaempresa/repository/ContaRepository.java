package br.com.minhaempresa.repository;

import javax.persistence.EntityManager;

public class ContaRepository {

    private EntityManager em = Conexao.getConexao();

    public double consultarSaldo(){
        return 0;
    }

    public void inserirDeposito(){

    }
}
