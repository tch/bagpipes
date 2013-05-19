package com.chodakowski.home.bagpipes

import org.apache.camel.scala.dsl.builder.RouteBuilder
import org.apache.camel.Exchange

class SecurityImagesSegregator extends RouteBuilder {

    // an example of a Processor method
   val myProcessorMethod = (exchange: Exchange) => {
     exchange.getIn.setBody("block test")
   }
   
   // a route using Scala blocks
   "file://cam_output/foscam/snapshots" ==> {
   	  to ("mock:files")
   }
  
  
}