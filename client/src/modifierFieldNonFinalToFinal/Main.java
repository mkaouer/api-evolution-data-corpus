package modifierFieldNonFinalToFinal;

import testing_lib.modifierFieldNonFinalToFinal.ModifierFieldNonFinalToFinal;

public class Main {

	public static void main(String[] args) {
		ModifierFieldNonFinalToFinal constr = new ModifierFieldNonFinalToFinal();
		System.out.println(constr.field1);
		constr.field1 = new Integer(10);
		
	}
	
}
