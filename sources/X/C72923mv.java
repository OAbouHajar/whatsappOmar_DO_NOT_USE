package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.3mv  reason: invalid class name and case insensitive filesystem */
public class C72923mv extends C72933mw {
    public final TextView A00;
    public final AnonymousClass023 A01 = new IDxObserverShape116S0100000_2_I1(this, 43);
    public final AnonymousClass013 A02;

    public C72923mv(View view, C23651Cv r4, AnonymousClass4DV r5, CallGridViewModel callGridViewModel, C17160ud r7, C16080sP r8, AnonymousClass013 r9) {
        super(view, r4, r5, callGridViewModel, r7, r8);
        this.A02 = r9;
        this.A00 = C13680ns.A0L(view, R.id.audio_call_duration);
    }

    public void A08() {
        this.A06 = null;
        CallGridViewModel callGridViewModel = this.A05;
        if (callGridViewModel != null) {
            callGridViewModel.A05.A08(this.A01);
        }
    }

    public void A0G(C37921px r3) {
        CallGridViewModel callGridViewModel = this.A05;
        if (callGridViewModel != null) {
            callGridViewModel.A05.A07(this.A01);
        }
        A0J(r3);
        A0M(r3);
        this.A00.setVisibility(C13680ns.A02(r3.A0M ? 1 : 0));
        A0L(r3, false);
        this.A06 = r3;
    }
}
