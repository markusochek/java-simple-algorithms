package fileUnit;

public abstract class FileUnit {
	public static String title;
	
	protected FileUnit(String title) {
		this.setTitle(title);
	}

	protected String getTitle() {
		return title;
	}

	protected void setTitle(String title) {
		this.title = title;
	}
}
