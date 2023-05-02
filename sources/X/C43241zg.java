package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1zg  reason: invalid class name and case insensitive filesystem */
public class C43241zg {
    public C16730tY A00;
    public final CopyOnWriteArrayList A01;

    public C43241zg(List list) {
        this.A01 = new CopyOnWriteArrayList(list);
        C16730tY r0 = (C16730tY) list.get(0);
        this.A00 = r0;
        C16750ta r2 = r0.A02;
        AnonymousClass00B.A0B("First media data is null", r2 != null);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C16730tY r4 = (C16730tY) it.next();
            C16750ta r3 = r4.A02;
            AnonymousClass00B.A0B("Media data is null", r3 != null);
            AnonymousClass00B.A0B("Media type mismatch", this.A00.A10 == r4.A10);
            AnonymousClass00B.A0B("Origin mismatch", this.A00.A08 == r4.A08);
            AnonymousClass00B.A0B("Caption mismatch", C34901l3.A00(this.A00.A13(), r4.A13()));
            AnonymousClass00B.A0B("Hash mismatch", C34901l3.A00(this.A00.A05, r4.A05));
            AnonymousClass00B.A0B("Encrypted hash mismatch", C34901l3.A00(this.A00.A04, r4.A04));
            boolean z2 = false;
            if (this.A00.A00 == r4.A00) {
                z2 = true;
            }
            AnonymousClass00B.A0B("Duration mismatch", z2);
            AnonymousClass00B.A0B("Mime mismatch", C34901l3.A00(this.A00.A06, r4.A06));
            AnonymousClass00B.A0B("Name mismatch", C34901l3.A00(this.A00.A14(), r4.A14()));
            AnonymousClass00B.A0B("Multicast id mismatch", C34901l3.A00(this.A00.A09, r4.A09));
            AnonymousClass00B.A06(r2);
            String str = r2.A0I;
            AnonymousClass00B.A06(r3);
            AnonymousClass00B.A0B("Media Job Id mismatch", C34901l3.A00(str, r3.A0I));
        }
    }

    public synchronized C16730tY A00() {
        return this.A00;
    }

    public String A01() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C16740tZ r1 = (C16740tZ) it.next();
            if (sb.length() != 0) {
                sb.append(',');
            }
            sb.append(r1.A11);
        }
        return sb.toString();
    }

    public synchronized void A02(C28381Vw r6) {
        StringBuilder sb = new StringBuilder();
        sb.append("messagelist/remove ");
        sb.append(r6);
        sb.append(" from ");
        sb.append(A01());
        Log.i(sb.toString());
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        C16730tY r3 = null;
        if (r6 != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C16730tY r1 = (C16730tY) it.next();
                if (r6.equals(r1.A11)) {
                    r3 = r1;
                    break;
                }
            }
        }
        copyOnWriteArrayList.remove(r3);
        if (!copyOnWriteArrayList.isEmpty()) {
            this.A00 = (C16730tY) copyOnWriteArrayList.get(0);
        }
    }

    public boolean A03() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (!C16030sJ.A0Q(((C16740tZ) it.next()).A11.A00)) {
                return true;
            }
        }
        return false;
    }

    public boolean A04() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (C16030sJ.A0Q(((C16740tZ) it.next()).A11.A00)) {
                return true;
            }
        }
        return false;
    }
}
