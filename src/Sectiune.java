import java.util.ArrayList;
public class Sectiune implements Element {
	private String title;
	
	private ArrayList<Element> secContent= new ArrayList<Element>();

	
	
	 Sectiune (String titlu){
		 this.title=titlu;
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
	public Element getChild(int index) {
		// TODO Auto-generated method stub
		return secContent.get(index);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void accept(Visitor s) {
		// TODO Auto-generated method stub
		
	}

	

}
