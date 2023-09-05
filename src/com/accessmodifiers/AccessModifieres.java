package com.accessmodifiers;

public class AccessModifieres{
	
	protected void checkProtectedMethod() {
		System.out.println("Protected Method");
	}
	public void checkPublicMethod() {
		System.out.println("Public Method");
	}
	void checkDefaultMethod() {
		System.out.println("Default Method");
	}
	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		a.checkPrivateMethod();
		a.checkProtectedMethod();
		a.checkPublicMethod();
		a.checkDefaultMethod();
		
	}
}