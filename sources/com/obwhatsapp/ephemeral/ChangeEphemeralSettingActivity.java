package com.obwhatsapp.ephemeral;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01Y;
import X.AnonymousClass11A;
import X.AnonymousClass11R;
import X.AnonymousClass2a9;
import X.C110105dW;
import X.C14530pL;
import X.C14550pN;
import X.C14710pd;
import X.C14870pt;
import X.C15830rv;
import X.C16030sJ;
import X.C16050sL;
import X.C16070sO;
import X.C16150sX;
import X.C16490t9;
import X.C16760tb;
import X.C17030uP;
import X.C17120uZ;
import X.C17140ub;
import X.C17220uj;
import X.C17240ul;
import X.C17780vd;
import X.C17800vf;
import X.C20260zl;
import X.C224618a;
import X.C33481ie;
import X.C40491uD;
import X.C40511uF;
import X.C40821uk;
import X.C49132Rg;
import X.C75233rp;
import android.os.Bundle;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.IDxCObserverShape70S0100000_3_I1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

public class ChangeEphemeralSettingActivity extends C14530pL {
    public int A00;
    public int A01;
    public int A02;
    public C16760tb A03;
    public AnonymousClass01Y A04;
    public C17140ub A05;
    public C17030uP A06;
    public AnonymousClass2a9 A07;
    public AnonymousClass11R A08;
    public C17120uZ A09;
    public AnonymousClass11A A0A;
    public C16070sO A0B;
    public C224618a A0C;
    public C20260zl A0D;
    public C16490t9 A0E;
    public C17240ul A0F;
    public C17780vd A0G;
    public C15830rv A0H;
    public C17800vf A0I;
    public C17220uj A0J;
    public boolean A0K;
    public final C33481ie A0L;

    public ChangeEphemeralSettingActivity() {
        this(0);
        this.A0L = new IDxCObserverShape70S0100000_3_I1(this, 0);
    }

    public ChangeEphemeralSettingActivity(int i2) {
        this.A0K = false;
        C110105dW.A0t(this, 3);
    }

    public void A1q() {
        if (!this.A0K) {
            this.A0K = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r1 = A0C2.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C2, r1, this, C110105dW.A0F(r1));
            this.A0E = (C16490t9) r1.AQz.get();
            this.A03 = (C16760tb) r1.APV.get();
            this.A0D = A0C2.A0I();
            this.A0J = (C17220uj) r1.A9x.get();
            this.A04 = (AnonymousClass01Y) r1.A1w.get();
            this.A05 = (C17140ub) r1.A4y.get();
            this.A0F = (C17240ul) r1.ABK.get();
            this.A0G = C16150sX.A0p(r1);
            this.A0I = C16150sX.A0x(r1);
            this.A06 = (C17030uP) r1.APp.get();
            this.A0A = (AnonymousClass11A) r1.A5U.get();
            this.A0B = (C16070sO) r1.ABY.get();
            this.A07 = (AnonymousClass2a9) A0C2.A0F.get();
            this.A09 = (C17120uZ) r1.AQT.get();
            this.A08 = (AnonymousClass11R) r1.A4a.get();
            this.A0C = (C224618a) r1.A79.get();
        }
    }

    public final void A35() {
        C14870pt r2;
        int i2;
        int i3;
        C15830rv r1 = this.A0H;
        AnonymousClass00B.A06(r1);
        boolean z2 = r1 instanceof UserJid;
        if (!z2 || !this.A04.A0V((UserJid) r1)) {
            int i4 = this.A02;
            if (i4 != -1 && this.A01 != i4) {
                if (this.A07.A0A()) {
                    C15830rv r5 = this.A0H;
                    if (C16030sJ.A0N(r5)) {
                        C16050sL r52 = (C16050sL) r5;
                        i3 = this.A02;
                        this.A0G.A07(new C40821uk(this.A0A, this.A0F, r52, (String) null, (List) null, 224), r52, i3);
                    } else if (z2) {
                        i3 = this.A02;
                        this.A03.A0K((UserJid) r5, i3);
                    } else {
                        Log.e(AnonymousClass000.A0l(AnonymousClass000.A0r("Ephemeral not supported for this type of jid, type="), r5.getType()));
                        return;
                    }
                    C75233rp r22 = new C75233rp();
                    r22.A02 = Long.valueOf((long) i3);
                    int i5 = this.A01;
                    r22.A03 = Long.valueOf(i5 == -1 ? 0 : (long) i5);
                    int i6 = this.A00;
                    int i7 = 2;
                    if (i6 != 2) {
                        i7 = 3;
                        if (i6 != 3) {
                            i7 = 1;
                        }
                    }
                    r22.A00 = Integer.valueOf(i7);
                    C15830rv r12 = this.A0H;
                    if (C16030sJ.A0N(r12)) {
                        C16070sO r0 = this.A0B;
                        C16050sL A032 = C16050sL.A03(r12);
                        AnonymousClass00B.A06(A032);
                        r22.A01 = Integer.valueOf(C40511uF.A02(r0.A07.A04(A032).A04()));
                    }
                    this.A0E.A06(r22);
                    return;
                }
                r2 = this.A05;
                i2 = R.string.str0822;
            } else {
                return;
            }
        } else {
            r2 = this.A05;
            int i8 = this.A02;
            i2 = R.string.str0831;
            if (i8 == 0) {
                i2 = R.string.str0830;
            }
        }
        r2.A09(i2, 1);
    }

    public void onBackPressed() {
        A35();
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0099, code lost:
        if ((r8 instanceof com.whatsapp.jid.UserJid) != false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r10 = r17
            r6 = r18
            super.onCreate(r6)
            X.0ub r1 = r10.A05
            X.1ie r0 = r10.A0L
            r1.A02(r0)
            r0 = 2131559623(0x7f0d04c7, float:1.8744595E38)
            r10.setContentView((int) r0)
            r0 = 2131363504(0x7f0a06b0, float:1.8346819E38)
            android.view.View r4 = X.AnonymousClass00T.A05(r10, r0)
            r0 = 2131363505(0x7f0a06b1, float:1.834682E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r10, r0)
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            java.lang.String r0 = "ephemeral_settings_lottie_animation.lottie"
            r1.setAnimation((java.lang.String) r0)
            r2 = 0
            r1.setVisibility(r2)
            r3 = 8
            r4.setVisibility(r3)
            r5 = 2131888143(0x7f12080f, float:1.9410913E38)
            java.lang.String r0 = r10.getString(r5)
            r10.setTitle(r0)
            r0 = 2131366673(0x7f0a1311, float:1.8353246E38)
            android.view.View r4 = X.AnonymousClass00T.A05(r10, r0)
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            X.013 r1 = r10.A01
            r0 = 2131231482(0x7f0802fa, float:1.8079046E38)
            X.25m r0 = X.C447725m.A00(r10, r1, r0)
            r4.setNavigationIcon((android.graphics.drawable.Drawable) r0)
            java.lang.String r0 = r10.getString(r5)
            r4.setTitle((java.lang.CharSequence) r0)
            r0 = 2131101259(0x7f06064b, float:1.7814923E38)
            r4.setBackgroundResource(r0)
            r0 = 2131952361(0x7f1302e9, float:1.9541163E38)
            r4.A0C(r10, r0)
            r0 = 2
            com.facebook.redex.IDxCListenerShape135S0100000_3_I1 r0 = X.C110115dX.A06(r10, r0)
            r4.setNavigationOnClickListener(r0)
            r10.Aem(r4)
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.0rv r8 = X.C15830rv.A02(r0)
            r7 = 0
            r4 = 1
            boolean r1 = X.AnonymousClass000.A1V(r8)
            java.lang.String r0 = "Cannot change ephemeral setting without chat jid"
            X.AnonymousClass00B.A0B(r0, r1)
            if (r8 != 0) goto L_0x008e
            r10.finish()
        L_0x008d:
            return
        L_0x008e:
            r10.A0H = r8
            boolean r0 = X.C16030sJ.A0L(r8)
            if (r0 != 0) goto L_0x009b
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid
            r5 = 0
            if (r0 == 0) goto L_0x009c
        L_0x009b:
            r5 = 1
        L_0x009c:
            java.lang.String r0 = "Ephemeral setting can only be changed for Groups and 1:1, jid type="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r8.getType()
            r1.append(r0)
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            X.AnonymousClass00B.A0B(r0, r5)
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "current_setting"
            r5 = -1
            int r0 = r1.getIntExtra(r0, r5)
            r10.A01 = r0
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "entry_point"
            int r0 = r1.getIntExtra(r0, r4)
            r10.A00 = r0
            int r0 = r10.A01
            if (r0 == r5) goto L_0x00d0
            r7 = 1
        L_0x00d0:
            java.lang.String r0 = "add current ephemeral duration in bundle with extra ARG_CURRENT_SETTING"
            X.AnonymousClass00B.A0B(r0, r7)
            int r1 = r10.A01
            r10.A02 = r1
            if (r18 == 0) goto L_0x00e3
            java.lang.String r0 = "selected_setting"
            int r0 = r6.getInt(r0, r1)
            r10.A02 = r0
        L_0x00e3:
            r0 = 2131363525(0x7f0a06c5, float:1.8346861E38)
            android.view.View r5 = r10.findViewById(r0)
            android.widget.RadioGroup r5 = (android.widget.RadioGroup) r5
            com.facebook.redex.IDxCListenerShape324S0100000_3_I1 r0 = new com.facebook.redex.IDxCListenerShape324S0100000_3_I1
            r0.<init>(r10, r4)
            r5.setOnCheckedChangeListener(r0)
            r0 = 2131363501(0x7f0a06ad, float:1.8346813E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            r0.setVisibility(r3)
            int r1 = r10.A02
            X.0pd r0 = r10.A0C
            X.C40491uD.A05(r5, r0, r1, r2, r2)
            X.0rv r4 = r10.A0H
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x012a
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.0zl r3 = r10.A0D
            X.0uP r1 = r10.A06
            X.2a9 r0 = r10.A07
            boolean r0 = X.AnonymousClass2BX.A02(r1, r0, r3, r4)
            if (r0 != 0) goto L_0x012a
            r1 = 0
        L_0x011a:
            int r0 = r5.getChildCount()
            if (r1 >= r0) goto L_0x012a
            android.view.View r0 = r5.getChildAt(r1)
            r0.setEnabled(r2)
            int r1 = r1 + 1
            goto L_0x011a
        L_0x012a:
            r0 = 2131363502(0x7f0a06ae, float:1.8346815E38)
            android.view.View r14 = r10.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r14 = (com.obwhatsapp.TextEmojiLabel) r14
            X.0pd r1 = r10.A0C
            r0 = 2005(0x7d5, float:2.81E-42)
            boolean r3 = r1.A0C(r0)
            X.0rv r0 = r10.A0H
            boolean r1 = X.C16030sJ.A0L(r0)
            if (r3 == 0) goto L_0x01b5
            r0 = 2131888120(0x7f1207f8, float:1.9410866E38)
            if (r1 == 0) goto L_0x014b
            r0 = 2131888119(0x7f1207f7, float:1.9410864E38)
        L_0x014b:
            java.lang.String r16 = r10.getString(r0)
            X.0pt r13 = r10.A05
            X.0zJ r12 = r10.A00
            X.01V r15 = r10.A08
            X.0uj r3 = r10.A0J
            java.lang.String r1 = "chats"
            java.lang.String r0 = "about-disappearing-messages"
            android.net.Uri r11 = r3.A05(r1, r0)
            X.C45922Bq.A08(r10, r11, r12, r13, r14, r15, r16)
            X.013 r0 = r10.A01
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0171
            r0 = 5
            r14.setGravity(r0)
            X.C45902Bo.A03(r14)
        L_0x0171:
            X.0sK r1 = r10.A01
            X.11R r0 = r10.A08
            boolean r0 = X.AnonymousClass2BX.A01(r1, r0)
            if (r0 == 0) goto L_0x008d
            r0 = 2131363250(0x7f0a05b2, float:1.8346304E38)
            android.view.View r7 = X.AnonymousClass00T.A05(r10, r0)
            r9 = 0
            r7.setVisibility(r2)
            r0 = 2131363251(0x7f0a05b3, float:1.8346306E38)
            android.view.View r6 = X.AnonymousClass00T.A05(r10, r0)
            r0 = 2131363249(0x7f0a05b1, float:1.8346301E38)
            android.view.View r8 = X.AnonymousClass00T.A05(r10, r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            X.18a r0 = r10.A0C
            android.content.SharedPreferences r3 = r0.A00()
            java.lang.String r0 = "disappearing_mode_timestamp"
            r1 = 0
            long r4 = r3.getLong(r0, r1)
            r3 = 8
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01be
            r6.setVisibility(r9)
            r8.setVisibility(r3)
            r0 = 3
            X.C110105dW.A0r(r7, r10, r0)
            return
        L_0x01b5:
            r0 = 2131888155(0x7f12081b, float:1.9410937E38)
            if (r1 == 0) goto L_0x014b
            r0 = 2131888154(0x7f12081a, float:1.9410935E38)
            goto L_0x014b
        L_0x01be:
            r8.setVisibility(r9)
            r6.setVisibility(r3)
            r0 = 2131887880(0x7f120708, float:1.941038E38)
            java.lang.String r1 = r10.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            android.text.Spanned r0 = X.AnonymousClass1ZW.A01(r1, r0)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r0)
            int r1 = r1.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r6 = r7.getSpans(r9, r1, r0)
            android.text.style.URLSpan[] r6 = (android.text.style.URLSpan[]) r6
            if (r6 == 0) goto L_0x020f
            int r5 = r6.length
        L_0x01e5:
            if (r9 >= r5) goto L_0x020f
            r4 = r6[r9]
            java.lang.String r1 = r4.getURL()
            java.lang.String r0 = "disappearing_mode_setting_link"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x020c
            X.5ff r3 = new X.5ff
            r3.<init>(r10, r10)
            int r2 = r7.getSpanStart(r4)
            int r1 = r7.getSpanEnd(r4)
            int r0 = r7.getSpanFlags(r4)
            r7.setSpan(r3, r2, r1, r0)
            r7.removeSpan(r4)
        L_0x020c:
            int r9 = r9 + 1
            goto L_0x01e5
        L_0x020f:
            X.3MF r0 = new X.3MF
            r0.<init>()
            r8.setMovementMethod(r0)
            r8.setText(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.ephemeral.ChangeEphemeralSettingActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A05.A03(this.A0L);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A35();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_setting", this.A02);
    }

    public void onStart() {
        super.onStart();
        C14710pd r2 = this.A0C;
        C17800vf r4 = this.A0I;
        C40491uD.A06(AGM(), this.A09, r2, this.A0H, r4, 2);
    }
}
