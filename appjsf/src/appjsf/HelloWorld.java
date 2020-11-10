package appjsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloWorld")
@SessionScoped
public class HelloWorld implements Serializable{
    
    private static final long serialVersionUID = -6913972022251814607L;
	
    private String s1 = "Bienvienidos a mi página creada con JSF";

    public String getS1() {
        System.out.println(s1);
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }
  
}
