package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.084  reason: invalid class name */
public class AnonymousClass084 implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C02400Bm r1 = (C02400Bm) ((View) obj).getLayoutParams();
        C02400Bm r3 = (C02400Bm) ((View) obj2).getLayoutParams();
        boolean z2 = r1.A04;
        return z2 != r3.A04 ? z2 ? 1 : -1 : r1.A03 - r3.A03;
    }
}
