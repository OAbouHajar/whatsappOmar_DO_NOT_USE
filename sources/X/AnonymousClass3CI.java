package X;

import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import com.obwhatsapp.migration.transfer.service.DonorDeviceTransferService;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/* renamed from: X.3CI  reason: invalid class name */
public class AnonymousClass3CI implements WifiP2pManager.ConnectionInfoListener {
    public final /* synthetic */ AnonymousClass2S9 A00;

    public AnonymousClass3CI(AnonymousClass2S9 r1) {
        this.A00 = r1;
    }

    public void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
        StringBuilder A0r = AnonymousClass000.A0r("fpm/DonorWifiDirectManager/Connection information available. group_formed: ");
        A0r.append(wifiP2pInfo.groupFormed);
        A0r.append(" group_owner: ");
        A0r.append(wifiP2pInfo.isGroupOwner);
        C13680ns.A1V(A0r);
        AnonymousClass4IJ r1 = this.A00.A01;
        if (r1 == null) {
            return;
        }
        if (!wifiP2pInfo.isGroupOwner) {
            InetAddress inetAddress = wifiP2pInfo.groupOwnerAddress;
            if (inetAddress != null && inetAddress.getHostAddress() != null) {
                String hostAddress = wifiP2pInfo.groupOwnerAddress.getHostAddress();
                try {
                    Log.i("fpm/DonorDeviceTransferService/Creating a socket");
                    DonorDeviceTransferService donorDeviceTransferService = r1.A01;
                    C82394Cq r0 = donorDeviceTransferService.A01;
                    C87914Zd r4 = r1.A00;
                    C16150sX r02 = r0.A00.A02;
                    Socket createSocket = new C78353xn(C16150sX.A0V(r02), r4, (C219716d) r02.AGh.get()).createSocket();
                    C82384Cp r03 = donorDeviceTransferService.A00;
                    String str = r4.A00;
                    C610237a r42 = new C610237a((C26611Ol) r03.A00.A02.A7M.get(), new C82784Ed(donorDeviceTransferService), str, hostAddress, createSocket);
                    donorDeviceTransferService.A04 = r42;
                    r42.start();
                } catch (IOException unused) {
                    Log.e("fpm/DonorDeviceTransferService/Failed to create ssl socket");
                }
            }
        } else {
            throw AnonymousClass000.A0a("Donor can't be a group owner");
        }
    }
}
