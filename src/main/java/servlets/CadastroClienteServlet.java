package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlets.models.Cliente;
import servlets.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/CadastroClienteServlet")
public class CadastroClienteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int matricula = Integer.parseInt(request.getParameter("matricula"));
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String modalidade = request.getParameter("modalidade");

        Cliente cliente = new Cliente(matricula, nome, endereco, modalidade);

        try {
            Connection conn = DatabaseUtil.getConnection();
            String query = "INSERT INTO clientes (matricula, nome, endereco, modalidade) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, cliente.getMatricula());
            pstmt.setString(2, cliente.getNome());
            pstmt.setString(3, cliente.getEndereco());
            pstmt.setString(4, cliente.getModalidade());
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("cadastro.jsp"); // Página de redirecionamento após o cadastro
    }
}