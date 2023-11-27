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
:*  Archivo     : Rectangulo.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 24/Septiembre/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n : Clase Rectangulo para la creacion de objetos
:*                  
:*  Ultima modif:
:*  Fecha               Modific�             Motivo
:*========================================================================================== 
:*  24/Septiembre/2023  Ramon       Se creo la base y se añadió la funcionalidad
:*  28/Septiembre/2023  Ramon       Se corrigieron los métodos
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.modelos.figuras;

public class Rectangulo extends Figura
{

    private float largo;
    private float ancho;
    //=================================================

    public Rectangulo(float largo, float ancho)
    {
        this.largo = largo;
        this.ancho = ancho;
    }
    //=================================================

    public float getLargo()
    {
        return largo;
    }
    //=================================================

    public void setLargo(float largo)
    {
        this.largo = largo;
    }
    //=================================================

    public float getAncho()
    {
        return ancho;
    }
    //=================================================

    public void setAncho(float ancho)
    {
        this.ancho = ancho;
    }
    //=================================================

    @Override
    public float Perimetro()
    {
        return 2 * (largo + ancho);
    }
    //=================================================

    @Override
    public float Area()
    {
        return largo * ancho;
    }
    //=================================================

}
