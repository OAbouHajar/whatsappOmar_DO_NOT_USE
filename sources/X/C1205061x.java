package X;

import android.view.View;
import com.facebook.redex.IDxKCallbackShape1S1300000_3_I1;
import com.facebook.redex.IDxTCallbackShape11S0400000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

/* renamed from: X.61x  reason: invalid class name and case insensitive filesystem */
public class C1205061x implements AnonymousClass698 {
    public final /* synthetic */ C14530pL A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;
    public final /* synthetic */ AnonymousClass5xF A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C1205061x(C14530pL r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, AnonymousClass5xF r3, boolean z2, boolean z3) {
        this.A02 = r3;
        this.A01 = pinBottomSheetDialogFragment;
        this.A00 = r1;
        this.A03 = z2;
        this.A04 = z3;
    }

    public void AOu(String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1O();
        } else {
            C14530pL r3 = this.A00;
            if (r3 instanceof BrazilAccountRecoveryPinActivity) {
                r3.Afq(R.string.str0083);
                r3.AhY(r3.getResources().getString(R.string.str0082));
            }
        }
        AnonymousClass5xF r0 = this.A02;
        C16440t3 r7 = r0.A03;
        C14870pt r5 = r0.A00;
        C16040sK r6 = r0.A01;
        C118365uZ r10 = r0.A0C;
        C117535t9 r4 = new C117535t9(r5, r6, r7, r0.A06, r0.A08, r10, r0.A0E);
        C14530pL r62 = this.A00;
        C1222969a r32 = r0.A0F;
        AnonymousClass5u7 r12 = new AnonymousClass5u7(this, str);
        C53842gO A7M = r32.A7M();
        A7M.A08 = C13680ns.A0a();
        A7M.A0a = "api_event";
        A7M.A0B = 26;
        r32.AKR(A7M);
        C119285wq r102 = r4.A04;
        AnonymousClass50C A0R = C110115dX.A0R(r102, "FB", "PIN");
        if (A0R != null) {
            C117915tl r11 = new C117915tl(A0R);
            r4.A03.A00(new IDxTCallbackShape11S0400000_3_I1(r62, r4, r11, r12, 0), r11, str);
            return;
        }
        new C118435ug(r62, r4.A00, r4.A01, r4.A02, r102, "PIN").A00(new IDxKCallbackShape1S1300000_3_I1(0, str, r62, r4, r12), "FB");
    }

    public void ARW(View view) {
    }
}
