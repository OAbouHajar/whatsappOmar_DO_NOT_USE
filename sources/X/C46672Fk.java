package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.2Fk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C46672Fk implements ThreadFactory {
    public final /* synthetic */ String A00;

    public /* synthetic */ C46672Fk(String str) {
        this.A00 = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new AnonymousClass1ZS(runnable, this.A00);
    }
}
