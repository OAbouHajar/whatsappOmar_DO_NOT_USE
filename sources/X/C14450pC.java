package X;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0pC  reason: invalid class name and case insensitive filesystem */
public class C14450pC implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C93234ir();
    public Messenger A00;
    public C92024gs A01;

    public C14450pC(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = new Messenger(iBinder);
        } else {
            this.A01 = new C92024gs(iBinder);
        }
    }

    public final void A00(Message message) {
        Messenger messenger = this.A00;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C92024gs r1 = this.A01;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            r1.A00.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.A00;
            IBinder binder = messenger != null ? messenger.getBinder() : this.A01.asBinder();
            C14450pC r4 = (C14450pC) obj;
            Messenger messenger2 = r4.A00;
            return binder.equals(messenger2 != null ? messenger2.getBinder() : r4.A01.asBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        Messenger messenger = this.A00;
        return (messenger != null ? messenger.getBinder() : this.A01.asBinder()).hashCode();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.A00;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.A01.asBinder());
    }
}
