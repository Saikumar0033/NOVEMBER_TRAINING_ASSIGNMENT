package Oops_Q9;

public class Test {
public static void main(String[] args){
	Tree[] t = new Tree[4];
	t[0]= new Tree(1);
	t[1]= new Tree(11);
	t[2]= new Tree(14);
	t[3]= new Tree(21);
	
	//printing hashcode of all the objects
	for(int i=0; i<t[0].getCount();i++) {
		System.out.println("object at index "+i+" hashcode is "+t[i].hashCode());
	}
	
	//making t[2] null so it will be cleaned up by the garbage collector
    t[2] = null;
	System.gc();
	
	System.out.println(t[2]);
	

}
}
