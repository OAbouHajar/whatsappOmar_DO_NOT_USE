package X;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.facebook.redex.IDxSProviderShape316S0100000_I0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.07u  reason: invalid class name and case insensitive filesystem */
public final class C016407u {
    public static final Class[] A05;
    public final AnonymousClass05Y A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i2 = Build.VERSION.SDK_INT;
        clsArr[27] = i2 >= 21 ? Size.class : cls;
        if (i2 >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        A05 = clsArr;
    }

    public C016407u() {
        this.A03 = new LinkedHashMap();
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new IDxSProviderShape316S0100000_I0(this, 3);
    }

    public C016407u(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A03 = linkedHashMap;
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new IDxSProviderShape316S0100000_I0(this, 3);
        linkedHashMap.putAll(map);
    }

    public static final Bundle A00(C016407u r6) {
        for (Map.Entry entry : C25411Jr.A03(r6.A04).entrySet()) {
            r6.A06((String) entry.getKey(), ((AnonymousClass05Y) entry.getValue()).Ad1());
        }
        Map map = r6.A03;
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object next : keySet) {
            arrayList.add(next);
            arrayList2.add(map.get(next));
        }
        return C019709d.A00(C55932kg.A00("keys", arrayList), C55932kg.A00("values", arrayList2));
    }

    public static final boolean A01(Object obj) {
        if (obj != null) {
            Class[] clsArr = A05;
            int length = clsArr.length;
            int i2 = 0;
            while (i2 < length) {
                Class cls = clsArr[i2];
                C18450wi.A0F(cls);
                if (!cls.isInstance(obj)) {
                    i2++;
                }
            }
            return false;
        }
        return true;
    }

    public final AnonymousClass027 A02(Object obj, String str) {
        AnonymousClass027 r1;
        Map map = this.A02;
        Object obj2 = map.get(str);
        if ((obj2 instanceof AnonymousClass027) && (r1 = (AnonymousClass027) obj2) != null) {
            return r1;
        }
        Map map2 = this.A03;
        if (map2.containsKey(str)) {
            obj = map2.get(str);
        } else {
            map2.put(str, obj);
        }
        C019809e r12 = new C019809e(this, obj, str);
        map.put(str, r12);
        return r12;
    }

    public final AnonymousClass027 A03(String str) {
        AnonymousClass027 r1;
        Map map = this.A02;
        Object obj = map.get(str);
        if ((obj instanceof AnonymousClass027) && (r1 = (AnonymousClass027) obj) != null) {
            return r1;
        }
        Map map2 = this.A03;
        C019809e r12 = map2.containsKey(str) ? new C019809e(this, map2.get(str), str) : new C019809e(this, str);
        map.put(str, r12);
        return r12;
    }

    public final Object A04(String str) {
        C18450wi.A0H(str, 0);
        return this.A03.get(str);
    }

    public final void A05(String str) {
        C18450wi.A0H(str, 0);
        this.A03.remove(str);
        C019809e r1 = (C019809e) this.A02.remove(str);
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A01.remove(str);
    }

    public final void A06(String str, Object obj) {
        AnonymousClass028 r1;
        C18450wi.A0H(str, 0);
        if (A01(obj)) {
            Object obj2 = this.A02.get(str);
            if (!(obj2 instanceof AnonymousClass027) || (r1 = (AnonymousClass028) obj2) == null) {
                this.A03.put(str, obj);
            } else {
                r1.A0B(obj);
            }
            this.A01.get(str);
            return;
        }
        StringBuilder sb = new StringBuilder("Can't put value with type ");
        C18450wi.A0F(obj);
        sb.append(obj.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }
}
