namespace Arrays
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
            this.btnTeste = new System.Windows.Forms.Button();
            this.btnVetor = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btnTeste
            // 
            this.btnTeste.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnTeste.Location = new System.Drawing.Point(73, 48);
            this.btnTeste.Name = "btnTeste";
            this.btnTeste.Size = new System.Drawing.Size(129, 75);
            this.btnTeste.TabIndex = 0;
            this.btnTeste.Text = "Teste Vetor";
            this.btnTeste.UseVisualStyleBackColor = true;
            this.btnTeste.Click += new System.EventHandler(this.button1_Click);
            // 
            // btnVetor
            // 
            this.btnVetor.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVetor.Location = new System.Drawing.Point(73, 147);
            this.btnVetor.Name = "btnVetor";
            this.btnVetor.Size = new System.Drawing.Size(129, 75);
            this.btnVetor.TabIndex = 1;
            this.btnVetor.Text = "Vetor Texto";
            this.btnVetor.UseVisualStyleBackColor = true;
            this.btnVetor.Click += new System.EventHandler(this.btnVetor_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 262);
            this.Controls.Add(this.btnVetor);
            this.Controls.Add(this.btnTeste);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnTeste;
        private System.Windows.Forms.Button btnVetor;
    }
}

