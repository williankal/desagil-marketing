package br.edu.insper.desagil.redesocial;

public class Produto {
		private String nome;
		private double preco;
		
		public Produto (String Nome, double preco) {
			this.nome = nome;
			this.preco = preco;
			}
		
		public double getPreco() {
			return this.preco;
		}
		
		public String getNome() {
			return this.nome;
		}
}
