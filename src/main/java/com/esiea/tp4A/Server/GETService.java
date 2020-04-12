package com.esiea.tp4A;

import com.esiea.tp4A.domain.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PATCH;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api/player")

public class GETService {
    @GET
    @Path("/{numJ}")
    @Prod(MediaType.APPLICATION_JSON)
    
    public Rover getJSon(){
        Rover rover=new Rover();
        Rover.setnumJ(1);
        

    }
 
   
}