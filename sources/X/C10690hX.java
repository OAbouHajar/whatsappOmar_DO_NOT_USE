package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.0hX  reason: invalid class name and case insensitive filesystem */
public class C10690hX implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float A02 = C004601z.A02((View) obj);
        float A022 = C004601z.A02((View) obj2);
        if (A02 <= A022) {
            return A02 < A022 ? 1 : 0;
        }
        return -1;
    }
}
