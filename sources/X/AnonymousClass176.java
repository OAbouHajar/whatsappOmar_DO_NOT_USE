package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.176  reason: invalid class name */
public abstract class AnonymousClass176 {
    public static final C40031tS A05 = new C40031tS("unset", (String) null, false);
    public C18080w7 A00;
    public C18300wT A01;
    public AnonymousClass174 A02;
    public boolean A03;
    public final AnonymousClass1Vo A04 = AnonymousClass1Vo.A00("BasePaymentAccountSetup", "onboarding", "COMMON");

    public synchronized C40031tS A00() {
        C40031tS r0;
        List A032 = A03(A02());
        r0 = null;
        if (!A032.isEmpty()) {
            r0 = (C40031tS) A032.get(0);
        }
        return r0;
    }

    public C40031tS A01(String str) {
        C30681cm A012 = this.A02.A01();
        if (A012 == null) {
            return null;
        }
        for (C40031tS r1 : this.A03 ? A012.A0C : A012.A0B) {
            if (r1.A03.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public synchronized List A02() {
        ArrayList arrayList;
        String string = this.A01.A01().getString(this.A03 ? "payments_setup_completed_steps" : "payments_merchant_setup_completed_steps", "");
        arrayList = new ArrayList();
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string2 = jSONObject.getString(next);
                    boolean equals = string2.equals("skipped");
                    if (equals) {
                        string2 = "-1";
                    }
                    C40031tS r0 = new C40031tS(next, string2, false);
                    r0.A02 = equals;
                    arrayList.add(r0);
                }
            } catch (JSONException e2) {
                this.A04.A0A("getCompletedStep threw: ", e2);
            }
        }
        return arrayList;
    }

    public synchronized List A03(List list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        C30681cm A012 = this.A02.A01();
        if (A012 != null) {
            for (C40031tS r8 : this.A03 ? A012.A0C : A012.A0B) {
                int i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        if (((C40031tS) list.get(i2)).A03.equals(r8.A03)) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 < 0 || !((C40031tS) list.get(i2)).A00.equals(r8.A00) || (((C40031tS) list.get(i2)).A02 && !r8.A01)) {
                    arrayList.add(new C40031tS(r8.A03, r8.A00, r8.A01));
                }
            }
        }
        return arrayList;
    }

    public final void A04() {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass2KI r1 : this.A00.A02()) {
            if (r1.A03 != null) {
                arrayList.add(r1.A06);
            }
        }
        if (arrayList.size() > 0) {
            this.A00.A05(arrayList);
        }
    }

    public synchronized void A05() {
        this.A01.A0M(this.A03);
        A04();
    }

    public synchronized void A06() {
        String string = this.A01.A01().getString(this.A03 ? "payments_setup_completed_steps" : "payments_merchant_setup_completed_steps", "");
        boolean z2 = this.A01.A01().getBoolean("payments_sandbox", false);
        this.A01.A0M(this.A03);
        A04();
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!"tos_no_wallet".equals(next)) {
                        arrayList.add(next);
                    } else if (z2) {
                        this.A01.A0O(z2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONObject.remove((String) it.next());
                }
                this.A01.A01().edit().putString(this.A03 ? "payments_setup_completed_steps" : "payments_merchant_setup_completed_steps", jSONObject.toString()).apply();
            } catch (JSONException e2) {
                this.A04.A0A("clearAllButTos threw: ", e2);
            }
        }
        AnonymousClass1Vo r3 = this.A04;
        StringBuilder sb = new StringBuilder();
        sb.append("clearAllButTos ended with steps: ");
        sb.append(this.A01.A01().getString(this.A03 ? "payments_setup_completed_steps" : "payments_merchant_setup_completed_steps", ""));
        sb.append(" sandbox: ");
        sb.append(this.A01.A01().getBoolean("payments_sandbox", false));
        r3.A06(sb.toString());
    }

    public synchronized void A07(C40031tS r6) {
        if (r6 != null) {
            List A022 = A02();
            Iterator it = A022.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C40031tS r2 = (C40031tS) it.next();
                if (r2.A03.equals(r6.A03)) {
                    A022.remove(r2);
                    A0A(A022);
                    break;
                }
            }
        } else {
            AnonymousClass1Vo r22 = this.A04;
            StringBuilder sb = new StringBuilder();
            sb.append("/removeCompletedStep step to remove cannot be null: ");
            sb.append(r6);
            r22.A06(sb.toString());
        }
    }

    public synchronized void A08(C40031tS r7) {
        if (r7 != null) {
            String str = r7.A03;
            if (!str.equals("unset")) {
                List A022 = A02();
                List A032 = A03(A022);
                Iterator it = A022.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C40031tS) it.next()).A03.equals(str)) {
                            break;
                        }
                    } else {
                        A022.add(r7);
                        Iterator it2 = A032.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C40031tS r1 = (C40031tS) it2.next();
                            if (r1.A03.equals(str)) {
                                A032.remove(r1);
                                break;
                            }
                        }
                        AnonymousClass1Vo r2 = this.A04;
                        StringBuilder sb = new StringBuilder();
                        sb.append("setCompletedStep setting step: ");
                        sb.append(r7);
                        sb.append(" as complete making completed steps: ");
                        sb.append(A022);
                        sb.append(" incomplete steps: ");
                        sb.append(A032);
                        r2.A06(sb.toString());
                        A0A(A022);
                    }
                }
            }
        }
    }

    public synchronized void A09(String str) {
        A08(A01(str));
    }

    public final synchronized void A0A(List list) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C40031tS r3 = (C40031tS) it.next();
            String str = r3.A00;
            if (!TextUtils.isEmpty(str)) {
                try {
                    String str2 = r3.A03;
                    if (r3.A02) {
                        str = "skipped";
                    }
                    jSONObject.put(str2, str);
                } catch (JSONException e2) {
                    this.A04.A0A("setCompletedStep threw: ", e2);
                }
            }
        }
        AnonymousClass1Vo r2 = this.A04;
        StringBuilder sb = new StringBuilder();
        sb.append("storing steps: ");
        sb.append(jSONObject);
        r2.A06(sb.toString());
        C18300wT r0 = this.A01;
        boolean z2 = this.A03;
        r0.A01().edit().putString(z2 ? "payments_setup_completed_steps" : "payments_merchant_setup_completed_steps", jSONObject.toString()).apply();
    }

    public synchronized boolean A0B() {
        boolean z2;
        C30681cm A012 = this.A02.A01();
        z2 = false;
        if (A012 != null && !A012.A07 && (A0G("tos_no_wallet") || A0G("tos_with_wallet"))) {
            z2 = true;
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (A0E() != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0C() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0D()     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            boolean r1 = r2.A0E()     // Catch:{ all -> 0x0011 }
            r0 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass176.A0C():boolean");
    }

    public synchronized boolean A0D() {
        return A0F(1);
    }

    public synchronized boolean A0E() {
        return A0F(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0F(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            X.0wT r0 = r10.A01     // Catch:{ all -> 0x007d }
            android.content.SharedPreferences r2 = r0.A01()     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "has_p2mlite_account"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)     // Catch:{ all -> 0x007d }
            r6 = 1
            if (r0 != 0) goto L_0x007b
            X.174 r0 = r10.A02     // Catch:{ all -> 0x007d }
            X.1cm r1 = r0.A01()     // Catch:{ all -> 0x007d }
            r9 = 0
            if (r1 == 0) goto L_0x0079
            boolean r0 = r10.A03     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0021
            X.1tS[] r0 = r1.A0C     // Catch:{ all -> 0x007d }
            goto L_0x0023
        L_0x0021:
            X.1tS[] r0 = r1.A0B     // Catch:{ all -> 0x007d }
        L_0x0023:
            if (r0 == 0) goto L_0x0079
            int r0 = r0.length     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0079
            java.util.List r5 = r10.A02()     // Catch:{ all -> 0x007d }
            boolean r0 = r10.A03     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0035
            X.1tS[] r4 = r1.A0C     // Catch:{ all -> 0x007d }
        L_0x0032:
            int r3 = r4.length     // Catch:{ all -> 0x007d }
            r2 = 0
            goto L_0x0038
        L_0x0035:
            X.1tS[] r4 = r1.A0B     // Catch:{ all -> 0x007d }
            goto L_0x0032
        L_0x0038:
            if (r2 >= r3) goto L_0x007b
            r7 = r4[r2]     // Catch:{ all -> 0x007d }
            r8 = 0
        L_0x003d:
            int r0 = r5.size()     // Catch:{ all -> 0x007d }
            if (r8 >= r0) goto L_0x0056
            java.lang.Object r0 = r5.get(r8)     // Catch:{ all -> 0x007d }
            X.1tS r0 = (X.C40031tS) r0     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x007d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0057
            int r8 = r8 + 1
            goto L_0x003d
        L_0x0056:
            r8 = -1
        L_0x0057:
            if (r11 == r6) goto L_0x0063
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "2fa"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0076
        L_0x0063:
            if (r8 < 0) goto L_0x0079
            java.lang.Object r0 = r5.get(r8)     // Catch:{ all -> 0x007d }
            X.1tS r0 = (X.C40031tS) r0     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r7.A00     // Catch:{ all -> 0x007d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0079:
            monitor-exit(r10)
            return r9
        L_0x007b:
            monitor-exit(r10)
            return r6
        L_0x007d:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass176.A0F(int):boolean");
    }

    public boolean A0G(String str) {
        for (C40031tS r0 : A02()) {
            if (r0.A03.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
