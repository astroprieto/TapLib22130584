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
:*  Archivo     : PrismoRectangular.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 24/Septiembre/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n : Clase PrismaRectangular para la creacion de objetos
:*                  
:*  Ultima modif:
:*  Fecha               Modific�             Motivo
:*========================================================================================== 
:*  24/Septiembre/2023  Ramon       Se creo la base y se añadió la funcionalidad
:*  28/Septiembre/2023  Ramon       Se corrigieron los métodos
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.modelos.prismas;

import edu.tecnm.itl.modelos.figuras.Rectangulo;

public class PrismaRectangular extends Prisma
{
    //=================================================

    private float ladoA;
    private float ladoB;
    private float altura;

    //=================================================
    private Rectangulo baseSup;
    private Rectangulo baseInf;

    private Rectangulo baseSupInf;

    private Rectangulo carasLateral1;
    private Rectangulo carasLateral2;
    private Rectangulo carasLateral3;
    private Rectangulo carasLateral4;

    private Rectangulo carasLaterales;

    //=================================================
    public PrismaRectangular(float ladoA, float ladoB, float altura)
    {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
        baseSupInf = new Rectangulo(ladoA, ladoB);
        carasLaterales = new Rectangulo(altura, ladoB);
    }
    //=================================================

    public float getLadoA()
    {
        return ladoA;
    }
    //=================================================

    public void setLadoA(float ladoA)
    {
        this.ladoA = ladoA;
    }
    //=================================================

    public float getLadoB()
    {
        return ladoB;
    }
    //=================================================

    public void setLadoB(float ladoB)
    {
        this.ladoB = ladoB;
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
        return baseSupInf.Area() * carasLaterales.getLargo();
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
        return baseSupInf.Perimetro() * carasLaterales.getLargo();
    }
    //=================================================

    @Override
    public float areaBase()
    {
        return baseSupInf.Area();
    }

    //=================================================
}
