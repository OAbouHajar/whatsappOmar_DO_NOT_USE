package X;

import java.net.InetAddress;

/* renamed from: X.1mV  reason: invalid class name and case insensitive filesystem */
public final class C35791mV {
    public final long A00;
    public final InetAddress A01;

    public C35791mV(InetAddress inetAddress, long j2) {
        this.A01 = inetAddress;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InetAddressWithExpiry{address=");
        sb.append(this.A01);
        sb.append(", expireTimeMillis=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
