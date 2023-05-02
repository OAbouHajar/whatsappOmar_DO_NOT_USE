package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxIListenerShape257S0100000_2_I1;
import com.facebook.redex.IDxTRendererShape199S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.obwhatsapp.yo.mediapreviewbtn;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;

/* renamed from: X.31L  reason: invalid class name */
public class AnonymousClass31L extends C602730t {
    public C16180sb A00;
    public C52822eV A01;
    public AnonymousClass1P8 A02;
    public boolean A03;
    public final View A04;
    public final View A05;
    public final FrameLayout A06;
    public final FrameLayout A07;
    public final ImageView A08;
    public final TextView A09 = C13680ns.A0M(this, R.id.control_btn);
    public final TextView A0A;
    public final TextView A0B;
    public final TextEmojiLabel A0C;
    public final ConversationRowVideo$RowVideoView A0D = ((ConversationRowVideo$RowVideoView) C004601z.A0E(this, R.id.thumb));
    public final AnonymousClass25V A0E = new IDxTRendererShape199S0100000_2_I1(this, 4);
    public final C34331k5 A0F = new ViewOnClickCListenerShape5S0100000_I1_1(this, 16);
    public final C33741j5 A0G;
    public final C33741j5 A0H;
    public final mediapreviewbtn prevbtn;

    public AnonymousClass31L(Context context, AnonymousClass1YG r5, C38711rI r6) {
        super(context, r5, r6);
        C33741j5 A002 = C33741j5.A00(this, R.id.progress_bar);
        this.A0H = A002;
        this.A0A = C13680ns.A0M(this, R.id.info);
        this.A07 = (FrameLayout) findViewById(R.id.play_frame);
        this.A08 = C13680ns.A0K(this, R.id.play_button);
        this.prevbtn = (mediapreviewbtn) C13680ns.A0K(this, R.id.hb);
        this.A0G = C33741j5.A00(this, R.id.cancel_download);
        this.A06 = (FrameLayout) findViewById(R.id.invisible_press_surface);
        this.A04 = findViewById(R.id.control_frame);
        this.A05 = findViewById(R.id.text_and_date);
        TextEmojiLabel A0R = C13680ns.A0R(this, R.id.caption);
        this.A0C = A0R;
        if (A0R != null) {
            C30531cW.A02(A0R);
        }
        this.A0B = C13680ns.A0L(this, R.id.media_transfer_eta);
        A002.A05(new IDxIListenerShape257S0100000_2_I1(this, 2));
        A0f(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
        if (r7 <= 500) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0f(boolean r22) {
        /*
            r21 = this;
            r2 = r21
            X.0tZ r3 = r2.A0O
            X.0tY r3 = (X.C16730tY) r3
            X.1rI r3 = (X.C38711rI) r3
            X.0ta r9 = X.C16730tY.A00(r3)
            if (r22 == 0) goto L_0x0017
            android.widget.TextView r1 = r2.A09
            java.util.List r0 = java.util.Collections.singletonList(r3)
            r1.setTag(r0)
        L_0x0017:
            android.widget.TextView r5 = r2.A0A
            r4 = 8
            r5.setVisibility(r4)
            com.obwhatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r1 = r2.A0D
            boolean r0 = r2.A0S
            r1.setKeepRatio(r0)
            boolean r0 = r2.A0S
            r1.setFullWidth(r0)
            X.0tY r0 = r2.getFMessage()
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x003b
            int r7 = r0.length()
            r6 = 500(0x1f4, float:7.0E-43)
            r0 = 0
            if (r7 > r6) goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            r1.setPortraitPreviewEnabled(r0)
            X.1Vw r0 = r3.A11
            r20 = r0
            X.C30011bb.A0L(r1, r2, r3, r0)
            boolean r0 = r2.A0S
            r7 = 1
            if (r0 == 0) goto L_0x022a
            android.content.Context r0 = r2.getContext()
            int r6 = X.AnonymousClass1UP.A01(r0)
            int r0 = X.C25791Ld.A00(r3, r6)
            if (r0 > 0) goto L_0x005d
            int r0 = r6 * 9
            int r0 = r0 >> 4
        L_0x005d:
            r1.A02(r6, r0, r7)
            android.widget.ImageView r14 = r2.A08
            X.1k5 r6 = r2.A0B
            r14.setOnClickListener(r6)
            android.widget.FrameLayout r8 = r2.A07
            r8.setOnClickListener(r6)
            X.0tY r11 = r2.getFMessage()
            boolean r10 = X.C38621r6.A10(r11)
            r0 = 0
            if (r10 == 0) goto L_0x0153
            r18 = r22 ^ 1
            android.view.View r13 = r2.A04
            X.1j5 r11 = r2.A0H
            X.1j5 r12 = r2.A0G
            android.widget.TextView r10 = r2.A09
            r19 = 1
            r17 = 1
            r14 = r10
            r15 = r11
            r16 = r12
            X.AnonymousClass2Q7.A0c(r13, r14, r15, r16, r17, r18, r19)
            r13.setVisibility(r0)
            r1.setVisibility(r0)
            android.widget.FrameLayout r12 = r2.A06
            r12.setVisibility(r0)
            r5.setVisibility(r4)
            r1.setOnClickListener(r6)
            X.1k5 r6 = r2.A08
            r10.setOnClickListener(r6)
            r11.A04(r6)
            r12.setOnClickListener(r6)
            android.content.Context r10 = r1.getContext()
            r6 = 2131892684(0x7f1219cc, float:1.9420123E38)
            java.lang.String r6 = r10.getString(r6)
        L_0x00b3:
            r1.setContentDescription(r6)
            X.C004601z.A0d(r1, r7)
        L_0x00b9:
            int r6 = r11.A01()
            if (r6 != r4) goto L_0x00c4
            android.widget.TextView r6 = r2.A0B
            r6.setVisibility(r4)
        L_0x00c4:
            r2.A0x()
            r6 = r20
            boolean r7 = r6.A02
            if (r7 == 0) goto L_0x014f
            X.1y4 r6 = r3.A12()
            X.AnonymousClass00B.A06(r6)
            X.0tY r6 = r6.A04
            X.0ta r6 = X.C16730tY.A00(r6)
            boolean r6 = r6.A0M
            if (r6 != 0) goto L_0x014f
            boolean r6 = r9.A0P
            if (r6 != 0) goto L_0x014f
            java.io.File r6 = r9.A0F
            if (r6 != 0) goto L_0x014f
            r8.setVisibility(r4)
        L_0x00e9:
            X.C30011bb.A0K(r1, r2)
            r1.A0A = r7
            r1.A00()
            X.1Ld r6 = r2.A1d
            X.AnonymousClass00B.A06(r6)
            boolean r4 = r2.A03
            if (r4 == 0) goto L_0x0149
            if (r22 != 0) goto L_0x0149
            X.25V r4 = r2.A0E
            r11 = 0
            r7 = r1
            r8 = r3
            r9 = r4
            r10 = r20
            r6.A0B(r7, r8, r9, r10, r11)
        L_0x0107:
            r2.A03 = r0
            int r1 = r5.getVisibility()
            if (r1 != 0) goto L_0x0126
            X.013 r1 = r2.A0K
            java.lang.String r1 = X.AnonymousClass46W.A00(r1, r3)
            r5.setText(r1)
            X.013 r1 = r2.A0K
            boolean r1 = X.C13680ns.A1Z(r1)
            if (r1 == 0) goto L_0x0139
            r1 = 2131232133(0x7f080585, float:1.8080367E38)
            r5.setCompoundDrawablesWithIntrinsicBounds(r1, r0, r0, r0)
        L_0x0126:
            android.view.View r4 = r2.A05
            com.obwhatsapp.TextEmojiLabel r1 = r2.A0C
            X.0tY r0 = r2.getFMessage()
            java.lang.String r0 = r0.A13()
            r2.A1N(r4, r1, r0)
            r2.A1O(r3)
            return
        L_0x0139:
            android.content.Context r1 = r2.getContext()
            r0 = 2131232133(0x7f080585, float:1.8080367E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r1, r0)
            r0 = 0
            r5.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r1, r0)
            goto L_0x0126
        L_0x0149:
            X.25V r4 = r2.A0E
            r6.A07(r1, r3, r4)
            goto L_0x0107
        L_0x014f:
            r8.setVisibility(r0)
            goto L_0x00e9
        L_0x0153:
            boolean r10 = X.C38621r6.A11(r11)
            if (r10 == 0) goto L_0x019c
            android.view.View r13 = r2.A04
            X.1j5 r11 = r2.A0H
            X.1j5 r12 = r2.A0G
            android.widget.TextView r10 = r2.A09
            r17 = 0
            r18 = 0
            r19 = 1
            r14 = r10
            r15 = r11
            r16 = r12
            X.AnonymousClass2Q7.A0c(r13, r14, r15, r16, r17, r18, r19)
            r10.setVisibility(r4)
            r1.setVisibility(r0)
            r13.setVisibility(r4)
            r5.setVisibility(r0)
            r10.setOnClickListener(r6)
            r1.setOnClickListener(r6)
            android.widget.FrameLayout r6 = r2.A06
            r6.setVisibility(r4)
            android.content.Context r13 = r1.getContext()
            r12 = 2131892671(0x7f1219bf, float:1.9420097E38)
            java.lang.Object[] r10 = new java.lang.Object[r7]
            X.013 r14 = r2.A0K
            int r6 = r3.A00
            java.lang.String r6 = X.C28961Zl.A02(r14, r6, r0)
            java.lang.String r6 = X.C13680ns.A0d(r13, r6, r10, r0, r12)
            goto L_0x00b3
        L_0x019c:
            android.view.View r10 = r2.A04
            r19 = r10
            r10.setVisibility(r0)
            android.widget.TextView r10 = r2.A09
            r10.setVisibility(r0)
            android.widget.FrameLayout r13 = r2.A06
            r13.setVisibility(r0)
            X.1j5 r15 = r2.A0G
            r15.A03(r4)
            r5.setVisibility(r4)
            X.0tY r11 = r2.getFMessage()
            boolean r11 = X.C38621r6.A0z(r11)
            if (r11 != 0) goto L_0x01f6
            r11 = 2131891306(0x7f12146a, float:1.9417328E38)
            r10.setText(r11)
            android.content.Context r7 = r2.getContext()
            X.C13680ns.A0t(r7, r10, r11)
            r7 = 2131231968(0x7f0804e0, float:1.8080032E38)
            r10.setCompoundDrawablesWithIntrinsicBounds(r7, r0, r0, r0)
            X.1k5 r7 = r2.A0A
            r10.setOnClickListener(r7)
            r13.setOnClickListener(r7)
            r1.setOnClickListener(r6)
            r6 = 0
            r1.setContentDescription(r6)
            r7 = 2
        L_0x01e2:
            X.C004601z.A0d(r1, r7)
            r17 = r22 ^ 1
            r18 = 1
            X.1j5 r11 = r2.A0H
            r16 = 0
            r13 = r10
            r14 = r11
            r12 = r19
            X.AnonymousClass2Q7.A0c(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00b9
        L_0x01f6:
            java.util.List r6 = java.util.Collections.singletonList(r3)
            long r11 = r3.A01
            r2.A18(r10, r6, r11)
            r6 = 2131231961(0x7f0804d9, float:1.8080018E38)
            r10.setCompoundDrawablesWithIntrinsicBounds(r6, r0, r0, r0)
            X.1k5 r6 = r2.A09
            r10.setOnClickListener(r6)
            com.obwhatsapp.yo.mediapreviewbtn r11 = r2.prevbtn
            if (r11 == 0) goto L_0x0211
            r11.setCustomOnClickListener(r2, r6)
        L_0x0211:
            r13.setOnClickListener(r6)
            X.1k5 r6 = r2.A0F
            r1.setOnClickListener(r6)
            r14.setOnClickListener(r6)
            r8.setOnClickListener(r6)
            android.content.Context r11 = r1.getContext()
            r6 = 2131886886(0x7f120326, float:1.9408364E38)
            X.C13680ns.A0t(r11, r1, r6)
            goto L_0x01e2
        L_0x022a:
            int r6 = r9.A08
            int r0 = r9.A06
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31L.A0f(boolean):void");
    }

    /* access modifiers changed from: private */
    public void setThumbnail(Drawable drawable) {
        this.A0D.setImageDrawable(drawable);
    }

    public int A0q(int i2) {
        if (!C30011bb.A0Z(this)) {
            return super.A0q(i2);
        }
        return 0;
    }

    public void A0t() {
        A0f(false);
        A1J(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0z() {
        /*
            r11 = this;
            X.0sj r0 = r11.A01
            if (r0 == 0) goto L_0x000b
            boolean r0 = X.C14570pP.A1W(r11)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            X.0tZ r5 = r11.A0O
            X.0tY r5 = (X.C16730tY) r5
            X.0ta r4 = X.C16730tY.A00(r5)
            int r0 = r4.A07
            r2 = 1
            r6 = 1
            if (r0 != r2) goto L_0x0022
            X.0pt r1 = r11.A0J
            r0 = 2131888442(0x7f12093a, float:1.941152E38)
            r1.A07(r0, r2)
            return
        L_0x0022:
            X.1P8 r0 = r11.A02
            X.1co r1 = r0.A00(r4)
            X.1Vw r3 = r5.A11
            boolean r2 = r3.A02
            if (r2 != 0) goto L_0x0041
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x003c
            X.2Oh r0 = r1.A0i
            if (r0 == 0) goto L_0x003c
        L_0x0038:
            r11.A1Q()
            return
        L_0x003c:
            boolean r0 = r4.A0P
            if (r0 != 0) goto L_0x0085
            return
        L_0x0041:
            boolean r0 = r4.A0P
            if (r0 != 0) goto L_0x0085
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x0085
            java.lang.String r7 = r4.A0H
            r9 = 0
            if (r7 != 0) goto L_0x005b
            long r0 = r4.A0D
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x0085
            long r0 = r4.A0E
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0085
        L_0x005b:
            long r0 = r4.A0D
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x0067
            long r0 = r4.A0E
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0073
        L_0x0067:
            X.0sb r0 = r11.A00
            java.io.File r0 = X.C17970vw.A0E(r0, r7)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0085
        L_0x0073:
            boolean r0 = X.C38621r6.A10(r5)
            r1 = 2131887005(0x7f12039d, float:1.9408605E38)
            if (r0 == 0) goto L_0x007f
            r1 = 2131887006(0x7f12039e, float:1.9408607E38)
        L_0x007f:
            X.0pt r0 = r11.A0J
            r0.A07(r1, r6)
            return
        L_0x0085:
            r1 = 0
            java.io.File r0 = r4.A0F
            if (r0 == 0) goto L_0x008e
            boolean r1 = X.C30011bb.A0b(r0)
        L_0x008e:
            boolean r0 = com.AssemMods.AGMods.A0C(r0)
            if (r0 == 0) goto L_0x0095
            return
        L_0x0095:
            java.lang.String r0 = "viewmessage/ from_me:"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            X.C30011bb.A0V(r4, r5, r0, r2)
            if (r1 != 0) goto L_0x0038
            X.C30011bb.A0Y(r11, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31L.A0z():void");
    }

    public void A1G(C16740tZ r2, boolean z2) {
        if (!(r2 instanceof C39131ry)) {
            boolean A1a = C13680ns.A1a(r2, this.A0O);
            super.A1G(r2, z2);
            if (z2 || A1a) {
                A0f(A1a);
            }
        }
    }

    public final void A1Q() {
        boolean A082 = this.A0c.A08();
        int i2 = 1;
        if (A082) {
            i2 = 3;
        }
        C16740tZ r2 = this.A0O;
        C54592ho r1 = new C54592ho(getContext());
        r1.A07 = A082;
        C28381Vw r3 = r2.A11;
        C15830rv r0 = r3.A00;
        AnonymousClass00B.A06(r0);
        r1.A03 = r0;
        r1.A04 = r3;
        r1.A02 = i2;
        r1.A06 = AnonymousClass000.A1V(AnonymousClass22O.A02(this));
        Intent A002 = r1.A00();
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0D;
        if (conversationRowVideo$RowVideoView != null) {
            C455529g.A07(getContext(), A002, conversationRowVideo$RowVideoView);
        }
        C30011bb.A0F(A002, this, conversationRowVideo$RowVideoView, r3);
    }

    public void dispatchSetPressed(boolean z2) {
        boolean isPressed;
        super.dispatchSetPressed(z2);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0D;
        if (conversationRowVideo$RowVideoView != null && conversationRowVideo$RowVideoView.A0B != (isPressed = isPressed())) {
            conversationRowVideo$RowVideoView.A0B = isPressed;
            conversationRowVideo$RowVideoView.A00();
            conversationRowVideo$RowVideoView.invalidate();
        }
    }

    public int getBroadcastDrawableId() {
        return C30011bb.A00(this);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01de;
    }

    public C38711rI getFMessage() {
        return (C38711rI) ((C16730tY) this.A0O);
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01de;
    }

    public Drawable getKeepDrawable() {
        return C30011bb.A0Z(this) ? C30011bb.A04(this) : super.getKeepDrawable();
    }

    public int getMainChildMaxWidth() {
        return this.A0D.A06.A03();
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01df;
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
