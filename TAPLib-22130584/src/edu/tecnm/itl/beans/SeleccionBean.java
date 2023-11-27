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
:*  Archivo     : BeanSeleccion.java
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
:*  27/Octubre/2023 Ramon       Modificaciones hechas en clase
:*  31/Octubre/2023 Ramon       Finalizacion de listeners y triggers
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.beans;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import edu.tecnm.itl.listeners.JFrameDisponibles;
import edu.tecnm.itl.listeners.JFrameSeleccionados;
import java.util.ArrayList;

/**
 *
 * @author rami
 */
public class SeleccionBean extends javax.swing.JPanel
{

    private String[] listaDisponible
            =
            {
                "Goku", "Vegetta", "Gohan", "Trunks"
            };

    private String[] listaSeleccionado
            =
            {
                "Krilin", "Yamcha", "Gady"
            };
    private DefaultListModel modeloIzquierda;
    private DefaultListModel modeloDerecha;
    private String seleccionadosLabel = "Seleccionados";
    private String disponiblesLabel = "Disponibles";
    private JFrameDisponibles jfDisp;
    private JFrameSeleccionados jfSelec;
    String ultimoDisponible;
    String ultimoSeleccionado;
    private ArrayList<SeleccionadosListener> listeneres;

    //==========================================================================
    public SeleccionBean()
    {
        initComponents();
        modeloIzquierda = new DefaultListModel();
        jListIzquierda.setModel(modeloIzquierda);
        modeloDerecha = new DefaultListModel();
        jListDerecha.setModel(modeloDerecha);

        llenarListaDisponibles();
        llenarListaSeleccionados();
        jLabelDisponibles.setText(modeloIzquierda.getSize() + " " + disponiblesLabel);
        jLabelSeleccionados.setText(modeloDerecha.getSize() + " " + seleccionadosLabel);
        ultimoSeleccionado = "";
        ultimoDisponible = "";

        //Añadir Listeneres
        listeneres = new ArrayList();
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

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuAcercaDe = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListIzquierda = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDerecha = new javax.swing.JList<>();
        jLabelDisponible = new javax.swing.JLabel();
        jLabelSeleccionado = new javax.swing.JLabel();
        jButtonMoverDerecha = new javax.swing.JButton();
        jButtonMoverDerechaTodo = new javax.swing.JButton();
        jButtonMoverIzquierda = new javax.swing.JButton();
        jButtonMoverIzquierdaTodo = new javax.swing.JButton();
        jLabelDisponibles = new javax.swing.JLabel();
        jLabelSeleccionados = new javax.swing.JLabel();

        jMenuAcercaDe.setText("Acerca De..");
        jMenuAcercaDe.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuAcercaDeActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuAcercaDe);

        setComponentPopupMenu(jPopupMenu);

        jListIzquierda.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jListIzquierdaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListIzquierda);

        jListDerecha.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jListDerechaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jListDerecha);

        jLabelDisponible.setText("Disponible:");

        jLabelSeleccionado.setText("Seleccionado:");

        jButtonMoverDerecha.setText(">");
        jButtonMoverDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMoverDerecha.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonMoverDerechaActionPerformed(evt);
            }
        });

        jButtonMoverDerechaTodo.setText(">>");
        jButtonMoverDerechaTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMoverDerechaTodo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonMoverDerechaTodoActionPerformed(evt);
            }
        });

        jButtonMoverIzquierda.setText("<");
        jButtonMoverIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMoverIzquierda.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonMoverIzquierdaActionPerformed(evt);
            }
        });

        jButtonMoverIzquierdaTodo.setText("<<");
        jButtonMoverIzquierdaTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMoverIzquierdaTodo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonMoverIzquierdaTodoActionPerformed(evt);
            }
        });

        jLabelDisponibles.setText("Disponibles:");

        jLabelSeleccionados.setText("Seleccionados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelDisponible, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonMoverDerecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMoverDerechaTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMoverIzquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMoverIzquierdaTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelSeleccionados, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDisponible)
                    .addComponent(jLabelSeleccionado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonMoverDerecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMoverDerechaTodo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMoverIzquierda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMoverIzquierdaTodo))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDisponibles)
                    .addComponent(jLabelSeleccionados))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //==========================================================================

    private void jListIzquierdaMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jListIzquierdaMousePressed
    {//GEN-HEADEREND:event_jListIzquierdaMousePressed
        jListDerecha.clearSelection();
    }//GEN-LAST:event_jListIzquierdaMousePressed
    //==========================================================================

    private void jListDerechaMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jListDerechaMousePressed
    {//GEN-HEADEREND:event_jListDerechaMousePressed
        jListIzquierda.clearSelection();
    }//GEN-LAST:event_jListDerechaMousePressed
    //==========================================================================

    private void jButtonMoverDerechaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonMoverDerechaActionPerformed
    {//GEN-HEADEREND:event_jButtonMoverDerechaActionPerformed
        try
        {
            ultimoDisponible = modeloIzquierda.getElementAt(jListIzquierda.getSelectedIndex()).toString();
            modeloDerecha.addElement(jListIzquierda.getSelectedValue());
            modeloIzquierda.remove(jListIzquierda.getSelectedIndex());
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Selecciona un elemento de la lista izquierda", "Error: No hay seleccion", JOptionPane.ERROR_MESSAGE);

        } finally
        {
            SeleccionadosEvent evento = crearEvento();
            fireSeleccionListerDispMoverUno(evento);
            contadorSeleccionados();
            contadorDisponibles();
        }

    }//GEN-LAST:event_jButtonMoverDerechaActionPerformed
    //==========================================================================

    private void jButtonMoverDerechaTodoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonMoverDerechaTodoActionPerformed
    {//GEN-HEADEREND:event_jButtonMoverDerechaTodoActionPerformed
        if (modeloIzquierda.getSize() != 0)
        {
            for (int i = 0; i < modeloIzquierda.getSize(); i++)
            {
                modeloDerecha.addElement(modeloIzquierda.getElementAt(i));
            }
            ultimoDisponible = modeloIzquierda.getElementAt(modeloIzquierda.getSize() - 1).toString();

            modeloIzquierda.removeAllElements();
            contadorSeleccionados();
            contadorDisponibles();
            SeleccionadosEvent evento = crearEvento();
            fireSeleccionListerDispMoverTodos(evento);
        } else
        {
            JOptionPane.showMessageDialog(this, "No hay elementos a mover", "Error: Lista vacia", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonMoverDerechaTodoActionPerformed
    //==========================================================================

    private void jButtonMoverIzquierdaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonMoverIzquierdaActionPerformed
    {//GEN-HEADEREND:event_jButtonMoverIzquierdaActionPerformed
        try
        {
            ultimoSeleccionado = modeloDerecha.getElementAt(jListDerecha.getSelectedIndex()).toString();
            modeloIzquierda.addElement(jListDerecha.getSelectedValue());
            modeloDerecha.remove(jListDerecha.getSelectedIndex());
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Selecciona un elemento de la lista derecha", "Error: No hay seleccion", JOptionPane.ERROR_MESSAGE);
        } finally
        {
            SeleccionadosEvent evento = crearEvento();
            fireSeleccionListerSelecMoverUno(evento);
            contadorSeleccionados();
            contadorDisponibles();
        }


    }//GEN-LAST:event_jButtonMoverIzquierdaActionPerformed
    //==========================================================================

    private void jButtonMoverIzquierdaTodoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonMoverIzquierdaTodoActionPerformed
    {//GEN-HEADEREND:event_jButtonMoverIzquierdaTodoActionPerformed
        if (modeloDerecha.size() != 0)
        {
            for (int i = 0; i < modeloDerecha.getSize(); i++)
            {
                modeloIzquierda.addElement(modeloDerecha.getElementAt(i));
            }

            ultimoSeleccionado = modeloDerecha.getElementAt(modeloDerecha.getSize() - 1).toString();

            modeloDerecha.removeAllElements();
            contadorSeleccionados();
            contadorDisponibles();
            SeleccionadosEvent evento = crearEvento();
            fireSeleccionListerSelecMoverTodos(evento);
        } else
        {
            JOptionPane.showMessageDialog(this, "No hay elementos a mover", "Error: Lista vacia", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonMoverIzquierdaTodoActionPerformed
    //==========================================================================

    private void jMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuAcercaDeActionPerformed
    {//GEN-HEADEREND:event_jMenuAcercaDeActionPerformed
        ImageIcon icon = new ImageIcon(getClass().getResource("/iconos/itl.png"));
        JOptionPane.showMessageDialog(this, "BeanSeleccion\nPrograma creado por:\nJose Ramon Romero Zavala\nMatricula: 22130584\nHecho con <3", "Acerca del BeanSeleccion", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_jMenuAcercaDeActionPerformed
    //==========================================================================
    public String[] getListaDisponible()
    {
        return listaDisponible;
    }
    //==========================================================================

    public void setListaDisponible(String[] listaDisponible)
    {
        this.listaDisponible = listaDisponible;
        llenarListaDisponibles();
        contadorDisponibles();
    }
    //==========================================================================

    public String[] getListaSeleccionado()
    {
        return listaSeleccionado;
    }
    //==========================================================================

    public void setListaSeleccionado(String[] listaSeleccionado)
    {
        this.listaSeleccionado = listaSeleccionado;
        llenarListaSeleccionados();
        contadorSeleccionados();
    }
    //==========================================================================

    public String getMoverDerechaLabel()
    {
        return jButtonMoverDerecha.getText();
    }
    //==========================================================================

    public void setMoverDerechaLabel(String MoverDerecha)
    {
        jButtonMoverDerecha.setText(MoverDerecha);
    }
    //==========================================================================

    public String getMoverDerechaTodoLabel()
    {
        return jButtonMoverDerechaTodo.getText();
    }
    //==========================================================================

    public void setMoverDerechaTodoLabel(String MoverDerechaTodo)
    {
        this.jButtonMoverDerechaTodo.setText(MoverDerechaTodo);
    }
    //==========================================================================

    public String getMoverIzquierdaLabel()
    {
        return jButtonMoverIzquierda.getText();
    }
    //==========================================================================

    public void setMoverIzquierdaLabel(String MoverIzquierda)
    {
        this.jButtonMoverIzquierda.setText(MoverIzquierda);
    }
    //==========================================================================

    public String getMoverIzquierdaTodoLabel()
    {
        return jButtonMoverIzquierdaTodo.getText();
    }
    //==========================================================================

    public void setMoverIzquierdaTodoLabel(String MoverIzquierdaTodo)
    {
        this.jButtonMoverIzquierdaTodo.setText(MoverIzquierdaTodo);
    }
    //==========================================================================

    public String getDisponibleLabel()
    {
        return jLabelDisponible.getText();
    }
    //==========================================================================

    public void setDisponibleLabel(String Disponible)
    {
        this.jLabelDisponible.setText(Disponible);
    }
    //==========================================================================

    public String getContadorDisponiblesLabel()
    {
        return disponiblesLabel;
    }
    //==========================================================================

    public void setContadorDisponiblesLabel(String Disponibles)
    {
        disponiblesLabel = Disponibles;
        contadorDisponibles();
    }
    //==========================================================================

    public String getSeleccionadoLabel()
    {
        return jLabelSeleccionado.getText();

    }
    //==========================================================================

    public void setSeleccionadoLabel(String Seleccionado)
    {
        this.jLabelSeleccionado.setText(Seleccionado);
    }
    //==========================================================================

    public String getContadorSeleccionadosLabel()
    {
        return seleccionadosLabel;
    }
    //==========================================================================

    public void setContadorSeleccionadosLabel(String Seleccionados)
    {

        seleccionadosLabel = Seleccionados;
        contadorSeleccionados();
    }

    //==========================================================================
    public Color getColorPanel()
    {
        return this.getBackground();
    }
    //==========================================================================

    public void setColorPanel(Color backgroundColor)
    {
        this.setBackground(backgroundColor);
    }
    //==========================================================================

    public void addSeleccionListener(SeleccionadosListener listener)
    {
        listeneres.add(listener);
    }
    //==========================================================================

    public void removeSeleccionListener(SeleccionadosListener listener)
    {
        listeneres.remove(listener);
    }
    //==========================================================================

    public void fireSeleccionListerDispMoverUno(SeleccionadosEvent event)
    {
        for (SeleccionadosListener listener : listeneres)
        {
            listener.dispMoverUno(event);
        }
    }
    //==========================================================================

    public void fireSeleccionListerDispMoverTodos(SeleccionadosEvent event)
    {
        for (SeleccionadosListener listener : listeneres)
        {
            listener.dispMoverTodo(event);
        }
    }
    //==========================================================================

    public void fireSeleccionListerSelecMoverUno(SeleccionadosEvent event)
    {
        for (SeleccionadosListener listener : listeneres)
        {
            listener.selecMoverUno(event);
        }
    }
    //==========================================================================

    public void fireSeleccionListerSelecMoverTodos(SeleccionadosEvent event)
    {
        for (SeleccionadosListener listener : listeneres)
        {
            listener.selecMoverTodo(event);
        }
    }
    //==========================================================================

    public void fireInicializar(int disp, int selec)
    {
        for (SeleccionadosListener listener : listeneres)
        {
            listener.inicializar(disp, selec);
        }
    }
    //==========================================================================

    //==========================================================================
    public void llenarListaDisponibles()
    {
        if (modeloIzquierda.size() > 1)
        {
            modeloIzquierda.removeAllElements();
        }

        for (int i = 0; i < listaDisponible.length; i++)
        {
            modeloIzquierda.addElement(listaDisponible[i]);
        }
    }
    //==========================================================================

    public void llenarListaSeleccionados()
    {
        if (modeloDerecha.size() > 1)
        {
            modeloDerecha.removeAllElements();
        }
        for (int i = 0; i < listaSeleccionado.length; i++)
        {
            modeloDerecha.addElement(listaSeleccionado[i]);
        }
    }
    //==========================================================================

    public void contadorDisponibles()
    {
        jLabelDisponibles.setText(modeloIzquierda.getSize() + " " + disponiblesLabel);
    }
    //==========================================================================

    public void contadorSeleccionados()
    {
        jLabelSeleccionados.setText(modeloDerecha.getSize() + " " + seleccionadosLabel);
    }
    //==========================================================================

    public SeleccionadosEvent crearEvento()
    {
        return new SeleccionadosEvent(
                modeloIzquierda.getSize() + "",
                modeloDerecha.getSize() + "",
                ultimoDisponible, ultimoSeleccionado);
    }
    //==========================================================================

    public int getModeloIzquierdaSize()
    {
        return modeloIzquierda.size();
    }

    public int getModeloDerechaSize()
    {
        return modeloDerecha.size();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMoverDerecha;
    private javax.swing.JButton jButtonMoverDerechaTodo;
    private javax.swing.JButton jButtonMoverIzquierda;
    private javax.swing.JButton jButtonMoverIzquierdaTodo;
    private javax.swing.JLabel jLabelDisponible;
    private javax.swing.JLabel jLabelDisponibles;
    private javax.swing.JLabel jLabelSeleccionado;
    private javax.swing.JLabel jLabelSeleccionados;
    private javax.swing.JList<String> jListDerecha;
    private javax.swing.JList<String> jListIzquierda;
    private javax.swing.JMenuItem jMenuAcercaDe;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
