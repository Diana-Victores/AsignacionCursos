
namespace CursosAsignacionProyecto1
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form2));
            this.panel1 = new System.Windows.Forms.Panel();
            this.Lbl_Alumno = new System.Windows.Forms.Label();
            this.Lbl_Maestro = new System.Windows.Forms.Label();
            this.Btn_Usuario = new System.Windows.Forms.Button();
            this.Btn_Alumno = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.LightSeaGreen;
            this.panel1.Controls.Add(this.label1);
            this.panel1.Controls.Add(this.Lbl_Alumno);
            this.panel1.Controls.Add(this.Lbl_Maestro);
            this.panel1.Controls.Add(this.Btn_Usuario);
            this.panel1.Controls.Add(this.Btn_Alumno);
            this.panel1.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.panel1.Location = new System.Drawing.Point(2, 2);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(527, 404);
            this.panel1.TabIndex = 5;
            // 
            // Lbl_Alumno
            // 
            this.Lbl_Alumno.AutoSize = true;
            this.Lbl_Alumno.Font = new System.Drawing.Font("Arial", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Lbl_Alumno.Location = new System.Drawing.Point(95, 74);
            this.Lbl_Alumno.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.Lbl_Alumno.Name = "Lbl_Alumno";
            this.Lbl_Alumno.Size = new System.Drawing.Size(74, 22);
            this.Lbl_Alumno.TabIndex = 3;
            this.Lbl_Alumno.Text = "Alumno";
            // 
            // Lbl_Maestro
            // 
            this.Lbl_Maestro.AutoSize = true;
            this.Lbl_Maestro.Font = new System.Drawing.Font("Arial", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Lbl_Maestro.Location = new System.Drawing.Point(317, 74);
            this.Lbl_Maestro.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.Lbl_Maestro.Name = "Lbl_Maestro";
            this.Lbl_Maestro.Size = new System.Drawing.Size(107, 22);
            this.Lbl_Maestro.TabIndex = 2;
            this.Lbl_Maestro.Text = "Catedratico";
            // 
            // Btn_Usuario
            // 
            this.Btn_Usuario.BackColor = System.Drawing.Color.Transparent;
            this.Btn_Usuario.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("Btn_Usuario.BackgroundImage")));
            this.Btn_Usuario.Enabled = false;
            this.Btn_Usuario.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.Btn_Usuario.ForeColor = System.Drawing.Color.Transparent;
            this.Btn_Usuario.Location = new System.Drawing.Point(283, 110);
            this.Btn_Usuario.Margin = new System.Windows.Forms.Padding(2);
            this.Btn_Usuario.Name = "Btn_Usuario";
            this.Btn_Usuario.Size = new System.Drawing.Size(150, 199);
            this.Btn_Usuario.TabIndex = 1;
            this.Btn_Usuario.UseVisualStyleBackColor = false;
            // 
            // Btn_Alumno
            // 
            this.Btn_Alumno.BackColor = System.Drawing.Color.Transparent;
            this.Btn_Alumno.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("Btn_Alumno.BackgroundImage")));
            this.Btn_Alumno.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.Btn_Alumno.ImageKey = "(ninguno)";
            this.Btn_Alumno.Location = new System.Drawing.Point(55, 110);
            this.Btn_Alumno.Margin = new System.Windows.Forms.Padding(2);
            this.Btn_Alumno.Name = "Btn_Alumno";
            this.Btn_Alumno.Size = new System.Drawing.Size(150, 199);
            this.Btn_Alumno.TabIndex = 0;
            this.Btn_Alumno.UseVisualStyleBackColor = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Arial", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(176, 20);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(141, 32);
            this.label1.TabIndex = 4;
            this.label1.Text = "USUARIO";
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(533, 413);
            this.Controls.Add(this.panel1);
            this.Name = "Form2";
            this.Text = "Usuario";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label Lbl_Alumno;
        private System.Windows.Forms.Label Lbl_Maestro;
        private System.Windows.Forms.Button Btn_Usuario;
        private System.Windows.Forms.Button Btn_Alumno;
        private System.Windows.Forms.Label label1;
    }
}