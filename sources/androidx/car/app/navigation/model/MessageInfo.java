package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11800jM;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;

public final class MessageInfo implements C11800jM {
    public final CarIcon mImage = null;
    public final CarText mText = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return AnonymousClass09S.A00(this.mTitle, messageInfo.mTitle) && AnonymousClass09S.A00(this.mText, messageInfo.mText) && AnonymousClass09S.A00(this.mImage, messageInfo.mImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mTitle;
        objArr[1] = this.mText;
        return AnonymousClass000.A0F(this.mImage, objArr, 2);
    }

    public String toString() {
        return "MessageInfo";
    }
}
