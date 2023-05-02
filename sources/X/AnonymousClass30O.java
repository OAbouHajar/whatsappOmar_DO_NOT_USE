package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.obwhatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import com.obwhatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout;

/* renamed from: X.30O  reason: invalid class name */
public class AnonymousClass30O extends C30011bb {
    public boolean A00;
    public final TextEmojiLabel A01 = C13680ns.A0R(this, R.id.title_text_message);
    public final AnonymousClass1YG A02;
    public final DynamicButtonsLayout A03 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A04 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));
    public final NativeFlowButtonsRowContentLayout A05 = ((NativeFlowButtonsRowContentLayout) findViewById(R.id.native_flow_action_button_content));

    public AnonymousClass30O(Context context, AnonymousClass1YG r4, C30581cc r5) {
        super(context, r4, r5);
        A0g();
        this.A02 = r4;
        TextEmojiLabel textEmojiLabel = this.A01;
        C30531cW.A02(textEmojiLabel);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
        A1M();
    }

    public void A0g() {
        if (!this.A00) {
            this.A00 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A052 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A052, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A052, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A052, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
        }
    }

    public void A0t() {
        A1M();
        A1J(false);
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, getFMessage());
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1M();
        }
    }

    public final void A1M() {
        this.A04.A00(this);
        C16740tZ fMessage = getFMessage();
        if (!TextUtils.isEmpty(fMessage.A0I())) {
            String A0I = fMessage.A0I();
            TextEmojiLabel textEmojiLabel = this.A01;
            A19(textEmojiLabel, getFMessage(), A0I, false, false);
            textEmojiLabel.setVisibility(0);
        } else {
            this.A01.setVisibility(8);
        }
        DynamicButtonsLayout dynamicButtonsLayout = this.A03;
        NativeFlowButtonsRowContentLayout nativeFlowButtonsRowContentLayout = this.A05;
        C39261sB r8 = fMessage.A0E().A00;
        AnonymousClass389.A00(this, this.A02, dynamicButtonsLayout, nativeFlowButtonsRowContentLayout, this.A0K, r8);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout0177;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout0177;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0178;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C30011bb.A0J(this.A03, this);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(getMeasuredWidth(), C30011bb.A01(this, this.A03, getMeasuredHeight()));
    }
}
