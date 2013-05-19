package com.chodakowski.home.bagpipes.sandbox

import org.apache.camel.test.junit4.CamelTestSupport
import org.junit.Test
import org.apache.camel.scala.dsl.builder.RouteBuilderSupport

import com.chodakowski.home.bagpipes.sandbox.SimpleRouteBuilder;


// we want to use the Camel test kit to test the FilterRoute which we can do by extending
// the CamelTestSupport class from camel-test
// to bridge the Scala DSL RouteBuilder with the Java DSL RouteBuilder, that the Camel test kit
// is using, we need to mixin the trait RouteBuilderSupport (using the with keyword)
class FilterRouteTest extends CamelTestSupport with RouteBuilderSupport {

  // then override the createRouteBuilder method to provide the route we want to test
  override def createRouteBuilder() = new SimpleRouteBuilder()

  // and here we just have regular JUnit test method which uses the API from camel-test

  @Test
  def testFilterRouteGold() {
    getMockEndpoint("mock:gold").expectedMessageCount(1)
    getMockEndpoint("mock:no_gold").expectedMessageCount(0)

    template.sendBodyAndHeader("direct:start", "Hello World", "gold", "true")

    assertMockEndpointsSatisfied()
  }

  @Test
  def testFilterRouteNotGold() {
    getMockEndpoint("mock:gold").expectedMessageCount(0)
    getMockEndpoint("mock:no_gold").expectedMessageCount(1)

    template.sendBodyAndHeader("direct:start", "Hello World", "gold", "false")

    assertMockEndpointsSatisfied()
  }

}