
package Locacao.DAO;

import Locacao.Classes.Cliente;
import Locacao.Classes.Veiculo;
import Locacao.Util.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class VeiculoDAO {
    private Connection conn;

    public VeiculoDAO() throws ErpDAOException {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            throw new ErpDAOException("Erro de conexão: " + ":\n" + e.getMessage());
        }
    }

    public ArrayList listar() throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;

        try {
            String SQL = "SELECT * FROM veiculo ORDER BY Modelo";
            connL = this.conn;
            
            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            ArrayList Locacao = new ArrayList();

            while (rs.next()) {
                int ID_Veiculo = rs.getInt("ID_Veiculo");
                String Placa = rs.getString("Placa");
                String Marca = rs.getString("Marca");
                String Modelo = rs.getString("Modelo");
                String Ano = rs.getString("Ano");
                String Valor_diaria = rs.getString("Valor_diaria");
                int status = rs.getInt("status");
              
                
                Locacao.add(new Veiculo(ID_Veiculo, Placa, Marca, Modelo, Ano, Valor_diaria,status));
            }

            return Locacao;

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao listar veiculos " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    public void inserir(Veiculo veiculo) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (veiculo == null) {
            throw new ErpDAOException("O objeto veiculo não pode ser nulo.");
        }
        try {
            String SQL = "INSERT INTO veiculo (Placa, Marca, Modelo, Ano, Valor_diaria, status) "
                    + "values (?,?,?,?,?,?)";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, veiculo.getPlaca());
            ps.setString(2, veiculo.getMarca());
            ps.setString(3, veiculo.getModelo());
            ps.setString(4, veiculo.getAno());
            ps.setString(5, veiculo.getValor_diaria());       
            ps.setInt(6, 0);
            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao inserir um novo veiculo " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    public void atualizar(Veiculo veiculo) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (veiculo == null) {
            throw new ErpDAOException("O objeto veiculo não pode ser nulo.");
        }

        try {
            String SQL = "UPDATE veiculo set Placa=?, Marca=?, Modelo=?, Ano=?, Valor_diaria=? WHERE ID_Veiculo=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, veiculo.getPlaca());
            ps.setString(2, veiculo.getMarca());
            ps.setString(3, veiculo.getModelo());
            ps.setString(4, veiculo.getAno());
            ps.setString(5, veiculo.getValor_diaria());
            ps.setInt(6, veiculo.getID_Veiculo());
            
            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao editar veiculo " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    public Veiculo procurar(int codigo) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;

        try {
            String SQL = "SELECT ID_Veiculo, Placa, Marca, Modelo, Ano, Valor_diaria, status FROM veiculo WHERE ID_Veiculo = ?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            Veiculo veiculo = new Veiculo();
            veiculo = null;

            while (rs.next()) {
                int ID_Veiculo = rs.getInt("ID_Veiculo");
                String Placa = rs.getString("Placa");
                String Marca = rs.getString("Marca");
                String Modelo = rs.getString("Modelo");
                String Ano = rs.getString("Ano");
                String Valor_diaria = rs.getString("Valor_diaria");
                int status = rs.getInt("status");

                veiculo = new Veiculo(ID_Veiculo, Placa, Marca, Modelo, Ano, Valor_diaria,status);

            }

            return veiculo;

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao procurar veiculo " + sqle);
        } finally {
            // Conexao.close(connL,ps);
        }
    }
   public void excluir(int codigo) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (codigo == 0) {
            throw new ErpDAOException("O objeto veiculo não pode ser nulo.");
        }
        try {
            String SQL = "DELETE FROM veiculo WHERE ID_Veiculo=?";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao excluir veiculo" + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
   public void atualizarstatus(int codigo, int status) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
       

        try {
            String SQL = "UPDATE veiculo set status=? WHERE ID_Veiculo=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, status);
            ps.setInt(2, codigo);
            
            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao editar status " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
}
