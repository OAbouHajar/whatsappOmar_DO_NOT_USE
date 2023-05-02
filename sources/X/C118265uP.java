package X;

import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.5uP  reason: invalid class name and case insensitive filesystem */
public class C118265uP {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C30671cl A01;
    public final /* synthetic */ C111815hS A02;
    public final /* synthetic */ AnonymousClass5vX A03;

    public C118265uP(ImageView imageView, C30671cl r2, C111815hS r3, AnonymousClass5vX r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = imageView;
    }

    public void A00(AnonymousClass2HJ r3, String str) {
        StringBuilder A0r = AnonymousClass000.A0r("PAY: fetchCardArtImageContentDetails Couldn't get card art for: ");
        A0r.append(str);
        Log.w(AnonymousClass000.A0e(r3, " with error: ", A0r));
    }
}
