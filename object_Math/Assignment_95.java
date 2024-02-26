//WAP to update the value of private variable username = "abc@grotechmind.com" to something else using getter and setter
package object_Math;
class Amazon
{
	private String username="abc@grotechmind.com";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	private String password="password@321";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
public class Assignment_95 {

	public static void main(String[] args) {
		Amazon a1=new Amazon();
		a1.setUsername("vasu@gmail.com");
		a1.setPassword("vasu@321");
		System.out.println(a1.getUsername());
		System.out.println(a1.getPassword());

	}

}
