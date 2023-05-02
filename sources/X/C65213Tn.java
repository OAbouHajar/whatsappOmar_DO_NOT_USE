package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.3Tn  reason: invalid class name and case insensitive filesystem */
public class C65213Tn extends C48862Pr {
    public final /* synthetic */ DataTask A00;
    public final /* synthetic */ NetworkSession A01;
    public final /* synthetic */ AnonymousClass39L A02;
    public final /* synthetic */ AnonymousClass1z9 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65213Tn(DataTask dataTask, NetworkSession networkSession, AnonymousClass39L r4, AnonymousClass1z9 r5) {
        super("StreamingUploadDataTask_initial_ask_for_data");
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = networkSession;
        this.A00 = dataTask;
    }

    public void run() {
        this.A01.canHandleStreamingUploadUpdate(this.A00.mTaskIdentifier);
    }
}
