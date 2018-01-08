package com.zclau.chain;

import java.util.Objects;

/**
 * Created by liuzicong on 8/1/2018.
 */
public class Request {

    private final RequestType requestType;

    private final String requestDescription;

    /**
     * Indicates if the request is handled or not. A request can only switch state from unhandled to
     * handled, there's no way to 'unhandle' a request
     */
    private boolean handled;

    /**
     * Create a new request of the given type and accompanied description.
     *
     * @param requestType        The type of request
     * @param requestDescription The description of the request
     */
    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void markHandled() {
        this.handled = true;
    }

    public boolean isHandled() {
        return handled;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
