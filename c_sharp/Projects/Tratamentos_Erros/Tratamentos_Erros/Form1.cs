using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Tratamentos_Erros
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            int num1, num2, resultado;

            try
            {

                num1 = Convert.ToInt32(txtNum1.Text);

                num2 = Convert.ToInt32(txtNum2.Text);

                resultado = num1 + num2;

                txtResul.Text = Convert.ToString(resultado);
            }
            catch (Exception)
            {
                MessageBox.Show("Erro, verifique se você digitou apenas números.",
                    "Mensagem", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);
            }
            finally
            {
                MessageBox.Show("Aperte em OK para finalizar o programa.", "Mensagem",
                    MessageBoxButtons.OK, MessageBoxIcon.None);
                Close();
            }



        }
    }
}
