package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;

/* renamed from: X.2qA  reason: invalid class name and case insensitive filesystem */
public class C57122qA extends AnonymousClass0EL {
    public AnonymousClass05M A00;
    public final /* synthetic */ RCTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57122qA(RCTextView rCTextView) {
        super(rCTextView);
        this.A01 = rCTextView;
        rCTextView.setFocusable(false);
        rCTextView.setImportantForAccessibility(1);
    }

    public void A02(View view, AccessibilityEvent accessibilityEvent) {
        super.A02(view, accessibilityEvent);
        RCTextView rCTextView = this.A01;
        if (!TextUtils.isEmpty(rCTextView.A0B)) {
            accessibilityEvent.getText().add(rCTextView.getTextForAccessibility());
        }
    }

    public void A06(View view, AnonymousClass031 r5) {
        super.A06(view, r5);
        CharSequence A002 = ((RCTextView) view).getTextForAccessibility();
        if (!TextUtils.isEmpty(A002)) {
            AccessibilityNodeInfo accessibilityNodeInfo = r5.A01;
            accessibilityNodeInfo.setText(A002);
            accessibilityNodeInfo.addAction(256);
            accessibilityNodeInfo.addAction(512);
            accessibilityNodeInfo.setMovementGranularities(31);
            accessibilityNodeInfo.addAction(131072);
        }
        AnonymousClass05M r0 = this.A00;
        if (r0 != null) {
            r0.A06(view, r5);
        }
    }

    public int A07(float f2, float f3) {
        RCTextView rCTextView = this.A01;
        CharSequence charSequence = rCTextView.A0B;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i2 = 0;
            while (true) {
                ClickableSpan[] clickableSpanArr = rCTextView.A0E;
                if (i2 >= clickableSpanArr.length) {
                    break;
                }
                ClickableSpan clickableSpan = clickableSpanArr[i2];
                int spanStart = spanned.getSpanStart(clickableSpan);
                int spanEnd = spanned.getSpanEnd(clickableSpan);
                int A012 = rCTextView.A01((int) f2, (int) f3);
                if (A012 >= spanStart && A012 <= spanEnd) {
                    return i2;
                }
                i2++;
            }
        }
        return Integer.MIN_VALUE;
    }

    public void A0D(AnonymousClass031 r12, int i2) {
        RCTextView rCTextView = this.A01;
        Spanned spanned = (Spanned) rCTextView.A0B;
        Rect A0J = AnonymousClass000.A0J();
        ClickableSpan[] clickableSpanArr = rCTextView.A0E;
        if (clickableSpanArr == null || i2 >= clickableSpanArr.length) {
            AccessibilityNodeInfo accessibilityNodeInfo = r12.A01;
            accessibilityNodeInfo.setText("");
            accessibilityNodeInfo.setBoundsInParent(A0J);
            return;
        }
        ClickableSpan clickableSpan = clickableSpanArr[i2];
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        int lineForOffset = rCTextView.A0A.getLineForOffset(spanStart);
        int lineForOffset2 = rCTextView.A0A.getLineForOffset(spanEnd);
        Path A0I = AnonymousClass000.A0I();
        RectF A0K = AnonymousClass000.A0K();
        rCTextView.A0A.getSelectionPath(spanStart, lineForOffset == lineForOffset2 ? spanEnd : rCTextView.A0A.getLineVisibleEnd(lineForOffset), A0I);
        A0I.computeBounds(A0K, true);
        A0K.offset(rCTextView.A00, rCTextView.A01);
        A0K.round(A0J);
        AccessibilityNodeInfo accessibilityNodeInfo2 = r12.A01;
        accessibilityNodeInfo2.setBoundsInParent(A0J);
        accessibilityNodeInfo2.setClickable(true);
        accessibilityNodeInfo2.setFocusable(true);
        accessibilityNodeInfo2.setEnabled(true);
        accessibilityNodeInfo2.setVisibleToUser(true);
        accessibilityNodeInfo2.setText(spanned.subSequence(spanStart, spanEnd));
        accessibilityNodeInfo2.setClassName("android.widget.Button");
        if (clickableSpan instanceof AnonymousClass3MH) {
            AnonymousClass3MH r5 = (AnonymousClass3MH) clickableSpan;
            String str = r5.A00;
            String str2 = r5.A01;
            if (str != null) {
                accessibilityNodeInfo2.setContentDescription(str);
            }
            C806044s.A00(rCTextView.getContext(), (View) null, r12, str2);
        }
    }

    public void A0E(List list) {
        ClickableSpan[] clickableSpanArr = this.A01.A0E;
        if (clickableSpanArr != null) {
            int length = clickableSpanArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                list.add(Integer.valueOf(i2));
            }
        }
    }

    public boolean A0H(int i2, int i3, Bundle bundle) {
        return false;
    }
}
