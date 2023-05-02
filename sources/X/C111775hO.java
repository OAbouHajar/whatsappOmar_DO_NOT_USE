package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5hO  reason: invalid class name and case insensitive filesystem */
public final class C111775hO extends AnonymousClass1W3 {
    public static final HashSet A01;
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(5);
    public Bundle A00;

    static {
        String[] strArr = new String[7];
        strArr[0] = "vpa";
        strArr[1] = "keys";
        strArr[2] = "vpaName";
        strArr[3] = "balance";
        strArr[4] = "usableBalance";
        strArr[5] = "updatedSenderVpa";
        A01 = C13680ns.A0p("sufficientBalance", strArr, 6);
    }

    public static final String A00(C28371Vv r6, String str) {
        C28371Vv A0J = r6.A0J(str);
        if (A0J == null) {
            return C28371Vv.A05(r6, str);
        }
        try {
            C28371Vv A0K = A0J.A0K("money");
            return String.valueOf(((double) ((long) A0K.A09("value"))) / ((double) ((long) A0K.A09("offset"))));
        } catch (AnonymousClass1W9 unused) {
            Log.e("PAY: IndiaUpiPaymentData parseBalance failure");
            return null;
        }
    }

    public void A01(AnonymousClass173 r16, C28371Vv r17, int i2) {
        String str;
        String A0N;
        Bundle bundle;
        C28371Vv r3 = r17;
        int i3 = i2;
        if (i3 == 4) {
            String A05 = C28371Vv.A05(r3, "credential-id");
            if (A05 != null) {
                Bundle A0D = C13690nt.A0D();
                this.A00 = A0D;
                A0D.putString("credentialId", A05);
                return;
            }
            return;
        }
        if (i3 == 5) {
            str = "keys";
            A0N = C28371Vv.A05(r3, str);
            if (A0N != null) {
                bundle = C13690nt.A0D();
                this.A00 = bundle;
            } else {
                return;
            }
        } else {
            if (i3 == 6) {
                this.A00 = C13690nt.A0D();
                String A0N2 = r3.A0N("vpa-mismatch", (String) null);
                if (A0N2 != null) {
                    this.A00.putString("updatedVpaFor", A0N2);
                    if (C110105dW.A1U(r3, "vpa-mismatch", "sender")) {
                        this.A00.putString("updatedSenderVpa", r3.A0N("vpa", (String) null));
                        this.A00.putString("updatedSenderVpaId", r3.A0N("vpa-id", (String) null));
                        return;
                    }
                    return;
                }
                String A0N3 = r3.A0N("valid", (String) null);
                if (A0N3 != null) {
                    this.A00.putString("valid", A0N3);
                }
                String A002 = A00(r3, "balance");
                if (A002 != null) {
                    this.A00.putString("balance", A002);
                }
                this.A00.putString("sufficientBalance", r3.A0N("sufficient-balance", (String) null));
            } else if (i3 == 8) {
                this.A00 = C13690nt.A0D();
                String A0N4 = r3.A0N("vpa-mismatch", (String) null);
                if (A0N4 != null) {
                    this.A00.putString("updatedVpaFor", A0N4);
                    if (C110105dW.A1U(r3, "vpa-mismatch", "sender")) {
                        this.A00.putString("updatedSenderVpa", r3.A0N("vpa", (String) null));
                        this.A00.putString("updatedSenderVpaId", r3.A0N("vpa-id", (String) null));
                    }
                    String A003 = A00(r3, "balance");
                    if (A003 != null) {
                        this.A00.putString("balance", A003);
                    }
                } else {
                    return;
                }
            } else if (i3 == 7) {
                this.A00 = C13690nt.A0D();
                this.A00.putString("vpa", r3.A0N("vpa", (String) null));
                this.A00.putString("vpaId", r3.A0N("vpa-id", (String) null));
                this.A00.putString("vpaName", r3.A0N("vpa-name", (String) null));
                this.A00.putString("vpaValid", r3.A0N("valid", (String) null));
                this.A00.putString("jid", r3.A0N("user", (String) null));
                this.A00.putString("blocked", r3.A0N("blocked", (String) null));
                this.A00.putString("token", r3.A0N("token", (String) null));
                this.A00.putString("merchant", r3.A0N("merchant", (String) null));
                this.A00.putString("verifiedMerchant", r3.A0N("verified-merchant", (String) null));
                str = "mcc";
                A0N = r3.A0N(str, (String) null);
                bundle = this.A00;
            } else if (i3 == 2) {
                Bundle A0D2 = C13690nt.A0D();
                this.A00 = A0D2;
                String str2 = r3.A00;
                if ("psp".equals(str2)) {
                    A0D2.putString("providerType", r3.A0N("provider-type", (String) null));
                    Bundle bundle2 = this.A00;
                    String A0N5 = r3.A0N("sms-gateways", (String) null);
                    bundle2.putStringArrayList("smsGateways", !TextUtils.isEmpty(A0N5) ? C13680ns.A0n(Arrays.asList(A0N5.split(","))) : AnonymousClass000.A0u());
                    this.A00.putString("smsPrefix", r3.A0N("sms-prefix", (String) null));
                    this.A00.putString("transactionPrefix", r3.A0N("transaction-prefix", (String) null));
                    return;
                } else if ("psp-routing".equals(str2)) {
                    String A052 = C28371Vv.A05(r3, "providers");
                    A0D2.putStringArrayList("pspRouting", !TextUtils.isEmpty(A052) ? C13680ns.A0n(Arrays.asList(A052.split(","))) : AnonymousClass000.A0u());
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
            String A004 = A00(r3, "usable-balance");
            if (A004 != null) {
                this.A00.putString("usableBalance", A004);
                return;
            }
            return;
        }
        bundle.putString(str, A0N);
    }

    public void A02(List list, int i2) {
        throw new UnsupportedOperationException("PAY: IndiaUpiPaymentData does not support toNetwork");
    }

    public String A03() {
        throw new UnsupportedOperationException("PAY: IndiaUpiPaymentData does not support toDBString");
    }

    public void A04(String str) {
        throw new UnsupportedOperationException("PAY: IndiaUpiPaymentData does not support fromDBString");
    }

    public C35301lh A05() {
        C53852gP A0L = C110105dW.A0L();
        Class<String> cls = String.class;
        Bundle bundle = this.A00;
        return C110105dW.A0J(A0L, cls, bundle != null ? bundle.getString("updatedSenderVpa") : null, "upiHandle");
    }

    public String A06() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("balance");
        }
        return null;
    }

    public String A07() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("jid");
        }
        return null;
    }

    public String A08() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("keys");
        }
        return null;
    }

    public String A09() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("mcc");
        }
        return null;
    }

    public String A0A() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("providerType");
        }
        return null;
    }

    public String A0B() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("smsPrefix");
        }
        return null;
    }

    public String A0C() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("token");
        }
        return null;
    }

    public String A0D() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("transactionPrefix");
        }
        return null;
    }

    public String A0E() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("updatedSenderVpaId");
        }
        return null;
    }

    public String A0F() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("updatedVpaFor");
        }
        return null;
    }

    public String A0G() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("usableBalance");
        }
        return null;
    }

    public String A0H() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("vpa");
        }
        return null;
    }

    public String A0I() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("vpaId");
        }
        return null;
    }

    public String A0J() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("vpaName");
        }
        return null;
    }

    public boolean A0K() {
        Bundle bundle = this.A00;
        return bundle != null && "1".equals(bundle.getString("merchant"));
    }

    public boolean A0L() {
        Bundle bundle = this.A00;
        return bundle != null && "1".equals(bundle.getString("valid"));
    }

    public boolean A0M() {
        Bundle bundle = this.A00;
        return bundle != null && "1".equals(bundle.getString("verifiedMerchant"));
    }

    public boolean A0N() {
        Bundle bundle = this.A00;
        return bundle != null && "1".equals(bundle.getString("blocked"));
    }

    public boolean A0O() {
        Bundle bundle = this.A00;
        return bundle != null && "1".equals(bundle.getString("vpaValid"));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            boolean contains = A01.contains(A0m);
            StringBuilder A0o = AnonymousClass000.A0o();
            if (!contains) {
                A0o.append(A0m);
                A0o.append("=");
                A0o.append(this.A00.get(A0m));
            } else {
                A0o.append(A0m);
                A0o.append("=SCRUBBED");
            }
            A0u.add(A0o.toString());
        }
        StringBuilder A0r = AnonymousClass000.A0r(" [ bundle: {");
        A0r.append(TextUtils.join(", ", A0u));
        return AnonymousClass000.A0h("}]", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.A00);
    }
}
