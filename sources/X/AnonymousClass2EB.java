package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2EB  reason: invalid class name */
public class AnonymousClass2EB {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C15830rv A03;
    public final UserJid A04;
    public final C28381Vw A05;
    public final String A06;
    public final byte[] A07;

    public AnonymousClass2EB(C15830rv r1, UserJid userJid, C28381Vw r3, String str, byte[] bArr, int i2, int i3, long j2) {
        this.A05 = r3;
        this.A03 = r1;
        this.A02 = j2;
        this.A01 = i2;
        this.A06 = str;
        this.A04 = userJid;
        this.A00 = i3;
        this.A07 = bArr;
    }

    public static AnonymousClass2EB A00(C30161br r10) {
        C28381Vw r3 = r10.A0C;
        if (r3 == null) {
            r3 = r10.A0m;
        }
        return new AnonymousClass2EB(C16030sJ.A00(r10.A08), (UserJid) null, r3, (String) null, (byte[]) null, 1, r10.A00(), r10.A0j);
    }

    public static AnonymousClass2EB A01(C38831rU r10) {
        return new AnonymousClass2EB(r10.A0B(), r10 instanceof C39161s1 ? ((C39161s1) r10).A00 : null, r10.A11, r10.A01, (byte[]) null, 0, 0, r10.A0I);
    }
}
