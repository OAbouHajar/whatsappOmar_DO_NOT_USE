package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.39L  reason: invalid class name */
public class AnonymousClass39L {
    public long A00 = 0;
    public long A01;
    public final DataTask A02;
    public final NetworkSession A03;
    public final UrlRequest A04;
    public final AnonymousClass4J6 A05;
    public final BufferedOutputStream A06;
    public final HttpURLConnection A07;
    public final /* synthetic */ AnonymousClass1z9 A08;

    public AnonymousClass39L(DataTask dataTask, NetworkSession networkSession, AnonymousClass4J6 r11, AnonymousClass1z9 r12) {
        this.A08 = r12;
        this.A05 = r11;
        this.A02 = dataTask;
        this.A03 = networkSession;
        UrlRequest urlRequest = dataTask.mUrlRequest;
        this.A04 = urlRequest;
        try {
            HttpsURLConnection A012 = r12.A01(urlRequest, (FileInputStream) null, (byte[]) null);
            this.A07 = A012;
            A012.setDoOutput(true);
            A012.setChunkedStreamingMode(10240);
            long j2 = dataTask.mContentLength;
            if (j2 > 0) {
                this.A01 = j2;
                this.A06 = new BufferedOutputStream(new C37811pm(r12.A02, A012.getOutputStream(), (Integer) null, 29), 10240);
                Execution.executeAsyncWithPriority(new C65213Tn(dataTask, networkSession, this, r12), 3, 0);
                return;
            }
            throw new IOException("Content-Length cannot be empty for streaming upload");
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e2) {
            Log.e("wa-msys/NetworkSession: Error while initializing StreamingUploadDataTask", e2);
            IOException iOException = new IOException(e2);
            A01(NetworkUtils.newErrorURLResponse(this.A04), iOException, (byte[]) null);
            throw iOException;
        }
    }

    public final void A00() {
        try {
            BufferedOutputStream bufferedOutputStream = this.A06;
            if (bufferedOutputStream != null) {
                this.A07.connect();
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            }
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e2) {
            Log.e("wa-msys/NetworkSession: Exception while attempting to close the active output stream.  This could mean that the output stream has been previously closed.", e2);
        }
    }

    public final void A01(UrlResponse urlResponse, IOException iOException, byte[] bArr) {
        A00();
        this.A07.disconnect();
        AnonymousClass4J6 r0 = this.A05;
        r0.A01.A07.remove(r0.A00.mTaskIdentifier);
        NetworkUtils.markDataTaskCompleted(this.A02, this.A03, urlResponse, "wa-msys/NetworkSession: ", bArr, (File) null, iOException, false);
    }
}
