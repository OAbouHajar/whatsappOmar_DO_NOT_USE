package X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import java.util.ArrayList;

/* renamed from: X.4QH  reason: invalid class name */
public abstract class AnonymousClass4QH {
    public AnonymousClass2OF A00;

    public void A00(AnonymousClass2OF r7, AnonymousClass2XQ r8, ArrayList arrayList) {
        if (this instanceof C76433tu) {
            C76433tu r1 = (C76433tu) this;
            r1.A00 = r7;
            String str = ((AnonymousClass2OG) r7).A00;
            if (TextUtils.isEmpty(str)) {
                r1.A00.setText(R.string.str14a9);
            } else {
                r1.A00.setText(r1.A01.getString(R.string.str14a8, AnonymousClass000.A1a(str)));
            }
        } else {
            C76423tt r12 = (C76423tt) this;
            r12.A00 = r7;
            if (r7 instanceof AnonymousClass2OI) {
                int i2 = ((AnonymousClass2OI) r7).A00;
                WaTextView waTextView = r12.A00;
                Resources resources = r12.A01.getResources();
                Object[] A1b = C13680ns.A1b();
                AnonymousClass000.A1M(A1b, i2, 0);
                waTextView.setText(resources.getQuantityString(R.plurals.plurals0182, i2, A1b));
            } else if (r7 instanceof AnonymousClass2OH) {
                C13690nt.A0s(r12.A01, r12.A00, R.string.str0f2f);
            }
        }
    }
}
