package genericsClazzMethodTypeSwap;

import testing_lib.genericsClazzMethodTypeSwap.GenericsClazzMethodTypeSwap;

public class Main {

	public static void main(String[] args) {
		GenericsClazzMethodTypeSwap constr = new GenericsClazzMethodTypeSwap();
		constr.<String, Integer>method1();
	}
	
}
