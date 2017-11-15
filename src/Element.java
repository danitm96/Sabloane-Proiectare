
public interface Element {

	public void addElement(Element elem) throws Exception;

	public void remove (Element elem);

	public  Element getChild(int index);


	public void accept(Visitor s);

	public void print();

}
