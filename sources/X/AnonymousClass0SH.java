package X;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import com.facebook.redex.IDxUListenerShape87S0200000_I1;
import java.lang.ref.WeakReference;

/* renamed from: X.0SH  reason: invalid class name */
public final class AnonymousClass0SH {
    public final WeakReference A00;

    public AnonymousClass0SH(View view) {
        this.A00 = new WeakReference(view);
    }

    public static View A00(AnonymousClass0SH r0) {
        return (View) r0.A00.get();
    }

    public void A01() {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().cancel();
        }
    }

    public void A02() {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().start();
        }
    }

    public void A03(float f2) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().alpha(f2);
        }
    }

    public void A04(float f2) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().scaleX(f2);
        }
    }

    public void A05(float f2) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().scaleY(f2);
        }
    }

    public void A06(float f2) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().translationX(f2);
        }
    }

    public void A07(float f2) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().translationY(f2);
        }
    }

    public void A08(long j2) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().setDuration(j2);
        }
    }

    public void A09(Interpolator interpolator) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().setInterpolator(interpolator);
        }
    }

    public void A0A(C13190lc r4) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().setListener(r4 != null ? new C021009s(A002, this, r4) : null);
        }
    }

    public void A0B(C11870jT r4) {
        View A002 = A00(this);
        if (A002 != null && Build.VERSION.SDK_INT >= 19) {
            IDxUListenerShape87S0200000_I1 iDxUListenerShape87S0200000_I1 = null;
            if (r4 != null) {
                iDxUListenerShape87S0200000_I1 = new IDxUListenerShape87S0200000_I1(A002, 0, r4);
            }
            C04190Ln.A00(iDxUListenerShape87S0200000_I1, A002.animate());
        }
    }
}
