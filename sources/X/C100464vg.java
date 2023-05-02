package X;

import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4vg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100464vg implements C108525Oi {
    public final /* synthetic */ C14550pN A00;
    public final /* synthetic */ AnonymousClass1KX A01;

    public /* synthetic */ C100464vg(C14550pN r1, AnonymousClass1KX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void ASp(C62723Er r5) {
        AnonymousClass1KX r3 = this.A01;
        C14550pN r2 = this.A00;
        Log.w("product-details/send-product/product load failed");
        r2.Ac1();
        r2.Afg(R.string.str03e4);
        Log.w("product-details/send-product/product load failed");
        r3.A09.A05("send_product_message_tag", false);
    }
}
