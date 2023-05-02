package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.obwhatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.30h  reason: invalid class name and case insensitive filesystem */
public class C601530h extends AnonymousClass318 {
    public boolean A00;
    public final InteractiveMessageButton A01 = ((InteractiveMessageButton) C004601z.A0E(this, R.id.button));
    public final InteractiveMessageView A02;

    public C601530h(Context context, AnonymousClass1YG r5, C39151s0 r6) {
        super(context, r5, r6);
        A0g();
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C004601z.A0E(this, R.id.interactive_view);
        this.A02 = interactiveMessageView;
        C30011bb.A0X(this, interactiveMessageView, r6);
        C16730tY r2 = (C16730tY) this.A0O;
        this.A02.A00(this, r2);
        this.A01.A00(this, this.A0b, r2);
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
        super.A0t();
        C16730tY r2 = (C16730tY) this.A0O;
        this.A02.A00(this, r2);
        this.A01.A00(this, this.A0b, r2);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout018b;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout018b;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout018c;
    }
}
