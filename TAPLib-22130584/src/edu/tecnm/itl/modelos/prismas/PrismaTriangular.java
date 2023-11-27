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
:*  Archivo     : PrismoTriangular.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 24/Septiembre/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n : Clase PrismaTriangular para la creacion de objetos
:*                  
:*  Ultima modif:
:*  Fecha               Modific�             Motivo
:*========================================================================================== 
:*  24/Septiembre/2023  Ramon       Se creo la base y se añadió la funcionalidad
:*  28/Septiembre/2023  Ramon       Se corrigieron los métodos
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.modelos.prismas;

import edu.tecnm.itl.modelos.figuras.Rectangulo;
import edu.tecnm.itl.modelos.figuras.TrianguloRectangulo;

public class PrismaTriangular extends Prisma
{

    //=================================================
    private float catetoA;
    private float catetoB;
    private float altura;

    //=================================================
    
    private TrianguloRectangulo baseSup;
    private TrianguloRectangulo baseInf;
    
    private TrianguloRectangulo baseSupInf;
    
    private Rectangulo carasLateral1;
    private Rectangulo carasLateral2;
    private Rectangulo carasLateral3;
    private Rectangulo carasLateral4;

    private Rectangulo carasLaterales;

    //=================================================
    public PrismaTriangular(float catA, float catB, float altura)
    {
        catetoA = catA;
        catetoB = catB;
        this.altura = altura;
        baseSupInf = new TrianguloRectangulo(catA, catB);
        carasLaterales = new Rectangulo(altura, baseSupInf.Hipotenusa());
    }

    //=================================================
    public float getCatetoA()
    {
        return catetoA;
    }

    //=================================================
    public void setCatetoA(float catetoA)
    {
        this.catetoA = catetoA;
    }
    //=================================================

    public float getCatetoB()
    {
        return catetoB;
    }

    //=================================================
    public void setCatetoB(float catetoB)
    {
        this.catetoB = catetoB;
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
        return areaBase() * altura;
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
        //return (baseSupInf.getCateto1() * baseSupInf.getCateto2()) / 2;
        return baseSupInf.Area();
    }
    //=================================================

}
