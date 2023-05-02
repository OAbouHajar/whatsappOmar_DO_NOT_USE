package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.30L  reason: invalid class name */
public class AnonymousClass30L extends C30011bb {
    public AnonymousClass30L(Context context, AnonymousClass1YG r8, C38951rg r9) {
        super(context, r8, r9);
        TextEmojiLabel A0R = C13680ns.A0R(this, R.id.message_text);
        boolean A05 = C30531cW.A05(A0R);
        A0R.setLongClickable(A05);
        C30011bb.A0W(A0R, this, C13680ns.A0d(getContext(), this.A1Z.A04("26000255").toString(), C13680ns.A1b(), A05 ? 1 : 0, R.string.str0658), A05);
        this.A0Q.A02(r9, 2);
    }

    public int getBubbleAlpha() {
        return 153;
    }

    public int getCenteredLayoutId() {
        return R.layout.layout0188;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout0188;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0189;
    }
}
