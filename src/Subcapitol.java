import java.util.ArrayList;
import java.util.List;


public class Subcapitol {
	
	
	String titluSubcapitol;
	
	private String titlu;
    private List<Paragraf> paragraf;
    private List<Imagine> img; 
    private List<Tabel> tabel;
	
	public ArrayList<Element> parte=new  ArrayList<Element>();
	
	public Subcapitol(String titluSubcapitol) {
		this.titluSubcapitol=titluSubcapitol;
		
	}
	
	public void setTitlu(String x)
    {
        this.titlu = x;
    }
    
    public String getTitlu()
    {
        return titlu;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < paragraf.size(); i++)
        {
            sb.append(paragraf.get(i).toString()).append(" ");
        }
        
        for(int i = 1; i < img.size(); i++)
        {
            sb.append(img.get(i).toString()).append(" ");
        }
        
        for(int i = 1; i < tabel.size(); i++)
        {
            sb.append(tabel.get(i).toString()).append(" ");
        }
        
        return sb.toString();
    }

}
