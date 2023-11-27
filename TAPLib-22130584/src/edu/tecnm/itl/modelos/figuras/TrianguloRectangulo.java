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
:*  Archivo     : PrismoRectangulo.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 24/Septiembre/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n : Clase PrismaRectangulo para la creacion de objetos
:*                  
:*  Ultima modif:
:*  Fecha               Modific�             Motivo
:*========================================================================================== 
:*  24/Septiembre/2023  Ramon       Se creo la base y se añadió la funcionalidad
:*  28/Septiembre/2023  Ramon       Se corrigieron los métodos
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.modelos.figuras;

public class TrianguloRectangulo extends Figura
{

    private float cateto1;
    private float cateto2;

    //=================================================
    public TrianguloRectangulo(float cat1, float cat2)
    {
        cateto1 = cat1;
        cateto2 = cat2;
    }
    //=================================================

    public float Hipotenusa()
    {
        return (float) Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
    //=================================================

    public float getCateto1()
    {
        return cateto1;
    }
    //=================================================

    public void setCateto1(float cateto1)
    {
        this.cateto1 = cateto1;
    }
    //=================================================

    public float getCateto2()
    {
        return cateto2;
    }
    //=================================================

    public void setCateto2(float cateto2)
    {
        this.cateto2 = cateto2;
    }
    //=================================================

    @Override
    public float Perimetro()
    {
        return cateto1 + cateto2 + Hipotenusa();
    }

    @Override
    public float Area()
    {
        return (cateto1 * cateto2) / 2;
    }

}
