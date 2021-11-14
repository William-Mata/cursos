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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            switch (cmbDias.Text)
            {

                case "Domingo":
                    MessageBox.Show("O Dia escolhido foi Domingo", "Menssagem", MessageBoxButtons.OK);
                        break;
                
                case "Segunda":
                     MessageBox.Show("O Dia escolhido foi Segunda", "Menssagem", MessageBoxButtons.OK);
                     break;
                
                case "Terça":
                     MessageBox.Show("O Dia escolhido foi Terça", "Menssagem", MessageBoxButtons.OK);
                     break;

                case "Quarta":
                     MessageBox.Show("O Dia escolhido foi Quarta", "Menssagem", MessageBoxButtons.OK);
                     break;

                case "Quinta":
                     MessageBox.Show("O Dia escolhido foi Quinta", "Menssagem", MessageBoxButtons.OK);
                     break;

                case "Sexta":
                     MessageBox.Show("O Dia escolhido foi Sexta", "Menssagem", MessageBoxButtons.OK);
                     break;

                case "Sabado":
                     MessageBox.Show("O Dia escolhido foi Sabado", "Menssagem", MessageBoxButtons.OK);
                     break;

                default:
                     MessageBox.Show("Opção Invalida. ", "Menssagem", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                     break;
            }
        }

        private void btnProximo_Click(object sender, EventArgs e)
        {
            //Instancia o objeto Form2.
            Form2 novo = new Form2();

            // Chama o objeto Form2.
            novo.Show();

            //fecha o Form1/atual.
            this.Visible = false;
        }
    }
}
