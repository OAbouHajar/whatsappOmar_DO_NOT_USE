package X;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4b5  reason: invalid class name and case insensitive filesystem */
public final class C88784b5 {
    public Account A00;
    public String A01;
    public String A02;
    public String A03;
    public Map A04 = AnonymousClass000.A0x();
    public Set A05 = C13680ns.A0o();
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public C88784b5() {
    }

    public C88784b5(GoogleSignInOptions googleSignInOptions) {
        this.A05 = new HashSet(googleSignInOptions.A08);
        this.A06 = googleSignInOptions.A09;
        this.A07 = googleSignInOptions.A0A;
        this.A08 = googleSignInOptions.A06;
        this.A01 = googleSignInOptions.A01;
        this.A00 = googleSignInOptions.A00;
        this.A02 = googleSignInOptions.A02;
        ArrayList arrayList = googleSignInOptions.A04;
        HashMap A0x = AnonymousClass000.A0x();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass3XS r1 = (AnonymousClass3XS) it.next();
            AnonymousClass3K2.A1Q(r1, A0x, r1.A00);
        }
        this.A04 = A0x;
        this.A03 = googleSignInOptions.A03;
    }

    public GoogleSignInOptions A00() {
        Set set = this.A05;
        if (set.contains(GoogleSignInOptions.A0H)) {
            Scope scope = GoogleSignInOptions.A0G;
            if (set.contains(scope)) {
                set.remove(scope);
            }
        }
        boolean z2 = this.A08;
        if (z2 && (this.A00 == null || !set.isEmpty())) {
            set.add(GoogleSignInOptions.A0F);
        }
        ArrayList A0n = C13680ns.A0n(set);
        Account account = this.A00;
        boolean z3 = this.A06;
        boolean z4 = this.A07;
        return new GoogleSignInOptions(account, this.A01, this.A02, this.A03, A0n, this.A04, 3, z2, z3, z4);
    }
}
