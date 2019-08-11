
package Locacao.DAO;

import Locacao.Classes.Cliente;
import Locacao.Util.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    private Connection conn;

    public ClienteDAO() throws ErpDAOException {
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
            String SQL = "SELECT * FROM cliente ORDER BY Nome";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            ArrayList Locacao = new ArrayList();

            while (rs.next()) {
                int ID_Cliente = rs.getInt("ID_Cliente");
                String Nome = rs.getString("Nome");
                String Endereco = rs.getString("Endereco");
                String Cidade = rs.getString("Cidade");
                String Estado = rs.getString("Estado");
                String Cep = rs.getString("Cep");
                String Telefone = rs.getString("Telefone");
                String Email = rs.getString("Email");
                Date Data_nasc = rs.getDate("Data_nasc");
                
                Locacao.add(new Cliente(ID_Cliente, Nome, Endereco, Cidade, Estado, Cep, Telefone, Email, Data_nasc));

            }

            return Locacao;

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao listar locacao " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    public void inserir(Cliente cliente) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (cliente == null) {
            throw new ErpDAOException("O objeto cliente não pode ser nulo.");
        }
        try {
            String SQL = "INSERT INTO Cliente (Nome, Endereco, Cidade, Estado, Cep, Telefone, Email, Data_nasc) "
                    + "values (?,?,?,?,?,?,?,?)";
            
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getCidade());
            ps.setString(4, cliente.getEstado());
            ps.setString(5, cliente.getCep());
            ps.setString(6, cliente.getTelefone());
            ps.setString(7, cliente.getEmail());
            java.util.Date dataJAVA = cliente.getData_nasc();  // Data da classe Java Util;;
            if (dataJAVA != null) {
                java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
                ps.setDate(8, dataSQL);
            }
            else{//            java.util.Date dataJAVA = cliente.getDataNasc();  // Data da classe Java Util;;
            
                java.sql.Date dataSQL = null ;
                ps.setDate(8, dataSQL );
            }
            
            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao inserir um novo cliente " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
     public void atualizar(Cliente cliente) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (cliente == null) {
            throw new ErpDAOException("O objeto cliente não pode ser nulo.");
        }

        try {
            String SQL = "UPDATE cliente set Nome=?, Endereco=?, Cidade=?, Estado=?, Cep=?, Telefone=?, Email=?, Data_nasc=? WHERE ID_Cliente=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getCidade());
            ps.setString(4, cliente.getEstado());
            ps.setString(5, cliente.getCep());
            ps.setString(6, cliente.getTelefone());
            ps.setString(7, cliente.getEmail());
            java.util.Date dataJAVA = cliente.getData_nasc();  // Data da classe Java Util;;
            if (dataJAVA != null) {
                java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
                ps.setDate(8, dataSQL);
            }
            else{//            java.util.Date dataJAVA = cliente.getDataNasc();  // Data da classe Java Util;;
            
                java.sql.Date dataSQL = null ;
                ps.setDate(8, dataSQL );
            }
            ps.setInt(9, cliente.getID_Cliente());
            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao editar cliente " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
     public Cliente procurar(int codigo) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;

        try {
            String SQL = "SELECT ID_Cliente, Nome, Endereco, Cidade, Estado, Cep, Telefone, Email, Data_nasc FROM cliente WHERE ID_Cliente = ?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            Cliente cliente = new Cliente();
            cliente = null;

            while (rs.next()) {
                int ID_Cliente = rs.getInt("ID_Cliente");
                String Nome = rs.getString("Nome");
                String Endereco = rs.getString("Endereco");
                String Cidade = rs.getString("Cidade");
                String Estado = rs.getString("Estado");
                String Cep = rs.getString("Cep");
                String Telefone = rs.getString("Telefone");
                String Email = rs.getString("Email");
                Date Data_nasc = rs.getDate("Data_nasc");

                cliente = new Cliente(ID_Cliente, Nome, Endereco, Cidade, Estado, Cep, Telefone, Email, Data_nasc);

            }

            return cliente;

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao procurar cliente " + sqle);
        } finally {
            // Conexao.close(connL,ps);
        }
    }
     public void excluir(int codigo) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (codigo == 0) {
            throw new ErpDAOException("O objeto cliente não pode ser nulo.");
        }
        try {
            String SQL = "DELETE FROM cliente WHERE ID_Cliente=?";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao excluir cliente " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
}

