package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.obwhatsapp.ClearableEditText;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.3PF  reason: invalid class name */
public class AnonymousClass3PF extends AnonymousClass0EL {
    public final /* synthetic */ ClearableEditText A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3PF(View view, ClearableEditText clearableEditText) {
        super(view);
        this.A00 = clearableEditText;
    }

    public int A07(float f2, float f3) {
        return ClearableEditText.A01(this.A00, (int) f2, (int) f3) ? 1 : Integer.MIN_VALUE;
    }

    public void A0D(AnonymousClass031 r5, int i2) {
        if (i2 == 1) {
            AccessibilityNodeInfo accessibilityNodeInfo = r5.A01;
            accessibilityNodeInfo.setClickable(true);
            accessibilityNodeInfo.addAction(16);
            ClearableEditText clearableEditText = this.A00;
            accessibilityNodeInfo.setContentDescription(clearableEditText.getContext().getString(R.string.str07f6));
            accessibilityNodeInfo.setBoundsInParent(clearableEditText.getClearBounds());
        }
    }

    public void A0E(List list) {
        if (this.A00.getClearIconDrawable() != null) {
            list.add(C13680ns.A0Y());
        }
    }

    public boolean A0H(int i2, int i3, Bundle bundle) {
        if (i2 != 1 || i3 != 16) {
            return false;
        }
        ClearableEditText clearableEditText = this.A00;
        View.OnClickListener onClickListener = clearableEditText.A01;
        if (onClickListener != null) {
            onClickListener.onClick(clearableEditText);
        }
        C13700nu.A0T(clearableEditText);
        clearableEditText.requestFocus();
        return true;
    }
}
