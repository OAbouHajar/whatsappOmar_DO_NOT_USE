package X;

import android.net.Uri;
import com.facebook.redex.IDxDListenerShape33S0300000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0800000_I0;
import com.whatsapp.jid.UserJid;
import java.io.File;

/* renamed from: X.0wQ  reason: invalid class name and case insensitive filesystem */
public class C18270wQ {
    public final C16180sb A00;
    public final C18260wP A01;
    public final C16440t3 A02;
    public final C18250wO A03;
    public final C14710pd A04;
    public final C18210wK A05;
    public final C18220wL A06;
    public final C18230wM A07;
    public final C16320sq A08;

    public C18270wQ(C16180sb r1, C18260wP r2, C16440t3 r3, C18250wO r4, C14710pd r5, C18210wK r6, C18220wL r7, C18230wM r8, C16320sq r9) {
        this.A02 = r3;
        this.A04 = r5;
        this.A08 = r9;
        this.A00 = r1;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = r4;
        this.A01 = r2;
    }

    public static AnonymousClass1XL A00(C34151jm r21, String str) {
        File file;
        Uri uri;
        C34151jm r3 = r21;
        String str2 = r3.A09;
        if (str2 != null) {
            if (r3.A01 == 3) {
                uri = Uri.parse(str2);
                file = null;
            } else {
                file = new File(str2);
                uri = null;
            }
            if (uri != null) {
                return AnonymousClass1XL.A00(uri, (AnonymousClass1XM) null, (AnonymousClass1XN) null, new AnonymousClass1XJ(true, false, true), AnonymousClass1XK.A0S, r3.A04, str, 0, false, true, true);
            } else if (file != null) {
                AnonymousClass1XJ r0 = new AnonymousClass1XJ(true, false, true);
                AnonymousClass1XK r5 = AnonymousClass1XK.A0S;
                return new AnonymousClass1XL(new C38231qS((AnonymousClass1XM) null, (AnonymousClass21D) null, r5, (File) null, (String) null, (String) null, "optimistic", (int[]) null, 0, 0, 0, true, true, false, false), new AnonymousClass210((AnonymousClass1XN) null, r5, r3.A04, file, (String) null, file.getName(), r3.A0D, r3.A0C, 0, 0, 0, 0, false, true, true, false, false), r0, (String) null);
            }
        }
        return null;
    }

    public AnonymousClass1WD A01(C35361lo r12, C15830rv r13, UserJid userJid, C16740tZ r15, C34151jm r16, Integer num) {
        AnonymousClass1WD r7 = new AnonymousClass1WD();
        if (!this.A01.A0A()) {
            r7.A02(new C47222Ic());
            return r7;
        }
        C16740tZ r6 = r15;
        C34151jm r2 = r16;
        Integer num2 = num;
        this.A08.Acl(new RunnableRunnableShape0S0800000_I0(r2, num2, r12, this, r6, r7, userJid, r13, 3));
        return r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C38641rB A02(X.C15830rv r18, com.whatsapp.jid.UserJid r19, X.C16740tZ r20, X.C34151jm r21, java.lang.Integer r22) {
        /*
            r17 = this;
            X.0ta r5 = new X.0ta
            r5.<init>()
            r2 = r21
            java.lang.String r3 = r2.A09
            if (r3 == 0) goto L_0x005e
            int r1 = r2.A01
            r0 = 3
            if (r1 != r0) goto L_0x0057
            android.net.Uri r4 = android.net.Uri.parse(r3)
        L_0x0014:
            int r0 = r2.A03
            r5.A08 = r0
            int r0 = r2.A02
            r5.A06 = r0
            r0 = r17
            X.0wK r3 = r0.A05
            r14 = 0
            r13 = 20
            r6 = 0
            r10 = r6
            r11 = r6
            r12 = r6
            r15 = 0
            r16 = 0
            r7 = r18
            r8 = r20
            r9 = r6
            X.0tY r1 = r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1rB r1 = (X.C38641rB) r1
            boolean r0 = X.C16030sJ.A0L(r7)
            if (r0 == 0) goto L_0x0040
            r0 = r19
            r1.A0b(r0)
        L_0x0040:
            java.lang.String r0 = r2.A0D
            r1.A05 = r0
            java.lang.String r0 = r2.A0C
            r1.A06 = r0
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "image/webp"
            r1.A06 = r0
        L_0x004e:
            X.1XO r0 = r2.A04
            r1.A02 = r0
            r0 = r22
            r1.A03 = r0
            return r1
        L_0x0057:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r5.A0F = r0
        L_0x005e:
            r4 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18270wQ.A02(X.0rv, com.whatsapp.jid.UserJid, X.0tZ, X.1jm, java.lang.Integer):X.1rB");
    }

    public void A03(C35361lo r31, C209612g r32) {
        C18230wM r12 = this.A07;
        AnonymousClass1XK r14 = AnonymousClass1XK.A0P;
        C35361lo r11 = r31;
        String str = r11.A0F;
        String str2 = r11.A04;
        String str3 = r11.A03;
        String str4 = r11.A02;
        String str5 = r11.A0G;
        byte[] bArr = r11.A08;
        String str6 = str5;
        byte[] bArr2 = bArr;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        r12.A06(new IDxDListenerShape33S0300000_2_I0(this, r11, r32, 2), r14, (AnonymousClass1WE) null, (AnonymousClass1WE) null, str10, str9, str8, (String) null, str7, str6, bArr2, 3, 1, 1, 0, r11.A0E);
    }
}
