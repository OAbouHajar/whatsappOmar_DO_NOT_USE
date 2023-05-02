package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import kotlin.jvm.internal.IDxLambdaShape59S0000000_2_I1;
import org.json.JSONObject;

/* renamed from: X.4Wu  reason: invalid class name and case insensitive filesystem */
public final class C87444Wu {
    public Vector A00;
    public Vector A01;
    public JSONObject A02;
    public boolean A03 = true;
    public final C89484cG A04 = new C89484cG();
    public final HashMap A05 = AnonymousClass000.A0x();

    public C87444Wu(String str) {
        this.A02 = new JSONObject(str);
    }

    public final double A00(ArrayList arrayList) {
        String str;
        C89484cG r5 = this.A04;
        int size = r5.A07.size();
        ArrayList A0i = C13690nt.A0i(size);
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            i3++;
            A0i.add(AnonymousClass3K4.A0U());
        }
        r5.A01 = C13680ns.A0n(A0i);
        int size2 = r5.A06.size();
        ArrayList A0i2 = C13690nt.A0i(size2);
        while (i2 < size2) {
            i2++;
            A0i2.add(Boolean.FALSE);
        }
        r5.A00 = C13680ns.A0n(A0i2);
        int size3 = arrayList.size();
        Vector vector = r5.A09;
        if (size3 == vector.size()) {
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                C25401Jq r1 = (C25401Jq) it.next();
                int A0D = AnonymousClass000.A0D(r1.second);
                int A0D2 = AnonymousClass000.A0D(r1.first);
                ArrayList arrayList2 = r5.A01;
                if (arrayList2 == null) {
                    throw C18450wi.A03("outputValues");
                }
                arrayList2.set(A0D2, arrayList.get(A0D));
            }
            int size4 = this.A05.size();
            ArrayList A0i3 = C13690nt.A0i(size4);
            int i4 = 0;
            while (i4 < size4) {
                i4++;
                A0i3.add(AnonymousClass3K4.A0U());
            }
            ArrayList A0n = C13680ns.A0n(A0i3);
            Vector vector2 = this.A00;
            if (vector2 == null) {
                str = "baseValuesRuleTrees";
            } else {
                Iterator it2 = vector2.iterator();
                while (it2.hasNext()) {
                    C88034Zq r2 = (C88034Zq) it2.next();
                    C18450wi.A09(r2);
                    A03(r2, A0n, new IDxLambdaShape59S0000000_2_I1(0));
                }
                Vector vector3 = this.A01;
                if (vector3 == null) {
                    str = "multiplierRuleTrees";
                } else {
                    Iterator it3 = vector3.iterator();
                    while (it3.hasNext()) {
                        C88034Zq r22 = (C88034Zq) it3.next();
                        C18450wi.A09(r22);
                        A03(r22, A0n, new IDxLambdaShape59S0000000_2_I1(1));
                    }
                    Iterator it4 = A0n.iterator();
                    double d2 = 0.0d;
                    while (it4.hasNext()) {
                        d2 += AnonymousClass3K3.A01(it4.next());
                    }
                    return d2;
                }
            }
            throw C18450wi.A03(str);
        }
        StringBuilder A0r = AnonymousClass000.A0r("input array has unexpected size. Expected: ");
        A0r.append(vector.size());
        A0r.append(". Actual: ");
        throw new C105585Ae(AnonymousClass000.A0l(A0r, arrayList.size()));
    }

    public final Vector A01(HashMap hashMap, JSONObject jSONObject) {
        C88034Zq r1;
        Vector vector = new Vector();
        Iterator<String> keys = jSONObject.keys();
        C18450wi.A0B(keys);
        while (keys.hasNext()) {
            String A0m = AnonymousClass000.A0m(keys);
            Object obj = jSONObject.get(A0m);
            if ((obj instanceof String) || (obj instanceof Double) || (obj instanceof Integer)) {
                if (!hashMap.containsKey(A0m)) {
                    int size = hashMap.size();
                    C18450wi.A09(A0m);
                    C13680ns.A1X(A0m, hashMap, size);
                    r1 = new C88034Zq(size, obj.toString());
                } else {
                    StringBuilder A0r = AnonymousClass000.A0r("Multiple base values for variable ");
                    A0r.append(A0m);
                    throw new C105585Ae(AnonymousClass000.A0h(" in config file.", A0r));
                }
            } else if (obj instanceof JSONObject) {
                C89484cG r0 = this.A04;
                C18450wi.A09(A0m);
                if (r0.A03.containsKey(A0m)) {
                    r1 = new C88034Zq(A0m, (List) A01(hashMap, (JSONObject) obj));
                } else {
                    StringBuilder A0r2 = AnonymousClass000.A0r("Undeclared feature ");
                    A0r2.append(A0m);
                    throw new C105585Ae(AnonymousClass000.A0h(" used as condition in base_values.", A0r2));
                }
            } else {
                StringBuilder A0r3 = AnonymousClass000.A0r("Variable ");
                A0r3.append(A0m);
                throw new C105585Ae(AnonymousClass000.A0h(" used in base_values has unexpected type.", A0r3));
            }
            vector.add(r1);
        }
        return vector;
    }

    public final Vector A02(JSONObject jSONObject, boolean z2) {
        C88034Zq r1;
        Vector vector = new Vector();
        Iterator<String> keys = jSONObject.keys();
        C18450wi.A0B(keys);
        while (keys.hasNext()) {
            String A0m = AnonymousClass000.A0m(keys);
            if (!z2 || !C18450wi.A0R(A0m, "base_values")) {
                Object obj = jSONObject.get(A0m);
                if ((obj instanceof String) || (obj instanceof Double) || (obj instanceof Integer)) {
                    HashMap hashMap = this.A05;
                    if (hashMap.containsKey(A0m)) {
                        C18450wi.A09(A0m);
                        r1 = new C88034Zq(AnonymousClass000.A0D(C25411Jr.A00(hashMap, A0m)), obj.toString());
                    }
                } else if (obj instanceof JSONObject) {
                    C89484cG r0 = this.A04;
                    C18450wi.A09(A0m);
                    if (r0.A03.containsKey(A0m)) {
                        r1 = new C88034Zq(A0m, (List) A02((JSONObject) obj, false));
                    } else if (z2) {
                        vector.addAll(A02((JSONObject) obj, false));
                    } else {
                        StringBuilder A0r = AnonymousClass000.A0r("Undeclared feature ");
                        A0r.append(A0m);
                        throw new C105585Ae(AnonymousClass000.A0h(" used as condition in biz_multiply_values.", A0r));
                    }
                } else {
                    StringBuilder A0r2 = AnonymousClass000.A0r("Variable ");
                    A0r2.append(A0m);
                    throw new C105585Ae(AnonymousClass000.A0h(" used in biz_multiply_values has unexpected type.", A0r2));
                }
                vector.add(r1);
            }
        }
        return vector;
    }

    public final void A03(C88034Zq r7, ArrayList arrayList, AnonymousClass1UJ r9) {
        List<C88034Zq> list = r7.A02;
        if (list == null) {
            String str = r7.A01;
            Integer num = r7.A00;
            if (num != null) {
                Double d2 = null;
                try {
                    if (AnonymousClass4A5.A00.nativePattern.matcher(str).matches()) {
                        d2 = Double.valueOf(Double.parseDouble(str));
                        if (d2 != null) {
                            int intValue = num.intValue();
                            Object obj = arrayList.get(intValue);
                            C18450wi.A0B(obj);
                            arrayList.set(intValue, r9.AIV(obj, d2));
                            return;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                int intValue2 = num.intValue();
                Object obj2 = arrayList.get(intValue2);
                C18450wi.A0B(obj2);
                arrayList.set(intValue2, r9.AIV(obj2, Double.valueOf(this.A04.A01(str))));
                return;
            }
            throw new C105585Ae("ValueModelConfigParser error! Rule tree leaf node has null index!");
        } else if (this.A04.A01(r7.A01) != 0.0d) {
            for (C88034Zq A032 : list) {
                A03(A032, arrayList, r9);
            }
        }
    }
}
