package X;

import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.redex.IDxPListenerShape115S0200000_3_I1;
import com.facebook.redex.IDxTCallbackShape11S0400000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5ww  reason: invalid class name and case insensitive filesystem */
public abstract class C119345ww {
    public C35281lf A00;
    public String A01 = "wa_payment_settings";
    public List A02;
    public boolean A03;
    public final C14870pt A04;
    public final C16040sK A05;
    public final C14530pL A06;
    public final C18260wP A07;
    public final C16440t3 A08;
    public final C18080w7 A09;
    public final AnonymousClass175 A0A;
    public final AnonymousClass109 A0B;
    public final C18340wX A0C;
    public final C18300wT A0D;
    public final C18310wU A0E;
    public final AnonymousClass5xE A0F;
    public final C118365uZ A0G;
    public final C119285wq A0H;
    public final C1222969a A0I;
    public final AnonymousClass5xG A0J;
    public final C118915vc A0K;
    public final AnonymousClass69C A0L;

    public C119345ww(C14870pt r2, C16040sK r3, C14530pL r4, C18260wP r5, C16440t3 r6, C18080w7 r7, AnonymousClass175 r8, AnonymousClass109 r9, C18340wX r10, C18300wT r11, C18310wU r12, AnonymousClass5xE r13, C118365uZ r14, C119285wq r15, C1222969a r16, AnonymousClass5xG r17, C118915vc r18, AnonymousClass69C r19) {
        this.A08 = r6;
        this.A04 = r2;
        this.A05 = r3;
        this.A09 = r7;
        this.A0G = r14;
        this.A0D = r11;
        this.A0A = r8;
        this.A0K = r18;
        this.A0E = r12;
        this.A0I = r16;
        this.A0F = r13;
        this.A07 = r5;
        this.A0C = r10;
        this.A0J = r17;
        this.A0H = r15;
        this.A0B = r9;
        this.A06 = r4;
        this.A0L = r19;
    }

    public static /* synthetic */ void A00(C117915tl r7, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C119345ww r9, String str) {
        AnonymousClass5wR r5 = new AnonymousClass5wR(r9.A05, r9.A08, r9.A0E);
        r9.A0G.A00(new IDxTCallbackShape11S0400000_3_I1(r7, r9, pinBottomSheetDialogFragment, r5, 2), r7, str);
    }

    public void A01() {
        this.A0L.AdV(false);
        this.A0D.A08();
        if (!this.A02.isEmpty()) {
            this.A09.A05(this.A02);
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                this.A0B.A01(AnonymousClass000.A0m(it));
            }
        }
    }

    public void A02() {
        C14530pL r2 = this.A06;
        AnonymousClass5xE.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(R.string.str1031)).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r3.A09.A02().size() > 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r3 = this;
            X.69C r2 = r3.A0L
            X.0wT r0 = r3.A0D
            X.1lf r0 = r0.A02()
            if (r0 != 0) goto L_0x0017
            X.0w7 r0 = r3.A09
            java.util.List r0 = r0.A02()
            int r1 = r0.size()
            r0 = 0
            if (r1 <= 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r2.AdV(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119345ww.A03():void");
    }

    public final void A04() {
        FingerprintBottomSheet A092 = C110115dX.A09();
        C16440t3 r3 = this.A08;
        C118385ub r4 = new C118385ub(this.A05, r3, this.A0E, this.A0J, "AUTH");
        C118915vc r6 = this.A0K;
        C14530pL r1 = this.A06;
        A092.A05 = new C111575gb(r1, A092, r3, r4, new C1204761u(A092, this), r6);
        r1.Afc(A092);
    }

    public void A05(AnonymousClass2KI r7) {
        C35271le r2;
        AnonymousClass2KI r1 = r7;
        if (this.A03) {
            this.A0I.AKI(r1, C13680ns.A0Y(), C13680ns.A0X(), "payment_home", this.A01);
        }
        C35281lf r0 = r7.A03;
        this.A00 = r0;
        if (r0 != null && (r2 = r0.A00) != null && r2.A00.equals("WEBVIEW")) {
            if (((C35261ld) r2).A00) {
                if (Build.VERSION.SDK_INT >= 23) {
                    AnonymousClass5xG r12 = this.A0J;
                    if (r12.A05() && r12.A01() == 1) {
                        A04();
                        return;
                    }
                }
                PinBottomSheetDialogFragment A002 = C118605ux.A00();
                A002.A0C = new IDxPListenerShape115S0200000_3_I1(A002, 1, this);
                this.A06.Afc(A002);
                return;
            }
            A06((PinBottomSheetDialogFragment) null, (C28371Vv) null);
        }
    }

    public void A06(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C28371Vv r10) {
        new C118375ua(this.A06, this.A04, this.A07, this.A0C, this.A0E).A00(new AnonymousClass61N(pinBottomSheetDialogFragment, this), this.A00, r10);
    }

    public void A07(String str, String str2) {
        AnonymousClass2KI A012;
        A03();
        if (!TextUtils.isEmpty(str) && str.equals("STEP_UP")) {
            C13680ns.A0z(C110105dW.A06(this.A0D), "payment_step_up_update_ack", true);
            this.A01 = "push_notification";
            if (!(str2 == null || (A012 = this.A09.A01(str2)) == null)) {
                A012.A00 = false;
                if (this.A03) {
                    C1222969a r3 = this.A0I;
                    String str3 = this.A01;
                    r3.AKI(A012, 1, (Integer) null, str3, str3);
                }
            }
            this.A0B.A01(str2);
        }
        if (this.A03) {
            List A022 = this.A09.A02();
            if (!A022.isEmpty()) {
                AnonymousClass2KI r32 = null;
                if (A022.size() == 1) {
                    r32 = (AnonymousClass2KI) C13690nt.A0Z(A022);
                }
                this.A0I.AKI(r32, C13680ns.A0X(), (Integer) null, "payment_home", this.A01);
            }
        }
        this.A02 = AnonymousClass000.A0u();
    }
}
