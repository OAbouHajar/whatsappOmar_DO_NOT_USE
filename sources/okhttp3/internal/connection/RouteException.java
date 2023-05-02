package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.internal.Util;

/* compiled from: XFMFile */
public final class RouteException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final IOException f2171a;

    /* renamed from: b  reason: collision with root package name */
    public IOException f2172b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f2171a = iOException;
        this.f2172b = iOException;
    }

    public void addConnectException(IOException iOException) {
        Util.addSuppressedIfPossible(this.f2171a, iOException);
        this.f2172b = iOException;
    }

    public IOException getFirstConnectException() {
        return this.f2171a;
    }

    public IOException getLastConnectException() {
        return this.f2172b;
    }
}
