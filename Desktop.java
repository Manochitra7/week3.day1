package org.system;

public class Desktop extends Computer{
	//Single Inheritance
	
public void desktopSize() {
	System.out.println("Desktop Size");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop comp=new Desktop();
		comp.computerModel();
		comp.desktopSize();
		

	}

}
