package e;

import com.squareup.picasso.Request;
import com.squareup.picasso.RequestHandler;

/* compiled from: XFMFile */
public final class e extends RequestHandler {
    public final boolean canHandleRequest(Request request) {
        return true;
    }

    public final RequestHandler.Result load(Request request, int i2) {
        throw new IllegalStateException("Unrecognized type of request: " + request);
    }
}
