package com.facebook.redex;

import X.AnonymousClass12Q;
import X.AnonymousClass1KL;
import X.AnonymousClass2JE;
import X.AnonymousClass2YL;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

public class IDxSConnectionShape327S0100000_2_I0 implements ServiceConnection {
    public Object A00;
    public final int A01;

    public IDxSConnectionShape327S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        switch (this.A01) {
            case 0:
                AnonymousClass2YL r2 = (AnonymousClass2YL) this.A00;
                r2.A0W.set(true);
                AnonymousClass12Q r1 = r2.A0H;
                if (!r1.A0B) {
                    r1.A03();
                }
                r2.A0U.open();
                break;
            case 1:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                restoreFromBackupActivity.A0w.set(true);
                restoreFromBackupActivity.A0m.open();
                restoreFromBackupActivity.A0I.A02(restoreFromBackupActivity.A0p);
                AnonymousClass1KL r0 = restoreFromBackupActivity.A0C;
                r0.A00.A02(restoreFromBackupActivity.A0q);
                return;
            case 2:
                SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = (SettingsGoogleDriveViewModel) this.A00;
                settingsGoogleDriveViewModel.A0e.set(true);
                AnonymousClass12Q r12 = settingsGoogleDriveViewModel.A0W;
                if (!r12.A0B) {
                    r12.A03();
                }
                settingsGoogleDriveViewModel.A0c.Acl(new RunnableRunnableShape17S0100000_I1((Object) this, 20));
                settingsGoogleDriveViewModel.A01.open();
                settingsGoogleDriveViewModel.A07();
                break;
            default:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                conversationsFragment.A16 = new AnonymousClass2JE(conversationsFragment);
                conversationsFragment.A2M.Acl(new RunnableRunnableShape18S0100000_I1_1((Object) this, 15));
                str = "conversations/gdrive-service-connected";
                break;
        }
        str = "settings-gdrive/service-connected";
        Log.i(str);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ConditionVariable conditionVariable;
        String str;
        switch (this.A01) {
            case 0:
                AnonymousClass2YL r2 = (AnonymousClass2YL) this.A00;
                r2.A0W.set(false);
                conditionVariable = r2.A0U;
                break;
            case 1:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                restoreFromBackupActivity.A0j = false;
                if (!restoreFromBackupActivity.A0w.compareAndSet(true, false)) {
                    restoreFromBackupActivity.A0I.A03(restoreFromBackupActivity.A0p);
                    AnonymousClass1KL r0 = restoreFromBackupActivity.A0C;
                    r0.A00.A03(restoreFromBackupActivity.A0q);
                    restoreFromBackupActivity.A0m.close();
                    return;
                }
                return;
            case 2:
                SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = (SettingsGoogleDriveViewModel) this.A00;
                settingsGoogleDriveViewModel.A0e.set(false);
                conditionVariable = settingsGoogleDriveViewModel.A01;
                break;
            default:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                conversationsFragment.A0W.A03(conversationsFragment.A16);
                str = "conversations/gdrive-service-disconnected";
                break;
        }
        conditionVariable.close();
        str = "settings-gdrive/service-disconnected";
        Log.i(str);
    }
}
