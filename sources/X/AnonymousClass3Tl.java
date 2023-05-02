package X;

/* renamed from: X.3Tl  reason: invalid class name */
public class AnonymousClass3Tl extends C48862Pr {
    public final /* synthetic */ AnonymousClass39L A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Tl(AnonymousClass39L r2) {
        super("StreamingUploadDataTask_ask_for_data");
        this.A00 = r2;
    }

    public void run() {
        AnonymousClass39L r0 = this.A00;
        r0.A03.canHandleStreamingUploadUpdate(r0.A02.mTaskIdentifier);
    }
}
