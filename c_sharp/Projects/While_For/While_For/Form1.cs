using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace While_For
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
           
            /* Estrutura para contagem regresiva dos anos de 2020 a 1950 
            * e adicionar os anos no combobox. */
            for (int cont = 2020; cont >= 1950; cont--) 
            {
                cbxAnos.Items.Add(cont);

            }
        }
    }
}
