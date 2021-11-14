namespace Tratamentos_Erros
{
    partial class Form1
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
            this.lblSoma = new System.Windows.Forms.Label();
            this.lblMais = new System.Windows.Forms.Label();
            this.lblIgual = new System.Windows.Forms.Label();
            this.txtNum1 = new System.Windows.Forms.TextBox();
            this.txtNum2 = new System.Windows.Forms.TextBox();
            this.txtResul = new System.Windows.Forms.TextBox();
            this.btnCalcular = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblSoma
            // 
            this.lblSoma.AutoSize = true;
            this.lblSoma.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblSoma.Location = new System.Drawing.Point(94, 22);
            this.lblSoma.Name = "lblSoma";
            this.lblSoma.Size = new System.Drawing.Size(70, 24);
            this.lblSoma.TabIndex = 0;
            this.lblSoma.Text = "SOMA";
            // 
            // lblMais
            // 
            this.lblMais.AutoSize = true;
            this.lblMais.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMais.Location = new System.Drawing.Point(82, 121);
            this.lblMais.Name = "lblMais";
            this.lblMais.Size = new System.Drawing.Size(19, 20);
            this.lblMais.TabIndex = 1;
            this.lblMais.Text = "+";
            // 
            // lblIgual
            // 
            this.lblIgual.AutoSize = true;
            this.lblIgual.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblIgual.Location = new System.Drawing.Point(170, 122);
            this.lblIgual.Name = "lblIgual";
            this.lblIgual.Size = new System.Drawing.Size(19, 20);
            this.lblIgual.TabIndex = 2;
            this.lblIgual.Text = "=";
            // 
            // txtNum1
            // 
            this.txtNum1.ForeColor = System.Drawing.Color.Red;
            this.txtNum1.Location = new System.Drawing.Point(12, 121);
            this.txtNum1.Name = "txtNum1";
            this.txtNum1.Size = new System.Drawing.Size(64, 20);
            this.txtNum1.TabIndex = 3;
            // 
            // txtNum2
            // 
            this.txtNum2.ForeColor = System.Drawing.Color.Red;
            this.txtNum2.Location = new System.Drawing.Point(107, 122);
            this.txtNum2.Name = "txtNum2";
            this.txtNum2.Size = new System.Drawing.Size(57, 20);
            this.txtNum2.TabIndex = 4;
            // 
            // txtResul
            // 
            this.txtResul.ForeColor = System.Drawing.Color.Red;
            this.txtResul.Location = new System.Drawing.Point(195, 121);
            this.txtResul.Name = "txtResul";
            this.txtResul.Size = new System.Drawing.Size(61, 20);
            this.txtResul.TabIndex = 5;
            // 
            // btnCalcular
            // 
            this.btnCalcular.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalcular.ForeColor = System.Drawing.Color.Black;
            this.btnCalcular.Location = new System.Drawing.Point(86, 179);
            this.btnCalcular.Name = "btnCalcular";
            this.btnCalcular.Size = new System.Drawing.Size(104, 51);
            this.btnCalcular.TabIndex = 6;
            this.btnCalcular.Text = "CALCULAR";
            this.btnCalcular.UseVisualStyleBackColor = true;
            this.btnCalcular.Click += new System.EventHandler(this.btnCalcular_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(271, 262);
            this.Controls.Add(this.btnCalcular);
            this.Controls.Add(this.txtResul);
            this.Controls.Add(this.txtNum2);
            this.Controls.Add(this.txtNum1);
            this.Controls.Add(this.lblIgual);
            this.Controls.Add(this.lblMais);
            this.Controls.Add(this.lblSoma);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblSoma;
        private System.Windows.Forms.Label lblMais;
        private System.Windows.Forms.Label lblIgual;
        private System.Windows.Forms.TextBox txtNum1;
        private System.Windows.Forms.TextBox txtNum2;
        private System.Windows.Forms.TextBox txtResul;
        private System.Windows.Forms.Button btnCalcular;
    }
}

