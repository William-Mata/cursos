using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

using Loja.BLL;
using Loja.DTO;


namespace Loja
{
    public partial class FormCD_Usuarios : Form
    {
        string modo = "";

        int codUsuSelecionado = -1;

        public FormCD_Usuarios()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void FormCD_Usuarios_Load(object sender, EventArgs e)
        {
            carregarGrid();
            lblMensagem.Text = "";
        }

        public void carregarGrid()
        {

            try
            {
                // instancia um objeto list da classe usuarioDTO.
                IList<UsuarioDTO> listUsuarioDTO = new List<UsuarioDTO>();

                // acessa a lista de usuarios.
                listUsuarioDTO = new UsuarioBLL().cargaUsuario();

                // amostra no dataGril os usuario.
                dataGridView1.DataSource = listUsuarioDTO;
            }
            catch (Exception ex)
            {
                throw ex;
            }

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            // ao clicar em um registro no datagridview sera preenchido os dados no txtbox.
            int sel = dataGridView1.CurrentRow.Index;

            // passsa os valores do data datagridview e prenche os campos txtbox no form.
            txtNome.Text = Convert.ToString(dataGridView1["nome", sel].Value);

            txtLogin.Text = Convert.ToString(dataGridView1["login", sel].Value);

            txtSenha.Text = Convert.ToString(dataGridView1["senha", sel].Value);

            txtEmail.Text = Convert.ToString(dataGridView1["email", sel].Value);

            txtCadastro.Text = Convert.ToString(dataGridView1["cadastro", sel].Value);

            codUsuSelecionado = Convert.ToInt32(dataGridView1["cod_usuario", sel].Value);
            

            if (Convert.ToString(dataGridView1["situacao", sel].Value) == "A")
            {
                cmbSituacao.Text = "Ativo";
            }
            else
            {

                cmbSituacao.Text = "Inativo";

            }

            switch(Convert.ToString(dataGridView1["perfil", sel].Value))
            {
                case "1":
                    cmbPerfil.Text = "Administrador";
                    break;

                case "2":
                    cmbPerfil.Text = "Gerencial";
                    break;

                case "3":
                    cmbPerfil.Text = "Operacional";
                    break;

                default:
                    break;
            
            }

        }

        private void cmbSituacao_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

       

        private void limpar_campos()
        {
            txtCadastro.Text = "";
            txtEmail.Text = "";
            txtLogin.Text = "";
            txtNome.Text = "";
            txtSenha.Text = "";
            cmbPerfil.Text = "";
            cmbSituacao.Text = "";
        }


        private void btnConfirmar_Click(object sender, EventArgs e)
        {

                    // novo
                    if (modo == "novo")
                    {
                        try
                        {

                            UsuarioDTO USU = new UsuarioDTO();

                            USU.nome = txtNome.Text;

                            USU.login = txtLogin.Text;

                            USU.senha = txtSenha.Text;

                            USU.email = txtEmail.Text;

                            USU.cadastro = System.DateTime.Now;

                            

                            if (cmbSituacao.Text == "Ativo")
                            {
                                USU.situacao = "A";
                            }
                            else
                            {
                                USU.situacao = "I";
                            }


                            switch (cmbPerfil.Text)
                            {
                                case "Administrador":
                                    USU.perfil = 1;
                                    break;

                                case "Gerencial":
                                    USU.perfil = 2;
                                    break;

                                case "Operacional":
                                    USU.perfil = 3;
                                    break;

                                default:
                                    break;
                            }

                            int x = new UsuarioBLL().insereUsuario(USU);

                            if (x > 0)
                            {
                                MessageBox.Show("Gravado com sucesso");
                            }
                        }
                        catch(Exception ex)
                        {
                            MessageBox.Show("Erro inesperado:" + ex.Message);
                        }

                        carregarGrid();
                        limpar_campos();

                    }




                    /// alterar
                    if (modo == "alterar")
                    {
                        try
                        {
                            if(codUsuSelecionado <0)
                            {
                                lblMensagem.Text = "Selecione um usuario antes de proseguir";
                                return;
                            }

                            UsuarioDTO USU = new UsuarioDTO();

                            USU.cod_usuario = codUsuSelecionado;

                            USU.nome = txtNome.Text;

                            USU.login = txtLogin.Text;

                            USU.senha = txtSenha.Text;

                            USU.email = txtEmail.Text;

                            USU.cadastro = System.DateTime.Now;

                            if (cmbSituacao.Text == "Ativo")
                            {
                                USU.situacao = "A";
                            }
                            else
                            {
                                USU.situacao = "I";
                            }

                            switch (cmbPerfil.Text)
                            {
                                case "Administrador":
                                    USU.perfil = 1;
                                    break;

                                case "Gerencial":
                                    USU.perfil = 2;
                                    break;

                                case "Operacional":
                                    USU.perfil = 3;
                                    break;
                            }

                            int x = new UsuarioBLL().alterarUsuario(USU);

                            if(x > 0 )
                            {
                                MessageBox.Show("Alterado com Sucesso!");
                            }
                            

                            carregarGrid();
                            

                        }
                        catch(Exception ex)
                        {
                            MessageBox.Show(ex.Message);
                        }

                        
                    }
                    

                    // REMOVER
                    if (modo == "remover")
                    {

                        try
                        {
                            if(codUsuSelecionado < 0)
                            {
                                lblMensagem.Text = "Selecione um usuario antes de proseguir";
                                return;
                            }

                            UsuarioDTO USU = new UsuarioDTO();

                            USU.cod_usuario = codUsuSelecionado;

                            int x = new UsuarioBLL().removerUsuario(USU);

                            if(x > 0)
                            {
                                MessageBox.Show("Excluido com Sucesso!");   
                            }
                             carregarGrid();
                             limpar_campos();
                        }
                        catch(Exception ex)
                        {
                            MessageBox.Show(ex.Message);
                        }

                       
                    }
                    modo = "";
                    
            
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            limpar_campos();

            // passa a data atual para o campo
            txtCadastro.Text = Convert.ToString(System.DateTime.Now);

            // modo passa a ser novo.
            modo = "novo";

            // mensagem para novo cadastro.
            MessageBox.Show("Apos preencher os campos clique em Confirmar.");

        }

        private void btnUpadate_Click(object sender, EventArgs e)
        {
            if (codUsuSelecionado < 0)
            {
                lblMensagem.Text = "Selecione um usuario antes de proseguir";
                return;
            }
            else 
            {
                modo = "alterar";
                MessageBox.Show("Apos as modificações clique em Confirmar.");
            }
            
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            if (codUsuSelecionado < 0)
            {
                lblMensagem.Text = "Selecione um usuario antes de proseguir";
                return;
            }
            else 
            {
                MessageBox.Show("Se tiver certeza que queira remover esse registro clique em Confirmar.");
                modo = "remover";
            }
            
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            limpar_campos();
            modo = "";
        }

        
    }
}
