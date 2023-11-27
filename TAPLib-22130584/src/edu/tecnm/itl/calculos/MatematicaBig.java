/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                               CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 17-18 HRS
:*
:*                       Aplicacion visual que realiza operaciones matematicas
:*                                          con BigInteger
:*        
:*  Archivo     : Matematicas.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 31/Agosto/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n :  Esta aplicacion permite selaccionar una operacion matematica,
:*                 entre las cuales estan:
:*                  1. Factorial n!
:*                  2. Permutaciones de n tomando r P(n,r)
:*                  3. Combinaciones de n tomando r C(n,r)
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  31/Agosto/2023 Ramon       Conversiones para calcular numeros mas grandes utilizando BigInteger
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.calculos;

import java.math.BigInteger;

public class MatematicaBig
{
    //=======================================================================
    public static BigInteger Factorial(int n)
    {
        BigInteger fact = new BigInteger("-1");

        if (n == 0);
        {
            fact = BigInteger.ONE;
        }

        if (n > 0)
        {
            fact = BigInteger.ONE;

            for (int i = 1; i <= n; i++)
            {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
        } else
        {
            fact = BigInteger.valueOf(-1);
        }

        return fact;
    }

    //=======================================================================
    public static BigInteger Combinaciones(int n, int r)
    {
        return Permutaciones(n, r).divide(Factorial(r));
    }

    //=======================================================================
    public static BigInteger Permutaciones(int n, int r)
    {
        return (Factorial(n)).divide(Factorial(n - r));

    }

    //=======================================================================
}
