package com.hit.server;
import com.hit.dm.Restaurant;

import java.util.List;

public class Response {
    public String json;
    public List<Restaurant> rest;

    public Response(List<Restaurant> rests)
    {
        this.rest = rests;
    }

    public Response(String string) {
        json = string;
    }

    public String toString() {
        return  "{'Rests':" + rest + "', 'json':'" + json + "'}";
    }
}
