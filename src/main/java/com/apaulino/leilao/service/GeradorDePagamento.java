package com.apaulino.leilao.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apaulino.leilao.dao.PagamentoDao;
import com.apaulino.leilao.model.Lance;
import com.apaulino.leilao.model.Pagamento;

@Service
public class GeradorDePagamento {

	@Autowired
	private PagamentoDao pagamentos;

	public void gerarPagamento(Lance lanceVencedor) {
		LocalDate vencimento = LocalDate.now().plusDays(1);
		Pagamento pagamento = new Pagamento(lanceVencedor, vencimento);
		this.pagamentos.salvar(pagamento);
	}

}
