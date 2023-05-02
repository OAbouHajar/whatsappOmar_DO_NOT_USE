package X;

import android.text.TextUtils;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.62b  reason: invalid class name and case insensitive filesystem */
public class C1205462b implements C109485Sh {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C12380kI A01;
    public final /* synthetic */ C12380kI A02;
    public final /* synthetic */ AnonymousClass5wS A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ WeakReference A06;
    public final /* synthetic */ WeakReference A07;

    public C1205462b(ImageView imageView, C12380kI r2, C12380kI r3, AnonymousClass5wS r4, String str, String str2, WeakReference weakReference, WeakReference weakReference2) {
        this.A07 = weakReference;
        this.A06 = weakReference2;
        this.A02 = r2;
        this.A05 = str;
        this.A00 = imageView;
        this.A04 = str2;
        this.A03 = r4;
        this.A01 = r3;
    }

    public void ASm() {
        String str = this.A05;
        if (!TextUtils.isEmpty(str)) {
            ImageView imageView = this.A00;
            String str2 = this.A04;
            AnonymousClass5wS r2 = this.A03;
            C12380kI r0 = this.A01;
            C12380kI r1 = this.A02;
            if (str2 != null && AnonymousClass000.A1X(r0.get())) {
                str = str2;
            }
            r2.A00(new C119845zi(imageView, r1), str);
        }
    }

    public void AYo() {
    }

    public void AYp() {
        ImageView imageView = (ImageView) this.A07.get();
        Object obj = this.A06.get();
        Number number = (Number) this.A02.get();
        if (imageView != null && obj != null && number != null) {
            imageView.setColorFilter(number.intValue());
        }
    }
}
