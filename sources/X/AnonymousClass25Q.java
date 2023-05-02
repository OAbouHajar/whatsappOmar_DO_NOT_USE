package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.25Q  reason: invalid class name */
public class AnonymousClass25Q {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final long A0C;
    public final boolean A0D;

    public AnonymousClass25Q(int i2, int i3, int i4, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, boolean z2) {
        this.A01 = j2;
        this.A00 = j3;
        this.A05 = j4;
        this.A04 = j5;
        this.A07 = j6;
        this.A02 = j7;
        this.A03 = j8;
        this.A06 = j9;
        this.A08 = j10;
        this.A0C = j11;
        this.A0A = i2;
        this.A0B = i3;
        this.A09 = i4;
        this.A0D = z2;
    }

    public AnonymousClass25Q(int i2, int i3, int i4, long j2, boolean z2) {
        this.A0C = j2;
        this.A0A = i2;
        this.A0B = i3;
        this.A09 = i4;
        this.A0D = z2;
    }

    public static AnonymousClass25Q A00(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new AnonymousClass25Q(jSONObject.optInt("mediaType"), jSONObject.optInt("transferRadio"), jSONObject.optInt("mediaTransferOrigin"), jSONObject.optLong("bytesSent"), jSONObject.optLong("bytesReceived"), jSONObject.optLong("countMessageSent"), jSONObject.optLong("countMessageReceived"), jSONObject.optLong("countUploaded"), jSONObject.optLong("countDownloaded"), jSONObject.optLong("countForward"), jSONObject.optLong("countShared"), jSONObject.optLong("countViewed"), jSONObject.optLong("transferDate"), jSONObject.optBoolean("isAutoDownload"));
        } catch (JSONException e2) {
            e2.getMessage();
            return null;
        }
    }
}
