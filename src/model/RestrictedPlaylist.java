package model;
public class RestrictedPlaylist extends Playlist implements PlaylistUsers{
	private User[] playlistUser;
	
	public RestrictedPlaylist(String name){
		super(name);
		playlistUser=new User[5];
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
	
	 public boolean UserExist(User user){
		for(int i=0;i<playlistUser.length;i++){
			if(playlistUser[i]!=null){
				if(user.getNickname().equalsIgnoreCase(playlistUser[i].getNickname())){
				return true;
				}
			}
			
		}
		return false;
	 }
	 public boolean AddUser(User user){
		 if(!(UserExist(user))){
			 for(int i=0;i<playlistUser.length;i++){
					if(playlistUser[i]==null){
						playlistUser[i]=user;
						return true;
					}
				}
			}
			return false;
		 }
}