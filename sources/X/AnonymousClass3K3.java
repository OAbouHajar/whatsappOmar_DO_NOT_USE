package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCreatorShape16S0000000_2_I1;
import com.facebook.redex.IDxNFunctionShape137S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.PhoneHyperLinkDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.base.Hilt_WaDialogFragment;
import com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import com.obwhatsapp.community.CommunityAdminDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractMap;
import java.util.Locale;
import kotlin.jvm.internal.IDxLambdaShape56S0000000_2_I1;

/* renamed from: X.3K3  reason: invalid class name */
public final class AnonymousClass3K3 {
    public static char A00(String str, StringBuilder sb) {
        sb.append(str);
        sb.append('\'');
        return '\'';
    }

    public static double A01(Object obj) {
        return ((Number) obj).doubleValue();
    }

    public static float A02(PointF pointF, PointF pointF2) {
        float f2 = pointF.x - pointF2.x;
        float f3 = pointF.y - pointF2.y;
        return (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
    }

    public static float A03(float[] fArr, int i2) {
        float f2 = fArr[i2];
        if (Float.isNaN(f2)) {
            return 0.0f;
        }
        return f2;
    }

    public static float A04(int[] iArr, float f2, int i2) {
        return Math.abs(f2 - ((float) iArr[i2]));
    }

    public static int A05() {
        return C14730pf.A00() ? R.string.str135d : R.string.str135e;
    }

    public static int A06() {
        return C14730pf.A00() ? R.string.str135f : R.string.str1360;
    }

    public static int A07(int i2) {
        return (527 + i2) * 31;
    }

    public static int A08(int i2) {
        if (i2 >= 0) {
            return C32531gX.A00(i2);
        }
        return 10;
    }

    public static int A09(int i2) {
        if (i2 >= 0) {
            return C32561ga.A00(i2);
        }
        return 10;
    }

    public static int A0A(int i2) {
        return C32561ga.A00(i2 << 3);
    }

    public static int A0B(int i2) {
        return C32531gX.A00(i2 << 3);
    }

    public static int A0C(int i2, int i3, int i4) {
        return Math.max(i4, Math.min(i2, i3));
    }

    public static int A0D(int i2, int i3, int i4) {
        int i5 = (i2 & 3) << 3;
        return ((255 & i4) << i5) | (i3 & ((MotionEventCompat.ACTION_MASK << i5) ^ -1));
    }

    public static int A0E(int i2, long j2) {
        return (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
    }

    public static int A0F(Resources resources, View view) {
        int A08 = resources.getDisplayMetrics().widthPixels - (C004601z.A08(view) + C004601z.A07(view));
        return (int) Math.floor((double) (((float) A08) / ((float) resources.getDimensionPixelSize(R.dimen.dimen0620))));
    }

    public static int A0G(Parcel parcel, int i2, int i3, int i4, int i5) {
        if (i2 == i3) {
            return C32281fy.A01(parcel, i4);
        }
        C32281fy.A0C(parcel, i4);
        return i5;
    }

    public static int A0H(Object obj) {
        return obj.hashCode() * 31;
    }

    public static int A0I(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static int A0J(byte[] bArr) {
        int length = bArr.length;
        return C32551gZ.A00(length) + 1 + length;
    }

    public static int A0K(byte[] bArr, int i2) {
        return (bArr[i2 + 1] & 255) | ((bArr[i2] & 255) << 8);
    }

    public static int A0L(byte[] bArr, int i2, int i3) {
        return i3 | ((bArr[i2] & 255) << 8);
    }

    public static int A0M(byte[] bArr, int i2, int i3) {
        return i3 | ((bArr[i2] & 255) << 16);
    }

    public static int A0N(byte[] bArr, int i2, int i3) {
        int i4 = i2 + 1;
        bArr[i2] = (byte) ((i3 >>> 6) | 960);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i3 & 63) | 128);
        return i5;
    }

    public static int A0O(byte[] bArr, byte[] bArr2, int i2, int i3) {
        bArr2[i2] = (byte) (i3 ^ bArr[i2]);
        return i2 + 1;
    }

    public static int A0P(C32071fb[] r0, int i2, int i3) {
        return i3 + r0[i2].Agm().A06().A03();
    }

    public static long A0Q(int i2, int i3) {
        return (((long) i3) & 4294967295L) | ((((long) i2) & 4294967295L) << 32);
    }

    public static long A0R(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static long A0S(long j2, long j3) {
        return (j2 * j3) / SearchActionVerificationClientService.MS_TO_NS;
    }

    public static long A0T(long j2, long j3) {
        return Math.max(0, Math.min(j2, j3));
    }

    public static Parcelable A0U(Parcel parcel, Class cls) {
        return parcel.readParcelable(cls.getClassLoader());
    }

    public static C003401n A0V(AnonymousClass01A r1) {
        return new C006602z(r1.A0D()).A01(CallRatingViewModel.class);
    }

    public static IDxCreatorShape16S0000000_2_I1 A0W(int i2) {
        return new IDxCreatorShape16S0000000_2_I1(i2);
    }

    public static IDxNFunctionShape137S0100000_2_I1 A0X(C16300so r1, int i2) {
        return new IDxNFunctionShape137S0100000_2_I1(r1, i2);
    }

    public static C32591gd A0Y(Object obj) {
        return C32581gc.A02.A00(obj.getClass());
    }

    public static C14950q3 A0Z(Object obj) {
        C14940q2 r1 = new C14940q2();
        r1.A03(obj, 0);
        return r1.A01();
    }

    public static C19980zJ A0a(C16150sX r0) {
        return (C19980zJ) r0.A0P.get();
    }

    public static C17060uT A0b(Hilt_WaDialogFragment hilt_WaDialogFragment) {
        return (C17060uT) hilt_WaDialogFragment.generatedComponent();
    }

    public static C32241fu A0c(AnonymousClass01A r1) {
        return new C32241fu(r1.A0C());
    }

    public static AnonymousClass00F A0d() {
        return new AnonymousClass00F(1, 1, 1);
    }

    public static IOException A0e(String str) {
        return new IOException(str);
    }

    public static IllegalArgumentException A0f() {
        return new IllegalArgumentException();
    }

    public static Integer A0g(Object obj, AbstractMap abstractMap, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        abstractMap.put(obj, valueOf);
        return valueOf;
    }

    public static Long A0h(Cursor cursor, int i2) {
        return Long.valueOf(cursor.getLong(i2));
    }

    public static Object A0i(Class cls, String str) {
        return cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static SecurityException A0j(Object obj, Object obj2, Locale locale, Object[] objArr) {
        objArr[2] = obj;
        objArr[3] = obj2;
        return new SecurityException(String.format(locale, "java uri \"%s\" not equal to android uri \"%s\". Debug info: %s. Original uri: %s", objArr));
    }

    public static String A0k(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("extra_referral_screen");
    }

    public static String A0l(Parcel parcel, String str, int i2, int i3, int i4) {
        if (i2 == i3) {
            return C32281fy.A08(parcel, i4);
        }
        C32281fy.A0C(parcel, i4);
        return str;
    }

    public static String A0m(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return C32381gG.zzd(abstractMap, 0);
    }

    public static String A0n(String str) {
        return String.valueOf(str.substring(0, 1).toLowerCase());
    }

    public static String A0o(String str, String str2, int i2) {
        return i2 != 0 ? str.concat(str2) : new String(str);
    }

    public static String A0p(StringBuilder sb, char c2) {
        sb.append(c2);
        return sb.toString();
    }

    public static String A0q(Throwable th) {
        return String.valueOf(th.getMessage());
    }

    public static Throwable A0r(Throwable th) {
        return th.getCause() != null ? th.getCause() : th;
    }

    public static ByteBuffer A0s(int i2) {
        return ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
    }

    public static C15220qW A0t(int i2) {
        return C32521gW.A00(new IDxLambdaShape56S0000000_2_I1(i2));
    }

    public static C32071fb A0u(C32411gJ r1) {
        return r1.A0C(0);
    }

    public static C32391gH A0v() {
        return new C32391gH(2);
    }

    public static C32041fY A0w(String str) {
        return new C32041fY(str);
    }

    public static C32401gI A0x(C32071fb r0, C32391gH r1) {
        r1.A02(r0);
        return new C32401gI(r1);
    }

    public static void A0y(long j2, byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) ((int) (j2 >> i2));
    }

    public static void A0z(Activity activity, AnonymousClass01Y r2, C16010sH r3) {
        Jid A08 = r3.A08(UserJid.class);
        AnonymousClass00B.A06(A08);
        r2.A0K(activity, (UserJid) A08);
    }

    public static void A10(Rect rect, AnonymousClass030 r5) {
        rect.set(r5.A04(), r5.A06(), r5.A05(), r5.A03());
    }

    public static void A11(Bundle bundle, C14550pN r3, C82644Dp r4) {
        CommunityAdminDialogFragment communityAdminDialogFragment = new CommunityAdminDialogFragment();
        communityAdminDialogFragment.A0T(bundle);
        AnonymousClass00B.A06(r4);
        communityAdminDialogFragment.A01 = r4;
        r3.Afb(communityAdminDialogFragment, (String) null);
    }

    public static void A12(Parcel parcel, String str, int i2, int i3) {
        C32251fv.A0A(parcel, str, i2, false);
        C32251fv.A05(parcel, i3);
    }

    public static void A13(Parcel parcel, int[] iArr, int i2) {
        if (iArr != null) {
            int A01 = C32251fv.A01(parcel, i2);
            parcel.writeIntArray(iArr);
            C32251fv.A05(parcel, A01);
        }
    }

    public static void A14(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public static void A15(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static void A16(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public static void A17(TextView textView, AnonymousClass01A r2, int i2) {
        textView.setText(r2.A0I(i2));
    }

    public static void A18(AnonymousClass031 r2, CharSequence charSequence) {
        r2.A09(new AnonymousClass032(16, charSequence));
    }

    public static void A19(C32471gR r1, C32481gS r2) {
        r2.A9D(new C32491gT(r1));
    }

    public static void A1A(C32561ga r1, int i2) {
        r1.A08((i2 << 3) | 2);
    }

    public static void A1B(C32561ga r1, int i2, int i3) {
        r1.A08((i2 << 3) | 5);
        r1.A09(i3);
    }

    public static void A1C(C32531gX r1, int i2, int i3) {
        r1.A06((i2 << 3) | 5);
        r1.A07(i3);
    }

    public static void A1D(C32501gU r1, int i2) {
        if (i2 != 0) {
            r1.A36();
            return;
        }
        r1.finish();
        r1.A05.A09(R.string.str08cd, 1);
    }

    public static void A1E(C14870pt r1, Object obj, int i2) {
        r1.A0K(new RunnableRunnableShape18S0100000_I1_1(obj, i2));
    }

    public static void A1F(PhoneHyperLinkDialogFragment phoneHyperLinkDialogFragment, AnonymousClass1MY r3, int i2) {
        r3.A00(Boolean.valueOf(phoneHyperLinkDialogFragment.A0C), Boolean.valueOf(phoneHyperLinkDialogFragment.A0E), i2);
    }

    public static void A1G(C28371Vv r1) {
        C28371Vv.A06(r1, "iq");
    }

    public static void A1H(AnonymousClass1WA r1, Object obj, Object obj2, int i2) {
        r1.execute(new RunnableRunnableShape13S0200000_I1_1(obj, i2, obj2));
    }

    public static void A1I(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[25] = obj;
        objArr[26] = obj2;
        objArr[27] = obj3;
    }

    public static void A1J(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[32] = obj;
        objArr[33] = obj2;
        objArr[34] = obj3;
    }

    public static void A1K(Object obj, Object obj2, Object[] objArr) {
        objArr[8] = obj;
        objArr[9] = obj2;
    }

    public static void A1L(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static void A1M(String str, StringBuilder sb, int i2, int i3) {
        sb.append(str.substring(i2, i3));
    }

    public static void A1N(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", ");
    }

    public static void A1O(ByteBuffer byteBuffer, int i2) {
        byteBuffer.put(C32311g7.A06(i2));
    }

    public static boolean A1P(int i2, int i3) {
        return i2 >= i3;
    }

    public static boolean A1Q(int i2, int i3) {
        return i2 < i3;
    }

    public static boolean A1R(Parcel parcel, String str) {
        C32251fv.A0A(parcel, str, 2, false);
        return false;
    }

    public static boolean A1S(Appendable appendable, boolean z2) {
        if (!z2) {
            return true;
        }
        appendable.append(',');
        return z2;
    }

    public static boolean A1T(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A1U(int[] r4, java.lang.Object[] r5) {
        /*
            r0 = 128512(0x1f600, float:1.80084E-40)
            r3 = 0
            r2 = 1
            r4[r3] = r0
            r5[r3] = r4
            int[] r1 = new int[r2]
            r0 = 128515(0x1f603, float:1.80088E-40)
            r1[r3] = r0
            r5[r2] = r1
            int[] r1 = new int[r2]
            r0 = 128516(0x1f604, float:1.80089E-40)
            r1[r3] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3K3.A1U(int[], java.lang.Object[]):int[]");
    }

    public static int[] A1V(int[] iArr, Object[] objArr, int i2) {
        iArr[0] = i2;
        objArr[25] = iArr;
        return new int[1];
    }

    public static int[] A1W(int[] iArr, Object[] objArr, int i2) {
        iArr[0] = i2;
        objArr[26] = iArr;
        return new int[1];
    }

    public static int[] A1X(int[] iArr, Object[] objArr, int i2, int i3) {
        iArr[0] = i2;
        objArr[22] = iArr;
        return new int[i3];
    }

    public static int[] A1Y(int[] iArr, Object[] objArr, int i2, int i3) {
        iArr[0] = i2;
        objArr[27] = iArr;
        return new int[i3];
    }

    public static Class[] A1Z(Object obj, int i2) {
        Class[] clsArr = new Class[i2];
        clsArr[0] = Object.class;
        clsArr[1] = obj;
        return clsArr;
    }

    public static Object[] A1a(Object obj, Object obj2) {
        Object[] objArr = new Object[4];
        objArr[0] = obj.toString();
        objArr[1] = obj2.toString();
        return objArr;
    }

    public static String[] A1b(C28371Vv r0, String str) {
        C28371Vv.A06(r0, str);
        return new String[1];
    }
}
