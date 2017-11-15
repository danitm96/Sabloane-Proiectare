
public  class AbstractElement implements Element {

	public void accept(Visitor s) {

	}
	
	public void addElement(Element elem) throws Exception {
		throw new Exception("Not supported");
		
	}

	public void remove(Element elem) {
		// TODO Auto-generated method stub
		
	}

	public Element getChild(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}
	

}
