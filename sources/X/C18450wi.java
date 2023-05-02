package X;

import android.content.Context;
import android.view.View;
import java.util.Arrays;

/* renamed from: X.0wi  reason: invalid class name and case insensitive filesystem */
public class C18450wi {
    public static View A00(View view, int i2) {
        View A0E = C004601z.A0E(view, i2);
        A0B(A0E);
        return A0E;
    }

    public static View A01(C000900k r0, int i2) {
        View findViewById = r0.findViewById(i2);
        A0B(findViewById);
        return findViewById;
    }

    public static AnonymousClass020 A02(AnonymousClass1US r5) {
        Double d2 = r5.A08;
        A0A(d2);
        double doubleValue = d2.doubleValue();
        Double d3 = r5.A09;
        A0A(d3);
        return new AnonymousClass020(doubleValue, d3.doubleValue());
    }

    public static RuntimeException A03(String str) {
        A0O(str);
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static String A04(Context context, int i2) {
        String string = context.getString(i2);
        A0B(string);
        return string;
    }

    public static String A05(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        return sb.toString();
    }

    public static String A06(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static void A07() {
        AnonymousClass1UU r0 = new AnonymousClass1UU();
        A0Q(r0);
        throw r0;
    }

    public static void A08(Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("INVOKE_RETURN");
            sb.append(" must not be null");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            A0Q(illegalStateException);
            throw illegalStateException;
        }
    }

    public static void A09(Object obj) {
        if (obj == null) {
            A0N("CHECK_CAST");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A0A(Object obj) {
        if (obj == null) {
            A0N("INSTANCE_FIELD");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A0B(Object obj) {
        if (obj == null) {
            A0N("INVOKE_RETURN");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A0C(Object obj) {
        if (obj == null) {
            A0N("LOAD_PARAM");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A0D(Object obj) {
        if (obj == null) {
            A0N("STATIC_FIELD");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A0E(Object obj) {
        if (obj == null) {
            A0N("UNKNOWN");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A0F(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            A0Q(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0G(Object obj, int i2) {
        if (obj == null) {
            String num = Integer.toString(i2);
            StringBuilder sb = new StringBuilder("param at index = ");
            sb.append(num);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(A05(sb.toString()));
            A0Q(illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    public static void A0H(Object obj, int i2) {
        if (obj == null) {
            String num = Integer.toString(i2);
            StringBuilder sb = new StringBuilder("param at index = ");
            sb.append(num);
            NullPointerException nullPointerException = new NullPointerException(A05(sb.toString()));
            A0Q(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0I(Object obj, int i2, Object obj2) {
        A0H(obj, i2);
        A0H(obj2, 3);
    }

    public static void A0J(Object obj, Object obj2) {
        A0H(obj, 1);
        A0H(obj2, 2);
    }

    public static void A0K(Object obj, Object obj2) {
        A0H(obj, 6);
        A0H(obj2, 7);
    }

    public static void A0L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        A0H(obj, 1);
        A0H(obj2, 2);
        A0H(obj3, 3);
        A0H(obj4, 4);
        A0H(obj5, 5);
    }

    public static void A0M(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            A0Q(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0N(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        NullPointerException nullPointerException = new NullPointerException(sb.toString());
        A0Q(nullPointerException);
        throw nullPointerException;
    }

    public static void A0O(String str) {
        StringBuilder sb = new StringBuilder("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        AnonymousClass1UV r0 = new AnonymousClass1UV(sb.toString());
        A0Q(r0);
        throw r0;
    }

    public static void A0P(String str, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void A0Q(Throwable th) {
        A0P(C18450wi.class.getName(), th);
    }

    public static boolean A0R(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
