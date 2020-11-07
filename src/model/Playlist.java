package model;
public abstract class Playlist{
	private String name;
	private SongLength listLength;
	private String genres;
	private Genre playlistGenre;
	private Song[] playlistSongs;
	
	public Playlist(String name){
		this.name=name;
		playlistSongs= new Song[30];
		playlistGenre=Genre.values()[7];
		listLength= new SongLength(0,0);
	}
	 public String getName(){
		 return name;
	 }
	 
	 public void setName(String name){
		 this.name=name;
	 }
	 
	 public String getPLDuration(){
		 int minutes=0;
		 int seconds=0;
		 int temp=0;
		 String info;
		 for(int i=0;i<playlistSongs.length;i++){
			 if(playlistSongs[i]!=null){
				minutes+= playlistSongs[i].getMinutesD();
				seconds+= playlistSongs[i].getSecondsD();
			 }
		 }
			minutes+= seconds/60;
			seconds= seconds%60;
			
			info=minutes+":"+seconds;
			return info;
	 }
	 
	 public String getPlaylistGenre(){
		 String info="";
		 for(int i=0;i<6;i++){
			 if(matchGenre(i)){
				 info+=playlistGenre.values()[i-1]+" ,";
			 }
		 }
		 return info;
	 }
	 public boolean matchGenre(int genreI){
		 for(int i=0;i<playlistSongs.length;i++){
			 if((playlistSongs[i]!=null)&&(genreI==playlistSongs[i].getGenreI())){
				 return true;
			 }
		 }
		 return false;
	 }
	 public boolean exist(Song song){
		for(int i=0;i<playlistSongs.length;i++){
			if(song.getTitle().equalsIgnoreCase(playlistSongs[i].getTitle())){
				return true;
			}
		}
		return false;
	 }
	 public boolean addSong(Song song){
		 if(!exist(song)){
			 for(int i=0;i<playlistSongs.length;i++){
					if(playlistSongs[i]==null){
						playlistSongs[i]=song;
						return true;
					}
				}
			}
			return false;
		 }
	 
	 public abstract String getInfoPlaylist();
	
}