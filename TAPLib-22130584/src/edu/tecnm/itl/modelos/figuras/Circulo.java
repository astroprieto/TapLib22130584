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
:*  Archivo     : Circulo.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 24/Septiembre/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n : Clase Cilindro para el calculo
:*                  
:*  Ultima modif:
:*  Fecha               Modific�             Motivo
:*========================================================================================== 
:*  24/Septiembre/2023  Ramon       Se creo la base y se añadió la funcionalidad
:*  28/Septiembre/2023  Ramon       Se corrigieron los métodos
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.modelos.figuras;

public class Circulo extends Figura
{

    private float radio;
    //=================================================

    public Circulo(float r)
    {
        radio = r;
    }
    //=================================================

    public float Circunferencia()
    {
        return (float) (2 * Math.PI * radio);
    }
    //=================================================

    public float getRadio()
    {
        return radio;
    }
    //=================================================

    public void setRadio(float radio)
    {
        this.radio = radio;
    }
    //=================================================

    @Override
    public float Perimetro()
    {
        return (float) (Math.PI * (2 * radio));
    }
    //=================================================

    @Override
    public float Area()
    {
        return (float) (Math.PI * (Math.pow(radio, 2)));
    }
    //=================================================

}
