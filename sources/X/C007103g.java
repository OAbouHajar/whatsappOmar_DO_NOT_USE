package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.03g  reason: invalid class name and case insensitive filesystem */
public final class C007103g {
    public Map A00 = new HashMap();

    public C007203h A00() {
        C007203h r0 = new C007203h(this.A00);
        C007203h.A01(r0);
        return r0;
    }

    public void A01(String str, int i2) {
        this.A00.put(str, Integer.valueOf(i2));
    }

    public void A02(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                this.A00.put(str, (Object) null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.A00.put(str, value);
                } else if (cls == boolean[].class) {
                    Map map2 = this.A00;
                    boolean[] zArr = (boolean[]) value;
                    int length = zArr.length;
                    Boolean[] boolArr = new Boolean[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        boolArr[i2] = Boolean.valueOf(zArr[i2]);
                    }
                    map2.put(str, boolArr);
                } else if (cls == byte[].class) {
                    Map map3 = this.A00;
                    byte[] bArr = (byte[]) value;
                    int length2 = bArr.length;
                    Byte[] bArr2 = new Byte[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        bArr2[i3] = Byte.valueOf(bArr[i3]);
                    }
                    map3.put(str, bArr2);
                } else if (cls == int[].class) {
                    Map map4 = this.A00;
                    int[] iArr = (int[]) value;
                    int length3 = iArr.length;
                    Integer[] numArr = new Integer[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        numArr[i4] = Integer.valueOf(iArr[i4]);
                    }
                    map4.put(str, numArr);
                } else if (cls == long[].class) {
                    Map map5 = this.A00;
                    long[] jArr = (long[]) value;
                    int length4 = jArr.length;
                    Long[] lArr = new Long[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        lArr[i5] = Long.valueOf(jArr[i5]);
                    }
                    map5.put(str, lArr);
                } else if (cls == float[].class) {
                    Map map6 = this.A00;
                    float[] fArr = (float[]) value;
                    int length5 = fArr.length;
                    Float[] fArr2 = new Float[length5];
                    for (int i6 = 0; i6 < length5; i6++) {
                        fArr2[i6] = Float.valueOf(fArr[i6]);
                    }
                    map6.put(str, fArr2);
                } else if (cls == double[].class) {
                    Map map7 = this.A00;
                    double[] dArr = (double[]) value;
                    int length6 = dArr.length;
                    Double[] dArr2 = new Double[length6];
                    for (int i7 = 0; i7 < length6; i7++) {
                        dArr2[i7] = Double.valueOf(dArr[i7]);
                    }
                    map7.put(str, dArr2);
                } else {
                    StringBuilder sb = new StringBuilder("Key ");
                    sb.append(str);
                    sb.append("has invalid type ");
                    sb.append(cls);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }
}
