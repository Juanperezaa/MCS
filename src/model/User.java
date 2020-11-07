package model;

//Creating the user class
public class User{
	
	//Stating the class atributes
	private String nickname;
	private String password;
	private int age;
	private Category category;
	private int categoryI;
	private int counterS;
	
	
	//Constructor method
	public User(String nickname, String password, int age){
		this.nickname=nickname;
		this.password=password;
		this.age=age;
		category=Category.values()[0];
	}
	
	public String getNickname(){
		return nickname;
	}
	
	public void setNickname(int nickname){
		this.nickname=nickname;
	}
	
	public String password(){
		return password;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public int getAge(){
		return age;
	}
	
	public Category getCategory(){
		return category;
	}
	
	public void setCategory(int counterS){
		this.category=Category.values()[categoryI-1];
	}

	public void counterSong(){
		counters=counterS++;
	}
	
	public String getUserInfo(){
		String info="**********USER**********\n";
		info+="** NickName:  "+getNickname()+"\n";
		info+="** Age:  "+getAge()+"\n";
		info+="** Category:  "+getCategory()"\n";
		info+="************************";
	}
}