package org.npci.commonlibrary;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass0SH;
import X.AnonymousClass653;
import X.AnonymousClass67Z;
import X.AnonymousClass69I;
import X.C001000l;
import X.C110105dW;
import X.C110495eG;
import X.C13680ns;
import X.C13700nu;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Timer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.npci.commonlibrary.widget.FormItemEditText;

public abstract class NPCIFragment extends AnonymousClass01A implements AnonymousClass69I {
    public int A00 = -1;
    public Context A01;
    public Handler A02;
    public PopupWindow A03;
    public Runnable A04;
    public Timer A05;
    public Timer A06 = null;
    public JSONArray A07 = null;
    public JSONObject A08 = null;
    public JSONObject A09 = null;
    public boolean A0A = false;
    public final ArrayList A0B = AnonymousClass000.A0u();

    private int A01(float f2) {
        return (int) (f2 * ((float) (A03().getDisplayMetrics().densityDpi / 160)));
    }

    public void A12() {
        Runnable runnable;
        super.A12();
        Timer timer = this.A06;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.A05;
        if (timer2 != null) {
            timer2.cancel();
        }
        Handler handler = this.A02;
        if (!(handler == null || (runnable = this.A04) == null)) {
            handler.removeCallbacks(runnable);
        }
        PopupWindow popupWindow = this.A03;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public void A16(Context context) {
        super.A16(context);
        this.A01 = context;
    }

    public void A18(Bundle bundle, View view) {
        C001000l A0C = A0C();
        if (A0C instanceof GetCredential) {
            ((GetCredential) A0C).A0D = this;
        }
    }

    public C110495eG A19(String str, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C110495eG r3 = new C110495eG(A0C());
        if (this.A07.length() == 1) {
            r3.setActionBarPositionTop(true);
            layoutParams.width = A01(300.0f);
            layoutParams.topMargin = A01(40.0f);
            FormItemEditText formItemEditText = r3.A0A;
            formItemEditText.setCharSize(0.0f);
            formItemEditText.setSpace((float) A01(15.0f));
            formItemEditText.setFontSize((float) A01(22.0f));
            formItemEditText.setPadding(0, A01(32.0f), 0, 0);
            formItemEditText.setMargin(new int[]{0, A01(32.0f), 0, 0});
            formItemEditText.setLineStrokeCentered(true);
            formItemEditText.setLineStrokeSelected((float) A01(2.0f));
            formItemEditText.setColorStates(AnonymousClass00T.A03(A0C(), R.color.color0454));
        }
        r3.setLayoutParams(layoutParams);
        r3.setInputLength(i3);
        r3.A0B = this;
        r3.setTitle(str);
        r3.A01 = i2;
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0275, code lost:
        r2 = X.C13680ns.A09();
        r2.putExtra("credBlocks", r3.A04);
        ((android.app.Activity) r3.A01).setResult(250, r2);
        X.AnonymousClass3K4.A0y(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x028e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        r6 = X.C110115dX.A0l(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018f, code lost:
        r4 = X.C110115dX.A0l(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d7, code lost:
        if (r3.A03 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d9, code lost:
        r3.A03 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01df, code lost:
        if (r5 >= r4.size()) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e1, code lost:
        r1 = (org.json.JSONObject) ((X.AnonymousClass69X) r4.get(r5)).getFormDataTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r8 = r1.getString("type");
        r9 = r1.getString("subtype");
        r3.A09.put("credential", ((X.AnonymousClass69X) r4.get(r5)).getInputValue());
        r7 = ((org.npci.commonlibrary.GetCredential) r3.A01).A0A.A04.A00(r3.A09);
        r10 = r3.A02.A00();
        r2 = ((org.npci.commonlibrary.GetCredential) r3.A01).A0A;
        r6 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0226, code lost:
        if (r6 != null) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0228, code lost:
        r0 = r2.A05;
        r1 = r0.A03;
        r2.A00 = r1;
        r6 = new X.C118115uA(r0.A00, r1);
        r2.A01 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0237, code lost:
        r3.A0u();
        r2 = r6.A00(r7, r8, r9, r10, r3.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0240, code lost:
        if (r2 == null) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0242, code lost:
        r1 = r3.A04;
        r0 = X.AnonymousClass000.A0o();
        X.C115335pa.A00(r2, r0);
        r1.put(r9, r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0252, code lost:
        r5 = r5 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1A() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof org.npci.commonlibrary.PinFragment
            if (r0 == 0) goto L_0x0101
            r3 = r12
            org.npci.commonlibrary.PinFragment r3 = (org.npci.commonlibrary.PinFragment) r3
            int r1 = r3.A00
            java.util.ArrayList r5 = r3.A0B
            int r0 = r5.size()
            int r0 = r0 + -1
            if (r1 >= r0) goto L_0x002f
            int r0 = r1 + 1
            java.lang.Object r0 = r5.get(r0)
            X.69X r0 = (X.AnonymousClass69X) r0
            boolean r0 = r0.A9B()
            if (r0 == 0) goto L_0x0058
            int r0 = r3.A00
            int r1 = r0 + 1
            r3.A00 = r1
            int r0 = r5.size()
            int r0 = r0 + -1
            if (r1 < r0) goto L_0x0058
        L_0x002f:
            int r1 = r3.A00
            r0 = -1
            if (r1 == r0) goto L_0x0059
            java.lang.Object r0 = r5.get(r1)
            boolean r0 = r0 instanceof X.C110495eG
            if (r0 == 0) goto L_0x0059
            X.5eG r6 = X.C110115dX.A0l(r5, r1)
            java.lang.String r0 = r6.getInputValue()
            if (r0 == 0) goto L_0x004e
            int r1 = r0.length()
            int r0 = r6.A00
            if (r1 == r0) goto L_0x0059
        L_0x004e:
            r0 = 2131893558(0x7f121d36, float:1.9421896E38)
        L_0x0051:
            java.lang.String r0 = r3.A0J(r0)
            r3.A1C(r6, r0)
        L_0x0058:
            return
        L_0x0059:
            r4 = 0
            r2 = 0
        L_0x005b:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x0080
            java.lang.Object r0 = r5.get(r2)
            boolean r0 = r0 instanceof X.C110495eG
            if (r0 == 0) goto L_0x007d
            X.5eG r6 = X.C110115dX.A0l(r5, r2)
            java.lang.String r0 = r6.getInputValue()
            int r1 = r0.length()
            int r0 = r6.A00
            if (r1 == r0) goto L_0x007d
            r0 = 2131893551(0x7f121d2f, float:1.9421882E38)
            goto L_0x0051
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x0080:
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0058
            r0 = 1
            r3.A03 = r0
        L_0x0087:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x0255
            java.lang.Object r0 = r5.get(r4)     // Catch:{ JSONException -> 0x026f }
            X.69X r0 = (X.AnonymousClass69X) r0     // Catch:{ JSONException -> 0x026f }
            java.lang.Object r1 = r0.getFormDataTag()     // Catch:{ JSONException -> 0x026f }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x026f }
            java.lang.String r0 = "type"
            java.lang.String r8 = r1.getString(r0)     // Catch:{ JSONException -> 0x026f }
            java.lang.String r0 = "subtype"
            java.lang.String r9 = r1.getString(r0)     // Catch:{ JSONException -> 0x026f }
            org.json.JSONObject r2 = r3.A09     // Catch:{ JSONException -> 0x026f }
            java.lang.String r1 = "credential"
            java.lang.Object r0 = r5.get(r4)     // Catch:{ JSONException -> 0x026f }
            X.69X r0 = (X.AnonymousClass69X) r0     // Catch:{ JSONException -> 0x026f }
            java.lang.String r0 = r0.getInputValue()     // Catch:{ JSONException -> 0x026f }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x026f }
            android.content.Context r0 = r3.A01     // Catch:{ JSONException -> 0x026f }
            org.npci.commonlibrary.GetCredential r0 = (org.npci.commonlibrary.GetCredential) r0     // Catch:{ JSONException -> 0x026f }
            X.5t8 r0 = r0.A0A     // Catch:{ JSONException -> 0x026f }
            X.5u9 r1 = r0.A04     // Catch:{ JSONException -> 0x026f }
            org.json.JSONObject r0 = r3.A09     // Catch:{ JSONException -> 0x026f }
            java.lang.String r7 = r1.A00(r0)     // Catch:{ JSONException -> 0x026f }
            X.5vj r0 = r3.A02     // Catch:{ JSONException -> 0x026f }
            java.lang.String r10 = r0.A00()     // Catch:{ JSONException -> 0x026f }
            android.content.Context r0 = r3.A01     // Catch:{ JSONException -> 0x026f }
            org.npci.commonlibrary.GetCredential r0 = (org.npci.commonlibrary.GetCredential) r0     // Catch:{ JSONException -> 0x026f }
            X.5t8 r2 = r0.A0A     // Catch:{ JSONException -> 0x026f }
            X.5uA r6 = r2.A01     // Catch:{ JSONException -> 0x026f }
            if (r6 != 0) goto L_0x00e3
            X.5uS r0 = r2.A05     // Catch:{ JSONException -> 0x026f }
            X.5wB r1 = r0.A03     // Catch:{ JSONException -> 0x026f }
            r2.A00 = r1     // Catch:{ JSONException -> 0x026f }
            java.lang.String r0 = r0.A00     // Catch:{ JSONException -> 0x026f }
            X.5uA r6 = new X.5uA     // Catch:{ JSONException -> 0x026f }
            r6.<init>(r0, r1)     // Catch:{ JSONException -> 0x026f }
            r2.A01 = r6     // Catch:{ JSONException -> 0x026f }
        L_0x00e3:
            r3.A0u()     // Catch:{ JSONException -> 0x026f }
            org.json.JSONObject r11 = r3.A09     // Catch:{ JSONException -> 0x026f }
            X.636 r2 = r6.A00(r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x026f }
            if (r2 == 0) goto L_0x00fe
            java.util.HashMap r1 = r3.A04     // Catch:{ JSONException -> 0x026f }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x026f }
            X.C115335pa.A00(r2, r0)     // Catch:{ JSONException -> 0x026f }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x026f }
            r1.put(r9, r0)     // Catch:{ JSONException -> 0x026f }
        L_0x00fe:
            int r4 = r4 + 1
            goto L_0x0087
        L_0x0101:
            r3 = r12
            org.npci.commonlibrary.ATMPinFragment r3 = (org.npci.commonlibrary.ATMPinFragment) r3
            int r0 = r3.A00
            r6 = 1
            if (r0 != 0) goto L_0x011b
            java.util.ArrayList r0 = r3.A0B
            java.lang.Object r0 = r0.get(r6)
            X.69X r0 = (X.AnonymousClass69X) r0
            r0.A9B()
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            return
        L_0x011b:
            r2 = 2
            if (r0 != r6) goto L_0x016e
            java.util.ArrayList r5 = r3.A0B
            r4 = 0
            X.5eG r0 = X.C110115dX.A0l(r5, r4)
            int r1 = r0.A00
            java.lang.Object r0 = r5.get(r4)
            X.69X r0 = (X.AnonymousClass69X) r0
            java.lang.String r0 = r0.getInputValue()
            int r0 = r0.length()
            if (r1 == r0) goto L_0x0146
            android.view.View r1 = X.AnonymousClass000.A0N(r5, r4)
            r0 = 2131893561(0x7f121d39, float:1.9421902E38)
        L_0x013e:
            java.lang.String r0 = r3.A0J(r0)
            r3.A1C(r1, r0)
            return
        L_0x0146:
            X.5eG r0 = X.C110115dX.A0l(r5, r6)
            int r1 = r0.A00
            java.lang.Object r0 = r5.get(r6)
            X.69X r0 = (X.AnonymousClass69X) r0
            java.lang.String r0 = r0.getInputValue()
            int r0 = r0.length()
            if (r1 == r0) goto L_0x0164
            android.view.View r1 = X.AnonymousClass000.A0N(r5, r6)
            r0 = 2131893549(0x7f121d2d, float:1.9421878E38)
            goto L_0x013e
        L_0x0164:
            android.widget.ViewSwitcher r0 = r3.A01
            if (r0 == 0) goto L_0x016e
            r0.showNext()
            r3.A00 = r2
            return
        L_0x016e:
            int r1 = r3.A00
            if (r1 != r2) goto L_0x0180
            java.util.ArrayList r0 = r3.A0B
            java.lang.Object r0 = r0.get(r1)
            X.69X r0 = (X.AnonymousClass69X) r0
            boolean r0 = r0.A9B()
            if (r0 == 0) goto L_0x0058
        L_0x0180:
            int r2 = r3.A00
            r0 = -1
            if (r2 == r0) goto L_0x01ac
            java.util.ArrayList r1 = r3.A0B
            java.lang.Object r0 = r1.get(r2)
            boolean r0 = r0 instanceof X.C110495eG
            if (r0 == 0) goto L_0x01ac
            X.5eG r4 = X.C110115dX.A0l(r1, r2)
            java.lang.String r0 = r4.getInputValue()
            if (r0 == 0) goto L_0x01a1
            int r1 = r0.length()
            int r0 = r4.A00
            if (r1 == r0) goto L_0x01ac
        L_0x01a1:
            r0 = 2131893558(0x7f121d36, float:1.9421896E38)
        L_0x01a4:
            java.lang.String r0 = r3.A0J(r0)
            r3.A1C(r4, r0)
            return
        L_0x01ac:
            r5 = 0
            r2 = 0
        L_0x01ae:
            java.util.ArrayList r4 = r3.A0B
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x01d5
            java.lang.Object r0 = r4.get(r2)
            boolean r0 = r0 instanceof X.C110495eG
            if (r0 == 0) goto L_0x01d2
            X.5eG r4 = X.C110115dX.A0l(r4, r2)
            java.lang.String r0 = r4.getInputValue()
            int r1 = r0.length()
            int r0 = r4.A00
            if (r1 == r0) goto L_0x01d2
            r0 = 2131893551(0x7f121d2f, float:1.9421882E38)
            goto L_0x01a4
        L_0x01d2:
            int r2 = r2 + 1
            goto L_0x01ae
        L_0x01d5:
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0058
            r3.A03 = r6
        L_0x01db:
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x0275
            java.lang.Object r0 = r4.get(r5)
            X.69X r0 = (X.AnonymousClass69X) r0
            java.lang.Object r1 = r0.getFormDataTag()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r0 = "type"
            java.lang.String r8 = r1.getString(r0)     // Catch:{ JSONException -> 0x026f }
            java.lang.String r0 = "subtype"
            java.lang.String r9 = r1.getString(r0)     // Catch:{ JSONException -> 0x026f }
            org.json.JSONObject r2 = r3.A09     // Catch:{ JSONException -> 0x026f }
            java.lang.String r1 = "credential"
            java.lang.Object r0 = r4.get(r5)     // Catch:{ JSONException -> 0x026f }
            X.69X r0 = (X.AnonymousClass69X) r0     // Catch:{ JSONException -> 0x026f }
            java.lang.String r0 = r0.getInputValue()     // Catch:{ JSONException -> 0x026f }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x026f }
            android.content.Context r0 = r3.A01     // Catch:{ JSONException -> 0x026f }
            org.npci.commonlibrary.GetCredential r0 = (org.npci.commonlibrary.GetCredential) r0     // Catch:{ JSONException -> 0x026f }
            X.5t8 r0 = r0.A0A     // Catch:{ JSONException -> 0x026f }
            X.5u9 r1 = r0.A04     // Catch:{ JSONException -> 0x026f }
            org.json.JSONObject r0 = r3.A09     // Catch:{ JSONException -> 0x026f }
            java.lang.String r7 = r1.A00(r0)     // Catch:{ JSONException -> 0x026f }
            X.5vj r0 = r3.A02     // Catch:{ JSONException -> 0x026f }
            java.lang.String r10 = r0.A00()     // Catch:{ JSONException -> 0x026f }
            android.content.Context r0 = r3.A01     // Catch:{ JSONException -> 0x026f }
            org.npci.commonlibrary.GetCredential r0 = (org.npci.commonlibrary.GetCredential) r0     // Catch:{ JSONException -> 0x026f }
            X.5t8 r2 = r0.A0A     // Catch:{ JSONException -> 0x026f }
            X.5uA r6 = r2.A01     // Catch:{ JSONException -> 0x026f }
            if (r6 != 0) goto L_0x0237
            X.5uS r0 = r2.A05     // Catch:{ JSONException -> 0x026f }
            X.5wB r1 = r0.A03     // Catch:{ JSONException -> 0x026f }
            r2.A00 = r1     // Catch:{ JSONException -> 0x026f }
            java.lang.String r0 = r0.A00     // Catch:{ JSONException -> 0x026f }
            X.5uA r6 = new X.5uA     // Catch:{ JSONException -> 0x026f }
            r6.<init>(r0, r1)     // Catch:{ JSONException -> 0x026f }
            r2.A01 = r6     // Catch:{ JSONException -> 0x026f }
        L_0x0237:
            r3.A0u()     // Catch:{ JSONException -> 0x026f }
            org.json.JSONObject r11 = r3.A09     // Catch:{ JSONException -> 0x026f }
            X.636 r2 = r6.A00(r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x026f }
            if (r2 == 0) goto L_0x0252
            java.util.HashMap r1 = r3.A04     // Catch:{ JSONException -> 0x026f }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x026f }
            X.C115335pa.A00(r2, r0)     // Catch:{ JSONException -> 0x026f }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x026f }
            r1.put(r9, r0)     // Catch:{ JSONException -> 0x026f }
        L_0x0252:
            int r5 = r5 + 1
            goto L_0x01db
        L_0x0255:
            android.content.Intent r2 = X.C13680ns.A09()
            java.util.HashMap r1 = r3.A04
            java.lang.String r0 = "credBlocks"
            r2.putExtra(r0, r1)
            android.content.Context r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 250(0xfa, float:3.5E-43)
            r1.setResult(r0, r2)
            android.content.Context r0 = r3.A01
            X.AnonymousClass3K4.A0y(r0)
            return
        L_0x026f:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C110115dX.A0Z(r0)
            throw r0
        L_0x0275:
            android.content.Intent r2 = X.C13680ns.A09()
            java.util.HashMap r1 = r3.A04
            java.lang.String r0 = "credBlocks"
            r2.putExtra(r0, r1)
            android.content.Context r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 250(0xfa, float:3.5E-43)
            r1.setResult(r0, r2)
            android.content.Context r0 = r3.A01
            X.AnonymousClass3K4.A0y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.commonlibrary.NPCIFragment.A1A():void");
    }

    public void A1B() {
        String string;
        Bundle bundle = this.A05;
        if (bundle != null) {
            try {
                String string2 = bundle.getString("configuration");
                if (string2 != null) {
                    this.A08 = C13700nu.A0K(string2);
                }
                String string3 = bundle.getString("controls");
                if (!(string3 == null || (string = C13700nu.A0K(string3).getString("CredAllowed")) == null)) {
                    this.A07 = new JSONArray(string);
                    ArrayList A0u = AnonymousClass000.A0u();
                    JSONObject jSONObject = null;
                    JSONObject jSONObject2 = null;
                    JSONObject jSONObject3 = null;
                    JSONObject jSONObject4 = null;
                    for (int i2 = 0; i2 < this.A07.length(); i2++) {
                        try {
                            String optString = ((JSONObject) this.A07.get(i2)).optString("subtype", "");
                            if (optString.equals("ATMPIN")) {
                                jSONObject = this.A07.getJSONObject(i2);
                            }
                            if (optString.matches("OTP|SMS|HOTP|TOTP")) {
                                jSONObject2 = this.A07.getJSONObject(i2);
                            }
                            if (optString.equals("MPIN")) {
                                jSONObject3 = this.A07.getJSONObject(i2);
                            }
                            if (optString.equals("NMPIN")) {
                                jSONObject4 = this.A07.getJSONObject(i2);
                            }
                        } catch (JSONException unused) {
                            Log.e("PAY: sortCredAllowedString failed");
                        }
                    }
                    if (!(this.A07.length() != 3 || jSONObject == null || jSONObject2 == null || jSONObject3 == null)) {
                        A0u.add(jSONObject2);
                        A0u.add(jSONObject);
                        A0u.add(jSONObject3);
                    }
                    if (!(this.A07.length() != 2 || jSONObject2 == null || jSONObject3 == null)) {
                        A0u.add(jSONObject2);
                        A0u.add(jSONObject3);
                    }
                    if (!(this.A07.length() != 2 || jSONObject3 == null || jSONObject4 == null)) {
                        A0u.add(jSONObject3);
                        A0u.add(jSONObject4);
                    }
                    if (A0u.size() > 0) {
                        this.A07 = new JSONArray(A0u);
                    }
                }
                String string4 = bundle.getString("salt");
                if (string4 != null) {
                    this.A09 = C13700nu.A0K(string4);
                }
                String string5 = bundle.getString("payInfo");
                if (string5 != null) {
                    new JSONArray(string5);
                }
            } catch (JSONException e2) {
                Log.e("PAY: Error while reading Arguments", e2);
            }
        }
    }

    public void A1C(View view, String str) {
        PopupWindow popupWindow = this.A03;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        View inflate = A0C().getLayoutInflater().inflate(R.layout.layout0420, (ViewGroup) null);
        C13680ns.A0M(inflate, R.id.popup_text).setText(str);
        PopupWindow popupWindow2 = new PopupWindow(inflate, -2, A01(60.0f));
        this.A03 = popupWindow2;
        popupWindow2.setAnimationStyle(R.style.style01f4);
        this.A03.showAtLocation(view, 17, 0, 0);
        C110105dW.A0r(inflate.findViewById(R.id.popup_button), this, 148);
        this.A05 = new Timer();
        Handler A0L = AnonymousClass000.A0L();
        this.A02 = A0L;
        AnonymousClass653 r2 = new AnonymousClass653(this);
        this.A04 = r2;
        A0L.postDelayed(r2, 3000);
    }

    public void A1D(C110495eG r11) {
        Timer timer = new Timer();
        this.A06 = timer;
        timer.schedule(new AnonymousClass67Z(this), 45000);
        r11.Agw((Drawable) null, (View.OnClickListener) null, "", 0, false, false);
        r11.A01(r11.A03, false);
        String A0J = A0J(R.string.str1d31);
        if (!TextUtils.isEmpty(A0J)) {
            r11.A02.setText(A0J);
        }
        Button button = r11.A02;
        r11.A01(button, true);
        button.setEnabled(false);
        button.setOnClickListener((View.OnClickListener) null);
        AnonymousClass0SH A012 = r11.A01(r11.A05, true);
        A012.A09(new AccelerateDecelerateInterpolator());
        A012.A02();
    }
}
