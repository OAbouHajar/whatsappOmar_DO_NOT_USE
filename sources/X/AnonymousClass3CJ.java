package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.facebook.redex.IDxLAdapterShape1S0101000_2_I1;
import com.facebook.redex.IDxUListenerShape11S0101000_2_I1;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* renamed from: X.3CJ  reason: invalid class name */
public final class AnonymousClass3CJ implements Handler.Callback {
    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            C15540rI r5 = (C15540rI) message.obj;
            C34341k6 r6 = r5.A05;
            if (r6.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = r6.getLayoutParams();
                if (layoutParams instanceof AnonymousClass0Bo) {
                    AnonymousClass0Bo r3 = (AnonymousClass0Bo) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    baseTransientBottomBar$Behavior.A00.A00 = r5.A07;
                    baseTransientBottomBar$Behavior.A04 = new C98934tD(r5);
                    r3.A01(baseTransientBottomBar$Behavior);
                    r3.A03 = 80;
                }
                r5.A03.addView(r6);
            }
            r6.A00 = new C15520rG(r5);
            if (C004601z.A0u(r6)) {
                List<AccessibilityServiceInfo> enabledAccessibilityServiceList = r5.A04.getEnabledAccessibilityServiceList(1);
                if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
                    r5.A02();
                    return true;
                }
                r5.A00();
                return true;
            }
            r6.A01 = new C98944tE(r5);
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            C15540rI r52 = (C15540rI) message.obj;
            int i3 = message.arg1;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList2 = r52.A04.getEnabledAccessibilityServiceList(1);
            if (enabledAccessibilityServiceList2 != null && enabledAccessibilityServiceList2.isEmpty()) {
                C34341k6 r1 = r52.A05;
                if (r1.getVisibility() == 0) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int[] iArr = new int[2];
                    iArr[0] = 0;
                    int height = r1.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = r1.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    iArr[1] = height;
                    valueAnimator.setIntValues(iArr);
                    valueAnimator.setInterpolator(C53572fv.A02);
                    valueAnimator.setDuration(250);
                    valueAnimator.addListener(new IDxLAdapterShape1S0101000_2_I1(r52, i3, 0));
                    valueAnimator.addUpdateListener(new IDxUListenerShape11S0101000_2_I1(r52));
                    valueAnimator.start();
                    return true;
                }
            }
            r52.A01();
            return true;
        }
    }
}
