package androidx.car.app;

import X.AnonymousClass000;

public final class AppInfo {
    public final int mLatestCarAppApiLevel = 0;
    public final String mLibraryVersion = null;
    public final int mMinCarAppApiLevel = 0;

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Library version: [");
        A0r.append(this.mLibraryVersion);
        A0r.append("] Min Car Api Level: [");
        A0r.append(this.mMinCarAppApiLevel);
        A0r.append("] Latest Car App Api Level: [");
        A0r.append(this.mLatestCarAppApiLevel);
        return AnonymousClass000.A0h("]", A0r);
    }
}
