

public class Paragraf extends AbstractElement{
private	String textParagraf;

private AlignStrategy as = null;

Paragraf (String text){
	this.textParagraf=text;
}

public void setAlign(AlignStrategy as)
{
    this.as = as;
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
public void getChild(int index) {
	// TODO Auto-generated method stub
	
}
@Override
public void print() {
	   if(as != null)
           as.printAligned(textParagraf);
       else 
           System.out.println(textParagraf);
	
}

public void acceptVisitor(Visitor v)
{
    v.visitParagraf(this);
}
public String toString()
{
    return textParagraf;
}

}
