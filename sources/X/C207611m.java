package X;

import android.net.TrafficStats;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.11m  reason: invalid class name and case insensitive filesystem */
public class C207611m {
    public static final Socket A05 = new Socket();
    public ThreadPoolExecutor A00;
    public SSLSocketFactory A01;
    public boolean A02;
    public final C17670vS A03;
    public final C16320sq A04;

    public C207611m(C17670vS r1, C16320sq r2) {
        this.A04 = r2;
        this.A03 = r1;
    }

    public final synchronized ThreadPoolExecutor A00() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = this.A00;
        if (threadPoolExecutor == null) {
            C16320sq r2 = this.A04;
            threadPoolExecutor = new C28111Uk((C23291Bk) r2, new ArrayBlockingQueue(2), new C28061Uf(1, "happy-eyeball"), TimeUnit.SECONDS, 2, 2, 30, false);
            this.A00 = threadPoolExecutor;
        }
        return threadPoolExecutor;
    }

    public final void A01(C51412bd r9, InetSocketAddress inetSocketAddress, boolean z2) {
        try {
            TrafficStats.setThreadStatsTag(1);
            SSLSocketFactory sSLSocketFactory = this.A01;
            Socket createSocket = SocketFactory.getDefault().createSocket();
            StringBuilder sb = new StringBuilder();
            sb.append("HappyEyeball");
            sb.append("/try_connect/");
            sb.append(inetSocketAddress);
            sb.append(" (secureSocket? ");
            sb.append(z2);
            sb.append(')');
            Log.i(sb.toString());
            createSocket.connect(inetSocketAddress, 30000);
            if (z2) {
                createSocket = sSLSocketFactory.createSocket(createSocket, inetSocketAddress.getHostName(), inetSocketAddress.getPort(), true);
                ((SSLSocket) createSocket).startHandshake();
            }
            C51422be r1 = new C51422be(createSocket);
            if (!r9.A00(r1.A00)) {
                Log.i("HappyEyeball/closeSocket");
                r1.A00();
            }
        } catch (IOException | ClassCastException e2) {
            if (!(e2 instanceof ClassCastException) || Build.VERSION.SDK_INT == 26) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HappyEyeball/connectAndCountDown/");
                sb2.append(inetSocketAddress);
                sb2.append("/couldn't connect to ip");
                Log.e(sb2.toString(), e2);
                synchronized (this) {
                    if (this.A02) {
                        r9.A00(A05);
                    } else {
                        this.A02 = true;
                    }
                }
            } else {
                throw ((ClassCastException) e2);
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
        TrafficStats.clearThreadStatsTag();
    }
}
