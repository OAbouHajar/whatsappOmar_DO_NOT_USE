package com.facebook.redex;

import X.AnonymousClass2GK;
import X.AnonymousClass2RG;
import X.AnonymousClass2RH;
import X.AnonymousClass3W3;
import X.AnonymousClass4L0;
import X.AnonymousClass4L1;
import X.C17210ui;
import X.C18730xA;
import X.C18740xB;
import X.C18750xC;
import X.C29151a7;
import X.C34121jj;
import X.C62103Bq;
import X.C72083lX;
import android.accounts.Account;
import android.content.Intent;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.obwhatsapp.service.MDSyncService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;

public class RunnableRunnableShape0S1101000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    public RunnableRunnableShape0S1101000_I0(Object obj, String str, int i2, int i3) {
        this.A03 = i3;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = i2;
    }

    public final void run() {
        ArrayList arrayList;
        int i2;
        switch (this.A03) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
                String str = this.A02;
                int i3 = this.A00;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restore>RestoreFromBackupActivity/auth-request/asking GoogleAuthUtil for token for ");
                    sb.append(AnonymousClass2GK.A0B(str));
                    Log.i(sb.toString());
                    restoreFromBackupActivity.A0g = C62103Bq.A01(new Account(str, "com.google"), restoreFromBackupActivity);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restore>RestoreFromBackupActivity/auth-request/for account ");
                    sb2.append(AnonymousClass2GK.A0B(str));
                    sb2.append(", token has been received.");
                    Log.i(sb2.toString());
                    Intent intent = new Intent();
                    intent.putExtra("authtoken", restoreFromBackupActivity.A0g);
                    intent.putExtra("authAccount", str);
                    restoreFromBackupActivity.onActivityResult(i3, -1, intent);
                    restoreFromBackupActivity.A0o.open();
                    return;
                } catch (AnonymousClass3W3 e2) {
                    restoreFromBackupActivity.A05.A0K(new RunnableRunnableShape3S0100000_I0_2(restoreFromBackupActivity, 23));
                    Log.e("restore>RestoreFromBackupActivity/google-play-services-unavailable", e2);
                    restoreFromBackupActivity.A0g = null;
                    return;
                } catch (AnonymousClass2RG e3) {
                    restoreFromBackupActivity.A0o.close();
                    restoreFromBackupActivity.A0g = null;
                    restoreFromBackupActivity.A3O((C34121jj) null, 25);
                    restoreFromBackupActivity.A05.A0K(new RunnableRunnableShape0S0201000_I0((Object) restoreFromBackupActivity, i3, (Object) e3, 8));
                    return;
                } catch (IOException e4) {
                    Log.e("restore>RestoreFromBackupActivity/auth-request", e4);
                    restoreFromBackupActivity.A0g = null;
                    restoreFromBackupActivity.A0o.open();
                    restoreFromBackupActivity.A05.A0K(new RunnableRunnableShape3S0100000_I0_2(restoreFromBackupActivity, 19));
                    return;
                } catch (AnonymousClass2RH | SecurityException e5) {
                    Log.e("restore>RestoreFromBackupActivity/auth-request", e5);
                    restoreFromBackupActivity.A0g = null;
                    restoreFromBackupActivity.A0o.open();
                    restoreFromBackupActivity.A05.A0K(new RunnableRunnableShape0S1100000_I0(11, str, restoreFromBackupActivity));
                    return;
                }
            case 1:
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A01;
                int i4 = this.A00;
                String str2 = this.A02;
                businessDirectoryContextualSearchViewModel.A0C.removeCallbacks(businessDirectoryContextualSearchViewModel.A06);
                if (i4 == -1) {
                    businessDirectoryContextualSearchViewModel.A0T.A06();
                    arrayList = new ArrayList(businessDirectoryContextualSearchViewModel.A08());
                    i2 = 1;
                } else if (i4 == 1 || i4 == 2 || i4 == 3) {
                    businessDirectoryContextualSearchViewModel.A0T.A06();
                    arrayList = new ArrayList(businessDirectoryContextualSearchViewModel.A08());
                    i2 = 2;
                } else if (i4 == 4) {
                    C17210ui r4 = businessDirectoryContextualSearchViewModel.A0N;
                    C29151a7 r2 = new C29151a7();
                    r2.A0B = 46;
                    r2.A0N = 1L;
                    r2.A0A = 6;
                    r4.A06(r2);
                    businessDirectoryContextualSearchViewModel.A0d.A09(2);
                    return;
                } else {
                    return;
                }
                arrayList.add(new C72083lX(businessDirectoryContextualSearchViewModel, str2, i2));
                C17210ui r42 = businessDirectoryContextualSearchViewModel.A0N;
                Integer valueOf = Integer.valueOf(i2);
                C29151a7 r22 = new C29151a7();
                r22.A0B = 46;
                r22.A0N = 1L;
                r22.A0A = valueOf;
                r42.A06(r22);
                businessDirectoryContextualSearchViewModel.A0G.A09(arrayList);
                return;
            case 2:
                C18750xC r7 = (C18750xC) this.A01;
                String str3 = this.A02;
                int i5 = this.A00;
                AnonymousClass4L1 r1 = (AnonymousClass4L1) r7.A03.get(str3);
                if (r1 != null) {
                    int i6 = r1.A01;
                    int i7 = r1.A00;
                    UserJid userJid = r1.A02;
                    Integer A002 = C18740xB.A00(i6);
                    if (A002 != null) {
                        AnonymousClass4L0 r23 = new AnonymousClass4L0(userJid, "smax", false);
                        C18730xA r12 = r7.A01;
                        int intValue = A002.intValue();
                        if (i5 == 0) {
                            r12.A02(r23, intValue, i7);
                            return;
                        } else {
                            r12.A01(r23, intValue, i7);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                MDSyncService mDSyncService = (MDSyncService) this.A01;
                String str4 = this.A02;
                int i8 = this.A00;
                mDSyncService.A08 = str4;
                mDSyncService.A03(i8);
                return;
        }
    }
}
