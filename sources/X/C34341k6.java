package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import java.util.List;

/* renamed from: X.1k6  reason: invalid class name and case insensitive filesystem */
public class C34341k6 extends FrameLayout {
    public C15530rH A00;
    public AnonymousClass5MI A01;
    public final AccessibilityManager A02;
    public final C12400kK A03;

    public C34341k6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53362fa.A0D);
        if (obtainStyledAttributes.hasValue(1)) {
            C004601z.A0X(this, (float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
        }
        obtainStyledAttributes.recycle();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.A02 = accessibilityManager;
        C95054lu r2 = new C95054lu(this);
        this.A03 = r2;
        if (Build.VERSION.SDK_INT >= 19) {
            C05680Sn.A00(accessibilityManager, r2);
        }
        setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
    }

    /* access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z2) {
        setClickable(!z2);
        setFocusable(z2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C004601z.A0T(this);
    }

    public void onDetachedFromWindow() {
        boolean z2;
        super.onDetachedFromWindow();
        C15530rH r4 = this.A00;
        if (r4 != null) {
            C15520rG r42 = (C15520rG) r4;
            C15540rI r0 = r42.A00;
            C89414c8 A002 = C89414c8.A00();
            AnonymousClass5MJ r2 = r0.A07;
            synchronized (A002.A03) {
                if (!A002.A05(r2)) {
                    C84234Jt r02 = A002.A01;
                    if (r02 == null || r2 == null || r02.A02.get() != r2) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (z2) {
                C15540rI.A08.post(new RunnableRunnableShape1S0100000_I0((Object) r42, 17));
            }
        }
        AccessibilityManager accessibilityManager = this.A02;
        C12400kK r22 = this.A03;
        if (Build.VERSION.SDK_INT >= 19) {
            C05680Sn.A01(accessibilityManager, r22);
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        AnonymousClass5MI r0 = this.A01;
        if (r0 != null) {
            C15540rI r2 = ((C98944tE) r0).A00;
            r2.A05.A01 = null;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = r2.A04.getEnabledAccessibilityServiceList(1);
            if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
                r2.A02();
            } else {
                r2.A00();
            }
        }
    }

    public void setOnAttachStateChangeListener(C15530rH r1) {
        this.A00 = r1;
    }

    public void setOnLayoutChangeListener(AnonymousClass5MI r1) {
        this.A01 = r1;
    }
}
