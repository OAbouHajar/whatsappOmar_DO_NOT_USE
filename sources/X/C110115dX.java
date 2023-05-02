package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape135S0100000_3_I1;
import com.facebook.redex.IDxObserverShape118S0100000_3_I1;
import com.facebook.redex.IDxSListenerShape50S0200000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.IDxCListenerShape107S0100000_3_I1;
import java.math.BigDecimal;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.5dX  reason: invalid class name and case insensitive filesystem */
public final class C110115dX {
    public static int A00(C14550pN r1, List list) {
        if (r1.A0C.A0C(2443)) {
            Collections.sort(list);
        }
        return 2443;
    }

    public static int A01(Enum enumR, int[] iArr) {
        return iArr[enumR.ordinal()];
    }

    public static int A02(String str, int i2, int i3) {
        return Integer.parseInt(str.substring(i2, i3).trim());
    }

    public static View A03(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, int i2) {
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        inflate.setClickable(false);
        inflate.setBackgroundColor(AnonymousClass00T.A00(context, R.color.color065f));
        return inflate;
    }

    public static ImageView A04(C000900k r0, int i2) {
        return (ImageView) r0.findViewById(i2);
    }

    public static LinearLayout A05(View view, int i2) {
        return (LinearLayout) C004601z.A0E(view, i2);
    }

    public static IDxCListenerShape135S0100000_3_I1 A06(Object obj, int i2) {
        return new IDxCListenerShape135S0100000_3_I1(obj, i2);
    }

    public static IDxObserverShape118S0100000_3_I1 A07(Object obj, int i2) {
        return new IDxObserverShape118S0100000_3_I1(obj, i2);
    }

    public static AnonymousClass2Rf A08(C14590pR r0) {
        return (AnonymousClass2Rf) r0.generatedComponent();
    }

    public static FingerprintBottomSheet A09() {
        return FingerprintBottomSheet.A01(R.string.str0f3f, R.string.str0394, R.string.str1974, R.layout.layout042e);
    }

    public static C111595h2 A0A(C000900k r1, AnonymousClass02C r2, AnonymousClass2ZU r3, Map map) {
        return r3.A00(r1, r2, new AnonymousClass4DE(map));
    }

    public static C28401Vy A0B(Object obj, String str) {
        return C28401Vy.A00(str, ((C35491m1) obj).A01);
    }

    public static C28401Vy A0C(Object obj, BigDecimal bigDecimal) {
        return new C28401Vy(bigDecimal, ((C35491m1) obj).A01);
    }

    public static AnonymousClass173 A0D(C16150sX r0) {
        return (AnonymousClass173) r0.AHL.get();
    }

    public static C30671cl A0E(AnonymousClass173 r1, C39901tF r2, C28371Vv r3) {
        r2.A01(r1, r3, 0);
        return r2.A05();
    }

    public static C30671cl A0F(Iterator it) {
        return (C30671cl) it.next();
    }

    public static C30671cl A0G(List list, int i2) {
        return (C30671cl) list.get(i2);
    }

    public static AnonymousClass160 A0H(C18290wS r0) {
        r0.A06();
        return r0.A09;
    }

    public static UserJid A0I(C16010sH r1) {
        return (UserJid) r1.A08(UserJid.class);
    }

    public static C1204661t A0J(C16150sX r0) {
        return (C1204661t) r0.AHV.get();
    }

    public static C111855hW A0K(AnonymousClass1Vt r0) {
        AnonymousClass1W2 r02 = r0.A0A;
        AnonymousClass00B.A06(r02);
        return (C111855hW) r02;
    }

    public static C42711yJ A0L(C18290wS r0) {
        return r0.A03().AEd();
    }

    public static C18340wX A0M(C16150sX r0) {
        return (C18340wX) r0.AHd.get();
    }

    public static AnonymousClass2HJ A0N() {
        return new AnonymousClass2HJ();
    }

    public static C18300wT A0O(C16150sX r0) {
        return (C18300wT) r0.AHn.get();
    }

    public static C18310wU A0P(C16150sX r0) {
        return (C18310wU) r0.AHz.get();
    }

    public static C18290wS A0Q(C16150sX r0) {
        return (C18290wS) r0.AIB.get();
    }

    public static AnonymousClass50C A0R(C119285wq r1, String str, String str2) {
        return r1.A02(str, str2, true);
    }

    public static AnonymousClass1Vo A0S(String str) {
        return AnonymousClass1Vo.A00(str, "onboarding", "IN");
    }

    public static IndiaUpiPinPrimerDialogFragment A0T(Parcelable parcelable, AnonymousClass699 r3) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_bank_account", parcelable);
        IndiaUpiPinPrimerDialogFragment indiaUpiPinPrimerDialogFragment = new IndiaUpiPinPrimerDialogFragment();
        indiaUpiPinPrimerDialogFragment.A0T(bundle);
        indiaUpiPinPrimerDialogFragment.A05 = r3;
        return indiaUpiPinPrimerDialogFragment;
    }

    public static AnonymousClass3Q5 A0U(C001500q r2) {
        return (AnonymousClass3Q5) new C006602z(r2).A01(AnonymousClass3Q5.class);
    }

    public static C18280wR A0V(C16150sX r0) {
        return (C18280wR) r0.AHR.get();
    }

    public static C35251lc A0W(C16840tj r0) {
        C16880tn AAt = r0.AAt();
        AnonymousClass00B.A06(AAt);
        C35251lc r02 = AAt.A01;
        AnonymousClass00B.A06(r02);
        return r02;
    }

    public static C28371Vv A0X(C28371Vv r1) {
        return r1.A0J("account");
    }

    public static C20180zd A0Y(C16150sX r0) {
        return (C20180zd) r0.APJ.get();
    }

    public static RuntimeException A0Z(Throwable th) {
        return new RuntimeException(th);
    }

    public static String A0a(Activity activity) {
        return activity.getIntent().getStringExtra("referral_screen");
    }

    public static String A0b(Activity activity) {
        return activity.getIntent().getStringExtra("extra_referral_screen");
    }

    public static String A0c(Context context) {
        return yo.getYoAndroidID(Settings.Secure.getString(context.getContentResolver(), "android_id"));
    }

    public static String A0d(C16040sK r0) {
        r0.A0B();
        C28881Zb r02 = r0.A01;
        AnonymousClass00B.A06(r02);
        return C24561Gk.A01(r02);
    }

    public static String A0e(C35301lh r0) {
        Object obj = r0.A00;
        AnonymousClass00B.A06(obj);
        return (String) obj;
    }

    public static String A0f(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj);
        return jSONObject.toString();
    }

    public static String A0g(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    public static PublicKey A0h(byte[] bArr) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static Iterator A0i(AbstractMap abstractMap) {
        return abstractMap.values().iterator();
    }

    public static Map A0j(List list, int i2) {
        return (Map) list.get(i2);
    }

    public static Matcher A0k(CharSequence charSequence, String str) {
        return Pattern.compile(str).matcher(charSequence);
    }

    public static C110495eG A0l(AbstractList abstractList, int i2) {
        return (C110495eG) abstractList.get(i2);
    }

    public static void A0m(Context context, C005302h r1, int i2) {
        r1.A06(context.getString(i2));
    }

    public static void A0n(Intent intent, Intent intent2, String str) {
        intent2.putExtra(str, intent.getStringExtra(str));
    }

    public static void A0o(Intent intent, Parcelable parcelable) {
        intent.putExtra("extra_bank_account", parcelable);
    }

    public static void A0p(Intent intent, C14550pN r2, String str, String str2) {
        intent.putExtra(str, str2);
        r2.A2X(intent, true);
    }

    public static void A0q(Intent intent, AnonymousClass1Vt r4, C15830rv r5) {
        AnonymousClass1yL.A00(intent, new C28381Vw(r5, r4.A0L, r4.A0Q));
        intent.putExtra("extra_transaction_id", r4.A0K);
    }

    public static void A0r(Intent intent, String str) {
        intent.putExtra("referral_screen", str);
    }

    public static void A0s(View view, Object obj, int i2) {
        view.setOnClickListener(new IDxCListenerShape107S0100000_3_I1(obj, i2));
    }

    public static void A0t(TextView textView, AnonymousClass01A r2, Object obj, Object[] objArr, int i2) {
        objArr[0] = obj;
        textView.setText(r2.A0K(i2, objArr));
    }

    public static void A0u(C005402i r1, CharSequence charSequence) {
        r1.A0J(charSequence);
        r1.A0N(true);
    }

    public static void A0v(AnonymousClass01A r0) {
        C001000l A0C = r0.A0C();
        if (A0C != null) {
            A0C.finish();
        }
    }

    public static void A0w(C001300o r1, AnonymousClass028 r2, Object obj, int i2) {
        r2.A0A(r1, new IDxObserverShape118S0100000_3_I1(obj, i2));
    }

    public static void A0x(AnonymousClass028 r1, Object obj, Object obj2) {
        r1.A09(new AnonymousClass01Q(obj, obj2));
    }

    public static void A0y(C29671b0 r2, Object obj) {
        C14980q6.A00(AnonymousClass1K6.A02(obj), C14950q3.A01, r2.A9V());
    }

    public static void A0z(C42511xv r1, C30671cl r2, Object obj, int i2) {
        r1.A02(new IDxSListenerShape50S0200000_3_I1(r2, i2, obj), r2);
    }

    public static void A10(C53842gO r1, int i2) {
        r1.A08 = Integer.valueOf(i2);
    }

    public static void A11(C35301lh r0, String str, JSONObject jSONObject) {
        jSONObject.put(str, r0.A00);
    }

    public static void A12(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j2) {
        pinBottomSheetDialogFragment.A1Q(j2 * 1000, true);
    }

    public static void A13(C32461gQ r1, String str, long j2) {
        r1.A02(new C35081lL(str, j2));
    }

    public static void A14(String str, String str2, Object[] objArr) {
        objArr[0] = new C35081lL(str, str2);
    }

    public static void A15(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        sb.append(str);
    }

    public static void A16(FormItemEditText formItemEditText, int[] iArr, int[][] iArr2) {
        formItemEditText.A07 = new ColorStateList(iArr2, iArr);
        formItemEditText.A0N = new float[6];
        formItemEditText.A0L = new float[6];
    }

    public static boolean A17(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(str, false);
    }

    public static boolean A18(C14720pe r1) {
        return r1.A0C(842);
    }

    public static boolean A19(Object obj, Object obj2) {
        C18450wi.A0H(obj, 0);
        C18450wi.A0H(obj2, 1);
        return true;
    }

    public static boolean A1A(String str, long j2, boolean z2) {
        return C32271fx.A0D(str, j2, 100, z2);
    }

    public static boolean A1B(String str, long j2, boolean z2) {
        return C32271fx.A0D(str, j2, 10000, z2);
    }

    public static boolean A1C(String str, boolean z2) {
        return C32271fx.A0D(str, 1, 200, z2);
    }

    public static boolean A1D(String str, boolean z2) {
        return C32271fx.A0D(str, 0, 9007199254740991L, z2);
    }

    public static boolean A1E(List list, int i2) {
        return list.contains(Integer.valueOf(i2));
    }

    public static C35081lL[] A1F(AbstractCollection abstractCollection, int i2) {
        return (C35081lL[]) abstractCollection.toArray(new C35081lL[i2]);
    }
}
