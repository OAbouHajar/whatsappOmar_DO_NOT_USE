package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2q8  reason: invalid class name and case insensitive filesystem */
public class C57102q8 extends AnonymousClass0EL {
    public final Rect A00 = AnonymousClass000.A0J();
    public final TextView A01;
    public final AnonymousClass01V A02;

    public C57102q8(TextView textView, AnonymousClass01V r3) {
        super(textView);
        this.A02 = r3;
        this.A01 = textView;
    }

    public int A07(float f2, float f3) {
        TextView textView = this.A01;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        int offsetForPosition = textView.getOffsetForPosition(f2, f3);
        AnonymousClass5RP[] r2 = (AnonymousClass5RP[]) spanned.getSpans(offsetForPosition, offsetForPosition, AnonymousClass5RP.class);
        if (r2.length == 1) {
            return spanned.getSpanStart(r2[0]);
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass031 r6, int r7) {
        /*
            r5 = this;
            android.widget.TextView r3 = r5.A01
            java.lang.CharSequence r1 = r3.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0064
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<X.5RP> r0 = X.AnonymousClass5RP.class
            java.lang.Object[] r2 = r1.getSpans(r7, r7, r0)
            X.5RP[] r2 = (X.AnonymousClass5RP[]) r2
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x0064
            r0 = 0
            r4 = r2[r0]
            if (r4 == 0) goto L_0x0065
            java.lang.CharSequence r2 = r3.getText()
            boolean r0 = r2 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0033
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r2.getSpanStart(r4)
            int r0 = r2.getSpanEnd(r4)
            java.lang.CharSequence r2 = r2.subSequence(r1, r0)
        L_0x0033:
            android.view.accessibility.AccessibilityNodeInfo r3 = r6.A01
            r3.setContentDescription(r2)
            r2 = 1
            r3.setFocusable(r2)
            r3.setClickable(r2)
            android.graphics.Rect r1 = r5.A00
            r5.A0L(r1, r4)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0056
            r5.A0L(r1, r4)
        L_0x004d:
            r3.setBoundsInParent(r1)
            r0 = 16
            r3.addAction(r0)
            return
        L_0x0056:
            java.lang.String r0 = "LinkAccessibilityHelper/LinkSpan bounds is empty for: "
            java.lang.String r0 = X.C13680ns.A0c(r7, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r1.set(r0, r0, r2, r2)
            goto L_0x004d
        L_0x0064:
            r4 = 0
        L_0x0065:
            java.lang.String r0 = "LinkAccessibilityHelper/TouchableSpan is null for offset: "
            java.lang.String r0 = X.C13680ns.A0c(r7, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.CharSequence r2 = r3.getText()
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57102q8.A0D(X.031, int):void");
    }

    public void A0E(List list) {
        if (!this.A02.A0T("android.hardware.type.featurephone")) {
            CharSequence text = this.A01.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                for (AnonymousClass5RP spanStart : (AnonymousClass5RP[]) spanned.getSpans(0, spanned.length(), AnonymousClass5RP.class)) {
                    list.add(Integer.valueOf(spanned.getSpanStart(spanStart)));
                }
            }
        }
    }

    public boolean A0H(int i2, int i3, Bundle bundle) {
        AnonymousClass5RP r0;
        if (i3 != 16) {
            return false;
        }
        TextView textView = this.A01;
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            AnonymousClass5RP[] r2 = (AnonymousClass5RP[]) ((Spanned) text).getSpans(i2, i2, AnonymousClass5RP.class);
            if (r2.length == 1 && (r0 = r2[0]) != null) {
                r0.onClick(textView);
                return true;
            }
        }
        Log.e(C13680ns.A0c(i2, "LinkAccessibilityHelper/LinkSpan is null for offset: "));
        return false;
    }

    public final void A0L(Rect rect, AnonymousClass5RP r8) {
        Layout layout;
        TextView textView = this.A01;
        CharSequence text = textView.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = textView.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(r8);
            int spanEnd = spanned.getSpanEnd(r8);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 != lineForOffset) {
                Rect A0J = AnonymousClass000.A0J();
                while (true) {
                    lineForOffset++;
                    if (lineForOffset > lineForOffset2) {
                        break;
                    }
                    layout.getLineBounds(lineForOffset, A0J);
                    rect.union(A0J);
                }
            } else {
                rect.left = (int) layout.getPrimaryHorizontal(spanStart);
                rect.right = (int) layout.getPrimaryHorizontal(spanEnd);
            }
            rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
        }
    }
}
