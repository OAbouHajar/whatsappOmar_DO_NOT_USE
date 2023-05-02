package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.facebook.redex.IDxVPropertyShape2S0000000_I0;
import com.obwhatsapp.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.088  reason: invalid class name */
public final class AnonymousClass088 extends View.AccessibilityDelegate {
    public final AnonymousClass05M A00;

    public AnonymousClass088(AnonymousClass05M r1) {
        this.A00 = r1;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C06200Ur A05 = this.A00.A05(view);
        if (A05 != null) {
            return (AccessibilityNodeProvider) A05.A00;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A01(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        AnonymousClass031 r3 = new AnonymousClass031(accessibilityNodeInfo);
        r3.A0M(C004601z.A0x(view));
        r3.A0L(C004601z.A0s(view));
        r3.A0E((CharSequence) new IDxVPropertyShape2S0000000_I0(1).A01(view));
        r3.A0G((CharSequence) new IDxVPropertyShape2S0000000_I0(2).A01(view));
        this.A00.A06(view, r3);
        r3.A08(view, accessibilityNodeInfo.getText());
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            r3.A09((AnonymousClass032) list.get(i2));
        }
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A02(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return this.A00.A03(view, i2, bundle);
    }

    public void sendAccessibilityEvent(View view, int i2) {
        this.A00.A00(view, i2);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
