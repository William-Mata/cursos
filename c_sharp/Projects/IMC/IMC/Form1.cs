using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace IMC
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

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btnLimpar_Click(object sender, EventArgs e)
        {
            txtAltura.Text = "";
            txtPeso.Text = "";
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            double altura, peso, imc;

            altura = Convert.ToDouble(txtAltura.Text);

            peso = Convert.ToDouble(txtPeso.Text);

            imc = (peso / (altura * altura));

            txtIMC.Text = imc.ToString("0.00");

            if (imc < 18.49)
            {
                MessageBox.Show("Você está abaixo do peso.", "Messagem" , MessageBoxButtons.OK , MessageBoxIcon.Warning);
            }
            else if ((imc >= 18.5) && (imc <= 24.99))
            {
                MessageBox.Show("Você está com peso dentro da normalidade.", "Messagem", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            else if ((imc >= 25) && (imc <= 29.99)) 
            {
                MessageBox.Show("Você está acima do peso.", "Messagem", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            else if((imc >=30 ) && (imc <= 34.99 ))
            {
                MessageBox.Show("Atenção, você está com Obesidade Grau I.", "Messagem", MessageBoxButtons.OK, MessageBoxIcon.Stop);
            }
            else if((imc >=35) && (imc <= 39.99))
            {
                 MessageBox.Show("Atenção, você está com Obesidade Grau II (severa).", "Messagem" ,MessageBoxButtons.OK, MessageBoxIcon.Stop);
            }
            else if (imc > 40){

                 MessageBox.Show("Atenção, você está com Obesidade Grau III (mórbida).", "Messagem" ,MessageBoxButtons.OK, MessageBoxIcon.Stop);
            }
 
        }
    }
}
