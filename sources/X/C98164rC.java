package X;

import android.content.ContentResolver;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.4rC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98164rC implements C108435Nz {
    public final String A00;

    public C98164rC(String str) {
        this.A00 = str;
    }

    public final Object AjQ() {
        Object obj;
        String str = this.A00;
        ContentResolver contentResolver = C90644eV.A06.getContentResolver();
        boolean z2 = false;
        Class<C90434e8> cls = C90434e8.class;
        synchronized (cls) {
            C90434e8.A01(contentResolver);
            obj = C90434e8.A00;
        }
        HashMap hashMap = C90434e8.A06;
        boolean z3 = false;
        synchronized (cls) {
            if (hashMap.containsKey(str)) {
                Object obj2 = hashMap.get(str);
                if (obj2 != null) {
                    z3 = obj2;
                }
            } else {
                z3 = null;
            }
        }
        Boolean bool = (Boolean) z3;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            String A002 = C90434e8.A00(contentResolver, str);
            if (A002 != null && !A002.equals("")) {
                if (C90434e8.A0B.matcher(A002).matches()) {
                    z2 = true;
                    bool = Boolean.TRUE;
                } else if (C90434e8.A0C.matcher(A002).matches()) {
                    bool = Boolean.FALSE;
                } else {
                    StringBuilder A0r = AnonymousClass000.A0r("attempt to read gservices key ");
                    A0r.append(str);
                    A0r.append(" (value \"");
                    A0r.append(A002);
                    Log.w("Gservices", AnonymousClass000.A0h("\") as boolean", A0r));
                }
            }
            synchronized (cls) {
                if (obj == C90434e8.A00) {
                    hashMap.put(str, bool);
                    C90434e8.A01.remove(str);
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
