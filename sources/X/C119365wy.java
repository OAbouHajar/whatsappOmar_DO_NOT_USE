package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5wy  reason: invalid class name and case insensitive filesystem */
public class C119365wy {
    public int A00;
    public int A01;
    public int A02;
    public C111775hO A03;
    public AnonymousClass4XO A04;
    public ArrayList A05;
    public ArrayList A06;
    public ArrayList A07;
    public HashMap A08;
    public final AnonymousClass60V A09;
    public final AnonymousClass61W A0A;

    public C119365wy(AnonymousClass60V r1, AnonymousClass61W r2) {
        this.A0A = r2;
        this.A09 = r1;
        A0B();
    }

    public static String A00(String str, HashMap hashMap) {
        String A0g = C110115dX.A0g(str, hashMap);
        if (A0g == null) {
            return null;
        }
        try {
            JSONObject jSONObject = C13700nu.A0K(A0g).getJSONObject("data");
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(jSONObject.getString("code"));
            A0o.append(",");
            A0o.append(jSONObject.getString("ki"));
            A0o.append(",");
            return AnonymousClass000.A0h(jSONObject.getString("encryptedBase64String"), A0o);
        } catch (JSONException e2) {
            StringBuilder A0r = AnonymousClass000.A0r("PAY: IndiaUPIPaymentBankSetup getEncryptedBlob read: ");
            A0r.append(str);
            Log.i(AnonymousClass000.A0h("  blob threw: ", A0r), e2);
            return null;
        }
    }

    public final C111775hO A01(C111805hR r5) {
        AnonymousClass60V r2 = this.A09;
        if (r2.A0Q()) {
            String A082 = r2.A08();
            if (TextUtils.isEmpty(A082)) {
                r2.AhX(r5);
                A082 = r5 != null ? r5.A0A : r2.A08();
            }
            if (!TextUtils.isEmpty(A082)) {
                return A02(A082);
            }
            return null;
        }
        ArrayList A083 = A08(r5);
        if (A083 != null && !A083.isEmpty()) {
            return A02((String) A083.get(this.A01 % A083.size()));
        }
        Log.e("PAY: IndiaUPIPaymentSetup psps list is null or empty");
        return null;
    }

    public final C111775hO A02(String str) {
        ArrayList arrayList = this.A07;
        if (arrayList == null || arrayList.size() <= 0) {
            Log.e("PAY: IndiaUPIPaymentSetup pspConfig list is null or empty");
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C111775hO r1 = (C111775hO) it.next();
            if (str.equals(r1.A0A())) {
                return r1;
            }
        }
        return null;
    }

    public AnonymousClass4XO A03() {
        return this.A04;
    }

    public C117025sK A04(AnonymousClass4XO r8, ArrayList arrayList) {
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        Iterator it = arrayList.iterator();
        C111775hO r2 = null;
        while (it.hasNext()) {
            AnonymousClass1W3 r5 = (AnonymousClass1W3) it.next();
            if (r5 instanceof C111775hO) {
                C111775hO r52 = (C111775hO) r5;
                if (r52.A08() != null) {
                    r8.A05("upi-list-keys");
                    String A082 = r52.A08();
                    if (!TextUtils.isEmpty(A082)) {
                        this.A09.A0J(A082);
                    }
                } else if (r52.A0A() != null) {
                    A0u2.add(r52);
                } else {
                    Bundle bundle = r52.A00;
                    if (!(bundle == null || bundle.getStringArrayList("pspRouting") == null)) {
                        r2 = r52;
                    }
                }
            } else if (r5 instanceof C111805hR) {
                A0u.add(r5);
            }
        }
        return new C117025sK(r2, A0u2, A0u);
    }

    public String A05(C111805hR r4) {
        ArrayList A092 = A09(r4);
        if (A092 == null) {
            return null;
        }
        AnonymousClass00B.A0A("", A092);
        int size = A092.size();
        this.A00 = size;
        return (String) A092.get(this.A02 % size);
    }

    public String A06(C111805hR r3) {
        String A082 = this.A09.A08();
        if (!TextUtils.isEmpty(A082)) {
            return A082;
        }
        C111775hO A012 = A01(r3);
        return (A012 == null || TextUtils.isEmpty(A012.A0A())) ? "ICICI" : A012.A0A();
    }

    public String A07(C111805hR r3) {
        C111775hO A012 = A01(r3);
        return (A012 == null || TextUtils.isEmpty(A012.A0D())) ? this.A09.A07() : A012.A0D();
    }

    public ArrayList A08(C111805hR r4) {
        Bundle bundle;
        ArrayList arrayList;
        if (r4 != null && (arrayList = r4.A0G) != null && !arrayList.isEmpty()) {
            return arrayList;
        }
        C111775hO r0 = this.A03;
        if (r0 == null || (bundle = r0.A00) == null) {
            return null;
        }
        return bundle.getStringArrayList("pspRouting");
    }

    public final ArrayList A09(C111805hR r3) {
        Bundle bundle;
        ArrayList<String> stringArrayList;
        C111775hO A012 = A01(r3);
        if (A012 != null && (bundle = A012.A00) != null && (stringArrayList = bundle.getStringArrayList("smsGateways")) != null && stringArrayList.size() > 0 && !stringArrayList.isEmpty()) {
            return stringArrayList;
        }
        Log.e("PAY: IndiaUPIPaymentSetup smsGateways list is null or empty");
        return null;
    }

    public void A0A() {
        ArrayList arrayList;
        int i2 = this.A02 + 1;
        if (i2 != this.A00 || (arrayList = this.A07) == null || arrayList.size() <= 1) {
            this.A02 = i2;
            return;
        }
        this.A02 = 0;
        this.A01++;
    }

    public void A0B() {
        this.A04 = new AnonymousClass4XO();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A06 = null;
        this.A05 = null;
        this.A07 = null;
        this.A03 = null;
        this.A08 = null;
        this.A0A.reset();
    }
}
