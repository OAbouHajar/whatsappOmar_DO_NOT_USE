package com.obwhatsapp.registration;

import X.AnonymousClass00B;
import X.AnonymousClass01F;
import X.AnonymousClass01V;
import X.AnonymousClass10J;
import X.AnonymousClass124;
import X.AnonymousClass129;
import X.AnonymousClass15P;
import X.AnonymousClass15W;
import X.AnonymousClass1BN;
import X.AnonymousClass1G1;
import X.AnonymousClass1I2;
import X.AnonymousClass1I3;
import X.AnonymousClass1KO;
import X.AnonymousClass1KP;
import X.AnonymousClass1KQ;
import X.AnonymousClass1NE;
import X.AnonymousClass29T;
import X.AnonymousClass2F3;
import X.AnonymousClass2FT;
import X.AnonymousClass2JN;
import X.AnonymousClass2JO;
import X.AnonymousClass2Rf;
import X.AnonymousClass37K;
import X.AnonymousClass3WT;
import X.AnonymousClass4OJ;
import X.C004501y;
import X.C005402i;
import X.C1033451a;
import X.C14210on;
import X.C14500pH;
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
import X.C16340ss;
import X.C16440t3;
import X.C16460t6;
import X.C16980tz;
import X.C17030uP;
import X.C17250um;
import X.C18160wF;
import X.C18260wP;
import X.C18890xQ;
import X.C18900xR;
import X.C18990xa;
import X.C19060xh;
import X.C19070xi;
import X.C19090xk;
import X.C19220xx;
import X.C19380yL;
import X.C19430yQ;
import X.C19490yW;
import X.C19760yx;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C26071Mf;
import X.C26851Pm;
import X.C32241fu;
import X.C34331k5;
import X.C434920f;
import X.C437421i;
import X.C45902Bo;
import X.C49132Rg;
import X.C53912gV;
import X.C65673Wd;
import X.C82714Dw;
import X.C98834t3;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape236S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape190S0100000_2_I0;
import com.facebook.redex.IDxFListenerShape312S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.components.IDxCListenerShape64S0100000_2_I0;
import com.obwhatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public class ChangeNumber extends AnonymousClass2F3 {
    public static String A0N;
    public static String A0O;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public View A05;
    public ScrollView A06;
    public C26071Mf A07;
    public C82714Dw A08;
    public C17030uP A09;
    public C19380yL A0A;
    public C16460t6 A0B;
    public C19430yQ A0C;
    public C19090xk A0D;
    public AnonymousClass124 A0E;
    public C19220xx A0F;
    public AnonymousClass4OJ A0G;
    public ArrayList A0H;
    public boolean A0I;
    public final Handler A0J;
    public final C53912gV A0K;
    public final C34331k5 A0L;
    public final Runnable A0M;

    public ChangeNumber() {
        this(0);
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A0M = new RunnableRunnableShape13S0100000_I0_12((Object) this, 11);
        this.A0K = new C1033451a(this);
        this.A0J = new AnonymousClass2FT(Looper.getMainLooper(), this);
        this.A0L = new ViewOnClickCListenerShape2S0100000_I0_2(this, 27);
    }

    public ChangeNumber(int i2) {
        this.A0I = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 74));
    }

    public void A1q() {
        if (!this.A0I) {
            this.A0I = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r1.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A06 = (C18890xQ) r2.APS.get();
            this.A07 = (C16980tz) r2.AQB.get();
            this.A04 = (C18900xR) r2.ALD.get();
            this.A0K = (AnonymousClass1BN) r2.AAp.get();
            this.A0F = (C18990xa) r2.ADh.get();
            this.A05 = (AnonymousClass1KO) r2.ALY.get();
            this.A03 = (AnonymousClass1G1) r2.AJl.get();
            this.A0M = (C18160wF) r2.A5o.get();
            this.A0D = (AnonymousClass15W) r2.AOC.get();
            this.A0B = (C19070xi) r2.A03.get();
            this.A0C = (C19060xh) r2.A01.get();
            this.A0A = (AnonymousClass10J) r2.A02.get();
            this.A09 = (AnonymousClass1KQ) r2.AAL.get();
            this.A02 = (AnonymousClass129) r2.A3k.get();
            this.A0J = (C19760yx) r2.AKx.get();
            this.A08 = (C16260sj) r2.AQe.get();
            this.A0I = (AnonymousClass1KP) r2.AKw.get();
            this.A0E = (AnonymousClass124) r2.ALe.get();
            this.A0D = (C19090xk) r2.AF1.get();
            C26071Mf A002 = C26071Mf.A00();
            C16340ss.A01(A002);
            this.A07 = A002;
            this.A0B = (C16460t6) r2.A5k.get();
            this.A0F = (C19220xx) r2.APi.get();
            this.A09 = (C17030uP) r2.APp.get();
            this.A0A = (C19380yL) r2.AQd.get();
            this.A08 = new C82714Dw((AnonymousClass1NE) r2.A0y.get());
            this.A0C = (C19430yQ) r2.ADa.get();
        }
    }

    public void A36(String str, String str2, String str3) {
        super.A36(str, str2, str3);
        if (this.A0G.A02) {
            AnonymousClass2JN.A0G(this, this.A0A, this.A0J, false);
        }
        this.A0J.A0D();
        finish();
    }

    public final void A37() {
        this.A05.setElevation(this.A06.canScrollVertically(1) ? (float) this.A00 : 0.0f);
    }

    public final void A38() {
        this.A06.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape190S0100000_2_I0(this, 8));
    }

    public final void A39() {
        if (isFinishing()) {
            Log.i("changenumber/verify/cancel");
            return;
        }
        AnonymousClass2F3.A0U = 0;
        this.A09.A0u((String) null);
        this.A0C.A0C();
        Log.i("BusinessDirectoryStorageManager/onNumberChanged");
        AnonymousClass1I2 r1 = ((AnonymousClass1I3) ((C16150sX) ((AnonymousClass01F) C004501y.A00(AnonymousClass01F.class, getApplicationContext()))).A2v.get()).A00;
        Log.i("BusinessDirectorySharedPrefManager/deleteLocation");
        r1.A00().edit().remove("current_search_location").apply();
        C16320sq r0 = this.A05;
        long j2 = AnonymousClass2F3.A0U;
        C16440t3 r3 = this.A05;
        String str = AnonymousClass2F3.A0V;
        AnonymousClass00B.A06(str);
        String str2 = AnonymousClass2F3.A0W;
        AnonymousClass00B.A06(str2);
        C16980tz r4 = this.A07;
        C19060xh r8 = this.A0C;
        C19070xi r7 = this.A0B;
        r0.Ack(new AnonymousClass37K(r3, r4, this.A09, this.A0A, r7, r8, this.A08.A00, this.A0I, this, str, str2, (String) null, (JSONObject) null, j2), new Void[0]);
    }

    public final void A3A(boolean z2) {
        boolean z3;
        Intent A0A2;
        String str = AnonymousClass2F3.A0X;
        boolean z4 = z2;
        if (str != null) {
            z3 = true;
            A0A2 = C14750ph.A0h(this, str, AnonymousClass2F3.A0T, this.A02, this.A03, this.A04, z4, false, true, false, AnonymousClass2F3.A0Y);
        } else if (this.A0R) {
            int i2 = this.A00;
            z3 = true;
            C19760yx r2 = this.A0J;
            if (i2 == 1) {
                r2.A0A(14);
                A0A2 = C14750ph.A0E(this, this.A02, this.A03, true, z4);
            } else {
                r2.A0A(13);
                A0A2 = C14750ph.A0A(this, 1, this.A02, this.A03, 0, true, z4, false);
            }
        } else {
            z3 = true;
            A0A2 = C14750ph.A0A(this, 0, this.A02, this.A03, this.A04, true, z4, AnonymousClass2F3.A0Y);
        }
        A2X(A0A2, z3);
    }

    public final boolean A3B(AnonymousClass4OJ r7, String str, String str2) {
        EditText editText;
        int i2;
        switch (AnonymousClass2JO.A00(this.A03, str, str2)) {
            case 1:
                int parseInt = Integer.parseInt(str);
                String replaceAll = str2.replaceAll("\\D", "");
                try {
                    replaceAll = this.A03.A02(parseInt, replaceAll);
                } catch (IOException e2) {
                    Log.e("changenumber/cc failed trimLeadingZero from CountryPhoneInfo", e2);
                }
                StringBuilder sb = new StringBuilder("changenumber/cc=");
                sb.append(str);
                sb.append("/number=");
                sb.append(replaceAll);
                Log.i(sb.toString());
                AnonymousClass2F3.A0V = str;
                AnonymousClass2F3.A0W = replaceAll;
                return true;
            case 2:
                Afh(getString(R.string.str136a, new Object[]{1, 3}));
                editText = r7.A02;
                break;
            case 3:
                Afg(R.string.str136b);
                r7.A02.setText("");
                editText = r7.A02;
                break;
            case 4:
                Afg(R.string.str1379);
                editText = r7.A03;
                break;
            case 5:
                i2 = R.string.str1370;
                break;
            case 6:
                i2 = R.string.str136f;
                break;
            default:
                i2 = R.string.str136e;
                break;
        }
        Afh(getString(i2, new Object[]{this.A0M.A02(this.A01, r7.A06)}));
        editText = r7.A03;
        editText.requestFocus();
        return false;
    }

    public void AQn() {
        this.A0M.run();
    }

    public void ATy(String str, String str2, String str3, byte[] bArr) {
        C19220xx r0 = this.A0F;
        r0.A03();
        r0.A05();
        this.A0E.A00();
        this.A0D.A0D(false);
        this.A01.A09();
        new File(getFilesDir(), "me").delete();
        this.A0J.A0C(AnonymousClass2F3.A0V, AnonymousClass2F3.A0W, (String) null);
        C19760yx r2 = this.A0J;
        int i2 = 4;
        if (AnonymousClass2F3.A0Y) {
            i2 = 15;
        }
        r2.A0A(i2);
        this.A02 = (AnonymousClass2JN.A02(str, 0) * 1000) + System.currentTimeMillis();
        this.A03 = (AnonymousClass2JN.A02(str2, 0) * 1000) + System.currentTimeMillis();
        this.A04 = (AnonymousClass2JN.A02(str3, 0) * 1000) + System.currentTimeMillis();
        if (!AnonymousClass2F3.A0Y) {
            if (C26851Pm.A00(this.A08, AnonymousClass2F3.A0T)) {
                A2X(C14750ph.A0D(this, this.A02, this.A03, true), true);
                return;
            } else if (this.A08.A03("android.permission.RECEIVE_SMS") != 0) {
                if (C437421i.A01(this)) {
                    C14210on A012 = new AnonymousClass3WT((Activity) this).A01(new C65673Wd(), 1);
                    C98834t3 r02 = new C98834t3(this);
                    Executor executor = C14500pH.A00;
                    A012.A06(r02, executor);
                    A012.A05(new IDxFListenerShape312S0100000_2_I0(this, 0), executor);
                    return;
                }
                Log.i("changenumber/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
                AnonymousClass2JN.A0J(this, 2);
                return;
            }
        }
        A3A(false);
    }

    public void Afp() {
        AnonymousClass29T.A00(this, 1);
        super.Afp();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x007b */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            r2 = -1
            r4 = 1
            if (r8 != r4) goto L_0x01b0
            if (r9 != r2) goto L_0x01cc
            java.lang.String r0 = "selectedJids"
            java.util.ArrayList r0 = r10.getStringArrayListExtra(r0)
            r7.A0H = r0
            X.129 r2 = r7.A02
            X.0sK r0 = r7.A01
            r0.A0B()
            X.1ZT r0 = r0.A05
            X.AnonymousClass00B.A06(r0)
            java.lang.String r1 = r0.user
            java.util.ArrayList r0 = r7.A0H
            X.2Gc r3 = new X.2Gc
            r3.<init>(r1, r0)
            java.lang.String r0 = "changenumbermanager/savechangenumbercontacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tz r0 = r2.A02     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            android.content.Context r2 = r0.A00     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            java.lang.String r1 = "change_number_contacts.json"
            r0 = 0
            java.io.FileOutputStream r2 = r2.openFileOutput(r1, r0)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            java.lang.String r1 = X.AnonymousClass01S.A08     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            r0.<init>(r2, r1)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            r2.beginObject()     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "old_jid"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = r3.A00     // Catch:{ all -> 0x0077 }
            r1.value(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "notify_jids"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0077 }
            r0.beginArray()     // Catch:{ all -> 0x0077 }
            java.util.ArrayList r0 = r3.A01     // Catch:{ all -> 0x0077 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0077 }
        L_0x005d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0077 }
            r2.value(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x005d
        L_0x006d:
            r2.endArray()     // Catch:{ all -> 0x0077 }
            r2.endObject()     // Catch:{ all -> 0x0077 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
            goto L_0x0086
        L_0x0077:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x007b }
        L_0x007b:
            throw r0     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c }
        L_0x007c:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumberManager/saveChangeNumberContacts/ioErrorJson "
            goto L_0x0083
        L_0x0080:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumberManager/saveChangeNumberContacts/notFoundJson "
        L_0x0083:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0086:
            X.4OJ r0 = r7.A0G
            android.widget.EditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = r0.trim()
            X.4OJ r0 = r7.A0G
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            java.lang.String r3 = r0.toString()
            X.4OJ r0 = r7.A0G
            boolean r0 = r7.A3B(r0, r6, r3)
            if (r0 == 0) goto L_0x01cc
            X.4OJ r0 = r7.A0E
            android.widget.EditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r0.trim()
            X.4OJ r0 = r7.A0E
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            java.lang.String r1 = r0.toString()
            X.4OJ r0 = r7.A0E
            boolean r0 = r7.A3B(r0, r2, r1)
            if (r0 == 0) goto L_0x01cc
            int r2 = java.lang.Integer.parseInt(r6)
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r5 = r3.replaceAll(r1, r0)
            X.1G1 r0 = r7.A03     // Catch:{ IOException -> 0x00e1 }
            java.lang.String r5 = r0.A02(r2, r5)     // Catch:{ IOException -> 0x00e1 }
            goto L_0x00e7
        L_0x00e1:
            r1 = move-exception
            java.lang.String r0 = "changenumber/phone failed trimLeadingZero from CountryPhoneInfo"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00e7:
            java.lang.String r0 = "changenumber/phone/cc="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = "/number="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            A0N = r6
            A0O = r5
            java.lang.String r0 = "changenumber/submit/cc "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " ph="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " jid="
            r1.append(r0)
            X.0sK r0 = r7.A01
            r0.A0B()
            X.1ZT r0 = r0.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0xk r0 = r7.A0D
            X.0tK r0 = r0.A0K
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x0170
            java.lang.String r0 = "changenumber/submit/no-connectivity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 2131887109(0x7f120405, float:1.9408816E38)
            java.lang.String r0 = r7.getString(r0)
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            r0 = 2131887418(0x7f12053a, float:1.9409443E38)
            java.lang.String r0 = r7.getString(r0)
            r1.append(r0)
            java.lang.String r0 = "\n\n"
            r1.append(r0)
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r0 = r7.getString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x016c:
            r7.Afh(r0)
            return
        L_0x0170:
            X.AnonymousClass29T.A01(r7, r4)
            android.os.Handler r3 = r7.A0J
            r0 = 30000(0x7530, double:1.4822E-319)
            r2 = 4
            r3.sendEmptyMessageDelayed(r2, r0)
            X.124 r1 = r7.A0E
            X.0tK r0 = r1.A01
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0196
            X.0ug r4 = r1.A02
            X.2c5 r3 = new X.2c5
            r3.<init>(r6, r5)
            r2 = 0
            r1 = 0
            r0 = 36
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r0, r1, r3)
            r4.A09(r0, r1)
            return
        L_0x0196:
            r3.removeMessages(r2)
            X.AnonymousClass29T.A00(r7, r4)
            r3 = 2131891058(0x7f121372, float:1.9416825E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 0
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r0 = r7.getString(r0)
            r2[r1] = r0
            java.lang.String r0 = r7.getString(r3, r2)
            goto L_0x016c
        L_0x01b0:
            r0 = 2
            if (r8 != r0) goto L_0x01d0
            java.lang.String r0 = "register/phone/sms permission "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            if (r9 != r2) goto L_0x01cd
            java.lang.String r0 = "granted"
        L_0x01be:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r7.A3A(r0)
        L_0x01cc:
            return
        L_0x01cd:
            java.lang.String r0 = "denied"
            goto L_0x01be
        L_0x01d0:
            super.onActivityResult(r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.ChangeNumber.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            A38();
        }
    }

    public void onCreate(Bundle bundle) {
        String simCountryIso;
        super.onCreate(bundle);
        this.A0B.A02();
        C434920f.A08(getWindow(), false);
        C434920f.A03(this, R.color.color064b);
        setTitle(R.string.str0429);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        x2.A0O(true);
        setContentView((int) R.layout.layout00fc);
        PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) findViewById(R.id.registration_fields);
        PhoneNumberEntry phoneNumberEntry2 = (PhoneNumberEntry) findViewById(R.id.registration_new_fields);
        AnonymousClass4OJ r0 = new AnonymousClass4OJ();
        this.A0G = r0;
        r0.A05 = phoneNumberEntry;
        AnonymousClass4OJ r02 = new AnonymousClass4OJ();
        this.A0E = r02;
        r02.A05 = phoneNumberEntry2;
        this.A06 = (ScrollView) findViewById(R.id.scroll_view);
        this.A05 = findViewById(R.id.bottom_button_container);
        AnonymousClass4OJ r03 = this.A0G;
        WaEditText waEditText = phoneNumberEntry.A02;
        r03.A02 = waEditText;
        waEditText.setContentDescription(getString(R.string.str0e8a));
        AnonymousClass4OJ r04 = this.A0E;
        WaEditText waEditText2 = phoneNumberEntry2.A02;
        r04.A02 = waEditText2;
        waEditText2.setContentDescription(getString(R.string.str0dd3));
        this.A0G.A03 = phoneNumberEntry.A03;
        AnonymousClass4OJ r1 = this.A0E;
        WaEditText waEditText3 = phoneNumberEntry2.A03;
        r1.A03 = waEditText3;
        C45902Bo.A03(waEditText3);
        C45902Bo.A03(this.A0G.A03);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen06f3);
        TelephonyManager A0N2 = this.A08.A0N();
        if (!(A0N2 == null || (simCountryIso = A0N2.getSimCountryIso()) == null)) {
            try {
                A0N = this.A03.A04(simCountryIso);
            } catch (IOException e2) {
                Log.e("changenumber/iso/code failed to get code from CountryPhoneInfo", e2);
            }
        }
        phoneNumberEntry.A04 = new IDxCListenerShape64S0100000_2_I0(this, 0);
        phoneNumberEntry2.A04 = new IDxCListenerShape64S0100000_2_I0(this, 1);
        AnonymousClass4OJ r12 = this.A0G;
        r12.A01 = AnonymousClass2JN.A00(r12.A03);
        AnonymousClass4OJ r13 = this.A0G;
        r13.A00 = AnonymousClass2JN.A00(r13.A02);
        AnonymousClass4OJ r14 = this.A0E;
        r14.A01 = AnonymousClass2JN.A00(r14.A03);
        AnonymousClass4OJ r15 = this.A0E;
        r15.A00 = AnonymousClass2JN.A00(r15.A02);
        TextView textView = (TextView) findViewById(R.id.next_btn);
        textView.setText(R.string.str0de0);
        textView.setOnClickListener(this.A0L);
        String str = A0N;
        if (str != null) {
            this.A0G.A02.setText(str);
            this.A0E.A02.setText(A0N);
        }
        String str2 = this.A0G.A06;
        if (str2 != null && str2.length() > 0) {
            StringBuilder sb = new StringBuilder("changenumber/country: ");
            sb.append(str2);
            Log.i(sb.toString());
            this.A0G.A05.A02(str2);
            this.A0E.A05.A02(str2);
        }
        this.A0N = ((SharedPreferences) this.A09.A01.get()).getString("change_number_new_number_banned", (String) null);
        C19760yx r05 = this.A0J;
        r05.A0v.add(this.A0K);
        this.A09.A1G(false);
        this.A09.A1Q(false);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen06f3);
            this.A06.getViewTreeObserver().addOnScrollChangedListener(new IDxCListenerShape236S0100000_2_I0(this, 2));
            A38();
        }
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 == 1) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(R.string.str1376));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i2 != 2) {
            return super.onCreateDialog(i2);
        } else {
            C32241fu r3 = new C32241fu(this);
            r3.A01(R.string.str040b);
            r3.setPositiveButton(R.string.str02ac, new IDxCListenerShape127S0100000_2_I0(this, 85));
            return r3.create();
        }
    }

    public void onDestroy() {
        C19760yx r0 = this.A0J;
        r0.A0v.remove(this.A0K);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        SharedPreferences.Editor remove;
        super.onPause();
        AnonymousClass4OJ r1 = this.A0G;
        r1.A01 = AnonymousClass2JN.A00(r1.A03);
        AnonymousClass4OJ r12 = this.A0G;
        r12.A00 = AnonymousClass2JN.A00(r12.A02);
        AnonymousClass4OJ r13 = this.A0E;
        r13.A01 = AnonymousClass2JN.A00(r13.A03);
        AnonymousClass4OJ r14 = this.A0E;
        r14.A00 = AnonymousClass2JN.A00(r14.A02);
        String str = this.A0N;
        C15860rz r0 = this.A09;
        if (str != null) {
            String str2 = AnonymousClass2F3.A0V;
            String str3 = AnonymousClass2F3.A0W;
            SharedPreferences.Editor A0K2 = r0.A0K();
            StringBuilder sb = new StringBuilder("+");
            sb.append(str2);
            sb.append(str3);
            remove = A0K2.putString("change_number_new_number_banned", sb.toString());
        } else if (((SharedPreferences) r0.A01.get()).getString("change_number_new_number_banned", (String) null) != null) {
            remove = this.A09.A0K().remove("change_number_new_number_banned");
        } else {
            return;
        }
        remove.apply();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        A0N = bundle.getString("oldCountryCode");
        A0O = bundle.getString("oldPhoneNumber");
        AnonymousClass2F3.A0V = bundle.getString("countryCode");
        AnonymousClass2F3.A0W = bundle.getString("phoneNumber");
        this.A0H = bundle.getStringArrayList("notifyJids");
        this.A01 = bundle.getInt("mode");
    }

    public void onResume() {
        super.onResume();
        String str = A0N;
        if (str != null) {
            this.A0G.A02.setText(str);
        }
        AnonymousClass4OJ r0 = this.A0G;
        AnonymousClass2JN.A0I(r0.A02, r0.A00);
        AnonymousClass4OJ r02 = this.A0G;
        AnonymousClass2JN.A0I(r02.A03, r02.A01);
        AnonymousClass4OJ r03 = this.A0E;
        AnonymousClass2JN.A0I(r03.A02, r03.A00);
        AnonymousClass4OJ r04 = this.A0E;
        AnonymousClass2JN.A0I(r04.A03, r04.A01);
        this.A0G.A03.clearFocus();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("oldCountryCode", A0N);
        bundle.putCharSequence("oldPhoneNumber", A0O);
        bundle.putCharSequence("countryCode", AnonymousClass2F3.A0V);
        bundle.putCharSequence("phoneNumber", AnonymousClass2F3.A0W);
        bundle.putStringArrayList("notifyJids", this.A0H);
        bundle.putInt("mode", this.A01);
    }
}
