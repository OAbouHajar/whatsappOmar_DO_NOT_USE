package okhttp3;

import e.j;
import java.net.InetAddress;
import java.util.List;

/* compiled from: XFMFile */
public interface Dns {
    public static final Dns SYSTEM = new j();

    List<InetAddress> lookup(String str);
}
