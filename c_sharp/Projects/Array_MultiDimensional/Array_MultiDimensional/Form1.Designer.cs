namespace Array_MultiDimensional
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
            this.btnArrayMulti = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btnArrayMulti
            // 
            this.btnArrayMulti.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnArrayMulti.Location = new System.Drawing.Point(31, 81);
            this.btnArrayMulti.Name = "btnArrayMulti";
            this.btnArrayMulti.Size = new System.Drawing.Size(227, 89);
            this.btnArrayMulti.TabIndex = 0;
            this.btnArrayMulti.Text = "Array Multidimensional";
            this.btnArrayMulti.UseVisualStyleBackColor = true;
            this.btnArrayMulti.Click += new System.EventHandler(this.btnArrayMulti_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 262);
            this.Controls.Add(this.btnArrayMulti);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnArrayMulti;
    }
}

