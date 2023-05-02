package com.obwhatsapp.registration;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass10J;
import X.AnonymousClass12L;
import X.AnonymousClass130;
import X.AnonymousClass15P;
import X.AnonymousClass15W;
import X.AnonymousClass1BN;
import X.AnonymousClass1BZ;
import X.AnonymousClass1G1;
import X.AnonymousClass1H9;
import X.AnonymousClass1KO;
import X.AnonymousClass1KP;
import X.AnonymousClass1KQ;
import X.AnonymousClass1NE;
import X.AnonymousClass1UW;
import X.AnonymousClass29T;
import X.AnonymousClass2FP;
import X.AnonymousClass2FQ;
import X.AnonymousClass2JN;
import X.AnonymousClass2Rf;
import X.AnonymousClass36V;
import X.AnonymousClass374;
import X.AnonymousClass37B;
import X.AnonymousClass39H;
import X.AnonymousClass3AS;
import X.AnonymousClass427;
import X.AnonymousClass47O;
import X.AnonymousClass47P;
import X.AnonymousClass4XR;
import X.AnonymousClass55x;
import X.C005702l;
import X.C06490Wi;
import X.C1033551b;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16980tz;
import X.C17020u3;
import X.C17130ua;
import X.C17220uj;
import X.C17250um;
import X.C18000vz;
import X.C18260wP;
import X.C18890xQ;
import X.C18900xR;
import X.C18990xa;
import X.C19060xh;
import X.C19380yL;
import X.C19490yW;
import X.C19760yx;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C26071Mf;
import X.C26831Pk;
import X.C26841Pl;
import X.C26851Pm;
import X.C28961Zl;
import X.C31631em;
import X.C31641en;
import X.C35061lJ;
import X.C47042Hg;
import X.C47052Hh;
import X.C47062Hi;
import X.C49132Rg;
import X.C50762aP;
import X.C56242n9;
import X.C56252nA;
import X.C56402na;
import X.C56412nb;
import X.C615639k;
import X.C63903Ly;
import X.C82714Dw;
import X.C86194Rq;
import X.C87424Ws;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCObserverShape305S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0100200_I0;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.registration.report.BanReportViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public class VerifyPhoneNumber extends C14530pL implements AnonymousClass2FP, AnonymousClass2FQ {
    public static int A1T = 6;
    public static int A1U = 6;
    public static int A1V;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public ProgressDialog A0E;
    public CountDownTimer A0F;
    public CountDownTimer A0G;
    public CountDownTimer A0H;
    public CountDownTimer A0I;
    public CountDownTimer A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public ViewStub A0P;
    public ImageButton A0Q;
    public ProgressBar A0R;
    public RelativeLayout A0S;
    public TextView A0T;
    public C005702l A0U;
    public CodeInputField A0V;
    public AnonymousClass1G1 A0W;
    public C50762aP A0X;
    public C18900xR A0Y;
    public AnonymousClass1KO A0Z;
    public C17130ua A0a;
    public TextEmojiLabel A0b;
    public C18890xQ A0c;
    public WaTextView A0d;
    public C82714Dw A0e;
    public AnonymousClass1BZ A0f;
    public AnonymousClass1H9 A0g;
    public C16980tz A0h;
    public C19380yL A0i;
    public C16260sj A0j;
    public AnonymousClass1KQ A0k;
    public AnonymousClass10J A0l;
    public C19060xh A0m;
    public AnonymousClass15W A0n;
    public C17020u3 A0o;
    public AnonymousClass3AS A0p;
    public AnonymousClass1NE A0q;
    public C86194Rq A0r;
    public C86194Rq A0s;
    public C86194Rq A0t;
    public C615639k A0u;
    public C26851Pm A0v;
    public C18990xa A0w;
    public C87424Ws A0x;
    public C56242n9 A0y;
    public AnonymousClass39H A0z;
    public AnonymousClass1KP A10;
    public C19760yx A11;
    public C63903Ly A12;
    public C56252nA A13;
    public AnonymousClass12L A14;
    public AnonymousClass4XR A15;
    public C47062Hi A16;
    public AnonymousClass1BN A17;
    public BanReportViewModel A18;
    public AnonymousClass130 A19;
    public C17220uj A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public final C26071Mf A1R;
    public final C18000vz A1S;

    public VerifyPhoneNumber() {
        this(0);
        this.A00 = 0;
        this.A1J = false;
        this.A0A = 0;
        this.A09 = -1;
        this.A1R = C26071Mf.A00();
        this.A1S = new IDxCObserverShape305S0100000_2_I0(this, 1);
        this.A04 = -2;
    }

    public VerifyPhoneNumber(int i2) {
        this.A1I = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 80));
    }

    public static String A02(Intent intent) {
        Uri data;
        String str = null;
        if ("whatsapp".equals(intent.getScheme())) {
            Uri data2 = intent.getData();
            if (data2 != null && "r".equals(data2.getHost())) {
                str = data2.getQueryParameter("c");
            }
            return str;
        }
        if (("http".equals(intent.getScheme()) || "https".equals(intent.getScheme())) && (data = intent.getData()) != null && "v.whatsapp.com".equals(data.getHost())) {
            String path = data.getPath();
            str = path.substring(path.lastIndexOf("/") + 1);
        }
        return str;
        StringBuilder sb = new StringBuilder();
        sb.append("verifyphonenumber/codefromverificationlink/code/");
        sb.append(str);
        Log.i(sb.toString());
        return str;
    }

    public static String A03(Resources resources, AnonymousClass013 r8, AnonymousClass4XR r9) {
        long A012 = r9.A01();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = -1;
        if (A012 != -1) {
            j2 = A012 - currentTimeMillis;
        }
        StringBuilder sb = new StringBuilder("verifyphonenumber/voice-retry-time/diff/");
        sb.append(j2);
        Log.i(sb.toString());
        if (j2 > 0) {
            return resources.getString(R.string.str1397, new Object[]{resources.getString(R.string.str19a9), C28961Zl.A08(r8, j2)});
        }
        return resources.getString(R.string.str1396, new Object[]{resources.getString(R.string.str19a9)});
    }

    public static String A09(Resources resources, AnonymousClass013 r8, AnonymousClass4XR r9) {
        long A012 = r9.A01();
        long j2 = -1;
        if (A012 != -1) {
            j2 = A012 - System.currentTimeMillis();
        }
        StringBuilder sb = new StringBuilder("verifyphonenumber/voice-retry-time/diff/");
        sb.append(j2);
        Log.i(sb.toString());
        if (j2 > 0) {
            return resources.getString(R.string.str1399, new Object[]{resources.getString(R.string.str19a9), C28961Zl.A08(r8, j2)});
        }
        return resources.getString(R.string.str1398, new Object[]{resources.getString(R.string.str19a9)});
    }

    public void A1q() {
        if (!this.A1I) {
            this.A1I = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r4 = r1.A1s;
            this.A05 = (C16320sq) r4.ARB.get();
            this.A0C = (C14710pd) r4.A05.get();
            AnonymousClass01J r2 = r4.AB3;
            this.A05 = (C14870pt) r2.get();
            this.A03 = (C16300so) r4.A5p.get();
            this.A04 = (C16180sb) r4.A8b.get();
            this.A0B = (C17250um) r4.A7e.get();
            this.A06 = (C15900s5) r4.ALm.get();
            this.A08 = (AnonymousClass01V) r4.AOi.get();
            this.A0D = (C19950zG) r4.AQV.get();
            this.A09 = (C15860rz) r4.AQh.get();
            this.A07 = (C18260wP) r4.A4p.get();
            this.A0A = (C16290sm) r4.AQk.get();
            AnonymousClass01J r3 = r4.AP2;
            this.A05 = (C16440t3) r3.get();
            this.A0B = (C23061Ai) r4.AC0.get();
            this.A01 = (C16040sK) r4.ADr.get();
            this.A04 = (C16190sc) r4.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r4.ANy.get();
            this.A00 = (C19980zJ) r4.A0P.get();
            this.A02 = (C23071Aj) r4.AQb.get();
            this.A03 = (AnonymousClass15P) r4.A0b.get();
            this.A0A = (C19490yW) r4.ALQ.get();
            this.A09 = (C15960sC) r4.AKz.get();
            this.A07 = C16150sX.A0d(r4);
            this.A0h = (C16980tz) r4.AQB.get();
            this.A0c = (C18890xQ) r4.APS.get();
            this.A0Y = (C18900xR) r4.ALD.get();
            this.A0a = (C17130ua) r4.AN9.get();
            this.A17 = (AnonymousClass1BN) r4.AAp.get();
            this.A0w = (C18990xa) r4.ADh.get();
            this.A0Z = (AnonymousClass1KO) r4.ALY.get();
            this.A0m = (C19060xh) r4.A01.get();
            this.A1A = (C17220uj) r4.A9x.get();
            this.A0l = (AnonymousClass10J) r4.A02.get();
            this.A0W = (AnonymousClass1G1) r4.AJl.get();
            this.A0v = (C26851Pm) r4.AAg.get();
            this.A0g = (AnonymousClass1H9) r4.AOj.get();
            this.A0n = (AnonymousClass15W) r4.AOC.get();
            this.A0X = (C50762aP) r1.A0j.get();
            this.A0k = (AnonymousClass1KQ) r4.AAL.get();
            this.A11 = (C19760yx) r4.AKx.get();
            this.A0j = (C16260sj) r4.AQe.get();
            this.A14 = (AnonymousClass12L) r4.APo.get();
            this.A0i = (C19380yL) r4.AQd.get();
            this.A0f = (AnonymousClass1BZ) r4.A5N.get();
            this.A0e = new C82714Dw((AnonymousClass1NE) r4.A0y.get());
            this.A19 = (AnonymousClass130) r4.AMn.get();
            this.A0o = (C17020u3) r4.AMG.get();
            this.A10 = (AnonymousClass1KP) r4.AKw.get();
            this.A0p = new AnonymousClass3AS((C14870pt) r2.get(), (C16440t3) r3.get(), (C26841Pl) r4.A0G.get());
        }
    }

    public int A35() {
        int i2 = this.A02;
        if (i2 == 3) {
            return 9;
        }
        if (i2 != 2) {
            return i2 == 1 ? 13 : 4;
        }
        return 14;
    }

    public final CountDownTimer A36(int i2, long j2, boolean z2) {
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/getRequestCodeCountdownTimer/buttonType=");
        sb.append(i2);
        Log.i(sb.toString());
        return new C56412nb(this, i2, j2, z2);
    }

    public String A37() {
        int i2;
        Object[] objArr;
        long A002 = this.A15.A00();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = -1;
        if (A002 != -1) {
            j2 = A002 - currentTimeMillis;
        }
        StringBuilder sb = new StringBuilder("verifyphonenumber/sms-retry-time/diff/");
        sb.append(j2);
        Log.i(sb.toString());
        if (A002 > currentTimeMillis) {
            i2 = R.string.str139d;
            objArr = new Object[]{A39(), C28961Zl.A08(this.A01, j2)};
        } else {
            i2 = R.string.str139c;
            objArr = new Object[]{A39()};
        }
        return getString(i2, objArr);
    }

    public final String A38() {
        return A48() ? "verify_wa_old" : AnonymousClass3AS.A00(A35()) ? "verify_second_sms" : "verify_sms";
    }

    public final String A39() {
        return getString((A48() || (AnonymousClass3AS.A00(this.A09.A00()) && !this.A1J)) ? R.string.str19a0 : R.string.str199e);
    }

    public final String A3A() {
        int i2;
        Object[] objArr;
        long A002 = this.A15.A00();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = -1;
        if (A002 != -1) {
            j2 = A002 - currentTimeMillis;
        }
        StringBuilder sb = new StringBuilder("verifyphonenumber/sms-retry-time/diff/");
        sb.append(j2);
        Log.i(sb.toString());
        if (j2 > 0) {
            i2 = R.string.str139b;
            objArr = new Object[]{A39(), C28961Zl.A08(this.A01, j2)};
        } else {
            i2 = R.string.str139a;
            objArr = new Object[]{A39()};
        }
        return getString(i2, objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3B() {
        /*
            r5 = this;
            int r0 = r5.A35()
            boolean r0 = X.AnonymousClass3AS.A00(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 2
            r5.A3R(r0)
        L_0x000e:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 23
            if (r2 >= r0) goto L_0x006a
            java.lang.String r1 = "verifyphonenumber/is-eligible-for-flash-call-as-secondary-registration/api="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L_0x0024:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0027:
            java.lang.String r2 = "/number="
            if (r4 == 0) goto L_0x00c0
            java.lang.String r0 = "VerifyPhoneNumber/request-secondary-flash-call/cc="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.A1C
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r5.A1D
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r1 = r5.A09
            java.lang.String r0 = "secondary_eligible"
            r1.A0w(r0)
            X.0rz r0 = r5.A09
            r2 = 0
            X.01D r0 = r0.A01
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "is_first_flash_call_request"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            r5.A45(r2)
            return
        L_0x006a:
            X.01V r0 = r5.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            if (r0 == 0) goto L_0x007d
            int r1 = r0.getSimState()
            r0 = 1
            if (r1 != r0) goto L_0x007d
            java.lang.String r0 = "verifyphonenumber/is-eligible-for-flash-call-as-secondary-registration/sim absent"
            goto L_0x0024
        L_0x007d:
            X.0rz r0 = r5.A09
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "is_first_flash_call_request"
            r0 = 1
            boolean r3 = r2.getBoolean(r1, r0)
            X.0rz r0 = r5.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "flash_call_eligible"
            int r2 = r1.getInt(r0, r4)
            java.lang.String r0 = "verifyphonenumber/is-eligible-for-flash-call-as-secondary-registration/isFirstSecondaryFlashCallRequest="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = "/flashCallEligible="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            if (r3 == 0) goto L_0x0027
            if (r2 != r0) goto L_0x0027
            r4 = 1
            goto L_0x0027
        L_0x00c0:
            java.lang.String r0 = "VerifyPhoneNumber/request-voice-call/cc="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.A1C
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r5.A1D
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r0 = r5.A09
            int r0 = r0.A0E()
            X.2Hg r3 = new X.2Hg
            r3.<init>(r0)
            X.01V r0 = r5.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            r2 = 0
            if (r0 == 0) goto L_0x00f7
            int r1 = r0.getSimState()
            r0 = 1
            if (r1 != r0) goto L_0x00f7
            r2 = 1
        L_0x00f7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A01 = r0
            X.0rz r0 = r5.A09
            boolean r0 = r0.A1Z()
            r1 = 1
            if (r0 == 0) goto L_0x010c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A02 = r0
        L_0x010c:
            r5.A3o(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.VerifyPhoneNumber.A3B():void");
    }

    public void A3C() {
        long A012 = this.A15.A01();
        if (A012 != -1) {
            long currentTimeMillis = A012 - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                A3Z(currentTimeMillis, 1, true);
            } else {
                this.A15.A06();
            }
        }
    }

    public final void A3D() {
        if (this.A0G != null) {
            Log.i("verifyphonenumber/cancel-primary-flash-call-timer");
            this.A0G.cancel();
            this.A0G = null;
        }
    }

    public final void A3E() {
        int i2;
        this.A0g.A00();
        AnonymousClass1UW A062 = this.A07.A06();
        StringBuilder sb = new StringBuilder("verifyphonenumber/network/active ");
        sb.append(A062);
        Log.i(sb.toString());
        if (A062 == null) {
            i2 = -1;
        } else if (A062.A04) {
            i2 = 0;
        } else {
            i2 = 99;
            if (A062.A06) {
                i2 = 1;
            }
        }
        int i3 = this.A04;
        if (i2 != i3) {
            StringBuilder sb2 = new StringBuilder("verifyphonenumber/network/switch old=");
            sb2.append(i3);
            sb2.append(" new=");
            sb2.append(i2);
            Log.i(sb2.toString());
            this.A04 = i2;
            if (i2 != -1 && this.A12.hasMessages(1)) {
                Log.i("verifyphonenumber/network/switch/has-retry-pending");
                this.A12.removeMessages(1);
                this.A01 = 0;
                String A022 = this.A15.A02(this.A1C, this.A1D);
                if (A022 != null) {
                    this.A12.sendMessage(this.A12.obtainMessage(1, A022));
                    return;
                }
                Log.e("verifyphonenumber/network/switch/no-saved-code");
            }
        }
    }

    public final void A3F() {
        if (this.A0u.A04()) {
            this.A0u.A01();
        } else {
            this.A0V.setText("");
        }
    }

    public final void A3G() {
        C15860rz r7 = this.A09;
        AnonymousClass1NE r6 = this.A0q;
        boolean z2 = this.A1K;
        int i2 = ((SharedPreferences) r7.A01.get()).getInt("autoconf_type", -1);
        StringBuilder sb = new StringBuilder("RegistrationUtils/shouldCreateAutoconfVerifier/AUTOCONF_ENABLED=");
        sb.append(true);
        sb.append(", autoconfSameDeviceCheck=");
        sb.append(z2);
        sb.append(", autoconfManager=");
        sb.append(r6 == null ? "null" : "nonnull");
        sb.append(", autoconfType=");
        sb.append(i2);
        Log.i(sb.toString());
        if (i2 == 1) {
            r7.A0q("autoconf_server_enabled");
        }
        if (!z2 || r6 == null || !(i2 == 1 || i2 == 2 || i2 == 3)) {
            Log.i("VerifyPhoneNumber/should not create autoconf verifier");
            return;
        }
        Log.i("VerifyPhoneNumber/attempt to create autoconf verifier");
        C005702l r0 = this.A0U;
        if (r0 != null) {
            r0.dismiss();
            this.A0U = null;
        }
        C16320sq r2 = this.A05;
        String str = this.A1C;
        String str2 = this.A1D;
        String str3 = ((SharedPreferences) this.A09.A01.get()).getInt("autoconf_type", -1) == 3 ? "2" : "1";
        AnonymousClass1NE r62 = this.A0q;
        AnonymousClass00B.A06(r62);
        r2.Ack(new AnonymousClass36V(this.A09, r62, this.A10, str, str2, str3), new String[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3H() {
        /*
            r16 = this;
            r4 = r16
            X.01V r1 = r4.A08
            X.0sj r0 = r4.A0j
            X.1Mf r5 = r4.A1R
            java.util.List r1 = X.C39851tA.A03(r5, r1, r0)
            X.1G1 r0 = r4.A0W
            java.util.List r2 = X.AnonymousClass2JO.A03(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r4.A1C
            r1.append(r0)
            java.lang.String r0 = r4.A1D
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0085
            r1 = -1
        L_0x002c:
            X.0rz r0 = r4.A09
            int r0 = r0.A0E()
            X.2Hg r5 = new X.2Hg
            r5.<init>(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A03 = r0
            X.0rz r0 = r4.A09
            boolean r0 = r0.A1Z()
            r11 = 1
            if (r0 == 0) goto L_0x004c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r5.A02 = r0
        L_0x004c:
            X.0rz r0 = r4.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "flash_call_eligible"
            r3 = 0
            int r2 = r1.getInt(r0, r3)
            X.0sC r0 = r4.A09
            int r1 = r0.A00()
            r0 = 8
            if (r1 == r0) goto L_0x00f8
            if (r2 == r11) goto L_0x00f8
            java.lang.String r1 = "verifyphonenumber/attempt-flashcall/request-voice/flash call ineligible: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r5.A00 = r0
            r4.A3o(r5, r3)
            return
        L_0x0085:
            java.util.Iterator r3 = r2.iterator()
        L_0x0089:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r2 = r3.next()
            X.4jL r2 = (X.C93524jL) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = r2.A02
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            java.lang.String r2 = "ZZ"
            X.3HS r0 = r5.A0E(r7, r2)     // Catch:{ 43m -> 0x00b3 }
            X.40k r1 = r5.A09(r0, r12)     // Catch:{ 43m -> 0x00b3 }
            goto L_0x00e6
        L_0x00b3:
            r0 = move-exception
            X.41z r0 = r0.errorType
            X.41z r1 = X.C799541z.INVALID_COUNTRY_CODE
            if (r0 != r1) goto L_0x00e4
            X.3HS r0 = r5.A0E(r12, r2)     // Catch:{ 43m -> 0x00c3 }
            X.40k r1 = r5.A09(r0, r7)     // Catch:{ 43m -> 0x00c3 }
            goto L_0x00e6
        L_0x00c3:
            r0 = move-exception
            X.41z r0 = r0.errorType
            if (r0 != r1) goto L_0x00e4
            X.3HS r6 = new X.3HS     // Catch:{ 43m -> 0x00e4 }
            r6.<init>()     // Catch:{ 43m -> 0x00e4 }
            X.3HS r11 = new X.3HS     // Catch:{ 43m -> 0x00e4 }
            r11.<init>()     // Catch:{ 43m -> 0x00e4 }
            r8 = 0
            r9 = 0
            r10 = 0
            r5.A0H(r6, r7, r8, r9, r10)     // Catch:{ 43m -> 0x00e4 }
            r14 = 0
            r15 = 0
            r10 = r5
            r13 = r8
            r10.A0H(r11, r12, r13, r14, r15)     // Catch:{ 43m -> 0x00e4 }
            X.40k r1 = r5.A08(r6, r11)     // Catch:{ 43m -> 0x00e4 }
            goto L_0x00e6
        L_0x00e4:
            X.40k r1 = X.C795840k.NOT_A_NUMBER
        L_0x00e6:
            X.40k r0 = X.C795840k.EXACT_MATCH
            if (r1 == r0) goto L_0x00f2
            X.40k r0 = X.C795840k.SHORT_NSN_MATCH
            if (r1 == r0) goto L_0x00f2
            X.40k r0 = X.C795840k.NSN_MATCH
            if (r1 != r0) goto L_0x0089
        L_0x00f2:
            r1 = 1
            goto L_0x002c
        L_0x00f5:
            r1 = 0
            goto L_0x002c
        L_0x00f8:
            java.lang.String r1 = "verifyphonenumber/attempt-flashcall/flash call eligible: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r6 = r4.A1C
            java.lang.String r7 = r4.A1D
            X.AnonymousClass00B.A06(r7)
            r9 = 0
            java.lang.String r8 = "flash"
            r10 = r9
            r4.A3n(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.VerifyPhoneNumber.A3H():void");
    }

    public final void A3I() {
        if (this.A0x.A02 || AIm()) {
            AnonymousClass2JN.A0F(this, this.A0i, -1);
        }
    }

    public final void A3J() {
        Log.i("VerifyPhoneNumber/removeProgressDialog");
        ProgressDialog progressDialog = this.A0E;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        this.A0E = null;
    }

    public final void A3K() {
        Log.i("verifyphonenumber/resetAllVerificationState");
        A3W(0);
        C63903Ly r0 = this.A12;
        if (r0 != null && r0.hasMessages(1)) {
            this.A12.removeMessages(1);
        }
        this.A15.A06();
        this.A15.A05();
        this.A15.A03();
        this.A0p.A02.A00();
    }

    public final void A3L() {
        Intent A062;
        A3K();
        if (this.A1F) {
            Log.i("verifyphonenumber/returntoregphone/changenumber/setregverified");
            this.A11.A0A(3);
            if (!this.A11.A0E()) {
                finish();
            }
            A062 = new Intent();
            A062.setClassName(getPackageName(), "com.obwhatsapp.registration.ChangeNumber");
        } else {
            this.A11.A0A(1);
            A062 = C14750ph.A06(this);
            A062.putExtra("com.obwhatsapp.registration.RegisterPhone.clear_phone_number", true);
        }
        startActivity(A062);
        finish();
    }

    public final void A3M() {
        if (this.A09.A00() != 8) {
            boolean A48 = A48();
            AnonymousClass4XR r0 = this.A15;
            long j2 = A48 ? r0.A00.getLong("com.obwhatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time", -1) : r0.A00();
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = -1;
            if (j2 != -1) {
                j3 = j2 - currentTimeMillis;
            }
            if (j2 > currentTimeMillis) {
                this.A11.A0B(j3);
            }
        }
    }

    public final void A3N() {
        CountDownTimer countDownTimer = this.A0F;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A0F = null;
            this.A15.A03();
            this.A0R.setProgress(100);
            this.A0T.setText(getString(R.string.str198a, new Object[]{Integer.valueOf(A1T)}));
            this.A1G = false;
            if (this.A0u.A04()) {
                this.A0u.A03(true);
            } else {
                this.A0V.setEnabled(true);
            }
        }
    }

    public final void A3O() {
        if (this.A1P) {
            if (this.A1O) {
                unregisterReceiver(this.A13);
                this.A1O = false;
            }
        } else if (this.A1L) {
            unregisterReceiver(this.A0y);
            this.A1L = false;
        }
    }

    public final void A3P() {
        int A002 = this.A09.A00();
        C15860rz r1 = this.A09;
        if (A002 == 8) {
            r1.A0t("primary_successful");
        } else {
            r1.A0w("secondary_successful");
        }
    }

    public final void A3Q() {
        this.A0T.setText(R.string.str13b1);
        this.A0b.setVisibility(8);
        this.A0L.setVisibility(8);
        this.A0M.setVisibility(8);
        this.A0S.setVisibility(8);
        AnonymousClass29T.A01(this, 124);
    }

    public void A3R(int i2) {
        this.A00 = i2;
        C26831Pk r2 = this.A0p.A02.A06;
        StringBuilder sb = new StringBuilder("AccountDefenceLocalDataRepository/save-acct-defence-state/");
        sb.append(i2);
        Log.i(sb.toString());
        SharedPreferences.Editor edit = r2.A01.A00("AccountDefenceLocalDataRepository_prefs").edit();
        edit.putInt("com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_verification_state", i2);
        if (!edit.commit()) {
            Log.e("AccountDefenceLocalDataRepository/save-acct-defence-state/error");
        }
        this.A0b.setText(this.A0p.A01(this, this.A01.A0H(AnonymousClass2JN.A0E(this.A1C, this.A1D)), this.A00));
    }

    public final void A3S(int i2) {
        boolean z2;
        Intent A0D2;
        A3J();
        AHq();
        if (this.A09.A00() != 12 || !this.A1Q) {
            z2 = true;
            if (this.A09.A00() == 12 && C26851Pm.A00(this.A08, i2)) {
                Log.i("VerifyPhoneNumber/fall back to flash call");
                A0D2 = C14750ph.A0D(this, this.A15.A00(), this.A15.A01(), this.A1F);
            } else if (A47() || A48()) {
                Log.i("VerifyPhoneNumber/fall back to sms");
                A3a(this.A15.A00(), this.A15.A01());
                return;
            } else {
                return;
            }
        } else {
            Log.i("VerifyPhoneNumber/fall back to device switching");
            A0D2 = C14750ph.A0h(this, (String) null, -1, this.A15.A00(), this.A15.A01(), this.A15.A00.getLong("com.obwhatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time", -1), this.A1P, false, this.A1F, false, this.A1Q);
            z2 = true;
        }
        A2X(A0D2, z2);
    }

    public final void A3T(int i2) {
        if (this.A0x.A02 || AIm()) {
            AnonymousClass2JN.A0F(this, this.A0i, i2);
        } else {
            AnonymousClass29T.A01(this, i2);
        }
    }

    public final void A3U(int i2) {
        String string = getString(i2);
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/showProgressDialog/");
        sb.append(string);
        Log.i(sb.toString());
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(string);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.show();
        this.A0E = progressDialog;
    }

    public final void A3V(int i2) {
        if (!A47()) {
            this.A0x.A01(i2);
        }
    }

    public final void A3W(int i2) {
        A1V = i2;
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putInt("com.obwhatsapp.registration.VerifyPhoneNumber.verification_state", A1V);
        if (!edit.commit()) {
            Log.w("verifyphonenumber/savestate/commit failed");
        }
    }

    public final void A3X(long j2) {
        CountDownTimer countDownTimer = this.A0F;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A0F = null;
        }
        long j3 = j2;
        if (j2 < 1000) {
            this.A15.A03();
            return;
        }
        this.A1G = true;
        SharedPreferences.Editor edit = this.A15.A00.edit();
        edit.putLong("com.obwhatsapp.registration.VerifyPhoneNumber.code_verification_retry_time", System.currentTimeMillis() + j2);
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/save-code-verification-retry-time/error");
        }
        if (this.A0u.A04()) {
            this.A0u.A03(false);
        } else {
            this.A0V.setEnabled(false);
        }
        this.A0R.setProgress(0);
        this.A0R.setVisibility(0);
        this.A0T.setText(R.string.str198b);
        this.A0F = new C56402na(this, j3, j2).start();
    }

    public final void A3Y(long j2) {
        if (!A47()) {
            this.A11.A0B(j2);
        }
    }

    public final void A3Z(long j2, int i2, boolean z2) {
        CountDownTimer A36;
        if (j2 < 3000) {
            (i2 != 0 ? i2 != 1 ? this.A0t : this.A0r : this.A0s).A00(true);
            return;
        }
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/disable ");
        sb.append(i2);
        sb.append(" button for ");
        sb.append(j2);
        Log.i(sb.toString());
        if (i2 == 0) {
            this.A0s.A00(false);
            CountDownTimer countDownTimer = this.A0H;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.A0B = 0;
            }
            this.A0s.A03.setText(C28961Zl.A04(this.A01, j2 / 1000));
            A36 = A36(0, j2, z2);
            this.A0H = A36;
        } else if (i2 != 1) {
            this.A0t.A00(false);
            CountDownTimer countDownTimer2 = this.A0J;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                this.A0D = 0;
            }
            this.A0t.A03.setText(C28961Zl.A04(this.A01, j2 / 1000));
            A36 = A36(2, j2, z2);
            this.A0J = A36;
        } else {
            this.A0r.A00(false);
            CountDownTimer countDownTimer3 = this.A0I;
            if (countDownTimer3 != null) {
                countDownTimer3.cancel();
                this.A0C = 0;
            }
            this.A0r.A03.setText(C28961Zl.A04(this.A01, j2 / 1000));
            A36 = A36(1, j2, z2);
            this.A0I = A36;
        }
        A36.start();
    }

    public final void A3a(long j2, long j3) {
        Log.i("verifyphonenumber/restartactivitywithsmsverification");
        A3W(0);
        if (this.A09.A00() == 8) {
            this.A09.A0t("primary_failed");
        }
        AnonymousClass29T.A01(this, 43);
        this.A05.A0L(new RunnableRunnableShape0S0100200_I0(this, 1, j2, j3), 1500);
    }

    public final void A3b(long j2, long j3) {
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/updateSmsGroupUI/originalSmsWaitTime=");
        sb.append(j2);
        sb.append(", remainingSmsWaitTime=");
        sb.append(j3);
        Log.i(sb.toString());
        if (j3 > 0) {
            if (this.A09.A00() != 8) {
                this.A0L.setVisibility(0);
            }
            A3Z(j3, 0, true);
            this.A15.A07(j3 + System.currentTimeMillis());
        } else if (j2 < 0) {
            this.A0L.setVisibility(8);
        } else if (j2 == 0) {
            if (this.A09.A00() != 8) {
                this.A0L.setVisibility(0);
            }
            this.A0s.A00(true);
            if (AnonymousClass3AS.A00(A35()) && this.A00 == 0) {
                A3R(1);
            }
            this.A15.A05();
        }
    }

    public final void A3c(long j2, long j3) {
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/updateVoiceGroupUI/originalVoiceWaitTime=");
        sb.append(j2);
        sb.append(", remainingVoiceWaitTime=");
        sb.append(j3);
        Log.i(sb.toString());
        if (j3 > 0) {
            int A002 = this.A09.A00();
            if (!(this.A09.A00() == 8 || A002 == 9)) {
                this.A0M.setVisibility(0);
            }
            A3Z(j3, 1, true);
            this.A15.A08(j3 + System.currentTimeMillis());
        } else if (j2 < 0) {
            this.A0M.setVisibility(8);
        } else if (j2 == 0) {
            int A003 = this.A09.A00();
            if (!(this.A09.A00() == 8 || A003 == 9)) {
                this.A0M.setVisibility(0);
            }
            this.A0r.A00(true);
            if (AnonymousClass3AS.A00(A35()) && this.A00 == 0) {
                A3R(1);
            }
            this.A15.A06();
        }
    }

    public void A3d(C47052Hh r19, C47062Hi r20, String str, String str2, String str3, String str4, String str5) {
        String str6;
        C16320sq r4 = this.A05;
        C15860rz r6 = this.A09;
        AnonymousClass1KP r9 = this.A10;
        AnonymousClass1NE r7 = this.A0q;
        int i2 = this.A02;
        boolean z2 = true;
        if (i2 != 3) {
            z2 = false;
            if (i2 == 2 || i2 == 1) {
                str6 = "account_defence";
                r4.Ack(new AnonymousClass374(r6, r7, r19, r9, r20, this, str2, str3, str4, str6, str5, z2), str);
            } else if (i2 != 3) {
                str6 = null;
                r4.Ack(new AnonymousClass374(r6, r7, r19, r9, r20, this, str2, str3, str4, str6, str5, z2), str);
            }
        }
        str6 = "ban_appeal";
        r4.Ack(new AnonymousClass374(r6, r7, r19, r9, r20, this, str2, str3, str4, str6, str5, z2), str);
    }

    public final void A3e(C35061lJ r5, String str) {
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/method=");
        sb.append(str);
        sb.append("/onCodeEntrypoint2FARequired");
        Log.i(sb.toString());
        A40(r5.A0J, r5.A0I, r5.A04);
    }

    public final void A3f(C35061lJ r12, String str) {
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/method=");
        sb.append(str);
        sb.append("/onCodeEntrypointVerified");
        Log.i(sb.toString());
        this.A09.A1L(r12.A0L);
        this.A09.A1K(r12.A0K);
        A41(this.A1C, this.A1D, r12.A0B, (String) null, -1, r12.A0L, r12.A0K, false);
    }

    public final void A3g(C35061lJ r3, String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/bad-parameter/");
        sb.append(r3.A0D);
        Log.e(sb.toString());
        AnonymousClass2JN.A0K(this.A09, str2);
        if ("number".equals(r3.A0D)) {
            A3V(34);
            return;
        }
        A3V(24);
        if (str.equals("sms") || str.equals("wa_old")) {
            A3I();
        }
    }

    public final void A3h(C35061lJ r9, String str, String str2, int i2, int i3) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/provider-unroutable");
        Log.e(sb.toString());
        AnonymousClass2JN.A0K(this.A09, str2);
        String str3 = r9.A0E;
        if (!AnonymousClass47P.A00(str3)) {
            A3t(getString(i2));
            return;
        }
        try {
            long parseLong = Long.parseLong(str3) * 1000;
            A3Y(parseLong);
            A3t(getString(i3, new Object[]{C28961Zl.A08(this.A01, parseLong)}));
            this.A15.A08(System.currentTimeMillis() + parseLong);
            A3Z(parseLong, 1, true);
        } catch (NumberFormatException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("verify");
            sb2.append(str);
            sb2.append("/request/");
            sb2.append(str);
            sb2.append("/unroutable/time-not-int");
            Log.w(sb2.toString(), e2);
            A3t(getString(i2));
        }
    }

    public final void A3i(C35061lJ r9, String str, String str2, String str3, int i2, int i3) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/no-routes");
        Log.w(sb.toString());
        AnonymousClass2JN.A0K(this.A09, str2);
        String str4 = r9.A0E;
        if (!AnonymousClass47P.A00(str4)) {
            A3t(getString(i2));
            this.A14.A03(str3);
            return;
        }
        try {
            long parseLong = Long.parseLong(str4) * 1000;
            A3Y(parseLong);
            A3t(getString(i3, new Object[]{C28961Zl.A08(this.A01, parseLong)}));
            this.A15.A08(System.currentTimeMillis() + parseLong);
            A3Z(parseLong, 1, true);
            this.A14.A03(str3);
        } catch (NumberFormatException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("verify");
            sb2.append(str);
            sb2.append("/request/");
            sb2.append(str);
            sb2.append("/no-routes/time-not-int");
            Log.w(sb2.toString(), e2);
            A3t(getString(i2));
        }
    }

    public final void A3j(AnonymousClass427 r3, String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append(r3 == AnonymousClass427.ERROR_BAD_TOKEN ? "/bad-token" : "/invalid-skey");
        Log.e(sb.toString());
        AnonymousClass2JN.A0K(this.A09, str2);
        A3V(41);
    }

    public final void A3k(C31641en r10, String str) {
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/");
        String str2 = str;
        sb.append(str);
        sb.append("/onAccountDefenceChecksRequired status ");
        C31631em r1 = r10.A06;
        sb.append(r1);
        Log.i(sb.toString());
        if (str.equals("flash")) {
            A3P();
        }
        boolean z2 = false;
        if (r1 == C31631em.DEVICE_CONFIRM_OR_SECOND_OTP) {
            z2 = true;
        }
        A3v(str2, r10.A02, r10.A03, z2);
    }

    public final void A3l(C31641en r5, String str) {
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/method=");
        sb.append(str);
        sb.append("/onRegisterEntrypoint2FARequired");
        Log.i(sb.toString());
        if (str.equals("flash")) {
            A3P();
        }
        A3G();
        A40(r5.A0B, r5.A0A, r5.A04);
    }

    public final void A3m(C31641en r5, String str) {
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/method=");
        sb.append(str);
        sb.append("/onRegisterEntrypointVerified");
        Log.i(sb.toString());
        C005702l A092 = AnonymousClass2JN.A09(this);
        this.A0U = A092;
        RunnableRunnableShape0S1200000_I0 runnableRunnableShape0S1200000_I0 = new RunnableRunnableShape0S1200000_I0(r5, str, this, 30);
        if (A092 == null) {
            runnableRunnableShape0S1200000_I0.run();
        } else {
            this.A05.A0L(runnableRunnableShape0S1200000_I0, 1000);
        }
    }

    public final void A3n(C47042Hg r23, String str, String str2, String str3, String str4, String str5, boolean z2) {
        String str6;
        int i2;
        if (!AnonymousClass3AS.A00(A35()) || (i2 = this.A00) == 2 || i2 == 3) {
            C16320sq r1 = this.A05;
            int i3 = ((SharedPreferences) this.A09.A01.get()).getInt("pref_flash_call_education_link_clicked", -1);
            int i4 = ((SharedPreferences) this.A09.A01.get()).getInt("pref_flash_call_manage_call_permission_granted", -1);
            int i5 = ((SharedPreferences) this.A09.A01.get()).getInt("pref_flash_call_call_log_permission_granted", -1);
            C16980tz r4 = this.A0h;
            int i6 = this.A02;
            boolean z3 = true;
            if (i6 != 3) {
                z3 = false;
                if (i6 == 2 || i6 == 1) {
                    str6 = "account_defence";
                    AnonymousClass01V r3 = this.A08;
                    AnonymousClass10J r6 = this.A0l;
                    r1.Ack(new AnonymousClass37B(r3, r4, this.A09, r6, this.A0q, this.A10, r23, this, str, str2, str3, str4, str5, str6, i3, i4, i5, z2, z3), new String[0]);
                    return;
                } else if (i6 != 3) {
                    str6 = null;
                    AnonymousClass01V r32 = this.A08;
                    AnonymousClass10J r62 = this.A0l;
                    r1.Ack(new AnonymousClass37B(r32, r4, this.A09, r62, this.A0q, this.A10, r23, this, str, str2, str3, str4, str5, str6, i3, i4, i5, z2, z3), new String[0]);
                    return;
                }
            }
            str6 = "ban_appeal";
            AnonymousClass01V r322 = this.A08;
            AnonymousClass10J r622 = this.A0l;
            r1.Ack(new AnonymousClass37B(r322, r4, this.A09, r622, this.A0q, this.A10, r23, this, str, str2, str3, str4, str5, str6, i3, i4, i5, z2, z3), new String[0]);
            return;
        }
        Log.w("VerifyPhoneNumber/executeRequestCodeTask should not request code yet, returning");
    }

    public final void A3o(C47042Hg r9, boolean z2) {
        A3n(r9, this.A1C, this.A1D, "voice", (String) null, (String) null, z2);
    }

    public void A3p(String str) {
        this.A1K = true;
        this.A15.A0A(str, this.A1C, this.A1D);
        this.A01 = 0;
        String A0O2 = this.A09.A0O();
        String A0Q2 = this.A09.A0Q();
        A3d(C47052Hh.AUTO_DETECTED, this.A16, str, A0O2, A0Q2, "sms", (String) null);
    }

    public void A3q(String str) {
        int length;
        int i2;
        String str2 = str;
        if (str != null && (length = str.length()) == (i2 = A1U)) {
            if (length == i2) {
                int i3 = 0;
                while (i3 < length) {
                    if (Character.isDigit(str.charAt(i3))) {
                        i3++;
                    }
                }
                String str3 = this.A1C;
                String str4 = this.A1D;
                AnonymousClass00B.A06(str4);
                A3d(C47052Hh.TYPED, this.A16, str2, str3, str4, A48() ? "wa_old" : "voice", (String) null);
                return;
            }
            AnonymousClass29T.A01(this, 29);
        }
    }

    public final void A3r(String str) {
        if (this.A1G) {
            Log.i("verifyphonenumber/verificationlink/voice/code-entry-blocked-retry-later");
            this.A15.A0A(str, this.A1C, this.A1D);
            return;
        }
        StringBuilder sb = new StringBuilder("verifyphonenumber/verificationlink/voice/state ");
        sb.append(A1V);
        Log.i(sb.toString());
        if (this.A0u.A04()) {
            C615639k r4 = this.A0u;
            if (TextUtils.isEmpty(str)) {
                r4.A01();
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = r4.A0B;
                if (i2 < arrayList.size()) {
                    AnonymousClass00B.A06(str);
                    ((TextView) arrayList.get(i2)).setText(String.valueOf(str.charAt(i2)));
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            this.A0V.setText(str);
        }
    }

    public final void A3s(String str) {
        StringBuilder sb = new StringBuilder("verify/");
        sb.append(str);
        sb.append("/registration-not-allowed-error");
        Log.e(sb.toString());
        AnonymousClass2JN.A0K(this.A09, "not-allowed");
        this.A0x.A01(45);
    }

    public final void A3t(String str) {
        if (!A47()) {
            this.A0x.A03(str);
        }
    }

    public final void A3u(String str) {
        if (A1V == 12) {
            this.A0S.setVisibility(8);
            this.A0L.setVisibility(8);
            this.A0M.setVisibility(8);
            return;
        }
        if (!str.equals("flash")) {
            this.A0S.setVisibility(0);
        }
        A3C();
    }

    public final void A3v(String str, long j2, long j3, boolean z2) {
        StringBuilder sb = new StringBuilder("VerifyPhoneNumber/");
        sb.append(str);
        sb.append("/launchAccountDefenceFlow deviceConfirmationFlow: ");
        boolean z3 = z2;
        sb.append(z3);
        sb.append(", smsWait: ");
        sb.append(j2);
        sb.append(", voiceWait: ");
        sb.append(j3);
        Log.i(sb.toString());
        this.A17.A04(A38(), "successful");
        C19760yx r1 = this.A11;
        int i2 = 13;
        if (z2) {
            i2 = 14;
        }
        r1.A0A(i2);
        A3W(0);
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = j2 * 1000;
        long j5 = j3 * 1000;
        long j6 = j4 + currentTimeMillis;
        long j7 = j5 + currentTimeMillis;
        AnonymousClass4XR r2 = this.A15;
        long min = Math.min(j6, j7);
        SharedPreferences.Editor edit = r2.A00.edit();
        edit.putLong("com.obwhatsapp.registration.VerifyPhoneNumber.code_verification_retry_time", min);
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/save-code-verification-retry-time/error");
        }
        this.A0p.A02(j4, j5);
        A3M();
        AnonymousClass29T.A01(this, 44);
        this.A05.A0L(new AnonymousClass55x(this, j6, j7, z3), 1500);
    }

    public final void A3w(String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/blocked");
        Log.e(sb.toString());
        A3W(12);
        AnonymousClass2JN.A0K(this.A09, str2);
        A3Q();
    }

    public final void A3x(String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/missing-parameter");
        Log.e(sb.toString());
        AnonymousClass2JN.A0K(this.A09, str2);
        A3V(25);
    }

    public final void A3y(String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/next-method");
        Log.w(sb.toString());
        AnonymousClass2JN.A0K(this.A09, str2);
        int i2 = 36;
        if (str.equals("wa_old")) {
            i2 = 38;
        }
        A3V(i2);
        A3M();
    }

    public final void A3z(String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/unspecified");
        Log.w(sb.toString());
        AnonymousClass2JN.A0K(this.A09, str2);
        A3V(109);
    }

    public final void A40(String str, String str2, long j2) {
        Log.i("VerifyPhoneNumber/askForTwoFactorAuthCode");
        Log.i("VerifyPhoneNumber/saveBackupToken");
        this.A05.Acl(new RunnableRunnableShape13S0100000_I0_12((Object) this, 32));
        this.A09.A1B(str, str2, j2, -1, -1, this.A05.A00());
        this.A11.A0A(7);
        this.A17.A04(A38(), "successful");
        A2X(C14750ph.A0p(this, this.A1F), false);
        finish();
    }

    public final void A41(String str, String str2, String str3, String str4, int i2, boolean z2, boolean z3, boolean z4) {
        Log.i("VerifyPhoneNumber/onVerificationComplete");
        Log.i("VerifyPhoneNumber/saveBackupToken");
        this.A05.Acl(new RunnableRunnableShape13S0100000_I0_12((Object) this, 32));
        A3W(0);
        this.A12.removeMessages(1);
        this.A15.A04();
        if (this.A02 == 3) {
            this.A11.A0A(10);
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.obwhatsapp.userban.ui.BanAppealActivity");
            intent.putExtra("appeal_request_token", str4);
            intent.putExtra("ban_violation_type", i2);
            intent.putExtra("launch_source", 2);
            startActivity(intent);
        } else {
            Log.i("verifyphonenumber/registrationhasbeenverified");
            this.A09.A1L(z2);
            this.A09.A1K(z3);
            this.A09.A0K().putBoolean("first_party_migration_initiated", z4).apply();
            this.A11.A0C(str, str2, str3);
            this.A11.A03();
            if (!this.A1F || this.A11.A0D()) {
                this.A17.A04(A38(), "successful");
                A3G();
                if (this.A0x.A02) {
                    AnonymousClass2JN.A0G(this, this.A0i, this.A11, this.A1F);
                } else if (this.A1F) {
                    startActivity(C14750ph.A04(this));
                }
                A3J();
                this.A11.A0A(2);
                startActivity(C14750ph.A05(this));
                ((SharedPreferences) this.A09.A01.get()).edit().remove("flash_call_eligible").remove("is_first_flash_call_request").remove("pref_flash_call_education_link_clicked").remove("pref_flash_call_manage_call_permission_granted").remove("pref_flash_call_call_log_permission_granted").remove("pref_flash_call_education_screen_displayed").remove("pref_prefer_sms_over_flash").apply();
                this.A0v.A01();
                this.A0w.A04(false);
            }
        }
        finish();
    }

    public void A42(boolean z2) {
        Log.i("VerifyPhoneNumber/requestSmsCode");
        TelephonyManager A0N2 = this.A08.A0N();
        if (A0N2 != null) {
            A0N2.getNetworkOperator();
            A0N2.getNetworkOperatorName();
            A0N2.getSimOperator();
            A0N2.getSimOperatorName();
        }
        this.A09.A0u((String) null);
        if (A48()) {
            Log.i("VerifyPhoneNumber/requestSmsCode/maybeUseSmsRetriever");
            AnonymousClass47O.A00(this.A0h, new C1033551b(this));
            return;
        }
        C47042Hg r3 = new C47042Hg(this.A09.A0E());
        if (this.A09.A1Z()) {
            r3.A02 = true;
        }
        String str = this.A1C;
        AnonymousClass00B.A06(str);
        String str2 = this.A1D;
        AnonymousClass00B.A06(str2);
        A3n(r3, str, str2, "sms", (String) null, this.A1P ? "2" : this.A0j.A03("android.permission.RECEIVE_SMS") == 0 ? "1" : "0", z2);
    }

    public void A43(boolean z2) {
        this.A09.A0u((String) null);
        String str = this.A1C;
        AnonymousClass00B.A06(str);
        String str2 = this.A1D;
        AnonymousClass00B.A06(str2);
        A3n(new C47042Hg(this.A09.A0E()), str, str2, "wa_old", (String) null, this.A1P ? "2" : this.A0j.A03("android.permission.RECEIVE_SMS") == 0 ? "1" : "0", z2);
    }

    public final void A44(boolean z2) {
        ImageButton imageButton = this.A0Q;
        int i2 = 4;
        if (z2) {
            i2 = 0;
        }
        imageButton.setVisibility(i2);
        if (this.A0u.A04()) {
            RelativeLayout relativeLayout = this.A0S;
            int i3 = 16;
            if (z2) {
                i3 = 1;
            }
            relativeLayout.setGravity(i3);
            C615639k r4 = this.A0u;
            boolean z3 = !z2;
            Iterator it = r4.A0B.iterator();
            while (it.hasNext()) {
                TextView textView = (TextView) it.next();
                textView.setWidth(!z3 ? r4.A08 : r4.A07);
                textView.setHeight(!z3 ? r4.A03 : r4.A02);
            }
            if (z2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0Q.getLayoutParams();
                layoutParams.setMargins(this.A05, this.A07, this.A06, 0);
                int i4 = this.A08;
                layoutParams.width = i4;
                layoutParams.height = i4;
                this.A0Q.setLayoutParams(layoutParams);
            }
        }
    }

    public final void A45(boolean z2) {
        Log.i("verifyphonenumber/request-flash");
        if (!this.A0j.A0A()) {
            Log.i("verifyphonenumber/request-flash/request-permission");
            RequestPermissionActivity.A0N(this, this.A0j, 700, z2);
            return;
        }
        Log.i("verifyphonenumber/request-flash/has-permission");
        A3H();
    }

    public final void A46(boolean z2) {
        View view;
        int i2;
        if (!z2 || !A48()) {
            view = this.A0O;
            i2 = 8;
        } else {
            view = this.A0O;
            i2 = 0;
        }
        view.setVisibility(i2);
        this.A0N.setVisibility(i2);
    }

    public final boolean A47() {
        return this.A09.A00() == 8 || this.A09.A00() == 12;
    }

    public final boolean A48() {
        return this.A09.A00() == 15;
    }

    public void AHn(String str, boolean z2) {
        int i2;
        if (str.equals("sms")) {
            if (z2) {
                i2 = 35;
            } else {
                return;
            }
        } else if (str.equals("voice")) {
            A3J();
            return;
        } else if (str.equals("wa_old") && z2) {
            i2 = 46;
        } else {
            return;
        }
        AnonymousClass29T.A00(this, i2);
    }

    public void AHq() {
        if (this.A09.A00() == 8) {
            Log.i("verifyphonenumber/hide-automatically-verifying-progress-dialog");
            A3J();
            return;
        }
        Log.i("verifyphonenumber/hide-verifying-progress-dialog");
        AnonymousClass29T.A00(this, 23);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r6 = java.lang.Long.parseLong(r4) * 1000;
        r0.A11.A0B(r6);
        r10 = r0.A0x;
        r5 = com.obwhatsapp.R.string.str13a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x033b, code lost:
        if (r11 == false) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x033d, code lost:
        r5 = com.obwhatsapp.R.string.str13d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0340, code lost:
        r10.A03(getString(r5, new java.lang.Object[]{X.C28961Zl.A08(r0.A01, r6)}));
        r0.A15.A07(java.lang.System.currentTimeMillis() + r6);
        A3Z(r6, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0362, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0363, code lost:
        com.whatsapp.util.Log.w("verifyphonenumber/request/sms/too-recent/time-not-int", r4);
        r4 = r0.A0x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x036b, code lost:
        if (r11 == false) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x036e, code lost:
        r1 = com.obwhatsapp.R.string.str13a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0375, code lost:
        if (r1 != X.AnonymousClass427.A0F) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        X.AnonymousClass00B.A06(r3);
        A3f(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0377, code lost:
        X.AnonymousClass00B.A06(r3);
        A3h(r3, r2, "server-send-request-provider-unroutable", com.obwhatsapp.R.string.str13a7, com.obwhatsapp.R.string.str13a6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x038d, code lost:
        if (r1 != X.AnonymousClass427.A0C) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x038f, code lost:
        X.AnonymousClass00B.A06(r3);
        A3i(r3, r2, "server-send-request-no-routes", "noRouteSms", com.obwhatsapp.R.string.str13a7, com.obwhatsapp.R.string.str13a6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03a7, code lost:
        if (r1 == X.AnonymousClass427.A02) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03ab, code lost:
        if (r1 == X.AnonymousClass427.A07) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03af, code lost:
        if (r1 != X.AnonymousClass427.A0O) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r27 != null) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03b1, code lost:
        X.AnonymousClass00B.A06(r3);
        A3e(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03b9, code lost:
        r7 = X.AnonymousClass427.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03bb, code lost:
        if (r1 == r7) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03bf, code lost:
        if (r1 == X.AnonymousClass427.A0G) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03c3, code lost:
        if (r1 != X.AnonymousClass427.A0B) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03c5, code lost:
        A3s(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03ca, code lost:
        A3j(r1, r2, "server-send-request-bad-token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03d2, code lost:
        X.AnonymousClass00B.A06(r3);
        r8 = X.AnonymousClass2JN.A02(r3.A0F, 0);
        r10 = X.AnonymousClass2JN.A02(r3.A0G, 0);
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03e4, code lost:
        if (r1 != r7) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03e6, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03e7, code lost:
        A3v("sms", r8, r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03f0, code lost:
        X.AnonymousClass00B.A06(r3);
        com.whatsapp.util.Log.i("verifyphonenumber/request/sms/requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0403, code lost:
        if (X.AnonymousClass3AS.A00(r0.A09.A00()) == false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0405, code lost:
        A3R(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x040b, code lost:
        if (r0.A1J != false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x040d, code lost:
        r5 = r0.A0p.A02.A06;
        r1 = new java.lang.StringBuilder("AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/");
        r1.append(true);
        com.whatsapp.util.Log.i(r1.toString());
        r4 = r5.A01.A00("AccountDefenceLocalDataRepository_prefs").edit();
        r4.putBoolean("com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x043a, code lost:
        if (r4.commit() != false) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x043c, code lost:
        com.whatsapp.util.Log.e("AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r1 == X.AnonymousClass427.A0P) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0441, code lost:
        r0.A1J = true;
        r5 = r0.A0s;
        r5.A02.setText(getString(com.obwhatsapp.R.string.str199e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0451, code lost:
        r5 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0453, code lost:
        if (r5 <= 0) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0455, code lost:
        A1T = r5;
        r0.A09.A0K().putInt("registration_sms_code_length", r5).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0466, code lost:
        r4 = r3.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x046c, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x046e, code lost:
        r0.A11.A0B(java.lang.Long.parseLong(r4) * 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x047a, code lost:
        A3N();
        r0.A09.A0k(r0.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        A3O();
        r4 = new java.lang.StringBuilder("verifyphonenumber/error/status=");
        r4.append(r1);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x048f, code lost:
        if (r2.equals(r4) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0491, code lost:
        X.AnonymousClass2JN.A00 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0497, code lost:
        if (r1 != X.AnonymousClass427.A0N) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0499, code lost:
        X.AnonymousClass00B.A06(r3);
        A3f(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x049f, code lost:
        A3u(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04a2, code lost:
        if (r27 != null) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r1 != X.AnonymousClass427.A0H) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04b0, code lost:
        r1 = new java.lang.StringBuilder("VerifyPhoneNumber/updateRequestCodeButtons: method:");
        r1.append(r2);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04cc, code lost:
        if (r2.equals("sms") != false) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04ce, code lost:
        r1 = r3.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04d0, code lost:
        if (r1 == null) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04d2, code lost:
        r1 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04d4, code lost:
        r6 = X.AnonymousClass2JN.A02(r1, -1) * 1000;
        r1 = r3.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04db, code lost:
        r1 = X.AnonymousClass2JN.A02(r1, -1) * 1000;
        r8 = r3.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04e2, code lost:
        r3 = X.AnonymousClass2JN.A02(r8, -1) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04ef, code lost:
        if (X.AnonymousClass3AS.A00(A35()) != false) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        X.AnonymousClass00B.A06(r3);
        com.whatsapp.util.Log.w("verifyphonenumber/request/sms/temp-unavail");
        X.AnonymousClass2JN.A0K(r0.A09, "server-send-request-temp-unavailable");
        r4 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04f1, code lost:
        r0.A0p.A02(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04f6, code lost:
        A3b(r6, r6);
        A3c(r1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0500, code lost:
        if (A48() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0502, code lost:
        r2 = new java.lang.StringBuilder("VerifyPhoneNumber/updateWAOldGroupUI/originalSmsWaitTime=");
        r2.append(r3);
        r2.append(", remainingSmsWaitTime=");
        r2.append(r3);
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0520, code lost:
        if (r3 > 0) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0522, code lost:
        A46(true);
        A3Z(r3, 2, true);
        r0.A15.A09(r3 + java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0533, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x053b, code lost:
        if (r2.equals("voice") != false) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (X.AnonymousClass47P.A00(r4) != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x054c, code lost:
        if (r2.equals("wa_old") != false) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x054e, code lost:
        r6 = X.AnonymousClass2JN.A02(r3.A0F, -1) * 1000;
        r1 = X.AnonymousClass2JN.A02(r3.A0G, -1) * 1000;
        r8 = r3.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x055e, code lost:
        if (r8 == null) goto L_0x0560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0560, code lost:
        r8 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0563, code lost:
        r6 = X.AnonymousClass2JN.A02(r3.A0F, -1) * 1000;
        r1 = r3.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x056c, code lost:
        if (r1 == null) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x056e, code lost:
        r1 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        r4 = r0.A0x;
        r1 = com.obwhatsapp.R.string.str13ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0574, code lost:
        if (r1 == X.AnonymousClass427.A0P) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0576, code lost:
        r5 = new java.lang.StringBuilder("verifyvoice/request/");
        r5.append(r2);
        r5.append("/error/status=");
        r5.append(r1);
        com.whatsapp.util.Log.i(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0592, code lost:
        if (r1 != X.AnonymousClass427.A0H) goto L_0x062f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0594, code lost:
        X.AnonymousClass00B.A06(r3);
        r5 = new java.lang.StringBuilder("verifyvoice/request/");
        r5.append(r2);
        r5.append("/temp-unavail");
        com.whatsapp.util.Log.w(r5.toString());
        X.AnonymousClass2JN.A0K(r0.A09, "voice-temp-unavail");
        r5 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05b9, code lost:
        if (X.AnonymousClass47P.A00(r5) != false) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x05bb, code lost:
        r4 = com.obwhatsapp.R.string.str13ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x05be, code lost:
        r4 = getString(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05c2, code lost:
        A3t(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        r4.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05d7, code lost:
        r0.A09.A0w("secondary_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05df, code lost:
        A3S(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        r4 = java.lang.Long.parseLong(r5) * 1000;
        A3Y(r4);
        A3t(getString(com.obwhatsapp.R.string.str13ac, new java.lang.Object[]{X.C28961Zl.A08(r0.A01, r4)}));
        r0.A15.A08(java.lang.System.currentTimeMillis() + r4);
        A3Z(r4, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0613, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0614, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("verifyvoice/request/");
        r5.append(r2);
        r5.append("/temporarily-unavailable/unable-to-parse-retryAfter");
        com.whatsapp.util.Log.w(r5.toString(), r6);
        r4 = com.obwhatsapp.R.string.str13ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0631, code lost:
        if (r1 != X.AnonymousClass427.A0M) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        A3I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0633, code lost:
        A3z(r2, "voice-error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x063c, code lost:
        if (r1 != X.AnonymousClass427.A0I) goto L_0x06d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x063e, code lost:
        X.AnonymousClass00B.A06(r3);
        r5 = new java.lang.StringBuilder("verifyvoice/request/");
        r5.append(r2);
        r5.append("/too-many-tries");
        com.whatsapp.util.Log.w(r5.toString());
        X.AnonymousClass2JN.A0K(r0.A09, "voice-error-too-many-tries");
        r0.A14.A03("failTooMany");
        r0.A14.A02("verify-tma");
        r5 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0674, code lost:
        if (X.AnonymousClass47P.A00(r5) != false) goto L_0x067e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0676, code lost:
        A3V(26);
        A3M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        r4 = java.lang.Long.parseLong(r5) * 1000;
        r0.A0A = r4;
        A3Y(r4);
        A3t(getString(com.obwhatsapp.R.string.str13ce, new java.lang.Object[]{X.C28961Zl.A08(r0.A01, r0.A0A)}));
        r0.A15.A08(java.lang.System.currentTimeMillis() + r0.A0A);
        A3Z(r0.A0A, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x06b5, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x06b6, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("verifyvoice/request/");
        r5.append(r2);
        r5.append("/triedtoomanytimesallmethods/time-not-int");
        com.whatsapp.util.Log.w(r5.toString(), r6);
        A3V(26);
        A3M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x06d7, code lost:
        if (r1 != X.AnonymousClass427.A0J) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x06d9, code lost:
        X.AnonymousClass00B.A06(r3);
        r5 = new java.lang.StringBuilder("verifyvoice/request/");
        r5.append(r2);
        r5.append("/too-many-tries-all-methods");
        com.whatsapp.util.Log.w(r5.toString());
        X.AnonymousClass2JN.A0K(r0.A09, "voice-error-too-many-tries-all-methods");
        r0.A14.A03("failTooMany");
        r0.A14.A02("verify-tma");
        r5 = r3.A0E;
        r9 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x070f, code lost:
        if (X.AnonymousClass47P.A00(r5) == false) goto L_0x08c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        r4 = java.lang.Long.parseLong(r5) * 1000;
        r0.A0A = r4;
        A3Y(r4);
        A3V(31);
        r0.A15.A08(java.lang.System.currentTimeMillis() + r0.A0A);
        A3Z(r0.A0A, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0736, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0737, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("verifyvoice/request/");
        r5.append(r2);
        r4 = "/triedtoomanytimesallmethods/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0748, code lost:
        if (r1 != X.AnonymousClass427.A04) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4 = java.lang.Long.parseLong(r4) * 1000;
        r0.A11.A0B(r4);
        r0.A0x.A03(getString(com.obwhatsapp.R.string.str13ac, new java.lang.Object[]{X.C28961Zl.A08(r0.A01, r4)}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x074a, code lost:
        r4 = getString(com.obwhatsapp.R.string.str1372, new java.lang.Object[]{getString(com.obwhatsapp.R.string.str053b)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0762, code lost:
        if (r1 != X.AnonymousClass427.A01) goto L_0x076f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0764, code lost:
        X.AnonymousClass00B.A06(r3);
        A3g(r3, r2, "voice-bad-param");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0771, code lost:
        if (r1 != X.AnonymousClass427.A09) goto L_0x077b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0773, code lost:
        A3x(r2, "voice-missing-param");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x077d, code lost:
        if (r1 != X.AnonymousClass427.A0D) goto L_0x07ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x077f, code lost:
        r5 = new java.lang.StringBuilder("verifyvoice/request/");
        r5.append(r2);
        r5.append("/version-too-old");
        com.whatsapp.util.Log.w(r5.toString());
        X.AnonymousClass2JN.A0K(r0.A09, "voice-version-too-old");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x07a3, code lost:
        if (r0.A09.A00() == 8) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x07a5, code lost:
        A3T(22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x07ae, code lost:
        if (r1 != X.AnonymousClass427.A0L) goto L_0x082d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x07b0, code lost:
        X.AnonymousClass00B.A06(r3);
        r5 = new java.lang.StringBuilder("verifyvoice/request/");
        r5.append(r2);
        r5.append("/too-recent ");
        r5.append(r3.A0E);
        com.whatsapp.util.Log.w(r5.toString());
        X.AnonymousClass2JN.A0K(r0.A09, "voice-too-recent");
        r5 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x07da, code lost:
        if (X.AnonymousClass47P.A00(r5) != false) goto L_0x07e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x07dc, code lost:
        r4 = com.obwhatsapp.R.string.str13af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        r4 = java.lang.Long.parseLong(r5) * 1000;
        A3Y(r4);
        A3t(getString(com.obwhatsapp.R.string.str13ae, new java.lang.Object[]{X.C28961Zl.A08(r0.A01, r4)}));
        r0.A15.A08(java.lang.System.currentTimeMillis() + r4);
        A3Z(r4, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0810, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        com.whatsapp.util.Log.w("verifyphonenumber/request/sms/temporarily-unavailable/unable-to-parse-retryAfter", r4);
        r4 = r0.A0x;
        r1 = com.obwhatsapp.R.string.str13ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0811, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("verifyvoice/request/");
        r5.append(r2);
        r5.append("/too-recent/time-not-int");
        com.whatsapp.util.Log.w(r5.toString(), r6);
        r4 = com.obwhatsapp.R.string.str13af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x082f, code lost:
        if (r1 != X.AnonymousClass427.A03) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0831, code lost:
        A3w(r2, "voice-blocked");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x083b, code lost:
        if (r1 != X.AnonymousClass427.A0A) goto L_0x0848;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x083d, code lost:
        X.AnonymousClass00B.A06(r3);
        A3y(r2, "voice-next-method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x084a, code lost:
        if (r1 != X.AnonymousClass427.A0K) goto L_0x08c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x084c, code lost:
        X.AnonymousClass00B.A06(r3);
        r5 = new java.lang.StringBuilder("verifyvoice/request/");
        r5.append(r2);
        r5.append("/too-many-guesses");
        com.whatsapp.util.Log.w(r5.toString());
        X.AnonymousClass2JN.A0K(r0.A09, "voice-too-many-guesses");
        r0.A14.A03("failTooMany");
        r0.A14.A02("verify-tmg");
        r5 = r3.A0E;
        r9 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0882, code lost:
        if (X.AnonymousClass47P.A00(r5) == false) goto L_0x08c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        r4 = java.lang.Long.parseLong(r5) * 1000;
        r0.A0A = r4;
        A3Y(r4);
        A3V(32);
        r0.A15.A08(java.lang.System.currentTimeMillis() + r0.A0A);
        A3Z(r0.A0A, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x08a9, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x08aa, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("verifyvoice/request/");
        r5.append(r2);
        r4 = "/too-many-guesses/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x08b7, code lost:
        r5.append(r4);
        com.whatsapp.util.Log.w(r5.toString(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x08c1, code lost:
        A3V(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x08c8, code lost:
        if (r1 != X.AnonymousClass427.A0E) goto L_0x0942;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x08ca, code lost:
        X.AnonymousClass00B.A06(r3);
        r5 = new java.lang.StringBuilder("verifyvoice/request/");
        r5.append(r2);
        r5.append("/provider-timeout");
        com.whatsapp.util.Log.e(r5.toString());
        X.AnonymousClass2JN.A0K(r0.A09, "voice-provider-timeout");
        r5 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if (r1 != X.AnonymousClass427.A0M) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x08ef, code lost:
        if (X.AnonymousClass47P.A00(r5) != false) goto L_0x08f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x08f1, code lost:
        r4 = com.obwhatsapp.R.string.str13d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:?, code lost:
        r4 = java.lang.Long.parseLong(r5) * 1000;
        A3Y(r4);
        A3t(getString(com.obwhatsapp.R.string.str13d1, new java.lang.Object[]{X.C28961Zl.A08(r0.A01, r4)}));
        r0.A15.A08(java.lang.System.currentTimeMillis() + r4);
        A3Z(r4, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0925, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0926, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("verifyvoice/request/");
        r5.append(r2);
        r5.append("/too-recent/time-not-int");
        com.whatsapp.util.Log.w(r5.toString(), r6);
        r4 = com.obwhatsapp.R.string.str13d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0944, code lost:
        if (r1 != X.AnonymousClass427.A0F) goto L_0x095a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0946, code lost:
        X.AnonymousClass00B.A06(r3);
        A3h(r3, r2, "voice-provider-unroutable", com.obwhatsapp.R.string.str13d4, com.obwhatsapp.R.string.str13d3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        A3z(r2, "server-send-request-error-unspecified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x095c, code lost:
        if (r1 != X.AnonymousClass427.A0C) goto L_0x0974;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x095e, code lost:
        X.AnonymousClass00B.A06(r3);
        A3i(r3, r2, "voice-no-routes", "noRouteVoice", com.obwhatsapp.R.string.str13d4, com.obwhatsapp.R.string.str13d3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0976, code lost:
        if (r1 == X.AnonymousClass427.A02) goto L_0x09f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x097a, code lost:
        if (r1 == X.AnonymousClass427.A07) goto L_0x09f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x097e, code lost:
        if (r1 != X.AnonymousClass427.A0O) goto L_0x0988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0980, code lost:
        X.AnonymousClass00B.A06(r3);
        A3e(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0988, code lost:
        r7 = X.AnonymousClass427.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x098a, code lost:
        if (r1 == r7) goto L_0x09d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x098e, code lost:
        if (r1 == X.AnonymousClass427.A0G) goto L_0x09d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0996, code lost:
        if (r2.equals("flash") == false) goto L_0x09cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x099a, code lost:
        if (r1 != X.AnonymousClass427.A06) goto L_0x09cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x099c, code lost:
        com.whatsapp.util.Log.e("verifyvoice/request/flash/flash-call-disabled/fallback-to-voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x09aa, code lost:
        if (r0.A09.A00() == 8) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x09ac, code lost:
        r5 = new X.C47042Hg(r0.A09.A0E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b6, code lost:
        if (r1 != X.AnonymousClass427.A0I) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x09bd, code lost:
        if (r0.A09.A1Z() == false) goto L_0x09c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x09bf, code lost:
        r5.A02 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x09c6, code lost:
        A3o(r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x09ce, code lost:
        if (r1 != X.AnonymousClass427.A0B) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x09d0, code lost:
        A3s(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x09d5, code lost:
        X.AnonymousClass00B.A06(r3);
        r8 = X.AnonymousClass2JN.A02(r3.A0F, 0);
        r10 = X.AnonymousClass2JN.A02(r3.A0G, 0);
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x09e7, code lost:
        if (r1 != r7) goto L_0x09ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x09e9, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x09ea, code lost:
        A3v(r2, r8, r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        X.AnonymousClass00B.A06(r3);
        com.whatsapp.util.Log.w("verifyphonenumber/request/sms/too-many-tries");
        r12 = r2.equals("wa_old");
        X.AnonymousClass2JN.A0K(r0.A09, "server-send-request-too-many-tries");
        r0.A14.A03("failTooMany");
        r0.A14.A02("verify-tma");
        r4 = r3.A0E;
        r8 = 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x09f1, code lost:
        A3j(r1, r2, "voice-bad-token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x09f9, code lost:
        X.AnonymousClass00B.A06(r3);
        r5 = new java.lang.StringBuilder("verifyvoice/request/");
        r5.append(r2);
        r5.append("/requested");
        com.whatsapp.util.Log.i(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0a17, code lost:
        if (r2 != "flash") goto L_0x0a41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0a19, code lost:
        r4 = r3.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0a1b, code lost:
        if (r4 == null) goto L_0x0a24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0a1d, code lost:
        r0.A09 = java.lang.Long.parseLong(r4) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0a24, code lost:
        r4 = r0.A09;
        com.whatsapp.util.Log.i("verifyphonenumber/start-primary-flash-call-timer");
        A3D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0a31, code lost:
        if (r4 >= 1000) goto L_0x0a36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0a33, code lost:
        r4 = 60000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0a36, code lost:
        r0.A0G = new X.C63703Le(r0, r4).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e7, code lost:
        if (X.AnonymousClass47P.A00(r4) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0a41, code lost:
        r5 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0a43, code lost:
        if (r5 <= 0) goto L_0x0a6c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0a49, code lost:
        if (r2.equals("flash") != false) goto L_0x0a6c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0a4b, code lost:
        A1U = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0a53, code lost:
        if (r0.A0u.A04() != false) goto L_0x0a5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0a55, code lost:
        r0.A0V.A02 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0a5b, code lost:
        r4 = r0.A09;
        r4.A0K().putInt("registration_voice_code_length", r3.A01).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0a6c, code lost:
        r5 = r3.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0a72, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x0a7e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e9, code lost:
        r1 = r0.A0x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0a74, code lost:
        r0.A11.A0B(java.lang.Long.parseLong(r5) * 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0a82, code lost:
        if (r2.equals("flash") == false) goto L_0x0ad4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0a84, code lost:
        r14 = r0.A0v;
        r16 = r0.A1C;
        r15 = r0.A1D;
        X.AnonymousClass00B.A06(r15);
        r13 = r3.A08;
        X.AnonymousClass00B.A06(r13);
        r12 = r0.A16;
        r11 = r14.A02.A00;
        r10 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0a9c, code lost:
        if (r10 != null) goto L_0x0ac7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0a9e, code lost:
        r9 = r14.A06;
        r8 = r14.A01;
        r6 = r14.A03;
        r5 = r14.A04;
        r4 = r14.A05;
        X.AnonymousClass00B.A06(r15);
        r21 = r0;
        r20 = r12;
        r19 = r4;
        r18 = r5;
        r17 = r6;
        r16 = r8;
        r15 = new X.C56272nC(r16, r17, r18, r19, r20, r21, r9, r13, r16, r15);
        r14.A00 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0ac7, code lost:
        r11.registerReceiver(r10, new android.content.IntentFilter("android.intent.action.PHONE_STATE"), X.AnonymousClass01S.A09, (android.os.Handler) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0ade, code lost:
        if (X.AnonymousClass3AS.A00(r0.A09.A00()) == false) goto L_0x0b07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00eb, code lost:
        if (r12 == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0ae7, code lost:
        if ("voice".equals(r2) == false) goto L_0x0b07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0ae9, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append("verifyvoice/request/");
        r6.append(r2);
        r6.append("/update acct defence stat:");
        r6.append(3);
        com.whatsapp.util.Log.i(r6.toString());
        A3R(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0b07, code lost:
        A3N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0b0e, code lost:
        if (r3 < 0) goto L_0x0b10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0b10, code lost:
        A46(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0b14, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0b17, code lost:
        if (r3 == 0) goto L_0x0b19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0b19, code lost:
        A46(true);
        r0.A0t.A00(true);
        r1 = r0.A15.A00.edit();
        r1.remove("com.obwhatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ed, code lost:
        r1.A01(r8);
        A3M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0b32, code lost:
        if (r1.commit() == false) goto L_0x0b34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0b34, code lost:
        com.whatsapp.util.Log.e("VerifyPhoneNumberPrefs/clear-wa-old-retry-time/error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0b39, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0b3a, code lost:
        com.whatsapp.util.Log.w("verifyphonenumber/onSmsCodeRequestResponse/response is null");
        A3Z(300000, 0, false);
        A3Z(300000, 1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0b4f, code lost:
        if (A48() != false) goto L_0x0b51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0b51, code lost:
        A3Z(300000, 2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0b55, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0bb5, code lost:
        r0 = new java.lang.StringBuilder("VerifyPhoneNumber/updateRequestCodeButtons/Invalid method: ");
        r0.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r4 = java.lang.Long.parseLong(r4) * 1000;
        r0.A0A = r4;
        r0.A11.A0B(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0bc8, code lost:
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0105, code lost:
        if (r12 == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0107, code lost:
        r0.A0x.A03(getString(com.obwhatsapp.R.string.str13d7, new java.lang.Object[]{X.C28961Zl.A08(r0.A01, r0.A0A)}));
        r0.A15.A09(java.lang.System.currentTimeMillis() + r0.A0A);
        A3Z(r0.A0A, 2, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0133, code lost:
        r0.A0x.A03(getString(com.obwhatsapp.R.string.str13ce, new java.lang.Object[]{X.C28961Zl.A08(r0.A01, r0.A0A)}));
        r0.A15.A07(java.lang.System.currentTimeMillis() + r0.A0A);
        A3Z(r0.A0A, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x015f, code lost:
        com.whatsapp.util.Log.w("verifyphonenumber/request/sms/triedtoomanytimesallmethods/time-not-int", r4);
        r1 = r0.A0x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0167, code lost:
        if (r12 == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016a, code lost:
        r8 = 39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016f, code lost:
        if (r1 != X.AnonymousClass427.A0J) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0171, code lost:
        X.AnonymousClass00B.A06(r3);
        com.whatsapp.util.Log.w("verifyphonenumber/request/sms/too-many-tries-all-methods");
        X.AnonymousClass2JN.A0K(r0.A09, "server-send-request-too-many-tries-all-methods");
        r0.A14.A03("failTooMany");
        r0.A14.A02("verify-tma");
        r4 = r3.A0E;
        r8 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0199, code lost:
        if (X.AnonymousClass47P.A00(r4) == false) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r4 = java.lang.Long.parseLong(r4) * 1000;
        r0.A0A = r4;
        r0.A11.A0B(r4);
        r0.A1M = true;
        r0.A0x.A01(31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b5, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b6, code lost:
        r1 = "verifyphonenumber/request/sms/triedtoomanytimesallmethods/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01bd, code lost:
        if (r1 != X.AnonymousClass427.A04) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01bf, code lost:
        X.AnonymousClass2JN.A0K(r0.A09, "server-send-request-error-connectivity");
        A3t(getString(com.obwhatsapp.R.string.str1372, new java.lang.Object[]{getString(com.obwhatsapp.R.string.str053b)}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01e2, code lost:
        if (r1 != X.AnonymousClass427.A01) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e4, code lost:
        X.AnonymousClass00B.A06(r3);
        A3g(r3, r2, "server-send-request-bad-param");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01f1, code lost:
        if (r1 != X.AnonymousClass427.A09) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r2.equals(r4) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f3, code lost:
        A3x(r2, "server-send-request-missing-param");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01fd, code lost:
        if (r1 != X.AnonymousClass427.A0D) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ff, code lost:
        com.whatsapp.util.Log.w("verifyphonenumber/request/sms/version-too-old");
        r0.A0Y.A01 = true;
        A3W(8);
        A3T(22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0218, code lost:
        if (r1 != X.AnonymousClass427.A0L) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x021a, code lost:
        X.AnonymousClass00B.A06(r3);
        r4 = new java.lang.StringBuilder("verifyphonenumber/request/sms/too-recent wait ");
        r4.append(r3.A0E);
        r4.append(" seconds");
        com.whatsapp.util.Log.w(r4.toString());
        X.AnonymousClass2JN.A0K(r0.A09, "server-send-request-too-recent");
        r4 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0244, code lost:
        if (X.AnonymousClass47P.A00(r4) != false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0246, code lost:
        r4 = r0.A0x;
        r1 = com.obwhatsapp.R.string.str13af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r4 = java.lang.Long.parseLong(r4) * 1000;
        r0.A11.A0B(r4);
        r0.A0x.A03(getString(com.obwhatsapp.R.string.str13ae, new java.lang.Object[]{X.C28961Zl.A08(r0.A01, r4)}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0273, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0274, code lost:
        com.whatsapp.util.Log.w("verifyphonenumber/request/sms/too-recent/time-not-int", r4);
        r4 = r0.A0x;
        r1 = com.obwhatsapp.R.string.str13af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0283, code lost:
        if (r1 != X.AnonymousClass427.A03) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0285, code lost:
        A3w(r2, "server-send-request-user-blocked");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x028f, code lost:
        if (r1 != X.AnonymousClass427.A0A) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0291, code lost:
        X.AnonymousClass00B.A06(r3);
        A3y(r2, "server-send-request-next-method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (isFinishing() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x029e, code lost:
        if (r1 != X.AnonymousClass427.A0K) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02a0, code lost:
        X.AnonymousClass00B.A06(r3);
        com.whatsapp.util.Log.w("verifyphonenumber/request/sms/too-many-guesses");
        X.AnonymousClass2JN.A0K(r0.A09, "server-send-request-too-many-guesses");
        r0.A14.A03("failTooMany");
        r0.A14.A02("verify-tmg");
        r4 = r3.A0E;
        r8 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02c8, code lost:
        if (X.AnonymousClass47P.A00(r4) == false) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r4 = java.lang.Long.parseLong(r4) * 1000;
        r0.A0A = r4;
        r0.A11.A0B(r4);
        r0.A1M = true;
        r5 = r0.A0x;
        r1 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02e6, code lost:
        if (r2.equals("wa_old") == false) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02e8, code lost:
        r1 = 33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ea, code lost:
        r5.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02ef, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02f0, code lost:
        r1 = "verifyphonenumber/request/sms/too-many-guesses/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        X.AnonymousClass2JN.A00 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02f3, code lost:
        com.whatsapp.util.Log.w(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02f6, code lost:
        r0.A0x.A01(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ff, code lost:
        if (r1 != X.AnonymousClass427.A0E) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0301, code lost:
        X.AnonymousClass00B.A06(r3);
        r11 = r2.equals("wa_old");
        com.whatsapp.util.Log.e("verifyphonenumber/request/sms/provider-timeout");
        X.AnonymousClass2JN.A0K(r0.A09, "server-send-request-provider-timeout");
        r4 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x031f, code lost:
        if (X.AnonymousClass47P.A00(r4) != false) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0321, code lost:
        r4 = r0.A0x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0323, code lost:
        if (r11 == false) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0325, code lost:
        r1 = com.obwhatsapp.R.string.str13d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r1 != X.AnonymousClass427.A0N) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0b51  */
    /* JADX WARNING: Removed duplicated region for block: B:376:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:379:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AOn(X.C35061lJ r27, X.AnonymousClass427 r28, java.lang.String r29) {
        /*
            r26 = this;
            r2 = r29
            int r4 = r2.hashCode()
            r0 = r26
            r3 = r27
            r1 = r28
            switch(r4) {
                case -795576526: goto L_0x0010;
                case 114009: goto L_0x0014;
                case 97513456: goto L_0x0485;
                case 112386354: goto L_0x0488;
                case 1439178067: goto L_0x0b56;
                default: goto L_0x000f;
            }
        L_0x000f:
            return
        L_0x0010:
            java.lang.String r4 = "wa_old"
            goto L_0x0017
        L_0x0014:
            java.lang.String r4 = "sms"
        L_0x0017:
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x000f
            boolean r4 = r0.isFinishing()
            if (r4 != 0) goto L_0x000f
            java.lang.String r4 = ""
            X.AnonymousClass2JN.A00 = r4
            X.427 r4 = X.AnonymousClass427.OK
            if (r1 != r4) goto L_0x0035
            X.AnonymousClass00B.A06(r3)
            r0.A3f(r3, r2)
        L_0x0031:
            if (r27 == 0) goto L_0x0b3a
            goto L_0x04b0
        L_0x0035:
            X.427 r4 = X.AnonymousClass427.YES
            if (r1 == r4) goto L_0x03f0
            r0.A3O()
            java.lang.String r5 = "verifyphonenumber/error/status="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.427 r4 = X.AnonymousClass427.ERROR_TEMPORARILY_UNAVAILABLE
            if (r1 != r4) goto L_0x00a9
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "verifyphonenumber/request/sms/temp-unavail"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.0rz r4 = r0.A09
            java.lang.String r1 = "server-send-request-temp-unavailable"
            X.AnonymousClass2JN.A0K(r4, r1)
            java.lang.String r4 = r3.A0E
            boolean r1 = X.AnonymousClass47P.A00(r4)
            if (r1 != 0) goto L_0x0077
            X.4Ws r4 = r0.A0x
            r1 = 2131891115(0x7f1213ab, float:1.941694E38)
        L_0x0070:
            r4.A02(r1)
        L_0x0073:
            r0.A3I()
            goto L_0x0031
        L_0x0077:
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x009c }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            X.0yx r1 = r0.A11     // Catch:{ NumberFormatException -> 0x009c }
            r1.A0B(r4)     // Catch:{ NumberFormatException -> 0x009c }
            X.4Ws r9 = r0.A0x     // Catch:{ NumberFormatException -> 0x009c }
            r8 = 2131891116(0x7f1213ac, float:1.9416943E38)
            r1 = 1
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ NumberFormatException -> 0x009c }
            r6 = 0
            X.013 r1 = r0.A01     // Catch:{ NumberFormatException -> 0x009c }
            java.lang.String r1 = X.C28961Zl.A08(r1, r4)     // Catch:{ NumberFormatException -> 0x009c }
            r7[r6] = r1     // Catch:{ NumberFormatException -> 0x009c }
            java.lang.String r1 = r0.getString(r8, r7)     // Catch:{ NumberFormatException -> 0x009c }
            r9.A03(r1)     // Catch:{ NumberFormatException -> 0x009c }
            goto L_0x0073
        L_0x009c:
            r4 = move-exception
            java.lang.String r1 = "verifyphonenumber/request/sms/temporarily-unavailable/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r1, r4)
            X.4Ws r4 = r0.A0x
            r1 = 2131891115(0x7f1213ab, float:1.941694E38)
            goto L_0x0070
        L_0x00a9:
            X.427 r4 = X.AnonymousClass427.ERROR_UNSPECIFIED
            if (r1 != r4) goto L_0x00b4
            java.lang.String r1 = "server-send-request-error-unspecified"
            r0.A3z(r2, r1)
            goto L_0x0073
        L_0x00b4:
            X.427 r4 = X.AnonymousClass427.ERROR_TOO_MANY
            if (r1 != r4) goto L_0x016d
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "verifyphonenumber/request/sms/too-many-tries"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.lang.String r1 = "wa_old"
            boolean r12 = r2.equals(r1)
            X.0rz r4 = r0.A09
            java.lang.String r1 = "server-send-request-too-many-tries"
            X.AnonymousClass2JN.A0K(r4, r1)
            X.12L r4 = r0.A14
            java.lang.String r1 = "failTooMany"
            r4.A03(r1)
            X.12L r4 = r0.A14
            java.lang.String r1 = "verify-tma"
            r4.A02(r1)
            java.lang.String r4 = r3.A0E
            boolean r1 = X.AnonymousClass47P.A00(r4)
            r8 = 40
            if (r1 != 0) goto L_0x00f5
            X.4Ws r1 = r0.A0x
            if (r12 == 0) goto L_0x016a
        L_0x00ed:
            r1.A01(r8)
            r0.A3M()
            goto L_0x04b0
        L_0x00f5:
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x015e }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.A0A = r4     // Catch:{ NumberFormatException -> 0x015e }
            X.0yx r1 = r0.A11     // Catch:{ NumberFormatException -> 0x015e }
            r1.A0B(r4)     // Catch:{ NumberFormatException -> 0x015e }
            r9 = 0
            r1 = 1
            if (r12 == 0) goto L_0x0133
            X.4Ws r11 = r0.A0x     // Catch:{ NumberFormatException -> 0x015e }
            r10 = 2131891159(0x7f1213d7, float:1.941703E38)
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ NumberFormatException -> 0x015e }
            X.013 r6 = r0.A01     // Catch:{ NumberFormatException -> 0x015e }
            long r4 = r0.A0A     // Catch:{ NumberFormatException -> 0x015e }
            java.lang.String r4 = X.C28961Zl.A08(r6, r4)     // Catch:{ NumberFormatException -> 0x015e }
            r7[r9] = r4     // Catch:{ NumberFormatException -> 0x015e }
            java.lang.String r4 = r0.getString(r10, r7)     // Catch:{ NumberFormatException -> 0x015e }
            r11.A03(r4)     // Catch:{ NumberFormatException -> 0x015e }
            X.4XR r9 = r0.A15     // Catch:{ NumberFormatException -> 0x015e }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x015e }
            long r6 = r0.A0A     // Catch:{ NumberFormatException -> 0x015e }
            long r4 = r4 + r6
            r9.A09(r4)     // Catch:{ NumberFormatException -> 0x015e }
            long r4 = r0.A0A     // Catch:{ NumberFormatException -> 0x015e }
            r6 = 2
            r0.A3Z(r4, r6, r1)     // Catch:{ NumberFormatException -> 0x015e }
            goto L_0x04b0
        L_0x0133:
            X.4Ws r11 = r0.A0x     // Catch:{ NumberFormatException -> 0x015e }
            r10 = 2131891150(0x7f1213ce, float:1.9417012E38)
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ NumberFormatException -> 0x015e }
            X.013 r6 = r0.A01     // Catch:{ NumberFormatException -> 0x015e }
            long r4 = r0.A0A     // Catch:{ NumberFormatException -> 0x015e }
            java.lang.String r4 = X.C28961Zl.A08(r6, r4)     // Catch:{ NumberFormatException -> 0x015e }
            r7[r9] = r4     // Catch:{ NumberFormatException -> 0x015e }
            java.lang.String r4 = r0.getString(r10, r7)     // Catch:{ NumberFormatException -> 0x015e }
            r11.A03(r4)     // Catch:{ NumberFormatException -> 0x015e }
            X.4XR r10 = r0.A15     // Catch:{ NumberFormatException -> 0x015e }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x015e }
            long r4 = r0.A0A     // Catch:{ NumberFormatException -> 0x015e }
            long r6 = r6 + r4
            r10.A07(r6)     // Catch:{ NumberFormatException -> 0x015e }
            long r4 = r0.A0A     // Catch:{ NumberFormatException -> 0x015e }
            r0.A3Z(r4, r9, r1)     // Catch:{ NumberFormatException -> 0x015e }
            goto L_0x04b0
        L_0x015e:
            r4 = move-exception
            java.lang.String r1 = "verifyphonenumber/request/sms/triedtoomanytimesallmethods/time-not-int"
            com.whatsapp.util.Log.w(r1, r4)
            X.4Ws r1 = r0.A0x
            if (r12 == 0) goto L_0x016a
            goto L_0x00ed
        L_0x016a:
            r8 = 39
            goto L_0x00ed
        L_0x016d:
            X.427 r4 = X.AnonymousClass427.ERROR_TOO_MANY_ALL_METHODS
            if (r1 != r4) goto L_0x01bb
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "verifyphonenumber/request/sms/too-many-tries-all-methods"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.0rz r4 = r0.A09
            java.lang.String r1 = "server-send-request-too-many-tries-all-methods"
            X.AnonymousClass2JN.A0K(r4, r1)
            X.12L r4 = r0.A14
            java.lang.String r1 = "failTooMany"
            r4.A03(r1)
            X.12L r4 = r0.A14
            java.lang.String r1 = "verify-tma"
            r4.A02(r1)
            java.lang.String r4 = r3.A0E
            boolean r1 = X.AnonymousClass47P.A00(r4)
            r8 = 27
            if (r1 == 0) goto L_0x02f6
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x01b5 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.A0A = r4     // Catch:{ NumberFormatException -> 0x01b5 }
            X.0yx r1 = r0.A11     // Catch:{ NumberFormatException -> 0x01b5 }
            r1.A0B(r4)     // Catch:{ NumberFormatException -> 0x01b5 }
            r1 = 1
            r0.A1M = r1     // Catch:{ NumberFormatException -> 0x01b5 }
            X.4Ws r4 = r0.A0x     // Catch:{ NumberFormatException -> 0x01b5 }
            r1 = 31
            r4.A01(r1)     // Catch:{ NumberFormatException -> 0x01b5 }
            goto L_0x0073
        L_0x01b5:
            r4 = move-exception
            java.lang.String r1 = "verifyphonenumber/request/sms/triedtoomanytimesallmethods/time-not-int"
            goto L_0x02f3
        L_0x01bb:
            X.427 r4 = X.AnonymousClass427.ERROR_CONNECTIVITY
            if (r1 != r4) goto L_0x01e0
            X.0rz r4 = r0.A09
            java.lang.String r1 = "server-send-request-error-connectivity"
            X.AnonymousClass2JN.A0K(r4, r1)
            r6 = 2131891058(0x7f121372, float:1.9416825E38)
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r4 = r0.getString(r1)
            r1 = 0
            r5[r1] = r4
            java.lang.String r1 = r0.getString(r6, r5)
            r0.A3t(r1)
            goto L_0x0073
        L_0x01e0:
            X.427 r4 = X.AnonymousClass427.ERROR_BAD_PARAMETER
            if (r1 != r4) goto L_0x01ef
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "server-send-request-bad-param"
            r0.A3g(r3, r2, r1)
            goto L_0x0031
        L_0x01ef:
            X.427 r4 = X.AnonymousClass427.ERROR_MISSING_PARAMETER
            if (r1 != r4) goto L_0x01fb
            java.lang.String r1 = "server-send-request-missing-param"
            r0.A3x(r2, r1)
            goto L_0x0073
        L_0x01fb:
            X.427 r4 = X.AnonymousClass427.ERROR_OLD_VERSION
            if (r1 != r4) goto L_0x0216
            java.lang.String r1 = "verifyphonenumber/request/sms/version-too-old"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.0xR r4 = r0.A0Y
            r1 = 1
            r4.A01 = r1
            r1 = 8
            r0.A3W(r1)
            r1 = 22
            r0.A3T(r1)
            goto L_0x0031
        L_0x0216:
            X.427 r4 = X.AnonymousClass427.ERROR_TOO_RECENT
            if (r1 != r4) goto L_0x0281
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "verifyphonenumber/request/sms/too-recent wait "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = r3.A0E
            r4.append(r1)
            java.lang.String r1 = " seconds"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.0rz r4 = r0.A09
            java.lang.String r1 = "server-send-request-too-recent"
            X.AnonymousClass2JN.A0K(r4, r1)
            java.lang.String r4 = r3.A0E
            boolean r1 = X.AnonymousClass47P.A00(r4)
            if (r1 != 0) goto L_0x024d
            X.4Ws r4 = r0.A0x
            r1 = 2131891119(0x7f1213af, float:1.941695E38)
            goto L_0x0070
        L_0x024d:
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0273 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            X.0yx r1 = r0.A11     // Catch:{ NumberFormatException -> 0x0273 }
            r1.A0B(r4)     // Catch:{ NumberFormatException -> 0x0273 }
            X.4Ws r9 = r0.A0x     // Catch:{ NumberFormatException -> 0x0273 }
            r8 = 2131891118(0x7f1213ae, float:1.9416947E38)
            r1 = 1
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ NumberFormatException -> 0x0273 }
            r6 = 0
            X.013 r1 = r0.A01     // Catch:{ NumberFormatException -> 0x0273 }
            java.lang.String r1 = X.C28961Zl.A08(r1, r4)     // Catch:{ NumberFormatException -> 0x0273 }
            r7[r6] = r1     // Catch:{ NumberFormatException -> 0x0273 }
            java.lang.String r1 = r0.getString(r8, r7)     // Catch:{ NumberFormatException -> 0x0273 }
            r9.A03(r1)     // Catch:{ NumberFormatException -> 0x0273 }
            goto L_0x0073
        L_0x0273:
            r4 = move-exception
            java.lang.String r1 = "verifyphonenumber/request/sms/too-recent/time-not-int"
            com.whatsapp.util.Log.w(r1, r4)
            X.4Ws r4 = r0.A0x
            r1 = 2131891119(0x7f1213af, float:1.941695E38)
            goto L_0x0070
        L_0x0281:
            X.427 r4 = X.AnonymousClass427.ERROR_BLOCKED
            if (r1 != r4) goto L_0x028d
            java.lang.String r1 = "server-send-request-user-blocked"
            r0.A3w(r2, r1)
            goto L_0x0073
        L_0x028d:
            X.427 r4 = X.AnonymousClass427.ERROR_NEXT_METHOD
            if (r1 != r4) goto L_0x029c
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "server-send-request-next-method"
            r0.A3y(r2, r1)
            goto L_0x0031
        L_0x029c:
            X.427 r4 = X.AnonymousClass427.ERROR_TOO_MANY_GUESSES
            if (r1 != r4) goto L_0x02fd
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "verifyphonenumber/request/sms/too-many-guesses"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.0rz r4 = r0.A09
            java.lang.String r1 = "server-send-request-too-many-guesses"
            X.AnonymousClass2JN.A0K(r4, r1)
            X.12L r4 = r0.A14
            java.lang.String r1 = "failTooMany"
            r4.A03(r1)
            X.12L r4 = r0.A14
            java.lang.String r1 = "verify-tmg"
            r4.A02(r1)
            java.lang.String r4 = r3.A0E
            boolean r1 = X.AnonymousClass47P.A00(r4)
            r8 = 28
            if (r1 == 0) goto L_0x02f6
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x02ef }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.A0A = r4     // Catch:{ NumberFormatException -> 0x02ef }
            X.0yx r1 = r0.A11     // Catch:{ NumberFormatException -> 0x02ef }
            r1.A0B(r4)     // Catch:{ NumberFormatException -> 0x02ef }
            r1 = 1
            r0.A1M = r1     // Catch:{ NumberFormatException -> 0x02ef }
            X.4Ws r5 = r0.A0x     // Catch:{ NumberFormatException -> 0x02ef }
            java.lang.String r1 = "wa_old"
            boolean r4 = r2.equals(r1)     // Catch:{ NumberFormatException -> 0x02ef }
            r1 = 32
            if (r4 == 0) goto L_0x02ea
            r1 = 33
        L_0x02ea:
            r5.A01(r1)     // Catch:{ NumberFormatException -> 0x02ef }
            goto L_0x0073
        L_0x02ef:
            r4 = move-exception
            java.lang.String r1 = "verifyphonenumber/request/sms/too-many-guesses/time-not-int"
        L_0x02f3:
            com.whatsapp.util.Log.w(r1, r4)
        L_0x02f6:
            X.4Ws r1 = r0.A0x
            r1.A01(r8)
            goto L_0x0073
        L_0x02fd:
            X.427 r4 = X.AnonymousClass427.ERROR_PROVIDER_TIMEOUT
            if (r1 != r4) goto L_0x0373
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "wa_old"
            boolean r11 = r2.equals(r1)
            java.lang.String r1 = "verifyphonenumber/request/sms/provider-timeout"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.0rz r4 = r0.A09
            java.lang.String r1 = "server-send-request-provider-timeout"
            X.AnonymousClass2JN.A0K(r4, r1)
            java.lang.String r4 = r3.A0E
            boolean r1 = X.AnonymousClass47P.A00(r4)
            if (r1 != 0) goto L_0x032a
            X.4Ws r4 = r0.A0x
            if (r11 == 0) goto L_0x036e
        L_0x0325:
            r1 = 2131891161(0x7f1213d9, float:1.9417034E38)
            goto L_0x0070
        L_0x032a:
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0362 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r4
            X.0yx r1 = r0.A11     // Catch:{ NumberFormatException -> 0x0362 }
            r1.A0B(r6)     // Catch:{ NumberFormatException -> 0x0362 }
            X.4Ws r10 = r0.A0x     // Catch:{ NumberFormatException -> 0x0362 }
            r5 = 2131891108(0x7f1213a4, float:1.9416927E38)
            if (r11 == 0) goto L_0x0340
            r5 = 2131891160(0x7f1213d8, float:1.9417032E38)
        L_0x0340:
            r9 = 1
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ NumberFormatException -> 0x0362 }
            X.013 r1 = r0.A01     // Catch:{ NumberFormatException -> 0x0362 }
            java.lang.String r1 = X.C28961Zl.A08(r1, r6)     // Catch:{ NumberFormatException -> 0x0362 }
            r8 = 0
            r4[r8] = r1     // Catch:{ NumberFormatException -> 0x0362 }
            java.lang.String r1 = r0.getString(r5, r4)     // Catch:{ NumberFormatException -> 0x0362 }
            r10.A03(r1)     // Catch:{ NumberFormatException -> 0x0362 }
            X.4XR r1 = r0.A15     // Catch:{ NumberFormatException -> 0x0362 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0362 }
            long r4 = r4 + r6
            r1.A07(r4)     // Catch:{ NumberFormatException -> 0x0362 }
            r0.A3Z(r6, r8, r9)     // Catch:{ NumberFormatException -> 0x0362 }
            goto L_0x0073
        L_0x0362:
            r4 = move-exception
            java.lang.String r1 = "verifyphonenumber/request/sms/too-recent/time-not-int"
            com.whatsapp.util.Log.w(r1, r4)
            X.4Ws r4 = r0.A0x
            if (r11 == 0) goto L_0x036e
            goto L_0x0325
        L_0x036e:
            r1 = 2131891109(0x7f1213a5, float:1.9416929E38)
            goto L_0x0070
        L_0x0373:
            X.427 r4 = X.AnonymousClass427.ERROR_PROVIDER_UNROUTABLE
            if (r1 != r4) goto L_0x038b
            X.AnonymousClass00B.A06(r3)
            r8 = 2131891111(0x7f1213a7, float:1.9416933E38)
            r9 = 2131891110(0x7f1213a6, float:1.941693E38)
            java.lang.String r7 = "server-send-request-provider-unroutable"
            r4 = r0
            r5 = r3
            r6 = r2
            r4.A3h(r5, r6, r7, r8, r9)
            goto L_0x0031
        L_0x038b:
            X.427 r4 = X.AnonymousClass427.ERROR_NO_ROUTES
            if (r1 != r4) goto L_0x03a5
            X.AnonymousClass00B.A06(r3)
            r9 = 2131891111(0x7f1213a7, float:1.9416933E38)
            r10 = 2131891110(0x7f1213a6, float:1.941693E38)
            java.lang.String r7 = "server-send-request-no-routes"
            java.lang.String r8 = "noRouteSms"
            r4 = r0
            r5 = r3
            r6 = r2
            r4.A3i(r5, r6, r7, r8, r9, r10)
            goto L_0x0031
        L_0x03a5:
            X.427 r4 = X.AnonymousClass427.ERROR_BAD_TOKEN
            if (r1 == r4) goto L_0x03ca
            X.427 r4 = X.AnonymousClass427.ERROR_INVALID_SKEY_SIGNATURE
            if (r1 == r4) goto L_0x03ca
            X.427 r4 = X.AnonymousClass427.SECURITY_CODE
            if (r1 != r4) goto L_0x03b9
            X.AnonymousClass00B.A06(r3)
            r0.A3e(r3, r2)
            goto L_0x0031
        L_0x03b9:
            X.427 r7 = X.AnonymousClass427.ERROR_DEVICE_CONFIRM_OR_SECOND_OTP
            if (r1 == r7) goto L_0x03d2
            X.427 r4 = X.AnonymousClass427.ERROR_SECOND_OTP
            if (r1 == r4) goto L_0x03d2
            X.427 r4 = X.AnonymousClass427.ERROR_NOT_ALLOWED
            if (r1 != r4) goto L_0x0031
            r0.A3s(r2)
            goto L_0x0031
        L_0x03ca:
            java.lang.String r4 = "server-send-request-bad-token"
            r0.A3j(r1, r2, r4)
            goto L_0x0031
        L_0x03d2:
            X.AnonymousClass00B.A06(r3)
            java.lang.String r6 = r3.A0F
            r4 = 0
            long r8 = X.AnonymousClass2JN.A02(r6, r4)
            java.lang.String r6 = r3.A0G
            long r10 = X.AnonymousClass2JN.A02(r6, r4)
            r12 = 0
            if (r1 != r7) goto L_0x03e7
            r12 = 1
        L_0x03e7:
            java.lang.String r7 = "sms"
            r6 = r0
            r6.A3v(r7, r8, r10, r12)
            goto L_0x04b0
        L_0x03f0:
            X.AnonymousClass00B.A06(r3)
            java.lang.String r1 = "verifyphonenumber/request/sms/requested"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0sC r1 = r0.A09
            int r1 = r1.A00()
            boolean r1 = X.AnonymousClass3AS.A00(r1)
            if (r1 == 0) goto L_0x0451
            r1 = 3
            r0.A3R(r1)
            boolean r1 = r0.A1J
            if (r1 != 0) goto L_0x0451
            X.3AS r1 = r0.A0p
            r6 = 1
            X.1Pl r1 = r1.A02
            X.1Pk r5 = r1.A06
            java.lang.String r4 = "AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0u3 r4 = r5.A01
            java.lang.String r1 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r1 = r4.A00(r1)
            android.content.SharedPreferences$Editor r4 = r1.edit()
            java.lang.String r1 = "com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once"
            r4.putBoolean(r1, r6)
            boolean r1 = r4.commit()
            if (r1 != 0) goto L_0x0441
            java.lang.String r1 = "AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/error"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0441:
            r0.A1J = r6
            X.4Rq r5 = r0.A0s
            r1 = 2131892638(0x7f12199e, float:1.942003E38)
            java.lang.String r4 = r0.getString(r1)
            android.widget.Button r1 = r5.A02
            r1.setText(r4)
        L_0x0451:
            int r5 = r3.A01
            if (r5 <= 0) goto L_0x0466
            A1T = r5
            X.0rz r1 = r0.A09
            android.content.SharedPreferences$Editor r4 = r1.A0K()
            java.lang.String r1 = "registration_sms_code_length"
            android.content.SharedPreferences$Editor r1 = r4.putInt(r1, r5)
            r1.apply()
        L_0x0466:
            java.lang.String r4 = r3.A0C
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x047a
            long r4 = java.lang.Long.parseLong(r4)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            X.0yx r1 = r0.A11
            r1.A0B(r4)
        L_0x047a:
            r0.A3N()
            X.0rz r4 = r0.A09
            int r1 = r0.A03
            r4.A0k(r1)
            goto L_0x04b0
        L_0x0485:
            java.lang.String r4 = "flash"
            goto L_0x048b
        L_0x0488:
            java.lang.String r4 = "voice"
        L_0x048b:
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x000f
            java.lang.String r4 = ""
            X.AnonymousClass2JN.A00 = r4
            X.427 r4 = X.AnonymousClass427.OK
            if (r1 != r4) goto L_0x0572
            X.AnonymousClass00B.A06(r3)
            r0.A3f(r3, r2)
        L_0x049f:
            r0.A3u(r2)
            if (r27 == 0) goto L_0x0b3a
            java.lang.String r4 = "flash"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x04b0
            X.427 r4 = X.AnonymousClass427.ERROR_FLASH_CALL_DISABLED
            if (r1 == r4) goto L_0x000f
        L_0x04b0:
            java.lang.String r4 = "VerifyPhoneNumber/updateRequestCodeButtons: method:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = "sms"
            boolean r1 = r2.equals(r1)
            r9 = 1000(0x3e8, double:4.94E-321)
            r4 = -1
            if (r1 == 0) goto L_0x0534
            java.lang.String r1 = r3.A0F
            if (r1 != 0) goto L_0x04d4
            java.lang.String r1 = r3.A0E
        L_0x04d4:
            long r6 = X.AnonymousClass2JN.A02(r1, r4)
            long r6 = r6 * r9
            java.lang.String r1 = r3.A0G
        L_0x04db:
            long r1 = X.AnonymousClass2JN.A02(r1, r4)
            long r1 = r1 * r9
            java.lang.String r8 = r3.A0H
        L_0x04e2:
            long r3 = X.AnonymousClass2JN.A02(r8, r4)
            long r3 = r3 * r9
            int r5 = r0.A35()
            boolean r5 = X.AnonymousClass3AS.A00(r5)
            if (r5 == 0) goto L_0x04f6
            X.3AS r5 = r0.A0p
            r5.A02(r6, r1)
        L_0x04f6:
            r0.A3b(r6, r6)
            r0.A3c(r1, r1)
            boolean r1 = r0.A48()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = "VerifyPhoneNumber/updateWAOldGroupUI/originalSmsWaitTime="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r3)
            java.lang.String r1 = ", remainingSmsWaitTime="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r5 = 0
            r2 = 1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0b0c
            r0.A46(r2)
            r1 = 2
            r0.A3Z(r3, r1, r2)
            X.4XR r2 = r0.A15
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r3 + r0
            r2.A09(r3)
            return
        L_0x0534:
            java.lang.String r1 = "voice"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0563
            java.lang.String r1 = "flash"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0563
            java.lang.String r1 = "wa_old"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0bb5
            java.lang.String r1 = r3.A0F
            long r6 = X.AnonymousClass2JN.A02(r1, r4)
            long r6 = r6 * r9
            java.lang.String r1 = r3.A0G
            long r1 = X.AnonymousClass2JN.A02(r1, r4)
            long r1 = r1 * r9
            java.lang.String r8 = r3.A0H
            if (r8 != 0) goto L_0x04e2
            java.lang.String r8 = r3.A0E
            goto L_0x04e2
        L_0x0563:
            java.lang.String r1 = r3.A0F
            long r6 = X.AnonymousClass2JN.A02(r1, r4)
            long r6 = r6 * r9
            java.lang.String r1 = r3.A0G
            if (r1 != 0) goto L_0x04db
            java.lang.String r1 = r3.A0E
            goto L_0x04db
        L_0x0572:
            X.427 r4 = X.AnonymousClass427.YES
            if (r1 == r4) goto L_0x09f9
            java.lang.String r8 = "verifyvoice/request/"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r2)
            java.lang.String r4 = "/error/status="
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.427 r4 = X.AnonymousClass427.ERROR_TEMPORARILY_UNAVAILABLE
            if (r1 != r4) goto L_0x062f
            X.AnonymousClass00B.A06(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r2)
            java.lang.String r4 = "/temp-unavail"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r4)
            X.0rz r5 = r0.A09
            java.lang.String r4 = "voice-temp-unavail"
            X.AnonymousClass2JN.A0K(r5, r4)
            java.lang.String r5 = r3.A0E
            boolean r4 = X.AnonymousClass47P.A00(r5)
            if (r4 != 0) goto L_0x05e5
            r4 = 2131891115(0x7f1213ab, float:1.941694E38)
        L_0x05be:
            java.lang.String r4 = r0.getString(r4)
        L_0x05c2:
            r0.A3t(r4)
        L_0x05c5:
            java.lang.String r4 = "flash"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x05df
            X.0sC r4 = r0.A09
            int r5 = r4.A00()
            r4 = 8
            if (r5 == r4) goto L_0x05df
            X.0rz r5 = r0.A09
            java.lang.String r4 = "secondary_failed"
            r5.A0w(r4)
        L_0x05df:
            r4 = -1
            r0.A3S(r4)
            goto L_0x049f
        L_0x05e5:
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0613 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.A3Y(r4)     // Catch:{ NumberFormatException -> 0x0613 }
            r11 = 2131891116(0x7f1213ac, float:1.9416943E38)
            r10 = 1
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ NumberFormatException -> 0x0613 }
            r7 = 0
            X.013 r6 = r0.A01     // Catch:{ NumberFormatException -> 0x0613 }
            java.lang.String r6 = X.C28961Zl.A08(r6, r4)     // Catch:{ NumberFormatException -> 0x0613 }
            r9[r7] = r6     // Catch:{ NumberFormatException -> 0x0613 }
            java.lang.String r6 = r0.getString(r11, r9)     // Catch:{ NumberFormatException -> 0x0613 }
            r0.A3t(r6)     // Catch:{ NumberFormatException -> 0x0613 }
            X.4XR r9 = r0.A15     // Catch:{ NumberFormatException -> 0x0613 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0613 }
            long r6 = r6 + r4
            r9.A08(r6)     // Catch:{ NumberFormatException -> 0x0613 }
            r0.A3Z(r4, r10, r10)     // Catch:{ NumberFormatException -> 0x0613 }
            goto L_0x05c5
        L_0x0613:
            r6 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r2)
            java.lang.String r4 = "/temporarily-unavailable/unable-to-parse-retryAfter"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w(r4, r6)
            r4 = 2131891115(0x7f1213ab, float:1.941694E38)
            goto L_0x05be
        L_0x062f:
            X.427 r4 = X.AnonymousClass427.ERROR_UNSPECIFIED
            if (r1 != r4) goto L_0x063a
            java.lang.String r4 = "voice-error"
            r0.A3z(r2, r4)
            goto L_0x05c5
        L_0x063a:
            X.427 r4 = X.AnonymousClass427.ERROR_TOO_MANY
            if (r1 != r4) goto L_0x06d5
            X.AnonymousClass00B.A06(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r2)
            java.lang.String r4 = "/too-many-tries"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r4)
            X.0rz r5 = r0.A09
            java.lang.String r4 = "voice-error-too-many-tries"
            X.AnonymousClass2JN.A0K(r5, r4)
            X.12L r5 = r0.A14
            java.lang.String r4 = "failTooMany"
            r5.A03(r4)
            X.12L r5 = r0.A14
            java.lang.String r4 = "verify-tma"
            r5.A02(r4)
            java.lang.String r5 = r3.A0E
            boolean r4 = X.AnonymousClass47P.A00(r5)
            r9 = 26
            if (r4 != 0) goto L_0x067e
            r0.A3V(r9)
            r0.A3M()
            goto L_0x05c5
        L_0x067e:
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x06b5 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.A0A = r4     // Catch:{ NumberFormatException -> 0x06b5 }
            r0.A3Y(r4)     // Catch:{ NumberFormatException -> 0x06b5 }
            r12 = 2131891150(0x7f1213ce, float:1.9417012E38)
            r11 = 1
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ NumberFormatException -> 0x06b5 }
            r7 = 0
            X.013 r6 = r0.A01     // Catch:{ NumberFormatException -> 0x06b5 }
            long r4 = r0.A0A     // Catch:{ NumberFormatException -> 0x06b5 }
            java.lang.String r4 = X.C28961Zl.A08(r6, r4)     // Catch:{ NumberFormatException -> 0x06b5 }
            r10[r7] = r4     // Catch:{ NumberFormatException -> 0x06b5 }
            java.lang.String r4 = r0.getString(r12, r10)     // Catch:{ NumberFormatException -> 0x06b5 }
            r0.A3t(r4)     // Catch:{ NumberFormatException -> 0x06b5 }
            X.4XR r10 = r0.A15     // Catch:{ NumberFormatException -> 0x06b5 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x06b5 }
            long r6 = r0.A0A     // Catch:{ NumberFormatException -> 0x06b5 }
            long r4 = r4 + r6
            r10.A08(r4)     // Catch:{ NumberFormatException -> 0x06b5 }
            long r4 = r0.A0A     // Catch:{ NumberFormatException -> 0x06b5 }
            r0.A3Z(r4, r11, r11)     // Catch:{ NumberFormatException -> 0x06b5 }
            goto L_0x05c5
        L_0x06b5:
            r6 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r2)
            java.lang.String r4 = "/triedtoomanytimesallmethods/time-not-int"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w(r4, r6)
            r0.A3V(r9)
            r0.A3M()
            goto L_0x05c5
        L_0x06d5:
            X.427 r4 = X.AnonymousClass427.ERROR_TOO_MANY_ALL_METHODS
            if (r1 != r4) goto L_0x0746
            X.AnonymousClass00B.A06(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r2)
            java.lang.String r4 = "/too-many-tries-all-methods"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r4)
            X.0rz r5 = r0.A09
            java.lang.String r4 = "voice-error-too-many-tries-all-methods"
            X.AnonymousClass2JN.A0K(r5, r4)
            X.12L r5 = r0.A14
            java.lang.String r4 = "failTooMany"
            r5.A03(r4)
            X.12L r5 = r0.A14
            java.lang.String r4 = "verify-tma"
            r5.A02(r4)
            java.lang.String r5 = r3.A0E
            boolean r4 = X.AnonymousClass47P.A00(r5)
            r9 = 27
            if (r4 == 0) goto L_0x08c1
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0736 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.A0A = r4     // Catch:{ NumberFormatException -> 0x0736 }
            r0.A3Y(r4)     // Catch:{ NumberFormatException -> 0x0736 }
            r4 = 31
            r0.A3V(r4)     // Catch:{ NumberFormatException -> 0x0736 }
            X.4XR r10 = r0.A15     // Catch:{ NumberFormatException -> 0x0736 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0736 }
            long r6 = r0.A0A     // Catch:{ NumberFormatException -> 0x0736 }
            long r4 = r4 + r6
            r10.A08(r4)     // Catch:{ NumberFormatException -> 0x0736 }
            long r4 = r0.A0A     // Catch:{ NumberFormatException -> 0x0736 }
            r6 = 1
            r0.A3Z(r4, r6, r6)     // Catch:{ NumberFormatException -> 0x0736 }
            goto L_0x05c5
        L_0x0736:
            r6 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r2)
            java.lang.String r4 = "/triedtoomanytimesallmethods/time-not-int"
            goto L_0x08b7
        L_0x0746:
            X.427 r4 = X.AnonymousClass427.ERROR_CONNECTIVITY
            if (r1 != r4) goto L_0x0760
            r7 = 2131891058(0x7f121372, float:1.9416825E38)
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r4 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r5 = r0.getString(r4)
            r4 = 0
            r6[r4] = r5
            java.lang.String r4 = r0.getString(r7, r6)
            goto L_0x05c2
        L_0x0760:
            X.427 r4 = X.AnonymousClass427.ERROR_BAD_PARAMETER
            if (r1 != r4) goto L_0x076f
            X.AnonymousClass00B.A06(r3)
            java.lang.String r4 = "voice-bad-param"
            r0.A3g(r3, r2, r4)
            goto L_0x05c5
        L_0x076f:
            X.427 r4 = X.AnonymousClass427.ERROR_MISSING_PARAMETER
            if (r1 != r4) goto L_0x077b
            java.lang.String r4 = "voice-missing-param"
            r0.A3x(r2, r4)
            goto L_0x05c5
        L_0x077b:
            X.427 r4 = X.AnonymousClass427.ERROR_OLD_VERSION
            if (r1 != r4) goto L_0x07ac
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r2)
            java.lang.String r4 = "/version-too-old"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r4)
            X.0rz r5 = r0.A09
            java.lang.String r4 = "voice-version-too-old"
            X.AnonymousClass2JN.A0K(r5, r4)
            X.0sC r4 = r0.A09
            int r5 = r4.A00()
            r4 = 8
            if (r5 == r4) goto L_0x05c5
            r4 = 22
            r0.A3T(r4)
            goto L_0x05c5
        L_0x07ac:
            X.427 r4 = X.AnonymousClass427.ERROR_TOO_RECENT
            if (r1 != r4) goto L_0x082d
            X.AnonymousClass00B.A06(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r2)
            java.lang.String r4 = "/too-recent "
            r5.append(r4)
            java.lang.String r4 = r3.A0E
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r4)
            X.0rz r5 = r0.A09
            java.lang.String r4 = "voice-too-recent"
            X.AnonymousClass2JN.A0K(r5, r4)
            java.lang.String r5 = r3.A0E
            boolean r4 = X.AnonymousClass47P.A00(r5)
            if (r4 != 0) goto L_0x07e1
            r4 = 2131891119(0x7f1213af, float:1.941695E38)
            goto L_0x05be
        L_0x07e1:
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0810 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.A3Y(r4)     // Catch:{ NumberFormatException -> 0x0810 }
            r11 = 2131891118(0x7f1213ae, float:1.9416947E38)
            r10 = 1
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ NumberFormatException -> 0x0810 }
            r7 = 0
            X.013 r6 = r0.A01     // Catch:{ NumberFormatException -> 0x0810 }
            java.lang.String r6 = X.C28961Zl.A08(r6, r4)     // Catch:{ NumberFormatException -> 0x0810 }
            r9[r7] = r6     // Catch:{ NumberFormatException -> 0x0810 }
            java.lang.String r6 = r0.getString(r11, r9)     // Catch:{ NumberFormatException -> 0x0810 }
            r0.A3t(r6)     // Catch:{ NumberFormatException -> 0x0810 }
            X.4XR r9 = r0.A15     // Catch:{ NumberFormatException -> 0x0810 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0810 }
            long r6 = r6 + r4
            r9.A08(r6)     // Catch:{ NumberFormatException -> 0x0810 }
            r0.A3Z(r4, r10, r10)     // Catch:{ NumberFormatException -> 0x0810 }
            goto L_0x05c5
        L_0x0810:
            r6 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r2)
            java.lang.String r4 = "/too-recent/time-not-int"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w(r4, r6)
            r4 = 2131891119(0x7f1213af, float:1.941695E38)
            goto L_0x05be
        L_0x082d:
            X.427 r4 = X.AnonymousClass427.ERROR_BLOCKED
            if (r1 != r4) goto L_0x0839
            java.lang.String r4 = "voice-blocked"
            r0.A3w(r2, r4)
            goto L_0x05c5
        L_0x0839:
            X.427 r4 = X.AnonymousClass427.ERROR_NEXT_METHOD
            if (r1 != r4) goto L_0x0848
            X.AnonymousClass00B.A06(r3)
            java.lang.String r4 = "voice-next-method"
            r0.A3y(r2, r4)
            goto L_0x05c5
        L_0x0848:
            X.427 r4 = X.AnonymousClass427.ERROR_TOO_MANY_GUESSES
            if (r1 != r4) goto L_0x08c6
            X.AnonymousClass00B.A06(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r2)
            java.lang.String r4 = "/too-many-guesses"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r4)
            X.0rz r5 = r0.A09
            java.lang.String r4 = "voice-too-many-guesses"
            X.AnonymousClass2JN.A0K(r5, r4)
            X.12L r5 = r0.A14
            java.lang.String r4 = "failTooMany"
            r5.A03(r4)
            X.12L r5 = r0.A14
            java.lang.String r4 = "verify-tmg"
            r5.A02(r4)
            java.lang.String r5 = r3.A0E
            boolean r4 = X.AnonymousClass47P.A00(r5)
            r9 = 28
            if (r4 == 0) goto L_0x08c1
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x08a9 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.A0A = r4     // Catch:{ NumberFormatException -> 0x08a9 }
            r0.A3Y(r4)     // Catch:{ NumberFormatException -> 0x08a9 }
            r4 = 32
            r0.A3V(r4)     // Catch:{ NumberFormatException -> 0x08a9 }
            X.4XR r10 = r0.A15     // Catch:{ NumberFormatException -> 0x08a9 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x08a9 }
            long r6 = r0.A0A     // Catch:{ NumberFormatException -> 0x08a9 }
            long r4 = r4 + r6
            r10.A08(r4)     // Catch:{ NumberFormatException -> 0x08a9 }
            long r4 = r0.A0A     // Catch:{ NumberFormatException -> 0x08a9 }
            r6 = 1
            r0.A3Z(r4, r6, r6)     // Catch:{ NumberFormatException -> 0x08a9 }
            goto L_0x05c5
        L_0x08a9:
            r6 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r2)
            java.lang.String r4 = "/too-many-guesses/time-not-int"
        L_0x08b7:
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w(r4, r6)
        L_0x08c1:
            r0.A3V(r9)
            goto L_0x05c5
        L_0x08c6:
            X.427 r4 = X.AnonymousClass427.ERROR_PROVIDER_TIMEOUT
            if (r1 != r4) goto L_0x0942
            X.AnonymousClass00B.A06(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r2)
            java.lang.String r4 = "/provider-timeout"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.e((java.lang.String) r4)
            X.0rz r5 = r0.A09
            java.lang.String r4 = "voice-provider-timeout"
            X.AnonymousClass2JN.A0K(r5, r4)
            java.lang.String r5 = r3.A0E
            boolean r4 = X.AnonymousClass47P.A00(r5)
            if (r4 != 0) goto L_0x08f6
            r4 = 2131891154(0x7f1213d2, float:1.941702E38)
            goto L_0x05be
        L_0x08f6:
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0925 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.A3Y(r4)     // Catch:{ NumberFormatException -> 0x0925 }
            r11 = 2131891153(0x7f1213d1, float:1.9417018E38)
            r10 = 1
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ NumberFormatException -> 0x0925 }
            r7 = 0
            X.013 r6 = r0.A01     // Catch:{ NumberFormatException -> 0x0925 }
            java.lang.String r6 = X.C28961Zl.A08(r6, r4)     // Catch:{ NumberFormatException -> 0x0925 }
            r9[r7] = r6     // Catch:{ NumberFormatException -> 0x0925 }
            java.lang.String r6 = r0.getString(r11, r9)     // Catch:{ NumberFormatException -> 0x0925 }
            r0.A3t(r6)     // Catch:{ NumberFormatException -> 0x0925 }
            X.4XR r9 = r0.A15     // Catch:{ NumberFormatException -> 0x0925 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0925 }
            long r6 = r6 + r4
            r9.A08(r6)     // Catch:{ NumberFormatException -> 0x0925 }
            r0.A3Z(r4, r10, r10)     // Catch:{ NumberFormatException -> 0x0925 }
            goto L_0x05c5
        L_0x0925:
            r6 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r2)
            java.lang.String r4 = "/too-recent/time-not-int"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w(r4, r6)
            r4 = 2131891154(0x7f1213d2, float:1.941702E38)
            goto L_0x05be
        L_0x0942:
            X.427 r4 = X.AnonymousClass427.ERROR_PROVIDER_UNROUTABLE
            if (r1 != r4) goto L_0x095a
            X.AnonymousClass00B.A06(r3)
            r8 = 2131891156(0x7f1213d4, float:1.9417024E38)
            r9 = 2131891155(0x7f1213d3, float:1.9417022E38)
            java.lang.String r7 = "voice-provider-unroutable"
            r4 = r0
            r5 = r3
            r6 = r2
            r4.A3h(r5, r6, r7, r8, r9)
            goto L_0x05c5
        L_0x095a:
            X.427 r4 = X.AnonymousClass427.ERROR_NO_ROUTES
            if (r1 != r4) goto L_0x0974
            X.AnonymousClass00B.A06(r3)
            r9 = 2131891156(0x7f1213d4, float:1.9417024E38)
            r10 = 2131891155(0x7f1213d3, float:1.9417022E38)
            java.lang.String r7 = "voice-no-routes"
            java.lang.String r8 = "noRouteVoice"
            r4 = r0
            r5 = r3
            r6 = r2
            r4.A3i(r5, r6, r7, r8, r9, r10)
            goto L_0x05c5
        L_0x0974:
            X.427 r4 = X.AnonymousClass427.ERROR_BAD_TOKEN
            if (r1 == r4) goto L_0x09f1
            X.427 r4 = X.AnonymousClass427.ERROR_INVALID_SKEY_SIGNATURE
            if (r1 == r4) goto L_0x09f1
            X.427 r4 = X.AnonymousClass427.SECURITY_CODE
            if (r1 != r4) goto L_0x0988
            X.AnonymousClass00B.A06(r3)
            r0.A3e(r3, r2)
            goto L_0x05c5
        L_0x0988:
            X.427 r7 = X.AnonymousClass427.ERROR_DEVICE_CONFIRM_OR_SECOND_OTP
            if (r1 == r7) goto L_0x09d5
            X.427 r4 = X.AnonymousClass427.ERROR_SECOND_OTP
            if (r1 == r4) goto L_0x09d5
            java.lang.String r4 = "flash"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x09cc
            X.427 r4 = X.AnonymousClass427.ERROR_FLASH_CALL_DISABLED
            if (r1 != r4) goto L_0x09cc
            java.lang.String r4 = "verifyvoice/request/flash/flash-call-disabled/fallback-to-voice"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            X.0sC r4 = r0.A09
            int r5 = r4.A00()
            r4 = 8
            if (r5 == r4) goto L_0x05c5
            X.0rz r4 = r0.A09
            int r4 = r4.A0E()
            X.2Hg r5 = new X.2Hg
            r5.<init>(r4)
            X.0rz r4 = r0.A09
            boolean r4 = r4.A1Z()
            if (r4 == 0) goto L_0x09c6
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5.A02 = r4
        L_0x09c6:
            r4 = 0
            r0.A3o(r5, r4)
            goto L_0x05c5
        L_0x09cc:
            X.427 r4 = X.AnonymousClass427.ERROR_NOT_ALLOWED
            if (r1 != r4) goto L_0x05c5
            r0.A3s(r2)
            goto L_0x05c5
        L_0x09d5:
            X.AnonymousClass00B.A06(r3)
            java.lang.String r6 = r3.A0F
            r4 = 0
            long r8 = X.AnonymousClass2JN.A02(r6, r4)
            java.lang.String r6 = r3.A0G
            long r10 = X.AnonymousClass2JN.A02(r6, r4)
            r12 = 0
            if (r1 != r7) goto L_0x09ea
            r12 = 1
        L_0x09ea:
            r6 = r0
            r7 = r2
            r6.A3v(r7, r8, r10, r12)
            goto L_0x05c5
        L_0x09f1:
            java.lang.String r4 = "voice-bad-token"
            r0.A3j(r1, r2, r4)
            goto L_0x05c5
        L_0x09f9:
            X.AnonymousClass00B.A06(r3)
            java.lang.String r7 = "verifyvoice/request/"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            r5.append(r2)
            java.lang.String r4 = "/requested"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r9 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r8 = "flash"
            if (r2 != r8) goto L_0x0a41
            java.lang.String r4 = r3.A0A
            if (r4 == 0) goto L_0x0a24
            long r4 = java.lang.Long.parseLong(r4)
            long r4 = r4 * r9
            r0.A09 = r4
        L_0x0a24:
            long r4 = r0.A09
            java.lang.String r6 = "verifyphonenumber/start-primary-flash-call-timer"
            com.whatsapp.util.Log.i((java.lang.String) r6)
            r0.A3D()
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x0a36
            r4 = 60000(0xea60, double:2.9644E-319)
        L_0x0a36:
            X.3Le r6 = new X.3Le
            r6.<init>(r0, r4)
            android.os.CountDownTimer r4 = r6.start()
            r0.A0G = r4
        L_0x0a41:
            int r5 = r3.A01
            if (r5 <= 0) goto L_0x0a6c
            boolean r4 = r2.equals(r8)
            if (r4 != 0) goto L_0x0a6c
            A1U = r5
            X.39k r4 = r0.A0u
            boolean r4 = r4.A04()
            if (r4 != 0) goto L_0x0a5b
            com.obwhatsapp.CodeInputField r5 = r0.A0V
            int r4 = r3.A01
            r5.A02 = r4
        L_0x0a5b:
            X.0rz r4 = r0.A09
            int r6 = r3.A01
            android.content.SharedPreferences$Editor r5 = r4.A0K()
            java.lang.String r4 = "registration_voice_code_length"
            android.content.SharedPreferences$Editor r4 = r5.putInt(r4, r6)
            r4.apply()
        L_0x0a6c:
            java.lang.String r5 = r3.A0C
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x0a7e
            long r4 = java.lang.Long.parseLong(r5)
            long r4 = r4 * r9
            X.0yx r6 = r0.A11
            r6.A0B(r4)
        L_0x0a7e:
            boolean r4 = r2.equals(r8)
            if (r4 == 0) goto L_0x0ad4
            X.1Pm r14 = r0.A0v
            java.lang.String r4 = r0.A1C
            r16 = r4
            java.lang.String r15 = r0.A1D
            X.AnonymousClass00B.A06(r15)
            java.lang.String r13 = r3.A08
            X.AnonymousClass00B.A06(r13)
            X.2Hi r12 = r0.A16
            X.0tz r4 = r14.A02
            android.content.Context r11 = r4.A00
            X.2nC r10 = r14.A00
            if (r10 != 0) goto L_0x0ac7
            X.0sq r9 = r14.A06
            X.01V r8 = r14.A01
            X.0sj r6 = r14.A03
            X.0rz r5 = r14.A04
            X.1KP r4 = r14.A05
            X.AnonymousClass00B.A06(r15)
            X.2nC r10 = new X.2nC
            r23 = r13
            r24 = r16
            r25 = r15
            r22 = r9
            r21 = r0
            r20 = r12
            r19 = r4
            r18 = r5
            r17 = r6
            r16 = r8
            r15 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r14.A00 = r10
        L_0x0ac7:
            java.lang.String r4 = "android.intent.action.PHONE_STATE"
            android.content.IntentFilter r6 = new android.content.IntentFilter
            r6.<init>(r4)
            java.lang.String r5 = X.AnonymousClass01S.A09
            r4 = 0
            r11.registerReceiver(r10, r6, r5, r4)
        L_0x0ad4:
            X.0sC r4 = r0.A09
            int r4 = r4.A00()
            boolean r4 = X.AnonymousClass3AS.A00(r4)
            if (r4 == 0) goto L_0x0b07
            java.lang.String r4 = "voice"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0b07
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r4 = "/update acct defence stat:"
            r6.append(r4)
            r5 = 3
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r0.A3R(r5)
        L_0x0b07:
            r0.A3N()
            goto L_0x049f
        L_0x0b0c:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0b15
            r1 = 0
            r0.A46(r1)
            return
        L_0x0b15:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x000f
            r0.A46(r2)
            X.4Rq r1 = r0.A0t
            r1.A00(r2)
            X.4XR r0 = r0.A15
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "com.obwhatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
            r1.remove(r0)
            boolean r0 = r1.commit()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "VerifyPhoneNumberPrefs/clear-wa-old-retry-time/error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0b3a:
            java.lang.String r1 = "verifyphonenumber/onSmsCodeRequestResponse/response is null"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            r2 = 300000(0x493e0, double:1.482197E-318)
            r4 = 0
            r0.A3Z(r2, r4, r4)
            r1 = 1
            r0.A3Z(r2, r1, r4)
            boolean r1 = r0.A48()
            if (r1 == 0) goto L_0x000f
            r1 = 2
            r0.A3Z(r2, r1, r4)
            return
        L_0x0b56:
            java.lang.String r6 = "autoconf"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x000f
            java.lang.String r4 = "VerifyPhoneNumber/onAutoconfCodeRequestResponse/status/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            if (r27 != 0) goto L_0x0b7c
            java.lang.String r1 = "VerifyPhoneNumber/onAutoconfCodeRequestResponse/result is null"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x0b76:
            int r1 = r0.A03
            r0.A3S(r1)
            return
        L_0x0b7c:
            X.427 r2 = X.AnonymousClass427.YES
            if (r1 != r2) goto L_0x0ba4
            java.lang.String r1 = "VerifyPhoneNumber/onAutoconfCodeSent/attempt to verify authResponse"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r5 = r0.A1C
            java.lang.String r4 = r0.A1D
            X.AnonymousClass00B.A06(r4)
            X.2Hh r7 = X.C47052Hh.AUTO_DETECTED
            X.2Hi r2 = r0.A16
            java.lang.String r1 = r3.A07
            r9 = r6
            r11 = r4
            r12 = r6
            r13 = r1
            r8 = r2
            r10 = r5
            r6 = r0
            r6.A3d(r7, r8, r9, r10, r11, r12, r13)
            X.0rz r1 = r0.A09
            int r0 = r0.A03
            r1.A0k(r0)
            return
        L_0x0ba4:
            X.0rz r3 = r0.A09
            java.lang.String r2 = "autoconf_authentication_failed"
            r3.A0q(r2)
            X.0rz r2 = r0.A09
            java.lang.String r1 = r1.name()
            X.AnonymousClass2JN.A0K(r2, r1)
            goto L_0x0b76
        L_0x0bb5:
            java.lang.String r1 = "VerifyPhoneNumber/updateRequestCodeButtons/Invalid method: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.VerifyPhoneNumber.AOn(X.1lJ, X.427, java.lang.String):void");
    }

    public SharedPreferences getPreferences(int i2) {
        return this.A0o.A00(getLocalClassName());
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 700) {
            if (i3 == -1) {
                Log.i("verifyphonenumber/activity-result/permission-accepted/request-flash");
                A3H();
                return;
            }
            Log.i("verifyphonenumber/activity-result/permission-declined/request-voice");
            C47042Hg r2 = new C47042Hg(this.A09.A0E());
            if (this.A09.A1Z()) {
                r2.A02 = true;
            }
            r2.A00 = false;
            A3o(r2, true);
        } else if (i2 == 701) {
            StringBuilder sb = new StringBuilder("verifyphonenumber/activity-result/request-sms-permissions/");
            sb.append(i3 == -1 ? "granted" : "denied");
            Log.i(sb.toString());
            this.A1P = false;
            A3a(this.A0B, this.A0C);
        }
    }

    public void onBackPressed() {
        if (A48()) {
            this.A17.A04(A38(), "back");
            A3L();
        } else if (this.A02 == 2) {
            this.A17.A04(A38(), "back");
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0555, code lost:
        r4 = r0.A1C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x07a2, code lost:
        if (r0.A09.A00() == 9) goto L_0x0698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x07b3, code lost:
        if (r0.A0j.A03("android.permission.RECEIVE_SMS") == 0) goto L_0x07b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x081a, code lost:
        if (r0.A0l.A0E(X.C16620tM.A02, 2731) != false) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0512, code lost:
        if (r6.A0E(X.C16620tM.A02, 2383) == false) goto L_0x0514;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x06c0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x070c  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0766  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x080c  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x081e  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x08ba  */
    /* JADX WARNING: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0518  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r0 = r23
            r10 = r24
            super.onCreate(r10)
            X.0sC r1 = r0.A09
            int r2 = r1.A00()
            java.lang.String r3 = "VerifyPhoneNumber/onCreate/registration state is "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.content.Intent r1 = r0.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r4 = 0
            if (r1 == 0) goto L_0x0046
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r1 = "code_verification_mode"
            int r5 = r3.getIntExtra(r1, r4)
            r0.A02 = r5
            java.lang.String r3 = "VerifyPhoneNumber/onCreate/codeVerificationMode is "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0046:
            r5 = 1
            r1 = 0
            if (r24 == 0) goto L_0x004b
            r1 = 1
        L_0x004b:
            r0.A1H = r1
            r1 = 2131100913(0x7f0604f1, float:1.781422E38)
            X.C434920f.A04(r0, r1)
            X.0sq r3 = r0.A05
            X.0ua r12 = r0.A0a
            X.0uj r1 = r0.A1A
            X.013 r13 = r0.A01
            X.1KQ r14 = r0.A0k
            X.0zG r15 = r0.A0D
            X.39H r11 = new X.39H
            r16 = r1
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.A0z = r11
            X.0tz r1 = r0.A0h
            android.content.Context r1 = r1.A00
            android.content.res.Resources r3 = r1.getResources()
            r1 = 2131166873(0x7f070699, float:1.7948004E38)
            int r1 = r3.getDimensionPixelSize(r1)
            r0.A08 = r1
            X.0tz r1 = r0.A0h
            android.content.Context r1 = r1.A00
            android.content.res.Resources r3 = r1.getResources()
            r1 = 2131166870(0x7f070696, float:1.7947998E38)
            int r3 = r3.getDimensionPixelSize(r1)
            X.013 r1 = r0.A01
            boolean r1 = r1.A0T()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x08b4
            r0.A05 = r3
            r0.A06 = r4
        L_0x0098:
            X.0tz r1 = r0.A0h
            android.content.Context r1 = r1.A00
            android.content.res.Resources r3 = r1.getResources()
            r1 = 2131166871(0x7f070697, float:1.7948E38)
            int r1 = r3.getDimensionPixelSize(r1)
            r0.A07 = r1
            android.content.SharedPreferences r3 = r0.getPreferences(r4)
            X.4XR r1 = new X.4XR
            r1.<init>(r3)
            r0.A15 = r1
            X.02z r3 = new X.02z
            r3.<init>(r0)
            java.lang.Class<com.obwhatsapp.registration.report.BanReportViewModel> r1 = com.obwhatsapp.registration.report.BanReportViewModel.class
            X.01n r1 = r3.A01(r1)
            com.obwhatsapp.registration.report.BanReportViewModel r1 = (com.obwhatsapp.registration.report.BanReportViewModel) r1
            r0.A18 = r1
            X.027 r6 = r1.A01
            r3 = 224(0xe0, float:3.14E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r1.<init>((java.lang.Object) r0, (int) r3)
            r6.A0A(r0, r1)
            com.obwhatsapp.registration.report.BanReportViewModel r1 = r0.A18
            X.027 r6 = r1.A02
            r3 = 223(0xdf, float:3.12E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r1.<init>((java.lang.Object) r0, (int) r3)
            r6.A0A(r0, r1)
            r1 = 2131893621(0x7f121d75, float:1.9422024E38)
            r0.setTitle(r1)
            r1 = 2131559878(0x7f0d05c6, float:1.8745112E38)
            r0.setContentView((int) r1)
            X.10J r3 = r0.A0l
            r1 = 2316(0x90c, float:3.245E-42)
            r3.A0C(r1)
            X.4Dw r1 = r0.A0e
            X.1NE r1 = r1.A00
            r0.A0q = r1
            X.0rz r3 = r0.A09
            X.4Ws r1 = new X.4Ws
            r1.<init>(r0, r3)
            r0.A0x = r1
            r1 = 2131366291(0x7f0a1193, float:1.8352471E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r0.A0S = r1
            r1 = 2131366292(0x7f0a1194, float:1.8352473E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.A0L = r1
            r1 = 2131367021(0x7f0a146d, float:1.8353952E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.A0M = r1
            r1 = 2131367048(0x7f0a1488, float:1.8354007E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.A0O = r1
            r1 = 2131363492(0x7f0a06a4, float:1.8346794E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.A0T = r1
            r1 = 2131366085(0x7f0a10c5, float:1.8352054E38)
            android.view.View r1 = r0.findViewById(r1)
            com.obwhatsapp.TextEmojiLabel r1 = (com.obwhatsapp.TextEmojiLabel) r1
            r0.A0b = r1
            r1 = 2131366895(0x7f0a13ef, float:1.8353696E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.A0K = r1
            r1 = 2131366899(0x7f0a13f3, float:1.8353705E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.A0N = r1
            r1 = 2131366897(0x7f0a13f1, float:1.83537E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0.A0P = r1
            boolean r1 = r0.A48()
            if (r1 == 0) goto L_0x017b
            com.obwhatsapp.WaTextView r1 = r0.A0d
            if (r1 != 0) goto L_0x0173
            android.view.ViewStub r1 = r0.A0P
            android.view.View r3 = r1.inflate()
            r1 = 2131366898(0x7f0a13f2, float:1.8353703E38)
            android.view.View r1 = X.C004601z.A0E(r3, r1)
            com.obwhatsapp.WaTextView r1 = (com.obwhatsapp.WaTextView) r1
            r0.A0d = r1
        L_0x0173:
            X.0rz r3 = r0.A09
            java.lang.String r1 = "wa_old_entered"
            r3.A0y(r1)
        L_0x017b:
            X.013 r8 = r0.A01
            android.view.View r7 = r0.A00
            int r6 = r0.A02
            r1 = 2
            r3 = 0
            if (r6 != r1) goto L_0x0186
            r3 = 1
        L_0x0186:
            boolean r1 = r0.A48()
            X.AnonymousClass2JN.A0H(r7, r0, r8, r3, r1)
            android.content.Intent r6 = r0.getIntent()
            java.lang.String r3 = r6.getScheme()
            java.lang.String r1 = "whatsapp"
            boolean r1 = r1.equals(r3)
            r9 = 0
            if (r1 != 0) goto L_0x0883
            java.lang.String r3 = r6.getScheme()
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0883
            java.lang.String r3 = r6.getScheme()
            java.lang.String r1 = "https"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0883
            r0.A1B = r9
        L_0x01b9:
            int r1 = r0.A35()
            if (r2 == r1) goto L_0x01e8
            boolean r1 = r0.A47()
            if (r1 != 0) goto L_0x01e8
            boolean r1 = r0.A48()
            if (r1 != 0) goto L_0x01e8
            java.lang.String r3 = "verifyphonenumber/wrong-state bounce to main "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            android.content.Intent r3 = X.C14750ph.A04(r0)
        L_0x01e1:
            r0.startActivity(r3)
            r0.finish()
        L_0x01e7:
            return
        L_0x01e8:
            X.0wP r1 = r0.A07
            java.lang.Object r3 = r1.A06
            monitor-enter(r3)
            X.1UX r1 = r1.A00     // Catch:{ all -> 0x08c4 }
            monitor-exit(r3)     // Catch:{ all -> 0x08c4 }
            if (r1 == 0) goto L_0x020c
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x020c
            boolean r1 = r0.A48()
            if (r1 != 0) goto L_0x020c
            java.lang.String r1 = "verifyphonenumber/create/display-roaming"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = 2131365860(0x7f0a0fe4, float:1.8351597E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
        L_0x020c:
            android.content.Intent r1 = r0.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r11 = -1
            if (r1 == 0) goto L_0x0880
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r1 = "should_request_flash_call"
            boolean r15 = r3.getBooleanExtra(r1, r4)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r1 = "server_start_message"
            java.lang.String r1 = r3.getStringExtra(r1)
            r0.A1E = r1
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r1 = "flash_type"
            int r1 = r3.getIntExtra(r1, r11)
            r0.A03 = r1
            boolean r1 = r0.A48()
            if (r1 == 0) goto L_0x0248
            X.0rz r3 = r0.A09
            int r1 = r0.A03
            r3.A0k(r1)
        L_0x0248:
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r1 = "wa_old_eligible"
            boolean r1 = r3.getBooleanExtra(r1, r4)
            r0.A1Q = r1
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r1 = "show_request_sms_code_progress"
            boolean r1 = r3.getBooleanExtra(r1, r4)
            r0.A1N = r1
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r1 = "changenumber"
            boolean r1 = r3.getBooleanExtra(r1, r4)
            if (r1 == 0) goto L_0x0270
            r0.A1F = r5
        L_0x0270:
            java.lang.String r1 = "verifyphonenumber/create/ssend"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r3 = "use_sms_retriever"
            if (r24 != 0) goto L_0x0878
            android.content.Intent r1 = r0.getIntent()
            boolean r1 = r1.getBooleanExtra(r3, r4)
            r0.A1P = r1
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r13 = "sms_retry_time"
            r3 = 0
            long r7 = r1.getLongExtra(r13, r3)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r12 = "voice_retry_time"
            long r5 = r1.getLongExtra(r12, r3)
            android.content.Intent r14 = r0.getIntent()
            java.lang.String r1 = "wa_old_retry_time"
            long r3 = r14.getLongExtra(r1, r3)
            boolean r1 = X.AnonymousClass3AS.A00(r2)
            if (r1 == 0) goto L_0x0867
            android.content.Intent r1 = r0.getIntent()
            boolean r4 = r1.hasExtra(r13)
            android.content.Intent r1 = r0.getIntent()
            boolean r3 = r1.hasExtra(r12)
            if (r4 == 0) goto L_0x02c5
            X.4XR r1 = r0.A15
            r1.A07(r7)
        L_0x02c5:
            if (r3 == 0) goto L_0x02cc
            X.4XR r1 = r0.A15
            r1.A08(r5)
        L_0x02cc:
            r3 = 12
            r1 = 8
            if (r2 != r3) goto L_0x085f
            java.lang.String r3 = r0.A1E
            if (r3 != 0) goto L_0x02e8
            java.lang.String r3 = "VerifyPhoneNumber/onCreate/app got killed during autoconf authentication, reset reg state to SMS"
        L_0x02d8:
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.0yx r4 = r0.A11
            int r3 = r0.A35()
            r4.A0A(r3)
            r3 = 0
            r0.A3W(r3)
        L_0x02e8:
            X.0rz r3 = r0.A09
            java.lang.String r3 = r3.A0O()
            r0.A1C = r3
            X.0rz r3 = r0.A09
            java.lang.String r3 = r3.A0Q()
            r0.A1D = r3
            X.0rz r3 = r0.A09
            X.01D r3 = r3.A01
            java.lang.Object r4 = r3.get()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r3 = "reg_attempts_verify_code"
            r7 = 0
            int r4 = r4.getInt(r3, r7)
            X.2Hi r3 = new X.2Hi
            r3.<init>(r4)
            r0.A16 = r3
            java.lang.String r8 = r0.A1C
            java.lang.String r6 = r0.A1D
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            X.130 r5 = r0.A19
            X.2Hi r4 = r0.A16
            X.3Ly r3 = new X.3Ly
            r12 = r3
            r14 = r0
            r15 = r4
            r16 = r5
            r17 = r8
            r18 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.A12 = r3
            X.0wP r4 = r0.A07
            X.0vz r3 = r0.A1S
            r4.A02(r3)
            java.lang.String r3 = r0.A1C
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x08ba
            java.lang.String r3 = r0.A1D
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x08ba
            X.0rz r4 = r0.A09
            X.2n9 r3 = new X.2n9
            r3.<init>(r4, r0)
            r0.A0y = r3
            X.0rz r4 = r0.A09
            X.2nA r3 = new X.2nA
            r3.<init>(r4, r0)
            r0.A13 = r3
            r3 = 2131365556(0x7f0a0eb4, float:1.835098E38)
            android.view.View r4 = r0.findViewById(r3)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            r0.A0R = r4
            r3 = 100
            r4.setProgress(r3)
            r3 = 2131366894(0x7f0a13ee, float:1.8353694E38)
            android.view.View r3 = r0.findViewById(r3)
            com.obwhatsapp.CodeInputField r3 = (com.obwhatsapp.CodeInputField) r3
            r0.A0V = r3
            X.2aP r3 = r0.A0X
            r21 = r9
            X.2Yk r4 = r3.A00
            X.2Rg r3 = r4.A01
            android.app.Activity r6 = r3.A1p
            X.0sX r4 = r4.A03
            X.01J r3 = r4.A02
            java.lang.Object r5 = r3.get()
            X.10J r5 = (X.AnonymousClass10J) r5
            X.01J r3 = r4.AR8
            java.lang.Object r4 = r3.get()
            X.013 r4 = (X.AnonymousClass013) r4
            X.39k r3 = new X.39k
            r3.<init>(r6, r4, r5, r9)
            r0.A0u = r3
            boolean r3 = r3.A04()
            if (r3 == 0) goto L_0x084c
            android.view.View r4 = r0.A00
            r3 = 2131366893(0x7f0a13ed, float:1.8353692E38)
            android.view.View r6 = X.C004601z.A0E(r4, r3)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            X.39k r5 = r0.A0u
            X.51X r4 = new X.51X
            r4.<init>(r0)
            int r3 = A1T
            r5.A02(r6, r4, r3)
            com.obwhatsapp.CodeInputField r3 = r0.A0V
            r3.setVisibility(r1)
            android.widget.ProgressBar r3 = r0.A0R
            r3.setVisibility(r1)
            r6.setVisibility(r7)
        L_0x03bd:
            X.3AS r12 = r0.A0p
            X.4XR r3 = r0.A15
            long r5 = r3.A00()
            X.4XR r3 = r0.A15
            long r3 = r3.A01()
            java.lang.String r7 = "AccountDefenceVerificationHelper/determine-current-account-defence-verification-state "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            r8.append(r5)
            java.lang.String r7 = ", "
            r8.append(r7)
            r8.append(r3)
            java.lang.String r7 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r7)
            X.1Pl r7 = r12.A02
            X.1Pk r12 = r7.A06
            X.0u3 r8 = r12.A01
            java.lang.String r7 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r14 = r8.A00(r7)
            java.lang.String r13 = "com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_verification_state"
            r8 = 0
            int r8 = r14.getInt(r13, r8)
            java.lang.String r14 = "AccountDefenceLocalDataRepository/getSecondCodeVerificationState/"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r14)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            com.whatsapp.util.Log.i((java.lang.String) r13)
            if (r8 != 0) goto L_0x0839
            long r19 = java.lang.System.currentTimeMillis()
            long r17 = r12.A00()
            long r15 = r12.A01()
            r13 = 0
            int r12 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x0430
            int r12 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x0430
            int r12 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0428
            int r12 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r12 < 0) goto L_0x0430
        L_0x0428:
            int r5 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x0839
            int r5 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r5 >= 0) goto L_0x0839
        L_0x0430:
            java.lang.String r3 = "AccountDefenceVerificationHelper/determine-current-account-defence-verification-state return enabled"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r8 = 1
        L_0x0436:
            r0.A00 = r8
            X.3AS r3 = r0.A0p
            X.1Pl r3 = r3.A02
            X.1Pk r3 = r3.A06
            X.0u3 r3 = r3.A01
            android.content.SharedPreferences r5 = r3.A00(r7)
            java.lang.String r4 = "com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once"
            r3 = 0
            boolean r5 = r5.getBoolean(r4, r3)
            java.lang.String r4 = "AccountDefenceLocalDataRepository/isSecondSmsRequestedOnce/"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r0.A1J = r5
            r3 = 2131366896(0x7f0a13f0, float:1.8353698E38)
            android.view.View r6 = r0.findViewById(r3)
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r0.A0Q = r6
            X.013 r5 = r0.A01
            r3 = 2131231398(0x7f0802a6, float:1.8078876E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass00T.A04(r0, r3)
            X.25m r3 = new X.25m
            r3.<init>(r4, r5)
            r6.setImageDrawable(r3)
            android.widget.ImageButton r5 = r0.A0Q
            r3 = 2
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r4 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r4.<init>((java.lang.Object) r0, (int) r3)
            r5.setOnClickListener(r4)
            r4 = 2131365797(0x7f0a0fa5, float:1.835147E38)
            android.view.View r6 = r0.findViewById(r4)
            r5 = 48
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r4 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r4.<init>(r0, r5)
            r6.setOnClickListener(r4)
            X.013 r5 = r0.A01
            r16 = 2131363009(0x7f0a04c1, float:1.8345815E38)
            r17 = 2131231827(0x7f080453, float:1.8079746E38)
            r18 = 2131231826(0x7f080452, float:1.8079744E38)
            X.4Rq r4 = new X.4Rq
            r15 = 2131365797(0x7f0a0fa5, float:1.835147E38)
            r12 = r4
            r13 = r0
            r14 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.A0s = r4
            r4 = 2131362483(0x7f0a02b3, float:1.8344748E38)
            android.view.View r6 = r0.findViewById(r4)
            r5 = 1
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r4 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r4.<init>((java.lang.Object) r0, (int) r5)
            r6.setOnClickListener(r4)
            X.013 r5 = r0.A01
            r16 = 2131363010(0x7f0a04c2, float:1.8345817E38)
            r17 = 2131231825(0x7f080451, float:1.8079742E38)
            r18 = 2131231824(0x7f080450, float:1.807974E38)
            X.4Rq r4 = new X.4Rq
            r15 = 2131362483(0x7f0a02b3, float:1.8344748E38)
            r12 = r4
            r14 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.A0r = r4
            r4 = 2131365798(0x7f0a0fa6, float:1.8351471E38)
            android.view.View r6 = r0.findViewById(r4)
            r5 = 49
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r4 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r4.<init>(r0, r5)
            r6.setOnClickListener(r4)
            X.013 r5 = r0.A01
            r16 = 2131363011(0x7f0a04c3, float:1.8345819E38)
            r17 = 2131231855(0x7f08046f, float:1.8079803E38)
            X.4Rq r4 = new X.4Rq
            r15 = 2131365798(0x7f0a0fa6, float:1.8351471E38)
            r18 = 2131231855(0x7f08046f, float:1.8079803E38)
            r12 = r4
            r14 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.A0t = r4
            int r4 = r0.A35()
            boolean r4 = X.AnonymousClass3AS.A00(r4)
            X.10J r6 = r0.A0l
            if (r4 != 0) goto L_0x0514
            r5 = 2383(0x94f, float:3.339E-42)
            X.0tM r4 = X.C16620tM.A02
            boolean r5 = r6.A0E(r4, r5)
            r4 = 1
            if (r5 != 0) goto L_0x0515
        L_0x0514:
            r4 = 0
        L_0x0515:
            r5 = 0
            if (r4 == 0) goto L_0x081e
            java.lang.String r4 = "VerifyPhoneNumber/initializeRequestCodeButtons/hide request code buttons in bottom sheet"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r4 = 2131365760(0x7f0a0f80, float:1.8351394E38)
            android.view.View r4 = r0.findViewById(r4)
            r4.setVisibility(r1)
            r4 = 2131363660(0x7f0a074c, float:1.8347135E38)
            android.view.View r8 = r0.findViewById(r4)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setVisibility(r5)
            com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5 r4 = new com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5
            r4.<init>((java.lang.Object) r0, (int) r5)
            r8.setOnClickListener(r4)
            boolean r4 = r0.A48()
            if (r4 == 0) goto L_0x0810
            r4 = 2131893025(0x7f121b21, float:1.9420815E38)
            r8.setText(r4)
        L_0x0547:
            r4 = 2131101338(0x7f06069a, float:1.7815083E38)
            int r4 = X.AnonymousClass00T.A00(r0, r4)
            r8.setTextColor(r4)
        L_0x0551:
            java.lang.String r5 = r0.A1D
            if (r5 == 0) goto L_0x080c
            java.lang.String r4 = r0.A1C
            if (r4 == 0) goto L_0x080c
            X.013 r8 = r0.A01
            java.lang.String r6 = X.AnonymousClass2JN.A0E(r4, r5)
            r5 = 32
            r4 = 160(0xa0, float:2.24E-43)
            java.lang.String r4 = r6.replace(r5, r4)
            java.lang.String r17 = r8.A0H(r4)
        L_0x056b:
            r4 = 2131366662(0x7f0a1306, float:1.8353224E38)
            android.view.View r6 = r0.findViewById(r4)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r12 = 1
            r8 = 0
            if (r6 == 0) goto L_0x058c
            boolean r4 = r0.A48()
            if (r4 == 0) goto L_0x0803
            r5 = 2131892652(0x7f1219ac, float:1.9420058E38)
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r8] = r17
            java.lang.String r4 = r0.getString(r5, r4)
        L_0x0589:
            r6.setText(r4)
        L_0x058c:
            android.view.View r4 = r0.A0M
            r4.setVisibility(r8)
            android.widget.TextView r13 = r0.A0T
            r6 = 2131892618(0x7f12198a, float:1.941999E38)
            java.lang.Object[] r5 = new java.lang.Object[r12]
            int r4 = A1T
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r8] = r4
            java.lang.String r4 = r0.getString(r6, r5)
            r13.setText(r4)
            android.widget.RelativeLayout r4 = r0.A0S
            r4.setVisibility(r8)
            r0.A44(r8)
            com.obwhatsapp.TextEmojiLabel r6 = r0.A0b
            boolean r5 = r0.A48()
            r4 = 0
            if (r5 == 0) goto L_0x05ba
            r4 = 8
        L_0x05ba:
            r6.setVisibility(r4)
            com.obwhatsapp.TextEmojiLabel r5 = r0.A0b
            X.3MF r4 = new X.3MF
            r4.<init>()
            r5.A07 = r4
            com.obwhatsapp.TextEmojiLabel r6 = r0.A0b
            X.01V r5 = r0.A08
            X.2q8 r4 = new X.2q8
            r4.<init>(r6, r5)
            r6.setAccessibilityHelper(r4)
            int r4 = r0.A35()
            boolean r4 = X.AnonymousClass3AS.A00(r4)
            if (r4 == 0) goto L_0x0618
            X.3AS r4 = r0.A0p
            X.1Pl r4 = r4.A02
            X.1Pk r5 = r4.A06
            long r15 = r5.A00()
            long r13 = r5.A01()
            java.lang.String r4 = "AccountDefenceLocalDataRepository/clear-original-wait-time-diffs"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.0u3 r4 = r5.A01
            android.content.SharedPreferences r4 = r4.A00(r7)
            android.content.SharedPreferences$Editor r7 = r4.edit()
            r5 = 0
            int r4 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0604
            java.lang.String r4 = "com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time"
            r7.remove(r4)
        L_0x0604:
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x060d
            java.lang.String r4 = "com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time"
            r7.remove(r4)
        L_0x060d:
            boolean r4 = r7.commit()
            if (r4 != 0) goto L_0x0618
            java.lang.String r4 = "AccountDefenceLocalDataRepository/clear-original-wait-time-diffs/error"
            com.whatsapp.util.Log.e((java.lang.String) r4)
        L_0x0618:
            long r15 = java.lang.System.currentTimeMillis()
            X.4XR r4 = r0.A15
            long r5 = r4.A00()
            int r4 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x07a6
            X.0sC r4 = r0.A09
            int r4 = r4.A00()
            boolean r4 = X.AnonymousClass3AS.A00(r4)
            if (r4 == 0) goto L_0x0637
            int r5 = r0.A00
            r4 = 3
            if (r5 != r4) goto L_0x07a6
        L_0x0637:
            X.4XR r4 = r0.A15
            long r13 = r4.A01()
            long r13 = r13 - r15
            r5 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            com.obwhatsapp.TextEmojiLabel r7 = r0.A0b
            r5 = 2131892644(0x7f1219a4, float:1.9420042E38)
            if (r4 >= 0) goto L_0x064c
            r5 = 2131892642(0x7f1219a2, float:1.9420038E38)
        L_0x064c:
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r8] = r17
            java.lang.String r6 = r0.getString(r5, r4)
            r4 = 37
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r5 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r5.<init>((java.lang.Object) r0, (int) r4)
            java.lang.String r4 = "edit-number"
            android.text.SpannableStringBuilder r4 = X.AnonymousClass2JN.A08(r5, r6, r4)
            r7.setText(r4)
        L_0x0664:
            X.0sC r4 = r0.A09
            int r4 = r4.A00()
            if (r4 != r1) goto L_0x079a
            com.obwhatsapp.TextEmojiLabel r7 = r0.A0b
            r5 = 2131892621(0x7f12198d, float:1.9419995E38)
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r8] = r17
            java.lang.String r6 = r0.getString(r5, r4)
            r4 = 37
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r5 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r5.<init>((java.lang.Object) r0, (int) r4)
            java.lang.String r4 = "edit-number"
            android.text.SpannableStringBuilder r4 = X.AnonymousClass2JN.A08(r5, r6, r4)
            r7.setText(r4)
            android.widget.RelativeLayout r4 = r0.A0S
            r4.setVisibility(r1)
            android.widget.TextView r4 = r0.A0T
            r4.setVisibility(r1)
            android.view.View r4 = r0.A0L
            r4.setVisibility(r1)
        L_0x0698:
            android.view.View r4 = r0.A0M
            r4.setVisibility(r1)
            android.view.View r4 = r0.A0K
            r4.setVisibility(r1)
        L_0x06a2:
            boolean r4 = r0.A48()
            r0.A46(r4)
            r0.A3E()
            android.content.res.Resources r4 = r0.getResources()
            android.util.DisplayMetrics r6 = r4.getDisplayMetrics()
            int r4 = r6.heightPixels
            float r5 = (float) r4
            float r4 = r6.density
            float r5 = r5 / r4
            r4 = 1140457472(0x43fa0000, float:500.0)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x06c7
            android.view.Window r4 = r0.getWindow()
            r4.setSoftInputMode(r3)
        L_0x06c7:
            X.4XR r5 = r0.A15
            java.lang.String r4 = r0.A1C
            java.lang.String r3 = r0.A1D
            java.lang.String r6 = r5.A02(r4, r3)
            if (r6 == 0) goto L_0x06fe
            if (r2 == r1) goto L_0x0755
            java.lang.String r4 = "verifyphonenumber/create/savedcode "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            java.lang.String r5 = r0.A1C
            java.lang.String r4 = r0.A1D
            X.2Hh r13 = X.C47052Hh.RETRIED
            X.2Hi r3 = r0.A16
            java.lang.String r18 = "sms"
            r12 = r0
            r14 = r3
            r15 = r6
            r16 = r5
            r17 = r4
            r19 = r9
            r12.A3d(r13, r14, r15, r16, r17, r18, r19)
        L_0x06fe:
            if (r2 == r1) goto L_0x0755
            android.content.Intent r2 = r0.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            if (r2 == 0) goto L_0x0755
            if (r24 != 0) goto L_0x0743
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "request_code_method"
            java.lang.String r5 = r3.getStringExtra(r2)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r4 = "request_code_status"
            int r2 = r2.getIntExtra(r4, r11)
            if (r2 <= 0) goto L_0x0730
            X.427[] r3 = X.AnonymousClass427.values()
            android.content.Intent r2 = r0.getIntent()
            int r2 = r2.getIntExtra(r4, r11)
            r9 = r3[r2]
        L_0x0730:
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "request_code_result"
            android.os.Parcelable r2 = r3.getParcelableExtra(r2)
            X.1lJ r2 = (X.C35061lJ) r2
            if (r5 == 0) goto L_0x0743
            if (r9 == 0) goto L_0x0743
            r0.AOn(r2, r9, r5)
        L_0x0743:
            r4 = 0
            r3 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r0
            android.content.Intent r2 = X.C14750ph.A0A(r2, r3, r4, r6, r8, r10, r11, r12)
            r0.setIntent(r2)
        L_0x0755:
            X.1BN r3 = r0.A17
            java.lang.String r2 = r0.A38()
            r3.A01(r2)
            X.1NE r2 = r0.A0q
            if (r2 == 0) goto L_0x01e7
            java.lang.String r2 = r0.A1E
            if (r2 == 0) goto L_0x01e7
            java.lang.String r2 = "VerifyPhoneNumber/onCreate/attempt autoconf verification"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0sC r2 = r0.A09
            int r2 = r2.A00()
            if (r2 == r1) goto L_0x0778
            r1 = 23
            X.AnonymousClass29T.A01(r0, r1)
        L_0x0778:
            java.lang.String r5 = r0.A1C
            java.lang.String r4 = r0.A1D
            java.lang.String r3 = r0.A1E
            X.0rz r1 = r0.A09
            int r2 = r1.A0E()
            X.2Hg r1 = new X.2Hg
            r1.<init>(r2)
            java.lang.String r19 = "autoconf"
            r22 = 0
            r15 = r0
            r16 = r1
            r17 = r5
            r18 = r4
            r20 = r3
            r15.A3n(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x079a:
            X.0sC r4 = r0.A09
            int r5 = r4.A00()
            r4 = 9
            if (r5 != r4) goto L_0x06a2
            goto L_0x0698
        L_0x07a6:
            boolean r4 = r0.A1P
            if (r4 != 0) goto L_0x07b5
            X.0sj r5 = r0.A0j
            java.lang.String r4 = "android.permission.RECEIVE_SMS"
            int r4 = r5.A03(r4)
            r6 = 0
            if (r4 != 0) goto L_0x07b6
        L_0x07b5:
            r6 = 1
        L_0x07b6:
            X.0sC r4 = r0.A09
            int r4 = r4.A00()
            if (r4 != r1) goto L_0x07dd
            r5 = 2131892621(0x7f12198d, float:1.9419995E38)
        L_0x07c1:
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r8] = r17
            java.lang.String r6 = r0.getString(r5, r4)
            r4 = 37
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r5 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r5.<init>((java.lang.Object) r0, (int) r4)
            java.lang.String r4 = "edit-number"
            android.text.SpannableStringBuilder r5 = X.AnonymousClass2JN.A08(r5, r6, r4)
        L_0x07d6:
            com.obwhatsapp.TextEmojiLabel r4 = r0.A0b
            r4.setText(r5)
            goto L_0x0664
        L_0x07dd:
            boolean r4 = X.AnonymousClass3AS.A00(r4)
            if (r4 == 0) goto L_0x07fa
            X.3AS r13 = r0.A0p
            int r7 = r0.A00
            X.013 r6 = r0.A01
            java.lang.String r5 = r0.A1C
            java.lang.String r4 = r0.A1D
            java.lang.String r4 = X.AnonymousClass2JN.A0E(r5, r4)
            java.lang.String r4 = r6.A0H(r4)
            java.lang.CharSequence r5 = r13.A01(r0, r4, r7)
            goto L_0x07d6
        L_0x07fa:
            r5 = 2131892643(0x7f1219a3, float:1.942004E38)
            if (r6 == 0) goto L_0x07c1
            r5 = 2131892641(0x7f1219a1, float:1.9420036E38)
            goto L_0x07c1
        L_0x0803:
            r4 = 2131892645(0x7f1219a5, float:1.9420044E38)
            java.lang.String r4 = r0.getString(r4)
            goto L_0x0589
        L_0x080c:
            r17 = 0
            goto L_0x056b
        L_0x0810:
            X.10J r6 = r0.A0l
            r5 = 2731(0xaab, float:3.827E-42)
            X.0tM r4 = X.C16620tM.A02
            boolean r4 = r6.A0E(r4, r5)
            if (r4 == 0) goto L_0x0551
            goto L_0x0547
        L_0x081e:
            java.lang.String r4 = "VerifyPhoneNumber/initializeRequestCodeButtons/show request code buttons on screen"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r4 = 2131365760(0x7f0a0f80, float:1.8351394E38)
            android.view.View r4 = r0.findViewById(r4)
            r4.setVisibility(r5)
            r4 = 2131363660(0x7f0a074c, float:1.8347135E38)
            android.view.View r4 = r0.findViewById(r4)
            r4.setVisibility(r1)
            goto L_0x0551
        L_0x0839:
            java.lang.String r4 = "AccountDefenceVerificationHelper/determine-current-account-defence-verification-state return code:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            goto L_0x0436
        L_0x084c:
            com.obwhatsapp.CodeInputField r3 = r0.A0V
            r3.setVisibility(r7)
            com.obwhatsapp.CodeInputField r5 = r0.A0V
            r3 = 1
            com.facebook.redex.IDxECallbackShape271S0100000_2_I0 r4 = new com.facebook.redex.IDxECallbackShape271S0100000_2_I0
            r4.<init>(r0, r3)
            r3 = 6
            r5.A06(r4, r3)
            goto L_0x03bd
        L_0x085f:
            if (r2 != r1) goto L_0x02e8
            if (r15 != 0) goto L_0x02e8
            java.lang.String r3 = "VerifyPhoneNumber/onCreate/app got killed during flash call verification, reset reg state to SMS"
            goto L_0x02d8
        L_0x0867:
            X.4XR r1 = r0.A15
            r1.A07(r7)
            X.4XR r1 = r0.A15
            r1.A08(r5)
            X.4XR r1 = r0.A15
            r1.A09(r3)
            goto L_0x02cc
        L_0x0878:
            boolean r1 = r10.getBoolean(r3, r4)
            r0.A1P = r1
            goto L_0x02cc
        L_0x0880:
            r15 = 0
            goto L_0x02cc
        L_0x0883:
            if (r2 != r5) goto L_0x089a
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.registration.RegisterPhone"
            r3.setClassName(r2, r1)
            java.lang.String r1 = "com.obwhatsapp.registration.RegisterPhone.tapped_sms_link"
            r3.putExtra(r1, r5)
            goto L_0x01e1
        L_0x089a:
            java.lang.String r6 = A02(r6)
            r0.A1B = r6
            java.lang.String r3 = "verifyphonenumber/create/code "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x01b9
        L_0x08b4:
            r0.A05 = r4
            r0.A06 = r3
            goto L_0x0098
        L_0x08ba:
            java.lang.String r1 = "verifyphonenumber/create/cc or num is missing, bounce to regphone"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            r0.A3L()
            return
        L_0x08c4:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x08c4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.VerifyPhoneNumber.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0199, code lost:
        r3.setNegativeButton(r2, new com.facebook.redex.IDxCListenerShape127S0100000_2_I0(r12, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01da, code lost:
        r3.setNegativeButton(r2, new com.facebook.redex.IDxCListenerShape6S0101000_2_I0(r12, r6, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0359, code lost:
        return X.AnonymousClass2JN.A04(r12, r12.A0Z, r12.A01, r12.A0n, new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12((java.lang.Object) r12, 33), r12.A1C, r12.A1D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x03b6, code lost:
        r3.setPositiveButton(r2, new com.facebook.redex.IDxCListenerShape127S0100000_2_I0(r12, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x03c2, code lost:
        return r3.create();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0403, code lost:
        r11.setMessage(getString(r0));
        r11.setIndeterminate(true);
        r11.setCancelable(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0410, code lost:
        return r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r22) {
        /*
            r21 = this;
            r0 = 109(0x6d, float:1.53E-43)
            r12 = r21
            r6 = r22
            if (r6 == r0) goto L_0x044c
            r0 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            if (r6 == r0) goto L_0x001d
            r0 = 604(0x25c, float:8.46E-43)
            if (r6 == r0) goto L_0x0411
            r4 = 1
            switch(r22) {
                case 21: goto L_0x0092;
                case 22: goto L_0x035a;
                case 23: goto L_0x0382;
                case 24: goto L_0x00b3;
                case 25: goto L_0x00b3;
                case 26: goto L_0x00d5;
                case 27: goto L_0x00e8;
                case 28: goto L_0x010a;
                case 29: goto L_0x012b;
                case 30: goto L_0x014e;
                case 31: goto L_0x0160;
                case 32: goto L_0x01a3;
                case 33: goto L_0x01a3;
                case 34: goto L_0x01e4;
                case 35: goto L_0x038b;
                case 36: goto L_0x0201;
                case 37: goto L_0x021c;
                case 38: goto L_0x022f;
                case 39: goto L_0x029c;
                case 40: goto L_0x02b7;
                case 41: goto L_0x0394;
                case 42: goto L_0x033e;
                case 43: goto L_0x03c3;
                case 44: goto L_0x03cc;
                case 45: goto L_0x0324;
                case 46: goto L_0x03f2;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r22) {
                case 124: goto L_0x033e;
                case 125: goto L_0x003e;
                case 126: goto L_0x004b;
                case 127: goto L_0x0034;
                case 128: goto L_0x006f;
                case 129: goto L_0x03fb;
                case 130: goto L_0x0089;
                default: goto L_0x0018;
            }
        L_0x0018:
            android.app.Dialog r11 = super.onCreateDialog(r6)
        L_0x001c:
            return r11
        L_0x001d:
            android.app.Dialog r11 = super.onCreateDialog(r6)
            if (r11 == 0) goto L_0x001c
            boolean r0 = r12.A1M
            if (r0 == 0) goto L_0x001c
            r11.setCancelable(r5)
            r1 = 3
            com.facebook.redex.IDxDListenerShape158S0100000_2_I0 r0 = new com.facebook.redex.IDxDListenerShape158S0100000_2_I0
            r0.<init>(r12, r1)
            r11.setOnDismissListener(r0)
            return r11
        L_0x0034:
            android.app.ProgressDialog r11 = new android.app.ProgressDialog
            r11.<init>(r12)
            r0 = 2131891123(0x7f1213b3, float:1.9416957E38)
            goto L_0x0403
        L_0x003e:
            X.1KO r3 = r12.A0Z
            X.15W r2 = r12.A0n
            java.lang.String r1 = r12.A1C
            java.lang.String r0 = r12.A1D
            android.app.Dialog r11 = X.AnonymousClass2JN.A05(r12, r3, r2, r1, r0)
            return r11
        L_0x004b:
            X.1KO r14 = r12.A0Z
            X.013 r15 = r12.A01
            X.15W r4 = r12.A0n
            java.lang.String r3 = r12.A1C
            java.lang.String r2 = r12.A1D
            r1 = 33
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r12, (int) r1)
            r17 = 0
            X.0zJ r11 = r12.A00
            X.0pt r13 = r12.A05
            r16 = r4
            r18 = r0
            r19 = r3
            r20 = r2
            X.02l r11 = X.AnonymousClass2JN.A0A(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r11
        L_0x006f:
            r0 = 33
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r3 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r3.<init>((java.lang.Object) r12, (int) r0)
            r0 = 34
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r2 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r2.<init>((java.lang.Object) r12, (int) r0)
            r1 = 35
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r12, (int) r1)
            android.app.Dialog r11 = X.AnonymousClass2JN.A06(r12, r3, r2, r0)
            return r11
        L_0x0089:
            java.lang.String r1 = "violationType"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0092:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            r2 = 2131891059(0x7f121373, float:1.9416827E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r0 = r12.getString(r0)
            r1[r5] = r0
            java.lang.String r0 = r12.getString(r2, r1)
            r3.A06(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x03b6
        L_0x00b3:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            r0 = 2131891120(0x7f1213b0, float:1.9416951E38)
            r3.A01(r0)
            r3.A07(r5)
            r2 = 2131891063(0x7f121377, float:1.9416835E38)
            r1 = 9
            com.facebook.redex.IDxCListenerShape6S0101000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape6S0101000_2_I0
            r0.<init>(r12, r6, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 8
            goto L_0x01da
        L_0x00d5:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            java.lang.String r0 = r12.A37()
            r3.A06(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x03b6
        L_0x00e8:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            r0 = 2131891093(0x7f121395, float:1.9416896E38)
            r3.A01(r0)
            r3.A07(r5)
            r2 = 2131891063(0x7f121377, float:1.9416835E38)
            r1 = 105(0x69, float:1.47E-43)
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r12, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x0199
        L_0x010a:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            r0 = 2131891061(0x7f121375, float:1.9416831E38)
            r3.A01(r0)
            r3.A07(r5)
            r2 = 2131891063(0x7f121377, float:1.9416835E38)
            r1 = 110(0x6e, float:1.54E-43)
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r12, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x0199
        L_0x012b:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            X.013 r7 = r12.A01
            r6 = 2131755302(0x7f100126, float:1.914148E38)
            int r0 = A1U
            long r1 = (long) r0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r5] = r0
            java.lang.String r0 = r7.A0J(r4, r6, r1)
            r3.A06(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x03b6
        L_0x014e:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            r0 = 2131891149(0x7f1213cd, float:1.941701E38)
            r3.A01(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x03b6
        L_0x0160:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            boolean r0 = r12.A48()
            r6 = 2131891091(0x7f121393, float:1.9416892E38)
            if (r0 == 0) goto L_0x0171
            r6 = 2131891162(0x7f1213da, float:1.9417036E38)
        L_0x0171:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.013 r2 = r12.A01
            long r0 = r12.A0A
            java.lang.String r0 = X.C28961Zl.A08(r2, r0)
            r4[r5] = r0
            java.lang.String r0 = r12.getString(r6, r4)
            r3.A06(r0)
            r3.A07(r5)
            r2 = 2131893494(0x7f121cf6, float:1.9421766E38)
            r1 = 103(0x67, float:1.44E-43)
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r12, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 104(0x68, float:1.46E-43)
        L_0x0199:
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r12, r1)
            r3.setNegativeButton(r2, r0)
            goto L_0x03be
        L_0x01a3:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            r0 = 33
            r7 = 2131891150(0x7f1213ce, float:1.9417012E38)
            if (r6 != r0) goto L_0x01b2
            r7 = 2131891159(0x7f1213d7, float:1.941703E38)
        L_0x01b2:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.013 r2 = r12.A01
            long r0 = r12.A0A
            java.lang.String r0 = X.C28961Zl.A08(r2, r0)
            r4[r5] = r0
            java.lang.String r0 = r12.getString(r7, r4)
            r3.A06(r0)
            r3.A07(r5)
            r2 = 2131893494(0x7f121cf6, float:1.9421766E38)
            r1 = 11
            com.facebook.redex.IDxCListenerShape6S0101000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape6S0101000_2_I0
            r0.<init>(r12, r6, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 10
        L_0x01da:
            com.facebook.redex.IDxCListenerShape6S0101000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape6S0101000_2_I0
            r0.<init>(r12, r6, r1)
            r3.setNegativeButton(r2, r0)
            goto L_0x03be
        L_0x01e4:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            r0 = 2131891053(0x7f12136d, float:1.9416815E38)
            r3.A01(r0)
            r3.A07(r5)
            r2 = 2131889801(0x7f120e89, float:1.9414276E38)
            r1 = 116(0x74, float:1.63E-43)
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r12, r1)
            r3.A0B(r0, r2)
            goto L_0x03be
        L_0x0201:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            android.content.res.Resources r2 = r12.getResources()
            X.013 r1 = r12.A01
            X.4XR r0 = r12.A15
            java.lang.String r0 = A03(r2, r1, r0)
            r3.A06(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x03b6
        L_0x021c:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            java.lang.String r0 = r12.A3A()
            r3.A06(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x03b6
        L_0x022f:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            android.content.res.Resources r6 = r12.getResources()
            X.013 r9 = r12.A01
            X.4XR r0 = r12.A15
            long r10 = r0.A00()
            long r7 = java.lang.System.currentTimeMillis()
            r1 = -1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x024c
            long r1 = r10 - r7
        L_0x024c:
            java.lang.String r4 = "verifyphonenumber/voice-retry-time/diff/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10 = 0
            r8 = 0
            r7 = 1
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0289
            r5 = 2131891103(0x7f12139f, float:1.9416917E38)
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 2131892640(0x7f1219a0, float:1.9420034E38)
            java.lang.String r0 = r6.getString(r0)
            r4[r8] = r0
            java.lang.String r0 = X.C28961Zl.A08(r9, r1)
            r4[r7] = r0
            java.lang.String r0 = r6.getString(r5, r4)
        L_0x027f:
            r3.A06(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x03b6
        L_0x0289:
            r2 = 2131891102(0x7f12139e, float:1.9416915E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = 2131892640(0x7f1219a0, float:1.9420034E38)
            java.lang.String r0 = r6.getString(r0)
            r1[r5] = r0
            java.lang.String r0 = r6.getString(r2, r1)
            goto L_0x027f
        L_0x029c:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            android.content.res.Resources r2 = r12.getResources()
            X.013 r1 = r12.A01
            X.4XR r0 = r12.A15
            java.lang.String r0 = A09(r2, r1, r0)
            r3.A06(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x03b6
        L_0x02b7:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            android.content.res.Resources r6 = r12.getResources()
            X.013 r9 = r12.A01
            X.4XR r0 = r12.A15
            long r10 = r0.A00()
            r1 = -1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x02d4
            long r7 = java.lang.System.currentTimeMillis()
            long r1 = r10 - r7
        L_0x02d4:
            java.lang.String r4 = "verifyphonenumber/wa-old-retry-time/diff/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10 = 0
            r8 = 0
            r7 = 1
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0311
            r5 = 2131891105(0x7f1213a1, float:1.941692E38)
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 2131892640(0x7f1219a0, float:1.9420034E38)
            java.lang.String r0 = r6.getString(r0)
            r4[r8] = r0
            java.lang.String r0 = X.C28961Zl.A08(r9, r1)
            r4[r7] = r0
            java.lang.String r0 = r6.getString(r5, r4)
        L_0x0307:
            r3.A06(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x03b6
        L_0x0311:
            r2 = 2131891104(0x7f1213a0, float:1.9416919E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = 2131892640(0x7f1219a0, float:1.9420034E38)
            java.lang.String r0 = r6.getString(r0)
            r1[r5] = r0
            java.lang.String r0 = r6.getString(r2, r1)
            goto L_0x0307
        L_0x0324:
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            r0 = 2131891169(0x7f1213e1, float:1.941705E38)
            r3.A02(r0)
            r0 = 2131891168(0x7f1213e0, float:1.9417048E38)
            r3.A01(r0)
            r3.A07(r5)
            r2 = 2131889801(0x7f120e89, float:1.9414276E38)
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x03b6
        L_0x033e:
            X.1KO r13 = r12.A0Z
            X.013 r14 = r12.A01
            X.15W r15 = r12.A0n
            java.lang.String r3 = r12.A1C
            java.lang.String r2 = r12.A1D
            r1 = 33
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r12, (int) r1)
            r16 = r0
            r17 = r3
            r18 = r2
            android.app.Dialog r11 = X.AnonymousClass2JN.A04(r12, r13, r14, r15, r16, r17, r18)
            return r11
        L_0x035a:
            r12.A3W(r5)
            X.0yx r0 = r12.A11
            r0.A0A(r4)
            X.0t3 r2 = r12.A05
            X.0xQ r15 = r12.A0c
            X.0xR r14 = r12.A0Y
            X.0zJ r13 = r12.A00
            X.01V r1 = r12.A08
            X.013 r0 = r12.A01
            X.2ux r11 = new X.2ux
            r16 = r1
            r17 = r2
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            com.facebook.redex.IDxCListenerShape161S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape161S0100000_2_I0
            r0.<init>(r12, r4)
            r11.setOnCancelListener(r0)
            return r11
        L_0x0382:
            android.app.ProgressDialog r11 = new android.app.ProgressDialog
            r11.<init>(r12)
            r0 = 2131891158(0x7f1213d6, float:1.9417028E38)
            goto L_0x0403
        L_0x038b:
            android.app.ProgressDialog r11 = new android.app.ProgressDialog
            r11.<init>(r12)
            r0 = 2131891112(0x7f1213a8, float:1.9416935E38)
            goto L_0x0403
        L_0x0394:
            r0 = 2131891106(0x7f1213a2, float:1.9416923E38)
            java.lang.String r2 = r12.getString(r0)
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            r1 = 2131891057(0x7f121371, float:1.9416823E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r2
            java.lang.String r0 = r12.getString(r1, r0)
            r3.A06(r0)
            r3.A07(r5)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 100
        L_0x03b6:
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r12, r1)
            r3.setPositiveButton(r2, r0)
        L_0x03be:
            X.02l r11 = r3.create()
            return r11
        L_0x03c3:
            android.app.ProgressDialog r11 = new android.app.ProgressDialog
            r11.<init>(r12)
            r0 = 2131891270(0x7f121446, float:1.9417255E38)
            goto L_0x0403
        L_0x03cc:
            r1 = 2131558959(0x7f0d022f, float:1.8743249E38)
            r0 = 0
            android.view.View r3 = android.view.View.inflate(r12, r1, r0)
            X.1fu r2 = new X.1fu
            r2.<init>(r12)
            r0 = 2131366886(0x7f0a13e6, float:1.8353678E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x03ea
            r0 = 2131886166(0x7f120056, float:1.9406903E38)
            r1.setText(r0)
        L_0x03ea:
            r2.setView(r3)
            X.02l r11 = r2.create()
            return r11
        L_0x03f2:
            android.app.ProgressDialog r11 = new android.app.ProgressDialog
            r11.<init>(r12)
            r0 = 2131891257(0x7f121439, float:1.9417229E38)
            goto L_0x0403
        L_0x03fb:
            android.app.ProgressDialog r11 = new android.app.ProgressDialog
            r11.<init>(r12)
            r0 = 2131891144(0x7f1213c8, float:1.9417E38)
        L_0x0403:
            java.lang.String r0 = r12.getString(r0)
            r11.setMessage(r0)
            r11.setIndeterminate(r4)
            r11.setCancelable(r5)
            return r11
        L_0x0411:
            X.013 r2 = r12.A01
            java.lang.String r1 = r12.A1C
            java.lang.String r0 = r12.A1D
            java.lang.String r0 = X.AnonymousClass2JN.A0E(r1, r0)
            java.lang.String r4 = r2.A0H(r0)
            X.1fu r3 = new X.1fu
            r3.<init>(r12)
            r2 = 2131886158(0x7f12004e, float:1.9406887E38)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r5] = r4
            android.text.Spanned r0 = X.AnonymousClass1ZW.A00(r12, r0, r2)
            r3.A06(r0)
            r3.A07(r1)
            r0 = 2131889801(0x7f120e89, float:1.9414276E38)
            java.lang.String r2 = r12.getString(r0)
            r1 = 99
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r12, r1)
            r3.A09(r0, r2)
            X.02l r11 = r3.create()
            return r11
        L_0x044c:
            X.0sq r3 = r12.A05
            X.1KO r13 = r12.A0Z
            X.01V r15 = r12.A08
            X.15W r2 = r12.A0n
            X.0wP r14 = r12.A07
            X.0sj r1 = r12.A0j
            X.1KP r0 = r12.A10
            r16 = r1
            r17 = r2
            r18 = r0
            r19 = r3
            android.app.Dialog r11 = X.AnonymousClass2JN.A03(r12, r13, r14, r15, r16, r17, r18, r19)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.VerifyPhoneNumber.onCreateDialog(int):android.app.Dialog");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.str13df);
        if (!this.A1F && AnonymousClass3AS.A00(A35())) {
            menu.add(0, 2, 0, R.string.str1369);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        Log.i("verifyphonenumber/ondestroy");
        A3O();
        this.A0v.A01();
        CountDownTimer countDownTimer = this.A0H;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A0H = null;
        }
        CountDownTimer countDownTimer2 = this.A0I;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
            this.A0I = null;
        }
        CountDownTimer countDownTimer3 = this.A0J;
        if (countDownTimer3 != null) {
            countDownTimer3.cancel();
            this.A0J = null;
        }
        CountDownTimer countDownTimer4 = this.A0I;
        if (countDownTimer4 != null) {
            countDownTimer4.cancel();
            this.A0I = null;
        }
        CountDownTimer countDownTimer5 = this.A0F;
        if (countDownTimer5 != null) {
            countDownTimer5.cancel();
            this.A0F = null;
        }
        A3D();
        C86194Rq r0 = this.A0r;
        if (r0 != null) {
            r0.A00(true);
        }
        C86194Rq r02 = this.A0s;
        if (r02 != null) {
            r02.A00(true);
        }
        this.A07.A03(this.A1S);
        this.A0z.A00();
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        Log.i("verifyphonenumber/intent");
        super.onNewIntent(intent);
        String A022 = A02(intent);
        if (A022 == null) {
            int intExtra = intent.getIntExtra("com.obwhatsapp.verifynumber.dialog", 0);
            int i2 = 21;
            if (intExtra != 21) {
                i2 = 22;
                if (intExtra != 22) {
                    StringBuilder sb = new StringBuilder("verifyphonenumber/intent/unknown ");
                    sb.append(intExtra);
                    Log.i(sb.toString());
                    return;
                }
            }
            AnonymousClass29T.A01(this, i2);
        } else if (this.A1H) {
            A3r(A022);
        } else {
            StringBuilder sb2 = new StringBuilder("verifyphonenumber/intent/defer-code/");
            sb2.append(A022);
            Log.i(sb2.toString());
            this.A1B = A022;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                this.A11.A08();
                A3K();
                intent = C14750ph.A01(this);
            } else if (itemId == 2) {
                this.A11.A08();
                A3K();
                intent = C14750ph.A07(this);
            } else if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            } else {
                if (this.A02 == 2) {
                    this.A17.A04(A38(), "back");
                }
                finish();
                return true;
            }
            startActivity(intent);
            finishAffinity();
            return true;
        }
        AnonymousClass39H r3 = this.A0z;
        AnonymousClass12L r2 = this.A14;
        StringBuilder sb = new StringBuilder("verify-sms +");
        sb.append(this.A1C);
        sb.append(this.A1D);
        r3.A01(this, r2, sb.toString());
        return true;
    }

    public void onPause() {
        StringBuilder sb = new StringBuilder("verifyphonenumber/pause ");
        sb.append(A1V);
        Log.i(sb.toString());
        super.onPause();
        C87424Ws r1 = this.A0x;
        r1.A02 = true;
        AnonymousClass2JN.A0K(r1.A04, AnonymousClass2JN.A00);
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putInt("com.obwhatsapp.registration.VerifyPhoneNumber.verification_state", A1V);
        if (!edit.commit()) {
            Log.w("verifyphonenumber/pause/commit failed");
        }
        String A002 = this.A0u.A04() ? this.A0u.A00() : this.A0V.getCode();
        if (!TextUtils.isEmpty(A002)) {
            this.A09.A0u(A002);
        }
        if (A35() == 14) {
            this.A0p.A02.A01();
        }
    }

    public void onPrepareDialog(int i2, Dialog dialog) {
        C005702l r5;
        String A37;
        if (i2 == 26) {
            r5 = (C005702l) dialog;
            A37 = A37();
        } else if (i2 == 39) {
            r5 = (C005702l) dialog;
            A37 = A09(getResources(), this.A01, this.A15);
        } else if (i2 == 36) {
            r5 = (C005702l) dialog;
            A37 = A03(getResources(), this.A01, this.A15);
        } else if (i2 == 37) {
            r5 = (C005702l) dialog;
            A37 = A3A();
        } else {
            return;
        }
        C06490Wi r0 = r5.A00;
        r0.A0Q = A37;
        TextView textView = r0.A0K;
        if (textView != null) {
            textView.setText(A37);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0123, code lost:
        if (r12.A09.A00() == 8) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r12 = this;
            super.onResume()
            X.4Ws r0 = r12.A0x
            r0.A00()
            r7 = 0
            android.content.SharedPreferences r1 = r12.getPreferences(r7)
            java.lang.String r0 = "com.obwhatsapp.registration.VerifyPhoneNumber.verification_state"
            int r0 = r1.getInt(r0, r7)
            A1V = r0
            X.0rz r0 = r12.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "registration_sms_code_length"
            r2 = 6
            int r0 = r1.getInt(r0, r2)
            A1T = r0
            X.0rz r0 = r12.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "registration_voice_code_length"
            int r0 = r1.getInt(r0, r2)
            A1U = r0
            X.39k r0 = r12.A0u
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0048
            com.obwhatsapp.CodeInputField r1 = r12.A0V
            int r0 = A1U
            r1.A02 = r0
        L_0x0048:
            java.lang.String r0 = r12.A1C
            if (r0 == 0) goto L_0x0241
            java.lang.String r0 = r12.A1D
            if (r0 == 0) goto L_0x0241
            X.0sC r0 = r12.A09
            int r0 = r0.A00()
            r3 = 12
            if (r0 == r3) goto L_0x01af
            X.0sC r0 = r12.A09
            int r0 = r0.A00()
            r4 = 8
            if (r0 == r4) goto L_0x0081
            boolean r0 = r12.A48()
            if (r0 != 0) goto L_0x0081
            int r1 = r12.A35()
            X.0yx r0 = r12.A11
            r0.A0A(r1)
            boolean r0 = X.AnonymousClass3AS.A00(r1)
            if (r0 == 0) goto L_0x023c
            java.lang.String r1 = "verify-second-sms"
        L_0x007c:
            X.12L r0 = r12.A14
            r0.A02(r1)
        L_0x0081:
            com.obwhatsapp.WaTextView r5 = r12.A0d
            r6 = 1
            if (r5 == 0) goto L_0x009a
            r2 = 2131892650(0x7f1219aa, float:1.9420054E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r0 = A1T
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r7] = r0
            java.lang.String r0 = r12.getString(r2, r1)
            r5.setText(r0)
        L_0x009a:
            java.lang.String r0 = "verifyphonenumber/resume verification_state="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = A1V
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = A1V
            r0 = 4
            if (r1 == r0) goto L_0x0232
            if (r1 == r4) goto L_0x0235
            X.4XR r0 = r12.A15
            if (r1 == r3) goto L_0x01f4
            long r4 = r0.A00()
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            X.4XR r0 = r12.A15
            long r2 = r0.A01()
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            X.4XR r0 = r12.A15
            android.content.SharedPreferences r8 = r0.A00
            java.lang.String r9 = "com.obwhatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
            r0 = -1
            long r0 = r8.getLong(r9, r0)
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r10
            boolean r8 = r12.A48()
            r10 = 0
            if (r8 == 0) goto L_0x0110
            r12.A46(r6)
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x00f1
            r8 = 2
            r12.A3Z(r0, r8, r6)
        L_0x00f1:
            X.4XR r0 = r12.A15
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.remove(r9)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "VerifyPhoneNumberPrefs/clear-wa-old-retry-time/error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0107:
            boolean r0 = r12.A1H
            if (r0 != 0) goto L_0x0110
            boolean r0 = r12.A1N
            r12.A43(r0)
        L_0x0110:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b0
            r12.A3Z(r4, r7, r6)
            boolean r0 = r12.A1H
            if (r0 != 0) goto L_0x0128
            X.0sC r0 = r12.A09
            int r1 = r0.A00()
            r0 = 8
            if (r1 != r0) goto L_0x0128
        L_0x0125:
            r12.A45(r6)
        L_0x0128:
            r12.A3C()
            android.os.CountDownTimer r0 = r12.A0F
            if (r0 != 0) goto L_0x0146
            X.4XR r0 = r12.A15
            android.content.SharedPreferences r3 = r0.A00
            java.lang.String r2 = "com.obwhatsapp.registration.VerifyPhoneNumber.code_verification_retry_time"
            r0 = -1
            long r2 = r3.getLong(r2, r0)
            java.lang.System.currentTimeMillis()
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r12.A3X(r2)
        L_0x0146:
            int r1 = r12.A35()
            r0 = 14
            if (r1 != r0) goto L_0x0169
            X.3AS r5 = r12.A0p
            java.lang.String r4 = r12.A1C
            X.AnonymousClass00B.A06(r4)
            java.lang.String r3 = r12.A1D
            X.AnonymousClass00B.A06(r3)
            X.3Gr r2 = new X.3Gr
            r2.<init>(r12)
            X.1Pl r1 = r5.A02
            X.51e r0 = new X.51e
            r0.<init>(r5, r2)
            r1.A02(r0, r4, r3)
        L_0x0169:
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            int r0 = r2.heightPixels
            float r1 = (float) r0
            float r0 = r2.density
            float r1 = r1 / r0
            r0 = 1140457472(0x43fa0000, float:500.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x018a
            com.obwhatsapp.CodeInputField r0 = r12.A0V
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x018a
            com.obwhatsapp.CodeInputField r0 = r12.A0V
            r0.A04(r7)
        L_0x018a:
            X.0yL r0 = r12.A0i
            r3 = 0
            r0.A03(r6, r3)
            java.lang.String r2 = r12.A1B
            if (r2 == 0) goto L_0x01ad
            java.lang.String r1 = "verifyphonenumber/resume/scheme/code "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r12.A1B
            r12.A3r(r0)
            r12.A1B = r3
        L_0x01ad:
            r12.A1H = r6
        L_0x01af:
            return
        L_0x01b0:
            X.4XR r0 = r12.A15
            r0.A05()
            int r0 = r12.A35()
            boolean r0 = X.AnonymousClass3AS.A00(r0)
            if (r0 == 0) goto L_0x01d9
            X.3AS r0 = r12.A0p
            X.1Pl r0 = r0.A02
            X.1Pk r0 = r0.A06
            long r0 = r0.A00()
            r12.A3b(r0, r4)
            X.3AS r0 = r12.A0p
            X.1Pl r0 = r0.A02
            X.1Pk r0 = r0.A06
            long r0 = r0.A01()
            r12.A3c(r0, r2)
        L_0x01d9:
            boolean r0 = r12.A1H
            if (r0 != 0) goto L_0x0128
            X.0sC r0 = r12.A09
            int r1 = r0.A00()
            r0 = 8
            if (r1 == r0) goto L_0x0125
            boolean r0 = r12.A48()
            if (r0 != 0) goto L_0x0128
            boolean r0 = r12.A1N
            r12.A42(r0)
            goto L_0x0128
        L_0x01f4:
            android.content.SharedPreferences r8 = r0.A00
            java.lang.String r7 = "com.obwhatsapp.registration.VerifyPhoneNumber.appeal_token"
            boolean r0 = r8.contains(r7)
            java.lang.String r5 = "com.obwhatsapp.registration.VerifyPhoneNumber.is_eu_smb"
            java.lang.String r3 = "com.obwhatsapp.registration.VerifyPhoneNumber.violation_type"
            java.lang.String r2 = "com.obwhatsapp.registration.VerifyPhoneNumber.violated_policy"
            r1 = 0
            if (r0 == 0) goto L_0x022d
            boolean r0 = r8.contains(r2)
            if (r0 == 0) goto L_0x022d
            boolean r0 = r8.contains(r3)
            if (r0 == 0) goto L_0x022d
            boolean r0 = r8.contains(r5)
            if (r0 == 0) goto L_0x022d
            r0 = 0
            java.lang.String r4 = r8.getString(r3, r0)
            java.lang.String r3 = r8.getString(r2, r0)
            boolean r2 = r8.getBoolean(r5, r1)
            java.lang.String r1 = r8.getString(r7, r0)
            X.1el r0 = new X.1el
            r0.<init>(r4, r3, r1, r2)
        L_0x022d:
            r12.A3Q()
            goto L_0x018a
        L_0x0232:
            r0 = 21
            goto L_0x0237
        L_0x0235:
            r0 = 22
        L_0x0237:
            X.AnonymousClass29T.A01(r12, r0)
            goto L_0x018a
        L_0x023c:
            java.lang.String r1 = "verify-sms"
            goto L_0x007c
        L_0x0241:
            java.lang.String r0 = "verifyphonenumber/resume/cc or num is missing, bounce to regphone"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r12.A3L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.VerifyPhoneNumber.onResume():void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("use_sms_retriever", this.A1P);
        super.onSaveInstanceState(bundle);
    }

    public void onStop() {
        super.onStop();
        C005702l r0 = this.A0U;
        if (r0 != null) {
            r0.dismiss();
            this.A0U = null;
        }
    }
}
