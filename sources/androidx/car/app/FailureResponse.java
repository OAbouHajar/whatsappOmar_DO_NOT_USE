package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C03930Kl;
import android.os.RemoteException;
import android.util.Log;
import java.security.InvalidParameterException;

public final class FailureResponse {
    public final int mErrorType;
    public final String mStackTrace;

    public FailureResponse() {
        this.mStackTrace = null;
        this.mErrorType = 0;
    }

    public FailureResponse(Throwable th) {
        int i2;
        this.mStackTrace = Log.getStackTraceString(th);
        if (th instanceof C03930Kl) {
            i2 = 1;
        } else if (th instanceof IllegalStateException) {
            i2 = 2;
        } else if (th instanceof InvalidParameterException) {
            i2 = 3;
        } else if (th instanceof SecurityException) {
            i2 = 4;
        } else if (th instanceof RuntimeException) {
            i2 = 5;
        } else {
            i2 = 0;
            if (th instanceof RemoteException) {
                i2 = 6;
            }
        }
        this.mErrorType = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FailureResponse)) {
            return false;
        }
        FailureResponse failureResponse = (FailureResponse) obj;
        return this.mErrorType == failureResponse.mErrorType && AnonymousClass09S.A00(this.mStackTrace, failureResponse.mStackTrace);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        AnonymousClass000.A1K(objArr, this.mErrorType);
        return AnonymousClass000.A0F(this.mStackTrace, objArr, 1);
    }
}
