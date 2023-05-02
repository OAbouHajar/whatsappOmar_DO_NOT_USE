package org.npci.commonlibrary;

import X.AnonymousClass013;
import X.AnonymousClass652;
import X.C110135dZ;
import X.C110165dc;
import X.C110515eK;
import X.C117525t8;
import X.C118985vj;
import X.C13680ns;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

public class GetCredential extends C110515eK {
    public int A00;
    public TransitionDrawable A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public AnonymousClass013 A05;
    public JSONArray A06 = null;
    public JSONArray A07 = new JSONArray();
    public JSONObject A08 = null;
    public JSONObject A09 = null;
    public C117525t8 A0A;
    public C118985vj A0B;
    public C110165dc A0C;
    public NPCIFragment A0D = null;
    public boolean A0E = false;
    public boolean A0F;
    public final Context A0G = this;

    public static final void A03(View view, float f2, float f3) {
        RotateAnimation rotateAnimation = new RotateAnimation(f2, f3, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration((long) 300);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
    }

    public final void A1d(boolean z2) {
        float f2 = 0.0f;
        ImageView imageView = this.A04;
        if (z2) {
            A03(imageView, 0.0f, 180.0f);
        } else {
            A03(imageView, 180.0f, 0.0f);
        }
        int height = this.A02.getHeight();
        if (height == 0) {
            height = this.A00;
        }
        this.A02.clearAnimation();
        ViewPropertyAnimator animate = this.A02.animate();
        float f3 = 0.0f;
        if (!z2) {
            f3 = ((float) height) * -1.0f;
        }
        ViewPropertyAnimator y2 = animate.y(f3);
        if (z2) {
            f2 = 1.0f;
        }
        y2.alpha(f2).setDuration(300).setInterpolator(new AccelerateInterpolator()).setListener(new C110135dZ(this, height, z2));
    }

    public void onBackPressed() {
        if (this.A0E) {
            Intent A092 = C13680ns.A09();
            int i2 = 252;
            if (this.A0F) {
                i2 = 251;
            }
            setResult(i2, A092);
            super.onBackPressed();
            return;
        }
        this.A0E = true;
        Toast.makeText(this, getString(R.string.str1d2e), 0).show();
        new Handler().postDelayed(new AnonymousClass652(this), 2000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r9 = X.C110515eK.A02("value", r12, r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            if (r13 == 0) goto L_0x000d
            java.lang.String r0 = "has_error"
            boolean r0 = r13.getBoolean(r0)
            r12.A0F = r0
        L_0x000d:
            android.os.Bundle r2 = X.C13690nt.A0E(r12)
            if (r2 == 0) goto L_0x0098
            java.lang.String r0 = "configuration"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ JSONException -> 0x030f }
            if (r0 == 0) goto L_0x0021
            org.json.JSONObject r0 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x030f }
            r12.A08 = r0     // Catch:{ JSONException -> 0x030f }
        L_0x0021:
            java.lang.String r0 = "controls"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ JSONException -> 0x030f }
            if (r0 == 0) goto L_0x003c
            org.json.JSONObject r1 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x030f }
            java.lang.String r0 = "CredAllowed"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x030f }
            if (r1 == 0) goto L_0x003c
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x030f }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x030f }
            r12.A06 = r0     // Catch:{ JSONException -> 0x030f }
        L_0x003c:
            java.lang.String r0 = "salt"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ JSONException -> 0x030f }
            if (r0 == 0) goto L_0x004a
            org.json.JSONObject r0 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x030f }
            r12.A09 = r0     // Catch:{ JSONException -> 0x030f }
        L_0x004a:
            java.lang.String r0 = "payInfo"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ JSONException -> 0x030f }
            if (r1 == 0) goto L_0x0059
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x030f }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x030f }
            r12.A07 = r0     // Catch:{ JSONException -> 0x030f }
        L_0x0059:
            java.lang.String r0 = "languagePref"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ JSONException -> 0x030f }
            if (r1 == 0) goto L_0x0098
            java.lang.String r0 = "_"
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ JSONException -> 0x030f }
            java.util.Locale r3 = new java.util.Locale     // Catch:{ JSONException -> 0x030f }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x030f }
            int r1 = r2.length     // Catch:{ JSONException -> 0x030f }
            r0 = 2
            if (r1 != r0) goto L_0x007b
            r0 = 0
            r1 = r2[r0]     // Catch:{ JSONException -> 0x030f }
            r0 = 1
            r0 = r2[r0]     // Catch:{ JSONException -> 0x030f }
            java.util.Locale r3 = new java.util.Locale     // Catch:{ JSONException -> 0x030f }
            r3.<init>(r1, r0)     // Catch:{ JSONException -> 0x030f }
        L_0x007b:
            java.util.Locale.setDefault(r3)     // Catch:{ JSONException -> 0x030f }
            android.content.res.Configuration r2 = new android.content.res.Configuration     // Catch:{ JSONException -> 0x030f }
            r2.<init>()     // Catch:{ JSONException -> 0x030f }
            r2.locale = r3     // Catch:{ JSONException -> 0x030f }
            android.content.Context r0 = r12.getBaseContext()     // Catch:{ JSONException -> 0x030f }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ JSONException -> 0x030f }
            android.content.Context r0 = r12.getBaseContext()     // Catch:{ JSONException -> 0x030f }
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0M(r0)     // Catch:{ JSONException -> 0x030f }
            r1.updateConfiguration(r2, r0)     // Catch:{ JSONException -> 0x030f }
        L_0x0098:
            android.view.Window r1 = r12.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.addFlags(r0)
            r0 = 2131559452(0x7f0d041c, float:1.8744248E38)
            r12.setContentView((int) r0)
            r0 = 2131363774(0x7f0a07be, float:1.8347366E38)
            android.view.View r1 = r12.findViewById(r0)
            org.npci.commonlibrary.widget.Keypad r1 = (org.npci.commonlibrary.widget.Keypad) r1
            if (r1 == 0) goto L_0x00b9
            X.67K r0 = new X.67K
            r0.<init>(r12)
            r1.A04 = r0
        L_0x00b9:
            X.5uS r2 = new X.5uS
            r2.<init>()
            android.content.Context r1 = r12.getApplicationContext()     // Catch:{ 5p1 -> 0x00d7 }
            X.5t8 r0 = new X.5t8     // Catch:{ 5p1 -> 0x00d7 }
            r0.<init>(r1, r2)     // Catch:{ 5p1 -> 0x00d7 }
            r12.A0A = r0     // Catch:{ 5p1 -> 0x00d7 }
            X.5vj r0 = r12.A0B     // Catch:{ 5p1 -> 0x00d7 }
            java.lang.String r1 = r0.A01()     // Catch:{ 5p1 -> 0x00d7 }
            android.os.Bundle r0 = X.C13690nt.A0E(r12)     // Catch:{ 5p1 -> 0x00d7 }
            r2.A00(r12, r0, r1)     // Catch:{ 5p1 -> 0x00d7 }
            goto L_0x00da
        L_0x00d7:
            r0 = 1
            r12.A0F = r0
        L_0x00da:
            java.lang.String r4 = "name"
            org.json.JSONObject r1 = r12.A08
            java.lang.String r6 = ""
            if (r1 == 0) goto L_0x0249
            java.lang.String r0 = "payerBankName"
            java.lang.String r8 = r1.optString(r0)
        L_0x00e8:
            org.json.JSONObject r1 = r12.A09
            if (r1 != 0) goto L_0x0145
            java.lang.String r1 = "Salt has not been provided in input"
            X.5p1 r0 = new X.5p1
            r0.<init>(r12, r1)
        L_0x00f3:
            r0 = 2131366734(0x7f0a134e, float:1.835337E38)
            android.view.View r7 = r12.findViewById(r0)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r5 = 0
            r9 = 0
        L_0x00fe:
            org.json.JSONArray r0 = r12.A07
            int r0 = r0.length()
            if (r9 >= r0) goto L_0x024c
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r12)
            r0 = 2131559458(0x7f0d0422, float:1.874426E38)
            android.view.View r8 = r1.inflate(r0, r7, r5)
            r0 = 2131366732(0x7f0a134c, float:1.8353366E38)
            android.widget.TextView r10 = X.C13680ns.A0M(r8, r0)
            r0 = 2131366733(0x7f0a134d, float:1.8353368E38)
            android.widget.TextView r3 = X.C13680ns.A0M(r8, r0)
            org.json.JSONArray r0 = r12.A07
            org.json.JSONObject r2 = r0.optJSONObject(r9)
            java.lang.String r1 = r2.optString(r4)
            X.013 r0 = r12.A05
            java.util.Locale r0 = X.C13690nt.A0m(r0)
            java.lang.String r0 = r1.toUpperCase(r0)
            r10.setText(r0)
            java.lang.String r0 = "value"
            java.lang.String r0 = r2.optString(r0)
            r3.setText(r0)
            r7.addView(r8)
            int r9 = r9 + 1
            goto L_0x00fe
        L_0x0145:
            java.lang.String r0 = "txnAmount"
            java.lang.String r7 = r1.optString(r0)
            r3 = 0
        L_0x014c:
            org.json.JSONArray r0 = r12.A07
            int r0 = r0.length()
            if (r3 >= r0) goto L_0x019b
            java.lang.String r1 = X.C110515eK.A02(r4, r12, r3)     // Catch:{ JSONException -> 0x030f }
            r0 = 2131893598(0x7f121d5e, float:1.9421977E38)
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x030f }
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x030f }
            java.lang.String r2 = "value"
            if (r0 == 0) goto L_0x016c
            java.lang.String r9 = X.C110515eK.A02(r2, r12, r3)     // Catch:{ JSONException -> 0x030f }
            goto L_0x019c
        L_0x016c:
            java.lang.String r1 = X.C110515eK.A02(r4, r12, r3)     // Catch:{ JSONException -> 0x030f }
            r0 = 2131893596(0x7f121d5c, float:1.9421973E38)
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x030f }
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x030f }
            if (r0 == 0) goto L_0x0182
            java.lang.String r9 = X.C110515eK.A02(r2, r12, r3)     // Catch:{ JSONException -> 0x030f }
            goto L_0x019c
        L_0x0182:
            java.lang.String r1 = X.C110515eK.A02(r4, r12, r3)     // Catch:{ JSONException -> 0x030f }
            r0 = 2131893597(0x7f121d5d, float:1.9421975E38)
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x030f }
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x030f }
            if (r0 == 0) goto L_0x0198
            java.lang.String r9 = X.C110515eK.A02(r2, r12, r3)     // Catch:{ JSONException -> 0x030f }
            goto L_0x019c
        L_0x0198:
            int r3 = r3 + 1
            goto L_0x014c
        L_0x019b:
            r9 = r6
        L_0x019c:
            r0 = 2131366722(0x7f0a1342, float:1.8353346E38)
            android.view.View r2 = r12.findViewById(r0)
            r0 = 2131366780(0x7f0a137c, float:1.8353463E38)
            android.widget.TextView r5 = X.C13680ns.A0N(r12, r0)
            r0 = 2131366723(0x7f0a1343, float:1.8353348E38)
            android.widget.TextView r3 = X.C13680ns.A0N(r12, r0)
            r0 = 2131366721(0x7f0a1341, float:1.8353344E38)
            android.widget.TextView r1 = X.C13680ns.A0N(r12, r0)
            r0 = 2131366720(0x7f0a1340, float:1.8353342E38)
            android.widget.ImageView r0 = X.C110115dX.A04(r12, r0)
            r12.A04 = r0
            r3.setText(r9)
            boolean r0 = r8.equals(r6)
            if (r0 != 0) goto L_0x01cd
            r5.setText(r8)
        L_0x01cd:
            boolean r0 = r7.equals(r6)
            if (r0 != 0) goto L_0x01e0
            java.lang.String r0 = "₹ "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r0)
            r1.setText(r0)
        L_0x01e0:
            android.view.WindowManager r0 = r12.getWindowManager()
            android.view.Display r1 = r0.getDefaultDisplay()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1.getSize(r0)
            int r0 = r0.y
            r12.A00 = r0
            org.json.JSONArray r0 = r12.A07
            if (r0 == 0) goto L_0x0241
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0241
            r0 = 146(0x92, float:2.05E-43)
            X.C110105dW.A0r(r2, r12, r0)
        L_0x0203:
            r0 = 2131366735(0x7f0a134f, float:1.8353372E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.A02 = r0
            r0 = 2131366731(0x7f0a134b, float:1.8353364E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.A03 = r0
            android.view.View r1 = r12.A02
            r3 = 1
            com.facebook.redex.IDxTListenerShape169S0100000_3_I1 r0 = new com.facebook.redex.IDxTListenerShape169S0100000_3_I1
            r0.<init>(r12, r3)
            r1.setOnTouchListener(r0)
            android.view.View r2 = r12.A03
            if (r2 == 0) goto L_0x022d
            r1 = 0
            com.facebook.redex.IDxTListenerShape169S0100000_3_I1 r0 = new com.facebook.redex.IDxTListenerShape169S0100000_3_I1
            r0.<init>(r12, r1)
            r2.setOnTouchListener(r0)
        L_0x022d:
            r0 = 2131366740(0x7f0a1354, float:1.8353382E38)
            android.view.View r0 = r12.findViewById(r0)
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r12.A01 = r0
            r0.setCrossFadeEnabled(r3)
            goto L_0x00f3
        L_0x0241:
            android.widget.ImageView r1 = r12.A04
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0203
        L_0x0249:
            r8 = r6
            goto L_0x00e8
        L_0x024c:
            android.view.View r3 = new android.view.View
            r3.<init>(r12)
            r2 = -1
            r1 = 1077936128(0x40400000, float:3.0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0M(r12)
            int r0 = r0.densityDpi
            int r0 = r0 / 160
            float r0 = (float) r0
            float r1 = r1 * r0
            int r1 = (int) r1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r1)
            r3.setLayoutParams(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setBackgroundColor(r0)
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
            r3.setAlpha(r0)
            r7.addView(r3)
            r1 = 3
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.String r0 = "ATMPIN"
            r11 = 0
            r4[r5] = r0
            java.lang.String r0 = "SMS|EMAIL|HOTP|TOTP"
            r10 = 1
            r4[r10] = r0
            java.lang.String r0 = "MPIN"
            r9 = 2
            r4[r9] = r0
            java.lang.String[] r3 = new java.lang.String[r1]
            org.json.JSONArray r0 = r12.A06
            if (r0 == 0) goto L_0x02de
            int r0 = r0.length()
            if (r0 != r1) goto L_0x02de
            r2 = 0
            r8 = 0
            r7 = 0
        L_0x0296:
            org.json.JSONArray r0 = r12.A06
            int r0 = r0.length()
            if (r2 >= r0) goto L_0x02d2
            org.json.JSONArray r0 = r12.A06     // Catch:{ JSONException -> 0x030f }
            java.lang.Object r1 = r0.get(r2)     // Catch:{ JSONException -> 0x030f }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x030f }
            java.lang.String r0 = "subtype"
            java.lang.String r0 = r1.optString(r0, r6)     // Catch:{ JSONException -> 0x030f }
            r3[r2] = r0     // Catch:{ JSONException -> 0x030f }
            r1 = r3[r2]     // Catch:{ JSONException -> 0x030f }
            r0 = r4[r11]     // Catch:{ JSONException -> 0x030f }
            boolean r0 = r1.matches(r0)     // Catch:{ JSONException -> 0x030f }
            if (r0 == 0) goto L_0x02b9
            r8 = 1
        L_0x02b9:
            r1 = r3[r2]     // Catch:{ JSONException -> 0x030f }
            r0 = r4[r10]     // Catch:{ JSONException -> 0x030f }
            boolean r0 = r1.matches(r0)     // Catch:{ JSONException -> 0x030f }
            if (r0 == 0) goto L_0x02c4
            r5 = 1
        L_0x02c4:
            r1 = r3[r2]     // Catch:{ JSONException -> 0x030f }
            r0 = r4[r9]     // Catch:{ JSONException -> 0x030f }
            boolean r0 = r1.matches(r0)     // Catch:{ JSONException -> 0x030f }
            if (r0 == 0) goto L_0x02cf
            r7 = 1
        L_0x02cf:
            int r2 = r2 + 1
            goto L_0x0296
        L_0x02d2:
            if (r8 == 0) goto L_0x02de
            if (r5 == 0) goto L_0x02de
            if (r7 == 0) goto L_0x02de
            org.npci.commonlibrary.ATMPinFragment r2 = new org.npci.commonlibrary.ATMPinFragment
            r2.<init>()
            goto L_0x02e3
        L_0x02de:
            org.npci.commonlibrary.PinFragment r2 = new org.npci.commonlibrary.PinFragment
            r2.<init>()
        L_0x02e3:
            android.os.Bundle r1 = X.C13690nt.A0E(r12)
            X.02C r0 = r12.AGM()
            if (r1 == 0) goto L_0x02f0
            r2.A0T(r1)
        L_0x02f0:
            X.050 r1 = new X.050
            r1.<init>(r0)
            r0 = 2131364435(0x7f0a0a53, float:1.8348707E38)
            r1.A0A(r2, r0)
            r1.A02()
            r12.A0D = r2
            r0 = 2131363878(0x7f0a0826, float:1.8347577E38)
            android.view.View r1 = r12.findViewById(r0)
            if (r1 == 0) goto L_0x030e
            r0 = 147(0x93, float:2.06E-43)
            X.C110105dW.A0r(r1, r12, r0)
        L_0x030e:
            return
        L_0x030f:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C110115dX.A0Z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.commonlibrary.GetCredential.onCreate(android.os.Bundle):void");
    }

    public void onPause() {
        super.onPause();
        try {
            C110165dc r0 = this.A0C;
            if (r0 != null) {
                unregisterReceiver(r0);
                this.A0C = null;
            }
        } catch (Throwable unused) {
            Log.e("PAY: Failed to unregister SMS receiver (Ignoring)");
        }
    }

    public void onResume() {
        super.onResume();
        if (checkCallingOrSelfPermission("android.permission.RECEIVE_SMS") == 0) {
            this.A0C = new C110165dc(this);
            IntentFilter intentFilter = new IntentFilter();
            try {
                intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
                intentFilter.setPriority(Integer.MAX_VALUE);
                registerReceiver(this.A0C, intentFilter);
            } catch (Throwable unused) {
                Log.e("PAY: Failed to register SMS broadcast receiver (Ignoring)");
            }
        } else {
            Log.e("PAY: RECEIVE_SMS permission not provided by the App. This will affect Auto OTP detection feature of Common Library");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_error", this.A0F);
    }
}
