package X;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* renamed from: X.0LL  reason: invalid class name */
public class AnonymousClass0LL {
    public static View A00(Dialog dialog, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) AnonymousClass0LK.A00(dialog, i2);
        }
        View findViewById = dialog.findViewById(i2);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass000.A0T("ID does not reference a View inside this Dialog");
    }
}
