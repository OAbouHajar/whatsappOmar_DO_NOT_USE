package X;

import android.os.Parcel;
import android.support.v4.app.INotificationSideChannel;

/* renamed from: X.03T  reason: invalid class name */
public class AnonymousClass03T implements AnonymousClass03U {
    public final int A00;
    public final String A01;
    public final String A02;

    public AnonymousClass03T(String str, String str2, int i2) {
        this.A01 = str;
        this.A00 = i2;
        this.A02 = str2;
    }

    public void AdL(INotificationSideChannel iNotificationSideChannel) {
        String str = this.A01;
        int i2 = this.A00;
        String str2 = this.A02;
        AnonymousClass0YL r6 = (AnonymousClass0YL) iNotificationSideChannel;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(i2);
            obtain.writeString(str2);
            r6.A00.transact(2, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CancelTask[");
        sb.append("packageName:");
        sb.append(this.A01);
        sb.append(", id:");
        sb.append(this.A00);
        sb.append(", tag:");
        sb.append(this.A02);
        sb.append(", all:");
        sb.append(false);
        sb.append("]");
        return sb.toString();
    }
}
