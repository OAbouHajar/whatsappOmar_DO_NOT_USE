package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3GD  reason: invalid class name */
public class AnonymousClass3GD implements C108895Px {
    public C16900tq A00;
    public final List A01;

    public AnonymousClass3GD(C16900tq r2, List list) {
        this.A00 = r2;
        ArrayList A0n = C13680ns.A0n(list);
        this.A01 = A0n;
        Collections.sort(A0n);
    }

    public Cursor ABX(int i2, long j2, long j3, long j4) {
        int i3;
        if (j2 > 0) {
            int binarySearch = Collections.binarySearch(this.A01, Long.valueOf(j2));
            i3 = binarySearch + 1;
            if (binarySearch < 0) {
                i3 = (-binarySearch) - 1;
            }
        } else {
            i3 = 0;
        }
        List list = this.A01;
        if (i3 >= list.size()) {
            return null;
        }
        int min = Math.min(C13700nu.A00(list, i3), Math.min(100, 5000));
        ArrayList A0i = C13690nt.A0i(min);
        while (i3 < list.size() && A0i.size() < min) {
            long A0A = C13690nt.A0A(list, i3);
            if (j3 >= 0 && A0A > j3) {
                break;
            }
            C13700nu.A0d(A0i, A0A);
            i3++;
        }
        StringBuilder A0r = AnonymousClass000.A0r("   SELECT ");
        A0r.append(C16910tr.A00);
        A0r.append(", ");
        A0r.append("chat_row_id");
        A0r.append(" FROM ");
        A0r.append("available_message_view");
        A0r.append(" WHERE ");
        A0r.append("(_id IN ");
        A0r.append(C34111ji.A00(A0i.size()));
        A0r.append(")");
        A0r.append(" AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) ");
        A0r.append(" ORDER BY ");
        String A0h = AnonymousClass000.A0h("_id ASC", A0r);
        ArrayList A0i2 = C13690nt.A0i(A0i.size());
        Iterator it = A0i.iterator();
        while (it.hasNext()) {
            A0i2.add(String.valueOf(it.next()));
        }
        A0i2.add(String.valueOf(j4));
        AnonymousClass01Q r0 = new AnonymousClass01Q(A0h, A0i2);
        String str = (String) r0.A00;
        String[] strArr = (String[]) ((List) r0.A01).toArray(new String[0]);
        C16800tf A012 = this.A00.get();
        try {
            Cursor A08 = A012.A02.A08(str, strArr);
            A012.close();
            return A08;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
