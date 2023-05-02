package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.R;
import com.obwhatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0110000_I0;

/* renamed from: X.2Aq  reason: invalid class name */
public abstract class AnonymousClass2Aq {
    public final /* synthetic */ QuickContactActivity A00;

    public AnonymousClass2Aq(QuickContactActivity quickContactActivity) {
        this.A00 = quickContactActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (r0 == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bf, code lost:
        if (X.C30341cC.A0J(r2.A06, r2.A0O, r2.A0P, r7, r6) != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e1, code lost:
        if (X.C30341cC.A0I(r2.A01, r2.A06, r6, r2.A0F, r2.A0P, r9, r10, r11) != false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f4, code lost:
        if (r4.A0n == null) goto L_0x01f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r12 = this;
            com.obwhatsapp.quickcontact.QuickContactActivity r2 = r12.A00
            android.view.View r4 = r2.A04
            X.0zl r1 = r2.A0T
            X.0sH r0 = r2.A0R
            boolean r0 = X.C40561uK.A00(r0, r1)
            r3 = r0 ^ 1
            r1 = 0
            r5 = 8
            r0 = 8
            if (r3 == 0) goto L_0x0016
            r0 = 0
        L_0x0016:
            r4.setVisibility(r0)
            android.view.View r0 = r2.A00
            r0.setVisibility(r5)
            android.view.View r0 = r2.A06
            r0.setVisibility(r5)
            android.view.View r0 = r2.A01
            r0.setVisibility(r5)
            android.view.View r0 = r2.A03
            r0.setVisibility(r5)
            android.view.View r4 = r2.A05
            X.0zl r3 = r2.A0T
            X.0sH r0 = r2.A0R
            boolean r0 = X.C40561uK.A00(r0, r3)
            if (r0 == 0) goto L_0x003a
            r5 = 0
        L_0x003a:
            r4.setVisibility(r5)
            boolean r0 = r12.A05()
            if (r0 == 0) goto L_0x0106
            X.0sH r0 = r2.A0R
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x0107
            X.1r0 r0 = r2.A0n
            if (r0 == 0) goto L_0x0107
            X.0sL r0 = r2.A0X
            X.AnonymousClass00B.A06(r0)
            android.view.View r1 = r2.A03
            r0 = 2131364235(0x7f0a098b, float:1.8348301E38)
            android.view.View r4 = X.C004601z.A0E(r1, r0)
            com.obwhatsapp.text.AutoSizeTextView r4 = (com.obwhatsapp.text.AutoSizeTextView) r4
            r0 = 88
            r4.A0C(r0)
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.0sL r1 = r2.A0X
            X.0vQ r0 = r2.A0D
            boolean r6 = X.C30341cC.A0K(r0, r1, r5)
            X.0sL r3 = r2.A0X
            if (r5 == 0) goto L_0x0083
            com.whatsapp.voipcalling.CallState r1 = r5.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0083
            com.whatsapp.jid.GroupJid r0 = r5.groupJid
            boolean r0 = r3.equals(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0084
        L_0x0083:
            r5 = 0
        L_0x0084:
            android.view.View r0 = r2.A03
            r0.setEnabled(r6)
            android.view.View r1 = r2.A03
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r6 == 0) goto L_0x0092
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0092:
            r1.setAlpha(r0)
            X.0sH r0 = r2.A0R
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x00eb
            X.1r0 r0 = r2.A0n
            if (r0 == 0) goto L_0x00eb
            android.view.View r1 = r2.A03
            r0 = 2131362536(0x7f0a02e8, float:1.8344855E38)
            android.view.View r3 = X.C004601z.A0E(r1, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            X.1r0 r0 = r2.A0n
            X.AnonymousClass00B.A06(r0)
            boolean r1 = r0.A04
            r0 = 2131231401(0x7f0802a9, float:1.8078882E38)
            if (r1 == 0) goto L_0x00bb
            r0 = 2131231439(0x7f0802cf, float:1.807896E38)
        L_0x00bb:
            r3.setImageResource(r0)
            r0 = 2131893731(0x7f121de3, float:1.9422247E38)
            if (r5 == 0) goto L_0x00c6
            r0 = 2131893011(0x7f121b13, float:1.9420786E38)
        L_0x00c6:
            r4.setText(r0)
            android.view.View r4 = r2.A03
            r0 = 2131892835(0x7f121a63, float:1.942043E38)
            if (r1 == 0) goto L_0x00d3
            r0 = 2131889805(0x7f120e8d, float:1.9414284E38)
        L_0x00d3:
            java.lang.String r3 = r2.getString(r0)
            r0 = 2131892931(0x7f121ac3, float:1.9420624E38)
            if (r5 == 0) goto L_0x00df
            r0 = 2131893011(0x7f121b13, float:1.9420786E38)
        L_0x00df:
            java.lang.String r1 = r2.getString(r0)
            X.3P5 r0 = new X.3P5
            r0.<init>(r3, r1)
            X.C004601z.A0j(r4, r0)
        L_0x00eb:
            r1 = r12
            boolean r0 = r12 instanceof X.AnonymousClass345
            if (r0 == 0) goto L_0x01e5
            X.345 r1 = (X.AnonymousClass345) r1
            com.obwhatsapp.quickcontact.QuickContactActivity r1 = r1.A00
            X.0sH r0 = r1.A0R
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x0106
            X.1r0 r0 = r1.A0n
            if (r0 == 0) goto L_0x0106
            android.view.View r1 = r1.A03
            r0 = 0
            r1.setVisibility(r0)
        L_0x0106:
            return
        L_0x0107:
            X.0zl r3 = r2.A0T
            X.0sH r0 = r2.A0R
            boolean r0 = X.C40561uK.A00(r0, r3)
            r3 = 0
            if (r0 != 0) goto L_0x013f
            X.0sH r0 = r2.A0R
            boolean r0 = r0.A0J()
            if (r0 != 0) goto L_0x01c5
            X.0sH r4 = r2.A0R
            X.0rv r0 = r4.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x01c5
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r4.A08(r0)
            X.0rv r4 = (X.C15830rv) r4
            X.0vQ r0 = r2.A0D
            X.0sK r3 = r2.A01
            if (r4 == 0) goto L_0x01c2
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x01c2
            boolean r0 = r3.A0I(r4)
            if (r0 != 0) goto L_0x01c2
        L_0x013e:
            r3 = 1
        L_0x013f:
            X.0zl r4 = r2.A0T
            X.0sH r0 = r2.A0R
            boolean r0 = X.C40561uK.A00(r0, r4)
            r8 = 0
            if (r0 != 0) goto L_0x015d
            X.0sH r0 = r2.A0R
            boolean r0 = r0.A0J()
            if (r0 != 0) goto L_0x01a5
            X.0sH r0 = r2.A0R
            X.0rv r0 = r0.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x01a5
        L_0x015c:
            r8 = 1
        L_0x015d:
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x018c
            android.view.View r0 = r2.A00
            r0.setVisibility(r1)
            android.view.View r0 = r2.A06
            r0.setVisibility(r1)
            android.view.View r0 = r2.A00
            r0.setEnabled(r3)
            android.view.View r0 = r2.A06
            r0.setEnabled(r3)
            android.view.View r1 = r2.A00
            r0 = 1053609165(0x3ecccccd, float:0.4)
            if (r3 == 0) goto L_0x017e
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x017e:
            r1.setAlpha(r0)
            android.view.View r0 = r2.A06
        L_0x0183:
            if (r3 != 0) goto L_0x0188
            r5 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0188:
            r0.setAlpha(r5)
            return
        L_0x018c:
            X.0sL r4 = r2.A0X
            if (r4 == 0) goto L_0x0106
            X.0sO r0 = r2.A0P
            boolean r0 = r0.A09(r4)
            if (r0 == 0) goto L_0x0106
            android.view.View r0 = r2.A01
            r0.setVisibility(r1)
            android.view.View r0 = r2.A01
            r0.setEnabled(r3)
            android.view.View r0 = r2.A01
            goto L_0x0183
        L_0x01a5:
            X.0sH r0 = r2.A0R
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x015d
            X.0sH r7 = r2.A0R
            X.0rv r0 = r7.A0E
            com.whatsapp.jid.GroupJid r6 = com.whatsapp.jid.GroupJid.of(r0)
            X.0rt r5 = r2.A0O
            X.0s5 r4 = r2.A06
            X.0sO r0 = r2.A0P
            boolean r0 = X.C30341cC.A0J(r4, r5, r0, r7, r6)
            if (r0 == 0) goto L_0x015d
            goto L_0x015c
        L_0x01c2:
            r3 = 0
            goto L_0x013f
        L_0x01c5:
            X.0sH r0 = r2.A0R
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x013f
            X.0sL r11 = r2.A0X
            X.0sH r9 = r2.A0R
            X.0vQ r6 = r2.A0D
            X.0ul r10 = r2.A0V
            X.0sO r8 = r2.A0P
            X.0sK r4 = r2.A01
            X.0s5 r5 = r2.A06
            X.0sG r7 = r2.A0F
            boolean r0 = X.C30341cC.A0I(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x013f
            goto L_0x013e
        L_0x01e5:
            X.2jZ r1 = (X.C55412jZ) r1
            com.obwhatsapp.quickcontact.QuickContactActivity r4 = r1.A04
            X.0sH r0 = r4.A0R
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x01f6
            X.1r0 r0 = r4.A0n
            r3 = 1
            if (r0 != 0) goto L_0x01f7
        L_0x01f6:
            r3 = 0
        L_0x01f7:
            r2 = 8
            r1 = 0
            android.view.View r0 = r4.A04
            if (r3 == 0) goto L_0x0207
            r0.setVisibility(r2)
            android.view.View r0 = r4.A03
            r0.setVisibility(r1)
            return
        L_0x0207:
            r0.setVisibility(r1)
            android.view.View r0 = r4.A03
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Aq.A00():void");
    }

    public void A01() {
        QuickContactActivity quickContactActivity = this.A00;
        if (quickContactActivity.A0R.A0J()) {
            Intent A0W = C14750ph.A0W(quickContactActivity, quickContactActivity.A0R.A0E, true, false, true);
            AnonymousClass22U.A00(A0W, "QuickContactActivity");
            quickContactActivity.startActivity(A0W);
        } else {
            C16010sH r1 = quickContactActivity.A0R;
            Integer num = null;
            if (C16030sJ.A0G(r1.A0E)) {
                quickContactActivity.startActivity(C14750ph.A0R(quickContactActivity, r1.A0E), (Bundle) null);
            } else {
                int intExtra = quickContactActivity.getIntent().getIntExtra("profile_entry_point", -1);
                Integer valueOf = Integer.valueOf(intExtra);
                if (intExtra != -1) {
                    num = valueOf;
                }
                Jid A08 = quickContactActivity.A0R.A08(UserJid.class);
                AnonymousClass00B.A06(A08);
                quickContactActivity.startActivity(C14750ph.A0Z(quickContactActivity, (UserJid) A08, num, true));
            }
        }
        quickContactActivity.A37(false);
    }

    public void A02() {
        QuickContactActivity quickContactActivity = this.A00;
        quickContactActivity.A04.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 38));
        quickContactActivity.A00.setOnTouchListener(new C94254kc(0.2f, 0.0f, 0.2f, 0.0f));
        quickContactActivity.A06.setOnTouchListener(new C94254kc(0.2f, 0.0f, 0.2f, 0.0f));
        quickContactActivity.A01.setOnTouchListener(new C94254kc(0.2f, 0.0f, 0.2f, 0.0f));
        quickContactActivity.A00.setOnClickListener(new ViewOnClickCListenerShape0S0110000_I0(quickContactActivity, 3, false));
        quickContactActivity.A06.setOnClickListener(new ViewOnClickCListenerShape0S0110000_I0(quickContactActivity, 3, true));
        quickContactActivity.A01.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 40));
        quickContactActivity.A03.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 39));
        quickContactActivity.A05.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 37));
    }

    public void A03() {
        TextView textView;
        String A0H;
        if (this instanceof AnonymousClass345) {
            QuickContactActivity.A02(((AnonymousClass345) this).A00);
            return;
        }
        C55412jZ r4 = (C55412jZ) this;
        QuickContactActivity quickContactActivity = r4.A04;
        QuickContactActivity.A02(quickContactActivity);
        String A01 = C24561Gk.A01(quickContactActivity.A0R);
        if (quickContactActivity.A0q) {
            A0H = quickContactActivity.A01.A0H(A01);
            C16000sG r5 = quickContactActivity.A0F;
            C16080sP r2 = quickContactActivity.A0I;
            C16040sK r0 = r5.A01;
            r0.A0B();
            C16010sH A09 = r5.A09(r0.A05);
            if (A09 != null) {
                String A08 = r2.A08(A09);
                if (A0H != null && !A0H.equals(A08)) {
                    textView = r4.A02;
                }
            }
            r4.A02.setVisibility(8);
            return;
        } else if (quickContactActivity.A0R.A0G()) {
            textView = r4.A02;
            A0H = quickContactActivity.A01.A0H(A01);
        } else {
            if (quickContactActivity.A0R.A0J()) {
                boolean A0m = quickContactActivity.A0V.A0m(C16050sL.A03(quickContactActivity.A0R.A0E));
                int i2 = R.plurals.plurals011d;
                if (A0m) {
                    i2 = R.plurals.plurals011e;
                }
                int A012 = quickContactActivity.A0P.A01((C16060sN) quickContactActivity.A0R.A08(GroupJid.class));
                r4.A02.setText(quickContactActivity.getResources().getQuantityString(i2, A012, new Object[]{Integer.valueOf(A012)}));
            } else {
                if (C16080sP.A02(quickContactActivity.A0R)) {
                    r4.A02.setText(quickContactActivity.A0I.A0F(quickContactActivity.A0R));
                }
                r4.A02.setVisibility(8);
                return;
            }
            r4.A02.setVisibility(0);
        }
        textView.setText(A0H);
        r4.A02.setVisibility(0);
    }

    public void A04() {
        ImageView imageView;
        QuickContactActivity quickContactActivity = this.A00;
        Jid A08 = quickContactActivity.A0R.A08(GroupJid.class);
        float f2 = 0.0f;
        if (quickContactActivity.A0H.A01.A0E(C16620tM.A02, 604)) {
            f2 = -1.0f;
        }
        if (quickContactActivity.A0V.A0m(C16050sL.A03(A08))) {
            f2 = -2.14748365E9f;
        }
        Bitmap A002 = quickContactActivity.A0L.A00(quickContactActivity, quickContactActivity.A0R, f2, quickContactActivity.getResources().getDimensionPixelSize(R.dimen.dimen0667));
        if (A002 != null) {
            imageView = quickContactActivity.A07;
        } else {
            if (this instanceof AnonymousClass345) {
                QuickContactActivity quickContactActivity2 = ((AnonymousClass345) this).A00;
                A002 = quickContactActivity2.A0E.A03(quickContactActivity2.A07.getContext(), quickContactActivity2.A0E.A02(C15830rv.A00(quickContactActivity2.A0R.A0E)));
                if (!(quickContactActivity2.A07.getDrawable() instanceof BitmapDrawable) || ((BitmapDrawable) quickContactActivity2.A07.getDrawable()).getBitmap() != A002) {
                    imageView = quickContactActivity2.A07;
                } else {
                    return;
                }
            } else {
                QuickContactActivity quickContactActivity3 = ((C55412jZ) this).A04;
                int A02 = quickContactActivity3.A0E.A02(C15830rv.A00(quickContactActivity3.A0R.A0E));
                C49762Vq r4 = C99004tK.A00;
                if (quickContactActivity3.A0V.A0m(C16050sL.A03(quickContactActivity3.A0R.A0E))) {
                    r4 = C49752Vp.A00;
                }
                quickContactActivity3.A07.setImageDrawable(quickContactActivity3.A0S.A00(quickContactActivity3.getTheme(), quickContactActivity3.getResources(), r4, A02));
                return;
            }
        }
        imageView.setImageBitmap(A002);
    }

    public boolean A05() {
        QuickContactActivity quickContactActivity = this.A00;
        if (quickContactActivity.A0q) {
            return false;
        }
        if (!quickContactActivity.A0R.A0J() && !C16030sJ.A0G(quickContactActivity.A0R.A0E)) {
            return true;
        }
        if (!quickContactActivity.A0R.A0J()) {
            return false;
        }
        C16050sL r2 = quickContactActivity.A0X;
        return (r2 == null || quickContactActivity.A0R.A0a || quickContactActivity.A0O.A02(r2) == 3) ? false : true;
    }
}
