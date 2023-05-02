package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3TF  reason: invalid class name */
public abstract class AnonymousClass3TF extends AnonymousClass012 {
    public final Context A00;
    public final Resources A01;

    public AnonymousClass3TF(Context context, Resources resources) {
        this.A00 = context;
        this.A01 = resources;
    }

    public Object A05(ViewGroup viewGroup, int i2) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        Pair A0F = A0F(i2);
        C605834i r0 = new C605834i(this.A00, this.A01, (String) A0F.first, (String) A0F.second);
        r0.setLayoutParams(layoutParams);
        viewGroup.addView(r0);
        A0G(r0, i2);
        return r0;
    }

    public void A0D(ViewGroup viewGroup, Object obj, int i2) {
        viewGroup.removeView((View) obj);
    }

    public abstract Pair A0F(int i2);

    public abstract void A0G(C605834i r1, int i2);
}
