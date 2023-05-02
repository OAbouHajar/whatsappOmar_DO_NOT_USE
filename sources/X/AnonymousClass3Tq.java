package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.UrlResponse;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3Tq  reason: invalid class name */
public class AnonymousClass3Tq extends C48862Pr {
    public final /* synthetic */ DataTask A00;
    public final /* synthetic */ NetworkSession A01;
    public final /* synthetic */ UrlResponse A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ byte[] A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Tq(DataTask dataTask, NetworkSession networkSession, UrlResponse urlResponse, String str, byte[] bArr, File file, IOException iOException, boolean z2) {
        super("markDataTaskCompleted");
        this.A00 = dataTask;
        this.A01 = networkSession;
        this.A02 = urlResponse;
        this.A07 = bArr;
        this.A03 = file;
        this.A04 = iOException;
        this.A06 = z2;
        this.A05 = str;
    }

    public void run() {
        File file;
        DataTask dataTask = this.A00;
        String str = dataTask.mTaskCategory;
        String str2 = dataTask.mTaskIdentifier;
        int i2 = dataTask.mTaskType;
        try {
            NetworkSession networkSession = this.A01;
            UrlResponse urlResponse = this.A02;
            byte[] bArr = this.A07;
            file = this.A03;
            networkSession.markDataTaskAsCompletedCallback(str, str2, i2, urlResponse, bArr, file != null ? file.getCanonicalPath() : null, this.A04, this.A06);
        } catch (IOException e2) {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(this.A05);
            Log.e(AnonymousClass000.A0h("IOException while executing markDataTaskCompleted", A0o), e2);
            this.A01.markDataTaskAsCompletedCallback(str, str2, i2, this.A02, this.A07, (String) null, e2, this.A06);
            file = this.A03;
        } catch (Throwable th) {
            File file2 = this.A03;
            if (file2 != null) {
                file2.delete();
            }
            throw th;
        }
        if (file != null) {
            file.delete();
        }
    }
}
