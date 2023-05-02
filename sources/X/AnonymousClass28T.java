package X;

import java.util.Arrays;

/* renamed from: X.28T  reason: invalid class name */
public class AnonymousClass28T {
    public final long A00;
    public final AnonymousClass144 A01;
    public final C35301lh A02;
    public final C35301lh A03;
    public final C35301lh A04;
    public final Long A05;
    public final String A06;

    public AnonymousClass28T(AnonymousClass144 r6, Long l2, String str, String str2, String str3, long j2, long j3) {
        Class<Long> cls = Long.class;
        this.A03 = new C35301lh(new C53852gP(), cls, Long.valueOf(j2), "WaFbid");
        this.A04 = new C35301lh(new C53852gP(), String.class, str, "WaFbPassword");
        this.A02 = new C35301lh(new C53852gP(), cls, str2, "WaFbAccessToken");
        this.A00 = j3;
        this.A05 = l2;
        this.A01 = r6;
        this.A06 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass28T) {
                AnonymousClass28T r6 = (AnonymousClass28T) obj;
                Object obj2 = this.A03.A00;
                AnonymousClass00B.A06(obj2);
                Object obj3 = r6.A03.A00;
                AnonymousClass00B.A06(obj3);
                if (C34901l3.A00(obj2, obj3)) {
                    Object obj4 = this.A04.A00;
                    AnonymousClass00B.A06(obj4);
                    Object obj5 = r6.A04.A00;
                    AnonymousClass00B.A06(obj5);
                    if (C34901l3.A00(obj4, obj5)) {
                        Object obj6 = this.A02.A00;
                        AnonymousClass00B.A06(obj6);
                        Object obj7 = r6.A02.A00;
                        AnonymousClass00B.A06(obj7);
                        if (!C34901l3.A00(obj6, obj7) || !C34901l3.A00(Long.valueOf(this.A00), Long.valueOf(r6.A00)) || !C34901l3.A00(this.A05, r6.A05) || !C34901l3.A00(this.A01, r6.A01)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.A03.A00;
        AnonymousClass00B.A06(obj);
        Object obj2 = this.A04.A00;
        AnonymousClass00B.A06(obj2);
        return Arrays.hashCode(new Object[]{obj, obj2, this.A02, Long.valueOf(this.A00), this.A05, this.A01});
    }
}
