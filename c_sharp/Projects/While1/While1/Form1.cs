using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace While1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnVerificar_Click(object sender, EventArgs e)
        {
            int numero = 0;

            while (numero <= 10)
            {
                // Adiciona o conteudo da variavel numero no list box.
                lstNumero.Items.Add(numero);

                // incrementa +1 na variavel numero.
                numero++;


            }

        }
    }
}
