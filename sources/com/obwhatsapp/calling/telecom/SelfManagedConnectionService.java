package com.obwhatsapp.calling.telecom;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C13690nt;
import X.C216514x;
import android.content.Intent;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import com.whatsapp.util.Log;

public class SelfManagedConnectionService extends ConnectionService implements AnonymousClass006 {
    public C216514x A00;
    public boolean A01;
    public final Object A02;
    public volatile AnonymousClass54I A03;

    public SelfManagedConnectionService() {
        this(0);
    }

    public SelfManagedConnectionService(int i2) {
        this.A02 = C13690nt.A0Y();
        this.A01 = false;
    }

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new AnonymousClass54I(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public void onCreate() {
        if (!this.A01) {
            this.A01 = true;
            ((AnonymousClass54H) generatedComponent()).A00(this);
        }
        super.onCreate();
        Log.i("voip/SelfManagedConnectionService/onCreate");
    }

    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i(AnonymousClass000.A0g("voip/SelfManagedConnectionService/onCreateIncomingConnection ", connectionRequest));
        Connection A022 = this.A00.A02(connectionRequest, false);
        return A022 == null ? Connection.createFailedConnection(new DisconnectCause(1)) : A022;
    }

    public void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i(AnonymousClass000.A0g("voip/SelfManagedConnectionService/onCreateIncomingConnectionFailed ", connectionRequest));
        this.A00.A06(connectionRequest);
    }

    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i(AnonymousClass000.A0g("voip/SelfManagedConnectionService/onCreateOutgoingConnection ", connectionRequest));
        Connection A022 = this.A00.A02(connectionRequest, true);
        return A022 == null ? Connection.createFailedConnection(new DisconnectCause(1)) : A022;
    }

    public void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i(AnonymousClass000.A0g("voip/SelfManagedConnectionService/onCreateOutgoingConnectionFailed ", connectionRequest));
        this.A00.A07(connectionRequest);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("voip/SelfManagedConnectionService/onDestroy");
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        Log.i(AnonymousClass000.A0g("voip/SelfManagedConnectionService/onStartCommand ", intent));
        return super.onStartCommand(intent, i2, i3);
    }

    public boolean onUnbind(Intent intent) {
        Log.i(AnonymousClass000.A0g("voip/SelfManagedConnectionService/onUnbind ", intent));
        return super.onUnbind(intent);
    }
}
