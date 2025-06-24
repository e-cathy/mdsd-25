package MediaManager;
	
import MediaStoreRepo.IMediaStore;
import MediaStoreRepo.IAudioDB;
import MediaStoreRepo.ISound;
import MediaStoreRepo.Helper;
	
public class MediaManagerImpl implements IMediaStore{
	IAudioDB iAudioDB;
	ISound iSound;
	
	public void setIAudioDB (IAudioDB iAudioDB) {
		Helper.asserNull(this.iAudioDB);
		this.iAudioDB = iAudioDB;
	}
	
	public void setISound (ISound iSound) {
		Helper.asserNull(this.iSound);
		this.iSound = iSound;
	}
				
	// Implementing download from interface IMediaStore
	@Override
	public void download() {
		Helper.assertNotNull(this.iAudioDB);
		Helper.assertNotNull(this.iSound);
		// TODO: Insert code here
	}
				
	// Implementing upload from interface IMediaStore
	@Override
	public void upload() {
		Helper.assertNotNull(this.iAudioDB);
		Helper.assertNotNull(this.iSound);
		// TODO: Insert code here
	}
}
