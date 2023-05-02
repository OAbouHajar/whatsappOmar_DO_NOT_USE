package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxIListenerShape29S0000000_2_I1;
import com.facebook.redex.IDxTRendererShape197S0100000_1_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.obwhatsapp.yo.mediapreviewbtn;
import java.io.File;

/* renamed from: X.31B  reason: invalid class name */
public class AnonymousClass31B extends AnonymousClass31C {
    public View A00;
    public View A01;
    public TextView A02 = C13680ns.A0M(this, R.id.control_btn);
    public TextEmojiLabel A03;
    public ConversationRowImage$RowImageView A04 = ((ConversationRowImage$RowImageView) findViewById(R.id.image));
    public C33741j5 A05;
    public C33741j5 A06;
    public boolean A07;
    public final AnonymousClass25V A08 = new IDxTRendererShape197S0100000_1_I1(this, 2);
    public final mediapreviewbtn prevbtn;

    public AnonymousClass31B(Context context, AnonymousClass1YG r5, C38681rF r6) {
        super(context, r5, r6);
        C33741j5 r1 = new C33741j5(findViewById(R.id.progress_bar));
        this.A06 = r1;
        r1.A05(new IDxIListenerShape29S0000000_2_I1(1));
        this.A05 = new C33741j5(findViewById(R.id.cancel_download));
        this.A00 = findViewById(R.id.control_frame);
        this.prevbtn = (mediapreviewbtn) findViewById(R.id.hb);
        this.A01 = findViewById(R.id.text_and_date);
        TextEmojiLabel A0R = C13680ns.A0R(this, R.id.caption);
        this.A03 = A0R;
        if (A0R != null) {
            C30531cW.A02(A0R);
            this.A03.setAutoLinkMask(0);
            this.A03.setLinksClickable(false);
            this.A03.setFocusable(false);
            this.A03.setClickable(false);
            this.A03.setLongClickable(false);
        }
        A0e(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r5 <= 500) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0e(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            X.0tZ r2 = r0.A0O
            X.0tY r2 = (X.C16730tY) r2
            X.1rF r2 = (X.C38681rF) r2
            com.obwhatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r0.A04
            X.0tY r3 = r0.getFMessage()
            java.lang.String r3 = r3.A03
            if (r3 == 0) goto L_0x001b
            int r5 = r3.length()
            r4 = 500(0x1f4, float:7.0E-43)
            r3 = 0
            if (r5 > r4) goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            r1.setPortraitPreviewEnabled(r3)
            X.0ta r3 = r2.A02
            r10 = 1
            r6 = 0
            if (r3 != 0) goto L_0x0035
            r1.setImageBitmap(r6)
            r1.A04(r10, r10)
            r1.setOnClickListener(r6)
            android.view.View r1 = r0.A00
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x0035:
            if (r19 == 0) goto L_0x0043
            android.widget.TextView r5 = r0.A02
            java.util.List r4 = java.util.Collections.singletonList(r2)
            r5.setTag(r4)
            r1.setImageBitmap(r6)
        L_0x0043:
            X.0ta r4 = new X.0ta
            r4.<init>(r3)
            r1.setImageData(r4)
            boolean r4 = r0.A0S
            r1.setFullWidth(r4)
            X.1Vw r4 = r2.A11
            X.C30011bb.A0L(r1, r0, r2, r4)
            X.AnonymousClass2JP.A01(r1)
            X.0tY r6 = r0.getFMessage()
            boolean r5 = X.C38621r6.A10(r6)
            if (r5 == 0) goto L_0x00da
            android.view.View r6 = r0.A00
            r12 = 0
            r6.setVisibility(r12)
            r11 = r19 ^ 1
            X.1j5 r8 = r0.A06
            X.1j5 r9 = r0.A05
            android.widget.TextView r7 = r0.A02
            X.AnonymousClass2Q7.A0c(r6, r7, r8, r9, r10, r11, r12)
            android.content.Context r6 = r0.getContext()
            r5 = 2131888954(0x7f120b3a, float:1.9412558E38)
            X.C13680ns.A0t(r6, r1, r5)
            boolean r5 = r4.A02
            if (r5 == 0) goto L_0x00d8
            X.1k5 r5 = r0.A0B
        L_0x0083:
            r1.setOnClickListener(r5)
            X.1k5 r5 = r0.A08
            r7.setOnClickListener(r5)
            r8.A04(r5)
        L_0x008e:
            r0.A0x()
            X.C30011bb.A0K(r1, r0)
            android.view.View r7 = r0.A01
            com.obwhatsapp.TextEmojiLabel r6 = r0.A03
            X.0tY r5 = r0.getFMessage()
            java.lang.String r5 = r5.A13()
            r0.A1N(r7, r6, r5)
            java.lang.String r5 = r2.A13()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r1.A07 = r5
            boolean r5 = r4.A02
            r1.setOutgoing(r5)
            r6 = 0
            r0.setImageViewDimensions(r2, r3)
            X.1Ld r5 = r0.A1d
            X.AnonymousClass00B.A06(r5)
            boolean r3 = r0.A07
            if (r3 == 0) goto L_0x00d2
            if (r19 != 0) goto L_0x00d2
            X.25V r3 = r0.A08
            r12 = 0
            r9 = r2
            r10 = r3
            r11 = r4
            r7 = r5
            r8 = r1
            r7.A0B(r8, r9, r10, r11, r12)
        L_0x00cc:
            r0.A07 = r6
            r0.A1O(r2)
            return
        L_0x00d2:
            X.25V r3 = r0.A08
            r5.A07(r1, r2, r3)
            goto L_0x00cc
        L_0x00d8:
            r5 = 0
            goto L_0x0083
        L_0x00da:
            boolean r5 = X.C38621r6.A11(r6)
            if (r5 == 0) goto L_0x0106
            android.view.View r6 = r0.A00
            r5 = 8
            r6.setVisibility(r5)
            X.1j5 r8 = r0.A06
            X.1j5 r9 = r0.A05
            android.widget.TextView r7 = r0.A02
            r10 = 0
            r11 = 0
            r12 = 0
            X.AnonymousClass2Q7.A0c(r6, r7, r8, r9, r10, r11, r12)
            android.content.Context r6 = r0.getContext()
            r5 = 2131886229(0x7f120095, float:1.940703E38)
            X.C13680ns.A0t(r6, r1, r5)
            X.1k5 r5 = r0.A0B
            r7.setOnClickListener(r5)
            r1.setOnClickListener(r5)
            goto L_0x008e
        L_0x0106:
            android.view.View r11 = r0.A00
            r15 = 0
            r11.setVisibility(r15)
            r16 = r19 ^ 1
            X.1j5 r13 = r0.A06
            X.1j5 r14 = r0.A05
            android.widget.TextView r12 = r0.A02
            r17 = 0
            X.AnonymousClass2Q7.A0c(r11, r12, r13, r14, r15, r16, r17)
            X.0tY r5 = r0.getFMessage()
            boolean r5 = X.C38621r6.A0z(r5)
            if (r5 != 0) goto L_0x0145
            r5 = 2131891306(0x7f12146a, float:1.9417328E38)
            r12.setText(r5)
            r5 = 2131231017(0x7f080129, float:1.8078103E38)
            r12.setCompoundDrawablesWithIntrinsicBounds(r5, r15, r15, r15)
            X.1k5 r5 = r0.A0A
            r12.setOnClickListener(r5)
            X.1k5 r5 = r0.A0B
            r1.setOnClickListener(r5)
            android.content.Context r6 = r0.getContext()
            r5 = 2131886229(0x7f120095, float:1.940703E38)
            X.C13680ns.A0t(r6, r1, r5)
            goto L_0x008e
        L_0x0145:
            X.1k5 r5 = X.C30011bb.A0A(r12, r0, r2)
            r1.setOnClickListener(r5)
            com.obwhatsapp.yo.mediapreviewbtn r8 = r0.prevbtn
            if (r8 == 0) goto L_0x0153
            r8.setCustomOnClickListener(r0, r5)
        L_0x0153:
            android.content.Context r8 = r0.getContext()
            r7 = 2131887569(0x7f1205d1, float:1.9409749E38)
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.CharSequence r5 = r12.getText()
            java.lang.String r5 = X.C13680ns.A0d(r8, r5, r6, r15, r7)
            r1.setContentDescription(r5)
            r5 = 2131886886(0x7f120326, float:1.9408364E38)
            X.AnonymousClass2JP.A03(r1, r5)
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31B.A0e(boolean):void");
    }

    public int A0q(int i2) {
        if (!C30011bb.A0Z(this)) {
            return super.A0q(i2);
        }
        return 0;
    }

    public void A0t() {
        A1J(false);
        A0e(false);
    }

    public void A0z() {
        boolean z2;
        if (this.A01 == null || C14570pP.A1W(this)) {
            C16730tY r6 = (C16730tY) this.A0O;
            C16750ta A002 = C16730tY.A00(r6);
            C28381Vw r3 = r6.A11;
            boolean z3 = r3.A02;
            if (z3 || A002.A0P) {
                File file = A002.A0F;
                boolean z4 = false;
                if (file != null) {
                    z2 = C30011bb.A0b(file);
                } else if (!z3 || A002.A0O) {
                    z2 = false;
                } else {
                    this.A0J.A09(R.string.str039b, 0);
                    return;
                }
                C30011bb.A0V(A002, r6, AnonymousClass000.A0r("viewmessage/ from_me:"), z3);
                if (!z2) {
                    C30011bb.A0Y(this, r3);
                    return;
                }
                C616339r r0 = this.A0c;
                if (r0 != null && r0.A08()) {
                    z4 = true;
                }
                C54592ho A09 = C30011bb.A09(this, r3, z4);
                A09.A06 = AnonymousClass000.A1V(AnonymousClass22O.A02(this));
                A09.A00 = 33;
                Intent A003 = A09.A00();
                if (this.prevon) {
                    A003.putExtra("prevonly", "prevonly");
                    this.prevon = false;
                }
                ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A04;
                if (conversationRowImage$RowImageView != null) {
                    C455529g.A07(getContext(), A003, conversationRowImage$RowImageView);
                }
                C30011bb.A0F(A003, this, conversationRowImage$RowImageView, r3);
            }
        }
    }

    public void A1G(C16740tZ r2, boolean z2) {
        if (!(r2 instanceof C39131ry)) {
            boolean A1a = C13680ns.A1a(r2, this.A0O);
            super.A1G(r2, z2);
            if (z2 || A1a) {
                A0e(A1a);
            }
        }
    }

    public void dispatchSetPressed(boolean z2) {
        boolean isPressed;
        super.dispatchSetPressed(z2);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A04;
        if (conversationRowImage$RowImageView != null && conversationRowImage$RowImageView.A0A != (isPressed = isPressed())) {
            conversationRowImage$RowImageView.A0A = isPressed;
            conversationRowImage$RowImageView.A02();
            conversationRowImage$RowImageView.invalidate();
        }
    }

    public int getBroadcastDrawableId() {
        return C30011bb.A00(this);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout019c;
    }

    public C38681rF getFMessage() {
        return (C38681rF) ((C16730tY) this.A0O);
    }

    public int getIncomingLayoutId() {
        return R.layout.layout019c;
    }

    public Drawable getKeepDrawable() {
        return C30011bb.A0Z(this) ? C30011bb.A04(this) : super.getKeepDrawable();
    }

    public int getMainChildMaxWidth() {
        return this.A04.A02.A03();
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout019d;
    }

    public int getReactionsViewVerticalOverlap() {
        Resources resources;
        int i2;
        if (this.A0S) {
            resources = getResources();
            i2 = R.dimen.dimen0763;
        } else if (!C30011bb.A0Z(this)) {
            return super.getReactionsViewVerticalOverlap();
        } else {
            resources = getResources();
            i2 = R.dimen.dimen0768;
        }
        return resources.getDimensionPixelOffset(i2);
    }

    public Drawable getStarDrawable() {
        return C30011bb.A0Z(this) ? AnonymousClass00T.A04(getContext(), R.drawable.message_star_media) : super.getStarDrawable();
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C38681rF);
        super.setFMessage(r2);
    }

    public final void setImageViewDimensions(C38681rF r4, C16750ta r5) {
        ConversationRowImage$RowImageView conversationRowImage$RowImageView;
        ImageView.ScaleType scaleType;
        int i2;
        int i3 = r5.A08;
        if (i3 == 0 || (i2 = r5.A06) == 0) {
            int i4 = 100;
            int A002 = C25791Ld.A00(r4, 100);
            if (A002 > 0) {
                conversationRowImage$RowImageView = this.A04;
            } else {
                i4 = AnonymousClass1UP.A01(getContext());
                conversationRowImage$RowImageView = this.A04;
                A002 = (i4 * 9) >> 4;
            }
            conversationRowImage$RowImageView.A04(i4, A002);
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            conversationRowImage$RowImageView = this.A04;
            conversationRowImage$RowImageView.A04(i3, i2);
            if (!this.A0S && !(this instanceof AnonymousClass319)) {
                scaleType = ImageView.ScaleType.MATRIX;
            }
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        conversationRowImage$RowImageView.setScaleType(scaleType);
    }
}
