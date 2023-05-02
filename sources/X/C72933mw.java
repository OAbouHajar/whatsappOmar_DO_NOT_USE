package X;

import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.3mw  reason: invalid class name and case insensitive filesystem */
public class C72933mw extends C59882zE {
    public final TextView A00;

    public C72933mw(View view, C23651Cv r3, AnonymousClass4DV r4, CallGridViewModel callGridViewModel, C17160ud r6, C16080sP r7) {
        super(view, r3, r4, callGridViewModel, r6, r7);
        this.A02 = 0;
        this.A00 = C13680ns.A0L(view, R.id.audio_call_status);
    }

    public void A09(int i2) {
    }

    public void A0G(C37921px r1) {
        A0M(r1);
        super.A0G(r1);
    }

    public void A0I(int i2) {
    }

    public void A0M(C37921px r4) {
        AnonymousClass2Wj r1 = r4.A06;
        if (r1 != null) {
            TextView textView = this.A00;
            String A002 = r1.A00(textView.getContext());
            textView.setVisibility(0);
            textView.setText(A002);
            return;
        }
        this.A00.setVisibility(8);
    }
}
