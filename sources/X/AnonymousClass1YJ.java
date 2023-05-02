package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1YJ  reason: invalid class name */
public class AnonymousClass1YJ extends AnonymousClass01X {
    public AnonymousClass1YK A00;
    public AnonymousClass1YK A01;
    public AnonymousClass1YI A02;
    public C53772gG A03;
    public String A04;
    public List A05 = new ArrayList();
    public List A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final View.OnClickListener A0A;
    public final LinearLayoutManager A0B;
    public final C16300so A0C;
    public final C14870pt A0D;
    public final C15900s5 A0E;
    public final C16000sG A0F;
    public final C16080sP A0G;
    public final AnonymousClass2Ao A0H;
    public final AnonymousClass013 A0I;
    public final C26101Mi A0J;
    public final C16490t9 A0K;
    public final C25781Lc A0L;
    public final C30801cy A0M;
    public final C16320sq A0N;
    public final Runnable A0O = new RunnableRunnableShape15S0100000_I0_14(this, 21);
    public final String A0P;
    public final LinkedHashMap A0Q;

    public AnonymousClass1YJ(View.OnClickListener onClickListener, LinearLayoutManager linearLayoutManager, C16300so r7, C14870pt r8, C15900s5 r9, C16000sG r10, C16080sP r11, AnonymousClass2Ao r12, AnonymousClass013 r13, C26101Mi r14, C16490t9 r15, C25781Lc r16, C30801cy r17, C16320sq r18, String str, int i2) {
        this.A0D = r8;
        this.A0C = r7;
        this.A0N = r18;
        this.A0K = r15;
        this.A0E = r9;
        this.A0F = r10;
        this.A0G = r11;
        this.A0I = r13;
        this.A0L = r16;
        this.A0B = linearLayoutManager;
        this.A0H = r12;
        this.A09 = i2;
        this.A0P = str;
        this.A0M = r17;
        this.A0A = onClickListener;
        this.A0J = r14;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A0Q = linkedHashMap;
        Boolean bool = Boolean.FALSE;
        linkedHashMap.put(2, bool);
        Boolean bool2 = Boolean.TRUE;
        linkedHashMap.put(1, bool2);
        linkedHashMap.put(3, bool);
        linkedHashMap.put(8, Boolean.valueOf(r14.A01()));
        linkedHashMap.put(4, bool2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r3.A05.size() != 0) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0C() {
        /*
            r3 = this;
            int r2 = r3.A0E()
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0041
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0041
            java.util.List r0 = r3.A05
            int r1 = r0.size()
            int r0 = r3.A0F()
            int r1 = r1 - r0
        L_0x0017:
            int r2 = r2 + r1
            boolean r0 = r3.A07
            r1 = 0
            if (r0 == 0) goto L_0x0030
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0030
            java.util.List r0 = r3.A05
            int r0 = r0.size()
            if (r0 == 0) goto L_0x002f
            int r0 = r3.A0F()
            if (r0 <= 0) goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            int r2 = r2 + r1
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x003e
            java.util.List r0 = r3.A05
            int r1 = r0.size()
            r0 = 1
            if (r1 == 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            int r2 = r2 + r0
            return r2
        L_0x0041:
            java.util.List r0 = r3.A05
            int r1 = r0.size()
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YJ.A0C():int");
    }

    public final int A0E() {
        int i2 = 0;
        for (Map.Entry value : this.A0Q.entrySet()) {
            if (((Boolean) value.getValue()).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final int A0F() {
        int i2 = 0;
        for (C28711Xg r0 : this.A05) {
            if (r0.A00.A0G == 0) {
                i2++;
            }
        }
        return i2;
    }

    public final int A0G(int i2) {
        int i3 = 0;
        for (Map.Entry entry : this.A0Q.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                if (((Number) entry.getKey()).intValue() == i2) {
                    return i3;
                }
                i3++;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r2 < 4) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0.A02.size() < 4) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H() {
        /*
            r7 = this;
            java.util.LinkedHashMap r6 = r7.A0Q
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r6.get(r5)
            if (r0 == 0) goto L_0x003f
            X.1YK r0 = r7.A01
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 4
            r3 = 1
            if (r1 >= r0) goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            X.1YK r0 = r7.A00
            if (r0 == 0) goto L_0x002a
            java.util.List r0 = r0.A02
            int r2 = r0.size()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r3 != 0) goto L_0x0040
            if (r0 != 0) goto L_0x0040
            java.lang.Object r0 = r6.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0052
            r0 = 0
        L_0x003c:
            r7.A0I(r4, r0)
        L_0x003f:
            return
        L_0x0040:
            java.lang.Object r0 = r6.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0052
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x003f
            r0 = 1
            goto L_0x003c
        L_0x0052:
            int r0 = r7.A0G(r4)
            if (r0 < 0) goto L_0x003f
            r7.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YJ.A0H():void");
    }

    public final void A0I(int i2, boolean z2) {
        LinkedHashMap linkedHashMap = this.A0Q;
        Integer valueOf = Integer.valueOf(i2);
        if (linkedHashMap.get(valueOf) != null && ((Boolean) linkedHashMap.get(valueOf)).booleanValue() != z2) {
            if (z2) {
                linkedHashMap.put(valueOf, Boolean.TRUE);
                int A0G2 = A0G(i2);
                A03(A0G2);
                if (A0G2 == 0) {
                    LinearLayoutManager linearLayoutManager = this.A0B;
                    if (linearLayoutManager.A18() == 0) {
                        linearLayoutManager.A0n(0);
                        return;
                    }
                    return;
                }
                return;
            }
            A04(A0G(i2));
            linkedHashMap.put(valueOf, Boolean.FALSE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ba, code lost:
        if (r12.A02.size() < 4) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ANf(X.C005602k r21, int r22) {
        /*
            r20 = this;
            r6 = r21
            boolean r0 = r6 instanceof X.C53772gG
            r1 = r20
            if (r0 == 0) goto L_0x0067
            X.2gG r6 = (X.C53772gG) r6
            X.1YI r1 = r1.A02
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = "storage-usage-summary-view-holder/bind"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r4 = r1.A01
            long r2 = r1.A00
            long r11 = r1.A02
            double r9 = (double) r2
            double r7 = (double) r11
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 * r0
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r7 = r7 * r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r7 = r7 / r0
            r0 = 4737168216739020800(0x41bdcd6500000000, double:5.0E8)
            double r7 = java.lang.Math.min(r7, r0)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r8 = 0
            if (r0 >= 0) goto L_0x0034
            r8 = 1
        L_0x0034:
            X.013 r7 = r6.A0D
            java.lang.String r10 = X.AnonymousClass2GQ.A03(r7, r4)
            java.lang.String r9 = X.AnonymousClass2GQ.A03(r7, r2)
            long r0 = r6.A01
            java.lang.String r0 = X.AnonymousClass2GQ.A03(r7, r0)
            boolean r0 = X.C34901l3.A00(r10, r0)
            if (r0 == 0) goto L_0x01b0
            long r0 = r6.A00
            java.lang.String r0 = X.AnonymousClass2GQ.A03(r7, r0)
            boolean r0 = X.C34901l3.A00(r9, r0)
            if (r0 == 0) goto L_0x01b0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            boolean r0 = r6.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C34901l3.A00(r1, r0)
            if (r0 == 0) goto L_0x01b0
        L_0x0066:
            return
        L_0x0067:
            boolean r0 = r6 instanceof X.C64893Sb
            if (r0 == 0) goto L_0x009a
            X.3Sb r6 = (X.C64893Sb) r6
            java.util.List r2 = r1.A05
            int r0 = r1.A0E()
            int r3 = r22 - r0
            java.lang.Object r8 = r2.get(r3)
            X.1Xg r8 = (X.C28711Xg) r8
            X.2Ao r10 = r1.A0H
            java.lang.String r9 = r1.A04
            java.util.List r3 = r1.A06
            java.lang.String r7 = r1.A0P
            int r5 = r1.A09
            X.1cy r4 = r1.A0M
            X.0sG r1 = r6.A04
            X.0rv r0 = r8.A01()
            X.0sH r2 = r1.A08(r0)
            if (r2 != 0) goto L_0x03e9
            android.view.View r1 = r6.A0H
            r0 = 0
            r1.setOnClickListener(r0)
            return
        L_0x009a:
            boolean r0 = r6 instanceof X.C64943Sg
            if (r0 == 0) goto L_0x0155
            X.3Sg r6 = (X.C64943Sg) r6
            X.1YK r9 = r1.A01
            X.1YK r12 = r1.A00
            java.lang.String r4 = r1.A0P
            int r3 = r1.A09
            X.1cy r2 = r1.A0M
            java.lang.String r0 = "storage-usage-cleanup-suggestions-view-holder/bind"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r12 == 0) goto L_0x00bc
            java.util.List r0 = r12.A02
            int r5 = r0.size()
            r1 = 4
            r0 = 1
            if (r5 >= r1) goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r7 = 0
            r5 = 8
            if (r0 == 0) goto L_0x014f
            android.view.View r11 = r6.A00
            r19 = 1
            com.facebook.redex.ViewOnClickCListenerShape0S1301000_I1 r13 = new com.facebook.redex.ViewOnClickCListenerShape0S1301000_I1
            r14 = r6
            r15 = r12
            r16 = r2
            r17 = r4
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r11.setOnClickListener(r13)
            long r0 = r12.A01
            android.widget.TextView r10 = r6.A02
            X.013 r8 = r6.A05
            java.lang.String r8 = X.AnonymousClass2GQ.A04(r8, r0)
            r10.setText(r8)
            r13 = 0
            int r8 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            r0 = 0
            if (r8 != 0) goto L_0x00ec
            r0 = 8
        L_0x00ec:
            r11.setVisibility(r0)
            com.obwhatsapp.storage.StorageUsageMediaPreviewView r10 = r6.A07
            java.util.List r8 = r12.A02
            int r1 = r12.A00
            java.lang.String r0 = "forwarded_files"
            r10.setPreviewMediaItems(r8, r1, r0)
            r11.setVisibility(r7)
        L_0x00fd:
            if (r9 == 0) goto L_0x041a
            java.util.List r10 = r9.A02
            int r1 = r10.size()
            r0 = 4
            if (r1 < r0) goto L_0x041a
            android.view.View r8 = r6.A01
            r17 = 2
            com.facebook.redex.ViewOnClickCListenerShape0S1301000_I1 r11 = new com.facebook.redex.ViewOnClickCListenerShape0S1301000_I1
            r12 = r6
            r13 = r9
            r14 = r2
            r15 = r4
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r8.setOnClickListener(r11)
            android.widget.TextView r1 = r6.A04
            android.view.View r0 = r6.A0H
            android.content.Context r0 = r0.getContext()
            X.013 r2 = r6.A05
            java.lang.String r0 = X.C14740pg.A04(r0, r2)
            r1.setText(r0)
            long r4 = r9.A01
            android.widget.TextView r1 = r6.A03
            java.lang.String r0 = X.AnonymousClass2GQ.A04(r2, r4)
            r1.setText(r0)
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x013f
            r0 = 8
        L_0x013f:
            r8.setVisibility(r0)
            com.obwhatsapp.storage.StorageUsageMediaPreviewView r2 = r6.A08
            int r1 = r9.A00
            java.lang.String r0 = "large_files"
            r2.setPreviewMediaItems(r10, r1, r0)
            r8.setVisibility(r7)
            return
        L_0x014f:
            android.view.View r0 = r6.A00
            r0.setVisibility(r5)
            goto L_0x00fd
        L_0x0155:
            boolean r0 = r6 instanceof X.C64823Ru
            if (r0 == 0) goto L_0x0163
            X.3Ru r6 = (X.C64823Ru) r6
            android.view.View$OnClickListener r1 = r1.A0A
            com.obwhatsapp.WaImageView r0 = r6.A00
            r0.setOnClickListener(r1)
            return
        L_0x0163:
            boolean r0 = r6 instanceof X.AnonymousClass3SB
            if (r0 == 0) goto L_0x0195
            X.3SB r6 = (X.AnonymousClass3SB) r6
            int r8 = r1.A0F()
            android.widget.TextView r7 = r6.A00
            if (r8 != 0) goto L_0x0180
            android.content.Context r1 = r7.getContext()
            r0 = 2131891965(0x7f1216fd, float:1.9418665E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x017c:
            r7.setText(r0)
            return
        L_0x0180:
            X.013 r6 = r6.A01
            r5 = 2131755337(0x7f100149, float:1.914155E38)
            long r3 = (long) r8
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2[r1] = r0
            java.lang.String r0 = r6.A0J(r2, r5, r3)
            goto L_0x017c
        L_0x0195:
            boolean r0 = r6 instanceof X.AnonymousClass3SC
            if (r0 == 0) goto L_0x0066
            X.3SC r6 = (X.AnonymousClass3SC) r6
            X.1cy r3 = r1.A0M
            com.obwhatsapp.settings.SettingsRowIconText r2 = r6.A01
            r1 = 18
            com.facebook.redex.ViewOnClickCListenerShape7S0200000_I1_2 r0 = new com.facebook.redex.ViewOnClickCListenerShape7S0200000_I1_2
            r0.<init>(r6, r1, r3)
            r2.setOnClickListener(r0)
            com.obwhatsapp.WaTextView r1 = r6.A00
            r0 = 3
            r1.setMaxLines(r0)
            return
        L_0x01b0:
            r6.A01 = r4
            r6.A00 = r2
            boolean r0 = r6.A03
            if (r0 == r8) goto L_0x0269
            r6.A03 = r8
            android.animation.AnimatorSet r0 = r6.A02
            if (r0 == 0) goto L_0x01c1
            r0.cancel()
        L_0x01c1:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r6.A02 = r0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            boolean r0 = r6.A03
            r15 = 0
            r14 = 0
            if (r0 == 0) goto L_0x01db
            com.obwhatsapp.WaImageView r0 = r6.A09
            r0.setAlpha(r15)
            r0.setVisibility(r14)
        L_0x01db:
            android.animation.FloatEvaluator r9 = new android.animation.FloatEvaluator
            r9.<init>()
            r13 = 2
            java.lang.Object[] r1 = new java.lang.Object[r13]
            boolean r0 = r6.A03
            r16 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x01eb
            r16 = 0
        L_0x01eb:
            java.lang.Float r16 = java.lang.Float.valueOf(r16)
            r1[r14] = r16
            if (r0 == 0) goto L_0x01f5
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x01f5:
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            r15 = 1
            r1[r15] = r0
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofObject(r9, r1)
            r1 = 27
            com.facebook.redex.IDxUListenerShape140S0100000_2_I0 r0 = new com.facebook.redex.IDxUListenerShape140S0100000_2_I0
            r0.<init>(r6, r1)
            r9.addUpdateListener(r0)
            r10.add(r9)
            android.animation.ArgbEvaluator r9 = new android.animation.ArgbEvaluator
            r9.<init>()
            java.lang.Object[] r1 = new java.lang.Object[r13]
            boolean r13 = r6.A03
            if (r13 == 0) goto L_0x03ab
            int r0 = r6.A05
        L_0x021a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r14] = r0
            if (r13 == 0) goto L_0x03a7
            int r0 = r6.A04
        L_0x0224:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r15] = r0
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofObject(r9, r1)
            r1 = 26
            com.facebook.redex.IDxUListenerShape140S0100000_2_I0 r0 = new com.facebook.redex.IDxUListenerShape140S0100000_2_I0
            r0.<init>(r6, r1)
            r9.addUpdateListener(r0)
            r10.add(r9)
            android.animation.AnimatorSet r9 = r6.A02
            r1 = 25
            com.facebook.redex.IDxLAdapterShape3S0100000_2_I0 r0 = new com.facebook.redex.IDxLAdapterShape3S0100000_2_I0
            r0.<init>(r6, r1)
            r9.addListener(r0)
            android.animation.AnimatorSet r1 = r6.A02
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            android.animation.AnimatorSet r9 = r6.A02
            r0 = 300(0x12c, double:1.48E-321)
            r9.setStartDelay(r0)
            android.animation.AnimatorSet r9 = r6.A02
            r0 = 1000(0x3e8, double:4.94E-321)
            r9.setDuration(r0)
            android.animation.AnimatorSet r0 = r6.A02
            r0.playTogether(r10)
            android.animation.AnimatorSet r0 = r6.A02
            r0.start()
        L_0x0269:
            com.obwhatsapp.storage.SizeTickerView r10 = r6.A0F
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r10.A01 = r1
            r10.A00 = r0
            android.view.View r13 = r6.A0H
            android.content.Context r1 = r13.getContext()
            r0 = 2131101432(0x7f0606f8, float:1.7815274E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r9 = 1
            r10.A0B(r4, r0, r9)
            com.obwhatsapp.WaTextView r10 = r6.A0B
            r1 = 2131755348(0x7f100154, float:1.9141573E38)
            r0 = 0
            java.lang.String r0 = X.AnonymousClass2GQ.A02(r7, r1, r4, r0)
            r10.setText(r0)
            com.obwhatsapp.storage.SizeTickerView r10 = r6.A0E
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r10.A01 = r1
            r10.A00 = r0
            android.content.Context r1 = r13.getContext()
            r0 = 2131101533(0x7f06075d, float:1.7815478E38)
            if (r8 == 0) goto L_0x02a7
            r0 = 2131101535(0x7f06075f, float:1.7815482E38)
        L_0x02a7:
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r10.A0B(r2, r0, r9)
            com.obwhatsapp.WaTextView r1 = r6.A0A
            r0 = 2131755347(0x7f100153, float:1.914157E38)
            r10 = 0
            java.lang.String r0 = X.AnonymousClass2GQ.A02(r7, r0, r2, r10)
            r1.setText(r0)
            float r7 = (float) r4
            float r0 = (float) r11
            float r7 = r7 / r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r1
            float r4 = (float) r2
            float r4 = r4 / r0
            float r4 = r4 * r1
            float r1 = r1 - r4
            float r1 = r1 - r7
            r0 = 0
            r11 = 2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x03bf
            float[] r5 = new float[r11]
            r5[r10] = r7
            r5[r9] = r1
            if (r8 == 0) goto L_0x03a3
            int r7 = r6.A04
        L_0x02d6:
            com.obwhatsapp.components.SegmentedProgressBar r3 = r6.A0C
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r3.A01 = r1
            r3.A00 = r0
            int[] r4 = r6.A0G
            int r0 = r4.length
            if (r11 != r0) goto L_0x03b7
            r2 = 0
            r3.A06 = r10
            r1 = 0
        L_0x02e9:
            float r1 = (float) r1
            r0 = r5[r2]
            float r1 = r1 + r0
            int r1 = (int) r1
            r3.A06 = r1
            int r2 = r2 + 1
            if (r2 < r11) goto L_0x02e9
            if (r1 < 0) goto L_0x03af
            r0 = 100
            if (r1 > r0) goto L_0x03af
            float[] r0 = r3.A0D
            if (r0 == 0) goto L_0x0301
            int r0 = r0.length
            if (r0 == r11) goto L_0x0305
        L_0x0301:
            float[] r0 = new float[r11]
            r3.A0D = r0
        L_0x0305:
            r3.A0E = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.animation.AnimatorSet r0 = r3.A08
            if (r0 == 0) goto L_0x0313
            r0.cancel()
        L_0x0313:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r3.A08 = r0
            r2 = 0
        L_0x031b:
            float[] r8 = r3.A0D
            r1 = r8[r2]
            r0 = r5[r2]
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x033e
            float[] r1 = new float[r11]
            r0 = r8[r2]
            r1[r10] = r0
            r0 = r5[r2]
            r1[r9] = r0
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            com.facebook.redex.IDxUListenerShape10S0101000_2_I0 r0 = new com.facebook.redex.IDxUListenerShape10S0101000_2_I0
            r0.<init>(r3, r2, r11)
            r1.addUpdateListener(r0)
            r4.add(r1)
        L_0x033e:
            int r2 = r2 + 1
            if (r2 < r11) goto L_0x031b
            int r0 = r3.A02
            if (r0 == r7) goto L_0x036c
            android.animation.ArgbEvaluator r2 = new android.animation.ArgbEvaluator
            r2.<init>()
            java.lang.Object[] r1 = new java.lang.Object[r11]
            int r0 = r3.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r9] = r0
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofObject(r2, r1)
            r1 = 11
            com.facebook.redex.IDxUListenerShape140S0100000_2_I0 r0 = new com.facebook.redex.IDxUListenerShape140S0100000_2_I0
            r0.<init>(r3, r1)
            r2.addUpdateListener(r0)
            r4.add(r2)
        L_0x036c:
            android.animation.AnimatorSet r1 = r3.A08
            X.3K8 r0 = new X.3K8
            r0.<init>(r3, r5, r7)
            r1.addListener(r0)
            android.animation.AnimatorSet r1 = r3.A08
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            android.animation.AnimatorSet r2 = r3.A08
            int r0 = r3.A01
            long r0 = (long) r0
            r2.setDuration(r0)
            android.animation.AnimatorSet r2 = r3.A08
            int r0 = r3.A00
            long r0 = (long) r0
            r2.setStartDelay(r0)
            android.animation.AnimatorSet r0 = r3.A08
            r0.playTogether(r4)
            android.animation.AnimatorSet r0 = r3.A08
            r0.start()
            r3.setVisibility(r10)
            android.view.View r0 = r6.A07
            r0.setVisibility(r10)
            return
        L_0x03a3:
            int r7 = r6.A06
            goto L_0x02d6
        L_0x03a7:
            int r0 = r6.A05
            goto L_0x0224
        L_0x03ab:
            int r0 = r6.A04
            goto L_0x021a
        L_0x03af:
            java.lang.String r1 = "Progress sum must be between 0 and 100 inclusive"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03b7:
            java.lang.String r1 = "Lengths of the progressPercentages and progressColors should match"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03bf:
            com.obwhatsapp.components.SegmentedProgressBar r0 = r6.A0C
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r6.A07
            r0.setVisibility(r1)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Float r0 = java.lang.Float.valueOf(r7)
            r1[r10] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            r1[r9] = r0
            java.lang.String r0 = "usedSpacePercentage: %s, freeSpacePercentage: %s"
            java.lang.String r2 = java.lang.String.format(r0, r1)
            X.0so r1 = r6.A08
            java.lang.String r0 = "storage-usage-summary progress percentages sum up above 100"
            r1.AcB(r0, r2, r9)
            return
        L_0x03e9:
            com.obwhatsapp.components.button.ThumbnailButton r1 = r6.A03
            r0 = 0
            r10.A08(r1, r2, r0)
            X.1cU r0 = r6.A02
            if (r9 == 0) goto L_0x0416
            r0.A0D(r2, r3)
        L_0x03f6:
            android.widget.TextView r3 = r6.A00
            X.013 r2 = r6.A06
            X.1Xf r0 = r8.A00
            long r0 = r0.A0G
            java.lang.String r0 = X.AnonymousClass2GQ.A04(r2, r0)
            r3.setText(r0)
            android.view.View r0 = r6.A0H
            r15 = 0
            com.facebook.redex.ViewOnClickCListenerShape0S1301000_I1 r9 = new com.facebook.redex.ViewOnClickCListenerShape0S1301000_I1
            r10 = r6
            r11 = r8
            r12 = r4
            r13 = r7
            r14 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.setOnClickListener(r9)
            return
        L_0x0416:
            r0.A0A(r2)
            goto L_0x03f6
        L_0x041a:
            android.view.View r0 = r6.A01
            r0.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YJ.ANf(X.02k, int):void");
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            C53772gG r1 = this.A03;
            if (r1 != null) {
                return r1;
            }
            C53772gG r12 = new C53772gG(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout059e, viewGroup, false), this.A0C, this.A0I);
            this.A03 = r12;
            return r12;
        } else if (i2 == 2) {
            return new C64653Rd(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout059b, viewGroup, false));
        } else {
            if (i2 == 3) {
                C16490t9 r4 = this.A0K;
                return new C64943Sg(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0595, viewGroup, false), this.A0I, r4);
            } else if (i2 == 4) {
                return new C64823Ru(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0594, viewGroup, false));
            } else {
                if (i2 == 6) {
                    return new AnonymousClass3SB(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0592, viewGroup, false), this.A0I);
                } else if (i2 == 7) {
                    C76243tb r13 = new C76243tb(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout052d, viewGroup, false));
                    r13.A0D(Boolean.TRUE);
                    return r13;
                } else if (i2 == 8) {
                    return new AnonymousClass3SC(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout059d, viewGroup, false));
                } else {
                    if (i2 == 9) {
                        return new AnonymousClass3tK(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout02ac, viewGroup, false));
                    }
                    C16490t9 r7 = this.A0K;
                    return new C64893Sb(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0593, viewGroup, false), this.A0E, this.A0F, this.A0G, this.A0I, r7, this.A0L);
                }
            }
        }
    }

    public int getItemViewType(int i2) {
        int i3 = 0;
        for (Map.Entry entry : this.A0Q.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                if (i3 == i2) {
                    return ((Number) entry.getKey()).intValue();
                }
                i3++;
            }
        }
        if (!this.A07 || this.A08 || ((this.A05.size() != 0 && A0F() <= 0) || i2 != A0C() - 1)) {
            return (!this.A08 || this.A05.size() != 0) ? 5 : 7;
        }
        return 6;
    }
}
