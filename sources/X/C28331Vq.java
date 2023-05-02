package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Vq  reason: invalid class name and case insensitive filesystem */
public class C28331Vq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final UserJid A06;
    public final String A07;
    public final String A08;

    public C28331Vq(UserJid userJid, C40111ta r4, String str, String str2, int i2, int i3, long j2) {
        this.A06 = userJid;
        this.A05 = j2;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = r4.hostStorage;
        this.A00 = r4.actualActors;
        this.A04 = r4.privacyModeTs;
    }

    public C40111ta A00() {
        return new C40111ta(this.A01, this.A04, this.A00);
    }

    public boolean A01() {
        String str = this.A07;
        return str != null && str.startsWith("ent:");
    }

    public boolean A02() {
        String str = this.A07;
        return str != null && str.startsWith("smb:");
    }
}
