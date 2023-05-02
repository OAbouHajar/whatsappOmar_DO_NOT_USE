package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.facebook.redex.IDxAnchorShape40S0000000_I1;
import com.facebook.redex.IDxDCompatShape21S0100000_I1;
import com.obwhatsapp.R;

/* renamed from: X.0A2  reason: invalid class name */
public final class AnonymousClass0A2 extends Dialog {
    public static final C12700kp A0H = new IDxAnchorShape40S0000000_I1(1);
    public static final C12700kp A0I = new IDxAnchorShape40S0000000_I1(2);
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public int A02 = -16777216;
    public Context A03;
    public View A04;
    public FrameLayout A05;
    public AnonymousClass0OT A06;
    public C12700kp A07 = new C08650dz(this);
    public C12700kp A08 = A0I;
    public C02410Bu A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A0C = true;
    public boolean A0D = false;
    public boolean A0E = true;
    public final Handler A0F = AnonymousClass000.A0L();
    public final AnonymousClass0QC A0G = new AnonymousClass0QC(this);

    public AnonymousClass0A2(Context context) {
        super(context, R.style.style00de);
        Context context2 = getContext();
        this.A03 = context2;
        C02410Bu r4 = new C02410Bu(context2);
        this.A09 = r4;
        r4.A04 = this.A0G;
        r4.A00 = -1;
        r4.A03(new C12700kp[]{A0H, this.A08, this.A07}, true);
        C02410Bu r2 = this.A09;
        r2.A05 = new C04570Nb(this);
        if (Build.VERSION.SDK_INT >= 19) {
            r2.setFitsSystemWindows(true);
        }
        this.A09.A07.A02();
        FrameLayout frameLayout = new FrameLayout(this.A03);
        this.A05 = frameLayout;
        frameLayout.addView(this.A09);
        super.setContentView(this.A05);
        C004601z.A0j(this.A09, new IDxDCompatShape21S0100000_I1(this, 1));
    }

    public void A00() {
        InputMethodManager inputMethodManager;
        View currentFocus = getCurrentFocus();
        if (!(currentFocus == null || (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) == null)) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        super.dismiss();
    }

    public final void A01() {
        InputMethodManager inputMethodManager;
        Window window = getWindow();
        C02410Bu r2 = this.A09;
        if (!r2.hasWindowFocus()) {
            A00();
        }
        if (window != null) {
            window.setFlags(8, 8);
        }
        this.A0D = true;
        if (!this.A0A && this.A01 != 0.0f) {
            this.A01 = 0.0f;
            A02(this.A00);
        }
        r2.A07.A02();
        r2.A02(A0H, -1);
        r2.setInteractable(false);
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(float r6) {
        /*
            r5 = this;
            float r4 = r5.A01
            float r4 = r4 * r6
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x0039
            android.view.View r3 = r0.getDecorView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            if (r0 == 0) goto L_0x0017
            r3 = r0
        L_0x0017:
            int r2 = r5.A02
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            float r0 = java.lang.Math.max(r0, r4)
            float r1 = java.lang.Math.min(r1, r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = X.AnonymousClass090.A06(r2, r0)
            android.graphics.drawable.Drawable r1 = r3.getBackground()
            boolean r0 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x003a
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
        L_0x0036:
            r1.setColor(r2)
        L_0x0039:
            return
        L_0x003a:
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>()
            r3.setBackground(r1)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A2.A02(float):void");
    }

    public void A03(AnonymousClass0JL r4) {
        AnonymousClass0OT r0 = this.A06;
        if (r0 != null) {
            AnonymousClass0SF r2 = r0.A01;
            Context context = r0.A00;
            if (r4 == AnonymousClass0JL.BACK_BUTTON) {
                r2.A03(context);
                return;
            }
        }
        super.cancel();
    }

    public void cancel() {
        A03(AnonymousClass0JL.OTHER);
    }

    public void dismiss() {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0F;
        if (myLooper == handler.getLooper()) {
            A01();
        } else {
            handler.post(new C09650fr(this));
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public void onBackPressed() {
        if (this.A0B) {
            A03(AnonymousClass0JL.BACK_BUTTON);
        }
    }

    public void setCancelable(boolean z2) {
        super.setCancelable(z2);
        this.A0B = z2;
    }

    public void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        this.A0C = z2;
    }

    public void setContentView(int i2) {
        setContentView(LayoutInflater.from(getContext()).inflate(i2, this.A09, false), (ViewGroup.LayoutParams) null);
    }

    public void setContentView(View view) {
        setContentView(view, (ViewGroup.LayoutParams) null);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        View view2 = this.A04;
        if (view2 != null) {
            this.A09.removeView(view2);
        }
        this.A04 = view;
        C02410Bu r0 = this.A09;
        if (layoutParams == null) {
            r0.addView(view);
        } else {
            r0.addView(view, layoutParams);
        }
    }

    public void show() {
        C12700kp r0;
        AccessibilityManager accessibilityManager;
        this.A0D = false;
        C02410Bu r3 = this.A09;
        r3.A07.A02();
        r3.A0C = true;
        super.show();
        Context context = this.A03;
        if ((!Boolean.getBoolean("is_accessibility_enabled") && (context == null || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null || !accessibilityManager.isTouchExplorationEnabled())) || (r0 = this.A07) == null) {
            r0 = this.A08;
        }
        r3.A02(r0, -1);
    }
}
