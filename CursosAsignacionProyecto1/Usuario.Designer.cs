
namespace CursosAsignacionProyecto1
{
    partial class Usuario
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Usuario));
            this.panel1 = new System.Windows.Forms.Panel();
            this.Lbl_Alumno = new System.Windows.Forms.Label();
            this.Lbl_Maestro = new System.Windows.Forms.Label();
            this.Btn_Usuario = new System.Windows.Forms.Button();
            this.Btn_Alumno = new System.Windows.Forms.Button();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.LightSeaGreen;
            this.panel1.Controls.Add(this.Lbl_Alumno);
            this.panel1.Controls.Add(this.Lbl_Maestro);
            this.panel1.Controls.Add(this.Btn_Usuario);
            this.panel1.Controls.Add(this.Btn_Alumno);
            this.panel1.Location = new System.Drawing.Point(2, 1);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(506, 335);
            this.panel1.TabIndex = 5;
            // 
            // Lbl_Alumno
            // 
            this.Lbl_Alumno.AutoSize = true;
            this.Lbl_Alumno.Font = new System.Drawing.Font("Arial Narrow", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Lbl_Alumno.Location = new System.Drawing.Point(107, 37);
            this.Lbl_Alumno.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.Lbl_Alumno.Name = "Lbl_Alumno";
            this.Lbl_Alumno.Size = new System.Drawing.Size(54, 20);
            this.Lbl_Alumno.TabIndex = 3;
            this.Lbl_Alumno.Text = "Alumno";
            // 
            // Lbl_Maestro
            // 
            this.Lbl_Maestro.AutoSize = true;
            this.Lbl_Maestro.Font = new System.Drawing.Font("Arial Narrow", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Lbl_Maestro.Location = new System.Drawing.Point(322, 37);
            this.Lbl_Maestro.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.Lbl_Maestro.Name = "Lbl_Maestro";
            this.Lbl_Maestro.Size = new System.Drawing.Size(57, 20);
            this.Lbl_Maestro.TabIndex = 2;
            this.Lbl_Maestro.Text = "Maestro";
            // 
            // Btn_Usuario
            // 
            this.Btn_Usuario.BackColor = System.Drawing.Color.Transparent;
            this.Btn_Usuario.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("Btn_Usuario.BackgroundImage")));
            this.Btn_Usuario.Enabled = false;
            this.Btn_Usuario.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.Btn_Usuario.ForeColor = System.Drawing.Color.Transparent;
            this.Btn_Usuario.Location = new System.Drawing.Point(280, 83);
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
            this.Btn_Alumno.Location = new System.Drawing.Point(54, 83);
            this.Btn_Alumno.Margin = new System.Windows.Forms.Padding(2);
            this.Btn_Alumno.Name = "Btn_Alumno";
            this.Btn_Alumno.Size = new System.Drawing.Size(150, 199);
            this.Btn_Alumno.TabIndex = 0;
            this.Btn_Alumno.UseVisualStyleBackColor = false;
            // 
            // Usuario
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(507, 337);
            this.Controls.Add(this.panel1);
            this.Name = "Usuario";
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
    }
}