package X;

import java.io.File;

/* renamed from: X.1JO  reason: invalid class name */
public abstract class AnonymousClass1JO {
    public final C14870pt A00;
    public final C17130ua A01;
    public final C16980tz A02;
    public final C19950zG A03;
    public final C38411qk A04;

    public AnonymousClass1JO(C14870pt r9, C17130ua r10, C16980tz r11, C19950zG r12) {
        this.A00 = r9;
        this.A02 = r11;
        this.A01 = r10;
        this.A03 = r12;
        C38461qp r2 = new C38461qp(r9, r10, r12, new File(r11.A00.getCacheDir(), A00()), "payments-image");
        r2.A01 = 16777216;
        r2.A05 = true;
        this.A04 = r2.A00();
    }

    public String A00() {
        return "payment_merchant_image_cache";
    }
}
