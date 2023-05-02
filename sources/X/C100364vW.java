package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4vW  reason: invalid class name and case insensitive filesystem */
public class C100364vW implements AnonymousClass5RV {
    public final /* synthetic */ C57242qY A00;
    public final /* synthetic */ String A01;

    public C100364vW(C57242qY r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void AV3(String str) {
        this.A00.A0Q.A09(str);
    }

    public void AV4(AnonymousClass4H6 r7) {
        String str = r7.A01;
        if (str.equals("success")) {
            C57242qY r1 = this.A00;
            AnonymousClass027 r0 = r1.A0A;
            String str2 = this.A01;
            r0.A09(str2);
            AnonymousClass027 r02 = r1.A09;
            String str3 = r7.A00;
            r02.A09(str3);
            C15860rz r2 = r1.A0K;
            UserJid userJid = r1.A0M;
            r2.A16(userJid.getRawString(), str2);
            r2.A15(userJid.getRawString(), str3);
        }
        this.A00.A0Q.A09(str);
    }
}
