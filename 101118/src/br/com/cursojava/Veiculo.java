package br.com.cursojava;

public class Veiculo {
	
	private Integer id;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int anoModelo;
	
	{
		
		System.out.println("Linha no bloco");
		
	}
	
	
	// construtores: 
	
	public Veiculo(Integer id){
		super();// ele sempre chama automaticamente, tendo definido a classe super ou nao
		this.id = id;
	}
	
	/*
	public Veiculo(){
		super();
		System.out.println("linha do construtor");
	}
	*/
	// private - somente um metodo da classe pode criar este construtor
	
	private Veiculo(String marca){ 
		
		this.marca = marca;
	}
	
	public static Veiculo build(String marca){
		
		this(marca);
		
	}
	
	public Veiculo(int ano){
		this();
		this.anoFabricacao = ano;		
	}
	
	// métodos:
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	@Override // Selecionar com botão direito --> Source --> toString
	public String toString() {
		return "Veiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao
				+ ", anoModelo=" + anoModelo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	// metodos que raramente sao usados
	//----------------------
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	//---------------------
	
	
	
	
	
	
	
	
	
	
	
	
	

}
