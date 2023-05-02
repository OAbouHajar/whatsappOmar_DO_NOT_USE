package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11710jD;

public final class Action {
    public static final Action A00 = new Action(65538);
    public static final Action A01 = new Action(65539);
    public static final Action A02 = new Action(65540);
    public final CarColor mBackgroundColor;
    public final int mFlags;
    public final CarIcon mIcon;
    public final C11710jD mOnClickDelegate;
    public final CarText mTitle;
    public final int mType;

    public Action() {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.A00;
        this.mOnClickDelegate = null;
        this.mType = 1;
        this.mFlags = 0;
    }

    public Action(int i2) {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.A00;
        this.mOnClickDelegate = null;
        this.mType = i2;
        this.mFlags = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return AnonymousClass09S.A00(this.mTitle, action.mTitle) && this.mType == action.mType && AnonymousClass09S.A00(this.mIcon, action.mIcon) && AnonymousClass09S.A01(Boolean.valueOf(AnonymousClass000.A1W(this.mOnClickDelegate)), AnonymousClass000.A1W(action.mOnClickDelegate)) && AnonymousClass09S.A00(Integer.valueOf(this.mFlags), Integer.valueOf(action.mFlags));
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        boolean z2 = false;
        objArr[0] = this.mTitle;
        AnonymousClass000.A1L(objArr, this.mType);
        objArr[2] = Boolean.valueOf(AnonymousClass000.A1W(this.mOnClickDelegate));
        if (this.mIcon == null) {
            z2 = true;
        }
        return AnonymousClass000.A0F(Boolean.valueOf(z2), objArr, 3);
    }

    public String toString() {
        String str;
        StringBuilder A0r = AnonymousClass000.A0r("[type: ");
        int i2 = this.mType;
        if (i2 != 1) {
            switch (i2) {
                case 65538:
                    str = "APP_ICON";
                    break;
                case 65539:
                    str = "BACK";
                    break;
                case 65540:
                    str = "PAN";
                    break;
                default:
                    str = "<unknown>";
                    break;
            }
        } else {
            str = "CUSTOM";
        }
        A0r.append(str);
        A0r.append(", icon: ");
        A0r.append(this.mIcon);
        A0r.append(", bkg: ");
        A0r.append(this.mBackgroundColor);
        return AnonymousClass000.A0h("]", A0r);
    }
}
