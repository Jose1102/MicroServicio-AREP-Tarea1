package edu.escuelaing.arep.microservicio;
import static spark.Spark.*;



import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import spark.Request;
import spark.Response;

/**
 * Clase principal del micro servicio
 * @author Jose Maria Castro Ortega
 *
 */
public class App 
{
	/**
     * Esta es el main de App donde realiza el llamado de los get
     * @param args que es una lista de String
     */
	public static void main(String[] args) {
        //get("/hello", (req, res) -> "Hello World");
        port(getPort());
        staticFiles.location("/public");
        get("/inputdata", (req, res) -> inputDataPage());
        get("/results", (req, res) -> resultsPage(req, res));
        get("/conexion","aplication/json", (req, res) -> conexion(req, res));
        
    }

    
   /**
    * Metodo que muestra formulario en pagina html
    * @return un string que representa una pagina html
    */
   private static String inputDataPage() {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>HTML Forms</h2>"
                + "<form action=\"/results\">"
                + "  First name:<br>"
                + "  <input type=\"text\" name=\"firstname\" value=\"Mickey\">"
                + "  <br>"
                + "  Last name:<br>"
                + "  <input type=\"text\" name=\"lastname\" value=\"Mouse\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

   /**
    * Resultado del formulario
    * @param req que es el requerimiento recibido
    * @param res que es el response a enviar
    * @return un String con el firstname y lastname del request
    */
    private static String resultsPage(Request req, Response res) {
        return req.queryParams("firstname") + " " +
                req.queryParams("lastname");
    }
    
    
    /**
     * Metodo que llama un objeto de tipo JSON
     * @param req que es el requerimiento recibido
     * @param res que es el response a enviar
     * @return un String de tipo JSON
     */
    private static String conexion(Request req, Response res) {
    	String response = "None";
    	String stock = req.queryParams("st");
    	HttpStockService stockService = CurrentServiceInstance.getInstance().getService();
    	if(stock != null && stock != "") {
    		stockService.setStock(stock);
    	}
    	try {
			response = stockService.timeSeriesDaily();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return response;
    	
    }
    
    /**
     * Metodo que muesta el puerto
     * @return un numero que es el puerto
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
    
    
}
