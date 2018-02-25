package com.java.workproject.JsonData;

import jline.console.history.History;
import okhttp3.Response;

public class TwitchAPI {

    private History history;

    private Response response;

    public History getHistory ()
    {
        return history;
    }

    public void setHistory (History history)
    {
        this.history = history;
    }

    public Response getResponse ()
    {
        return response;
    }

    public void setResponse (Response response)
    {
        this.response = response;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [history = "+history+", response = "+response+"]";
    }
}
