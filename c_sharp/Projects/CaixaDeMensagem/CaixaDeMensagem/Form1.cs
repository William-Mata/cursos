using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CaixaDeMensagem
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            // cria uma caixa de dialogo com a mensagem hello word, um botao de ok na caixa, poem um incone de informação na caixa.
            MessageBox.Show("Hello Word", "Messagem", MessageBoxButtons.OK, MessageBoxIcon.Information);
            /* comentario 
             * de 
             * multiplas 
             * linhas */


            string nome; // variavel para texto
            
            int quantidade; // variavel para números

            double salario; // variavel para numeros com virgulas como dado no exemplo o salario.

            bool verdadeoufalso; // variavel para saber se um valor e verdadeiro ou falso.

            char sexo; // variavel que armazena apenas um caractere.

            decimal altura; // variavel que armazena valores com ponto precisa utilizar "M" ao final dos numeros.



        }
    }
}
