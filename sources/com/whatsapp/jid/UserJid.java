package com.whatsapp.jid;

import X.AnonymousClass1W4;
import X.AnonymousClass1ZW;
import X.C15830rv;
import X.C34921l5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public abstract class UserJid extends C15830rv implements Parcelable {
    public static final C34921l5 JID_FACTORY = C34921l5.A00();

    public UserJid(Parcel parcel) {
        super(parcel);
    }

    public UserJid(String str) {
        super(str);
    }

    public static UserJid get(String str) {
        Jid jid = Jid.get(str);
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        throw new AnonymousClass1W4(str);
    }

    public static UserJid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return get(str);
        } catch (AnonymousClass1W4 unused) {
            return null;
        }
    }

    public static UserJid of(Jid jid) {
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        return null;
    }

    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass1ZW.A03(4, this.user));
        sb.append('@');
        sb.append(getServer());
        return sb.toString();
    }

    public DeviceJid getPrimaryDevice() {
        try {
            return DeviceJid.getFromUserJidAndDeviceId(this, 0);
        } catch (AnonymousClass1W4 e2) {
            throw new IllegalStateException(e2);
        }
    }

    public abstract String getServer();

    public abstract int getType();
}
