package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Jf  reason: invalid class name and case insensitive filesystem */
public class C47502Jf {
    public UserJid A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C16440t3 A04;
    public final UserJid A05;
    public final Integer A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final Map A0B;
    public final Map A0C;
    public final Map A0D = new HashMap();

    public C47502Jf(C16440t3 r2, UserJid userJid, Integer num, String str, List list, List list2, List list3, Map map, Map map2, int i2, long j2, long j3) {
        this.A05 = userJid;
        this.A04 = r2;
        this.A03 = j3;
        this.A02 = j2;
        this.A06 = num;
        this.A01 = i2;
        this.A0A = list;
        this.A09 = list2;
        this.A08 = list3;
        this.A0C = map;
        this.A0B = map2;
        this.A07 = str;
    }

    public final boolean A00(C16740tZ r10) {
        long A002 = this.A04.A00();
        Map map = this.A0B;
        C28381Vw r5 = r10.A11;
        Number number = (Number) map.get(r5);
        if (number != null && A002 - number.longValue() <= 60000) {
            return false;
        }
        map.put(r5, Long.valueOf(A002));
        return true;
    }
}
