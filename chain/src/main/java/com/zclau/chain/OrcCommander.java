package com.zclau.chain;

/**
 * @author liuzicong
 * @date 8/1/2018
 */
public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            handling(request);
            request.markHandled();
        }
        super.handleRequest(request);
    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}
