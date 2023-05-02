package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;

/* renamed from: X.3Qz  reason: invalid class name and case insensitive filesystem */
public class C64613Qz extends AnonymousClass01X {
    public final AnonymousClass1PU A00;

    public C64613Qz(AnonymousClass1PU r1) {
        this.A00 = r1;
    }

    public int A0C() {
        throw AnonymousClass000.A0W("size");
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        C65033Sp r22 = (C65033Sp) r2;
        if (r22 instanceof C72813mk) {
            ((C72813mk) r22).A01.A00();
        }
        throw AnonymousClass000.A0W("get");
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        LayoutInflater A0G;
        int i3;
        if (i2 == 1) {
            A0G = C13680ns.A0G(viewGroup);
            i3 = R.layout.layout0521;
        } else if (i2 == 2) {
            return new C72813mk((Chip) C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout0520), this.A00.A00.A01.A1N());
        } else if (i2 == 3) {
            A0G = C13680ns.A0G(viewGroup);
            i3 = R.layout.layout0522;
        } else {
            throw AnonymousClass000.A0V(C13680ns.A0c(i2, "SearchHistoryItemAdapter/onCreateViewHolder unhandled view type: "));
        }
        return new C72803mj(C13680ns.A0H(A0G, viewGroup, i3));
    }

    public int getItemViewType(int i2) {
        throw AnonymousClass000.A0W("get");
    }
}
