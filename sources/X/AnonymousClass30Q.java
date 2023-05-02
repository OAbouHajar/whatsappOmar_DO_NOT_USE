package X;

import android.content.Context;
import android.graphics.Typeface;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.yo.Conversation;

/* renamed from: X.30Q  reason: invalid class name */
public final class AnonymousClass30Q extends C30011bb {
    public boolean A00;
    public final TextEmojiLabel A01 = C13680ns.A0R(this, R.id.message_text);
    public final String A02;

    public AnonymousClass30Q(Context context, AnonymousClass1YG r5, C38851rW r6) {
        super(context, r5, r6);
        A0g();
        StringBuilder A0o = AnonymousClass000.A0o();
        String str = AnonymousClass01S.A06;
        A0o.append(str);
        A0o.append(context.getString(R.string.str1d76));
        String A0h = AnonymousClass000.A0h(str, A0o);
        this.A02 = A0h;
        TextEmojiLabel textEmojiLabel = this.A01;
        textEmojiLabel.setText(A0h);
        C13680ns.A0v(getContext(), textEmojiLabel, R.color.color0783);
        Typeface typeface = textEmojiLabel.getTypeface();
        C13690nt.A1C(textEmojiLabel);
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

    public int A0p(int i2) {
        return 0;
    }

    public int A0q(int i2) {
        return 0;
    }

    public void A1G(C16740tZ r4, boolean z2) {
        boolean A1a = C13680ns.A1a(r4, getFMessage());
        super.A1G(r4, z2);
        if (z2 || A1a) {
            TextEmojiLabel textEmojiLabel = this.A01;
            textEmojiLabel.setText(this.A02);
            C13680ns.A0v(getContext(), textEmojiLabel, R.color.color0783);
            Typeface typeface = textEmojiLabel.getTypeface();
            C13690nt.A1C(textEmojiLabel);
        }
    }

    public int getBubbleAlpha() {
        return 191;
    }

    public int getCenteredLayoutId() {
        return Conversation.leftlayID(R.layout.layout01d8);
    }

    public int getIncomingLayoutId() {
        return Conversation.leftlayID(R.layout.layout01d8);
    }

    public int getOutgoingLayoutId() {
        return Conversation.rightlayID(R.layout.layout01d9);
    }
}
