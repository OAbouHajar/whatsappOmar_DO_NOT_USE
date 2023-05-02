package e;

import android.widget.RemoteViews;

/* compiled from: XFMFile */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final RemoteViews f1669a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1670b;

    public j0(RemoteViews remoteViews, int i2) {
        this.f1669a = remoteViews;
        this.f1670b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f1670b == j0Var.f1670b && this.f1669a.equals(j0Var.f1669a);
    }

    public final int hashCode() {
        return (this.f1669a.hashCode() * 31) + this.f1670b;
    }
}
