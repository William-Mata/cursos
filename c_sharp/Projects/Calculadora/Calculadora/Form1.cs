using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculadora
{
    public partial class CÁLCULADORA : Form
    {
        public CÁLCULADORA()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        // ação que sera executada ao clicar no botao de soma/btnSoma.
        private void btnSoma_Click(object sender, EventArgs e)
        {
            // declaração de variavel double.
            double num1, num2, resultado;

            //converte oque foi digitado na caixa txtNum1 para double e repasa para a variavel num1.
            num1 = Convert.ToDouble(txtNum1.Text);

            //converte oque foi digitado na caixa txtNum2 para double e repasa para a variavel num2.
            num2 = Convert.ToDouble(txtNum2.Text);
            
            // realiza a Soma das variaveis num1 e num2 e repassa o valor a resultado.
            resultado = num1 + num2;

            // repassa o valor da variavel resultado para o txtResultado.
            txtResultado.Text = resultado.ToString();
        }

        // ação que sera executada ao clicar no botao de Multiplicar/btnMultiplicar.
        private void btnMultiplicar_Click(object sender, EventArgs e)
        {
            // declaração de variavel double.
            double num1, num2, resultado;

            //converte oque foi digitado na caixa txtNum1 para double e repasa para a variavel num1.
            num1 = Convert.ToDouble(txtNum1.Text);

            //converte oque foi digitado na caixa txtNum2 para double e repasa para a variavel num2.
            num2 = Convert.ToDouble(txtNum2.Text);

            // realiza a Multiplicação das variaveis num1 e num2 e repassa o valor a resultado.
            resultado = num1 * num2;

            // repassa o valor da variavel resultado para o txtResultado.
            txtResultado.Text = resultado.ToString();

        }

        // ação que sera executada ao clicar no botao de Reseta/btnReseta.
        private void btnReseta_Click(object sender, EventArgs e)
        {
            // os comandos abaixo tem a função de zera os campos dos txt's abaixo.
            txtNum1.Text = "";
            txtNum2.Text = "";
            txtResultado.Text = "";
        }

        // ação que sera executada ao clicar no botao de Sair/btnSair.
        private void btnSair_Click(object sender, EventArgs e)
        {
            // código utilizado para finalizar/fechar o aplicativo.
            Close();
        }


        // ação que sera executada ao clicar no botao de Subtrair/btnSubtrair.
        private void btnSubtrair_Click(object sender, EventArgs e)
        {
            // declaração de variavel double.
            double num1, num2, resultado;

            //converte oque foi digitado na caixa txtNum1 para double e repasa para a variavel num1.
            num1 = Convert.ToDouble(txtNum1.Text);

            //converte oque foi digitado na caixa txtNum2 para double e repasa para a variavel num2.
            num2 = Convert.ToDouble(txtNum2.Text);

            // realiza a Subtração das variaveis num1 e num2 e repassa o valor a resultado.
            resultado = num1 - num2;

            // repassa o valor da variavel resultado para o txtResultado.
            txtResultado.Text = resultado.ToString();
        }

        // ação que sera executada ao clicar no botao de Dividir/btnDivir.
        private void btnDividir_Click(object sender, EventArgs e)
        {
            // declaração de variavel double.
            double num1, num2, resultado;

            //converte oque foi digitado na caixa txtNum1 para double e repasa para a variavel num1.
            num1 = Convert.ToDouble(txtNum1.Text);

            //converte oque foi digitado na caixa txtNum2 para double e repasa para a variavel num2.
            num2 = Convert.ToDouble(txtNum2.Text);

            // realiza a Divisão das variaveis num1 e num2 e repassa o valor a resultado.
            resultado = num1 / num2;

            // repassa o valor da variavel resultado para o txtResultado.
            txtResultado.Text = resultado.ToString();
        }
    }
}
