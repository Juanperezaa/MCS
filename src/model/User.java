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
		categoryI=1;
		category=Category.values()[categoryI-1];
	}
	
	public String getNickname(){
		return nickname;
	}
	
	public void setNickname(String nickname){
		this.nickname=nickname;
	}
	
	public String getPassword(){
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
	
	public void turnCategory(){
		int lCategory=0;
		if(counterS<3){
			lCategory=1;
		}
		else if(counterS<10){
			lCategory=2;
		}
		else if(counterS<30){
			lCategory=3;
		}
		else{
			lCategory=4;
		}
		setCategory(lCategory);
	}

	public void counterSong(){
		counterS=counterS++;
	}
	
	public String getUserInfo(){
		turnCategory();
		String info="**********USER**********\n";
		info+="** NickName:  "+getNickname()+"\n";
		info+="** Age:  "+getAge()+"\n";
		info+="** Category:  "+getCategory()+"\n";
		info+="************************";
		return info;
	}
}