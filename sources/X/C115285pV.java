package X;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5pV  reason: invalid class name and case insensitive filesystem */
public final class C115285pV {
    public static final Uri A00(String str) {
        String str2;
        if (str != null) {
            Object[] array = C008603x.A09(str, new String[]{"."}, 0).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                if (strArr.length > 1) {
                    byte[] decode = Base64.decode(strArr[1], 0);
                    try {
                        if (Build.VERSION.SDK_INT >= 19) {
                            C18450wi.A0B(decode);
                            Charset charset = StandardCharsets.UTF_8;
                            C18450wi.A0D(charset);
                            str2 = new String(decode, charset);
                        } else {
                            C18450wi.A0B(decode);
                            Charset forName = Charset.forName(DefaultCrypto.UTF_8);
                            C18450wi.A0B(forName);
                            str2 = new String(decode, forName);
                        }
                    } catch (UnsupportedEncodingException unused) {
                        Log.e("UnsupportedEncodingException: Credential Push data cannot be decoded");
                        str2 = null;
                    }
                    if (str2 != null) {
                        try {
                            JSONObject A0K = C13700nu.A0K(str2);
                            String string = A0K.getString("callbackURL");
                            String string2 = A0K.getJSONArray("pushAccountReceipts").getString(0);
                            if (!TextUtils.isEmpty(string)) {
                                Uri.Builder buildUpon = Uri.parse(string).buildUpon();
                                StringBuilder A0o = AnonymousClass000.A0o();
                                A0o.append("results[");
                                A0o.append(string2);
                                A0o.append(']');
                                return buildUpon.appendQueryParameter(A0o.toString(), "CANCELLED").build();
                            }
                        } catch (JSONException e2) {
                            Log.e(C18450wi.A06("JSONException: cannot parse callback url from json, ", e2.getMessage()));
                            return null;
                        }
                    }
                }
            } else {
                throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        return null;
    }
}
