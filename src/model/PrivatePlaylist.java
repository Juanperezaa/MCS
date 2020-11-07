package model;
public class PrivatePlaylist extends Playlist{
	private User user;
	
	public PrivatePlaylist(String name, User user){
		super(name);
		this.user=user;
	}
	
	@Override
	public String getInfoPlaylist(){
		String temp;
		temp="************** Playlist **************\n";
		temp+="**  Title:  "+getName()+"\n";
		temp+="**  Duration:  "+getPLDuration()+"\n";
		temp+="**  Genre:  "+getPlaylistGenre()+"\n";
		temp+="*************************************";
		return temp;
	}
}