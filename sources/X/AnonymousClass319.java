package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.obwhatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.319  reason: invalid class name */
public class AnonymousClass319 extends AnonymousClass31A {
    public final TemplateQuickReplyButtonsLayout A00 = ((TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons));
    public final TemplateRowContentLayout A01 = ((TemplateRowContentLayout) findViewById(R.id.template_message_content));

    public AnonymousClass319(Context context, AnonymousClass1YG r4, C38901rb r5) {
        super(context, r4, r5);
        this.A04.setTemplateImageRatio(true);
        A1Q();
    }

    public void A0t() {
        A1Q();
        super.A0t();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, (C16730tY) this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1Q();
        }
    }

    public final void A1Q() {
        this.A01.A02(this);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
        if (templateQuickReplyButtonsLayout != null) {
            C82744Dz r1 = this.A1p;
            AnonymousClass1YG r0 = this.A0b;
            templateQuickReplyButtonsLayout.A02(r1, (r0 == null || !r0.AfN()) ? null : ((C30591cd) ((C38681rF) ((C16730tY) this.A0O))).AGV().A05);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01cf;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01cf;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01d0;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
        if (templateQuickReplyButtonsLayout != null) {
            C30011bb.A0J(templateQuickReplyButtonsLayout, this);
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
        if (templateQuickReplyButtonsLayout != null) {
            setMeasuredDimension(getMeasuredWidth(), C30011bb.A02(this, templateQuickReplyButtonsLayout));
        }
    }
}
