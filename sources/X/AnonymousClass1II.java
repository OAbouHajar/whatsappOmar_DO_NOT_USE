package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1II  reason: invalid class name */
public abstract class AnonymousClass1II {
    public abstract AnonymousClass1IH A00();

    public abstract Object A01(C88114Zy r1, Object obj, Map map);

    public final Map A02(C88114Zy r13, AnonymousClass1IH r14, Object obj, Map map) {
        C88114Zy[] r5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(r13 == null || (r5 = r13.A02) == null)) {
            int length = r5.length;
            int i2 = 0;
            while (i2 < length) {
                C88114Zy r11 = r5[i2];
                i2++;
                Enum[] enumArr = (Enum[]) r14.A8z().getEnumConstants();
                if (enumArr != null) {
                    int length2 = enumArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        }
                        Enum enumR = enumArr[i3];
                        i3++;
                        String ACB = ((AnonymousClass5Q7) enumR).ACB();
                        String str = r11.A00;
                        if (C18450wi.A0R(ACB, str)) {
                            if (enumR != null) {
                                Map map2 = map;
                                Object AcV = r14.AcV(enumR, obj, map2);
                                if ((AcV instanceof List) && (AcV = ((Collection) AcV).toArray(new Object[0])) == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                } else if (AcV instanceof Object[]) {
                                    ArrayList arrayList = new ArrayList();
                                    Object[] objArr = (Object[]) AcV;
                                    int length3 = objArr.length;
                                    int i4 = 0;
                                    while (i4 < length3) {
                                        Object obj2 = objArr[i4];
                                        i4++;
                                        C18450wi.A0H(str, 0);
                                        Map map3 = r13.A01;
                                        arrayList.add(A01(map3 == null ? null : (C88114Zy) map3.get(str), obj2, map2));
                                    }
                                    linkedHashMap.put(str, arrayList);
                                } else {
                                    C18450wi.A0H(str, 0);
                                    Map map4 = r13.A01;
                                    linkedHashMap.put(str, A01(map4 == null ? null : (C88114Zy) map4.get(str), AcV, map2));
                                }
                            }
                        }
                    }
                }
                String str2 = r11.A00;
                Log.e(C18450wi.A06("Field not supported: ", str2));
                linkedHashMap.put(str2, (Object) null);
            }
        }
        return linkedHashMap;
    }
}
