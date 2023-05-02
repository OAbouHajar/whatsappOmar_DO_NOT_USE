package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.4z3  reason: invalid class name and case insensitive filesystem */
public class C102504z3 implements C40871up {
    public final /* synthetic */ C49642Uo A00;

    public C102504z3(C49642Uo r1) {
        this.A00 = r1;
    }

    public void AQR(int i2) {
        C49642Uo r0 = this.A00;
        r0.A09(new C85534Ov(r0.A0K, (UserJid) null, (C30371cF) null, (String) null, (String) null, (List) null, 0, 2, 0, 0), i2);
    }

    public void ARw(C16050sL r15, C16050sL r16, UserJid userJid, C30371cF r18, String str, String str2, String str3, Map map, int i2, int i3, int i4, long j2, long j3) {
        C49642Uo r1 = this.A00;
        List A0B = r1.A0I.A0B(map);
        C16050sL r3 = r15;
        r1.A0K = r15;
        C16050sL r2 = r16;
        if (r16 != null) {
            r1.A0N = AnonymousClass000.A1Q(r1.A05.A03.A00(r2).size());
        }
        r1.A08(new C85534Ov(r3, userJid, r18, str, str3, A0B, i2, i3, i4, j2));
    }
}
