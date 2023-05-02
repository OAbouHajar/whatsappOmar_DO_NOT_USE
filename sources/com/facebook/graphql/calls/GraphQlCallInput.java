package com.facebook.graphql.calls;

import X.AnonymousClass000;
import X.AnonymousClass0PW;
import X.C03490Is;
import X.C03500It;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class GraphQlCallInput {
    public static final AnonymousClass0PW A02 = new AnonymousClass0PW();
    public C03500It A00 = null;
    public AnonymousClass0PW A01 = A02;

    public static Object getFirstNonNull(List list) {
        for (Object next : list) {
            if (next != null) {
                return next;
            }
        }
        return null;
    }

    public void addListToArray(C03490Is r5, List list) {
        Object firstNonNull;
        if (list != null && !list.isEmpty() && (firstNonNull = getFirstNonNull(list)) != null) {
            if (firstNonNull instanceof List) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) it.next();
                    AnonymousClass0PW r1 = r5.A01;
                    C03490Is r0 = (C03490Is) r1.A00.A4T();
                    if (r0 == null) {
                        r0 = new C03490Is();
                    }
                    r0.A01(r1);
                    r5.A02(r0);
                    addListToArray(r0, list2);
                }
            } else if (firstNonNull instanceof String) {
                for (Object A03 : list) {
                    r5.A03(A03);
                }
            } else if (firstNonNull instanceof Boolean) {
                for (Object A032 : list) {
                    r5.A03(A032);
                }
            } else if (firstNonNull instanceof Number) {
                for (Object A033 : list) {
                    r5.A03(A033);
                }
            } else if (firstNonNull instanceof Enum) {
                for (Object obj : list) {
                    r5.A03(obj.toString());
                }
            } else if (firstNonNull instanceof GraphQlCallInput) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    r5.A02(((GraphQlCallInput) it2.next()).getAcquiredParamsMap());
                }
            } else if (firstNonNull instanceof Map) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Map map = (Map) it3.next();
                    AnonymousClass0PW r12 = r5.A01;
                    C03500It r02 = (C03500It) r12.A01.A4T();
                    if (r02 == null) {
                        r02 = new C03500It();
                    }
                    r02.A01(r12);
                    r5.A02(r02);
                    addMapToParamsCollectionMap(r02, map);
                }
            } else {
                throw AnonymousClass000.A0T(AnonymousClass000.A0f(firstNonNull.getClass(), AnonymousClass000.A0r("List value type is not supported: ")));
            }
        }
    }

    public void addMapToParamsCollectionMap(C03500It r4, Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            addObjectToMap(r4, (String) A0z.getKey(), A0z.getValue());
        }
    }

    public final void addObjectToMap(C03500It r3, String str, String str2) {
        if (str2 != null) {
            if (str2 instanceof Boolean) {
                str2 = AnonymousClass000.A1X(str2) ? "true" : "false";
            } else if (!(str2 instanceof Number) && !(str2 instanceof String)) {
                if (str2 instanceof Enum) {
                    str2 = str2.toString();
                } else if (str2 instanceof GraphQlCallInput) {
                    r3.A03(((GraphQlCallInput) str2).getAcquiredParamsMap(), str);
                    return;
                } else if (str2 instanceof List) {
                    AnonymousClass0PW r1 = r3.A01;
                    C03490Is r0 = (C03490Is) r1.A00.A4T();
                    if (r0 == null) {
                        r0 = new C03490Is();
                    }
                    r0.A01(r1);
                    r3.A03(r0, str);
                    addListToArray(r0, (List) str2);
                    return;
                } else if (str2 instanceof Map) {
                    AnonymousClass0PW r12 = r3.A01;
                    C03500It r02 = (C03500It) r12.A01.A4T();
                    if (r02 == null) {
                        r02 = new C03500It();
                    }
                    r02.A01(r12);
                    r3.A03(r02, str);
                    addMapToParamsCollectionMap(r02, (Map) str2);
                    return;
                } else {
                    throw AnonymousClass000.A0T(AnonymousClass000.A0f(str2.getClass(), AnonymousClass000.A0r("Unexpected object value type ")));
                }
            }
            r3.A05(str, str2);
        }
    }

    public void copyParams(Map map) {
        copyParamsToMap(this.A00, map);
    }

    public final void copyParamsToMap(C03500It r5, Map map) {
        if (r5 != null) {
            for (int i2 = 0; i2 < r5.A00; i2++) {
                String A022 = r5.A02(i2);
                if (i2 < 0 || i2 >= r5.A00) {
                    throw new ArrayIndexOutOfBoundsException(i2);
                }
                map.put(A022, interpretValue(r5.A01.get((i2 << 1) + 1)));
            }
        }
    }

    public C03500It getAcquiredParamsMap() {
        C03500It r0 = this.A00;
        if (r0 == null) {
            AnonymousClass0PW r1 = this.A01;
            r0 = (C03500It) r1.A01.A4T();
            if (r0 == null) {
                r0 = new C03500It();
            }
            r0.A01(r1);
            this.A00 = r0;
        }
        return r0;
    }

    public Object getObjectParamSlowly(String str) {
        if (this.A00 == null) {
            return null;
        }
        int i2 = 0;
        while (true) {
            C03500It r1 = this.A00;
            if (i2 >= r1.A00) {
                return null;
            }
            if (r1.A02(i2).equals(str)) {
                C03500It r12 = this.A00;
                if (i2 >= 0 && i2 < r12.A00) {
                    return interpretValue(r12.A01.get((i2 << 1) + 1));
                }
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            i2++;
        }
    }

    public C03500It getPoolableParamsForInternalUse() {
        return this.A00;
    }

    public String getStringParamSlowly(String str) {
        Object objectParamSlowly = getObjectParamSlowly(str);
        if (objectParamSlowly == null) {
            return null;
        }
        if (objectParamSlowly instanceof String) {
            return (String) objectParamSlowly;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0f(objectParamSlowly.getClass(), AnonymousClass000.A0r("Value is not String. Actual value type: ")));
    }

    public Map getValuesCopy() {
        TreeMap treeMap = new TreeMap();
        copyParamsToMap(this.A00, treeMap);
        return treeMap;
    }

    public final Object interpretArrayValue(C03490Is r5) {
        ArrayList arrayList = r5.A00;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                arrayList2.add(interpretValue(arrayList.get(i2)));
            }
        }
        return arrayList2;
    }

    public final Object interpretMapValue(C03490Is r5) {
        ArrayList arrayList = r5.A00;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                arrayList2.add(interpretValue(arrayList.get(i2)));
            }
        }
        return arrayList2;
    }

    public final Object interpretObjectValue(C03490Is r6) {
        String str;
        ArrayList arrayList = r6.A00;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                str = null;
                arrayList2.add(str);
            } else if (obj instanceof Number) {
                arrayList2.add(obj);
            } else {
                str = obj.toString();
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    public final Object interpretValue(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof C03490Is) {
            C03490Is r3 = (C03490Is) obj;
            ArrayList arrayList = r3.A00;
            return (arrayList.size() <= 0 || !(arrayList.get(0) instanceof C03500It)) ? (arrayList.size() <= 0 || !(arrayList.get(0) instanceof C03490Is)) ? interpretObjectValue(r3) : interpretArrayValue(r3) : interpretMapValue(r3);
        } else if (!(obj instanceof C03500It)) {
            return obj;
        } else {
            TreeMap treeMap = new TreeMap();
            copyParamsToMap((C03500It) obj, treeMap);
            return treeMap;
        }
    }

    public void put(String str, GraphQlCallInput graphQlCallInput) {
        if (graphQlCallInput != null) {
            getAcquiredParamsMap().A03(graphQlCallInput.getAcquiredParamsMap(), str);
        }
    }

    public void put(String str, Boolean bool) {
        getAcquiredParamsMap().A05(str, bool);
    }

    public void put(String str, Double d2) {
        getAcquiredParamsMap().A05(str, d2);
    }

    public void put(String str, Enum enumR) {
        getAcquiredParamsMap().A05(str, enumR.toString());
    }

    public void put(String str, Integer num) {
        getAcquiredParamsMap().A05(str, num);
    }

    public void put(String str, Number number) {
        getAcquiredParamsMap().A05(str, number);
    }

    public void put(String str, String str2) {
        getAcquiredParamsMap().A05(str, str2);
    }

    public void put(String str, List list) {
        C03500It acquiredParamsMap = getAcquiredParamsMap();
        AnonymousClass0PW r1 = acquiredParamsMap.A01;
        C03490Is r0 = (C03490Is) r1.A00.A4T();
        if (r0 == null) {
            r0 = new C03490Is();
        }
        r0.A01(r1);
        acquiredParamsMap.A03(r0, str);
        addListToArray(r0, list);
    }

    public void remove(String str) {
        C03500It acquiredParamsMap = getAcquiredParamsMap();
        for (int i2 = 0; i2 < acquiredParamsMap.A00; i2++) {
            if (acquiredParamsMap.A02(i2).equals(str)) {
                ArrayList arrayList = acquiredParamsMap.A01;
                int i3 = i2 << 1;
                arrayList.remove(i3 + 1);
                arrayList.remove(i3);
                acquiredParamsMap.A00--;
                return;
            }
        }
    }
}
