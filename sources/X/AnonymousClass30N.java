package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.obwhatsapp.conversation.conversationrow.InteractiveMessageView;
import java.util.Set;

/* renamed from: X.30N  reason: invalid class name */
public class AnonymousClass30N extends C30011bb {
    public boolean A00;
    public final InteractiveMessageButton A01 = ((InteractiveMessageButton) C004601z.A0E(this, R.id.button));
    public final InteractiveMessageView A02;

    public AnonymousClass30N(Context context, AnonymousClass1YG r5, C16830ti r6) {
        super(context, r5, r6);
        A0g();
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C004601z.A0E(this, R.id.interactive_view);
        this.A02 = interactiveMessageView;
        C30011bb.A0X(this, interactiveMessageView, r6);
        C16740tZ fMessage = getFMessage();
        this.A02.A00(this, fMessage);
        this.A01.A00(this, this.A0b, fMessage);
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
        }
    }

    public void A1G(C16740tZ r4, boolean z2) {
        boolean A1a = C13680ns.A1a(r4, getFMessage());
        super.A1G(r4, z2);
        if (z2 || A1a) {
            C16740tZ fMessage = getFMessage();
            this.A02.A00(this, fMessage);
            this.A01.A00(this, this.A0b, fMessage);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01ab;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01ab;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        InteractiveMessageView interactiveMessageView = this.A02;
        if (interactiveMessageView != null) {
            innerFrameLayouts.add(interactiveMessageView.getInnerFrameLayout());
        }
        return innerFrameLayouts;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01ac;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C16830ti);
        this.A0O = r2;
    }
}
