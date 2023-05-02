package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4XO  reason: invalid class name */
public class AnonymousClass4XO {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public C228619o A03;
    public String A04;
    public final ArrayList A05 = AnonymousClass000.A0u();
    public final HashMap A06 = AnonymousClass000.A0x();
    public final CopyOnWriteArrayList A07 = new CopyOnWriteArrayList();

    public int A00(String str) {
        Number number = (Number) this.A06.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public void A01() {
        this.A07.add("done");
    }

    public synchronized void A02(String str) {
        C228619o r1 = this.A03;
        if (r1 != null) {
            r1.AL3(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A03(String str) {
        C228619o r1 = this.A03;
        if (r1 != null) {
            r1.AL3(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A04(String str) {
        C228619o r1 = this.A03;
        if (r1 != null) {
            r1.AL3(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A05(String str) {
        this.A05.add(str);
        this.A07.add(AnonymousClass000.A0h("-success", AnonymousClass000.A0q(str)));
    }

    public synchronized void A06(String str, int i2) {
        HashMap hashMap = this.A06;
        Integer num = (Integer) hashMap.get(str);
        Integer A0g = AnonymousClass3K3.A0g(str, hashMap, Integer.valueOf(num == null ? 0 : num.intValue()).intValue() + 1);
        this.A00 = i2;
        this.A04 = str;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A07;
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append("-error-");
        A0q.append(A0g);
        copyOnWriteArrayList.add(C13680ns.A0i("-", A0q, i2));
    }

    public boolean A07(String str) {
        Number number = (Number) this.A06.get(str);
        if (!this.A05.contains(str)) {
            return number == null || number.intValue() < 3;
        }
        return false;
    }

    public String toString() {
        return this.A07.toString();
    }
}
