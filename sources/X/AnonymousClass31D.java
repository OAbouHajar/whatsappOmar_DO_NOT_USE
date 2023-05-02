package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.location.WaMapView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.31D  reason: invalid class name */
public class AnonymousClass31D extends AnonymousClass30F {
    public static final Set A0I;
    public C615139f A00;
    public C26681Os A01;
    public C809846j A02;
    public C24551Gj A03;
    public boolean A04;
    public final View A05 = findViewById(R.id.control_frame);
    public final View A06;
    public final View A07 = findViewById(R.id.progress_bar);
    public final View A08 = findViewById(R.id.thumb_button);
    public final FrameLayout A09;
    public final ImageView A0A = C13680ns.A0K(this, R.id.thumb);
    public final LinearLayout A0B;
    public final TextView A0C = C13680ns.A0M(this, R.id.control_btn);
    public final TextView A0D;
    public final TextView A0E;
    public final TextEmojiLabel A0F;
    public final WaMapView A0G = ((WaMapView) findViewById(R.id.map_holder));
    public final AnonymousClass1ZQ A0H;

    static {
        HashSet A0o = C13680ns.A0o();
        A0o.add("www.facebook.com");
        A0o.add("maps.google.com");
        A0o.add("foursquare.com");
        A0I = Collections.unmodifiableSet(A0o);
    }

    public AnonymousClass31D(Context context, AnonymousClass1YG r4, C38751rM r5) {
        super(context, r4, r5);
        TextEmojiLabel A0R = C13680ns.A0R(this, R.id.place_name);
        this.A0F = A0R;
        this.A0E = C13680ns.A0M(this, R.id.place_address);
        this.A0D = C13680ns.A0M(this, R.id.host_view);
        this.A06 = findViewById(R.id.message_info_holder);
        this.A0B = (LinearLayout) findViewById(R.id.location_template_message_link_frame);
        if (A0R != null) {
            A0R.setLongClickable(C30531cW.A05(A0R));
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.location_bubble_frame);
        this.A09 = frameLayout;
        if (frameLayout != null) {
            frameLayout.setForeground(getInnerFrameForegroundDrawable());
        }
        this.A0H = C47612Jr.A00(context);
        A1M();
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

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r0.A0M.A0E(X.C16620tM.A02, 2938) != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a8, code lost:
        if (r2.A04 == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f0, code lost:
        if (r4 == 2) goto L_0x01f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M() {
        /*
            r23 = this;
            r0 = r23
            X.0tZ r1 = r0.A0O
            X.1rM r1 = (X.C38751rM) r1
            double r3 = r1.A01
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0014
            double r3 = r1.A00
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x001e
        L_0x0014:
            android.view.View r3 = r0.A08
            r2 = 36
            X.C34331k5.A04(r3, r0, r1, r2)
            X.C30011bb.A0K(r3, r0)
        L_0x001e:
            com.obwhatsapp.location.WaMapView r11 = r0.A0G
            X.1P7 r2 = r0.A0N
            X.AnonymousClass00B.A06(r2)
            r11.A03(r2, r1)
            android.view.View r10 = r0.A05
            r9 = 8
            if (r10 == 0) goto L_0x0031
            r10.setVisibility(r9)
        L_0x0031:
            android.view.View r12 = r0.A06
            r8 = 0
            if (r12 == 0) goto L_0x0119
            com.obwhatsapp.TextEmojiLabel r7 = r0.A0F
            if (r7 == 0) goto L_0x0119
            android.widget.TextView r6 = r0.A0E
            if (r6 == 0) goto L_0x0119
            java.lang.String r5 = r1.A01
            java.lang.String r4 = r1.A00
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x004e
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x0230
        L_0x004e:
            android.widget.LinearLayout r14 = r0.A0B
            if (r14 == 0) goto L_0x005f
            X.0pd r13 = r0.A0M
            r3 = 2938(0xb7a, float:4.117E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r3 = r13.A0E(r2, r3)
            r2 = 1
            if (r3 == 0) goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0230
            java.lang.String r3 = r1.A14()
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x022b
            r7.setVisibility(r8)
            r13 = 150(0x96, float:2.1E-43)
            int r2 = r5.length()
            if (r2 <= r13) goto L_0x0083
            java.lang.String r5 = r5.substring(r8, r13)
        L_0x0083:
            android.content.Context r17 = r0.getContext()
            X.0pt r2 = r0.A0J
            r19 = r2
            X.01V r15 = r0.A0J
            X.0uW r13 = r0.A0K
            X.2uk r2 = new X.2uk
            r16 = r2
            r18 = r13
            r20 = r15
            r21 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            if (r14 == 0) goto L_0x00b8
            android.content.Context r17 = r0.getContext()
            r22 = 17170444(0x106000c, float:2.4611947E-38)
            X.0pt r15 = r0.A0J
            X.01V r14 = r0.A0J
            X.0uW r13 = r0.A0K
            X.2uk r2 = new X.2uk
            r16 = r2
            r18 = r13
            r19 = r15
            r20 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x00b8:
            android.text.SpannableStringBuilder r14 = X.C13690nt.A0F(r5)
            X.AnonymousClass00B.A06(r5)
            int r13 = r5.length()
            r5 = 18
            r14.setSpan(r2, r8, r13, r5)
            java.lang.CharSequence r5 = r0.A0r(r14)
            android.widget.TextView$BufferType r2 = android.widget.TextView.BufferType.SPANNABLE
            r7.setText(r5, r2)
        L_0x00d1:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x0226
            r5 = 300(0x12c, float:4.2E-43)
            int r2 = r4.length()
            if (r2 <= r5) goto L_0x00e3
            java.lang.String r4 = r4.substring(r8, r5)
        L_0x00e3:
            java.lang.CharSequence r2 = r0.A0r(r4)
            r6.setText(r2)
            r6.setVisibility(r8)
        L_0x00ed:
            r4 = 1
            com.whatsapp.util.ViewOnClickCListenerShape1S1100000_I1 r2 = new com.whatsapp.util.ViewOnClickCListenerShape1S1100000_I1
            r2.<init>(r4, r3, r0)
            r6.setOnClickListener(r2)
            android.widget.TextView r4 = r0.A0D
            if (r4 == 0) goto L_0x0116
            android.net.Uri r2 = android.net.Uri.parse(r3)
            java.lang.String r3 = r2.getHost()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0221
            java.util.Set r2 = A0I
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0221
            r4.setText(r3)
            r4.setVisibility(r8)
        L_0x0116:
            r12.setVisibility(r8)
        L_0x0119:
            android.widget.TextView r5 = r0.A0C
            if (r5 == 0) goto L_0x0120
            r5.setVisibility(r9)
        L_0x0120:
            int r3 = r1.A02
            r2 = 1
            r15 = 0
            if (r3 != r2) goto L_0x01e2
            android.view.View r2 = r0.A07
            if (r2 == 0) goto L_0x012d
            r2.setVisibility(r8)
        L_0x012d:
            X.1Vw r2 = r1.A11
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x013d
            if (r10 == 0) goto L_0x0138
            r10.setVisibility(r8)
        L_0x0138:
            android.view.View r2 = r0.A08
            r2.setOnClickListener(r15)
        L_0x013d:
            r2 = 2
            com.facebook.redex.IDxTRendererShape199S0100000_2_I1 r5 = new com.facebook.redex.IDxTRendererShape199S0100000_2_I1
            r5.<init>(r0, r2)
            int r4 = r11.getVisibility()
            X.1Ld r3 = r0.A1d
            X.AnonymousClass00B.A06(r3)
            android.widget.ImageView r2 = r0.A0A
            if (r4 != 0) goto L_0x01dd
            r3.A07(r2, r1, r5)
        L_0x0153:
            X.1uH r2 = r1.A0N
            if (r2 == 0) goto L_0x01c5
            r2 = 2131367111(0x7f0a14c7, float:1.8354135E38)
            android.view.ViewGroup r4 = X.C13690nt.A0K(r0, r2)
            if (r4 == 0) goto L_0x01c4
            X.1xL r2 = X.C42171xL.A00(r15, r1)
            r4.setVisibility(r8)
            X.39f r3 = r0.A00
            if (r3 != 0) goto L_0x019f
            android.content.Context r9 = r0.getContext()
            X.0uW r10 = r0.A0K
            X.1Mg r14 = r0.A12
            X.1Ld r6 = r0.A1d
            X.0uk r11 = r0.A0Y
            X.0pt r8 = r0.A0J
            X.0sq r7 = r0.A1e
            X.0ua r5 = r0.A0O
            X.188 r3 = r0.A0y
            X.4NE r12 = new X.4NE
            r12.<init>(r8, r5, r3, r7)
            X.46j r13 = r0.A02
            X.1Gj r3 = r0.A03
            X.39f r8 = new X.39f
            r17 = r6
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A00 = r8
            com.obwhatsapp.webpagepreview.WebPagePreviewView r3 = r8.A0C
            X.C13700nu.A0Q(r3, r4)
            X.39f r3 = r0.A00
            com.obwhatsapp.webpagepreview.WebPagePreviewView r3 = r3.A0C
            X.C30011bb.A0K(r3, r0)
        L_0x019f:
            X.1ZQ r5 = r0.A0H
            boolean r3 = r5 instanceof X.AnonymousClass1ZP
            if (r3 == 0) goto L_0x01aa
            boolean r3 = r2.A04
            r4 = 1
            if (r3 != 0) goto L_0x01ab
        L_0x01aa:
            r4 = 0
        L_0x01ab:
            r0.A04 = r4
            X.39f r6 = r0.A00
            X.1Os r3 = r0.A01
            boolean r12 = r3.A00(r1)
            X.1Os r3 = r0.A01
            boolean r13 = r3.A01(r1)
            r14 = 0
            r9 = r5
            r10 = r2
            r11 = r4
            r8 = r1
            r7 = r0
            r6.A02(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x01c4:
            return
        L_0x01c5:
            r1 = 2131367111(0x7f0a14c7, float:1.8354135E38)
            android.view.ViewGroup r2 = X.C13690nt.A0K(r0, r1)
            if (r2 == 0) goto L_0x01c4
            X.39f r1 = r0.A00
            if (r1 == 0) goto L_0x01d9
            com.obwhatsapp.webpagepreview.WebPagePreviewView r1 = r1.A0C
            r2.removeView(r1)
            r0.A00 = r15
        L_0x01d9:
            r2.setVisibility(r9)
            return
        L_0x01dd:
            r3.A08(r2, r1, r5)
            goto L_0x0153
        L_0x01e2:
            X.0tZ r3 = r0.A0O
            X.1d9 r3 = (X.C30901d9) r3
            X.1Vw r2 = r3.A11
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x01f2
            int r4 = r3.A02
            r2 = 2
            r3 = 1
            if (r4 != r2) goto L_0x01f3
        L_0x01f2:
            r3 = 0
        L_0x01f3:
            android.view.View r2 = r0.A07
            if (r3 != 0) goto L_0x01fe
            if (r2 == 0) goto L_0x013d
            r2.setVisibility(r9)
            goto L_0x013d
        L_0x01fe:
            if (r2 == 0) goto L_0x0203
            r2.setVisibility(r9)
        L_0x0203:
            if (r5 == 0) goto L_0x0213
            r5.setVisibility(r8)
            r2 = 2131891306(0x7f12146a, float:1.9417328E38)
            r5.setText(r2)
            r2 = 10
            X.C34331k5.A03(r5, r0, r2)
        L_0x0213:
            if (r10 == 0) goto L_0x0218
            r10.setVisibility(r8)
        L_0x0218:
            android.view.View r3 = r0.A08
            r2 = 10
            X.C34331k5.A03(r3, r0, r2)
            goto L_0x013d
        L_0x0221:
            r4.setVisibility(r9)
            goto L_0x0116
        L_0x0226:
            r6.setVisibility(r9)
            goto L_0x00ed
        L_0x022b:
            r7.setVisibility(r9)
            goto L_0x00d1
        L_0x0230:
            r7.setVisibility(r9)
            r6.setVisibility(r9)
            android.widget.LinearLayout r2 = r0.A0B
            if (r2 == 0) goto L_0x023d
            r2.setBackgroundResource(r8)
        L_0x023d:
            android.widget.TextView r2 = r0.A0D
            if (r2 == 0) goto L_0x0116
            r2.setVisibility(r9)
            goto L_0x0116
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31D.A1M():void");
    }

    public int getCenteredLayoutId() {
        return getIncomingLayoutId();
    }

    public C38751rM getFMessage() {
        return (C38751rM) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01a6;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        FrameLayout frameLayout = this.A09;
        if (frameLayout != null) {
            innerFrameLayouts.add(frameLayout);
        }
        return innerFrameLayouts;
    }

    public int getMainChildMaxWidth() {
        if (this.A04) {
            return C31171dd.A02(this);
        }
        return 0;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01a8;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C30901d9);
        this.A0O = r2;
    }
}
