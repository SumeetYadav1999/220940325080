package qustion3;

public class test {

	public static void main(String[] args) {
		shape t1 = new triangle(); 
		// here i have given the ref of super call but object of sub so which method to take is decided at run time when obj is created
		t1.draw();
		t1.erase();

	}

}
