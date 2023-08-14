package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
// "!" / "$" / "&" / "'" / "(" / ")" / "*" / "+" / "," / ";" / "=" / ":" / "@"
// I didn't put ; as it is the matrix separator
@Path("/!$&'()*+,=:@")
public class GreetingResource {

    @GET
    public String hello() {
        return "OK";
    }
}
