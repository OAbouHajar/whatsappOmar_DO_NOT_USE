package X;

/* renamed from: X.3Tm  reason: invalid class name */
public class AnonymousClass3Tm extends C48862Pr {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass39L A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Tm(AnonymousClass39L r2, int i2) {
        super("StreamingUploadDataTask_update");
        this.A01 = r2;
        this.A00 = i2;
    }

    public void run() {
        AnonymousClass39L r1 = this.A01;
        r1.A03.updateDataTaskUploadProgress(r1.A02.mTaskIdentifier, (long) this.A00, r1.A00, r1.A01);
    }
}
