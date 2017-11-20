
public  class AbstractElement implements Element {

	public void acceptVisitor(Visitor s) {

	}
	
	public void addElement(Element elem) throws Exception {
		throw new Exception("Not supported");
		
	}

	public void remove(Element elem) {
		// TODO Auto-generated method stub
		
	}

	public void getChild(int index) {
		 throw new UnsupportedOperationException("Not yet implemented.");
	
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}
	

}
