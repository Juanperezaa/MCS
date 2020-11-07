package model;
public class MusicCollect&Share{
	private User[] user;
	private Song[] pool;
	private Playlist[] playList;
	
	public MusicCollect&Share(){
		user=new User[10];
		pool=new Song[30];
		playList=new Playlist[20];
	}
	
	public User getPUser(int pPosition){
		return user[pPosition];
	}
	
	public String getAllUsers(){
		String temp="";
		for(i=0;i<user.length;i++){
			if(user[i]!=null){
				temp+="\n"+user[i].getUserInfo()+"\n";
			}
		}
		return temp;
	}
	
	public String getAllSongs(){
		String temp="";
		for(i=0;i<pool.length;i++){
			if(pool[i]!=null){
				temp+="\n"+pool[i].getSongInfo()+"\n";
			}
		}
		return temp;
	}
	
	public Strings getAllPlaylist(){
		String temp="";
		for(i=0;i<playList.length;i++){
			if(playList[i]!=null){
				temp+="\n"+playList[i].getInfoPlaylist()+"\n";
			}
		}
		return temp;
	}
	
	public boolean AddAUser(String nickname, String password, int age){
		for(i=0;i<user.length;i++){
			if(user[i]==null){
				user[i]= new User(nickname, password, age);
				return true;
			}
		}
		return false;
	}
	
	public boolean AddASong(String nickname, String password, String title, String artist, String date, SongLength lengthSong, int genreI){
		for(i=0;i<pool.length;i++){
			if(pool[i]==null){
				pool[i]=new Song(title, artist, date, lengthSong, genreI);
				user[CheckUser(nickname, password)].counterSong();
				return true;
			}
		}
		return false;
	}
	
	public int checkUser(String nickname, String password){
		int position=-9;
		for(i=0;i<user.length;i++){
			if(user[i]!=null){
				if(nickname.equalsIgnoreCase(user[i].getNickname())&&(password.equalsIgnoreCase(user[i].getPasword())))
					position=i;
			}
		}
		return position;
	}
	
	public int checkPlaylist(String playlistName){
		int position=-9;
		for(i=0;i<playList.length;i++){
			if(playList[i]!=null){
				if(playlistName.equalsIgnoreCase(playList[i].getName()))
					position=i;
			}
		}
		return position;
	}
	
		public int knowWPlaylist(int playlistPosition){
		if(playList[playlistPosition] instanceof PrivatePlaylist){
			return 1;
		}
		
		if(playList[playlistPosition] instanceof RestrictedPlaylist){
			return 2;
		}
		return 3;
	}
	
		public boolean confirmUserPlaylist(int playlistPosition, User userP){
			boolean temp=false;
			if(knowWPlaylist(playlistPosition)==2){
				RestrictedPlaylist playlistRestricted= (RestrictedPlaylist) playList[playlistPosition];
			}
		}
	
	
	public boolean AddAPlaylist(String name, User user){
		for(i=0;i<playList.length;i++){
			if(playList[i]==null){
				playList[i]=new PrivatePlaylist(name, user);
				return true;
			}
		}
		return false;
	}
	public boolean AddAPlaylist(String name){
		for(i=0;i<playList.length;i++){
			if(playList[i]==null){
				playList[i]=new PublicPlaylist(name);
				return true;
			}
		}
		return false;
	}
	
	public boolean AddAPlaylist(String name, int useless){
		for(i=0;i<playList.length;i++){
			if(playList[i]==null){
				playList[i]=new RestrictedPlaylist(name);
				return true;
			}
		}
		return false;
	}
	
	
	
}