package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.obwhatsapp.conversation.conversationrow.TemplateRowContentLayout;
import java.util.List;

/* renamed from: X.30Y  reason: invalid class name */
public class AnonymousClass30Y extends C30011bb {
    public boolean A00;
    public final TextEmojiLabel A01 = C13680ns.A0R(this, R.id.title_text_message);
    public final TemplateQuickReplyButtonsLayout A02 = ((TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons));
    public final TemplateRowContentLayout A03 = ((TemplateRowContentLayout) findViewById(R.id.template_message_content));

    public AnonymousClass30Y(Context context, AnonymousClass1YG r3, C30571cb r4) {
        super(context, r3, r4);
        A0g();
        A1M();
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
        boolean z2;
        int i2;
        int i3;
        C30571cb r5 = (C30571cb) getFMessage();
        List list = r5.A00.A05;
        if (list == null || list.isEmpty()) {
            z2 = false;
            i2 = -2;
        } else {
            z2 = true;
            i2 = getResources().getDimensionPixelSize(R.dimen.dimen0268);
        }
        View view = this.A0D;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i2;
        view.setLayoutParams(layoutParams);
        TemplateRowContentLayout templateRowContentLayout = this.A03;
        templateRowContentLayout.A02(this);
        if (!TextUtils.isEmpty(r5.A0I())) {
            String A0I = r5.A0I();
            TextEmojiLabel textEmojiLabel = this.A01;
            A19(textEmojiLabel, getFMessage(), A0I, false, true);
            ViewGroup.LayoutParams layoutParams2 = textEmojiLabel.getLayoutParams();
            if (z2) {
                i3 = i2;
            } else {
                i3 = -1;
                if (A1N(r5)) {
                    i3 = -2;
                }
            }
            layoutParams2.width = i3;
            textEmojiLabel.setLayoutParams(layoutParams2);
            textEmojiLabel.setVisibility(0);
        } else {
            this.A01.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams3 = templateRowContentLayout.getLayoutParams();
        if (!z2) {
            i2 = -2;
            if (A1N(r5)) {
                i2 = -1;
            }
        }
        layoutParams3.width = i2;
        templateRowContentLayout.setLayoutParams(layoutParams3);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A02;
        if (templateQuickReplyButtonsLayout != null) {
            C82744Dz r1 = this.A1p;
            AnonymousClass1YG r0 = this.A0b;
            templateQuickReplyButtonsLayout.A02(r1, (r0 == null || !r0.AfN()) ? null : ((C30591cd) getFMessage()).AGV().A05);
        }
    }

    public final boolean A1N(C30571cb r7) {
        String A0I = r7.A0I();
        if (TextUtils.isEmpty(A0I)) {
            return false;
        }
        C30611cf r0 = r7.A00;
        String str = r0.A02;
        String str2 = r0.A03;
        float measureText = this.A01.getPaint().measureText(A0I);
        TemplateRowContentLayout templateRowContentLayout = this.A03;
        return measureText > templateRowContentLayout.getContentTextView().getPaint().measureText(str) && measureText > (!TextUtils.isEmpty(str2) ? templateRowContentLayout.A02.getPaint().measureText(str2) : 0.0f);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01d3;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01d3;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01d4;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A02;
        if (templateQuickReplyButtonsLayout != null) {
            C30011bb.A0J(templateQuickReplyButtonsLayout, this);
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A02;
        if (templateQuickReplyButtonsLayout != null) {
            setMeasuredDimension(getMeasuredWidth(), C30011bb.A02(this, templateQuickReplyButtonsLayout));
        }
    }
}
