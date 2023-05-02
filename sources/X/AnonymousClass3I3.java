package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3I3  reason: invalid class name */
public class AnonymousClass3I3 implements Runnable {
    public C47802Kp A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C35701mM A02;
    public final /* synthetic */ C49992Xb A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public AnonymousClass3I3(C35701mM r1, C49992Xb r2, UserJid userJid, String str, String str2, String str3, long j2) {
        this.A03 = r2;
        this.A01 = j2;
        this.A04 = userJid;
        this.A02 = r1;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
    }

    public void run() {
        C17170ue r8;
        C31481eG r3;
        Long valueOf;
        long j2 = this.A01;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        C49992Xb r7 = this.A03;
        if (i2 == 0) {
            C24511Gf r32 = r7.A04;
            UserJid userJid = this.A04;
            String str = this.A02.A0D;
            r32.A07(userJid, str);
            C17170ue r4 = r7.A05;
            C31481eG r33 = new C31481eG();
            C31481eG.A00(r33, this.A00);
            r33.A05 = 30;
            r33.A03 = 54;
            r33.A0D = str;
            r33.A00 = userJid;
            r33.A07 = Long.valueOf(j2);
            r33.A0B = this.A06;
            r33.A0E = this.A07;
            r33.A0A = this.A05;
            r4.A03(r33);
        } else {
            C24511Gf r6 = r7.A04;
            UserJid userJid2 = this.A04;
            C35701mM r34 = this.A02;
            String str2 = r34.A0D;
            C50102Xy A032 = r6.A03(userJid2, str2);
            if (A032 == null) {
                A032 = new C50102Xy(r34, 1);
                r8 = r7.A05;
                r3 = new C31481eG();
                C31481eG.A00(r3, this.A00);
                r3.A05 = 28;
                r3.A03 = 49;
                r3.A0D = str2;
                r3.A00 = userJid2;
                valueOf = Long.valueOf(A032.A00);
            } else {
                A032.A00 = j2;
                r8 = r7.A05;
                r3 = new C31481eG();
                C31481eG.A00(r3, this.A00);
                r3.A05 = 29;
                r3.A03 = 53;
                r3.A0D = str2;
                r3.A00 = userJid2;
                valueOf = Long.valueOf(j2);
            }
            r3.A07 = valueOf;
            r3.A0B = this.A06;
            r3.A0E = this.A07;
            r3.A0A = this.A05;
            r8.A03(r3);
            r6.A05(A032, userJid2);
        }
        r7.A00();
    }
}
