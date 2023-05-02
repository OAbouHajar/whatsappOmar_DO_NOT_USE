package X;

import android.view.WindowInsets;

/* renamed from: X.0EP  reason: invalid class name */
public class AnonymousClass0EP extends C05360Qq {
    public final WindowInsets.Builder A00;

    public AnonymousClass0EP() {
        super(new AnonymousClass030());
        this.A00 = new WindowInsets.Builder();
    }

    public AnonymousClass0EP(AnonymousClass030 r3) {
        super(r3);
        WindowInsets.Builder builder;
        WindowInsets A07 = r3.A07();
        if (A07 == null) {
            builder = new WindowInsets.Builder();
        }
        this.A00 = builder;
    }

    public AnonymousClass030 A00() {
        return AnonymousClass030.A02(this.A00.build());
    }

    public void A01(C06510Wk r3) {
        this.A00.setStableInsets(r3.A02());
    }

    public void A02(C06510Wk r3) {
        this.A00.setSystemWindowInsets(r3.A02());
    }
}
