package sec04.ex01;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class LoginImpl
 *
 */
public class LoginImpl implements HttpSessionBindingListener {

	String user_name;
	String user_pw;
	static int total_user=0;
    /**
     * Default constructor. 
     */
    public LoginImpl(String user_name, String user_pw) {
        // TODO Auto-generated constructor stub
    	this.user_name = user_name;
    	this.user_pw = user_pw;
    }

    @Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		++total_user;
	}
    
    @Override
    public void valueUnbound(HttpSessionBindingEvent arg0) {
    	total_user--;
    }
}
