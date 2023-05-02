package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ft  reason: invalid class name and case insensitive filesystem */
public class C63003Ft implements C109325Rp {
    public final /* synthetic */ AnonymousClass04N A00;
    public final /* synthetic */ C82654Dq A01;
    public final /* synthetic */ AnonymousClass1PP A02;
    public final /* synthetic */ C16050sL A03;

    public C63003Ft(AnonymousClass04N r1, C82654Dq r2, AnonymousClass1PP r3, C16050sL r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void AQR(int i2) {
        this.A01.A00.A09(new C85534Ov(this.A03, (UserJid) null, (C30371cF) null, (String) null, (String) null, (List) null, 0, 2, 0, 0), i2);
    }

    public void AY1(C16050sL r21, UserJid userJid, C30371cF r23, String str, Map map, int i2, int i3, int i4, long j2, long j3, boolean z2) {
        int i5;
        AnonymousClass1PP r5 = this.A02;
        Map map2 = map;
        List A0B = r5.A04.A0B(map2);
        C16050sL r8 = r21;
        C30361cE r4 = new C30361cE(r8);
        Iterator A0y = AnonymousClass000.A0y(map2);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            String str2 = ((AnonymousClass2Bb) A0z.getValue()).A03;
            boolean equals = "admin".equals(str2);
            boolean equals2 = "superadmin".equals(str2);
            if (equals) {
                i5 = 1;
            } else if (equals2) {
                i5 = 2;
            }
            r4.A07((UserJid) A0z.getKey(), r5.A03.A0D((UserJid) A0z.getKey()), i5, false, true);
        }
        r5.A02.A03.put(r8, r4);
        C85534Ov r7 = new C85534Ov(r8, userJid, r23, str, (String) null, A0B, i2, i3, i4, j2);
        r7.A00 = z2;
        this.A00.accept(r7);
    }
}
