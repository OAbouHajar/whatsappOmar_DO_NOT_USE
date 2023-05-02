package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1CK  reason: invalid class name */
public class AnonymousClass1CK extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public boolean A0S;
    public final AnonymousClass01D A0T;

    public AnonymousClass1CK(AnonymousClass01D r5) {
        super(1144, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
        this.A0T = r5;
    }

    public static Boolean A00(JSONObject jSONObject, int i2) {
        String valueOf = String.valueOf(i2);
        if (!jSONObject.has(valueOf)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(valueOf));
        } catch (JSONException e2) {
            Log.e((Throwable) e2);
            return null;
        }
    }

    public static Long A01(JSONObject jSONObject, int i2) {
        String valueOf = String.valueOf(i2);
        if (!jSONObject.has(valueOf)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(valueOf));
        } catch (JSONException e2) {
            Log.e((Throwable) e2);
            return null;
        }
    }

    public static void A02(Boolean bool, JSONObject jSONObject, int i2) {
        if (bool != null) {
            try {
                jSONObject.put(String.valueOf(i2), bool.booleanValue());
            } catch (JSONException e2) {
                Log.e((Throwable) e2);
            }
        }
    }

    public static void A03(Long l2, JSONObject jSONObject, int i2) {
        if (l2 != null) {
            try {
                jSONObject.put(String.valueOf(i2), l2.longValue());
            } catch (JSONException e2) {
                Log.e((Throwable) e2);
            }
        }
    }

    public final void A04() {
        this.A04 = Boolean.TRUE;
    }

    public final void A05() {
        this.A09 = Boolean.TRUE;
    }

    public final void A06() {
        this.A0E = Boolean.TRUE;
    }

    public final void A07() {
        this.A0H = Boolean.TRUE;
    }

    public synchronized void A08() {
        String string = ((SharedPreferences) ((C15860rz) this.A0T.get()).A01.get()).getString("wam_client_errors", (String) null);
        this.A0S = true;
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.A0M = A01(jSONObject, 2);
                this.A0N = A01(jSONObject, 3);
                this.A00 = A00(jSONObject, 1);
                this.A0H = A00(jSONObject, 4);
                this.A0I = A00(jSONObject, 5);
                this.A0G = A00(jSONObject, 6);
                this.A0E = A00(jSONObject, 7);
                this.A04 = A00(jSONObject, 8);
                this.A09 = A00(jSONObject, 9);
                this.A0A = A00(jSONObject, 10);
                this.A07 = A00(jSONObject, 11);
                this.A0F = A00(jSONObject, 12);
                this.A0C = A00(jSONObject, 13);
                this.A08 = A00(jSONObject, 14);
                this.A03 = A00(jSONObject, 15);
                this.A02 = A00(jSONObject, 16);
                this.A05 = A00(jSONObject, 17);
                this.A01 = A00(jSONObject, 18);
                this.A06 = A00(jSONObject, 19);
                this.A0D = A00(jSONObject, 20);
                this.A0Q = A01(jSONObject, 22);
                this.A0R = A01(jSONObject, 23);
                this.A0O = A01(jSONObject, 24);
                this.A0P = A01(jSONObject, 25);
                this.A0J = A01(jSONObject, 26);
                this.A0L = A01(jSONObject, 27);
                this.A0K = A01(jSONObject, 28);
                this.A0B = A00(jSONObject, 29);
            } catch (JSONException e2) {
                Log.e((Throwable) e2);
            }
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        if ((r2 | r3) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A09() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.A0S     // Catch:{ all -> 0x0108 }
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "WamClientErrors/WamClientErrors should be initialized before persist"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x0108 }
            r5.A08()     // Catch:{ all -> 0x0108 }
        L_0x000d:
            r4 = 0
            boolean r0 = r5.A0A()     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x002a
            java.lang.Long r0 = r5.A0J     // Catch:{ all -> 0x0108 }
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            r2 = 1
        L_0x001b:
            java.lang.Long r1 = r5.A0L     // Catch:{ all -> 0x0108 }
            r0 = 0
            if (r1 == 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            r2 = r2 | r0
            java.lang.Long r0 = r5.A0K     // Catch:{ all -> 0x0108 }
            if (r0 != 0) goto L_0x0027
            r3 = 0
        L_0x0027:
            r2 = r2 | r3
            if (r2 == 0) goto L_0x00f0
        L_0x002a:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0108 }
            r2.<init>()     // Catch:{ all -> 0x0108 }
            r1 = 2
            java.lang.Long r0 = r5.A0M     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 3
            java.lang.Long r0 = r5.A0N     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 1
            java.lang.Boolean r0 = r5.A00     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 4
            java.lang.Boolean r0 = r5.A0H     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 5
            java.lang.Boolean r0 = r5.A0I     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 6
            java.lang.Boolean r0 = r5.A0G     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 7
            java.lang.Boolean r0 = r5.A0E     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 8
            java.lang.Boolean r0 = r5.A04     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 9
            java.lang.Boolean r0 = r5.A09     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 10
            java.lang.Boolean r0 = r5.A0A     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 11
            java.lang.Boolean r0 = r5.A07     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 12
            java.lang.Boolean r0 = r5.A0F     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 13
            java.lang.Boolean r0 = r5.A0C     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 14
            java.lang.Boolean r0 = r5.A08     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 15
            java.lang.Boolean r0 = r5.A03     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 16
            java.lang.Boolean r0 = r5.A02     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 17
            java.lang.Boolean r0 = r5.A05     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 18
            java.lang.Boolean r0 = r5.A01     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 19
            java.lang.Boolean r0 = r5.A06     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 20
            java.lang.Boolean r0 = r5.A0D     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 22
            java.lang.Long r0 = r5.A0Q     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 23
            java.lang.Long r0 = r5.A0R     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 24
            java.lang.Long r0 = r5.A0O     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 25
            java.lang.Long r0 = r5.A0P     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 26
            java.lang.Long r0 = r5.A0J     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 27
            java.lang.Long r0 = r5.A0L     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 28
            java.lang.Long r0 = r5.A0K     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 29
            java.lang.Boolean r0 = r5.A0B     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0108 }
        L_0x00f0:
            X.01D r0 = r5.A0T     // Catch:{ all -> 0x0108 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0108 }
            X.0rz r0 = (X.C15860rz) r0     // Catch:{ all -> 0x0108 }
            android.content.SharedPreferences$Editor r1 = r0.A0K()     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "wam_client_errors"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r4)     // Catch:{ all -> 0x0108 }
            r0.apply()     // Catch:{ all -> 0x0108 }
            monitor-exit(r5)
            return
        L_0x0108:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CK.A09():void");
    }

    public final boolean A0A() {
        boolean z2 = false;
        boolean z3 = false;
        if (this.A0M == null) {
            z3 = true;
        }
        boolean z4 = z3 & true;
        boolean z5 = false;
        if (this.A0N == null) {
            z5 = true;
        }
        boolean z6 = z4 & z5;
        boolean z7 = false;
        if (this.A00 == null) {
            z7 = true;
        }
        boolean z8 = z6 & z7;
        boolean z9 = false;
        if (this.A0O == null) {
            z9 = true;
        }
        boolean z10 = z8 & z9;
        boolean z11 = false;
        if (this.A0P == null) {
            z11 = true;
        }
        boolean z12 = z10 & z11;
        boolean z13 = false;
        if (this.A0Q == null) {
            z13 = true;
        }
        boolean z14 = z12 & z13;
        boolean z15 = false;
        if (this.A0R == null) {
            z15 = true;
        }
        boolean z16 = z14 & z15;
        boolean z17 = false;
        if (this.A01 == null) {
            z17 = true;
        }
        boolean z18 = z16 & z17;
        boolean z19 = false;
        if (this.A02 == null) {
            z19 = true;
        }
        boolean z20 = z18 & z19;
        boolean z21 = false;
        if (this.A03 == null) {
            z21 = true;
        }
        boolean z22 = z20 & z21;
        boolean z23 = false;
        if (this.A04 == null) {
            z23 = true;
        }
        boolean z24 = z22 & z23;
        boolean z25 = false;
        if (this.A05 == null) {
            z25 = true;
        }
        boolean z26 = z24 & z25;
        boolean z27 = false;
        if (this.A06 == null) {
            z27 = true;
        }
        boolean z28 = z26 & z27;
        boolean z29 = false;
        if (this.A07 == null) {
            z29 = true;
        }
        boolean z30 = z28 & z29;
        boolean z31 = false;
        if (this.A08 == null) {
            z31 = true;
        }
        boolean z32 = z30 & z31;
        boolean z33 = false;
        if (this.A09 == null) {
            z33 = true;
        }
        boolean z34 = z32 & z33;
        boolean z35 = false;
        if (this.A0A == null) {
            z35 = true;
        }
        boolean z36 = z34 & z35;
        boolean z37 = false;
        if (this.A0B == null) {
            z37 = true;
        }
        boolean z38 = z36 & z37;
        boolean z39 = false;
        if (this.A0C == null) {
            z39 = true;
        }
        boolean z40 = z38 & z39;
        boolean z41 = false;
        if (this.A0D == null) {
            z41 = true;
        }
        boolean z42 = z40 & z41;
        boolean z43 = false;
        if (this.A0E == null) {
            z43 = true;
        }
        boolean z44 = z42 & z43;
        boolean z45 = false;
        if (this.A0F == null) {
            z45 = true;
        }
        boolean z46 = z44 & z45;
        boolean z47 = false;
        if (this.A0G == null) {
            z47 = true;
        }
        boolean z48 = z46 & z47;
        boolean z49 = false;
        if (this.A0H == null) {
            z49 = true;
        }
        boolean z50 = z48 & z49;
        if (this.A0I == null) {
            z2 = true;
        }
        return z50 & z2;
    }

    public synchronized void serialize(C29081Zz r3) {
        if (!this.A0S) {
            AnonymousClass00B.A08("WamClientErrors/WamClientErrors should be initialized before serialization");
            A08();
        }
        r3.AdT(2, this.A0M);
        r3.AdT(3, this.A0N);
        r3.AdT(1, this.A00);
        r3.AdT(24, this.A0O);
        r3.AdT(25, this.A0P);
        r3.AdT(22, this.A0Q);
        r3.AdT(23, this.A0R);
        r3.AdT(18, this.A01);
        r3.AdT(16, this.A02);
        r3.AdT(15, this.A03);
        r3.AdT(8, this.A04);
        r3.AdT(17, this.A05);
        r3.AdT(19, this.A06);
        r3.AdT(11, this.A07);
        r3.AdT(14, this.A08);
        r3.AdT(9, this.A09);
        r3.AdT(10, this.A0A);
        r3.AdT(26, this.A0B);
        r3.AdT(13, this.A0C);
        r3.AdT(20, this.A0D);
        r3.AdT(7, this.A0E);
        r3.AdT(12, this.A0F);
        r3.AdT(6, this.A0G);
        r3.AdT(4, this.A0H);
        r3.AdT(5, this.A0I);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamWamClientErrors {");
        C16470t7.appendFieldToStringBuilder(sb, "wamClientDroppedEventCount", this.A0M);
        C16470t7.appendFieldToStringBuilder(sb, "wamClientDroppedEventSize", this.A0N);
        C16470t7.appendFieldToStringBuilder(sb, "wamClientErrorFlags", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "wamClientPrivateDroppedEventCount", this.A0O);
        C16470t7.appendFieldToStringBuilder(sb, "wamClientPrivateDroppedEventSize", this.A0P);
        C16470t7.appendFieldToStringBuilder(sb, "wamClientRealtimeDroppedEventCount", this.A0Q);
        C16470t7.appendFieldToStringBuilder(sb, "wamClientRealtimeDroppedEventSize", this.A0R);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorBadCurrentEventBufferChecksum", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorBadEventBuffer", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorBadFileHeader", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorBadFileSize", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorBadHeaderChecksum", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorBadRotatedEventBufferChecksum", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorCloseFile", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorCreateWamFile", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorFseekFile", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorOpenFile", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorOpenPsUploadQueueFile", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorOpenWamFile", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorPersistence", this.A0D);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorReadFile", this.A0E);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorRemoveFile", this.A0F);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorWriteEventBuffer", this.A0G);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorWriteFile", this.A0H);
        C16470t7.appendFieldToStringBuilder(sb, "wamErrorWriteHeader", this.A0I);
        sb.append("}");
        return sb.toString();
    }
}
