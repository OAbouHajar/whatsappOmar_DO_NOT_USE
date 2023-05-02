package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1fx  reason: invalid class name and case insensitive filesystem */
public class C32271fx {
    public static Object A00(C16300so r12, C28371Vv r13, Class cls, Long l2, Long l3, Object obj, String[] strArr, boolean z2) {
        int length = strArr.length;
        if (length != 0) {
            int i2 = length - 1;
            String str = strArr[i2];
            boolean z3 = false;
            if (str.charAt(0) == '#') {
                z3 = true;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                r13 = r13.A0K(strArr[i3]);
            }
            Long l4 = null;
            Object obj2 = obj;
            if (cls == String.class) {
                String A0L = z3 ? r13.A0L() : r13.A0N(str, (String) null);
                if (z2) {
                    if (!C34901l3.A00(A0L, obj2)) {
                        throw new AnonymousClass1W9(String.format("Error while parsing attribute '%s' in tag <%s/>.", new Object[]{str, r13.A00}));
                    }
                } else if (A0L != null) {
                    if (l2 != null && ((long) A0L.length()) < l2.longValue()) {
                        throw new AnonymousClass1W9(String.format("Length of attribute %s for tag %s is less than the specified lower bound value of %s.", new Object[]{str, r13.A00, l2}));
                    } else if (l3 != null && ((long) A0L.length()) > l3.longValue()) {
                        throw new AnonymousClass1W9(String.format("Length of attribute %s for tag %s is more than the specified upper bound value of %s.", new Object[]{str, r13.A00, l3}));
                    } else if (obj != null && !A0L.equals(obj2)) {
                        throw new AnonymousClass1W9(String.format("Error while parsing attribute '%s' in tag <%s/>.", new Object[]{str, r13.A00}));
                    }
                }
                return A0L;
            } else if (cls == byte[].class) {
                if (z3) {
                    byte[] bArr = r13.A01;
                    if (bArr != null) {
                        if (l2 != null && ((long) bArr.length) < l2.longValue()) {
                            throw new AnonymousClass1W9(String.format("Length of element value for tag %s is less than the specified lower bound value of %s", new Object[]{r13.A00, l2}));
                        } else if (l3 == null || ((long) bArr.length) <= l3.longValue()) {
                            return bArr;
                        } else {
                            throw new AnonymousClass1W9(String.format("Length of element value for tag %s is more than the specified upper bound value of %s", new Object[]{r13.A00, l3}));
                        }
                    }
                } else {
                    throw new AnonymousClass1W9("Cannot have binary not contained in an element value in tag %s", r13.A00);
                }
            } else if (cls == Long.class || cls == Long.TYPE) {
                String A0L2 = z3 ? r13.A0L() : r13.A0N(str, (String) null);
                if (z2) {
                    if (A0L2 != null) {
                        l4 = Long.valueOf(r13.A0E(A0L2, str));
                    }
                    if (!C34901l3.A00(l4, obj2)) {
                        throw new AnonymousClass1W9(String.format("Error while parsing attribute '%s' in tag <%s/>.", new Object[]{str, r13.A00}));
                    }
                } else if (A0L2 != null) {
                    long A0E = r13.A0E(A0L2, str);
                    Long valueOf = Long.valueOf(A0E);
                    if (l2 != null && A0E < l2.longValue()) {
                        throw new AnonymousClass1W9(String.format("Value of attribute '%s' for tag %s is less than the specified lower bound value of %s", new Object[]{str, r13.A00, l2}));
                    } else if (l3 != null && A0E > l3.longValue()) {
                        throw new AnonymousClass1W9(String.format("Value of attribute '%s' for tag %s is more than the specified upper bound value of %s", new Object[]{str, r13.A00, l3}));
                    } else if (obj == null || valueOf.equals(obj2)) {
                        return valueOf;
                    } else {
                        throw new AnonymousClass1W9(String.format("Error while parsing attribute '%s' in tag <%s/>.", new Object[]{str, r13.A00}));
                    }
                }
            } else if (Jid.class.isAssignableFrom(cls)) {
                Jid A0F = r13.A0F(r12, cls, str);
                if (z2) {
                    if (C34901l3.A00(A0F, obj2)) {
                        return A0F;
                    }
                    throw new AnonymousClass1W9(String.format("Error while parsing attribute '%s' in tag <%s/>.", new Object[]{str, r13.A00}));
                } else if (A0F != null) {
                    if (obj == null || A0F.equals(obj2)) {
                        return A0F;
                    }
                    throw new AnonymousClass1W9(String.format("Error while parsing attribute '%s' in tag <%s/>.", new Object[]{str, r13.A00}));
                }
            } else {
                throw new AnonymousClass1W9(String.format("Invalid type '%s' passed to function", new Object[]{cls.getName()}));
            }
            return l4;
        }
        throw new AnonymousClass1W9("Empty path");
    }

    public static Object A01(C16300so r5, C28371Vv r6, Class cls, Long l2, Long l3, Object obj, String[] strArr, boolean z2) {
        Object A00 = A00(r5, r6, cls, l2, l3, obj, strArr, z2);
        if (A00 != null) {
            return A00;
        }
        int length = strArr.length - 1;
        String str = strArr[length];
        for (int i2 = 0; i2 < length; i2++) {
            r6 = r6.A0K(strArr[i2]);
        }
        throw new AnonymousClass1W9(String.format("Required attribute '%s' missing for tag '%s'", new Object[]{str, r6.A00}));
    }

    public static Object A02(C28371Vv r10, C32261fw r11, String[] strArr) {
        List A07 = A07(r10, r11, strArr, 0, 1);
        if (A07.isEmpty()) {
            return null;
        }
        return A07.get(0);
    }

    public static Object A03(C28371Vv r2, C32261fw r3, String[] strArr) {
        for (String A0K : strArr) {
            r2 = r2.A0K(A0K);
        }
        return r3.A52(r2);
    }

    public static Object A04(C28371Vv r4, String str, List list, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                return A03(r4, (C32261fw) it.next(), strArr);
            } catch (AnonymousClass1W9 e2) {
                arrayList.add(e2.getMessage());
            }
        }
        throw new AnonymousClass1W9(String.format("Required mixin group '%s' was not present, encountered the following errors for each possible mixin:\n%s", new Object[]{str, AnonymousClass1ZW.A0A(IOUtils.LINE_SEPARATOR_UNIX, arrayList)}));
    }

    public static String A05(C28371Vv r9, List list, String[] strArr) {
        String str = (String) A00((C16300so) null, r9, String.class, (Long) null, (Long) null, (Object) null, strArr, false);
        if (str == null) {
            return null;
        }
        A08(str, list);
        return str;
    }

    public static String A06(C28371Vv r8, List list, String[] strArr) {
        String str = (String) A01((C16300so) null, r8, String.class, (Long) null, (Long) null, (Object) null, strArr, false);
        A08(str, list);
        return str;
    }

    public static List A07(C28371Vv r10, C32261fw r11, String[] strArr, long j2, long j3) {
        int length = strArr.length;
        if (length != 0) {
            int i2 = length - 1;
            for (int i3 = 0; i3 < i2; i3++) {
                r10 = r10.A0K(strArr[i3]);
            }
            C28371Vv[] r1 = r10.A03;
            String str = strArr[i2];
            if (r1 == null) {
                if (j2 != 0) {
                    throw new AnonymousClass1W9(String.format("Null value received for non-optional children of type '%s'.", new Object[]{str}));
                } else if (j2 == 0) {
                    return new ArrayList();
                }
            }
            List<C28371Vv> asList = Arrays.asList(r1);
            ArrayList arrayList = new ArrayList();
            for (C28371Vv r12 : asList) {
                if (str.equals(r12.A00)) {
                    arrayList.add(r12);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(r11.A52((C28371Vv) it.next()));
            }
            if (((long) arrayList2.size()) < j2) {
                throw new AnonymousClass1W9(String.format("Invalid number of children '%s'. Received %d children but the minimum value specified in the spec is %d.", new Object[]{str, Integer.valueOf(arrayList2.size()), Long.valueOf(j2)}));
            } else if (((long) arrayList2.size()) <= j3) {
                return arrayList2;
            } else {
                throw new AnonymousClass1W9(String.format("Invalid number of children '%s'. Received %d children but the maximum value specified in the spec is %d.", new Object[]{str, Integer.valueOf(arrayList2.size()), Long.valueOf(j3)}));
            }
        } else {
            throw new AnonymousClass1W9("Empty path");
        }
    }

    public static void A08(String str, List list) {
        if (!list.contains(str)) {
            throw new AnonymousClass1W9(String.format("String was expected to be one of '%s'.", new Object[]{TextUtils.join(", ", list)}));
        }
    }

    public static void A09(byte[] bArr, long j2, long j3) {
        Object[] objArr;
        String str;
        long length = (long) bArr.length;
        if (length < j2) {
            objArr = new Object[]{Long.valueOf(j2)};
            str = "Length of binary byte array is less than the specified lower bound value of %d";
        } else if (length > j3) {
            objArr = new Object[]{Long.valueOf(j3)};
            str = "Length of binary byte array is greater than the specified lower bound value of %d";
        } else {
            return;
        }
        AnonymousClass00B.A08(String.format(str, objArr));
    }

    public static boolean A0A(Jid jid, List list) {
        if (jid == null) {
            AnonymousClass00B.A08(String.format("Received null for JID enum '%s'.", new Object[]{"to"}));
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isAssignableFrom(jid.getClass())) {
                return true;
            }
        }
        AnonymousClass00B.A08(String.format("JID enum '%s' was expected to be one of '%s' but was '%s'.", new Object[]{"to", TextUtils.join(", ", list), jid.getClass().getSimpleName()}));
        return true;
    }

    public static boolean A0B(Long l2, long j2, boolean z2) {
        Object[] objArr;
        String str;
        if (l2 != null || z2) {
            if (l2 != null) {
                long longValue = l2.longValue();
                if (longValue < j2) {
                    objArr = new Object[]{Long.valueOf(j2)};
                    str = "Value is less than the specified lower bound value of %d";
                } else if (longValue > 9007199254740991L) {
                    objArr = new Object[]{9007199254740991L};
                    str = "Value is greater than the specified lower bound value of %d";
                }
                AnonymousClass00B.A08(String.format(str, objArr));
            }
            return true;
        }
        AnonymousClass00B.A08("Received null value for non-optional ':int'.");
        return false;
    }

    public static boolean A0C(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        AnonymousClass00B.A08(String.format("Received null value for non-optional '%s'.", new Object[]{str}));
        return false;
    }

    public static boolean A0D(String str, long j2, long j3, boolean z2) {
        Object[] objArr;
        String str2;
        if (str != null || z2) {
            if (str != null) {
                long length = (long) str.length();
                if (length < j2) {
                    objArr = new Object[]{Long.valueOf(j2)};
                    str2 = "Length of string is less than the specified lower bound value of %s";
                } else if (length > j3) {
                    objArr = new Object[]{Long.valueOf(j3)};
                    str2 = "Length of string is greater than the specified upper bound value of %s";
                }
                AnonymousClass00B.A08(String.format(str2, objArr));
            }
            return true;
        }
        AnonymousClass00B.A08("Received null value for non-optional ':string'.");
        return false;
    }

    public static boolean A0E(List list, long j2, long j3) {
        Object[] objArr;
        String str;
        if (list == null) {
            AnonymousClass00B.A08("Received null value for children. Pass `Collections.emptyList()` instead of null for non-present, optional children.");
            return false;
        }
        if (((long) list.size()) < j2) {
            objArr = new Object[]{Integer.valueOf(list.size()), Long.valueOf(j2)};
            str = "Number of children %d is less than the specified minimum value of %d";
        } else {
            if (((long) list.size()) > j3) {
                objArr = new Object[]{Integer.valueOf(list.size()), Long.valueOf(j3)};
                str = "Number of children %d is greater than the specified maximum value of %d";
            }
            return true;
        }
        AnonymousClass00B.A08(String.format(str, objArr));
        return true;
    }
}
