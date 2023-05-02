package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* renamed from: X.3Kn  reason: invalid class name and case insensitive filesystem */
public final class C63593Kn extends ContextWrapper {
    public final Resources A00;

    public C63593Kn(Context context, Resources resources) {
        super(context);
        this.A00 = resources;
    }

    public Resources getResources() {
        return this.A00;
    }
}
