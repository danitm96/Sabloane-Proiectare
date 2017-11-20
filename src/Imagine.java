import java.util.*;

public class Imagine extends AbstractElement {
	String numeImagine;
	
	public Imagine (String numeImagine) {
		this.numeImagine=numeImagine;
		
	}

	@Override
	public void print() {
		 System.out.println(numeImagine);
		
	}

	public void acceptVisitor(Visitor s) {
	
		 s.visitImagine(this);
	}
	
	  public String toString()
	    {
	        return numeImagine;
	    }

}
