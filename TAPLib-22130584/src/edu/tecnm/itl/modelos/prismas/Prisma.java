/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                               CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 17-18 HRS
:*
:*                       Aplicacion de objetos geometricos
:*                                          
:*        
:*  Archivo     : Prisma.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 24/Septiembre/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n : Clase Abstracta Prisma para el calculo
:*                  
:*  Ultima modif:
:*  Fecha               Modific�             Motivo
:*========================================================================================== 
:*  24/Septiembre/2023  Ramon       Se creo la base y se añadió la funcionalidad
:*  28/Septiembre/2023  Ramon       Se corrigieron los métodos
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.modelos.prismas;

public abstract class Prisma
{
    //=================================================

    public abstract float areaBase();
    //=================================================

    public abstract float areaLateral();
    //=================================================

    public abstract float areaTotal();
    //=================================================

    public abstract float volumen();
    //=================================================

}
