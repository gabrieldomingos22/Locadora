package Locacao.Classes;
/**
 *
 * @author 275700
 */
public class Veiculo {
    int ID_Veiculo;
    String Placa;
    String Marca;
    String Modelo;
    String Ano;
    String Valor_diaria;
    int status;

    public Veiculo() {
    }

    public Veiculo(int ID_Veiculo, String Placa, String Marca, String Modelo, String Ano, String Valor_diaria, int status) {
        this.ID_Veiculo = ID_Veiculo;
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Valor_diaria = Valor_diaria;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
      
    public int getID_Veiculo() {
        return ID_Veiculo;
    }

    public void setID_Veiculo(int ID_Veiculo) {
        this.ID_Veiculo = ID_Veiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getValor_diaria() {
        return Valor_diaria;
    }

    public void setValor_diaria(String Valor_diaria) {
        this.Valor_diaria = Valor_diaria;
    }
    
    
    
}
