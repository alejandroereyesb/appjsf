package appjsf;

import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.*; 
@ManagedBean  
@RequestScoped  
public class User{  
   private String name;  
   String email;

   private String password;  
   String gender;
   @NotNull(message = "Address can't be empty")  
   String address;  
   String[] city;
   double salary;

   public String getName() {  
      return name;  
   }  
   public void setName(String name) {  
      this.name = name;  
   }  
   public String getEmail() {  
      return email;  
   }  

   public void setEmail(String email) {  
      this.email = email;  
   }  
   public String getPassword() {  
      return password;  
   }  
   public void setPassword(String password) {  
      this.password = password;  
   }  
   public String getGender() {  
      return gender;  
   }  
   public void setGender(String gender) {  
      this.gender = gender;  
   }  
   public String getAddress() {  
      return address;  
   }  
   public void setAddress(String address) {  
      this.address = address;  
   } 
   public String sendForm() {
	   return "response";
   }
   public String[] getCity() {
	return city;
   }
   public void setCity(String[] city) {
	this.city = city;
   }
   public double getSalary() {
	return salary;
   }
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
public String userValidOrNot() { 

   if(name.equals("alex") && password.equals("1234")) {
       return "home";
   }  else {
       return "login";
   }
}
}  