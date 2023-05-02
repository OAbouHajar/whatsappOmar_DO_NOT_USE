package com.whatsapp.jid;

import X.AnonymousClass1W4;
import X.C16060sN;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public abstract class GroupJid extends C16060sN implements Parcelable {
    public GroupJid(Parcel parcel) {
        super(parcel);
    }

    public GroupJid(String str) {
        super(str);
    }

    public static GroupJid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof GroupJid) {
                return (GroupJid) jid;
            }
            throw new AnonymousClass1W4(str);
        } catch (AnonymousClass1W4 unused) {
            return null;
        }
    }

    public static GroupJid of(Jid jid) {
        if (jid instanceof GroupJid) {
            return (GroupJid) jid;
        }
        return null;
    }
}
