using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Arrays
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            // declaração de um vetor com 4 posições
            int[] vetor = new int[4];

            // passando os dados para os vetores.
            vetor[0] = 8;
            vetor[1] = 25;
            vetor[2] = 18;
            vetor[3] = 21;

            // declaração de variavel.
            int valor = vetor[1];

            // sorteando os valores do vetor.
            System.Array.Sort(vetor);


            // percorre o vetor.
            for (int index = 0; index < 4; index++)
            {
                // percorre o vetor e  mostra em uma message box.
                MessageBox.Show(vetor[index].ToString(),"Array");
            }


        }

        private void btnVetor_Click(object sender, EventArgs e)
        {

            // declaração de vetor com 7 posições
            string[] semana = new string[7];


            // passa o valor para os vetores abaixos.
            semana[0] = "Domingo";
            semana[1] = "Segunda";
            semana[2] = "Terça";
            semana[3] = "Quarta";
            semana[4] = "Quinta";
            semana[5] = "Sexta";
            semana[6] = "Sabado";


            System.Array.Sort(semana);

            for (int c = 0; c < 7; c++)
            {
                MessageBox.Show(semana[c].ToString(), "Dias Da Semana");
            }
            
        }
    }
}
