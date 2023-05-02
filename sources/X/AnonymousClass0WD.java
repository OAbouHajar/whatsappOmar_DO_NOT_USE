package X;

import android.content.Context;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import com.facebook.redex.IDxEListenerShape97S0200000_I1;
import com.facebook.redex.IDxLListenerShape143S0100000_I1;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.0WD  reason: invalid class name */
public class AnonymousClass0WD {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Interpolator A03;
    public final Interpolator A04;
    public final C03570Ja A05;
    public final C12720kr A06;
    public final C12730ks A07;
    public final C14990q7 A08;
    public final AnonymousClass2Wa A09;
    public final String A0A;
    public final boolean A0B;

    public AnonymousClass0WD(Interpolator interpolator, Interpolator interpolator2, C03570Ja r3, C12720kr r4, C12730ks r5, C14990q7 r6, AnonymousClass2Wa r7, String str, int i2, int i3, int i4, boolean z2) {
        this.A08 = r6;
        this.A09 = r7;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A04 = interpolator;
        this.A03 = interpolator2;
        this.A07 = r5;
        this.A06 = r4;
        this.A0A = str;
        this.A0B = z2;
        this.A05 = r3;
    }

    public /* synthetic */ AnonymousClass0WD(Interpolator interpolator, Interpolator interpolator2, AnonymousClass0e2 r16, C03570Ja r17, C12720kr r18, C12730ks r19, C14990q7 r20, AnonymousClass2Wa r21, String str, int i2, int i3, int i4, boolean z2) {
        this(interpolator, interpolator2, r17, r18, r19, r20, r21, str, i2, i3, i4, z2);
    }

    public final AnonymousClass0CB A01() {
        C14990q7 r4 = this.A08;
        AnonymousClass0CB r2 = new AnonymousClass0CB(r4.A00(), this.A05, this.A0B);
        r2.setBloksContentViewFromParseResult(r4, this.A09);
        r2.A00 = this.A00;
        r2.A02 = this.A02;
        r2.A01 = this.A01;
        r2.A04 = this.A04;
        r2.A03 = this.A03;
        r2.A07 = new AnonymousClass0e2(this);
        r2.A06 = new IDxEListenerShape97S0200000_I1(r2, 0, this);
        r2.setTag(R.id.foa_toast_tag_server_id, this.A0A);
        return r2;
    }

    public void A02() {
        int i2;
        Context A002 = this.A08.A00();
        AnonymousClass0CB A012 = A01();
        boolean z2 = this.A0B;
        C03570Ja r4 = this.A05;
        AnonymousClass0CB r1 = (AnonymousClass0CB) AnonymousClass0TP.A00.get();
        if (r1 != null) {
            r1.A01(r1.A01);
        }
        int i3 = -1;
        if (z2) {
            i3 = -2;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i3, -2, 99, 8, -3);
        if (z2) {
            i2 = 17;
        } else {
            i2 = 80;
            if (r4.equals(C03570Ja.TOP)) {
                i2 = 48;
            }
        }
        layoutParams.gravity = i2;
        try {
            WindowManager windowManager = (WindowManager) A002.getSystemService("window");
            if (windowManager != null) {
                windowManager.addView(A012, layoutParams);
                AnonymousClass0TP.A00 = new WeakReference(A012);
                A012.setAlpha(0.0f);
                A012.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape143S0100000_I1(A012, 4));
                return;
            }
            throw AnonymousClass000.A0V("Window manager required but not found.");
        } catch (WindowManager.BadTokenException unused) {
        }
    }
}
