using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Condicao_if
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            int idade, nascimento, anoatual;

            anoatual = 2020;

            nascimento = Convert.ToInt32(txtNascimento.Text);

            idade = anoatual - nascimento;

            txtIdade.Text = idade.ToString();

            if (idade < 18)
            {
                MessageBox.Show("Você é menor de Idade", "Menor de 18", MessageBoxButtons.OK);
               
            }
            else if(( idade >= 18) && ( idade <=64))
            {
                MessageBox.Show("Você é maior de Idade", "Maior de 18", MessageBoxButtons.OK);
            }
            else{
                MessageBox.Show("Você é Idoso", "Idoso", MessageBoxButtons.OK);
            }
                
        }

        private void btnLimpar_Click(object sender, EventArgs e)
        {
            txtIdade.Text = "";
            txtNascimento.Text = "";

        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
