package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxIListenerShape29S0000000_2_I1;
import com.facebook.redex.IDxTRendererShape197S0100000_1_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import java.io.File;

/* renamed from: X.30v  reason: invalid class name and case insensitive filesystem */
public final class C602930v extends AnonymousClass2Q7 {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final TextView A03 = C13680ns.A0M(this, R.id.control_btn);
    public final TextView A04;
    public final TextEmojiLabel A05;
    public final ConversationRowVideo$RowVideoView A06 = ((ConversationRowVideo$RowVideoView) findViewById(R.id.thumb));
    public final AnonymousClass25V A07 = new IDxTRendererShape197S0100000_1_I1(this, 3);
    public final C33741j5 A08;
    public final C33741j5 A09;

    public C602930v(Context context, AnonymousClass1YG r5, C38711rI r6) {
        super(context, r5, r6);
        A0g();
        C33741j5 r2 = new C33741j5(findViewById(R.id.progress_bar));
        this.A09 = r2;
        this.A04 = C13680ns.A0M(this, R.id.info);
        this.A08 = new C33741j5(findViewById(R.id.cancel_download));
        this.A01 = findViewById(R.id.control_frame);
        TextEmojiLabel A0R = C13680ns.A0R(this, R.id.caption);
        this.A05 = A0R;
        C30531cW.A02(A0R);
        this.A02 = findViewById(R.id.text_and_date);
        r2.A05(new IDxIListenerShape29S0000000_2_I1(2));
        A0e(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        if (r8 <= 500) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0e(boolean r22) {
        /*
            r21 = this;
            r0 = r21
            X.0tZ r2 = r0.A0O
            X.0tY r2 = (X.C16730tY) r2
            X.0ta r4 = X.C16730tY.A00(r2)
            if (r22 == 0) goto L_0x0015
            android.widget.TextView r3 = r0.A03
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r3.setTag(r1)
        L_0x0015:
            android.widget.TextView r3 = r0.A04
            r6 = 8
            r3.setVisibility(r6)
            com.obwhatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r1 = r0.A06
            boolean r5 = r0.A0S
            r1.setKeepRatio(r5)
            boolean r5 = r0.A0S
            r1.setFullWidth(r5)
            X.0tY r5 = r0.getFMessage()
            java.lang.String r5 = r5.A03
            if (r5 == 0) goto L_0x0039
            int r8 = r5.length()
            r7 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            if (r8 > r7) goto L_0x003a
        L_0x0039:
            r5 = 1
        L_0x003a:
            r1.setPortraitPreviewEnabled(r5)
            X.1Vw r5 = r2.A11
            X.C30011bb.A0L(r1, r0, r2, r5)
            boolean r5 = r0.A0S
            r11 = 1
            if (r5 == 0) goto L_0x005c
            android.content.Context r5 = r0.getContext()
            int r7 = X.AnonymousClass1UP.A01(r5)
            int r5 = X.C25791Ld.A00(r2, r7)
            if (r5 > 0) goto L_0x0059
            int r5 = r7 * 9
            int r5 = r5 >> 4
        L_0x0059:
            r1.A02(r7, r5, r11)
        L_0x005c:
            X.0tY r7 = r0.getFMessage()
            boolean r5 = X.C38621r6.A10(r7)
            r13 = 0
            if (r5 == 0) goto L_0x00f9
            r12 = r22 ^ 1
            android.view.View r7 = r0.A01
            X.1j5 r9 = r0.A09
            X.1j5 r10 = r0.A08
            android.widget.TextView r8 = r0.A03
            X.AnonymousClass2Q7.A0c(r7, r8, r9, r10, r11, r12, r13)
            r1.setVisibility(r13)
            android.content.Context r6 = r0.getContext()
            r5 = 2131892684(0x7f1219cc, float:1.9420123E38)
            X.C13680ns.A0t(r6, r1, r5)
            r5 = 0
            r1.setOnClickListener(r5)
            X.1k5 r5 = r0.A08
            r8.setOnClickListener(r5)
            r9.A04(r5)
        L_0x008d:
            r0.A0x()
            X.C30011bb.A0K(r1, r0)
            android.content.Context r5 = r0.getContext()
            X.AnonymousClass00B.A06(r5)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass4Y4.A00(r5)
            r1.A05 = r5
            X.1Ld r6 = r0.A1d
            X.25V r5 = r0.A07
            r6.A07(r1, r2, r5)
            int r1 = r2.A00
            if (r1 != 0) goto L_0x00b3
            java.io.File r1 = r4.A0F
            int r1 = X.C17970vw.A03(r1)
            r2.A00 = r1
        L_0x00b3:
            X.013 r4 = r0.A0K
            if (r1 == 0) goto L_0x00f2
            long r1 = (long) r1
            java.lang.String r1 = X.C28961Zl.A04(r4, r1)
        L_0x00bc:
            r3.setText(r1)
            r3.setVisibility(r13)
            X.013 r1 = r0.A0K
            boolean r1 = X.C13680ns.A1Z(r1)
            if (r1 == 0) goto L_0x00e0
            r1 = 2131232133(0x7f080585, float:1.8080367E38)
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r13, r13, r13)
        L_0x00d0:
            android.view.View r3 = r0.A02
            com.obwhatsapp.TextEmojiLabel r2 = r0.A05
            X.0tY r1 = r0.getFMessage()
            java.lang.String r1 = r1.A13()
            r0.A1N(r3, r2, r1)
            return
        L_0x00e0:
            X.013 r4 = r0.A0K
            android.content.Context r2 = r0.getContext()
            r1 = 2131232133(0x7f080585, float:1.8080367E38)
            X.25m r2 = X.C447725m.A00(r2, r4, r1)
            r1 = 0
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r2, r1)
            goto L_0x00d0
        L_0x00f2:
            long r1 = r2.A01
            java.lang.String r1 = X.AnonymousClass2GQ.A03(r4, r1)
            goto L_0x00bc
        L_0x00f9:
            boolean r5 = X.C38621r6.A11(r7)
            if (r5 == 0) goto L_0x015c
            r1.setVisibility(r13)
            android.view.View r14 = r0.A01
            X.1j5 r5 = r0.A09
            X.1j5 r7 = r0.A08
            android.widget.TextView r15 = r0.A03
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r7
            r16 = r5
            X.AnonymousClass2Q7.A0c(r14, r15, r16, r17, r18, r19, r20)
            r15.setVisibility(r6)
            r7.A03(r13)
            android.view.View r6 = r7.A02()
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5 = 2131231965(0x7f0804dd, float:1.8080026E38)
            r6.setImageResource(r5)
            android.view.View r8 = r7.A02()
            android.content.Context r6 = r0.getContext()
            r5 = 2131890858(0x7f1212aa, float:1.941642E38)
            X.C13680ns.A0t(r6, r8, r5)
            android.content.Context r10 = r0.getContext()
            r9 = 2131892671(0x7f1219bf, float:1.9420097E38)
            java.lang.Object[] r8 = new java.lang.Object[r11]
            X.013 r6 = r0.A0K
            int r5 = r2.A00
            java.lang.String r5 = X.C28961Zl.A02(r6, r5, r13)
            java.lang.String r5 = X.C13680ns.A0d(r10, r5, r8, r13, r9)
            r1.setContentDescription(r5)
            X.1k5 r5 = r0.A0B
            r7.A04(r5)
            r15.setOnClickListener(r5)
            r1.setOnClickListener(r5)
            goto L_0x008d
        L_0x015c:
            android.widget.TextView r15 = r0.A03
            X.1k5 r5 = X.C30011bb.A0A(r15, r0, r2)
            r1.setOnClickListener(r5)
            android.content.Context r7 = r0.getContext()
            r5 = 2131886886(0x7f120326, float:1.9408364E38)
            X.C13680ns.A0t(r7, r1, r5)
            r15.setVisibility(r13)
            X.1j5 r7 = r0.A08
            r7.A03(r6)
            r19 = r22 ^ 1
            android.view.View r14 = r0.A01
            X.1j5 r5 = r0.A09
            r18 = 0
            r16 = r5
            r17 = r7
            r20 = r13
            X.AnonymousClass2Q7.A0c(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C602930v.A0e(boolean):void");
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
            C30011bb.A0U(A062, this);
        }
    }

    public int A0q(int i2) {
        if (!C30011bb.A0Z(this)) {
            return super.A0q(i2);
        }
        return 0;
    }

    public void A0t() {
        A0e(false);
        A1J(false);
    }

    public void A0z() {
        if (this.A01 == null || C14570pP.A1W(this)) {
            C16730tY r6 = (C16730tY) this.A0O;
            C16750ta A002 = C16730tY.A00(r6);
            if (A002.A0P) {
                int i2 = 1;
                if (A002.A07 == 1) {
                    this.A0J.A07(R.string.str093a, 1);
                    return;
                }
                boolean z2 = false;
                File file = A002.A0F;
                if (file != null) {
                    z2 = C30011bb.A0b(file);
                }
                StringBuilder A0r = AnonymousClass000.A0r("viewmessage/ from_me:");
                C28381Vw r3 = r6.A11;
                C30011bb.A0V(A002, r6, A0r, r3.A02);
                if (!z2) {
                    C30011bb.A0Y(this, r3);
                    return;
                }
                boolean A082 = this.A0c.A08();
                if (A082) {
                    i2 = 3;
                }
                C54592ho A092 = C30011bb.A09(this, r3, A082);
                A092.A02 = i2;
                A092.A06 = AnonymousClass000.A1V(AnonymousClass22O.A02(this));
                Intent A003 = A092.A00();
                ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A06;
                if (conversationRowVideo$RowVideoView != null) {
                    C455529g.A07(getContext(), A003, conversationRowVideo$RowVideoView);
                }
                C30011bb.A0F(A003, this, conversationRowVideo$RowVideoView, r3);
            }
        }
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A0e(A1a);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01a0;
    }

    public C38711rI getFMessage() {
        return (C38711rI) ((C16730tY) this.A0O);
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01a0;
    }

    public Drawable getKeepDrawable() {
        return C30011bb.A0Z(this) ? C30011bb.A04(this) : super.getKeepDrawable();
    }

    public int getMainChildMaxWidth() {
        return C31171dd.A02(this);
    }

    public int getOutgoingLayoutId() {
        throw AnonymousClass000.A0V("this row type does not support outgoing messages");
    }

    public Drawable getStarDrawable() {
        return C30011bb.A0Z(this) ? AnonymousClass00T.A04(getContext(), R.drawable.message_star_media) : super.getStarDrawable();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C38711rI);
        super.setFMessage(r2);
    }
}
