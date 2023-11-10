package com.apaulino.leilao.service;

import org.springframework.stereotype.Service;

import com.apaulino.leilao.model.Lance;
import com.apaulino.leilao.model.Leilao;
import com.apaulino.leilao.model.Usuario;

@Service
public class EnviadorDeEmails {

	// apenas simula o envio de um email...
	public void enviarEmailVencedorLeilao(Lance lanceVencedor) {
		Usuario vencedor = lanceVencedor.getUsuario();
		Leilao leilao = lanceVencedor.getLeilao();

		String email = String.format("Parabens {}! Voce venceu o leilao {} com o lance de R${}", vencedor.getNome(),
				leilao.getNome(), lanceVencedor.getValor());

		System.out.println(email);
	}

}
