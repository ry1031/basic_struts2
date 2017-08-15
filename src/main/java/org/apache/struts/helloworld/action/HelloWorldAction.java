package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1426967826890296347L;
	
	private MessageStore messageStore;
    
    private String userName;

    public String execute() {
        messageStore = new MessageStore();
        
        helloCount++;
        
        if (userName != null) {
            messageStore.setMessage( messageStore.getMessage() + " " + userName);
        }
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    private static int helloCount = 0;
	
    public int getHelloCount() {
        return helloCount;
    }
}
