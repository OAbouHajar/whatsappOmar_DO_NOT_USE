package X;

import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.3Tp  reason: invalid class name */
public class AnonymousClass3Tp extends C48862Pr {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NetworkSession A02;
    public final /* synthetic */ AnonymousClass1z9 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ byte[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Tp(NetworkSession networkSession, AnonymousClass1z9 r3, String str, byte[] bArr, int i2, int i3) {
        super("updateDataTaskUploadProgress");
        this.A03 = r3;
        this.A02 = networkSession;
        this.A04 = str;
        this.A00 = i2;
        this.A01 = i3;
        this.A05 = bArr;
    }

    public void run() {
        this.A02.updateDataTaskUploadProgress(this.A04, (long) this.A00, (long) this.A01, (long) this.A05.length);
    }
}
