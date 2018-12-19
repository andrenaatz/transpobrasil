package br.com.cursojava.aula10web.produto;

	
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
		private String nome;
		@Column(nullable=false)
		private Double preco;
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
		public Double getPreco() {
			return preco;
		}
		public void setPreco(Double preco) {
			this.preco = preco;
		}
		@Override
		public String toString() {
			return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
		}
		public Produto(Integer id, String produto, Double preco) {
			super();
			this.id = id;
			this.nome = produto;
			this.preco = preco;
		}
		
		public Produto(){
			
			super();
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((preco == null) ? 0 : preco.hashCode());
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Produto other = (Produto) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (preco == null) {
				if (other.preco != null)
					return false;
			} else if (!preco.equals(other.preco))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}
		

}
