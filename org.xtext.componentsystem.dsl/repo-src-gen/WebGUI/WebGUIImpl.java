package WebGUI;
	
import MediaStoreRepo.IHTTP;
import MediaStoreRepo.IMediaStore;
import MediaStoreRepo.Helper;
	
public class WebGUIImpl implements IHTTP{
	IMediaStore iMediaStore;
	
	public void setIMediaStore (IMediaStore iMediaStore) {
		Helper.asserNull(this.iMediaStore);
		this.iMediaStore = iMediaStore;
	}
				
	// Implementing HTTPDownload from interface IHTTP
	@Override
	public void HTTPDownload() {
		Helper.assertNotNull(this.iMediaStore);
		// TODO: Insert code here
	}
				
	// Implementing HTTPUpload from interface IHTTP
	@Override
	public void HTTPUpload() {
		Helper.assertNotNull(this.iMediaStore);
		// TODO: Insert code here
	}
}
