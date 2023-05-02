package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass57D;
import X.C001000l;
import X.C13680ns;
import X.C13700nu;
import X.C13710nw;
import X.C88704ax;
import X.C90484eD;
import X.C95354mV;
import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
public class SignInHubActivity extends C001000l {
    public static boolean A05;
    public int A00;
    public Intent A01;
    public SignInConfiguration A02;
    public boolean A03 = false;
    public boolean A04;

    public final void A1S(int i2) {
        Status status = new Status(i2, (String) null);
        Intent A09 = C13680ns.A09();
        A09.putExtra("googleSignInStatus", status);
        setResult(0, A09);
        finish();
        A05 = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        RuntimeException runtimeException;
        if (!this.A03) {
            setResult(0);
            if (i2 == 40962) {
                int i4 = 8;
                Intent intent2 = intent;
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent2.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.A00) != null) {
                        C88704ax A002 = C88704ax.A00(this);
                        GoogleSignInOptions googleSignInOptions = this.A02.A00;
                        synchronized (A002) {
                            C90484eD r4 = A002.A02;
                            C13710nw.A01(googleSignInOptions);
                            String str = googleSignInAccount.A07;
                            r4.A05("defaultGoogleSignInAccount", str);
                            C13710nw.A01(googleSignInOptions);
                            String A012 = C90484eD.A01("googleSignInAccount", str);
                            JSONObject A0J = C13700nu.A0J();
                            try {
                                String str2 = googleSignInAccount.A02;
                                if (str2 != null) {
                                    A0J.put("id", str2);
                                }
                                String str3 = googleSignInAccount.A03;
                                if (str3 != null) {
                                    A0J.put("tokenId", str3);
                                }
                                String str4 = googleSignInAccount.A04;
                                if (str4 != null) {
                                    A0J.put("email", str4);
                                }
                                String str5 = googleSignInAccount.A05;
                                if (str5 != null) {
                                    A0J.put("displayName", str5);
                                }
                                String str6 = googleSignInAccount.A08;
                                if (str6 != null) {
                                    A0J.put("givenName", str6);
                                }
                                String str7 = googleSignInAccount.A09;
                                if (str7 != null) {
                                    A0J.put("familyName", str7);
                                }
                                Uri uri = googleSignInAccount.A01;
                                if (uri != null) {
                                    A0J.put("photoUrl", uri.toString());
                                }
                                String str8 = googleSignInAccount.A06;
                                if (str8 != null) {
                                    A0J.put("serverAuthCode", str8);
                                }
                                A0J.put("expirationTime", googleSignInAccount.A00);
                                A0J.put("obfuscatedIdentifier", str);
                                JSONArray jSONArray = new JSONArray();
                                List list = googleSignInAccount.A0A;
                                Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
                                Arrays.sort(scopeArr, AnonymousClass57D.A00);
                                for (Scope scope : scopeArr) {
                                    jSONArray.put(scope.A01);
                                }
                                A0J.put("grantedScopes", jSONArray);
                                A0J.remove("serverAuthCode");
                                r4.A05(A012, A0J.toString());
                                String A013 = C90484eD.A01("googleSignInOptions", str);
                                JSONObject A0J2 = C13700nu.A0J();
                                try {
                                    JSONArray jSONArray2 = new JSONArray();
                                    ArrayList arrayList = googleSignInOptions.A08;
                                    Collections.sort(arrayList, GoogleSignInOptions.A0B);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put(((Scope) it.next()).A01);
                                    }
                                    A0J2.put("scopes", jSONArray2);
                                    Account account = googleSignInOptions.A00;
                                    if (account != null) {
                                        A0J2.put("accountName", account.name);
                                    }
                                    A0J2.put("idTokenRequested", googleSignInOptions.A06);
                                    A0J2.put("forceCodeForRefreshToken", googleSignInOptions.A0A);
                                    A0J2.put("serverAuthRequested", googleSignInOptions.A09);
                                    String str9 = googleSignInOptions.A01;
                                    if (!TextUtils.isEmpty(str9)) {
                                        A0J2.put("serverClientId", str9);
                                    }
                                    String str10 = googleSignInOptions.A02;
                                    if (!TextUtils.isEmpty(str10)) {
                                        A0J2.put("hostedDomain", str10);
                                    }
                                    r4.A05(A013, A0J2.toString());
                                    A002.A00 = googleSignInAccount;
                                    A002.A01 = googleSignInOptions;
                                } catch (JSONException e2) {
                                    runtimeException = new RuntimeException(e2);
                                    throw runtimeException;
                                }
                            } catch (JSONException e3) {
                                runtimeException = new RuntimeException(e3);
                                throw runtimeException;
                            }
                        }
                        intent2.removeExtra("signInAccount");
                        intent2.putExtra("googleSignInAccount", googleSignInAccount);
                        this.A04 = true;
                        this.A00 = i3;
                        this.A01 = intent2;
                        A0W().A02(new C95354mV(this));
                        A05 = false;
                        return;
                    } else if (intent2.hasExtra("errorCode") && (i4 = intent2.getIntExtra("errorCode", 8)) == 13) {
                        i4 = 12501;
                    }
                }
                A1S(i4);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            i2 = 12500;
        } else {
            boolean equals = action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN");
            if (equals || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
                if (signInConfiguration == null) {
                    Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                    setResult(0);
                } else {
                    this.A02 = signInConfiguration;
                    if (bundle != null) {
                        boolean z2 = bundle.getBoolean("signingInGoogleApiClients");
                        this.A04 = z2;
                        if (z2) {
                            this.A00 = bundle.getInt("signInResultCode");
                            this.A01 = (Intent) bundle.getParcelable("signInResultData");
                            A0W().A02(new C95354mV(this));
                            A05 = false;
                            return;
                        }
                        return;
                    } else if (A05) {
                        setResult(0);
                        i2 = 12502;
                    } else {
                        A05 = true;
                        Intent A022 = C13700nu.A02(action);
                        A022.setPackage(equals ? "com.google.android.gms" : getPackageName());
                        A022.putExtra("config", this.A02);
                        try {
                            startActivityForResult(A022, 40962);
                            return;
                        } catch (ActivityNotFoundException unused) {
                            this.A03 = true;
                            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                            A1S(17);
                            return;
                        }
                    }
                }
            } else {
                Log.e("AuthSignInClient", C13680ns.A0g(String.valueOf(intent.getAction()), "Unknown action: "));
            }
            finish();
            return;
        }
        A1S(i2);
    }

    public final void onDestroy() {
        super.onDestroy();
        A05 = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.A04);
        if (this.A04) {
            bundle.putInt("signInResultCode", this.A00);
            bundle.putParcelable("signInResultData", this.A01);
        }
    }
}
