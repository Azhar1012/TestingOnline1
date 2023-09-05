package com.accessmodifiers;

public class AccessModifiers {

	public void checkPrivateMethod() {
		System.out.println("This is the Private Method");
		
	}

	public void checkProtectedMethod() {
		System.out.println("Protected Method");
		
	}

	public void checkPublicMethod() {
		System.out.println("Public Method");
		
	}

	public void checkDefaultMethod() {
		System.out.println("Default Method");
		
	}
	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		a.checkPrivateMethod();
//		a.checkProtectedMethod();
//		a.checkPublicMethod();
//		a.checkDefaultMethod();
}
}
