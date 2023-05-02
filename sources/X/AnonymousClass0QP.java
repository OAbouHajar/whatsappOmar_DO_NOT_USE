package X;

import java.util.Arrays;

/* renamed from: X.0QP  reason: invalid class name */
public final class AnonymousClass0QP {
    public AnonymousClass0OX A00;
    public final AnonymousClass0OX A01;
    public final String A02;

    public AnonymousClass0QP(String str) {
        AnonymousClass0OX r0 = new AnonymousClass0OX();
        this.A01 = r0;
        this.A00 = r0;
        this.A02 = str;
    }

    public final void A00(Object obj, String str) {
        AnonymousClass0OX r1 = new AnonymousClass0OX();
        this.A00.A00 = r1;
        this.A00 = r1;
        r1.A01 = obj;
        r1.A02 = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.A02);
        sb.append('{');
        String str = "";
        for (AnonymousClass0OX r4 = this.A01.A00; r4 != null; r4 = r4.A00) {
            Object obj = r4.A01;
            sb.append(str);
            String str2 = r4.A02;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            str = ", ";
        }
        return AnonymousClass000.A0k(sb);
    }
}
