package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.IDxTRendererShape199S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.TextAndDateLayout;

/* renamed from: X.30X  reason: invalid class name */
public class AnonymousClass30X extends C30011bb {
    public boolean A00;
    public final View A01 = C004601z.A0E(this, R.id.action_text);
    public final View A02 = C004601z.A0E(this, R.id.button_div);
    public final View A03 = C004601z.A0E(this, R.id.expired_invitation_container);
    public final View A04 = C004601z.A0E(this, R.id.group_view_contacts_btn);
    public final ImageView A05 = C13680ns.A0J(this, R.id.avatar);
    public final TextEmojiLabel A06 = C13680ns.A0Q(this, R.id.group_invite_caption);
    public final TextEmojiLabel A07 = C13680ns.A0Q(this, R.id.instructions);
    public final TextEmojiLabel A08 = C13680ns.A0Q(this, R.id.group_name);
    public final TextAndDateLayout A09 = ((TextAndDateLayout) C004601z.A0E(this, R.id.text_and_date));
    public final AnonymousClass25V A0A = new IDxTRendererShape199S0100000_2_I1(this, 1);

    public AnonymousClass30X(Context context, AnonymousClass1YG r4, C30071bh r5) {
        super(context, r4, r5);
        A0g();
        A1M();
    }

    public void A0g() {
        if (!this.A00) {
            this.A00 = true;
            C52652eD A072 = C30011bb.A07(this);
            C16150sX A062 = C30011bb.A06(A072, this);
            C49132Rg A052 = C30011bb.A05(A062, A072, this, C30011bb.A0C(A062, this));
            C30011bb.A0S(A062, this, C30011bb.A0B(A052, A062, this));
            C30011bb.A0Q(A062, this);
            C30011bb.A0O(A052, A062, C30011bb.A08(A062, this), this);
            C30011bb.A0M(A052, A062, A072, this, A062.A4p);
            C30011bb.A0R(A062, this);
        }
    }

    public void A0t() {
        A1M();
        A1J(false);
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1M();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r3.A07 != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M() {
        /*
            r10 = this;
            X.0tZ r3 = r10.A0O
            X.1bh r3 = (X.C30071bh) r3
            com.obwhatsapp.TextEmojiLabel r1 = r10.A08
            java.lang.String r0 = r3.A05
            r1.setText(r0)
            X.AnonymousClass1UP.A06(r1)
            java.lang.String r2 = r3.A04
            X.0t3 r0 = r10.A0r
            long r6 = r0.A00()
            long r4 = r3.A01
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            boolean r0 = r3.A07
            r9 = 0
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r9 = 1
        L_0x0025:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r5 = 8
            r4 = 0
            com.obwhatsapp.TextEmojiLabel r1 = r10.A06
            if (r0 != 0) goto L_0x00b8
            r10.setMessageText(r2, r1, r3)
            android.view.View r1 = r10.A02
            r0 = 0
            if (r9 == 0) goto L_0x003a
            r0 = 8
        L_0x003a:
            r1.setVisibility(r0)
        L_0x003d:
            com.obwhatsapp.components.TextAndDateLayout r8 = r10.A09
            if (r8 == 0) goto L_0x0060
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            r6 = 7
            r1 = -2
            r0 = -1
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r0, r1)
            r1 = 2131364172(0x7f0a094c, float:1.8348174E38)
            if (r7 == 0) goto L_0x00ad
            r2.addRule(r6, r1)
            r2.addRule(r5, r1)
            r8.setLayoutParams(r2)
            android.view.ViewGroup r0 = r10.A04
            X.C13680ns.A12(r0)
        L_0x0060:
            r0 = 35
            com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1 r1 = new com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1
            r1.<init>(r10, r0, r3)
            if (r9 == 0) goto L_0x009d
            r0 = 0
            r10.setOnClickListener(r0)
            r10.setClickable(r4)
            android.view.View r0 = r10.A04
            r0.setVisibility(r5)
            android.view.View r0 = r10.A03
        L_0x0077:
            r0.setVisibility(r4)
            X.0ul r1 = r10.A1B
            X.0tZ r0 = r10.A0O
            X.1bh r0 = (X.C30071bh) r0
            int r0 = r0.A00
            boolean r2 = r1.A0d(r0)
            com.obwhatsapp.TextEmojiLabel r1 = r10.A07
            r0 = 2131888804(0x7f120aa4, float:1.9412254E38)
            if (r2 == 0) goto L_0x0090
            r0 = 2131889935(0x7f120f0f, float:1.9414548E38)
        L_0x0090:
            r1.setText(r0)
            X.1Ld r2 = r10.A1d
            android.widget.ImageView r1 = r10.A05
            X.25V r0 = r10.A0A
            r2.A07(r1, r3, r0)
            return
        L_0x009d:
            r10.setOnClickListener(r1)
            android.view.View r0 = r10.A01
            r0.setOnClickListener(r1)
            android.view.View r0 = r10.A03
            r0.setVisibility(r5)
            android.view.View r0 = r10.A04
            goto L_0x0077
        L_0x00ad:
            r2.addRule(r6, r1)
            r0 = 3
            r2.addRule(r0, r1)
            r8.setLayoutParams(r2)
            goto L_0x0060
        L_0x00b8:
            java.lang.String r0 = ""
            r10.setMessageText(r0, r1, r3)
            android.view.View r0 = r10.A02
            r0.setVisibility(r5)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30X.A1M():void");
    }

    public int getCenteredLayoutId() {
        return 0;
    }

    public C30071bh getFMessage() {
        return (C30071bh) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout0193;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0195;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C30071bh);
        this.A0O = r2;
    }
}
