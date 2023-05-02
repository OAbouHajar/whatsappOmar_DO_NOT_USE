package com.obwhatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass01Y;
import X.AnonymousClass19Y;
import X.AnonymousClass1ZW;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15810rt;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16150sX;
import X.C30531cW;
import X.C49132Rg;
import X.C94494l0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Switch;
import com.facebook.redex.IDxDListenerShape191S0100000_2_I1;
import com.obwhatsapp.IDxTSpanShape54S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChangeNumberNotifyContacts extends C14530pL {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public RadioButton A05;
    public RadioButton A06;
    public RadioButton A07;
    public ScrollView A08;
    public Switch A09;
    public TextEmojiLabel A0A;
    public AnonymousClass01Y A0B;
    public AnonymousClass19Y A0C;
    public C16000sG A0D;
    public C15810rt A0E;
    public List A0F;
    public boolean A0G;

    public ChangeNumberNotifyContacts() {
        this(0);
    }

    public ChangeNumberNotifyContacts(int i2) {
        this.A0G = false;
        C13680ns.A1G(this, 107);
    }

    public void A1q() {
        if (!this.A0G) {
            this.A0G = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0E = C16150sX.A0c(r1);
            this.A0D = C16150sX.A0M(r1);
            this.A0B = (AnonymousClass01Y) r1.A1w.get();
            this.A0C = (AnonymousClass19Y) r1.A4r.get();
        }
    }

    public final void A35() {
        this.A02.setElevation(this.A08.canScrollVertically(1) ? (float) this.A00 : 0.0f);
    }

    public final void A36() {
        this.A08.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape191S0100000_2_I1(this, 3));
    }

    public final void A37() {
        this.A01 = 2;
        this.A03.setVisibility(0);
        this.A0F.clear();
        List list = this.A0F;
        ArrayList A0u = AnonymousClass000.A0u();
        HashSet A0o = C13680ns.A0o();
        A39(A0u);
        Iterator it = A0u.iterator();
        while (it.hasNext()) {
            C15830rv r1 = (C15830rv) C16010sH.A03(C13680ns.A0U(it));
            if (r1 != null && this.A0E.A0F(r1)) {
                A0o.add(r1);
            }
        }
        list.addAll(A0o);
    }

    public final void A38() {
        RadioButton radioButton;
        int i2 = this.A01;
        boolean z2 = true;
        Switch switchR = this.A09;
        if (i2 == 0) {
            switchR.setChecked(false);
            this.A0A.setText(R.string.str0414);
            this.A03.setVisibility(8);
            radioButton = this.A06;
        } else {
            switchR.setChecked(true);
            int size = this.A0F.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, size, 0);
            Spanned A012 = AnonymousClass1ZW.A01(this.A01.A0J(objArr, R.plurals.plurals0016, (long) size), new Object[0]);
            SpannableStringBuilder A0F2 = C13690nt.A0F(A012);
            URLSpan[] uRLSpanArr = (URLSpan[]) A012.getSpans(0, A012.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    if ("contacts-link".equals(uRLSpan.getURL())) {
                        int spanStart = A0F2.getSpanStart(uRLSpan);
                        int spanEnd = A0F2.getSpanEnd(uRLSpan);
                        int spanFlags = A0F2.getSpanFlags(uRLSpan);
                        A0F2.removeSpan(uRLSpan);
                        A0F2.setSpan(new IDxTSpanShape54S0100000_2_I1((Context) this, (Object) this, 4), spanStart, spanEnd, spanFlags);
                    }
                }
            }
            C30531cW.A02(this.A0A);
            C30531cW.A03(this.A0A, this.A08);
            this.A0A.setText(A0F2);
            this.A03.setVisibility(0);
            this.A05.setChecked(AnonymousClass000.A1R(this.A01, 1));
            this.A06.setChecked(AnonymousClass000.A1R(this.A01, 2));
            radioButton = this.A07;
            if (this.A01 != 3) {
                z2 = false;
            }
        }
        radioButton.setChecked(z2);
    }

    public final void A39(ArrayList arrayList) {
        this.A0D.A06.A0R(arrayList, 1, false, true);
        Set A082 = this.A0B.A08();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (A082.contains(C16010sH.A03(C13680ns.A0U(it)))) {
                it.remove();
            }
        }
    }

    public void A3A(List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        A39(A0u);
        Iterator it = A0u.iterator();
        while (it.hasNext()) {
            Jid A032 = C16010sH.A03(C13680ns.A0U(it));
            if (A032 != null) {
                list.add(A032);
            }
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 150) {
            if (i3 != -1) {
                Log.i("listmembersselector/permissions denied");
                this.A09.setChecked(false);
                return;
            }
            A37();
        } else if (i2 != 1) {
            super.onActivityResult(i2, i3, intent);
            return;
        } else if (i3 == -1) {
            this.A0F = C16030sJ.A07(intent, UserJid.class);
            this.A01 = 3;
        }
        A38();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            A36();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            r0 = 2131887145(0x7f120429, float:1.9408889E38)
            r13.setTitle(r0)
            X.02i r0 = X.C13690nt.A0N(r13)
            r4 = 1
            r0.A0N(r4)
            r0.A0O(r4)
            r0 = 2131558654(0x7f0d00fe, float:1.874263E38)
            r13.setContentView((int) r0)
            r0 = 2131362849(0x7f0a0421, float:1.834549E38)
            android.view.View r1 = r13.findViewById(r0)
            r0 = 26
            X.C13680ns.A15(r1, r13, r0)
            android.content.Intent r5 = r13.getIntent()
            r0 = 2131362688(0x7f0a0380, float:1.8345164E38)
            android.widget.TextView r9 = X.C13680ns.A0N(r13, r0)
            X.013 r2 = r13.A01
            java.lang.String r6 = "+"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r6)
            java.lang.String r0 = "oldJid"
            java.lang.String r0 = r5.getStringExtra(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r3 = r2.A0H(r0)
            X.013 r2 = r13.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r6)
            java.lang.String r0 = "newJid"
            java.lang.String r0 = r5.getStringExtra(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r11 = r2.A0H(r0)
            r6 = 2131887110(0x7f120406, float:1.9408818E38)
            r2 = 2
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 0
            r1[r0] = r3
            java.lang.String r0 = X.C13680ns.A0d(r13, r11, r1, r4, r6)
            int r12 = r0.indexOf(r3)
            int r8 = r0.indexOf(r11)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r0)
            r10 = 2131101457(0x7f060711, float:1.7815324E38)
            android.text.style.ForegroundColorSpan r0 = X.C13690nt.A0G(r13, r10)
            int r1 = r3.length()
            int r1 = r1 + r12
            r6 = 17
            r7.setSpan(r0, r12, r1, r6)
            java.lang.String r3 = "sans-serif-medium"
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r3)
            r7.setSpan(r0, r12, r1, r6)
            android.text.style.ForegroundColorSpan r0 = X.C13690nt.A0G(r13, r10)
            int r1 = r11.length()
            int r1 = r1 + r8
            r7.setSpan(r0, r8, r1, r6)
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r3)
            r7.setSpan(r0, r8, r1, r6)
            r9.setText(r7)
            r0 = 2131365901(0x7f0a100d, float:1.835168E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r13.A08 = r0
            r0 = 2131364882(0x7f0a0c12, float:1.8349614E38)
            android.view.View r0 = r13.findViewById(r0)
            r13.A04 = r0
            r0 = 2131364883(0x7f0a0c13, float:1.8349616E38)
            android.view.View r1 = r13.findViewById(r0)
            android.widget.Switch r1 = (android.widget.Switch) r1
            r13.A09 = r1
            r3 = 3
            com.facebook.redex.IDxCListenerShape220S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape220S0100000_2_I1
            r0.<init>(r13, r3)
            r1.setOnCheckedChangeListener(r0)
            android.view.View r1 = r13.A04
            r0 = 27
            X.C13680ns.A15(r1, r13, r0)
            r0 = 2131362703(0x7f0a038f, float:1.8345194E38)
            android.view.View r1 = r13.findViewById(r0)
            r13.A03 = r1
            r0 = 2131362682(0x7f0a037a, float:1.8345151E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r13.A05 = r0
            r0 = 2131362681(0x7f0a0379, float:1.834515E38)
            android.view.View r0 = r13.findViewById(r0)
            r6 = 25
            X.C13680ns.A15(r0, r13, r6)
            android.view.View r1 = r13.A03
            r0 = 2131362684(0x7f0a037c, float:1.8345156E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r13.A06 = r0
            r0 = 2131362683(0x7f0a037b, float:1.8345154E38)
            android.view.View r0 = r13.findViewById(r0)
            X.C13680ns.A15(r0, r13, r6)
            android.view.View r1 = r13.A03
            r0 = 2131362686(0x7f0a037e, float:1.834516E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r13.A07 = r0
            r0 = 2131362685(0x7f0a037d, float:1.8345158E38)
            android.view.View r0 = r13.findViewById(r0)
            X.C13680ns.A15(r0, r13, r6)
            r0 = 2131362698(0x7f0a038a, float:1.8345184E38)
            android.view.View r0 = r13.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r0 = (com.obwhatsapp.TextEmojiLabel) r0
            r13.A0A = r0
            r0 = 2131362312(0x7f0a0208, float:1.8344401E38)
            android.view.View r0 = r13.findViewById(r0)
            r13.A02 = r0
            java.lang.String r0 = "mode"
            if (r14 == 0) goto L_0x01dc
            int r0 = r14.getInt(r0)
            r13.A01 = r0
            if (r0 != r3) goto L_0x0154
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "selectedJids"
            java.util.ArrayList r0 = r14.getStringArrayList(r0)
        L_0x014e:
            java.util.List r0 = X.C16030sJ.A08(r1, r0)
            r13.A0F = r0
        L_0x0154:
            java.util.List r0 = r13.A0F
            if (r0 != 0) goto L_0x015e
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r13.A0F = r0
        L_0x015e:
            X.19Y r0 = r13.A0C
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x019d
            r0 = 0
            r13.A01 = r0
            android.view.View r1 = r13.A03
            r0 = 8
            r1.setVisibility(r0)
            java.util.List r0 = r13.A0F
            r0.clear()
        L_0x0175:
            r13.A38()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x019c
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131166963(0x7f0706f3, float:1.7948186E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r13.A00 = r0
            android.widget.ScrollView r0 = r13.A08
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.facebook.redex.IDxCListenerShape237S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape237S0100000_2_I1
            r0.<init>(r13, r3)
            r1.addOnScrollChangedListener(r0)
            r13.A36()
        L_0x019c:
            return
        L_0x019d:
            int r0 = r13.A01
            if (r0 != r4) goto L_0x01ae
            r13.A01 = r4
            java.util.List r0 = r13.A0F
            r0.clear()
            java.util.List r0 = r13.A0F
            r13.A3A(r0)
            goto L_0x0175
        L_0x01ae:
            if (r0 != r2) goto L_0x01b4
            r13.A37()
            goto L_0x0175
        L_0x01b4:
            if (r0 != r3) goto L_0x0175
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r13.A3A(r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            java.util.List r0 = r13.A0F
            java.util.Iterator r1 = r0.iterator()
        L_0x01c8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0175
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x01c8
            r1.remove()
            goto L_0x01c8
        L_0x01dc:
            int r0 = r5.getIntExtra(r0, r2)
            r13.A01 = r0
            if (r0 != r3) goto L_0x0154
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "preselectedJids"
            java.util.ArrayList r0 = r5.getStringArrayListExtra(r0)
            goto L_0x014e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.ChangeNumberNotifyContacts.onCreate(android.os.Bundle):void");
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();
        if (id == R.id.change_number_all) {
            if (this.A01 != 1) {
                this.A01 = 1;
                this.A0F.clear();
                A3A(this.A0F);
            } else {
                return;
            }
        } else if (id == R.id.change_number_chats) {
            if (this.A01 != 2) {
                A37();
            } else {
                return;
            }
        } else if (id == R.id.change_number_custom) {
            startActivityForResult(new Intent(this, NotifyContactsSelector.class), 1);
            return;
        } else {
            return;
        }
        A38();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        boolean isChecked = this.A09.isChecked();
        super.onRestoreInstanceState(bundle);
        this.A04.getViewTreeObserver().addOnPreDrawListener(new C94494l0(this, isChecked));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("selectedJids", C16030sJ.A06(this.A0F));
        bundle.putInt("mode", this.A01);
    }
}
