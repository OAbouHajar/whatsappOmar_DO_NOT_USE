package X;

/* renamed from: X.1RK  reason: invalid class name */
public class AnonymousClass1RK {
    public final AnonymousClass19K A00;
    public final AnonymousClass1y0 A01;

    public AnonymousClass1RK(AnonymousClass19K r3) {
        this.A00 = r3;
        this.A01 = new AnonymousClass1y0(r3, 1);
    }

    public void A00(int i2, String str, int i3) {
        AnonymousClass00B.A00();
        C16800tf A02 = this.A00.A02();
        try {
            A02.A02.A01("rmr_response_error", "file_key = ?  AND rmr_source =?  AND response_device_id =? ", new String[]{str, String.valueOf(i2), String.valueOf(i3)});
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
