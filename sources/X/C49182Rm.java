package X;

import com.obwhatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Rm  reason: invalid class name and case insensitive filesystem */
public class C49182Rm extends C49192Rn {
    public AnonymousClass05M A00;
    public AnonymousClass05M A01;
    public List A02 = new ArrayList();
    public final ContactPickerFragment A03;
    public final AnonymousClass01D A04;

    public C49182Rm(ContactPickerFragment contactPickerFragment, AnonymousClass01D r3) {
        this.A03 = contactPickerFragment;
        this.A04 = r3;
    }

    public int getCount() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A02.get(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04dc, code lost:
        if (X.AnonymousClass2BX.A03(r22, r24, r4, r14, r13) != false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0518, code lost:
        if (r11 != false) goto L_0x051a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05ca, code lost:
        if (r4.A0j == false) goto L_0x0622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x073e, code lost:
        if (r6.A2d != false) goto L_0x0740;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c9, code lost:
        if (r6.A1d.A0E(X.C16620tM.A02, 691) == false) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x07cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x031c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r40, android.view.View r41, android.view.ViewGroup r42) {
        /*
            r39 = this;
            r9 = r41
            r8 = r39
            java.util.List r0 = r8.A02
            r1 = r40
            java.lang.Object r11 = r0.get(r1)
            X.2XJ r11 = (X.AnonymousClass2XJ) r11
            boolean r0 = r11 instanceof X.C56022kp
            r2 = 2
            r7 = 0
            r3 = r42
            if (r0 == 0) goto L_0x0047
            if (r41 != 0) goto L_0x0028
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r8.A03
            android.view.LayoutInflater r1 = r0.A05()
            r0 = 2131559320(0x7f0d0398, float:1.874398E38)
            android.view.View r9 = r1.inflate(r0, r3, r7)
            X.C004601z.A0d(r9, r2)
        L_0x0028:
            r0 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.view.View r1 = r9.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.AnonymousClass1UP.A06(r1)
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r8.A03
            boolean r0 = r0.A2k
            if (r0 == 0) goto L_0x003f
            if (r1 == 0) goto L_0x003f
            r1.setSingleLine(r7)
        L_0x003f:
            X.2kp r11 = (X.C56022kp) r11
            java.lang.String r0 = r11.A00
            r1.setText(r0)
            return r9
        L_0x0047:
            boolean r0 = r11 instanceof X.C101354xB
            if (r0 == 0) goto L_0x0071
            if (r41 != 0) goto L_0x0066
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r8.A03
            android.view.LayoutInflater r1 = r0.A05()
            r0 = 2131559316(0x7f0d0394, float:1.8743973E38)
            android.view.View r9 = r1.inflate(r0, r3, r7)
            r0 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.AnonymousClass1UP.A06(r0)
        L_0x0066:
            r1 = 14
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0
            r0.<init>(r8, r1, r11)
            r9.setOnClickListener(r0)
            return r9
        L_0x0071:
            boolean r0 = r11 instanceof X.AnonymousClass4x9
            if (r0 == 0) goto L_0x00b7
            if (r41 != 0) goto L_0x0087
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r8.A03
            android.view.LayoutInflater r1 = r0.A05()
            r0 = 2131559315(0x7f0d0393, float:1.874397E38)
            android.view.View r9 = r1.inflate(r0, r3, r7)
            X.C004601z.A0d(r9, r2)
        L_0x0087:
            com.obwhatsapp.contact.picker.ContactPickerFragment r3 = r8.A03
            X.18a r0 = r3.A1a
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "disappearing_mode_duration_for_chat_picker_int"
            int r2 = r1.getInt(r0, r7)
            r0 = 2131363503(0x7f0a06af, float:1.8346817E38)
            android.view.View r1 = r9.findViewById(r0)
            com.obwhatsapp.settings.SettingsRowIconText r1 = (com.obwhatsapp.settings.SettingsRowIconText) r1
            X.00l r0 = r3.A0C()
            if (r0 == 0) goto L_0x00ad
            if (r1 == 0) goto L_0x00ad
            java.lang.String r0 = X.C40491uD.A03(r0, r2, r7, r7)
            r1.setSubText(r0)
        L_0x00ad:
            r1 = 4
            com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0
            r0.<init>(r8, r2, r1)
            r9.setOnClickListener(r0)
            return r9
        L_0x00b7:
            com.obwhatsapp.contact.picker.ContactPickerFragment r6 = r8.A03
            boolean r0 = r6.A2l
            if (r0 == 0) goto L_0x00cb
            X.0pd r2 = r6.A1d
            r1 = 691(0x2b3, float:9.68E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r18 = 1
            if (r0 != 0) goto L_0x00cd
        L_0x00cb:
            r18 = 0
        L_0x00cd:
            if (r41 == 0) goto L_0x08da
            java.lang.Object r0 = r9.getTag()
            boolean r0 = r0 instanceof X.AnonymousClass4PA
            if (r0 == 0) goto L_0x08da
            java.lang.Object r2 = r9.getTag()
            X.4PA r2 = (X.AnonymousClass4PA) r2
        L_0x00dd:
            r9.setClickable(r7)
            r9.setLongClickable(r7)
            android.widget.ImageView r0 = r2.A04
            r22 = r0
            r3 = 8
            r0.setVisibility(r3)
            android.view.View r10 = r2.A00
            r10.setVisibility(r3)
            android.widget.TextView r0 = r2.A09
            r26 = r0
            r0.setVisibility(r3)
            boolean r0 = r11 instanceof X.AnonymousClass2XI
            r1 = 0
            if (r0 == 0) goto L_0x015d
            X.2XI r11 = (X.AnonymousClass2XI) r11
            r0 = 2
            X.C004601z.A0d(r9, r0)
            r9.setBackgroundResource(r7)
            r0 = r26
            r0.setVisibility(r3)
            android.widget.TextView r0 = r2.A0B
            r0.setVisibility(r3)
            com.obwhatsapp.TextEmojiLabel r0 = r2.A0C
            r0.setVisibility(r3)
            android.widget.ImageView r4 = r2.A05
            r0 = 4
            r4.setVisibility(r0)
            X.1cU r8 = r2.A0D
            com.obwhatsapp.TextEmojiLabel r0 = r8.A02
            java.lang.String r0 = r11.A00
            r8.A0E(r0)
            android.content.Context r5 = r6.A0u()
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            int r0 = X.AnonymousClass00T.A00(r5, r0)
            r8.A06(r0)
            com.obwhatsapp.components.SelectionCheckView r0 = r2.A0E
            r0.A04(r7, r7)
            android.widget.ImageView r0 = r2.A06
            r0.setVisibility(r3)
            android.widget.TextView r0 = r2.A08
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r3)
            android.widget.TextView r0 = r2.A0A
            r0.setVisibility(r3)
            android.view.View r0 = r2.A01
            r0.setOnClickListener(r1)
            r4.setOnClickListener(r1)
            r0.setClickable(r7)
            r4.setClickable(r7)
        L_0x0159:
            X.C004601z.A0j(r9, r1)
            return r9
        L_0x015d:
            r0 = 1
            X.C004601z.A0d(r9, r0)
            X.00l r20 = r6.A0C()
            X.0sH r4 = r11.AAn()
            X.AnonymousClass00B.A06(r4)
            android.widget.ImageView r3 = r2.A05
            r3.setVisibility(r7)
            r3.setEnabled(r0)
            X.1cU r0 = r2.A0D
            r25 = r0
            r5 = 2131100935(0x7f060507, float:1.7814265E38)
            r0 = r20
            int r5 = X.AnonymousClass00T.A00(r0, r5)
            r0 = r25
            r0.A06(r5)
            X.05J r0 = r6.A0J
            if (r0 != 0) goto L_0x08c8
            X.0rv r12 = r4.A0E
            boolean r0 = X.C16030sJ.A0Q(r12)
            if (r0 != 0) goto L_0x08c8
            boolean r0 = r6.A2l
            if (r0 != 0) goto L_0x019a
            boolean r0 = r6.A2e
            if (r0 == 0) goto L_0x08c8
        L_0x019a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class<com.obwhatsapp.contact.picker.ContactPicker> r0 = com.obwhatsapp.contact.picker.ContactPicker.class
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            X.AnonymousClass00B.A06(r12)
            java.lang.String r0 = r12.getRawString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            X.C004601z.A0n(r3, r0)
            com.whatsapp.util.ViewOnClickCListenerShape0S1200000_I0 r5 = new com.whatsapp.util.ViewOnClickCListenerShape0S1200000_I0
            r5.<init>(r8, r0, r4, r7)
            android.view.View r0 = r2.A01
            r21 = r0
            r0.setOnClickListener(r5)
            r3.setOnClickListener(r5)
            X.0sP r0 = r6.A0r
            java.lang.String r0 = r0.A08(r4)
            r3.setContentDescription(r0)
        L_0x01d1:
            boolean r0 = r11 instanceof X.AnonymousClass3oS
            r19 = r0
            if (r0 == 0) goto L_0x07cd
            r0 = r11
            X.3oS r0 = (X.AnonymousClass3oS) r0
            r16 = r0
            java.util.List r0 = r0.A00
            r15 = r0
            int r5 = r0.size()
            r0 = 1
            if (r5 > r0) goto L_0x01e7
            r0 = 0
        L_0x01e7:
            r14 = 8
            if (r0 == 0) goto L_0x07c6
            android.content.Context r5 = r6.A0u()
            X.013 r0 = r6.A1H
            java.lang.CharSequence r5 = X.C16080sP.A00(r5, r0, r4)
            r0 = r26
            r0.setText(r5)
            r5 = 2131100028(0x7f06017c, float:1.7812426E38)
            r0 = r20
            int r5 = X.AnonymousClass00T.A00(r0, r5)
            r0 = r26
            r0.setVisibility(r7)
        L_0x0208:
            android.widget.LinearLayout r0 = r2.A07
            r0.setVisibility(r7)
            android.widget.TextView r10 = r2.A0A
            r10.setVisibility(r7)
            r10.setClickable(r7)
            r10.setFocusable(r7)
            android.widget.ImageView r13 = r2.A06
            r13.setVisibility(r14)
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r14)
            com.obwhatsapp.TextEmojiLabel r12 = r2.A0C
            if (r18 == 0) goto L_0x07b4
            r12.setVisibility(r14)
            r0 = r26
            r0.setVisibility(r14)
            int r5 = r15.size()
            r0 = 1
            if (r5 <= r0) goto L_0x07ba
            com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0 r5 = new com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0
            r0 = r16
            r5.<init>(r8, r4, r0, r7)
            r10.setOnClickListener(r5)
        L_0x023f:
            android.widget.TextView r5 = r2.A0B
            r5.setVisibility(r14)
            X.AnonymousClass1UP.A06(r10)
        L_0x0247:
            r10 = r1
        L_0x0248:
            boolean r0 = r11 instanceof X.C101364xC
            r18 = r0
            if (r0 == 0) goto L_0x0266
            X.0sH r0 = r11.AAn()
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0266
            r0 = r26
            r0.setVisibility(r7)
            r11 = 2131889162(0x7f120c0a, float:1.941298E38)
            r0.setText(r11)
        L_0x0266:
            r25.A05()
            X.2Ao r0 = r6.A0s
            if (r0 == 0) goto L_0x0270
            r0.A08(r3, r4, r7)
        L_0x0270:
            X.0rv r0 = r4.A0E
            r12.setTag(r0)
            X.0rv r0 = r4.A0E
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x03cc
            r25.A04()
            java.lang.String r0 = ""
            r5.setText(r0)
            r13.setVisibility(r7)
            boolean r0 = r6.A2Z
            if (r0 == 0) goto L_0x03c4
            r1 = 2131231757(0x7f08040d, float:1.8079604E38)
            r0 = r20
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r0, r1)
            android.graphics.drawable.Drawable r11 = X.C018208n.A03(r0)
            r1 = 2131101273(0x7f060659, float:1.7814951E38)
            r0 = r20
            int r0 = X.AnonymousClass00T.A00(r0, r1)
            X.C018208n.A0A(r11, r0)
            r13.setImageDrawable(r11)
        L_0x02a8:
            r0 = 2131889419(0x7f120d0b, float:1.9413501E38)
            java.lang.String r0 = r6.A0J(r0)
            r13.setContentDescription(r0)
            r1 = 16
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r0 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2
            r0.<init>(r8, r1)
            r13.setOnClickListener(r0)
            r13.setFocusable(r7)
            X.1m6 r11 = r6.A1U
            int r1 = r11.A00
            if (r1 == 0) goto L_0x03a8
            r0 = 1
            if (r1 == r0) goto L_0x03ac
            r0 = 2
            if (r1 != r0) goto L_0x0a0a
            java.util.List r0 = r11.A02
            int r15 = r0.size()
            if (r15 == 0) goto L_0x03a8
            X.013 r14 = r6.A1H
            r13 = 2131755307(0x7f10012b, float:1.914149E38)
        L_0x02d8:
            long r0 = (long) r15
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r11[r7] = r15
            java.lang.String r0 = r14.A0J(r11, r13, r0)
        L_0x02e6:
            r12.setText(r0)
            boolean r0 = r6.A1s()
            if (r0 != 0) goto L_0x02f2
            r9.setPadding(r7, r7, r7, r7)
        L_0x02f2:
            r6.A0C = r9
        L_0x02f4:
            r1 = r10
            java.util.Map r0 = r6.A2w
            java.util.Map r11 = java.util.Collections.unmodifiableMap(r0)
            java.lang.Class<X.0rv> r10 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r4.A08(r10)
            boolean r14 = r11.containsKey(r0)
            r0 = 0
            if (r14 == 0) goto L_0x030b
            r0 = 2131100872(0x7f0604c8, float:1.7814138E38)
        L_0x030b:
            r9.setBackgroundResource(r0)
            java.util.Set r11 = r6.A2y
            com.whatsapp.jid.Jid r0 = r4.A08(r10)
            boolean r11 = r11.remove(r0)
            com.obwhatsapp.components.SelectionCheckView r0 = r2.A0E
            if (r11 == 0) goto L_0x03a3
            android.view.ViewTreeObserver r13 = r0.getViewTreeObserver()
            r11 = 1
            com.facebook.redex.IDxDListenerShape1S0210000_2_I0 r0 = new com.facebook.redex.IDxDListenerShape1S0210000_2_I0
            r0.<init>(r8, r2, r11, r14)
            r13.addOnPreDrawListener(r0)
        L_0x0329:
            boolean r0 = r6.A2h
            if (r0 == 0) goto L_0x036c
            java.util.Set r0 = r6.A2x
            java.util.Set r8 = java.util.Collections.unmodifiableSet(r0)
            com.whatsapp.jid.Jid r0 = r4.A08(r10)
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x036c
            android.widget.LinearLayout r0 = r2.A07
            r8 = 8
            r0.setVisibility(r8)
            r0 = r26
            r0.setVisibility(r8)
            r12.setVisibility(r7)
            r0 = 2131887427(0x7f120543, float:1.940946E38)
            r12.setText(r0)
            r3.setEnabled(r7)
            r0 = 1
            r9.setClickable(r0)
            r9.setLongClickable(r0)
            r3 = 0
            r0 = 2
            r3 = 2131100929(0x7f060501, float:1.7814253E38)
            r0 = r20
            int r3 = X.AnonymousClass00T.A00(r0, r3)
            r0 = r25
            r0.A06(r3)
        L_0x036c:
            boolean r0 = r6.A2i
            if (r0 != 0) goto L_0x0378
            boolean r0 = r6.A2o
            if (r0 != 0) goto L_0x0378
            boolean r0 = r6.A2q
            if (r0 == 0) goto L_0x0159
        L_0x0378:
            android.widget.ImageView r5 = r2.A03
            if (r5 == 0) goto L_0x0159
            X.0rt r3 = r6.A1P
            X.0sG r2 = r6.A0m
            com.whatsapp.jid.Jid r0 = r4.A08(r10)
            X.0rv r0 = (X.C15830rv) r0
            int r2 = X.C40491uD.A00(r2, r3, r0)
            r0 = 8
            if (r2 <= 0) goto L_0x038f
            r0 = 0
        L_0x038f:
            r5.setVisibility(r0)
            X.013 r0 = r6.A1H
            java.lang.String r0 = X.C40491uD.A04(r0, r2)
            r5.setContentDescription(r0)
            r0 = 2131231584(0x7f080360, float:1.8079253E38)
            r5.setImageResource(r0)
            goto L_0x0159
        L_0x03a3:
            r0.A04(r14, r7)
            goto L_0x0329
        L_0x03a8:
            r0 = 2131891451(0x7f1214fb, float:1.9417622E38)
            goto L_0x03b7
        L_0x03ac:
            java.util.List r0 = r11.A01
            int r15 = r0.size()
            if (r15 != 0) goto L_0x03bd
            r0 = 2131889641(0x7f120de9, float:1.9413951E38)
        L_0x03b7:
            java.lang.String r0 = r6.A0J(r0)
            goto L_0x02e6
        L_0x03bd:
            X.013 r14 = r6.A1H
            r13 = 2131755308(0x7f10012c, float:1.9141492E38)
            goto L_0x02d8
        L_0x03c4:
            r0 = 2131231492(0x7f080304, float:1.8079067E38)
            r13.setImageResource(r0)
            goto L_0x02a8
        L_0x03cc:
            android.content.res.Resources r11 = r6.A03()
            r0 = 2131166439(0x7f0704e7, float:1.7947123E38)
            int r0 = r11.getDimensionPixelSize(r0)
            r9.setPadding(r7, r7, r0, r7)
            X.0sK r11 = r6.A0Q
            X.0rv r0 = r4.A0E
            boolean r0 = r11.A0I(r0)
            if (r0 == 0) goto L_0x048b
            boolean r0 = r6.A2l
            if (r0 != 0) goto L_0x03f0
            boolean r0 = r6.A2i
            if (r0 != 0) goto L_0x03f0
            boolean r0 = r6.A2q
            if (r0 == 0) goto L_0x048b
        L_0x03f0:
            X.0pd r13 = r6.A1d
            r11 = 1967(0x7af, float:2.756E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r13.A0E(r0, r11)
            if (r0 == 0) goto L_0x048b
            r17 = 1
            java.util.ArrayList r0 = r6.A2J
            if (r0 != 0) goto L_0x0485
            r13 = 0
        L_0x0403:
            r11 = 1065353216(0x3f800000, float:1.0)
            r0 = r25
            r0.A0C(r4, r1, r13, r11)
        L_0x040a:
            boolean r0 = r4.A0J()
            if (r0 != 0) goto L_0x0422
            X.0rv r0 = r4.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x0422
            boolean r0 = r6.A2k
            if (r0 == 0) goto L_0x066d
            boolean r0 = r4.A0H()
            if (r0 == 0) goto L_0x066d
        L_0x0422:
            boolean r0 = r6.A2k
            r21 = 0
            if (r0 == 0) goto L_0x051c
            boolean r0 = r4.A0H()
            if (r0 != 0) goto L_0x051a
            X.0rv r0 = r4.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x051a
            java.lang.Class<X.0sL> r19 = X.C16050sL.class
            r0 = r19
            com.whatsapp.jid.Jid r13 = r4.A08(r0)
            X.AnonymousClass00B.A06(r13)
            X.0sL r13 = (X.C16050sL) r13
            X.0sO r0 = r6.A1R
            r24 = r0
            X.0ul r0 = r6.A1g
            r23 = r0
            X.0rt r0 = r6.A1P
            r22 = r0
            X.0uP r11 = r6.A0q
            X.15l r14 = r6.A1k
            r0 = r24
            X.0us r0 = r0.A07
            X.1cE r0 = r0.A04(r13)
            X.0uz r0 = r0.A04()
            X.1Ub r18 = r0.iterator()
            r17 = 0
        L_0x0465:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x04c2
            java.lang.Object r15 = r18.next()
            X.1ck r15 = (X.C30661ck) r15
            com.whatsapp.jid.UserJid r0 = r15.A03
            boolean r0 = r11.A02(r0)
            if (r0 == 0) goto L_0x0480
            int r15 = r15.A01
            r0 = 2
            r16 = 1
            if (r15 == r0) goto L_0x0482
        L_0x0480:
            r16 = 0
        L_0x0482:
            r17 = r17 | r16
            goto L_0x0465
        L_0x0485:
            java.util.List r13 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0403
        L_0x048b:
            r17 = 0
            X.0rv r0 = r4.A0E
            boolean r11 = X.C16030sJ.A0M(r0)
            java.util.ArrayList r0 = r6.A2J
            if (r0 != 0) goto L_0x04b4
            r16 = 0
        L_0x0499:
            if (r11 == 0) goto L_0x04b9
            r0 = r25
            X.0sP r11 = r0.A03
            r0 = 6
            X.0sQ r13 = r11.A04(r4, r0)
            boolean r11 = r4.A0L()
            r15 = r25
            r14 = r13
            r13 = r11
            r11 = r0
            r0 = r16
            r15.A08(r14, r0, r11, r13)
            goto L_0x040a
        L_0x04b4:
            java.util.List r16 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0499
        L_0x04b9:
            r11 = r25
            r0 = r16
            r11.A0D(r4, r0)
            goto L_0x040a
        L_0x04c2:
            int r0 = r4.A01
            r15 = 1
            r11 = 0
            if (r0 <= 0) goto L_0x04c9
            r11 = 1
        L_0x04c9:
            r0 = r24
            boolean r0 = X.AnonymousClass2BW.A01(r0, r4, r14, r13)
            if (r0 != 0) goto L_0x04de
            if (r11 != 0) goto L_0x04de
            r11 = r24
            r0 = r22
            boolean r0 = X.AnonymousClass2BX.A03(r0, r11, r4, r14, r13)
            r11 = 0
            if (r0 == 0) goto L_0x04df
        L_0x04de:
            r11 = 1
        L_0x04df:
            r0 = r23
            boolean r0 = r0.A0e(r4)
            if (r17 != 0) goto L_0x066a
            if (r11 == 0) goto L_0x066a
            if (r0 != 0) goto L_0x066a
        L_0x04eb:
            r14 = r15 ^ 1
            X.0sO r11 = r6.A1R
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r4.A08(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r11.A09(r0)
            r13 = r0 ^ 1
            X.0ul r11 = r6.A1g
            r0 = r19
            com.whatsapp.jid.Jid r0 = r4.A08(r0)
            X.AnonymousClass00B.A06(r0)
            X.0rv r0 = (X.C15830rv) r0
            boolean r11 = r11.A0g(r4, r0)
            boolean r0 = r4.A0J()
            if (r0 == 0) goto L_0x051c
            if (r14 != 0) goto L_0x051a
            if (r13 != 0) goto L_0x051a
            if (r11 == 0) goto L_0x051c
        L_0x051a:
            r21 = 1
        L_0x051c:
            java.lang.String r11 = ""
            r13 = 0
            if (r21 == 0) goto L_0x0581
            r10 = 2131887676(0x7f12063c, float:1.9409966E38)
            r3.setEnabled(r7)
            r0 = 1
            r9.setClickable(r0)
            r9.setLongClickable(r0)
            r12.setText(r10)
            r12.setSingleLine(r7)
            r0 = 2
            android.view.ViewGroup$LayoutParams r10 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r10 = (android.widget.FrameLayout.LayoutParams) r10
            r0 = 49
            r10.gravity = r0
            android.content.res.Resources r0 = r20.getResources()
            r1 = 2131165966(0x7f07030e, float:1.7946164E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r10.topMargin = r0
            r3.setLayoutParams(r10)
            android.content.res.Resources r0 = r20.getResources()
            int r1 = r0.getDimensionPixelSize(r1)
            r0 = r25
            com.obwhatsapp.TextEmojiLabel r0 = r0.A02
            r0.setPadding(r7, r1, r7, r7)
            r1 = 2131100929(0x7f060501, float:1.7814253E38)
        L_0x0561:
            r0 = r20
            int r1 = X.AnonymousClass00T.A00(r0, r1)
            r0 = r25
            r0.A06(r1)
            X.05M r10 = r8.A00
            if (r10 != 0) goto L_0x0579
            r0 = 9
            com.facebook.redex.IDxDCompatShape22S0100000_2_I0 r10 = new com.facebook.redex.IDxDCompatShape22S0100000_2_I0
            r10.<init>(r8, r0)
            r8.A00 = r10
        L_0x0579:
            r5.setText(r11)
            r9.setLongClickable(r7)
            goto L_0x02f4
        L_0x0581:
            boolean r0 = r6.A2q
            if (r0 != 0) goto L_0x0591
            boolean r0 = r6.A2i
            if (r0 != 0) goto L_0x0591
            boolean r0 = r6.A2o
            if (r0 != 0) goto L_0x0591
            boolean r0 = r6.A2p
            if (r0 == 0) goto L_0x0622
        L_0x0591:
            boolean r0 = r4.A0J()
            if (r0 == 0) goto L_0x0622
            X.0sO r15 = r6.A1R
            java.lang.Class<com.whatsapp.jid.GroupJid> r14 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r4.A08(r14)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r15.A09(r0)
            if (r0 == 0) goto L_0x05cc
            X.0ul r15 = r6.A1g
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r0 = r4.A08(r0)
            X.AnonymousClass00B.A06(r0)
            X.0rv r0 = (X.C15830rv) r0
            boolean r0 = r15.A0g(r4, r0)
            if (r0 != 0) goto L_0x05cc
            X.0s5 r15 = r6.A0T
            X.0s8 r0 = X.C15910s6.A0O
            boolean r0 = r15.A05(r0)
            if (r0 == 0) goto L_0x0622
            boolean r0 = r6.A2T
            if (r0 == 0) goto L_0x0622
            boolean r0 = r4.A0j
            if (r0 == 0) goto L_0x0622
        L_0x05cc:
            X.0sO r10 = r6.A1R
            com.whatsapp.jid.Jid r0 = r4.A08(r14)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r10.A09(r0)
            if (r0 != 0) goto L_0x05fd
            boolean r0 = r4.A0a
            r10 = 2131889688(0x7f120e18, float:1.9414047E38)
            if (r0 == 0) goto L_0x05e4
            r10 = 2131887010(0x7f1203a2, float:1.9408615E38)
        L_0x05e4:
            r3.setEnabled(r7)
            r0 = 1
            r9.setClickable(r0)
            r9.setLongClickable(r0)
            r12.setText(r10)
            r0 = 2
            r1 = 2131100929(0x7f060501, float:1.7814253E38)
            r0 = r20
            int r0 = X.AnonymousClass00T.A00(r0, r1)
            goto L_0x0561
        L_0x05fd:
            boolean r0 = r6.A2T
            if (r0 == 0) goto L_0x0613
            boolean r0 = r4.A0j
            if (r0 == 0) goto L_0x0613
            X.0s5 r10 = r6.A0T
            X.0s8 r0 = X.C15910s6.A0O
            boolean r0 = r10.A05(r0)
            if (r0 == 0) goto L_0x0613
            r10 = 2131889648(0x7f120df0, float:1.9413966E38)
            goto L_0x05e4
        L_0x0613:
            X.0ul r0 = r6.A1g
            boolean r0 = r0.A0e(r4)
            r10 = 2131889808(0x7f120e90, float:1.941429E38)
            if (r0 == 0) goto L_0x05e4
            r10 = 2131891995(0x7f12171b, float:1.9418726E38)
            goto L_0x05e4
        L_0x0622:
            X.0sP r14 = r6.A0r
            java.lang.Class<X.0sN> r0 = X.C16060sN.class
            com.whatsapp.jid.Jid r1 = r4.A08(r0)
            java.util.concurrent.ConcurrentHashMap r0 = r14.A0D
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0657
            X.0rv r0 = r4.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 == 0) goto L_0x0652
            java.lang.String r0 = r4.A09()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0652
            java.util.ArrayList r0 = r6.A2J
            if (r0 == 0) goto L_0x0652
            java.util.List r13 = java.util.Collections.unmodifiableList(r0)
        L_0x0652:
            r12.A0I(r13, r1)
            goto L_0x0579
        L_0x0657:
            r12.setText(r11)
            X.0sq r13 = r6.A24
            X.0sP r0 = r6.A0r
            X.3yk r1 = new X.3yk
            r1.<init>(r12, r0, r4)
            java.lang.Void[] r0 = new java.lang.Void[r7]
            r13.Ack(r1, r0)
            goto L_0x0579
        L_0x066a:
            r15 = 0
            goto L_0x04eb
        L_0x066d:
            if (r19 == 0) goto L_0x067e
            java.lang.String r0 = X.C24561Gk.A01(r4)
            r12.setText(r0)
            r9.setLongClickable(r7)
            r9.setClickable(r7)
            goto L_0x02f4
        L_0x067e:
            X.01Y r11 = r6.A0a
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r4.A08(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r11.A0V(r0)
            if (r0 == 0) goto L_0x06dd
            r12.setVisibility(r7)
            r10 = 2131100929(0x7f060501, float:1.7814253E38)
            r0 = r20
            int r10 = X.AnonymousClass00T.A00(r0, r10)
            r0 = 2131892109(0x7f12178d, float:1.9418957E38)
            r12.setText(r0)
            r0 = 2
            r0 = r25
            r0.A06(r10)
            r0 = 1056964608(0x3f000000, float:0.5)
            r3.setAlpha(r0)
            r0 = r21
            r0.setOnClickListener(r1)
            r3.setOnClickListener(r1)
            r0.setClickable(r7)
            r3.setClickable(r7)
            X.05M r10 = r8.A01
            if (r10 != 0) goto L_0x06c6
            r0 = 8
            com.facebook.redex.IDxDCompatShape22S0100000_2_I0 r10 = new com.facebook.redex.IDxDCompatShape22S0100000_2_I0
            r10.<init>(r8, r0)
            r8.A01 = r10
        L_0x06c6:
            boolean r0 = r6.A1o()
            if (r0 != 0) goto L_0x02f4
            android.content.Context r1 = r6.A0u()
            X.013 r0 = r6.A1H
            java.lang.CharSequence r0 = X.C16080sP.A00(r1, r0, r4)
            if (r0 == 0) goto L_0x02f4
            r5.setText(r0)
            goto L_0x02f4
        L_0x06dd:
            java.lang.String r0 = r6.A1G(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0715
            java.lang.String r0 = r6.A1G(r4)
            r12.setText(r0)
            r12.setVisibility(r7)
            r1 = 2131100929(0x7f060501, float:1.7814253E38)
            r0 = r20
            int r1 = X.AnonymousClass00T.A00(r0, r1)
            r0 = r25
            r0.A06(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r0)
            r9.setLongClickable(r7)
            X.05M r10 = r8.A00
            if (r10 != 0) goto L_0x06c6
            r0 = 9
            com.facebook.redex.IDxDCompatShape22S0100000_2_I0 r10 = new com.facebook.redex.IDxDCompatShape22S0100000_2_I0
            r10.<init>(r8, r0)
            r8.A00 = r10
            goto L_0x06c6
        L_0x0715:
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r0)
            if (r17 == 0) goto L_0x072f
            r11 = 2131889505(0x7f120d61, float:1.9413675E38)
            r0 = r20
            java.lang.String r0 = r0.getString(r11)
            r12.A0I(r1, r0)
        L_0x0728:
            r12.setVisibility(r7)
        L_0x072b:
            r9.setLongClickable(r7)
            goto L_0x06c6
        L_0x072f:
            boolean r0 = r6.A1j()
            if (r0 != 0) goto L_0x0740
            boolean r0 = r6.A1k()
            if (r0 != 0) goto L_0x0740
            boolean r1 = r6.A2d
            r0 = 0
            if (r1 == 0) goto L_0x0741
        L_0x0740:
            r0 = 1
        L_0x0741:
            r1 = 8
            if (r0 == 0) goto L_0x0751
            java.lang.String r0 = r4.A0T
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0751
        L_0x074d:
            r12.setVisibility(r1)
            goto L_0x072b
        L_0x0751:
            boolean r0 = r6.A1v(r4)
            if (r0 == 0) goto L_0x0763
            r12.setVisibility(r1)
            r5.setVisibility(r1)
            r0 = r22
            r0.setVisibility(r7)
            goto L_0x072b
        L_0x0763:
            boolean r0 = r6.A1q()
            if (r0 == 0) goto L_0x0778
            java.lang.String r0 = r6.A1H(r4)
            r12.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x074d
            r1 = 0
            goto L_0x074d
        L_0x0778:
            if (r18 == 0) goto L_0x0791
            boolean r0 = r4.A0H()
            if (r0 == 0) goto L_0x0791
            java.lang.String r0 = r4.A0B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x07a0
            java.lang.String r11 = ""
        L_0x078c:
            r0 = 0
            r12.A0I(r0, r11)
            goto L_0x0728
        L_0x0791:
            java.lang.String r0 = r4.A0T
            java.lang.String r11 = "  "
            if (r0 == 0) goto L_0x078c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            goto L_0x07ac
        L_0x07a0:
            java.lang.String r0 = "~ "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r11 = r4.A0B()
        L_0x07ac:
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            goto L_0x078c
        L_0x07b4:
            r12.setVisibility(r7)
            r5 = 16
            goto L_0x07bc
        L_0x07ba:
            r5 = 17
        L_0x07bc:
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0
            r0.<init>(r8, r5, r4)
            r10.setOnClickListener(r0)
            goto L_0x023f
        L_0x07c6:
            r0 = r26
            r0.setVisibility(r14)
            goto L_0x0208
        L_0x07cd:
            boolean r0 = r6.A2e
            if (r0 == 0) goto L_0x084e
            android.widget.TextView r5 = r2.A0B
            r10 = 8
            r5.setVisibility(r10)
            android.widget.TextView r0 = r2.A0A
            r0.setVisibility(r10)
            com.obwhatsapp.TextEmojiLabel r12 = r2.A0C
            r10 = 2131100933(0x7f060505, float:1.7814261E38)
            r0 = r20
            int r0 = X.AnonymousClass00T.A00(r0, r10)
            X.05M r10 = r8.A00
            if (r10 != 0) goto L_0x07f5
            r0 = 9
            com.facebook.redex.IDxDCompatShape22S0100000_2_I0 r10 = new com.facebook.redex.IDxDCompatShape22S0100000_2_I0
            r10.<init>(r8, r0)
            r8.A00 = r10
        L_0x07f5:
            X.01Y r13 = r6.A0a
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r4.A08(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r13.A0V(r0)
            if (r0 == 0) goto L_0x0823
            r13 = 8
            r0 = r26
            r0.setVisibility(r13)
            r12.setVisibility(r7)
            android.widget.ImageView r13 = r2.A06
            r14 = 8
            r13.setVisibility(r14)
            r13.setOnClickListener(r1)
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r14)
            r0.setOnClickListener(r1)
            goto L_0x0248
        L_0x0823:
            android.widget.ImageView r13 = r2.A06
            r13.setVisibility(r7)
            r14 = 18
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0
            r0.<init>(r8, r14, r4)
            r13.setOnClickListener(r0)
            android.widget.ImageView r0 = r2.A02
            r15 = r0
            r0.setVisibility(r7)
            r0 = 15
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r14 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0
            r14.<init>(r8, r0, r4)
            r15.setOnClickListener(r14)
            r14 = 8
            r12.setVisibility(r14)
            r0 = r26
            r0.setVisibility(r14)
            goto L_0x0248
        L_0x084e:
            boolean r0 = r6.A2h
            if (r0 == 0) goto L_0x0879
            android.widget.TextView r5 = r2.A0B
            r14 = 8
            r5.setVisibility(r14)
            android.widget.LinearLayout r0 = r2.A07
            r0.setVisibility(r7)
            android.widget.TextView r0 = r2.A0A
            r0.setVisibility(r14)
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r14)
            android.widget.ImageView r13 = r2.A06
            r13.setVisibility(r14)
            com.obwhatsapp.TextEmojiLabel r12 = r2.A0C
            r12.setVisibility(r14)
            r0 = r26
        L_0x0874:
            r0.setVisibility(r14)
            goto L_0x0247
        L_0x0879:
            boolean r15 = r6.A2l
            com.obwhatsapp.TextEmojiLabel r12 = r2.A0C
            r12.setVisibility(r7)
            r5 = 2131100933(0x7f060505, float:1.7814261E38)
            r0 = r20
            int r0 = X.AnonymousClass00T.A00(r0, r5)
            android.widget.ImageView r13 = r2.A06
            r14 = 8
            r13.setVisibility(r14)
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r14)
            android.widget.TextView r0 = r2.A0A
            r0.setVisibility(r14)
            android.widget.TextView r5 = r2.A0B
            if (r15 == 0) goto L_0x08b4
            r5.setVisibility(r14)
            r0 = r26
            r0.setVisibility(r14)
            android.widget.TextView r0 = r2.A08
            r0.setVisibility(r14)
            boolean r0 = r11 instanceof X.C101364xC
            if (r0 == 0) goto L_0x0247
            r10.setVisibility(r7)
            goto L_0x0247
        L_0x08b4:
            r5.setVisibility(r7)
            r10 = 2131100028(0x7f06017c, float:1.7812426E38)
            r0 = r20
            int r0 = X.AnonymousClass00T.A00(r0, r10)
            r0 = r26
            r0.setVisibility(r14)
            android.widget.TextView r0 = r2.A08
            goto L_0x0874
        L_0x08c8:
            android.view.View r0 = r2.A01
            r21 = r0
            r0.setOnClickListener(r1)
            r3.setOnClickListener(r1)
            r0.setClickable(r7)
            r3.setClickable(r7)
            goto L_0x01d1
        L_0x08da:
            boolean r2 = r6.A1s()
            android.view.LayoutInflater r1 = r6.A05()
            r0 = 2131558722(0x7f0d0142, float:1.8742768E38)
            if (r2 == 0) goto L_0x08ea
            r0 = 2131558724(0x7f0d0144, float:1.8742772E38)
        L_0x08ea:
            android.view.View r9 = r1.inflate(r0, r3, r7)
            r0 = 2131362924(0x7f0a046c, float:1.8345642E38)
            android.view.View r17 = X.C004601z.A0E(r9, r0)
            r0 = r17
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r17 = r0
            r0 = 2131362921(0x7f0a0469, float:1.8345636E38)
            android.view.View r16 = X.C004601z.A0E(r9, r0)
            r0 = r16
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r16 = r0
            r0 = 2131362907(0x7f0a045b, float:1.8345608E38)
            android.view.View r20 = X.C004601z.A0E(r9, r0)
            r38 = 2131362922(0x7f0a046a, float:1.8345638E38)
            X.0sP r2 = r6.A0r
            X.1Lc r1 = r6.A1s
            X.013 r0 = r6.A1H
            X.1cU r33 = new X.1cU
            r34 = r9
            r35 = r2
            r36 = r0
            r37 = r1
            r33.<init>((android.view.View) r34, (X.C16080sP) r35, (X.AnonymousClass013) r36, (X.C25781Lc) r37, (int) r38)
            r15 = r33
            com.obwhatsapp.TextEmojiLabel r0 = r15.A02
            com.obwhatsapp.youbasha.others.hContactName(r0)
            r0 = 2131362925(0x7f0a046d, float:1.8345644E38)
            android.view.View r15 = X.C004601z.A0E(r9, r0)
            com.obwhatsapp.TextEmojiLabel r15 = (com.obwhatsapp.TextEmojiLabel) r15
            r3 = 2
            com.obwhatsapp.yo.yo.ChangeSize(r15, r3)
            r0 = 2131362923(0x7f0a046b, float:1.834564E38)
            android.view.View r14 = X.C004601z.A0E(r9, r0)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r3 = 3
            com.obwhatsapp.yo.yo.ChangeSize(r14, r3)
            r0 = 2131362919(0x7f0a0467, float:1.8345632E38)
            android.view.View r13 = X.C004601z.A0E(r9, r0)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r0 = 2131362920(0x7f0a0468, float:1.8345634E38)
            android.view.View r12 = X.C004601z.A0E(r9, r0)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 2131361988(0x7f0a00c4, float:1.8343744E38)
            android.view.View r10 = X.C004601z.A0E(r9, r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2131366070(0x7f0a10b6, float:1.8352023E38)
            android.view.View r5 = X.C004601z.A0E(r9, r0)
            com.obwhatsapp.components.SelectionCheckView r5 = (com.obwhatsapp.components.SelectionCheckView) r5
            r0 = 2131362550(0x7f0a02f6, float:1.8344884E38)
            android.view.View r4 = X.C004601z.A0E(r9, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            android.view.View r3 = X.C004601z.A0E(r9, r0)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 2131364159(0x7f0a093f, float:1.8348147E38)
            if (r18 == 0) goto L_0x0984
            r0 = 2131364160(0x7f0a0940, float:1.834815E38)
        L_0x0984:
            android.view.View r1 = X.C004601z.A0E(r9, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131364104(0x7f0a0908, float:1.8348036E38)
            android.view.View r0 = X.C004601z.A0E(r9, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2 = 2131362719(0x7f0a039f, float:1.8345227E38)
            android.view.View r21 = X.C004601z.A0E(r9, r2)
            X.4PA r2 = new X.4PA
            r19 = r2
            r22 = r17
            r23 = r16
            r24 = r13
            r25 = r12
            r26 = r0
            r27 = r3
            r28 = r14
            r29 = r10
            r30 = r4
            r31 = r1
            r32 = r15
            r34 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r9.setTag(r2)
            boolean r0 = r6.A2e
            if (r0 == 0) goto L_0x0a00
            X.013 r4 = r6.A1H
            r0 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            android.view.View r3 = r9.findViewById(r0)
            android.content.res.Resources r1 = r6.A03()
            r0 = 2131165698(0x7f070202, float:1.794562E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.C45902Bo.A08(r3, r4, r7, r0)
            android.widget.ImageView r3 = r2.A06
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            android.content.res.Resources r0 = r6.A03()
            r4 = 2131165706(0x7f07020a, float:1.7945637E38)
            int r0 = r0.getDimensionPixelSize(r4)
            r1.width = r0
            r3.setLayoutParams(r1)
            android.widget.ImageView r3 = r2.A02
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            android.content.res.Resources r0 = r6.A03()
            int r0 = r0.getDimensionPixelSize(r4)
            r1.width = r0
            r3.setLayoutParams(r1)
        L_0x0a00:
            android.widget.ImageView r1 = r2.A05
            r0 = 2131886107(0x7f12001b, float:1.9406784E38)
            X.AnonymousClass2JP.A03(r1, r0)
            goto L_0x00dd
        L_0x0a0a:
            java.lang.String r1 = "unknown status distribution mode"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49182Rm.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
