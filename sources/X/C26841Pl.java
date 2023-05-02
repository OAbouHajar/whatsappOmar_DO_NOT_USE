package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.obwhatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller;
import com.whatsapp.util.Log;

/* renamed from: X.1Pl  reason: invalid class name and case insensitive filesystem */
public class C26841Pl {
    public final AnonymousClass01V A00;
    public final C16440t3 A01;
    public final C16980tz A02;
    public final C15860rz A03;
    public final AnonymousClass1KP A04;
    public final AccountDefenceFetchDeviceConfirmationPoller A05;
    public final C26831Pk A06;
    public final C16320sq A07;

    public C26841Pl(AnonymousClass01V r1, C16440t3 r2, C16980tz r3, C15860rz r4, AnonymousClass1KP r5, AccountDefenceFetchDeviceConfirmationPoller accountDefenceFetchDeviceConfirmationPoller, C26831Pk r7, C16320sq r8) {
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r8;
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = accountDefenceFetchDeviceConfirmationPoller;
    }

    public void A00() {
        Log.i("AccountDefenceDataManager/resetRegistration");
        A01();
        C26831Pk r1 = this.A06;
        Log.i("AccountDefenceLocalDataRepository/clearAllData");
        SharedPreferences.Editor edit = r1.A01.A00("AccountDefenceLocalDataRepository_prefs").edit();
        edit.clear();
        if (!edit.commit()) {
            Log.e("AccountDefenceLocalDataRepository/clearAllData/error");
        }
    }

    public void A01() {
        Log.i("AccountDefenceDataManager/stopFetchingDeviceConfirmation");
        this.A05.A00();
    }

    public void A02(AnonymousClass5S6 r6, String str, String str2) {
        Log.i("AccountDefenceDataManager/startFetchingDeviceConfirmation");
        AnonymousClass4L4 r3 = new AnonymousClass4L4(r6, str, str2);
        AccountDefenceFetchDeviceConfirmationPoller accountDefenceFetchDeviceConfirmationPoller = this.A05;
        synchronized (accountDefenceFetchDeviceConfirmationPoller) {
            Log.i("FetchDeviceConfirmationPoller/onRequestComplete/startPolling");
            if (accountDefenceFetchDeviceConfirmationPoller.A01 == null) {
                accountDefenceFetchDeviceConfirmationPoller.A01 = new AnonymousClass1WA(accountDefenceFetchDeviceConfirmationPoller.A07, false);
            }
            accountDefenceFetchDeviceConfirmationPoller.A08.set(false);
            accountDefenceFetchDeviceConfirmationPoller.A00 = System.currentTimeMillis();
            accountDefenceFetchDeviceConfirmationPoller.A01.execute(new RunnableRunnableShape10S0200000_I0_8(accountDefenceFetchDeviceConfirmationPoller, 20, r3));
        }
    }
}
