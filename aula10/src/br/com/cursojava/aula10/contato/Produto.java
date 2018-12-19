package br.com.cursojava.aula10.contato;

	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="produtos") // indica qual tabela que está relacionado esta classe
	public class Produto {
		
		
		@Id // QUEM IRA GERAR O ID
		@GeneratedValue(strategy = GenerationType.IDENTITY) // DEFINIR QUE IRA DEFINIR O ID, neste caso o proprio BD que é serial neste exemplo
		private Integer id;
		@Column(nullable=false) // indica que a propriedade abaixo representa uma coluna na tabela (opção opcional)
		private String produto;
		@Column(nullable=false)
		private Double preco;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getProduto() {
			return produto;
		}
		public void setProduto(String produto) {
			this.produto = produto;
		}
		public Double getPreco() {
			return preco;
		}
		public void setPreco(Double preco) {
			this.preco = preco;
		}
		@Override
		public String toString() {
			return "Produto [id=" + id + ", produto=" + produto + ", preco=" + preco + "]";
		}
		public Produto(Integer id, String produto, Double preco) {
			super();
			this.id = id;
			this.produto = produto;
			this.preco = preco;
		}
		
		public Produto(){
			
			super();
		}
		

}
