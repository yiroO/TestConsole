import java.text.DecimalFormat;

import org.apache.commons.lang.*;

public class Person {
	
	private String name;
	private Integer age;
	private String NSS;
	private char sex = 'H';
	private float bodyWeight = 0f;
	private float height = 0f;
	
	private String resul;
	private boolean ageTotal;
	private boolean sexValid;
	
	DecimalFormat frmt = new DecimalFormat();
	
	
	
	public Person() {
		this.NSS = generaNSS();
	}
	
	public Person(String name, Integer age, float bodyWeight, float height) {
		this.name = name;
		this.age = age;
		this.bodyWeight = bodyWeight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getBodyWeight() {
		return bodyWeight;
	}

	public void setBodyWeight(float bodyWeight) {
		frmt.setMaximumFractionDigits(2);
		this.bodyWeight = Float.parseFloat(frmt.format(bodyWeight));
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(float height) {
		
		this.height = height;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getResul() {
		return resul;
	}

	public void setResul(String resul) {
		this.resul = resul;
	}

	public boolean isAgeTotal() {
		return ageTotal;
	}

	public void setAgeTotal(boolean ageTotal) {
		this.ageTotal = ageTotal;
	}

	public boolean isSexValid() {
		return sexValid;
	}

	public void setSexValid(boolean sexValid) {
		this.sexValid = sexValid;
	}
	
	public String generaNSS() {
		return NSS = RandomStringUtils.randomAlphabetic(8).toUpperCase();
	}

	@Override
	public String toString() {
		return "DATOS: \n" 
				+ " Nombre: " + name + "\n"
				+ " Edad: " + age + "\n"
				+ " Peso: " + bodyWeight + "\n"
				+ " Estatura: " + height + "\n"
				+ " NSS: " + NSS + "\n"
				+ " Mayor de edad: " + ageTotal + "\n"
				+ " Sexo Valido: " + sexValid + "\n";
	}
	
	
	
	
}
