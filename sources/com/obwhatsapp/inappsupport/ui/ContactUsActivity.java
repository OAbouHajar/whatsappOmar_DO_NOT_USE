package com.obwhatsapp.inappsupport.ui;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass11A;
import X.AnonymousClass12W;
import X.AnonymousClass15P;
import X.AnonymousClass15W;
import X.AnonymousClass1BY;
import X.AnonymousClass1BZ;
import X.AnonymousClass1KO;
import X.AnonymousClass1Y2;
import X.AnonymousClass1Y3;
import X.AnonymousClass2Rf;
import X.AnonymousClass2St;
import X.AnonymousClass2T3;
import X.AnonymousClass37A;
import X.AnonymousClass37C;
import X.AnonymousClass39V;
import X.C1222969a;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16050sL;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16340ss;
import X.C16440t3;
import X.C16490t9;
import X.C17090uW;
import X.C17110uY;
import X.C17130ua;
import X.C17220uj;
import X.C17250um;
import X.C18090w8;
import X.C18160wF;
import X.C18260wP;
import X.C18290wS;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23041Ag;
import X.C23061Ai;
import X.C23071Aj;
import X.C23251Bb;
import X.C26201Ms;
import X.C48562Nw;
import X.C49132Rg;
import X.C74853rD;
import X.C91484fz;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class ContactUsActivity extends C14530pL implements AnonymousClass1Y2 {
    public EditText A00;
    public TextView A01;
    public AppCompatCheckBox A02;
    public C17090uW A03;
    public AnonymousClass1KO A04;
    public C17130ua A05;
    public AnonymousClass1BZ A06;
    public AnonymousClass12W A07;
    public AnonymousClass013 A08;
    public C15810rt A09;
    public AnonymousClass11A A0A;
    public C16490t9 A0B;
    public AnonymousClass1Y3 A0C;
    public AnonymousClass15W A0D;
    public C26201Ms A0E;
    public AnonymousClass37C A0F;
    public C48562Nw A0G;
    public C16050sL A0H;
    public C18090w8 A0I;
    public C18290wS A0J;
    public C23041Ag A0K;
    public AnonymousClass1BY A0L;
    public AnonymousClass39V A0M;
    public C17220uj A0N;
    public C23251Bb A0O;
    public C18160wF A0P;
    public C17110uY A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public boolean A0U;

    public ContactUsActivity() {
        this(0);
    }

    public ContactUsActivity(int i2) {
        this.A0U = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 56));
    }

    public void A1q() {
        if (!this.A0U) {
            this.A0U = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A05 = (C17130ua) r1.AN9.get();
            this.A09 = (C15810rt) r1.A43.get();
            this.A0B = (C16490t9) r1.AQz.get();
            this.A0P = (C18160wF) r1.A5o.get();
            this.A03 = (C17090uW) r1.ADM.get();
            this.A04 = (AnonymousClass1KO) r1.ALY.get();
            this.A0N = (C17220uj) r1.A9x.get();
            this.A08 = (AnonymousClass013) r1.AR8.get();
            this.A0J = (C18290wS) r1.AIB.get();
            this.A0O = (C23251Bb) r1.A6L.get();
            this.A07 = (AnonymousClass12W) r1.AEM.get();
            this.A0D = (AnonymousClass15W) r1.AOC.get();
            this.A0L = (AnonymousClass1BY) r1.A55.get();
            this.A0I = (C18090w8) r1.AI6.get();
            this.A0A = (AnonymousClass11A) r1.A5U.get();
            C23041Ag r0 = (C23041Ag) r1.A2w.get();
            C16340ss.A01(r0);
            this.A0K = r0;
            this.A0E = (C26201Ms) r1.A41.get();
            this.A0Q = (C17110uY) r1.ADT.get();
            this.A06 = (AnonymousClass1BZ) r1.A5N.get();
        }
    }

    public void A2S(int i2) {
        if (i2 == 1) {
            finish();
        }
    }

    public final ArrayList A35(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList((String) null, arrayList);
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall.length > 450000 ? A35(new ArrayList(arrayList.subList(0, arrayList.size() >> 1))) : arrayList;
    }

    public final void A36() {
        C1222969a ACC = this.A0J.A03().ACC();
        if (ACC != null) {
            AnonymousClass2St r3 = new AnonymousClass2St((String) null, new AnonymousClass2St[0]);
            r3.A01("hc_entrypoint", "wa_settings_support");
            r3.A01("app_type", "consumer");
            ACC.AKU(r3, 1, 39, "settings_contact_us", (String) null);
        }
    }

    public void A37(int i2, String str) {
        C74853rD r1 = new C74853rD();
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = str;
        r1.A02 = this.A08.A06();
        this.A0B.A05(r1);
    }

    public void AW9(boolean z2) {
        finish();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 11) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            String str = null;
            if (intent != null) {
                if (intent.getIntExtra("com.obwhatsapp.inappsupport.ui.ContactUsActvity.support_type", 1) == 2) {
                    this.A0G.A01();
                    return;
                }
                str = intent.getStringExtra("com.obwhatsapp.inappsupport.ui.ContactUsActivity.debug_info");
            }
            this.A0G.A03(str);
        }
    }

    public void onBackPressed() {
        if (!TextUtils.isEmpty(this.A00.getText().toString().trim())) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], R.string.str1714);
            A012.A01(new IDxCListenerShape127S0100000_2_I0(this, 72), R.string.str1712);
            C91484fz r1 = C91484fz.A00;
            A012.A04 = R.string.str1713;
            A012.A07 = r1;
            A012.A00().A1G(AGM(), (String) null);
        } else {
            super.onBackPressed();
        }
        ContactUsActivity contactUsActivity = this.A0G.A02;
        AnonymousClass00B.A06(contactUsActivity);
        contactUsActivity.A37(1, (String) null);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0M.A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            r0 = 2131100913(0x7f0604f1, float:1.781422E38)
            X.C434920f.A04(r13, r0)
            X.0pd r12 = r13.A0C
            X.0pt r9 = r13.A05
            X.0rt r10 = r13.A09
            X.11A r11 = r13.A0A
            X.2Nw r8 = new X.2Nw
            r8.<init>(r9, r10, r11, r12, r13)
            r13.A0G = r8
            r0 = 2131558733(0x7f0d014d, float:1.874279E38)
            r13.setContentView((int) r0)
            r5 = 2131887813(0x7f1206c5, float:1.9410244E38)
            java.lang.String r0 = r13.getString(r5)
            r13.setTitle(r0)
            r0 = 2131366673(0x7f0a1311, float:1.8353246E38)
            android.view.View r4 = X.AnonymousClass00T.A05(r13, r0)
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            X.013 r3 = r13.A08
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131231482(0x7f0802fa, float:1.8079046E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131100911(0x7f0604ef, float:1.7814217E38)
            int r0 = r1.getColor(r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass2SR.A06(r2, r0)
            X.25m r0 = new X.25m
            r0.<init>(r1, r3)
            r4.setNavigationIcon((android.graphics.drawable.Drawable) r0)
            java.lang.String r0 = r13.getString(r5)
            r4.setTitle((java.lang.CharSequence) r0)
            r13.Aem(r4)
            r1 = 29
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r0.<init>((java.lang.Object) r13, (int) r1)
            r4.setNavigationOnClickListener(r0)
            android.content.Intent r6 = r13.getIntent()
            java.lang.String r4 = "com.obwhatsapp.inappsupport.ui.ContactUsActivity.from"
            java.lang.String r0 = r6.getStringExtra(r4)
            r13.A0S = r0
            java.lang.String r0 = "com.obwhatsapp.inappsupport.ui.ContactUsActivity.suspendedEntityJid"
            android.os.Parcelable r0 = r6.getParcelableExtra(r0)
            X.0sL r0 = (X.C16050sL) r0
            r13.A0H = r0
            java.lang.String r0 = "com.obwhatsapp.inappsupport.ui.ContactUsActivity.serverStatus"
            java.lang.String r0 = r6.getStringExtra(r0)
            r13.A0T = r0
            java.lang.String r0 = r13.A0S
            boolean r0 = X.AnonymousClass1Y4.A00(r0)
            if (r0 == 0) goto L_0x0214
            X.0s5 r0 = r13.A06
            X.1Y5 r1 = X.C15910s6.A2A
            java.lang.String r0 = r0.A03(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0214
            X.0s5 r0 = r13.A06
            java.lang.String r0 = r0.A03(r1)
        L_0x00a3:
            r13.A0R = r0
            X.0sK r0 = r13.A01
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            r3 = 1
            if (r0 == 0) goto L_0x00b7
            X.0sC r0 = r13.A09
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00eb
        L_0x00b7:
            X.0so r2 = r13.A03
            r1 = 0
            java.lang.String r0 = "Unregistered client opening In App Support"
            r2.AcB(r0, r1, r3)
            java.lang.String r8 = r13.A0S
            java.lang.String r7 = r13.A0T
            java.lang.String r5 = r13.A0R
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.from"
            r2.putExtra(r0, r8)
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.serverstatus"
            r2.putExtra(r0, r7)
            if (r5 == 0) goto L_0x00e4
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.emailAddress"
            r2.putExtra(r0, r5)
        L_0x00e4:
            r0 = 0
            r13.A2X(r2, r0)
            r13.finish()
        L_0x00eb:
            r0 = 2131363152(0x7f0a0550, float:1.8346105E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r13.A00 = r0
            java.lang.String r0 = "com.obwhatsapp.inappsupport.ui.ContactUsActivity.description"
            java.lang.String r1 = r6.getStringExtra(r0)
            if (r1 == 0) goto L_0x010d
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x010d
            android.widget.EditText r0 = r13.A00
            r0.setText(r1)
            X.2Nw r0 = r13.A0G
            r0.A05 = r3
        L_0x010d:
            r0 = 2131363153(0x7f0a0551, float:1.8346107E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.A01 = r0
            r0 = 2131362918(0x7f0a0466, float:1.834563E38)
            android.view.View r5 = r13.findViewById(r0)
            android.widget.EditText r0 = r13.A00
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            r0 = 0
            if (r1 < r3) goto L_0x0131
            r0 = 1
        L_0x0131:
            r5.setEnabled(r0)
            android.widget.EditText r2 = r13.A00
            r1 = 2
            com.obwhatsapp.text.IDxWAdapterShape102S0100000_2_I0 r0 = new com.obwhatsapp.text.IDxWAdapterShape102S0100000_2_I0
            r0.<init>(r13, r1)
            r2.addTextChangedListener(r0)
            r1 = 28
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r0.<init>((java.lang.Object) r13, (int) r1)
            r5.setOnClickListener(r0)
            r0 = 2131366091(0x7f0a10cb, float:1.8352066E38)
            android.view.View r0 = r13.findViewById(r0)
            androidx.appcompat.widget.AppCompatCheckBox r0 = (androidx.appcompat.widget.AppCompatCheckBox) r0
            r13.A02 = r0
            r0.setChecked(r3)
            r0 = 2131366093(0x7f0a10cd, float:1.835207E38)
            android.view.View r2 = r13.findViewById(r0)
            r1 = 27
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r0.<init>((java.lang.Object) r13, (int) r1)
            r2.setOnClickListener(r0)
            r0 = 2131366092(0x7f0a10cc, float:1.8352068E38)
            android.view.View r5 = r13.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r5 = (com.obwhatsapp.TextEmojiLabel) r5
            X.3MF r0 = new X.3MF
            r0.<init>()
            r5.A07 = r0
            X.01V r1 = r13.A08
            X.2q8 r0 = new X.2q8
            r0.<init>(r5, r1)
            r5.setAccessibilityHelper(r0)
            X.0uY r3 = r13.A0Q
            r0 = 2131887521(0x7f1205a1, float:1.9409651E38)
            java.lang.String r2 = r13.getString(r0)
            r0 = 3
            com.facebook.redex.RunnableRunnableShape10S0100000_I0_9 r1 = new com.facebook.redex.RunnableRunnableShape10S0100000_I0_9
            r1.<init>((java.lang.Object) r13, (int) r0)
            java.lang.String r0 = "learn-more"
            android.text.SpannableStringBuilder r0 = r3.A06(r1, r2, r0)
            r5.setText(r0)
            X.0w8 r0 = r13.A0I
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0230
            X.0wF r1 = r13.A0P
            java.lang.String r0 = "BR"
            boolean r0 = r1.A05(r0)
            if (r0 != 0) goto L_0x01b6
            X.0wF r1 = r13.A0P
            java.lang.String r0 = "IN"
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0230
        L_0x01b6:
            r0 = 2131365232(0x7f0a0d70, float:1.8350323E38)
            android.view.View r0 = r13.findViewById(r0)
            r12 = 0
            r0.setVisibility(r12)
            r0 = 2131365233(0x7f0a0d71, float:1.8350326E38)
            android.view.View r9 = r13.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r9 = (com.obwhatsapp.TextEmojiLabel) r9
            r0 = 2131887518(0x7f12059e, float:1.9409645E38)
            java.lang.String r1 = r13.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            android.text.Spanned r0 = X.AnonymousClass1ZW.A01(r1, r0)
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r0)
            int r1 = r8.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r11 = r8.getSpans(r12, r1, r0)
            android.text.style.URLSpan[] r11 = (android.text.style.URLSpan[]) r11
            if (r11 == 0) goto L_0x021c
            int r10 = r11.length
        L_0x01eb:
            if (r12 >= r10) goto L_0x021c
            r7 = r11[r12]
            int r5 = r8.getSpanStart(r7)
            int r3 = r8.getSpanEnd(r7)
            int r2 = r8.getSpanFlags(r7)
            com.obwhatsapp.IDxTSpanShape13S0200000_2_I0 r0 = new com.obwhatsapp.IDxTSpanShape13S0200000_2_I0
            r0.<init>(r13, r13, r13)
            r8.setSpan(r0, r5, r3, r2)
            r1 = 2131951902(0x7f13011e, float:1.9540232E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r13, r1)
            r8.setSpan(r0, r5, r3, r2)
            r8.removeSpan(r7)
            int r12 = r12 + 1
            goto L_0x01eb
        L_0x0214:
            java.lang.String r0 = "com.obwhatsapp.inappsupport.ui.ContactUsActivity.emailAddress"
            java.lang.String r0 = r6.getStringExtra(r0)
            goto L_0x00a3
        L_0x021c:
            X.3MF r0 = new X.3MF
            r0.<init>()
            r9.A07 = r0
            X.01V r1 = r13.A08
            X.2q8 r0 = new X.2q8
            r0.<init>(r9, r1)
            r9.setAccessibilityHelper(r0)
            r9.setText(r8)
        L_0x0230:
            r0 = 2131362917(0x7f0a0465, float:1.8345628E38)
            android.view.View r5 = r13.findViewById(r0)
            r0 = 2131362914(0x7f0a0462, float:1.8345622E38)
            android.view.View r3 = r13.findViewById(r0)
            android.view.ViewTreeObserver r2 = r3.getViewTreeObserver()
            r1 = 1
            com.facebook.redex.IDxDListenerShape38S0300000_2_I0 r0 = new com.facebook.redex.IDxDListenerShape38S0300000_2_I0
            r0.<init>(r3, r5, r13, r1)
            r2.addOnPreDrawListener(r0)
            java.lang.String r0 = "com.obwhatsapp.inappsupport.ui.ContactUsActivity.supportUserContext"
            android.os.Parcelable r0 = r6.getParcelableExtra(r0)
            X.1Y3 r0 = (X.AnonymousClass1Y3) r0
            r13.A0C = r0
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131166963(0x7f0706f3, float:1.7948186E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.39V r0 = new X.39V
            r0.<init>(r5, r3, r1)
            r13.A0M = r0
            r0.A00()
            X.2Nw r2 = r13.A0G
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r0 = r2.A02
            X.AnonymousClass00B.A06(r0)
            X.AnonymousClass00B.A06(r0)
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = r0.getStringExtra(r4)
            java.lang.String r0 = "biz-directory-browsing"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0292
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r1 = r2.A02
            r0 = 2131366094(0x7f0a10ce, float:1.8352072E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.inappsupport.ui.ContactUsActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ContactUsActivity contactUsActivity = this.A0G.A02;
        AnonymousClass00B.A06(contactUsActivity);
        if ("biz-directory-browsing".equals(contactUsActivity.getIntent().getStringExtra("com.obwhatsapp.inappsupport.ui.ContactUsActivity.from"))) {
            return true;
        }
        menu.add(0, R.id.menuitem_contact_us_email, 0, getString(R.string.str059a)).setShowAsAction(0);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0G.A02 = null;
        AnonymousClass37A r1 = this.A0L.A00;
        if (r1 != null) {
            r1.A06(false);
        }
        AnonymousClass37C r12 = this.A0F;
        if (r12 != null) {
            r12.A06(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            C48562Nw r2 = this.A0G;
            ContactUsActivity contactUsActivity = r2.A02;
            AnonymousClass00B.A06(contactUsActivity);
            contactUsActivity.A37(1, (String) null);
            r2.A02.finish();
            return true;
        } else if (itemId != R.id.menuitem_contact_us_email) {
            return false;
        } else {
            this.A0G.A02(2);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A00.clearFocus();
    }

    public void onStop() {
        C48562Nw r2 = this.A0G;
        r2.A03 = null;
        r2.A09.A03(r2.A08);
        super.onStop();
    }
}
