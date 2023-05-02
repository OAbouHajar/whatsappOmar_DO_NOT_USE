package X;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: X.0ha  reason: invalid class name and case insensitive filesystem */
public class C10720ha implements Comparator {
    public final Rect A00 = AnonymousClass000.A0J();
    public final Rect A01 = AnonymousClass000.A0J();
    public final C11880jU A02;
    public final boolean A03;

    public C10720ha(C11880jU r2, boolean z2) {
        this.A03 = z2;
        this.A02 = r2;
    }

    public int compare(Object obj, Object obj2) {
        Rect rect = this.A00;
        Rect rect2 = this.A01;
        ((AnonymousClass031) obj).A01.getBoundsInParent(rect);
        ((AnonymousClass031) obj2).A01.getBoundsInParent(rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 >= i3) {
            if (i2 <= i3) {
                int i4 = rect.left;
                int i5 = rect2.left;
                if (i4 >= i5) {
                    if (i4 <= i5) {
                        int i6 = rect.bottom;
                        int i7 = rect2.bottom;
                        if (i6 >= i7) {
                            if (i6 <= i7) {
                                int i8 = rect.right;
                                int i9 = rect2.right;
                                if (i8 >= i9) {
                                    if (i8 <= i9) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                    return this.A03 ? -1 : 1;
                }
                if (this.A03) {
                    return 1;
                }
            }
            return 1;
        }
        return -1;
    }
}
