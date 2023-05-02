package X;

import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.mod2.fblibs.Facebook;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.1OK  reason: invalid class name */
public class AnonymousClass1OK {
    public int A00 = 5242880;
    public final C16300so A01;
    public final C17130ua A02;
    public final C16980tz A03;
    public final C16490t9 A04;
    public final C17670vS A05;
    public final C17660vR A06;
    public final C16320sq A07;

    public AnonymousClass1OK(C16300so r2, C17130ua r3, C16980tz r4, C16490t9 r5, C17670vS r6, C17660vR r7, C16320sq r8) {
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static final void A00(FileOutputStream fileOutputStream, Double d2, String str) {
        if (d2 != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(";");
                sb.append(str);
                sb.append(":");
                sb.append(String.format(Locale.US, "%.2f", new Object[]{d2}));
                fileOutputStream.write(sb.toString().getBytes());
            } catch (IOException e2) {
                StringBuilder sb2 = new StringBuilder("app/VoipTimeSeriesLogger: couldn't inject FS ");
                sb2.append(str);
                Log.w(sb2.toString(), e2);
            }
        }
    }

    public static final void A01(FileOutputStream fileOutputStream, Long l2, String str) {
        if (l2 != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(";");
                sb.append(str);
                sb.append(":");
                sb.append(l2);
                fileOutputStream.write(sb.toString().getBytes());
            } catch (IOException e2) {
                StringBuilder sb2 = new StringBuilder("app/VoipTimeSeriesLogger: couldn't inject FS ");
                sb2.append(str);
                Log.w(sb2.toString(), e2);
            }
        }
    }

    public void A02(WamCall wamCall, String str) {
        WamCall wamCall2 = wamCall;
        if (wamCall == null || !C34901l3.A00(wamCall.callResult, 1)) {
            StringBuilder sb = new StringBuilder("Skipping uploadTimeSeries. callResult: ");
            sb.append(wamCall == null ? "null FS" : wamCall.callResult);
            Log.i(sb.toString());
            return;
        }
        this.A07.Acl(new RunnableRunnableShape0S0400000_I0(this, new File(str), new C30331cB(), wamCall2, 13));
    }

    public final boolean A03(WamCall wamCall, File file) {
        File file2 = file;
        boolean z2 = false;
        if (file2.exists()) {
            C16300so r0 = this.A01;
            String A002 = r0.A00();
            C29551ao r8 = new C29551ao(this.A02, new C52082d6(this, file2), this.A05, "https://crashlogs.whatsapp.net/wa_clb_data", this.A06.A00(), 16, false, false, false);
            r8.A06(Facebook.TOKEN, "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
            r8.A07("from_jid", A002);
            r8.A07("tags", "voip_time_series");
            WamCall wamCall2 = wamCall;
            if (wamCall != null) {
                String str = wamCall2.callReplayerId;
                if (str != null && str.length() > 0) {
                    r8.A07("call_id", str);
                }
                Long l2 = wamCall2.maxConnectedParticipants;
                if (l2 != null) {
                    r8.A07("additional_metadata[max_participants]", l2.toString());
                }
                Long l3 = wamCall2.numConnectedParticipants;
                if (l3 != null) {
                    r8.A07("additional_metadata[num_participants]", l3.toString());
                }
            }
            try {
                r8.A05(new FileInputStream(file2), "file", file2.getName(), 0, file2.length());
                int A022 = r8.A02((C29561ap) null);
                if (A022 >= 400) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("app/VoiceService: upload of time series log date failed with response code: ");
                    sb.append(A022);
                    Log.w(sb.toString());
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!file2.delete()) {
                    Log.i("app/VoiceService: dummy time series log could not be deleted");
                    return z2;
                }
            } catch (IOException e2) {
                Log.w("app/VoiceService: could not upload dummy time series log data", e2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.valueOf(file2.length()));
                sb2.append(":uploadError:");
                r0.AcB("voip-time-series-upload-fail", sb2.toString(), true);
                if (file2.delete()) {
                    return false;
                }
                Log.i("app/VoiceService: dummy time series log could not be deleted");
                return false;
            } catch (Throwable th) {
                if (!file2.delete()) {
                    Log.i("app/VoiceService: dummy time series log could not be deleted");
                }
                throw th;
            }
        }
        return z2;
    }
}
