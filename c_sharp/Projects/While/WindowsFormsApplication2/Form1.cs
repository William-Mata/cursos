using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void btnContar_Click(object sender, EventArgs e)
        {
            int c = 10000;

            while (0 < c)
            {
                // diminui o número para contagem regresiva.
                c--;

                // passa o número para o lblNumero.
                lblNumero.Text = c.ToString();

                // atualiza o número
                lblNumero.Refresh();

            }
        }
    }
}
