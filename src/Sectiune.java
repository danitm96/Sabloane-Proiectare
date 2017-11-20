import java.util.ArrayList;



public class Sectiune implements Element {
	
	//private String title;
	
	private ArrayList<Element> secContent;

	
	
	 public Sectiune (){
		 secContent= new ArrayList<Element>();
	 }
	@Override
	public void addElement(Element elem) throws Exception {
		 secContent.add(elem);
		
	}

	@Override
	public void remove(Element elem) {
		secContent.add(elem);
		
	}

	@Override
	public void  getChild(int index) {

	 secContent.get(index);
	}

	@Override
	public void print() {
		 System.out.println("Works");
		
	}
	@Override
	public void acceptVisitor(Visitor v)
    {
        v.visitSectiune(this);
    }
    
	

}
