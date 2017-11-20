import java.util.*;
public class Capitol implements Element {
	String titluCapitol;
	
	public ArrayList<Subcapitol>subcapitole=new  ArrayList<Subcapitol>();
	
public Capitol(String titluCapitol) {
	this.titluCapitol=titluCapitol;
}


public void print() {
	System.out.println(titluCapitol);
}


@Override
public void addElement(Element elem) throws Exception {
	// TODO Auto-generated method stub
	
}


@Override
public void remove(Element elem) {
	// TODO Auto-generated method stub
	
}


@Override
public void getChild(int index) {
	// TODO Auto-generated method stub

}



public void acceptVisitor(Visitor s) {
	// TODO Auto-generated method stub
	
}

















}
