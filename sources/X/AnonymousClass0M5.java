package X;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;

/* renamed from: X.0M5  reason: invalid class name */
public final class AnonymousClass0M5 {
    public static final Cursor A00(AnonymousClass0SM r3, C13040lN r4, boolean z2) {
        r3.A08();
        r3.A09();
        Cursor AbE = AnonymousClass0AP.A00(r3).AbE(r4);
        if (!z2 || !(AbE instanceof AbstractWindowedCursor)) {
            return AbE;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) AbE;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? AnonymousClass0WY.A03(AbE) : AbE;
    }
}
