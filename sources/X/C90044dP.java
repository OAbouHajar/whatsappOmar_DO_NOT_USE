package X;

import com.facebook.redex.IDxWIShape251S0100000_2_I1;
import com.facebook.redex.IDxWIShape27S0000000_2_I1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4dP  reason: invalid class name and case insensitive filesystem */
public class C90044dP {
    public static final AnonymousClass5R0 A02 = new IDxWIShape27S0000000_2_I1(5);
    public static final AnonymousClass5R0 A03 = new IDxWIShape27S0000000_2_I1(4);
    public static final AnonymousClass5R0 A04 = new IDxWIShape27S0000000_2_I1(2);
    public static final AnonymousClass5R0 A05 = new IDxWIShape27S0000000_2_I1(3);
    public static final AnonymousClass5R0 A06 = new IDxWIShape27S0000000_2_I1(6);
    public static final AnonymousClass5R0 A07 = new IDxWIShape27S0000000_2_I1(1);
    public static final AnonymousClass5R0 A08 = new IDxWIShape27S0000000_2_I1(0);
    public static final AnonymousClass5R0 A09 = new AnonymousClass59D();
    public static final AnonymousClass5R0 A0A = new AnonymousClass59E();
    public static final AnonymousClass5R0 A0B = new IDxWIShape27S0000000_2_I1(7);
    public LinkedList A00 = new LinkedList();
    public ConcurrentHashMap A01 = new ConcurrentHashMap();

    public C90044dP() {
        A01(new IDxWIShape251S0100000_2_I1(this, 9), String.class);
        A01(new IDxWIShape251S0100000_2_I1(this, 0), Double.class);
        A01(new IDxWIShape251S0100000_2_I1(this, 1), Date.class);
        A01(new IDxWIShape251S0100000_2_I1(this, 2), Float.class);
        AnonymousClass5R0 r2 = A0B;
        A01(r2, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        A01(r2, Boolean.class);
        A01(new IDxWIShape251S0100000_2_I1(this, 3), int[].class);
        A01(new IDxWIShape251S0100000_2_I1(this, 4), short[].class);
        A01(new IDxWIShape251S0100000_2_I1(this, 5), long[].class);
        A01(new IDxWIShape251S0100000_2_I1(this, 6), float[].class);
        A01(new IDxWIShape251S0100000_2_I1(this, 7), double[].class);
        A01(new IDxWIShape251S0100000_2_I1(this, 8), boolean[].class);
        A00(AnonymousClass5VJ.class, A07);
        A00(C109155Qx.class, A08);
        A00(AnonymousClass5VI.class, A04);
        A00(C109145Qw.class, A05);
        A00(Map.class, A06);
        A00(Iterable.class, A03);
        A00(Enum.class, A02);
        A00(Number.class, r2);
    }

    public void A00(Class cls, AnonymousClass5R0 r4) {
        this.A00.addLast(new AnonymousClass4JD(cls, r4));
    }

    public void A01(AnonymousClass5R0 r5, Class... clsArr) {
        for (Class put : clsArr) {
            this.A01.put(put, r5);
        }
    }
}
