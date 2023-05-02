package X;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0UJ  reason: invalid class name */
public final class AnonymousClass0UJ {
    public static final C05370Qr A00(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C18450wi.A0B(displayFeatures);
        ArrayList A0u = AnonymousClass000.A0u();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                AnonymousClass0UJ r0 = new AnonymousClass0UJ();
                C18450wi.A09(foldingFeature);
                C13510mV A01 = r0.A01(activity, foldingFeature);
                if (A01 != null) {
                    A0u.add(A01);
                }
            }
        }
        return new C05370Qr(A0u);
    }

    public final C13510mV A01(Activity activity, FoldingFeature foldingFeature) {
        AnonymousClass0UQ r3;
        AnonymousClass0UP r2;
        C18450wi.A0H(foldingFeature, 1);
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                r3 = AnonymousClass0UQ.A02;
            }
            return null;
        }
        r3 = AnonymousClass0UQ.A01;
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                r2 = AnonymousClass0UP.A02;
            }
            return null;
        }
        r2 = AnonymousClass0UP.A01;
        Rect bounds = foldingFeature.getBounds();
        C18450wi.A0B(bounds);
        AnonymousClass0RQ r8 = new AnonymousClass0RQ(bounds);
        AnonymousClass0RQ r0 = C08000cq.A00.A05(activity).A00;
        Rect rect = new Rect(r0.A01, r0.A03, r0.A02, r0.A00);
        int i2 = r8.A00 - r8.A03;
        if (!(i2 == 0 && r8.A02 - r8.A01 == 0)) {
            int i3 = r8.A02 - r8.A01;
            if (i3 != rect.width() && i2 != rect.height()) {
                return null;
            }
            if (i3 < rect.width() && i2 < rect.height()) {
                return null;
            }
            if (i3 == rect.width() && i2 == rect.height()) {
                return null;
            }
            Rect bounds2 = foldingFeature.getBounds();
            C18450wi.A0B(bounds2);
            return new C07950cl(new AnonymousClass0RQ(bounds2), r2, r3);
        }
        return null;
    }
}
