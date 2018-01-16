
public class DocumentManager {

	private Element doc;
	private static DocumentManager instance;
	
	private DocumentManager() {
		
	}
	public static DocumentManager getInstance() {
		if(instance == null) {
			synchronized (instance) {
				instance = new DocumentManager();
			}
		}
		return instance;
	}
	
	public void setDocument(Element book) {
		this.doc=book;
	}
	public Element getDocument() {
		return doc;
	}
}
