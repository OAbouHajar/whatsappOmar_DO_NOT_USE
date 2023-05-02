package org.whispersystems.jobqueue.requirements;

import X.C28791Xq;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkRequirement implements Requirement, C28791Xq {
    public transient Context A00;

    public boolean AJT() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.A00.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void Adl(Context context) {
        this.A00 = context;
    }
}
