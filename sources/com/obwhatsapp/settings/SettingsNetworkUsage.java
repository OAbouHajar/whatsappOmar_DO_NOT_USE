package com.obwhatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass1ZW;
import X.AnonymousClass2GQ;
import X.AnonymousClass3K2;
import X.AnonymousClass5CV;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C17130ua;
import X.C19670yo;
import X.C28891Zc;
import X.C28981Zo;
import X.C32241fu;
import X.C42681yF;
import X.C47672Jx;
import X.C49132Rg;
import X.C84354Kf;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.Statistics$Data;
import com.obwhatsapp.components.RoundCornerProgressBar;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.TimerTask;

public class SettingsNetworkUsage extends C14530pL {
    public Handler A00;
    public C17130ua A01;
    public C19670yo A02;
    public AnonymousClass013 A03;
    public TimerTask A04;
    public boolean A05;
    public final Timer A06;

    public class ResetUsageConfirmationDialog extends Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog {
        public Dialog A1B(Bundle bundle) {
            C32241fu A0R = AnonymousClass3K2.A0R(this);
            A0R.A01(R.string.str1598);
            return AnonymousClass3K2.A0O(new IDxCListenerShape128S0100000_2_I1(this, 99), A0R, R.string.str1451);
        }
    }

    public SettingsNetworkUsage() {
        this(0);
        this.A06 = new Timer("refresh-network-usage");
    }

    public SettingsNetworkUsage(int i2) {
        this.A05 = false;
        C13680ns.A1G(this, 119);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = C16150sX.A05(r1);
            this.A03 = C16150sX.A0Z(r1);
            this.A02 = (C19670yo) r1.AB4.get();
        }
    }

    public final void A35(int i2, int i3, int i4, long j2, long j3, long j4) {
        TextView A0N = C13680ns.A0N(this, i2);
        String A042 = AnonymousClass2GQ.A04(this.A03, j2);
        A0N.setText(A042);
        String A0G = this.A03.A0G(A042);
        int i5 = 0;
        A0N.setContentDescription(C13680ns.A0d(this, A0G, new Object[1], 0, R.string.str153b));
        TextView A0N2 = C13680ns.A0N(this, i3);
        String A043 = AnonymousClass2GQ.A04(this.A03, j3);
        A0N2.setText(A043);
        A0N2.setContentDescription(C13680ns.A0d(this, this.A03.A0G(A043), new Object[1], 0, R.string.str153a));
        if (j4 > 0) {
            i5 = (int) ((((float) (j2 + j3)) * 100.0f) / ((float) j4));
        }
        ((RoundCornerProgressBar) findViewById(i4)).setProgress(i5);
    }

    public final void A36(boolean z2) {
        String A0d;
        if (z2) {
            C17130ua r2 = this.A01;
            Log.i("statistics/reset");
            C28981Zo r22 = r2.A00;
            AnonymousClass00B.A0G(AnonymousClass000.A1V(r22));
            r22.sendEmptyMessage(9);
        }
        Statistics$Data A002 = this.A01.A00();
        NumberFormat instance = NumberFormat.getInstance(C13690nt.A0m(this.A03));
        long j2 = A002.A0E + A002.A0G + A002.A0M + A002.A0D + A002.A0J;
        long j3 = A002.A01 + A002.A03 + A002.A0B + A002.A00 + A002.A08;
        long j4 = j2 + j3;
        C84354Kf A012 = AnonymousClass2GQ.A01(this.A03, j4);
        StringBuilder A0o = AnonymousClass000.A0o();
        String str = A012.A01;
        A0o.append(str);
        A0o.append(A012.A02);
        String str2 = A012.A00;
        SpannableString spannableString = new SpannableString(AnonymousClass000.A0h(str2, A0o));
        if (!str.isEmpty()) {
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, str.length(), 33);
        }
        if (!str2.isEmpty()) {
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), spannableString.length() - str2.length(), spannableString.length(), 33);
        }
        C13680ns.A0N(this, R.id.total_network_usage).setText(spannableString);
        C13680ns.A0N(this, R.id.total_network_usage_sent).setText(AnonymousClass2GQ.A04(this.A03, j2));
        C13680ns.A0N(this, R.id.total_network_usage_received).setText(AnonymousClass2GQ.A04(this.A03, j3));
        long j5 = j4;
        A35(R.id.call_data_sent, R.id.call_data_received, R.id.calls_data_bar, A002.A0M, A002.A0B, j5);
        long j6 = A002.A0N;
        long j7 = A002.A0C;
        TextView A0N = C13680ns.A0N(this, R.id.calls_info);
        AnonymousClass013 r8 = this.A03;
        A0N.setText(AnonymousClass1ZW.A07(r8, r8.A0J(new Object[]{instance.format(j6)}, R.plurals.plurals0139, j6), this.A03.A0J(new Object[]{instance.format(j7)}, R.plurals.plurals0138, j7)));
        A35(R.id.media_data_sent, R.id.media_data_received, R.id.media_data_bar, A002.A0E, A002.A01, j5);
        long j8 = A002.A0D;
        long j9 = A002.A00;
        if (this.A02.A0A() || j8 > 0 || j9 > 0) {
            A35(R.id.gdrive_data_sent, R.id.gdrive_data_received, R.id.gdrive_data_bar, j8, j9, j5);
        } else {
            C13680ns.A1I(this, R.id.gdrive_row, 8);
        }
        A35(R.id.messages_data_sent, R.id.messages_data_received, R.id.messages_data_bar, A002.A0G, A002.A03, j5);
        long j10 = A002.A0L + A002.A0F;
        long j11 = A002.A0A + A002.A02;
        TextView A0N2 = C13680ns.A0N(this, R.id.messages_info);
        AnonymousClass013 r12 = this.A03;
        A0N2.setText(AnonymousClass1ZW.A07(r12, r12.A0J(new Object[]{instance.format(j10)}, R.plurals.plurals013b, j10), this.A03.A0J(new Object[]{instance.format(j11)}, R.plurals.plurals013a, j11)));
        A35(R.id.status_data_sent, R.id.status_data_received, R.id.status_data_bar, A002.A0J, A002.A08, j5);
        long j12 = A002.A0K;
        long j13 = A002.A09;
        TextView A0N3 = C13680ns.A0N(this, R.id.status_info);
        AnonymousClass013 r122 = this.A03;
        A0N3.setText(AnonymousClass1ZW.A07(r122, r122.A0J(new Object[]{instance.format(j12)}, R.plurals.plurals013d, j12), this.A03.A0J(new Object[]{instance.format(j13)}, R.plurals.plurals013c, j13)));
        A35(R.id.roaming_data_sent, R.id.roaming_data_received, R.id.roaming_data_bar, A002.A0I, A002.A07, j4);
        long j14 = A002.A0O;
        if (j14 != Long.MIN_VALUE) {
            C13680ns.A1I(this, R.id.last_updated_date, 0);
            AnonymousClass013 r6 = this.A03;
            A0d = C13680ns.A0d(this, C42681yF.A05(r6, C28891Zc.A05(r6, j14), C47672Jx.A00(r6, j14)), new Object[1], 0, R.string.str0dc5);
            C13680ns.A0N(this, R.id.last_updated_date).setText(C13680ns.A0d(this, C28891Zc.A05(this.A03, j14), new Object[1], 0, R.string.str1599));
        } else {
            A0d = C13680ns.A0d(this, getString(R.string.str0dc7), new Object[1], 0, R.string.str0dc5);
            C13690nt.A1I(this, R.id.last_updated_date);
        }
        C13680ns.A0N(this, R.id.last_usage_reset).setText(A0d);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1597);
        setContentView((int) R.layout.layout04c9);
        C14530pL.A0Y(this);
        C13680ns.A19(findViewById(R.id.reset_network_usage_row), this, 4);
        this.A00 = new Handler(Looper.myLooper());
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.cancel();
    }

    public void onPause() {
        super.onPause();
        this.A04.cancel();
    }

    public void onResume() {
        super.onResume();
        AnonymousClass5CV r1 = new AnonymousClass5CV(this);
        this.A04 = r1;
        this.A06.scheduleAtFixedRate(r1, 0, 1000);
    }
}
