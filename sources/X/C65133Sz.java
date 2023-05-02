package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3Sz  reason: invalid class name and case insensitive filesystem */
public abstract class C65133Sz extends C005602k {
    public C65133Sz(View view) {
        super(view);
    }

    public void A07() {
        RecyclerView recyclerView;
        if (this instanceof C72653mU) {
            recyclerView = ((C72653mU) this).A00;
        } else if (this instanceof C72643mT) {
            recyclerView = ((C72643mT) this).A00;
        } else if (this instanceof C72683mX) {
            recyclerView = ((C72683mX) this).A01;
        } else if (this instanceof C72663mV) {
            C72663mV r3 = (C72663mV) this;
            r3.A01.setImageDrawable((Drawable) null);
            r3.A03.setText("");
            WaTextView waTextView = r3.A02;
            waTextView.setText("");
            waTextView.setVisibility(8);
            WaImageButton waImageButton = r3.A00;
            waImageButton.setImageDrawable((Drawable) null);
            waImageButton.setVisibility(8);
            waImageButton.setOnClickListener((View.OnClickListener) null);
            return;
        } else if (this instanceof C72633mS) {
            C19860z7 r1 = ((C72633mS) this).A00.A0H;
            r1.A09 = null;
            r1.A00();
            return;
        } else {
            return;
        }
        recyclerView.setAdapter((AnonymousClass01X) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:203:0x047b, code lost:
        if (r1 == false) goto L_0x047d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x043e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(java.lang.Object r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C72583mN
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "displayName"
        L_0x0006:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x000b:
            boolean r0 = r10 instanceof X.C72453mA
            if (r0 != 0) goto L_0x05b4
            boolean r0 = r10 instanceof X.C72573mM
            if (r0 == 0) goto L_0x003e
            r3 = r10
            X.3mM r3 = (X.C72573mM) r3
            X.3lh r11 = (X.C72183lh) r11
            r6 = 0
            X.C18450wi.A0H(r11, r6)
            int r1 = r11.A00
            if (r1 == 0) goto L_0x0032
            r0 = 1
            if (r1 == r0) goto L_0x05b8
            android.widget.TextView r2 = r3.A01
            android.view.View r0 = r3.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131886547(0x7f1201d3, float:1.9407676E38)
        L_0x002e:
            X.C13690nt.A0s(r1, r2, r0)
        L_0x0031:
            return
        L_0x0032:
            android.widget.TextView r2 = r3.A01
            android.view.View r0 = r3.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131886500(0x7f1201a4, float:1.940758E38)
            goto L_0x002e
        L_0x003e:
            boolean r0 = r10 instanceof X.C72603mP
            if (r0 == 0) goto L_0x0086
            r4 = r10
            X.3mP r4 = (X.C72603mP) r4
            X.3lY r11 = (X.C72093lY) r11
            java.lang.String r2 = r11.A02
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r3 = 0
            if (r0 != 0) goto L_0x007e
            X.1Kq r1 = r4.A02
            android.widget.ImageView r0 = r4.A00
            r1.A00(r0, r2)
            r0.setVisibility(r3)
        L_0x005a:
            com.obwhatsapp.WaTextView r1 = r4.A01
            java.lang.String r0 = r11.A01
            r1.setText(r0)
            android.view.View r1 = r4.A0H
            X.1k5 r0 = r11.A00
            r1.setOnClickListener(r0)
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0O(r1)
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x007b
            android.content.res.Resources r1 = X.C13680ns.A0D(r1)
            r0 = 2131165953(0x7f070301, float:1.7946138E38)
            int r3 = r1.getDimensionPixelSize(r0)
        L_0x007b:
            r2.bottomMargin = r3
            return
        L_0x007e:
            android.widget.ImageView r1 = r4.A00
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x005a
        L_0x0086:
            boolean r0 = r10 instanceof X.C72593mO
            if (r0 == 0) goto L_0x00de
            r4 = r10
            X.3mO r4 = (X.C72593mO) r4
            X.3lX r11 = (X.C72083lX) r11
            int r3 = r11.A00
            r2 = 0
            if (r3 == 0) goto L_0x00c4
            r0 = 1
            com.obwhatsapp.WaTextView r1 = r4.A00
            if (r3 == r0) goto L_0x00b0
            r0 = 2131886519(0x7f1201b7, float:1.940762E38)
            r1.setText(r0)
            com.obwhatsapp.WaTextView r1 = r4.A01
            r1.setVisibility(r2)
            r0 = 2131886576(0x7f1201f0, float:1.9407735E38)
            r1.setText(r0)
            r0 = 30
        L_0x00ac:
            X.C13680ns.A18(r1, r11, r0)
            return
        L_0x00b0:
            r0 = 2131886532(0x7f1201c4, float:1.9407646E38)
            r1.setText(r0)
            com.obwhatsapp.WaTextView r1 = r4.A01
            r1.setVisibility(r2)
            r0 = 2131886576(0x7f1201f0, float:1.9407735E38)
            r1.setText(r0)
            r0 = 32
            goto L_0x00ac
        L_0x00c4:
            com.obwhatsapp.WaTextView r1 = r4.A00
            r0 = 2131886551(0x7f1201d7, float:1.9407684E38)
            r1.setText(r0)
            boolean r0 = r4.A02
            com.obwhatsapp.WaTextView r1 = r4.A01
            if (r0 != 0) goto L_0x061d
            r1.setVisibility(r2)
            r0 = 2131886611(0x7f120213, float:1.9407806E38)
            r1.setText(r0)
            r0 = 31
            goto L_0x00ac
        L_0x00de:
            boolean r0 = r10 instanceof X.C72653mU
            if (r0 == 0) goto L_0x00f0
            r0 = r10
            X.3mU r0 = (X.C72653mU) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            X.3Qz r0 = r0.A01
            r1.setAdapter(r0)
            java.lang.String r0 = "historyBarItems"
            goto L_0x0006
        L_0x00f0:
            boolean r0 = r10 instanceof X.C72643mT
            if (r0 == 0) goto L_0x0110
            r1 = r10
            X.3mT r1 = (X.C72643mT) r1
            X.3lS r11 = (X.C72033lS) r11
            androidx.recyclerview.widget.RecyclerView r0 = r1.A00
            X.3R8 r2 = r1.A01
            r0.setAdapter(r2)
            java.util.List r0 = r11.A01
            r2.A02 = r0
            r2.A01()
            X.1a2 r1 = r11.A00
            r0 = 0
            X.C18450wi.A0H(r1, r0)
            r2.A01 = r1
            return
        L_0x0110:
            boolean r0 = r10 instanceof X.C72563mL
            if (r0 == 0) goto L_0x012e
            r1 = r10
            X.3mL r1 = (X.C72563mL) r1
            X.1ds r11 = (X.C31291ds) r11
            r0 = 0
            X.C18450wi.A0H(r11, r0)
            com.google.android.material.chip.Chip r2 = r1.A01
            java.lang.String r0 = r11.A01
            r2.setText(r0)
            r1 = 29
            com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1
            r0.<init>(r11, r1)
            r2.A02 = r0
            return
        L_0x012e:
            boolean r0 = r10 instanceof X.C72613mQ
            if (r0 == 0) goto L_0x0181
            r6 = r10
            X.3mQ r6 = (X.C72613mQ) r6
            X.3la r11 = (X.C72113la) r11
            android.view.View r3 = r6.A0H
            android.content.Context r5 = r3.getContext()
            com.obwhatsapp.WaTextView r1 = r6.A02
            java.lang.String r0 = r11.A03
            r1.setText(r0)
            r4 = 2131099782(0x7f060086, float:1.7811927E38)
            X.0uf r0 = r6.A03
            X.0pd r1 = r0.A02
            r0 = 450(0x1c2, float:6.3E-43)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0175
            r0 = 1704(0x6a8, float:2.388E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0175
            r4 = 2131099932(0x7f06011c, float:1.7812231E38)
            android.widget.FrameLayout r2 = r6.A00
            r0 = 0
        L_0x0161:
            r2.setBackground(r0)
            com.obwhatsapp.WaImageView r1 = r6.A01
            int r0 = r11.A01
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A02(r5, r0, r4)
            r1.setImageDrawable(r0)
            X.1k5 r0 = r11.A02
            r3.setOnClickListener(r0)
            return
        L_0x0175:
            android.widget.FrameLayout r2 = r6.A00
            r1 = 2131231082(0x7f08016a, float:1.8078235E38)
            int r0 = r11.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A02(r5, r1, r0)
            goto L_0x0161
        L_0x0181:
            boolean r0 = r10 instanceof X.C72443m9
            if (r0 != 0) goto L_0x05b4
            boolean r0 = r10 instanceof X.C72433m8
            if (r0 != 0) goto L_0x0031
            boolean r0 = r10 instanceof X.C72553mK
            if (r0 == 0) goto L_0x01a8
            r2 = r10
            X.3mK r2 = (X.C72553mK) r2
            X.3lU r11 = (X.C72053lU) r11
            com.obwhatsapp.WaTextView r1 = r2.A01
            java.lang.String r0 = r11.A01
            r1.setText(r0)
            android.view.View r1 = r2.A0H
            r0 = 27
            X.C13680ns.A18(r1, r11, r0)
            com.obwhatsapp.WaImageView r1 = r2.A00
            r0 = 28
            X.C13680ns.A18(r1, r11, r0)
            return
        L_0x01a8:
            boolean r0 = r10 instanceof X.C72523mH
            if (r0 == 0) goto L_0x01cc
            r1 = r10
            X.3mH r1 = (X.C72523mH) r1
            r0 = 0
            X.C18450wi.A0H(r11, r0)
            X.3OY r2 = r1.A00
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131886550(0x7f1201d6, float:1.9407682E38)
            java.lang.String r0 = r1.getString(r0)
            X.C18450wi.A0B(r0)
            r2.setSearchHint(r0)
            r0 = 26
            X.C13680ns.A18(r2, r11, r0)
            return
        L_0x01cc:
            boolean r0 = r10 instanceof X.C72683mX
            if (r0 == 0) goto L_0x01e4
            r2 = r10
            X.3mX r2 = (X.C72683mX) r2
            X.3lL r11 = (X.C71963lL) r11
            X.3R1 r1 = r2.A03
            java.util.List r0 = r11.A00
            r1.A00 = r0
            r1.A01()
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            r0.setAdapter(r1)
            return
        L_0x01e4:
            boolean r0 = r10 instanceof X.C72673mW
            if (r0 == 0) goto L_0x0214
            r4 = r10
            X.3mW r4 = (X.C72673mW) r4
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            X.0uf r0 = r4.A02
            boolean r0 = r0.A04()
            r2 = 8
            if (r0 == 0) goto L_0x01fa
            r2 = 6
        L_0x01fa:
            r1 = 0
        L_0x01fb:
            X.466 r0 = new X.466
            r0.<init>()
            r3.add(r0)
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x01fb
            X.3Qt r1 = r4.A03
            r1.A00 = r3
            r1.A01()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A01
            r0.setAdapter(r1)
            return
        L_0x0214:
            boolean r0 = r10 instanceof X.C72423m7
            if (r0 == 0) goto L_0x0246
            X.3lf r11 = (X.C72163lf) r11
            android.view.View r1 = r10.A0H
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r3 = r11.A00
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0236
            android.content.Context r1 = r1.getContext()
            r0 = 2131886585(0x7f1201f9, float:1.9407753E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0232:
            r4.setText(r0)
            return
        L_0x0236:
            android.content.Context r2 = r1.getContext()
            r1 = 2131886586(0x7f1201fa, float:1.9407755E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1a(r3)
            java.lang.String r0 = r2.getString(r1, r0)
            goto L_0x0232
        L_0x0246:
            boolean r0 = r10 instanceof X.C72543mJ
            if (r0 == 0) goto L_0x0259
            r1 = r10
            X.3mJ r1 = (X.C72543mJ) r1
            r0 = 0
            X.C18450wi.A0H(r11, r0)
            com.obwhatsapp.WaTextView r1 = r1.A01
            r0 = 25
            X.C13680ns.A18(r1, r11, r0)
            return
        L_0x0259:
            boolean r0 = r10 instanceof X.C72513mG
            if (r0 == 0) goto L_0x0296
            r1 = r10
            X.3mG r1 = (X.C72513mG) r1
            X.3le r11 = (X.C72153le) r11
            r0 = 0
            X.C18450wi.A0H(r11, r0)
            android.view.View r6 = r1.A00
            android.view.ViewGroup r5 = X.AnonymousClass3K4.A0M(r6)
            boolean r0 = r11.A00
            r4 = 1
            if (r0 == 0) goto L_0x027b
            android.view.LayoutInflater r1 = X.C13680ns.A0G(r6)
            r0 = 2131558693(0x7f0d0125, float:1.874271E38)
            r1.inflate(r0, r5, r4)
        L_0x027b:
            r3 = 3
            r2 = 0
        L_0x027d:
            int r2 = r2 + 1
            android.view.LayoutInflater r1 = X.C13680ns.A0G(r6)
            r0 = 2131558603(0x7f0d00cb, float:1.8742526E38)
            r1.inflate(r0, r5, r4)
            if (r2 < r3) goto L_0x027d
            android.view.LayoutInflater r1 = X.C13680ns.A0G(r6)
            r0 = 2131559421(0x7f0d03fd, float:1.8744186E38)
            r1.inflate(r0, r5, r4)
            return
        L_0x0296:
            boolean r0 = r10 instanceof X.C72533mI
            if (r0 == 0) goto L_0x02b8
            r4 = r10
            X.3mI r4 = (X.C72533mI) r4
            X.4TQ r11 = (X.AnonymousClass4TQ) r11
            X.1dn r3 = r11.A01
            androidx.appcompat.widget.AppCompatCheckBox r2 = r4.A00
            java.lang.String r0 = r3.A01
            r2.setText(r0)
            boolean r0 = r11.A00
            r2.setChecked(r0)
            r1 = 8
            com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1 r0 = new com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r11, (java.lang.Object) r3, (int) r1)
            r2.setOnClickListener(r0)
            return
        L_0x02b8:
            boolean r0 = r10 instanceof X.C72503mF
            if (r0 == 0) goto L_0x02e5
            r1 = r10
            X.3mF r1 = (X.C72503mF) r1
            X.3lb r11 = (X.C72123lb) r11
            r0 = 0
            X.C18450wi.A0H(r11, r0)
            android.view.View r4 = r1.A00
            android.view.ViewGroup r3 = X.AnonymousClass3K4.A0M(r4)
            boolean r0 = r11.A00
            r2 = 1
            if (r0 == 0) goto L_0x02da
            android.view.LayoutInflater r1 = X.C13680ns.A0G(r4)
            r0 = 2131558693(0x7f0d0125, float:1.874271E38)
            r1.inflate(r0, r3, r2)
        L_0x02da:
            android.view.LayoutInflater r1 = X.C13680ns.A0G(r4)
            r0 = 2131559277(0x7f0d036d, float:1.8743894E38)
            r1.inflate(r0, r3, r2)
            return
        L_0x02e5:
            boolean r0 = r10 instanceof X.C72493mE
            if (r0 == 0) goto L_0x031b
            r5 = r10
            X.3mE r5 = (X.C72493mE) r5
            X.3lT r11 = (X.C72043lT) r11
            java.lang.String r4 = r11.A01
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            com.obwhatsapp.WaTextView r3 = r5.A00
            if (r0 != 0) goto L_0x0314
            android.view.View r0 = r5.A0H
            android.content.Context r2 = r0.getContext()
            r1 = 2131886475(0x7f12018b, float:1.940753E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1a(r4)
            java.lang.String r0 = r2.getString(r1, r0)
            r3.setText(r0)
        L_0x030c:
            android.view.View r1 = r5.A0H
            X.1k5 r0 = r11.A00
        L_0x0310:
            r1.setOnClickListener(r0)
            return
        L_0x0314:
            r0 = 2131886474(0x7f12018a, float:1.9407528E38)
            r3.setText(r0)
            goto L_0x030c
        L_0x031b:
            boolean r0 = r10 instanceof X.C72413m6
            if (r0 == 0) goto L_0x0352
            X.2jC r11 = (X.C55272jC) r11
            android.view.View r4 = r10.A0H
            r0 = 2131365555(0x7f0a0eb3, float:1.8350979E38)
            android.view.View r3 = X.C004601z.A0E(r4, r0)
            android.content.res.Resources r1 = X.C13680ns.A0D(r4)
            r0 = 2131165943(0x7f0702f7, float:1.7946117E38)
            int r2 = r1.getDimensionPixelSize(r0)
            int r1 = r11.A00
            r0 = 1
            if (r1 != r0) goto L_0x0345
            android.content.res.Resources r1 = X.C13680ns.A0D(r4)
            r0 = 2131166803(0x7f070653, float:1.7947862E38)
            int r2 = r1.getDimensionPixelSize(r0)
        L_0x0345:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r0.width = r2
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r0.height = r2
            return
        L_0x0352:
            boolean r0 = r10 instanceof X.C72483mD
            if (r0 == 0) goto L_0x0382
            r1 = r10
            X.3mD r1 = (X.C72483mD) r1
            android.view.ViewGroup r7 = r1.A00
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r6 = r0.getResources()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r0)
            android.view.View r0 = r1.A0H
            android.view.ViewGroup r4 = X.AnonymousClass3K4.A0M(r0)
            r3 = 0
            r2 = 0
            r1 = 0
        L_0x0370:
            int r0 = r7.getChildCount()
            if (r2 >= r0) goto L_0x0506
            android.view.View r0 = r7.getChildAt(r2)
            int r0 = r0.getHeight()
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L_0x0370
        L_0x0382:
            boolean r0 = r10 instanceof X.C72473mC
            if (r0 == 0) goto L_0x03bf
            r1 = r10
            X.3mC r1 = (X.C72473mC) r1
            X.3lK r11 = (X.C71953lK) r11
            android.view.ViewGroup r7 = r1.A00
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r8 = r0.getResources()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r0)
            android.view.View r0 = r1.A0H
            android.view.ViewGroup r4 = X.AnonymousClass3K4.A0M(r0)
            boolean r0 = r11.A00
            r6 = 1
            if (r0 == 0) goto L_0x03aa
            r0 = 2131558582(0x7f0d00b6, float:1.8742484E38)
            r5.inflate(r0, r4, r6)
        L_0x03aa:
            r3 = 0
            r2 = 0
            r1 = 0
        L_0x03ad:
            int r0 = r7.getChildCount()
            if (r2 >= r0) goto L_0x0525
            android.view.View r0 = r7.getChildAt(r2)
            int r0 = r0.getHeight()
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L_0x03ad
        L_0x03bf:
            boolean r0 = r10 instanceof X.C72403m5
            if (r0 == 0) goto L_0x03de
            X.3lN r11 = (X.C71983lN) r11
            android.view.View r4 = r10.A0H
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r2 = r11.A00
            r1 = 1
            r0 = 2131886588(0x7f1201fc, float:1.940776E38)
            if (r2 == r1) goto L_0x03d5
            r0 = 2131886587(0x7f1201fb, float:1.9407757E38)
        L_0x03d5:
            r3.setText(r0)
            android.view.View$OnClickListener r0 = r11.A01
            r4.setOnClickListener(r0)
            return
        L_0x03de:
            boolean r0 = r10 instanceof X.C72393m4
            if (r0 != 0) goto L_0x0031
            boolean r0 = r10 instanceof X.C72383m3
            if (r0 != 0) goto L_0x0031
            boolean r0 = r10 instanceof X.C72623mR
            if (r0 == 0) goto L_0x04c2
            r3 = r10
            X.3mR r3 = (X.C72623mR) r3
            X.3lR r11 = (X.C72023lR) r11
            com.obwhatsapp.WaTextView r1 = r3.A01
            int r2 = r11.A00
            switch(r2) {
                case 0: goto L_0x04bd;
                case 1: goto L_0x04b8;
                case 2: goto L_0x04b3;
                case 3: goto L_0x04ae;
                case 4: goto L_0x03f6;
                case 5: goto L_0x03f6;
                case 6: goto L_0x04a9;
                case 7: goto L_0x04a4;
                default: goto L_0x03f6;
            }
        L_0x03f6:
            r0 = 2131886579(0x7f1201f3, float:1.940774E38)
        L_0x03f9:
            r1.setText(r0)
            X.1a1 r4 = r11.A01
            r1 = 0
            r0 = 1
            if (r2 == r0) goto L_0x048a
            r0 = 2
            if (r2 == r0) goto L_0x048a
            if (r2 == 0) goto L_0x0494
            r0 = 7
            if (r2 == r0) goto L_0x0494
            r0 = 6
            if (r2 == r0) goto L_0x0494
            com.obwhatsapp.WaTextView r1 = r3.A02
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r7 = r3.A0H
            r0 = 0
        L_0x0417:
            r7.setOnClickListener(r0)
            com.obwhatsapp.WaTextView r6 = r3.A00
            r0 = 0
            r6.setVisibility(r0)
            if (r2 == 0) goto L_0x045d
            r0 = 3
            if (r2 == r0) goto L_0x045d
            r0 = 4
            if (r2 == r0) goto L_0x0448
            r0 = 5
            if (r2 == r0) goto L_0x0451
            r0 = 6
            if (r2 == r0) goto L_0x045d
            r0 = 7
            if (r2 == r0) goto L_0x045d
            r0 = 8
            r6.setVisibility(r0)
            r1 = 0
        L_0x0437:
            r6.setOnClickListener(r1)
        L_0x043a:
            com.obwhatsapp.WaTextView r1 = r3.A03
            if (r2 != 0) goto L_0x061d
            r0 = 0
            r1.setVisibility(r0)
            r0 = 12
            X.C13680ns.A18(r1, r4, r0)
            return
        L_0x0448:
            r0 = 2131886611(0x7f120213, float:1.9407806E38)
            r6.setText(r0)
            r0 = 13
            goto L_0x0459
        L_0x0451:
            r0 = 2131886494(0x7f12019e, float:1.9407568E38)
            r6.setText(r0)
            r0 = 14
        L_0x0459:
            X.C13680ns.A18(r6, r4, r0)
            goto L_0x043a
        L_0x045d:
            X.0uf r5 = r3.A04
            r7.getContext()
            X.0pd r1 = r5.A02
            r0 = 450(0x1c2, float:6.3E-43)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x047d
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x047d
            r0 = 1770(0x6ea, float:2.48E-42)
            boolean r1 = r1.A0C(r0)
            r0 = 2131886538(0x7f1201ca, float:1.9407658E38)
            if (r1 != 0) goto L_0x0480
        L_0x047d:
            r0 = 2131886492(0x7f12019c, float:1.9407564E38)
        L_0x0480:
            r6.setText(r0)
            r0 = 0
            com.facebook.redex.ViewOnClickCListenerShape2S0101000_I1 r1 = new com.facebook.redex.ViewOnClickCListenerShape2S0101000_I1
            r1.<init>(r4, r2, r0)
            goto L_0x0437
        L_0x048a:
            com.obwhatsapp.WaTextView r0 = r3.A02
            r0.setVisibility(r1)
            android.view.View r7 = r3.A0H
            r1 = 16
            goto L_0x049d
        L_0x0494:
            com.obwhatsapp.WaTextView r0 = r3.A02
            r0.setVisibility(r1)
            android.view.View r7 = r3.A0H
            r1 = 15
        L_0x049d:
            com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1
            r0.<init>(r4, r1)
            goto L_0x0417
        L_0x04a4:
            r0 = 2131886519(0x7f1201b7, float:1.940762E38)
            goto L_0x03f9
        L_0x04a9:
            r0 = 2131889653(0x7f120df5, float:1.9413976E38)
            goto L_0x03f9
        L_0x04ae:
            r0 = 2131886580(0x7f1201f4, float:1.9407743E38)
            goto L_0x03f9
        L_0x04b3:
            r0 = 2131886589(0x7f1201fd, float:1.9407761E38)
            goto L_0x03f9
        L_0x04b8:
            r0 = 2131886584(0x7f1201f8, float:1.940775E38)
            goto L_0x03f9
        L_0x04bd:
            r0 = 2131886582(0x7f1201f6, float:1.9407747E38)
            goto L_0x03f9
        L_0x04c2:
            boolean r0 = r10 instanceof X.C72373m2
            if (r0 != 0) goto L_0x0031
            boolean r0 = r10 instanceof X.C72363m1
            if (r0 == 0) goto L_0x04d2
            X.3lJ r11 = (X.C71943lJ) r11
            android.view.View r1 = r10.A0H
            android.view.View$OnClickListener r0 = r11.A00
            goto L_0x0310
        L_0x04d2:
            boolean r0 = r10 instanceof X.AnonymousClass3m0
            if (r0 == 0) goto L_0x04f0
            X.3lM r11 = (X.C71973lM) r11
            r0 = 0
            X.C18450wi.A0H(r11, r0)
            android.view.View r1 = r10.A0H
            android.view.View$OnClickListener r0 = r11.A00
            r1.setOnClickListener(r0)
            r0 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.widget.TextView r1 = X.C13680ns.A0M(r1, r0)
            java.lang.String r0 = r11.A01
            r1.setText(r0)
            return
        L_0x04f0:
            boolean r0 = r10 instanceof X.C72463mB
            if (r0 == 0) goto L_0x0543
            r2 = r10
            X.3mB r2 = (X.C72463mB) r2
            X.3lW r11 = (X.C72073lW) r11
            android.widget.TextView r1 = r2.A00
            java.lang.String r0 = r11.A01
            r1.setText(r0)
            android.view.View r1 = r2.A0H
            X.1k5 r0 = r11.A00
            goto L_0x0310
        L_0x0506:
            r0 = 2131165572(0x7f070184, float:1.7945365E38)
            int r2 = r6.getDimensionPixelSize(r0)
            int r0 = r7.getHeight()
            int r0 = r0 - r1
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            int r2 = java.lang.Math.round(r1)
        L_0x0519:
            if (r3 >= r2) goto L_0x0031
            r1 = 2131559689(0x7f0d0509, float:1.874473E38)
            r0 = 1
            r5.inflate(r1, r4, r0)
            int r3 = r3 + 1
            goto L_0x0519
        L_0x0525:
            r0 = 2131165415(0x7f0700e7, float:1.7945046E38)
            int r2 = r8.getDimensionPixelSize(r0)
            int r0 = r7.getHeight()
            int r0 = r0 - r1
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            int r1 = java.lang.Math.round(r1)
        L_0x0538:
            if (r3 >= r1) goto L_0x0031
            r0 = 2131558603(0x7f0d00cb, float:1.8742526E38)
            r5.inflate(r0, r4, r6)
            int r3 = r3 + 1
            goto L_0x0538
        L_0x0543:
            boolean r0 = r10 instanceof X.C72693mY
            if (r0 == 0) goto L_0x05a5
            r0 = r10
            X.3mY r0 = (X.C72693mY) r0
            X.3lQ r11 = (X.C72013lQ) r11
            r0.A00 = r11
            X.4KF r3 = r0.A01
            java.util.Queue r6 = r11.A01
            X.3Qp r8 = r3.A01
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            boolean r2 = r6.isEmpty()
            androidx.recyclerview.widget.RecyclerView r5 = r3.A00
            android.content.Context r1 = r5.getContext()
            r0 = 2131887964(0x7f12075c, float:1.941055E38)
            java.lang.String r1 = r1.getString(r0)
            X.5Ra r4 = r3.A02
            X.3l9 r0 = new X.3l9
            r0.<init>(r4, r1, r2)
            r7.add(r0)
            java.util.Iterator r3 = r6.iterator()
        L_0x0578:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0593
            java.lang.Object r2 = r3.next()
            X.4Vx r2 = (X.C87224Vx) r2
            boolean r0 = r3.hasNext()
            r1 = r0 ^ 1
            X.3l8 r0 = new X.3l8
            r0.<init>(r4, r2, r1)
            r7.add(r0)
            goto L_0x0578
        L_0x0593:
            r8.A0F(r7)
            int r1 = r6.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0031
            int r0 = r6.size()
            r5.A0a(r0)
            return
        L_0x05a5:
            boolean r0 = r10 instanceof X.C72633mS
            if (r0 == 0) goto L_0x0031
            r0 = r10
            X.3mS r0 = (X.C72633mS) r0
            X.3ln r11 = (X.C72243ln) r11
            X.39h r0 = r0.A00
            r0.A03(r11)
            return
        L_0x05b4:
            java.lang.String r0 = "onClickListener"
            goto L_0x0006
        L_0x05b8:
            android.widget.TextView r7 = r3.A01
            android.view.View r9 = r3.A00
            android.content.Context r1 = r9.getContext()
            r0 = 2131892600(0x7f121978, float:1.9419953E38)
            X.C13690nt.A0s(r1, r7, r0)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r8 = 0
            if (r0 == 0) goto L_0x061b
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r5 = X.C05580Sd.A01(r1)
        L_0x05d5:
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0619
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x0619
            int r4 = r1.topMargin
        L_0x05e3:
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0617
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r3 = X.C05580Sd.A00(r1)
        L_0x05f1:
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x05ff
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x05ff
            int r8 = r1.bottomMargin
        L_0x05ff:
            X.4br r2 = new X.4br
            r2.<init>(r5, r4, r3, r8)
            android.content.res.Resources r1 = X.C13680ns.A0D(r9)
            r0 = 2131165949(0x7f0702fd, float:1.794613E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.A03 = r0
            r2.A00 = r6
            X.C813547v.A00(r7, r2)
            return
        L_0x0617:
            r3 = 0
            goto L_0x05f1
        L_0x0619:
            r4 = 0
            goto L_0x05e3
        L_0x061b:
            r5 = 0
            goto L_0x05d5
        L_0x061d:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65133Sz.A08(java.lang.Object):void");
    }
}
