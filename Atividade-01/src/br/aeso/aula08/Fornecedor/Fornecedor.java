package br.aeso.aula08.Fornecedor;
import br.aeso.aula08.Endereço.*;

public class Fornecedor {
	
	private Integer codigo;
	private String nome;
	private String cpf;
	private String banco;
	private Endereco endereco;
	
	
	public Fornecedor(){}
		
		public Fornecedor(Integer codigo, String nome, String cpf, String banco, Endereco endereco ){
			
			this.codigo = codigo;
			this.nome = nome;
			this.cpf = cpf;
			this.banco = banco;
			this.endereco = endereco;
			
			
	
			
			
		}

		public Integer getCodigo() {
			return codigo;
		}

		public void setCodigo(Integer NovoCodigo) {
			this.codigo = NovoCodigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome.trim();
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getBanco() {
			return banco;
		}

		public void setBanco(String banco) {
			this.banco = banco;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
	}
	


