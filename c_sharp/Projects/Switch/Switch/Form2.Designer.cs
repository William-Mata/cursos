namespace Switch
{
    partial class Form2
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblVeiculos = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.lblRes = new System.Windows.Forms.Label();
            this.cmbOpcao = new System.Windows.Forms.ComboBox();
            this.btnConsultar = new System.Windows.Forms.Button();
            this.btnVoltar = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblVeiculos
            // 
            this.lblVeiculos.AutoSize = true;
            this.lblVeiculos.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblVeiculos.Location = new System.Drawing.Point(80, 24);
            this.lblVeiculos.Name = "lblVeiculos";
            this.lblVeiculos.Size = new System.Drawing.Size(199, 24);
            this.lblVeiculos.TabIndex = 0;
            this.lblVeiculos.Text = "Rodizio De Veiculos";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(24, 70);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(305, 20);
            this.label2.TabIndex = 1;
            this.label2.Text = "Selecione o número da final da placa";
            // 
            // lblRes
            // 
            this.lblRes.AutoSize = true;
            this.lblRes.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblRes.ForeColor = System.Drawing.Color.Red;
            this.lblRes.Location = new System.Drawing.Point(24, 154);
            this.lblRes.Name = "lblRes";
            this.lblRes.Size = new System.Drawing.Size(57, 20);
            this.lblRes.TabIndex = 2;
            this.lblRes.Text = "label3";
            // 
            // cmbOpcao
            // 
            this.cmbOpcao.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cmbOpcao.ForeColor = System.Drawing.Color.Red;
            this.cmbOpcao.FormattingEnabled = true;
            this.cmbOpcao.Items.AddRange(new object[] {
            "1 ou 2",
            "3 ou 4",
            "5 ou 6",
            "7 ou 8",
            "9 ou 0"});
            this.cmbOpcao.Location = new System.Drawing.Point(113, 108);
            this.cmbOpcao.Name = "cmbOpcao";
            this.cmbOpcao.Size = new System.Drawing.Size(116, 28);
            this.cmbOpcao.TabIndex = 3;
            // 
            // btnConsultar
            // 
            this.btnConsultar.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnConsultar.FlatAppearance.BorderSize = 0;
            this.btnConsultar.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Red;
            this.btnConsultar.FlatAppearance.MouseOverBackColor = System.Drawing.Color.WhiteSmoke;
            this.btnConsultar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnConsultar.Location = new System.Drawing.Point(28, 194);
            this.btnConsultar.Name = "btnConsultar";
            this.btnConsultar.Size = new System.Drawing.Size(88, 39);
            this.btnConsultar.TabIndex = 4;
            this.btnConsultar.Text = "Consultar";
            this.btnConsultar.UseVisualStyleBackColor = true;
            this.btnConsultar.Click += new System.EventHandler(this.btnConsultar_Click);
            // 
            // btnVoltar
            // 
            this.btnVoltar.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnVoltar.FlatAppearance.BorderSize = 0;
            this.btnVoltar.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Red;
            this.btnVoltar.FlatAppearance.MouseOverBackColor = System.Drawing.Color.WhiteSmoke;
            this.btnVoltar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVoltar.Location = new System.Drawing.Point(191, 194);
            this.btnVoltar.Name = "btnVoltar";
            this.btnVoltar.Size = new System.Drawing.Size(88, 39);
            this.btnVoltar.TabIndex = 5;
            this.btnVoltar.Text = "Voltar";
            this.btnVoltar.UseVisualStyleBackColor = true;
            this.btnVoltar.Click += new System.EventHandler(this.btnVoltar_Click);
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(347, 262);
            this.Controls.Add(this.btnVoltar);
            this.Controls.Add(this.btnConsultar);
            this.Controls.Add(this.cmbOpcao);
            this.Controls.Add(this.lblRes);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.lblVeiculos);
            this.Name = "Form2";
            this.Text = "65";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblVeiculos;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label lblRes;
        private System.Windows.Forms.ComboBox cmbOpcao;
        private System.Windows.Forms.Button btnConsultar;
        private System.Windows.Forms.Button btnVoltar;

    }
}