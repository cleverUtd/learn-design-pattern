package com.zclau.chain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by liuzicong on 8/1/2018.
 */
public class OrcKingTest {
    private static final Request[] REQUESTS = new Request[] {
                    new Request(RequestType.DEFEND_CASTLE, "Don't let the barbarians enter my castle!!"),
                    new Request(RequestType.TORTURE_PRISONER, "Don't just stand there, tickle him!"),
                    new Request(RequestType.COLLECT_TAX, "Don't steal, the King hates competition ...")};

    @Test
    public void testMakeRequest() {
        OrcKing king = new OrcKing();

        for (Request request : REQUESTS) {
            king.makeRequest(request);

            Assert.assertTrue("Expected all requests from King to be handled, but [" + request + "] was not!",
                            request.isHandled());
        }
    }
}
