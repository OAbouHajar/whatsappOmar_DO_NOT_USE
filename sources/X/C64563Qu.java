package X;

import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.3Qu  reason: invalid class name and case insensitive filesystem */
public final class C64563Qu extends AnonymousClass01X {
    public final List A00;

    public C64563Qu(List list) {
        this.A00 = list;
    }

    public int A0C() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r1, int i2) {
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        View inflate = C13680ns.A0G(viewGroup).inflate(R.layout.layout03fb, viewGroup, false);
        C18450wi.A0B(inflate);
        return new AnonymousClass3RY(inflate);
    }
}
