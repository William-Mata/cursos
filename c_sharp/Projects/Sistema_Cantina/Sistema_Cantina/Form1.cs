using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sistema_Cantina
{
    public partial class Form1 : Form
    {
        // declaração dos vetores e variavel que será usado.
        string[] produto = new string[11];
        string[] codigo = new string[11];
        double[] valor = new double[11];
        double valortotal;



        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            carregarArrays();
            valortotal = 0;

        }
            // metodo que ira ser chamado quando o formulario for aberto.
            private void carregarArrays()
            {
            
                codigo[1] = "001";
                codigo[2] = "002";
                codigo[3] = "003";
                codigo[4] = "004";
                codigo[5] = "005";
                codigo[6] = "006";
                codigo[7] = "007";
                codigo[8] = "008";
                codigo[9] = "009";
                codigo[10] = "010";


                produto[1] = "Frutas";
                produto[2] = "Legumes";
                produto[3] = "Arroz";
                produto[4] = "Feijão";
                produto[5] = "Carne";
                produto[6] = "Pão";
                produto[7] = "Leite";
                produto[8] = "Queijo";
                produto[9] = "Manteiga";
                produto[10] = "Refrigerante";

                valor[1] = 3.00;
                valor[2] = 2.50;
                valor[3] = 3.50;
                valor[4] = 4.00;
                valor[5] = 15.00;
                valor[6] = 1.00;
                valor[7] = 2.80;
                valor[8] = 10.00;
                valor[9] = 4.50;
                valor[10] = 5.00;
                    
            
            }

            private void txtChanged(object sender, EventArgs e)
            {
                // A condição verifica se o codigo digitado no txtCodigo tem até 5 digitos.
                if (txtCodigo.Text.Length == 3)
                {
                
                    // declara uma variavel indice que ira armazena o indice do vetor.
                    int indice = 0;


                    // testa o codigo
                    for (int c = 1; c < codigo.Length; c++)
                    {


                        if (txtCodigo.Text == codigo[c])
                        {
                            // passa o indice do codigo onde se encontra o cogido.
                            indice = c;
                        }


                    }

                    if (indice == 0)
                    {
                        // messagem de erro para codigo invalido.
                        MessageBox.Show(
                        "Produto Não Encontrado, por favor verifique o código novamente.",
                        "Mensagem", MessageBoxButtons.OK, MessageBoxIcon.Error);

                        // Limpa o código.
                        txtCodigo.Text = "";

                        // faz com que o curso volta ao txtCodigo.
                        txtCodigo.Focus();
                    }
                    else
                    {

                        // adiciona o codigo, produto e o valor do produto ao listbox caixa.
                        lstCaixa.Items.Add(txtCodigo.Text + " -- " +
                            produto[indice] + " -- R$: " + valor[indice]);


                        // realiza a soma dos produtos adiconados ao listbox
                        valortotal = valortotal + valor[indice];

                        // Amostra o resultado da soma no lblValorTotal
                        lblValorCompra.Text = Convert.ToString(valortotal);

                        // adiciona a foto do objeto referente ao codigo do produto.
                        picImagem.ImageLocation = "C:/Users/WILLIAM ESTUDOS/Desktop/Linguagem C#/imagens/" + codigo[indice] + ".jpg";

                        // Limpa o código.
                        txtCodigo.Text = "";

                        // faz com que o curso volta ao txtCodigo.
                        txtCodigo.Focus();

                    }
                }



            }

            private void label2_Click(object sender, EventArgs e)
            {

            }
    }
}

