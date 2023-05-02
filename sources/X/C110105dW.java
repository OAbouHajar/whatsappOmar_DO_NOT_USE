package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxAListenerShape123S0100000_3_I1;
import com.facebook.redex.IDxCEventShape181S0100000_3_I1;
import com.facebook.redex.IDxCListenerShape130S0100000_3_I1;
import com.facebook.redex.IDxCListenerShape135S0100000_3_I1;
import com.facebook.redex.IDxCListenerShape33S0200000_3_I1;
import com.facebook.redex.IDxObserverShape118S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;
import com.obwhatsapp.contact.picker.ContactPicker;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.dmsetting.ChangeDMSettingActivity;
import com.obwhatsapp.payments.ui.PaymentContactPickerFragment;
import com.obwhatsapp.payments.ui.PaymentSettingsFragment;
import com.obwhatsapp.payments.ui.ReTosFragment;
import com.obwhatsapp.payments.ui.invites.PaymentInviteFragment;
import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.obwhatsapp.payments.ui.widget.DebitCardInputText;
import com.obwhatsapp.wabloks.base.BkScreenFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.5dW  reason: invalid class name and case insensitive filesystem */
public final class C110105dW {
    public static float A00(View view, float f2) {
        return (float) ((int) (f2 * ((float) (view.getResources().getDisplayMetrics().densityDpi / 160))));
    }

    public static int A01(C14550pN r2, int i2) {
        r2.setContentView(i2);
        int A00 = AnonymousClass00T.A00(r2, R.color.color0226);
        r2.Aem((Toolbar) r2.findViewById(R.id.pay_service_toolbar));
        return A00;
    }

    public static int A02(DebitCardInputText debitCardInputText) {
        debitCardInputText.A02();
        debitCardInputText.A01 = 1.0f;
        debitCardInputText.A02 = 2.0f;
        debitCardInputText.A03 = 24.0f;
        debitCardInputText.A04 = 8.0f;
        debitCardInputText.A06 = 4;
        return 4;
    }

    public static long A03(C16440t3 r3) {
        return r3.A00() / 1000;
    }

    public static Intent A04(Context context, Class cls) {
        return new Intent(context, cls);
    }

    public static Intent A05(Intent intent, String str, String str2, String str3, String str4) {
        return intent.putExtra("fds_on_back", str).putExtra("fds_on_back_params", str2).putExtra("fds_button_style", str3).putExtra("fds_state_name", str4);
    }

    public static SharedPreferences.Editor A06(C18300wT r0) {
        return r0.A01().edit();
    }

    public static LayoutInflater A07(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static ImageView A08(Context context, View view, TextView textView, int i2) {
        textView.setText(context.getString(i2));
        ImageView imageView = (ImageView) C004601z.A0E(view, R.id.icon);
        imageView.setImageResource(R.drawable.ic_close);
        return imageView;
    }

    public static Toolbar A09(C000900k r1) {
        return (Toolbar) r1.findViewById(R.id.toolbar);
    }

    public static AnonymousClass5xA A0A(String str, String str2) {
        return new AnonymousClass5xA("", str, str2, -1);
    }

    public static C49132Rg A0B(C17050uS r1, C16150sX r2, ContactPickerFragment contactPickerFragment, AnonymousClass11G r4) {
        contactPickerFragment.A1V = r4;
        contactPickerFragment.A0V = (AnonymousClass1BJ) r2.AOm.get();
        contactPickerFragment.A0X = (C16760tb) r2.APV.get();
        contactPickerFragment.A26 = (AnonymousClass1QZ) r2.APn.get();
        contactPickerFragment.A21 = (C18160wF) r2.A5o.get();
        C49132Rg r12 = r1.A0Y;
        contactPickerFragment.A1e = r12.A0I();
        contactPickerFragment.A0t = (C17200uh) r2.A52.get();
        contactPickerFragment.A1n = (C17190ug) r2.AEu.get();
        contactPickerFragment.A1g = (C17240ul) r2.ABK.get();
        contactPickerFragment.A0L = (C19980zJ) r2.A0P.get();
        contactPickerFragment.A0m = (C16000sG) r2.A4x.get();
        contactPickerFragment.A1w = (C17220uj) r2.A9x.get();
        return r12;
    }

    public static C49132Rg A0C(C14590pR r0) {
        return (C49132Rg) ((AnonymousClass2Rf) r0.generatedComponent());
    }

    public static C16150sX A0D(C49132Rg r1, C16150sX r2, ContactPickerFragment contactPickerFragment, Object obj) {
        contactPickerFragment.A20 = new AnonymousClass4QT((C16490t9) obj);
        contactPickerFragment.A1B = (AnonymousClass1BZ) r2.A5N.get();
        contactPickerFragment.A22 = (C16510tB) r2.A8S.get();
        contactPickerFragment.A25 = (C23201Aw) r2.AK6.get();
        contactPickerFragment.A0c = (C17180uf) r2.A2n.get();
        contactPickerFragment.A1Z = (AnonymousClass1MX) r2.A6V.get();
        contactPickerFragment.A0d = (C17210ui) r2.A73.get();
        contactPickerFragment.A1R = (C16070sO) r2.ABY.get();
        return r1.A1s;
    }

    public static C447725m A0E(Context context, AnonymousClass013 r4, int i2) {
        C447725m r2 = new C447725m(AnonymousClass00T.A04(context, i2), r4);
        r2.setColorFilter(context.getResources().getColor(R.color.color0806), PorterDuff.Mode.SRC_ATOP);
        return r2;
    }

    public static C16290sm A0F(C16150sX r0) {
        return (C16290sm) r0.AQk.get();
    }

    public static AnonymousClass11G A0G(C16150sX r1, ContactPickerFragment contactPickerFragment, AnonymousClass01J r3) {
        contactPickerFragment.A1f = (C16490t9) r3.get();
        contactPickerFragment.A0U = (C17130ua) r1.AN9.get();
        contactPickerFragment.A1b = (C17250um) r1.A7e.get();
        contactPickerFragment.A0T = (C15900s5) r1.ALm.get();
        return (AnonymousClass11G) r1.ANN.get();
    }

    public static C35431lv A0H(AnonymousClass173 r4, C28371Vv r5) {
        C28411Vz A01 = r4.A01(r5.A0N("currency", (String) null));
        long A0C = r5.A0C("value");
        int A09 = r5.A09("offset");
        if (A09 <= 0) {
            A09 = 1;
        }
        return new C35431lv(A01, A09, A0C);
    }

    public static C35301lh A0I(Parcel parcel) {
        return (C35301lh) parcel.readParcelable(C35301lh.class.getClassLoader());
    }

    public static C35301lh A0J(C53862gQ r1, Class cls, Object obj, String str) {
        return new C35301lh(r1, cls, obj, str);
    }

    public static C35301lh A0K(Object obj) {
        return new C35301lh(new C53852gP(), String.class, obj, "upiHandle");
    }

    public static C53852gP A0L() {
        return new C53852gP();
    }

    public static AnonymousClass638 A0M(C14720pe r2, List list, int i2, int i3) {
        if (!r2.A0C(i2) || i3 == -1) {
            return null;
        }
        return (AnonymousClass638) list.get(i3);
    }

    public static AnonymousClass2St A0N() {
        return new AnonymousClass2St(new AnonymousClass2St[0]);
    }

    public static AnonymousClass61W A0O(C16150sX r0) {
        return (AnonymousClass61W) r0.ACC.get();
    }

    public static AnonymousClass1Vo A0P(String str) {
        return AnonymousClass1Vo.A00(str, "payment-settings", "IN");
    }

    public static AnonymousClass1Vo A0Q(String str, String str2) {
        return AnonymousClass1Vo.A00(str, str2, "COMMON");
    }

    public static PaymentIncentiveViewModel A0R(C001500q r2) {
        return (PaymentIncentiveViewModel) new C006602z(r2).A01(PaymentIncentiveViewModel.class);
    }

    public static C28371Vv A0S(C32461gQ r1, C32461gQ r2, AnonymousClass2BJ r3) {
        r2.A03(r1.A01());
        r2.A05(r3.A00, new ArrayList());
        r3.A00(r2, Collections.EMPTY_LIST);
        return r2.A01();
    }

    public static C28371Vv A0T(C32461gQ r1, C32461gQ r2, C51812cK r3) {
        r2.A03(r1.A01());
        r2.A05(r3.A00, new ArrayList());
        r3.A00(r2, Collections.EMPTY_LIST);
        return r2.A01();
    }

    public static C28371Vv A0U(C32461gQ r1, C32461gQ r2, C51812cK r3, List list) {
        r2.A03(r1.A01());
        r2.A05(r3.A00, new ArrayList());
        r3.A00(r2, list);
        return r2.A01();
    }

    public static C28371Vv A0V(AbstractCollection abstractCollection) {
        return new C28371Vv("account", (C35081lL[]) abstractCollection.toArray(new C35081lL[0]));
    }

    public static C28371Vv A0W(AbstractCollection abstractCollection, C28371Vv[] r3) {
        return new C28371Vv("account", (C35081lL[]) abstractCollection.toArray(new C35081lL[0]), r3);
    }

    public static C32461gQ A0X() {
        return new C32461gQ("iq");
    }

    public static C32461gQ A0Y(C32461gQ r3) {
        r3.A02(new C35081lL((Jid) C34791ks.A00, "to"));
        r3.A02(new C35081lL("xmlns", "w:pay"));
        return new C32461gQ("account");
    }

    public static C32461gQ A0Z(C32461gQ r3) {
        r3.A02(new C35081lL((Jid) C34791ks.A00, "to"));
        return new C32461gQ("account");
    }

    public static Object A0a(C49132Rg r0, C16150sX r1, ContactPickerFragment contactPickerFragment, AnonymousClass01J r3) {
        contactPickerFragment.A1j = C49132Rg.A01(r0);
        contactPickerFragment.A1S = (C16900tq) r1.AFT.get();
        contactPickerFragment.A0q = (C17030uP) r1.APp.get();
        contactPickerFragment.A1F = (C16260sj) r1.AQe.get();
        contactPickerFragment.A1G = (C15860rz) r1.AQh.get();
        contactPickerFragment.A1u = C16150sX.A17(r1);
        contactPickerFragment.A0i = (AnonymousClass1L4) r1.A4K.get();
        contactPickerFragment.A0j = C16150sX.A0K(r1);
        contactPickerFragment.A19 = (C220316j) r1.A5C.get();
        contactPickerFragment.A1C = (C15800rs) r1.A5c.get();
        contactPickerFragment.A1Q = (AnonymousClass151) r1.AAn.get();
        contactPickerFragment.A1v = (AnonymousClass1L1) r1.ANR.get();
        contactPickerFragment.A0e = C16150sX.A0I(r1);
        return r3.get();
    }

    public static Object A0b(C16150sX r3, C16150sX r4, ContactPickerFragment contactPickerFragment, AnonymousClass01J r6) {
        contactPickerFragment.A1K = new C85944Qp((C16440t3) r6.get(), C16150sX.A0a(r3));
        contactPickerFragment.A1q = (C17020u3) r4.AMG.get();
        contactPickerFragment.A1t = (AnonymousClass1BU) r4.ANA.get();
        contactPickerFragment.A0k = (C18260wP) r4.A4p.get();
        contactPickerFragment.A0p = (AnonymousClass156) r4.ADH.get();
        contactPickerFragment.A1N = (C24901Hs) r4.ADg.get();
        contactPickerFragment.A1c = (C26101Mi) r4.AQU.get();
        contactPickerFragment.A15 = (C206210w) r4.A4v.get();
        contactPickerFragment.A1A = (C19600yh) r4.A5F.get();
        contactPickerFragment.A1i = (AnonymousClass18R) r4.ABZ.get();
        return r4.A4u.get();
    }

    public static Object A0c(C16150sX r1, PaymentSettingsFragment paymentSettingsFragment) {
        paymentSettingsFragment.A0S = C16150sX.A0n(r1);
        paymentSettingsFragment.A0i = (C118365uZ) r1.AIm.get();
        paymentSettingsFragment.A0R = (C18030w2) r1.A6W.get();
        paymentSettingsFragment.A0O = (AnonymousClass01V) r1.AOi.get();
        paymentSettingsFragment.A0h = (C18290wS) r1.AIB.get();
        paymentSettingsFragment.A0c = (C18300wT) r1.AHn.get();
        paymentSettingsFragment.A0L = (AnonymousClass19Y) r1.A4r.get();
        paymentSettingsFragment.A0T = (C19950zG) r1.AQV.get();
        paymentSettingsFragment.A0V = (AnonymousClass175) r1.AH5.get();
        paymentSettingsFragment.A0e = (C18310wU) r1.AHz.get();
        paymentSettingsFragment.A0g = (C18090w8) r1.AI6.get();
        return r1.AHj.get();
    }

    public static Object A0d(C35301lh r0) {
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    public static String A0e(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static String A0f(C16040sK r1, C16440t3 r2) {
        byte[] A01 = C224718b.A01(r1, r2, false);
        AnonymousClass00B.A06(A01);
        return C004101u.A04(A01);
    }

    public static String A0g(C16040sK r1, C16440t3 r2) {
        byte[] A01 = C224718b.A01(r1, r2, false);
        AnonymousClass00B.A06(A01);
        return C004101u.A04(A01);
    }

    public static ArrayList A0h() {
        return new ArrayList(Arrays.asList(new String[]{"0", "1"}));
    }

    public static List A0i(C18290wS r0) {
        r0.A06();
        return r0.A09.A0B();
    }

    public static List A0j(Collection collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static JSONObject A0k(C18300wT r1) {
        String A04 = r1.A04();
        return TextUtils.isEmpty(A04) ? new JSONObject() : new JSONObject(A04);
    }

    public static void A0l(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().addFlags(Integer.MIN_VALUE);
        }
    }

    public static void A0m(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(8192);
        }
    }

    public static void A0n(Context context, Resources resources, Object obj, Object[] objArr) {
        objArr[0] = obj;
        String string = resources.getString(R.string.str0ea9, objArr);
        C32241fu r2 = new C32241fu(context);
        r2.A07(false);
        r2.A02(R.string.str0ea7);
        r2.A06(string);
        r2.setPositiveButton(R.string.str0ea6, (DialogInterface.OnClickListener) null);
        r2.create().show();
    }

    public static void A0o(Context context, C005402i r2, int i2, int i3) {
        r2.A0B(i2);
        r2.A0N(true);
        r2.A0E(AnonymousClass2SR.A06(context.getResources().getDrawable(R.drawable.ic_close), i3));
    }

    public static void A0p(SpannableString spannableString, String str, String str2, String str3) {
        URLSpan uRLSpan = new URLSpan(str);
        int indexOf = str2.indexOf(str3);
        spannableString.setSpan(uRLSpan, indexOf, indexOf + str3.length(), 33);
    }

    public static void A0q(View view, int i2, int i3) {
        AnonymousClass2SR.A08((ImageView) view.findViewById(i2), i3);
    }

    public static void A0r(View view, Object obj, int i2) {
        view.setOnClickListener(new IDxCListenerShape135S0100000_3_I1(obj, i2));
    }

    public static void A0s(View view, Object obj, Object obj2, int i2) {
        view.setOnClickListener(new IDxCListenerShape33S0200000_3_I1(obj, i2, obj2));
    }

    public static void A0t(C001100m r1, int i2) {
        r1.A0T(new IDxAListenerShape123S0100000_3_I1(r1, i2));
    }

    public static void A0u(C005402i r1, int i2) {
        r1.A0B(i2);
        r1.A0N(true);
    }

    public static void A0v(C005302h r1, Object obj, int i2, int i3) {
        r1.setNegativeButton(i3, new IDxCListenerShape130S0100000_3_I1(obj, i2));
    }

    public static void A0w(C005302h r1, Object obj, int i2, int i3) {
        r1.setPositiveButton(i3, new IDxCListenerShape130S0100000_3_I1(obj, i2));
    }

    public static void A0x(C001300o r1, AnonymousClass028 r2, int i2) {
        r2.A0A(r1, new IDxObserverShape118S0100000_3_I1(r1, i2));
    }

    public static void A0y(IDxAListenerShape123S0100000_3_I1 iDxAListenerShape123S0100000_3_I1) {
        ((C14590pR) iDxAListenerShape123S0100000_3_I1.A00).A1q();
    }

    public static void A0z(C49132Rg r0, C16150sX r1, ContactPicker contactPicker) {
        contactPicker.A01 = r0.A0F();
        contactPicker.A01 = (AnonymousClass10X) r1.ALc.get();
        contactPicker.A00 = (C18900xR) r1.ALD.get();
        contactPicker.A02 = (C16760tb) r1.APV.get();
        contactPicker.A06 = (WhatsAppLibLoader) r1.AR7.get();
        contactPicker.A07 = (C19760yx) r1.AKx.get();
    }

    public static void A10(C49132Rg r0, C16150sX r1, ContactPickerFragment contactPickerFragment, Object obj) {
        contactPickerFragment.A14 = (C220516l) obj;
        contactPickerFragment.A0N = (C49352Sp) r0.A1G.get();
        contactPickerFragment.A1Y = (AnonymousClass1ND) r1.A2y.get();
        contactPickerFragment.A0b = (C25501Ka) r1.A2i.get();
    }

    public static void A11(C17050uS r1, C16150sX r2, PaymentContactPickerFragment paymentContactPickerFragment) {
        paymentContactPickerFragment.A1a = (C224618a) r2.A79.get();
        paymentContactPickerFragment.A1M = (C26021Ma) r2.A63.get();
        paymentContactPickerFragment.A0O = (C82234Ca) r1.A0J.get();
        paymentContactPickerFragment.A1J = (C19820z3) r2.A7p.get();
        paymentContactPickerFragment.A0A = (AnonymousClass1N2) r2.AHZ.get();
        paymentContactPickerFragment.A01 = (AnonymousClass175) r2.AH5.get();
        paymentContactPickerFragment.A04 = (C18090w8) r2.AI6.get();
        paymentContactPickerFragment.A03 = (AnonymousClass174) r2.AI3.get();
        paymentContactPickerFragment.A02 = (C227919h) r2.AH8.get();
        paymentContactPickerFragment.A00 = (C221116r) r2.AHt.get();
        paymentContactPickerFragment.A09 = (C117745tU) r2.AHx.get();
    }

    public static void A12(C17050uS r1, C16150sX r2, BkScreenFragment bkScreenFragment) {
        bkScreenFragment.A06 = C17270uo.A00(r2.AJv);
        bkScreenFragment.A05 = (AnonymousClass5wM) r2.A2B.get();
        C49132Rg r12 = r1.A0Y;
        bkScreenFragment.A03 = r12.A06();
        bkScreenFragment.A04 = (C20180zd) r2.APJ.get();
        bkScreenFragment.A02 = (AnonymousClass2ZU) r12.A1m.get();
        bkScreenFragment.A06 = C16150sX.A1C(r2);
    }

    public static void A13(C16150sX r1, RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment) {
        roundedBottomSheetDialogFragment.A00 = (C17070uU) r1.ABg.get();
        roundedBottomSheetDialogFragment.A01 = (C17080uV) r1.APK.get();
    }

    public static void A14(C16150sX r1, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A00 = (C17070uU) r1.ABg.get();
        contactPickerFragment.A01 = (C17080uV) r1.APK.get();
        contactPickerFragment.A1E = (C16440t3) r1.AP2.get();
        contactPickerFragment.A1d = (C14710pd) r1.A05.get();
        contactPickerFragment.A1y = (AnonymousClass1PD) r1.AEP.get();
        contactPickerFragment.A0P = (C14870pt) r1.AB3.get();
        contactPickerFragment.A0Q = (C16040sK) r1.ADr.get();
        contactPickerFragment.A0S = (AnonymousClass10X) r1.ALc.get();
        contactPickerFragment.A24 = (C16320sq) r1.ARB.get();
        contactPickerFragment.A1P = (C15810rt) r1.A43.get();
        contactPickerFragment.A0K = (C23101Am) r1.A0N.get();
    }

    public static void A15(C16150sX r1, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A1s = new C25781Lc();
        contactPickerFragment.A1z = (C25681Ks) r1.A0Q.get();
        contactPickerFragment.A1r = (C16220sf) r1.A3y.get();
        contactPickerFragment.A0Y = (C19740yv) r1.AQi.get();
        contactPickerFragment.A1k = (C217915l) r1.AOG.get();
        contactPickerFragment.A0g = (AnonymousClass127) r1.A3z.get();
        contactPickerFragment.A17 = (C19230xz) r1.A5B.get();
        contactPickerFragment.A0h = (AnonymousClass1L3) r1.A4N.get();
        contactPickerFragment.A1X = (C26091Mh) r1.A61.get();
        contactPickerFragment.A1O = (C26001Ly) r1.A65.get();
        contactPickerFragment.A0l = (AnonymousClass19Y) r1.A4r.get();
    }

    public static void A16(C16150sX r1, ContactPickerFragment contactPickerFragment, AnonymousClass1A9 r3) {
        contactPickerFragment.A23 = r3;
        contactPickerFragment.A1m = C16150sX.A0r(r1);
        contactPickerFragment.A1D = (AnonymousClass01V) r1.AOi.get();
        contactPickerFragment.A0r = (C16080sP) r1.AQ9.get();
        contactPickerFragment.A1p = (C18290wS) r1.AIB.get();
        contactPickerFragment.A1H = (AnonymousClass013) r1.AR8.get();
        contactPickerFragment.A1T = (C26081Mg) r1.AIY.get();
        contactPickerFragment.A0a = (AnonymousClass01Y) r1.A1w.get();
        contactPickerFragment.A0o = (C17140ub) r1.A4y.get();
        contactPickerFragment.A16 = (C23181Au) r1.A53.get();
        contactPickerFragment.A0M = (AnonymousClass1G1) r1.AJl.get();
        contactPickerFragment.A13 = (AnonymousClass1BI) r1.ACt.get();
        contactPickerFragment.A1o = C16150sX.A0x(r1);
    }

    public static void A17(C16150sX r1, PaymentSettingsFragment paymentSettingsFragment) {
        paymentSettingsFragment.A0Q = (C16980tz) r1.AQB.get();
        paymentSettingsFragment.A0G = (C16040sK) r1.ADr.get();
        paymentSettingsFragment.A0J = (C17130ua) r1.AN9.get();
        paymentSettingsFragment.A0H = (AnonymousClass1KO) r1.ALY.get();
        paymentSettingsFragment.A12 = (C16320sq) r1.ARB.get();
        paymentSettingsFragment.A10 = (C218315p) r1.AIL.get();
        paymentSettingsFragment.A0M = (C16000sG) r1.A4x.get();
        paymentSettingsFragment.A0N = (C16080sP) r1.AQ9.get();
        paymentSettingsFragment.A0F = (C14870pt) r1.AB3.get();
        paymentSettingsFragment.A11 = (C17110uY) r1.ADT.get();
        paymentSettingsFragment.A0I = (C15900s5) r1.ALm.get();
    }

    public static void A18(C16150sX r1, PaymentSettingsFragment paymentSettingsFragment) {
        paymentSettingsFragment.A0Z = (C18340wX) r1.AHd.get();
        paymentSettingsFragment.A0j = (AnonymousClass1MA) r1.AHr.get();
        paymentSettingsFragment.A0o = (AnonymousClass5xG) r1.AHX.get();
        paymentSettingsFragment.A0k = (C119285wq) r1.AIH.get();
        paymentSettingsFragment.A0a = (AnonymousClass17O) r1.AHe.get();
        paymentSettingsFragment.A0d = (AnonymousClass17Y) r1.AHs.get();
        paymentSettingsFragment.A0W = (AnonymousClass109) r1.AH7.get();
        paymentSettingsFragment.A0U = (AnonymousClass107) r1.AFb.get();
        paymentSettingsFragment.A0b = (AnonymousClass108) r1.AHh.get();
        paymentSettingsFragment.A0v = (C117745tU) r1.AHx.get();
        paymentSettingsFragment.A0Y = (C27991Tx) r1.AH6.get();
    }

    public static void A19(C16150sX r1, PaymentSettingsFragment paymentSettingsFragment, Object obj) {
        paymentSettingsFragment.A0p = (C118915vc) obj;
        paymentSettingsFragment.A0f = (AnonymousClass174) r1.AI3.get();
        paymentSettingsFragment.A0m = (AnonymousClass1GO) r1.AHY.get();
        paymentSettingsFragment.A0K = (C18260wP) r1.A4p.get();
    }

    public static void A1A(C16150sX r1, ReTosFragment reTosFragment) {
        reTosFragment.A02 = (AnonymousClass01V) r1.AOi.get();
        reTosFragment.A04 = (C18310wU) r1.AHz.get();
        reTosFragment.A06 = (C18090w8) r1.AI6.get();
        reTosFragment.A03 = (C1204661t) r1.AHV.get();
        reTosFragment.A05 = C16150sX.A0z(r1);
    }

    public static void A1B(C16150sX r1, PaymentInviteFragment paymentInviteFragment) {
        paymentInviteFragment.A00 = (C17070uU) r1.ABg.get();
        paymentInviteFragment.A01 = (C17080uV) r1.APK.get();
        paymentInviteFragment.A03 = (C16490t9) r1.AQz.get();
        paymentInviteFragment.A02 = (C17200uh) r1.A52.get();
        paymentInviteFragment.A00 = (C16000sG) r1.A4x.get();
        paymentInviteFragment.A01 = (C16080sP) r1.AQ9.get();
        paymentInviteFragment.A05 = (AnonymousClass5vV) r1.AHW.get();
        paymentInviteFragment.A04 = (AnonymousClass1HS) r1.AHb.get();
        paymentInviteFragment.A09 = (C117745tU) r1.AHx.get();
    }

    public static void A1C(C14550pN r3, int i2) {
        r3.Afj(new Object[]{r3.getString(R.string.str0b6e)}, 0, i2);
    }

    public static void A1D(C14530pL r2, int i2) {
        AnonymousClass29T.A00(r2, i2);
        r2.A00.Act(r2, Uri.parse("https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1"));
    }

    public static void A1E(C23071Aj r0, String str, Object[] objArr, int i2) {
        objArr[i2] = r0.A00(str).toString();
    }

    public static void A1F(ChangeDMSettingActivity changeDMSettingActivity) {
        Intent intent = new Intent("android.intent.action.VIEW", changeDMSettingActivity.A0B.A05("chats", "about-disappearing-messages"));
        intent.addFlags(268435456);
        changeDMSettingActivity.A00.A06(changeDMSettingActivity, intent);
        changeDMSettingActivity.A08.A00(4, changeDMSettingActivity.A01);
    }

    public static void A1G(C17190ug r7, C19550yc r8, C28371Vv r9, String str) {
        r7.A0A(r8, r9, str, 204, 0);
    }

    public static void A1H(C17190ug r7, C19550yc r8, C28371Vv r9, String str) {
        r7.A0A(r8, r9, str, 204, 0);
    }

    public static void A1I(AnonymousClass2HJ r1, AbstractMap abstractMap) {
        abstractMap.put("error_code", String.valueOf(r1.A00));
    }

    public static void A1J(C18300wT r1, Object obj) {
        r1.A0H(obj.toString());
    }

    public static void A1K(C1222969a r1, Integer num, String str, String str2) {
        AnonymousClass00B.A06(r1);
        r1.AKS(1, num, str, str2);
    }

    public static void A1L(AnonymousClass1Vo r1, Object obj) {
        r1.A06(obj.toString());
    }

    public static void A1M(C110655eb r4, Object obj) {
        C39931tI r5 = (C39931tI) obj;
        if (!TextUtils.isEmpty(r5.A0B)) {
            C117655tL r3 = new C117655tL(3);
            r3.A05 = r5.A0B.replaceAll("[^\\d]", "");
            r4.A03.A0B(r3);
        }
    }

    public static void A1N(C52372dh r1, Class cls, Object obj, int i2) {
        r1.A00(new IDxCEventShape181S0100000_3_I1(obj, i2), cls, obj);
    }

    public static void A1O(String str, String str2) {
        Log.e(AnonymousClass1Vo.A01(str, str2));
    }

    public static void A1P(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C35081lL(str, str2));
    }

    public static void A1Q(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass5xA("", str, str2, -1));
    }

    public static void A1R(String str, String str2, List list) {
        list.add(new C35081lL(str, str2));
    }

    public static void A1S(AbstractCollection abstractCollection, int i2) {
        if (i2 != -1) {
            abstractCollection.add(Integer.valueOf(i2));
        }
    }

    public static void A1T(AbstractMap abstractMap, Iterator it) {
        C108505Og r1 = (C108505Og) it.next();
        if (r1 instanceof C100414vb) {
            C35701mM r12 = ((C100414vb) r1).A00;
            List list = r12.A06;
            if (!list.isEmpty()) {
                abstractMap.put(r12.A0D, list.get(0));
            }
        }
    }

    public static boolean A1U(C28371Vv r1, String str, String str2) {
        return str2.equals(r1.A0N(str, (String) null));
    }

    public static boolean A1V(String str, long j2, boolean z2) {
        return C32271fx.A0D(str, j2, 255, z2);
    }

    public static boolean A1W(String str, long j2, boolean z2) {
        return C32271fx.A0D(str, j2, 1000, z2);
    }

    public static boolean A1X(FormItemEditText formItemEditText) {
        formItemEditText.A0E = null;
        formItemEditText.A0G = null;
        formItemEditText.A0F = null;
        formItemEditText.A06 = 0;
        formItemEditText.A04 = 24.0f;
        formItemEditText.A03 = 4.0f;
        formItemEditText.A05 = 8.0f;
        return false;
    }

    public static int[] A1Y(int i2) {
        int[] iArr = new int[i2];
        iArr[0] = 1;
        iArr[1] = 2;
        return iArr;
    }

    public static int[] A1Z(int i2) {
        int[] iArr = new int[i2];
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 3;
        iArr[3] = 4;
        iArr[4] = 5;
        iArr[5] = 6;
        return iArr;
    }

    public static Object[] A1a(Object obj) {
        Object[] objArr = new Object[2];
        objArr[0] = obj;
        return objArr;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[][] A1b(org.npci.commonlibrary.widget.FormItemEditText r3, boolean r4) {
        /*
            r1 = 4
            r3.A0J = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A01 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r3.A02 = r0
            r3.A0H = r4
            r3.A0I = r4
            int[][] r3 = new int[r1][]
            r2 = 1
            int[] r1 = new int[r2]
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            r1[r4] = r0
            r3[r4] = r1
            int[] r1 = new int[r2]
            r0 = 16842914(0x10100a2, float:2.3694012E-38)
            r1[r4] = r0
            r3[r2] = r1
            int[] r1 = new int[r2]
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            r1[r4] = r0
            r0 = 2
            r3[r0] = r1
            int[] r1 = new int[r2]
            r0 = -16842908(0xfffffffffefeff64, float:-1.6947499E38)
            r1[r4] = r0
            r0 = 3
            r3[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110105dW.A1b(org.npci.commonlibrary.widget.FormItemEditText, boolean):int[][]");
    }
}
