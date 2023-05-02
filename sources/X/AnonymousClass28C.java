package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPicker;

/* renamed from: X.28C  reason: invalid class name */
public final class AnonymousClass28C extends AnonymousClass01X {
    public final /* synthetic */ AnonymousClass1V8 A00;

    public AnonymousClass28C(AnonymousClass1V8 r1) {
        this.A00 = r1;
    }

    public int A0C() {
        return this.A00.A0g.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r8, int i2) {
        AnonymousClass3SH r82 = (AnonymousClass3SH) r8;
        AnonymousClass1V8 r5 = this.A00;
        C16010sH r6 = (C16010sH) r5.A0g.get(i2);
        r82.A01.setText(r5.A0L.A0C(r6));
        AnonymousClass2Ao r1 = r5.A0M;
        if (r1 != null) {
            r1.A08(r82.A02, r6, false);
        }
        View view = r82.A00;
        view.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 21, r6));
        view.setContentDescription(r5.getString(R.string.str14d8, new Object[]{r5.A0L.A08(r6)}));
        AnonymousClass2JP.A03(view, R.string.str001a);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        AnonymousClass1V8 r0 = this.A00;
        return new AnonymousClass3SH(r0.getLayoutInflater().inflate(r0 instanceof GroupCallParticipantPicker ? R.layout.layout053d : R.layout.layout053c, viewGroup, false));
    }
}
