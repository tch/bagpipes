/**
 * 
 */
package com.chodakowski.camel.directory;

import org.apache.camel.Consumer;
import org.apache.camel.Endpoint;
import org.apache.camel.Processor;
import org.apache.camel.impl.DefaultConsumer;

/**
 * @author tch
 *
 */
public class DirectoryListerConsumer extends DefaultConsumer implements
		Consumer {

	/**
	 * @param endpoint
	 * @param processor
	 */
	public DirectoryListerConsumer(Endpoint endpoint, Processor processor) {
		super(endpoint, processor);
		// TODO Auto-generated constructor stub
	}

}
