package datasource.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User implements Serializable {

	private static final long serialVersionUID = -1382904967579359990L;

	  @JsonProperty
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	  @JsonProperty
	@Column(name = "full_name")
	private String FullName;

	  @JsonProperty
	@Column(name = "CPF")
	private String Cpf;

	  @JsonProperty
	@Column(name = "Agency")
	private Integer Agency;

	  @JsonProperty
	@Column(name = "flaglevel")
	private Integer flaglevel;

	  @JsonProperty
	@Column(name = "Account")
	private String Account;

	  @JsonProperty
	@Column(name = "Departament")
	private Integer Departament;

	  @JsonProperty
	@Column(name = "Bank")
	private Integer Bank;
	
	  @JsonProperty
	@Column(name = "approver")
	private Integer Approver;

	  @JsonProperty
	@Column(name = "Login")
	private String Login;

	  @JsonProperty
	@Column(name = "Senha")
	private String Senha;

	  public void SetId(int id) {
	        this.Id = id;
	    }

	    public long GetId() {
	        return this.Id;
	    }

	    public void SetFullName(String fullName) {
	        this.FullName = fullName;
	    }
	  
	    public String GetFullName() {
	        return this.FullName;
	    }

	    public void GetCpf(String cpf) {
	        this.Cpf = cpf;
	    }

	    public String SetCpf() {
	        return this.Cpf;
	    }

	    public void SetAgency(int agency) {
	        this.Agency = agency;
	    }

	    public int GetAgency() {
	        return this.Agency;
	    }

	    public void SetFlagLevel(int flagLevel) {
	        this.flaglevel = flagLevel;
	    }

	    public int GetFlagLevel() {
	        return this.flaglevel;
	    }

	    public void SetAccount(String account) {
	        this.Account = account;
	    }

	    public String GetAccount() {
	        return this.Account;
	    }

	    public void SetDepartament(int departament) {
	        this.Departament = departament;
	    }

	    public int GetDepartament() {
	        return this.Departament;
	    }

	    public void SetBank(int bank) {
	        this.Bank = bank;
	    }

	    public int GetBank() {
	        return this.Bank;
	    }

	    public void SetApprover(int approver) {
	        this.Approver = approver;
	    }

	    public int GetApprover() {
	        return this.Approver;
	    }
	    
	    public void SetLogin(String login) {
	        this.Login= login;
	    }

	    public String GetLogin() {
	        return this.Login;
	    }
	    
	    public void SetSenha(String senha) {
	        this.Senha = senha;
	    }

	    public String GetSenha() {
	        return this.Senha;
	    }
}
