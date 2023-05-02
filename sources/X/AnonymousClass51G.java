package X;

import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.whatsapp.util.Log;

/* renamed from: X.51G  reason: invalid class name */
public class AnonymousClass51G implements C19550yc {
    public final /* synthetic */ C46602Fc A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ byte[] A02;

    public AnonymousClass51G(C46602Fc r1, String str, byte[] bArr) {
        this.A00 = r1;
        this.A02 = bArr;
        this.A01 = str;
    }

    public void APb(String str) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/IQ delivery failure");
    }

    public void AQe(C28371Vv r2, String str) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/IQ error");
    }

    public void AYG(C28371Vv r6, String str) {
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest/success");
        this.A00.A06.Acl(new RunnableRunnableShape1S1200000_I1(this, this.A01, this.A02, 10));
    }
}
