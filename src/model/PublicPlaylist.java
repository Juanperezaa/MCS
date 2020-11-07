package model;
public class PublicPlaylist extends Playlist {
	private User[] playlistUsers;
	private int quantityRates;
	private double rates;
	
	public PublicPlaylist(String name){
		super(name);
		playlistUsers=new User[10];
		quantityRates=0;
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
	
	
		 public void changeRating(double publicRate){
		rates+=publicRate;
		quantityRates++;
	}
}