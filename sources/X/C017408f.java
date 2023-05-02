package X;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.08f  reason: invalid class name and case insensitive filesystem */
public class C017408f extends C017508g {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass08R A02;
    public final /* synthetic */ WeakReference A03;

    public C017408f(AnonymousClass08R r1, WeakReference weakReference, int i2, int i3) {
        this.A02 = r1;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = weakReference;
    }

    public void A01(int i2) {
    }

    public void A02(Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.A00) != -1) {
            boolean z2 = false;
            if ((this.A01 & 2) != 0) {
                z2 = true;
            }
            typeface = Typeface.create(typeface, i2, z2);
        }
        AnonymousClass08R r3 = this.A02;
        WeakReference weakReference = this.A03;
        if (r3.A0A) {
            r3.A02 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean A0t = C004601z.A0t(textView);
                int i3 = r3.A01;
                if (A0t) {
                    textView.post(new C018008l(typeface, textView, r3, i3));
                }
            }
        }
    }
}
