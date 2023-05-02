package X;

import java.util.Arrays;

/* renamed from: X.4dU  reason: invalid class name and case insensitive filesystem */
public final class C90094dU {
    public static final C90094dU A02 = new C90094dU(new int[]{2}, 8);
    public static final C90094dU A03 = new C90094dU(new int[]{2, 5, 6}, 8);
    public final int A00;
    public final int[] A01;

    public C90094dU(int[] iArr, int i2) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.A01 = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C90094dU A00(android.content.Context r4) {
        /*
            java.lang.String r0 = "android.media.action.HDMI_AUDIO_PLUG"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            r0 = 0
            android.content.Intent r3 = r4.registerReceiver(r0, r1)
            int r1 = X.AnonymousClass3C1.A01
            r0 = 17
            if (r1 < r0) goto L_0x0038
            java.lang.String r1 = X.AnonymousClass3C1.A04
            java.lang.String r0 = "Amazon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
        L_0x0024:
            r0 = 1
        L_0x0025:
            r2 = 0
            if (r0 == 0) goto L_0x003a
            android.content.ContentResolver r1 = r4.getContentResolver()
            java.lang.String r0 = "external_surround_sound_enabled"
            int r1 = android.provider.Settings.Global.getInt(r1, r0, r2)
            r0 = 1
            if (r1 != r0) goto L_0x003a
            X.4dU r1 = A03
            return r1
        L_0x0038:
            r0 = 0
            goto L_0x0025
        L_0x003a:
            if (r3 == 0) goto L_0x0058
            java.lang.String r0 = "android.media.extra.AUDIO_PLUG_STATE"
            int r0 = r3.getIntExtra(r0, r2)
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "android.media.extra.ENCODINGS"
            int[] r2 = r3.getIntArrayExtra(r0)
            r1 = 8
            java.lang.String r0 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r0 = r3.getIntExtra(r0, r1)
            X.4dU r1 = new X.4dU
            r1.<init>(r2, r0)
            return r1
        L_0x0058:
            X.4dU r1 = A02
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90094dU.A00(android.content.Context):X.4dU");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C90094dU)) {
            return false;
        }
        C90094dU r4 = (C90094dU) obj;
        return Arrays.equals(this.A01, r4.A01) && this.A00 == r4.A00;
    }

    public int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AudioCapabilities[maxChannelCount=");
        A0r.append(this.A00);
        A0r.append(", supportedEncodings=");
        A0r.append(Arrays.toString(this.A01));
        return AnonymousClass000.A0h("]", A0r);
    }
}
