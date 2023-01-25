package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
// "!" / "$" / "&" / "'" / "(" / ")" / "*" / "+" / "," / ";" / "=" / ":" / "@"
// I didn't put ; as it is the matrix separator
@Path("/!$&'()*+,=:@")
public class GreetingResource {

    @GET
    public String hello() {
        return "OK";
    }
}