import java.util.ArrayList;

public class ImaginePorxy extends AbstractElement {
	private String numeImagine;
	private Imagine realImage= null;
	public  ImaginePorxy (String numeImagine){
		this.numeImagine=numeImagine;
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
		
	
	}

	@Override
	public void print() {
		
		Imagine realImage= new Imagine(numeImagine);
		System.out.println(realImage);
		
	}



	
	
	

}
