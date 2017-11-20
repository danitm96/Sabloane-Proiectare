
public class Tabel extends AbstractElement{
	String numeTabel;
	
	
	
	public Tabel (String numeTabel) {
		this.numeTabel=numeTabel;
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
	@Override
	public void print() {
		 System.out.println(numeTabel);
		
	}
	
	public void acceptVisitor(Visitor s) {
		  s.visitTabel(this);
	}
	
	
	public String toString()
    {
        return numeTabel;
    }
}
