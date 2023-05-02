package X;

import android.text.TextUtils;
import android.widget.ImageView;
import com.facebook.redex.IDxSListenerShape35S0000000_2_I1;

/* renamed from: X.45s  reason: invalid class name and case insensitive filesystem */
public class C808245s {
    public static void A00(ImageView imageView, AnonymousClass4H5 r11, C50262Yq r12, C93564jP r13) {
        ImageView imageView2 = imageView;
        C808345t.A00(imageView);
        if (r13 != null) {
            String str = r13.A01;
            if (!TextUtils.isEmpty(str)) {
                AnonymousClass4H5 r5 = r11;
                C50262Yq r1 = r12;
                r1.A01(imageView2, new C35691mL(r13.A00, str, (String) null, 0, 0), (C108515Oh) null, r5, new C100444ve(), new IDxSListenerShape35S0000000_2_I1(0), 2);
            }
        }
    }
}
