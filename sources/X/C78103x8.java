package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.3x8  reason: invalid class name and case insensitive filesystem */
public class C78103x8 extends C30641ci {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(64);
    public long A00;
    public long A01;
    public DeviceJid A02;
    public String A03;

    public C78103x8(Parcel parcel) {
        super(parcel);
        this.A02 = (DeviceJid) AnonymousClass3K3.A0U(parcel, DeviceJid.class);
        this.A03 = AnonymousClass3K4.A0X(parcel);
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
    }

    public C78103x8(DeviceJid deviceJid, C30641ci r2, String str, long j2, long j3) {
        super(r2);
        this.A02 = deviceJid;
        this.A03 = str;
        this.A00 = j2;
        this.A01 = j3;
    }

    public C28371Vv A01() {
        long j2 = this.A00;
        if (j2 <= 0 && this.A01 <= 0) {
            return null;
        }
        DeviceJid deviceJid = this.A02;
        int i2 = 1;
        long j3 = this.A01;
        C35081lL[] r7 = new C35081lL[((AnonymousClass000.A1V(deviceJid) ? 1 : 0) + true + (AnonymousClass000.A1Q((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1))) ? 1 : 0) + (AnonymousClass000.A1Q((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1))) ? 1 : 0))];
        C35081lL.A02("call-id", this.A03, r7, 0);
        if (deviceJid != null) {
            r7[1] = new C35081lL((Jid) deviceJid, "call-creator");
            i2 = 2;
        }
        if (j2 > 0) {
            C35081lL.A02("audio_duration", String.valueOf(j2), r7, i2);
            i2++;
        }
        if (j3 > 0) {
            C35081lL.A02("video_duration", String.valueOf(j3), r7, i2);
        }
        return new C28371Vv("terminate", r7);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }
}
