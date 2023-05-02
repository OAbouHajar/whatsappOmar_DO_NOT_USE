package X;

import android.text.TextUtils;
import android.util.Pair;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3BX  reason: invalid class name */
public final class AnonymousClass3BX {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A01 = A0x;
        HashMap A0x2 = AnonymousClass000.A0x();
        A00 = A0x2;
        A0x2.put("payment_instruction", Integer.valueOf(R.string.str1d3c));
        A0x2.put("confirm", Integer.valueOf(R.string.str1d3b));
        A0x2.put("captured", Integer.valueOf(R.string.str1d3d));
        A0x2.put("pending", Integer.valueOf(R.string.str1d3e));
        C13680ns.A1X("pending", A0x, R.string.str1d42);
        A0x.put("processing", Integer.valueOf(R.string.str1d43));
        A0x.put("completed", Integer.valueOf(R.string.str1d40));
        A0x.put("canceled", Integer.valueOf(R.string.str1d3f));
        A0x.put("partially_shipped", Integer.valueOf(R.string.str1d41));
        A0x.put("shipped", Integer.valueOf(R.string.str1d44));
    }

    public static Integer A00(String str) {
        Pair pair;
        Object obj = null;
        if (str == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            pair = null;
        } else {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                pair = C13690nt.A0I(A0K.getString("payment_method"), Long.valueOf(A0K.getLong("payment_timestamp")));
            } catch (JSONException e2) {
                Log.e("CheckoutInfoContentParser/getCustomPaymentMethodStr failed to parse parameters json", e2);
                pair = null;
            }
        }
        if (pair != null) {
            obj = pair.first;
        }
        return (Integer) A00.get(obj);
    }

    public static String A01(C33211iD r3) {
        int i2 = r3.A01;
        if ((i2 & 8) == 8) {
            AnonymousClass220 r0 = r3.A0O;
            if (r0 == null) {
                r0 = AnonymousClass220.A07;
            }
            C58202t7 r02 = r0.A03;
            if (r02 == null) {
                r02 = C58202t7.A02;
            }
            return r02.A01;
        } else if ((i2 & 1) != 1) {
            return null;
        } else {
            C58852uG r03 = r3.A03;
            if (r03 == null) {
                r03 = C58852uG.A08;
            }
            return r03.A06;
        }
    }

    public static String A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C13700nu.A0K(str).getJSONObject("order").getString("status");
        } catch (JSONException e2) {
            Log.e("CheckoutInfoContentParser/getOrderStatusStr failed to parse parameters json", e2);
            return null;
        }
    }
}
