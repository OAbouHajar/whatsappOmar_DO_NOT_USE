package X;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* renamed from: X.0Xg  reason: invalid class name and case insensitive filesystem */
public class C06680Xg implements DialogInterface.OnClickListener {
    public final WeakReference A00;

    public C06680Xg(AnonymousClass0F6 r2) {
        this.A00 = new WeakReference(r2);
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass0F6) weakReference.get()).A08(true);
        }
    }
}
