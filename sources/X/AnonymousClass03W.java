package X;

import android.app.Notification;
import android.os.Parcel;
import android.support.v4.app.INotificationSideChannel;

/* renamed from: X.03W  reason: invalid class name */
public class AnonymousClass03W implements AnonymousClass03U {
    public final int A00;
    public final Notification A01;
    public final String A02;
    public final String A03;

    public AnonymousClass03W(Notification notification, String str, String str2, int i2) {
        this.A02 = str;
        this.A00 = i2;
        this.A03 = str2;
        this.A01 = notification;
    }

    public void AdL(INotificationSideChannel iNotificationSideChannel) {
        String str = this.A02;
        int i2 = this.A00;
        String str2 = this.A03;
        Notification notification = this.A01;
        AnonymousClass0YL r7 = (AnonymousClass0YL) iNotificationSideChannel;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(i2);
            obtain.writeString(str2);
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            r7.A00.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[");
        sb.append("packageName:");
        sb.append(this.A02);
        sb.append(", id:");
        sb.append(this.A00);
        sb.append(", tag:");
        sb.append(this.A03);
        sb.append("]");
        return sb.toString();
    }
}
