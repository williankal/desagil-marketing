package br.edu.insper.desagil.redesocial;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario {
	private List<Produto> produtos;
	
	public Vendedor(String nome){
		super(nome);
		this.produtos = new ArrayList<>();
		
	}
	public void cadastraProduto(String nome, double preco, Produto produtos){
		Produto produto = new Produto(nome,preco);
		this.produtos.add(produto);
		}
	

}
