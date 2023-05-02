package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxIListenerShape257S0100000_2_I1;
import com.facebook.redex.IDxTRendererShape197S0100000_1_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.yo.Conversation;
import java.util.Set;

/* renamed from: X.318  reason: invalid class name */
public class AnonymousClass318 extends C602330p {
    public C52822eV A00;
    public final View A01;
    public final View A02;
    public final View A03 = findViewById(R.id.control_btn_holder);
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final FrameLayout A07;
    public final ImageView A08 = C13680ns.A0K(this, R.id.icon);
    public final ImageView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextEmojiLabel A0E;
    public final TextEmojiLabel A0F;
    public final WaImageView A0G = ((WaImageView) findViewById(R.id.control_btn));
    public final AnonymousClass25V A0H = new IDxTRendererShape197S0100000_1_I1(this, 0);
    public final C33741j5 A0I;

    public AnonymousClass318(Context context, AnonymousClass1YG r5, C38631rA r6) {
        super(context, r5, r6);
        C33741j5 r2 = new C33741j5(findViewById(R.id.progress_bar));
        this.A0I = r2;
        r2.A05(new IDxIListenerShape257S0100000_2_I1(context, 1));
        TextEmojiLabel A0R = C13680ns.A0R(this, R.id.title);
        this.A0F = A0R;
        Conversation.doc_paintTitle(this, A0R);
        TextView A0L = C13680ns.A0L(this, R.id.media_transfer_eta);
        this.A0D = A0L;
        Conversation.doc_paintDetails(this, A0L);
        this.A06 = C13700nu.A07(this, R.id.metadata_container);
        this.A02 = findViewById(R.id.content);
        TextView A0M = C13680ns.A0M(this, R.id.info);
        this.A0C = A0M;
        Conversation.doc_paintDetails(this, A0M);
        this.A01 = findViewById(R.id.bullet_info);
        TextView A0M2 = C13680ns.A0M(this, R.id.file_size);
        this.A0A = A0M2;
        Conversation.doc_paintDetails(this, A0M2);
        TextView A0M3 = C13680ns.A0M(this, R.id.file_type);
        this.A0B = A0M3;
        Conversation.doc_paintDetails(this, A0M3);
        this.A09 = C13680ns.A0K(this, R.id.preview);
        this.A04 = findViewById(R.id.preview_separator);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.document_frame);
        this.A07 = frameLayout;
        TextEmojiLabel A0R2 = C13680ns.A0R(this, R.id.caption);
        this.A0E = A0R2;
        if (A0R2 != null) {
            Conversation.doc_paintDetails(this, A0R2);
            C30531cW.A02(A0R2);
            C13690nt.A1C(A0R2);
        }
        this.A05 = findViewById(R.id.text_and_date);
        if (frameLayout != null) {
            frameLayout.setForeground(getInnerFrameForegroundDrawable());
        }
        A1Q();
    }

    public void A0t() {
        A1Q();
        A1J(false);
    }

    public void A0z() {
        Activity A022 = C19980zJ.A02(this);
        if (A022 instanceof C14550pN) {
            AnonymousClass1PD r7 = this.A0P;
            AnonymousClass00B.A06(r7);
            C14870pt r3 = this.A0J;
            AnonymousClass00B.A06(r3);
            C16300so r1 = this.A0F;
            AnonymousClass00B.A06(r1);
            C16320sq r8 = this.A1e;
            AnonymousClass00B.A06(r8);
            C19980zJ r0 = this.A0I;
            AnonymousClass00B.A06(r0);
            C16500tA r5 = this.A17;
            AnonymousClass00B.A06(r5);
            C16260sj r4 = this.A01;
            AnonymousClass00B.A06(r4);
            int A002 = C55702kC.A00(r0, r1, (C14550pN) A022, r3, r4, r5, (C38631rA) ((C16730tY) this.A0O), r7, r8);
            if (A002 == 2) {
                A1P();
            } else if (A002 == 4) {
                this.A0J.A07(R.string.str189e, 1);
            }
        }
    }

    public void A1G(C16740tZ r2, boolean z2) {
        if (!(r2 instanceof C39131ry)) {
            boolean A1a = C13680ns.A1a(r2, this.A0O);
            super.A1G(r2, z2);
            if (z2 || A1a) {
                A1Q();
            }
        }
    }

    public void A1N(View view, TextEmojiLabel textEmojiLabel, String str) {
        super.A1N(view, textEmojiLabel, str);
        if (TextUtils.isEmpty(str) && textEmojiLabel != null) {
            ViewGroup viewGroup = this.A04;
            viewGroup.setPadding(getResources().getDimensionPixelSize(R.dimen.dimen0247), 0, getResources().getDimensionPixelSize(R.dimen.dimen0247), 0);
            C13680ns.A12(viewGroup);
            TextView textView = this.A0E;
            int secondaryTextColor = getSecondaryTextColor();
            View view2 = this.A05;
            if (view2 == null) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen023f);
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen023e);
                AnonymousClass000.A0O(view2).bottomMargin = dimensionPixelSize;
                AnonymousClass000.A0O(view2).topMargin = dimensionPixelSize2;
                return;
            }
            AnonymousClass000.A0O(view2).topMargin = (-viewGroup.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.dimen023f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1Q() {
        /*
            r15 = this;
            X.0tZ r9 = r15.A0O
            X.0tY r9 = (X.C16730tY) r9
            X.1rA r9 = (X.C38631rA) r9
            X.0ta r0 = r9.A02
            X.AnonymousClass00B.A06(r0)
            android.widget.ImageView r1 = r15.A08
            android.content.Context r0 = r15.getContext()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4Y6.A00(r0, r9)
            r1.setImageDrawable(r0)
            java.lang.String r1 = r9.A14()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0161
            android.content.Context r1 = r15.getContext()
            r0 = 2131892391(0x7f1218a7, float:1.9419529E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x002d:
            com.obwhatsapp.TextEmojiLabel r0 = r15.A0F
            r0.setText(r1)
            X.0tm r0 = r9.A0F()
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r0.A04()
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x0152
            X.1Ld r7 = r15.A1d
            android.widget.ImageView r8 = r15.A09
            X.25V r10 = r15.A0H
            X.1Vw r11 = r9.A11
            r13 = 0
            r12 = 480(0x1e0, float:6.73E-43)
            r14 = 0
            r7.A0A(r8, r9, r10, r11, r12, r13, r14)
        L_0x0051:
            java.lang.String r4 = r9.A01
            android.view.View r3 = r15.A05
            com.obwhatsapp.TextEmojiLabel r0 = r15.A0E
            r15.A1N(r3, r0, r4)
            X.0tY r4 = r15.getFMessage()
            boolean r0 = X.C38621r6.A10(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0101
            android.view.View r0 = r15.A03
            r0.setVisibility(r3)
            com.obwhatsapp.WaImageView r8 = r15.A0G
            r0 = 2131232037(0x7f080525, float:1.8080172E38)
            r8.setImageResource(r0)
            X.1k5 r0 = r15.A08
            r8.setOnClickListener(r0)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            X.AnonymousClass2JP.A03(r8, r0)
            X.1Vw r0 = r9.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00f4
            long r4 = r9.A14
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00f4
            android.content.Context r1 = r15.getContext()
            r0 = 2131892113(0x7f121791, float:1.9418965E38)
            X.C13680ns.A0t(r1, r8, r0)
        L_0x0095:
            android.view.View r4 = r15.A02
            X.1k5 r1 = r15.A0B
        L_0x0099:
            r4.setOnClickListener(r1)
        L_0x009c:
            android.widget.TextView r0 = r15.A0D
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r15.A06
            r0.setVisibility(r3)
            r15.A0x()
            android.widget.TextView r6 = r15.A0A
            X.013 r5 = r15.A0K
            long r0 = r9.A01
            java.lang.String r0 = X.AnonymousClass2GQ.A03(r5, r0)
            r6.setText(r0)
            int r0 = r9.A00
            android.widget.TextView r5 = r15.A0C
            if (r0 == 0) goto L_0x00eb
            r5.setVisibility(r3)
            android.view.View r0 = r15.A01
            r0.setVisibility(r3)
            X.013 r2 = r15.A0K
            java.lang.String r1 = r9.A06
            int r0 = r9.A00
            java.lang.String r0 = X.C18820xJ.A05(r2, r1, r0)
            r5.setText(r0)
        L_0x00d1:
            java.lang.String r1 = X.C16730tY.A01(r9)
            r0 = 10
            java.lang.String r0 = X.AnonymousClass1ZW.A05(r0, r1)
            android.widget.TextView r1 = r15.A0B
            java.lang.CharSequence r0 = r15.A0r(r0)
            r1.setText(r0)
            X.C30011bb.A0K(r4, r15)
            r15.A1O(r9)
            return
        L_0x00eb:
            r5.setVisibility(r2)
            android.view.View r0 = r15.A01
            r0.setVisibility(r2)
            goto L_0x00d1
        L_0x00f4:
            android.content.Context r4 = r15.getContext()
            r0 = 2131892112(0x7f121790, float:1.9418963E38)
            X.C13680ns.A0t(r4, r8, r0)
            android.view.View r4 = r15.A02
            goto L_0x0099
        L_0x0101:
            boolean r1 = X.C38621r6.A11(r4)
            com.obwhatsapp.WaImageView r4 = r15.A0G
            X.AnonymousClass2JP.A01(r4)
            android.view.View r0 = r15.A03
            if (r1 == 0) goto L_0x0112
            r0.setVisibility(r2)
            goto L_0x0095
        L_0x0112:
            r0.setVisibility(r3)
            X.0tY r0 = r15.getFMessage()
            boolean r0 = X.C38621r6.A0z(r0)
            if (r0 == 0) goto L_0x013b
            r0 = 2131232040(0x7f080528, float:1.8080178E38)
            r4.setImageResource(r0)
            android.content.Context r1 = r15.getContext()
            r0 = 2131886886(0x7f120326, float:1.9408364E38)
            X.C13680ns.A0t(r1, r4, r0)
            X.1k5 r0 = r15.A09
            r4.setOnClickListener(r0)
            android.view.View r4 = r15.A02
            r4.setOnClickListener(r0)
            goto L_0x009c
        L_0x013b:
            r0 = 2131232047(0x7f08052f, float:1.8080192E38)
            r4.setImageResource(r0)
            android.content.Context r1 = r15.getContext()
            r0 = 2131891306(0x7f12146a, float:1.9417328E38)
            X.C13680ns.A0t(r1, r4, r0)
            X.1k5 r0 = r15.A0A
            r4.setOnClickListener(r0)
            goto L_0x0095
        L_0x0152:
            android.widget.ImageView r0 = r15.A09
            r0.setTag(r1)
            r0.setVisibility(r2)
            android.view.View r0 = r15.A04
            r0.setVisibility(r2)
            goto L_0x0051
        L_0x0161:
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.AnonymousClass1ZW.A05(r0, r1)
            java.lang.CharSequence r1 = r15.A0r(r0)
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass318.A1Q():void");
    }

    public int getCenteredLayoutId() {
        return R.layout.layout018d;
    }

    public C38631rA getFMessage() {
        return (C38631rA) ((C16730tY) this.A0O);
    }

    public int getIncomingLayoutId() {
        return R.layout.layout018d;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        FrameLayout frameLayout = this.A07;
        if (frameLayout != null) {
            innerFrameLayouts.add(frameLayout);
        }
        return innerFrameLayouts;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0190;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C38631rA);
        super.setFMessage(r2);
    }
}
