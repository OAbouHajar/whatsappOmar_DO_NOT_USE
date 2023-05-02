package X;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.obwhatsapp.R;
import com.obwhatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.2q6  reason: invalid class name and case insensitive filesystem */
public class C57082q6 extends AnonymousClass05M {
    public final /* synthetic */ TokenizedSearchInput A00;

    public C57082q6(TokenizedSearchInput tokenizedSearchInput) {
        this.A00 = tokenizedSearchInput;
    }

    public void A01(View view, AccessibilityEvent accessibilityEvent) {
        super.A01(view, accessibilityEvent);
        TokenizedSearchInput tokenizedSearchInput = this.A00;
        if (AnonymousClass2JP.A06(tokenizedSearchInput.A09.A0P()) && accessibilityEvent.getEventType() == 1) {
            TokenizedSearchInput.A00(view, tokenizedSearchInput);
        }
    }

    public void A06(View view, AnonymousClass031 r6) {
        super.A06(view, r6);
        TokenizedSearchInput tokenizedSearchInput = this.A00;
        if (AnonymousClass2JP.A06(tokenizedSearchInput.A09.A0P())) {
            if (Build.VERSION.SDK_INT < 23) {
                r6.A0F(tokenizedSearchInput.getContext().getString(R.string.str003e));
            }
            String name = Button.class.getName();
            AccessibilityNodeInfo accessibilityNodeInfo = r6.A01;
            accessibilityNodeInfo.setClassName(name);
            accessibilityNodeInfo.setCheckable(false);
            accessibilityNodeInfo.setClickable(true);
            r6.A09(new AnonymousClass032(16, tokenizedSearchInput.getContext().getString(R.string.str1bc9)));
        }
    }
}
