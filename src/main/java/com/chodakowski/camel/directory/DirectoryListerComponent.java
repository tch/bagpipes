/**
 * 
 */
package com.chodakowski.camel.directory;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultComponent;

/**
 * @author tch
 *
 */
public class DirectoryListerComponent extends DefaultComponent implements Component {

	/**
	 * 
	 */
	public DirectoryListerComponent() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param context
	 */
	public DirectoryListerComponent(CamelContext context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.impl.DefaultComponent#createEndpoint(java.lang.String, java.lang.String, java.util.Map)
	 */
	@Override
	protected Endpoint createEndpoint(String uri, String remaining,
			Map<String, Object> parameters) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
