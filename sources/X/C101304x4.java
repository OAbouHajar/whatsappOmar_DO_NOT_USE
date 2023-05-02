package X;

import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import java.io.BufferedInputStream;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.4x4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101304x4 implements C18000vz {
    public final /* synthetic */ C16320sq A00;
    public final /* synthetic */ BufferedInputStream A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ AtomicBoolean A03;
    public final /* synthetic */ HttpsURLConnection A04;

    public /* synthetic */ C101304x4(C16320sq r1, BufferedInputStream bufferedInputStream, File file, AtomicBoolean atomicBoolean, HttpsURLConnection httpsURLConnection) {
        this.A00 = r1;
        this.A02 = file;
        this.A03 = atomicBoolean;
        this.A04 = httpsURLConnection;
        this.A01 = bufferedInputStream;
    }

    public final void AP4(AnonymousClass1UX r8) {
        this.A00.Acl(new RunnableRunnableShape0S0400000_I0(this.A02, this.A03, this.A01, this.A04, 10));
    }
}
