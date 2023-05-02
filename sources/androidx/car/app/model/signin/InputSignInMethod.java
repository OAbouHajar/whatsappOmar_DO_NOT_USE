package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11670j9;
import X.C11790jL;
import androidx.car.app.model.CarText;

public final class InputSignInMethod implements C11790jL {
    public final CarText mDefaultValue = null;
    public final CarText mErrorMessage = null;
    public final CarText mHint = null;
    public final C11670j9 mInputCallbackDelegate = null;
    public final int mInputType = 1;
    public final int mKeyboardType = 1;
    public final boolean mShowKeyboardByDefault = false;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputSignInMethod)) {
            return false;
        }
        InputSignInMethod inputSignInMethod = (InputSignInMethod) obj;
        return this.mInputType == inputSignInMethod.mInputType && this.mKeyboardType == inputSignInMethod.mKeyboardType && this.mShowKeyboardByDefault == inputSignInMethod.mShowKeyboardByDefault && AnonymousClass09S.A00(this.mHint, inputSignInMethod.mHint) && AnonymousClass09S.A00(this.mDefaultValue, inputSignInMethod.mDefaultValue) && AnonymousClass09S.A00(this.mErrorMessage, inputSignInMethod.mErrorMessage);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.mHint;
        objArr[1] = this.mDefaultValue;
        objArr[2] = Integer.valueOf(this.mInputType);
        objArr[3] = this.mErrorMessage;
        objArr[4] = Integer.valueOf(this.mKeyboardType);
        return AnonymousClass000.A0F(Boolean.valueOf(this.mShowKeyboardByDefault), objArr, 5);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[inputType:");
        A0r.append(this.mInputType);
        A0r.append(", keyboardType: ");
        A0r.append(this.mKeyboardType);
        return AnonymousClass000.A0h("]", A0r);
    }
}
