package com.google.android.gms.auth.api.signin;

import X.AnonymousClass000;
import X.AnonymousClass5TV;
import X.C1047656v;
import X.C13680ns;
import X.C15710ri;
import X.C32251fv;
import X.C85754Pv;
import X.C88784b5;
import X.C92284hJ;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class GoogleSignInOptions extends C15710ri implements AnonymousClass5TV, ReflectedParcelable {
    public static Comparator A0B = new C1047656v();
    public static final GoogleSignInOptions A0C;
    public static final GoogleSignInOptions A0D;
    public static final Scope A0E = new Scope(1, "profile");
    public static final Scope A0F = new Scope(1, "openid");
    public static final Scope A0G;
    public static final Scope A0H = new Scope(1, "https://www.googleapis.com/auth/games");
    public static final Parcelable.Creator CREATOR = new C92284hJ();
    public Account A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;
    public Map A05;
    public boolean A06;
    public final int A07;
    public final ArrayList A08;
    public final boolean A09;
    public final boolean A0A;

    static {
        new Scope(1, "email");
        Scope scope = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        A0G = scope;
        C88784b5 r2 = new C88784b5();
        Set set = r2.A05;
        set.add(A0F);
        set.add(A0E);
        A0D = r2.A00();
        C88784b5 r22 = new C88784b5();
        Set set2 = r22.A05;
        set2.add(scope);
        set2.addAll(Arrays.asList(new Scope[0]));
        A0C = r22.A00();
    }

    public GoogleSignInOptions(Account account, String str, String str2, String str3, ArrayList arrayList, Map map, int i2, boolean z2, boolean z3, boolean z4) {
        this.A07 = i2;
        this.A08 = arrayList;
        this.A00 = account;
        this.A06 = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = C13680ns.A0n(map.values());
        this.A05 = map;
        this.A03 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r6.A00 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (android.text.TextUtils.isEmpty(r6.A01) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 != 0) goto L_0x0004
            return r4
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r6 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r6     // Catch:{ ClassCastException -> 0x007c }
            java.util.ArrayList r0 = r5.A04     // Catch:{ ClassCastException -> 0x007c }
            int r0 = r0.size()     // Catch:{ ClassCastException -> 0x007c }
            if (r0 > 0) goto L_0x007c
            java.util.ArrayList r0 = r6.A04     // Catch:{ ClassCastException -> 0x007c }
            int r0 = r0.size()     // Catch:{ ClassCastException -> 0x007c }
            if (r0 > 0) goto L_0x007c
            java.util.ArrayList r3 = r5.A08     // Catch:{ ClassCastException -> 0x007c }
            int r2 = r3.size()     // Catch:{ ClassCastException -> 0x007c }
            java.util.ArrayList r1 = r6.A08     // Catch:{ ClassCastException -> 0x007c }
            java.util.ArrayList r0 = X.C13680ns.A0n(r1)     // Catch:{ ClassCastException -> 0x007c }
            int r0 = r0.size()     // Catch:{ ClassCastException -> 0x007c }
            if (r2 != r0) goto L_0x007c
            java.util.ArrayList r0 = X.C13680ns.A0n(r1)     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r3.containsAll(r0)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x007c
            android.accounts.Account r1 = r5.A00     // Catch:{ ClassCastException -> 0x007c }
            if (r1 != 0) goto L_0x0070
            android.accounts.Account r0 = r6.A00     // Catch:{ ClassCastException -> 0x007c }
            if (r0 != 0) goto L_0x007c
        L_0x003a:
            java.lang.String r1 = r5.A01     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r6.A01     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x007c
        L_0x004a:
            boolean r1 = r5.A0A     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r6.A0A     // Catch:{ ClassCastException -> 0x007c }
            if (r1 != r0) goto L_0x007c
            boolean r1 = r5.A06     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r6.A06     // Catch:{ ClassCastException -> 0x007c }
            if (r1 != r0) goto L_0x007c
            boolean r1 = r5.A09     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r6.A09     // Catch:{ ClassCastException -> 0x007c }
            if (r1 != r0) goto L_0x007c
            java.lang.String r1 = r5.A03     // Catch:{ ClassCastException -> 0x007c }
            java.lang.String r0 = r6.A03     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x007c
            goto L_0x0079
        L_0x0067:
            java.lang.String r0 = r6.A01     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r1.equals(r0)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 != 0) goto L_0x004a
            goto L_0x007b
        L_0x0070:
            android.accounts.Account r0 = r6.A00     // Catch:{ ClassCastException -> 0x007c }
            boolean r0 = r1.equals(r0)     // Catch:{ ClassCastException -> 0x007c }
            if (r0 == 0) goto L_0x007c
            goto L_0x003a
        L_0x0079:
            r0 = 1
            return r0
        L_0x007b:
            return r4
        L_0x007c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0u.add(((Scope) arrayList.get(i2)).A01);
        }
        Collections.sort(A0u);
        C85754Pv r3 = new C85754Pv();
        r3.A00(A0u);
        r3.A00(this.A00);
        r3.A00(this.A01);
        int i3 = (31 * r3.A00) + (this.A0A ? 1 : 0);
        r3.A00 = i3;
        int i4 = (31 * i3) + (this.A06 ? 1 : 0);
        r3.A00 = i4;
        r3.A00 = (31 * i4) + (this.A09 ? 1 : 0);
        r3.A00(this.A03);
        return r3.A00;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A07);
        C32251fv.A0C(parcel, C13680ns.A0n(this.A08), 2, false);
        C32251fv.A09(parcel, this.A00, 3, i2, false);
        C32251fv.A08(parcel, 4, this.A06);
        C32251fv.A08(parcel, 5, this.A09);
        C32251fv.A08(parcel, 6, this.A0A);
        C32251fv.A0A(parcel, this.A01, 7, false);
        C32251fv.A0A(parcel, this.A02, 8, false);
        C32251fv.A0C(parcel, this.A04, 9, false);
        C32251fv.A0A(parcel, this.A03, 10, false);
        C32251fv.A05(parcel, A002);
    }
}
