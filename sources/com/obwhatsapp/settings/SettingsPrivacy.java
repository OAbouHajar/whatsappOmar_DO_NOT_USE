package com.obwhatsapp.settings;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass11G;
import X.AnonymousClass11R;
import X.AnonymousClass124;
import X.AnonymousClass138;
import X.AnonymousClass15P;
import X.AnonymousClass175;
import X.AnonymousClass19A;
import X.AnonymousClass271;
import X.AnonymousClass273;
import X.AnonymousClass2BX;
import X.AnonymousClass2Rf;
import X.AnonymousClass2ZA;
import X.AnonymousClass2ZL;
import X.AnonymousClass4F9;
import X.C004601z;
import X.C005402i;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16620tM;
import X.C17140ub;
import X.C17250um;
import X.C18090w8;
import X.C18260wP;
import X.C18290wS;
import X.C18600wx;
import X.C19210xw;
import X.C19430yQ;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C218615s;
import X.C220616m;
import X.C222517f;
import X.C227519d;
import X.C23061Ai;
import X.C23071Aj;
import X.C24541Gi;
import X.C26101Mi;
import X.C26121Mk;
import X.C33481ie;
import X.C40491uD;
import X.C454628s;
import X.C454728t;
import X.C45842Bi;
import X.C49132Rg;
import X.C49282Sg;
import X.C50282Ys;
import X.C74723r0;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxSObserverShape275S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.facebook.redex.ViewOnClickCListenerShape2S0110000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SettingsPrivacy extends C45842Bi implements C49282Sg {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public ProgressBar A0A;
    public ProgressBar A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public SwitchCompat A0L;
    public SwitchCompat A0M;
    public AnonymousClass138 A0N;
    public AnonymousClass01Y A0O;
    public C17140ub A0P;
    public AnonymousClass11R A0Q;
    public C24541Gi A0R;
    public AnonymousClass11G A0S;
    public AnonymousClass19A A0T;
    public C220616m A0U;
    public C18600wx A0V;
    public C26101Mi A0W;
    public C16490t9 A0X;
    public C19430yQ A0Y;
    public C218615s A0Z;
    public C222517f A0a;
    public AnonymousClass124 A0b;
    public AnonymousClass175 A0c;
    public C18090w8 A0d;
    public C18290wS A0e;
    public C19210xw A0f;
    public C50282Ys A0g;
    public C26121Mk A0h;
    public AnonymousClass2ZA A0i;
    public AnonymousClass2ZL A0j;
    public boolean A0k;
    public final Handler A0l;
    public final C33481ie A0m;
    public final C454728t A0n;
    public final AnonymousClass4F9 A0o;
    public final Runnable A0p;
    public final Map A0q;
    public final Set A0r;
    public volatile boolean A0s;

    public SettingsPrivacy() {
        this(0);
        this.A0m = new IDxCObserverShape68S0100000_2_I0(this, 30);
        this.A0l = new Handler(Looper.getMainLooper());
        this.A0p = new RunnableRunnableShape14S0100000_I0_13((Object) this, 33);
        this.A0n = new IDxSObserverShape275S0100000_2_I0(this, 5);
        this.A0o = new AnonymousClass4F9(this);
        this.A0q = new HashMap();
        this.A0r = new HashSet();
        this.A0s = false;
    }

    public SettingsPrivacy(int i2) {
        this.A0k = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 89));
    }

    public void A1q() {
        if (!this.A0k) {
            this.A0k = true;
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
            this.A0X = (C16490t9) r1.AQz.get();
            this.A0b = (AnonymousClass124) r1.ALe.get();
            this.A0S = (AnonymousClass11G) r1.ANN.get();
            this.A0a = (C222517f) r1.AKh.get();
            this.A0e = (C18290wS) r1.AIB.get();
            this.A0O = (AnonymousClass01Y) r1.A1w.get();
            this.A0P = (C17140ub) r1.A4y.get();
            this.A0f = (C19210xw) r1.AG2.get();
            this.A0Z = (C218615s) r1.AIo.get();
            this.A0c = (AnonymousClass175) r1.AH5.get();
            this.A0g = r2.A0Z();
            this.A0d = (C18090w8) r1.AI6.get();
            this.A0N = (AnonymousClass138) r1.AJG.get();
            this.A0Y = (C19430yQ) r1.ADa.get();
            this.A0R = (C24541Gi) r1.AIp.get();
            this.A0U = (C220616m) r1.A76.get();
            this.A0h = (C26121Mk) r1.ABJ.get();
            this.A0i = r2.A0a();
            this.A0W = (C26101Mi) r1.AQU.get();
            this.A0j = r2.A0b();
            this.A0Q = (AnonymousClass11R) r1.A4a.get();
            this.A0T = (AnonymousClass19A) r1.APR.get();
            this.A0V = (C18600wx) r1.A78.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r1 = ((android.content.SharedPreferences) r2.A01.get()).getInt(r1, 0);
        r0 = (X.AnonymousClass272) r3.A0N.A05.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r0 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r1 = X.AnonymousClass271.A00(r0.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        return java.lang.Math.max(0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = new java.lang.StringBuilder("Unrecognized category: ");
        r0.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A35(java.lang.String r4) {
        /*
            r3 = this;
            X.0rz r2 = r3.A09
            int r0 = r4.hashCode()
            switch(r0) {
                case -1012222381: goto L_0x001d;
                case -892481550: goto L_0x0028;
                case -309425751: goto L_0x0034;
                case 3314326: goto L_0x003f;
                case 506363330: goto L_0x004a;
                case 1974548689: goto L_0x0055;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r1 = "Unrecognized category: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x001d:
            java.lang.String r0 = "online"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "privacy_online"
            goto L_0x005f
        L_0x0028:
            java.lang.String r0 = "status"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "privacy_status"
            goto L_0x005f
        L_0x0034:
            java.lang.String r0 = "profile"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "privacy_profile_photo"
            goto L_0x005f
        L_0x003f:
            java.lang.String r0 = "last"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "privacy_last_seen"
            goto L_0x005f
        L_0x004a:
            java.lang.String r0 = "groupadd"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "privacy_groupadd"
            goto L_0x005f
        L_0x0055:
            java.lang.String r0 = "readreceipts"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "read_receipts_enabled"
        L_0x005f:
            X.01D r0 = r2.A01
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            r2 = 0
            int r1 = r0.getInt(r1, r2)
            X.138 r0 = r3.A0N
            java.util.HashMap r0 = r0.A05
            java.lang.Object r0 = r0.get(r4)
            X.272 r0 = (X.AnonymousClass272) r0
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r0.A00
            int r1 = X.AnonymousClass271.A00(r0)
        L_0x007e:
            int r0 = java.lang.Math.max(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.SettingsPrivacy.A35(java.lang.String):int");
    }

    public final TextView A36(String str) {
        switch (str.hashCode()) {
            case -892481550:
                if (str.equals("status")) {
                    return this.A0D;
                }
                return null;
            case -309425751:
                if (str.equals("profile")) {
                    return this.A0J;
                }
                return null;
            case 3314326:
                if (str.equals("last")) {
                    return this.A0H;
                }
                return null;
            case 506363330:
                if (str.equals("groupadd")) {
                    return this.A0G;
                }
                return null;
            default:
                return null;
        }
    }

    public final String A37(long j2) {
        AnonymousClass013 r5;
        int i2;
        long j3;
        Object[] objArr;
        int i3;
        if (j2 != 0) {
            if (j2 == 60000) {
                r5 = this.A01;
                i2 = R.plurals.plurals0003;
                j3 = 1;
                objArr = new Object[1];
                i3 = 1;
            } else if (j2 == 1800000) {
                r5 = this.A01;
                i2 = R.plurals.plurals0003;
                j3 = 30;
                objArr = new Object[1];
                i3 = 30;
            }
            objArr[0] = i3;
            return r5.A0J(objArr, i2, j3);
        }
        return getString(R.string.str00f1);
    }

    public final void A38() {
        String str;
        int i2;
        boolean z2;
        C227519d AB4;
        if (this.A0O.A0Q()) {
            AnonymousClass01Y r1 = this.A0O;
            synchronized (r1) {
                z2 = r1.A01;
            }
            if (z2) {
                int size = this.A0r.size();
                if (this.A0d.A09() && this.A0c.A0E() && (AB4 = this.A0e.A03().AB4()) != null && AB4.AIp()) {
                    size += AB4.size();
                }
                if (size > 0) {
                    str = String.valueOf(size);
                    this.A0F.setText(str);
                }
                i2 = R.string.str0e16;
                str = getString(i2);
                this.A0F.setText(str);
            }
        }
        i2 = R.string.str0233;
        str = getString(i2);
        this.A0F.setText(str);
    }

    public final void A39() {
        ArrayList arrayList;
        String string;
        C19430yQ r9 = this.A0Y;
        synchronized (r9.A0S) {
            Map A0A2 = r9.A0A();
            arrayList = new ArrayList(A0A2.size());
            long A002 = r9.A0G.A00();
            for (C454628s r5 : A0A2.values()) {
                if (C19430yQ.A01(r5.A01, A002)) {
                    C16000sG r3 = r9.A0C;
                    C15830rv r0 = r5.A02.A00;
                    AnonymousClass00B.A06(r0);
                    arrayList.add(r3.A08(r0));
                }
            }
        }
        if (arrayList.size() > 0) {
            AnonymousClass013 r6 = this.A01;
            long size = (long) arrayList.size();
            string = r6.A0J(new Object[]{Integer.valueOf(arrayList.size())}, R.plurals.plurals00c9, size);
        } else {
            string = getString(R.string.str0c67);
        }
        TextView textView = this.A0I;
        if (textView != null) {
            textView.setText(string);
        }
    }

    public final void A3A() {
        A3B();
        A3D("groupadd");
        A3D("last");
        A3D("status");
        A3D("profile");
        A3H(this.A09.A1i());
        if (this.A0C.A0E(C16620tM.A02, 1972)) {
            A3I(((SharedPreferences) this.A09.A01.get()).getBoolean("privacy_calladd", false), true);
        }
    }

    public final void A3B() {
        int i2;
        String string;
        int size;
        AnonymousClass013 r5;
        int i3;
        int A022 = this.A0S.A02();
        if (A022 != 0) {
            if (A022 == 1) {
                size = this.A0S.A08().size();
                if (size == 0) {
                    i2 = R.string.str0de9;
                    string = getString(i2);
                    this.A0K.setText(string);
                }
                r5 = this.A01;
                i3 = R.plurals.plurals0142;
            } else if (A022 == 2) {
                size = this.A0S.A09().size();
                if (size != 0) {
                    r5 = this.A01;
                    i3 = R.plurals.plurals0141;
                }
            } else {
                throw new IllegalStateException("unknown status distribution mode");
            }
            Object[] objArr = {Integer.valueOf(size)};
            string = r5.A0J(objArr, i3, (long) size);
            this.A0K.setText(string);
        }
        i2 = R.string.str12f7;
        string = getString(i2);
        this.A0K.setText(string);
    }

    public final void A3C(Integer num, Integer num2) {
        C74723r0 r1 = new C74723r0();
        r1.A00 = num2;
        r1.A01 = num;
        this.A0X.A04(r1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3D(java.lang.String r5) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.A36(r5)
            if (r0 == 0) goto L_0x0029
            int r0 = r5.hashCode()
            switch(r0) {
                case -892481550: goto L_0x004b;
                case -309425751: goto L_0x0040;
                case 3314326: goto L_0x0035;
                case 506363330: goto L_0x002a;
                default: goto L_0x000d;
            }
        L_0x000d:
            r1 = 0
        L_0x000e:
            int r3 = r4.A35(r5)
            r0 = 3
            if (r3 != r0) goto L_0x0057
            if (r1 == 0) goto L_0x0057
            X.3yr r3 = new X.3yr
            r3.<init>(r4, r1, r4, r5)
            X.1cy r2 = r1.A00()
            r1 = 4
            com.facebook.redex.IDxObserverShape24S0300000_2_I0 r0 = new com.facebook.redex.IDxObserverShape24S0300000_2_I0
            r0.<init>(r3, r4, r2, r1)
            r2.A0A(r4, r0)
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r0 = "groupadd"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.1Mk r1 = r4.A0h
            goto L_0x000e
        L_0x0035:
            java.lang.String r0 = "last"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.2ZA r1 = r4.A0i
            goto L_0x000e
        L_0x0040:
            java.lang.String r0 = "profile"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.2ZL r1 = r4.A0j
            goto L_0x000e
        L_0x004b:
            java.lang.String r0 = "status"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.2Ys r1 = r4.A0g
            goto L_0x000e
        L_0x0057:
            int[] r2 = X.AnonymousClass271.A00
            int r0 = r2.length
            if (r3 < r0) goto L_0x0073
            java.lang.String r0 = "Received privacy value "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " with no available single-setting text"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r3 = 0
        L_0x0073:
            r0 = r2[r3]
            java.lang.String r0 = r4.getString(r0)
            r4.A3F(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.SettingsPrivacy.A3D(java.lang.String):void");
    }

    public final void A3E(String str, int i2) {
        if (!this.A07.A0A()) {
            this.A05.A09(R.string.str0474, 0);
            return;
        }
        String A022 = AnonymousClass271.A02(str);
        A3G(A022, AnonymousClass271.A01(Math.max(0, i2), A022));
        A3D(A022);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3F(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            android.widget.TextView r4 = r5.A36(r6)
            if (r4 != 0) goto L_0x001d
            java.lang.String r0 = "Tried to put text for privacy category "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " with no subtitle text view"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x001d:
            java.util.Map r0 = r5.A0q
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0054
            int r2 = r5.A35(r0)
            if (r2 < 0) goto L_0x0052
            int[] r1 = X.AnonymousClass271.A00
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0052
            r0 = r1[r2]
            java.lang.String r3 = r5.getString(r0)
        L_0x0038:
            boolean r0 = r7.equals(r3)
            if (r0 != 0) goto L_0x0054
            r2 = 2131891624(0x7f1215a8, float:1.9417973E38)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r7
            r0 = 1
            r1[r0] = r3
            java.lang.String r0 = r5.getString(r2, r1)
            r4.setText(r0)
            return
        L_0x0052:
            r3 = r7
            goto L_0x0038
        L_0x0054:
            r4.setText(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.SettingsPrivacy.A3F(java.lang.String, java.lang.String):void");
    }

    public final void A3G(String str, String str2) {
        this.A0f.A01(true);
        this.A0N.A01(str, str2);
        Handler handler = this.A0l;
        Runnable runnable = this.A0p;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 20000);
    }

    public final void A3H(boolean z2) {
        Object obj = this.A0N.A05.get(AnonymousClass271.A02("read_receipts_enabled"));
        View view = this.A05;
        int i2 = 0;
        boolean z3 = false;
        if (obj == null) {
            z3 = true;
        }
        view.setEnabled(z3);
        ProgressBar progressBar = this.A0A;
        int i3 = 8;
        if (obj != null) {
            i3 = 0;
        }
        progressBar.setVisibility(i3);
        SwitchCompat switchCompat = this.A0L;
        if (obj != null) {
            i2 = 8;
        }
        switchCompat.setVisibility(i2);
        this.A0L.setChecked(z2);
        this.A09.A0K().putBoolean("read_receipts_enabled", z2).apply();
    }

    public final void A3I(boolean z2, boolean z3) {
        Object obj = this.A0N.A05.get(AnonymousClass271.A02("privacy_calladd"));
        View view = this.A09;
        int i2 = 0;
        boolean z4 = false;
        if (obj == null) {
            z4 = true;
        }
        view.setEnabled(z4);
        ProgressBar progressBar = this.A0B;
        int i3 = 8;
        if (obj != null) {
            i3 = 0;
        }
        progressBar.setVisibility(i3);
        SwitchCompat switchCompat = this.A0M;
        if (obj != null) {
            i2 = 8;
        }
        switchCompat.setVisibility(i2);
        if (z3) {
            this.A0M.setChecked(z2);
        }
    }

    public void AXH(int i2, int i3) {
        String str;
        if (i2 == 2) {
            str = "privacy_profile_photo";
        } else if (i2 == 3) {
            str = "privacy_status";
        } else {
            return;
        }
        A3E(str, i3);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4;
        String str;
        String str2;
        super.onActivityResult(i2, i3, intent);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    finish();
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5 && i3 == -1 && intent != null) {
                            i4 = intent.getIntExtra("about", 0);
                            if (i4 == 3) {
                                str2 = "status";
                                A3D(str2);
                                return;
                            }
                            str = "privacy_status";
                            A3E(str, i4);
                            return;
                        }
                        return;
                    } else if (i3 == -1 && intent != null) {
                        i4 = intent.getIntExtra("profile_photo", 0);
                        if (i4 == 3) {
                            str2 = "profile";
                            A3D(str2);
                            return;
                        }
                        str = "privacy_profile_photo";
                        A3E(str, i4);
                        return;
                    } else {
                        return;
                    }
                } else if (i3 == -1 && intent != null) {
                    if (intent.hasExtra("online")) {
                        A3E("privacy_online", intent.getIntExtra("online", 0));
                    }
                    i4 = intent.getIntExtra("last_seen", 0);
                    if (i4 == 3) {
                        str2 = "last";
                        A3D(str2);
                        return;
                    }
                    str = "privacy_last_seen";
                    A3E(str, i4);
                    return;
                } else {
                    return;
                }
            }
            if (i3 == -1 && intent != null) {
                str2 = "groupadd";
                i4 = intent.getIntExtra(str2, 0);
                if (i4 != 3) {
                    str = "privacy_groupadd";
                    A3E(str, i4);
                    return;
                }
                A3D(str2);
                return;
            }
            return;
        }
        A3B();
    }

    public void onCreate(Bundle bundle) {
        int i2;
        int i3;
        super.onCreate(bundle);
        setTitle(R.string.str15a1);
        setContentView((int) R.layout.layout04cb);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        this.A0N.A00 = this.A0o;
        View A052 = AnonymousClass00T.A05(this, R.id.last_seen_privacy_preference);
        this.A02 = A052;
        ((TextView) C004601z.A0E(A052, R.id.settings_privacy_row_text)).setText(getString(R.string.str15d7));
        this.A0H = (TextView) C004601z.A0E(this.A02, R.id.settings_privacy_row_subtext);
        this.A0q.put("last", "online");
        View A053 = AnonymousClass00T.A05(this, R.id.profile_photo_privacy_preference);
        this.A03 = A053;
        ((TextView) C004601z.A0E(A053, R.id.settings_privacy_row_text)).setText(getString(R.string.str15b0));
        this.A0J = (TextView) C004601z.A0E(this.A03, R.id.settings_privacy_row_subtext);
        View A054 = AnonymousClass00T.A05(this, R.id.about_privacy_preference);
        this.A00 = A054;
        ((TextView) C004601z.A0E(A054, R.id.settings_privacy_row_text)).setText(getString(R.string.str15ae));
        this.A0D = (TextView) C004601z.A0E(this.A00, R.id.settings_privacy_row_subtext);
        View A055 = AnonymousClass00T.A05(this, R.id.status_privacy_preference);
        this.A07 = A055;
        ((TextView) C004601z.A0E(A055, R.id.settings_privacy_row_text)).setText(getString(R.string.str15b5));
        this.A0K = (TextView) C004601z.A0E(this.A07, R.id.settings_privacy_row_subtext);
        if (this.A01.A0G()) {
            this.A07.setVisibility(8);
        }
        View A056 = AnonymousClass00T.A05(this, R.id.live_location_privacy_preference);
        ((TextView) C004601z.A0E(A056, R.id.settings_privacy_row_text)).setText(getString(R.string.str15af));
        this.A0I = (TextView) C004601z.A0E(A056, R.id.settings_privacy_row_subtext);
        int i4 = 0;
        if (this.A01.A0G()) {
            i4 = 8;
        }
        A056.setVisibility(i4);
        View A057 = AnonymousClass00T.A05(this, R.id.dm_privacy_preference_container);
        this.A0C = (TextView) C004601z.A0E(A057, R.id.dm_privacy_preference_value);
        int i5 = 8;
        if (AnonymousClass2BX.A01(this.A01, this.A0Q)) {
            i5 = 0;
        }
        A057.setVisibility(i5);
        View A058 = AnonymousClass00T.A05(this, R.id.group_add_permission_privacy_preference);
        this.A01 = A058;
        ((TextView) C004601z.A0E(A058, R.id.settings_privacy_row_text)).setText(getString(R.string.str15ab));
        this.A0G = (TextView) C004601z.A0E(this.A01, R.id.settings_privacy_row_subtext);
        View A059 = AnonymousClass00T.A05(this, R.id.block_list_privacy_preference);
        ((TextView) C004601z.A0E(A059, R.id.settings_privacy_row_text)).setText(getString(R.string.str0233));
        this.A0F = (TextView) C004601z.A0E(A059, R.id.settings_privacy_row_subtext);
        this.A05.Acl(new RunnableRunnableShape14S0100000_I0_13((Object) this, 32));
        this.A05 = AnonymousClass00T.A05(this, R.id.read_receipts_privacy_preference);
        this.A0L = (SwitchCompat) AnonymousClass00T.A05(this, R.id.read_receipts_privacy_switch);
        this.A0A = (ProgressBar) AnonymousClass00T.A05(this, R.id.read_receipts_progress_bar);
        this.A04 = AnonymousClass00T.A05(this, R.id.read_receipts_divider);
        View A0510 = AnonymousClass00T.A05(this, R.id.security_privacy_preference);
        this.A06 = A0510;
        int i6 = R.string.str15b4;
        ((TextView) C004601z.A0E(A0510, R.id.settings_privacy_row_text)).setText(getString(R.string.str15b4));
        TextView textView = (TextView) C004601z.A0E(this.A06, R.id.settings_privacy_row_subtext);
        C14710pd r1 = this.A03.A04;
        C16620tM r2 = C16620tM.A02;
        if (r1.A0E(r2, 266)) {
            i6 = R.string.str15b3;
        }
        textView.setText(i6);
        this.A0E = (TextView) C004601z.A0E(this.A06, R.id.settings_privacy_row_subtext);
        this.A09 = AnonymousClass00T.A05(this, R.id.suc_preference);
        this.A0M = (SwitchCompat) AnonymousClass00T.A05(this, R.id.suc_switch);
        this.A0B = (ProgressBar) AnonymousClass00T.A05(this, R.id.suc_progress_bar);
        this.A08 = AnonymousClass00T.A05(this, R.id.suc_divider);
        if (this.A0C.A0E(r2, 1972)) {
            this.A09.setVisibility(0);
            this.A08.setVisibility(0);
            this.A04.setVisibility(8);
            this.A09.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 1));
        }
        A3A();
        this.A02.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 47));
        this.A03.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 48));
        this.A00.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 2));
        this.A07.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 3));
        A056.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 44));
        this.A01.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 45));
        if (AnonymousClass2BX.A01(this.A01, this.A0Q)) {
            boolean A002 = this.A0W.A00();
            A057.setVisibility(0);
            A057.setOnClickListener(new ViewOnClickCListenerShape2S0110000_I0(this, 1, A002));
            this.A0C.setText(C40491uD.A03(this, this.A0V.A04().intValue(), false, true));
            this.A0U.A04.A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 284));
            View A0E2 = C004601z.A0E(A057, R.id.dm_privacy_preference_header);
            TextView textView2 = (TextView) C004601z.A0E(A057, R.id.dm_privacy_preference_title);
            TextView textView3 = (TextView) C004601z.A0E(A057, R.id.dm_privacy_preference_subtitle);
            View A0511 = AnonymousClass00T.A05(this, R.id.dm_privacy_divider);
            if (A002) {
                A0E2.setVisibility(8);
                i2 = R.string.str071f;
                i3 = R.string.str1c71;
                this.A0C.setVisibility(8);
                A0511.setVisibility(8);
            } else {
                A0E2.setVisibility(0);
                i2 = R.string.str071e;
                this.A0C.setVisibility(0);
                A0511.setVisibility(0);
                i3 = R.string.str071d;
            }
            textView2.setText(getString(i2));
            textView3.setText(getString(i3));
        }
        A059.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 46));
        this.A05.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 0));
        this.A0N.A00((AnonymousClass273) null);
        this.A0U.A00();
        this.A0P.A02(this.A0m);
        this.A0Y.A0U(this.A0n);
        String stringExtra = getIntent().getStringExtra("target_setting");
        if (stringExtra != null && stringExtra.equals("privacy_groupadd")) {
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.obwhatsapp.group.GroupAddPrivacyActivity");
            startActivityForResult(intent, 2);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C19430yQ r0 = this.A0Y;
        r0.A0W.remove(this.A0n);
        this.A0P.A03(this.A0m);
        this.A0l.removeCallbacks(this.A0p);
        this.A0N.A00 = null;
    }

    public void onResume() {
        super.onResume();
        if (!this.A0s) {
            A38();
        }
        A39();
        boolean A052 = this.A03.A05();
        View view = this.A06;
        if (A052) {
            view.setVisibility(0);
            this.A0E.setText(this.A09.A1h() ? A37(((SharedPreferences) this.A09.A01.get()).getLong("privacy_fingerprint_timeout", 60000)) : getString(R.string.str00f0));
            this.A06.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 49));
            return;
        }
        view.setVisibility(8);
    }
}
