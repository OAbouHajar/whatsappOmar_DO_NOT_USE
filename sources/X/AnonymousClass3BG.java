package X;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape0S1630000_I1;
import com.obwhatsapp.InfoCard;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.BusinessHoursView;
import com.obwhatsapp.biz.BusinessProfileFieldView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3BG  reason: invalid class name */
public class AnonymousClass3BG {
    public boolean A00;
    public boolean A01;
    public final View A02;
    public final C19980zJ A03;
    public final C14550pN A04;
    public final InfoCard A05;
    public final C16040sK A06;
    public final BusinessHoursView A07;
    public final BusinessProfileFieldView A08;
    public final BusinessProfileFieldView A09;
    public final AnonymousClass16O A0A;
    public final AnonymousClass1KR A0B;
    public final C35661mI A0C;
    public final C17180uf A0D;
    public final C16080sP A0E;
    public final AnonymousClass013 A0F;
    public final C16010sH A0G;
    public final AnonymousClass1P7 A0H;
    public final Integer A0I;
    public final List A0J;
    public final List A0K;
    public final boolean A0L;

    public AnonymousClass3BG(View view, C19980zJ r5, C14550pN r6, C16040sK r7, AnonymousClass16O r8, AnonymousClass1KR r9, C35661mI r10, C17180uf r11, C16080sP r12, AnonymousClass013 r13, C16010sH r14, AnonymousClass1P7 r15, Integer num, boolean z2, boolean z3) {
        ArrayList A0u = AnonymousClass000.A0u();
        this.A0K = A0u;
        ArrayList A0u2 = AnonymousClass000.A0u();
        this.A0J = A0u2;
        this.A06 = r7;
        this.A03 = r5;
        this.A0H = r15;
        this.A0E = r12;
        this.A0F = r13;
        this.A0A = r8;
        this.A0D = r11;
        this.A0B = r9;
        this.A02 = view;
        this.A0C = r10;
        this.A0I = num;
        this.A08 = (BusinessProfileFieldView) view.findViewById(R.id.business_location);
        this.A09 = (BusinessProfileFieldView) view.findViewById(R.id.business_email);
        A0u.add(view.findViewById(R.id.business_link));
        A0u.add(view.findViewById(R.id.business_link_2));
        InfoCard infoCard = null;
        boolean z4 = z2;
        if (z2) {
            A0u2.add(view.findViewById(R.id.brand_link));
            A0u2.add(view.findViewById(R.id.brand_link_2));
            infoCard = (InfoCard) view.findViewById(R.id.brand_link_card);
        }
        this.A05 = infoCard;
        this.A07 = (BusinessHoursView) view.findViewById(R.id.business_hours);
        this.A04 = r6;
        this.A0G = r14;
        this.A0L = z4;
        this.A01 = z3;
    }

    public static void A00(C19980zJ r17, BusinessProfileFieldView businessProfileFieldView, AnonymousClass1KR r19, C35661mI r20, Integer num, String str, int i2, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        BusinessProfileFieldView businessProfileFieldView2 = businessProfileFieldView;
        if (businessProfileFieldView2.A06 != null) {
            int A002 = AnonymousClass00T.A00(businessProfileFieldView2.getContext(), R.color.color00d7);
            TextView textView = businessProfileFieldView2.A06;
            C19980zJ r7 = r17;
            AnonymousClass1KR r4 = r19;
            C35661mI r6 = r20;
            Integer num2 = num;
            String str2 = str;
            int i3 = i2;
            boolean z6 = z2;
            boolean z7 = z3;
            boolean z8 = z4;
            if (i2 == 0) {
                String text = businessProfileFieldView2.getText();
                if (!TextUtils.isEmpty(text)) {
                    String A003 = C808045q.A00(text);
                    if (!(businessProfileFieldView2.getText() == null || businessProfileFieldView2.A06 == null || businessProfileFieldView2.A05 == null)) {
                        boolean A1O = AnonymousClass000.A1O(A01(businessProfileFieldView2.getText()) ? 1 : 0);
                        Uri parse = Uri.parse(C808045q.A00(businessProfileFieldView2.getText()));
                        if (!(!A1O || parse == null || parse.getPathSegments().size() == 0)) {
                            businessProfileFieldView2.setIcon((int) R.drawable.ic_business_instagram);
                            businessProfileFieldView2.setText(C13700nu.A0H(businessProfileFieldView2, R.string.str02e7), (View.OnClickListener) null);
                            businessProfileFieldView2.setSubText(AnonymousClass000.A0n(parse.getPathSegments(), 0));
                            int A004 = AnonymousClass00T.A00(businessProfileFieldView2.getContext(), R.color.color00ad);
                            int A005 = AnonymousClass00T.A00(businessProfileFieldView2.getContext(), R.color.color0502);
                            TextView textView2 = businessProfileFieldView2.A06;
                            TextView textView3 = businessProfileFieldView2.A05;
                            z5 = true;
                            businessProfileFieldView2.setOnClickListener(new C94064kJ(Uri.parse(AnonymousClass000.A0h(Uri.encode(A003), AnonymousClass000.A0r("https://l.wl.co/l?u="))), r17, businessProfileFieldView, r19, r20, num, str, z5, z7, z8, z6));
                        }
                    }
                    z5 = false;
                    businessProfileFieldView2.setOnClickListener(new C94064kJ(Uri.parse(AnonymousClass000.A0h(Uri.encode(A003), AnonymousClass000.A0r("https://l.wl.co/l?u="))), r17, businessProfileFieldView, r19, r20, num, str, z5, z7, z8, z6));
                }
            } else if (i3 != 1) {
                String text2 = businessProfileFieldView2.getText();
                if (!TextUtils.isEmpty(text2)) {
                    businessProfileFieldView2.setOnClickListener(new ViewOnClickCListenerShape0S1630000_I1(r4, num2, r6, r7, businessProfileFieldView2, C13680ns.A0A(AnonymousClass000.A0h(Uri.encode(text2), AnonymousClass000.A0r("geo:0,0?q="))), str2, 0, z7, z8, z6));
                }
            } else {
                String text3 = businessProfileFieldView2.getText();
                if (!TextUtils.isEmpty(text3)) {
                    businessProfileFieldView2.setOnClickListener(new ViewOnClickCListenerShape0S1630000_I1(r4, num2, r6, r7, businessProfileFieldView2, Uri.parse(C13680ns.A0h("mailto:", text3)), str2, 1, z7, z8, z6));
                }
            }
        }
    }

    public static boolean A01(String str) {
        Uri parse = Uri.parse(C808045q.A00(str));
        return parse.getHost().equalsIgnoreCase("www.instagram.com") || parse.getHost().equalsIgnoreCase("instagram.com") || parse.getHost().equalsIgnoreCase("instagr.am") || parse.getHost().equalsIgnoreCase("www.instagr.am");
    }

    public final void A02(View view) {
        BusinessProfileFieldView businessProfileFieldView = this.A08;
        View A0E2 = C004601z.A0E(businessProfileFieldView, R.id.field_textview);
        if (TextUtils.isEmpty(businessProfileFieldView.getText())) {
            A0E2.setVisibility(8);
        } else {
            A0E2.setVisibility(0);
        }
        boolean isEmpty = TextUtils.isEmpty(businessProfileFieldView.getText());
        Resources resources = A0E2.getResources();
        int i2 = R.dimen.dimen00da;
        if (isEmpty) {
            i2 = R.dimen.dimen00db;
        }
        int dimension = (int) resources.getDimension(i2);
        AnonymousClass013 r2 = this.A0F;
        view.setPadding(C13680ns.A1Z(r2) ? 0 : (int) A0E2.getResources().getDimension(R.dimen.dimen00d9), dimension, C13680ns.A1Z(r2) ? (int) A0E2.getResources().getDimension(R.dimen.dimen00d9) : 0, (int) A0E2.getResources().getDimension(R.dimen.dimen00d8));
        view.setVisibility(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0346  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C35611mD r27) {
        /*
            r26 = this;
            r1 = r27
            X.1m7 r5 = r1.A03
            java.lang.String r8 = r5.A03
            r0 = r26
            X.16O r2 = r0.A0A
            int r2 = r2.A00()
            r2 = r2 & 8
            if (r2 <= 0) goto L_0x004a
            X.0pN r11 = r0.A04
            X.1mB r2 = r5.A00
            java.lang.String r13 = r2.A03
            java.lang.String r10 = r5.A02
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            r12 = 1
            r9 = 0
            r7 = 2
            java.lang.String r6 = ""
            if (r2 != 0) goto L_0x0277
            r4 = 2131887961(0x7f120759, float:1.9410544E38)
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r9] = r8
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 == 0) goto L_0x0034
            r13 = r6
        L_0x0034:
            r3[r12] = r13
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x003d
            r10 = r6
        L_0x003d:
            r3[r7] = r10
        L_0x003f:
            java.lang.String r2 = r11.getString(r4, r3)
            if (r2 == 0) goto L_0x0049
            java.lang.String r6 = r2.trim()
        L_0x0049:
            r8 = r6
        L_0x004a:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            r6 = 0
            if (r2 == 0) goto L_0x0187
            X.0uf r2 = r0.A0D
            X.0pd r4 = r2.A02
            r2 = 450(0x1c2, float:6.3E-43)
            X.0tM r3 = X.C16620tM.A02
            boolean r2 = r4.A0E(r3, r2)
            if (r2 == 0) goto L_0x0187
            r2 = 1810(0x712, float:2.536E-42)
            boolean r2 = r4.A0E(r3, r2)
            if (r2 == 0) goto L_0x0187
            java.util.List r7 = r1.A0H
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x0187
            com.obwhatsapp.biz.BusinessProfileFieldView r11 = r0.A08
            X.013 r2 = r0.A0F
            java.util.Locale r5 = X.C13690nt.A0m(r2)
            android.content.Context r3 = r11.getContext()
            r2 = 2131886554(0x7f1201da, float:1.940769E38)
            java.lang.String r4 = r3.getString(r2)
            java.lang.Object[] r3 = X.C13680ns.A1b()
            r10 = 0
            java.lang.Object r2 = r7.get(r10)
            X.1mC r2 = (X.C35601mC) r2
            java.lang.String r2 = r2.A03
            r3[r10] = r2
            java.lang.String r2 = java.lang.String.format(r5, r4, r3)
            r11.setText(r2, r6)
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x0123
            X.1P7 r13 = r0.A0H
            android.content.Context r2 = r11.getContext()
            boolean r2 = r13.A05(r2)
            if (r2 == 0) goto L_0x0123
            java.lang.Object r14 = r7.get(r10)
            X.1mC r14 = (X.C35601mC) r14
            android.view.View r4 = r0.A02
            r2 = 2131362420(0x7f0a0274, float:1.834462E38)
            android.view.ViewGroup r3 = X.C13690nt.A0K(r4, r2)
            X.0pN r5 = r0.A04
            r2 = 2131558597(0x7f0d00c5, float:1.8742514E38)
            android.view.View.inflate(r5, r2, r3)
            r2 = 2131364456(0x7f0a0a68, float:1.834875E38)
            android.view.View r12 = r4.findViewById(r2)
            r2 = 2131364447(0x7f0a0a5f, float:1.8348731E38)
            android.view.View r6 = r4.findViewById(r2)
            java.lang.String r2 = "geo:0,0?q="
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r2)
            java.lang.String r2 = r14.A03
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r3)
            android.content.Intent r4 = X.C13680ns.A0A(r2)
            r3 = 8
            com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1 r2 = new com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1
            r2.<init>((java.lang.Object) r0, (int) r3, (java.lang.Object) r4)
            if (r6 == 0) goto L_0x00eb
            r6.setOnClickListener(r2)
        L_0x00eb:
            r11.setOnClickListener(r2)
            r2 = 2131364457(0x7f0a0a69, float:1.8348752E38)
            android.view.View r9 = r5.findViewById(r2)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            android.content.Context r2 = r9.getContext()
            X.32i r8 = new X.32i
            r8.<init>(r2)
            java.lang.Double r2 = r14.A00
            double r6 = r2.doubleValue()
            java.lang.Double r2 = r14.A01
            double r4 = r2.doubleValue()
            com.google.android.gms.maps.model.LatLng r3 = new com.google.android.gms.maps.model.LatLng
            r3.<init>(r6, r4)
            java.lang.Integer r2 = r14.A02
            r8.A04(r3, r13, r2)
            r2 = -1
            r9.addView(r8, r2, r2)
            r8.setVisibility(r10)
            r0.A02(r12)
            r11.setVisibility(r10)
        L_0x0123:
            java.util.List r2 = r0.A0K
            java.util.Iterator r6 = r2.iterator()
            r5 = 0
        L_0x012a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0290
            java.lang.Object r8 = r6.next()
            com.obwhatsapp.biz.BusinessProfileFieldView r8 = (com.obwhatsapp.biz.BusinessProfileFieldView) r8
            int r4 = r5 + 1
            java.util.List r3 = r1.A0I
            int r2 = r3.size()
            if (r5 >= r2) goto L_0x0185
            java.lang.String r3 = X.AnonymousClass000.A0n(r3, r5)
        L_0x0144:
            boolean r2 = r0.A0L
            if (r2 == 0) goto L_0x014e
            boolean r2 = A01(r3)
            if (r2 != 0) goto L_0x0183
        L_0x014e:
            r2 = 0
            r8.setText(r2, r2)
            r8.setSubText(r2)
            r2 = 2131231545(0x7f080339, float:1.8079174E38)
            r8.setIcon((int) r2)
            r2 = 0
            r8.setText(r3, r2)
            X.0zJ r7 = r0.A03
            X.1KR r9 = r0.A0B
            r13 = 0
            X.0sH r3 = r0.A0G
            if (r3 == 0) goto L_0x016e
            com.whatsapp.jid.Jid r2 = X.C16010sH.A03(r3)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
        L_0x016e:
            java.lang.String r12 = X.C16030sJ.A03(r2)
            boolean r14 = r3.A0H()
            X.1mI r10 = r0.A0C
            java.lang.Integer r11 = r0.A0I
            boolean r15 = r0.A01
            boolean r2 = r0.A00
            r16 = r2
            A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0183:
            r5 = r4
            goto L_0x012a
        L_0x0185:
            r3 = 0
            goto L_0x0144
        L_0x0187:
            com.obwhatsapp.biz.BusinessProfileFieldView r15 = r0.A08
            r15.setText(r8, r6)
            X.0zJ r14 = r0.A03
            X.1KR r8 = r0.A0B
            r20 = 2
            X.0sH r9 = r0.A0G
            if (r9 != 0) goto L_0x0254
            r2 = 0
        L_0x0197:
            java.lang.String r19 = X.C16030sJ.A03(r2)
            boolean r21 = r9.A0H()
            X.1mI r7 = r0.A0C
            java.lang.Integer r4 = r0.A0I
            boolean r3 = r0.A01
            boolean r2 = r0.A00
            r17 = r7
            r18 = r4
            r22 = r3
            r23 = r2
            r16 = r8
            A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            android.view.View r4 = r0.A02
            r2 = 2131362420(0x7f0a0274, float:1.834462E38)
            android.view.ViewGroup r3 = X.C13690nt.A0K(r4, r2)
            X.1mB r2 = r5.A00
            java.lang.Double r14 = r2.A00
            r7 = 0
            if (r14 == 0) goto L_0x025c
            java.lang.Double r13 = r2.A01
            if (r13 == 0) goto L_0x025c
            X.0pN r11 = r0.A04
            r2 = 2131558597(0x7f0d00c5, float:1.8742514E38)
            android.view.View.inflate(r11, r2, r3)
            r2 = 2131364456(0x7f0a0a68, float:1.834875E38)
            android.view.View r8 = r4.findViewById(r2)
            r2 = 2131364447(0x7f0a0a5f, float:1.8348731E38)
            android.view.View r12 = r4.findViewById(r2)
            double r4 = r14.doubleValue()
            double r2 = r13.doubleValue()
            com.google.android.gms.maps.model.LatLng r10 = new com.google.android.gms.maps.model.LatLng
            r10.<init>(r4, r2)
            java.lang.String r4 = r15.getText()
            X.0sP r2 = r0.A0E
            java.lang.String r5 = r2.A08(r9)
            java.lang.String r2 = "geo:0,0?q="
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r2)
            r3.append(r14)
            java.lang.String r2 = ","
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = "("
            r3.append(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x0212
            r4 = r5
        L_0x0212:
            r3.append(r4)
            java.lang.String r2 = ")"
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r3)
            android.content.Intent r4 = X.C13680ns.A0A(r2)
            r3 = 7
            com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1 r2 = new com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1
            r2.<init>((java.lang.Object) r0, (int) r3, (java.lang.Object) r4)
            r12.setOnClickListener(r2)
            r15.setOnClickListener(r2)
            r2 = 2131364457(0x7f0a0a69, float:1.8348752E38)
            android.view.View r4 = r11.findViewById(r2)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.content.Context r2 = r4.getContext()
            com.obwhatsapp.location.WaMapView r3 = new com.obwhatsapp.location.WaMapView
            r3.<init>(r2)
            X.1P7 r2 = r0.A0H
            r3.A01(r10, r6, r2)
            r3.A00(r10)
            r2 = -1
            r4.addView(r3, r2, r2)
            r3.setVisibility(r7)
            r0.A02(r8)
            r15.setVisibility(r7)
            goto L_0x0123
        L_0x0254:
            com.whatsapp.jid.Jid r2 = X.C16010sH.A03(r9)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            goto L_0x0197
        L_0x025c:
            java.lang.String r2 = r15.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0269
            r15.setVisibility(r7)
        L_0x0269:
            r2 = 2131364456(0x7f0a0a68, float:1.834875E38)
            android.view.View r2 = r3.findViewById(r2)
            if (r2 == 0) goto L_0x0123
            r3.removeView(r2)
            goto L_0x0123
        L_0x0277:
            r4 = 2131887962(0x7f12075a, float:1.9410546E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 == 0) goto L_0x0283
            r13 = r6
        L_0x0283:
            r3[r9] = r13
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x028c
            r10 = r6
        L_0x028c:
            r3[r12] = r10
            goto L_0x003f
        L_0x0290:
            boolean r2 = r0.A0L
            if (r2 == 0) goto L_0x02fb
            java.util.List r2 = r0.A0J
            java.util.Iterator r6 = r2.iterator()
            r13 = 0
            r4 = 0
        L_0x029c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x02fb
            java.lang.Object r8 = r6.next()
            com.obwhatsapp.biz.BusinessProfileFieldView r8 = (com.obwhatsapp.biz.BusinessProfileFieldView) r8
            int r5 = r4 + 1
            java.util.List r3 = r1.A0I
            int r2 = r3.size()
            if (r4 >= r2) goto L_0x02f9
            java.lang.String r4 = X.AnonymousClass000.A0n(r3, r4)
        L_0x02b6:
            boolean r2 = A01(r4)
            if (r2 == 0) goto L_0x02f7
            com.obwhatsapp.InfoCard r3 = r0.A05
            if (r3 == 0) goto L_0x02f7
            r2 = 0
            r8.setText(r2, r2)
            r8.setSubText(r2)
            r2 = 2131231545(0x7f080339, float:1.8079174E38)
            r8.setIcon((int) r2)
            r3.setVisibility(r13)
            r2 = 0
            r8.setText(r4, r2)
            X.0zJ r7 = r0.A03
            X.1KR r9 = r0.A0B
            X.0sH r3 = r0.A0G
            if (r3 == 0) goto L_0x02e2
            com.whatsapp.jid.Jid r2 = X.C16010sH.A03(r3)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
        L_0x02e2:
            java.lang.String r12 = X.C16030sJ.A03(r2)
            boolean r14 = r3.A0H()
            X.1mI r10 = r0.A0C
            java.lang.Integer r11 = r0.A0I
            boolean r15 = r0.A01
            boolean r2 = r0.A00
            r16 = r2
            A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x02f7:
            r4 = r5
            goto L_0x029c
        L_0x02f9:
            r4 = 0
            goto L_0x02b6
        L_0x02fb:
            java.lang.String r3 = r1.A0B
            com.obwhatsapp.biz.BusinessProfileFieldView r6 = r0.A09
            r2 = 0
            r6.setText(r3, r2)
            X.0zJ r7 = r0.A03
            X.1KR r5 = r0.A0B
            X.0sH r3 = r0.A0G
            if (r3 == 0) goto L_0x0311
            com.whatsapp.jid.Jid r2 = X.C16010sH.A03(r3)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
        L_0x0311:
            java.lang.String r12 = X.C16030sJ.A03(r2)
            boolean r14 = r3.A0H()
            X.1mI r4 = r0.A0C
            java.lang.Integer r2 = r0.A0I
            r25 = r2
            boolean r3 = r0.A01
            boolean r2 = r0.A00
            r13 = 1
            r8 = r6
            r9 = r5
            r10 = r4
            r11 = r25
            r15 = r3
            r16 = r2
            A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.obwhatsapp.biz.BusinessHoursView r12 = r0.A07
            X.1mE r11 = r1.A00
            com.whatsapp.jid.UserJid r2 = r1.A04
            java.lang.String r22 = r2.getRawString()
            boolean r2 = r0.A01
            r23 = r2
            boolean r2 = r0.A00
            r24 = r2
            r15 = 1
            r2 = 8
            if (r11 == 0) goto L_0x04ad
            r2 = 2131362405(0x7f0a0265, float:1.834459E38)
            android.view.View r21 = X.C004601z.A0E(r12, r2)
            X.013 r14 = r12.A04
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r2 = 7
            int r3 = r3.get(r2)
            r13 = 0
        L_0x0359:
            int[] r10 = X.AnonymousClass49G.A00
            int r9 = r10.length
            if (r13 >= r9) goto L_0x0365
            r2 = r10[r13]
            if (r2 == r3) goto L_0x0367
            int r13 = r13 + 1
            goto L_0x0359
        L_0x0365:
            int r13 = r9 + -1
        L_0x0367:
            r2 = 7
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>(r2)
            java.util.List r2 = r11.A02
            java.util.Iterator r5 = r2.iterator()
        L_0x0373:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x039c
            java.lang.Object r4 = r5.next()
            X.1ju r4 = (X.C34221ju) r4
            int r2 = r4.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r2 = r8.containsKey(r3)
            if (r2 != 0) goto L_0x0392
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            r8.put(r3, r2)
        L_0x0392:
            java.lang.Object r2 = r8.get(r3)
            java.util.List r2 = (java.util.List) r2
            r2.add(r4)
            goto L_0x0373
        L_0x039c:
            java.util.ArrayList r20 = X.AnonymousClass000.A0u()
            r7 = r13
        L_0x03a1:
            int r2 = r9 + r13
            if (r7 >= r2) goto L_0x0463
            int r2 = r7 % r9
            r4 = r10[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r8.get(r2)
            java.util.List r3 = (java.util.List) r3
            java.lang.String r19 = X.C28891Zc.A00(r14, r4)
            if (r3 != 0) goto L_0x03ce
            r2 = 2131886827(0x7f1202eb, float:1.9408244E38)
            java.lang.String r3 = r14.A09(r2)
        L_0x03c0:
            r2 = r19
            android.util.Pair r3 = X.C13690nt.A0I(r2, r3)
            r2 = r20
            r2.add(r3)
            int r7 = r7 + 1
            goto L_0x03a1
        L_0x03ce:
            int r2 = r3.size()
            if (r2 <= r15) goto L_0x03d9
            r2 = 8
            X.C13690nt.A1P(r3, r2)
        L_0x03d9:
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            java.util.Iterator r18 = r3.iterator()
        L_0x03e1:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x045b
            java.lang.Object r3 = r18.next()
            X.1ju r3 = (X.C34221ju) r3
            int r4 = r3.A01
            if (r4 == 0) goto L_0x03fe
            if (r4 == r15) goto L_0x044a
            r2 = 2
            if (r4 != r2) goto L_0x03e1
            r2 = 2131886828(0x7f1202ec, float:1.9408246E38)
            java.lang.String r3 = r14.A09(r2)
            goto L_0x03c0
        L_0x03fe:
            java.lang.Integer r2 = r3.A03
            X.AnonymousClass00B.A06(r2)
            int r4 = r2.intValue()
            java.lang.Integer r2 = r3.A02
            X.AnonymousClass00B.A06(r2)
            int r17 = r2.intValue()
            java.util.Locale r16 = X.C13690nt.A0m(r14)
            java.util.Calendar r5 = java.util.Calendar.getInstance(r16)
            int r2 = r4 / 60
            r3 = 11
            r5.set(r3, r2)
            int r4 = r4 % 60
            r2 = 12
            r5.set(r2, r4)
            r4 = 13
            r2 = 0
            r5.set(r4, r2)
            java.util.Calendar r4 = java.util.Calendar.getInstance(r16)
            int r2 = r17 / 60
            r4.set(r3, r2)
            int r3 = r17 % 60
            r2 = 12
            r4.set(r2, r3)
            r3 = 13
            r2 = 0
            r4.set(r3, r2)
            java.lang.String r2 = X.C47672Jx.A05(r14, r5, r4)
            r6.add(r2)
            goto L_0x03e1
        L_0x044a:
            r2 = 2131886829(0x7f1202ed, float:1.9408248E38)
            java.util.Locale r3 = X.C13690nt.A0m(r14)
            java.lang.String r2 = r14.A09(r2)
            java.lang.String r3 = X.AnonymousClass1WH.A07(r3, r2)
            goto L_0x03c0
        L_0x045b:
            java.lang.String r2 = "\n"
            java.lang.String r3 = android.text.TextUtils.join(r2, r6)
            goto L_0x03c0
        L_0x0463:
            int r2 = r20.size()
            if (r2 == 0) goto L_0x04b0
            r3 = 8
            r2 = r21
            r2.setVisibility(r3)
            android.content.res.Resources r2 = X.C13680ns.A0D(r12)
            r3 = 2131166295(0x7f070457, float:1.7946831E38)
            int r5 = r2.getDimensionPixelSize(r3)
            int r4 = r12.getPaddingTop()
            android.content.res.Resources r2 = X.C13680ns.A0D(r12)
            int r3 = r2.getDimensionPixelSize(r3)
            int r2 = r12.getPaddingBottom()
            r12.setPadding(r5, r4, r3, r2)
            com.obwhatsapp.biz.BusinessHoursContentView r5 = r12.A01
            X.0t3 r2 = r12.A03
            long r2 = r2.A00()
            r4 = r20
            r5.setupWithOpenNow(r4, r2, r11)
            X.4kD r2 = new X.4kD
            r19 = r2
            r20 = r12
            r21 = r25
            r19.<init>(r20, r21, r22, r23, r24)
            r12.setOnClickListener(r2)
            r12.A02()
            r2 = 0
        L_0x04ad:
            r12.setVisibility(r2)
        L_0x04b0:
            X.1m8 r4 = r1.A02
            r3 = 1
            if (r4 == 0) goto L_0x04bd
            X.1m9 r2 = r4.A00
            if (r2 != 0) goto L_0x04d1
            X.1m9 r2 = r4.A01
            if (r2 != 0) goto L_0x04d1
        L_0x04bd:
            r2 = 0
        L_0x04be:
            r0.A01 = r2
            X.1mA r1 = r1.A01
            if (r1 == 0) goto L_0x04cf
            java.lang.String r1 = r1.A00
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x04cf
        L_0x04cc:
            r0.A00 = r3
            return
        L_0x04cf:
            r3 = 0
            goto L_0x04cc
        L_0x04d1:
            r2 = 1
            goto L_0x04be
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BG.A03(X.1mD):void");
    }
}
