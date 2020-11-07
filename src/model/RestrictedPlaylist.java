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
		for(i=0;i<playlistUser.length;i++){
			if(playlistUser[i]!=null){
				if(user.getName().equalsIgnoreCase(playlistUser[i].getName())){
				return true;
				}
			}
			
		}
		return false;
	 }
	 public boolean addUser(User user){
		 if(!exist(user)){
			 for(i=0;i<playlistUser.length;i++){
					if(playlistUser[i]==null){
						playlistUser[i]=song;
						return true;
					}
				}
			}
			return false;
		 }
}