package com.whatsapp.jid;

import X.AnonymousClass00B;
import X.AnonymousClass1W4;
import X.AnonymousClass1ZW;
import X.C34091jg;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.apache.commons.io.FilenameUtils;

public abstract class DeviceJid extends Jid implements Parcelable {
    public final byte device;
    public final UserJid userJid;

    public DeviceJid(Parcel parcel) {
        super(parcel);
        Parcelable readParcelable = parcel.readParcelable(UserJid.class.getClassLoader());
        AnonymousClass00B.A06(readParcelable);
        this.userJid = (UserJid) readParcelable;
        this.device = parcel.readByte();
    }

    public DeviceJid(UserJid userJid2, int i2) {
        super(userJid2.user);
        if (userJid2 != C34091jg.A00) {
            this.userJid = userJid2;
            if (i2 < 0 || i2 > 99) {
                StringBuilder sb = new StringBuilder("Invalid device: ");
                sb.append(i2);
                throw new AnonymousClass1W4(sb.toString());
            }
            this.device = (byte) i2;
            return;
        }
        throw new AnonymousClass1W4((Jid) userJid2);
    }

    public static String buildRawString(String str, String str2, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(i2);
        sb.append(':');
        sb.append(i3);
        sb.append('@');
        sb.append(str2);
        return sb.toString();
    }

    public static DeviceJid get(String str) {
        DeviceJid of;
        Jid jid = Jid.get(str);
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        if ((jid instanceof UserJid) && (of = of(jid)) != null) {
            return of;
        }
        throw new AnonymousClass1W4(str);
    }

    public static DeviceJid getFromUserJidAndDeviceId(UserJid userJid2, int i2) {
        return get(buildRawString(userJid2.user, userJid2.getServer(), userJid2.getAgent(), i2));
    }

    public static DeviceJid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return get(str);
        } catch (AnonymousClass1W4 unused) {
            return null;
        }
    }

    public static DeviceJid of(Jid jid) {
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        if (jid instanceof UserJid) {
            return ((UserJid) jid).getPrimaryDevice();
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            DeviceJid deviceJid = (DeviceJid) obj;
            if (this.device == deviceJid.device) {
                return this.userJid.equals(deviceJid.userJid);
            }
        }
        return false;
    }

    public int getDevice() {
        return this.device;
    }

    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass1ZW.A03(4, this.user));
        sb.append(':');
        sb.append(this.device);
        sb.append('@');
        sb.append(getServer());
        return sb.toString();
    }

    public String getRawString() {
        return buildRawString(this.user, getServer(), getAgent(), this.device);
    }

    public abstract String getServer();

    public abstract int getType();

    public UserJid getUserJid() {
        return this.userJid;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.userJid.hashCode()) * 31) + this.device;
    }

    public boolean isPrimary() {
        return this.device == 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.userJid, i2);
        parcel.writeByte(this.device);
    }
}
