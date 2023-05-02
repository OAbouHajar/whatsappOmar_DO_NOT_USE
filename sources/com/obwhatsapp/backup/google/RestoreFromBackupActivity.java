package com.obwhatsapp.backup.google;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01E;
import X.AnonymousClass01V;
import X.AnonymousClass027;
import X.AnonymousClass050;
import X.AnonymousClass11D;
import X.AnonymousClass12L;
import X.AnonymousClass12N;
import X.AnonymousClass12R;
import X.AnonymousClass12T;
import X.AnonymousClass12U;
import X.AnonymousClass131;
import X.AnonymousClass15P;
import X.AnonymousClass19Y;
import X.AnonymousClass1BN;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass1KQ;
import X.AnonymousClass1ZA;
import X.AnonymousClass29T;
import X.AnonymousClass2GJ;
import X.AnonymousClass2GK;
import X.AnonymousClass2GO;
import X.AnonymousClass2GQ;
import X.AnonymousClass2GS;
import X.AnonymousClass2Rf;
import X.AnonymousClass2UF;
import X.AnonymousClass37Q;
import X.AnonymousClass39H;
import X.C100104v6;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16200sd;
import X.C16250si;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16510tB;
import X.C16900tq;
import X.C16960tx;
import X.C16980tz;
import X.C17020u3;
import X.C17130ua;
import X.C17220uj;
import X.C17250um;
import X.C17660vR;
import X.C18260wP;
import X.C18890xQ;
import X.C19490yW;
import X.C19670yo;
import X.C19760yx;
import X.C19950zG;
import X.C19980zJ;
import X.C20020zN;
import X.C23061Ai;
import X.C23071Aj;
import X.C28251Uz;
import X.C28961Zl;
import X.C28971Zm;
import X.C34121jj;
import X.C40721ua;
import X.C437421i;
import X.C446524y;
import X.C45922Bq;
import X.C49132Rg;
import X.C55042ii;
import X.C55052ij;
import X.C55062ik;
import X.C55312jJ;
import X.C55862kX;
import X.C59142uk;
import X.C74313qL;
import X.C77563vy;
import X.C812447k;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.Handler;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape161S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxSConnectionShape327S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape0S1101000_I0;
import com.facebook.redex.RunnableRunnableShape0S1200100_I0;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.facebook.redex.ViewOnClickCListenerShape1S1200000_I0;
import com.facebook.redex.ViewOnClickCListenerShape2S0110000_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RestoreFromBackupActivity extends AnonymousClass1ZA implements C28251Uz, AnonymousClass2GO {
    public int A00;
    public long A01;
    public long A02;
    public View A03;
    public Button A04;
    public ProgressBar A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C17130ua A09;
    public C18890xQ A0A;
    public C16200sd A0B;
    public AnonymousClass1KL A0C;
    public C55042ii A0D;
    public AnonymousClass1KN A0E;
    public C55062ik A0F;
    public C19670yo A0G;
    public AnonymousClass12U A0H;
    public AnonymousClass12N A0I;
    public GoogleDriveRestoreAnimationView A0J;
    public AnonymousClass12T A0K;
    public RestoreFromBackupViewModel A0L;
    public AnonymousClass19Y A0M;
    public C16980tz A0N;
    public C16260sj A0O;
    public C20020zN A0P;
    public C16460t6 A0Q;
    public C16250si A0R;
    public C34121jj A0S;
    public C16900tq A0T;
    public AnonymousClass131 A0U;
    public AnonymousClass11D A0V;
    public AnonymousClass1KQ A0W;
    public C16490t9 A0X;
    public C17020u3 A0Y;
    public AnonymousClass39H A0Z;
    public C19760yx A0a;
    public AnonymousClass12L A0b;
    public AnonymousClass1BN A0c;
    public C17220uj A0d;
    public C16510tB A0e;
    public C17660vR A0f;
    public String A0g;
    public boolean A0h;
    public boolean A0i = false;
    public boolean A0j;
    public boolean A0k;
    public final ServiceConnection A0l;
    public final ConditionVariable A0m;
    public final ConditionVariable A0n;
    public final ConditionVariable A0o;
    public final AnonymousClass12R A0p;
    public final C55052ij A0q;
    public final AnonymousClass2GJ A0r;
    public final List A0s;
    public final Set A0t;
    public final AtomicBoolean A0u;
    public final AtomicBoolean A0v;
    public final AtomicBoolean A0w;
    public final AtomicBoolean A0x;

    public RestoreFromBackupActivity() {
        super(true, false);
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 19));
        this.A0s = new ArrayList();
        this.A0t = Collections.newSetFromMap(new ConcurrentHashMap());
        this.A0n = new ConditionVariable(false);
        this.A0m = new ConditionVariable(false);
        this.A0w = new AtomicBoolean();
        this.A0o = new ConditionVariable(false);
        this.A0u = new AtomicBoolean(false);
        this.A0v = new AtomicBoolean(false);
        this.A0x = new AtomicBoolean(true);
        this.A0l = new IDxSConnectionShape327S0100000_2_I0(this, 1);
        this.A0r = new IDxTConditionShape56S0100000_2_I0(this, 2);
        this.A0q = new C55052ij(this);
        this.A0p = new C55312jJ(this);
    }

    public static String A02(int i2) {
        switch (i2) {
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return "new";
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return "restore-from-gdrive";
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return "restore-from-local";
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return "restoring-from-gdrive";
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return "return-from-auth";
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return "msgstore-restored";
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return "restoring-from-local";
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return "restore-from-backup-file";
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return "restoring-from-backup-file";
            default:
                StringBuilder sb = new StringBuilder("Unknown state: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public static /* synthetic */ void A03(AccountManagerFuture accountManagerFuture, RestoreFromBackupActivity restoreFromBackupActivity) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (!bundle.containsKey("authAccount")) {
                Log.e("restore>RestoreFromBackupActivity/error-during-add-account/account-manager-returned-with-no-account-name");
            } else {
                restoreFromBackupActivity.A3Y(String.valueOf(bundle.get("authAccount")), 4);
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            Log.e("restore>RestoreFromBackupActivity/error-during-add-account", e2);
            restoreFromBackupActivity.A05.A0K(new RunnableRunnableShape3S0100000_I0_2(restoreFromBackupActivity, 20));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        r1 = (com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView) X.AnonymousClass00T.A05(r10, com.obwhatsapp.R.id.google_drive_restore_animation_view);
        r10.A0J = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        r1.A01 = 4;
        r0 = r1.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006b, code lost:
        if (r0 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        r0 = X.AnonymousClass00T.A05(r10, com.obwhatsapp.R.id.google_drive_backup_error_info_view);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0079, code lost:
        if (r2 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
        r0.setVisibility(0);
        ((android.widget.TextView) X.AnonymousClass00T.A05(r10, com.obwhatsapp.R.id.google_drive_backup_error_info)).setText(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        X.AnonymousClass00T.A05(r10, com.obwhatsapp.R.id.gdrive_restore_info).setVisibility(0);
        r10.A3U(((android.content.SharedPreferences) r10.A09.A01.get()).getBoolean("gdrive_last_restore_file_is_encrypted", false));
        X.AnonymousClass00T.A05(r10, com.obwhatsapp.R.id.restore_actions_view).setVisibility(0);
        X.AnonymousClass00T.A05(r10, com.obwhatsapp.R.id.google_drive_media_will_be_downloaded_later_notice).setVisibility(8);
        r10.A0J.setVisibility(8);
        r10.A05.setVisibility(8);
        r10.A08.setVisibility(8);
        X.AnonymousClass00T.A05(r10, com.obwhatsapp.R.id.dont_restore).setOnClickListener(new com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0((java.lang.Object) r10, 21));
        r10.A04.setText(r6);
        r10.A04.setOnClickListener(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e6, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0188, code lost:
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01a6, code lost:
        r1 = new java.lang.StringBuilder("restore>RestoreFromBackupActivity/display-msgstore-download-error failed to display error ");
        r1.append(r11);
        r1.append(" since Activity is about to finish.");
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (r10.A3V() != false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        r10.A05.setIndeterminate(false);
        r10.A08.setText(com.obwhatsapp.R.string.str009a);
        r1 = r10.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        if (r1 != null) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A0A(android.os.Bundle r9, com.obwhatsapp.backup.google.RestoreFromBackupActivity r10, int r11) {
        /*
            X.AnonymousClass00B.A01()
            r0 = 10
            if (r11 == r0) goto L_0x001d
            java.lang.String r0 = "restore>RestoreFromBackupActivity/observer/display-msgstore-download-error/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.AnonymousClass2GK.A04(r11)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x001d:
            r0 = 2131891306(0x7f12146a, float:1.9417328E38)
            java.lang.String r6 = r10.getString(r0)
            X.0rz r0 = r10.A09
            java.lang.String r5 = r0.A0M()
            X.AnonymousClass00B.A06(r5)
            r8 = 2
            r2 = 0
            r7 = 1
            r3 = 0
            switch(r11) {
                case 10: goto L_0x00e5;
                case 11: goto L_0x0034;
                case 12: goto L_0x0192;
                case 13: goto L_0x017e;
                case 14: goto L_0x016a;
                case 15: goto L_0x011c;
                case 16: goto L_0x01bd;
                case 17: goto L_0x016a;
                case 18: goto L_0x016a;
                case 19: goto L_0x016a;
                case 20: goto L_0x01bd;
                case 21: goto L_0x0034;
                case 22: goto L_0x016a;
                case 23: goto L_0x018f;
                case 24: goto L_0x00fa;
                case 25: goto L_0x016a;
                case 26: goto L_0x00ea;
                case 27: goto L_0x00ea;
                default: goto L_0x0034;
            }
        L_0x0034:
            r1 = 2131888525(0x7f12098d, float:1.9411688E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r3] = r6
            java.lang.String r2 = r10.getString(r1, r0)
            com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0 r4 = new com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0
            r4.<init>(r7, r5, r10)
        L_0x0044:
            boolean r0 = r10.A3V()
            if (r0 != 0) goto L_0x01a6
            android.widget.ProgressBar r0 = r10.A05
            r0.setIndeterminate(r3)
            android.widget.TextView r1 = r10.A08
            r0 = 2131886234(0x7f12009a, float:1.9407041E38)
            r1.setText(r0)
            com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView r1 = r10.A0J
            if (r1 != 0) goto L_0x0066
            r0 = 2131363895(0x7f0a0837, float:1.8347612E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r10, r0)
            com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView r1 = (com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView) r1
            r10.A0J = r1
        L_0x0066:
            r0 = 4
            r1.A01 = r0
            X.2Ki r0 = r1.A0A
            if (r0 == 0) goto L_0x0070
            r0.cancel()
        L_0x0070:
            r0 = 2131363882(0x7f0a082a, float:1.8347585E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            r5 = 8
            if (r2 == 0) goto L_0x00e6
            r0.setVisibility(r3)
            r0 = 2131363881(0x7f0a0829, float:1.8347583E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
        L_0x008a:
            r0 = 2131363836(0x7f0a07fc, float:1.8347492E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            r0.setVisibility(r3)
            X.0rz r0 = r10.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "gdrive_last_restore_file_is_encrypted"
            boolean r0 = r1.getBoolean(r0, r3)
            r10.A3U(r0)
            r0 = 2131365806(0x7f0a0fae, float:1.8351488E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            r0.setVisibility(r3)
            r0 = 2131363891(0x7f0a0833, float:1.8347604E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            r0.setVisibility(r5)
            com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r10.A0J
            r0.setVisibility(r5)
            android.widget.ProgressBar r0 = r10.A05
            r0.setVisibility(r5)
            android.widget.TextView r0 = r10.A08
            r0.setVisibility(r5)
            r0 = 2131363270(0x7f0a05c6, float:1.8346344E38)
            android.view.View r2 = X.AnonymousClass00T.A05(r10, r0)
            r1 = 21
            com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.setOnClickListener(r0)
            android.widget.Button r0 = r10.A04
            r0.setText(r6)
            android.widget.Button r0 = r10.A04
            r0.setOnClickListener(r4)
        L_0x00e5:
            return
        L_0x00e6:
            r0.setVisibility(r5)
            goto L_0x008a
        L_0x00ea:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/unhandled-error/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.AnonymousClass2GK.A04(r11)
            r1.append(r0)
            goto L_0x0188
        L_0x00fa:
            r2 = 2131888530(0x7f120992, float:1.9411698E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = 2131888529(0x7f120991, float:1.9411696E38)
            java.lang.String r0 = r10.getString(r0)
            r1[r3] = r0
            java.lang.String r2 = r10.getString(r2, r1)
            r0 = 20
            com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0 r4 = new com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0
            r4.<init>((java.lang.Object) r10, (int) r0)
            r0 = 2131892402(0x7f1218b2, float:1.9419551E38)
            java.lang.String r6 = r10.getString(r0)
            goto L_0x0044
        L_0x011c:
            r0 = -1
            java.lang.String r2 = "msgstore_bytes_to_be_downloaded"
            long r1 = r9.getLong(r2, r0)
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x015a
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r11)
            java.lang.String r0 = " message store download size: "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = " is invalid"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5 = 2131888527(0x7f12098f, float:1.9411692E38)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r3] = r6
        L_0x014f:
            java.lang.String r2 = r10.getString(r5, r4)
            com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0 r4 = new com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0
            r4.<init>(r10)
            goto L_0x0044
        L_0x015a:
            r5 = 2131888526(0x7f12098e, float:1.941169E38)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            X.013 r0 = r10.A01
            java.lang.String r0 = X.AnonymousClass2GQ.A03(r0, r1)
            r4[r3] = r0
            r4[r7] = r6
            goto L_0x014f
        L_0x016a:
            r1 = 2131888528(0x7f120990, float:1.9411694E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r3] = r6
            java.lang.String r2 = r10.getString(r1, r0)
            r0 = 24
            com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0 r4 = new com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0
            r4.<init>((java.lang.Object) r10, (int) r0)
            goto L_0x0044
        L_0x017e:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/unexpected/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
        L_0x0188:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x018f:
            r4 = r2
            goto L_0x0044
        L_0x0192:
            r1 = 2131888524(0x7f12098c, float:1.9411686E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r3] = r5
            r0[r7] = r6
            java.lang.String r2 = r10.getString(r1, r0)
            com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0 r4 = new com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0
            r4.<init>(r3, r5, r10)
            goto L_0x0044
        L_0x01a6:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error failed to display error "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = " since Activity is about to finish."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x01bd:
            java.lang.String r1 = "Unexpected error"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.RestoreFromBackupActivity.A0A(android.os.Bundle, com.obwhatsapp.backup.google.RestoreFromBackupActivity, int):void");
    }

    public static /* synthetic */ void A0T(C55062ik r10, RestoreFromBackupActivity restoreFromBackupActivity, String str) {
        RestoreFromBackupActivity restoreFromBackupActivity2 = restoreFromBackupActivity;
        restoreFromBackupActivity.A0c.A04("backup_found", "restore");
        if (restoreFromBackupActivity.A3X()) {
            return;
        }
        if (restoreFromBackupActivity.A06.A01() < restoreFromBackupActivity.A01) {
            StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore insufficient storage, available: ");
            sb.append(restoreFromBackupActivity.A06.A01());
            sb.append(" required: ");
            sb.append(restoreFromBackupActivity.A01);
            Log.i(sb.toString());
            boolean A002 = C14730pf.A00();
            int i2 = R.string.str096d;
            if (A002) {
                i2 = R.string.str096b;
            }
            String string = restoreFromBackupActivity.getString(i2, new Object[]{AnonymousClass2GQ.A03(restoreFromBackupActivity.A01, restoreFromBackupActivity.A01)});
            C55862kX r3 = new C55862kX(13);
            r3.A06(restoreFromBackupActivity.getString(R.string.str096c));
            r3.A02(string);
            String string2 = restoreFromBackupActivity.getString(R.string.str02b0);
            if (Build.VERSION.SDK_INT >= 26) {
                string2 = restoreFromBackupActivity.getString(R.string.str02ab);
            }
            r3.A05(string2);
            r3.A04(restoreFromBackupActivity.getString(R.string.str0e87));
            r3.A00().A1G(restoreFromBackupActivity.AGM(), (String) null);
            return;
        }
        StringBuilder sb2 = new StringBuilder("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore starting restore from ");
        sb2.append(AnonymousClass2GK.A0B(str));
        Log.i(sb2.toString());
        Log.i("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore/stopping-approx-transfer-size-calc-thread");
        restoreFromBackupActivity.A0u.set(true);
        C55062ik r8 = r10;
        if (r10.A02) {
            restoreFromBackupActivity.A3J(2);
            restoreFromBackupActivity.startActivityForResult(C14750ph.A09(restoreFromBackupActivity, 2), 0);
            return;
        }
        restoreFromBackupActivity.A3C();
        restoreFromBackupActivity2.A05.Acl(new RunnableRunnableShape0S1200100_I0(restoreFromBackupActivity2, r8, r10.A05, 0, r10.A00));
    }

    public static /* synthetic */ void A0p(RestoreFromBackupActivity restoreFromBackupActivity) {
        Intent type = new Intent("android.intent.action.GET_CONTENT").setType("application/octet-stream");
        if (Build.VERSION.SDK_INT >= 26) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (!externalStoragePublicDirectory.exists()) {
                Log.e("restore>RestoreFromBackupActivity/restore-from-backup-activity/backup-file-picker/downloads-directory-does-not-exist");
                return;
            }
            type = type.putExtra("android.provider.extra.INITIAL_URI", Uri.fromFile(externalStoragePublicDirectory));
        }
        restoreFromBackupActivity.startActivityForResult(type, 9);
    }

    public static /* synthetic */ void A0r(RestoreFromBackupActivity restoreFromBackupActivity, String str) {
        Account[] accountArr;
        String obj;
        RestoreFromBackupActivity restoreFromBackupActivity2 = restoreFromBackupActivity;
        try {
            accountArr = AccountManager.get(restoreFromBackupActivity.A0N.A00).getAccountsByType("com.google");
        } catch (Exception e2) {
            Log.e("gdrive-activity/get-google-accounts", e2);
            accountArr = new Account[0];
        }
        for (Account account : accountArr) {
            if (TextUtils.equals(account.name, str)) {
                restoreFromBackupActivity.A3Y(str, 1);
                return;
            }
        }
        try {
            String string = AccountManager.get(restoreFromBackupActivity).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, restoreFromBackupActivity2, (AccountManagerCallback) null, (Handler) null).getResult().getString("authAccount");
            if (string == null) {
                obj = "restore>RestoreFromBackupActivity/error-during-msgstore-download/account-manager-returned-with-no-account-name";
            } else if (!string.equals(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("restore>RestoreFromBackupActivity/error-during-msgstore-download/account-manager user added ");
                sb.append(AnonymousClass2GK.A0B(string));
                sb.append(" instead of ");
                sb.append(AnonymousClass2GK.A0B(str));
                obj = sb.toString();
            } else {
                restoreFromBackupActivity2.A05.A0K(new RunnableRunnableShape3S0100000_I0_2(restoreFromBackupActivity2, 22));
                restoreFromBackupActivity2.A3Y(str, 1);
                return;
            }
            Log.e(obj);
        } catch (AuthenticatorException | OperationCanceledException | IOException e3) {
            Log.e("restore>RestoreFromBackupActivity/error-during-msgstore-download", e3);
        }
    }

    public void A1q() {
        if (!this.A0i) {
            this.A0i = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A01 = r2.A0F();
            this.A0N = (C16980tz) r1.AQB.get();
            this.A0A = (C18890xQ) r1.APS.get();
            this.A0f = (C17660vR) r1.APW.get();
            this.A0X = (C16490t9) r1.AQz.get();
            this.A09 = (C17130ua) r1.AN9.get();
            this.A0c = (AnonymousClass1BN) r1.AAp.get();
            this.A0d = (C17220uj) r1.A9x.get();
            this.A0Q = (C16460t6) r1.A5k.get();
            this.A0B = (C16200sd) r1.A7h.get();
            this.A0P = (C20020zN) r1.A5q.get();
            this.A0V = (AnonymousClass11D) r1.AFm.get();
            this.A0E = (AnonymousClass1KN) r1.A1T.get();
            this.A0M = (AnonymousClass19Y) r1.A4r.get();
            this.A0R = (C16250si) r1.AFP.get();
            this.A0W = (AnonymousClass1KQ) r1.AAL.get();
            this.A0H = (AnonymousClass12U) r1.AB5.get();
            this.A0T = (C16900tq) r1.AFT.get();
            this.A0a = (C19760yx) r1.AKx.get();
            this.A0K = (AnonymousClass12T) r1.AL6.get();
            this.A0O = (C16260sj) r1.AQe.get();
            this.A0e = (C16510tB) r1.A8S.get();
            this.A0b = (AnonymousClass12L) r1.APo.get();
            this.A0C = (AnonymousClass1KL) r1.A1X.get();
            this.A0U = (AnonymousClass131) r1.AFV.get();
            this.A0Y = (C17020u3) r1.AMG.get();
            this.A0G = (C19670yo) r1.AB4.get();
            this.A0I = (AnonymousClass12N) r1.AB7.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01f7, code lost:
        if (r2 == false) goto L_0x01f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A37(X.C34121jj r11) {
        /*
            r10 = this;
            X.AnonymousClass00B.A01()
            boolean r0 = r10.A0k
            if (r0 == 0) goto L_0x000b
            r10.finish()
        L_0x000a:
            return
        L_0x000b:
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = r10.A0L
            int r0 = r0.A00
            r2 = 26
            if (r0 != r2) goto L_0x0025
            java.lang.String r1 = "restore>RestoreFromBackupActivity/after-msgstore-verified/state-is-msgstore-restored/call-ignored "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0025:
            java.lang.String r1 = "restore>RestoreFromBackupActivity/after-msgstore-verified/status:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A3O(r11, r2)
            int r7 = r11.A00
            r0 = 2
            r6 = 1
            r2 = 0
            r3 = 0
            if (r7 == r0) goto L_0x0042
            r3 = 1
        L_0x0042:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = " is unexpected here"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0B(r0, r3)
            if (r7 != r6) goto L_0x0068
            X.0sq r2 = r10.A05
            r1 = 17
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r10, r1)
            r2.Acl(r0)
            r10.A3T(r6)
            return
        L_0x0068:
            r0 = 5
            if (r7 != r0) goto L_0x00d1
            X.AnonymousClass00B.A01()
            boolean r0 = r10.A3V()
            if (r0 != 0) goto L_0x000a
            r0 = 2131888518(0x7f120986, float:1.9411674E38)
            java.lang.String r1 = r10.getString(r0)
            java.lang.String r0 = "restore-failure-low-on-storage-learn-more"
            android.text.Spannable r1 = r10.A3A(r1, r0)
            r0 = 19
            X.2kX r3 = new X.2kX
            r3.<init>(r0)
            r0 = 2131888522(0x7f12098a, float:1.9411682E38)
            java.lang.String r0 = r10.getString(r0)
            r3.A06(r0)
            r3.A02(r1)
            r3.A01()
            r3.A07(r2)
            r0 = 2131886768(0x7f1202b0, float:1.9408124E38)
            java.lang.String r2 = r10.getString(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00af
            r0 = 2131886763(0x7f1202ab, float:1.9408114E38)
            java.lang.String r2 = r10.getString(r0)
        L_0x00af:
            r3.A05(r2)
            r0 = 2131889799(0x7f120e87, float:1.9414272E38)
            java.lang.String r0 = r10.getString(r0)
            r3.A03(r0)
            com.obwhatsapp.backup.google.PromptDialogFragment r2 = r3.A00()
        L_0x00c0:
            X.02C r0 = r10.AGM()
            X.050 r1 = new X.050
            r1.<init>(r0)
            r0 = 0
            r1.A0C(r2, r0)
            r1.A02()
            return
        L_0x00d1:
            java.lang.String r3 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0137
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0137
            java.lang.String r1 = "restore>RestoreFromBackupActivity/storage-state/error-external-storage-unavailable/state="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.AnonymousClass00B.A01()
            boolean r0 = r10.A3V()
            if (r0 != 0) goto L_0x000a
            r0 = 23
            X.2kX r1 = new X.2kX
            r1.<init>(r0)
            r0 = 2131888522(0x7f12098a, float:1.9411682E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A06(r0)
            r0 = 2131888519(0x7f120987, float:1.9411676E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A02(r0)
            r1.A07(r2)
            r0 = 2131889799(0x7f120e87, float:1.9414272E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A05(r0)
            r0 = 2131893494(0x7f121cf6, float:1.9421766E38)
        L_0x012b:
            java.lang.String r0 = r10.getString(r0)
            r1.A03(r0)
        L_0x0132:
            com.obwhatsapp.backup.google.PromptDialogFragment r2 = r1.A00()
            goto L_0x00c0
        L_0x0137:
            X.0sj r0 = r10.A0O
            boolean r0 = r0.A07()
            if (r0 != 0) goto L_0x015c
            X.0sj r1 = r10.A0O
            X.0tz r0 = r1.A00
            android.content.Context r0 = r0.A00
            java.lang.String[] r0 = X.C28971Zm.A00(r0, r2, r2)
            int r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = "restore>RestoreFromBackupActivity/storage-state/error-permission-unavailable"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r10.A3S(r6)
            r10.A3X()
            return
        L_0x015c:
            X.2ik r1 = r10.A0F
            if (r1 == 0) goto L_0x0312
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0312
            java.util.Set r4 = r10.A0t
            java.lang.String r3 = r1.A05
            java.lang.String r1 = "com.google"
            android.accounts.Account r0 = new android.accounts.Account
            r0.<init>(r3, r1)
            r4.add(r0)
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/failed/google drive backup is unrestorable for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.2ik r0 = r10.A0F
            java.lang.String r0 = r0.A05
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0188:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = 3
            if (r7 != r5) goto L_0x024e
            X.AnonymousClass00B.A01()
            boolean r0 = r10.A3V()
            if (r0 != 0) goto L_0x000a
            X.0si r0 = r10.A0R
            java.util.Set r0 = r0.A0j
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r9 = r1.toArray(r0)
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.String r0 = "restore>RestoreFromBackupActivity/get-jid-mismatch-message for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = java.util.Arrays.toString(r9)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r9.length
            if (r0 != 0) goto L_0x01fe
            r0 = 2131888515(0x7f120983, float:1.9411668E38)
            java.lang.String r1 = r10.getString(r0)
        L_0x01c6:
            java.lang.String r0 = "restore-failure-jid-mismatch-learn-more"
            android.text.Spannable r3 = r10.A3A(r1, r0)
            r0 = 20
            X.2kX r1 = new X.2kX
            r1.<init>(r0)
            r0 = 2131888517(0x7f120985, float:1.9411672E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A06(r0)
            r1.A02(r3)
            r1.A01()
            r1.A07(r2)
            r0 = 2131888520(0x7f120988, float:1.9411678E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A05(r0)
            boolean r2 = r10.A3W()
            r0 = 2131891290(0x7f12145a, float:1.9417296E38)
            if (r2 != 0) goto L_0x012b
        L_0x01f9:
            r0 = 2131893671(0x7f121da7, float:1.9422125E38)
            goto L_0x012b
        L_0x01fe:
            r8 = 2
            if (r0 != r6) goto L_0x021f
            r7 = 2131888516(0x7f120984, float:1.941167E38)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            X.0rz r0 = r10.A09
            java.lang.String r1 = r0.A0P()
            X.1Mf r0 = X.C26071Mf.A00()
            java.lang.String r0 = X.C24561Gk.A00(r0, r1)
            r5[r2] = r0
            r0 = r9[r2]
            r5[r6] = r0
        L_0x021a:
            java.lang.String r1 = r10.getString(r7, r5)
            goto L_0x01c6
        L_0x021f:
            java.util.Arrays.sort(r9)
            int r0 = r0 - r6
            java.lang.String[] r4 = new java.lang.String[r0]
            r3 = r9[r0]
            java.lang.System.arraycopy(r9, r2, r4, r2, r0)
            r7 = 2131888514(0x7f120982, float:1.9411665E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            X.0rz r0 = r10.A09
            java.lang.String r1 = r0.A0P()
            X.1Mf r0 = X.C26071Mf.A00()
            java.lang.String r0 = X.C24561Gk.A00(r0, r1)
            r5[r2] = r0
            X.013 r1 = r10.A01
            java.util.List r0 = java.util.Arrays.asList(r4)
            java.lang.String r0 = X.C40631uR.A00(r1, r0, r2)
            r5[r6] = r0
            r5[r8] = r3
            goto L_0x021a
        L_0x024e:
            if (r7 != 0) goto L_0x02a6
            X.2ik r0 = r10.A0F
            if (r0 == 0) goto L_0x02a6
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x02a6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.0sc r0 = r10.A04
            java.io.File r1 = r0.A02()
            X.0yo r0 = r10.A0G
            X.AnonymousClass2GK.A0F(r0, r1, r3)
            X.0si r0 = r10.A0R     // Catch:{ IOException -> 0x0274 }
            java.io.File r0 = r0.A0A()     // Catch:{ IOException -> 0x0274 }
            if (r0 == 0) goto L_0x0279
            r3.add(r0)     // Catch:{ IOException -> 0x0274 }
            goto L_0x0279
        L_0x0274:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/handle-failure/unable to get last backup file for cleanup"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0279:
            java.util.Iterator r1 = r3.iterator()
        L_0x027d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x028d
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x027d
        L_0x028d:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/handle-failure/clean up downloaded files for"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.2ik r0 = r10.A0F
            java.lang.String r0 = r0.A05
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x02a6:
            java.util.List r0 = r10.A0s
            java.lang.String r1 = ","
            android.text.TextUtils.join(r1, r0)
            java.util.Set r0 = r10.A0t
            android.text.TextUtils.join(r1, r0)
            X.0rz r0 = r10.A09
            boolean r0 = r0.A1g()
            if (r0 == 0) goto L_0x02e3
            X.AnonymousClass00B.A01()
            boolean r0 = r10.A3V()
            if (r0 != 0) goto L_0x000a
            r0 = 21
            X.2kX r1 = new X.2kX
            r1.<init>(r0)
            r0 = 2131888513(0x7f120981, float:1.9411663E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A02(r0)
            r1.A07(r2)
            r0 = 2131888074(0x7f1207ca, float:1.9410773E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A05(r0)
            goto L_0x0132
        L_0x02e3:
            boolean r0 = r10.A3W()
            if (r0 == 0) goto L_0x031b
            X.AnonymousClass00B.A01()
            boolean r0 = r10.A3V()
            if (r0 != 0) goto L_0x000a
            r0 = 18
            X.2kX r1 = new X.2kX
            r1.<init>(r0)
            r0 = 2131888521(0x7f120989, float:1.941168E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A02(r0)
            r1.A07(r2)
            r0 = 2131891290(0x7f12145a, float:1.9417296E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A05(r0)
            goto L_0x01f9
        L_0x0312:
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.A0x
            r0.set(r2)
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/failed/local backup is unrestorable"
            goto L_0x0188
        L_0x031b:
            r10.A38(r2)
            r10.A3T(r2)
            r0 = 2131889555(0x7f120d93, float:1.9413777E38)
            r10.Afg(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.RestoreFromBackupActivity.A37(X.1jj):void");
    }

    public final long A39() {
        return this.A0R.A07();
    }

    public final Spannable A3A(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, new C59142uk(this, this.A00, this.A05, this.A08, this.A02.A00("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history").toString()));
        return C45922Bq.A01(str, hashMap);
    }

    public void A3B() {
        AnonymousClass00B.A01();
        Log.i("restore-from-backup-activity/show-importing-view");
        ((TextView) findViewById(R.id.title_toolbar_text)).setText("");
        ((TextView) findViewById(R.id.activity_gdrive_backup_found_category)).setText(R.string.str009d);
        findViewById(R.id.restore_actions_view).setVisibility(8);
        findViewById(R.id.restore_general_info).setVisibility(8);
        findViewById(R.id.import_general_info).setVisibility(8);
        findViewById(R.id.gdrive_restore_info).setVisibility(8);
        findViewById(R.id.calculating_progress_view).setVisibility(8);
        findViewById(R.id.google_drive_backup_error_info_view).setVisibility(8);
        findViewById(R.id.google_drive_restore_animation_view).setVisibility(0);
        this.A05.setVisibility(0);
        this.A05.setIndeterminate(true);
        C812447k.A00(this.A05, AnonymousClass00T.A00(this, R.color.color0541));
        this.A08.setVisibility(0);
        this.A08.setText(getString(R.string.str0b3d));
        View findViewById = findViewById(R.id.restore_actions_view);
        AnonymousClass00B.A04(findViewById);
        findViewById.setVisibility(8);
    }

    public void A3C() {
        AnonymousClass00B.A01();
        Log.i("restore>RestoreFromBackupActivity/show-msgstore-downloading-view");
        AnonymousClass00T.A05(this, R.id.restore_actions_view).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.restore_general_info).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.import_general_info).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.calculating_progress_view).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.google_drive_restore_animation_view).setVisibility(0);
        this.A05.setVisibility(0);
        this.A05.setIndeterminate(true);
        C812447k.A00(this.A05, AnonymousClass00T.A00(this, R.color.color0541));
        this.A08.setVisibility(0);
        this.A07 = (TextView) findViewById(R.id.google_drive_media_will_be_downloaded_later_notice);
        long j2 = this.A02;
        if (j2 == 0) {
            j2 = ((SharedPreferences) this.A09.A01.get()).getLong("gdrive_approx_media_download_size", 0);
            this.A02 = j2;
        }
        if (j2 > 0) {
            String A032 = AnonymousClass2GQ.A03(this.A01, j2);
            this.A07.setText(getString(R.string.str0099, new Object[]{A032}));
            this.A07.setVisibility(0);
        }
    }

    public void A3D() {
        Log.i("restore>RestoreFromBackupActivity/show-restore-for-no-gdrive-local-backup");
        AnonymousClass00T.A05(this, R.id.google_drive_looking_for_backup_view).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.google_drive_restore_view).setVisibility(0);
        this.A0n.open();
        ((TextView) AnonymousClass00T.A05(this, R.id.title_toolbar_text)).setText("");
        AnonymousClass00T.A05(this, R.id.calculating_progress_view).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.gdrive_restore_size_info).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.calculating_transfer_size_progress_bar).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.gdrive_restore_info).setVisibility(8);
        ((TextView) AnonymousClass00T.A05(this, R.id.activity_gdrive_backup_found_category)).setText(R.string.str009c);
        ((TextView) AnonymousClass00T.A05(this, R.id.restore_general_info)).setText(R.string.str0b44);
        AnonymousClass00T.A05(this, R.id.dont_restore).setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 22));
        this.A04.setText(R.string.str0b3e);
        this.A04.setAllCaps(true);
        this.A04.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 25));
    }

    public void A3E() {
        Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-local-backup");
        AnonymousClass00T.A05(this, R.id.google_drive_looking_for_backup_view).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.google_drive_restore_view).setVisibility(0);
        this.A0n.open();
        setTitle(R.string.str009e);
        AnonymousClass00T.A05(this, R.id.calculating_progress_view).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.gdrive_restore_size_info).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.calculating_transfer_size_progress_bar).setVisibility(8);
        ((TextView) AnonymousClass00T.A05(this, R.id.gdrive_restore_info)).setText(getString(R.string.str0c90, new Object[]{C28961Zl.A01(this.A01, this.A0R.A07()).toString()}));
        this.A0L.A01.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 9));
        RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0L;
        restoreFromBackupViewModel.A08.Acl(new RunnableRunnableShape3S0100000_I0_2(restoreFromBackupViewModel, 35));
        boolean z2 = false;
        try {
            File A0A2 = this.A0R.A0A();
            if (A0A2 != null && C40721ua.A00(A0A2.getName()) == C16960tx.A07) {
                z2 = true;
            }
        } catch (IOException unused) {
            Log.e("restore>RestoreFromBackupActivity/cannot determine whether local backup is encrypted");
        }
        A3U(z2);
        if (this.A0J == null) {
            this.A0J = (GoogleDriveRestoreAnimationView) findViewById(R.id.google_drive_restore_animation_view);
        }
        TextView textView = (TextView) AnonymousClass00T.A05(this, R.id.restore_general_info);
        boolean A002 = C14730pf.A00();
        int i2 = R.string.str1617;
        if (A002) {
            i2 = R.string.str1492;
        }
        textView.setText(i2);
        this.A0E.A0B.A0C(1729);
        AnonymousClass00T.A05(this, R.id.dont_restore).setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 26));
        this.A04.setOnClickListener(new ViewOnClickCListenerShape2S0110000_I0(this, 0, z2));
        this.A0c.A01("backup_found");
    }

    public void A3F() {
        StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/skip-restore/user declined to restore backup from ");
        C55062ik r0 = this.A0F;
        sb.append(r0 == null ? "<unset account>" : AnonymousClass2GK.A0B(r0.A05));
        Log.i(sb.toString());
        Log.i("restore>RestoreFromBackupActivity/skip-restore/stopping-approx-transfer-size-calc-thread");
        C55062ik r02 = this.A0F;
        if (r02 != null && r02.A02) {
            A3J(6);
        }
        this.A0u.set(true);
        this.A09.A0j(0);
        this.A09.A0U();
        this.A09.A1l(0);
        this.A09.A1J(false);
        RunnableRunnableShape3S0100000_I0_2 runnableRunnableShape3S0100000_I0_2 = new RunnableRunnableShape3S0100000_I0_2(this, 18);
        if (AnonymousClass01E.A01()) {
            this.A05.Acl(runnableRunnableShape3S0100000_I0_2);
        } else {
            runnableRunnableShape3S0100000_I0_2.run();
        }
        this.A0H.A05(10);
        String A0M2 = this.A09.A0M();
        if (A0M2 != null) {
            Intent A0d2 = C14750ph.A0d(this, "action_remove_backup_info");
            A0d2.putExtra("account_name", A0M2);
            A0d2.putExtra("remove_account_name", true);
            C446524y.A00(this, A0d2);
        }
        setResult(2);
        A3H();
    }

    public final void A3G() {
        Log.i("restore>RestoreFromBackupActivity/skip restore");
        this.A0k = true;
        setResult(2);
    }

    public final void A3H() {
        Log.i("restore>RestoreFromBackupActivity/skip-restore-and-prepare-empty-message-store/show-new-user-settings");
        A3G();
        A38(false);
        this.A09.A0l(System.currentTimeMillis() + 604800000);
    }

    public final void A3I() {
        Log.i("restore>RestoreFromBackupActivity/start to download message store");
        C55062ik r0 = this.A0F;
        if (r0 == null || !r0.A01) {
            C446524y.A00(this, C14750ph.A0d(this, "action_restore"));
        } else {
            this.A0p.ATi(true);
        }
        this.A05.A0K(new RunnableRunnableShape3S0100000_I0_2(this, 16));
    }

    public final void A3J(int i2) {
        C74313qL r1 = new C74313qL();
        r1.A00 = Integer.valueOf(i2);
        this.A0X.A06(r1);
    }

    public final void A3K(int i2) {
        boolean A072 = this.A0O.A07();
        int i3 = R.string.str0960;
        if (A072) {
            i3 = R.string.str095f;
        }
        RequestPermissionActivity.A0V(this, "google_backup", new int[]{R.drawable.vec_ic_baseline_cloud_upload_48}, i2, R.string.str0961, i3, R.string.str0394, this.A0O.A0E(), !this.A0M.A00());
    }

    public final void A3L(int i2) {
        C55862kX r1 = new C55862kX(i2);
        r1.A02(getString(R.string.str072d));
        r1.A07(true);
        r1.A05(getString(R.string.str0d91));
        r1.A03(getString(R.string.str0394));
        PromptDialogFragment A002 = r1.A00();
        if (!A3V()) {
            AnonymousClass050 r12 = new AnonymousClass050(AGM());
            r12.A0C(A002, (String) null);
            r12.A02();
        }
    }

    public void A3M(long j2, long j3) {
        String string;
        AnonymousClass00B.A00();
        this.A01 = j2;
        this.A02 = j3;
        this.A09.A0K().putLong("gdrive_approx_media_download_size", j3).apply();
        StringBuilder sb = new StringBuilder("washaredpreferences/save-gdrive-media-download-transfer-size/");
        sb.append(j3);
        Log.i(sb.toString());
        if (j2 <= 0) {
            string = getString(R.string.str0964);
        } else {
            string = getString(R.string.str0962, new Object[]{AnonymousClass2GQ.A03(this.A01, j2)});
        }
        this.A0n.block();
        StringBuilder sb2 = new StringBuilder("restore>RestoreFromBackupActivity/update-restore-info/ total download size: ");
        sb2.append(j2);
        sb2.append(" media download size: ");
        sb2.append(j3);
        Log.i(sb2.toString());
        this.A05.A0K(new RunnableRunnableShape0S1100000_I0(8, string, this));
    }

    public final void A3N(C55062ik r12) {
        int i2;
        StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/");
        String str = r12.A05;
        sb.append(AnonymousClass2GK.A0B(str));
        Log.i(sb.toString());
        long j2 = r12.A04;
        long j3 = r12.A00;
        AnonymousClass00T.A05(this, R.id.google_drive_looking_for_backup_view).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.google_drive_restore_view).setVisibility(0);
        this.A0n.open();
        setTitle(R.string.str009e);
        if (this.A0J == null) {
            this.A0J = (GoogleDriveRestoreAnimationView) findViewById(R.id.google_drive_restore_animation_view);
        }
        boolean z2 = r12.A01;
        TextView textView = (TextView) AnonymousClass00T.A05(this, R.id.restore_general_info);
        if (z2) {
            boolean A002 = C14730pf.A00();
            i2 = R.string.str1617;
            if (A002) {
                i2 = R.string.str1492;
            }
        } else {
            i2 = R.string.str09a5;
        }
        textView.setText(i2);
        this.A0E.A0B.A0C(1729);
        StringBuilder sb2 = new StringBuilder(getString(R.string.str0957));
        StringBuilder sb3 = new StringBuilder();
        if (j2 > 0) {
            sb2.setLength(0);
            sb2.append(C28961Zl.A01(this.A01, j2));
        }
        this.A01 = r12.A01 ? 0 : j3;
        if (j3 >= 0) {
            sb3.setLength(0);
            sb3.append(AnonymousClass2GQ.A03(this.A01, j3));
        }
        if (!r12.A03) {
            sb2.setLength(0);
            sb2.append(C28961Zl.A01(this.A01, this.A0R.A07()));
            Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/local backup is newer than google drive backup, showing local backup timestamp.");
        }
        TextView textView2 = (TextView) AnonymousClass00T.A05(this, R.id.gdrive_restore_info);
        boolean z3 = r12.A01;
        int i3 = R.string.str09a6;
        if (z3) {
            i3 = R.string.str0c8f;
        }
        textView2.setText(getString(i3, new Object[]{str, sb2.toString(), sb3.toString()}));
        A3U(r12.A02);
        AnonymousClass00T.A05(this, R.id.dont_restore).setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 23));
        this.A04.setOnClickListener(new ViewOnClickCListenerShape1S1200000_I0(this, str, r12, 1));
        this.A0c.A01("backup_found");
    }

    public void A3O(C34121jj r5, int i2) {
        this.A0L.A00 = i2;
        this.A0S = r5;
        StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/state ");
        sb.append(A02(i2));
        sb.append(" ");
        Object obj = r5;
        if (r5 == null) {
            obj = "";
        }
        sb.append(obj);
        Log.i(sb.toString());
        C15860rz r2 = this.A09;
        int i3 = this.A0L.A00;
        C34121jj r0 = this.A0S;
        Integer valueOf = r0 != null ? Integer.valueOf(r0.A00) : null;
        SharedPreferences.Editor A0K2 = r2.A0K();
        A0K2.putInt("gdrive_activity_state", i3);
        if (valueOf != null) {
            A0K2.putInt("gdrive_activity_msgstore_init_key", valueOf.intValue());
        } else {
            A0K2.remove("gdrive_activity_msgstore_init_key");
        }
        A0K2.apply();
    }

    public final void A3P(boolean z2) {
        StringBuilder sb;
        String str;
        C55062ik r0;
        if (z2 && (r0 = this.A0F) != null && r0.A02) {
            A3J(8);
        }
        setTitle(R.string.str009e);
        if (this.A09.A1X()) {
            str = "restore>RestoreFromBackupActivity/msgstore-download/finished with success: ";
        } else {
            sb = new StringBuilder();
            str = "restore>RestoreFromBackupActivity/msgstore-download/not performed since we are using local backup, success: ";
        }
        sb.append(str);
        sb.append(z2);
        sb.append(", starting to restore it.");
        Log.i(sb.toString());
        super.A38(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r12.A0M.A00() == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3Q(boolean r39) {
        /*
            r38 = this;
            X.AnonymousClass00B.A01()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/perform-one-time-setup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13 = 0
            r12 = r38
            X.0sj r1 = r12.A0O
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            int r0 = r1.A03(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0020
            X.19Y r0 = r12.A0M
            boolean r0 = r0.A00()
            r2 = 0
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            X.0sj r0 = r12.A0O
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0042
            X.19Y r0 = r12.A0M
            boolean r1 = r0.A00()
        L_0x002f:
            r0 = 0
            if (r1 != 0) goto L_0x0033
            r0 = 1
        L_0x0033:
            if (r2 != 0) goto L_0x0037
            if (r0 == 0) goto L_0x0057
        L_0x0037:
            if (r39 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x004e
            r12.setResult(r3)
            r12.finish()
            return
        L_0x0042:
            X.0sj r0 = r12.A0O
            boolean r1 = r0.A0B()
            goto L_0x002f
        L_0x0049:
            r0 = 5
            r12.A3K(r0)
            return
        L_0x004e:
            r1 = 23
            r0 = 0
            r12.A3O(r0, r1)
            r12.A3E()
        L_0x0057:
            X.0tz r0 = r12.A0N
            android.content.Context r0 = r0.A00
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r0)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r14 = r1.getAccountsByType(r0)     // Catch:{ Exception -> 0x0066 }
            goto L_0x006e
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = "gdrive-activity/get-google-accounts"
            com.whatsapp.util.Log.e(r0, r1)
            android.accounts.Account[] r14 = new android.accounts.Account[r13]
        L_0x006e:
            java.util.List r0 = r12.A0s
            r0.clear()
            java.util.Collections.addAll(r0, r14)
            X.0tz r0 = r12.A0N
            r26 = r0
            X.0pt r0 = r12.A05
            r37 = r0
            X.0sc r0 = r12.A04
            r25 = r0
            X.0si r0 = r12.A0R
            r29 = r0
            X.0rz r0 = r12.A09
            r28 = r0
            X.0pd r0 = r12.A0C
            r18 = r0
            X.0so r0 = r12.A03
            r17 = r0
            X.0vR r15 = r12.A0f
            X.0sq r11 = r12.A05
            X.0sb r10 = r12.A04
            X.0ua r9 = r12.A09
            X.0sd r8 = r12.A0B
            X.11D r7 = r12.A0V
            X.12T r6 = r12.A0K
            X.0sj r5 = r12.A0O
            X.0tB r4 = r12.A0e
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.A0x
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.A0u
            X.2GJ r1 = r12.A0r
            X.0wP r0 = r12.A07
            X.38P r16 = new X.38P
            r31 = r18
            r32 = r4
            r33 = r15
            r34 = r11
            r35 = r3
            r36 = r2
            r23 = r1
            r24 = r0
            r27 = r5
            r30 = r7
            r18 = r10
            r19 = r9
            r20 = r8
            r21 = r12
            r22 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.0yo r4 = r12.A0G
            java.util.Set r1 = r12.A0t
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.A0v
            X.2ii r2 = new X.2ii
            r17 = r37
            r18 = r4
            r19 = r12
            r20 = r16
            r21 = r25
            r22 = r26
            r23 = r28
            r24 = r29
            r25 = r1
            r26 = r3
            r27 = r0
            r28 = r14
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r12.A0D = r2
            X.0sq r1 = r12.A05
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r1.Ack(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.RestoreFromBackupActivity.A3Q(boolean):void");
    }

    public final void A3R(boolean z2) {
        if (this.A0O.A0E()) {
            if (z2) {
                A3K(6);
                return;
            }
        } else if (this.A0R.A05() > 0) {
            this.A0R.A00 = 3;
            A3O((C34121jj) null, 23);
            A3E();
            return;
        }
        this.A0R.A00 = 4;
        A3G();
        A38(false);
    }

    public final void A3S(boolean z2) {
        AnonymousClass00B.A01();
        AnonymousClass00T.A05(this, R.id.restore_actions_view).setVisibility(0);
        AnonymousClass00T.A05(this, R.id.restore_general_info).setVisibility(0);
        AnonymousClass00T.A05(this, R.id.calculating_progress_view).setVisibility(0);
        AnonymousClass00T.A05(this, R.id.google_drive_looking_for_backup_view).setVisibility(0);
        AnonymousClass00T.A05(this, R.id.google_drive_restore_animation_view).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.google_drive_progress).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.google_drive_progress_info).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.google_drive_restore_view).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.google_drive_media_will_be_downloaded_later_notice).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.msgrestore_result_box).setVisibility(8);
        AnonymousClass00T.A05(this, R.id.nextBtn).setVisibility(8);
        File databasePath = getDatabasePath("msgstore.db");
        if (databasePath.exists()) {
            boolean delete = databasePath.delete();
            StringBuilder sb = new StringBuilder();
            sb.append("restore>RestoreFromBackupActivity/show-msgstore-downloading-view/restore-failed ");
            if (!delete) {
                sb.append(databasePath);
                sb.append(" exists but cannot be deleted, message restore might fail");
                Log.w(sb.toString());
            } else {
                sb.append(databasePath);
                sb.append(" deleted");
                Log.i(sb.toString());
            }
        }
        this.A0U.A00();
        A3Q(!z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0.A01 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3T(boolean r11) {
        /*
            r10 = this;
            X.1BN r1 = r10.A0c
            if (r11 == 0) goto L_0x00df
            java.lang.String r0 = "restore_successful"
        L_0x0007:
            r1.A01(r0)
            X.AnonymousClass00B.A01()
            X.2ik r0 = r10.A0F
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.A01
            r5 = 1
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r5 = 0
        L_0x0019:
            com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r10.A0J
            if (r0 != 0) goto L_0x0028
            r0 = 2131363895(0x7f0a0837, float:1.8347612E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = (com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView) r0
            r10.A0J = r0
        L_0x0028:
            r0.A04(r6)
            r0 = 2131365806(0x7f0a0fae, float:1.8351488E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r10.A05
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A08
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A07
            if (r0 != 0) goto L_0x0050
            r0 = 2131363891(0x7f0a0833, float:1.8347604E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.A07 = r0
        L_0x0050:
            r0.setVisibility(r1)
            r0 = 2131364760(0x7f0a0b98, float:1.8349366E38)
            android.view.View r4 = X.AnonymousClass00T.A05(r10, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setVisibility(r6)
            if (r5 == 0) goto L_0x00c0
            X.0rz r1 = r10.A09
            r0 = 2
            r1.A0j(r0)
            X.013 r9 = r10.A01
            r8 = 2131755167(0x7f10009f, float:1.9141206E38)
            X.0tq r0 = r10.A0T
            int r0 = r0.A00()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.0tq r2 = r10.A0T
            int r2 = r2.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r6] = r2
            java.lang.String r2 = r9.A0J(r3, r8, r0)
        L_0x0085:
            java.lang.String r1 = "restore>RestoreFromBackupActivity/after-msgstore-verified/restore-media/ "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.setText(r2)
            r0 = 2131364832(0x7f0a0be0, float:1.8349512E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r10, r0)
            r1.setVisibility(r6)
            X.01V r0 = r10.A08
            android.view.accessibility.AccessibilityManager r0 = r0.A0P()
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x00b7
            r1.setFocusableInTouchMode(r7)
            r1.requestFocus()
        L_0x00b7:
            X.3Cg r0 = new X.3Cg
            r0.<init>(r10, r11, r5)
            r1.setOnClickListener(r0)
            return
        L_0x00c0:
            X.013 r9 = r10.A01
            r8 = 2131755168(0x7f1000a0, float:1.9141208E38)
            X.0tq r0 = r10.A0T
            int r0 = r0.A00()
            long r1 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.0tq r0 = r10.A0T
            int r0 = r0.A00()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r6] = r0
            java.lang.String r2 = r9.A0J(r3, r8, r1)
            goto L_0x0085
        L_0x00df:
            java.lang.String r0 = "restore_unsuccessful"
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.RestoreFromBackupActivity.A3T(boolean):void");
    }

    public final void A3U(boolean z2) {
        View view = this.A03;
        if (z2) {
            view.setVisibility(0);
            A3J(1);
            return;
        }
        view.setVisibility(8);
    }

    public final boolean A3V() {
        return AnonymousClass29T.A03(this) || this.A0h;
    }

    public final boolean A3W() {
        return this.A0t.size() < this.A0s.size() || this.A0x.get();
    }

    public final boolean A3X() {
        if (!this.A0O.A0E() || !RequestPermissionActivity.A0Z(this.A09, C28971Zm.A00(this, false, true))) {
            return false;
        }
        A3K(8);
        return true;
    }

    public final boolean A3Y(String str, int i2) {
        AnonymousClass00B.A00();
        StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/auth-request/ account being used is ");
        sb.append(AnonymousClass2GK.A0B(str));
        Log.i(sb.toString());
        this.A05.Acl(new RunnableRunnableShape0S1101000_I0(this, str, i2, 0));
        Log.i("restore>RestoreFromBackupActivity/auth-request/blocking on tokenReceived");
        this.A0o.block(100000);
        return this.A0g != null;
    }

    public void APk(int i2) {
        String str;
        if (i2 == 10 || i2 == 11) {
            StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/user clicked skip restore for");
            sb.append(i2 == 11 ? "google" : "local");
            sb.append("backup");
            Log.i(sb.toString());
        } else if (i2 == 12) {
            Log.i("restore>RestoreFromBackupActivity/restore-media-on-cellular-dialog/Wi-Fi unavailable and user agreed to restore media on cellular.");
            this.A09.A0K().putString("gdrive_media_restore_network_setting", String.valueOf(1)).apply();
            Log.i("restore>RestoreFromBackupActivity/start to restore media");
            C446524y.A00(this, C14750ph.A0d(this, "action_restore_media"));
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
            setResult(3);
            finish();
        } else if (i2 == 14) {
            this.A0E.A0B.A0C(1729);
            Log.i("restore>RestoreFromBackupActivity/no-local-or-gdrive-backup-found-dialog/no google drive backups found and user is not interested in adding an account for that either.");
            A3H();
            setResult(1);
        } else if (i2 == 16) {
            Log.i("restore>RestoreFromBackupActivity/one-time-setup-is-taking-too-long/user decided to cancel looking for backups");
            AnonymousClass2GS.A02();
            this.A0v.set(true);
            if (this.A0R.A05() > 0) {
                A3O((C34121jj) null, 23);
                A3E();
                return;
            }
            A3G();
            A38(false);
        } else {
            if (i2 == 18) {
                Log.i("restore>RestoreFromBackupActivity/failed-to-restore-messages-from-selected-backup/user decided to continue without restore");
                A3G();
            } else {
                if (i2 == 19) {
                    str = "restore>RestoreFromBackupActivity/failed-to-restore-messages/internal-storage-out-of-free-space/user clicked ok";
                } else if (i2 == 20) {
                    if (A3W()) {
                        str = "restore>RestoreFromBackupActivity/msgstore-jid-mismatch/restore-from-older";
                    } else {
                        Log.i("restore>RestoreFromBackupActivity/msgstore-jid-mismatch/skip");
                    }
                } else if (i2 == 22) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history")));
                    return;
                } else if (i2 == 23) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history")));
                    A3S(true);
                    return;
                } else if (i2 == 24) {
                    boolean z2 = false;
                    if (Build.VERSION.SDK_INT >= 26) {
                        z2 = true;
                    }
                    startActivityForResult(new Intent(z2 ? "android.os.storage.action.MANAGE_STORAGE" : "android.settings.INTERNAL_STORAGE_SETTINGS"), 7);
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder("unexpected dialog box: ");
                    sb2.append(i2);
                    throw new IllegalStateException(sb2.toString());
                }
                Log.i(str);
                A3S(true);
                return;
            }
            A38(false);
            A3T(false);
        }
    }

    public void APl(int i2) {
        if (i2 == 13) {
            Log.i("restore>RestoreFromBackupActivity/insufficient-space-dialog/neutral-click");
            return;
        }
        StringBuilder sb = new StringBuilder("unexpected dialog box: ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public void APm(int i2) {
        if (i2 == 10) {
            Log.i("restore>RestoreFromBackupActivity/show-restore/user declined to restore from local backup");
            setResult(2);
            A3H();
        } else if (i2 == 11) {
            Log.i("restore>RestoreFromBackupActivity/user confirmed to skip restore");
            if (this.A0R.A05() <= 0 || !this.A0x.get()) {
                A3F();
                return;
            }
            A3O((C34121jj) null, 23);
            A3E();
        } else {
            if (i2 == 12) {
                Log.i("restore>RestoreFromBackupActivity/restore-media-on-cellular-dialog/Wi-Fi unavailable and user declined to restore media on cellular.");
                setResult(3);
            } else {
                if (i2 == 13) {
                    Log.i("restore>RestoreFromBackupActivity/insufficient-storage-for-restore/user-decided-to-visit-storage-settings");
                } else if (i2 == 14) {
                    Log.i("restore>RestoreFromBackupActivity/one-time-setup/no google drive backups found and user decided to add an account or give permission to an existing one.");
                    Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
                    int length = accountsByType.length;
                    int i3 = length + 1;
                    String[] strArr = new String[i3];
                    for (int i4 = 0; i4 < length; i4++) {
                        strArr[i4] = accountsByType[i4].name;
                    }
                    int i5 = i3 - 1;
                    strArr[i5] = getString(R.string.str09ce);
                    String[] strArr2 = new String[i3];
                    boolean[] zArr = new boolean[i3];
                    List list = this.A0s;
                    list.clear();
                    for (int i6 = 0; i6 < length; i6++) {
                        list.add(accountsByType[i6]);
                        if (this.A0t.contains(accountsByType[i6])) {
                            strArr2[i6] = getString(R.string.str09e1);
                            zArr[i6] = false;
                        } else {
                            strArr2[i6] = null;
                            zArr[i6] = true;
                        }
                    }
                    zArr[i5] = true;
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_id", 17);
                    bundle.putString("title", getString(R.string.str09cf));
                    bundle.putStringArray("multi_line_list_items_key", strArr);
                    bundle.putStringArray("multi_line_list_item_values_key", strArr2);
                    bundle.putBooleanArray("list_item_enabled_key", zArr);
                    bundle.putString("disabled_item_toast_key", getString(R.string.str099f));
                    singleChoiceListDialogFragment.A0T(bundle);
                    if (!A3V()) {
                        singleChoiceListDialogFragment.A1G(AGM(), (String) null);
                        return;
                    }
                    return;
                } else if (i2 == 15) {
                    Log.i("restore>RestoreFromBackupActivity/google-play-services-is-broken/user decided to skip restore");
                    setResult(1);
                } else if (i2 == 16) {
                    Log.i("restore>RestoreFromBackupActivity/one-time-setup-taking-too-long/user decided to wait for restore");
                    return;
                } else {
                    if (i2 == 18) {
                        Log.i("restore>RestoreFromBackupActivity/failed-to-restore-from-selected-backup/restoring from an older backup");
                    } else if (i2 != 19) {
                        if (i2 == 20) {
                            Log.i("restore>RestoreFromBackupActivity/msgstore-jid-mistmatch/user decided to re-register");
                            C17020u3 r1 = this.A0Y;
                            Log.i("register/phone/clear-reg-preferences");
                            SharedPreferences.Editor edit = r1.A00(C19760yx.A00(this, "com.obwhatsapp.registration.RegisterPhone")).edit();
                            edit.clear();
                            if (!edit.commit()) {
                                Log.w("register/phone/failed-to-clear-reg-preferences");
                            }
                            this.A0a.A08();
                            Intent A042 = C14750ph.A04(this);
                            A042.setFlags(268435456);
                            startActivity(A042);
                            this.A0P.A05("RestoreFromBackupActivity");
                            return;
                        } else if (i2 == 21) {
                            Log.i("restore>RestoreFromBackupActivity/failed-to-restore-from-selected-backup/re-enter-encryption-key");
                            A3S(false);
                            return;
                        } else if (i2 == 22) {
                            return;
                        } else {
                            if (!(i2 == 23 || i2 == 24)) {
                                StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/unexpected dialog box: ");
                                sb.append(i2);
                                throw new IllegalStateException(sb.toString());
                            }
                        }
                    }
                    A3S(true);
                    return;
                }
                boolean z2 = false;
                if (Build.VERSION.SDK_INT >= 26) {
                    z2 = true;
                }
                startActivityForResult(new Intent(z2 ? "android.os.storage.action.MANAGE_STORAGE" : "android.settings.INTERNAL_STORAGE_SETTINGS"), 7);
                return;
            }
            finish();
        }
    }

    public void APr(int i2) {
        if (i2 == 17) {
            Log.i("restore>RestoreFromBackupActivity/account-selector-dialog/user dismissed the dialog");
            A3Q(true);
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected dialog id:");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public void AXG(String[] strArr, int i2, int i3) {
        if (i2 != 17) {
            StringBuilder sb = new StringBuilder("Unexpected dialogId: ");
            sb.append(i2);
            sb.append(" index:");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        } else if (strArr[i3].equals(getString(R.string.str09ce))) {
            AnonymousClass2GK.A00.execute(new RunnableRunnableShape3S0200000_I0_1(this, 0, AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null)));
            Log.i("restore>RestoreFromBackupActivity/show-accounts/waiting-for-add-account-activity-to-return");
        } else {
            Intent intent = new Intent();
            intent.putExtra("authAccount", strArr[i3]);
            onActivityResult(3, -1, intent);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 5) {
            StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/request-permissions/result/");
            sb.append(i3);
            Log.i(sb.toString());
        } else if (i2 == 6) {
            StringBuilder sb2 = new StringBuilder("restore>RestoreFromBackupActivity/request-permissions-storage-and-contact/result/");
            sb2.append(i3);
            Log.i(sb2.toString());
            A3R(false);
            return;
        } else if (i2 == 2) {
            StringBuilder sb3 = new StringBuilder("restore>RestoreFromBackupActivity/request-to-fix-google-play-services/result/");
            sb3.append(i3);
            Log.i(sb3.toString());
            A3Q(false);
            return;
        } else if (i2 == 1) {
            if (i3 == -1) {
                AnonymousClass00B.A06(intent);
                this.A0g = intent.getStringExtra("authtoken");
                this.A0o.open();
                this.A05.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 21));
                return;
            }
            return;
        } else if (i2 == 3) {
            if (i3 == -1) {
                AnonymousClass00B.A06(intent);
                AnonymousClass00B.A06(intent.getExtras());
                String string = intent.getExtras().getString("authAccount");
                AnonymousClass2GK.A0B(string);
                if (string == null) {
                    Log.e("restore>RestoreFromBackupActivity/activity-result/account-picker/no account was provided");
                    return;
                } else {
                    this.A05.Acl(new RunnableRunnableShape0S1100000_I0(12, string, this));
                    return;
                }
            } else {
                StringBuilder sb4 = new StringBuilder("restore>RestoreFromBackupActivity/activity-result/account-picker-request/");
                sb4.append(i3);
                Log.e(sb4.toString());
                A3G();
                A38(false);
                return;
            }
        } else if (i2 == 4) {
            StringBuilder sb5 = new StringBuilder("restore>RestoreFromBackupActivity/activity-result/account-added-request/");
            sb5.append(i3);
            Log.i(sb5.toString());
            Intent className = new Intent().setClassName(getPackageName(), "com.obwhatsapp.backup.google.RestoreFromBackupActivity");
            className.setAction("action_show_restore_one_time_setup");
            startActivity(className);
            return;
        } else if (i2 == 0) {
            StringBuilder sb6 = new StringBuilder("restore>RestoreFromBackupActivity/activity-result/password-input-activity/");
            sb6.append(i3);
            Log.i(sb6.toString());
            if (i3 == -1) {
                A3J(7);
                if (this.A0L.A00 == 23) {
                    A3O((C34121jj) null, 27);
                    A3C();
                    A3P(true);
                    return;
                }
                C55062ik r6 = this.A0F;
                A3C();
                this.A05.Acl(new RunnableRunnableShape0S1200100_I0(this, r6, r6.A05, 0, r6.A00));
                return;
            }
            return;
        } else if (i2 == 7) {
            A3S(true);
            return;
        } else if (i2 == 8) {
            if (this.A0O.A0E()) {
                AnonymousClass00B.A01();
                if (!A3V()) {
                    C55862kX r1 = new C55862kX(22);
                    r1.A06(getString(R.string.str098a));
                    r1.A02(getString(R.string.str098b));
                    r1.A07(false);
                    r1.A05(getString(R.string.str0e87));
                    r1.A03(getString(R.string.str1cf6));
                    PromptDialogFragment A002 = r1.A00();
                    AnonymousClass050 r12 = new AnonymousClass050(AGM());
                    r12.A0C(A002, (String) null);
                    r12.A02();
                    return;
                }
                return;
            }
        } else if (i2 != 9) {
            super.onActivityResult(i2, i3, intent);
            return;
        } else if (i3 == -1) {
            AnonymousClass00B.A01();
            Log.i("restore>RestoreFromBackupActivity/show-importing-view");
            ((TextView) findViewById(R.id.title_toolbar_text)).setText("");
            ((TextView) findViewById(R.id.activity_gdrive_backup_found_category)).setText(R.string.str009d);
            findViewById(R.id.restore_actions_view).setVisibility(8);
            findViewById(R.id.restore_general_info).setVisibility(8);
            findViewById(R.id.import_general_info).setVisibility(8);
            findViewById(R.id.gdrive_restore_info).setVisibility(8);
            findViewById(R.id.calculating_progress_view).setVisibility(8);
            findViewById(R.id.google_drive_backup_error_info_view).setVisibility(8);
            findViewById(R.id.google_drive_restore_animation_view).setVisibility(0);
            this.A05.setVisibility(0);
            this.A05.setIndeterminate(true);
            C812447k.A00(this.A05, AnonymousClass00T.A00(this, R.color.color0541));
            this.A08.setVisibility(0);
            this.A08.setText(R.string.str0b3c);
            View findViewById = findViewById(R.id.restore_actions_view);
            AnonymousClass00B.A04(findViewById);
            findViewById.setVisibility(8);
            if (intent != null && intent.getData() != null) {
                Uri data = intent.getData();
                RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0L;
                C100104v6 r0 = new C100104v6(data, restoreFromBackupViewModel);
                AnonymousClass1KN r3 = restoreFromBackupViewModel.A04;
                C77563vy r13 = r3.A01;
                r13.A02(r0);
                r3.A0C.Ack(new AnonymousClass37Q(data, r13, r3, r3.A06), new Void[0]);
                return;
            }
            return;
        } else {
            return;
        }
        A3Q(true);
    }

    public void onBackPressed() {
        C19980zJ.A03(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0216, code lost:
        A3O((X.C34121jj) null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0219, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            r0 = 2131100913(0x7f0604f1, float:1.781422E38)
            X.C434920f.A04(r8, r0)
            X.0sq r6 = r8.A05
            X.0ua r1 = r8.A09
            X.0uj r5 = r8.A0d
            X.013 r2 = r8.A01
            X.1KQ r3 = r8.A0W
            X.0zG r4 = r8.A0D
            X.39H r0 = new X.39H
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.A0Z = r0
            X.02z r1 = new X.02z
            r1.<init>(r8)
            java.lang.Class<com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel> r0 = com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel.class
            X.01n r0 = r1.A01(r0)
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = (com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel) r0
            r8.A0L = r0
            X.0yo r0 = r8.A0G
            boolean r0 = r0.A0A()
            r2 = 0
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google drive access is not possible"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r8.setResult(r2)
        L_0x003c:
            r8.finish()
        L_0x003f:
            return
        L_0x0040:
            r0 = 2131558474(0x7f0d004a, float:1.8742265E38)
            r8.setContentView((int) r0)
            r0 = 2131366661(0x7f0a1305, float:1.8353222E38)
            android.view.View r1 = r8.findViewById(r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            android.content.Context r0 = r8.getApplicationContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 != 0) goto L_0x006c
            r8.Aem(r1)
            X.02i r0 = r8.x()
            if (r0 == 0) goto L_0x006c
            r0.A0N(r2)
            r0.A0Q(r2)
        L_0x006c:
            r0 = 2131886239(0x7f12009f, float:1.9407051E38)
            r8.setTitle(r0)
            r0 = 2131363826(0x7f0a07f2, float:1.8347472E38)
            android.view.View r1 = r8.findViewById(r0)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r2 = 2131101273(0x7f060659, float:1.7814951E38)
            int r0 = X.AnonymousClass00T.A00(r8, r2)
            X.C812447k.A00(r1, r0)
            r0 = 2131362479(0x7f0a02af, float:1.834474E38)
            android.view.View r1 = r8.findViewById(r0)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            int r0 = X.AnonymousClass00T.A00(r8, r2)
            X.C812447k.A00(r1, r0)
            r0 = 2131363892(0x7f0a0834, float:1.8347606E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r8, r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r8.A05 = r0
            r0 = 2131363893(0x7f0a0835, float:1.8347608E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r8, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.A08 = r0
            r0 = 2131363835(0x7f0a07fb, float:1.834749E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r8, r0)
            r8.A03 = r0
            r0 = 2131365282(0x7f0a0da2, float:1.8350425E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r8, r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r8.A04 = r0
            r0 = 2131363836(0x7f0a07fc, float:1.8347492E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r8, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.A06 = r0
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = r8.A0L
            X.027 r2 = r0.A02
            r1 = 10
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r8, (int) r1)
            r2.A0A(r8, r0)
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = r8.A0L
            X.1cy r1 = r0.A07
            r2 = 1
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0
            r0.<init>(r8, r2)
            r1.A0A(r8, r0)
            android.content.Context r3 = r8.getApplicationContext()
            r4 = 0
            android.content.Context r0 = r8.getApplicationContext()
            android.content.Intent r1 = X.C14750ph.A0d(r0, r4)
            android.content.ServiceConnection r0 = r8.A0l
            boolean r0 = r3.bindService(r1, r0, r2)
            r8.A0j = r0
            if (r9 != 0) goto L_0x017d
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r1 = r8.A0L
            r0 = 21
            r1.A00 = r0
            r8.A0S = r4
            X.0rz r0 = r8.A09
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "gdrive_activity_state"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "gdrive_activity_msgstore_init_key"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
        L_0x0119:
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = r8.A0L
            int r0 = r0.A00
            r6 = 24
            r5 = 22
            if (r0 != r6) goto L_0x0138
            X.0yo r0 = r8.A0G
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0138
            java.lang.String r0 = "restore>RestoreFromBackupActivity/update-state/it looks like restoring from gdrive has been completed but we missed it, let's try again"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1jj r0 = r8.A0S
            r8.A3O(r0, r5)
        L_0x0138:
            if (r9 != 0) goto L_0x0175
            r7 = r4
        L_0x013b:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/update-state/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = r8.A0L
            int r0 = r0.A00
            java.lang.String r0 = A02(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = r8.A0L
            int r3 = r0.A00
            java.lang.String r1 = "restore_account_data cannot be null"
            r0 = 23
            switch(r3) {
                case 21: goto L_0x01e4;
                case 22: goto L_0x0289;
                case 23: goto L_0x0282;
                case 24: goto L_0x024c;
                case 25: goto L_0x01db;
                case 26: goto L_0x021a;
                case 27: goto L_0x0208;
                case 28: goto L_0x01ff;
                case 29: goto L_0x01f6;
                default: goto L_0x0161;
            }
        L_0x0161:
            java.lang.String r1 = "Unknown state: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0175:
            java.lang.String r0 = "restore_account_data"
            android.os.Bundle r7 = r9.getBundle(r0)
            goto L_0x013b
        L_0x017d:
            X.0rz r0 = r8.A09
            X.01D r6 = r0.A01
            java.lang.Object r1 = r6.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "gdrive_activity_state"
            r5 = -1
            int r3 = r1.getInt(r0, r5)
            java.lang.Object r1 = r6.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "gdrive_activity_msgstore_init_key"
            int r0 = r1.getInt(r0, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r1, r0)
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r5 = r8.A0L
            java.lang.Object r0 = r6.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            r1 = -1
            if (r3 != r1) goto L_0x01b6
            r3 = 21
        L_0x01b6:
            r5.A00 = r3
            r0 = 26
            if (r3 != r0) goto L_0x01d9
            java.lang.Object r0 = r6.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            if (r3 != r1) goto L_0x01d0
            r1 = 0
            X.1jj r0 = new X.1jj
            r0.<init>(r1)
        L_0x01cc:
            r8.A0S = r0
            goto L_0x0119
        L_0x01d0:
            r0 = 7
            if (r3 > r0) goto L_0x02ae
            X.1jj r0 = new X.1jj
            r0.<init>(r3)
            goto L_0x01cc
        L_0x01d9:
            r0 = 0
            goto L_0x01cc
        L_0x01db:
            if (r7 == 0) goto L_0x003f
            X.2ik r0 = X.C55062ik.A00(r7)
            r8.A0F = r0
            return
        L_0x01e4:
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = r1.getAction()
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = "restore>RestoreFromBackupActivity/update-state/new state but no action provided. Finishing."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x003c
        L_0x01f6:
            r8.A3D()
            r8.A3B()
            r0 = 29
            goto L_0x0216
        L_0x01ff:
            r0 = 28
            r8.A3O(r4, r0)
            r8.A3D()
            return
        L_0x0208:
            r8.A3O(r4, r0)
            r8.A3E()
            r8.A3C()
            r8.A3P(r2)
            r0 = 27
        L_0x0216:
            r8.A3O(r4, r0)
            return
        L_0x021a:
            X.1jj r2 = r8.A0S
            if (r7 == 0) goto L_0x0245
            X.2ik r0 = X.C55062ik.A00(r7)
            r8.A0F = r0
            r8.A3O(r4, r5)
            X.2ik r0 = r8.A0F
            r8.A3N(r0)
        L_0x022c:
            r8.A3C()
            java.lang.String r1 = "restore>RestoreFromBackupActivity/update-state/msgstore-init-status/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A37(r2)
            return
        L_0x0245:
            r8.A3O(r4, r0)
            r8.A3E()
            goto L_0x022c
        L_0x024c:
            if (r7 == 0) goto L_0x027c
            X.2ik r0 = X.C55062ik.A00(r7)
            r8.A0F = r0
            r8.A3O(r4, r5)
            X.2ik r0 = r8.A0F
            r8.A3N(r0)
            r8.A3O(r4, r6)
            r8.A3C()
            X.0rz r0 = r8.A09
            int r1 = r0.A09()
            r0 = 3
            if (r1 != r0) goto L_0x0272
            java.lang.String r0 = "restore>RestoreFromBackupActivity/update-state/gdrive-msgstore-download-pending"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0272:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/update-state/gdrive-msgstore-download-not-pending"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A3P(r2)
            return
        L_0x027c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0282:
            r8.A3O(r4, r0)
            r8.A3E()
            return
        L_0x0289:
            if (r7 == 0) goto L_0x02a4
            X.2ik r0 = X.C55062ik.A00(r7)
            r8.A0F = r0
            r8.A3O(r4, r5)
            X.2ik r0 = r8.A0F
            r8.A3N(r0)
            X.0sq r1 = r8.A05
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1
            r0.<init>(r8, r2, r9)
            r1.Acl(r0)
            return
        L_0x02a4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02aa:
            r8.onNewIntent(r1)
            return
        L_0x02ae:
            java.lang.String r1 = "Initialization state is not recognized. State = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.RestoreFromBackupActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.str13df);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        this.A0h = true;
        if (this.A0w.compareAndSet(true, false)) {
            this.A0I.A03(this.A0p);
            AnonymousClass1KL r0 = this.A0C;
            r0.A00.A03(this.A0q);
        }
        if (this.A0j) {
            getApplicationContext().unbindService(this.A0l);
        }
        this.A0Z.A00();
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        Intent intent2 = intent;
        super.onNewIntent(intent2);
        if (intent2.getAction() == null) {
            Log.e("restore>RestoreFromBackupActivity/new-intent action is null");
        } else if (!intent2.getAction().equals("action_show_restore_one_time_setup")) {
            StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/new-intent/unexpected action: ");
            sb.append(intent2.getAction());
            Log.e(sb.toString());
            finish();
        } else {
            Dialog A022 = AnonymousClass2GK.A02(this, new IDxCListenerShape161S0100000_2_I0(this, 2), C437421i.A00(this.A0N.A00), 2, false);
            if (A022 != null && !A3V() && !AnonymousClass2GK.A0I(this.A09)) {
                Log.i("restore>RestoreFromBackupActivity/new-intent/existing user with unavailable google play services");
                A022.show();
            } else if (this.A09.A0M() == null) {
                A3Q(false);
            } else {
                boolean z2 = false;
                if (this.A09.A09() == 3) {
                    z2 = true;
                }
                if (z2) {
                    Log.i("restore>RestoreFromBackupActivity/new-intent/continue-msgstore-download");
                    AnonymousClass00T.A05(this, R.id.google_drive_looking_for_backup_view).setVisibility(8);
                    AnonymousClass00T.A05(this, R.id.google_drive_restore_view).setVisibility(0);
                    A3C();
                    String A0M2 = this.A09.A0M();
                    AnonymousClass00B.A06(A0M2);
                    long A0I2 = this.A09.A0I(A0M2);
                    long A0H2 = this.A09.A0H(A0M2);
                    String string = getString(R.string.str0957);
                    if (A0H2 > 0) {
                        string = C28961Zl.A01(this.A01, A0H2).toString();
                    }
                    if (!this.A09.A1X()) {
                        string = C28961Zl.A01(this.A01, this.A0R.A07()).toString();
                    }
                    String A032 = AnonymousClass2GQ.A03(this.A01, A0I2);
                    if (this.A0F == null) {
                        this.A0F = new C55062ik(A0M2, A0H2, A0I2, this.A09.A1X(), false, ((SharedPreferences) this.A09.A01.get()).getBoolean("gdrive_last_restore_file_is_encrypted", false));
                    }
                    ((TextView) AnonymousClass00T.A05(this, R.id.gdrive_restore_info)).setText(getString(R.string.str09a6, new Object[]{A0M2, string, A032}));
                    A3U(this.A0F.A02);
                    A3I();
                } else if (this.A09.A06() != 0) {
                    Log.i("restore>RestoreFromBackupActivity/new-intent/msgstore-download-already-finished, restoring");
                    AnonymousClass00T.A05(this, R.id.google_drive_looking_for_backup_view).setVisibility(8);
                    AnonymousClass00T.A05(this, R.id.google_drive_restore_view).setVisibility(0);
                    AnonymousClass027 r5 = this.A0L.A02;
                    r5.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 10));
                    Number number = (Number) r5.A01();
                    if (number != null) {
                        this.A06.setText(AnonymousClass2UF.A02(this, this.A01, number.longValue()));
                    }
                    RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0L;
                    restoreFromBackupViewModel.A08.Acl(new RunnableRunnableShape3S0100000_I0_2(restoreFromBackupViewModel, 34));
                    A3U(((SharedPreferences) this.A09.A01.get()).getBoolean("gdrive_last_restore_file_is_encrypted", false));
                    A3C();
                    A3P(true);
                } else {
                    A3H();
                    setResult(2);
                }
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        String str3 = "one-time-restore";
        this.A0b.A02(str3);
        AnonymousClass39H r5 = this.A0Z;
        AnonymousClass12L r4 = this.A0b;
        C34121jj r0 = this.A0S;
        if (r0 != null) {
            int i2 = r0.A00;
            if (i2 == 3) {
                sb2 = new StringBuilder();
                sb2.append(str3);
                str2 = "-jid-mismatch";
            } else if (i2 == 4) {
                sb2 = new StringBuilder();
                sb2.append(str3);
                str2 = "-integrity-check-failed";
            }
            sb2.append(str2);
            str3 = sb2.toString();
        }
        int A002 = C437421i.A00(this.A0N.A00);
        if (A002 != 0) {
            if (A002 == 1) {
                sb = new StringBuilder();
                sb.append(str3);
                str = "-no-gs";
            } else if (A002 != 2) {
                if (A002 != 3) {
                    sb.append(str3);
                    str = "-gs-invalid";
                } else {
                    sb.append(str3);
                    str = "-gs-disabled";
                }
            } else {
                sb = new StringBuilder();
                sb.append(str3);
                str = "-update-gs";
            }
            sb.append(str);
            str3 = sb.toString();
        }
        r5.A01(this, r4, str3);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C55062ik r0 = this.A0F;
        if (r0 != null) {
            bundle.putBundle("restore_account_data", r0.A01());
        }
        bundle.putLong("total_download_size", this.A01);
        bundle.putLong("media_download_size", this.A02);
        StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/save-state/total-download-size:");
        sb.append(this.A01);
        sb.append(", media-download-size:");
        sb.append(this.A02);
        sb.append(", restore-account-data:");
        sb.append(this.A0F);
        Log.i(sb.toString());
    }

    public void setTitle(int i2) {
        ((TextView) AnonymousClass00T.A05(this, R.id.title_toolbar_text)).setText(i2);
    }
}
