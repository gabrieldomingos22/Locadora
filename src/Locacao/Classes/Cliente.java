
package Locacao.Classes;

import java.util.Date;

/**
 *
 * @author 275700
 */
public class Cliente {
    int ID_Cliente;
    String Nome;
    String Endereco;
    String Cidade;
    String Estado;
    String Cep;
    String Telefone;
    String Email;
    Date Data_nasc;

    public Cliente() {
    }

    public Cliente(int ID_Cliente, String Nome, String Endereco, String Cidade, String Estado, String Cep, String Telefone, String Email, Date Data_nasc) {
        this.ID_Cliente = ID_Cliente;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Cep = Cep;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Data_nasc = Data_nasc;
    }

    
    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getData_nasc() {
        return Data_nasc;
    }

    public void setData_nasc(Date Data_nasc) {
        this.Data_nasc = Data_nasc;
    }

    
    
    
    
}
