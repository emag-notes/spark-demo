package org.emamotor.spark.demo;

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;

/**
 * @author emag
 */
public class HelloSpark {

    public static void main(String... args) {

        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello Spark!";
            }
        });

        get(new Route("/hello/:name") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello " + request.params(":name") + "!";
            }
        });

    }
    
}
