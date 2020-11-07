package model;
public class PublicPlaylist extends Playlist implements PlaylistUsers{
	private User[] playlistUsers;
	
	public PublicPlaylist(String name){
		super(name);
		playlistUser=new User[10];
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
						playlistUser[i]=user;
						return true;
					}
				}
			}
			return false;
		 }
}