package X;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.1sp  reason: invalid class name and case insensitive filesystem */
public class C39641sp {
    public static final BigDecimal A00 = new BigDecimal("1000");

    public static BigDecimal A00(C39651sq r3, long j2) {
        int i2 = 0;
        while (true) {
            String str = r3.A00;
            if (i2 >= 3 - C39651sq.A00(str)) {
                return new BigDecimal(new BigInteger(Long.toString(j2)), C39651sq.A00(str));
            }
            j2 /= 10;
            i2++;
        }
    }
}
