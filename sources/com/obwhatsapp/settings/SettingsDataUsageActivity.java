package com.obwhatsapp.settings;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass027;
import X.AnonymousClass15P;
import X.AnonymousClass1CW;
import X.AnonymousClass2Rf;
import X.AnonymousClass37W;
import X.AnonymousClass4Y3;
import X.AnonymousClass5CU;
import X.C004601z;
import X.C005402i;
import X.C006602z;
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
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16570tH;
import X.C16620tM;
import X.C16690tT;
import X.C16980tz;
import X.C17130ua;
import X.C17250um;
import X.C18260wP;
import X.C19200xv;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C20020zN;
import X.C23061Ai;
import X.C23071Aj;
import X.C32241fu;
import X.C41721wT;
import X.C45842Bi;
import X.C49132Rg;
import X.C49282Sg;
import X.C49292Sh;
import X.C608536j;
import X.C88094Zw;
import X.C88104Zx;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape22S0000000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5;
import com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.WaTextView;
import com.whatsapp.util.IDxATaskShape108S0100000_2_I0;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class SettingsDataUsageActivity extends C45842Bi implements C49282Sg, C49292Sh {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Handler A04;
    public View A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public SwitchCompat A0D;
    public C16570tH A0E;
    public C88094Zw A0F;
    public C17130ua A0G;
    public C88104Zx A0H;
    public WaTextView A0I;
    public C16980tz A0J;
    public C16260sj A0K;
    public C20020zN A0L;
    public C16490t9 A0M;
    public C19200xv A0N;
    public C608536j A0O;
    public SettingsDataUsageViewModel A0P;
    public C41721wT A0Q;
    public C16690tT A0R;
    public AnonymousClass1CW A0S;
    public TimerTask A0T;
    public boolean A0U;
    public String[] A0V;
    public String[] A0W;
    public final Timer A0X;

    public SettingsDataUsageActivity() {
        this(0);
        this.A0X = new Timer("refresh-network-usage");
        this.A03 = -1;
    }

    public SettingsDataUsageActivity(int i2) {
        this.A0U = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 88));
    }

    public static /* synthetic */ void A02(SettingsDataUsageActivity settingsDataUsageActivity, String str) {
        if (!settingsDataUsageActivity.A0K.A0B()) {
            int i2 = Build.VERSION.SDK_INT;
            int i3 = R.string.str1258;
            if (i2 >= 30) {
                i3 = R.string.str125b;
                if (i2 < 33) {
                    i3 = R.string.str125a;
                }
            }
            RequestPermissionActivity.A0K(settingsDataUsageActivity, R.string.str1259, i3);
            return;
        }
        settingsDataUsageActivity.startActivityForResult(C14750ph.A0g(settingsDataUsageActivity, str, 1), 1);
    }

    public void A1q() {
        if (!this.A0U) {
            this.A0U = true;
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
            this.A0J = (C16980tz) r1.AQB.get();
            this.A0G = (C17130ua) r1.AN9.get();
            this.A0M = (C16490t9) r1.AQz.get();
            this.A0S = (AnonymousClass1CW) r1.AD9.get();
            this.A0L = (C20020zN) r1.A5q.get();
            this.A0N = (C19200xv) r1.ADs.get();
            this.A0K = (C16260sj) r1.AQe.get();
            this.A0E = (C16570tH) r1.A0e.get();
        }
    }

    public final String A35(int i2) {
        String str;
        String str2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i2 != 0) {
            if ((i2 & 1) != 0) {
                arrayList.add(Integer.toString(i5));
            }
            i2 >>= 1;
            i5++;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        int length = charSequenceArr.length;
        String[] strArr = this.A0W;
        if (length == strArr.length) {
            i3 = R.string.str1520;
        } else if (length == 0) {
            i3 = R.string.str1523;
        } else {
            CharSequence charSequence = charSequenceArr[0];
            while (true) {
                if (i4 >= strArr.length) {
                    str = "";
                    break;
                }
                String charSequence2 = charSequence.toString();
                strArr = this.A0W;
                if (charSequence2.equals(strArr[i4])) {
                    str = this.A0V[i4];
                    break;
                }
                i4++;
            }
            StringBuilder sb = new StringBuilder(str);
            for (int i6 = 1; i6 < length; i6++) {
                sb.append(", ");
                CharSequence charSequence3 = charSequenceArr[i6];
                int i7 = 0;
                while (true) {
                    if (i7 >= strArr.length) {
                        str2 = "";
                        break;
                    }
                    String charSequence4 = charSequence3.toString();
                    strArr = this.A0W;
                    if (charSequence4.equals(strArr[i7])) {
                        str2 = this.A0V[i7];
                        break;
                    }
                    i7++;
                }
                sb.append(str2);
            }
            return sb.toString();
        }
        return getString(i3);
    }

    public final void A36() {
        this.A0C.setVisibility(0);
        Log.i("settings-data-usage-activity/loadStorageData");
        IDxATaskShape108S0100000_2_I0 iDxATaskShape108S0100000_2_I0 = new IDxATaskShape108S0100000_2_I0(this, this, 1);
        this.A0R = iDxATaskShape108S0100000_2_I0;
        this.A05.Ack(iDxATaskShape108S0100000_2_I0, new Void[0]);
        C608536j r2 = new C608536j(this);
        this.A0O = r2;
        this.A05.Ack(r2, new Void[0]);
    }

    public final void A37() {
        TextView textView = this.A0A;
        C88094Zw r0 = this.A0F;
        textView.setText(r0.A00.getString(C88094Zw.A03[((SharedPreferences) r0.A01.A01.get()).getInt("photo_quality", 0)]));
    }

    public final void A38() {
        TextView textView = this.A0B;
        C88104Zx r0 = this.A0H;
        textView.setText(r0.A00.getString(C88104Zx.A03[((SharedPreferences) r0.A01.A01.get()).getInt("video_quality", 0)]));
    }

    public final void A39(String str) {
        int i2;
        int i3;
        int i4;
        if (str.equals("autodownload_cellular_mask")) {
            i2 = 2;
            i3 = R.string.str1521;
            i4 = this.A00;
        } else if (str.equals("autodownload_wifi_mask")) {
            i2 = 3;
            i3 = R.string.str1526;
            i4 = this.A02;
        } else if (str.equals("autodownload_roaming_mask")) {
            i2 = 4;
            i3 = R.string.str1524;
            i4 = this.A01;
        } else {
            throw new IllegalArgumentException("Invalid preference key passed in for auto download settings dialog");
        }
        boolean[] zArr = new boolean[this.A0W.length];
        int i5 = 0;
        while (i4 != 0) {
            boolean z2 = false;
            if ((i4 & 1) != 0) {
                z2 = true;
            }
            zArr[i5] = z2;
            i4 >>= 1;
            i5++;
        }
        Afc(MultiSelectionDialogFragment.A01(zArr, i2, i3));
    }

    public void AXH(int i2, int i3) {
        if (i2 == 5) {
            C15860rz r3 = this.A0H.A01;
            if (((SharedPreferences) r3.A01.get()).getInt("video_quality", 0) != i3) {
                r3.A0K().putInt("video_quality", i3).apply();
                A38();
            }
        } else if (i2 == 6) {
            C15860rz r32 = this.A0F.A01;
            if (((SharedPreferences) r32.A01.get()).getInt("photo_quality", 0) != i3) {
                r32.A0K().putInt("photo_quality", i3).apply();
                A37();
            }
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        super.onActivityResult(i4, i5, intent2);
        if (i4 == 151) {
            if (i5 == -1) {
                A36();
                Intent intent3 = new Intent();
                intent3.setClassName(getPackageName(), "com.obwhatsapp.storage.StorageUsageActivity");
                startActivity(intent3);
                return;
            }
        } else if (i4 == 1) {
            A36();
            return;
        } else if (i4 == 2) {
            if (i5 == -1 && intent != null && Build.VERSION.SDK_INT >= 30) {
                Uri data = intent2.getData();
                C16980tz r13 = this.A0J;
                C16440t3 r12 = this.A05;
                C14870pt r9 = this.A05;
                C16320sq r15 = this.A05;
                AnonymousClass37W r5 = new AnonymousClass37W(this, this.A0E, this.A04, r9, this.A04, this.A08, r12, r13, this.A0L, r15);
                this.A05.Ack(r5, data);
                return;
            }
            return;
        }
        Log.i("settings-data-usage-activity/onActivityResult/storage_permission denied/cant open StorageUsageActivity");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0Q = new C41721wT(this.A05, this.A0S);
        C16040sK r0 = this.A01;
        r0.A0B();
        if (r0.A00 == null) {
            startActivity(C14750ph.A04(this));
            finish();
            return;
        }
        this.A0P = (SettingsDataUsageViewModel) new C006602z(this).A01(SettingsDataUsageViewModel.class);
        setTitle(R.string.str15c9);
        setContentView((int) R.layout.layout04c3);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        this.A04 = new Handler(Looper.myLooper());
        this.A0V = getResources().getStringArray(R.array.notification_action_tombstone);
        this.A0W = getResources().getStringArray(R.array.notification_template_big_media);
        this.A00 = this.A09.A03();
        this.A02 = ((SharedPreferences) this.A09.A01.get()).getInt("autodownload_wifi_mask", 15);
        this.A01 = ((SharedPreferences) this.A09.A01.get()).getInt("autodownload_roaming_mask", 0);
        View findViewById = findViewById(R.id.setting_network_usage);
        this.A06 = (TextView) findViewById(R.id.setting_network_usage_details);
        View findViewById2 = findViewById(R.id.setting_storage_usage);
        this.A0C = (TextView) findViewById(R.id.setting_storage_usage_details);
        View findViewById3 = findViewById(R.id.setting_autodownload_cellular);
        this.A07 = (TextView) findViewById(R.id.setting_selected_autodownload_cellular);
        View findViewById4 = findViewById(R.id.setting_autodownload_wifi);
        this.A09 = (TextView) findViewById(R.id.setting_selected_autodownload_wifi);
        View findViewById5 = findViewById(R.id.setting_autodownload_roaming);
        this.A08 = (TextView) findViewById(R.id.setting_selected_autodownload_roaming);
        View findViewById6 = findViewById(R.id.settings_calls_low_data);
        this.A0D = (SwitchCompat) findViewById(R.id.low_data_calls_switch);
        this.A0B = (TextView) findViewById(R.id.setting_selected_video_quality);
        this.A0A = (TextView) findViewById(R.id.setting_selected_photo_quality);
        findViewById.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 38));
        findViewById2.setOnClickListener(new ViewOnClickCListenerShape2S1100000_I0(6, AnonymousClass4Y3.A00(this.A0M, 1), this));
        this.A07.setText(A35(this.A00));
        findViewById3.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 40));
        this.A09.setText(A35(this.A02));
        findViewById4.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 41));
        this.A08.setText(A35(this.A01));
        findViewById5.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 37));
        View findViewById7 = findViewById(R.id.setting_video_quality);
        View findViewById8 = findViewById(R.id.setting_photo_quality);
        View findViewById9 = findViewById(R.id.media_quality_section);
        C14710pd r1 = this.A0C;
        C16620tM r4 = C16620tM.A02;
        if (r1.A0E(r4, 662)) {
            findViewById9.setVisibility(0);
            findViewById7.setVisibility(0);
        }
        if (this.A0C.A0E(r4, 702)) {
            findViewById9.setVisibility(0);
            findViewById8.setVisibility(0);
        }
        this.A0H = new C88104Zx(this, this.A09, this.A01);
        findViewById7.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 43));
        A38();
        this.A0F = new C88094Zw(this, this.A09, this.A01);
        findViewById8.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 42));
        A37();
        ViewStub viewStub = (ViewStub) C004601z.A0E(this.A00, R.id.user_proxy_section);
        View inflate = viewStub.inflate();
        this.A0I = (WaTextView) C004601z.A0E(this.A00, R.id.proxy_connection_status);
        inflate.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 39));
        if (this.A0C.A0E(r4, 2784)) {
            viewStub.setVisibility(0);
        } else {
            viewStub.setVisibility(8);
        }
        if (this.A01.A0G()) {
            findViewById6.setVisibility(8);
        } else {
            this.A0D.setChecked(((SharedPreferences) this.A09.A01.get()).getBoolean("voip_low_data_usage", false));
            findViewById6.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 36));
        }
        if (this.A0K.A0B()) {
            A36();
        } else {
            this.A0C.setVisibility(8);
        }
        this.A05 = findViewById(R.id.external_dir_migration_section);
        View findViewById10 = findViewById(R.id.manual_external_dir_migration);
        if (Build.VERSION.SDK_INT >= 30) {
            findViewById10.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 39));
        }
        AnonymousClass027 r2 = this.A0P.A00;
        r2.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 283));
        Object A012 = r2.A01();
        View view = this.A05;
        if (view != null) {
            int i2 = 0;
            if (Boolean.TRUE != A012) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 1) {
            return super.onCreateDialog(i2);
        }
        C32241fu r3 = new C32241fu(this);
        r3.A01(R.string.str1525);
        r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape22S0000000_2_I0(7));
        return r3.create();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0X.cancel();
        C16690tT r1 = this.A0R;
        if (r1 != null) {
            r1.A06(true);
        }
        C608536j r2 = this.A0O;
        if (r2 != null) {
            r2.A00.set(true);
            r2.A06(true);
        }
        this.A03 = -1;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.A0T.cancel();
    }

    public void onResume() {
        super.onResume();
        AnonymousClass5CU r1 = new AnonymousClass5CU(this);
        this.A0T = r1;
        this.A0X.scheduleAtFixedRate(r1, 0, 1000);
        SettingsDataUsageViewModel settingsDataUsageViewModel = this.A0P;
        settingsDataUsageViewModel.A03.Acl(new RunnableRunnableShape19S0100000_I1_2(settingsDataUsageViewModel, 45));
        WaTextView waTextView = this.A0I;
        if (waTextView != null) {
            boolean z2 = ((SharedPreferences) this.A09.A01.get()).getBoolean("proxy_enabled", false);
            int i2 = R.string.str065e;
            if (z2) {
                i2 = R.string.str0660;
            }
            waTextView.setText(i2);
        }
    }
}
