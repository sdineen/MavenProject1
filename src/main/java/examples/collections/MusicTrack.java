package examples.collections;

public class MusicTrack {
	private long id;
	private String title;
	private String album;
	private String artist;
	
	
	
	public MusicTrack() {
		// TODO Auto-generated constructor stub
	}
	public MusicTrack(long id, String title, String album, String artist) {
		this.id = id;
		this.title = title;
		this.album = album;
		this.artist = artist;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

}
