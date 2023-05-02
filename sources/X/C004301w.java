package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.01w  reason: invalid class name and case insensitive filesystem */
public abstract class C004301w {
    public static int A00 = -100;
    public static final C003001i A01 = new C003001i(0);
    public static final Object A02 = new Object();

    public static void A00(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (A00 != i2) {
            A00 = i2;
            synchronized (A02) {
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    C004301w r1 = (C004301w) ((WeakReference) it.next()).get();
                    if (r1 != null) {
                        ((AnonymousClass06G) r1).A0V(true);
                    }
                }
            }
        }
    }

    public static void A01(C004301w r3) {
        synchronized (A02) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                C004301w r0 = (C004301w) ((WeakReference) it.next()).get();
                if (r0 == r3 || r0 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract Context A03(Context context);

    public abstract View A04(View view, String str, Context context, AttributeSet attributeSet);

    public abstract AnonymousClass05J A05(C009804r r1);

    public abstract void A06();

    public abstract void A07();

    public abstract void A08();

    public abstract void A09();

    public abstract void A0A(int i2);

    public abstract void A0B(int i2);

    public abstract void A0C(Configuration configuration);

    public abstract void A0D(Bundle bundle);

    public abstract void A0E(View view);

    public abstract void A0F(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0G(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0H(CharSequence charSequence);
}
