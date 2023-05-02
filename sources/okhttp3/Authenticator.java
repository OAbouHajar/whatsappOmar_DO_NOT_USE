package okhttp3;

import e.j;
import javax.annotation.Nullable;

/* compiled from: XFMFile */
public interface Authenticator {
    public static final Authenticator NONE = new j();

    @Nullable
    Request authenticate(Route route, Response response);
}
