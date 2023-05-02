package com.obwhatsapp.payments.ui.orderdetails;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass16G;
import X.AnonymousClass1KS;
import X.AnonymousClass1TC;
import X.AnonymousClass234;
import X.AnonymousClass69T;
import X.C000900k;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C110115dX;
import X.C110885ez;
import X.C113055lQ;
import X.C113065lR;
import X.C113075lS;
import X.C113085lT;
import X.C113095lU;
import X.C113105lV;
import X.C113115lW;
import X.C113125lX;
import X.C113135lY;
import X.C115255pS;
import X.C117735tT;
import X.C119505ya;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C15830rv;
import X.C16010sH;
import X.C16040sK;
import X.C16150sX;
import X.C16320sq;
import X.C16840tj;
import X.C16880tn;
import X.C16980tz;
import X.C17110uY;
import X.C17170ue;
import X.C17200uh;
import X.C18090w8;
import X.C18260wP;
import X.C218315p;
import X.C24511Gf;
import X.C25791Ld;
import X.C28411Vz;
import X.C30531cW;
import X.C35141lR;
import X.C35151lS;
import X.C35161lT;
import X.C35171lU;
import X.C35251lc;
import X.C35431lv;
import X.C49272Sb;
import X.C49992Xb;
import X.C50262Yq;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C797441c;
import X.C93554jO;
import X.C95314mR;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape19S0101000_3_I1;
import com.facebook.redex.IDxObserverShape38S0200000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaymentCheckoutOrderDetailsViewV2 extends LinearLayout implements AnonymousClass006 {
    public View A00;
    public Button A01;
    public RelativeLayout A02;
    public RecyclerView A03;
    public TextEmojiLabel A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public AnonymousClass16G A08;
    public C24511Gf A09;
    public C17170ue A0A;
    public AnonymousClass1TC A0B;
    public C50262Yq A0C;
    public C49272Sb A0D;
    public C18260wP A0E;
    public C17200uh A0F;
    public AnonymousClass01V A0G;
    public C16980tz A0H;
    public AnonymousClass013 A0I;
    public C14710pd A0J;
    public AnonymousClass1KS A0K;
    public C18090w8 A0L;
    public C218315p A0M;
    public C17110uY A0N;
    public C25791Ld A0O;
    public C16320sq A0P;
    public C52662eE A0Q;
    public boolean A0R;

    public PaymentCheckoutOrderDetailsViewV2(Context context) {
        this(context, (AttributeSet) null);
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A0R) {
            this.A0R = true;
            C52652eD r2 = (C52652eD) ((C52642eC) generatedComponent());
            C16150sX r1 = r2.A07;
            this.A0J = C16150sX.A0k(r1);
            this.A0N = C16150sX.A1A(r1);
            this.A0H = (C16980tz) r1.AQB.get();
            this.A0F = C16150sX.A0R(r1);
            this.A0G = C16150sX.A0T(r1);
            this.A0C = r2.A05.A1s;
            this.A0I = C16150sX.A0Z(r1);
            this.A0P = (C16320sq) r1.ARB.get();
            this.A0M = (C218315p) r1.AIL.get();
            this.A09 = (C24511Gf) r1.A3U.get();
            this.A0B = (AnonymousClass1TC) r1.AJT.get();
            this.A0L = C16150sX.A10(r1);
            this.A0A = (C17170ue) r1.A3W.get();
            this.A0E = (C18260wP) r1.A4p.get();
            this.A0O = (C25791Ld) r1.AFY.get();
            this.A08 = (AnonymousClass16G) r1.A4F.get();
            this.A0K = (AnonymousClass1KS) r1.AGl.get();
        }
        LayoutInflater.from(context).inflate(R.layout.layout0434, this, true);
        this.A03 = (RecyclerView) C004601z.A0E(this, R.id.order_detail_recycler_view);
        this.A06 = C13680ns.A0S(this, R.id.total_key);
        this.A07 = C13680ns.A0S(this, R.id.total_amount);
        this.A01 = (Button) C004601z.A0E(this, R.id.proceed_to_pay_btn);
        this.A05 = C13680ns.A0S(this, R.id.expiry_footer);
        this.A04 = C13680ns.A0Q(this, R.id.terms_of_services_footer);
        this.A00 = C004601z.A0E(this, R.id.shadow_top);
        this.A02 = (RelativeLayout) C004601z.A0E(this, R.id.buttons);
    }

    public void A00(C000900k r31, C16040sK r32, C797441c r33, C117735tT r34, String str, int i2, int i3) {
        String A0e;
        C14710pd r28 = this.A0J;
        C17110uY r8 = this.A0N;
        C16980tz r7 = this.A0H;
        C17200uh r6 = this.A0F;
        C218315p r5 = this.A0M;
        AnonymousClass01V r4 = this.A0G;
        C50262Yq r3 = this.A0C;
        C18090w8 r13 = this.A0L;
        AnonymousClass013 r2 = this.A0I;
        C25791Ld r1 = this.A0O;
        AnonymousClass16G r0 = this.A08;
        AnonymousClass16G r27 = r0;
        C110885ez r14 = new C110885ez(r32, r0, r3, r6, r4, r7, r2, r28, r13, r5, r8, r1);
        Context context = getContext();
        C117735tT r142 = r34;
        C16840tj r10 = r142.A07;
        C16880tn AAt = r10.AAt();
        AnonymousClass00B.A06(AAt);
        C35251lc r02 = AAt.A01;
        AnonymousClass00B.A06(r02);
        AnonymousClass00B.A06(r02.A05.A08);
        List list = r14.A0C;
        list.clear();
        C35251lc r62 = AAt.A01;
        AnonymousClass00B.A06(C110115dX.A0W(r10).A05.A08);
        list.clear();
        list.add(new C113095lU(0, R.dimen.dimen05a7, 0));
        C16010sH r35 = r142.A03;
        boolean z2 = r142.A0J;
        String str2 = r142.A0A;
        list.add(new C113115lW(r35, str2, r142.A0E, z2));
        boolean A0D2 = r14.A08.A0D(r62.A08);
        String str3 = r142.A0D;
        C35431lv r72 = r142.A04;
        int i4 = i3;
        list.add(new C113085lT(r72.A01, str3, i4, A0D2));
        List<C93554jO> list2 = r62.A05.A08;
        AnonymousClass00B.A06(list2);
        for (C93554jO r12 : list2) {
            list.add(new C113075lS(r12, r10));
        }
        String str4 = str;
        if (r142.A0N) {
            String str5 = r142.A0G;
            list.add(new C113125lX(r72, r142.A06, r10, str5, str4, r142.A0I));
        }
        AnonymousClass013 r22 = r14.A06;
        boolean z3 = r142.A0O;
        list.add(new C113105lV(r22, r62, r142.A0B, z3));
        String str6 = r142.A0F;
        if (!TextUtils.isEmpty(str6)) {
            C16040sK r03 = r14.A00;
            C15830rv r15 = r142.A05;
            if (!r03.A0I(r15)) {
                list.add(new C113065lR(str6, r14.A09.A0e(r15)));
            }
        }
        C28411Vz r04 = r62.A04;
        AnonymousClass00B.A06(r04);
        Drawable A022 = C218315p.A02(context, r04, R.color.color0791, R.dimen.dimen007a);
        list.add(new C113095lU(180, 0, R.dimen.dimen05a8));
        if (A0D2 && r142.A0L) {
            String str7 = r142.A0C;
            if (!TextUtils.isEmpty(str7)) {
                list.add(new C113055lQ(str7));
            }
        }
        boolean z4 = r142.A0K;
        boolean z5 = r142.A0M;
        AnonymousClass69T r52 = r142.A06;
        C15830rv r42 = r142.A05;
        C15830rv r17 = r42;
        AnonymousClass69T r18 = r52;
        list.add(new C113135lY(A022, r17, r18, r10, r142.A0G, str2, r142.A01, z4, z5));
        this.A03.setAdapter(r14);
        WaTextView waTextView = this.A07;
        waTextView.setText(r142.A09);
        WaTextView waTextView2 = this.A06;
        if (z3) {
            waTextView2.setVisibility(8);
            waTextView.setVisibility(8);
        } else {
            waTextView2.setVisibility(0);
            waTextView.setVisibility(0);
        }
        C35251lc A0W = C110115dX.A0W(r10);
        boolean A0D3 = r13.A0D(A0W.A08);
        C119505ya r05 = (C119505ya) C115255pS.A00(r28.A05(1767)).get(str4);
        Button button = this.A01;
        if (r05 == null) {
            button.setText(getResources().getString(R.string.str0eb8));
        } else {
            String str8 = r05.A02;
            String str9 = r05.A01;
            AnonymousClass234 A002 = r27.A00();
            if (!(A002 == null || (A0e = C13690nt.A0e(str8, A002.A02)) == null)) {
                str9 = A0e;
            }
            button.setText(str9);
        }
        int i5 = i2;
        button.setOnClickListener(new IDxCListenerShape19S0101000_3_I1(r142, i5, 0));
        String str10 = r142.A0C;
        if (TextUtils.isEmpty(str10) || A0D3) {
            this.A05.setVisibility(8);
        } else {
            WaTextView waTextView3 = this.A05;
            waTextView3.setText(str10);
            waTextView3.setVisibility(0);
        }
        CharSequence charSequence = r142.A08;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextEmojiLabel textEmojiLabel = this.A04;
        if (isEmpty) {
            textEmojiLabel.setVisibility(8);
        } else {
            C30531cW.A02(textEmojiLabel);
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.setText(charSequence);
        }
        boolean A012 = A01(r33, r142, str4, i5, i4);
        RelativeLayout relativeLayout = this.A02;
        int A023 = C13680ns.A02(A012 ? 1 : 0);
        relativeLayout.setVisibility(A023);
        this.A00.setVisibility(A023);
        AnonymousClass00B.A0F(r42 instanceof UserJid);
        UserJid userJid = (UserJid) r42;
        List<C93554jO> list3 = A0W.A05.A08;
        AnonymousClass00B.A06(list3);
        ArrayList A0u = AnonymousClass000.A0u();
        for (C93554jO A003 : list3) {
            A0u.add(new C35161lT(A003.A00()));
        }
        C35141lR r36 = new C35141lR((String) null, A0u);
        String A004 = ((C93554jO) list3.get(0)).A00();
        if (A004 == null) {
            A004 = "";
        }
        C35171lU r73 = new C35171lU(userJid, new C35151lS(A004, A0W.A0E, false), Collections.singletonList(r36));
        C49272Sb r06 = this.A0D;
        C000900k r37 = r31;
        if (r06 == null) {
            r06 = (C49272Sb) new C006602z((AnonymousClass04o) new C95314mR(r37.getApplication(), this.A0B, new C49992Xb(this.A09, this.A0A, userJid, this.A0P), this.A0E, userJid, this.A0K, r73), (C001500q) r37).A01(C49272Sb.class);
            this.A0D = r06;
        }
        r06.A01.A0A(r37, new IDxObserverShape38S0200000_3_I1(this, 1, r14));
        this.A0D.A05();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        if (r2 != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.C797441c r7, X.C117735tT r8, java.lang.String r9, int r10, int r11) {
        /*
            r6 = this;
            X.0pd r1 = r6.A0J
            r0 = 1767(0x6e7, float:2.476E-42)
            java.lang.String r0 = r1.A05(r0)
            r5 = 0
            java.util.Map r0 = X.C115255pS.A00(r0)
            java.lang.Object r1 = r0.get(r9)
            X.5ya r1 = (X.C119505ya) r1
            r4 = 1
            if (r10 != r4) goto L_0x0044
            if (r1 == 0) goto L_0x0044
            X.16G r0 = r6.A08
            java.lang.String r2 = r1.A02
            java.lang.String r1 = r1.A01
            X.234 r0 = r0.A00()
            if (r0 == 0) goto L_0x002d
            java.util.Map r0 = r0.A02
            java.lang.String r0 = X.C13690nt.A0e(r2, r0)
            if (r0 == 0) goto L_0x002d
            r1 = r0
        L_0x002d:
            X.5sn r2 = new X.5sn
            r2.<init>(r5, r1, r5, r4)
        L_0x0032:
            boolean r0 = r8.A0L
            r3 = 0
            if (r0 == 0) goto L_0x0043
            r0 = 4
            if (r11 == r0) goto L_0x0043
            if (r2 != 0) goto L_0x00a8
            java.lang.String r1 = "PaymentCheckoutOrderDetailsViewV2"
            java.lang.String r0 = "renderUi, this payment method is not supported"
            X.C110105dW.A1O(r1, r0)
        L_0x0043:
            return r3
        L_0x0044:
            int[] r0 = X.C115485pp.A00
            int r1 = X.C110115dX.A01(r7, r0)
            r0 = 2
            if (r1 == r4) goto L_0x0076
            if (r1 == r0) goto L_0x005c
            java.util.HashMap r1 = r8.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r1.get(r0)
        L_0x0059:
            X.5sn r2 = (X.C117315sn) r2
            goto L_0x0032
        L_0x005c:
            java.util.HashMap r2 = r8.A0H
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Object r2 = r2.get(r1)
            goto L_0x0059
        L_0x006d:
            java.lang.Integer r0 = X.C13680ns.A0a()
            java.lang.Object r2 = r2.get(r0)
            goto L_0x0059
        L_0x0076:
            java.util.HashMap r1 = r8.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r1.get(r0)
            X.5sn r3 = (X.C117315sn) r3
            java.lang.Integer r0 = X.C13680ns.A0X()
            java.lang.Object r2 = r1.get(r0)
            X.5sn r2 = (X.C117315sn) r2
            if (r3 == 0) goto L_0x00a5
            if (r2 == 0) goto L_0x00a3
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131889848(0x7f120eb8, float:1.9414371E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = -1
            java.util.List r0 = r8.A0I
            X.5sn r3 = new X.5sn
            r3.<init>(r5, r2, r0, r1)
        L_0x00a3:
            r2 = r3
            goto L_0x0032
        L_0x00a5:
            if (r2 == 0) goto L_0x00a3
            goto L_0x0032
        L_0x00a8:
            android.widget.Button r1 = r6.A01
            r0 = 20
            X.C110105dW.A0s(r1, r2, r8, r0)
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2.A01(X.41c, X.5tT, java.lang.String, int, int):boolean");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0Q;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0Q = r0;
        }
        return r0.generatedComponent();
    }
}
