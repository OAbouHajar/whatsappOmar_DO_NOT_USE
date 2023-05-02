package X;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.obwhatsapp.R;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.05M  reason: invalid class name */
public class AnonymousClass05M {
    public static final View.AccessibilityDelegate A02 = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A00;
    public final View.AccessibilityDelegate A01;

    public AnonymousClass05M() {
        this(A02);
    }

    public AnonymousClass05M(View.AccessibilityDelegate accessibilityDelegate) {
        this.A01 = accessibilityDelegate;
        this.A00 = new AnonymousClass088(this);
    }

    public void A00(View view, int i2) {
        this.A01.sendAccessibilityEvent(view, i2);
    }

    public void A01(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A02(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean A03(View view, int i2, Bundle bundle) {
        Reference reference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        int i3 = 0;
        while (i3 < list.size() && ((AnonymousClass032) list.get(i3)).A00() != i2) {
            i3++;
        }
        boolean performAccessibilityAction = this.A01.performAccessibilityAction(view, i2, bundle);
        if (performAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (reference = (Reference) sparseArray.get(i4)) == null || (clickableSpan = (ClickableSpan) reference.get()) == null) {
            return false;
        }
        CharSequence text = view.createAccessibilityNodeInfo().getText();
        if (!(text instanceof Spanned)) {
            return false;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
        if (clickableSpanArr == null) {
            return false;
        }
        for (ClickableSpan equals : clickableSpanArr) {
            if (clickableSpan.equals(equals)) {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    public C06200Ur A05(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.A01.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C06200Ur(accessibilityNodeProvider);
        }
        return null;
    }

    public void A06(View view, AnonymousClass031 r4) {
        this.A01.onInitializeAccessibilityNodeInfo(view, r4.A01);
    }
}
