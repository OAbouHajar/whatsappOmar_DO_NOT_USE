package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: X.08c  reason: invalid class name and case insensitive filesystem */
public class C017208c extends C017308d {
    public final WeakReference A00;

    public C017208c(Context context, Resources resources) {
        super(resources);
        this.A00 = new WeakReference(context);
    }

    public Drawable getDrawable(int i2) {
        Drawable drawable = this.A00.getDrawable(i2);
        Context context = (Context) this.A00.get();
        if (!(drawable == null || context == null)) {
            AnonymousClass06L.A02().A0A(context, drawable, i2);
        }
        return drawable;
    }
}
