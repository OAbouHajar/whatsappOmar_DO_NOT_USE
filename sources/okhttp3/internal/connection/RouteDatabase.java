package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import okhttp3.Route;

/* compiled from: XFMFile */
public final class RouteDatabase {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f2170a = new LinkedHashSet();

    public synchronized void connected(Route route) {
        this.f2170a.remove(route);
    }

    public synchronized void failed(Route route) {
        this.f2170a.add(route);
    }

    public synchronized boolean shouldPostpone(Route route) {
        return this.f2170a.contains(route);
    }
}
