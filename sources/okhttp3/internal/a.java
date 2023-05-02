package okhttp3.internal;

import java.util.concurrent.ThreadFactory;

/* compiled from: XFMFile */
public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f2113b;

    public a(String str, boolean z2) {
        this.f2112a = str;
        this.f2113b = z2;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f2112a);
        thread.setDaemon(this.f2113b);
        return thread;
    }
}
