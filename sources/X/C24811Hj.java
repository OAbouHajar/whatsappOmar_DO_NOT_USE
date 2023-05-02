package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* renamed from: X.1Hj  reason: invalid class name and case insensitive filesystem */
public class C24811Hj {
    public final List A00;
    public final List A01;
    public final List A02;

    public C24811Hj() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(Long.valueOf(FileUtils.ONE_KB));
        arrayList.add(10240L);
        arrayList.add(102400L);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(Long.valueOf(FileUtils.ONE_MB));
        arrayList2.add(10485760L);
        arrayList2.add(104857600L);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList3.add(10L);
        arrayList3.add(100L);
        arrayList3.add(1000L);
        this.A00 = arrayList;
        this.A01 = arrayList2;
        this.A02 = arrayList3;
    }

    public static long A00(List list, long j2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            if (j2 < longValue) {
                break;
            }
            j2 = (j2 / longValue) * longValue;
        }
        return j2;
    }

    public long A01(long j2) {
        List list = this.A01;
        if (list.size() >= 2) {
            long longValue = ((Number) list.get(0)).longValue();
            int i2 = 1;
            while (i2 < list.size()) {
                long longValue2 = ((Number) list.get(i2)).longValue();
                if (j2 <= longValue2) {
                    break;
                }
                i2++;
                longValue = longValue2;
            }
            return Math.round((((double) j2) * 1.0d) / ((double) longValue)) * longValue;
        }
        throw new IllegalArgumentException("Expected more than 1 bucket");
    }
}
