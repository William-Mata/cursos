using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication5
{
    public partial class Calculadora : Form
    {
        public Calculadora()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void txtNota3_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click_1(object sender, EventArgs e)
        {

        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {   
            // declaração das variaveis double para o calculo da media final.
            double nota1, nota2, nota3, resultado;

            /* converter os dados escrito no campo txtNota1 e realiza o cálculo 
             * e depois repassa o valor a variavel nota1.*/
            nota1 = (Convert.ToDouble(txtNota1.Text) * 0.3);

            /* converter os dados escrito no campo txtNota2 e realiza o cálculo 
             * e depois repassa o valor a variavel nota2.*/
            nota2 = (Convert.ToDouble(txtNota2.Text) * 0.3);

            /* converter os dados escrito no campo txtNota3 e realiza o cálculo 
             * e depois repassa o valor a variavel nota3.*/
            nota3 = (Convert.ToDouble(txtNota3.Text) * 0.4);

            /* realiza a soma das notas e repassa para variavel resultado.*/
            resultado = nota1 + nota2 + nota3;

            /* converte o valor double 
             * para string e repasa para o campo txtMF/Media Final.*/
            txtMF.Text = resultado.ToString();

            if (resultado >= 5)
            {
                MessageBox.Show("Aluno Aprovado", "APROVADO", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);
            }
            else
            {
                MessageBox.Show("Aluno Reprovado", "Reprovado", MessageBoxButtons.OK,MessageBoxIcon.Warning);
            }
        }

        private void btnLimpar_Click(object sender, EventArgs e)
        {
            // limpar os campos dos txt abaixo quando o botão limpar e clicado.
            txtNota1.Text = "";
            txtNota2.Text = "";
            txtNota3.Text = "";
            txtMF.Text = "";
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
