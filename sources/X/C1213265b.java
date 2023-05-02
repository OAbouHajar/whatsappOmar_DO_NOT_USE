package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.65b  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1213265b implements Runnable {
    public final /* synthetic */ C112825ja A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C1213265b(C112825ja r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public final void run() {
        boolean z2;
        AnonymousClass1Vt A012;
        String obj;
        C112825ja r0 = this.A00;
        boolean z3 = this.A01;
        C16040sK r2 = r0.A01;
        r2.A0B();
        C28881Zb r22 = r2.A01;
        AnonymousClass00B.A06(r22);
        if (z3) {
            C28411Vz r3 = r0.A09;
            String str = ((C35491m1) r3).A04;
            z2 = true;
            A012 = AnonymousClass1W1.A01(r3, r0.A0A, (UserJid) null, (UserJid) r22.A0E, str, (String) null, "IN", 10, 11, AnonymousClass1W0.A00("IN"), 1, 0, -1);
        } else {
            C28411Vz r6 = r0.A09;
            String str2 = ((C35491m1) r6).A04;
            z2 = true;
            A012 = AnonymousClass1W1.A01(r6, r0.A0A, (UserJid) r22.A0E, (UserJid) null, str2, (String) null, "IN", 1, 401, AnonymousClass1W0.A00("IN"), 1, 0, -1);
        }
        if (!TextUtils.isEmpty(r0.A0c)) {
            r0.A0H.A0U(r0.A0c);
        }
        A012.A05 = r0.A05.A00();
        A012.A0F = "UNSET";
        C111855hW r62 = r0.A0H;
        A012.A0A = r62;
        A012.A0P = z2;
        String str3 = (String) r0.A09.A00;
        if (z3) {
            r62.A0L = str3;
            r62.A08 = C110105dW.A0J(C110105dW.A0L(), String.class, r0.A07.A00, "legalName");
        } else {
            r62.A0J = str3;
            r62.A0a((String) r0.A07.A00);
        }
        String str4 = r62.A0F;
        AnonymousClass00B.A05(str4);
        AnonymousClass1Vt A0M = r0.A07.A0M(str4, (String) null);
        AnonymousClass1Vo r4 = r0.A0t;
        if (A0M == null) {
            obj = "IN- HANDLE_SEND_AGAIN Old txn is null";
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("IN- HANDLE_SEND_AGAIN Old txn is not null, interop is ");
            A0r.append(A0M.A0P);
            obj = A0r.toString();
        }
        r4.A06(obj);
        r0.A07.A0l(A012, A0M, str4);
        r4.A06(AnonymousClass000.A0h(A012.A0K, AnonymousClass000.A0r("getPayNonWaVpaCallback added new transaction with trans id: ")));
        r0.A05.A0K(new AnonymousClass65Z(A012, r0));
    }
}
