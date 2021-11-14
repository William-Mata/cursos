using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


using Loja.DTO;
using System.Data.SqlClient;

namespace Loja.DAL
{
    public class UsuarioDAL
    {
        public IList<UsuarioDTO> cargaUsuario()
        {

            try
            {
                // instancia um objeto da classe sqlconection para criar uma conexão com o banco de dados.
                SqlConnection con = new SqlConnection();

                // indica o local onde se encontra o banco de dados.
                con.ConnectionString = Properties.Settings.Default.CST;

                // instancia um objeto da classe SqlCommand.
                SqlCommand cmd = new SqlCommand();

                // define que os tipos de dados do banco de dados sera text.
                cmd.CommandType = System.Data.CommandType.Text;

                // seleciona toda a tabela tb_usuarios do banco de dados loja
                cmd.CommandText = "SELECT * FROM tb_usuarios";

                // passa as informações da conexão para o objeto cmd.
                cmd.Connection = con;

                // Instancia um objeto da clase SqlDataReader.
                SqlDataReader ER;

                // Instancia um objeto LIST da classe UsuarioDTO
                IList<UsuarioDTO> listUusuarioDTO = new List<UsuarioDTO>();

                // Abre a conexão com o banco de dados.
                con.Open();

                // comando executa er.
                ER = cmd.ExecuteReader();

                if(ER.HasRows)
                {

                    while(ER.Read())
                    {
                        // insntancia um objeto usu da classe UsuarioDTO.
                        UsuarioDTO usu = new UsuarioDTO();


                        // usu recebe cod_usuario ja convertido para inteiro.
                        usu.cod_usuario = Convert.ToInt32(ER["cod_usuario"]);

                        // usu recebe perfil ja convertido para string.
                        usu.perfil = Convert.ToInt32(ER["perfil"]);

                        // usu recebe cadastro ja convertido para o formato de data.
                        usu.cadastro = Convert.ToDateTime(ER["cadastro"]);

                        // usu recebe nome ja convertido para string.
                        usu.nome = Convert.ToString(ER["nome"]);

                        // usu recebe email ja convertido para string.
                        usu.email = Convert.ToString(ER["email"]);

                        // usu recebe login ja convertido para string.
                        usu.login = Convert.ToString(ER["login"]);

                        // usu recebe senha ja convertido para string.
                        usu.senha = Convert.ToString(ER["senha"]);

                        // usu recebe situação ja convertido para string.
                        usu.situacao = Convert.ToString(ER["situacao"]);

                        listUusuarioDTO.Add(usu);
                    
                    }
                }

                // retornara a lista de usuario criada acima.
                return listUusuarioDTO;
            }
            catch (Exception ex) 
            {

                throw ex;

            }

        }

        public int insereUsuario(UsuarioDTO USU)
        {
            try
            {
                SqlConnection con = new SqlConnection();

                con.ConnectionString = Properties.Settings.Default.CST;

                SqlCommand cmd = new SqlCommand();

                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = "INSERT INTO tb_usuarios (nome, login, email, senha,  cadastro, situacao, perfil)" 
                    + "  VALUES (@nome, @login, @email, @senha, @cadastro, @perfil)";

                cmd.Parameters.Add("nome", System.Data.SqlDbType.VarChar).Value = USU.nome;

                cmd.Parameters.Add("login", System.Data.SqlDbType.VarChar).Value = USU.login;

                cmd.Parameters.Add("email", System.Data.SqlDbType.VarChar).Value = USU.email;

                cmd.Parameters.Add("senha", System.Data.SqlDbType.VarChar).Value = USU.senha;

                cmd.Parameters.Add("situacao", System.Data.SqlDbType.NVarChar).Value = USU.situacao;

                cmd.Parameters.Add("cadastro", System.Data.SqlDbType.DateTime).Value = USU.cadastro;

                cmd.Parameters.Add("perfil", System.Data.SqlDbType.Int).Value = USU.perfil;

                cmd.Connection = con;

                con.Open();

                int qtd = cmd.ExecuteNonQuery();

                return qtd;

            }
            catch (Exception ex)
            {
                throw ex;
            }
        }

        public int alterarUsuario(UsuarioDTO USU)

        {

            try
            {

                SqlConnection con = new SqlConnection();

                con.ConnectionString = Properties.Settings.Default.CST;

                SqlCommand cmd = new SqlCommand();

                cmd.CommandType = System.Data.CommandType.Text;

                cmd.CommandText = "UPDATE tb_usuarios SET perfil=@perfil," + "nome=@nome, " + "login=@login, " + "senha=@senha, " +
                        "cadastro=@cadastro, " + "situacao=@situacao, " + "email=@email " + " WHERE cod_usuario=@cod_usuario";

                cmd.Parameters.Add("nome", System.Data.SqlDbType.VarChar).Value = USU.nome;

                cmd.Parameters.Add("login", System.Data.SqlDbType.VarChar).Value = USU.login;

                cmd.Parameters.Add("senha", System.Data.SqlDbType.VarChar).Value = USU.senha;

                cmd.Parameters.Add("email", System.Data.SqlDbType.VarChar).Value = USU.email;

                cmd.Parameters.Add("cadastro", System.Data.SqlDbType.DateTime).Value = USU.cadastro;

                cmd.Parameters.Add("situacao", System.Data.SqlDbType.NVarChar).Value = USU.situacao;

                cmd.Parameters.Add("perfil", System.Data.SqlDbType.Int).Value = USU.perfil;

                cmd.Parameters.Add("cod_usuario", System.Data.SqlDbType.VarChar).Value = USU.cod_usuario;

                cmd.Connection = con;

                con.Open();

                int qtd = cmd.ExecuteNonQuery();

                return qtd;
            }
            catch(Exception ex)
            {
                throw ex;
            }
        }

        public int removerUsuario(UsuarioDTO USU)
        {
            try
            {
                SqlConnection con = new SqlConnection();

                con.ConnectionString = Properties.Settings.Default.CST;

                SqlCommand cmd = new SqlCommand();

                cmd.CommandType = System.Data.CommandType.Text;

                cmd.CommandText = "DELETE tb_usuarios WHERE cod_usuario = @cod_usuario";

                cmd.Parameters.Add("cod_usuario", System.Data.SqlDbType.Int).Value = USU.cod_usuario;

                cmd.Connection = con;

                con.Open();

                int qtd = cmd.ExecuteNonQuery();
                
                return qtd;
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }
    }
}
