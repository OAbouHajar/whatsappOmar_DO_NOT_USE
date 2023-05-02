package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.4vG  reason: invalid class name and case insensitive filesystem */
public class C100204vG implements AnonymousClass5TC {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final Drawable A03;
    public final C109485Sh A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;

    public C100204vG(Drawable drawable, Drawable drawable2, ImageView imageView, C109485Sh r5, String str, String str2, int i2, int i3) {
        this.A07 = imageView != null ? C13690nt.A0h(imageView) : null;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = r5;
    }

    public boolean A8u() {
        return false;
    }

    public ImageView ACj() {
        WeakReference weakReference = this.A07;
        if (weakReference != null) {
            return (ImageView) weakReference.get();
        }
        return null;
    }

    public int ADO() {
        return this.A00;
    }

    public int ADQ() {
        return this.A01;
    }

    public Integer AE5() {
        return null;
    }

    public String AGp() {
        return this.A06;
    }

    public String getId() {
        return this.A05;
    }
}
