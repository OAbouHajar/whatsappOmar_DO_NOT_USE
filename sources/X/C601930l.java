package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.obwhatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.30l  reason: invalid class name and case insensitive filesystem */
public class C601930l extends AnonymousClass31B {
    public C52912ee A00;
    public boolean A01;
    public final InteractiveMessageButton A02 = ((InteractiveMessageButton) C004601z.A0E(this, R.id.button));
    public final InteractiveMessageView A03;

    public C601930l(Context context, AnonymousClass1YG r3, C39111rw r4) {
        super(context, r3, r4);
        A0g();
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C004601z.A0E(this, R.id.interactive_view);
        this.A03 = interactiveMessageView;
        C30011bb.A0X(this, interactiveMessageView, r4);
        A1Q();
    }

    public void A0g() {
        if (!this.A01) {
            this.A01 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0U(A06, this);
            this.A00 = A07.A03();
        }
    }

    public void A0t() {
        super.A0t();
        A1Q();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, (C16730tY) this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1Q();
        }
    }

    public final void A1Q() {
        C16730tY r2 = (C16730tY) this.A0O;
        this.A03.A00(this, r2);
        this.A02.A00(this, this.A0b, r2);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout019a;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout019a;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout019b;
    }
}
