
package Locacao.Classes;

import java.util.Date;


public class locacao {
 
    int ID_Locacao;
    int ID_cliente;
    int ID_veiculo;
    Date dataInicio;
    Date dataFim;

    public locacao() {
    }

    public locacao(int ID_Locacao, int ID_cliente, int ID_veiculo, Date dataInicio, Date dataFim) {
        this.ID_Locacao = ID_Locacao;
        this.ID_cliente = ID_cliente;
        this.ID_veiculo = ID_veiculo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    
    
    
    public int getID_Locacao() {
        return ID_Locacao;
    }

    public void setID_Locacao(int ID_Locacao) {
        this.ID_Locacao = ID_Locacao;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public int getID_veiculo() {
        return ID_veiculo;
    }

    public void setID_veiculo(int ID_veiculo) {
        this.ID_veiculo = ID_veiculo;
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
