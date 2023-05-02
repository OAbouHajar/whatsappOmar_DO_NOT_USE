package X;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.60i  reason: invalid class name and case insensitive filesystem */
public abstract class C1201060i implements AnonymousClass1YB {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;

    public static void A00(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new Pair(obj, obj2));
    }

    public void A01(List list) {
        ArrayList arrayList = this.A04;
        if (arrayList != null && !arrayList.isEmpty()) {
            StringBuilder A0o = AnonymousClass000.A0o();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                A0o.append((String) arrayList.get(i2));
                if (i2 < arrayList.size() - 1) {
                    A0o.append(", ");
                }
            }
            list.add(new Pair("Topic IDs", A0o.toString()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List AEN() {
        /*
            r3 = this;
            boolean r1 = r3 instanceof X.C112615im
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r3.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0039
            if (r0 != 0) goto L_0x0017
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "Payments fb txn id"
        L_0x0014:
            A00(r0, r1, r2)
        L_0x0017:
            java.lang.String r0 = r3.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0026
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "Payments return value"
            A00(r0, r1, r2)
        L_0x0026:
            java.lang.String r0 = r3.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0035
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "Payments status"
            A00(r0, r1, r2)
        L_0x0035:
            r3.A01(r2)
            return r2
        L_0x0039:
            if (r0 != 0) goto L_0x0042
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "Payments fb txn id"
            A00(r0, r1, r2)
        L_0x0042:
            java.lang.String r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0017
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "Payments bank txn id"
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1201060i.AEN():java.util.List");
    }

    public boolean AHh() {
        return !(this instanceof C112615im);
    }

    public void AeI(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A04 = arrayList;
    }

    public abstract View buildPaymentHelpSupportSection(Context context, C30671cl r2, String str);
}
