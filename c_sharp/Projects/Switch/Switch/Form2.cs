using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Switch
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void btnConsultar_Click(object sender, EventArgs e)
        {
            switch (cmbOpcao.Text)
            {
                case "1 ou 2":
                    lblRes.Text = "Seu Rodizio é as Segundas-Feiras.";
                    break;

                case "3 ou 4":
                    lblRes.Text = "Seu Rodizio é as Terças-Feiras.";
                    break;

                case "5 ou 6":
                    lblRes.Text = "Seu Rodizio é as Quartas-Feiras.";
                    break;

                case "7 ou 8":
                    lblRes.Text = "Seu Rodizio é as Quintas-Feiras.";
                    break;

                case "9 ou 0":
                    lblRes.Text = "Seu Rodizio é as Sextas-Feiras.";
                    break;

                default:
                    lblRes.Text = "Resultado Inválido.";
                    break;
            }
        }

        private void btnVoltar_Click(object sender, EventArgs e)
        {

            // Instancia um objeto Form1
            Form1 novo = new Form1();

            // Amostra objeto form1
            novo.Show();

            // apresenta ele visivel.
            this.Visible = false;
        }
    }
}
