import java.util.ArrayList;

public class Carte {
	
	private String titluCarte;
	
	private ArrayList<Autor> aTeam;
	private ArrayList<Element> content =new  ArrayList<Element>();
	public  Autor autor;
	
	public Cuprins cuprins;
	
	public ArrayList<Capitol> parte=new  ArrayList<Capitol>();
	
	public Carte(String titluCarte,  ArrayList<Autor> autor) {
		this.aTeam=autor;
		this.titluCarte=titluCarte;
	
	}
public void addCapitol (Element elem) {
	this.content.add(elem);
	
}

public void print () {
	System.out.println(titluCarte);
	 for(int i=0; i< content.size(); i++)
	   {
		   content.get(i).print();
		
	   }
}

public void accept (Visitor v) {
	for (Element s :  content) {
		s.acceptVisitor(v);
	}
}

}
