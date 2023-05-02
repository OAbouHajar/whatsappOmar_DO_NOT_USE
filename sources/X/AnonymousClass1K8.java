package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.1K8  reason: invalid class name */
public class AnonymousClass1K8 {
    public final C16300so A00;
    public final C14710pd A01;

    public AnonymousClass1K8(C16300so r1, C14710pd r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Matcher A00(String str) {
        if (!TextUtils.isEmpty(str)) {
            String A06 = this.A01.A06(C16620tM.A02, 265);
            if (!TextUtils.isEmpty(A06)) {
                try {
                    AnonymousClass00B.A06(A06);
                    Pattern compile = Pattern.compile(new JSONObject(A06).getJSONArray("url").getJSONObject(0).getString("regex"));
                    AnonymousClass00B.A06(str);
                    return compile.matcher(str);
                } catch (Exception e2) {
                    Log.e((Throwable) e2);
                    throw new C803843q((Throwable) e2);
                }
            } else {
                throw new C803843q("SHOPS_STOREFRONT_URLS_CONFIG_CODE was null/empty");
            }
        } else {
            throw new C803843q("Shop url was null");
        }
    }

    public boolean A01(String str) {
        try {
            return A00(str).matches();
        } catch (C803843q e2) {
            Log.e((Throwable) e2);
            this.A00.AcB("ShopUtils/isShopUrl", str, true);
            return false;
        }
    }
}
