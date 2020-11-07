package model;
public class Song{
	private String title;
	private String artist;
	private String date;
	private SongLength lengthSong;
	private Genre genre;
	private int genreI;
	
	public Song(String title, String artist, String date, SongLength lengthSong, int genreI){
		this.title=title;
		this.artist=artist;
		this.date=date;
		this.lengthSong=lengthSong;
		genre=Genre.values()[genreI-1];
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public void setArtist(String artist){
		this.artist=artist;
	}
	
	public String getDate(){
		return date;
	}
	
	public void setDate(String date){
		this.date=date;
	}
	public  int getGenreI(){
		return genreI;
	}
	
	
	public Genre getGenre(int genreI){
		return genre;
	}
	
	public int getMinutesD(){
		return lengthSong.getMinutes();
	}
	
	public int getSecondsD(){
		return lengthSong.getSeconds();
		
	}
	
	public String getSongInfo(){
		String info="";
		info="**************  Song **************\n";
		info+="**Title:  "+getTitle()+"\n";
		info+="**Artisti:  "+getArtist()+"\n";
		info+="**Duration:  "+getMinutesD()+":"+getSecondsD()+"\n";
		info+="**Genre:  "+genre.toString()+"\n";
		info+="***********************************";
		
		return info;

	}
}