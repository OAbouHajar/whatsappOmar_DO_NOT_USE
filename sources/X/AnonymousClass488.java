package X;

/* renamed from: X.488  reason: invalid class name */
public final /* synthetic */ class AnonymousClass488 {
    public static final long A00(String str, long j2, long j3, long j4) {
        String str2;
        try {
            String property = System.getProperty(str);
            if (property != null) {
                Long A0R = C441522z.A0R(property);
                if (A0R != null) {
                    long longValue = A0R.longValue();
                    if (j3 <= longValue && longValue <= j4) {
                        return longValue;
                    }
                    StringBuilder A0q = AnonymousClass000.A0q("System property '");
                    A0q.append(str);
                    A0q.append("' should be in range ");
                    A0q.append(j3);
                    A0q.append("..");
                    A0q.append(j4);
                    A0q.append(", but is '");
                    A0q.append(longValue);
                    str2 = AnonymousClass3K3.A0p(A0q, '\'');
                } else {
                    StringBuilder A0q2 = AnonymousClass000.A0q("System property '");
                    A0q2.append(str);
                    A0q2.append("' has unrecognized value '");
                    A0q2.append(property);
                    str2 = AnonymousClass3K3.A0p(A0q2, '\'');
                }
                throw AnonymousClass000.A0V(str2);
            }
        } catch (SecurityException unused) {
        }
        return j2;
    }
}
