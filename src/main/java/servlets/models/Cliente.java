package servlets.models;

public class Cliente {
    private int matricula;
    private String nome;
    private String endereco;
    private String modalidade;

    // Getters e Setters

    // Construtor
    public Cliente(int matricula, String nome, String endereco, String modalidade) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.modalidade = modalidade;
    }

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
}