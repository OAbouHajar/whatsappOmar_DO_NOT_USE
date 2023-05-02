package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1QT  reason: invalid class name */
public class AnonymousClass1QT {
    public final C16300so A00;
    public final C16180sb A01;
    public final C15900s5 A02;
    public final C15860rz A03;
    public final C14710pd A04;
    public final C215514n A05;
    public final AnonymousClass1QS A06;

    public AnonymousClass1QT(C16300so r1, C16180sb r2, C15900s5 r3, C15860rz r4, C14710pd r5, C215514n r6, AnonymousClass1QS r7) {
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = r4;
    }

    public static float A00(int i2, int i3, int i4, int i5, long j2) {
        if (i3 == 0 || i4 == 0) {
            return 3.0f;
        }
        float f2 = (((float) ((i2 << 10) << 10)) * 8000.0f) / ((float) (((i3 * i4) * 3) + 96000));
        float max = Math.max(0.0f, f2 - ((float) j2)) / f2;
        return (((float) (i5 - 3)) * max * max) + 3.0f;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(android.media.MediaCodecInfo r6) {
        /*
            java.lang.String r0 = "video/avc"
            android.media.MediaCodecInfo$CodecCapabilities r4 = r6.getCapabilitiesForType(r0)
            java.lang.String r0 = "videotranscoder/transcode/color formats: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int[] r0 = r4.colorFormats
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 0
            r5 = 0
        L_0x001e:
            int[] r1 = r4.colorFormats
            int r0 = r1.length
            if (r3 >= r0) goto L_0x006b
            if (r5 != 0) goto L_0x006b
            r2 = r1[r3]
            r0 = 39
            if (r2 == r0) goto L_0x0048
            r0 = 2130706688(0x7f000100, float:1.7014638E38)
            if (r2 == r0) goto L_0x0048
            switch(r2) {
                case 19: goto L_0x0048;
                case 20: goto L_0x0048;
                case 21: goto L_0x0048;
                default: goto L_0x0033;
            }
        L_0x0033:
            java.lang.String r0 = "videotranscoder/transcode/skipping unsupported color format "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
        L_0x003e:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0045:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x0048:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "OMX.SEC.avc.enc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0069
            r0 = 19
            if (r2 != r0) goto L_0x0069
            java.lang.String r0 = "videotranscoder/transcode/skipping "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " for OMX.SEC.avc.enc"
            r1.append(r0)
            goto L_0x003e
        L_0x0069:
            r5 = r2
            goto L_0x0045
        L_0x006b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QT.A01(android.media.MediaCodecInfo):int");
    }

    public static MediaCodecInfo A02(boolean z2) {
        String name;
        int codecCount = MediaCodecList.getCodecCount();
        StringBuilder sb = new StringBuilder("videotranscoder/transcode/number of codecs: ");
        sb.append(codecCount);
        Log.i(sb.toString());
        MediaCodecInfo mediaCodecInfo = null;
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                if (C41971wz.A0D(codecInfoAt.getName(), false)) {
                    for (String equals : codecInfoAt.getSupportedTypes()) {
                        if (equals.equals("video/avc")) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                } else if (z2 && (name = codecInfoAt.getName()) != null && name.equals("OMX.google.h264.encoder")) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        } else if (supportedTypes[i3].equals("video/avc")) {
                            mediaCodecInfo = codecInfoAt;
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        return mediaCodecInfo;
    }

    public static Pair A03(int i2, int i3, int i4) {
        Integer valueOf;
        Integer valueOf2;
        if (i2 > i3) {
            if (i2 > i4) {
                valueOf = Integer.valueOf(i4);
                i3 = (i3 * i4) / i2;
            }
            valueOf = Integer.valueOf(i2);
        } else {
            if (i3 > i4) {
                valueOf = Integer.valueOf((i2 * i4) / i3);
                valueOf2 = Integer.valueOf(i4);
                return new Pair(valueOf, valueOf2);
            }
            valueOf = Integer.valueOf(i2);
        }
        valueOf2 = Integer.valueOf(i3);
        return new Pair(valueOf, valueOf2);
    }

    public static List A04(String str) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (!codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (supportedTypes[i3].equals(str)) {
                        arrayList.add(codecInfoAt.getName());
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean A05(C43281zk r13, C42061xA r14, byte b2) {
        int i2 = r14.A03;
        int i3 = r14.A01;
        long j2 = r14.A04;
        if (!r14.A08) {
            if (b2 != 13) {
                int i4 = r13.A02;
                if (i2 > i4 || i3 > i4) {
                    if (i2 < i3) {
                        i2 = (i2 * i4) / i3;
                        i3 = i4;
                    } else {
                        i3 = (i3 * i4) / i2;
                        i2 = i4;
                    }
                }
                long j3 = j2 / 1000;
                int i5 = (((long) (((Math.min((float) r13.A01, ((float) (i2 * i3)) * A00(r13.A00, i2, i3, 9, j2)) * ((float) j3)) / 8.0f) + ((float) ((j3 * 96000) / 8)))) > r14.A06.length() ? 1 : (((long) (((Math.min((float) r13.A01, ((float) (i2 * i3)) * A00(r13.A00, i2, i3, 9, j2)) * ((float) j3)) / 8.0f) + ((float) ((j3 * 96000) / 8)))) == r14.A06.length() ? 0 : -1));
                return false;
            } else if (r14.A07 || r14.A06.length() <= 262144) {
                return false;
            } else {
                float f2 = (float) (i2 * i3);
                return ((double) (((float) r14.A00()) / f2)) > ((double) Math.max(2.0f, Math.min(10.0f, 153600.0f / f2))) * 1.1d;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        r0 = r7.A05.A01(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C43281zk A06(boolean r8, boolean r9) {
        /*
            r7 = this;
            X.0s5 r1 = r7.A02
            X.0tC r0 = X.C15910s6.A1f
            int r2 = r1.A02(r0)
            r1 = 640(0x280, float:8.97E-43)
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
            X.1zk r3 = new X.1zk
            r3.<init>(r2, r1, r0)
            if (r8 != 0) goto L_0x007b
            if (r9 != 0) goto L_0x007b
            X.0pd r6 = r7.A04
            r0 = 597(0x255, float:8.37E-43)
            X.0tM r5 = X.C16620tM.A02
            boolean r0 = r6.A0E(r5, r0)
            if (r0 == 0) goto L_0x007b
            r0 = 596(0x254, float:8.35E-43)
            int r2 = r6.A03(r5, r0)
            r0 = 594(0x252, float:8.32E-43)
            int r1 = r6.A03(r5, r0)
            r0 = 595(0x253, float:8.34E-43)
            int r0 = r6.A03(r5, r0)
            int r0 = r0 * 1000
            X.1zk r4 = new X.1zk
            r4.<init>(r2, r1, r0)
            r0 = 662(0x296, float:9.28E-43)
            boolean r0 = r6.A0E(r5, r0)
            if (r0 == 0) goto L_0x007a
            X.0rz r0 = r7.A03
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "video_quality"
            r2 = 0
            int r1 = r1.getInt(r0, r2)
            if (r1 != 0) goto L_0x0077
            r0 = 660(0x294, float:9.25E-43)
            boolean r0 = r6.A0E(r5, r0)
            if (r0 == 0) goto L_0x007b
            X.14n r0 = r7.A05
            java.lang.Float r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x007b
            float r1 = r0.floatValue()
            r0 = 661(0x295, float:9.26E-43)
            int r0 = r6.A03(r5, r0)
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x007b
            return r4
        L_0x0077:
            r0 = 1
            if (r1 != r0) goto L_0x007b
        L_0x007a:
            return r4
        L_0x007b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QT.A06(boolean, boolean):X.1zk");
    }

    public boolean A07(long j2, long j3) {
        if (j2 > 262144) {
            return ((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)) == 0 ? 0 : (int) ((j2 * 8) / (j3 * 1000))) > this.A02.A02(C15910s6.A25);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0018 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(X.AnonymousClass1XK r6, java.io.File r7) {
        /*
            r5 = this;
            boolean r0 = X.C31831f6.A03(r6)
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001a
            X.0pd r2 = r5.A04
            r1 = 422(0x1a6, float:5.91E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            int r0 = X.C43291zl.A01(r0)
            if (r0 != r3) goto L_0x0019
        L_0x0018:
            r4 = 1
        L_0x0019:
            return r4
        L_0x001a:
            X.1XK r0 = X.AnonymousClass1XK.A05
            if (r6 != r0) goto L_0x0023
            boolean r0 = X.C43311zn.A00(r7)
            return r0
        L_0x0023:
            X.1XK r0 = X.AnonymousClass1XK.A0B
            if (r6 == r0) goto L_0x0018
            X.1XK r0 = X.AnonymousClass1XK.A0Z
            if (r6 == r0) goto L_0x0018
            X.1XK r0 = X.AnonymousClass1XK.A0R
            if (r6 == r0) goto L_0x0018
            X.1XK r0 = X.AnonymousClass1XK.A06
            if (r6 == r0) goto L_0x0018
            X.1XK r0 = X.AnonymousClass1XK.A0S
            if (r6 == r0) goto L_0x0018
            X.1XK r0 = X.AnonymousClass1XK.A0G
            if (r6 == r0) goto L_0x0018
            X.1XK r0 = X.AnonymousClass1XK.A0L
            if (r6 == r0) goto L_0x0018
            X.1XK r0 = X.AnonymousClass1XK.A07
            if (r6 != r0) goto L_0x0019
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QT.A08(X.1XK, java.io.File):boolean");
    }

    public boolean A09(AnonymousClass1XK r4, File file) {
        if (file != null) {
            try {
                if (C31831f6.A03(r4)) {
                    if (AnonymousClass1QS.A04(file, false).A01 != 0) {
                        return true;
                    }
                } else if ((AnonymousClass1XK.A05 == r4 || AnonymousClass1XK.A0I == r4) && AnonymousClass1QS.A04(file, false).A01 == 2) {
                    return true;
                }
            } catch (IOException e2) {
                Log.e("transcodeutils/isEligibleForMp4Check exception", e2);
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0029 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0045 A[Catch:{ IOException -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0094 A[Catch:{ IOException -> 0x009a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(X.C16730tY r8) {
        /*
            r7 = this;
            X.0ta r2 = r8.A02     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = r8.A08     // Catch:{ IOException -> 0x009a }
            r3 = 0
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0099
            java.io.File r0 = r2.A0F     // Catch:{ IOException -> 0x009a }
            if (r0 != 0) goto L_0x000e
            return r3
        L_0x000e:
            X.AnonymousClass00B.A06(r2)     // Catch:{ IOException -> 0x009a }
            boolean r0 = r2.A0O     // Catch:{ IOException -> 0x009a }
            if (r0 != 0) goto L_0x0099
            byte r1 = r8.A10     // Catch:{ IOException -> 0x009a }
            int r0 = r8.A08     // Catch:{ IOException -> 0x009a }
            X.1XK r1 = X.C31831f6.A01(r1, r0)     // Catch:{ IOException -> 0x009a }
            X.1XK r0 = X.AnonymousClass1XK.A04     // Catch:{ IOException -> 0x009a }
            if (r1 != r0) goto L_0x0029
            java.io.File r0 = r2.A0F     // Catch:{ IOException -> 0x009a }
            if (r0 == 0) goto L_0x0098
            X.C41911wr.A04(r0)     // Catch:{ IOException -> 0x0029 }
            goto L_0x0098
        L_0x0029:
            X.1XK r0 = X.AnonymousClass1XK.A0B     // Catch:{ IOException -> 0x009a }
            if (r1 == r0) goto L_0x0094
            X.1XK r0 = X.AnonymousClass1XK.A0Z     // Catch:{ IOException -> 0x009a }
            if (r1 == r0) goto L_0x0094
            X.1XK r0 = X.AnonymousClass1XK.A0G     // Catch:{ IOException -> 0x009a }
            if (r1 == r0) goto L_0x0094
            X.1XK r0 = X.AnonymousClass1XK.A06     // Catch:{ IOException -> 0x009a }
            if (r1 == r0) goto L_0x0094
            X.1XK r0 = X.AnonymousClass1XK.A0R     // Catch:{ IOException -> 0x009a }
            if (r1 == r0) goto L_0x0094
            X.1XK r0 = X.AnonymousClass1XK.A0V     // Catch:{ IOException -> 0x009a }
            if (r1 == r0) goto L_0x0094
            X.1XK r0 = X.AnonymousClass1XK.A07     // Catch:{ IOException -> 0x009a }
            if (r1 == r0) goto L_0x0094
            boolean r0 = X.C31831f6.A03(r1)     // Catch:{ IOException -> 0x009a }
            if (r0 == 0) goto L_0x007c
            java.lang.String r1 = r2.A0H     // Catch:{ IOException -> 0x009a }
            if (r1 == 0) goto L_0x005c
            X.0sb r0 = r7.A01     // Catch:{ IOException -> 0x009a }
            java.io.File r0 = X.C17970vw.A0E(r0, r1)     // Catch:{ IOException -> 0x009a }
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x009a }
            if (r0 == 0) goto L_0x005c
            r3 = 1
        L_0x005c:
            java.io.File r6 = r2.A0F     // Catch:{ IOException -> 0x009a }
            long r4 = r8.A01     // Catch:{ IOException -> 0x009a }
            if (r3 != 0) goto L_0x0098
            X.0s5 r1 = r7.A02     // Catch:{ IOException -> 0x009a }
            X.0tC r0 = X.C15910s6.A1f     // Catch:{ IOException -> 0x009a }
            int r0 = r1.A02(r0)     // Catch:{ IOException -> 0x009a }
            long r2 = (long) r0     // Catch:{ IOException -> 0x009a }
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0098
            X.1QS r0 = r7.A06     // Catch:{ IOException -> 0x009a }
            boolean r0 = r0.A0E(r6)     // Catch:{ IOException -> 0x009a }
            r3 = r0 ^ 1
            return r3
        L_0x007c:
            X.1XK r0 = X.AnonymousClass1XK.A05     // Catch:{ IOException -> 0x009a }
            if (r1 == r0) goto L_0x0089
            X.1XK r0 = X.AnonymousClass1XK.A0I     // Catch:{ IOException -> 0x009a }
            if (r1 == r0) goto L_0x0089
            X.1XK r0 = X.AnonymousClass1XK.A0S     // Catch:{ IOException -> 0x009a }
            if (r1 != r0) goto L_0x0099
            goto L_0x0098
        L_0x0089:
            X.1QS r1 = r7.A06     // Catch:{ IOException -> 0x009a }
            java.io.File r0 = r2.A0F     // Catch:{ IOException -> 0x009a }
            boolean r0 = r1.A0D(r0)     // Catch:{ IOException -> 0x009a }
            r3 = r0 ^ 1
            return r3
        L_0x0094:
            java.io.File r0 = r2.A0F     // Catch:{ IOException -> 0x009a }
            if (r0 != 0) goto L_0x0099
        L_0x0098:
            r3 = 1
        L_0x0099:
            return r3
        L_0x009a:
            r1 = move-exception
            java.lang.String r0 = "transcodeutils/needtranscodemedia exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QT.A0A(X.0tY):boolean");
    }
}
