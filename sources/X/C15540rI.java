package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.facebook.redex.IDxIListenerShape217S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape10S0101000_2_I0;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0rI  reason: invalid class name and case insensitive filesystem */
public abstract class C15540rI {
    public static final Handler A08 = new Handler(Looper.getMainLooper(), new AnonymousClass3CJ());
    public static final boolean A09;
    public static final int[] A0A = {R.attr.attr04a4};
    public int A00;
    public List A01;
    public final Context A02;
    public final ViewGroup A03;
    public final AccessibilityManager A04;
    public final C34341k6 A05;
    public final C53792gI A06;
    public final AnonymousClass5MJ A07 = new C98954tF(this);

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT <= 19) {
            z2 = true;
        }
        A09 = z2;
    }

    public C15540rI(View view, ViewGroup viewGroup, C53792gI r9) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (r9 != null) {
            this.A03 = viewGroup;
            this.A06 = r9;
            Context context = viewGroup.getContext();
            this.A02 = context;
            C53382fc.A03(context, "Theme.AppCompat", C53382fc.A00);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = this.A02.obtainStyledAttributes(A0A);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            C34341k6 r1 = (C34341k6) from.inflate(resourceId != -1 ? R.layout.layout03ee : R.layout.layout0219, viewGroup, false);
            this.A05 = r1;
            r1.addView(view);
            C004601z.A0c(r1, 1);
            C004601z.A0d(r1, 1);
            r1.setFitsSystemWindows(true);
            C004601z.A0k(r1, new IDxIListenerShape217S0100000_2_I0(this, 0));
            C004601z.A0j(r1, new IDxDCompatShape22S0100000_2_I0(this, 0));
            this.A04 = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public void A00() {
        C34341k6 r2 = this.A05;
        int height = r2.getHeight();
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        if (A09) {
            C004601z.A0b(r2, height);
        } else {
            r2.setTranslationY((float) height);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{height, 0});
        valueAnimator.setInterpolator(C53572fv.A02);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 1));
        valueAnimator.addUpdateListener(new IDxUListenerShape10S0101000_2_I0(this, height, 0));
        valueAnimator.start();
    }

    public void A01() {
        C89414c8 A002 = C89414c8.A00();
        AnonymousClass5MJ r0 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r0)) {
                A002.A00 = null;
                if (A002.A01 != null) {
                    A002.A01();
                }
            }
        }
        List list = this.A01;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((AnonymousClass4PN) this.A01.get(size)).A00();
            }
        }
        C34341k6 r2 = this.A05;
        ViewParent parent = r2.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(r2);
        }
    }

    public void A02() {
        C89414c8 A002 = C89414c8.A00();
        AnonymousClass5MJ r0 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r0)) {
                A002.A04(A002.A00);
            }
        }
        List list = this.A01;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    this.A01.get(size);
                } else {
                    return;
                }
            }
        }
    }

    public void A03() {
        C89414c8 A002 = C89414c8.A00();
        C32291fz r1 = (C32291fz) this;
        int i2 = (!r1.A00 || !r1.A01.isTouchExplorationEnabled()) ? r1.A00 : -2;
        AnonymousClass5MJ r3 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r3)) {
                C84234Jt r12 = A002.A00;
                r12.A00 = i2;
                A002.A02.removeCallbacksAndMessages(r12);
                A002.A04(A002.A00);
            } else {
                C84234Jt r13 = A002.A01;
                if (r13 == null || r3 == null || r13.A02.get() != r3) {
                    A002.A01 = new C84234Jt(r3, i2);
                } else {
                    r13.A00 = i2;
                }
                C84234Jt r14 = A002.A00;
                if (r14 == null || !A002.A06(r14, 4)) {
                    A002.A00 = null;
                    A002.A01();
                }
            }
        }
    }

    public void A04(int i2) {
        C89414c8 A002 = C89414c8.A00();
        AnonymousClass5MJ r3 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r3)) {
                A002.A06(A002.A00, i2);
            } else {
                C84234Jt r1 = A002.A01;
                if (!(r1 == null || r3 == null || r1.A02.get() != r3)) {
                    A002.A06(r1, i2);
                }
            }
        }
    }

    public void A05(AnonymousClass4PN r2) {
        if (r2 != null) {
            List list = this.A01;
            if (list == null) {
                list = new ArrayList();
                this.A01 = list;
            }
            list.add(r2);
        }
    }

    public boolean A06() {
        boolean A052;
        C89414c8 A002 = C89414c8.A00();
        AnonymousClass5MJ r0 = this.A07;
        synchronized (A002.A03) {
            A052 = A002.A05(r0);
        }
        return A052;
    }
}
