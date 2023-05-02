package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.yo.yo;

/* renamed from: X.31H  reason: invalid class name */
public class AnonymousClass31H extends AnonymousClass30I {
    public final TextEmojiLabel A00;

    public AnonymousClass31H(Context context, AnonymousClass1YG r4, C38831rU r5) {
        super(context, r4, r5);
        TextEmojiLabel A0R = C13680ns.A0R(this, R.id.message_text);
        this.A00 = A0R;
        A0R.setText(getMessageString());
        A0R.setLongClickable(C30531cW.A05(A0R));
    }

    public int A0p(int i2) {
        boolean z2 = getFMessage().A11.A02;
        int bubbleTick = yo.getBubbleTick("message_unsent");
        if (!z2) {
            return 0;
        }
        return bubbleTick;
    }

    public int A0q(int i2) {
        if (!getFMessage().A11.A02) {
            return 0;
        }
        return R.color.color055a;
    }

    public void A1G(C16740tZ r3, boolean z2) {
        boolean A1a = C13680ns.A1a(r3, getFMessage());
        super.A1G(r3, z2);
        if (z2 || A1a) {
            TextEmojiLabel textEmojiLabel = this.A00;
            textEmojiLabel.setText(getMessageString());
            textEmojiLabel.setLongClickable(C30531cW.A05(textEmojiLabel));
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01c4;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01c4;
    }

    public String getMessageString() {
        boolean z2 = getFMessage().A11.A02;
        int i2 = R.string.str1475;
        if (z2) {
            i2 = R.string.str1476;
        }
        return C13700nu.A0H(this, i2);
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01c5;
    }
}
