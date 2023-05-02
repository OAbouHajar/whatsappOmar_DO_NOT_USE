package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5nC  reason: invalid class name and case insensitive filesystem */
public class C114145nC extends C114625o5 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final /* synthetic */ C114085n6 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114145nC(C114085n6 r2, String str, String str2, String str3, boolean z2) {
        super(r2, (C28381Vw) null, str, z2);
        this.A03 = r2;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public C117415sx A0B() {
        if (this.A00 != null) {
            C117415sx A0B = super.A0B();
            AnonymousClass1W2 r4 = A0B.A01.A0A;
            if (r4 instanceof C111855hW) {
                C111855hW r42 = (C111855hW) r4;
                if (r42.A0B != null) {
                    String str = this.A01;
                    C28411Vz r3 = C114085n6.A0K;
                    C28401Vy A0B2 = C110115dX.A0B(r3, str);
                    AnonymousClass00B.A06(A0B2);
                    C114085n6 r1 = this.A03;
                    r42.A0B.A0C = new AnonymousClass5xB(r1.A02.A00(r3, A0B2), C39841t9.A00(str, "money"), r1.A03.A03(this.A02, false));
                }
            }
            return A0B;
        }
        C114085n6 r0 = this.A03;
        String str2 = r0.A0A;
        long parseLong = str2 != null ? Long.parseLong(str2) : 0;
        C28411Vz r12 = C114085n6.A0K;
        C35431lv r43 = new C35431lv(r12, 1, parseLong);
        String str3 = ((C35491m1) r12).A04;
        C28401Vy r13 = r43.A02;
        C16440t3 r32 = r0.A00;
        boolean z2 = true;
        AnonymousClass1Vt r11 = new AnonymousClass1Vt(r12, r13, (UserJid) null, (UserJid) null, str3, (String) null, (String) null, (String) null, (String) null, (String) null, "IN", 40, 115, 1, 1, 0, r32.A00(), r32.A00());
        C111855hW r6 = new C111855hW();
        r6.A0a(r0.A09);
        r6.A0J = r0.A0J;
        AnonymousClass5xN r7 = r0.A03;
        String str4 = r0.A0I;
        r6.A04 = r7.A03(str4, false);
        r6.A0H = r0.A08;
        String str5 = r0.A0E;
        if (str5 != null) {
            z2 = "Y".equalsIgnoreCase(str5);
        }
        String str6 = r0.A0F;
        boolean equalsIgnoreCase = str6 == null ? true : "Y".equalsIgnoreCase(str6);
        long A032 = r7.A03(str4, true);
        long A033 = r7.A03(r0.A0H, false);
        String str7 = r0.A04;
        if (str7 == null) {
            str7 = "MAX";
        }
        r6.A0B = new AnonymousClass5xC(str7, r0.A0G, r0.A07, r0.A0B, str2, r0.A06, r0.A0D, r0.A0C, r0.A0D, A032, A033, z2, equalsIgnoreCase);
        r11.A0A = r6;
        return new C117415sx((C30671cl) null, r11, (C16740tZ) null, (C16830ti) null, false);
    }
}
