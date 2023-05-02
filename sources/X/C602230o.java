package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.obwhatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import java.util.List;

/* renamed from: X.30o  reason: invalid class name and case insensitive filesystem */
public class C602230o extends AnonymousClass31D {
    public boolean A00;
    public final DynamicButtonsLayout A01 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A02 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));

    public C602230o(Context context, AnonymousClass1YG r3, C38751rM r4) {
        super(context, r3, r4);
        A0g();
        A0c();
    }

    private void A0c() {
        int i2;
        this.A02.A00(this);
        C16740tZ r1 = this.A0O;
        List A0u = (r1.A0E().A00 == null || AnonymousClass22O.A02(this) == null) ? AnonymousClass000.A0u() : r1.A0E().A00.A02;
        int size = A0u.size();
        DynamicButtonsLayout dynamicButtonsLayout = this.A01;
        if (size > 0) {
            dynamicButtonsLayout.A04(this.A1o, A0u);
            i2 = 0;
        } else {
            i2 = 8;
        }
        dynamicButtonsLayout.setVisibility(i2);
    }

    public void A0g() {
        if (!this.A00) {
            this.A00 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
            C30011bb.A0T(A06, this);
        }
    }

    public void A0t() {
        A0c();
        super.A0t();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A0c();
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout017f;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout017f;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0180;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C30011bb.A0J(this.A01, this);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(getMeasuredWidth(), C30011bb.A01(this, this.A01, getMeasuredHeight()));
    }
}
