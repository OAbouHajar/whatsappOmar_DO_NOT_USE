package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4vX  reason: invalid class name and case insensitive filesystem */
public class C100374vX implements AnonymousClass5RV {
    public final /* synthetic */ AnonymousClass2ql A00;
    public final /* synthetic */ String A01;

    public C100374vX(AnonymousClass2ql r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void AV3(String str) {
        this.A00.A0I.A09(str);
    }

    public void AV4(AnonymousClass4H6 r6) {
        String str = r6.A01;
        if (str.equals("success")) {
            AnonymousClass2ql r1 = this.A00;
            AnonymousClass027 r0 = r1.A0A;
            String str2 = this.A01;
            r0.A09(str2);
            C15860rz r2 = r1.A0F;
            UserJid userJid = r1.A0G;
            r2.A16(userJid.getRawString(), str2);
            r2.A15(userJid.getRawString(), r6.A00);
        }
        this.A00.A0I.A09(str);
    }
}
