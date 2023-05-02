package com.whatsapp.voipcalling;

import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass16S;
import X.AnonymousClass1OL;
import X.C14710pd;
import X.C15860rz;
import X.C15900s5;
import X.C15910s6;
import X.C16030sJ;
import X.C16040sK;
import X.C16180sb;
import X.C16260sj;
import X.C16320sq;
import X.C16620tM;
import X.C16980tz;
import X.C17020u3;
import X.C17120uZ;
import X.C30341cC;
import X.C42971z5;
import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.io.File;
import java.util.Arrays;
import org.wawebrtc.MediaCodecVideoEncoder;

public class JNIUtils {
    public static final String[] H264_BLACKLISTED_DEVICE_BOARD = {"sc7735s", "PXA19x8", "SC7727S", "sc7730s", "SC7715A", "full_oppo6750_15331", "mt6577", "hawaii", "java", "arima89_we_s_jb2", "arima82_w_s_kk", "capri", "mt6572", "P7-L10", "P7-L12"};
    public static final String[] H264_BLACKLISTED_DEVICE_HARDWARE = {"my70ds", "sc8830", "sc8830a", "samsungexynos7580"};
    public final C14710pd abProps;
    public final C16180sb fMessageIO;
    public final AnonymousClass01J isVideoRotationSupportedProvider;
    public final C16040sK meManager;
    public final AnonymousClass16S multiDeviceConfig;
    public int previousAudioSessionId = -1;
    public final C15900s5 serverProps;
    public final C17020u3 sharedPreferencesFactory;
    public final AnonymousClass01V systemServices;
    public final VoipCameraManager voipCameraManager;
    public final AnonymousClass1OL voipSharedPreferences;
    public final C16980tz waContext;
    public final C17120uZ waDebugBuildSharedPreferences;
    public final C16260sj waPermissionsHelper;
    public final C15860rz waSharedPreferences;
    public final C16320sq waWorkers;

    public JNIUtils(C14710pd r2, C16040sK r3, C16980tz r4, C16320sq r5, C16180sb r6, C15900s5 r7, AnonymousClass01V r8, AnonymousClass16S r9, VoipCameraManager voipCameraManager2, C16260sj r11, C15860rz r12, AnonymousClass1OL r13, C17020u3 r14, C17120uZ r15, AnonymousClass01J r16) {
        this.abProps = r2;
        this.meManager = r3;
        this.waContext = r4;
        this.waWorkers = r5;
        this.fMessageIO = r6;
        this.serverProps = r7;
        this.systemServices = r8;
        this.multiDeviceConfig = r9;
        this.voipCameraManager = voipCameraManager2;
        this.waPermissionsHelper = r11;
        this.waSharedPreferences = r12;
        this.voipSharedPreferences = r13;
        this.sharedPreferencesFactory = r14;
        this.waDebugBuildSharedPreferences = r15;
        this.isVideoRotationSupportedProvider = r16;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        if (r11 > 64000) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0222, code lost:
        if (r16 == null) goto L_0x024f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0326 A[LOOP:5: B:136:0x0324->B:137:0x0326, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x031a A[EDGE_INSN: B:150:0x031a->B:135:0x031a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0335 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x013f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011f A[LOOP:2: B:50:0x011d->B:51:0x011f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] findAvailableAudioSamplingRate(int[] r31, int r32, int r33) {
        /*
            r30 = this;
            java.lang.String r23 = ", audio source "
            java.lang.String r22 = ", buffer size "
            java.lang.String r21 = " works"
            java.lang.String r20 = " doesn't work"
            java.lang.String r19 = "voip/findAvailableAudioSamplingRate/sampling rate "
            r4 = r31
            int r3 = r4.length
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r3)
            r8 = r30
            X.0sj r1 = r8.waPermissionsHelper
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r5 = r1.A03(r0)
            r12 = 64000(0xfa00, float:8.9683E-41)
            r2 = 8000(0x1f40, float:1.121E-41)
            r1 = 44100(0xac44, float:6.1797E-41)
            r14 = 1
            r0 = 0
            r11 = r33
            if (r5 == 0) goto L_0x0039
            if (r11 < r2) goto L_0x0034
            if (r11 > r12) goto L_0x0034
            int[] r5 = new int[r14]
            r5[r0] = r33
            return r5
        L_0x0034:
            int[] r5 = new int[r14]
            r5[r0] = r1
            return r5
        L_0x0039:
            r13 = 2
            r10 = r32
            int r7 = getSamplingHash(r13, r4, r10, r11)
            X.1OL r0 = r8.voipSharedPreferences
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r6 = "audio_sampling_hash"
            r0 = -1
            int r0 = r1.getInt(r6, r0)
            if (r7 != r0) goto L_0x0098
            X.1OL r0 = r8.voipSharedPreferences
            android.content.SharedPreferences r5 = r0.A01()
            java.lang.String r1 = "audio_sampling_rates"
            java.lang.String r0 = ""
            java.lang.String r1 = r5.getString(r1, r0)
            r15 = 0
            int[] r5 = new int[r15]
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0094
            int r0 = r1.length()
            if (r0 <= r13) goto L_0x0094
            int r0 = r0 - r14
            java.lang.String r1 = r1.substring(r14, r0)
            java.lang.String r0 = ","
            java.lang.String[] r14 = r1.split(r0)
            int r13 = r14.length
            int[] r1 = new int[r13]
        L_0x007a:
            if (r15 >= r13) goto L_0x0093
            r0 = r14[r15]     // Catch:{ NumberFormatException -> 0x008b }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x008b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x008b }
            r1[r15] = r0     // Catch:{ NumberFormatException -> 0x008b }
            int r15 = r15 + 1
            goto L_0x007a
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = "voip/VoipSharedPrefs/ "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0094
        L_0x0093:
            r5 = r1
        L_0x0094:
            int r0 = r5.length
            if (r0 != r10) goto L_0x0098
            return r5
        L_0x0098:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            r0 = -1
            if (r11 != r0) goto L_0x00c7
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L_0x00c3
            X.01V r0 = r8.systemServices     // Catch:{ all -> 0x00bf }
            android.media.AudioManager r1 = r0.A0G()     // Catch:{ all -> 0x00bf }
            if (r1 == 0) goto L_0x00cc
            java.lang.String r0 = "android.media.property.OUTPUT_SAMPLE_RATE"
            java.lang.String r0 = r1.getProperty(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00cc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00bf }
            int r2 = r0.intValue()     // Catch:{ all -> 0x00bf }
            goto L_0x00cd
        L_0x00bf:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00c3:
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L_0x00cd
        L_0x00c7:
            if (r11 < r2) goto L_0x00cc
            r2 = r11
            if (r11 <= r12) goto L_0x00cd
        L_0x00cc:
            r2 = 0
        L_0x00cd:
            if (r2 <= 0) goto L_0x00f0
            java.lang.String r0 = "sampling rate server setting("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = ") : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.add(r0)
        L_0x00f0:
            r2 = 0
        L_0x00f1:
            if (r2 >= r3) goto L_0x0109
            r1 = r31[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x0106
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.add(r0)
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00f1
        L_0x0109:
            r4 = 4
            int[] r3 = new int[r4]
            r3 = {0, 1, 4, 5} // fill-array
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            r1 = 0
        L_0x011d:
            if (r1 >= r4) goto L_0x012b
            r0 = r3[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x011d
        L_0x012b:
            java.util.Iterator r18 = r2.iterator()
        L_0x012f:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x031a
            java.lang.Object r4 = r18.next()
            java.lang.Number r4 = (java.lang.Number) r4
            java.util.Iterator r17 = r5.iterator()
        L_0x013f:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0314
            java.lang.Object r3 = r17.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r3.intValue()
            r1 = 16
            r0 = 2
            int r1 = android.media.AudioRecord.getMinBufferSize(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x028f, all -> 0x029b }
            r0 = -2
            if (r1 == r0) goto L_0x0275
            int r25 = r4.intValue()     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            r27 = 16
            r28 = 2
            int r29 = r1 << 1
            android.media.AudioRecord r24 = new android.media.AudioRecord     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            r26 = r2
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            int r11 = r24.getState()     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            r0 = 1
            if (r11 != r0) goto L_0x025b
            int r12 = r24.getAudioSessionId()     // Catch:{ all -> 0x024b }
            r8.previousAudioSessionId = r12     // Catch:{ all -> 0x024b }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x024b }
            r11.<init>()     // Catch:{ all -> 0x024b }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ recorder session id "
            r11.append(r0)     // Catch:{ all -> 0x024b }
            r11.append(r12)     // Catch:{ all -> 0x024b }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x024b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x024b }
            X.1OL r0 = r8.voipSharedPreferences     // Catch:{ all -> 0x024b }
            r25 = r0
            int r0 = r8.previousAudioSessionId     // Catch:{ all -> 0x024b }
            android.content.SharedPreferences r11 = r25.A01()     // Catch:{ all -> 0x024b }
            java.lang.String r14 = "aec_os_version"
            r12 = 0
            java.lang.String r11 = r11.getString(r14, r12)     // Catch:{ all -> 0x024b }
            java.lang.String r13 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x024b }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x024b }
            if (r11 != 0) goto L_0x024f
            boolean r11 = android.media.audiofx.AcousticEchoCanceler.isAvailable()     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x01aa:
            r11 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r11)     // Catch:{ all -> 0x024b }
            r11 = 0
        L_0x01af:
            r16 = 0
            if (r11 == 0) goto L_0x022f
            android.media.audiofx.AcousticEchoCanceler r16 = android.media.audiofx.AcousticEchoCanceler.create(r0)     // Catch:{ all -> 0x021e }
            if (r16 == 0) goto L_0x024f
            android.media.audiofx.AudioEffect$Descriptor r12 = r16.getDescriptor()     // Catch:{ all -> 0x021e }
            if (r12 == 0) goto L_0x0224
            java.util.UUID r11 = r12.uuid     // Catch:{ all -> 0x021e }
            if (r11 == 0) goto L_0x0224
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x021e }
            r0.<init>()     // Catch:{ all -> 0x021e }
            java.lang.String r15 = "voip/AcousticEchoCanceler implementor:"
            r0.append(r15)     // Catch:{ all -> 0x021e }
            java.lang.String r15 = r12.implementor     // Catch:{ all -> 0x021e }
            r0.append(r15)     // Catch:{ all -> 0x021e }
            java.lang.String r15 = " uuid:"
            r0.append(r15)     // Catch:{ all -> 0x021e }
            r0.append(r11)     // Catch:{ all -> 0x021e }
            java.lang.String r11 = " enabled:"
            r0.append(r11)     // Catch:{ all -> 0x021e }
            boolean r11 = r16.getEnabled()     // Catch:{ all -> 0x021e }
            r0.append(r11)     // Catch:{ all -> 0x021e }
            java.lang.String r11 = " hasControl:"
            r0.append(r11)     // Catch:{ all -> 0x021e }
            boolean r11 = r16.hasControl()     // Catch:{ all -> 0x021e }
            r0.append(r11)     // Catch:{ all -> 0x021e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x021e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x021e }
            java.util.UUID r0 = r12.uuid     // Catch:{ all -> 0x021e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x021e }
            java.lang.String r12 = r12.implementor     // Catch:{ all -> 0x021e }
            android.content.SharedPreferences r11 = r25.A01()     // Catch:{ all -> 0x021e }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x021e }
            android.content.SharedPreferences$Editor r13 = r11.putString(r14, r13)     // Catch:{ all -> 0x021e }
            java.lang.String r11 = "aec_uuid"
            android.content.SharedPreferences$Editor r11 = r13.putString(r11, r0)     // Catch:{ all -> 0x021e }
            java.lang.String r0 = "aec_implementor"
            android.content.SharedPreferences$Editor r0 = r11.putString(r0, r12)     // Catch:{ all -> 0x021e }
            r0.apply()     // Catch:{ all -> 0x021e }
            goto L_0x0224
        L_0x021e:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0228 }
            if (r16 == 0) goto L_0x024f
        L_0x0224:
            r16.release()     // Catch:{ all -> 0x024b }
            goto L_0x024f
        L_0x0228:
            r0 = move-exception
            if (r16 == 0) goto L_0x022e
            r16.release()     // Catch:{ all -> 0x024b }
        L_0x022e:
            throw r0     // Catch:{ all -> 0x024b }
        L_0x022f:
            android.content.SharedPreferences r0 = r25.A01()     // Catch:{ all -> 0x024b }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x024b }
            android.content.SharedPreferences$Editor r11 = r0.putString(r14, r13)     // Catch:{ all -> 0x024b }
            java.lang.String r0 = "aec_uuid"
            android.content.SharedPreferences$Editor r11 = r11.putString(r0, r12)     // Catch:{ all -> 0x024b }
            java.lang.String r0 = "aec_implementor"
            android.content.SharedPreferences$Editor r0 = r11.putString(r0, r12)     // Catch:{ all -> 0x024b }
            r0.apply()     // Catch:{ all -> 0x024b }
            goto L_0x024f
        L_0x024b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IllegalArgumentException -> 0x0258, all -> 0x0255 }
        L_0x024f:
            r24.release()     // Catch:{ IllegalArgumentException -> 0x0258, all -> 0x0255 }
            r13 = 1
            goto L_0x02da
        L_0x0255:
            r12 = move-exception
            r13 = 1
            goto L_0x029e
        L_0x0258:
            r11 = move-exception
            r13 = 1
            goto L_0x0292
        L_0x025b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ Recorder state "
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            int r0 = r24.getState()     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            java.lang.String r0 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            goto L_0x02d9
        L_0x0275:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ can not find min buffer size for rate "
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            r11.append(r2)     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            java.lang.String r0 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x028d, all -> 0x028b }
            goto L_0x02d9
        L_0x028b:
            r12 = move-exception
            goto L_0x029d
        L_0x028d:
            r11 = move-exception
            goto L_0x0291
        L_0x028f:
            r11 = move-exception
            r1 = 0
        L_0x0291:
            r13 = 0
        L_0x0292:
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ "
            com.whatsapp.util.Log.e(r0, r11)     // Catch:{ all -> 0x0299 }
            goto L_0x02da
        L_0x0299:
            r12 = move-exception
            goto L_0x029e
        L_0x029b:
            r12 = move-exception
            r1 = 0
        L_0x029d:
            r13 = 0
        L_0x029e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r0 = r19
            r11.append(r0)
            r11.append(r2)
            r0 = r20
            if (r13 == 0) goto L_0x02b1
            r0 = r21
        L_0x02b1:
            r11.append(r0)
            r0 = r22
            r11.append(r0)
            int r0 = r1 << 1
            r11.append(r0)
            r0 = r23
            r11.append(r0)
            r11.append(r4)
            java.lang.String r0 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 == 0) goto L_0x0335
            r9.add(r3)
            int r0 = r9.size()
            if (r0 < r10) goto L_0x0335
            goto L_0x0314
        L_0x02d9:
            r13 = 0
        L_0x02da:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r0 = r19
            r11.append(r0)
            r11.append(r2)
            r0 = r20
            if (r13 == 0) goto L_0x02ed
            r0 = r21
        L_0x02ed:
            r11.append(r0)
            r0 = r22
            r11.append(r0)
            int r0 = r1 << 1
            r11.append(r0)
            r0 = r23
            r11.append(r0)
            r11.append(r4)
            java.lang.String r0 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 == 0) goto L_0x013f
            r9.add(r3)
            int r0 = r9.size()
            if (r0 < r10) goto L_0x013f
        L_0x0314:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x012f
        L_0x031a:
            java.util.Collections.sort(r9)
            int r2 = r9.size()
            int[] r3 = new int[r2]
            r1 = 0
        L_0x0324:
            if (r1 >= r2) goto L_0x0336
            java.lang.Object r0 = r9.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x0324
        L_0x0335:
            throw r12
        L_0x0336:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x033f
            r0 = -1
            r8.previousAudioSessionId = r0
        L_0x033f:
            if (r2 <= 0) goto L_0x0369
            X.1OL r0 = r8.voipSharedPreferences
            android.content.SharedPreferences r0 = r0.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r6, r7)
            r0.apply()
            X.1OL r0 = r8.voipSharedPreferences
            android.content.SharedPreferences r0 = r0.A01()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r1 = java.util.Arrays.toString(r3)
            java.lang.String r0 = "audio_sampling_rates"
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)
            r0.apply()
        L_0x0369:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.findAvailableAudioSamplingRate(int[], int, int):int[]");
    }

    public static int getSamplingHash(int i2, int[] iArr, int i3, int i4) {
        int length = iArr.length;
        int[] iArr2 = new int[(length + 4)];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i3;
        iArr2[length + 1] = i2;
        iArr2[length + 2] = Build.VERSION.SDK_INT;
        iArr2[length + 3] = i4;
        return Arrays.hashCode(iArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r1.equalsIgnoreCase("jfvelte") == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isH264HwCodecSupported() {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r0 = 19
            if (r1 < r0) goto L_0x0029
            boolean r0 = X.C41971wz.A03()
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = "5.0.1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "jflte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "jfvelte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            return r5
        L_0x002a:
            java.lang.String[] r4 = H264_BLACKLISTED_DEVICE_BOARD
            int r3 = r4.length
            r2 = 0
        L_0x002e:
            if (r2 >= r3) goto L_0x003d
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.BOARD
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0029
            int r2 = r2 + 1
            goto L_0x002e
        L_0x003d:
            java.lang.String[] r4 = H264_BLACKLISTED_DEVICE_HARDWARE
            int r3 = r4.length
            r2 = 0
        L_0x0041:
            if (r2 >= r3) goto L_0x0050
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.HARDWARE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0029
            int r2 = r2 + 1
            goto L_0x0041
        L_0x0050:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.isH264HwCodecSupported():boolean");
    }

    private boolean isH265HwCodecSupported() {
        return MediaCodecVideoEncoder.isH265HwSupported();
    }

    private boolean isH265SwCodecSupported() {
        return false;
    }

    private synchronized H26xSupportResult isH26XCodecSupported() {
        return new H26xSupportResult(isH264HwCodecSupported(), false, MediaCodecVideoEncoder.isH265HwSupported(), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateH26XCodecSupported$0() {
        this.voipSharedPreferences.A04(isH26XCodecSupported());
    }

    public boolean allowAlternativeNetworkForAudioCall() {
        return !((SharedPreferences) this.waSharedPreferences.A01.get()).getBoolean("voip_low_data_usage", false) && this.waSharedPreferences.A03() != 0;
    }

    public boolean allowAlternativeNetworkForVideoCall() {
        return !((SharedPreferences) this.waSharedPreferences.A01.get()).getBoolean("voip_low_data_usage", false) && (this.waSharedPreferences.A03() & 4) != 0;
    }

    public synchronized int[] findAvailableAudioSamplingRate(int i2) {
        return findAvailableAudioSamplingRate(new int[]{16000, 24000, 44100, 22050, 8000, 11025, 32000, 48000, 12000}, 2, i2);
    }

    public int getAudioLevelSpeakingThreshold() {
        return Math.min(this.abProps.A03(C16620tM.A02, 1213), 127);
    }

    public int getCallAdminVersion() {
        return this.abProps.A03(C16620tM.A02, 2912);
    }

    public boolean getCallLinkIsRemovable() {
        return this.abProps.A0E(C16620tM.A02, 2785);
    }

    public int getCallLinkMilestoneVersion() {
        return this.abProps.A03(C16620tM.A02, 1372);
    }

    public String getDebugDirectory() {
        this.fMessageIO.A05();
        return this.waContext.A00.getFilesDir().getAbsolutePath();
    }

    public boolean getDebugVoipRecordDecoderVideo() {
        return false;
    }

    public boolean getDebugVoipRecordEncoderVideo() {
        return false;
    }

    public boolean getDebugVoipRecordPreprocessedCaptureVideo() {
        return false;
    }

    public boolean getDebugVoipRecordRawCaptureVideo() {
        return false;
    }

    public boolean getDebugVoipRecordRawRenderVideo() {
        return false;
    }

    public int getGroupCallBufferParticipantThreshold() {
        return this.abProps.A03(C16620tM.A02, 2251);
    }

    public int getGroupCallBufferProcessDelay() {
        return this.abProps.A03(C16620tM.A02, 1092);
    }

    public int getHeartbeatIntervalS() {
        return this.abProps.A03(C16620tM.A02, 1430);
    }

    public int getLobbyTimeoutMin() {
        return this.abProps.A03(C16620tM.A02, 1565);
    }

    public boolean getOverrideIpConfigPreferIpv6() {
        return false;
    }

    public String getSelfJid() {
        Jid jid;
        boolean A0G = this.meManager.A0G();
        C16040sK r0 = this.meManager;
        if (A0G) {
            r0.A0B();
            jid = r0.A04;
        } else {
            r0.A0B();
            jid = r0.A05;
        }
        return C16030sJ.A03(jid);
    }

    public final String getTimeSeriesDirectory() {
        File A08 = C30341cC.A08(this.waContext.A00);
        if (A08 != null) {
            return A08.getAbsolutePath();
        }
        Log.e("getTimeSeriesDirectory base time series directory is null");
        return "";
    }

    public int getUpdateSpeakerStatusIntervalMs() {
        return this.abProps.A03(C16620tM.A02, 1106);
    }

    public int getVidStreamPauseResumeJbResetThreshold() {
        return this.abProps.A03(C16620tM.A02, 2642);
    }

    public final String getVoipCacheDirectory() {
        String str;
        File cacheDir = this.waContext.A00.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, "voip");
            if (file.exists() || file.mkdirs()) {
                return file.getAbsolutePath();
            }
            str = "getVoipCacheDirectory could not init directory";
        } else {
            str = "getVoipCacheDirectory Cache Directory is null";
        }
        Log.e(str);
        return "";
    }

    public VoipCameraManager getVoipCameraManager() {
        return this.voipCameraManager;
    }

    public int getYearClass() {
        return C42971z5.A02(this.systemServices, this.sharedPreferencesFactory);
    }

    public MediaCodecVideoEncoder initMediaCodecVideoEncoder() {
        return new MediaCodecVideoEncoder(this.voipSharedPreferences);
    }

    public boolean isFixedVideoOrientationEnabled() {
        return isVideoRotationEnabled();
    }

    public boolean isGcallCodecNegoFixEnabled() {
        return this.voipSharedPreferences.A01().getBoolean("enable_gcall_codec_nego_fix", false);
    }

    public boolean isGroupCallBufferEnabled() {
        return this.abProps.A0E(C16620tM.A02, 1039);
    }

    public synchronized H26xSupportResult isH26XCodecSupportedFromCache() {
        SharedPreferences A01;
        A01 = this.voipSharedPreferences.A01();
        return (!A01.contains("video_codec_h264_hw_supported") || !A01.contains("video_codec_h264_sw_supported") || !A01.contains("video_codec_h265_hw_supported") || !A01.contains("video_codec_h265_sw_supported")) ? null : new H26xSupportResult(A01.getBoolean("video_codec_h264_hw_supported", false), A01.getBoolean("video_codec_h264_sw_supported", false), A01.getBoolean("video_codec_h265_hw_supported", false), A01.getBoolean("video_codec_h265_sw_supported", false));
    }

    public boolean isLowDataUsageEnabled() {
        return ((SharedPreferences) this.waSharedPreferences.A01.get()).getBoolean("voip_low_data_usage", false);
    }

    public boolean isMDCallEnabled() {
        return this.serverProps.A05(C15910s6.A0b);
    }

    public boolean isMuteParticipantEnabled() {
        return this.abProps.A0E(C16620tM.A02, 1111);
    }

    public boolean isReportCallRepalyerIdAllowed() {
        return this.abProps.A0E(C16620tM.A02, 1834);
    }

    public boolean isVidQualityManagerEnabled() {
        return this.voipSharedPreferences.A01().getBoolean("enable_vid_quality_manager", false);
    }

    public boolean isVideoConverterMemoryLeakFixEnabled() {
        return this.voipSharedPreferences.A01.A0E(C16620tM.A02, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
    }

    public boolean isVideoRotationEnabled() {
        return ((Boolean) this.isVideoRotationSupportedProvider.get()).booleanValue();
    }

    public boolean isVoipStanzaSmaxationEnabled() {
        return this.abProps.A0E(C16620tM.A02, 1520);
    }

    public boolean isWamCallExtendedEnabled() {
        return this.abProps.A0E(C16620tM.A02, 1939);
    }

    public synchronized void updateH26XCodecSupported(boolean z2) {
        if (z2) {
            this.waWorkers.Acl(new RunnableRunnableShape16S0100000_I0_15(this, 27));
        } else {
            this.voipSharedPreferences.A04(isH26XCodecSupported());
        }
    }

    public void uploadCrashLog(String str) {
    }
}
