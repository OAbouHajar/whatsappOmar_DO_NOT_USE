package okhttp3;

import java.io.IOException;

/* compiled from: XFMFile */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f2058a;

    /* access modifiers changed from: public */
    Protocol(String str) {
        this.f2058a = str;
    }

    public static Protocol get(String str) {
        Protocol protocol = HTTP_1_0;
        if (str.equals(protocol.f2058a)) {
            return protocol;
        }
        Protocol protocol2 = HTTP_1_1;
        if (str.equals(protocol2.f2058a)) {
            return protocol2;
        }
        Protocol protocol3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(protocol3.f2058a)) {
            return protocol3;
        }
        Protocol protocol4 = HTTP_2;
        if (str.equals(protocol4.f2058a)) {
            return protocol4;
        }
        Protocol protocol5 = SPDY_3;
        if (str.equals(protocol5.f2058a)) {
            return protocol5;
        }
        Protocol protocol6 = QUIC;
        if (str.equals(protocol6.f2058a)) {
            return protocol6;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public String toString() {
        return this.f2058a;
    }
}
