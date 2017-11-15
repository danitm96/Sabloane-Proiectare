
public class DocumentStatisticVisitor implements Visitor {

    private int numarTabele = 0;
    private int numarParagrafe = 0;
    private int numarImagini = 0;
    private int numarSectiuni = 0;
    
	
	public void visitimagineProxy(ImaginePorxy img) {
	System.out.println(img);
	 numarImagini++;
	 
		
	}


	public void visitImagine(Imagine img) {
		System.out.println(img);
		 numarImagini++;
		
		
	}


	public void visitParagraf(Paragraf parag) {
		System.out.println(parag);
		numarParagrafe++;
		
	}


	public void visitTabel(Tabel tabl) {
		System.out.println(tabl);
		numarTabele++;
		
	}


	public void visitSectiune(Sectiune sect) {
		System.out.println(sect);
		 numarSectiuni++;
	}
	
	  public int getNumarTabele()
	    {
	        return numarTabele;
	    }
	    
	    public int getNumarParagrafe()
	    {
	        return numarParagrafe;
	    }
	    
	    public int getNumarImagini()
	    {
	        return numarImagini;
	    }
	    
	    public int getNumarSectiuni()
	    {
	        return numarSectiuni;
	    }

}
