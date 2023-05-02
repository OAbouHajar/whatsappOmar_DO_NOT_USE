package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* renamed from: X.5IO  reason: invalid class name */
public class AnonymousClass5IO extends C32061fa implements AnonymousClass5NM {
    public C32051fZ A00;

    public AnonymousClass5IO(C32051fZ r2) {
        if ((r2 instanceof AnonymousClass5IX) || (r2 instanceof C107395Ia)) {
            this.A00 = r2;
            return;
        }
        throw AnonymousClass000.A0T("unknown object passed to Time");
    }

    public AnonymousClass5IO(Date date) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(simpleTimeZone);
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(simpleDateFormat.format(date));
        String A0h = AnonymousClass000.A0h("Z", A0o);
        int parseInt = Integer.parseInt(A0h.substring(0, 4));
        this.A00 = (parseInt < 1950 || parseInt > 2049) ? new C107265Hb(A0h) : new C107635Iy(A0h.substring(2));
    }

    public static AnonymousClass5IO A00(Object obj) {
        if (obj == null || (obj instanceof AnonymousClass5IO)) {
            return (AnonymousClass5IO) obj;
        }
        if ((obj instanceof AnonymousClass5IX) || (obj instanceof C107395Ia)) {
            return new AnonymousClass5IO((C32051fZ) obj);
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(obj), AnonymousClass000.A0r("unknown object in factory: ")));
    }

    public String A03() {
        C32051fZ r1 = this.A00;
        if (!(r1 instanceof AnonymousClass5IX)) {
            return ((C107395Ia) r1).A0A();
        }
        String A0A = ((AnonymousClass5IX) r1).A0A();
        char charAt = A0A.charAt(0);
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(charAt < '5' ? "20" : "19");
        return AnonymousClass000.A0h(A0A, A0o);
    }

    public Date A04() {
        StringBuilder A0o;
        String str;
        try {
            C32051fZ r2 = this.A00;
            if (!(r2 instanceof AnonymousClass5IX)) {
                return ((C107395Ia) r2).A0C();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            String A0A = ((AnonymousClass5IX) r2).A0A();
            if (A0A.charAt(0) < '5') {
                A0o = AnonymousClass000.A0o();
                str = "20";
            } else {
                A0o = AnonymousClass000.A0o();
                str = "19";
            }
            A0o.append(str);
            return AnonymousClass4Z8.A00(simpleDateFormat.parse(AnonymousClass000.A0h(A0A, A0o)));
        } catch (ParseException e2) {
            throw AnonymousClass000.A0V(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("invalid date string: ")));
        }
    }

    public C32051fZ Agm() {
        return this.A00;
    }

    public String toString() {
        return A03();
    }
}
