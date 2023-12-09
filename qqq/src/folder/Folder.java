package folder;

import fileUnit.FileUnit;

public class Folder extends FileUnit {
	
	public Folder(String title) {
		super(title);
		Folder folder = new Folder("qqq");
		folder.getTitle();
	}
}


