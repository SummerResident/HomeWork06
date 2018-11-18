
public class fclass1 {

	private int variable1;
	private int variable2;

	public fclass1(int variable1, int variable2) {

		this.variable1 = variable1;
		this.variable2 = variable2;
	}

	public static void main(String[] args) {
		fclass1 fclassFirst = new fclass1(2, 3);
		fclass2 fclassSecond = new fclass2(4, 5);

		System.out.println(fclassFirst.getVariable1() + " " + fclassFirst.getVariable2());
		System.out.println(fclassSecond.getVariable1FromclassParent(fclassFirst) + " "
				+ fclassSecond.getVariable2FromclassParent(fclassFirst));
	}

	public int getVariable1() {
		return variable1;
	}

	public int getVariable2() {
		return variable2;
	}
}
