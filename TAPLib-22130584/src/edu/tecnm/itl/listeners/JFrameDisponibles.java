/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                               CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 17-18 HRS
:*
:*                              Bean de Seleccion
:*        
:*  Archivo     : JFrameDisponibles.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 25/Octubre/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n :  En este proyecto se creara un bean reutilizable para
:*                 manejar selecciones
:*
:*
:*
:*
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  31/Octubre/2023 Ramon       Creacion de los metodos para manejar los datos de los evnetos
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.listeners;

import edu.tecnm.itl.beans.SeleccionadosEvent;
import edu.tecnm.itl.beans.SeleccionadosListener;
import java.util.ArrayList;

/**
 *
 * @author rami
 */
public class JFrameDisponibles extends javax.swing.JFrame implements SeleccionadosListener
{

    ArrayList<String> datos;

    /**
     * Creates new form JFrameSeleccionados
     */
    public JFrameDisponibles()
    {
        initComponents();
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

        jLabelContador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelUltimoMovimiento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelContador.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabelContador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContador.setText("Y");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DISPONIBLES");

        jLabelUltimoMovimiento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelUltimoMovimiento.setText("Ultimo Movimiento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelContador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jLabelUltimoMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelContador, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUltimoMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(JFrameDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(JFrameDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(JFrameDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(JFrameDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new JFrameDisponibles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelContador;
    private javax.swing.JLabel jLabelUltimoMovimiento;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispMoverUno(SeleccionadosEvent evento)
    {
        datos = evento.getDatos();
        jLabelContador.setText(datos.get(0));
    }

    @Override
    public void dispMoverTodo(SeleccionadosEvent evento)
    {
        datos = evento.getDatos();
        jLabelContador.setText(datos.get(0));
        jLabelUltimoMovimiento.setText("Ultimo Movimiento: Todos fueron movidos");
    }

    @Override
    public void selecMoverUno(SeleccionadosEvent evento)
    {
        datos = evento.getDatos();
        jLabelContador.setText(datos.get(0));
        jLabelUltimoMovimiento.setText("Ultimo Movimiento: " + datos.get(3));
    }

    @Override
    public void selecMoverTodo(SeleccionadosEvent evento)
    {
        datos = evento.getDatos();
        jLabelContador.setText(datos.get(0));
        jLabelUltimoMovimiento.setText("Ultimo Movimiento: Todos fueron movidos");
    }

    @Override
    public void inicializar(int disp, int selec)
    {
        jLabelContador.setText(disp + "");
        jLabelUltimoMovimiento.setText("Ultimo Movimiento: No hay movimientos");
    }
}