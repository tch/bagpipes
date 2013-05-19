package com.chodakowski.home.bagpipes.sandbox

import org.apache.camel.scala.dsl.builder.RouteBuilder
import org.apache.camel.Exchange

class SimpleRouteBuilder extends RouteBuilder {

  
    // an example of a Processor method
   val myProcessorMethod = (exchange: Exchange) => {
     exchange.getIn.setBody("block test")
   }
   
   // a route using Scala blocks
   "direct:start" ==> {
      process(myProcessorMethod)
      //filter(_.in("gold") == "true")
      when(_.in("gold") == "true") {
    	  --> ("mock:gold")
      } otherwise {
    	  to ("mock:no_gold")
      }
   }
    
}