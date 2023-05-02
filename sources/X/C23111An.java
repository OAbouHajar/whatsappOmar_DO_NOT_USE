package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1An  reason: invalid class name and case insensitive filesystem */
public class C23111An {
    public final C14710pd A00;
    public final AnonymousClass17S A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();

    public C23111An(C14710pd r2, AnonymousClass17S r3) {
        this.A01 = r3;
        this.A00 = r2;
    }

    public void A00(String str) {
        Number number = (Number) this.A02.remove(str);
        if (number != null) {
            this.A01.AL1("start_foreground_service", number.intValue(), str.hashCode(), 213);
        }
    }

    public void A01(String str, int i2, boolean z2, boolean z3) {
        Number number = (Number) this.A02.get(str);
        if (number != null) {
            AnonymousClass17S r3 = this.A01;
            int intValue = number.intValue();
            int hashCode = str.hashCode();
            r3.AKq("is_video_call", intValue, hashCode, z2);
            r3.AKn("peer_participants_count", intValue, hashCode, i2);
            r3.AKq("is_rejoin", intValue, hashCode, z3);
        }
    }

    public void A02(String str, String str2) {
        Number number = (Number) this.A02.get(str);
        if (number != null) {
            this.A01.AL9(number.intValue(), str2, str.hashCode());
        }
    }

    public void A03(String str, short s2) {
        Number number = (Number) this.A02.remove(str);
        if (number != null) {
            this.A01.AKy(number.intValue(), str.hashCode(), s2);
        }
    }

    public final boolean A04(String str, int i2) {
        ConcurrentHashMap concurrentHashMap = this.A02;
        Number number = (Number) concurrentHashMap.get(str);
        if (!this.A00.A0E(C16620tM.A02, 620)) {
            return false;
        }
        if (number != null && number.intValue() == i2) {
            return false;
        }
        this.A01.ALF(i2, str.hashCode());
        concurrentHashMap.put(str, Integer.valueOf(i2));
        return true;
    }
}
