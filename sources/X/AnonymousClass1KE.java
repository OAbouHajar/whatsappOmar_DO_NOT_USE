package X;

import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;

/* renamed from: X.1KE  reason: invalid class name */
public class AnonymousClass1KE {
    public boolean A00 = false;
    public final AnonymousClass03L A01 = new AnonymousClass03L(5);
    public final C16300so A02;
    public final C14870pt A03;
    public final AnonymousClass1K9 A04;
    public final C18640x1 A05;
    public final AnonymousClass1KA A06;
    public final AnonymousClass1K8 A07;
    public final C14710pd A08;
    public final AnonymousClass1KB A09;
    public final C16320sq A0A;

    public AnonymousClass1KE(C16300so r3, C14870pt r4, AnonymousClass1K9 r5, C18640x1 r6, AnonymousClass1KA r7, AnonymousClass1K8 r8, C14710pd r9, AnonymousClass1KB r10, C16320sq r11) {
        this.A08 = r9;
        this.A03 = r4;
        this.A02 = r3;
        this.A07 = r8;
        this.A0A = r11;
        this.A04 = r5;
        this.A06 = r7;
        this.A05 = r6;
        this.A09 = r10;
    }

    public static /* synthetic */ void A00(AnonymousClass1KE r4, AnonymousClass5S7 r5, String str, Map map, boolean z2) {
        r5.AR6(map);
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry value : map.entrySet()) {
                sb.append(value.getValue().toString());
                sb.append(10);
            }
            r4.A02.AcB("ShopManager/requestShopMetadata", sb.toString(), z2);
        }
        r4.A01.A03(str);
    }

    public void A01(AnonymousClass5S7 r7, String str) {
        AnonymousClass1K8 r5 = this.A07;
        try {
            Matcher A002 = r5.A00(str);
            if (A002.matches()) {
                String group = A002.group(1);
                if (group != null) {
                    C93644jX r0 = (C93644jX) this.A01.A02(group);
                    if (r0 != null) {
                        r7.AR7(r0);
                        return;
                    }
                    AnonymousClass1KB r02 = this.A09;
                    r02.A01 = group;
                    r02.A00 = "STOREFRONT";
                    this.A0A.Acl(new RunnableRunnableShape0S1200000_I0(r7, group, this, 11));
                    return;
                }
            } else {
                C16300so r2 = r5.A00;
                StringBuilder sb = new StringBuilder();
                sb.append("Matcher didn't match for: ");
                sb.append(str);
                r2.AcB("ShopUtils/parseIdFromUrl", sb.toString(), false);
            }
        } catch (C803843q e2) {
            Log.e((Throwable) e2);
            r5.A00.AcB("ShopUtils/parseIdFromUrl", e2.getMessage(), true);
        }
        C16300so r3 = this.A02;
        StringBuilder sb2 = new StringBuilder("Couldn't find shopId: ");
        sb2.append(str);
        r3.AcB("ShopManager/requestShopMetadataByUrl", sb2.toString(), false);
        r7.AR6(Collections.EMPTY_MAP);
    }

    public boolean A02() {
        C14710pd r2 = this.A08;
        C16620tM r1 = C16620tM.A02;
        return !r2.A0E(r1, 854) && !r2.A0E(r1, 832) && r2.A0E(r1, 1062);
    }
}
