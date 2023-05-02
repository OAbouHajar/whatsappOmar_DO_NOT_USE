package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;

/* renamed from: X.2d6  reason: invalid class name and case insensitive filesystem */
public class C52082d6 implements C29541an {
    public final /* synthetic */ AnonymousClass1OK A00;
    public final /* synthetic */ File A01;

    public C52082d6(AnonymousClass1OK r1, File file) {
        this.A00 = r1;
        this.A01 = file;
    }

    public /* synthetic */ void AP3(String str) {
    }

    public /* synthetic */ void APP(long j2) {
    }

    public void AQb(String str) {
        String substring = AnonymousClass1ZW.A0E(str) ? "" : str.substring(0, Math.min(str.length(), 500));
        C16300so r5 = this.A00.A01;
        StringBuilder sb = new StringBuilder();
        File file = this.A01;
        sb.append(String.valueOf(file.length()));
        sb.append(":uploadServiceError:");
        sb.append(substring);
        r5.AcB("voip-time-series-upload-fail", sb.toString(), false);
        StringBuilder sb2 = new StringBuilder("app/VoipTimeSeriesLogger: failed upload of ");
        sb2.append(file.getName());
        sb2.append(" with size ");
        sb2.append(file.length());
        sb2.append("reason: ");
        sb2.append(substring);
        Log.w(sb2.toString());
    }

    public void AWH(String str, Map map) {
        C16300so r4 = this.A00.A01;
        File file = this.A01;
        r4.AcB("voip-time-series-upload-success", String.valueOf(file.length()), false);
        StringBuilder sb = new StringBuilder("app/VoipTimeSeriesLogger: successful upload of ");
        sb.append(file.getName());
        sb.append(" with size ");
        sb.append(file.length());
        Log.i(sb.toString());
    }
}
