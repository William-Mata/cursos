using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace For
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {

            // ESTRUTURA DE REPETIÇÃO FOR.
            for (int cont = 0; cont < 10; cont++)
            {
                // criara uma caixa de messagem exibindo a contagem.
                //MessageBox.Show("A contagem está em: " + cont, "Contador",  MessageBoxButtons.OK, MessageBoxIcon.None);


                /* esse comando faz com que aparece o resultado no 
                 * console e writeline e para cada vez que
                executar o looping pular uma linha para o resultado.*/
                Console.WriteLine("O valor da contagem é: " + cont);
                
            }
        }
    }
}
