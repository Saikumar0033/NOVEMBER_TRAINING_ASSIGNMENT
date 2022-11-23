package Oops_Q8;

import java.util.Date;

public class Electronics {
	private int id;
	private String semiconductor_type;
	private Date dateofmanufacturing;
	
	Electronics(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSemiconductor_type() {
		return semiconductor_type;
	}

	public void setSemiconductor_type(String semiconductor_type) {
		this.semiconductor_type = semiconductor_type;
	}

	public Date getDateofmanufacturing() {
		return dateofmanufacturing;
	}

	public void setDateofmanufacturing(Date dateofmanufacturing) {
		this.dateofmanufacturing = dateofmanufacturing;
	}

	@Override
	public String toString() {
		return "id=" + id + ", semiconductor_type=" + semiconductor_type + ", dateofmanufacturing="
				+ dateofmanufacturing;
	}
	
	
}

