package examples.collections;

public class MusicTrack {
	private long id;
	private String title;
	private String artist;
	private String album;
	
	
	
	public MusicTrack() {
		// TODO Auto-generated constructor stub
	}
	public MusicTrack(long id, String title, String artist, String album) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.album = album;
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
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
}
