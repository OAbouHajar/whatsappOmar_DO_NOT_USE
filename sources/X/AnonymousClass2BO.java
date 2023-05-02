package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2BO  reason: invalid class name */
public final class AnonymousClass2BO implements AnonymousClass2BP, AnonymousClass2BR {
    public static final HashMap A01;
    public static final HashMap A02;
    public static final HashMap A03;
    public static final Map A04;
    public static final Map A05;
    public final Class A00;

    static {
        int i2 = 0;
        List A0R = AnonymousClass1JA.A0R(AnonymousClass1DU.class, AnonymousClass22J.class, AnonymousClass1UJ.class, AnonymousClass5D8.class, C11350id.class, AnonymousClass5V6.class, AnonymousClass5V7.class, AnonymousClass5V8.class, AnonymousClass5V9.class, AnonymousClass5VA.class, C110035Ut.class, C110045Uu.class, C110055Uv.class, C110065Uw.class, C110075Ux.class, C110085Uy.class, C110095Uz.class, AnonymousClass5V0.class, AnonymousClass5V1.class, AnonymousClass5V2.class, AnonymousClass5V3.class, AnonymousClass5V4.class, AnonymousClass5V5.class);
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(A0R, 10));
        for (Object next : A0R) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AnonymousClass1JA.A0T();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                arrayList.add(new C25401Jq(next, Integer.valueOf(i2)));
                i2 = i3;
            }
        }
        A04 = C25411Jr.A02(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        A02 = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        A03 = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C18450wi.A0B(values);
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            C18450wi.A09(str);
            sb.append(C008603x.A06(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), C18450wi.A06(str, ".Companion"));
        }
        for (Map.Entry entry : A04.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), C18450wi.A06("kotlin.Function", Integer.valueOf(((Number) entry.getValue()).intValue())));
        }
        A01 = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C25421Js.A07(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, C008603x.A06(str2, str2));
        }
        A05 = linkedHashMap;
    }

    public AnonymousClass2BO(Class cls) {
        C18450wi.A0H(cls, 1);
        this.A00 = cls;
    }

    public static final Class A00(AnonymousClass2BR r2) {
        C18450wi.A0H(r2, 0);
        Class ACw = ((AnonymousClass2BP) r2).ACw();
        if (ACw.isPrimitive()) {
            String name = ACw.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return ACw;
    }

    public Class ACw() {
        return this.A00;
    }

    public String AG5() {
        String str;
        String str2;
        Class cls = this.A00;
        String str3 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod == null) {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        C18450wi.A0B(simpleName);
                        int indexOf = simpleName.indexOf(36, 0);
                        if (indexOf == -1) {
                            return simpleName;
                        }
                        String substring = simpleName.substring(indexOf + 1, simpleName.length());
                        C18450wi.A0B(substring);
                        return substring;
                    }
                    C18450wi.A0B(simpleName);
                    str2 = enclosingConstructor.getName();
                } else {
                    C18450wi.A0B(simpleName);
                    str2 = enclosingMethod.getName();
                }
                return C008603x.A07(simpleName, C18450wi.A06(str2, "$"), simpleName);
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (!componentType.isPrimitive() || (str = (String) A05.get(componentType.getName())) == null || (str3 = C18450wi.A06(str, "Array")) == null) {
                    return "Array";
                }
            } else {
                String str4 = (String) A05.get(cls.getName());
                return str4 == null ? cls.getSimpleName() : str4;
            }
        }
        return str3;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnonymousClass2BO) && C18450wi.A0R(A00(this), A00((AnonymousClass2BR) obj));
    }

    public int hashCode() {
        return A00(this).hashCode();
    }

    public String toString() {
        return C18450wi.A06(this.A00.toString(), " (Kotlin reflection is not available)");
    }
}
