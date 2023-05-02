package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.4nR  reason: invalid class name and case insensitive filesystem */
public class C95884nR implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        C49832Wc r4 = (C49832Wc) obj;
        C65273Tz r5 = (C65273Tz) obj2;
        r4.setOnTouchListener((View.OnTouchListener) null);
        r4.A02 = null;
        View.OnClickListener onClickListener = r5.A06;
        if (onClickListener != null) {
            r4.setOnClickListener(onClickListener);
        }
        r4.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        r4.setFocusable(false);
        r4.setFocusableInTouchMode(false);
        r4.setEnabled(r5.A09);
        if (r5.A00 != -1) {
            r4.setClickable(false);
        }
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        C49832Wc r4 = (C49832Wc) obj;
        r4.setOnTouchListener((View.OnTouchListener) null);
        r4.A02 = null;
        r4.setOnClickListener((View.OnClickListener) null);
        r4.setClickable(false);
        r4.setOnLongClickListener((View.OnLongClickListener) null);
        r4.setLongClickable(false);
        r4.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        r4.setFocusable(false);
        r4.setFocusableInTouchMode(false);
    }
}
