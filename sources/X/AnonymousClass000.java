package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.IOnDoneCallback;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.facebook.redex.IDxCreatorShape14S0000000_I1;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.000  reason: invalid class name */
public final class AnonymousClass000 {
    public static float A00(float f2, float f3) {
        return (float) (((double) f2) + ((1.0d - C02200Af.A0H) * ((double) f3)));
    }

    public static float A01(float f2, float f3, float f4) {
        return f3 + (f4 * (f2 - f3));
    }

    public static float A02(float f2, float f3, float f4) {
        return Math.max(f4, Math.min(f2, f3));
    }

    public static float A03(ValueAnimator valueAnimator) {
        return ((Number) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static float A04(Object obj) {
        return ((Number) obj).floatValue();
    }

    public static int A05(float f2, float f3, int i2, int i3) {
        int abs = Math.abs(i2);
        return abs > 0 ? Math.round(Math.abs(f2 / ((float) abs)) * 1000.0f) << 2 : (int) (((f3 / ((float) i3)) + 1.0f) * 256.0f);
    }

    public static int A06(float f2, int i2, int i3) {
        return i3 + ((int) (((float) (i2 - i3)) * f2));
    }

    public static int A07(int i2) {
        return i2 < 0 ? 360 : 0;
    }

    public static int A08(int i2, float f2) {
        return (i2 + Float.floatToIntBits(f2)) * 31;
    }

    public static int A09(int i2, int i3) {
        return Math.abs(i2 - i3);
    }

    public static int A0A(int i2, int i3, int i4, int i5) {
        int i6 = (i2 - i3) - 1;
        return (((i4 >> i6) & 1) << 1) + ((i5 >> i6) & 1);
    }

    public static int A0B(Parcel parcel, String str) {
        parcel.enforceInterface(str);
        return parcel.readInt();
    }

    public static int A0C(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int A0D(Object obj) {
        return ((Number) obj).intValue();
    }

    public static int A0E(Object obj, int i2) {
        return (i2 + obj.hashCode()) * 31;
    }

    public static int A0F(Object obj, Object[] objArr, int i2) {
        objArr[i2] = obj;
        return Arrays.hashCode(objArr);
    }

    public static int A0G(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static Matrix A0H() {
        return new Matrix();
    }

    public static Path A0I() {
        return new Path();
    }

    public static Rect A0J() {
        return new Rect();
    }

    public static RectF A0K() {
        return new RectF();
    }

    public static Handler A0L() {
        return new Handler(Looper.getMainLooper());
    }

    public static DisplayMetrics A0M(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static View A0N(AbstractList abstractList, int i2) {
        return (View) abstractList.get(i2);
    }

    public static ViewGroup.MarginLayoutParams A0O(View view) {
        return (ViewGroup.MarginLayoutParams) view.getLayoutParams();
    }

    public static IOnDoneCallback A0P(Parcel parcel) {
        return IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder());
    }

    public static AnonymousClass0Y7 A0Q(Parcel parcel, String str) {
        parcel.enforceInterface(str);
        if (parcel.readInt() != 0) {
            return (AnonymousClass0Y7) AnonymousClass0Y7.CREATOR.createFromParcel(parcel);
        }
        return null;
    }

    public static C06520Wl A0R(List list, int i2) {
        return (C06520Wl) list.get(i2);
    }

    public static IDxCreatorShape14S0000000_I1 A0S(int i2) {
        return new IDxCreatorShape14S0000000_I1(i2);
    }

    public static IllegalArgumentException A0T(String str) {
        return new IllegalArgumentException(str);
    }

    public static IllegalArgumentException A0U(StringBuilder sb, int i2) {
        sb.append(i2);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0V(String str) {
        return new IllegalStateException(str);
    }

    public static NullPointerException A0W(String str) {
        return new NullPointerException(str);
    }

    public static Object A0X(Class cls, Object obj, String str) {
        return cls.getMethod(str, new Class[0]).invoke(obj, new Object[0]);
    }

    public static Object A0Y(Map map, int i2) {
        return map.get(Integer.valueOf(i2));
    }

    public static RuntimeException A0Z() {
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0a(String str) {
        return new RuntimeException(str);
    }

    public static String A0b(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static String A0c(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static String A0d(Object obj) {
        return obj.getClass().getName();
    }

    public static String A0e(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static String A0f(Object obj, StringBuilder sb) {
        sb.append(obj);
        return sb.toString();
    }

    public static String A0g(String str, Object obj) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        return sb.toString();
    }

    public static String A0h(String str, StringBuilder sb) {
        sb.append(str);
        return sb.toString();
    }

    public static String A0i(String str, StringBuilder sb, char c2) {
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    public static String A0j(StringBuilder sb) {
        sb.append(')');
        return sb.toString();
    }

    public static String A0k(StringBuilder sb) {
        sb.append('}');
        return sb.toString();
    }

    public static String A0l(StringBuilder sb, int i2) {
        sb.append(i2);
        return sb.toString();
    }

    public static String A0m(Iterator it) {
        return (String) it.next();
    }

    public static String A0n(List list, int i2) {
        return (String) list.get(i2);
    }

    public static StringBuilder A0o() {
        return new StringBuilder();
    }

    public static StringBuilder A0p(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getSimpleName());
        return sb;
    }

    public static StringBuilder A0q(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder A0r(String str) {
        return new StringBuilder(str);
    }

    public static Method A0s(Class cls, Object obj, String str, Class[] clsArr, int i2) {
        clsArr[i2] = obj;
        return cls.getMethod(str, clsArr);
    }

    public static Method A0t(Class cls, Object obj, String str, Class[] clsArr, int i2) {
        clsArr[i2] = obj;
        return cls.getDeclaredMethod(str, clsArr);
    }

    public static ArrayList A0u() {
        return new ArrayList();
    }

    public static ArrayList A0v(Cursor cursor) {
        return new ArrayList(cursor.getCount());
    }

    public static ArrayList A0w(List list) {
        return new ArrayList(list.size());
    }

    public static HashMap A0x() {
        return new HashMap();
    }

    public static Iterator A0y(Map map) {
        return map.entrySet().iterator();
    }

    public static Map.Entry A0z(Iterator it) {
        return (Map.Entry) it.next();
    }

    public static void A10(TypedArray typedArray, TwoStatePreference twoStatePreference, int i2) {
        twoStatePreference.A04 = typedArray.getBoolean(i2, typedArray.getBoolean(2, false));
        typedArray.recycle();
    }

    public static void A11(Canvas canvas, Paint paint, Path path, float f2, float f3) {
        path.lineTo(f2, f3);
        path.close();
        canvas.drawPath(path, paint);
    }

    public static void A12(Matrix matrix, Path path, List list, int i2) {
        path.addPath(((C13520mW) list.get(i2)).AEK(), matrix);
    }

    public static void A13(Paint paint, AnonymousClass0SI r2) {
        if (r2 != null) {
            paint.setColorFilter((ColorFilter) r2.A08());
        }
    }

    public static void A14(RectF rectF) {
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public static void A15(Preference preference, TwoStatePreference twoStatePreference, boolean z2) {
        preference.A0Q(Boolean.valueOf(z2));
        twoStatePreference.A0T(z2);
    }

    public static void A16(C13610mf r1, String str, long j2) {
        r1.A5Q(1, j2);
        if (str == null) {
            r1.A5R(2);
        } else {
            r1.A5S(2, str);
        }
    }

    public static void A17(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
    }

    public static void A18(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[4] = obj;
        objArr[5] = obj2;
        objArr[6] = obj3;
        objArr[7] = obj4;
    }

    public static void A19(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        objArr[12] = obj4;
    }

    public static void A1A(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[13] = obj;
        objArr[14] = obj2;
        objArr[15] = obj3;
        objArr[16] = obj4;
    }

    public static void A1B(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[17] = obj;
        objArr[18] = obj2;
        objArr[19] = obj3;
        objArr[20] = obj4;
    }

    public static void A1C(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[21] = obj;
        objArr[22] = obj2;
        objArr[23] = obj3;
        objArr[24] = obj4;
    }

    public static void A1D(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[28] = obj;
        objArr[29] = obj2;
        objArr[30] = obj3;
        objArr[31] = obj4;
    }

    public static void A1E(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static void A1F(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append(str2);
    }

    public static void A1G(Object obj, StringBuilder sb) {
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void A1H(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(", ");
    }

    public static void A1I(Object obj, StringBuilder sb) {
        sb.append(obj.toString());
    }

    public static void A1J(StringBuilder sb, int i2) {
        sb.append(Integer.toHexString(i2));
    }

    public static void A1K(Object[] objArr, int i2) {
        objArr[0] = Integer.valueOf(i2);
    }

    public static void A1L(Object[] objArr, int i2) {
        objArr[1] = Integer.valueOf(i2);
    }

    public static void A1M(Object[] objArr, int i2, int i3) {
        objArr[i3] = Integer.valueOf(i2);
    }

    public static void A1N(Object[] objArr, boolean z2) {
        objArr[0] = Boolean.valueOf(z2);
    }

    public static boolean A1O(int i2) {
        return i2 != 0;
    }

    public static boolean A1P(int i2) {
        return i2 == 0;
    }

    public static boolean A1Q(int i2) {
        return i2 > 0;
    }

    public static boolean A1R(int i2, int i3) {
        return i2 == i3;
    }

    public static boolean A1S(IBinder iBinder, Parcel parcel, int i2) {
        return iBinder.transact(i2, parcel, (Parcel) null, 1);
    }

    public static boolean A1T(Parcel parcel, AnonymousClass0Y7 r3, String str) {
        parcel.writeInterfaceToken(str);
        if (r3 != null) {
            parcel.writeInt(1);
            r3.writeToParcel(parcel, 0);
            return false;
        }
        parcel.writeInt(0);
        return false;
    }

    public static boolean A1U(Parcel parcel, AnonymousClass0Y7 r3, String str) {
        parcel.writeInterfaceToken(str);
        if (r3 != null) {
            parcel.writeInt(1);
            r3.writeToParcel(parcel, 0);
            return true;
        }
        parcel.writeInt(0);
        return true;
    }

    public static boolean A1V(Object obj) {
        return obj != null;
    }

    public static boolean A1W(Object obj) {
        return obj == null;
    }

    public static boolean A1X(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static boolean A1Y(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static boolean A1Z(Object obj, Method method, Object[] objArr) {
        return ((Boolean) method.invoke(obj, objArr)).booleanValue();
    }

    public static Object[] A1a(Object obj) {
        return new Object[]{obj};
    }

    public static String[] A1b(int i2) {
        String[] strArr = new String[i2];
        strArr[0] = "nm";
        return strArr;
    }
}
