package X;

import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape0S1300000_I0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.2bO  reason: invalid class name and case insensitive filesystem */
public class C51292bO {
    public static HashMap A00 = new HashMap();

    public static void A00(C14870pt r6, AnonymousClass1ZR r7, AnonymousClass013 r8, C51282bN r9, C16320sq r10, String str, boolean z2) {
        AnonymousClass1ZR r0;
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            r0 = C87664Ya.A00(str);
            if (r0 != null) {
                r0.A0R = z2;
                if (r9 == null) {
                    return;
                }
            } else {
                HashMap hashMap = A00;
                AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
                if (abstractCollection != null) {
                    abstractCollection.add(r9);
                    return;
                }
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(r9);
                hashMap.put(str, arrayList);
                r7.A0R = z2;
                r10.Acl(new RunnableRunnableShape0S1300000_I0(1, str2, r7, r8, r6));
                return;
            }
        } else if (r9 != null) {
            r0 = null;
        } else {
            return;
        }
        r9.AUM(r0, true);
    }
}
