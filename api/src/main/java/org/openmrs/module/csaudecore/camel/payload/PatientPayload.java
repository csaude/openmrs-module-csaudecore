package org.openmrs.module.csaudecore.camel.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientPayload {
	
	private String identificador;
	
	@JsonProperty("nome")
	private String primeiroNome;
	
	@JsonProperty("sobrenome")
	private String sobrenome;
	
	@JsonProperty("apelido")
	private String apelido;
	
	@JsonProperty("dataNascimento")
	private String dataNascimento;
	
	@JsonProperty("sexo")
	private String sexo;
	
	@JsonProperty("provincia")
	private String provincia;
	
	@JsonProperty("distrito")
	private String distrito;
	
	@JsonProperty("postoAdministrativo")
	private String postoAdministrativo;
	
	@JsonProperty("localidade")
	private String localidade;
	
	@JsonProperty("morada")
	private String avenidaRuaCasa;
	
	@JsonProperty("pontoReferencia")
	private String pontoReferencia;
	
	@JsonProperty("contacto")
	private String numeroTelefone1;
	
	@JsonProperty("contactoAlternativo")
	private String numeroTelefone2;
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String getDistrito() {
		return distrito;
	}
	
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	public String getPostoAdministrativo() {
		return postoAdministrativo;
	}
	
	public void setPostoAdministrativo(String postoAdministrativo) {
		this.postoAdministrativo = postoAdministrativo;
	}
	
	public String getLocalidade() {
		return localidade;
	}
	
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	public String getAvenidaRuaCasa() {
		return avenidaRuaCasa;
	}
	
	public void setAvenidaRuaCasa(String avenidaRuaCasa) {
		this.avenidaRuaCasa = avenidaRuaCasa;
	}
	
	public String getPontoReferencia() {
		return pontoReferencia;
	}
	
	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}
	
	public String getNumeroTelefone1() {
		return numeroTelefone1;
	}
	
	public void setNumeroTelefone1(String numeroTelefone1) {
		this.numeroTelefone1 = numeroTelefone1;
	}
	
	public String getNumeroTelefone2() {
		return numeroTelefone2;
	}
	
	public void setNumeroTelefone2(String numeroTelefone2) {
		this.numeroTelefone2 = numeroTelefone2;
	}
	
	public HistoricoClinico getHistoricoClinico() {
		return historicoClinico;
	}
	
	public void setHistoricoClinico(HistoricoClinico historicoClinico) {
		this.historicoClinico = historicoClinico;
	}
	
	@JsonProperty("historicoClinico")
	private HistoricoClinico historicoClinico;
	
	public static class HistoricoClinico {
		
		@JsonProperty("servicoSaude")
		private String nomePrograma;
		
		@JsonProperty("dataAdmissao")
		private String dataInicio;
		
		@JsonProperty("notasInicio")
		private String estadoPrograma;
		
		@JsonProperty("sectorClinico")
		private String sectorClinico;
		
		@JsonProperty("dataInicio")
		private String dataActualSistema;
		
		public String getNomePrograma() {
			return nomePrograma;
		}
		
		public void setNomePrograma(String nomePrograma) {
			this.nomePrograma = nomePrograma;
		}
		
		public String getDataInicio() {
			return dataInicio;
		}
		
		public void setDataInicio(String dataInicio) {
			this.dataInicio = dataInicio;
		}
		
		public String getEstadoPrograma() {
			return estadoPrograma;
		}
		
		public void setEstadoPrograma(String estadoPrograma) {
			this.estadoPrograma = estadoPrograma;
		}
		
		public String getSectorClinico() {
			return sectorClinico;
		}
		
		public void setSectorClinico(String sectorClinico) {
			this.sectorClinico = sectorClinico;
		}
		
		public String getDataActualSistema() {
			return dataActualSistema;
		}
		
		public void setDataActualSistema(String dataActualSistema) {
			this.dataActualSistema = dataActualSistema;
		}
	}
	
}
