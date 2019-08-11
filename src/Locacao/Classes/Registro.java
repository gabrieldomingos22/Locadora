
package Locacao.Classes;

import java.util.Date;


public class Registro {
    int ID_Registro;
    int ID_Veiculo;
    String Modelo;
    String Placa;
    String Nome;
    Date dataInicio;
    Date dataFim;

    public Registro() {
    }

    public Registro(int ID_Registro, int ID_Veiculo, String Modelo, String Placa, String Nome, Date dataInicio, Date dataFim) {
        this.ID_Registro = ID_Registro;
        this.ID_Veiculo = ID_Veiculo;
        this.Modelo = Modelo;
        this.Placa = Placa;
        this.Nome = Nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    
    
    public int getID_Veiculo() {
        return ID_Veiculo;
    }

    public void setID_Veiculo(int ID_Veiculo) {
        this.ID_Veiculo = ID_Veiculo;
    }

    
    
    public int getID_Registro() {
        return ID_Registro;
    }

    public void setID_Registro(int ID_Registro) {
        this.ID_Registro = ID_Registro;
    }
    
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
    
}
