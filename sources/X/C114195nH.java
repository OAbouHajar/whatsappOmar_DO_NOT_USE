package X;

import com.facebook.redex.IDxKCallbackShape1S1300000_3_I1;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.5nH  reason: invalid class name and case insensitive filesystem */
public class C114195nH extends C110675ee {
    public final AnonymousClass027 A00 = C13690nt.A0O();
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final AnonymousClass027 A02 = C13690nt.A0O();
    public final AnonymousClass027 A03 = C13690nt.A0O();
    public final C14870pt A04;
    public final AnonymousClass5vZ A05;
    public final C118435ug A06;
    public final C119255wn A07;
    public final C16320sq A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public C114195nH(C14870pt r8, C16440t3 r9, AnonymousClass5vZ r10, C118435ug r11, C119285wq r12, C119255wn r13, AnonymousClass5xG r14, AnonymousClass5wV r15, C118915vc r16, C16320sq r17, String str, String str2, boolean z2) {
        super(r9, r12, r14, r15, r16);
        this.A04 = r8;
        this.A08 = r17;
        this.A07 = r13;
        this.A0A = str;
        this.A05 = r10;
        this.A06 = r11;
        this.A09 = str2;
        this.A0B = z2;
    }

    public void A04() {
        Log.i("DyiViewModel/on-cleared");
        C119255wn r3 = this.A07;
        String str = this.A09;
        if (r3.A02(str) == 3) {
            synchronized (r3) {
                C111985hk r0 = r3.A00;
                if (r0 != null) {
                    r0.A03();
                }
                r3.A0A.A0D(2, str);
            }
        }
    }

    public final void A08(int i2) {
        if (!this.A04.A0O()) {
            Log.i("DyiViewModel/check-internet :: no internet connection aborting the action");
            C110115dX.A0x(this.A03, Integer.valueOf(i2), new AnonymousClass2HJ(7));
        }
    }

    public final void A09(AnonymousClass50C r8, C118345uX r9, C28371Vv r10, String str) {
        C118345uX r2 = r9;
        try {
            C28371Vv r3 = r10;
            String str2 = str;
            this.A05.A01(r2, r3, str2, this.A09, r8.A8P(this.A0A.getBytes(AnonymousClass01S.A08), C004101u.A0E(16)));
        } catch (Exception unused) {
            Log.e("DyiViewModel/request-report/sendDyiReportRequestWithPassword");
            r9.A00(C110115dX.A0N());
        }
    }

    public void A0A(C118345uX r13, C28371Vv r14, String str) {
        Log.i("DyiViewModel/request-report");
        A08(0);
        C119255wn r1 = this.A07;
        long A002 = this.A04.A00();
        String str2 = this.A09;
        synchronized (r1) {
            Log.i("dyiReportManager/on-report-requested");
            r1.A0A.A0L(str2, A002);
        }
        this.A02.A09(C13680ns.A0Y());
        C118345uX r7 = r13;
        String str3 = str;
        if (str2.equals("business")) {
            this.A05.A01(r7, (C28371Vv) null, str, "business", (byte[]) null);
        } else if (!str2.equals("personal")) {
            Log.e("PAY: DyiReportViewModel/requestReport - this account type is not supported");
        } else {
            C28371Vv r5 = r14;
            if (this.A0B) {
                AnonymousClass50C A0R = C110115dX.A0R(this.A05, "FB", "DYI-REPORT");
                if (A0R != null) {
                    A09(A0R, r13, r14, str);
                } else {
                    this.A06.A00(new IDxKCallbackShape1S1300000_3_I1(2, str3, r5, this, r7), "FB");
                }
            } else {
                AnonymousClass5vZ r6 = this.A05;
                AnonymousClass00B.A06(r14);
                r6.A01(r7, r14, str, "personal", (byte[]) null);
            }
        }
    }

    public void A0B(String str) {
        A0A(new C118345uX((C14530pL) null, (PinBottomSheetDialogFragment) null, this, (String) null, -1), (C28371Vv) null, str);
    }
}
