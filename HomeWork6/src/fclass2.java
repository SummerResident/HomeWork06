
public class fclass2 extends fclass3 {

	public fclass2(int variable3, int variable4) {
		super(variable3, variable4);
	}

	public int getVariable1FromclassParent(fclass1 ex) {

		return ex.getVariable1();
	}

	public int getVariable2FromclassParent(fclass1 ex) {
		return ex.getVariable2();
	}
}