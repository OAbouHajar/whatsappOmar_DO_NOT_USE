package X;

import android.net.Uri;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.5nv  reason: invalid class name and case insensitive filesystem */
public class C114535nv extends C16690tT {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final AnonymousClass1A9 A03;
    public final WeakReference A04;

    public C114535nv(Uri uri, IndiaUpiQrTabActivity indiaUpiQrTabActivity, AnonymousClass1A9 r4, int i2, int i3) {
        this.A03 = r4;
        this.A02 = uri;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = new WeakReference(indiaUpiQrTabActivity);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int max = Math.max(this.A01, this.A00);
        try {
            return this.A03.A0W(this.A02, max, max);
        } catch (AnonymousClass20M | IOException e2) {
            Log.e("IndiaUpiQrTabActivity/loadImageRunnable Failed to load image", e2);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) this.A04.get();
        if (indiaUpiQrTabActivity != null && !indiaUpiQrTabActivity.AIm()) {
            Uri uri = this.A02;
            if (obj == null) {
                indiaUpiQrTabActivity.Ac1();
                indiaUpiQrTabActivity.A05.A09(R.string.str0848, 0);
                return;
            }
            C13700nu.A0W(new AnonymousClass37O(uri, indiaUpiQrTabActivity.A0F, indiaUpiQrTabActivity.A0D), indiaUpiQrTabActivity.A05);
        }
    }
}
