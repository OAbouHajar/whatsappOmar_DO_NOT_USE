package X;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4eD  reason: invalid class name and case insensitive filesystem */
public class C90484eD {
    public static C90484eD A02;
    public static final Lock A03 = new ReentrantLock();
    public final SharedPreferences A00;
    public final Lock A01 = new ReentrantLock();

    public C90484eD(Context context) {
        this.A00 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C90484eD A00(Context context) {
        C13710nw.A01(context);
        Lock lock = A03;
        lock.lock();
        try {
            C90484eD r1 = A02;
            if (r1 == null) {
                r1 = new C90484eD(context.getApplicationContext());
                A02 = r1;
            }
            return r1;
        } finally {
            lock.unlock();
        }
    }

    public static final String A01(String str, String str2) {
        StringBuilder A0g = C13690nt.A0g(str.length() + 1 + C13680ns.A06(str2));
        A0g.append(str);
        A0g.append(":");
        return AnonymousClass000.A0h(str2, A0g);
    }

    public GoogleSignInAccount A02() {
        String A04;
        String A042 = A04("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A042) && (A04 = A04(A01("googleSignInAccount", A042))) != null) {
            try {
                String str = null;
                if (!TextUtils.isEmpty(A04)) {
                    JSONObject jSONObject = new JSONObject(A04);
                    String optString = jSONObject.optString("photoUrl");
                    Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
                    long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                    HashSet A0o = C13680ns.A0o();
                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        A0o.add(new Scope(1, jSONArray.getString(i2)));
                    }
                    String optString2 = jSONObject.optString("id");
                    String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                    String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                    String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                    String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                    String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                    String string = jSONObject.getString("obfuscatedIdentifier");
                    C13710nw.A05(string);
                    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(parse, optString2, optString3, optString4, optString5, (String) null, string, optString6, optString7, C13680ns.A0n(A0o), 3, parseLong);
                    if (jSONObject.has("serverAuthCode")) {
                        str = jSONObject.optString("serverAuthCode");
                    }
                    googleSignInAccount.A06 = str;
                    return googleSignInAccount;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions A03() {
        String A04;
        String A042 = A04("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A042) && (A04 = A04(A01("googleSignInOptions", A042))) != null) {
            try {
                String str = null;
                if (!TextUtils.isEmpty(A04)) {
                    JSONObject jSONObject = new JSONObject(A04);
                    HashSet A0o = C13680ns.A0o();
                    JSONArray jSONArray = jSONObject.getJSONArray("scopes");
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        A0o.add(new Scope(1, jSONArray.getString(i2)));
                    }
                    String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
                    Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
                    ArrayList A0n = C13680ns.A0n(A0o);
                    boolean z2 = jSONObject.getBoolean("idTokenRequested");
                    boolean z3 = jSONObject.getBoolean("serverAuthRequested");
                    boolean z4 = jSONObject.getBoolean("forceCodeForRefreshToken");
                    String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
                    if (jSONObject.has("hostedDomain")) {
                        str = jSONObject.optString("hostedDomain");
                    }
                    return new GoogleSignInOptions(account, optString2, str, (String) null, A0n, AnonymousClass000.A0x(), 3, z2, z3, z4);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String A04(String str) {
        Lock lock = this.A01;
        lock.lock();
        try {
            return this.A00.getString(str, (String) null);
        } finally {
            lock.unlock();
        }
    }

    public final void A05(String str, String str2) {
        Lock lock = this.A01;
        lock.lock();
        try {
            this.A00.edit().putString(str, str2).apply();
        } finally {
            lock.unlock();
        }
    }
}
