using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btnConfirmar_Click(object sender, EventArgs e)
        {
            // declaração de variavel.
            string usuario, senha;

            // recebem os dados digitados e passa para as variaveis.
            usuario = txtUsuario.Text;
            senha = txtSenha.Text;


            // testa as condições
            if ((usuario == "Admin") && (senha == "Admin"))
            {
                // instnacia a janela form2
                Form2 novo = new Form2();

                // caso a senha e login seja validado sera mostrado a janela form2
                novo.Show();

                //visibilidade da janela form1
                this.Visible = false;

            }
            else
            {
                MessageBox.Show("Usuario ou Senha invalida tente novamente.",
                    "MENSAGEM", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

        }
    }
}
