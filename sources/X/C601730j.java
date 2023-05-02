package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.obwhatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import com.obwhatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout;

/* renamed from: X.30j  reason: invalid class name and case insensitive filesystem */
public class C601730j extends AnonymousClass318 {
    public boolean A00;
    public final AnonymousClass1YG A01;
    public final DynamicButtonsLayout A02 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A03 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));
    public final NativeFlowButtonsRowContentLayout A04 = ((NativeFlowButtonsRowContentLayout) findViewById(R.id.native_flow_action_button_content));

    public C601730j(Context context, AnonymousClass1YG r3, C38631rA r4) {
        super(context, r3, r4);
        A0g();
        this.A01 = r3;
        A0e();
    }

    private void A0e() {
        this.A03.A00(this);
        DynamicButtonsLayout dynamicButtonsLayout = this.A02;
        NativeFlowButtonsRowContentLayout nativeFlowButtonsRowContentLayout = this.A04;
        C39261sB r6 = ((C16730tY) this.A0O).A0E().A00;
        AnonymousClass389.A00(this, this.A01, dynamicButtonsLayout, nativeFlowButtonsRowContentLayout, this.A0K, r6);
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
            C30011bb.A0U(A06, this);
            this.A00 = A07.A01();
        }
    }

    public void A0t() {
        A0e();
        super.A0t();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, (C16730tY) this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A0e();
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout017b;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout017b;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout017c;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C30011bb.A0J(this.A02, this);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(getMeasuredWidth(), C30011bb.A01(this, this.A02, getMeasuredHeight()));
    }
}
