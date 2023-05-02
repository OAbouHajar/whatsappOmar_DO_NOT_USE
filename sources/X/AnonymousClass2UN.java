package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.2UN  reason: invalid class name */
public class AnonymousClass2UN extends AnonymousClass01X {
    public List A00 = new ArrayList();
    public List A01 = new ArrayList();
    public List A02;
    public Map A03 = Collections.emptyMap();
    public boolean A04 = false;
    public final C19980zJ A05;
    public final C14870pt A06;
    public final AnonymousClass38Y A07;
    public final AnonymousClass139 A08;
    public final AnonymousClass01V A09;
    public final C16440t3 A0A;
    public final AnonymousClass013 A0B;
    public final C19410yO A0C;
    public final AnonymousClass137 A0D;
    public final C14710pd A0E;
    public final AnonymousClass16S A0F;
    public final C17220uj A0G;

    public AnonymousClass2UN(C19980zJ r2, C14870pt r3, AnonymousClass38Y r4, AnonymousClass139 r5, AnonymousClass01V r6, C16440t3 r7, AnonymousClass013 r8, C19410yO r9, AnonymousClass137 r10, C14710pd r11, AnonymousClass16S r12, C17220uj r13) {
        this.A07 = r4;
        this.A0A = r7;
        this.A0E = r11;
        this.A06 = r3;
        this.A05 = r2;
        this.A0G = r13;
        this.A09 = r6;
        this.A0B = r8;
        this.A0F = r12;
        this.A0D = r10;
        this.A0C = r9;
        this.A08 = r5;
        A0E();
    }

    public int A0C() {
        return this.A02.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f A[LOOP:0: B:19:0x0099->B:21:0x009f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104 A[LOOP:1: B:34:0x00fe->B:36:0x0104, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E() {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A02 = r0
            java.util.List r4 = r13.A00
            boolean r0 = r4.isEmpty()
            r10 = 1
            r5 = 0
            if (r0 != 0) goto L_0x00b1
            X.0t3 r3 = r13.A0A
            long r0 = r3.A01
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0022
            long r6 = r3.A01
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 + r0
        L_0x0022:
            long r1 = r3.A01()
            long r11 = r6 - r1
            X.137 r0 = r13.A0D
            X.0pd r8 = r0.A0E
            r3 = 903(0x387, float:1.265E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r8.A0E(r0, r3)
            if (r0 == 0) goto L_0x00b1
            long r11 = java.lang.Math.abs(r11)
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b1
            java.lang.String r0 = "LinkedDevicesAdapter/shouldShowAdvWarningBanner ntpTs="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            r3.append(r6)
            java.lang.String r0 = "; waServerTs="
            r3.append(r0)
            long r1 = r1 / r8
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x00b1
            java.util.List r2 = r13.A02
            X.4Hc r1 = new X.4Hc
            r1.<init>(r5, r10)
        L_0x0069:
            r2.add(r1)
        L_0x006c:
            java.util.List r3 = r13.A02
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1 = 4
            X.4Hc r0 = new X.4Hc
            r0.<init>(r2, r1)
            r3.add(r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x008a
            java.util.List r0 = r13.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0095
        L_0x008a:
            java.util.List r2 = r13.A02
            r1 = 5
            X.4Hc r0 = new X.4Hc
            r0.<init>(r5, r1)
            r2.add(r0)
        L_0x0095:
            java.util.Iterator r4 = r4.iterator()
        L_0x0099:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r3 = r4.next()
            X.1WN r3 = (X.AnonymousClass1WN) r3
            java.util.List r2 = r13.A02
            r1 = 6
            X.4Hc r0 = new X.4Hc
            r0.<init>(r3, r1)
            r2.add(r0)
            goto L_0x0099
        L_0x00b1:
            X.16S r0 = r13.A0F
            X.0rz r0 = r0.A01
            boolean r0 = r0.A1d()
            if (r0 == 0) goto L_0x006c
            X.0pd r2 = r13.A0E
            r1 = 1037(0x40d, float:1.453E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x006c
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x006c
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x006c
            X.0t3 r0 = r13.A0A
            long r6 = r0.A00()
            X.139 r0 = r13.A08
            android.content.SharedPreferences r3 = r0.A01()
            java.lang.String r2 = "syncd_last_fatal_error_time"
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            long r6 = r6 - r0
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            java.util.List r2 = r13.A02
            r0 = 2
            X.4Hc r1 = new X.4Hc
            r1.<init>(r5, r0)
            goto L_0x0069
        L_0x00f8:
            java.util.List r0 = r13.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x00fe:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r3 = r4.next()
            java.util.List r2 = r13.A02
            r1 = 8
            X.4Hc r0 = new X.4Hc
            r0.<init>(r3, r1)
            r2.add(r0)
            goto L_0x00fe
        L_0x0115:
            X.0pd r2 = r13.A0E
            r1 = 1071(0x42f, float:1.501E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x012d
            java.util.List r2 = r13.A02
            r1 = 9
            X.4Hc r0 = new X.4Hc
            r0.<init>(r5, r1)
            r2.add(r0)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2UN.A0E():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ANf(X.C005602k r11, int r12) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.AnonymousClass3oI
            if (r0 == 0) goto L_0x0055
            X.3SZ r11 = (X.AnonymousClass3SZ) r11
            java.util.List r0 = r10.A02
            java.lang.Object r0 = r0.get(r12)
            X.4Hc r0 = (X.C83544Hc) r0
            java.lang.Object r4 = r0.A01
            X.4ML r4 = (X.AnonymousClass4ML) r4
            android.widget.ImageView r1 = r11.A01
            int r0 = r4.A00
            r1.setImageResource(r0)
            android.widget.TextView r9 = r11.A04
            X.013 r3 = r11.A07
            long r1 = r4.A02
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r1
            r5 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0050
            r0 = 2131889193(0x7f120c29, float:1.9413043E38)
            java.lang.String r0 = r3.A09(r0)
        L_0x0031:
            r9.setText(r0)
            android.widget.TextView r3 = r11.A03
            android.view.View r2 = r11.A0H
            android.content.Context r1 = r2.getContext()
            int r0 = r4.A01
            java.lang.CharSequence r0 = r1.getText(r0)
            r3.setText(r0)
            r0 = 37
            com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1 r1 = new com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1
            r1.<init>((java.lang.Object) r11, (int) r0, (java.lang.Object) r4)
        L_0x004c:
            r2.setOnClickListener(r1)
        L_0x004f:
            return
        L_0x0050:
            java.lang.CharSequence r0 = X.C28961Zl.A00(r3, r1)
            goto L_0x0031
        L_0x0055:
            boolean r0 = r11 instanceof X.AnonymousClass3SZ
            if (r0 == 0) goto L_0x012c
            java.util.List r0 = r10.A02
            java.lang.Object r0 = r0.get(r12)
            X.4Hc r0 = (X.C83544Hc) r0
            java.lang.Object r4 = r0.A01
            X.2Vg r4 = (X.C49722Vg) r4
            X.3SZ r11 = (X.AnonymousClass3SZ) r11
            X.0yO r0 = r10.A0C
            com.whatsapp.jid.DeviceJid r1 = r4.A06
            java.util.Set r0 = r0.A0P
            boolean r5 = r0.contains(r1)
            android.widget.ImageView r1 = r11.A01
            int r0 = X.AnonymousClass46P.A00(r4)
            r1.setImageResource(r0)
            android.widget.TextView r1 = r11.A03
            android.content.Context r0 = r1.getContext()
            java.lang.String r0 = X.AnonymousClass1WN.A00(r0, r4)
            r1.setText(r0)
            boolean r8 = r4.A01()
            if (r8 == 0) goto L_0x0109
            android.widget.TextView r1 = r11.A04
            r0 = 2131889203(0x7f120c33, float:1.9413063E38)
        L_0x0092:
            r1.setText(r0)
        L_0x0095:
            boolean r7 = r4.A00
            android.widget.ImageView r5 = r11.A02
            android.widget.ImageView r9 = r11.A00
            X.0t3 r0 = r11.A06
            r6 = 8
            if (r8 == 0) goto L_0x00c2
            long r7 = r0.A00()
            long r0 = r4.A01
            long r7 = r7 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r0 = 8
            if (r1 <= 0) goto L_0x00b2
            r0 = 0
        L_0x00b2:
            r9.setVisibility(r0)
            r5.setVisibility(r6)
        L_0x00b8:
            android.view.View r2 = r11.A0H
            r0 = 38
            com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1 r1 = new com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1
            r1.<init>((java.lang.Object) r11, (int) r0, (java.lang.Object) r4)
            goto L_0x004c
        L_0x00c2:
            r9.setVisibility(r6)
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 0
            int r0 = r5.getVisibility()
            if (r7 == 0) goto L_0x00ec
            if (r0 != r6) goto L_0x00b8
            r5.clearAnimation()
            r5.setAlpha(r3)
            r0 = 0
            r5.setVisibility(r0)
            android.view.ViewPropertyAnimator r3 = r5.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r3.alpha(r0)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
        L_0x00e8:
            r0.start()
            goto L_0x00b8
        L_0x00ec:
            if (r0 != 0) goto L_0x00b8
            r5.clearAnimation()
            android.view.ViewPropertyAnimator r0 = r5.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)
            r1 = 12
            com.facebook.redex.IDxLAdapterShape3S0100000_2_I0 r0 = new com.facebook.redex.IDxLAdapterShape3S0100000_2_I0
            r0.<init>(r5, r1)
            android.view.ViewPropertyAnimator r0 = r2.setListener(r0)
            goto L_0x00e8
        L_0x0109:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0113
            android.widget.TextView r1 = r11.A04
            r0 = 2131889222(0x7f120c46, float:1.9413101E38)
            goto L_0x0092
        L_0x0113:
            android.widget.TextView r3 = r11.A04
            X.013 r2 = r11.A07
            long r0 = r4.A00
            if (r5 == 0) goto L_0x0127
            r0 = 2131889193(0x7f120c29, float:1.9413043E38)
            java.lang.String r0 = r2.A09(r0)
        L_0x0122:
            r3.setText(r0)
            goto L_0x0095
        L_0x0127:
            java.lang.CharSequence r0 = X.C28961Zl.A00(r2, r0)
            goto L_0x0122
        L_0x012c:
            boolean r0 = r11 instanceof X.AnonymousClass3S1
            if (r0 == 0) goto L_0x0142
            X.3S1 r11 = (X.AnonymousClass3S1) r11
            android.widget.Button r1 = r11.A00
            r0 = 2131889194(0x7f120c2a, float:1.9413045E38)
            r1.setText(r0)
            com.obwhatsapp.WaTextView r1 = r11.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0142:
            boolean r0 = r11 instanceof X.AnonymousClass3S0
            if (r0 == 0) goto L_0x004f
            X.3S0 r11 = (X.AnonymousClass3S0) r11
            X.38Y r0 = r11.A01
            com.obwhatsapp.TextEmojiLabel r7 = r11.A00
            com.obwhatsapp.companiondevice.LinkedDevicesActivity r6 = r0.A00
            X.26f r5 = r6.A0A
            r0 = 2131890812(0x7f12127c, float:1.9416326E38)
            java.lang.String r4 = r6.getString(r0)
            X.0uY r3 = r5.A03
            r2 = 2131101273(0x7f060659, float:1.7814951E38)
            r0 = 46
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r1 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r1.<init>(r5, r0, r6)
            java.lang.String r0 = "%s"
            android.text.SpannableStringBuilder r0 = r3.A07(r1, r4, r0, r2)
            r7.setText(r0)
            X.3MF r0 = new X.3MF
            r0.<init>()
            r7.setMovementMethod(r0)
            X.1BL r2 = r6.A0F
            r1 = 9
            r0 = 0
            r2.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2UN.ANf(X.02k, int):void");
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            C14870pt r6 = this.A06;
            C19980zJ r5 = this.A05;
            C17220uj r8 = this.A0G;
            return new AnonymousClass3RX(new ViewOnClickCListenerShape9S0100000_I0_2(this, 11), LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0067, viewGroup, false), r5, r6, this.A09, r8, "seeing-devices-out-of-sync", R.string.device_linking_adv_warning_message);
        } else if (i2 == 2) {
            C14870pt r62 = this.A06;
            C19980zJ r52 = this.A05;
            C17220uj r82 = this.A0G;
            return new AnonymousClass3RX(new ViewOnClickCListenerShape9S0100000_I0_2(this, 10), LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0067, viewGroup, false), r52, r62, this.A09, r82, "seeing-devices-logged-out-unexpected-issue", R.string.device_linking_fatal_error_warning_message);
        } else if (i2 == 4) {
            C14870pt r4 = this.A06;
            C19980zJ r3 = this.A05;
            AnonymousClass01V r63 = this.A09;
            C17220uj r7 = this.A0G;
            return new AnonymousClass3S1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0388, viewGroup, false), r3, r4, this.A07, r63, r7);
        } else if (i2 == 5) {
            return new AnonymousClass3RW(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.device_section_layout, viewGroup, false));
        } else {
            if (i2 == 6) {
                C16440t3 r53 = this.A0A;
                AnonymousClass013 r42 = this.A0B;
                return new AnonymousClass3SZ(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0383, viewGroup, false), this.A07, r53, r42);
            } else if (i2 == 8) {
                C16440t3 r54 = this.A0A;
                AnonymousClass013 r43 = this.A0B;
                return new AnonymousClass3oI(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0383, viewGroup, false), this.A07, r54, r43);
            } else if (i2 == 9) {
                return new AnonymousClass3S0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0386, viewGroup, false), this.A07);
            } else {
                StringBuilder sb = new StringBuilder("Invalid viewType: ");
                sb.append(i2);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    public int getItemViewType(int i2) {
        return ((C83544Hc) this.A02.get(i2)).A00;
    }
}
