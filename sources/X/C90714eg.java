package X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* renamed from: X.4eg  reason: invalid class name and case insensitive filesystem */
public final class C90714eg {
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C90714eg(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2, String str3, boolean z2, boolean z3) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = codecCapabilities;
        this.A04 = z2;
        this.A06 = z3;
        this.A05 = C90834eu.A05(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ("Nexus 10".equals(r1) == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r7) == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r2 != null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C90714eg A00(android.media.MediaCodecInfo.CodecCapabilities r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r2 = r6
            r3 = r7
            if (r6 == 0) goto L_0x0036
            int r1 = X.AnonymousClass3C1.A01
            r0 = 19
            if (r1 < r0) goto L_0x0036
            boolean r0 = A02(r6)
            if (r0 == 0) goto L_0x0036
            r0 = 22
            if (r1 > r0) goto L_0x005d
            java.lang.String r1 = X.AnonymousClass3C1.A05
            java.lang.String r0 = "ODROID-XU3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "Nexus 10"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005d
        L_0x0026:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x005d
        L_0x0036:
            r6 = 0
            if (r2 == 0) goto L_0x0042
        L_0x0039:
            int r1 = X.AnonymousClass3C1.A01
            r0 = 21
            if (r1 < r0) goto L_0x0042
            A01(r2)
        L_0x0042:
            if (r10 != 0) goto L_0x0052
            if (r2 == 0) goto L_0x005b
            int r1 = X.AnonymousClass3C1.A01
            r0 = 21
            if (r1 < r0) goto L_0x005b
            boolean r0 = A03(r2)
            if (r0 == 0) goto L_0x005b
        L_0x0052:
            r7 = 1
        L_0x0053:
            X.4eg r1 = new X.4eg
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x005b:
            r7 = 0
            goto L_0x0053
        L_0x005d:
            r6 = 1
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90714eg.A00(android.media.MediaCodecInfo$CodecCapabilities, java.lang.String, java.lang.String, java.lang.String, boolean):X.4eg");
    }

    public static void A01(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean A02(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean A03(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean A04(MediaCodecInfo.VideoCapabilities videoCapabilities, double d2, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point((((i2 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i3 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        return (d2 == -1.0d || d2 < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d2));
    }

    public Point A05(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point((((i2 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i3 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public C86944Ut A06(C32491gT r9, C32491gT r10) {
        C32491gT r3 = r9;
        C32491gT r4 = r10;
        int i2 = 0;
        if (!AnonymousClass3C1.A0F(r9.A0T, r10.A0T)) {
            i2 = 8;
        }
        if (this.A05) {
            if (r9.A0E != r10.A0E) {
                i2 |= 1024;
            }
            if (!this.A04 && !(r9.A0I == r10.A0I && r9.A09 == r10.A09)) {
                i2 |= 512;
            }
            if (!AnonymousClass3C1.A0F(r9.A0M, r10.A0M)) {
                i2 |= 2048;
            }
            String str = this.A03;
            if (AnonymousClass3C1.A05.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !r9.A00(r10)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                int i3 = 2;
                if (r9.A00(r10)) {
                    i3 = 3;
                }
                return new C86944Ut(r3, r4, str, i3, 0);
            }
        } else {
            if (r9.A06 != r10.A06) {
                i2 |= 4096;
            }
            if (r9.A0F != r10.A0F) {
                i2 |= 8192;
            }
            if (r9.A0B != r10.A0B) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.A02)) {
                Pair A012 = C90884f0.A01(r9);
                Pair A013 = C90884f0.A01(r10);
                if (!(A012 == null || A013 == null)) {
                    int A0D = AnonymousClass000.A0D(A012.first);
                    int A0D2 = AnonymousClass000.A0D(A013.first);
                    if (A0D == 42 && A0D2 == 42) {
                        return new C86944Ut(r3, r4, this.A03, 3, 0);
                    }
                }
            }
            if (!r9.A00(r10)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.A02)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C86944Ut(r3, r4, this.A03, 1, 0);
            }
        }
        return new C86944Ut(r3, r4, this.A03, 0, i2);
    }

    public final void A07(String str) {
        StringBuilder A0r = AnonymousClass000.A0r("NoSupport [");
        A0r.append(str);
        A0r.append("] [");
        AnonymousClass3K3.A1N(A0r, this.A03);
        A0r.append(this.A02);
        A0r.append("] [");
        A0r.append(AnonymousClass3C1.A03);
        Log.d("MediaCodecInfo", AnonymousClass000.A0h("]", A0r));
    }

    public boolean A08(int i2) {
        String A0c;
        int i3;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A0c = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                A0c = "channelCount.aCaps";
            } else {
                String str = this.A03;
                String str2 = this.A02;
                int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((AnonymousClass3C1.A01 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i3 = 6;
                    } else {
                        i3 = 30;
                        if ("audio/eac3".equals(str2)) {
                            i3 = 16;
                        }
                    }
                    StringBuilder A0r = AnonymousClass000.A0r("AssumedMaxChannelAdjustment: ");
                    A0r.append(str);
                    A0r.append(", [");
                    A0r.append(maxInputChannelCount);
                    A0r.append(" to ");
                    A0r.append(i3);
                    Log.w("MediaCodecInfo", AnonymousClass000.A0h("]", A0r));
                    maxInputChannelCount = i3;
                }
                if (maxInputChannelCount >= i2) {
                    return true;
                }
                A0c = C13680ns.A0c(i2, "channelCount.support, ");
            }
        }
        A07(A0c);
        return false;
    }

    public boolean A09(int i2) {
        String A0c;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A0c = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                A0c = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i2)) {
                return true;
            } else {
                A0c = C13680ns.A0c(i2, "sampleRate.support, ");
            }
        }
        A07(A0c);
        return false;
    }

    public boolean A0A(int i2, int i3, double d2) {
        String obj;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            obj = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                obj = "sizeAndRate.vCaps";
            } else if (A04(videoCapabilities, d2, i2, i3)) {
                return true;
            } else {
                if (i2 < i3) {
                    String str = this.A03;
                    if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(AnonymousClass3C1.A02)) && A04(videoCapabilities, d2, i3, i2)) {
                        StringBuilder A0r = AnonymousClass000.A0r("sizeAndRate.rotated, ");
                        A0r.append(i2);
                        A0r.append("x");
                        A0r.append(i3);
                        A0r.append("x");
                        A0r.append(d2);
                        String obj2 = A0r.toString();
                        StringBuilder A0r2 = AnonymousClass000.A0r("AssumedSupport [");
                        A0r2.append(obj2);
                        A0r2.append("] [");
                        AnonymousClass3K3.A1N(A0r2, str);
                        A0r2.append(this.A02);
                        A0r2.append("] [");
                        A0r2.append(AnonymousClass3C1.A03);
                        Log.d("MediaCodecInfo", AnonymousClass000.A0h("]", A0r2));
                        return true;
                    }
                }
                StringBuilder A0r3 = AnonymousClass000.A0r("sizeAndRate.support, ");
                A0r3.append(i2);
                A0r3.append("x");
                A0r3.append(i3);
                A0r3.append("x");
                A0r3.append(d2);
                obj = A0r3.toString();
            }
        }
        A07(obj);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x027a, code lost:
        if (r1 < 800000) goto L_0x027c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(X.C32491gT r13) {
        /*
            r12 = this;
            java.lang.String r2 = r13.A0O
            r3 = 1
            if (r2 == 0) goto L_0x01e0
            java.lang.String r1 = r12.A02
            if (r1 == 0) goto L_0x01e0
            java.lang.String r0 = r2.trim()
            java.lang.String r4 = X.AnonymousClass3K4.A0a(r0)
            java.lang.String r0 = "avc1"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01c2
            java.lang.String r0 = "avc3"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01c2
            java.lang.String r0 = "hev1"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01be
            java.lang.String r0 = "hvc1"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01be
            java.lang.String r0 = "dvav"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "dva1"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "dvhe"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "dvh1"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "av01"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0092
            java.lang.String r8 = "video/av01"
        L_0x005b:
            boolean r0 = r1.equals(r8)
            java.lang.String r7 = ", "
            r6 = 0
            if (r0 != 0) goto L_0x01c6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "codec.mime "
        L_0x006a:
            X.C13680ns.A1Y(r0, r2, r7, r1)
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r1)
            r12.A07(r0)
            r0 = 0
        L_0x0075:
            r5 = 0
            if (r0 == 0) goto L_0x02bc
            boolean r0 = r12.A05
            r1 = 21
            if (r0 == 0) goto L_0x02a2
            int r4 = r13.A0I
            if (r4 <= 0) goto L_0x02a1
            int r2 = r13.A09
            if (r2 <= 0) goto L_0x02a1
            int r0 = X.AnonymousClass3C1.A01
            if (r0 < r1) goto L_0x0286
            float r0 = r13.A01
            double r0 = (double) r0
            boolean r0 = r12.A0A(r4, r2, r0)
            return r0
        L_0x0092:
            java.lang.String r0 = "vp9"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01b6
            java.lang.String r0 = "vp09"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01b6
            java.lang.String r0 = "vp8"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "vp08"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "mp4a"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "mp4a."
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x00d0
            X.4GR r0 = X.C90834eu.A01(r4)
            if (r0 == 0) goto L_0x00d0
            int r0 = r0.A01
            java.lang.String r8 = X.C90834eu.A02(r0)
            if (r8 != 0) goto L_0x005b
        L_0x00d0:
            java.lang.String r8 = "audio/mp4a-latm"
            goto L_0x005b
        L_0x00d3:
            java.lang.String r0 = "ac-3"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01ae
            java.lang.String r0 = "dac3"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01ae
            java.lang.String r0 = "ec-3"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01aa
            java.lang.String r0 = "dec3"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01aa
            java.lang.String r0 = "ec+3"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r8 = "audio/eac3-joc"
            goto L_0x005b
        L_0x00ff:
            java.lang.String r0 = "ac-4"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01a6
            java.lang.String r0 = "dac4"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01a6
            java.lang.String r0 = "dtsc"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01a2
            java.lang.String r0 = "dtse"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01a2
            java.lang.String r0 = "dtsh"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x019e
            java.lang.String r0 = "dtsl"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x019e
            java.lang.String r0 = "opus"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x013b
            java.lang.String r8 = "audio/opus"
            goto L_0x005b
        L_0x013b:
            java.lang.String r0 = "vorbis"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0147
            java.lang.String r8 = "audio/vorbis"
            goto L_0x005b
        L_0x0147:
            java.lang.String r0 = "flac"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0153
            java.lang.String r8 = "audio/flac"
            goto L_0x005b
        L_0x0153:
            java.lang.String r0 = "stpp"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x015f
            java.lang.String r8 = "application/ttml+xml"
            goto L_0x005b
        L_0x015f:
            java.lang.String r0 = "wvtt"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x016b
            java.lang.String r8 = "text/vtt"
            goto L_0x005b
        L_0x016b:
            java.lang.String r0 = "cea708"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0177
            java.lang.String r8 = "application/cea-708"
            goto L_0x005b
        L_0x0177:
            java.lang.String r0 = "eia608"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x019a
            java.lang.String r0 = "cea608"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x019a
            java.util.ArrayList r2 = X.C90834eu.A00
            int r1 = r2.size()
            r0 = 0
            if (r0 >= r1) goto L_0x01e0
            r2.get(r0)
            java.lang.String r0 = "codecPrefix"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x019a:
            java.lang.String r8 = "application/cea-608"
            goto L_0x005b
        L_0x019e:
            java.lang.String r8 = "audio/vnd.dts.hd"
            goto L_0x005b
        L_0x01a2:
            java.lang.String r8 = "audio/vnd.dts"
            goto L_0x005b
        L_0x01a6:
            java.lang.String r8 = "audio/ac4"
            goto L_0x005b
        L_0x01aa:
            java.lang.String r8 = "audio/eac3"
            goto L_0x005b
        L_0x01ae:
            java.lang.String r8 = "audio/ac3"
            goto L_0x005b
        L_0x01b2:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            goto L_0x005b
        L_0x01b6:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            goto L_0x005b
        L_0x01ba:
            java.lang.String r8 = "video/dolby-vision"
            goto L_0x005b
        L_0x01be:
            java.lang.String r8 = "video/hevc"
            goto L_0x005b
        L_0x01c2:
            java.lang.String r8 = "video/avc"
            goto L_0x005b
        L_0x01c6:
            android.util.Pair r4 = X.C90884f0.A01(r13)
            if (r4 == 0) goto L_0x01e0
            java.lang.Object r0 = r4.first
            int r5 = X.AnonymousClass000.A0D(r0)
            java.lang.Object r0 = r4.second
            int r4 = X.AnonymousClass000.A0D(r0)
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x01e3
            r0 = 42
            if (r5 == r0) goto L_0x01e3
        L_0x01e0:
            r0 = 1
            goto L_0x0075
        L_0x01e3:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r12.A00
            if (r9 == 0) goto L_0x01eb
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = r9.profileLevels
            if (r10 != 0) goto L_0x01ed
        L_0x01eb:
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = new android.media.MediaCodecInfo.CodecProfileLevel[r6]
        L_0x01ed:
            int r11 = X.AnonymousClass3C1.A01
            r0 = 23
            if (r11 > r0) goto L_0x0226
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0226
            int r0 = r10.length
            if (r0 != 0) goto L_0x0226
            if (r9 == 0) goto L_0x027c
            android.media.MediaCodecInfo$VideoCapabilities r0 = r9.getVideoCapabilities()
            if (r0 == 0) goto L_0x027c
            android.util.Range r0 = r0.getBitrateRange()
            java.lang.Comparable r0 = r0.getUpper()
            int r1 = X.AnonymousClass000.A0D(r0)
            r0 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r1 < r0) goto L_0x0237
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0219:
            android.media.MediaCodecInfo$CodecProfileLevel r0 = new android.media.MediaCodecInfo$CodecProfileLevel
            r0.<init>()
            r0.profile = r3
            r0.level = r9
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
            r10[r6] = r0
        L_0x0226:
            int r9 = r10.length
        L_0x0227:
            if (r6 >= r9) goto L_0x027e
            r1 = r10[r6]
            int r0 = r1.profile
            if (r0 != r5) goto L_0x0234
            int r0 = r1.level
            if (r0 < r4) goto L_0x0234
            goto L_0x01e0
        L_0x0234:
            int r6 = r6 + 1
            goto L_0x0227
        L_0x0237:
            r0 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r1 < r0) goto L_0x023f
            r9 = 512(0x200, float:7.175E-43)
            goto L_0x0219
        L_0x023f:
            r0 = 60000000(0x3938700, float:8.670878E-37)
            if (r1 < r0) goto L_0x0247
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0219
        L_0x0247:
            r0 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r1 < r0) goto L_0x024f
            r9 = 128(0x80, float:1.794E-43)
            goto L_0x0219
        L_0x024f:
            r0 = 18000000(0x112a880, float:2.6936858E-38)
            if (r1 < r0) goto L_0x0257
            r9 = 64
            goto L_0x0219
        L_0x0257:
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 < r0) goto L_0x025f
            r9 = 32
            goto L_0x0219
        L_0x025f:
            r0 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r1 < r0) goto L_0x0267
            r9 = 16
            goto L_0x0219
        L_0x0267:
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            if (r1 < r0) goto L_0x026f
            r9 = 8
            goto L_0x0219
        L_0x026f:
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r1 < r0) goto L_0x0276
            r9 = 4
            goto L_0x0219
        L_0x0276:
            r0 = 800000(0xc3500, float:1.121039E-39)
            r9 = 2
            if (r1 >= r0) goto L_0x0219
        L_0x027c:
            r9 = 1
            goto L_0x0219
        L_0x027e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "codec.profileLevel, "
            goto L_0x006a
        L_0x0286:
            int r1 = r4 * r2
            int r0 = X.C90884f0.A00()
            if (r1 <= r0) goto L_0x02bb
            java.lang.String r0 = "legacyFrameSize, "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r4)
            java.lang.String r0 = "x"
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r2)
            r12.A07(r0)
            return r5
        L_0x02a1:
            return r3
        L_0x02a2:
            int r0 = X.AnonymousClass3C1.A01
            if (r0 < r1) goto L_0x02bb
            int r0 = r13.A0F
            r1 = -1
            if (r0 == r1) goto L_0x02b1
            boolean r0 = r12.A09(r0)
            if (r0 == 0) goto L_0x02bc
        L_0x02b1:
            int r0 = r13.A06
            if (r0 == r1) goto L_0x02bb
            boolean r0 = r12.A08(r0)
            if (r0 == 0) goto L_0x02bc
        L_0x02bb:
            r5 = 1
        L_0x02bc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90714eg.A0B(X.1gT):boolean");
    }

    public boolean A0C(C32491gT r4) {
        if (this.A05) {
            return this.A04;
        }
        Pair A012 = C90884f0.A01(r4);
        return A012 != null && AnonymousClass000.A0D(A012.first) == 42;
    }

    public String toString() {
        return this.A03;
    }
}
