package ui;
import model.*;
import java.util.Scanner;
public class Menu{
	private MusicCollectyShare MCS;
	Scanner sc = new Scanner(System.in);
	private final static int CREATE_USER=1;
	private final static int SHOW_USERS=2;
	private final static int CREATE_SONG=3;
	private final static int SHOW_SONGS=4;
	private final static int CREATE_PLAYLIST=5;
	private final static int USER_TO_PLAYLIST=6;
	private final static int SONG_TO_PLAYLIST=7;
	private final static int RATE=8;
	private final static int SHOW_PLAYLIST=9;
	private final static int EXIT=10;
	public Menu(){
		this.MCS=new MusicCollectyShare();
	}
	public void printImage(){
		String image = "";
		image += "((((((((((((((((((((((((((((((((((((((((((((((((("+"\n";
		image += "((((((((((((((((/(((((((((((((((((((((((((((((((("+"\n";
		image += "(((/  .(((((((*  .((((((*        (((((/      /((("+"\n";
		image += "(((/   .((((((.  .(((((   ,((((((((((*  .((((((("+"\n";
		image += "(((/    /((((/   .((((/  ,(((((((((((.  /(((((((("+"\n";
		image += "(((/     ((((*   .((((*  ,(((((((((((/   (((((((("+"\n";
		image += "(((/  *  *(((     ((((*  ,((((((((((((,  .((((((("+"\n";
		image += "(((/  /.  ((*     ((((*  *(((((((((((((,   (((((("+"\n";
		image += "(((/  //  ,(  .   ((((*  *((((((((((((((/   /(((("+"\n";
		image += "(((/  *(*  ,  (   ((((*  *((((((((((((((((   /((("+"\n";
		image += "(((/  ,(/    ,(   /(((*  ,(((((((((((((((((   ((("+"\n";
		image += "(((/  .((    ((   /((((  .(((((((((((((((((.  /(("+"\n";
		image += "(((/  .((.  .((.  *((((,  *((((((((((((((((   /(("+"\n";
		image += "(((/  .((((((((.  *(((((   *((((/,/(((((((/   ((("+"\n";
		image += "(((/  .((((((((.  *((((((.        *((   .   .(((("+"\n";
		image += "(((((((((((((((/*/((((((((((///(((((((////((((((("+"\n";
		image += "((((((((((((((((((((((((((((((((((((((((((((((((("+"\n";
		image += "               ./(###((///((###(*                "+"\n";
		image += "           *#(,                   *((,           "+"\n";
		image += "        ,#/                           ((         "+"\n";
		image += "      .#*          .**/////*,.          ((       "+"\n";
		image += "     *(.      .//////////////////*       *#      "+"\n";
		image += "    .#,     *///////////////////////,     /(     "+"\n";
		image += "    /(    *///////////////////////////    .#.    "+"\n";
		image += "  ,/////,*/////////////////////////////,*////*.  "+"\n";
		image += "  /////////////////////////*,...,/////////////,  "+"\n";
		image += "  //////*,,,********,,.............,,,,,//////,  "+"\n";
		image += "  //////*.........//*........//*.......,//////,  "+"\n";
		image += "  //////*.........,,.........,,........,//////,  "+"\n";
		image += "   //////*..............................,//////, "+"\n";
		image += "   *///*  ........,/.........**.......  .*///,   "+"\n";
		image += "            .......,/*.....,/*.......            "+"\n";
		image += "               ........,,,,.......               "+"\n";
		image += "                    .........                    "+"\n";
		image += "\n";
		image += "*************************************************"+"\n";
		System.out.println(image);
	}
	
	public void mainMenu(){
		System.out.println("**************************************************************");
		System.out.println("If u want to create a user: 1");
		System.out.println("if u want to show app all users: 2");
		System.out.println("If u want to create a new song: 3");
		System.out.println("If u want to show all the songs in the pool: 4");
		System.out.println("If u want to create a new playlist: 5");
		System.out.println("if u want to add a user to a playlist: 6");
		System.out.println("If u want to add a song a the playlist: 7");
		System.out.println("If u want to rate a public playlist: 8");
		System.out.println("If u want to show all the playlists: 9");
		System.out.println("If u want to exit: 10");
		System.out.println("***************************************************************");	
	}
	
	public void mainMenuOperation(int choice){
		switch(choice){
			case CREATE_USER:
			addMCSUser();
			break;
			
			case SHOW_USERS:
			System.out.println(MCS.getAllUsers());
			break;
			
			case CREATE_SONG:
			addSongUser();
			break;
			
			case SHOW_SONGS:
			System.out.println(MCS.getAllSongs());
			break;
			
			case CREATE_PLAYLIST:
			addAPlaylist();
			break;
			
			case USER_TO_PLAYLIST:
			AddAUserPlaylist();
			break;
			
			case SONG_TO_PLAYLIST:
			AddAPlaylistSong();
			break;
			
			case RATE: 
			addRatePublicPlaylist();
			
			case SHOW_PLAYLIST:
			System.out.println(MCS.getAllPlaylist());
			break;
			
			case EXIT:
			break;
		}
	}
	
	public void addMCSUser(){
		boolean temp=false;
		System.out.println("Hi, please choose and write a nickname, remember just one word without spaces like that: juan_pereza");
		String nickname=sc.nextLine();
		System.out.println("Now, choose and write a password");
		String password=sc.nextLine();
		System.out.println("Hey, could u tell us your age?");
		int age=sc.nextInt();
		sc.nextLine();
		temp=MCS.AddAUser(nickname, password, age);
		System.out.println("The user  "+validate(temp));
	}
	
	public void addSongUser(){
		int temp=-9;
		System.out.println("Hi dude choose and write the nickname of the one who want to add a song, remember just one word.");
		String nickname=sc.nextLine();
		System.out.println("Write your password please");
		String password=sc.nextLine();
		sc.nextLine();
		temp=MCS.checkUser(nickname, password);
		if(temp!=-9){
			addSong(nickname, password);
		}
		else{
			System.out.println("There was an error, please try again, wrong nickname or password");
		}
		
	}
	
	
	public void addSong(String nickname, String password){
		boolean temp=false;
		System.out.println("Hey, could u say what is the song´s name?");
		String title=sc.nextLine();
		System.out.println("now tell us who is the artist");
		String artist=sc.nextLine();
		System.out.println("could u give us the song's release date");
		String date=sc.nextLine();
		SongLength sDuration=durationS();
		System.out.println("Choose the song gender");
		System.out.println("1 to Rock, 2 HipHop, 3 ClasicMusic, 4 Reggae, 5 Salsa, 6 metal");
		int genreI=sc.nextInt();
		sc.nextLine();
		temp=MCS.AddASong(nickname, password, title, artist, date, sDuration, genreI);
		System.out.println("The song  "+validate(temp));
		
	}
	
	public SongLength durationS(){
		int minutes;
		int seconds;
	System.out.println("In the next sentences please introduce the minutes and the seconds of the song like that, Minutes:Seconds");
		System.out.println("Put how many minutes last the song");
		minutes=sc.nextInt();
		System.out.println("Put how many seconds last the song");
		seconds=sc.nextInt();
		String sLength=minutes+":"+seconds;
		SongLength sDuration= new SongLength(minutes, seconds);
		return sDuration;
	}
	
	public void addAPlaylist(){
		boolean temp=false;
		int pPosition;
		String namePlaylist;
		System.out.println("Please enter the name of the new playlist");
		namePlaylist=sc.nextLine();
		System.out.println("Now tell us, what is your nickname? ");
		String pNickname= sc.nextLine();
		System.out.println("Now write your password");
		String pPassword=sc.nextLine();
		pPosition=MCS.checkUser( pNickname, pPassword);
		if(pPosition!=-9){
			System.out.println("Hey  "+pNickname+" please tell us the type of playlist you wanna add");
			System.out.println("1 to private, 2 to restricted and 3 to public");
			int choice=choice();
			temp=AddAPlaylist2(choice, namePlaylist, pPosition);
			System.out.println("The playlist  "+validate(temp));
		}
		
	}
	
	public boolean AddAPlaylist2(int choice, String namePlaylist, int pPosition){
		User userP=MCS.getPUser(pPosition);
		boolean temp=false;
	switch(choice){
		case 1:
		temp=MCS.AddAPlaylist(namePlaylist, userP);
		break;
		
		case 2:
		temp=MCS.AddAPlaylist(namePlaylist);
		break;
		
		case 3:
		temp=MCS.AddAPlaylist(namePlaylist, 1);
		break;
		
		
		}
		return temp;
	}
	
	public void AddAUserPlaylist(){
		boolean temp=false;
		int userPosition=-9;
		System.out.println("Write the user's nickname you want to add to the playlist");
		String userNickname=sc.nextLine();
		System.out.println("Now write the user´s password");
		String userPassword=sc.nextLine();
		userPosition=MCS.checkUser(userNickname, userPassword);
		if(userPosition!=-9){
			System.out.println("Write the playlist's name which u going to add a user");
			String playlistName= sc.nextLine();
			int playlistPosition=MCS.checkPlaylist(playlistName);
			if(playlistPosition!=-9){
				if(MCS.knowWPlaylist(playlistPosition)==2){
					temp=MCS.confirmUserPlaylist(playlistPosition, MCS.getPUser(userPosition));
					System.out.println("The user in the playlist  "+validate(temp));
				}
			}
		}
	}
	
	public void AddAPlaylistSong(){
		boolean temp=false;
		int songPosition=-9;
		System.out.println("Please tell us the song's title whicch is gonna be add to the playlist");
		String pTitle= sc.nextLine();
		songPosition=MCS.checkSong( pTitle);
		if(songPosition!=-9){
			System.out.println("Now write the playlist name in which u gonna add the song");
			String playlistSName=sc.nextLine();
			int playlistSPosition=MCS.checkPlaylist(playlistSName);
				if(playlistSPosition!=-9){
					temp=MCS.AddSongPlaylist(playlistSPosition, MCS.getPSong(songPosition));
					System.out.println("The song in the playlist  "+validate(temp));
				}
		}
	}
	
	public void addRatePublicPlaylist(){
		int playlistRPosition=-9;
		System.out.println("Tell us the name of the playlist to rate, only public Playlist");
		String pPlaylistName=sc.nextLine();
		playlistRPosition=MCS.checkPlaylist(pPlaylistName);
			if(playlistRPosition!=-9){
				System.out.println("Tell us the rate from 1.0 to 5.0");
				double publicRate=sc.nextDouble();
				MCS.SetRate(playlistRPosition, publicRate);
				
			}
			else{
				System.out.println("It´s not a public playlist");
			}
		
	}
	
	public int choice(){
		int choice=sc.nextInt();
		sc.nextLine();
		return choice;
	}
	
	
	
	public String validate(boolean temp){
		String info="";
		if(temp){
			info=" was achieved";
		}
		else{
			info=" wasn´t achieved";
		}
		return info;
	}
	
	public void initializing(){
		int choice=0;
		printImage();
		do{
			mainMenu();
			choice=choice();
			mainMenuOperation(choice);
		}while(choice!=EXIT);
	}
}