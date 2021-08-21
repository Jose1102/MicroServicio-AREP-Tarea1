package edu.escuelaing.arep.microservicio;

public class AlphaHttpStockService extends HttpStockService{
	
	String stock = "fb";

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol="+ stock +"&apikey=OBTCETCUBVVUTSSL";
	}

	@Override
	public void setStock(String stock) {
		// TODO Auto-generated method stub
		this.stock = stock;
		
	}

}
