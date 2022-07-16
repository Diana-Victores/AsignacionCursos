
namespace CursosAsignacionProyecto1
{
    partial class Login
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
            this.panel1 = new System.Windows.Forms.Panel();
            this.button1 = new System.Windows.Forms.Button();
            this.Btn_Ingresar = new System.Windows.Forms.Button();
            this.Lbl_Inicio = new System.Windows.Forms.Label();
            this.Lbl_Contra = new System.Windows.Forms.Label();
            this.Lbl_Usuario = new System.Windows.Forms.Label();
            this.Txt_Contra = new System.Windows.Forms.TextBox();
            this.Txt_Usuario = new System.Windows.Forms.TextBox();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.LightSeaGreen;
            this.panel1.Controls.Add(this.button1);
            this.panel1.Controls.Add(this.Btn_Ingresar);
            this.panel1.Controls.Add(this.Lbl_Inicio);
            this.panel1.Controls.Add(this.Lbl_Contra);
            this.panel1.Controls.Add(this.Lbl_Usuario);
            this.panel1.Controls.Add(this.Txt_Contra);
            this.panel1.Controls.Add(this.Txt_Usuario);
            this.panel1.Location = new System.Drawing.Point(0, 1);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(593, 372);
            this.panel1.TabIndex = 8;
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Arial", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.Location = new System.Drawing.Point(319, 226);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(102, 45);
            this.button1.TabIndex = 7;
            this.button1.Text = " Olvide Contraseña";
            this.button1.UseVisualStyleBackColor = true;
            // 
            // Btn_Ingresar
            // 
            this.Btn_Ingresar.Font = new System.Drawing.Font("Arial", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Btn_Ingresar.Location = new System.Drawing.Point(206, 226);
            this.Btn_Ingresar.Margin = new System.Windows.Forms.Padding(2);
            this.Btn_Ingresar.Name = "Btn_Ingresar";
            this.Btn_Ingresar.Size = new System.Drawing.Size(94, 45);
            this.Btn_Ingresar.TabIndex = 6;
            this.Btn_Ingresar.Text = "Ingresar";
            this.Btn_Ingresar.UseVisualStyleBackColor = true;
            // 
            // Lbl_Inicio
            // 
            this.Lbl_Inicio.AutoSize = true;
            this.Lbl_Inicio.Font = new System.Drawing.Font("Arial", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Lbl_Inicio.Location = new System.Drawing.Point(231, 46);
            this.Lbl_Inicio.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.Lbl_Inicio.Name = "Lbl_Inicio";
            this.Lbl_Inicio.Size = new System.Drawing.Size(102, 32);
            this.Lbl_Inicio.TabIndex = 4;
            this.Lbl_Inicio.Text = "LOGIN";
            // 
            // Lbl_Contra
            // 
            this.Lbl_Contra.AutoSize = true;
            this.Lbl_Contra.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Lbl_Contra.Location = new System.Drawing.Point(176, 156);
            this.Lbl_Contra.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.Lbl_Contra.Name = "Lbl_Contra";
            this.Lbl_Contra.Size = new System.Drawing.Size(89, 18);
            this.Lbl_Contra.TabIndex = 3;
            this.Lbl_Contra.Text = "Contraseña";
            // 
            // Lbl_Usuario
            // 
            this.Lbl_Usuario.AutoSize = true;
            this.Lbl_Usuario.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Lbl_Usuario.Location = new System.Drawing.Point(203, 114);
            this.Lbl_Usuario.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.Lbl_Usuario.Name = "Lbl_Usuario";
            this.Lbl_Usuario.Size = new System.Drawing.Size(62, 18);
            this.Lbl_Usuario.TabIndex = 2;
            this.Lbl_Usuario.Text = "Usuario";
            // 
            // Txt_Contra
            // 
            this.Txt_Contra.Location = new System.Drawing.Point(287, 157);
            this.Txt_Contra.Margin = new System.Windows.Forms.Padding(2);
            this.Txt_Contra.Name = "Txt_Contra";
            this.Txt_Contra.Size = new System.Drawing.Size(134, 20);
            this.Txt_Contra.TabIndex = 1;
            // 
            // Txt_Usuario
            // 
            this.Txt_Usuario.Location = new System.Drawing.Point(287, 115);
            this.Txt_Usuario.Margin = new System.Windows.Forms.Padding(2);
            this.Txt_Usuario.Name = "Txt_Usuario";
            this.Txt_Usuario.Size = new System.Drawing.Size(134, 20);
            this.Txt_Usuario.TabIndex = 0;
            // 
            // Login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(593, 367);
            this.Controls.Add(this.panel1);
            this.Name = "Login";
            this.Text = "Login";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button Btn_Ingresar;
        private System.Windows.Forms.Label Lbl_Inicio;
        private System.Windows.Forms.Label Lbl_Contra;
        private System.Windows.Forms.Label Lbl_Usuario;
        private System.Windows.Forms.TextBox Txt_Contra;
        private System.Windows.Forms.TextBox Txt_Usuario;
    }
}