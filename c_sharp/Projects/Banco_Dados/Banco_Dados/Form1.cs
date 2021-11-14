using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace Banco_Dados
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnConectar_Click(object sender, EventArgs e)
        {

            SqlConnection con = new SqlConnection();

            con.ConnectionString = Properties.Settings.Default.CST;

            try
            {
                con.Open();

                SqlCommand Cmd = new SqlCommand();

                Cmd.CommandText = "SELECT * FROM tb_clientes";
                Cmd.CommandType = CommandType.Text;
                Cmd.Connection = con;
                SqlDataReader DR;
                DR = Cmd.ExecuteReader();

                DataTable dt = new DataTable();
                dt.Load(DR);
                dataGridView1.DataSource = dt;
                dataGridView1.Refresh();

                con.Close();

                MessageBox.Show("A Conexão foi feita com sucesso!", "Conexão", MessageBoxButtons.OK);


            }
            catch(Exception ex)
            {

                MessageBox.Show(String.Format("Falha na Conexão:{0}", ex.Message));

            }
        }
    }
}
