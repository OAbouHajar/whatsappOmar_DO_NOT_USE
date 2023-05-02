package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2NX  reason: invalid class name */
public class AnonymousClass2NX implements AnonymousClass2NY {
    public final C16440t3 A00;
    public final AnonymousClass11A A01;
    public final C16460t6 A02;
    public final C17240ul A03;
    public final AnonymousClass4OC A04;
    public final AnonymousClass122 A05;

    public AnonymousClass2NX(C16440t3 r2, AnonymousClass11A r3, C16460t6 r4, C17240ul r5, AnonymousClass4OC r6, AnonymousClass122 r7) {
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r6;
        List list = r6.A05;
        if (list != null) {
            Arrays.deepToString(list.toArray());
        }
    }

    public void AQR(int i2) {
        AnonymousClass4OC r0 = this.A04;
        AnonymousClass1WP r6 = r0.A02;
        String str = r0.A04;
        List list = r0.A05;
        int i3 = r0.A00;
        StringBuilder sb = new StringBuilder("groupmgr/request failed : ");
        sb.append(i2);
        sb.append(" | ");
        sb.append(r6);
        sb.append(" | ");
        sb.append(14);
        Log.e(sb.toString());
        this.A03.A12.remove(r6);
        int i4 = 2003;
        if (i2 != 406) {
            i4 = 2004;
            if (i2 != 429) {
                i4 = 2002;
                if (i2 != 500) {
                    i4 = 2001;
                }
            }
        }
        C17240ul.A01(i4, str);
        C16460t6 r4 = this.A02;
        AnonymousClass122 r1 = this.A05;
        C40201tj r02 = new C40201tj(r1.A03.A02(r6, true), this.A00.A00());
        r02.A00 = i3;
        r02.A0k(str);
        if (list != null) {
            r02.A0t(list);
        }
        r4.A0W(r02);
        this.A01.A08(r6, false);
    }

    public void AYI(AnonymousClass4MJ r4, C16050sL r5) {
        StringBuilder sb = new StringBuilder("groupmgr/request success : ");
        sb.append(r5);
        sb.append(" | ");
        sb.append(14);
        Log.i(sb.toString());
        this.A01.A08(this.A04.A02, false);
    }

    public void AYu() {
        AnonymousClass4OC r0 = this.A04;
        AnonymousClass1WP r6 = r0.A02;
        String str = r0.A04;
        List list = r0.A05;
        int i2 = r0.A00;
        Log.i("groupmgr/group_request/timeout/type: 14");
        this.A03.A12.remove(r6);
        C16460t6 r4 = this.A02;
        AnonymousClass122 r1 = this.A05;
        C40201tj r02 = new C40201tj(r1.A03.A02(r6, true), this.A00.A00());
        r02.A00 = i2;
        r02.A0k(str);
        if (list != null) {
            r02.A0t(list);
        }
        r4.A0W(r02);
        this.A01.A08(r6, false);
    }
}
