namespace Calculadora
{
    partial class CÁLCULADORA
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
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.txtNum1 = new System.Windows.Forms.TextBox();
            this.txtNum2 = new System.Windows.Forms.TextBox();
            this.txtResultado = new System.Windows.Forms.TextBox();
            this.btnSoma = new System.Windows.Forms.Button();
            this.btnSubtrair = new System.Windows.Forms.Button();
            this.btnMultiplicar = new System.Windows.Forms.Button();
            this.btnDividir = new System.Windows.Forms.Button();
            this.btnReseta = new System.Windows.Forms.Button();
            this.btnSair = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.Transparent;
            this.label1.Font = new System.Drawing.Font("Georgia", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.Black;
            this.label1.Location = new System.Drawing.Point(110, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(143, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "Cálculadora";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.BackColor = System.Drawing.Color.Transparent;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.Black;
            this.label2.Location = new System.Drawing.Point(12, 58);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(79, 16);
            this.label2.TabIndex = 1;
            this.label2.Text = "Número 1°";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.BackColor = System.Drawing.Color.Transparent;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.Color.Black;
            this.label3.Location = new System.Drawing.Point(13, 91);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(79, 16);
            this.label3.TabIndex = 2;
            this.label3.Text = "Número 2°";
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.BackColor = System.Drawing.Color.Transparent;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.ForeColor = System.Drawing.Color.Black;
            this.label4.Location = new System.Drawing.Point(13, 243);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(79, 16);
            this.label4.TabIndex = 3;
            this.label4.Text = "Resultado";
            this.label4.Click += new System.EventHandler(this.label4_Click);
            // 
            // txtNum1
            // 
            this.txtNum1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtNum1.ForeColor = System.Drawing.Color.Red;
            this.txtNum1.Location = new System.Drawing.Point(98, 58);
            this.txtNum1.Name = "txtNum1";
            this.txtNum1.Size = new System.Drawing.Size(156, 26);
            this.txtNum1.TabIndex = 4;
            this.txtNum1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // txtNum2
            // 
            this.txtNum2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtNum2.ForeColor = System.Drawing.Color.Red;
            this.txtNum2.Location = new System.Drawing.Point(98, 87);
            this.txtNum2.Name = "txtNum2";
            this.txtNum2.Size = new System.Drawing.Size(156, 26);
            this.txtNum2.TabIndex = 5;
            // 
            // txtResultado
            // 
            this.txtResultado.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtResultado.ForeColor = System.Drawing.Color.Red;
            this.txtResultado.Location = new System.Drawing.Point(98, 242);
            this.txtResultado.Name = "txtResultado";
            this.txtResultado.Size = new System.Drawing.Size(156, 26);
            this.txtResultado.TabIndex = 6;
            // 
            // btnSoma
            // 
            this.btnSoma.BackColor = System.Drawing.Color.Honeydew;
            this.btnSoma.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnSoma.FlatAppearance.BorderSize = 0;
            this.btnSoma.FlatAppearance.CheckedBackColor = System.Drawing.Color.WhiteSmoke;
            this.btnSoma.FlatAppearance.MouseDownBackColor = System.Drawing.Color.White;
            this.btnSoma.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Red;
            this.btnSoma.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.btnSoma.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSoma.Location = new System.Drawing.Point(68, 131);
            this.btnSoma.Name = "btnSoma";
            this.btnSoma.Size = new System.Drawing.Size(89, 35);
            this.btnSoma.TabIndex = 7;
            this.btnSoma.Text = "+";
            this.btnSoma.UseVisualStyleBackColor = false;
            this.btnSoma.Click += new System.EventHandler(this.btnSoma_Click);
            // 
            // btnSubtrair
            // 
            this.btnSubtrair.BackColor = System.Drawing.Color.Honeydew;
            this.btnSubtrair.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnSubtrair.FlatAppearance.BorderSize = 0;
            this.btnSubtrair.FlatAppearance.CheckedBackColor = System.Drawing.Color.WhiteSmoke;
            this.btnSubtrair.FlatAppearance.MouseDownBackColor = System.Drawing.Color.White;
            this.btnSubtrair.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Red;
            this.btnSubtrair.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.btnSubtrair.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSubtrair.Location = new System.Drawing.Point(192, 131);
            this.btnSubtrair.Name = "btnSubtrair";
            this.btnSubtrair.Size = new System.Drawing.Size(89, 35);
            this.btnSubtrair.TabIndex = 8;
            this.btnSubtrair.Text = "-";
            this.btnSubtrair.UseVisualStyleBackColor = false;
            this.btnSubtrair.Click += new System.EventHandler(this.btnSubtrair_Click);
            // 
            // btnMultiplicar
            // 
            this.btnMultiplicar.BackColor = System.Drawing.Color.Honeydew;
            this.btnMultiplicar.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnMultiplicar.FlatAppearance.BorderSize = 0;
            this.btnMultiplicar.FlatAppearance.CheckedBackColor = System.Drawing.Color.WhiteSmoke;
            this.btnMultiplicar.FlatAppearance.MouseDownBackColor = System.Drawing.Color.White;
            this.btnMultiplicar.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Red;
            this.btnMultiplicar.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.btnMultiplicar.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMultiplicar.Location = new System.Drawing.Point(68, 190);
            this.btnMultiplicar.Name = "btnMultiplicar";
            this.btnMultiplicar.Size = new System.Drawing.Size(89, 35);
            this.btnMultiplicar.TabIndex = 9;
            this.btnMultiplicar.Text = "*";
            this.btnMultiplicar.UseVisualStyleBackColor = false;
            this.btnMultiplicar.Click += new System.EventHandler(this.btnMultiplicar_Click);
            // 
            // btnDividir
            // 
            this.btnDividir.BackColor = System.Drawing.Color.Honeydew;
            this.btnDividir.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnDividir.FlatAppearance.BorderSize = 0;
            this.btnDividir.FlatAppearance.CheckedBackColor = System.Drawing.Color.WhiteSmoke;
            this.btnDividir.FlatAppearance.MouseDownBackColor = System.Drawing.Color.White;
            this.btnDividir.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Red;
            this.btnDividir.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.btnDividir.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDividir.Location = new System.Drawing.Point(192, 190);
            this.btnDividir.Name = "btnDividir";
            this.btnDividir.Size = new System.Drawing.Size(89, 35);
            this.btnDividir.TabIndex = 10;
            this.btnDividir.Text = "/";
            this.btnDividir.UseVisualStyleBackColor = false;
            this.btnDividir.Click += new System.EventHandler(this.btnDividir_Click);
            // 
            // btnReseta
            // 
            this.btnReseta.BackColor = System.Drawing.Color.Honeydew;
            this.btnReseta.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnReseta.FlatAppearance.BorderSize = 0;
            this.btnReseta.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Red;
            this.btnReseta.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Silver;
            this.btnReseta.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.btnReseta.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnReseta.Location = new System.Drawing.Point(68, 282);
            this.btnReseta.Name = "btnReseta";
            this.btnReseta.Size = new System.Drawing.Size(89, 35);
            this.btnReseta.TabIndex = 11;
            this.btnReseta.Text = "Reseta";
            this.btnReseta.UseVisualStyleBackColor = false;
            this.btnReseta.Click += new System.EventHandler(this.btnReseta_Click);
            // 
            // btnSair
            // 
            this.btnSair.BackColor = System.Drawing.Color.Honeydew;
            this.btnSair.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.btnSair.FlatAppearance.BorderSize = 0;
            this.btnSair.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Red;
            this.btnSair.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Silver;
            this.btnSair.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.btnSair.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSair.Location = new System.Drawing.Point(192, 282);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(89, 35);
            this.btnSair.TabIndex = 12;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = false;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // CÁLCULADORA
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Gainsboro;
            this.ClientSize = new System.Drawing.Size(319, 329);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.btnReseta);
            this.Controls.Add(this.btnDividir);
            this.Controls.Add(this.btnMultiplicar);
            this.Controls.Add(this.btnSubtrair);
            this.Controls.Add(this.btnSoma);
            this.Controls.Add(this.txtResultado);
            this.Controls.Add(this.txtNum2);
            this.Controls.Add(this.txtNum1);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.ForeColor = System.Drawing.Color.Black;
            this.Name = "CÁLCULADORA";
            this.Text = "CÁLCULADORA";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtNum1;
        private System.Windows.Forms.TextBox txtNum2;
        private System.Windows.Forms.TextBox txtResultado;
        private System.Windows.Forms.Button btnSoma;
        private System.Windows.Forms.Button btnSubtrair;
        private System.Windows.Forms.Button btnMultiplicar;
        private System.Windows.Forms.Button btnDividir;
        private System.Windows.Forms.Button btnReseta;
        private System.Windows.Forms.Button btnSair;
    }
}

