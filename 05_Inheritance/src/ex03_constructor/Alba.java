package ex03_constructor;

public class Alba extends Student {

	//필드
	public String company;
	
	//생성자
	public Alba(String name, String school, String company) {
		super(name, school);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	} 
	
	
			
}


