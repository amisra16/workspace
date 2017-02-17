package com.practice.random;

class ABC {
	public void abc() {
		System.out.println("Calling parents abc");
	}

	public void xyz() {
		System.out.println("Calling parents xyz");
	}
}

class MethodOverridingDynamicDispatch extends ABC {
	public void abc() {
		System.out.println("Calling childs abc");
	}

	public void efg() {
		System.out.println("Calling childs efg");
	}
	
	public static void main(String args[]) {
		ABC parent = new MethodOverridingDynamicDispatch();
		MethodOverridingDynamicDispatch child = new MethodOverridingDynamicDispatch();

		parent.abc();
		parent.xyz();
		child.abc();
		child.efg();
		child.xyz();
	}

}
