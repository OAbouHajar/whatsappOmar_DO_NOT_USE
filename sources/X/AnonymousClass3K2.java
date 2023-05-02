package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxAListenerShape121S0100000_2_I1;
import com.facebook.redex.IDxNFunctionShape137S0100000_2_I1;
import com.facebook.redex.IDxSCallbackShape221S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;
import com.obwhatsapp.backup.encryptedbackup.PasswordInputFragment;
import com.obwhatsapp.base.Hilt_WaDialogFragment;
import com.obwhatsapp.base.WaDialogFragment;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.contentprovider.MediaProvider;
import com.obwhatsapp.conversation.conversationrow.SecurityNotificationDialogFragment;
import com.obwhatsapp.dialogs.FAQLearnMoreDialogFragment;
import com.obwhatsapp.settings.SettingsJidNotificationFragment;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.json.JSONObject;

/* renamed from: X.3K2  reason: invalid class name */
public final class AnonymousClass3K2 {
    public static double A00(C32451gN r6, double d2, double d3) {
        return ((r6.A00().A00 - d2) * (r6.A00().A00 - d2)) + ((r6.A00().A01 - d3) * (r6.A00().A01 - d3));
    }

    public static float A01(Parcel parcel, int i2) {
        C32281fy.A0E(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static float A02(AnonymousClass1VH r0) {
        return ((Number) r0.get()).floatValue();
    }

    public static int A03() {
        return Arrays.hashCode(new Object[0]);
    }

    public static int A04(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int A05(Parcel parcel, int i2) {
        int readInt = parcel.readInt();
        if (((char) readInt) == 2) {
            return C32281fy.A01(parcel, readInt);
        }
        C32281fy.A0C(parcel, readInt);
        return i2;
    }

    public static int A06(Object obj, int i2) {
        return i2 + obj.hashCode();
    }

    public static int A07(Object obj, Object[] objArr) {
        objArr[0] = obj;
        return Arrays.hashCode(objArr);
    }

    public static int A08(Object obj, Object[] objArr) {
        objArr[1] = obj;
        return Arrays.hashCode(objArr);
    }

    public static int A09(String str, int i2) {
        return (i2 + str.hashCode()) * 31;
    }

    public static int A0A(CertPath certPath, int i2, int i3) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i2);
        return (x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN()) || i3 == 0) ? i3 : i3 - 1;
    }

    public static int A0B(byte[] bArr, char c2, char c3, int i2) {
        int codePoint = Character.toCodePoint(c2, c3);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((codePoint >>> 18) | 240);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (((codePoint >>> 12) & 63) | 128);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (((codePoint >>> 6) & 63) | 128);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((codePoint & 63) | 128);
        return i6;
    }

    public static int A0C(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public static int A0D(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int A0E(byte[] bArr, int i2, int i3) {
        int i4 = i2 + 1;
        bArr[i2] = (byte) ((i3 >>> 12) | 480);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (((i3 >>> 6) & 63) | 128);
        return i5;
    }

    public static int A0F(byte[] bArr, int i2, int i3) {
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >>> 24);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >>> 16);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i3 >>> 8);
        return i6;
    }

    public static int A0G(int[][] iArr, int i2, int i3, int i4) {
        int[] iArr2 = iArr[i2];
        int i5 = iArr2[i3];
        int i6 = ((i5 << i4) | (i5 >>> 8)) ^ i5;
        int i7 = i5 ^ ((((-2139062144 & i6) >>> 7) * 27) ^ ((2139062143 & i6) << 1));
        int i8 = i7 & -1061109568;
        int i9 = i8 ^ (i8 >>> 1);
        int i10 = i6 ^ ((i9 >>> 5) ^ (((1061109567 & i7) << 2) ^ (i9 >>> 2)));
        iArr2[i3] = i7 ^ (i10 ^ ((i10 << (-16)) | (i10 >>> 16)));
        return i3 + 1;
    }

    public static long A0H(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static long A0I(List list, int i2) {
        long longValue = ((Number) list.get(i2)).longValue();
        return (longValue >> 63) ^ (longValue << 1);
    }

    public static long A0J(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 2]) << 16) & 16711680) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) << 8) & 65280);
    }

    public static long A0K(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static long A0L(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 3]) << 24) & 4278190080L) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) << 8) & 65280) | ((((long) bArr[i2 + 2]) << 16) & 16711680);
    }

    public static Uri A0M(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getRawAuthority()).encodedPath(uri.getRawPath()).encodedQuery(uri.getRawQuery()).encodedFragment(uri.getRawFragment()).build();
    }

    public static Parcelable A0N(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static C005702l A0O(DialogInterface.OnClickListener onClickListener, C005302h r2, int i2) {
        r2.setPositiveButton(i2, onClickListener);
        r2.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        return r2.create();
    }

    public static C16150sX A0P(RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment, Object obj) {
        C16150sX r1 = ((C17050uS) obj).A0b;
        roundedBottomSheetDialogFragment.A00 = (C17070uU) r1.ABg.get();
        roundedBottomSheetDialogFragment.A01 = (C17080uV) r1.APK.get();
        return r1;
    }

    public static C16150sX A0Q(Hilt_WaDialogFragment hilt_WaDialogFragment) {
        return ((C17050uS) ((C17060uT) hilt_WaDialogFragment.generatedComponent())).A0b;
    }

    public static C32241fu A0R(AnonymousClass01A r1) {
        return new C32241fu(r1.A02());
    }

    public static C29351aU A0S(String str, byte b2) {
        return new C29351aU(new SSLException(str), b2);
    }

    public static C29351aU A0T(Throwable th) {
        return new C29351aU(new SSLException(th), (byte) 80);
    }

    public static C16220sf A0U(Preference preference, SettingsJidNotificationFragment settingsJidNotificationFragment, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        preference.A0I(listPreference.A03[listPreference.A0S((String) obj)].toString());
        return settingsJidNotificationFragment.A05;
    }

    public static ArrayIndexOutOfBoundsException A0V(char c2, long j2) {
        StringBuilder sb = new StringBuilder(46);
        sb.append("Failed writing ");
        sb.append(c2);
        sb.append(" at index ");
        sb.append(j2);
        return new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public static IndexOutOfBoundsException A0W(int i2, int i3) {
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return new IndexOutOfBoundsException(sb.toString());
    }

    public static Long A0X() {
        return -9007199254740991L;
    }

    public static Long A0Y() {
        return 9007199254740991L;
    }

    public static Long A0Z() {
        return 0L;
    }

    public static Long A0a() {
        return 1L;
    }

    public static Object A0b(C16300so r4, C28371Vv r5, int i2) {
        return C32271fx.A03(r5, new IDxNFunctionShape137S0100000_2_I1(r4, i2), new String[]{"error"});
    }

    public static Object A0c(C16300so r2, C28371Vv r3, int i2) {
        return C32271fx.A03(r3, new IDxNFunctionShape137S0100000_2_I1(r2, i2), new String[0]);
    }

    public static Object A0d(C16300so r2, C28371Vv r3, int i2, int i3) {
        return C32271fx.A03(r3, new IDxNFunctionShape137S0100000_2_I1(r2, i2), new String[i3]);
    }

    public static Object A0e(C16300so r1, C28371Vv r2, String[] strArr, int i2) {
        return C32271fx.A02(r2, new IDxNFunctionShape137S0100000_2_I1(r1, i2), strArr);
    }

    public static Object A0f(String str) {
        return Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static String A0g(int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i2) + 4294967296L);
        return sb.toString();
    }

    public static String A0h(Uri uri, URI uri2) {
        return String.format(Locale.US, "javaUri scheme: \"%s\". androidUri scheme: \"%s\".", new Object[]{uri2.getScheme(), uri.getScheme()});
    }

    public static String A0i(Parcel parcel, Object obj) {
        C18450wi.A0F(obj);
        C18450wi.A0B(obj);
        String readString = parcel.readString();
        C18450wi.A0F(readString);
        C18450wi.A0B(readString);
        return readString;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0j(X.C28371Vv r10, boolean r11) {
        /*
            r0 = 1
            r2 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.String[] r8 = new java.lang.String[r0]
            java.lang.String r0 = "parameters"
            r9 = r11
            r8[r11] = r0
            r0 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r3 = r10
            r7 = r2
            java.lang.Object r0 = X.C32271fx.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3K2.A0j(X.1Vv, boolean):java.lang.String");
    }

    public static String A0k(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static String A0l(Object obj, StringBuilder sb) {
        sb.append(obj.getClass().getSimpleName());
        sb.append('@');
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static String A0m(StringBuilder sb) {
        sb.append(']');
        return sb.toString();
    }

    public static String A0n(JSONObject jSONObject) {
        C18450wi.A0H(jSONObject, 0);
        String string = jSONObject.getString("variable");
        C18450wi.A0B(string);
        return string;
    }

    public static StringBuilder A0o(Object obj, String str) {
        String name = obj.getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 62 + str.length());
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        return sb;
    }

    public static StringBuilder A0p(Object obj, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + str2.length() + String.valueOf(obj).length());
        sb.append("Field ");
        sb.append(str);
        sb.append(" for ");
        sb.append(str2);
        sb.append(" not found. Known fields are ");
        return sb;
    }

    public static ArrayList A0q(Object obj, Object[] objArr, int i2) {
        objArr[i2] = obj;
        return new ArrayList(Arrays.asList(objArr));
    }

    public static HashSet A0r(Collection collection) {
        HashSet hashSet = new HashSet(collection);
        hashSet.remove(C32211fp.A08);
        hashSet.remove(C32211fp.A03);
        hashSet.remove(C32211fp.A0B);
        hashSet.remove(C32211fp.A06);
        hashSet.remove(C32211fp.A07);
        hashSet.remove(C32211fp.A05);
        hashSet.remove(C32211fp.A0A);
        hashSet.remove(C32211fp.A02);
        hashSet.remove(C32211fp.A0C);
        hashSet.remove(C32211fp.A09);
        return hashSet;
    }

    public static Set A0s(Object obj, Object[] objArr, int i2) {
        objArr[i2] = obj;
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public static C32041fY A0t(String str) {
        return new C32041fY(str).A0A();
    }

    public static C32041fY A0u(String str, C32041fY r2) {
        return new C32041fY(str, r2);
    }

    public static void A0v(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/zip");
        intent.putExtra("android.intent.extra.STREAM", MediaProvider.A03("business_activity_report", str));
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.str0eea));
        intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.str0eea)));
    }

    public static void A0w(IBinder iBinder, Parcel parcel, Parcel parcel2, int i2) {
        iBinder.transact(i2, parcel, parcel2, 0);
        parcel2.readException();
    }

    public static void A0x(Parcel parcel, Parcelable parcelable, int i2, int i3) {
        C32251fv.A09(parcel, parcelable, 3, i2, false);
        C32251fv.A05(parcel, i3);
    }

    public static void A0y(View view) {
        view.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public static void A0z(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void A10(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
    }

    public static void A11(View view, AnonymousClass013 r5, long j2) {
        C32291fz.A01(view, r5.A0J(new Object[]{Long.valueOf(j2)}, R.plurals.plurals011c, j2), -1).A03();
    }

    public static void A12(IDxAListenerShape120S0100000_2_I0 iDxAListenerShape120S0100000_2_I0) {
        ((C14590pR) iDxAListenerShape120S0100000_2_I0.A00).A1q();
    }

    public static void A13(IDxAListenerShape121S0100000_2_I1 iDxAListenerShape121S0100000_2_I1) {
        ((C14590pR) iDxAListenerShape121S0100000_2_I1.A00).A1q();
    }

    public static void A14(IDxSCallbackShape221S0100000_2_I0 iDxSCallbackShape221S0100000_2_I0) {
        ((C14550pN) iDxSCallbackShape221S0100000_2_I0.A00).Afj(new Object[0], R.string.str00d4, R.string.str1211);
    }

    public static void A15(C15060qG r3, long j2) {
        r3.AdD(new C32361gC(j2, 0));
    }

    public static void A16(AnonymousClass556 r3, C32561ga r4, int i2) {
        r4.A08((i2 << 3) | 2);
        r4.A08(r3.A02());
        AnonymousClass3ZC r32 = (AnonymousClass3ZC) r3;
        r4.A05(r32.zzfp, r32.A03(), r32.A02());
    }

    public static void A17(C16150sX r1, PasswordInputFragment passwordInputFragment) {
        passwordInputFragment.A00 = (C17070uU) r1.ABg.get();
        passwordInputFragment.A01 = (C17080uV) r1.APK.get();
        passwordInputFragment.A09 = (AnonymousClass01V) r1.AOi.get();
        passwordInputFragment.A0A = (AnonymousClass013) r1.AR8.get();
    }

    public static void A18(C16150sX r1, WaDialogFragment waDialogFragment) {
        waDialogFragment.A01 = (C17070uU) r1.ABg.get();
        waDialogFragment.A03 = (C17080uV) r1.APK.get();
        waDialogFragment.A04 = (C14710pd) r1.A05.get();
        waDialogFragment.A02 = (AnonymousClass013) r1.AR8.get();
    }

    public static void A19(C16150sX r1, SecurityNotificationDialogFragment securityNotificationDialogFragment) {
        securityNotificationDialogFragment.A01 = (C16040sK) r1.ADr.get();
        securityNotificationDialogFragment.A05 = (C17250um) r1.A7e.get();
        securityNotificationDialogFragment.A00 = (C19980zJ) r1.A0P.get();
        securityNotificationDialogFragment.A02 = (C16000sG) r1.A4x.get();
        securityNotificationDialogFragment.A06 = (C17220uj) r1.A9x.get();
        securityNotificationDialogFragment.A03 = (C16080sP) r1.AQ9.get();
        securityNotificationDialogFragment.A04 = (C15860rz) r1.AQh.get();
    }

    public static void A1A(C16150sX r1, FAQLearnMoreDialogFragment fAQLearnMoreDialogFragment) {
        fAQLearnMoreDialogFragment.A01 = (C17250um) r1.A7e.get();
        fAQLearnMoreDialogFragment.A00 = (C19980zJ) r1.A0P.get();
        fAQLearnMoreDialogFragment.A02 = (C17220uj) r1.A9x.get();
    }

    public static void A1B(C14550pN r1, Boolean bool) {
        r1.A05.A05();
        if (bool.booleanValue()) {
            r1.setResult(-1);
        } else {
            r1.A05.A09(R.string.str0474, 1);
        }
    }

    public static void A1C(C28371Vv r7, String str) {
        C28371Vv.A06(r7, str);
        C32271fx.A01((C16300so) null, r7, String.class, -9007199254740991L, 9007199254740991L, "405", new String[]{"error"}, false);
    }

    public static void A1D(C28371Vv r7, String str) {
        C28371Vv.A06(r7, str);
        C32271fx.A01((C16300so) null, r7, String.class, -9007199254740991L, 9007199254740991L, "500", new String[]{"error"}, false);
    }

    public static void A1E(Appendable appendable, int i2) {
        appendable.append("\\u");
        appendable.append("0123456789ABCDEF".charAt((i2 >> 12) & 15));
        appendable.append("0123456789ABCDEF".charAt((i2 >> 8) & 15));
        appendable.append("0123456789ABCDEF".charAt((i2 >> 4) & 15));
        appendable.append("0123456789ABCDEF".charAt((i2 >> 0) & 15));
    }

    public static void A1F(Object obj) {
        CallsHistoryFragment callsHistoryFragment = (CallsHistoryFragment) obj;
        C32231fr.A00((C32231fr) callsHistoryFragment.A0B.getFilter());
        callsHistoryFragment.A0B.getFilter().filter(callsHistoryFragment.A0e);
    }

    public static void A1G(Object obj, Object obj2) {
        C32131fh r2 = (C32131fh) obj;
        if (r2.A0K.equals(obj2) && !r2.A01.A0I(r2.A0K)) {
            r2.A0F.A0M();
        }
    }

    public static void A1H(Object obj, Object obj2) {
        C18450wi.A0H(obj, 0);
        C18450wi.A0H(obj2, 1);
    }

    public static void A1I(Object obj, Object obj2) {
        C18450wi.A0H(obj, 3);
        C18450wi.A0H(obj2, 4);
    }

    public static void A1J(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[8] = obj;
        objArr[9] = obj2;
        objArr[10] = obj3;
        objArr[11] = obj4;
    }

    public static void A1K(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[38] = obj;
        objArr[39] = obj2;
        objArr[40] = obj3;
        objArr[41] = obj4;
    }

    public static void A1L(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[42] = obj;
        objArr[43] = obj2;
        objArr[44] = obj3;
        objArr[45] = obj4;
    }

    public static void A1M(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[46] = obj;
        objArr[47] = obj2;
        objArr[48] = obj3;
        objArr[49] = obj4;
    }

    public static void A1N(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[1] = obj;
        objArr[2] = obj2;
        objArr[3] = obj3;
    }

    public static void A1O(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, "SHA384WITHRSA");
        abstractMap.put(C32031fX.A2G, "SHA512WITHRSA");
        abstractMap.put(C32081fc.A0M, "GOST3411WITHGOST3410");
        abstractMap.put(C32081fc.A0L, "GOST3411WITHECGOST3410");
        abstractMap.put(C32091fd.A0H, "GOST3411-2012-256WITHECGOST3410-2012-256");
        abstractMap.put(C32091fd.A0I, "GOST3411-2012-512WITHECGOST3410-2012-512");
        abstractMap.put(C32101fe.A03, "SHA1WITHPLAIN-ECDSA");
        abstractMap.put(C32101fe.A04, "SHA224WITHPLAIN-ECDSA");
        abstractMap.put(C32101fe.A05, "SHA256WITHPLAIN-ECDSA");
        abstractMap.put(C32101fe.A06, "SHA384WITHPLAIN-ECDSA");
        abstractMap.put(C32101fe.A07, "SHA512WITHPLAIN-ECDSA");
        abstractMap.put(C32101fe.A02, "RIPEMD160WITHPLAIN-ECDSA");
        abstractMap.put(C32111ff.A0C, "SHA1WITHCVC-ECDSA");
        abstractMap.put(C32111ff.A0D, "SHA224WITHCVC-ECDSA");
        abstractMap.put(C32111ff.A0E, "SHA256WITHCVC-ECDSA");
        abstractMap.put(C32111ff.A0F, "SHA384WITHCVC-ECDSA");
    }

    public static void A1P(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, "SHA512WITHCVC-ECDSA");
        abstractMap.put(C32321g8.A00, "XMSS");
        abstractMap.put(C32321g8.A01, "XMSSMT");
        abstractMap.put(new C32041fY("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        abstractMap.put(new C32041fY("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        abstractMap.put(new C32041fY("1.2.840.10040.4.3"), "SHA1WITHDSA");
        abstractMap.put(C32331g9.A0X, "SHA1WITHECDSA");
        abstractMap.put(C32331g9.A0Z, "SHA224WITHECDSA");
        abstractMap.put(C32331g9.A0a, "SHA256WITHECDSA");
        abstractMap.put(C32331g9.A0b, "SHA384WITHECDSA");
        abstractMap.put(C32331g9.A0c, "SHA512WITHECDSA");
        abstractMap.put(C32341gA.A0B, "SHA1WITHRSA");
        abstractMap.put(C32341gA.A05, "SHA1WITHDSA");
        abstractMap.put(C32351gB.A01, "SHA224WITHDSA");
        abstractMap.put(C32351gB.A02, "SHA256WITHDSA");
    }

    public static void A1Q(Object obj, AbstractMap abstractMap, int i2) {
        abstractMap.put(Integer.valueOf(i2), obj);
    }

    public static void A1R(String str, String str2, String str3, StringBuffer stringBuffer) {
        stringBuffer.append("    ");
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str2);
    }

    public static void A1S(Method method, AbstractCollection abstractCollection, AbstractMap abstractMap, AbstractMap abstractMap2) {
        abstractMap.put(method.getName(), method);
        if (method.getParameterTypes().length == 0) {
            abstractMap2.put(method.getName(), method);
            if (method.getName().startsWith("get")) {
                abstractCollection.add(method.getName());
            }
        }
    }

    public static void A1T(byte[] bArr, int i2, long j2) {
        bArr[28] = (byte) i2;
        bArr[29] = (byte) ((int) (j2 >> 1));
        bArr[30] = (byte) ((int) (j2 >> 9));
        bArr[31] = (byte) ((int) (j2 >> 17));
    }

    public static void A1U(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        bArr2[i4] = (byte) (i3 ^ bArr[i2]);
    }

    public static void A1V(int[] iArr) {
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
    }

    public static void A1W(Object[] objArr, int i2) {
        objArr[2] = Integer.valueOf(i2);
    }

    public static boolean A1X(int i2, int i3) {
        return i2 != i3;
    }

    public static boolean A1Y(Class cls, Object obj) {
        Class<byte[]> cls2 = byte[].class;
        Class cls3 = Boolean.TYPE;
        cls.getMethod("peekLong", new Class[]{obj, cls3});
        cls.getMethod("pokeLong", new Class[]{obj, Long.TYPE, cls3});
        Class cls4 = Integer.TYPE;
        cls.getMethod("pokeInt", new Class[]{obj, cls4, cls3});
        cls.getMethod("peekInt", new Class[]{obj, cls3});
        cls.getMethod("pokeByte", new Class[]{obj, Byte.TYPE});
        cls.getMethod("peekByte", new Class[]{obj});
        cls.getMethod("pokeByteArray", new Class[]{obj, cls2, cls4, cls4});
        cls.getMethod("peekByteArray", new Class[]{obj, cls2, cls4, cls4});
        return true;
    }

    public static byte[] A1Z(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[C32311g7.A01(bArr)];
        byteBuffer.get(bArr2);
        return bArr2;
    }

    public static int[] A1a() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    public static Class[] A1b(Class cls, Object obj) {
        cls.getMethod("getByte", new Class[]{obj});
        cls.getMethod("putByte", new Class[]{obj, Byte.TYPE});
        cls.getMethod("getInt", new Class[]{obj});
        cls.getMethod("putInt", new Class[]{obj, Integer.TYPE});
        return new Class[]{obj};
    }
}
