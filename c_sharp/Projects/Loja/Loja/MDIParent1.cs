using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Loja
{
    public partial class MDI_Cadastro : Form
    {

        public MDI_Cadastro()
        {
            InitializeComponent();
        }

        private void usuariosToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form cd_usuarios = new FormCD_Usuarios();

            // Utilizado para mostrar o forms cd_usuarios dentro do MDI_Cadastro 
            cd_usuarios.MdiParent = this;

            cd_usuarios.Show();
        }

    }
}
