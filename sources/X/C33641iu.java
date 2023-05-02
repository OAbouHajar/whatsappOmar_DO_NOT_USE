package X;

import com.whatsapp.util.Log;

/* renamed from: X.1iu  reason: invalid class name and case insensitive filesystem */
public class C33641iu extends C20380zx {
    public final C24591Gn A00;
    public final AnonymousClass19D A01;
    public final AnonymousClass19E A02;
    public final C16440t3 A03;
    public final C15810rt A04;

    public C33641iu(C24591Gn r1, AnonymousClass19D r2, AnonymousClass19E r3, C16440t3 r4, C15810rt r5, C20360zv r6) {
        super(r6);
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void A0A(C36811o9 r8) {
        C15810rt r0 = this.A04;
        C15830rv r6 = r8.A01;
        if (r0.A06(r6) != null) {
            Log.i("delete-chat-handler/deleteChat deleteMessagesForRange");
            C24591Gn r5 = this.A00;
            boolean z2 = r8.A02;
            C36801o8 r3 = r8.A00;
            int A002 = C36801o8.A00(r5.A02.A04(r6, true), r3);
            if (A002 == 2 || A002 == 1) {
                r5.A01.A0J(r6, z2, false);
                AnonymousClass22O.A03(r5.A00, r6);
                return;
            }
            r5.A01(r3, r6, z2, true);
        }
    }
}
