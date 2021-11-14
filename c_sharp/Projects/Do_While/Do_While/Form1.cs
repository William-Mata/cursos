using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Do_While
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnTeste_Click(object sender, EventArgs e)
        {
            // declaração e inicialização da variavel cont.
            int cont;
            cont = 0;
            
            // estrutura do while, contagem progresiva de 0 à 10000.
            do{
                // incrementação da variavel cont + 1.
                cont++;

                // passa o conteudo da variavel cont para lblNum.
                lblNum.Text = Convert.ToString(cont);

                // atualiza o lblNum a cada vez que a estrutura executa o looping.
                lblNum.Refresh();

            // condição para que a estrutura continue se repetindo.
            }while (cont < 10000);
        }
    }
}
