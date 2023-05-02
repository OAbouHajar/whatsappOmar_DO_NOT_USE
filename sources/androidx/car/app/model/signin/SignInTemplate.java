package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11770jJ;
import X.C11790jL;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;

public final class SignInTemplate implements C11770jJ {
    public final List mActionList = Collections.emptyList();
    public final ActionStrip mActionStrip = null;
    public final CarText mAdditionalText = null;
    public final Action mHeaderAction = null;
    public final CarText mInstructions = null;
    public final boolean mIsLoading = false;
    public final C11790jL mSignInMethod = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInTemplate)) {
            return false;
        }
        SignInTemplate signInTemplate = (SignInTemplate) obj;
        return this.mIsLoading == signInTemplate.mIsLoading && AnonymousClass09S.A00(this.mHeaderAction, signInTemplate.mHeaderAction) && AnonymousClass09S.A00(this.mTitle, signInTemplate.mTitle) && AnonymousClass09S.A00(this.mInstructions, signInTemplate.mInstructions) && AnonymousClass09S.A00(this.mAdditionalText, signInTemplate.mAdditionalText) && AnonymousClass09S.A00(this.mActionStrip, signInTemplate.mActionStrip) && AnonymousClass09S.A00(this.mActionList, signInTemplate.mActionList) && AnonymousClass09S.A00(this.mSignInMethod, signInTemplate.mSignInMethod);
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        AnonymousClass000.A1N(objArr, this.mIsLoading);
        objArr[1] = this.mHeaderAction;
        objArr[2] = this.mTitle;
        objArr[3] = this.mInstructions;
        objArr[4] = this.mAdditionalText;
        objArr[5] = this.mActionStrip;
        objArr[6] = this.mActionList;
        return AnonymousClass000.A0F(this.mSignInMethod, objArr, 7);
    }

    public String toString() {
        return "SignInTemplate";
    }
}
