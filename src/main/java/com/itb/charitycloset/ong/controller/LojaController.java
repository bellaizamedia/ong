package com.itb.charitycloset.ong.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.charitycloset.ong.model.Produto;

@Controller
@RequestMapping ("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listaProdutos() {
		
		Produto p1 = new Produto();
		p1.setId (20l);
		p1.setNome("Máquina de Lavar Brastemp 15 l");
		p1.setCodigoBarras("15649834GKDF457UIHU670");
		p1.setDescricao("Produto linha branca com painel digital");
		p1.setPreco(3855.79);
		
		Produto p2 = new Produto();
		p1.setId (20l);
		p1.setNome("Máquina 2 em um de fazer açaí montado + milk shake multiplos sabores");
		p1.setCodigoBarras("1576976834GKDF457UIHU670");
		p1.setDescricao("Produto linha rosa com painel digital");
		p1.setPreco(3855.79);
		
		Produto p3 = new Produto();
		p1.setId (20l);
		p1.setNome("Vela aromática inacabável com aroma de grama molhada e cheiro suave de morango e cereja");
		p1.setCodigoBarras("1576976834GKDF457UIHU670");
		p1.setDescricao("Produto linha vermelha");
		p1.setPreco(3855.79);
		
		listaDeProdutos.add(p1);
		
		
		return "produtos";
		
	}

}
