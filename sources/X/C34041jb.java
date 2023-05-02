package X;

import java.util.Iterator;

/* renamed from: X.1jb  reason: invalid class name and case insensitive filesystem */
public class C34041jb {
    public static final String A00;

    static {
        Iterator it = AnonymousClass49U.A00.iterator();
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append("labeled_messages");
        String str = "(";
        while (true) {
            sb.append(str);
            String obj = sb.toString();
            if (it.hasNext()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                C84324Kc r3 = (C84324Kc) it.next();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(r3.A01);
                sb3.append(" ");
                sb3.append(r3.A00.value);
                String obj2 = sb3.toString();
                if (r3.A02) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(obj2);
                    sb4.append(" NOT NULL");
                    obj2 = sb4.toString();
                }
                sb2.append(obj2);
                String obj3 = sb2.toString();
                boolean hasNext = it.hasNext();
                sb = new StringBuilder();
                if (hasNext) {
                    sb.append(obj3);
                    str = ",";
                } else {
                    sb.append(obj3);
                    str = ")";
                }
            } else {
                A00 = obj;
                return;
            }
        }
    }
}
