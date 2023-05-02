package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.TrafficStats;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.obwhatsapp.calling.MultiNetworkCallback;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2jD  reason: invalid class name and case insensitive filesystem */
public class C55282jD {
    public ConnectivityManager.NetworkCallback A00;
    public Network A01;
    public DatagramSocket A02;
    public boolean A03 = false;
    public final ConnectivityManager A04;
    public final AnonymousClass4DT A05;
    public final C23441Bz A06;
    public final ScheduledExecutorService A07;

    public C55282jD(ConnectivityManager connectivityManager, C23441Bz r4) {
        AnonymousClass4DT r1 = new AnonymousClass4DT(r4);
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.A04 = connectivityManager;
        this.A05 = r1;
        this.A07 = newSingleThreadScheduledExecutor;
        this.A06 = r4;
    }

    public static /* synthetic */ void A02(C55282jD r2) {
        AnonymousClass00B.A0B("provider must not have already shutdown", r2.A03);
        if (!r2.A03) {
            Log.e("voip/weak-wifi/shutdown: provider is already shutdown");
            return;
        }
        r2.A0A(true);
        Voip.nativeUnregisterMultiNetworkCallback();
        r2.A03 = false;
    }

    public static /* synthetic */ void A03(C55282jD r3) {
        AnonymousClass00B.A0B("provider must not have already started", !r3.A03);
        if (r3.A03) {
            Log.e("voip/weak-wifi/startup: provider is already started");
            return;
        }
        Voip.nativeRegisterMultiNetworkCallback(new MultiNetworkCallback(r3));
        r3.A03 = true;
    }

    public static /* synthetic */ void A05(C55282jD r1, boolean z2) {
        if (!r1.A03) {
            Log.i("voip/weak-wifi/closeAlternativeSocket: provider is not running");
        } else {
            r1.A0A(z2);
        }
    }

    public static /* synthetic */ void A06(C55282jD r6, boolean z2, boolean z3) {
        String str;
        if (!r6.A03) {
            Log.i("voip/weak-wifi/createAlternativeSocket: provider is not running");
        } else if (r6.A01 != null) {
            StringBuilder sb = new StringBuilder("voip/weak-wifi/re-use-alt-network: ");
            sb.append(z2 ? "cellular" : "wifi");
            sb.append("; test_network_cond=");
            sb.append(z3 ? "true" : "false");
            Log.i(sb.toString());
            if (r6.A02 != null) {
                Log.i("voip/weak-wifi/create-alt-sock: previously created sock was not closed");
                Voip.notifyFailureToCreateAlternativeSocket(z3);
                return;
            }
            r6.A09(r6.A01, z3);
        } else {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            if (z2) {
                builder.addTransportType(0);
                str = "voip/weak-wifi/alt-network: cellular";
            } else {
                builder.addTransportType(1);
                str = "voip/weak-wifi/alt-network: wifi";
            }
            Log.i(str);
            builder.addCapability(12);
            r6.A00 = new AnonymousClass3LQ(r6, r6.A07.schedule(new AnonymousClass55T(r6, z3), 5000, TimeUnit.MILLISECONDS), z3);
            int i2 = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = r6.A04;
            NetworkRequest build = builder.build();
            ConnectivityManager.NetworkCallback networkCallback = r6.A00;
            if (i2 >= 26) {
                connectivityManager.requestNetwork(build, networkCallback, 5000);
            } else {
                connectivityManager.requestNetwork(build, networkCallback);
            }
        }
    }

    public void A07() {
        ScheduledExecutorService scheduledExecutorService = this.A07;
        scheduledExecutorService.execute(new RunnableRunnableShape4S0100000_I0_3(this, 36));
        scheduledExecutorService.shutdown();
    }

    public void A08() {
        this.A07.execute(new RunnableRunnableShape4S0100000_I0_3(this, 37));
    }

    public final void A09(Network network, boolean z2) {
        DatagramSocket datagramSocket;
        String str;
        boolean z3 = false;
        boolean z4 = false;
        if (this.A02 == null) {
            z4 = true;
        }
        AnonymousClass00B.A0B("alternative socket must not have created", z4);
        if (this.A02 != null) {
            Log.i("voip/weak-wifi/alt-sock: socket already created");
        } else {
            try {
                TrafficStats.setThreadStatsTag(15);
                this.A01 = network;
                DatagramSocket datagramSocket2 = new DatagramSocket();
                this.A02 = datagramSocket2;
                this.A01.bindSocket(datagramSocket2);
                z3 = true;
            } catch (SocketException unused) {
                str = "voip/weak-wifi/create-sock: socket exception to create alternative socket.";
            } catch (IOException unused2) {
                str = "voip/weak-wifi/create-sock: io exception to bind socket to alternative network.";
            }
            datagramSocket = this.A02;
            if (datagramSocket != null || !z3) {
                A0A(true);
            } else {
                String str2 = null;
                try {
                    datagramSocket.connect(network.getByName("1.1.1.1"), 53);
                    InetAddress localAddress = this.A02.getLocalAddress();
                    if (!localAddress.isAnyLocalAddress()) {
                        str2 = localAddress.getHostAddress();
                    }
                    this.A02.disconnect();
                } catch (UnknownHostException unused3) {
                    Log.e("voip/weak-wifi/create-sock: unknown host exception to retrieve local ip.");
                }
                int detachFd = ParcelFileDescriptor.fromDatagramSocket(this.A02).detachFd();
                int localPort = this.A02.getLocalPort();
                StringBuilder sb = new StringBuilder("voip/weak-wifi/create-sock: ip=");
                sb.append(str2);
                sb.append("; port=");
                sb.append(localPort);
                sb.append("; fd=");
                sb.append(detachFd);
                sb.append("; test_network_cond = ");
                sb.append(z2);
                Log.i(sb.toString());
                if (z2) {
                    Voip.startTestNetworkConditionWithAlternativeSocket(detachFd, str2, localPort);
                    return;
                } else {
                    Voip.switchNetworkWithAlternativeSocket(detachFd, str2, localPort);
                    return;
                }
            }
        }
        Voip.notifyFailureToCreateAlternativeSocket(z2);
        Log.e(str);
        datagramSocket = this.A02;
        if (datagramSocket != null) {
        }
        A0A(true);
        Voip.notifyFailureToCreateAlternativeSocket(z2);
    }

    public final void A0A(boolean z2) {
        if (this.A02 != null) {
            Log.i("voip/weak-wifi/close-sock");
            this.A02.close();
            this.A02 = null;
        }
        if (z2) {
            ConnectivityManager.NetworkCallback networkCallback = this.A00;
            if (networkCallback != null) {
                try {
                    this.A04.unregisterNetworkCallback(networkCallback);
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: succeeded.");
                } catch (IllegalArgumentException unused) {
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: failed.");
                }
                this.A00 = null;
            }
            this.A01 = null;
        }
    }
}
