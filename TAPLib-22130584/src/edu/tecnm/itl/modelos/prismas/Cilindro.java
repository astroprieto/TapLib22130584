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
:*  Archivo     : Cilindro.java
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
package edu.tecnm.itl.modelos.prismas;

import edu.tecnm.itl.modelos.figuras.Circulo;
import edu.tecnm.itl.modelos.figuras.Rectangulo;

public class Cilindro extends Prisma
{
    //=================================================

    private float radio;
    private float altura;

    //=================================================
    private Circulo areaSup;
    private Circulo areaInfSup;
    private Rectangulo areaLateral;

    //=================================================
    public Cilindro(float radio, float altura)
    {
        this.radio = radio;
        this.altura = altura;
        areaInfSup = new Circulo(radio);
        areaLateral = new Rectangulo(radio, altura);
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

    public float getAltura()
    {
        return altura;
    }
    //=================================================

    public void setAltura(float altura)
    {
        this.altura = altura;
    }
    //=================================================

    @Override
    public float volumen()
    {
        return areaBase() * areaLateral.getAncho();
    }
    //=================================================

    @Override
    public float areaTotal()
    {
        return areaLateral() + (2 * areaBase());
    }
    //=================================================

    @Override
    public float areaLateral()
    {
        return areaInfSup.Circunferencia() * altura;
    }
    //=================================================

    @Override
    public float areaBase()
    {
        return areaInfSup.Area();
    }
    //=================================================

}
