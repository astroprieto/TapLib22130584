/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                               CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 17-18 HRS
:*
:*                                  Acerca de Bean
:*        
:*  Archivo     : AcercaDeBean.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 25/Octubre/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n : Bean de Acerca de para reutilizacion de clases
:*                 
:*                  
:*                  
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  18/Octubre/2023 Ramon       Modificaciones hechas en clase
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.beans;

import edu.tecnm.itl.util.Imagenes;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author rami
 */
public class AcercaDeBean extends javax.swing.JPanel
{
    //==========================================================================

    private boolean usarColores = true;
    private String[] arrAgradecimientos =
    {
        "valor1", "valor2", "valor3"
    };
    //==========================================================================

    /**
     * Creates new form AcercaDeBean
     */
    public AcercaDeBean()
    {
        initComponents();
        //Ajustar el tamanho de los iconos
        jLabelLogoArriba.setIcon(Imagenes.cambiarTamanoIcono(jLabelLogoArriba.getIcon(), 200, 200));
        jLabelLogoAbajo.setIcon(Imagenes.cambiarTamanoIcono(jLabelLogoAbajo.getIcon(), 200, 200));
        jLabelInstitucion.setForeground(Color.orange);
        jLabelCarrera.setForeground(Color.orange);
        jLabelDesarrolladoPor.setForeground(Color.blue);
        jLabelDesarrollador.setForeground(Color.blue);
        jLabelLeyenda.setForeground(Color.red);
        jLabelLogoAbajo.setForeground(Color.red);
        jLabelLogoArriba.setForeground(Color.pink);
        jLabelNombreApp.setForeground(Color.yellow);
        jLabelUniversidad.setForeground(Color.MAGENTA);
        jLabelVersionApp.setForeground(Color.CYAN);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItemAgradeciminetos = new javax.swing.JMenuItem();
        jMenuAcercaDe = new javax.swing.JMenuItem();
        jLabelLogoArriba = new javax.swing.JLabel();
        jLabelLogoAbajo = new javax.swing.JLabel();
        jLabelInstitucion = new javax.swing.JLabel();
        jLabelUniversidad = new javax.swing.JLabel();
        jLabelNombreApp = new javax.swing.JLabel();
        jLabelCarrera = new javax.swing.JLabel();
        jLabelVersionApp = new javax.swing.JLabel();
        jLabelDesarrolladoPor = new javax.swing.JLabel();
        jLabelDesarrollador = new javax.swing.JLabel();
        jLabelLeyenda = new javax.swing.JLabel();

        jMenuItemAgradeciminetos.setText("Agradecimientos");
        jMenuItemAgradeciminetos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemAgradeciminetosActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemAgradeciminetos);

        jMenuAcercaDe.setText("Acerca De..");
        jMenuAcercaDe.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuAcercaDeActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuAcercaDe);

        setComponentPopupMenu(jPopupMenu1);

        jLabelLogoArriba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LOGO-VERTICAL-TECNM.png"))); // NOI18N

        jLabelLogoAbajo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/itl.png"))); // NOI18N

        jLabelInstitucion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelInstitucion.setForeground(new java.awt.Color(255, 0, 0));
        jLabelInstitucion.setText("Tecnologico Nacional De Mexico");

        jLabelUniversidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelUniversidad.setForeground(new java.awt.Color(255, 0, 0));
        jLabelUniversidad.setText("Campus La Laguna");

        jLabelNombreApp.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombreApp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNombreApp.setForeground(new java.awt.Color(255, 0, 204));
        jLabelNombreApp.setText("U2TopAvProApp");

        jLabelCarrera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelCarrera.setForeground(new java.awt.Color(51, 51, 255));
        jLabelCarrera.setText("Ingeniera en Sistemas Computacionales");

        jLabelVersionApp.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVersionApp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelVersionApp.setForeground(new java.awt.Color(255, 0, 204));
        jLabelVersionApp.setText("V.1.0.0");

        jLabelDesarrolladoPor.setText("Desarrollado Por:");

        jLabelDesarrollador.setText("José Ramón Romero Zavala - 22130584");

        jLabelLeyenda.setText("(C) Todos los Derechos Reservados, Octubre 2023, Torreón Coahuila");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLogoArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabelLogoAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDesarrolladoPor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelDesarrollador)
                                .addComponent(jLabelLeyenda)))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jLabelUniversidad))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCarrera)
                                    .addComponent(jLabelInstitucion)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jLabelNombreApp))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jLabelVersionApp)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelInstitucion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUniversidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCarrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNombreApp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelVersionApp))
                    .addComponent(jLabelLogoArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLogoAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDesarrolladoPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDesarrollador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLeyenda)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //==========================================================================

    private void jMenuItemAgradeciminetosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemAgradeciminetosActionPerformed
    {//GEN-HEADEREND:event_jMenuItemAgradeciminetosActionPerformed
        String mensaje = "";
        for (String elemento : arrAgradecimientos)
        {
            mensaje += elemento += "\n";
        }

        JOptionPane.showMessageDialog(
                this,
                "Agradecemos las valiosas aportaciones de: \n\n" + mensaje,
                "Agradecimientos",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jMenuItemAgradeciminetosActionPerformed
    //==========================================================================

    private void jMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuAcercaDeActionPerformed
    {//GEN-HEADEREND:event_jMenuAcercaDeActionPerformed
        ImageIcon icon = new ImageIcon(getClass().getResource("/iconos/itl.png"));
        JOptionPane.showMessageDialog(this, "AcercaDeBean\nPrograma creado por:\nJose Ramon Romero Zavala\nMatricula: 22130584\nHecho con <3", "Acerca del AcercaDeBean", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_jMenuAcercaDeActionPerformed
    //==========================================================================


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCarrera;
    private javax.swing.JLabel jLabelDesarrolladoPor;
    private javax.swing.JLabel jLabelDesarrollador;
    private javax.swing.JLabel jLabelInstitucion;
    private javax.swing.JLabel jLabelLeyenda;
    private javax.swing.JLabel jLabelLogoAbajo;
    private javax.swing.JLabel jLabelLogoArriba;
    private javax.swing.JLabel jLabelNombreApp;
    private javax.swing.JLabel jLabelUniversidad;
    private javax.swing.JLabel jLabelVersionApp;
    private javax.swing.JMenuItem jMenuAcercaDe;
    private javax.swing.JMenuItem jMenuItemAgradeciminetos;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
    //=========================================================================

    public String getInstitucion()
    {
        return jLabelInstitucion.getText();
    }
    //=========================================================================

    public void setInstitucion(String jLabelInstitucion)
    {
        this.jLabelInstitucion.setText(jLabelInstitucion);
    }
    //=========================================================================

    public String getUniversidad()
    {
        return jLabelUniversidad.getText();
    }
    //=========================================================================

    public void setUniversidad(String jLabelUniversidad)
    {
        this.jLabelUniversidad.setText(jLabelUniversidad);
    }
    //=========================================================================

    public String getCarrera()
    {
        return jLabelCarrera.getText();
    }
    //=========================================================================

    public void setCarrera(String jLabelCarrera)
    {
        this.jLabelCarrera.setText(jLabelCarrera);
    }
    //=========================================================================

    public String getDesarrolladoPor()
    {
        return jLabelDesarrolladoPor.getText();
    }
    //=========================================================================

    public void setDesarrolladoPor(String jLabelDesarrolladoPor)
    {
        this.jLabelDesarrolladoPor.setText(jLabelDesarrolladoPor);
    }
    //=========================================================================

    public String getDesarrollador()
    {
        return jLabelDesarrollador.getText();
    }
    //=========================================================================

    public void setDesarrollador(String jLabelDesarrollador)
    {
        this.jLabelDesarrollador.setText(jLabelDesarrollador);
    }
    //=========================================================================

    public String getLeyenda()
    {
        return jLabelLeyenda.getText();
    }
    //=========================================================================

    public void setLeyenda(String jLabelLeyenda)
    {
        this.jLabelLeyenda.setText(jLabelLeyenda);
    }
    //=========================================================================

    public Icon getLogoAbajo()
    {
        return jLabelLogoAbajo.getIcon();
    }
    //=========================================================================

    public void setLogoAbajo(Icon jLabelLogoAbajo)
    {
        this.jLabelLogoAbajo.setIcon(jLabelLogoAbajo);
    }
    //=========================================================================

    public Icon getLogoArriba()
    {
        return jLabelLogoArriba.getIcon();
    }
    //=========================================================================

    public void setLogoArriba(Icon jLabelLogoArriba)
    {
        this.jLabelLogoArriba.setIcon(jLabelLogoArriba);
    }
    //=========================================================================

    public String getNombreApp()
    {
        return jLabelNombreApp.getText();
    }
    //=========================================================================

    public void setNombreApp(String jLabelNombreApp)
    {
        this.jLabelNombreApp.setText(jLabelNombreApp);
    }
    //=========================================================================

    public String getVersionApp()
    {
        return jLabelVersionApp.getText();
    }
    //=========================================================================

    public void setVersionApp(String jLabelVersionApp)
    {
        this.jLabelVersionApp.setText(jLabelVersionApp);
    }

    //=========================================================================
    public void setUsarColores(boolean nuevoValor)
    {
        usarColores = nuevoValor;

        if (usarColores)
        {
            jLabelInstitucion.setForeground(Color.BLACK);
            jLabelCarrera.setForeground(Color.BLACK);
            jLabelDesarrolladoPor.setForeground(Color.BLACK);
            jLabelDesarrollador.setForeground(Color.BLACK);
            jLabelLeyenda.setForeground(Color.BLACK);
            jLabelLogoAbajo.setForeground(Color.BLACK);
            jLabelLogoArriba.setForeground(Color.BLACK);
            jLabelNombreApp.setForeground(Color.BLACK);
            jLabelUniversidad.setForeground(Color.BLACK);
            jLabelVersionApp.setForeground(Color.BLACK);
        } else
        {
            jLabelInstitucion.setForeground(Color.orange);
            jLabelCarrera.setForeground(Color.orange);
            jLabelDesarrolladoPor.setForeground(Color.blue);
            jLabelDesarrollador.setForeground(Color.blue);
            jLabelLeyenda.setForeground(Color.red);
            jLabelLogoAbajo.setForeground(Color.red);
            jLabelLogoArriba.setForeground(Color.pink);
            jLabelNombreApp.setForeground(Color.yellow);
            jLabelUniversidad.setForeground(Color.MAGENTA);
            jLabelVersionApp.setForeground(Color.CYAN);
        }
    }

    //=========================================================================
    public boolean IsUsarColores()
    {
        return usarColores;
    }
    //=========================================================================

    public String[] getArrAgradeciminetos()
    {
        return arrAgradecimientos;
    }
    //=========================================================================

    public void setArrAgradeciminetos(String[] arrAgradecimientos)
    {
        this.arrAgradecimientos = arrAgradecimientos;
    }
    //=========================================================================

}