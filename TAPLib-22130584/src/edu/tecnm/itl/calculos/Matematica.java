/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                               CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 17-18 HRS
:*
:*                       Aplicacion visual que realiza operaciones matematicas
:*        
:*  Archivo     : Matematicas.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 28/Agosto/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n :  Esta aplicacion permite selaccionar una operacion matematica,
:*                 entre las cuales estan:
:*                  1. Factorial n!
:*                  2. Permutaciones de n tomando r P(n,r)
:*                  3. Combinaciones de n tomando r C(n,r)
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  28/Agosto/2023 Ramon       Modificaciones hechas en clase
:*------------------------------------------------------------------------------------------*/

package edu.tecnm.itl.calculos;

public class Matematica
{
    //=======================================================================
    
    public static long Factorial(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        return n * Factorial(n - 1);
    }
    
    //=======================================================================
    
    public static long Combinaciones(int n, int r)
    {
        return Permutaciones(n, r) / Factorial(r);
    }
    
    //=======================================================================

    public static long Permutaciones(int n, int r)
    {
        return Factorial(n) / Factorial(n - r);
    }
    
    //=======================================================================

}
