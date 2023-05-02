package X;

import com.facebook.redex.IDxNFunctionShape137S0100000_2_I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3AU  reason: invalid class name */
public final class AnonymousClass3AU {
    public static final ArrayList A07 = C13680ns.A0n(Arrays.asList(new String[]{"ACCOUNT_PENDING_LINKING", "ACTIVE", "EXTERNALLY_DISABLED", "HARD_BLOCKED", "INACTIVE", "INITED", "INTEGRITY_BLOCKED", "PENDING", "SOFT_BLOCKED"}));
    public final C28371Vv A00;
    public final C89024bT A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public AnonymousClass3AU(C16300so r12, C28371Vv r13) {
        C28371Vv r4 = r13;
        C28371Vv.A06(r13, "merchant");
        Class<String> cls = String.class;
        this.A04 = (String) C32271fx.A00((C16300so) null, r4, cls, 1L, 200L, (Object) null, new String[]{"gateway-name"}, false);
        this.A02 = (String) C32271fx.A00((C16300so) null, r4, cls, 1L, 3000L, (Object) null, new String[]{"dashboard-url"}, false);
        this.A05 = (String) C32271fx.A00((C16300so) null, r4, cls, 1L, 3000L, (Object) null, new String[]{"logo-uri"}, false);
        this.A03 = C32271fx.A06(r13, A07, new String[]{"display-state"});
        this.A01 = (C89024bT) C32271fx.A03(r13, new IDxNFunctionShape137S0100000_2_I1(r12, 6), new String[0]);
        this.A06 = C32271fx.A07(r4, new IDxNFunctionShape137S0100000_2_I1(r12, 7), new String[]{"payout"}, 0, Long.MAX_VALUE);
        this.A00 = r13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3AU.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3AU r5 = (AnonymousClass3AU) obj;
            if (!this.A03.equals(r5.A03) || !C34901l3.A00(this.A04, r5.A04) || !C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A05, r5.A05) || !this.A06.equals(r5.A06) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A03;
        objArr[1] = this.A04;
        objArr[2] = this.A02;
        objArr[3] = this.A05;
        objArr[4] = this.A06;
        return AnonymousClass000.A0F(this.A01, objArr, 5);
    }
}
