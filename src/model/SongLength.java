package model;
public class SongLength{
	private int minutes;
	private int seconds;
	private String sLength;
	
	public SongLength(int minutes, int seconds){
		this.minutes=minutes;
		this.seconds=seconds;
		sLength="*"+getMinutes()+" : "+getSeconds;
	}
	
	public int getMinutes(){
		return minutes;
	}
	
	public void setMinutes(int minutes){
		this.minutes=minutes;
	}
	
	public int getSeconds(){
		return seconds;
	}
	
	public void setSeconds(int seconds){
		this.seconds=seconds;
	}
	
	public String setSLength(){
		sLength="*"+getMinutes()+" : "+getSeconds;
		return sLength;
	}
	
	
}