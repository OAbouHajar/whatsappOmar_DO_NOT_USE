package okhttp3;

import java.net.Socket;
import javax.annotation.Nullable;

/* compiled from: XFMFile */
public interface Connection {
    @Nullable
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
