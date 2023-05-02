package X;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4XH  reason: invalid class name */
public abstract class AnonymousClass4XH {
    public final AnonymousClass4RL A00;

    public AnonymousClass4XH(AnonymousClass4RL r1) {
        this.A00 = r1;
    }

    public static String A00(Class cls, Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(" to ");
        return cls.getName();
    }

    public Object A01() {
        if (!(this instanceof AnonymousClass5HC)) {
            if (this instanceof AnonymousClass5HD) {
                try {
                    return ((AnonymousClass5HD) this).A00.getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception unused) {
                    return null;
                }
            } else if (!(this instanceof AnonymousClass5HB)) {
                if (this instanceof AnonymousClass5H9) {
                    throw AnonymousClass000.A0W("newInstance");
                } else if (this instanceof AnonymousClass5HE) {
                    return AnonymousClass000.A0u();
                } else {
                    StringBuilder A0r = AnonymousClass000.A0r("Invalid or non Implemented status");
                    A0r.append(" createArray() in ");
                    throw AnonymousClass000.A0a(AnonymousClass000.A0f(getClass(), A0r));
                }
            }
        }
        return new AnonymousClass5C3();
    }

    public Object A02() {
        if (this instanceof AnonymousClass5HC) {
            return new LinkedHashMap();
        }
        if (this instanceof AnonymousClass5HD) {
            try {
                return ((AnonymousClass5HD) this).A00.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        } else if (this instanceof AnonymousClass5HB) {
            return new AnonymousClass5CE();
        } else {
            if ((this instanceof AnonymousClass5HA) || (this instanceof AnonymousClass5H8)) {
                throw AnonymousClass000.A0W("newInstance");
            }
            StringBuilder A0r = AnonymousClass000.A0r("Invalid or non Implemented status");
            A0r.append(" createObject() in ");
            throw AnonymousClass000.A0a(AnonymousClass000.A0f(getClass(), A0r));
        }
    }

    public Object A03(Object obj) {
        if (this instanceof C107225Gx) {
            List<Object> list = (List) obj;
            Object[] objArr = (Object[]) Array.newInstance(((C107225Gx) this).A01, list.size());
            int i2 = 0;
            for (Object obj2 : list) {
                objArr[i2] = obj2;
                i2++;
            }
            return objArr;
        } else if (this instanceof AnonymousClass5H7) {
            return C13690nt.A0d(obj);
        } else {
            if (this instanceof AnonymousClass5H6) {
                Class<Long> cls = Long.class;
                if (obj == null) {
                    return null;
                }
                Class<?> cls2 = obj.getClass();
                if (cls.isAssignableFrom(cls2)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls2) || Double.class.isAssignableFrom(cls2) || BigDecimal.class.isAssignableFrom(cls2) || Float.class.isAssignableFrom(cls2)) {
                    return Long.valueOf(C13700nu.A01(obj));
                }
                if (String.class.isAssignableFrom(cls2)) {
                    return Long.valueOf(obj.toString());
                }
                StringBuilder A0r = AnonymousClass000.A0r("can not map a ");
                throw new C69983fv(AnonymousClass000.A0h(A00(cls, cls2, A0r), A0r));
            } else if (this instanceof AnonymousClass5H5) {
                Class<Integer> cls3 = Integer.class;
                if (obj == null) {
                    return null;
                }
                Class<?> cls4 = obj.getClass();
                if (cls3.isAssignableFrom(cls4)) {
                    return obj;
                }
                if (Long.class.isAssignableFrom(cls4) || Double.class.isAssignableFrom(cls4) || BigDecimal.class.isAssignableFrom(cls4) || Float.class.isAssignableFrom(cls4)) {
                    return Integer.valueOf(AnonymousClass000.A0D(obj));
                }
                if (String.class.isAssignableFrom(cls4)) {
                    return Integer.valueOf(obj.toString());
                }
                StringBuilder A0r2 = AnonymousClass000.A0r("can not map a ");
                throw new C69983fv(AnonymousClass000.A0h(A00(cls3, cls4, A0r2), A0r2));
            } else if (this instanceof AnonymousClass5H4) {
                Class<Float> cls5 = Float.class;
                if (obj == null) {
                    return null;
                }
                Class<?> cls6 = obj.getClass();
                if (cls5.isAssignableFrom(cls6)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls6) || Long.class.isAssignableFrom(cls6) || BigDecimal.class.isAssignableFrom(cls6) || Double.class.isAssignableFrom(cls6)) {
                    return Float.valueOf(AnonymousClass000.A04(obj));
                }
                if (String.class.isAssignableFrom(cls6)) {
                    return Float.valueOf(obj.toString());
                }
                StringBuilder A0r3 = AnonymousClass000.A0r("can not map a ");
                throw new C69983fv(AnonymousClass000.A0h(A00(cls5, cls6, A0r3), A0r3));
            } else if (this instanceof AnonymousClass5H3) {
                Class<Double> cls7 = Double.class;
                if (obj == null) {
                    return null;
                }
                Class<?> cls8 = obj.getClass();
                if (cls7.isAssignableFrom(cls8)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls8) || Long.class.isAssignableFrom(cls8) || BigDecimal.class.isAssignableFrom(cls8) || Float.class.isAssignableFrom(cls8)) {
                    return Double.valueOf(AnonymousClass3K3.A01(obj));
                }
                if (String.class.isAssignableFrom(cls8)) {
                    return Double.valueOf(obj.toString());
                }
                StringBuilder A0r4 = AnonymousClass000.A0r("can not map a ");
                throw new C69983fv(AnonymousClass000.A0h(A00(cls7, cls8, A0r4), A0r4));
            } else if (this instanceof AnonymousClass5H2) {
                if (obj == null) {
                    return null;
                }
                Class<Date> cls9 = Date.class;
                Class<?> cls10 = obj.getClass();
                if (cls9.isAssignableFrom(cls10)) {
                    return obj;
                }
                if (Long.class.isAssignableFrom(cls10)) {
                    return new Date(C13700nu.A01(obj));
                }
                if (String.class.isAssignableFrom(cls10)) {
                    try {
                        return DateFormat.getInstance().parse(obj.toString());
                    } catch (ParseException e2) {
                        throw new C69983fv((Throwable) e2);
                    }
                } else {
                    StringBuilder A0r5 = AnonymousClass000.A0r("can not map a ");
                    throw new C69983fv(AnonymousClass000.A0h(A00(cls9, cls10, A0r5), A0r5));
                }
            } else if (this instanceof AnonymousClass5H1) {
                Class<Boolean> cls11 = Boolean.class;
                if (obj == null) {
                    return null;
                }
                Class<?> cls12 = obj.getClass();
                if (cls11.isAssignableFrom(cls12)) {
                    return obj;
                }
                StringBuilder A0r6 = AnonymousClass000.A0r("can not map a ");
                throw new C69983fv(AnonymousClass000.A0h(A00(cls11, cls12, A0r6), A0r6));
            } else if (this instanceof AnonymousClass5H0) {
                if (obj == null) {
                    return null;
                }
                return new BigInteger(obj.toString());
            } else if (!(this instanceof C107245Gz)) {
                return obj;
            } else {
                if (obj == null) {
                    return null;
                }
                return new BigDecimal(obj.toString());
            }
        }
    }
}
