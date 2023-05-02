package X;

import android.content.Context;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.0ee  reason: invalid class name and case insensitive filesystem */
public class C08940ee implements AnonymousClass5SJ {
    public final C14990q7 A00;

    public C08940ee(C14990q7 r1) {
        this.A00 = r1;
    }

    public void A00(RCTextView rCTextView, Object obj) {
        if (obj instanceof AnonymousClass4OP) {
            rCTextView.setContentDescription(((AnonymousClass4OP) obj).A05);
        }
    }

    public void A01(RCTextView rCTextView, Object obj) {
        if (obj instanceof AnonymousClass4OP) {
            rCTextView.setContentDescription((CharSequence) null);
        }
    }

    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        A00((RCTextView) obj, obj3);
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        A01((RCTextView) obj, obj3);
    }
}
