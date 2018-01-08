package com.zclau.chain;

/**
 *
 * @author liuzicong
 * @date 8/1/2018
 */
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }

    public void handling(Request request) {
        System.out.println(this + " handling request " + request);
    }

    @Override
    public abstract String toString();
}
