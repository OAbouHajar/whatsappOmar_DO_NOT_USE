package com.obwhatsapp.biz.product.view.activity;

import X.AnonymousClass13V;
import X.AnonymousClass156;
import X.AnonymousClass15I;
import X.AnonymousClass1KA;
import X.AnonymousClass1KS;
import X.AnonymousClass1KT;
import X.AnonymousClass1KX;
import X.AnonymousClass1KZ;
import X.AnonymousClass1ZW;
import X.AnonymousClass26S;
import X.AnonymousClass2Ao;
import X.AnonymousClass2SO;
import X.AnonymousClass2TK;
import X.AnonymousClass2ql;
import X.AnonymousClass4VO;
import X.AnonymousClass5MU;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16010sH;
import X.C16080sP;
import X.C16150sX;
import X.C16760tb;
import X.C17200uh;
import X.C18630x0;
import X.C18640x1;
import X.C23081Ak;
import X.C23091Al;
import X.C24511Gf;
import X.C28011Tz;
import X.C28331Vq;
import X.C32291fz;
import X.C34331k5;
import X.C439822h;
import X.C449626k;
import X.C449726l;
import X.C49132Rg;
import X.C94984ln;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxConsumerShape54S0000000_2_I1;
import com.facebook.redex.IDxObserverShape23S0300000_1_I1;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.IDxPObserverShape58S0100000_2_I1;
import com.obwhatsapp.biz.catalog.IDxPObserverShape61S0100000_2_I1;
import com.obwhatsapp.biz.product.view.fragment.ReportProductDialogFragment;
import java.util.Collections;

public class ProductDetailActivity extends C449726l implements AnonymousClass2TK, AnonymousClass5MU {
    public C32291fz A00;
    public AnonymousClass13V A01;
    public C16080sP A02;
    public AnonymousClass2Ao A03;
    public C17200uh A04;
    public boolean A05;
    public final C439822h A06;
    public final AnonymousClass4VO A07;

    public ProductDetailActivity() {
        this(0);
        this.A07 = new IDxPObserverShape61S0100000_2_I1(this, 0);
        this.A06 = new IDxPObserverShape58S0100000_2_I1(this, 1);
    }

    public ProductDetailActivity(int i2) {
        this.A05 = false;
        C13680ns.A1G(this, 20);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0F = (C16760tb) r1.APV.get();
            this.A0N = (AnonymousClass1KX) r1.A3h.get();
            this.A0k = (C18630x0) r1.A1m.get();
            this.A0L = (C24511Gf) r1.A3U.get();
            this.A0K = (AnonymousClass1KT) r1.A3V.get();
            this.A0T = (AnonymousClass1KA) r1.A3a.get();
            this.A0j = (AnonymousClass1KS) r1.AGl.get();
            this.A0g = (AnonymousClass15I) r1.A3r.get();
            this.A0d = C16150sX.A0M(r1);
            this.A0O = (C28011Tz) r1.AJV.get();
            this.A0U = (C23081Ak) r1.A3Z.get();
            this.A0J = (AnonymousClass1KZ) r1.A3c.get();
            this.A0f = C16150sX.A0P(r1);
            this.A0P = (C18640x1) r1.A3X.get();
            this.A0I = C16150sX.A09(r1);
            this.A0C = (AnonymousClass2SO) A1T.A0y.get();
            this.A0S = C16150sX.A0A(r1);
            this.A0e = (AnonymousClass156) r1.ADH.get();
            this.A0h = C16150sX.A0W(r1);
            this.A0l = (C23091Al) r1.A3f.get();
            this.A04 = C16150sX.A0R(r1);
            this.A02 = C16150sX.A0Q(r1);
            this.A01 = (AnonymousClass13V) r1.A35.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0181, code lost:
        if (r6.A0K != false) goto L_0x0183;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A35() {
        /*
            r14 = this;
            r8 = r14
            r14.invalidateOptionsMenu()
            X.1mM r0 = r14.A0Q
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r0.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 8
            r7 = 0
            if (r0 != 0) goto L_0x02ef
            com.obwhatsapp.TextEmojiLabel r2 = r14.A0E
            X.1mM r0 = r14.A0Q
            java.lang.String r4 = r0.A04
            r3 = 0
            r6 = 450(0x1c2, float:6.3E-43)
            r5 = r3
            r2.A0F(r3, r4, r5, r6, r7)
            com.obwhatsapp.TextEmojiLabel r0 = r14.A0E
            r0.setVisibility(r7)
        L_0x0025:
            X.1mM r2 = r14.A0Q
            java.math.BigDecimal r0 = r2.A05
            if (r0 == 0) goto L_0x02e8
            X.1sq r0 = r2.A03
            if (r0 == 0) goto L_0x02e8
            android.widget.TextView r0 = r14.A09
            r0.setVisibility(r7)
            android.widget.TextView r2 = r14.A09
            X.1mM r0 = r14.A0Q
            java.math.BigDecimal r12 = r0.A05
            X.1sq r10 = r0.A03
            X.4jc r9 = r0.A02
            X.013 r11 = r14.A01
            java.util.Date r13 = new java.util.Date
            r13.<init>()
            android.text.SpannableString r0 = X.AnonymousClass2RK.A01(r8, r9, r10, r11, r12, r13)
            r2.setText(r0)
        L_0x004c:
            X.1mM r0 = r14.A0Q
            java.lang.String r0 = r0.A0A
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            com.obwhatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r3 = r14.A0Y
            if (r0 == 0) goto L_0x02d5
            r3.setVisibility(r1)
        L_0x005b:
            X.1mM r0 = r14.A0Q
            java.lang.String r0 = r0.A0C
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            android.widget.TextView r3 = r14.A08
            if (r0 == 0) goto L_0x02b5
            r3.setVisibility(r1)
        L_0x006a:
            X.1mM r0 = r14.A0Q
            java.lang.String r0 = r0.A0E
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            if (r0 != 0) goto L_0x02ae
            X.0uP r2 = r14.A0f
            com.whatsapp.jid.UserJid r0 = r14.A0i
            boolean r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x02ae
            android.widget.TextView r3 = r14.A0A
            X.1mM r0 = r14.A0Q
            java.lang.String r2 = r0.A0E
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r0, r2)
            r3.setText(r0)
            android.widget.TextView r0 = r14.A0A
            r0.setVisibility(r7)
        L_0x0092:
            X.1mM r0 = r14.A0Q
            int r2 = r0.A00
            r3 = 1
            com.obwhatsapp.components.Button r0 = r14.A0c
            if (r2 == 0) goto L_0x02a4
            r0.setEnabled(r7)
            com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector r0 = r14.A0a
            r0.setEnabled(r7)
        L_0x00a3:
            X.1mM r0 = r14.A0Q
            int r0 = r0.A00
            com.obwhatsapp.WaTextView r2 = r14.A0H
            if (r0 != r3) goto L_0x029f
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131890963(0x7f121313, float:1.9416633E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            com.obwhatsapp.WaTextView r0 = r14.A0H
            r0.setVisibility(r7)
        L_0x00be:
            com.obwhatsapp.biz.catalog.view.CatalogCarouselDetailImageView r4 = r14.A0W
            X.1mM r7 = r14.A0Q
            X.1KZ r6 = r14.A0J
            X.2Yq r5 = r14.A0V
            com.whatsapp.jid.UserJid r3 = r14.A0i
            int r2 = r14.A00
            r1 = 0
            if (r7 == 0) goto L_0x00da
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x00da
            if (r2 != 0) goto L_0x00da
            boolean r0 = r7.A02()
            if (r0 != 0) goto L_0x00da
            r1 = 1
        L_0x00da:
            r4.A04 = r5
            r4.A07 = r3
            r4.A0B = r1
            r4.A01 = r6
            X.1mM r0 = r4.A02
            boolean r0 = r7.equals(r0)
            r2 = 1
            r5 = r0 ^ 1
            r4.A02 = r7
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x0150
            r4.A0C = r2
            android.view.LayoutInflater r1 = X.C13680ns.A0G(r4)
            r0 = 2131559636(0x7f0d04d4, float:1.8744622E38)
            android.view.View r3 = r1.inflate(r0, r4, r2)
            r0 = 2131365497(0x7f0a0e79, float:1.835086E38)
            android.view.View r0 = X.C004601z.A0E(r3, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r4.A00 = r0
            r4.getContext()
            r0 = 0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            r0.setLayoutManager(r1)
            X.2rA r1 = new X.2rA
            r1.<init>(r4)
            r4.A06 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r2 = r4.A00
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166792(0x7f070648, float:1.794784E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.3RH r0 = new X.3RH
            r0.<init>(r4, r1)
            r2.A0m(r0)
            r0 = 2131365904(0x7f0a1010, float:1.8351686E38)
            android.view.View r3 = X.C004601z.A0E(r3, r0)
            com.obwhatsapp.biz.catalog.view.CarouselScrollbarView r3 = (com.obwhatsapp.biz.catalog.view.CarouselScrollbarView) r3
            r4.A05 = r3
            androidx.recyclerview.widget.RecyclerView r2 = r4.A00
            r3.A00 = r2
            r1 = 1
            com.facebook.redex.IDxSListenerShape35S0100000_2_I1 r0 = new com.facebook.redex.IDxSListenerShape35S0100000_2_I1
            r0.<init>(r3, r1)
            r2.A0o(r0)
        L_0x0150:
            if (r5 == 0) goto L_0x0157
            X.2rA r0 = r4.A06
            r0.A01()
        L_0x0157:
            X.2ql r5 = r14.A0b
            int r4 = r14.A00
            X.1mM r3 = r14.A0Q
            boolean r0 = r5.A06(r3, r4)
            r2 = 1
            r1 = 2
            if (r0 == 0) goto L_0x023c
            X.027 r0 = r5.A03
            java.lang.Object r6 = r0.A01()
            X.1mD r6 = (X.C35611mD) r6
            X.1mM r0 = r14.A0Q
            if (r0 == 0) goto L_0x0299
            int r0 = r0.A00
            if (r0 != r1) goto L_0x0299
            X.0uc r0 = r14.A0I
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0299
            if (r6 == 0) goto L_0x0299
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x0299
        L_0x0183:
            X.0rz r2 = r14.A09
            com.whatsapp.jid.UserJid r0 = r14.A0i
            java.lang.String r0 = r0.getRawString()
            java.lang.String r2 = r2.A0R(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x020d
            java.lang.String r0 = r6.A09
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x020d
            r0 = 2131889689(0x7f120e19, float:1.9414049E38)
            java.lang.String r6 = r14.getString(r0)
            android.text.Spannable[] r7 = new android.text.Spannable[r5]
            r0 = 2131887152(0x7f120430, float:1.9408903E38)
            java.lang.String r0 = r14.getString(r0)
            android.text.SpannableStringBuilder r3 = X.C13690nt.A0F(r0)
            com.obwhatsapp.IDxTSpanShape54S0100000_2_I1 r2 = new com.obwhatsapp.IDxTSpanShape54S0100000_2_I1
            r2.<init>((android.content.Context) r14, (java.lang.Object) r14, (int) r4)
            int r1 = r0.length()
            r0 = 33
            r3.setSpan(r2, r4, r1, r0)
            r7[r4] = r3
        L_0x01c3:
            android.text.SpannableStringBuilder r3 = X.C45922Bq.A02(r6, r7)
            com.obwhatsapp.TextEmojiLabel r0 = r14.A0D
            X.C30531cW.A02(r0)
            com.obwhatsapp.TextEmojiLabel r1 = r14.A0D
            X.01V r0 = r14.A08
            X.C30531cW.A03(r1, r0)
            com.obwhatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setLinksClickable(r5)
            com.obwhatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setFocusable(r4)
            com.obwhatsapp.TextEmojiLabel r2 = r14.A0D
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            X.C13690nt.A0w(r1, r2, r0)
            com.obwhatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setText(r3)
            com.obwhatsapp.TextEmojiLabel r1 = r14.A0D
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.setGravity(r0)
            r0 = 2131365494(0x7f0a0e76, float:1.8350855E38)
            android.view.View r1 = r14.findViewById(r0)
            r0 = 2131101279(0x7f06065f, float:1.7814963E38)
            X.C13680ns.A0u(r14, r1, r0)
        L_0x0203:
            com.obwhatsapp.TextEmojiLabel r1 = r14.A0D
            r0 = 0
        L_0x0206:
            r1.setVisibility(r0)
            super.A35()
            return
        L_0x020d:
            if (r2 != 0) goto L_0x0211
            java.lang.String r2 = r6.A09
        L_0x0211:
            r0 = 2131889690(0x7f120e1a, float:1.941405E38)
            java.lang.String r6 = r14.getString(r0)
            android.text.SpannableStringBuilder[] r7 = new android.text.SpannableStringBuilder[r1]
            android.text.SpannableStringBuilder r0 = X.C13690nt.A0F(r2)
            r7[r4] = r0
            r0 = 2131887152(0x7f120430, float:1.9408903E38)
            java.lang.String r0 = r14.getString(r0)
            android.text.SpannableStringBuilder r3 = X.C13690nt.A0F(r0)
            com.obwhatsapp.IDxTSpanShape54S0100000_2_I1 r2 = new com.obwhatsapp.IDxTSpanShape54S0100000_2_I1
            r2.<init>((android.content.Context) r14, (java.lang.Object) r14, (int) r4)
            int r1 = r0.length()
            r0 = 33
            r3.setSpan(r2, r4, r1, r0)
            r7[r5] = r3
            goto L_0x01c3
        L_0x023c:
            if (r4 == r1) goto L_0x024e
            if (r3 == 0) goto L_0x026b
            X.1mK r0 = r3.A01
            if (r0 == 0) goto L_0x0248
            int r0 = r0.A00
            if (r0 != 0) goto L_0x024e
        L_0x0248:
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x026b
        L_0x024e:
            r3 = 2131891202(0x7f121402, float:1.9417117E38)
        L_0x0251:
            X.2ql r0 = r14.A0b
            X.027 r0 = r0.A03
            java.lang.Object r6 = r0.A01()
            X.1mD r6 = (X.C35611mD) r6
            X.0uc r0 = r14.A0I
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0286
            if (r6 == 0) goto L_0x0286
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x0286
            goto L_0x0183
        L_0x026b:
            r0 = 3
            if (r4 != r0) goto L_0x0272
            r3 = 2131887089(0x7f1203f1, float:1.9408775E38)
            goto L_0x0251
        L_0x0272:
            if (r3 == 0) goto L_0x0278
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x027a
        L_0x0278:
            if (r4 != r2) goto L_0x0299
        L_0x027a:
            X.0wP r0 = r14.A07
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0299
            r3 = 2131887185(0x7f120451, float:1.940897E38)
            goto L_0x0251
        L_0x0286:
            com.obwhatsapp.TextEmojiLabel r2 = r14.A0D
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131099909(0x7f060105, float:1.7812185E38)
            X.C13690nt.A0w(r1, r2, r0)
            com.obwhatsapp.TextEmojiLabel r0 = r14.A0D
            r0.setText(r3)
            goto L_0x0203
        L_0x0299:
            com.obwhatsapp.TextEmojiLabel r1 = r14.A0D
            r0 = 8
            goto L_0x0206
        L_0x029f:
            r2.setVisibility(r1)
            goto L_0x00be
        L_0x02a4:
            r0.setEnabled(r3)
            com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector r0 = r14.A0a
            r0.setEnabled(r3)
            goto L_0x00a3
        L_0x02ae:
            android.widget.TextView r0 = r14.A0A
            r0.setVisibility(r1)
            goto L_0x0092
        L_0x02b5:
            X.1mM r0 = r14.A0Q
            java.lang.String r2 = r0.A0C
            r0 = 420(0x1a4, float:5.89E-43)
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r0, r2)
            r3.setText(r0)
            android.widget.TextView r3 = r14.A08
            r2 = 22
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r0.<init>(r14, r2)
            r3.setOnClickListener(r0)
            android.widget.TextView r0 = r14.A08
            r0.setVisibility(r7)
            goto L_0x006a
        L_0x02d5:
            r0 = 180(0xb4, float:2.52E-43)
            r3.A00 = r0
            X.1mM r0 = r14.A0Q
            java.lang.String r2 = r0.A0A
            r0 = 0
            r3.A0I(r0, r2)
            com.obwhatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r14.A0Y
            r0.setVisibility(r7)
            goto L_0x005b
        L_0x02e8:
            android.widget.TextView r0 = r14.A09
            r0.setVisibility(r1)
            goto L_0x004c
        L_0x02ef:
            com.obwhatsapp.TextEmojiLabel r0 = r14.A0E
            r0.setVisibility(r1)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.biz.product.view.activity.ProductDetailActivity.A35():void");
    }

    public final void A37() {
        int dimension = (int) getResources().getDimension(R.dimen.dimen0529);
        this.A0T.A08(new AnonymousClass26S(this.A0i, Integer.valueOf(getIntent().getIntExtra("thumb_width", dimension)), Integer.valueOf(getIntent().getIntExtra("thumb_height", dimension)), this.A0p, this.A0S.A00, false));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1 && i2 == 55) {
            this.A0N.A02(this, this.A0V, this.A0i, this.A0i, Collections.singletonList(this.A0Q), 2, 0, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01.A02(this.A06);
        View findViewById = findViewById(R.id.product_business_info_container);
        C13680ns.A1L(this, this.A0b.A05, 11);
        this.A0b.A03.A0A(this, new IDxObserverShape23S0300000_1_I1(bundle, findViewById, this, 0));
        C13680ns.A1M(this, this.A0b.A07, 3);
        this.A0O.A02(this.A07);
        this.A0T.A0N.add(this);
        if (findViewById != null && !this.A01.A0I(this.A0i)) {
            C13680ns.A1I(this, R.id.divider_bizinfo, 0);
            findViewById.setVisibility(0);
            View findViewById2 = findViewById(R.id.contact_info_container);
            TextView A0N = C13680ns.A0N(this, R.id.contact_name);
            ImageView imageView = (ImageView) findViewById(R.id.contact_photo);
            C28331Vq A002 = this.A0f.A00(this.A0i);
            String str = A002 == null ? null : A002.A08;
            C16010sH A0A = this.A0d.A0A(this.A0i);
            if (A0N != null) {
                if (AnonymousClass1ZW.A0E(str)) {
                    str = this.A02.A08(A0A);
                }
                A0N.setText(str);
            }
            AnonymousClass2Ao A042 = this.A04.A04(this, "product-detail-activity");
            this.A03 = A042;
            A042.A06(imageView, A0A);
            C34331k5.A01(findViewById2, this, 19);
        }
        C449626k r3 = this.A0b.A0D;
        r3.A04.Acl(new RunnableRunnableShape4S0100000_I0_3(r3, 12));
        this.A0M.A06();
        this.A0g.A07(new IDxConsumerShape54S0000000_2_I1(1), this.A0i);
        this.A0g.A07(new C94984ln(0), this.A0i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r2 == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            android.view.MenuInflater r1 = r3.getMenuInflater()
            r0 = 2131623953(0x7f0e0011, float:1.8875072E38)
            r1.inflate(r0, r4)
            X.2ql r2 = r3.A0b
            int r1 = r3.A00
            X.1mM r0 = r3.A0Q
            boolean r2 = r2.A06(r0, r1)
            r0 = 2131364574(0x7f0a0ade, float:1.8348989E38)
            android.view.MenuItem r1 = r4.findItem(r0)
            boolean r0 = r3.A0s
            if (r0 != 0) goto L_0x0022
            r0 = 1
            if (r2 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r1.setVisible(r0)
            boolean r0 = super.onCreateOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.biz.product.view.activity.ProductDetailActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public void onDestroy() {
        this.A0T.A0N.remove(this);
        this.A0O.A03(this.A07);
        this.A01.A03(this.A06);
        super.onDestroy();
        AnonymousClass2Ao r0 = this.A03;
        if (r0 != null) {
            r0.A00();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (R.id.menu_report == itemId) {
            Afb(new ReportProductDialogFragment(), (String) null);
            return true;
        } else if (16908332 != itemId) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0b.A05(this);
            return true;
        }
    }

    public void onStart() {
        super.onStart();
        if (getIntent().getBooleanExtra("partial_loaded", false)) {
            AnonymousClass2ql r2 = this.A0b;
            C13700nu.A0V(r2.A07, r2.A0E.A0A());
        }
    }
}
