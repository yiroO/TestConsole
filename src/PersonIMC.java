import javax.swing.JOptionPane;

public class PersonIMC {

	public static void main(String[] args) {

		
		Person p = new Person();
		p.setName(JOptionPane.showInputDialog("Ingrese su nombre").toUpperCase());
		p.setAge(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad")));
		p.setBodyWeight(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su peso corporal")));
		p.setHeight(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su estatura")));
		p.setSex(JOptionPane.showInputDialog("Ingrese el sexo H(hombre) - M(mujer)").toUpperCase().charAt(0));
		p.setResul(calculaIMC(p.getBodyWeight(), p.getHeight(), p.getSex()));
		p.setAgeTotal(esMayorDeEdad(p.getAge()));
		p.setSexValid(comprobarSexo(p.getSex()));

		JOptionPane.showMessageDialog(null, p.toString() + " consulta IMC " + p.getResul());
		System.out.println(p.toString() + " \n consulta IMC " + p.getResul());
	}

	public static String calculaIMC(double bodyWeight, double height, char sex) {
		double imc = bodyWeight / (height * height);
		String info = "";
		
		if(sex == 'H') {
			if(imc <= 20) {
				info =  "Falta de peso " + -1;
			} else if (imc > 20 && imc <= 25) {
				info = "Peso normal " + 0;
			} else if (imc > 25) {
				info = "Sufre de sobrepeso " + 1;
			}
		}
		
		
		if(sex == 'M') {
			if(imc <= 19) {
				info = "Falta de peso " + -1;
			} else if (imc > 19 && imc <= 24) {
				info = "Peso normal " + 0;
			} else if (imc > 24) {
				info = "Sufre de sobrepeso " + 1;
			}
		}
		
		return info;
	}
	
	public static boolean esMayorDeEdad(int age) {
		if(age < 18) {
			return false;
		}
		return true;
	}
	
	public static boolean comprobarSexo(char sex) {
		if(sex == 'M' || sex == 'H') {
			return true;
		}
		return false;
	}

}
