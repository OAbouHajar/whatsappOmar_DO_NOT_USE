package X;

import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.62a  reason: invalid class name and case insensitive filesystem */
public class C1205362a implements C109485Sh {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C30671cl A01;
    public final /* synthetic */ AnonymousClass5vX A02;
    public final /* synthetic */ boolean A03;

    public C1205362a(ImageView imageView, C30671cl r2, AnonymousClass5vX r3, boolean z2) {
        this.A02 = r3;
        this.A03 = z2;
        this.A01 = r2;
        this.A00 = imageView;
    }

    public void ASm() {
        StringBuilder A0r = AnonymousClass000.A0r("PAY: Failed to display card art, empty image shown. Re-fetch ");
        boolean z2 = this.A03;
        A0r.append(z2);
        Log.w(A0r.toString());
        if (z2) {
            this.A02.A01(this.A00, this.A01);
        }
    }

    public void AYo() {
    }

    public void AYp() {
    }
}
