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
		 for(i=0;i<playlistSongs.length;i++){
			 if(playlistSongs[i]!=null){
				minutes+= playlistSongs[i].getMinutesD();
				seconds+= playlistSongs[i].getSecondsD();
			 }
		 }
			minutes+= seconds/60;
			seconds= seconds%60;
			
			info="The playlist have a  "+minutes+":"+seconds+"  duration.";
			return info
	 }
	 /*public boolean completeGenres(){
		String genreList=new String[6];
		 
		 for(i=0;i<genreList.length;i++){
			 if(genreList[i]=null){
				 if(Variable!=genreList[i]){
					 genreList[i]=Variable
					 return true;
				 }
			 }
			 else{
				 if(Variable!=genreList[i]){
					 genreList[i]=Variable
					 return true;
				     }
				}
			}
		 }
		 return false;
	 }*/
	 
	/* public String getPLGenres(){
		 String Variable="";
		 String info="";
		 for(i=0;i<playlistSongs.length;i++){
			 if(playlistSongs[i]=!null){
			 Variable=playlistSongs[i].getGenre();
			 if(completeGenres(Variable)){
				 info+=Variable+", ";
			 }
				
			 }
		 }
		 return info;
	 ¨ 
	 */
	 public 
	
}