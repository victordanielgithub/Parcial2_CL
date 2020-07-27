using Npgsql;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.Services;

/// <summary>
/// Descripción breve de WebService
/// </summary>
[WebService(Namespace = "http://tempuri.org/")]
[WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
// Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
// [System.Web.Script.Services.ScriptService]
public class WebService : System.Web.Services.WebService {

    public WebService () {

        //Elimine la marca de comentario de la línea siguiente si utiliza los componentes diseñados 
        //InitializeComponent(); 
    }

    [WebMethod]
    public string HelloWorld() {
        return "Hola a todos";
    }

    [WebMethod]
    public DataSet PersonaPostgreSQL()
    {
        NpgsqlConnection conexion = new NpgsqlConnection();
        conexion.ConnectionString = "Server = localhost; User Id = postgres; Password = root; Database = persona";
        conexion.Open();

        NpgsqlDataAdapter datos = new NpgsqlDataAdapter();
        datos.SelectCommand = new NpgsqlCommand();
        datos.SelectCommand.Connection = conexion;
        datos.SelectCommand.CommandText = "select * from persona;";
        datos.SelectCommand.CommandType = CommandType.Text;

        DataSet ds = new DataSet();
        datos.Fill(ds);

        conexion.Close();
        return ds;
    }

    [WebMethod]
    public DataSet PersonaSQLServer()
    {
        SqlConnection conexion = new SqlConnection();
        conexion.ConnectionString = "server=(local);user=daniel;pwd=daniel;database=persona";
        SqlDataAdapter datos = new SqlDataAdapter();
        datos.SelectCommand = new SqlCommand();
        datos.SelectCommand.Connection = conexion;
        datos.SelectCommand.CommandText = "select * from persona;";
        datos.SelectCommand.CommandType = CommandType.Text;

        DataSet ds = new DataSet();
        datos.Fill(ds);
        
        return ds;
    }
    
}
