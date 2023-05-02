package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.1sx  reason: invalid class name and case insensitive filesystem */
public class C39721sx {
    public double A00;
    public double A01;
    public float A02 = -1.0f;
    public int A03 = -1;
    public int A04 = -1;
    public long A05;
    public final UserJid A06;

    public C39721sx(UserJid userJid) {
        this.A06 = userJid;
    }

    public void A00(C39721sx r3) {
        AnonymousClass00B.A0G(r3.A06.equals(this.A06));
        this.A05 = r3.A05;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A02 = r3.A02;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C39721sx) {
            C39721sx r7 = (C39721sx) obj;
            return r7.A06.equals(this.A06) && r7.A05 == this.A05;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, Long.valueOf(this.A05)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[UserLocation jid=");
        sb.append(this.A06);
        sb.append(" latitude=");
        sb.append(this.A00);
        sb.append(" longitude=");
        sb.append(this.A01);
        sb.append(" accuracy=");
        sb.append(this.A03);
        sb.append(" speed=");
        sb.append(this.A02);
        sb.append(" bearing=");
        sb.append(this.A04);
        sb.append(" timestamp=");
        sb.append(this.A05);
        sb.append("]");
        return sb.toString();
    }
}
