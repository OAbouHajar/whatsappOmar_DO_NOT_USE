package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.redex.IDxLHandlerShape466S0100000_2_I0;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.19l  reason: invalid class name and case insensitive filesystem */
public class C228319l {
    public final C52342de A00;
    public final AnonymousClass01D A01;
    public final AnonymousClass01D A02;
    public final List A03;

    public C228319l(AnonymousClass01D r6, AnonymousClass01D r7) {
        IDxLHandlerShape466S0100000_2_I0 iDxLHandlerShape466S0100000_2_I0 = new IDxLHandlerShape466S0100000_2_I0(this, 0);
        this.A00 = iDxLHandlerShape466S0100000_2_I0;
        this.A03 = new ArrayList(Arrays.asList(new C52342de[]{new IDxLHandlerShape466S0100000_2_I0(this, 1), iDxLHandlerShape466S0100000_2_I0}));
        this.A01 = r6;
        this.A02 = r7;
    }

    public final Intent A00(Context context, Uri uri) {
        JSONObject jSONObject;
        String A06 = ((C14720pe) this.A01.get()).A06(C16620tM.A02, 210);
        if (TextUtils.isEmpty(A06)) {
            return null;
        }
        C52352df r1 = new C52352df();
        this.A02.get();
        if (!C119045vp.A00(r1, uri.toString(), A06) || (jSONObject = r1.A00) == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("server_params", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("params", jSONObject2);
            return WaBloksActivity.A09(context, "com.bloks.www.minishops.whatsapp.pdp", jSONObject3.toString());
        } catch (JSONException e2) {
            Log.e("ShopsLinks.handleShopsPdpLink: Failed to assemble JSON", e2);
            return null;
        }
    }

    public final Intent A01(Context context, Uri uri) {
        C52352df r4 = new C52352df();
        String obj = uri.toString();
        AnonymousClass01D r5 = this.A01;
        C16620tM r3 = C16620tM.A02;
        String A06 = ((C14720pe) r5.get()).A06(r3, 265);
        boolean z2 = false;
        if (((C14720pe) r5.get()).A0E(r3, 267) && !TextUtils.isEmpty(A06)) {
            this.A02.get();
            if (C119045vp.A00(r4, obj, A06) && r4.A00 != null) {
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        try {
            JSONObject jSONObject = r4.A00;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("server_params", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("params", jSONObject2);
            return WaBloksActivity.A09(context, "com.bloks.www.minishops.storefront.wa", jSONObject3.toString());
        } catch (JSONException e2) {
            Log.e("ShopsLinks.handleStoreFrontLink: Failed to assemble JSON", e2);
            return null;
        }
    }
}
