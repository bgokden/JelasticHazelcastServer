package com.berkgokden.rest;

/**
 * Created by berkgokden on 12/29/14.
 */
import com.berkgokden.Track;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Path("/json")
public class JSONService {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackInJSON() {

        Track track = new Track();
        track.setTitle("Enter Sandman");
        track.setSinger("Metallica");
        track.setList(new HashMap<String, Serializable>());
        track.getList().put("test1", new Double(5.1));
        track.getList().put("test2", new String("test test"));
        return track;

    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Track track) {

        String result = "Track saved : " + track;
        return Response.status(201).entity(result).build();

    }

    @POST
    @Path("/insert")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAnythingInJSON(Map<String, Object> anything) {

        String result = "Anything saved : " + anything;
        return Response.status(201).entity(result).build();

    }

    @GET
    @Path("/receive")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> getAnythingkInJSON() {

        Map<String, Object> anything = new HashMap<String, Object>();

        anything.put("el1", 5);
        anything.put("el2", 5.3);
        anything.put("el3", "String test element");
        Map<String, Object> anything2 = new HashMap<String, Object>();
        anything2.put("2el1", 6);
        anything2.put("2el2", 6.4);
        anything2.put("2el3", "String test element 2");
        anything.put("el4", anything2);

        return anything;

    }

}