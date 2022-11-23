package Oops_Q8;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class LCD extends Electronics {
	
	Electronics electronics = new Electronics();
	
	LCD(int id, String type, String date) throws ParseException{
		Date date1 = new SimpleDateFormat("dd/MM/yy").parse(date);
		electronics.setId(id);
		electronics.setSemiconductor_type(type);
		electronics.setDateofmanufacturing(date1);
	}

	@Override
	public String toString() {
		return "LCD = [" + electronics + "]";
	}

	
}

