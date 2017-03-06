package com.main;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
*
* @author atiqkhaled
*/
public class SuperManOptionalTag extends SimpleTagSupport{
	private String count;
	StringWriter sw = new StringWriter();
	
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	public void doTag() throws JspException, IOException {
    	int c = 0;
		JspWriter out = getJspContext().getOut();
		
    	if (getCount() != null) {
    		c = Integer.parseInt(getCount());
    		getJspBody().invoke(sw);
	    } else {
	    	getJspBody().invoke(sw);
	    }
    	// out.println("Hello Custom Tag!");
    	for(int i = 0; i < c; i++) {
    	   out.print(sw + "<br/>");
    	}

    }
}	
	
