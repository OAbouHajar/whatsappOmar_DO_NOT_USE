package w;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Stream;
import okio.AsyncTimeout;
import okio.Okio;

/* compiled from: XFMFile */
public final class q extends AsyncTimeout {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f2755j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f2756k;

    public /* synthetic */ q(Object obj, int i2) {
        this.f2755j = i2;
        this.f2756k = obj;
    }

    public final void d() {
        if (exit()) {
            throw newTimeoutException((IOException) null);
        }
    }

    public final IOException newTimeoutException(IOException iOException) {
        switch (this.f2755j) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }

    public final void timedOut() {
        StringBuilder sb;
        Level level;
        Logger logger;
        int i2 = this.f2755j;
        Object obj = this.f2756k;
        switch (i2) {
            case 0:
                ((Http2Stream) obj).closeLater(ErrorCode.CANCEL);
                return;
            default:
                try {
                    ((Socket) obj).close();
                    return;
                } catch (Exception e2) {
                    e = e2;
                    logger = Okio.f2354a;
                    level = Level.WARNING;
                    sb = new StringBuilder("Failed to close timed out socket ");
                    break;
                } catch (AssertionError e3) {
                    e = e3;
                    Logger logger2 = Okio.f2354a;
                    if ((e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) ? false : true) {
                        logger = Okio.f2354a;
                        level = Level.WARNING;
                        sb = new StringBuilder("Failed to close timed out socket ");
                        break;
                    } else {
                        throw e;
                    }
                }
                break;
        }
        sb.append((Socket) obj);
        logger.log(level, sb.toString(), e);
    }
}
