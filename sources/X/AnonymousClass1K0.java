package X;

import com.obwhatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import com.obwhatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.List;

/* renamed from: X.1K0  reason: invalid class name */
public final class AnonymousClass1K0 {
    public final C17850vk A00;
    public final C20180zd A01;

    public AnonymousClass1K0(C17850vk r2, C20180zd r3) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final BkFcsPreloadingScreenFragment A00(AnonymousClass02C r4) {
        List<AnonymousClass01A> A02 = r4.A0U.A02();
        C18450wi.A0B(A02);
        for (AnonymousClass01A r1 : A02) {
            if (r1 instanceof BkFcsPreloadingScreenFragment) {
                return (BkFcsPreloadingScreenFragment) r1;
            }
            if (r1 instanceof FdsContentFragmentManager) {
                return A00(r1.A0F());
            }
        }
        return null;
    }
}
