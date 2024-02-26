package practice_folder1;
class Amazon
{
	private String Username="vc@gmail.com";
    private String password="vc@123";
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}	
}
public class Getter_Setter_method {

	public static void main(String[] args) {
		Amazon a1=new Amazon();
		a1.setUsername("Vc1@gmail.com");
		System.out.println(a1.getUsername());
        a1.setPassword("vc98765");
        System.out.println(a1.getPassword());
	}

}
