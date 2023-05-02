package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.obwhatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.30n  reason: invalid class name and case insensitive filesystem */
public class C602130n extends AnonymousClass31D {
    public boolean A00;
    public final TemplateQuickReplyButtonsLayout A01 = ((TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons));
    public final TemplateRowContentLayout A02 = ((TemplateRowContentLayout) findViewById(R.id.template_message_content));

    public C602130n(Context context, AnonymousClass1YG r3, C38941rf r4) {
        super(context, r3, r4);
        A0g();
        A1N();
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
            C30011bb.A0T(A06, this);
        }
    }

    public void A0t() {
        A1N();
        super.A0t();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1N();
        }
    }

    public final void A1N() {
        this.A02.A02(this);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A01;
        if (templateQuickReplyButtonsLayout != null) {
            C82744Dz r1 = this.A1p;
            AnonymousClass1YG r0 = this.A0b;
            templateQuickReplyButtonsLayout.A02(r1, (r0 == null || !r0.AfN()) ? null : ((C30591cd) ((C38751rM) this.A0O)).AGV().A05);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01d1;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01d1;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01d2;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A01;
        if (templateQuickReplyButtonsLayout != null) {
            C30011bb.A0J(templateQuickReplyButtonsLayout, this);
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A01;
        if (templateQuickReplyButtonsLayout != null) {
            setMeasuredDimension(getMeasuredWidth(), C30011bb.A02(this, templateQuickReplyButtonsLayout));
        }
    }
}
