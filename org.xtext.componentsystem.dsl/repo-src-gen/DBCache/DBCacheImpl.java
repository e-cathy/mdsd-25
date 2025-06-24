package DBCache;
	
import MediaStoreRepo.IAudioDB;
import MediaStoreRepo.IAudioDB;
import MediaStoreRepo.Helper;
	
public class DBCacheImpl implements IAudioDB{
	IAudioDB iAudioDB;
	
	public void setIAudioDB (IAudioDB iAudioDB) {
		Helper.asserNull(this.iAudioDB);
		this.iAudioDB = iAudioDB;
	}
				
	// Implementing queryDB from interface IAudioDB
	@Override
	public void queryDB() {
		Helper.assertNotNull(this.iAudioDB);
		// TODO: Insert code here
	}
				
	// Implementing addFile from interface IAudioDB
	@Override
	public void addFile() {
		Helper.assertNotNull(this.iAudioDB);
		// TODO: Insert code here
	}
}
