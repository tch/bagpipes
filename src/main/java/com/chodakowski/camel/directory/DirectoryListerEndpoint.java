/**
 * 
 */
package com.chodakowski.camel.directory;

import org.apache.camel.Component;
import org.apache.camel.Consumer;
import org.apache.camel.Endpoint;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;

/**
 * @author tch
 *
 */
public class DirectoryListerEndpoint extends DefaultEndpoint implements
		Endpoint {

	/**
	 * 
	 */
	public DirectoryListerEndpoint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param endpointUri
	 * @param component
	 */
	public DirectoryListerEndpoint(String endpointUri, Component component) {
		super(endpointUri, component);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.IsSingleton#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.Endpoint#createProducer()
	 */
	@Override
	public Producer createProducer() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.Endpoint#createConsumer(org.apache.camel.Processor)
	 */
	@Override
	public Consumer createConsumer(Processor processor) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
