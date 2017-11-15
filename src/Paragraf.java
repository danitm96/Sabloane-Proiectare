
public class Paragraf extends AbstractElement{
private	String textParagraf;
Paragraf (String text){
	this.textParagraf=text;
}
@Override
public void addElement(Element elem) throws Exception{
	// TODO Auto-generated method stub
	
}
@Override
public void remove(Element elem) {
	// TODO Auto-generated method stub
	
}
@Override
public Element getChild(int index) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void print() {
	System.out.println(textParagraf);
	
}

	
	

}
