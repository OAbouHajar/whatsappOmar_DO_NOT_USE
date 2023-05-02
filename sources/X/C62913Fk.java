package X;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.3Fk  reason: invalid class name and case insensitive filesystem */
public class C62913Fk implements C16710tV {
    public final float A00;
    public final LatLng A01;
    public final C30321cA A02;
    public final String A03;
    public final String A04;
    public final /* synthetic */ AnonymousClass399 A05;

    public C62913Fk(LatLng latLng, C30321cA r2, AnonymousClass399 r3, String str, String str2, float f2) {
        this.A05 = r3;
        this.A01 = latLng;
        this.A04 = str;
        this.A00 = f2;
        this.A03 = str2;
        this.A02 = r2;
    }

    public void AQR(int i2) {
        this.A02.ASB(i2);
    }

    public /* bridge */ /* synthetic */ void AYB(Object obj) {
        AnonymousClass4DK r6 = (AnonymousClass4DK) obj;
        LatLng latLng = this.A01;
        double d2 = latLng.A00;
        double d3 = latLng.A01;
        ArrayList A012 = C89564cS.A01(d2, d3, 14);
        AnonymousClass00B.A06(A012);
        Number number = (Number) C13690nt.A0Z(A012);
        Number number2 = (Number) A012.get(1);
        int i2 = 14;
        StringBuilder A0o = AnonymousClass000.A0o();
        do {
            char c2 = '0';
            long j2 = (long) (1 << (i2 - 1));
            if ((number.longValue() & j2) != 0) {
                c2 = (char) 49;
            }
            if ((number2.longValue() & j2) != 0) {
                c2 = (char) (((char) (c2 + 1)) + 1);
            }
            A0o.append(c2);
            i2--;
        } while (i2 > 0);
        String obj2 = A0o.toString();
        Map map = r6.A00;
        boolean containsKey = map.containsKey(obj2);
        C30321cA r22 = this.A02;
        int A0D = containsKey ? AnonymousClass000.A0D(map.get(obj2)) : 10;
        String str = this.A03;
        ArrayList A013 = C89564cS.A01(d2, d3, A0D);
        AnonymousClass00B.A06(A013);
        LatLng A022 = C15710ri.A02(C89564cS.A02(A0D, C13690nt.A0A(A013, 0), C13690nt.A0A(A013, 1)));
        long A0A = C13690nt.A0A(A013, 0);
        long A0A2 = C13690nt.A0A(A013, 1);
        long j3 = (long) (2 << (A0D - 1));
        double d4 = 360.0d / ((double) j3);
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(Double.valueOf(C89564cS.A00(A0A2, j3, true)));
        A0u.add(Double.valueOf((((double) A0A) * d4) - 180.0d));
        A0u.add(Double.valueOf(C89564cS.A00(A0A2, j3, false)));
        A0u.add(Double.valueOf((d4 * ((double) (A0A + 1))) - 180.0d));
        String str2 = this.A04;
        double d5 = (double) this.A00;
        r22.ASC(new AnonymousClass26B(Double.valueOf(((double) (C61853Aq.A00(C15710ri.A02(A0u), new LatLng(((Number) A0u.get(2)).doubleValue(), ((Number) A0u.get(3)).doubleValue())) / 2.0f)) + d5), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(A022.A00), Double.valueOf(A022.A01), Double.valueOf(d5), str2, (String) null, str));
    }
}
