package edu.escuelaing.arep.microservicio;


import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    @Test
    public void deberiaValidarQueElFormularioSeaElMismo() {
    	App aplicacion = null;
    	String html  = "<!DOCTYPE html>"
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
    	
    	assertEquals(aplicacion.inputDataPage(),html);
    	
    }
    
    @Test
    public void deberiaRetornarElValorDelPuerto() {
    	
    	App aplicacion = null;
    	int puerto = aplicacion.getPort();
    	assertEquals(4567,puerto);
    }
}
