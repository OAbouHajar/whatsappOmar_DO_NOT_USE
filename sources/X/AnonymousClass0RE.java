package X;

import android.app.Notification;

/* renamed from: X.0RE  reason: invalid class name */
public final class AnonymousClass0RE {
    public final int A00;
    public final int A01;
    public final Notification A02;

    public AnonymousClass0RE(int i2, Notification notification, int i3) {
        this.A01 = i2;
        this.A02 = notification;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AnonymousClass0RE.class == obj.getClass()) {
            AnonymousClass0RE r4 = (AnonymousClass0RE) obj;
            if (this.A01 == r4.A01 && this.A00 == r4.A00) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ForegroundInfo{");
        A0r.append("mNotificationId=");
        A0r.append(this.A01);
        A0r.append(", mForegroundServiceType=");
        A0r.append(this.A00);
        A0r.append(", mNotification=");
        A0r.append(this.A02);
        return AnonymousClass000.A0k(A0r);
    }
}
