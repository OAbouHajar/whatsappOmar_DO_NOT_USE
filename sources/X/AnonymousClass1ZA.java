package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.Main;
import com.obwhatsapp.accountsync.ProfileActivity;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.contact.picker.ContactPicker;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.1ZA  reason: invalid class name */
public abstract class AnonymousClass1ZA extends AnonymousClass1ZB {
    public AnonymousClass2RY A00;
    public AnonymousClass11N A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass1ZA() {
        this(false, true);
    }

    public AnonymousClass1ZA(boolean z2, boolean z3) {
        this.A03 = z2;
        this.A02 = z3;
    }

    public C19760yx A35() {
        return this instanceof VoipActivityV2 ? ((VoipActivityV2) this).A1X : this instanceof RegisterName ? ((RegisterName) this).A17 : this instanceof ContactPicker ? ((ContactPicker) this).A07 : this instanceof RestoreFromBackupActivity ? ((RestoreFromBackupActivity) this).A0a : this instanceof ProfileActivity ? ((ProfileActivity) this).A07 : ((Main) this).A0D;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ee, code lost:
        if (r3.A0F == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f4, code lost:
        if (r3.isFinishing() != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        r3.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f9, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0173, code lost:
        if (((android.content.SharedPreferences) r3.A09.A01.get()).getBoolean("support_ban_appeal_screen_before_verification", false) != false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0175, code lost:
        r4 = new android.content.Intent();
        r4.setClassName(r3.getPackageName(), "com.obwhatsapp.userban.ui.BanAppealActivity");
        r4.putExtra("launch_source", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0190, code lost:
        r3.A0D.A0A(4);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0199, code lost:
        if (r4 != 9) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019b, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019c, code lost:
        r4 = X.C14750ph.A0B(r3, r1, r3.A00.A03(), false, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A36() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof com.whatsapp.voipcalling.VoipActivityV2
            if (r0 == 0) goto L_0x000f
            r0 = r12
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r0.A1L
        L_0x0009:
            if (r0 == 0) goto L_0x000e
            r0.A1K()
        L_0x000e:
            return
        L_0x000f:
            boolean r0 = r12 instanceof com.obwhatsapp.registration.RegisterName
            if (r0 == 0) goto L_0x006a
            r5 = r12
            com.obwhatsapp.registration.RegisterName r5 = (com.obwhatsapp.registration.RegisterName) r5
            android.content.Intent r0 = r5.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r10 = 0
            if (r0 == 0) goto L_0x005d
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "debug"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 == 0) goto L_0x005d
            X.0sK r0 = r5.A01
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.String r3 = r0.cc
            java.lang.String r1 = r0.number
            X.0rz r0 = r5.A09
        L_0x003d:
            java.lang.String r0 = r0.A0P()
            com.obwhatsapp.Me r2 = new com.obwhatsapp.Me
            r2.<init>(r3, r1, r0)
            java.lang.String r0 = r2.jabber_id
            r3 = 1
            if (r0 != 0) goto L_0x024c
            java.lang.String r0 = "RegisterName/messagestoreverified/missing-params bounce to regphone"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0yx r0 = r5.A17
            r0.A0A(r3)
            android.content.Intent r0 = X.C14750ph.A06(r5)
            r5.A2X(r0, r3)
            return
        L_0x005d:
            X.0yx r0 = r5.A17
            X.0rz r0 = r0.A0O
            java.lang.String r3 = r0.A0O()
            java.lang.String r1 = r0.A0Q()
            goto L_0x003d
        L_0x006a:
            boolean r0 = r12 instanceof com.obwhatsapp.contact.picker.ContactPicker
            if (r0 == 0) goto L_0x0074
            r0 = r12
            com.obwhatsapp.contact.picker.ContactPicker r0 = (com.obwhatsapp.contact.picker.ContactPicker) r0
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r0.A05
            goto L_0x0009
        L_0x0074:
            boolean r0 = r12 instanceof com.obwhatsapp.accountsync.ProfileActivity
            if (r0 == 0) goto L_0x009c
            r3 = r12
            com.obwhatsapp.accountsync.ProfileActivity r3 = (com.obwhatsapp.accountsync.ProfileActivity) r3
            X.0ul r0 = r3.A05
            boolean r0 = r0.A13
            if (r0 == 0) goto L_0x0392
            X.2Rx r0 = r3.A00
            if (r0 == 0) goto L_0x008c
            int r1 = r0.A03()
            r0 = 1
            if (r1 == r0) goto L_0x000e
        L_0x008c:
            X.2Rx r2 = new X.2Rx
            r2.<init>(r3)
            r3.A00 = r2
            X.0sq r1 = r3.A05
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Ack(r2, r0)
            return
        L_0x009c:
            boolean r0 = r12 instanceof com.obwhatsapp.Main
            if (r0 == 0) goto L_0x000e
            r3 = r12
            com.obwhatsapp.Main r3 = (com.obwhatsapp.Main) r3
            X.0sK r0 = r3.A01
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            if (r0 != 0) goto L_0x01ee
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x00fc
            X.0sC r0 = r3.A09
            int r4 = r0.A00()
            java.lang.String r1 = "Main/messageStoreVerified/registration state is "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 0
            switch(r4) {
                case 0: goto L_0x0102;
                case 1: goto L_0x0112;
                case 2: goto L_0x011c;
                case 3: goto L_0x00cd;
                case 4: goto L_0x0190;
                case 5: goto L_0x0112;
                case 6: goto L_0x0138;
                case 7: goto L_0x0147;
                case 8: goto L_0x018b;
                case 9: goto L_0x0162;
                case 10: goto L_0x0175;
                case 11: goto L_0x01a8;
                case 12: goto L_0x0190;
                case 13: goto L_0x0136;
                case 14: goto L_0x01b8;
                case 15: goto L_0x01da;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            java.lang.String r0 = "main/invalid/registration state="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = "; default to EULA"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0yx r0 = r3.A0D
            r0.A0A(r2)
            android.content.Intent r4 = X.C14750ph.A0n(r3, r2)
        L_0x00ec:
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x00f9
            r3.startActivity(r4)
        L_0x00f9:
            r3.finish()
        L_0x00fc:
            java.lang.String r0 = "main/me App.me is null, can't proceed."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0102:
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "show_registration_first_dlg"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            android.content.Intent r4 = X.C14750ph.A0n(r3, r0)
            goto L_0x00ec
        L_0x0112:
            X.0yx r0 = r3.A0D
            r0.A0A(r2)
            android.content.Intent r4 = X.C14750ph.A0n(r3, r2)
            goto L_0x00ec
        L_0x011c:
            java.lang.String r0 = "main/no-me/regname"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01D r0 = r3.A0E
            java.lang.Object r2 = r0.get()
            X.1BN r2 = (X.AnonymousClass1BN) r2
            java.lang.String r1 = "verification_successful"
            java.lang.String r0 = "continue"
            r2.A04(r1, r0)
            android.content.Intent r4 = X.C14750ph.A05(r3)
            goto L_0x00ec
        L_0x0136:
            r1 = 1
            goto L_0x019c
        L_0x0138:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.account.delete.DeleteAccountConfirmation"
            r4.setClassName(r1, r0)
            goto L_0x00ec
        L_0x0147:
            X.01D r0 = r3.A0E
            java.lang.Object r2 = r0.get()
            X.1BN r2 = (X.AnonymousClass1BN) r2
            java.lang.String r1 = "verification_successful"
            java.lang.String r0 = "continue"
            r2.A04(r1, r0)
            X.129 r0 = r3.A00
            boolean r0 = r0.A03()
            android.content.Intent r4 = X.C14750ph.A0p(r3, r0)
            goto L_0x00ec
        L_0x0162:
            X.0rz r0 = r3.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "support_ban_appeal_screen_before_verification"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x019b
        L_0x0175:
            r2 = 1
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.userban.ui.BanAppealActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "launch_source"
            r4.putExtra(r0, r2)
            goto L_0x00ec
        L_0x018b:
            java.lang.String r0 = "main/messageStoreVerified/registration-state-is-registration-flash-primary"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0190:
            X.0yx r1 = r3.A0D
            r0 = 4
            r1.A0A(r0)
            r0 = 9
            r1 = 0
            if (r4 != r0) goto L_0x019c
        L_0x019b:
            r1 = 3
        L_0x019c:
            X.129 r0 = r3.A00
            boolean r0 = r0.A03()
            android.content.Intent r4 = X.C14750ph.A0B(r3, r1, r0, r2, r2)
            goto L_0x00ec
        L_0x01a8:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.migration.export.ui.ExportMigrationDataExportedActivity"
            r4.setClassName(r1, r0)
            goto L_0x00ec
        L_0x01b8:
            X.129 r0 = r3.A00
            boolean r5 = r0.A03()
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity"
            android.content.Intent r4 = r4.setClassName(r1, r0)
            java.lang.String r0 = "change_number"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "use_sms_retriever"
            r4.putExtra(r0, r2)
            goto L_0x00ec
        L_0x01da:
            X.0yx r1 = r3.A0D
            r0 = 15
            r1.A0A(r0)
            X.129 r0 = r3.A00
            boolean r1 = r0.A03()
            r0 = 1
            android.content.Intent r4 = X.C14750ph.A0B(r3, r2, r1, r2, r0)
            goto L_0x00ec
        L_0x01ee:
            X.0sC r0 = r3.A09
            int r1 = r0.A00()
            r0 = 2
            if (r1 != r0) goto L_0x0221
            java.lang.String r0 = "main/me/regname"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01D r0 = r3.A0E
            java.lang.Object r2 = r0.get()
            X.1BN r2 = (X.AnonymousClass1BN) r2
            java.lang.String r1 = "verification_successful"
            java.lang.String r0 = "continue"
            r2.A04(r1, r0)
            android.content.Intent r1 = X.C14750ph.A05(r3)
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x021d
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x021d
            r3.startActivity(r1)
        L_0x021d:
            r3.finish()
            return
        L_0x0221:
            X.0yx r1 = r3.A0D
            r0 = 3
            r1.A0A(r0)
            java.lang.String r0 = "main/verified/setregverified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ul r0 = r3.A0A
            boolean r0 = r0.A13
            if (r0 == 0) goto L_0x03a6
            X.2S1 r0 = r3.A01
            if (r0 == 0) goto L_0x0396
            int r1 = r0.A03()
            r0 = 1
            if (r1 != r0) goto L_0x0396
            java.lang.String r0 = "main/show dialog sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x000e
            r0 = 104(0x68, float:1.46E-43)
            X.AnonymousClass29T.A01(r3, r0)
            return
        L_0x024c:
            X.0sK r1 = r5.A01
            r1.A0B()
            java.lang.String r0 = "me"
            boolean r0 = r1.A0H(r2, r0)
            if (r0 != 0) goto L_0x025d
            r5.finish()
            return
        L_0x025d:
            X.0sK r0 = r5.A01
            r0.A0B()
            r0.A0D(r2)
            X.01D r0 = r5.A1M
            java.lang.Object r0 = r0.get()
            X.16k r0 = (X.C220416k) r0
            r0.A02(r5)
            X.0rz r1 = r5.A09
            X.0xR r0 = r5.A06
            X.AnonymousClass2S3.A00(r0, r1)
            java.lang.String r0 = "RegisterName/set_dirty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xk r0 = r5.A0r
            r0.A0y = r10
            X.0yx r0 = r5.A17
            r0.A06()
            X.0xk r0 = r5.A0r
            r0.A04()
            java.lang.String r0 = "regname/msgstoreverified/group_sync_required"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ul r1 = r5.A0o
            r0 = 3
            r1.A0E(r0, r3, r3)
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.A00 = r0
            X.0sK r0 = r5.A01
            r0.A0B()
            X.1Zb r0 = r0.A01
            X.AnonymousClass00B.A06(r0)
            r5.A0d = r0
            X.10K r0 = r5.A0c
            X.10J r2 = r0.A02
            r1 = 2413(0x96d, float:3.381E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r1 = r2.A0E(r0, r1)
            r11 = 2
            X.12B r6 = r5.A0x
            X.0sK r0 = r5.A01
            r0.A0B()
            X.1ZT r7 = r0.A05
            if (r1 == 0) goto L_0x038d
            X.279 r9 = new X.279
            r9.<init>(r5)
            r8 = 0
            r6.A02(r7, r8, r9, r10, r11)
        L_0x02c8:
            X.0rz r0 = r5.A09
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r4 = "message_store_verified_time"
            r0 = 0
            long r6 = r2.getLong(r4, r0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x02ef
            X.0rz r2 = r5.A09
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r2.A0K()
            android.content.SharedPreferences$Editor r0 = r2.putLong(r4, r0)
            r0.apply()
        L_0x02ef:
            r5.A3E()
            X.2S5 r0 = r5.A13
            if (r0 == 0) goto L_0x036f
            X.0tq r0 = r5.A0a
            int r0 = r0.A00()
            if (r0 == 0) goto L_0x0343
            java.lang.String r0 = "RegisterName/restoredialog/congrats"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2S5 r0 = r5.A13
            r0.A00(r11)
        L_0x0308:
            X.01D r0 = r5.A1N
            java.lang.Object r0 = r0.get()
            X.1LC r0 = (X.AnonymousClass1LC) r0
            X.0xm r1 = r0.A00
            java.lang.Class<X.1CC> r0 = X.AnonymousClass1CC.class
            X.0vg r1 = r1.A00(r0)
            X.1CC r1 = (X.AnonymousClass1CC) r1
            java.lang.String r0 = "ConsumerBridge/onScheduleGenerateEncryptionKeys()"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.01D r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.1Bs r0 = (X.C23371Bs) r0
            r0.A01()
            X.0sq r2 = r5.A05
            r1 = 20
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.Acl(r0)
            X.0sq r2 = r5.A05
            r1 = 22
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r0 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.Acl(r0)
            return
        L_0x0343:
            java.lang.String r0 = "RegisterName/restoredialog/empty-msg-restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r5.A1W
            if (r0 != 0) goto L_0x0369
            X.0yo r0 = r5.A0C
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0369
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.backup.google.GoogleDriveNewUserSetupActivity"
            r2.setClassName(r1, r0)
            r0 = 15
            r5.Ag3(r2, r0)
            r5.A1W = r3
        L_0x0369:
            r0 = 103(0x67, float:1.44E-43)
            X.AnonymousClass29T.A00(r5, r0)
            goto L_0x0308
        L_0x036f:
            X.0sj r1 = r5.A0T
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            int r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0308
            java.lang.String r0 = "RegisterName/delay google drive setup due to lack of permissions"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r4 = r5.A09
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 + r0
            r4.A0l(r2)
            goto L_0x0308
        L_0x038d:
            r6.A01(r7, r10, r11)
            goto L_0x02c8
        L_0x0392:
            r3.A39()
            return
        L_0x0396:
            X.2S1 r2 = new X.2S1
            r2.<init>(r3)
            r3.A01 = r2
            X.0sq r1 = r3.A05
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Acn(r2, r0)
            return
        L_0x03a6:
            java.lang.String r0 = "main/messageStoreVerified/gotoActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "main/gotoActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A39()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZA.A36():void");
    }

    public void A37(C34121jj r3) {
        ContactPickerFragment contactPickerFragment;
        if (this instanceof VoipActivityV2) {
            contactPickerFragment = ((VoipActivityV2) this).A1L;
        } else if (this instanceof ContactPicker) {
            contactPickerFragment = ((ContactPicker) this).A05;
        } else {
            return;
        }
        if (contactPickerFragment != null) {
            Log.i("contactpicker/notifyAdapter");
            contactPickerFragment.A0w.notifyDataSetChanged();
            ContactPickerFragment.A2z = false;
        }
    }

    public void A38(boolean z2) {
        this.A00.A03(z2, true);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 200) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            AnonymousClass2RY r0 = this.A00;
            if (r0.A07.A03(r0.A06)) {
                this.A00.A02();
            }
        } else {
            A38(false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass11N r1 = this.A01;
        boolean z2 = this.A03;
        boolean z3 = this.A02;
        AnonymousClass2SB r0 = new AnonymousClass2SB(this);
        C16150sX r02 = r1.A00.A00.A01;
        AnonymousClass11L r27 = (AnonymousClass11L) r02.AIx.get();
        C19760yx r28 = (C19760yx) r02.AKx.get();
        C16320sq r29 = (C16320sq) r02.ARB.get();
        boolean z4 = z2;
        boolean z5 = z3;
        AnonymousClass131 r23 = (AnonymousClass131) r02.AFV.get();
        C19090xk r24 = (C19090xk) r02.AF1.get();
        AnonymousClass0y3 r25 = (AnonymousClass0y3) r02.ALd.get();
        C18990xa r26 = (C18990xa) r02.ADh.get();
        C14730pf r19 = (C14730pf) r02.ANy.get();
        C18790xG r20 = (C18790xG) r02.A1S.get();
        C16250si r21 = (C16250si) r02.AFP.get();
        C19650ym r22 = (C19650ym) r02.AFS.get();
        AnonymousClass2RY r13 = new AnonymousClass2RY(this, (C14870pt) r02.AB3.get(), r0, (C18930xU) r02.AOL.get(), (AnonymousClass12W) r02.AEM.get(), r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, C17270uo.A00(r02.ALu), z4, z5);
        this.A00 = r13;
        r13.A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01b3, code lost:
        r5.setNegativeButton(r2, new com.facebook.redex.IDxCListenerShape127S0100000_2_I0(r4, r1));
        r5.A07(false);
        r1 = r5.create();
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01c4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r8) {
        /*
            r7 = this;
            X.2RY r4 = r7.A00
            r0 = 100
            r5 = 1
            r3 = 0
            if (r8 == r0) goto L_0x0151
            r0 = 101(0x65, float:1.42E-43)
            if (r8 == r0) goto L_0x0126
            r1 = 200(0xc8, float:2.8E-43)
            if (r8 == r1) goto L_0x0117
            r1 = 201(0xc9, float:2.82E-43)
            if (r8 == r1) goto L_0x0108
            r2 = 0
            java.lang.String r6 = " "
            switch(r8) {
                case 103: goto L_0x0188;
                case 104: goto L_0x01c5;
                case 105: goto L_0x00be;
                case 106: goto L_0x0097;
                case 107: goto L_0x0044;
                case 108: goto L_0x001f;
                default: goto L_0x001a;
            }
        L_0x001a:
            android.app.Dialog r0 = super.onCreateDialog(r8)
            return r0
        L_0x001f:
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/msgstorenotrestored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.app.Activity r0 = r4.A01
            X.1fu r1 = new X.1fu
            r1.<init>(r0)
            r0 = 2131886292(0x7f1200d4, float:1.9407159E38)
            r1.A02(r0)
            r0 = 2131889555(0x7f120d93, float:1.9413777E38)
            r1.A01(r0)
            r0 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1.setPositiveButton(r0, r2)
            X.02l r1 = r1.create()
            goto L_0x01c2
        L_0x0044:
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/restorefrombackupduetoerrorcardnotfoundaskretry"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.app.Activity r2 = r4.A01
            r0 = 2131889556(0x7f120d94, float:1.9413779E38)
            java.lang.String r0 = r2.getString(r0)
            r5.append(r0)
            r5.append(r6)
            boolean r1 = X.C14730pf.A00()
            r0 = 2131889558(0x7f120d96, float:1.9413783E38)
            if (r1 == 0) goto L_0x006a
            r0 = 2131889557(0x7f120d95, float:1.941378E38)
        L_0x006a:
            java.lang.String r0 = r2.getString(r0)
            r5.append(r0)
            java.lang.String r1 = r5.toString()
            X.1fu r5 = new X.1fu
            r5.<init>(r2)
            r0 = 2131886292(0x7f1200d4, float:1.9407159E38)
            r5.A02(r0)
            r5.A06(r1)
            r2 = 2131891306(0x7f12146a, float:1.9417328E38)
            r1 = 19
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r4, r1)
            r5.setPositiveButton(r2, r0)
            r2 = 2131893671(0x7f121da7, float:1.9422125E38)
            r1 = 18
            goto L_0x01b3
        L_0x0097:
            android.app.Activity r0 = r4.A01
            X.1fu r5 = new X.1fu
            r5.<init>(r0)
            r0 = 2131889550(0x7f120d8e, float:1.9413767E38)
            r5.A02(r0)
            r0 = 2131887917(0x7f12072d, float:1.9410455E38)
            r5.A01(r0)
            r2 = 2131889553(0x7f120d91, float:1.9413773E38)
            r1 = 17
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r4, r1)
            r5.setPositiveButton(r2, r0)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 21
            goto L_0x01b3
        L_0x00be:
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/restoreduetoerror"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.app.Activity r2 = r4.A01
            r0 = 2131889556(0x7f120d94, float:1.9413779E38)
            java.lang.String r0 = r2.getString(r0)
            r1.append(r0)
            r1.append(r6)
            r0 = 2131889552(0x7f120d90, float:1.941377E38)
            java.lang.String r0 = r2.getString(r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1fu r5 = new X.1fu
            r5.<init>(r2)
            r0 = 2131889544(0x7f120d88, float:1.9413755E38)
            r5.A02(r0)
            r5.A06(r1)
            r2 = 2131889561(0x7f120d99, float:1.941379E38)
            r1 = 23
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r4, r1)
            r5.setPositiveButton(r2, r0)
            r2 = 2131889553(0x7f120d91, float:1.9413773E38)
            r1 = 24
            goto L_0x01b3
        L_0x0108:
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/keyserviceunavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131889564(0x7f120d9c, float:1.9413795E38)
            android.app.Dialog r1 = r4.A01(r1, r0)
            goto L_0x01c2
        L_0x0117:
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/cannot-connect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131889563(0x7f120d9b, float:1.9413793E38)
            android.app.Dialog r1 = r4.A01(r1, r0)
            goto L_0x01c2
        L_0x0126:
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/msgstoreerror"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.app.Activity r0 = r4.A01
            X.1fu r3 = new X.1fu
            r3.<init>(r0)
            r0 = 2131886292(0x7f1200d4, float:1.9407159E38)
            r3.A02(r0)
            r0 = 2131889554(0x7f120d92, float:1.9413775E38)
            r3.A01(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 22
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r4, r1)
            r3.setPositiveButton(r2, r0)
            X.02l r1 = r3.create()
            goto L_0x01c2
        L_0x0151:
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/setup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.app.Activity r2 = r4.A01
            X.2SD r1 = new X.2SD
            r1.<init>(r2)
            X.AnonymousClass2RY.A0G = r1
            r0 = 2131889560(0x7f120d98, float:1.9413787E38)
            java.lang.String r0 = r2.getString(r0)
            r1.setTitle(r0)
            X.2SD r1 = X.AnonymousClass2RY.A0G
            r0 = 2131889559(0x7f120d97, float:1.9413785E38)
            java.lang.String r0 = r2.getString(r0)
            r1.setMessage(r0)
            X.2SD r0 = X.AnonymousClass2RY.A0G
            r0.setIndeterminate(r3)
            X.2SD r0 = X.AnonymousClass2RY.A0G
            r0.setCancelable(r3)
            X.2SD r0 = X.AnonymousClass2RY.A0G
            r0.setProgressStyle(r5)
            X.2SD r1 = X.AnonymousClass2RY.A0G
            goto L_0x01c2
        L_0x0188:
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.app.Activity r0 = r4.A01
            X.1fu r5 = new X.1fu
            r5.<init>(r0)
            r0 = 2131889543(0x7f120d87, float:1.9413753E38)
            r5.A02(r0)
            r0 = 2131889551(0x7f120d8f, float:1.9413769E38)
            r5.A01(r0)
            r2 = 2131893158(0x7f121ba6, float:1.9421085E38)
            r1 = 20
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r4, r1)
            r5.setPositiveButton(r2, r0)
            r2 = 2131889635(0x7f120de3, float:1.941394E38)
            r1 = 16
        L_0x01b3:
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r4, r1)
            r5.setNegativeButton(r2, r0)
            r5.A07(r3)
            X.02l r1 = r5.create()
        L_0x01c2:
            if (r1 == 0) goto L_0x001a
            return r1
        L_0x01c5:
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/groupsync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.app.Activity r2 = r4.A01
            X.2SD r1 = new X.2SD
            r1.<init>(r2)
            r0 = 2131891164(0x7f1213dc, float:1.941704E38)
            r1.setTitle(r0)
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            java.lang.String r0 = r2.getString(r0)
            r1.setMessage(r0)
            r1.setIndeterminate(r5)
            r1.setCancelable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZA.onCreateDialog(int):android.app.Dialog");
    }
}
