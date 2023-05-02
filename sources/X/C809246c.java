package X;

import java.util.List;

/* renamed from: X.46c  reason: invalid class name and case insensitive filesystem */
public final class C809246c {
    public static void A00(List list, List list2, int i2) {
        list2.clear();
        if (i2 == list.size()) {
            list2.addAll(list);
        } else if (i2 == 0) {
        } else {
            if (list.isEmpty()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    list2.add(Float.valueOf(0.0f));
                }
                return;
            }
            int size = list.size();
            boolean isEmpty = list2.isEmpty();
            if (i2 > size) {
                AnonymousClass00B.A0F(isEmpty);
                float size2 = list.size() == 1 ? 0.0f : 1.0f / (((((float) (i2 - list.size())) * 1.0f) / ((float) (list.size() - 1))) + 1.0f);
                for (int i4 = 0; i4 < i2 - 1; i4++) {
                    float f2 = ((float) i4) * size2;
                    double d2 = (double) f2;
                    int floor = (int) Math.floor(d2);
                    int ceil = (int) Math.ceil(d2);
                    float A04 = AnonymousClass000.A04(list.get(floor));
                    list2.add(Float.valueOf(A04 + ((AnonymousClass000.A04(list.get(ceil)) - A04) * (f2 - ((float) floor)))));
                }
                if (i2 >= 2) {
                    list2.add(list.get(list.size() - 1));
                    return;
                }
                return;
            }
            AnonymousClass00B.A0F(isEmpty);
            float size3 = (((float) i2) * 1.0f) / ((float) list.size());
            int i5 = 0;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (Object A042 : list) {
                f3 += AnonymousClass000.A04(A042);
                i5++;
                f4 += size3;
                if (f4 >= 1.0f) {
                    list2.add(Float.valueOf(f3 / ((float) i5)));
                    f4 -= 1.0f;
                    i5 = 0;
                    f3 = 0.0f;
                }
            }
            if (i5 > 0) {
                list2.add(Float.valueOf(f3 / ((float) i5)));
            }
        }
    }
}
