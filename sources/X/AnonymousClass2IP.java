package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2IP  reason: invalid class name */
public class AnonymousClass2IP {
    public static final long A06 = TimeUnit.DAYS.toMillis(7);
    public int A00;
    public long A01;
    public boolean A02;
    public final UserJid A03;
    public final String A04;
    public final String A05;

    public AnonymousClass2IP(UserJid userJid, String str, String str2, int i2, long j2, boolean z2) {
        this.A03 = userJid;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = i2;
        this.A02 = z2;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversionTuple{userJid=");
        sb.append(this.A03);
        sb.append(", data='");
        sb.append(this.A04);
        sb.append('\'');
        sb.append(", source='");
        sb.append(this.A05);
        sb.append('\'');
        sb.append(", bizCount=");
        sb.append(this.A00);
        sb.append(", hasUserSentLastMessage=");
        sb.append(this.A02);
        sb.append(", lastInteractionTimestampMs=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
