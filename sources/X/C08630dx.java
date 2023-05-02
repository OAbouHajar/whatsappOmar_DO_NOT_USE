package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0dx  reason: invalid class name and case insensitive filesystem */
public class C08630dx implements C12670km {
    public static final C08630dx A00 = new C08630dx();
    public static final C06000Tv A01;

    static {
        String[] strArr = new String[4];
        strArr[0] = "c";
        strArr[1] = "v";
        strArr[2] = "i";
        A01 = C06000Tv.A00("o", strArr, 3);
    }

    public static C06040Tz A00(PointF pointF, PointF pointF2, Object obj, List list, int i2) {
        PointF pointF3 = (PointF) obj;
        PointF pointF4 = (PointF) list.get(i2);
        return new C06040Tz(new PointF(pointF.x + pointF3.x, pointF.y + pointF3.y), new PointF(pointF2.x + pointF4.x, pointF2.y + pointF4.y), pointF2);
    }

    public /* bridge */ /* synthetic */ Object AaC(C09090et r14, float f2) {
        if (r14.A0A() == AnonymousClass0KF.BEGIN_ARRAY) {
            r14.A0E();
        }
        r14.A0F();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z2 = false;
        while (r14.A0M()) {
            int A09 = r14.A09(A01);
            if (A09 == 0) {
                z2 = r14.A0N();
            } else if (A09 == 1) {
                list = C06550Wr.A03(r14, f2);
            } else if (A09 == 2) {
                list2 = C06550Wr.A03(r14, f2);
            } else if (A09 != 3) {
                r14.A0I();
                r14.A0J();
            } else {
                list3 = C06550Wr.A03(r14, f2);
            }
        }
        r14.A0H();
        if (r14.A0A() == AnonymousClass0KF.END_ARRAY) {
            r14.A0G();
        }
        if (list == null || list2 == null || list3 == null) {
            throw AnonymousClass000.A0T("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new AnonymousClass0UU(new PointF(), Collections.emptyList(), false);
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 1; i2 < size; i2++) {
                int i3 = i2 - 1;
                arrayList.add(A00((PointF) list.get(i3), (PointF) list.get(i2), list3.get(i3), list2, i2));
            }
            if (z2) {
                int i4 = size - 1;
                arrayList.add(A00((PointF) list.get(i4), (PointF) list.get(0), list3.get(i4), list2, 0));
            }
            return new AnonymousClass0UU(pointF, arrayList, z2);
        }
    }
}
