package X;

import com.whatsapp.util.Log;

/* renamed from: X.1iy  reason: invalid class name and case insensitive filesystem */
public class C33681iy extends C20380zx {
    public final C24591Gn A00;
    public final AnonymousClass19D A01;
    public final AnonymousClass19E A02;
    public final C16440t3 A03;
    public final C15810rt A04;

    public C33681iy(C24591Gn r1, AnonymousClass19D r2, AnonymousClass19E r3, C16440t3 r4, C15810rt r5, C20360zv r6) {
        super(r6);
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void A0A(C37231op r9) {
        C15810rt r0 = this.A04;
        C15830rv r5 = r9.A01;
        if (r0.A06(r5) != null) {
            Log.i("clear-chat-handler/clearChat deleteMessagesForRange");
            C24591Gn r7 = this.A00;
            boolean z2 = r9.A02;
            boolean z3 = r9.A03;
            C36801o8 r3 = r9.A00;
            int A002 = C36801o8.A00(r7.A02.A04(r5, true), r3);
            if (A002 == 2 || A002 == 1) {
                Log.i("DeleteMessagesForRange/clearChat use default service");
                if (z3) {
                    r7.A05.A03(r5, (Long) null);
                }
                C16460t6 r1 = r7.A04;
                r1.A0U(r5, true);
                r1.A0S(r5, (Long) null, true, z2);
                return;
            }
            Log.i("DeleteMessagesForRange/clearChat use deleteMessages");
            r7.A01(r3, r5, z2, z3);
        }
    }
}
