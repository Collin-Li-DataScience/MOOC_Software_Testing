
public class CollinLi {

	public static void main(String[] args) {
		CollinLi c = new CollinLi();
		System.out.println(c.getRotatedFullName(2));
		System.out.println(c.getRotatedFullName(-5));

	}
	
	public String getFullName() {
		return "Collin Li";
	}
	
	public String getFirstName() {
		return "Collin";
	}
	
	public String getLastName() {
		return "Li";
	}
	
	public String getUCInetID() {
		return "mucongl";
	}
	
	public int getStudentNumber() {
		return 18937404;
	}
	
	public String getRotatedFullName(int shift) {
		String name = "Collin Li";
		int length = name.length();

		if (shift < 0) {
			return name.substring(length+shift)+name.substring(0,length+shift);
		}
		
		else {
			return name.substring(shift)+name.substring(0,shift);
		}

		
	}
}

