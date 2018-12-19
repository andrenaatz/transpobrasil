package br.com.cursojava.exercicioaula009;

public class Produto {

			
		private Integer id;
		private String nome;
		private String descricao;
		private double preco;
		
		
		
		
		public Produto() {
			super();
		}




		public Produto(Integer id, String nome, String descricao, Double preco) {
			super();
			this.id = id;
			this.nome = nome;
			this.descricao = descricao;
			this.preco = preco;
		}




		public Integer getId() {
			return id;
		}




		public void setId(Integer id) {
			this.id = id;
		}




		public String getNome() {
			return nome;
		}




		public void setNome(String nome) {
			this.nome = nome;
		}




		public String getDescricao() {
			return descricao;
		}




		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}




		public Double getPreco() {
			return preco;
		}




		public void setPreco(Double preco) {
			this.preco = preco;
		}




		@Override
		public String toString() {
			return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
		}
		
		
		
		
		
		
	
	
}
