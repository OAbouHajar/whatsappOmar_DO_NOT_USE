package X;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCEventShape180S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.ConfirmLegalNameBottomSheetFragment;
import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.wamsys.SecureUriParser;
import java.lang.ref.WeakReference;

/* renamed from: X.3GJ  reason: invalid class name */
public final class AnonymousClass3GJ implements AnonymousClass5Q8 {
    public final /* synthetic */ P2mLiteOrderDetailsActivity A00;

    public AnonymousClass3GJ(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity) {
        this.A00 = p2mLiteOrderDetailsActivity;
    }

    public static /* synthetic */ void A00(C1036852i r2, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity) {
        C18450wi.A0H(r2, 1);
        if ("send_fds_iq".equals(r2.A02)) {
            WeakReference weakReference = p2mLiteOrderDetailsActivity.A0Q;
            DialogFragment dialogFragment = weakReference == null ? null : (DialogFragment) weakReference.get();
            if (r2.A00 != C797241a.ON_START) {
                if (dialogFragment != null) {
                    dialogFragment.A1C();
                }
                p2mLiteOrderDetailsActivity.Ac1();
            } else if (dialogFragment == null || !dialogFragment.A0e()) {
                p2mLiteOrderDetailsActivity.Afq(R.string.str13db);
            }
        }
    }

    public static /* synthetic */ void A01(C1036752h r11, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity) {
        C16880tn r0;
        C35251lc r02;
        C16880tn r03;
        C35251lc r04;
        C18450wi.A0H(r11, 1);
        String str = r11.A01;
        String str2 = r11.A02;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity2 = p2mLiteOrderDetailsActivity;
        C16830ti r7 = (C16830ti) C16460t6.A00(p2mLiteOrderDetailsActivity.A35(), p2mLiteOrderDetailsActivity.A37().A08);
        String str3 = r11.A00;
        int hashCode = str3.hashCode();
        if (hashCode != 35394935) {
            if (hashCode != 312640649) {
                if (hashCode == 696544716 && str3.equals("BLOCKED")) {
                    p2mLiteOrderDetailsActivity.A3A(r7, "order_details");
                }
            } else if (str3.equals("DOB_CHALLENGED")) {
                p2mLiteOrderDetailsActivity.A39((PaymentBottomSheet) null, r7, str, str2);
            }
        } else if (str3.equals("PENDING")) {
            Integer num = null;
            p2mLiteOrderDetailsActivity2.A38(C49382Ss.A00(), r7, (Integer) null, "enter_name", str2, 0);
            C89954dD r4 = ConfirmLegalNameBottomSheetFragment.A0E;
            String str4 = null;
            if (!(r7 == null || (r03 = r7.A00) == null || (r04 = r03.A01) == null)) {
                num = Integer.valueOf(r04.A01());
            }
            String A01 = C49382Ss.A01(num);
            if (!(r7 == null || (r0 = r7.A00) == null || (r02 = r0.A01) == null)) {
                str4 = r02.A07;
            }
            ConfirmLegalNameBottomSheetFragment A002 = r4.A00(A01, str4);
            PaymentBottomSheet A012 = PaymentBottomSheet.A01();
            p2mLiteOrderDetailsActivity.A0Q = C13690nt.A0h(A012);
            A002.A1A(new C90014dM(A002, p2mLiteOrderDetailsActivity2, A012, r7, str2, str));
            A012.A1P(A002);
            p2mLiteOrderDetailsActivity.Afc(A012);
        }
    }

    public static /* synthetic */ void A02(C1036952j r17, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity) {
        Intent A0B;
        C16880tn r0;
        C35251lc r02;
        C16880tn r03;
        C35251lc r04;
        DialogFragment dialogFragment;
        C1036952j r1 = r17;
        C18450wi.A0H(r1, 1);
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity2 = p2mLiteOrderDetailsActivity;
        WeakReference weakReference = p2mLiteOrderDetailsActivity2.A0Q;
        if (!(weakReference == null || (dialogFragment = (DialogFragment) weakReference.get()) == null)) {
            dialogFragment.A1C();
        }
        C16830ti r14 = (C16830ti) C16460t6.A00(p2mLiteOrderDetailsActivity2.A35(), p2mLiteOrderDetailsActivity2.A37().A08);
        String str = r1.A03;
        p2mLiteOrderDetailsActivity2.A38(C49382Ss.A00(), r14, (Integer) null, "in_app_browser_checkout", str, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            Integer num = null;
            String str2 = r1.A01;
            String str3 = r1.A02;
            String str4 = r1.A04;
            String str5 = r1.A00;
            String str6 = null;
            if (!(r14 == null || (r03 = r14.A00) == null || (r04 = r03.A01) == null)) {
                num = Integer.valueOf(r04.A01());
            }
            String A01 = C49382Ss.A01(num);
            if (!(r14 == null || (r0 = r14.A00) == null || (r02 = r0.A01) == null)) {
                str6 = r02.A07;
            }
            A0B = C13680ns.A09();
            A0B.setClassName(p2mLiteOrderDetailsActivity2.getPackageName(), "com.obwhatsapp.payments.ui.P2mLiteWebViewActivity");
            AnonymousClass00B.A06(str3);
            A0B.putExtra("webview_url", str3);
            A0B.putExtra("webview_javascript_enabled", true);
            A0B.putExtra("extra_fds_manager_id", str2);
            if (!TextUtils.isEmpty(str4)) {
                A0B.putExtra("webview_callback", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                A0B.putExtra("webview_cancel_callback", str5);
            }
            A0B.putExtra("webview_hide_url", false);
            A0B.putExtra("webview_open_new_tab_in_external_browser", true);
            A0B.putExtra("webview_title_show_domain_only", true);
            if (!TextUtils.isEmpty(str)) {
                A0B.putExtra("referral_screen", str);
            }
            A0B.putExtra("order_type", A01);
            A0B.putExtra("config_id", str6);
        } else {
            String str7 = r1.A02;
            if (URLUtil.isHttpsUrl(str7)) {
                A0B = C13690nt.A0B(SecureUriParser.parseEncodedRFC2396(str7));
            } else {
                return;
            }
        }
        p2mLiteOrderDetailsActivity2.startActivity(A0B);
    }

    public void ARP(String str) {
        C18450wi.A0H(str, 0);
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A00;
        p2mLiteOrderDetailsActivity.Ac1();
        C52372dh r0 = p2mLiteOrderDetailsActivity.A0O;
        if (r0 != null) {
            r0.A03(p2mLiteOrderDetailsActivity);
        }
        p2mLiteOrderDetailsActivity.A0O = null;
        C20180zd r02 = p2mLiteOrderDetailsActivity.A0P;
        if (r02 != null) {
            C52372dh A02 = r02.A02(str);
            p2mLiteOrderDetailsActivity.A0O = A02;
            A02.A00(new IDxCEventShape180S0100000_2_I1(p2mLiteOrderDetailsActivity, 5), C1036952j.class, p2mLiteOrderDetailsActivity);
            C52372dh r3 = p2mLiteOrderDetailsActivity.A0O;
            if (r3 != null) {
                r3.A00(new IDxCEventShape180S0100000_2_I1(p2mLiteOrderDetailsActivity, 4), C1036752h.class, p2mLiteOrderDetailsActivity);
            }
            C52372dh r32 = p2mLiteOrderDetailsActivity.A0O;
            if (r32 != null) {
                r32.A00(new IDxCEventShape180S0100000_2_I1(p2mLiteOrderDetailsActivity, 3), C1036852i.class, p2mLiteOrderDetailsActivity);
                return;
            }
            return;
        }
        throw C18450wi.A03("uiObserversFactory");
    }
}
