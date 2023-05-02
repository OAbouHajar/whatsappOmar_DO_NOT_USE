package e;

import java.io.IOException;

/* compiled from: XFMFile */
public final class z extends IOException {
    public z() {
        super("Received response with 0 content-length header.");
    }
}
