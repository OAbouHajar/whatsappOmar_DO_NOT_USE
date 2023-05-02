package X;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Binder;
import android.os.Handler;
import android.os.Parcel;
import android.support.v4.view.MotionEventCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.google.android.exoplayer2.Timeline;
import com.google.android.gms.internal.gtm.zzes;
import com.google.android.gms.internal.gtm.zzet;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.R;
import com.obwhatsapp.quickcontact.QuickContactActivity;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.whispersystems.curve25519.JavaCurve25519Provider;

/* renamed from: X.3K4  reason: invalid class name */
public final class AnonymousClass3K4 {
    public static byte A00(int i2, long j2, long j3) {
        return (byte) ((int) (j3 | (j2 << i2)));
    }

    public static float A01(float f2, float f3) {
        return Math.abs(f2 - f3);
    }

    public static float A02(int i2, int i3, int i4) {
        return ((float) (i2 - i3)) - (((float) i4) / 2.0f);
    }

    public static int A03(int i2) {
        return ((i2 * 3) >> 1) + 1;
    }

    public static int A04(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static int A05(int i2, int i3) {
        return i3 + C32561ga.A00(i2) + i2;
    }

    public static int A06(int i2, int i3, int i4) {
        return Math.min(i4, i2 - i3);
    }

    public static int A07(String str) {
        return str.hashCode() * 31;
    }

    public static int A08(String str, int i2) {
        return i2 + str.hashCode();
    }

    public static int A09(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    public static int A0A(List list) {
        int size = list.size();
        int i2 = size << 1;
        if (size == 0) {
            return 10;
        }
        return i2;
    }

    public static int A0B(byte[] bArr, int i2) {
        return i2 + Arrays.hashCode(bArr);
    }

    public static int A0C(byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) i2;
        return i3 + 1;
    }

    public static int A0D(byte[] bArr, int[] iArr, int i2, int i3) {
        int A01 = C31461eE.A01(bArr, i2);
        iArr[i3] = A01;
        return A01;
    }

    public static int A0E(int[] iArr, int i2, int i3, int i4) {
        return i4 + i3 + iArr[i2];
    }

    public static int A0F(int[] iArr, int i2, int i3, int i4, int i5) {
        iArr[i3] = i2;
        int i6 = i4 ^ i2;
        iArr[i5] = i6;
        return i6;
    }

    public static long A0G(long j2, long j3) {
        return AnonymousClass3C1.A05(j2, SearchActionVerificationClientService.MS_TO_NS, j3);
    }

    public static long A0H(byte[] bArr, int i2, int i3) {
        return (JavaCurve25519Provider.A00(bArr, i2) >>> i3) & 2097151;
    }

    public static long A0I(byte[] bArr, int i2, int i3) {
        return (JavaCurve25519Provider.A01(bArr, i2) >>> i3) & 2097151;
    }

    public static long A0J(int[] iArr, int i2) {
        return (long) (iArr[i2] & 1048575);
    }

    public static View A0K(LayoutInflater layoutInflater, ViewGroup viewGroup, int i2) {
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        C18450wi.A0B(inflate);
        return inflate;
    }

    public static View A0L(View view, int i2) {
        View findViewById = view.findViewById(i2);
        C18450wi.A0B(findViewById);
        return findViewById;
    }

    public static ViewGroup A0M(View view) {
        ViewGroup viewGroup = (ViewGroup) C004601z.A0E(view, R.id.shimmer_items);
        viewGroup.removeAllViews();
        return viewGroup;
    }

    public static C32471gR A0N() {
        return new C32471gR();
    }

    public static C89324by A0O(C89324by r2, Timeline timeline, int i2) {
        return timeline.A0A(r2, i2, 0);
    }

    public static zzet A0P(zzes zzes, Object obj) {
        return new zzet(obj, obj, zzes);
    }

    public static AnonymousClass5TK A0Q(Object obj) {
        return C88654as.A02.A00(obj.getClass());
    }

    public static LatLng A0R(Parcel parcel, int i2) {
        return (LatLng) C32281fy.A06(parcel, LatLng.CREATOR, i2);
    }

    public static C32461gQ A0S(String str) {
        return new C32461gQ(str);
    }

    public static AssertionError A0T(Object obj) {
        return new AssertionError(obj);
    }

    public static Double A0U() {
        return Double.valueOf(0.0d);
    }

    public static IllegalStateException A0V() {
        return new IllegalStateException();
    }

    public static Object A0W(Object obj, Constructor constructor, Object[] objArr, int i2) {
        objArr[i2] = obj;
        return constructor.newInstance(objArr);
    }

    public static String A0X(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        return readString;
    }

    public static String A0Y(CharSequence charSequence, int i2, int i3) {
        return charSequence.subSequence(i2, i3).toString();
    }

    public static String A0Z(Object obj) {
        return obj.toString().trim();
    }

    public static String A0a(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    public static String A0b(String str, Object[] objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Constructor A0c(Class cls, Object obj, Class[] clsArr, int i2) {
        clsArr[i2] = obj;
        return cls.getConstructor(clsArr);
    }

    public static InvalidAlgorithmParameterException A0d(String str) {
        return new InvalidAlgorithmParameterException(str);
    }

    public static Iterator A0e(AbstractMap abstractMap) {
        return abstractMap.keySet().iterator();
    }

    public static List A0f(Object obj, long j2) {
        return (List) C90904f2.A01(obj, j2);
    }

    public static List A0g(Object obj, long j2) {
        return (List) C90914f4.A03(obj, j2);
    }

    public static C32071fb A0h(C32411gJ r1) {
        return r1.A0C(1);
    }

    public static void A0i(int i2, byte[] bArr, int i3, int i4) {
        bArr[i4] = (byte) (i2 | i3);
    }

    public static void A0j(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    public static void A0k(Canvas canvas, Path path, C15220qW r3) {
        canvas.drawPath(path, (Paint) r3.getValue());
    }

    public static void A0l(Binder binder, Parcel parcel) {
        parcel.enforceInterface(binder.getInterfaceDescriptor());
    }

    public static void A0m(Handler handler, Object obj, int i2) {
        handler.post(new RunnableRunnableShape19S0100000_I1_2(obj, i2));
    }

    public static void A0n(C005302h r1, Object obj, Object obj2, int i2, int i3) {
        r1.setPositiveButton(i3, new IDxCListenerShape29S0200000_2_I1(obj, i2, obj2));
    }

    public static void A0o(IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1) {
        ((DialogFragment) iDxCListenerShape128S0100000_2_I1.A00).A1D();
    }

    public static void A0p(C32561ga r1, int i2, long j2) {
        r1.A08((i2 << 3) | 1);
        r1.A0C(j2);
    }

    public static void A0q(C32531gX r1, int i2, long j2) {
        r1.A06((i2 << 3) | 1);
        r1.A0B(j2);
    }

    public static void A0r(C14550pN r1, int i2, int i3) {
        r1.Afj(new Object[0], i2, i3);
    }

    public static void A0s(C32461gQ r0, C32461gQ r1) {
        r1.A03(r0.A01());
    }

    public static void A0t(QuickContactActivity quickContactActivity) {
        AnonymousClass2Aq r0 = quickContactActivity.A0e;
        r0.A00();
        r0.A03();
    }

    public static void A0u(C16320sq r1, Object obj, Object obj2, int i2) {
        r1.Acl(new RunnableRunnableShape14S0200000_I1_2(obj, i2, obj2));
    }

    public static void A0v(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
    }

    public static void A0w(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 1;
    }

    public static void A0x(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 2;
    }

    public static void A0y(Object obj) {
        ((Activity) obj).finish();
    }

    public static void A0z(Object obj) {
        ((DialogFragment) obj).A1C();
    }

    public static void A10(Object obj, int i2, int i3) {
        System.arraycopy(obj, i2, obj, i2 + 1, i3 - i2);
    }

    public static void A11(Object obj, Object obj2, Object[] objArr) {
        objArr[2] = obj;
        objArr[3] = obj2;
    }

    public static void A12(Object obj, Object obj2, Object[] objArr) {
        objArr[4] = obj;
        objArr[5] = obj2;
    }

    public static void A13(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(": ");
    }

    public static void A14(StringBuilder sb, AnonymousClass5T1 r2) {
        sb.append(r2.A9q());
    }

    public static void A15(byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) (i2 & MotionEventCompat.ACTION_MASK);
    }

    public static void A16(byte[] bArr, byte[] bArr2, int i2, int i3) {
        bArr2[i3] = bArr[i2];
    }

    public static void A17(int[] iArr, int i2) {
        iArr[i2] = iArr[i2] + 1;
    }

    public static boolean A18(int i2) {
        return i2 <= 0;
    }

    public static boolean A19(Parcel parcel, int i2, int i3, int i4, boolean z2) {
        if (i2 == i3) {
            return C32281fy.A0F(parcel, i4);
        }
        C32281fy.A0C(parcel, i4);
        return z2;
    }

    public static boolean A1A(C16740tZ r0, Object obj) {
        return obj.equals(r0.A11.A00);
    }

    public static boolean A1B(Object[] objArr) {
        objArr[0] = "text";
        return false;
    }

    public static boolean A1C(Object[] objArr) {
        objArr[0] = "type";
        return false;
    }

    public static byte[] A1D(Object obj, Map map) {
        return (byte[]) map.get(obj);
    }

    public static byte[] A1E(C32071fb r1) {
        return r1.Agm().A02("DER");
    }

    public static int[] A1F(int[] iArr, Object[] objArr, int i2) {
        iArr[0] = i2;
        objArr[24] = iArr;
        return new int[1];
    }

    public static int[] A1G(int[] iArr, Object[] objArr, int i2, int i3) {
        iArr[0] = i2;
        objArr[23] = iArr;
        return new int[i3];
    }

    public static int[] A1H(int[] iArr, Object[] objArr, int i2, int i3) {
        iArr[0] = i2;
        objArr[36] = iArr;
        return new int[i3];
    }
}
