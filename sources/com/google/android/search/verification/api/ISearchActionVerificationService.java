package com.google.android.search.verification.api;

import X.AnonymousClass000;
import X.AnonymousClass3K2;
import X.C63683Lc;
import X.C92134h4;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ISearchActionVerificationService extends IInterface {

    public abstract class Stub extends C63683Lc implements ISearchActionVerificationService {
        public static final String DESCRIPTOR = "com.google.android.search.verification.api.ISearchActionVerificationService";
        public static final int TRANSACTION_getVersion = 2;
        public static final int TRANSACTION_isSearchAction = 1;

        public class Proxy extends C92134h4 implements ISearchActionVerificationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            public int getVersion() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            public boolean isSearchAction(Intent intent, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                if (intent == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    intent.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                if (bundle == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    bundle.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean A1O = AnonymousClass000.A1O(transactAndReadException.readInt());
                transactAndReadException.recycle();
                return A1O;
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISearchActionVerificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return queryLocalInterface instanceof ISearchActionVerificationService ? (ISearchActionVerificationService) queryLocalInterface : new Proxy(iBinder);
        }

        public boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
            int i4;
            if (i2 == 1) {
                i4 = isSearchAction((Intent) AnonymousClass3K2.A0N(parcel, Intent.CREATOR), (Bundle) AnonymousClass3K2.A0N(parcel, Bundle.CREATOR));
            } else if (i2 != 2) {
                return false;
            } else {
                i4 = getVersion();
            }
            parcel2.writeNoException();
            parcel2.writeInt(i4);
            return true;
        }
    }

    int getVersion();

    boolean isSearchAction(Intent intent, Bundle bundle);
}
