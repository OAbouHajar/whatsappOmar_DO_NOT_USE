package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

/* renamed from: X.4w1  reason: invalid class name and case insensitive filesystem */
public final class C100674w1 implements C108595Op {
    public final WaTextView A00;

    public C100674w1(View view) {
        WaTextView waTextView = (WaTextView) view.findViewById(R.id.title);
        this.A00 = waTextView;
        AnonymousClass2JP.A05(view, true);
        AnonymousClass1UP.A06(waTextView);
    }

    public void ANe(C450226r r6) {
        WaTextView waTextView = this.A00;
        Context context = waTextView.getContext();
        int i2 = ((C450426t) r6).A00;
        int i3 = R.string.str0231;
        if (i2 != 0) {
            i3 = R.string.str0230;
            if (i2 != 1) {
                i3 = R.string.str0237;
            }
        }
        C13690nt.A0s(context, waTextView, i3);
    }
}
