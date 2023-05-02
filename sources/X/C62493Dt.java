package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.3Dt  reason: invalid class name and case insensitive filesystem */
public class C62493Dt implements DataTaskListener {
    public final /* synthetic */ AnonymousClass1z9 A00;

    public C62493Dt(AnonymousClass1z9 r1) {
        this.A00 = r1;
    }

    public void onCancelDataTask(String str, NetworkSession networkSession) {
        AnonymousClass39L r3 = (AnonymousClass39L) this.A00.A07.get(str);
        if (r3 != null) {
            r3.A01(NetworkUtils.newErrorURLResponse(r3.A04), new IOException("Task cancelled."), (byte[]) null);
        }
    }

    public void onNewTask(DataTask dataTask, NetworkSession networkSession) {
        try {
            C13700nu.A0X(this.A00.A05, this, dataTask, networkSession, 43);
        } catch (RejectedExecutionException e2) {
            Log.e("wa-msys/NetworkSession: DataTask rejected for execution", e2);
            throw e2;
        }
    }

    public void onUpdateStreamingDataTask(byte[] bArr, String str, NetworkSession networkSession) {
        this.A00.A05.Acl(new RunnableRunnableShape1S1200000_I1(this, str, bArr, 13));
    }
}
