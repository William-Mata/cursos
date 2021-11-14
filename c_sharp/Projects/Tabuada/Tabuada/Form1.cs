using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Tabuada
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

        private void button1_Click(object sender, EventArgs e)
        {
            int num, cont, resultado;
            
            cont = 0;

            while (cont < 10)
            {
                // incrementação da variavel cont.
                ++cont;


                num = Convert.ToInt32(txtNumero.Text);

                // multiplicação das variaveis num e cont e repassa o valor para resultado.
                resultado = num * cont;
                

                // cria a tabuada na listbox passando o calculo e resultado da multiplicação.
                lstTabuada.Items.Add(num + " * " + cont + " = " + resultado);
            }
        }

        private void btnLimpar_Click(object sender, EventArgs e)
        {
            txtNumero.Text = "";
            lstTabuada.Items.Clear();
            
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
