package X;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.io.IOUtils;

/* renamed from: X.4dX  reason: invalid class name and case insensitive filesystem */
public abstract class C90124dX {
    public volatile int A00 = -1;

    public static String A01(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i2 != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                } else {
                    stringBuffer.append(charAt);
                }
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    public static void A02(Object obj, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        String str2;
        if (obj != null) {
            if (obj instanceof C90124dX) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(A01(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                            A02(obj2, name, stringBuffer, stringBuffer2);
                        } else if (obj2 != null) {
                            int length2 = Array.getLength(obj2);
                            for (int i2 = 0; i2 < length2; i2++) {
                                A02(Array.get(obj2, i2), name, stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        try {
                            if (AnonymousClass000.A1X(cls.getMethod(C13680ns.A0g(String.valueOf(substring), "has"), new Class[0]).invoke(obj, new Object[0]))) {
                                A02(cls.getMethod(C13680ns.A0g(String.valueOf(substring), "get"), new Class[0]).invoke(obj, new Object[0]), substring, stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    str2 = ">\n";
                } else {
                    return;
                }
            } else {
                String A01 = A01(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(A01);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    if (!str3.startsWith("http") && str3.length() > 200) {
                        str3 = String.valueOf(str3.substring(0, 200)).concat("[...]");
                    }
                    int length3 = str3.length();
                    StringBuilder A0g = C13690nt.A0g(length3);
                    for (int i3 = 0; i3 < length3; i3++) {
                        char charAt = str3.charAt(i3);
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                            Object[] objArr = new Object[1];
                            AnonymousClass000.A1M(objArr, charAt, 0);
                            A0g.append(String.format("\\u%04x", objArr));
                        } else {
                            A0g.append(charAt);
                        }
                    }
                    String obj3 = A0g.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(obj3);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer2.append('\"');
                    for (byte b2 : bArr) {
                        byte b3 = b2 & 255;
                        if (b3 == 92 || b3 == 34) {
                            stringBuffer2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                        } else if (b3 < 32 || b3 >= Byte.MAX_VALUE) {
                            Object[] objArr2 = new Object[1];
                            AnonymousClass000.A1M(objArr2, b3, 0);
                            stringBuffer2.append(String.format("\\%03o", objArr2));
                        }
                        stringBuffer2.append((char) b3);
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                str2 = IOUtils.LINE_SEPARATOR_UNIX;
            }
            stringBuffer2.append(str2);
        }
    }

    public abstract int A03();

    public C90124dX A04() {
        return (C90124dX) super.clone();
    }

    public abstract void A05(C90704ef r1);

    public /* synthetic */ Object clone() {
        throw null;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            A02(this, (String) null, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return C13680ns.A0g(AnonymousClass3K3.A0q(e2), "Error printing proto: ");
        }
    }
}
