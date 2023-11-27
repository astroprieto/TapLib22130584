/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                               CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 17-18 HRS
:*
:*                        Conexion a una base de datos utilizando JDBC
:*        
:*  Archivo     : ConexionDB.java
:*  Autor       : José Ramón Romero Zavala - 22130584
:*  Fecha       : 14/Noviembre/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripci�n : Clase para manejar conexiones a base de datos
:*                 
:*                  
:*                  
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  14/Noviembre/2023 Ramon       Creacion archivo
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexionDB
{

    public static final int JAVADB = 1;
    public static final int MYSQL = 2;
    public static final int SQLSERVER = 3;
    public static final int ORACLEXE = 4;
    public static final int ACCESS = 5;

    private static ConexionDB instancia = null;
    private Connection conexion;
    //==========================================================================

    private ConexionDB()
    {

    }

    //==========================================================================
    public static ConexionDB getInstancia()
    {
        if (instancia == null)
        {
            instancia = new ConexionDB();
        }
        return instancia;
    }

    //==========================================================================
    public Connection getConexion()
    {
        return conexion;
    }

    //==========================================================================
    public boolean isConectado()
    {

        return conexion != null;
    }
    //==========================================================================

    public Connection conectar(int dbms, String servidor, int puerto, String nombreDB, String usuario, String passwd)
    {
        conexion = null;
        switch (dbms)
        {
            case JAVADB ->
            {
                //conexicon conforme a JAVADB
                try
                {
                    //Formar cadena de conexion
                    String driverClase = "org.apache.derby.jdbc.ClientDriver";
                    String urlConexion = "jdbc:derby://" + servidor + ":" + puerto + "/" + nombreDB;
                    //Cargar el controlador JDBC

                    Class.forName(driverClase);
                    conexion = DriverManager.getConnection(urlConexion, usuario, passwd);
                } catch (ClassNotFoundException | SQLException ex)
                {
                    System.out.println(ex);
                }
            }
            case MYSQL ->
            {
                //conexicon conforme a MYSQL
            }
            case SQLSERVER ->
            {
                //conexicon conforme a SQLSERVER
            }
            case ORACLEXE ->
            {
                //conexicon conforme a ORACLEXE
            }
            case ACCESS ->
            {
                //conexicon conforme a ACCESS
            }
            default ->
            {
                System.out.println("Como llegaste aqui?");
            }
        }

        return conexion;
    }
    //==========================================================================

    public void cerrarConexion()
    {
        if (conexion != null)
        {
            try
            {
                System.out.println("Desconectado");
                conexion.close();
            } catch (SQLException ex)
            {
                System.out.println(ex);
            }
        }
    }

    //==========================================================================
    //--------------------------------------------------------------------------------------------------------
    public boolean insertarAlumno(String mat, String nom, String ap, int edad, float prom)
    {
        String sql_statement = "INSERT INTO ALUMNOS VALUES (?,?,?,?,?)";
        PreparedStatement pSt = null;
        try
        {

            pSt = conexion.prepareStatement(sql_statement);
            pSt.setString(1, mat);
            pSt.setString(2, nom);
            pSt.setString(3, ap);
            pSt.setInt(4, edad);
            pSt.setFloat(5, prom);

            pSt.execute();

        } catch (SQLException ex)
        {
            System.out.println("Error en la insercion de alumno " + ex);
            return false;
        } finally
        {
            try
            {
                pSt.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return true;
    }

    //--------------------------------------------------------------------------------------------------------
    public boolean insertarMateria(String idMat, String mat, int cred)
    {
        String sql_statement = "INSERT INTO MATERIAS VALUES (?,?,?)";
        PreparedStatement pSt = null;
        try
        {

            pSt = conexion.prepareStatement(sql_statement);
            pSt.setString(1, idMat);
            pSt.setString(2, mat);
            pSt.setInt(3, cred);

            pSt.execute();

        } catch (SQLException ex)
        {
            System.out.println("Error en la insercion de Materia " + ex);
            return false;
        } finally
        {
            try
            {
                pSt.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return true;
    }

    //--------------------------------------------------------------------------------------------------------
    public boolean insertarKardex(int idCalif, String matricula, String idMateria, String periodo, int calif)
    {
        String sql_statement = "INSERT INTO KARDEX VALUES (?,?,?,?,?)";
        PreparedStatement pSt = null;
        try
        {

            pSt = conexion.prepareStatement(sql_statement);
            pSt.setInt(1, idCalif);
            pSt.setString(2, matricula);
            pSt.setString(3, idMateria);
            pSt.setString(4, periodo);
            pSt.setInt(5, calif);

            pSt.execute();

        } catch (SQLException ex)
        {
            System.out.println("Error en la insercion de Kardex " + ex);
            return false;
        } finally
        {
            try
            {
                pSt.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return true;
    }

    //--------------------------------------------------------------------------------------------------------
    public DefaultTableModel mostrarAlumnos(JTable table)
    {
        DefaultTableModel alumnos = (DefaultTableModel) table.getModel();

        String sql_statement = "SELECT * FROM ALUMNOS";

        alumnos.setRowCount(0);

        try
        {
            PreparedStatement pSt = conexion.prepareStatement(sql_statement);
            ResultSet rSet = pSt.executeQuery();

            int col = rSet.getMetaData().getColumnCount();

            int ren = 0;
            while (rSet.next())
            {
                Object[] datosRen = new Object[col];

                for (int i = 1; i <= col; i++)
                {
                    datosRen[i - 1] = rSet.getObject(i);
                }
                alumnos.addRow(datosRen);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex);
        }

        return alumnos;
    }

    //--------------------------------------------------------------------------------------------------------
    public DefaultTableModel mostrarKardex(JTable table)
    {
        DefaultTableModel kardex = (DefaultTableModel) table.getModel();

        String sql_statement = "SELECT * FROM KARDEX";

        kardex.setRowCount(0);

        try
        {
            PreparedStatement pSt = conexion.prepareStatement(sql_statement);
            ResultSet rSet = pSt.executeQuery();

            int col = rSet.getMetaData().getColumnCount();

            int ren = 0;
            while (rSet.next())
            {
                Object[] datosRen = new Object[col];

                for (int i = 1; i <= col; i++)
                {
                    datosRen[i - 1] = rSet.getObject(i);
                }
                kardex.addRow(datosRen);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex);
        }

        return kardex;
    }

    //--------------------------------------------------------------------------------------------------------
    public DefaultTableModel mostrarMaterias(JTable table)
    {
        DefaultTableModel materias = (DefaultTableModel) table.getModel();

        String sql_statement = "SELECT * FROM MATERIAS";

        materias.setRowCount(0);

        try
        {
            PreparedStatement pSt = conexion.prepareStatement(sql_statement);
            ResultSet rSet = pSt.executeQuery();

            int col = rSet.getMetaData().getColumnCount();

            int ren = 0;
            while (rSet.next())
            {
                Object[] datosRen = new Object[col];

                for (int i = 1; i <= col; i++)
                {
                    datosRen[i - 1] = rSet.getObject(i);
                }
                materias.addRow(datosRen);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex);
        }

        return materias;
    }

    public void actualizarPromedio(String matricula)
    {
        String sql = "update alumnos A SET promedio = (select AVG(calificacion) FROM kardex WHERE (MATRICULA = A.MATRICULA)) where MATRICULA = ?";
        PreparedStatement pSt = null;
        try
        {
            pSt = conexion.prepareStatement(sql);
            pSt.setString(1, matricula);
            //ResultSet resultSet = preparedSt.execute();
            boolean execute = pSt.execute();

        } catch (SQLException ex)
        {
            System.out.println("Error al actualizar promedio " +  ex);
        } finally
        {
            try
            {
                pSt.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
