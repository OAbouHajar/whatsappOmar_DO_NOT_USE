package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5wq  reason: invalid class name and case insensitive filesystem */
public class C119285wq {
    public static final byte[] A04 = Base64.decode("l6AjIyMhJYdTCB0+urtee7k2HmerRdr4c6seZyY2Pmw=", 2);
    public static final byte[] A05 = Base64.decode("oHsO+vVXYHOZXitgkZS2DI9N4+L+klLpMby3+JOPVGo=", 2);
    public final C16440t3 A00;
    public final C118745vB A01;
    public final AnonymousClass1Vo A02 = C110105dW.A0Q("PaymentsProviderKeyManager", "infra");
    public final AnonymousClass0y5 A03;

    public C119285wq(C16440t3 r3, C118745vB r4, AnonymousClass0y5 r5) {
        this.A00 = r3;
        this.A03 = r5;
        this.A01 = r4;
    }

    public AnonymousClass50C A00() {
        return C110115dX.A0R(this, "VISA", "STEP-UP");
    }

    public AnonymousClass50C A01(C28371Vv r15) {
        String A0M = r15.A0M("key-type");
        String A0M2 = r15.A0M("provider");
        String A0M3 = r15.A0M("key-version");
        String A0M4 = r15.A0M("key-scope");
        byte[] bArr = null;
        String A0N = r15.A0N("expiry-ts", (String) null);
        if (!"none".equals(A0M)) {
            bArr = r15.A0K("data").A01;
        }
        AnonymousClass50C r7 = new AnonymousClass50C(TextUtils.isEmpty(A0N) ? null : Long.valueOf(C29501aj.A01(A0N, 0)), A0M2, A0M4, A0M, A0M3, bArr);
        if (!"DOC-UPLOAD".equals(A0M4) && !"DYI-REPORT".equals(A0M4)) {
            byte[] bArr2 = r15.A0K("signature").A01;
            AnonymousClass00B.A06(bArr2);
            C35891mf r4 = new C35891mf(A04);
            byte[][] bArr3 = new byte[6][];
            bArr3[0] = r7.A05.getBytes();
            bArr3[1] = r7.A03.getBytes();
            bArr3[2] = r7.A04.getBytes();
            byte[] bArr4 = r7.A06;
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArr3[3] = bArr4;
            bArr3[4] = r7.A02.getBytes();
            Long l2 = r7.A01;
            bArr3[5] = l2 == null ? new byte[0] : String.valueOf(l2).getBytes();
            if (!C36471nb.A00().A01(r4.A01, C28641Wx.A04(bArr3), bArr2)) {
                return null;
            }
        }
        return r7;
    }

    public AnonymousClass50C A02(String str, String str2, boolean z2) {
        AnonymousClass50C r8;
        Long l2;
        C118745vB r3 = this.A01;
        SharedPreferences A002 = r3.A00();
        String str3 = str;
        StringBuilder A0q = AnonymousClass000.A0q(str3);
        A0q.append("::");
        String str4 = str2;
        String string = A002.getString(AnonymousClass000.A0h(str4, A0q), (String) null);
        if (TextUtils.isEmpty(string)) {
            AnonymousClass1Vo r4 = r3.A01;
            StringBuilder A0q2 = AnonymousClass000.A0q("getProviderKey/provider=");
            A0q2.append(str3);
            r4.A04(AnonymousClass000.A0h(" is null", A0q2));
        } else {
            try {
                JSONObject A0K = C13700nu.A0K(string);
                String optString = A0K.optString("key_type");
                String optString2 = A0K.optString("key_version");
                String optString3 = A0K.optString("key_data");
                if (!TextUtils.isEmpty(optString)) {
                    if (!TextUtils.isEmpty(optString2) && ("none".equals(optString) || !TextUtils.isEmpty(optString3))) {
                        String optString4 = A0K.optString("key_expiry");
                        r8 = new AnonymousClass50C(TextUtils.isEmpty(optString4) ? null : Long.valueOf(C29501aj.A01(optString4, 0)), str3, str4, optString, optString2, Base64.decode(optString3, 2));
                        if (z2 || r8 == null || (l2 = r8.A01) == null || l2.longValue() * 1000 >= this.A00.A00()) {
                            return r8;
                        }
                        r3.A01(str3, str4);
                        return null;
                    }
                }
                StringBuilder A0q3 = AnonymousClass000.A0q("getProviderKey/provider=");
                A0q3.append(str3);
                StringBuilder A0r = AnonymousClass000.A0r(AnonymousClass1Vo.A01("PaymentProviderKeySharedPrefs", AnonymousClass000.A0h(" providerKey is null", A0q3)));
                if (TextUtils.isEmpty(optString)) {
                    A0r.append(" keyType is null");
                }
                if (TextUtils.isEmpty(optString2)) {
                    A0r.append(" keyVersion is null");
                }
                if (!"none".equals(optString) && TextUtils.isEmpty(optString3)) {
                    A0r.append(" keyData is null");
                }
                Log.e(A0r.toString());
            } catch (JSONException e2) {
                AnonymousClass1Vo r42 = r3.A01;
                StringBuilder A0q4 = AnonymousClass000.A0q("getProviderKey/provider=");
                A0q4.append(str3);
                r42.A0A(AnonymousClass000.A0h(" threw: ", A0q4), e2);
                r8 = null;
            }
        }
        r8 = null;
        if (z2) {
        }
        return r8;
    }

    public void A03(AnonymousClass2HJ r4, String str, String str2) {
        this.A01.A01(str, str2);
        C28371Vv r0 = r4.A03;
        if (r0 != null) {
            try {
                AnonymousClass50C A012 = A01(r0);
                if (A012 != null) {
                    A04(A012);
                }
            } catch (AnonymousClass1W9 e2) {
                this.A02.A05(AnonymousClass000.A0g("handleStaleKey/failed to parse key node/exception: ", e2));
            }
        }
    }

    public void A04(AnonymousClass50C r9) {
        C118745vB r4 = this.A01;
        String str = r9.A02;
        SharedPreferences.Editor edit = r4.A00().edit();
        JSONObject A0J = C13700nu.A0J();
        try {
            A0J.put("key_type", r9.A03).put("key_version", r9.A04);
            byte[] bArr = r9.A06;
            if (bArr != null) {
                A0J.put("key_data", Base64.encodeToString(bArr, 2));
            }
            Long l2 = r9.A01;
            if (l2 != null) {
                A0J.put("key_expiry", AnonymousClass000.A0e(l2, "", AnonymousClass000.A0o()));
            }
            StringBuilder A0q = AnonymousClass000.A0q(r9.A05);
            A0q.append("::");
            edit.putString(AnonymousClass000.A0h(str, A0q), A0J.toString());
            edit.apply();
        } catch (JSONException e2) {
            r4.A01.A05(AnonymousClass000.A0g("storeProviderKey threw ", e2));
        }
    }
}
