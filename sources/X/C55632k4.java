package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.util.List;

/* renamed from: X.2k4  reason: invalid class name and case insensitive filesystem */
public class C55632k4 extends AnonymousClass01X {
    public final List A00;
    public final /* synthetic */ ViewSharedContactArrayActivity A01;

    public C55632k4(ViewSharedContactArrayActivity viewSharedContactArrayActivity, List list) {
        this.A01 = viewSharedContactArrayActivity;
        this.A00 = list;
    }

    public int A0C() {
        return this.A00.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0254, code lost:
        if (r9.A01.A0L == false) goto L_0x0256;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ANf(X.C005602k r22, int r23) {
        /*
            r21 = this;
            r14 = r22
            r9 = r21
            java.util.List r0 = r9.A00
            r1 = r23
            java.lang.Object r8 = r0.get(r1)
            int r1 = r14.A02
            r3 = 2
            r7 = 8
            r5 = 0
            if (r1 == 0) goto L_0x0303
            r4 = 1
            if (r1 == r4) goto L_0x005c
            if (r1 == r3) goto L_0x0245
            r0 = 3
            if (r1 != r0) goto L_0x0049
            X.3SE r14 = (X.AnonymousClass3SE) r14
            X.2k3 r8 = (X.C55622k3) r8
            android.widget.TextView r6 = r14.A01
            X.C45902Bo.A03(r6)
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r7 = r9.A01
            X.0sK r1 = r7.A01
            X.0sH r3 = r8.A02
            X.0rv r0 = r3.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 2131892605(0x7f12197d, float:1.9419963E38)
            java.lang.String r0 = r7.getString(r0)
        L_0x003a:
            r6.setText(r0)
            android.view.View r2 = r14.A00
            r1 = 31
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r0.<init>(r8, r1, r9)
            r2.setOnClickListener(r0)
        L_0x0049:
            return
        L_0x004a:
            r2 = 2131892604(0x7f12197c, float:1.941996E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.0sP r0 = r7.A05
            java.lang.String r0 = r0.A08(r3)
            r1[r5] = r0
            java.lang.String r0 = r7.getString(r2, r1)
            goto L_0x003a
        L_0x005c:
            X.3Sc r14 = (X.C64903Sc) r14
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r15 = r9.A01
            android.view.View r12 = r14.A01
            r12.setClickable(r4)
            android.widget.ImageView r3 = r14.A04
            r3.setVisibility(r5)
            r3.setClickable(r4)
            android.widget.ImageView r2 = r14.A05
            r2.setVisibility(r5)
            r2.setClickable(r4)
            android.widget.ImageView r6 = r14.A03
            r6.setVisibility(r5)
            r7 = r8
            X.4Mj r7 = (X.C84914Mj) r7
            java.util.ArrayList r1 = r15.A0N
            int r0 = r7.A00
            java.lang.Object r1 = r1.get(r0)
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            int r0 = r7.A01
            X.4J2 r1 = com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A02(r1, r0)
            android.view.View r13 = r14.A00
            r13.setTag(r1)
            java.lang.Object r0 = r7.A02
            boolean r10 = r0 instanceof X.C39711sw
            r7 = 4
            if (r10 == 0) goto L_0x0119
            X.1sw r0 = (X.C39711sw) r0
            r1.A00 = r0
            r18 = 2131231416(0x7f0802b8, float:1.8078912E38)
            boolean r10 = r15.A0L
            if (r10 == 0) goto L_0x00a7
            r18 = 2131231401(0x7f0802a9, float:1.8078882E38)
        L_0x00a7:
            java.lang.String r10 = r0.A02
            r11 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass1ZW.A04(r11, r10)
            int r10 = r0.A00
            if (r10 != 0) goto L_0x010e
            java.lang.String r10 = r0.A03
            java.lang.String r17 = X.AnonymousClass1ZW.A04(r11, r10)
        L_0x00b9:
            boolean r1 = r1.A01
            r19 = 1
            r20 = r1
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0A(r14, r15, r16, r17, r18, r19, r20)
            boolean r1 = r15.A0L
            if (r1 != 0) goto L_0x0115
            com.whatsapp.jid.UserJid r11 = r0.A01
            if (r11 == 0) goto L_0x026d
            X.0sK r0 = r15.A01
            boolean r0 = r0.A0I(r11)
            if (r0 != 0) goto L_0x026d
            X.0sG r0 = r15.A03
            X.0sH r10 = r0.A0A(r11)
            r6.setVisibility(r5)
            r1 = 12
            com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0
            r0.<init>(r9, r11, r8, r1)
            r12.setOnClickListener(r0)
            r4 = 1041865114(0x3e19999a, float:0.15)
            X.4kc r0 = new X.4kc
            r0.<init>(r4, r4, r4, r4)
            r3.setOnTouchListener(r0)
            r1 = 11
            com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0
            r0.<init>(r9, r11, r10, r1)
            r3.setOnClickListener(r0)
            X.4kc r0 = new X.4kc
            r0.<init>(r4, r4, r4, r4)
            r2.setOnTouchListener(r0)
            r2.setVisibility(r5)
            com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1
            r0.<init>(r9, r7, r10)
            r2.setOnClickListener(r0)
            return
        L_0x010e:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Phone> r11 = android.provider.ContactsContract.CommonDataKinds.Phone.class
            java.lang.String r17 = com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r15, r11, r10)
            goto L_0x00b9
        L_0x0115:
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A09(r14)
            goto L_0x014b
        L_0x0119:
            boolean r2 = r0 instanceof X.C85294Nw
            if (r2 == 0) goto L_0x01e5
            X.4Nw r0 = (X.C85294Nw) r0
            r1.A00 = r0
            java.lang.Class r2 = r0.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r7 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r2 != r7) goto L_0x0154
            java.lang.String r2 = r0.A02
            r3 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass1ZW.A04(r3, r2)
            int r2 = r0.A00
            if (r2 != 0) goto L_0x014f
            java.lang.String r0 = r0.A03
            java.lang.String r17 = X.AnonymousClass1ZW.A04(r3, r0)
        L_0x0139:
            r18 = 2131231111(0x7f080187, float:1.8078294E38)
            r19 = 2
        L_0x013e:
            boolean r0 = r1.A01
            r20 = r0
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0A(r14, r15, r16, r17, r18, r19, r20)
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A09(r14)
            r6.setVisibility(r5)
        L_0x014b:
            r13.setClickable(r4)
            return
        L_0x014f:
            java.lang.String r17 = com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r15, r7, r2)
            goto L_0x0139
        L_0x0154:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r7 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r2 != r7) goto L_0x0049
            X.4bQ r10 = r0.A04
            if (r10 == 0) goto L_0x01e2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = r10.A03
            if (r3 == 0) goto L_0x0177
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x0177
            java.lang.String r2 = X.C88994bQ.A00(r3)
            r9.append(r2)
            r2 = 10
            r9.append(r2)
        L_0x0177:
            r12 = 0
            java.lang.String r3 = r10.A00
            r11 = 1
            if (r3 == 0) goto L_0x0187
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x0187
            r9.append(r3)
            r12 = 1
        L_0x0187:
            java.lang.String r3 = r10.A02
            java.lang.String r8 = " "
            if (r3 == 0) goto L_0x019c
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x019c
            if (r12 == 0) goto L_0x0198
            r9.append(r8)
        L_0x0198:
            r9.append(r3)
            r12 = 1
        L_0x019c:
            java.lang.String r3 = r10.A04
            if (r3 == 0) goto L_0x01e0
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x01e0
            if (r12 == 0) goto L_0x01ab
            r9.append(r8)
        L_0x01ab:
            r9.append(r3)
        L_0x01ae:
            java.lang.String r3 = r10.A01
            if (r3 == 0) goto L_0x01c0
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x01c0
            if (r11 == 0) goto L_0x01bd
            r9.append(r8)
        L_0x01bd:
            r9.append(r3)
        L_0x01c0:
            java.lang.String r2 = r9.toString()
        L_0x01c4:
            r3 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass1ZW.A04(r3, r2)
            int r2 = r0.A00
            if (r2 != 0) goto L_0x01db
            java.lang.String r0 = r0.A03
            java.lang.String r17 = X.AnonymousClass1ZW.A04(r3, r0)
        L_0x01d4:
            r18 = 2131231110(0x7f080186, float:1.8078292E38)
            r19 = 3
            goto L_0x013e
        L_0x01db:
            java.lang.String r17 = com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r15, r7, r2)
            goto L_0x01d4
        L_0x01e0:
            r11 = r12
            goto L_0x01ae
        L_0x01e2:
            java.lang.String r2 = "null"
            goto L_0x01c4
        L_0x01e5:
            boolean r2 = r0 instanceof X.C87294We
            if (r2 == 0) goto L_0x01fb
            X.4We r0 = (X.C87294We) r0
            r0.toString()
            java.lang.String r8 = r0.A02
            java.lang.String r3 = r0.A01
            java.lang.String r2 = "BDAY"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x02ab
            goto L_0x0274
        L_0x01fb:
            boolean r2 = r0 instanceof X.AnonymousClass4JL
            if (r2 == 0) goto L_0x0049
            X.4JL r0 = (X.AnonymousClass4JL) r0
            java.lang.String r4 = r0.A01
            int r2 = r0.A00
            switch(r2) {
                case 1: goto L_0x0229;
                case 2: goto L_0x022d;
                case 3: goto L_0x0231;
                case 4: goto L_0x0235;
                case 5: goto L_0x0239;
                case 6: goto L_0x023d;
                case 7: goto L_0x0241;
                default: goto L_0x0208;
            }
        L_0x0208:
            r2 = 2131892763(0x7f121a1b, float:1.9420283E38)
        L_0x020b:
            java.lang.String r3 = r15.getString(r2)
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass1ZW.A04(r2, r4)
            java.lang.String r17 = X.AnonymousClass1ZW.A04(r2, r3)
            r18 = 2131231954(0x7f0804d2, float:1.8080004E38)
            r19 = 3
            boolean r2 = r1.A01
            r20 = r2
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0A(r14, r15, r16, r17, r18, r19, r20)
            r1.A00 = r0
            goto L_0x02da
        L_0x0229:
            r2 = 2131893123(0x7f121b83, float:1.9421014E38)
            goto L_0x020b
        L_0x022d:
            r2 = 2131893120(0x7f121b80, float:1.9421008E38)
            goto L_0x020b
        L_0x0231:
            r2 = 2131893125(0x7f121b85, float:1.9421018E38)
            goto L_0x020b
        L_0x0235:
            r2 = 2131893122(0x7f121b82, float:1.9421012E38)
            goto L_0x020b
        L_0x0239:
            r2 = 2131893126(0x7f121b86, float:1.942102E38)
            goto L_0x020b
        L_0x023d:
            r2 = 2131893121(0x7f121b81, float:1.942101E38)
            goto L_0x020b
        L_0x0241:
            r2 = 2131893124(0x7f121b84, float:1.9421016E38)
            goto L_0x020b
        L_0x0245:
            X.3SD r14 = (X.AnonymousClass3SD) r14
            X.4FO r8 = (X.AnonymousClass4FO) r8
            android.view.View r2 = r14.A00
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0256
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r9.A01
            boolean r1 = r0.A0L
            r0 = 0
            if (r1 != 0) goto L_0x0258
        L_0x0256:
            r0 = 8
        L_0x0258:
            r2.setVisibility(r0)
            android.view.View r1 = r14.A01
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x026b
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r9.A01
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x026b
        L_0x0267:
            r1.setVisibility(r7)
            return
        L_0x026b:
            r7 = 0
            goto L_0x0267
        L_0x026d:
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A09(r14)
            r6.setVisibility(r7)
            return
        L_0x0274:
            java.lang.String r2 = "--"
            boolean r2 = r8.startsWith(r2)     // Catch:{ ParseException -> 0x02a7 }
            if (r2 == 0) goto L_0x029b
            java.lang.String r9 = "--MM-dd"
        L_0x027e:
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ ParseException -> 0x02a7 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x02a7 }
            r2.<init>(r9, r3)     // Catch:{ ParseException -> 0x02a7 }
            java.util.Date r2 = r2.parse(r8)     // Catch:{ ParseException -> 0x02a7 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ ParseException -> 0x02a7 }
            long r2 = r2.getTime()     // Catch:{ ParseException -> 0x02a7 }
            if (r4 == 0) goto L_0x02a0
            X.013 r4 = r15.A0A     // Catch:{ ParseException -> 0x02a7 }
            java.lang.String r8 = X.C28891Zc.A01(r4, r2)     // Catch:{ ParseException -> 0x02a7 }
            goto L_0x02ab
        L_0x029b:
            java.lang.String r9 = "yyyy-MM-dd"
            r4 = 0
            goto L_0x027e
        L_0x02a0:
            X.013 r4 = r15.A0A     // Catch:{ ParseException -> 0x02a7 }
            java.lang.String r8 = X.C28891Zc.A05(r4, r2)     // Catch:{ ParseException -> 0x02a7 }
            goto L_0x02ab
        L_0x02a7:
            r2 = move-exception
            r2.printStackTrace()
        L_0x02ab:
            java.util.HashMap r3 = X.C39701sv.A0C
            java.lang.String r2 = r0.A01
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L_0x02de
            java.util.HashMap r3 = X.C39701sv.A0B
            java.lang.String r2 = r0.A01
            java.lang.Object r3 = r3.get(r2)
        L_0x02bd:
            java.lang.String r3 = (java.lang.String) r3
        L_0x02bf:
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass1ZW.A04(r2, r8)
            java.lang.String r17 = X.AnonymousClass1ZW.A04(r2, r3)
            r18 = 2131231110(0x7f080186, float:1.8078292E38)
            r19 = 3
            boolean r2 = r1.A01
            r20 = r2
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0A(r14, r15, r16, r17, r18, r19, r20)
            r1.A00 = r0
            r6.setVisibility(r7)
        L_0x02da:
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A09(r14)
            return
        L_0x02de:
            java.lang.String r3 = r0.A01
            java.lang.String r2 = "URL"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x02fc
            java.util.Set r2 = r0.A04
            java.lang.Object[] r3 = r2.toArray()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x02f4
            r3 = r3[r5]
            goto L_0x02bd
        L_0x02f4:
            r2 = 2131892763(0x7f121a1b, float:1.9420283E38)
            java.lang.String r3 = r15.getString(r2)
            goto L_0x02bf
        L_0x02fc:
            java.util.HashMap r2 = X.C39701sv.A0B
            java.lang.Object r3 = r2.get(r3)
            goto L_0x02bd
        L_0x0303:
            X.3ST r14 = (X.AnonymousClass3ST) r14
            X.4FP r8 = (X.AnonymousClass4FP) r8
            X.1sv r4 = r8.A00
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r6 = r9.A01
            boolean r0 = r6.A0L
            if (r0 != 0) goto L_0x0381
            X.0sK r0 = r6.A01
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0381
            android.widget.Button r2 = r14.A00
            r2.setVisibility(r5)
            r1 = 5
            com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1
            r0.<init>(r9, r1, r4)
            r2.setOnClickListener(r0)
        L_0x0325:
            com.obwhatsapp.TextEmojiLabel r9 = r14.A03
            java.lang.String r1 = r4.A02()
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r8 = X.AnonymousClass1ZW.A04(r0, r1)
            android.text.TextPaint r2 = r9.getPaint()
            X.0um r1 = r6.A0B
            if (r8 != 0) goto L_0x0377
            r0 = 0
        L_0x033a:
            r9.setText(r0)
            r2 = 0
            java.util.List r0 = r4.A04
            if (r0 == 0) goto L_0x0352
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0352
            java.util.List r0 = r4.A04
            java.lang.Object r0 = r0.get(r5)
            X.4JJ r0 = (X.AnonymousClass4JJ) r0
            java.lang.String r2 = r0.A00
        L_0x0352:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0368
            android.widget.TextView r0 = r14.A02
            r0.setVisibility(r7)
        L_0x035d:
            X.2Ao r1 = r6.A06
            android.widget.ImageView r0 = r14.A01
            r1.A09(r0, r4)
            X.C004601z.A0d(r0, r3)
            return
        L_0x0368:
            android.widget.TextView r1 = r14.A02
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r0, r2)
            r1.setText(r0)
            r1.setVisibility(r5)
            goto L_0x035d
        L_0x0377:
            X.4yD r0 = new X.4yD
            r0.<init>()
            java.lang.CharSequence r0 = X.AnonymousClass2Sy.A02(r6, r2, r0, r1, r8)
            goto L_0x033a
        L_0x0381:
            android.widget.Button r0 = r14.A00
            r0.setVisibility(r7)
            goto L_0x0325
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55632k4.ANf(X.02k, int):void");
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 0) {
            return new AnonymousClass3ST(from.inflate(R.layout.layout0507, (ViewGroup) null, true));
        }
        if (i2 == 1) {
            return new C64903Sc(from.inflate(R.layout.layout012f, (ViewGroup) null, true));
        }
        if (i2 == 2) {
            return new AnonymousClass3SD(from.inflate(R.layout.layout012a, (ViewGroup) null, true));
        }
        if (i2 == 3) {
            return new AnonymousClass3SE(from.inflate(R.layout.layout0137, (ViewGroup) null, true));
        }
        throw new IllegalStateException();
    }

    public int getItemViewType(int i2) {
        Object obj = this.A00.get(i2);
        if (obj instanceof AnonymousClass4FP) {
            return 0;
        }
        if (obj instanceof C84914Mj) {
            return 1;
        }
        if (obj instanceof AnonymousClass4FO) {
            return 2;
        }
        return obj instanceof C55622k3 ? 3 : -1;
    }
}
