package model;
public class SongLength{
	private int minutes;
	private int seconds;
	
	
	public SongLength(int minutes, int seconds){
		this.minutes=minutes;
		this.seconds=seconds;
		
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
	
	
	
	
}