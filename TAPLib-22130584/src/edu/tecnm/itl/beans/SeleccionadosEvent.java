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
:*  Archivo     : SeleccionadosEvent.java
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
package edu.tecnm.itl.beans;

import java.util.ArrayList;

public class SeleccionadosEvent
{

    ArrayList<String> lista = new ArrayList();

    public SeleccionadosEvent(String cuentaDisponible, String cuentaSeleccionados, String personaDisponible, String personaSeleccionado)
    {
        lista.add(cuentaDisponible);
        lista.add(cuentaSeleccionados);
        lista.add(personaDisponible);
        lista.add(personaSeleccionado);
    }

    public ArrayList getDatos()
    {
        return lista;
    }
}
