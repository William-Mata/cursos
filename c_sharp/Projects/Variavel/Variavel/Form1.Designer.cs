namespace Variavel
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
            this.lblTesteVariavel = new System.Windows.Forms.Label();
            this.txtNome = new System.Windows.Forms.TextBox();
            this.btnClique = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblTesteVariavel
            // 
            this.lblTesteVariavel.AutoSize = true;
            this.lblTesteVariavel.Font = new System.Drawing.Font("Arial", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTesteVariavel.Location = new System.Drawing.Point(39, 46);
            this.lblTesteVariavel.Name = "lblTesteVariavel";
            this.lblTesteVariavel.Size = new System.Drawing.Size(170, 22);
            this.lblTesteVariavel.TabIndex = 0;
            this.lblTesteVariavel.Text = "Teste De Variavel";
            this.lblTesteVariavel.Click += new System.EventHandler(this.label1_Click);
            // 
            // txtNome
            // 
            this.txtNome.Font = new System.Drawing.Font("Arial", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtNome.Location = new System.Drawing.Point(43, 102);
            this.txtNome.Name = "txtNome";
            this.txtNome.Size = new System.Drawing.Size(166, 20);
            this.txtNome.TabIndex = 1;
            // 
            // btnClique
            // 
            this.btnClique.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnClique.Location = new System.Drawing.Point(56, 154);
            this.btnClique.Name = "btnClique";
            this.btnClique.Size = new System.Drawing.Size(138, 23);
            this.btnClique.TabIndex = 2;
            this.btnClique.Text = "Clique Aqui!";
            this.btnClique.UseVisualStyleBackColor = true;
            this.btnClique.Click += new System.EventHandler(this.btnClique_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(251, 266);
            this.Controls.Add(this.btnClique);
            this.Controls.Add(this.txtNome);
            this.Controls.Add(this.lblTesteVariavel);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblTesteVariavel;
        private System.Windows.Forms.TextBox txtNome;
        private System.Windows.Forms.Button btnClique;
    }
}

