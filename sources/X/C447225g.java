package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.SensorEventListener;
import android.media.AudioManager;
import android.media.Ringtone;
import android.media.SoundPool;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.service.notification.StatusBarNotification;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I0;
import com.facebook.redex.IDxCallbackShape186S0100000_1_I0;
import com.facebook.redex.IDxCallbackShape187S0100000_2_I0;
import com.facebook.redex.IDxLObserverShape423S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0000000_I0;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import com.facebook.redex.RunnableRunnableShape0S2000000_I0;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.obwhatsapp.calling.service.VoiceService$DefaultSignalingXmppCallback;
import com.obwhatsapp.calling.service.VoiceService$VoiceServiceEventCallback;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.JNIUtils;
import com.whatsapp.voipcalling.VoiceFGService;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.25g  reason: invalid class name and case insensitive filesystem */
public class C447225g {
    public static String A2v;
    public static final ThreadPoolExecutor A2w = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static final AtomicInteger A2x = new AtomicInteger();
    public double A00 = Double.NaN;
    public double A01 = Double.NaN;
    public int A02;
    public int A03 = 0;
    public int A04 = 0;
    public int A05;
    public int A06 = 30;
    public int A07 = 0;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C = -1;
    public long A0D;
    public long A0E;
    public BroadcastReceiver A0F;
    public BroadcastReceiver A0G;
    public Ringtone A0H;
    public SoundPool A0I;
    public Uri A0J;
    public Handler A0K;
    public Handler A0L;
    public Handler A0M;
    public Handler A0N;
    public PowerManager.WakeLock A0O;
    public PowerManager.WakeLock A0P;
    public PhoneStateListener A0Q;
    public C19480yV A0R;
    public C55282jD A0S;
    public C448926b A0T;
    public C82534De A0U;
    public AnonymousClass4KJ A0V;
    public AnonymousClass4KJ A0W;
    public AnonymousClass4KJ A0X;
    public AnonymousClass4KJ A0Y;
    public AnonymousClass4KJ A0Z;
    public AnonymousClass1ZF A0a;
    public C52242dN A0b;
    public C78733yb A0c;
    public WamCall A0d;
    public C18330wW A0e;
    public AnonymousClass4L9 A0f;
    public Boolean A0g = null;
    public Boolean A0h;
    public Boolean A0i;
    public Boolean A0j;
    public Integer A0k;
    public Integer A0l;
    public Integer A0m;
    public Integer A0n;
    public Integer A0o = 1500;
    public Integer A0p;
    public Integer A0q;
    public Integer A0r;
    public Integer A0s;
    public Long A0t;
    public Long A0u;
    public Long A0v;
    public Long A0w;
    public Object A0x;
    public Object A0y;
    public Object A0z;
    public String A10;
    public String A11;
    public String A12;
    public Set A13 = new HashSet();
    public ScheduledExecutorService A14;
    public short A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B = false;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G = false;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P = false;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T = true;
    public boolean A1U;
    public long[] A1V;
    public final int A1W;
    public final Context A1X;
    public final TelephonyManager A1Y;
    public final C16570tH A1Z;
    public final C16300so A1a;
    public final C16180sb A1b;
    public final C14870pt A1c;
    public final C16040sK A1d;
    public final C17130ua A1e;
    public final C16600tK A1f;
    public final C19010xc A1g;
    public final C19080xj A1h;
    public final C23441Bz A1i;
    public final AnonymousClass1OL A1j;
    public final AnonymousClass26Z A1k;
    public final C84804Ly A1l;
    public final AnonymousClass198 A1m;
    public final AnonymousClass1SJ A1n;
    public final AnonymousClass1SM A1o;
    public final AnonymousClass1SK A1p;
    public final C23111An A1q;
    public final AnonymousClass1SI A1r;
    public final C82524Dd A1s = new C82524Dd(this);
    public final VoiceService$VoiceServiceEventCallback A1t;
    public final C18380wb A1u;
    public final C216514x A1v;
    public final AnonymousClass4RX A1w;
    public final C18010w0 A1x;
    public final AnonymousClass39S A1y;
    public final AnonymousClass1SO A1z;
    public final C15850ry A20;
    public final AnonymousClass1OK A21;
    public final C23121Ao A22;
    public final AnonymousClass1SN A23;
    public final C17650vQ A24;
    public final C19590yg A25;
    public final C18260wP A26;
    public final C16000sG A27;
    public final C16080sP A28;
    public final AnonymousClass16U A29;
    public final AnonymousClass15I A2A;
    public final AnonymousClass11R A2B;
    public final AnonymousClass01V A2C;
    public final C16440t3 A2D;
    public final C19380yL A2E;
    public final C16260sj A2F;
    public final C15860rz A2G;
    public final AnonymousClass013 A2H;
    public final C208211s A2I;
    public final AnonymousClass16P A2J;
    public final C19260y8 A2K;
    public final AnonymousClass1D0 A2L;
    public final AnonymousClass195 A2M;
    public final C19810z2 A2N;
    public final C14710pd A2O;
    public final C17240ul A2P;
    public final C19470yU A2Q;
    public final AnonymousClass124 A2R;
    public final C207811o A2S;
    public final C218415q A2T;
    public final AnonymousClass125 A2U;
    public final AnonymousClass1HG A2V;
    public final C229319v A2W;
    public final C18990xa A2X;
    public final AnonymousClass2GX A2Y = new IDxLObserverShape423S0100000_2_I0(this, 0);
    public final C19490yW A2Z;
    public final C16220sf A2a;
    public final C216014s A2b;
    public final C16320sq A2c;
    public final AnonymousClass15A A2d;
    public final JNIUtils A2e;
    public final VoipCameraManager A2f;
    public final AnonymousClass01D A2g;
    public final List A2h = new ArrayList();
    public final Map A2i = new HashMap();
    public final Map A2j = new HashMap();
    public final Map A2k = new ConcurrentHashMap();
    public final Map A2l = new ConcurrentHashMap();
    public final Map A2m = new HashMap();
    public final Set A2n = new HashSet();
    public final Set A2o = Collections.synchronizedSet(new HashSet());
    public volatile int A2p = 0;
    public volatile C613638p A2q;
    public volatile Boolean A2r;
    public volatile Integer A2s;
    public volatile String A2t;
    public volatile boolean A2u;

    public C447225g(Context context, C16570tH r30, C16300so r31, C16180sb r32, C14870pt r33, AnonymousClass19T r34, C16040sK r35, C211512z r36, AnonymousClass1HD r37, C17130ua r38, C16600tK r39, C19010xc r40, C19080xj r41, C210812s r42, C23441Bz r43, AnonymousClass1OL r44, AnonymousClass198 r45, AnonymousClass1SJ r46, AnonymousClass1SM r47, AnonymousClass1SK r48, C23111An r49, AnonymousClass1SI r50, C18380wb r51, C216514x r52, C18010w0 r53, AnonymousClass1SO r54, C15850ry r55, AnonymousClass1OK r56, C23121Ao r57, AnonymousClass1SN r58, C17650vQ r59, C19590yg r60, C18260wP r61, C16000sG r62, C16080sP r63, AnonymousClass16U r64, AnonymousClass15I r65, AnonymousClass1SL r66, AnonymousClass11R r67, AnonymousClass01V r68, C16440t3 r69, C19380yL r70, C16260sj r71, C15860rz r72, AnonymousClass013 r73, C208211s r74, AnonymousClass16P r75, C18920xT r76, C19260y8 r77, AnonymousClass1HU r78, AnonymousClass1GG r79, AnonymousClass1D0 r80, AnonymousClass195 r81, AnonymousClass19B r82, AnonymousClass137 r83, C19810z2 r84, C14710pd r85, C16490t9 r86, C17240ul r87, C17690vU r88, C19470yU r89, C24851Hn r90, AnonymousClass124 r91, C207811o r92, C218415q r93, AnonymousClass125 r94, AnonymousClass1HG r95, C229319v r96, C18990xa r97, C19490yW r98, C16220sf r99, C216014s r100, AnonymousClass1B1 r101, C16320sq r102, AnonymousClass15A r103, JNIUtils jNIUtils, VoipCameraManager voipCameraManager, AnonymousClass01D r106) {
        Context context2 = context;
        this.A1X = context2;
        this.A1u = r51;
        this.A2D = r69;
        C14710pd r3 = r85;
        this.A2O = r3;
        this.A1c = r33;
        this.A2e = jNIUtils;
        this.A1a = r31;
        this.A1d = r35;
        C16320sq r1 = r102;
        this.A2c = r1;
        this.A1b = r32;
        this.A1e = r38;
        this.A1i = r43;
        this.A2R = r91;
        this.A2b = r100;
        this.A2X = r97;
        this.A2d = r103;
        this.A1g = r40;
        this.A24 = r59;
        this.A1q = r49;
        this.A1h = r41;
        this.A27 = r62;
        AnonymousClass16P r6 = r75;
        this.A2J = r6;
        AnonymousClass01V r7 = r68;
        this.A2C = r7;
        this.A28 = r63;
        this.A2H = r73;
        this.A1r = r50;
        this.A2W = r96;
        this.A2U = r94;
        this.A2P = r87;
        this.A1f = r39;
        this.A2L = r80;
        this.A2A = r65;
        this.A2a = r99;
        AnonymousClass16U r15 = r64;
        this.A29 = r15;
        this.A2T = r93;
        C208211s r9 = r74;
        this.A2I = r9;
        this.A2N = r84;
        this.A2f = voipCameraManager;
        this.A2K = r77;
        this.A2S = r92;
        this.A2F = r71;
        this.A2G = r72;
        this.A2M = r81;
        this.A21 = r56;
        this.A1x = r53;
        this.A1j = r44;
        this.A2E = r70;
        this.A1p = r48;
        this.A2Q = r89;
        this.A2Z = r98;
        this.A22 = r57;
        this.A20 = r55;
        this.A1Z = r30;
        this.A26 = r61;
        this.A25 = r60;
        this.A1o = r47;
        this.A1z = r54;
        C216514x r8 = r52;
        this.A1v = r8;
        this.A1t = new VoiceService$VoiceServiceEventCallback(this, r88);
        this.A2B = r67;
        this.A2V = r95;
        this.A1w = new AnonymousClass4RX(r42);
        this.A1Y = r7.A0N();
        AnonymousClass1GG r5 = r79;
        AnonymousClass19B r23 = r82;
        AnonymousClass1HU r21 = r78;
        C18920xT r19 = r76;
        AnonymousClass19T r11 = r34;
        AnonymousClass1HD r13 = r37;
        C211512z r12 = r36;
        AnonymousClass1SL r16 = r66;
        C24911Ht r20 = (C24911Ht) ((C16150sX) ((AnonymousClass01F) C004501y.A00(AnonymousClass01F.class, r5.A00.A00))).A6C.get();
        AnonymousClass1GG r22 = r5;
        AnonymousClass16P r18 = r6;
        C208211s r17 = r9;
        this.A1y = new AnonymousClass39S(r11, r12, r13, new AnonymousClass38X(this), r15, r16, r17, r18, r19, r20, r21, r22, r23, r83, r3, r86, r90);
        this.A1k = new AnonymousClass26Z(context2, this, r8, r7, r3, r101, r1);
        this.A23 = r58;
        this.A1W = r3.A03(C16620tM.A02, 870);
        this.A1n = r46;
        this.A2g = r106;
        this.A1m = r45;
        this.A1l = new C84804Ly(context2);
    }

    public static final int A00(CallInfo callInfo) {
        switch (callInfo.callResult) {
            case 1:
                return callInfo.isEndedByMe ? 2 : 3;
            case 2:
                return 6;
            case 3:
            case 7:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
                return 8;
            case 4:
            case 8:
            case 9:
                return 5;
            case 5:
                return callInfo.isCaller ? 7 : 5;
            case 6:
            case 10:
            case 14:
            case 19:
                return 1;
            case 18:
                return 4;
            default:
                return 9;
        }
    }

    public static void A01(Bundle bundle, DeviceJid deviceJid, Jid jid, String str, String str2, long j2) {
        bundle.putString("id", str);
        bundle.putParcelable("jid", jid);
        bundle.putParcelable("callCreatorJid", deviceJid);
        bundle.putString("callId", str2);
        bundle.putLong("loggableStanzaId", j2);
    }

    public static /* synthetic */ void A03(C447225g r14, DeviceJid deviceJid, boolean z2) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        String currentCallId = Voip.getCurrentCallId();
        C613638p r4 = r14.A2q;
        if (r4 != null) {
            String str = r4.A04;
            if (str.equals(currentCallId) && r4.A05.containsKey(deviceJid)) {
                r14.A2q = null;
                VoipStanzaChildNode voipStanzaChildNode = r4.A02;
                if (voipStanzaChildNode != null) {
                    ArrayList arrayList = new ArrayList();
                    VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
                    AnonymousClass00B.A06(childrenCopy);
                    for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                        C35081lL[] attributesCopy = voipStanzaChildNode2.getAttributesCopy();
                        AnonymousClass00B.A06(attributesCopy);
                        int length = attributesCopy.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            C35081lL r1 = attributesCopy[i2];
                            if ("jid".equals(r1.A02)) {
                                DeviceJid of = DeviceJid.of(r1.A01);
                                if (of != null && !of.equals(deviceJid)) {
                                    arrayList.add(voipStanzaChildNode2);
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (!arrayList.isEmpty() && (voipStanzaChildNodeArr = (VoipStanzaChildNode[]) arrayList.toArray(new VoipStanzaChildNode[0])) != null) {
                        r14.A0Z(new C613638p(r4.A01, str, C32601gl.A02(r4.A03, voipStanzaChildNodeArr)));
                    }
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = r14.A14;
        if (scheduledExecutorService != null) {
            try {
                scheduledExecutorService.execute(new RunnableRunnableShape0S0110000_I0(deviceJid, 8, z2));
            } catch (RejectedExecutionException unused) {
                Log.w("voip/handleDeviceBecomesInvalid: executor shutdown");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A04(X.C447225g r3, java.util.List r4, int r5) {
        /*
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r2 = 1
            if (r5 == r2) goto L_0x0087
            r0 = 2
            if (r5 == r0) goto L_0x0077
            r1 = 6
            if (r5 == r1) goto L_0x006a
            r0 = 18
            if (r5 == r0) goto L_0x004d
            r0 = 10
            if (r5 == r0) goto L_0x0040
            r0 = 11
            if (r5 == r0) goto L_0x0040
            switch(r5) {
                case 21: goto L_0x0029;
                case 22: goto L_0x0029;
                case 23: goto L_0x0029;
                case 24: goto L_0x0029;
                case 25: goto L_0x004d;
                case 26: goto L_0x0029;
                default: goto L_0x001c;
            }
        L_0x001c:
            r1 = 0
        L_0x001d:
            X.0pt r0 = r3.A1c
            X.0pS r0 = r0.A00
            if (r0 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x0028
            r0.Afc(r1)
        L_0x0028:
            return
        L_0x0029:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "finish"
            r1.putBoolean(r0, r2)
            r3.A0N()
            X.2dW r0 = new X.2dW
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A01(r1, r0, r5)
            goto L_0x001d
        L_0x0040:
            r3.A0N()
            X.2dW r0 = new X.2dW
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A02(r0, r5)
            goto L_0x001d
        L_0x004d:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            java.lang.String r0 = "user_jids"
            r2.putParcelableArrayList(r0, r1)
            r3.A0N()
            X.2dW r0 = new X.2dW
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A01(r2, r0, r5)
            goto L_0x001d
        L_0x006a:
            r3.A0N()
            X.2dW r0 = new X.2dW
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A02(r0, r1)
            goto L_0x001d
        L_0x0077:
            if (r1 == 0) goto L_0x001c
            r3.A0N()
            java.util.Map r0 = r1.participants
            int r0 = r0.size()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A03(r4, r0, r2)
            goto L_0x001d
        L_0x0087:
            if (r1 == 0) goto L_0x001c
            r3.A0N()
            java.util.Map r0 = r1.participants
            int r1 = r0.size()
            r0 = 0
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A03(r4, r1, r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A04(X.25g, java.util.List, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A05(X.C447225g r4, boolean r5) {
        /*
            java.lang.String r0 = "test.name"
            java.lang.String r2 = com.whatsapp.voipcalling.Voip.A06(r0)
            if (r2 == 0) goto L_0x0019
            X.0rz r0 = r4.A2G
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "voip_call_ab_test_bucket"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
        L_0x0019:
            java.lang.String r0 = "options.spam_call_threshold_seconds"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r0 == 0) goto L_0x0027
            int r0 = r0.intValue()
            r4.A06 = r0
        L_0x0027:
            java.lang.String r0 = "options.offer_ack_timeout"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            r4.A0m = r0
            java.lang.String r0 = "options.android_audio_mode_in_call"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            r4.A0k = r0
            java.lang.String r0 = "options.audio_level_adjust"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r0 == 0) goto L_0x0045
            int r0 = r0.intValue()
            r4.A08 = r0
        L_0x0045:
            java.lang.String r0 = "options.call_start_delay"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            X.1OL r3 = r4.A1j
            if (r0 == 0) goto L_0x026f
            int r2 = r0.intValue()
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "call_start_delay"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0061:
            r0.apply()
        L_0x0064:
            java.lang.String r0 = "vid_driver.camera_width"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.camera_height"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r1 == 0) goto L_0x0240
            if (r0 == 0) goto L_0x0240
            int r4 = r1.intValue()
            int r2 = r0.intValue()
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "video_call_front_camera_width"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r4)
            java.lang.String r0 = "video_call_front_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0094:
            r0.apply()
        L_0x0097:
            java.lang.String r0 = "vid_driver.back_camera_width"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.back_camera_height"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r1 == 0) goto L_0x0211
            if (r0 == 0) goto L_0x0211
            int r4 = r1.intValue()
            int r2 = r0.intValue()
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "video_call_back_camera_width"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r4)
            java.lang.String r0 = "video_call_back_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x00c7:
            r0.apply()
        L_0x00ca:
            java.lang.String r0 = "options.portrait_mode_threshold"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r0 == 0) goto L_0x0201
            int r2 = r0.intValue()
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "portrait_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x00e4:
            r0.apply()
            java.lang.String r0 = "options.landscape_mode_threshold"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r0 == 0) goto L_0x01f1
            int r2 = r0.intValue()
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "landscape_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0101:
            r0.apply()
            java.lang.String r0 = "options.enable_vqm"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A00(r0)
            if (r0 == 0) goto L_0x01e1
            boolean r2 = r0.booleanValue()
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "enable_vid_quality_manager"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x011e:
            r0.apply()
            if (r5 == 0) goto L_0x01ad
            java.lang.String r0 = "options.disable_device_specific_camera_size"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A00(r0)
            if (r0 == 0) goto L_0x01d1
            boolean r2 = r0.booleanValue()
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "disable_device_specific_camera_size"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x013d:
            r0.apply()
            java.lang.String r0 = "options.android_camera2_support_level"
            java.lang.String r2 = com.whatsapp.voipcalling.Voip.A06(r0)
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "camera2_required_hardware_support_level"
            if (r2 == 0) goto L_0x01cc
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
        L_0x0156:
            r0.apply()
            java.lang.String r0 = "options.force_passive_capture_dev_stream_role"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A00(r0)
            if (r0 == 0) goto L_0x01bd
            boolean r2 = r0.booleanValue()
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "force_passive_capture_dev_stream_role"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x0173:
            r0.apply()
            java.lang.String r0 = "options.enable_gcall_codec_nego_fix"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A00(r0)
            if (r0 == 0) goto L_0x01ae
            boolean r1 = r0.booleanValue()
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r4 = "enable_gcall_codec_nego_fix"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r4, r1)
        L_0x0190:
            r0.apply()
            java.lang.String r0 = "Updating gcall_codec_nego sys pref to "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            android.content.SharedPreferences r1 = r3.A01()
            r0 = 0
            boolean r0 = r1.getBoolean(r4, r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01ad:
            return
        L_0x01ae:
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r4 = "enable_gcall_codec_nego_fix"
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)
            goto L_0x0190
        L_0x01bd:
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "force_passive_capture_dev_stream_role"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0173
        L_0x01cc:
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0156
        L_0x01d1:
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "disable_device_specific_camera_size"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x013d
        L_0x01e1:
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "enable_vid_quality_manager"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x011e
        L_0x01f1:
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "landscape_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0101
        L_0x0201:
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "portrait_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x00e4
        L_0x0211:
            android.content.SharedPreferences r0 = r3.A01()
            java.lang.String r2 = "video_call_back_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x022b
            android.content.SharedPreferences r1 = r3.A01()
            java.lang.String r0 = "video_call_back_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00ca
        L_0x022b:
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r1 = r0.remove(r2)
            java.lang.String r0 = "video_call_back_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x00c7
        L_0x0240:
            android.content.SharedPreferences r0 = r3.A01()
            java.lang.String r2 = "video_call_front_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x025a
            android.content.SharedPreferences r1 = r3.A01()
            java.lang.String r0 = "video_call_front_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0097
        L_0x025a:
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r1 = r0.remove(r2)
            java.lang.String r0 = "video_call_front_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0094
        L_0x026f:
            android.content.SharedPreferences r0 = r3.A01()
            java.lang.String r1 = "call_start_delay"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0064
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A05(X.25g, boolean):void");
    }

    public static void A06(String str) {
        if (4 <= Log.level) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/total threads count = ");
            sb.append(Thread.activeCount());
            Log.log(4, sb.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v134, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v57, types: [int] */
    /* JADX WARNING: type inference failed for: r1v135 */
    /* JADX WARNING: type inference failed for: r1v187 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r0.A0l(com.whatsapp.voipcalling.Voip.getCallInfo());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0489, code lost:
        if (r16 >= (((long) r2) * 1000)) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05f9, code lost:
        if (r19.callResult == 5) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06f6, code lost:
        if (com.whatsapp.voipcalling.Voip.A08(r3) != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0713, code lost:
        r0.A0k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0716, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0735, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0738, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x08a6, code lost:
        if (r3 == 9) goto L_0x08a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x08f3, code lost:
        if (r3 != 8) goto L_0x08f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x08f5, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x096e, code lost:
        r4.A0F.removeMessages(7);
        r4.A0F.removeMessages(8);
        r1 = r4.A0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x097d, code lost:
        if (r1 == null) goto L_0x098a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0983, code lost:
        if (r1.A0c() == false) goto L_0x098a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0985, code lost:
        r1.A1D();
        r4.A0e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x098a, code lost:
        r4.A0e = com.whatsapp.voipcalling.VoipActivityV2.NonActivityDismissDialogFragment.A01(r5, true);
        r4.A0F.sendEmptyMessage(8);
        r4.A0F.sendEmptyMessageDelayed(7, 6000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x099c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x09d0, code lost:
        r1.execute(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x09d3, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0b51, code lost:
        r1 = com.whatsapp.voipcalling.Voip.getCallInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0b55, code lost:
        if (r1 == null) goto L_0x1163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0b57, code lost:
        r0 = r0.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0b59, code lost:
        if (r0 == null) goto L_0x1163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0b5b, code lost:
        r0.A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0b5e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019d, code lost:
        if (r19.isJoinableGroupCall == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x0c49, code lost:
        X.AnonymousClass00B.A0B(r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x0c4c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:0x0f0e, code lost:
        if (r1 != null) goto L_0x0ec3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:864:0x10c7, code lost:
        r0 = r0.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:873:0x10e9, code lost:
        if (r0 != null) goto L_0x10eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:874:0x10eb, code lost:
        r0.A07((com.whatsapp.voipcalling.CallInfo) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:875:0x10ee, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:898:0x1163, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0207, code lost:
        if (r12.A03((X.C15830rv) r9) == false) goto L_0x0209;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0600 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x06ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x06cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x08af  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x08d6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:705:0x0ce4  */
    /* JADX WARNING: Removed duplicated region for block: B:708:0x0cea  */
    /* JADX WARNING: Removed duplicated region for block: B:801:0x0f0c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean A07(android.os.Message r26, X.C447225g r27) {
        /*
            r10 = r26
            int r6 = r10.what
            java.lang.String r5 = "participant_jids"
            r4 = 3
            r2 = 0
            r15 = 0
            r9 = 2
            r1 = 0
            r8 = 1
            r0 = r27
            boolean r1 = com.obwhatsapp.yo.yo.callControl(r10, r0)
            if (r1 != 0) goto L_0x0016
            return r1
        L_0x0016:
            r1 = 0
            switch(r6) {
                case 1: goto L_0x0035;
                case 2: goto L_0x001a;
                case 3: goto L_0x004e;
                case 4: goto L_0x0057;
                case 5: goto L_0x06d3;
                case 6: goto L_0x06e0;
                case 7: goto L_0x06f9;
                case 8: goto L_0x0717;
                case 9: goto L_0x072b;
                case 10: goto L_0x0739;
                case 11: goto L_0x07a8;
                case 12: goto L_0x07a8;
                case 13: goto L_0x0723;
                case 14: goto L_0x06ee;
                case 15: goto L_0x10ca;
                case 16: goto L_0x001a;
                case 17: goto L_0x08fc;
                case 18: goto L_0x0949;
                case 19: goto L_0x0905;
                case 20: goto L_0x001a;
                case 21: goto L_0x001a;
                case 22: goto L_0x001a;
                case 23: goto L_0x09b7;
                case 24: goto L_0x099d;
                case 25: goto L_0x09d4;
                case 26: goto L_0x0a14;
                case 27: goto L_0x0a24;
                case 28: goto L_0x0a7d;
                case 29: goto L_0x001b;
                case 30: goto L_0x0ab6;
                case 31: goto L_0x0aee;
                case 32: goto L_0x0b1f;
                case 33: goto L_0x0a97;
                case 34: goto L_0x0c34;
                case 35: goto L_0x0b61;
                case 36: goto L_0x0b82;
                case 37: goto L_0x0d1a;
                case 38: goto L_0x0d2b;
                case 39: goto L_0x0d53;
                case 40: goto L_0x0b51;
                case 41: goto L_0x0de1;
                case 42: goto L_0x0e59;
                case 43: goto L_0x0f11;
                case 44: goto L_0x0f89;
                case 45: goto L_0x0f99;
                case 46: goto L_0x0fa7;
                case 47: goto L_0x1038;
                case 48: goto L_0x10ef;
                case 49: goto L_0x111f;
                case 50: goto L_0x1136;
                case 51: goto L_0x1146;
                default: goto L_0x001a;
            }
        L_0x001a:
            return r1
        L_0x001b:
            java.lang.String r1 = "voip/commonHandler/HANDLER_WHAT_OFFLINE_COMPLETE"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            long r4 = r0.A0D
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x1163
            android.os.Handler r1 = r0.A0L
            boolean r1 = r1.hasMessages(r8)
            if (r1 == 0) goto L_0x1163
            android.os.Handler r1 = r0.A0L
            r1.removeMessages(r8)
            goto L_0x0046
        L_0x0035:
            long r4 = r0.A0D
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0046
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.A0u = r1
        L_0x0046:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0.A0l(r1)
            return r8
        L_0x004e:
            X.4RX r1 = r0.A1w
            double r1 = r1.A00()
            r0.A01 = r1
            return r8
        L_0x0057:
            X.0yL r4 = r0.A2E
            r27 = r4
            r5 = 7
            r4 = r27
            r4.A03(r5, r15)
            com.whatsapp.voipcalling.CallState[] r5 = com.whatsapp.voipcalling.CallState.values()
            int r4 = r10.arg1
            r7 = r5[r4]
            java.lang.Object r4 = r10.obj
            r19 = r4
            r4 = r19
            com.whatsapp.voipcalling.CallInfo r4 = (com.whatsapp.voipcalling.CallInfo) r4
            r19 = r4
            X.AnonymousClass00B.A01()
            if (r4 == 0) goto L_0x1163
            com.whatsapp.voipcalling.CallState r4 = r4.callState
            if (r7 == r4) goto L_0x1163
            r4 = r19
            java.lang.String r4 = r4.callId
            boolean r18 = r0.A12(r4)
            r4 = r19
            com.whatsapp.voipcalling.CallState r6 = r4.callState
            java.lang.String r4 = "voip/callStateChangedOnUIThread from "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r7)
            java.lang.String r4 = " to "
            r5.append(r4)
            r5.append(r6)
            java.lang.String r4 = " in UI Main thread. selfManagedConnection = "
            r5.append(r4)
            r4 = r18
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            com.whatsapp.voipcalling.CallState r11 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            r12 = 4
            r10 = 0
            if (r6 != r11) goto L_0x04f9
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r7 == r4) goto L_0x04f9
            boolean r4 = r0.A1U
            if (r4 != 0) goto L_0x04cb
            int r5 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r5 < r4) goto L_0x0501
            X.14x r4 = r0.A1v
            boolean r4 = r4.A0D()
            if (r4 == 0) goto L_0x0501
            long r4 = android.os.SystemClock.elapsedRealtime()
            r0.A0D = r4
            java.util.List r5 = r19.getPeerJids()
            r4 = r19
            boolean r13 = r4.videoEnabled
            java.lang.String r14 = r4.callId
            com.whatsapp.jid.GroupJid r4 = r4.groupJid
            boolean r4 = r0.A10(r4, r14, r5, r13)
            if (r4 == 0) goto L_0x04b5
            r4 = 2000(0x7d0, double:9.88E-321)
        L_0x00e2:
            r0.A0Y(r4)
        L_0x00e5:
            if (r7 != r11) goto L_0x00f4
            boolean r9 = r0.A18
            X.1An r5 = r0.A1q
            r4 = r19
            java.lang.String r4 = r4.callId
            if (r9 == 0) goto L_0x04b0
            r5.A03(r4, r12)
        L_0x00f4:
            if (r6 == r11) goto L_0x00ff
            boolean r4 = r19.isPeerRequestingUpgrade()
            if (r4 != 0) goto L_0x00ff
            r0.A0K()
        L_0x00ff:
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.CALLING
            if (r6 != r4) goto L_0x04a3
            X.26Z r5 = r0.A1k
            r4 = r19
            r5.A04(r4)
        L_0x010a:
            X.1ZF r5 = r0.A0a
            if (r5 == 0) goto L_0x0118
            r4 = r5
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            boolean r10 = r4.A1v
            r4 = r19
            r5.callStateChanged(r7, r4)
        L_0x0118:
            X.26b r5 = r0.A0T
            if (r5 == 0) goto L_0x0121
            r4 = r19
            r5.A07(r4)
        L_0x0121:
            r4 = r19
            java.lang.String r4 = r4.callId
            X.1po r4 = r0.A0D(r4)
            if (r4 != 0) goto L_0x018b
            com.whatsapp.jid.UserJid r4 = r19.getInitialPeerJid()
            X.AnonymousClass00B.A06(r4)
            java.lang.String r4 = "VoiceService:callStateChangedOnUiThread getCallLog with key[jid="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            com.whatsapp.jid.UserJid r4 = r19.getInitialPeerJid()
            r5.append(r4)
            java.lang.String r4 = "; fromMe="
            r5.append(r4)
            r4 = r19
            boolean r4 = r4.isCaller
            r5.append(r4)
            java.lang.String r4 = "; callId="
            r5.append(r4)
            r4 = r19
            java.lang.String r4 = r4.callId
            r5.append(r4)
            java.lang.String r4 = "; transactionId="
            r5.append(r4)
            r4 = r19
            int r4 = r4.initialGroupTransactionId
            r5.append(r4)
            java.lang.String r4 = "]"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            com.whatsapp.jid.UserJid r9 = r19.getInitialPeerJid()
            r4 = r19
            boolean r11 = r4.isCaller
            java.lang.String r5 = r4.callId
            int r13 = r4.initialGroupTransactionId
            X.1D0 r12 = r0.A2L
            java.lang.String r5 = X.C30341cC.A0B(r5)
            X.1lE r4 = new X.1lE
            r4.<init>(r13, r9, r5, r11)
            X.1po r4 = r12.A03(r4)
        L_0x018b:
            com.whatsapp.voipcalling.CallState r5 = com.whatsapp.voipcalling.CallState.NONE
            java.lang.String r25 = "can not find message for call id "
            if (r6 != r5) goto L_0x0600
            r11 = -1
            if (r4 == 0) goto L_0x04a0
            X.1r0 r5 = r4.A06
            if (r5 != 0) goto L_0x019f
            r5 = r19
            boolean r5 = r5.isJoinableGroupCall
            r9 = 0
            if (r5 != 0) goto L_0x01a0
        L_0x019f:
            r9 = 1
        L_0x01a0:
            java.lang.String r5 = "Non-joinable call log shouldn't be set to joinable when call is ending"
            X.AnonymousClass00B.A0B(r5, r9)
            r5 = r19
            boolean r5 = r5.isJoinableGroupCall
            if (r5 == 0) goto L_0x01af
            com.whatsapp.voipcalling.CallState r5 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r7 != r5) goto L_0x01b7
        L_0x01af:
            r0.A0q(r4, r1)
            X.1D0 r5 = r0.A2L
            r5.A08(r4)
        L_0x01b7:
            int r5 = r4.A01
        L_0x01b9:
            r0.A1J = r1
            com.whatsapp.fieldstats.events.WamCall r9 = r0.A0d
            if (r9 == 0) goto L_0x048e
            com.whatsapp.jid.UserJid r24 = r19.getInitialPeerJid()
            X.AnonymousClass00B.A06(r24)
            r9 = r19
            boolean r9 = r9.isCaller
            r23 = 0
            if (r9 != 0) goto L_0x0209
            com.whatsapp.voipcalling.CallState r9 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r7 != r9) goto L_0x0209
            if (r10 == 0) goto L_0x0209
            if (r4 == 0) goto L_0x0209
            r9 = r19
            X.1fV r9 = r9.callWaitingInfo
            int r9 = r9.A01
            if (r9 != 0) goto L_0x0209
            int r9 = r0.A06
            if (r5 > r9) goto L_0x0209
            X.0sG r12 = r0.A27
            r9 = r24
            X.0sH r13 = r12.A08(r9)
            if (r13 == 0) goto L_0x0209
            X.1ko r9 = r13.A0D
            if (r9 != 0) goto L_0x0209
            boolean r9 = r0.A1I
            if (r9 != 0) goto L_0x0209
            X.14s r12 = r0.A2b
            java.lang.Class<X.0rv> r9 = X.C15830rv.class
            com.whatsapp.jid.Jid r9 = r13.A08(r9)
            X.AnonymousClass00B.A06(r9)
            X.0rv r9 = (X.C15830rv) r9
            boolean r9 = r12.A03(r9)
            r22 = 1
            if (r9 != 0) goto L_0x020b
        L_0x0209:
            r22 = 0
        L_0x020b:
            java.lang.String r21 = " "
            r9 = r19
            X.1fV r9 = r9.callWaitingInfo
            int r12 = r9.A01
            r20 = 0
            com.whatsapp.voipcalling.CallState r9 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r7 != r9) goto L_0x0430
            if (r12 != 0) goto L_0x0430
            if (r10 == 0) goto L_0x0430
            java.lang.Boolean r9 = r0.A2r
            if (r9 == 0) goto L_0x0430
            java.lang.Boolean r9 = r0.A2r
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0430
            X.0t3 r9 = r0.A2D
            long r14 = r9.A00()
            X.1OL r9 = r0.A1j
            android.content.SharedPreferences r12 = r9.A01()
            java.lang.String r9 = "last_app_update_dialog_timestamp"
            long r12 = r12.getLong(r9, r2)
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x0247
            long r14 = r14 - r12
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x0430
        L_0x0247:
            r20 = 1
        L_0x0249:
            r12 = 0
        L_0x024a:
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r7 == r2) goto L_0x0252
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r7 != r2) goto L_0x0282
        L_0x0252:
            double r9 = r0.A01
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L_0x0282
            double r2 = r0.A00
            boolean r11 = java.lang.Double.isNaN(r2)
            if (r11 != 0) goto L_0x0282
            com.whatsapp.fieldstats.events.WamCall r11 = r0.A0d
            double r2 = r2 - r9
            java.lang.Double r9 = java.lang.Double.valueOf(r2)
            r11.callBatteryChangePct = r9
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r0.A01 = r2
            r0.A00 = r2
            java.lang.String r3 = "VoiceService callStateChangedOnUIThread to NONE setting battery fieldstat: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x0282:
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            if (r22 == 0) goto L_0x039f
            r2 = -1
            if (r5 == r2) goto L_0x039b
            long r2 = (long) r5
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r10
        L_0x028d:
            X.1fU r5 = r19.getDefaultPeerInfo()
            if (r5 == 0) goto L_0x0389
            X.1fU r5 = r19.getDefaultPeerInfo()
            boolean r5 = r5.A0A
            if (r5 == 0) goto L_0x0389
            java.lang.String r10 = "peer-interrupted"
        L_0x029d:
            android.content.Context r5 = r0.A1X
            r16 = r5
            r5 = r19
            java.lang.String r12 = r5.callId
            boolean r13 = r5.isEndedByMe
            boolean r14 = r5.videoEnabled
            boolean r5 = r5.isGroupCallCreatedOnServer
            if (r5 == 0) goto L_0x02b1
            com.whatsapp.jid.UserJid r23 = r19.getCreatorJid()
        L_0x02b1:
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            java.lang.String r15 = r16.getPackageName()
            java.lang.String r5 = "com.obwhatsapp.calling.spam.CallSpamActivity"
            r11.setClassName(r15, r5)
            java.lang.String r15 = r24.getRawString()
            java.lang.String r5 = "caller_jid"
            r11.putExtra(r5, r15)
            java.lang.String r5 = "call_id"
            r11.putExtra(r5, r12)
            java.lang.String r5 = "call_duration"
            r11.putExtra(r5, r2)
            java.lang.String r5 = "call_terminator"
            r11.putExtra(r5, r13)
            java.lang.String r5 = "call_termination_reason"
            r11.putExtra(r5, r10)
            java.lang.String r5 = "call_video"
            r11.putExtra(r5, r14)
            if (r23 == 0) goto L_0x02ec
            java.lang.String r10 = r23.getRawString()
            java.lang.String r5 = "call_creator_jid"
            r11.putExtra(r5, r10)
        L_0x02ec:
            r11.setFlags(r9)
            java.lang.String r5 = "voiceservice starting call spam activity "
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r5)
            r5 = r24
            r9.append(r5)
            r5 = r21
            r9.append(r5)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r2 = r16
            r2.startActivity(r11)
        L_0x0310:
            r5 = 1
        L_0x0311:
            java.util.Map r3 = r0.A2i
            r2 = r19
            java.lang.String r2 = r2.callId
            r3.remove(r2)
            X.15I r3 = r0.A2A
            com.whatsapp.fieldstats.events.WamCall r2 = r0.A0d
            java.lang.Integer r2 = r2.callResult
            r3.A0B(r4, r2)
            if (r5 == 0) goto L_0x0350
            java.lang.String r2 = "callStateChangedOnUIThread to NONE. callOfferElapsedTimeInMillisOnServer: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            com.whatsapp.fieldstats.events.WamCall r2 = r0.A0d
            java.lang.Long r2 = r2.callOfferElapsedT
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0w0 r5 = r0.A1x
            com.whatsapp.fieldstats.events.WamCall r3 = r0.A0d
            boolean r2 = r0.A1T
            r5.A02(r3, r2)
            java.lang.String r2 = r0.A2t
            if (r2 == 0) goto L_0x0350
            X.1OK r5 = r0.A21
            java.lang.String r3 = r0.A2t
            com.whatsapp.fieldstats.events.WamCall r2 = r0.A0d
            r5.A02(r2, r3)
        L_0x0350:
            boolean r5 = r0.A1Q
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.LINK
            if (r7 == r2) goto L_0x037d
            r2 = r19
            r0.A0r(r7, r2)
        L_0x035b:
            if (r4 == 0) goto L_0x0641
            X.15A r2 = r0.A2d
            java.lang.String r1 = "voip/notifyCallEnded"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Iterable r1 = r2.A01()
            java.util.Iterator r2 = r1.iterator()
        L_0x036d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x05de
            java.lang.Object r1 = r2.next()
            X.0y9 r1 = (X.C19270y9) r1
            r1.A02(r4)
            goto L_0x036d
        L_0x037d:
            r3 = r5 ^ 1
            java.lang.String r2 = "web relay calls should not start fg activity"
            X.AnonymousClass00B.A0B(r2, r3)
            r0.A0M()
            goto L_0x035b
        L_0x0389:
            r5 = r19
            X.1fU r5 = r5.self
            boolean r5 = r5.A0A
            if (r5 == 0) goto L_0x0396
            java.lang.String r10 = "self-interrupted"
            goto L_0x029d
        L_0x0396:
            java.lang.String r10 = "unknown"
            goto L_0x029d
        L_0x039b:
            r2 = -1
            goto L_0x028d
        L_0x039f:
            if (r12 == 0) goto L_0x03fd
            android.content.Context r11 = r0.A1X
            com.whatsapp.fieldstats.events.WamCall r2 = r0.A0d
            android.os.Bundle r13 = X.C18010w0.A00(r2)
            boolean r12 = r0.A1T
            java.lang.String r10 = r0.A2t
            X.0pd r5 = r0.A2O
            r3 = 2361(0x939, float:3.308E-42)
            X.0tM r2 = X.C16620tM.A02
            int r2 = r5.A03(r2, r3)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r3 = r11.getPackageName()
            if (r2 != 0) goto L_0x03fa
            java.lang.String r2 = "com.obwhatsapp.calling.callrating.CallRatingActivity"
        L_0x03c4:
            r5.setClassName(r3, r2)
            java.lang.String r2 = "event"
            r5.putExtra(r2, r13)
            java.lang.String r2 = "uploadFieldStat"
            r5.putExtra(r2, r12)
            java.lang.String r2 = "timeSeriesDir"
            r5.putExtra(r2, r10)
            r5.setFlags(r9)
            r11.startActivity(r5)
            X.1OL r5 = r0.A1j
            X.0t3 r2 = r0.A2D
            long r2 = r2.A00()
            android.content.SharedPreferences r5 = r5.A01()
            android.content.SharedPreferences$Editor r9 = r5.edit()
            java.lang.String r5 = "last_call_rating_timestamp"
            android.content.SharedPreferences$Editor r2 = r9.putLong(r5, r2)
            r2.apply()
            r5 = 0
            goto L_0x0311
        L_0x03fa:
            java.lang.String r2 = "com.obwhatsapp.calling.callrating.CallRatingActivityV2"
            goto L_0x03c4
        L_0x03fd:
            if (r20 == 0) goto L_0x0310
            android.content.Context r10 = r0.A1X
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r3 = r10.getPackageName()
            java.lang.String r2 = "com.obwhatsapp.calling.VoipAppUpdateActivity"
            r5.setClassName(r3, r2)
            r5.setFlags(r9)
            r10.startActivity(r5)
            X.1OL r5 = r0.A1j
            X.0t3 r2 = r0.A2D
            long r2 = r2.A00()
            android.content.SharedPreferences r5 = r5.A01()
            android.content.SharedPreferences$Editor r9 = r5.edit()
            java.lang.String r5 = "last_app_update_dialog_timestamp"
            android.content.SharedPreferences$Editor r2 = r9.putLong(r5, r2)
            r2.apply()
            goto L_0x0310
        L_0x0430:
            boolean r9 = r0.A1L
            if (r9 != 0) goto L_0x0249
            r9 = r19
            X.1fV r9 = r9.callWaitingInfo
            int r13 = r9.A01
            java.lang.Integer r12 = r0.A2s
            com.whatsapp.voipcalling.CallState r9 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r7 != r9) goto L_0x0249
            if (r13 != 0) goto L_0x0249
            if (r10 == 0) goto L_0x0249
            if (r12 == 0) goto L_0x0249
            int r12 = r12.intValue()
            if (r12 == r11) goto L_0x0249
            X.0t3 r9 = r0.A2D
            long r16 = r9.A00()
            X.1OL r9 = r0.A1j
            android.content.SharedPreferences r10 = r9.A01()
            java.lang.String r9 = "last_call_rating_timestamp"
            long r9 = r10.getLong(r9, r2)
            int r2 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x048b
            long r16 = r16 - r9
            long r2 = (long) r12
            r14 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r14
            int r9 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x048b
            X.0pd r13 = r0.A2O
            r2 = 2361(0x939, float:3.308E-42)
            X.0tM r12 = X.C16620tM.A02
            int r2 = r13.A03(r12, r2)
            long r2 = (long) r2
            r10 = 1
            int r9 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0249
            r2 = 2553(0x9f9, float:3.578E-42)
            int r2 = r13.A03(r12, r2)
            if (r2 <= 0) goto L_0x0249
            long r2 = (long) r2
            long r2 = r2 * r14
            int r9 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r9 < 0) goto L_0x0249
        L_0x048b:
            r12 = 1
            goto L_0x024a
        L_0x048e:
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r7 == r2) goto L_0x0350
            r2 = r19
            int r3 = r2.callResult
            r2 = 7
            if (r3 == r2) goto L_0x0350
            java.lang.String r2 = "callFieldStat can not be null when call state changed to NONE."
            X.AnonymousClass00B.A08(r2)
            goto L_0x0350
        L_0x04a0:
            r5 = -1
            goto L_0x01b9
        L_0x04a3:
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.NONE
            if (r6 == r4) goto L_0x010a
            X.26Z r5 = r0.A1k
            r4 = r19
            r5.A06(r4, r15)
            goto L_0x010a
        L_0x04b0:
            r5.A00(r4)
            goto L_0x00f4
        L_0x04b5:
            r0.A0D = r2
            android.telephony.TelephonyManager r5 = r0.A1Y
            X.0sj r4 = r0.A2F
            int r4 = X.C30341cC.A01(r5, r4)
            if (r4 == 0) goto L_0x0518
            r1 = r19
            java.lang.String r2 = r1.callId
            java.lang.String r1 = "busy"
            r0.A0w(r2, r1, r12)
            return r8
        L_0x04cb:
            r0.A1U = r1
            com.whatsapp.jid.UserJid r22 = r19.getPeerJid()
            X.AnonymousClass00B.A06(r22)
            r4 = r19
            boolean r14 = r4.videoEnabled
            java.lang.String r13 = r4.callId
            boolean r5 = r4.isGroupCall
            com.whatsapp.jid.GroupJid r4 = r4.groupJid
            r24 = 0
            r20 = r0
            r21 = r4
            r23 = r13
            r25 = r14
            r26 = r5
            r20.A0e(r21, r22, r23, r24, r25, r26)
            r4 = r19
            r0.A0m(r4, r9, r1)
            X.26Z r5 = r0.A1k
            r5.A04(r4)
            goto L_0x00e5
        L_0x04f9:
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r6 != r4) goto L_0x050f
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.NONE
            if (r7 != r4) goto L_0x050f
        L_0x0501:
            r0.A0D = r2
            boolean r4 = r0.A18
            if (r4 == 0) goto L_0x050b
            r4 = 500(0x1f4, double:2.47E-321)
            goto L_0x00e2
        L_0x050b:
            r4 = 0
            goto L_0x00e2
        L_0x050f:
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r6 != r4) goto L_0x052b
            boolean r4 = r0.A1N
            if (r4 != 0) goto L_0x052b
            goto L_0x0521
        L_0x0518:
            boolean r4 = r0.A18
            if (r4 == 0) goto L_0x0528
            r4 = 500(0x1f4, double:2.47E-321)
        L_0x051e:
            r0.A0Y(r4)
        L_0x0521:
            r4 = r19
            r0.A0m(r4, r9, r1)
            goto L_0x00e5
        L_0x0528:
            r4 = 0
            goto L_0x051e
        L_0x052b:
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.NONE
            if (r6 != r4) goto L_0x0536
            android.os.Handler r4 = r0.A0L
            r4.removeMessages(r8)
            goto L_0x00e5
        L_0x0536:
            com.whatsapp.voipcalling.CallState r5 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 == r5) goto L_0x053e
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r6 != r4) goto L_0x00e5
        L_0x053e:
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r7 != r4) goto L_0x0549
            X.26Z r9 = r0.A1k
            r4 = r19
            r9.A04(r4)
        L_0x0549:
            X.0wb r13 = r0.A1u
            java.lang.String r9 = "refresh_notification"
            X.10g r4 = new X.10g
            r4.<init>(r9)
            r13.A00(r4)
            boolean r4 = r0.A1H
            if (r4 == 0) goto L_0x057b
            if (r6 != r5) goto L_0x055f
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r7 != r4) goto L_0x0563
        L_0x055f:
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.LINK
            if (r7 != r4) goto L_0x057b
        L_0x0563:
            X.1ZF r13 = r0.A0a
            if (r13 == 0) goto L_0x057b
            com.whatsapp.voipcalling.VoipActivityV2 r13 = (com.whatsapp.voipcalling.VoipActivityV2) r13
            com.obwhatsapp.calling.views.AppSettingsWarningDialogFragment r9 = r13.A1B
            if (r9 != 0) goto L_0x0574
            com.obwhatsapp.calling.views.AppSettingsWarningDialogFragment r9 = new com.obwhatsapp.calling.views.AppSettingsWarningDialogFragment
            r9.<init>()
            r13.A1B = r9
        L_0x0574:
            boolean r4 = r13.A1u
            if (r4 != 0) goto L_0x057b
            r13.Afc(r9)
        L_0x057b:
            int r13 = r0.A08
            r4 = -128(0xffffffffffffff80, float:NaN)
            if (r13 < r4) goto L_0x05a4
            r4 = 256(0x100, float:3.59E-43)
            if (r13 > r4) goto L_0x05a4
            if (r13 == 0) goto L_0x05a4
            java.lang.String r9 = "voip/voipAudioLevelBase "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r9)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            short r9 = r0.A15
            int r4 = r0.A08
            int r9 = r9 + r4
            short r4 = (short) r9
            r0.A15 = r4
            com.whatsapp.voipcalling.Voip.adjustAudioLevel(r4)
        L_0x05a4:
            if (r18 == 0) goto L_0x05c1
            int r9 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r9 < r4) goto L_0x05c1
            X.14x r9 = r0.A1v
            r4 = r19
            java.lang.String r4 = r4.callId
            X.3M9 r9 = r9.A03(r4)
            if (r9 == 0) goto L_0x05c1
            int r4 = r9.getConnectionCapabilities()
            r4 = r4 | 1
            r9.setConnectionCapabilities(r4)
        L_0x05c1:
            if (r6 != r5) goto L_0x00e5
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r7 != r4) goto L_0x00e5
            X.0pd r5 = r0.A2O
            X.0sK r4 = r0.A1d
            boolean r4 = X.C32601gl.A04(r4, r5)
            if (r4 == 0) goto L_0x00e5
            r4 = r19
            java.lang.String r9 = r4.callId
            r5 = 51
            r4 = r27
            r4.A03(r5, r9)
            goto L_0x00e5
        L_0x05de:
            boolean r1 = r4.A0B()
            if (r1 == 0) goto L_0x0659
            r1 = r19
            boolean r1 = r1.isJoinableGroupCall
            if (r1 != 0) goto L_0x0659
            r1 = r19
            com.whatsapp.jid.GroupJid r1 = r1.groupJid
            r0.A0f(r1, r4)
            if (r5 == 0) goto L_0x05fb
            r1 = r19
            int r3 = r1.callResult
            r2 = 5
            r1 = 1
            if (r3 != r2) goto L_0x05fc
        L_0x05fb:
            r1 = 0
        L_0x05fc:
            r0.A0p(r4, r1)
            goto L_0x0659
        L_0x0600:
            if (r7 == r5) goto L_0x0606
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.LINK
            if (r7 != r2) goto L_0x069e
        L_0x0606:
            if (r4 == 0) goto L_0x0628
            X.15A r2 = r0.A2d
            java.lang.String r1 = "voip/notifyCallStarted"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Iterable r1 = r2.A01()
            java.util.Iterator r2 = r1.iterator()
        L_0x0618:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x069e
            java.lang.Object r1 = r2.next()
            X.0y9 r1 = (X.C19270y9) r1
            r1.A03(r4)
            goto L_0x0618
        L_0x0628:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = r25
            r3.append(r2)
            r2 = r19
            java.lang.String r2 = r2.callId
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            X.AnonymousClass00B.A0B(r2, r1)
            goto L_0x069e
        L_0x0641:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = r25
            r3.append(r2)
            r2 = r19
            java.lang.String r2 = r2.callId
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            X.AnonymousClass00B.A0B(r2, r1)
        L_0x0659:
            r1 = r19
            X.1fV r1 = r1.callWaitingInfo
            int r2 = r1.A01
            r1 = 1
            if (r2 == r8) goto L_0x0663
            r1 = 0
        L_0x0663:
            r0.A1U = r1
            r1 = r19
            boolean r1 = r1.isJoinableGroupCall
            if (r1 == 0) goto L_0x069e
            r1 = r19
            boolean r1 = r1.isCaller
            if (r1 != 0) goto L_0x069e
            r1 = r19
            int r2 = r1.callResult
            r1 = 4
            if (r2 != r1) goto L_0x069e
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r7 == r1) goto L_0x069e
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r7 == r1) goto L_0x069e
            r1 = r19
            java.lang.String r4 = r1.callId
            X.1SK r9 = r0.A1p
            android.content.Context r10 = r0.A1X
            boolean r3 = r0.A1N
            r2 = -1
            X.2dA r11 = X.C52122dA.A00(r1, r2, r3)
            X.0wb r12 = r0.A1u
            r13 = 2
            r14 = 0
            android.app.Notification r3 = r9.A00(r10, r11, r12, r13, r14)
            r2 = 27
            r1 = r27
            r1.A04(r3, r4, r2, r8)
        L_0x069e:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r2 < r1) goto L_0x1163
            if (r18 == 0) goto L_0x1163
            X.14x r1 = r0.A1v
            r0 = r19
            java.lang.String r0 = r0.callId
            X.3M9 r2 = r1.A03(r0)
            if (r2 == 0) goto L_0x1163
            int r1 = r6.ordinal()
            r0 = 1
            switch(r1) {
                case 0: goto L_0x06bb;
                case 1: goto L_0x06cc;
                case 2: goto L_0x06ba;
                case 3: goto L_0x06c4;
                case 4: goto L_0x06ba;
                case 5: goto L_0x06ba;
                case 6: goto L_0x06c8;
                case 7: goto L_0x06bb;
                case 8: goto L_0x06ba;
                case 9: goto L_0x06ba;
                case 10: goto L_0x06ba;
                case 11: goto L_0x06c8;
                default: goto L_0x06ba;
            }
        L_0x06ba:
            return r8
        L_0x06bb:
            int r0 = A00(r19)
            r2.A01(r0)
            r0 = 0
            goto L_0x06cf
        L_0x06c4:
            r2.setRinging()
            return r8
        L_0x06c8:
            r2.setActive()
            goto L_0x06cf
        L_0x06cc:
            r2.setDialing()
        L_0x06cf:
            r2.setAudioModeIsVoip(r0)
            return r8
        L_0x06d3:
            java.lang.Object r3 = r10.obj
            X.1po r3 = (X.C37831po) r3
            int r2 = r10.arg1
            if (r2 <= 0) goto L_0x06dc
            r1 = 1
        L_0x06dc:
            r0.A0p(r3, r1)
            return r8
        L_0x06e0:
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            int r3 = r10.arg2
            r2 = 0
            if (r3 <= 0) goto L_0x06ea
            r2 = 1
        L_0x06ea:
            r0.A0o(r4, r2, r1)
            return r8
        L_0x06ee:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r1 = com.whatsapp.voipcalling.Voip.A08(r3)
            if (r1 == 0) goto L_0x1163
            goto L_0x0713
        L_0x06f9:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x1163
            com.whatsapp.voipcalling.CallState r2 = r3.callState
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            if (r2 == r1) goto L_0x1163
            X.1ZF r1 = r0.A0a
            if (r1 == 0) goto L_0x070c
            r1.Ahj(r3)
        L_0x070c:
            X.26b r1 = r0.A0T
            if (r1 == 0) goto L_0x0713
            r1.A07(r3)
        L_0x0713:
            r0.A0k(r3)
            return r8
        L_0x0717:
            X.1ZF r1 = r0.A0a
            if (r1 == 0) goto L_0x1163
            java.lang.Object r0 = r10.obj
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r1.videoRenderStarted(r0)
            return r8
        L_0x0723:
            X.1ZF r0 = r0.A0a
            if (r0 == 0) goto L_0x1163
            java.lang.String r0 = "voip/VoipActivityV2/videoCaptureStarted."
            goto L_0x0735
        L_0x072b:
            X.1ZF r0 = r0.A0a
            if (r0 == 0) goto L_0x1163
            X.AnonymousClass00B.A01()
            java.lang.String r0 = "voip/VoipActivityV2/videoPreviewReady."
        L_0x0735:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r8
        L_0x0739:
            java.lang.Object r3 = r10.obj
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.1ZF r2 = r0.A0a
            if (r2 == 0) goto L_0x075b
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            X.AnonymousClass00B.A01()
            com.whatsapp.voipcalling.CallInfo r4 = r2.A3B()
            boolean r1 = com.whatsapp.voipcalling.VoipActivityV2.A0u(r4)
            if (r1 == 0) goto L_0x075b
            X.39w r2 = r2.A3A(r3)
            X.1fU r1 = r4.getInfoByJid(r3)
            r2.A07(r1)
        L_0x075b:
            X.26b r0 = r0.A0T
            if (r0 == 0) goto L_0x1163
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r4 = r0.iterator()
        L_0x0767:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1163
            java.lang.Object r2 = r4.next()
            X.2Tu r2 = (X.C49562Tu) r2
            boolean r0 = r2 instanceof com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x0767
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = (com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel) r2
            X.26b r0 = r2.A0D
            X.3AY r0 = r0.A04()
            X.0vs r0 = r0.A01
            java.lang.Object r1 = r0.get(r3)
            X.1fU r1 = (X.C32001fU) r1
            if (r1 == 0) goto L_0x0767
            com.whatsapp.jid.UserJid r0 = r2.A02
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x07a4
            r2.A0C(r1)
        L_0x0794:
            X.027 r0 = r2.A08
            java.lang.Object r0 = r0.A01()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0767
            r2.A0B(r1)
            goto L_0x0767
        L_0x07a4:
            r2.A0D(r1)
            goto L_0x0794
        L_0x07a8:
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            int r11 = r10.what
            int r3 = r10.arg1
            X.AnonymousClass00B.A01()
            if (r5 == 0) goto L_0x1163
            com.whatsapp.voipcalling.CallState r6 = r5.callState
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.NONE
            if (r6 == r2) goto L_0x1163
            r6 = 6
            r10 = 11
            if (r11 != r10) goto L_0x07de
            if (r3 != r6) goto L_0x07de
            X.01V r2 = r0.A2C
            android.media.AudioManager r7 = r2.A0G()
            if (r7 == 0) goto L_0x07de
            java.lang.Boolean r2 = r0.A0g
            if (r2 == 0) goto L_0x07d4
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x07de
        L_0x07d4:
            boolean r2 = r0.A0z(r7)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.A0g = r2
        L_0x07de:
            r2 = 7
            r7 = 5
            if (r3 == r2) goto L_0x089c
            if (r3 == r7) goto L_0x089c
            r2 = 9
            if (r3 == r2) goto L_0x089c
            r2 = 8
            if (r3 == r2) goto L_0x089c
            boolean r2 = r5.isEitherSideRequestingUpgrade()
            if (r2 == 0) goto L_0x07f6
            boolean r2 = r0.A1A
            if (r2 != 0) goto L_0x0814
        L_0x07f6:
            boolean r2 = r5.isEitherSideRequestingUpgrade()
            if (r2 == 0) goto L_0x0801
            r0.A1S = r1
            r0.A0k(r5)
        L_0x0801:
            X.1ZF r1 = r0.A0a
            if (r1 == 0) goto L_0x0808
            r1.Ahj(r5)
        L_0x0808:
            X.26b r1 = r0.A0T
            if (r1 == 0) goto L_0x080f
            r1.A07(r5)
        L_0x080f:
            X.26Z r1 = r0.A1k
            r1.A06(r5, r15)
        L_0x0814:
            boolean r1 = r5.videoEnabled
            if (r1 == 0) goto L_0x0898
            boolean r1 = r5.isPeerRequestingUpgrade()
            if (r1 == 0) goto L_0x0898
            android.os.Handler r1 = r0.A0L
            r11 = 24
            r1.removeMessages(r11)
            android.os.Handler r10 = r0.A0L
            r1 = 30000(0x7530, double:1.4822E-319)
            r10.sendEmptyMessageDelayed(r11, r1)
            com.whatsapp.jid.UserJid r2 = r5.getPeerJid()
            X.AnonymousClass00B.A06(r2)
            long[] r1 = new long[r7]
            r1 = {0, 50, 100, 50, 1000} // fill-array
            r0.A0h(r2, r1, r8)
            X.1ZF r7 = r0.A0a
            if (r7 == 0) goto L_0x0846
            r1 = r7
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            boolean r1 = r1.A1y
            if (r1 != 0) goto L_0x0880
        L_0x0846:
            java.lang.String r2 = "voip/commonHandler/HANDLER_WHAT_PEER_VIDEO_STATE_CHANGED launch incoming request screen, voip activity is "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.whatsapp.jid.UserJid r1 = r5.getPeerJid()
            X.AnonymousClass00B.A06(r1)
            r2.add(r1)
            android.content.Context r13 = r0.A1X
            X.0tH r1 = r0.A1Z
            boolean r1 = r1.A00
            r1 = r1 ^ 1
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r16 = java.lang.Boolean.TRUE
            r17 = r15
            r18 = r2
            android.content.Intent r1 = X.C14750ph.A0b(r13, r14, r15, r16, r17, r18)
            r13.startActivity(r1)
        L_0x0880:
            r2 = 2
            if (r3 == r9) goto L_0x1163
            if (r3 == r6) goto L_0x1163
            if (r3 != r4) goto L_0x0894
            X.0yW r1 = r0.A2Z
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x0894
            boolean r1 = r5.isPeerRequestingUpgrade()
            if (r1 == 0) goto L_0x0894
            r2 = 1
        L_0x0894:
            r0.A0m(r5, r2, r8)
            return r8
        L_0x0898:
            r0.A0K()
            goto L_0x0880
        L_0x089c:
            boolean r2 = r0.A1A
            if (r2 != 0) goto L_0x08a2
            r0.A1S = r8
        L_0x08a2:
            if (r11 != r10) goto L_0x08e5
            r2 = 9
            if (r3 != r2) goto L_0x08f5
        L_0x08a8:
            r11 = 2131893020(0x7f121b1c, float:1.9420805E38)
        L_0x08ab:
            X.1ZF r10 = r0.A0a
            if (r10 == 0) goto L_0x08d2
            com.whatsapp.voipcalling.VoipActivityV2 r10 = (com.whatsapp.voipcalling.VoipActivityV2) r10
            if (r11 <= 0) goto L_0x08e1
            r10.A1r = r8
            X.39w r2 = r10.A18
            r2.A05()
            java.lang.String r2 = r10.getString(r11)
            r10.A3u(r2, r1)
            android.os.Handler r1 = r10.A0F
            r12 = 10
            r1.removeMessages(r12)
            android.os.Handler r10 = r10.A0F
            r1 = 3000(0xbb8, double:1.482E-320)
            r10.sendEmptyMessageDelayed(r12, r1)
        L_0x08cf:
            r0.A0k(r5)
        L_0x08d2:
            X.26b r10 = r0.A0T
            if (r10 == 0) goto L_0x0814
            if (r11 <= 0) goto L_0x08f7
            r1 = 3000(0xbb8, double:1.482E-320)
            android.os.Handler r10 = r10.A02
            r10.sendEmptyMessageDelayed(r4, r1)
            goto L_0x0814
        L_0x08e1:
            r10.Ahj(r5)
            goto L_0x08cf
        L_0x08e5:
            r2 = 7
            if (r3 == r2) goto L_0x08a8
            if (r3 != r7) goto L_0x08ee
            r11 = 2131893019(0x7f121b1b, float:1.9420803E38)
            goto L_0x08ab
        L_0x08ee:
            r2 = 8
            r11 = 2131893018(0x7f121b1a, float:1.94208E38)
            if (r3 == r2) goto L_0x08ab
        L_0x08f5:
            r11 = 0
            goto L_0x08ab
        L_0x08f7:
            r10.A07(r5)
            goto L_0x0814
        L_0x08fc:
            X.4RX r1 = r0.A1w
            double r1 = r1.A00()
            r0.A00 = r1
            return r8
        L_0x0905:
            X.1ZF r4 = r0.A0a
            if (r4 == 0) goto L_0x1163
            java.lang.Object r5 = r10.obj
            X.0rv r5 = (X.C15830rv) r5
            if (r5 == 0) goto L_0x1163
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            com.whatsapp.voipcalling.CallInfo r3 = r4.A3B()
            X.25g r0 = r4.A12
            if (r0 == 0) goto L_0x1163
            if (r3 == 0) goto L_0x1163
            com.whatsapp.voipcalling.CallState r2 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 != r0) goto L_0x1163
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x1163
            boolean r0 = r4.A1v
            if (r0 == 0) goto L_0x1163
            java.util.Map r0 = r3.participants
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x1163
            X.0sP r2 = r4.A1H
            X.0sG r0 = r4.A1E
            X.0sH r0 = r0.A0A(r5)
            java.lang.String r3 = r2.A08(r0)
            r2 = 2131886957(0x7f12036d, float:1.9408508E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r1] = r3
            java.lang.String r5 = r4.getString(r2, r0)
            goto L_0x096e
        L_0x0949:
            X.1ZF r4 = r0.A0a
            if (r4 == 0) goto L_0x1163
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            com.whatsapp.voipcalling.CallInfo r2 = r4.A3B()
            X.25g r0 = r4.A12
            if (r0 == 0) goto L_0x1163
            if (r2 == 0) goto L_0x1163
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x1163
            boolean r0 = r2.isGroupCall
            if (r0 != 0) goto L_0x1163
            boolean r0 = r4.A1v
            if (r0 == 0) goto L_0x1163
            r0 = 2131886964(0x7f120374, float:1.9408522E38)
            java.lang.String r5 = r4.getString(r0)
        L_0x096e:
            android.os.Handler r0 = r4.A0F
            r3 = 7
            r0.removeMessages(r3)
            android.os.Handler r0 = r4.A0F
            r2 = 8
            r0.removeMessages(r2)
            androidx.fragment.app.DialogFragment r1 = r4.A0e
            if (r1 == 0) goto L_0x098a
            boolean r0 = r1.A0c()
            if (r0 == 0) goto L_0x098a
            r1.A1D()
            r4.A0e = r15
        L_0x098a:
            androidx.fragment.app.DialogFragment r0 = com.whatsapp.voipcalling.VoipActivityV2.NonActivityDismissDialogFragment.A01(r5, r8)
            r4.A0e = r0
            android.os.Handler r0 = r4.A0F
            r0.sendEmptyMessage(r2)
            android.os.Handler r2 = r4.A0F
            r0 = 6000(0x1770, double:2.9644E-320)
            r2.sendEmptyMessageDelayed(r3, r0)
            return r8
        L_0x099d:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x1163
            com.whatsapp.voipcalling.CallState r2 = r3.callState
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            if (r2 == r1) goto L_0x1163
            boolean r1 = r3.isPeerRequestingUpgrade()
            if (r1 == 0) goto L_0x1163
            java.util.concurrent.ScheduledExecutorService r1 = r0.A14
            com.facebook.redex.RunnableRunnableShape0S0001000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0001000_I0
            r0.<init>(r8, r4)
            goto L_0x09d0
        L_0x09b7:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x1163
            com.whatsapp.voipcalling.CallState r2 = r3.callState
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            if (r2 == r1) goto L_0x1163
            X.1fU r1 = r3.self
            int r1 = r1.A05
            if (r1 != r4) goto L_0x1163
            java.util.concurrent.ScheduledExecutorService r1 = r0.A14
            com.facebook.redex.RunnableRunnableShape0S0001000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0001000_I0
            r0.<init>(r8, r9)
        L_0x09d0:
            r1.execute(r0)
            return r8
        L_0x09d4:
            X.1ZF r5 = r0.A0a
            if (r5 == 0) goto L_0x09ec
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            X.AnonymousClass00B.A01()
            com.whatsapp.voipcalling.CallInfo r4 = r5.A3B()
            if (r4 == 0) goto L_0x09ec
            com.whatsapp.voipcalling.CallState r3 = r4.callState
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r2) goto L_0x09ec
            r5.A3s(r4)
        L_0x09ec:
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r4 == 0) goto L_0x1163
            X.26b r2 = r0.A0T
            if (r2 == 0) goto L_0x09f9
            r2.A07(r4)
        L_0x09f9:
            X.1fV r2 = r4.callWaitingInfo
            int r2 = r2.A01
            if (r2 == r8) goto L_0x1163
            com.whatsapp.voipcalling.CallState r3 = r4.callState
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r3 != r2) goto L_0x0a10
            X.1ZF r2 = r0.A0a
            if (r2 == 0) goto L_0x0a0f
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            boolean r2 = r2.A1y
            if (r2 != 0) goto L_0x0a10
        L_0x0a0f:
            r9 = 1
        L_0x0a10:
            r0.A0m(r4, r9, r1)
            return r8
        L_0x0a14:
            X.1ZF r0 = r0.A0a
            if (r0 == 0) goto L_0x1163
            java.lang.Object r1 = r10.obj
            java.lang.String r1 = (java.lang.String) r1
            X.0pN r0 = (X.C14550pN) r0
            X.0pt r0 = r0.A05
            r0.A0H(r1, r8)
            return r8
        L_0x0a24:
            X.26Z r3 = r0.A1k
            int r6 = r10.arg1
            int r5 = r3.A00
            if (r5 == r6) goto L_0x1163
            java.lang.String r0 = "voip/audio_route/changeAudioRoute: change audioRoute "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.A05(r5)
            r2.append(r0)
            java.lang.String r0 = " -> "
            r2.append(r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.A05(r6)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 == 0) goto L_0x0a6b
            if (r6 == r8) goto L_0x0a67
            if (r6 == r9) goto L_0x0a6b
            if (r6 == r4) goto L_0x0a63
            r0 = 4
            if (r6 == r0) goto L_0x0a6b
            java.lang.String r0 = "UNKNOWN AudioRoute"
            X.AnonymousClass00B.A08(r0)
            return r8
        L_0x0a63:
            r3.A08(r2, r8)
            return r8
        L_0x0a67:
            r3.A09(r2, r8)
            return r8
        L_0x0a6b:
            int r0 = r3.A00
            if (r0 != r8) goto L_0x0a73
            r3.A09(r2, r1)
            return r8
        L_0x0a73:
            if (r0 != r4) goto L_0x0a79
            r3.A08(r2, r1)
            return r8
        L_0x0a79:
            r3.A07(r2, r15)
            return r8
        L_0x0a7d:
            java.lang.String r1 = "voip/commonHandler/HANDLER_WHAT_SHOW_INCOMING_CALL_UI"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Object r2 = r10.obj
            if (r2 == 0) goto L_0x1163
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = r0.A12(r2)
            if (r1 == 0) goto L_0x1163
            X.2dN r0 = r0.A0b
            if (r0 == 0) goto L_0x1163
            r0.A01(r2)
            return r8
        L_0x0a97:
            X.1ZF r1 = r0.A0a
            if (r1 == 0) goto L_0x0b51
            java.lang.String r3 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r3 == 0) goto L_0x0b51
            X.1ZF r2 = r0.A0a
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.String r1 = r2.A1g
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0b51
            com.whatsapp.voipcalling.CallInfo r1 = r2.A3B()
            r2.A3o(r1)
            goto L_0x0b51
        L_0x0ab6:
            X.1ZF r4 = r0.A0a
            if (r4 == 0) goto L_0x0b51
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            X.AnonymousClass00B.A01()
            com.whatsapp.voipcalling.CallInfo r2 = r4.A3B()
            boolean r1 = com.whatsapp.voipcalling.Voip.A08(r2)
            if (r1 == 0) goto L_0x0b51
            X.AnonymousClass00B.A06(r2)
            r4.A3s(r2)
            X.25g r1 = r4.A12
            if (r1 == 0) goto L_0x0b51
            boolean r1 = r2.videoEnabled
            if (r1 == 0) goto L_0x0b51
            boolean r1 = r2.isCallOnHold()
            if (r1 == 0) goto L_0x0ae1
            r4.A3W()
            goto L_0x0b51
        L_0x0ae1:
            X.1fU r3 = r2.self
            int r2 = r3.A05
            r1 = 6
            if (r2 == r1) goto L_0x0b51
            X.39w r1 = r4.A18
            r4.A3k(r3, r1)
            goto L_0x0b51
        L_0x0aee:
            java.lang.Object r4 = r10.obj
            if (r4 == 0) goto L_0x1163
            X.4HR r4 = (X.AnonymousClass4HR) r4
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r2 < r1) goto L_0x0b0b
            java.lang.String r1 = r4.A01
            boolean r1 = r0.A12(r1)
            if (r1 == 0) goto L_0x0b0b
            X.14x r3 = r0.A1v
            java.lang.String r2 = r4.A01
            java.lang.String r1 = r4.A00
            r3.A0B(r2, r1)
        L_0x0b0b:
            X.1ZF r2 = r0.A0a
            if (r2 == 0) goto L_0x0b15
            java.lang.String r1 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            r2.A1g = r1
        L_0x0b15:
            X.26b r1 = r0.A0T
            if (r1 == 0) goto L_0x1163
            java.lang.String r0 = r4.A00
            r1.A0A(r0)
            return r8
        L_0x0b1f:
            X.1ZF r1 = r0.A0a
            if (r1 == 0) goto L_0x0b51
            java.lang.String r2 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r2 == 0) goto L_0x0b51
            X.1ZF r5 = r0.A0a
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            java.lang.String r1 = r5.A1g
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0b51
            com.whatsapp.voipcalling.CallInfo r4 = r5.A3B()
            r5.A3o(r4)
            if (r4 == 0) goto L_0x0b51
            X.25g r1 = r5.A12
            r3 = 0
            if (r1 == 0) goto L_0x0b5f
            X.26Z r1 = r1.A1k
            int r2 = r1.A00
            boolean r1 = r1.A0A(r4)
            if (r1 == 0) goto L_0x0b4e
            r3 = 1
        L_0x0b4e:
            r5.AhO(r4, r2, r3)
        L_0x0b51:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r1 == 0) goto L_0x1163
            X.26b r0 = r0.A0T
            if (r0 == 0) goto L_0x1163
            r0.A07(r1)
            return r8
        L_0x0b5f:
            r2 = 0
            goto L_0x0b4e
        L_0x0b61:
            X.1ZF r1 = r0.A0a
            if (r1 == 0) goto L_0x1163
            java.lang.String r1 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r1 == 0) goto L_0x1163
            X.1ZF r2 = r0.A0a
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.String r0 = r2.A1g
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x1163
            boolean r0 = r2.A1p
            if (r0 != 0) goto L_0x1163
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A0A = r0
            return r8
        L_0x0b82:
            int r6 = r10.arg1
            java.lang.Object r11 = r10.obj
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r3 = "voip/commonHandler/HANDLER_WHAT_UPDATE_JOINABLE_CALL_LOG messageType="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            if (r6 == r8) goto L_0x0cf4
            if (r6 == r9) goto L_0x0bb2
            if (r6 == r4) goto L_0x0cf4
            java.lang.String r1 = "HANDLER_WHAT_UPDATE_JOINABLE_CALL_LOG unknown type: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r8
        L_0x0bb2:
            X.1po r6 = r0.A0D(r11)
            if (r6 != 0) goto L_0x0bf4
            com.whatsapp.voipcalling.CallInfo r13 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r2 = com.whatsapp.voipcalling.Voip.A08(r13)
            if (r2 == 0) goto L_0x1163
            java.lang.String r2 = r13.callId
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x1163
            com.whatsapp.jid.UserJid r12 = r13.getInitialPeerJid()
            X.AnonymousClass00B.A06(r12)
            boolean r7 = r13.isCaller
            int r6 = r13.initialGroupTransactionId
            X.1D0 r4 = r0.A2L
            java.lang.String r3 = X.C30341cC.A0B(r11)
            X.1lE r2 = new X.1lE
            r2.<init>(r6, r12, r3, r7)
            X.1po r6 = r4.A03(r2)
            if (r6 == 0) goto L_0x1163
            boolean r2 = r6.A0A()
            if (r2 != 0) goto L_0x0bf4
            boolean r2 = r13.videoEnabled
            r6.A09(r2)
            r0.A0q(r6, r8)
        L_0x0bf4:
            android.os.Bundle r2 = r10.getData()
            android.os.Parcelable[] r7 = r2.getParcelableArray(r5)
            com.whatsapp.jid.UserJid[] r7 = (com.whatsapp.jid.UserJid[]) r7
            if (r7 == 0) goto L_0x0c31
            monitor-enter(r6)
            java.util.Map r2 = r6.A0D     // Catch:{ all -> 0x0c2e }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0c2e }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0c2e }
            r5.<init>(r2)     // Catch:{ all -> 0x0c2e }
            monitor-exit(r6)
            int r4 = r7.length
        L_0x0c0e:
            if (r1 >= r4) goto L_0x0c28
            r3 = r7[r1]
            if (r3 == 0) goto L_0x0c25
            X.0sK r2 = r0.A1d
            boolean r2 = r2.A0I(r3)
            if (r2 != 0) goto L_0x0c25
            boolean r2 = r5.contains(r3)
            if (r2 != 0) goto L_0x0c25
            r6.A07(r3, r9)
        L_0x0c25:
            int r1 = r1 + 1
            goto L_0x0c0e
        L_0x0c28:
            X.1D0 r0 = r0.A2L
            r0.A08(r6)
            return r8
        L_0x0c2e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0c31:
            java.lang.String r0 = "Empty list of participant jids when updating call log"
            goto L_0x0c49
        L_0x0c34:
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 == 0) goto L_0x1163
            int r7 = r10.arg1
            if (r7 == 0) goto L_0x1163
            r5 = 37
            if (r7 == r8) goto L_0x0c97
            if (r7 == r4) goto L_0x0c80
            r2 = 4
            if (r7 == r2) goto L_0x0c4d
            java.lang.String r0 = "Unknown state for call waiting"
        L_0x0c49:
            X.AnonymousClass00B.A0B(r0, r1)
            return r8
        L_0x0c4d:
            java.lang.Object r2 = r10.obj
            java.lang.String r2 = (java.lang.String) r2
            X.3M9 r4 = r0.A0B(r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r3 < r2) goto L_0x0c61
            if (r4 == 0) goto L_0x0c61
            r2 = 6
            r4.A01(r2)
        L_0x0c61:
            X.1ZF r3 = r0.A0a
            if (r3 == 0) goto L_0x0c73
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.String r2 = r6.callId
            r3.A1g = r2
            r3.A1l = r1
            r3.A3c()
            r3.A3s(r6)
        L_0x0c73:
            X.26b r3 = r0.A0T
            if (r3 == 0) goto L_0x0c7c
            java.lang.String r2 = r6.callId
            r3.A0A(r2)
        L_0x0c7c:
            r0.A0m(r6, r9, r1)
            goto L_0x0c91
        L_0x0c80:
            X.1ZF r3 = r0.A0a
            if (r3 == 0) goto L_0x0c91
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            boolean r1 = r6.videoEnabled
            if (r1 == 0) goto L_0x0c91
            X.1fU r2 = r6.self
            X.39w r1 = r3.A18
            r3.A3k(r2, r1)
        L_0x0c91:
            android.os.Handler r0 = r0.A0L
            r0.removeMessages(r5)
            return r8
        L_0x0c97:
            X.1fV r4 = r6.callWaitingInfo
            int r4 = r4.A01
            if (r4 != r8) goto L_0x1163
            X.1ZF r4 = r0.A0a
            if (r4 == 0) goto L_0x0cae
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            r4.A1k = r1
            com.obwhatsapp.calling.callgrid.view.MenuBottomSheet r1 = r4.A0q
            if (r1 == 0) goto L_0x0cae
            r1.A1D()
            r4.A0q = r15
        L_0x0cae:
            java.lang.String r1 = r6.callId
            boolean r1 = r0.A12(r1)
            if (r1 == 0) goto L_0x0cee
            long r9 = android.os.SystemClock.elapsedRealtime()
            r0.A0D = r9
            X.1fV r1 = r6.callWaitingInfo
            java.util.List r9 = r1.A06
            boolean r7 = r1.A08
            java.lang.String r4 = r1.A04
            com.whatsapp.jid.GroupJid r1 = r1.A02
            boolean r1 = r0.A10(r1, r4, r9, r7)
            if (r1 == 0) goto L_0x0cee
            r1 = 2000(0x7d0, double:9.88E-321)
            r0.A0Y(r1)
        L_0x0cd1:
            android.os.Message r4 = new android.os.Message
            r4.<init>()
            r4.what = r5
            X.1fV r3 = r6.callWaitingInfo
            java.lang.String r1 = r3.A04
            r4.obj = r1
            android.os.Handler r2 = r0.A0L
            int r0 = r3.A00
            if (r0 <= r8) goto L_0x0cea
            r0 = 23000(0x59d8, double:1.13635E-319)
        L_0x0ce6:
            r2.sendMessageDelayed(r4, r0)
            return r8
        L_0x0cea:
            r0 = 45000(0xafc8, double:2.2233E-319)
            goto L_0x0ce6
        L_0x0cee:
            r0.A0D = r2
            r0.A0l(r6)
            goto L_0x0cd1
        L_0x0cf4:
            X.1po r4 = r0.A0D(r11)
            if (r4 == 0) goto L_0x1163
            r0.A0q(r4, r1)
            X.1D0 r2 = r0.A2L
            r2.A08(r4)
            X.0yL r3 = r0.A2E
            r2 = 27
            r3.A03(r2, r11)
            boolean r2 = r4.A0B()
            if (r2 == 0) goto L_0x1163
            android.os.Handler r2 = r0.A0L
            r0 = 5
            android.os.Message r0 = android.os.Message.obtain(r2, r0, r8, r1, r4)
            r0.sendToTarget()
            return r8
        L_0x0d1a:
            java.lang.Object r3 = r10.obj
            java.lang.String r3 = (java.lang.String) r3
            r2 = 21
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r1.<init>(r2, r3, r0)
            java.util.concurrent.ScheduledExecutorService r0 = r0.A14
            r0.execute(r1)
            return r8
        L_0x0d2b:
            java.lang.String r2 = "voip/commonHandler/HANDLER_WHAT_RESTORE_AUDIO_ROUTE_AFTER_POTS_CALL"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r4 == 0) goto L_0x1163
            com.whatsapp.voipcalling.CallState r3 = r4.callState
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r2) goto L_0x1163
            X.26Z r2 = r0.A1k
            java.lang.String r0 = "voip/audio_route/restoreAudioRouteAfterPOTSCall"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0d4f
            r2.A08(r4, r8)
            r2.A06 = r1
            return r8
        L_0x0d4f:
            r2.A06(r4, r15)
            return r8
        L_0x0d53:
            android.os.Bundle r1 = r10.getData()
            android.os.Parcelable[] r4 = r1.getParcelableArray(r5)
            com.whatsapp.jid.UserJid[] r4 = (com.whatsapp.jid.UserJid[]) r4
            android.os.Bundle r2 = r10.getData()
            java.lang.String r1 = "audio_levels"
            int[] r5 = r2.getIntArray(r1)
            X.26b r0 = r0.A0T
            if (r0 == 0) goto L_0x1163
            if (r4 == 0) goto L_0x1163
            if (r5 == 0) goto L_0x1163
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r11 = r0.iterator()
        L_0x0d77:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x1163
            java.lang.Object r6 = r11.next()
            X.2Tu r6 = (X.C49562Tu) r6
            boolean r0 = r6 instanceof com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x0d77
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r6 = (com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel) r6
            int r10 = r4.length
            int r0 = r5.length
            if (r10 == r0) goto L_0x0d93
            java.lang.String r0 = "CallGridViewModel/onParticipantAudioUpdated, participantJids and audioLevels should be one-on-one mapped"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0d77
        L_0x0d93:
            java.util.LinkedHashMap r0 = r6.A0a
            java.util.Set r0 = r0.keySet()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r0)
            r7 = 0
            r3 = 0
        L_0x0da0:
            if (r3 >= r10) goto L_0x0dc1
            X.4Ql r2 = r6.A0G
            r1 = r4[r3]
            java.util.Map r0 = r2.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0db9
            r0 = r5[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r4[r3]
            r2.A00(r1, r0)
        L_0x0db9:
            r0 = r4[r3]
            r9.remove(r0)
            int r3 = r3 + 1
            goto L_0x0da0
        L_0x0dc1:
            java.util.Iterator r3 = r9.iterator()
        L_0x0dc5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0d77
            java.lang.Object r2 = r3.next()
            X.4Ql r1 = r6.A0G
            java.util.Map r0 = r1.A00
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0dc5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A00(r0, r2)
            goto L_0x0dc5
        L_0x0de1:
            X.26b r0 = r0.A0T
            if (r0 == 0) goto L_0x1163
            java.lang.Object r2 = r10.obj
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            com.whatsapp.voipcalling.CallInfo r1 = r0.A05(r15)
            if (r1 == 0) goto L_0x1163
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r7 = r0.iterator()
        L_0x0df7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x1163
            java.lang.Object r0 = r7.next()
            X.2Tu r0 = (X.C49562Tu) r0
            boolean r6 = r1.videoEnabled
            boolean r3 = r0 instanceof com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r3 == 0) goto L_0x0df7
            com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = (com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r0
            X.0sG r3 = r0.A02
            X.0sH r4 = r3.A0A(r2)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            X.0sP r3 = r0.A03
            java.lang.String r3 = r3.A08(r4)
            r4 = 0
            r5[r4] = r3
            r3 = 2131892973(0x7f121aed, float:1.942071E38)
            X.3y9 r13 = new X.3y9
            r13.<init>(r5, r3)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r3 = 2131892972(0x7f121aec, float:1.9420707E38)
            X.3y9 r14 = new X.3y9
            r14.<init>(r4, r3)
            r18 = 2131101698(0x7f060802, float:1.7815813E38)
            if (r6 == 0) goto L_0x0e36
            r18 = 2131101144(0x7f0605d8, float:1.781469E38)
        L_0x0e36:
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            r4 = 2131231987(0x7f0804f3, float:1.808007E38)
            r3 = 2131101126(0x7f0605c6, float:1.7814653E38)
            X.4Ht r12 = new X.4Ht
            r12.<init>(r4, r3)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.CENTER
            X.2Tv r10 = new X.2Tv
            r19 = 0
            r20 = 0
            r21 = 0
            r17 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.A0A(r10)
            goto L_0x0df7
        L_0x0e59:
            java.lang.Object r3 = r10.obj
            com.whatsapp.voipcalling.CallLinkInfo r3 = (com.whatsapp.voipcalling.CallLinkInfo) r3
            int r7 = r10.arg1
            X.AnonymousClass00B.A01()
            int r2 = r3.linkState
            r6 = 4
            if (r2 != 0) goto L_0x0e9d
            java.lang.String r3 = "callLinkStateChangedOnUiThread to NONE. oldLinkState: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            com.whatsapp.fieldstats.events.WamCall r5 = r0.A0d
            if (r5 == 0) goto L_0x0e87
            if (r7 == r4) goto L_0x0e80
            if (r7 != r6) goto L_0x0e87
        L_0x0e80:
            X.0w0 r3 = r0.A1x
            boolean r2 = r0.A1T
            r3.A02(r5, r2)
        L_0x0e87:
            if (r7 != r6) goto L_0x0e99
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.LINK
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0.A0r(r3, r2)
            r0.A1I = r1
        L_0x0e94:
            r0.A0X = r15
            r0.A0W = r15
            return r8
        L_0x0e99:
            r0.A0M()
            goto L_0x0e94
        L_0x0e9d:
            if (r2 != r8) goto L_0x0eb6
            if (r7 != 0) goto L_0x0ecb
            android.content.Context r10 = r0.A1X
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            boolean r0 = r3.videoEnabled
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r14 = r13
            android.content.Intent r0 = X.C14750ph.A0b(r10, r11, r12, r13, r14, r15)
            r10.startActivity(r0)
            return r8
        L_0x0eb6:
            if (r2 != r9) goto L_0x0ecb
            if (r7 != r8) goto L_0x0ecb
            X.26b r1 = r0.A0T
            if (r1 == 0) goto L_0x1163
            com.whatsapp.jid.UserJid r0 = r3.creatorJid
            X.AnonymousClass00B.A06(r0)
        L_0x0ec3:
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.CallInfo.convertCallLinkInfoToCallInfo(r3)
            r1.A07(r0)
            return r8
        L_0x0ecb:
            if (r7 == r8) goto L_0x0f0a
            if (r7 == r9) goto L_0x0f0a
            if (r7 != r4) goto L_0x1163
            if (r2 != r6) goto L_0x1163
            r0.A1I = r8
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            if (r2 == r1) goto L_0x1163
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.AnonymousClass00B.A06(r3)
            X.26b r2 = r0.A0T
            if (r2 == 0) goto L_0x0f03
            java.lang.String r1 = r3.callId
            r2.A0A(r1)
        L_0x0eed:
            com.whatsapp.jid.UserJid r12 = r3.getPeerJid()
            X.AnonymousClass00B.A06(r12)
            boolean r2 = r3.videoEnabled
            java.lang.String r1 = r3.callId
            r14 = 0
            r16 = 1
            r10 = r0
            r11 = r15
            r13 = r1
            r15 = r2
            r10.A0e(r11, r12, r13, r14, r15, r16)
            return r8
        L_0x0f03:
            java.lang.String r1 = "voiceservice/callLinkStateChangedOnUiThread callDataSource is null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0eed
        L_0x0f0a:
            if (r2 != r4) goto L_0x1163
            X.26b r1 = r0.A0T
            if (r1 == 0) goto L_0x1163
            goto L_0x0ec3
        L_0x0f11:
            X.26b r1 = r0.A0T
            if (r1 == 0) goto L_0x1163
            java.lang.Object r2 = r10.obj
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            com.whatsapp.voipcalling.CallInfo r3 = r1.A05(r15)
            if (r3 == 0) goto L_0x10c7
            java.lang.Iterable r1 = r1.A01()
            java.util.Iterator r9 = r1.iterator()
        L_0x0f27:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x10c7
            java.lang.Object r1 = r9.next()
            X.2Tu r1 = (X.C49562Tu) r1
            boolean r7 = r3.videoEnabled
            boolean r4 = r1 instanceof com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r4 == 0) goto L_0x0f27
            com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r1 = (com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r1
            X.0sP r5 = r1.A03
            X.0sG r4 = r1.A02
            X.0sH r4 = r4.A0A(r2)
            java.lang.String r4 = r5.A08(r4)
            java.lang.Object[] r6 = new java.lang.Object[r8]
            r5 = 0
            r6[r5] = r4
            r4 = 2131892971(0x7f121aeb, float:1.9420705E38)
            X.3y9 r13 = new X.3y9
            r13.<init>(r6, r4)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r4 = 2131892970(0x7f121aea, float:1.9420703E38)
            X.3y9 r14 = new X.3y9
            r14.<init>(r5, r4)
            r18 = 2131101698(0x7f060802, float:1.7815813E38)
            if (r7 == 0) goto L_0x0f66
            r18 = 2131101144(0x7f0605d8, float:1.781469E38)
        L_0x0f66:
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            r5 = 2131231987(0x7f0804f3, float:1.808007E38)
            r4 = 2131101126(0x7f0605c6, float:1.7814653E38)
            X.4Ht r12 = new X.4Ht
            r12.<init>(r5, r4)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.CENTER
            r19 = 0
            X.2Tv r10 = new X.2Tv
            r17 = 1
            r20 = 0
            r21 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.A0A(r10)
            goto L_0x0f27
        L_0x0f89:
            int r2 = r10.arg1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.A0y(r1, r2)
            r1 = 25
            r0.A0W(r1, r15)
            return r8
        L_0x0f99:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r1 == 0) goto L_0x1163
            X.26b r0 = r0.A0T
            if (r0 == 0) goto L_0x1163
            r0.A08(r1, r8)
            return r8
        L_0x0fa7:
            X.26b r2 = r0.A0T
            if (r2 == 0) goto L_0x1163
            int r2 = r10.arg1
            if (r2 != r8) goto L_0x0fb0
            r1 = 1
        L_0x0fb0:
            com.whatsapp.voipcalling.CallInfo r7 = com.whatsapp.voipcalling.Voip.getCallInfo()
            java.lang.Object r4 = r10.obj
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.AnonymousClass00B.A06(r4)
            X.26b r2 = r0.A0T
            com.whatsapp.voipcalling.CallInfo r5 = r2.A05(r15)
            if (r5 == 0) goto L_0x1032
            java.lang.Iterable r2 = r2.A01()
            java.util.Iterator r13 = r2.iterator()
        L_0x0fcb:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x1032
            java.lang.Object r3 = r13.next()
            X.2Tu r3 = (X.C49562Tu) r3
            boolean r11 = r5.videoEnabled
            boolean r2 = r3 instanceof com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r2 == 0) goto L_0x0fcb
            com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r3 = (com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r3
            r18 = 0
            X.0sG r2 = r3.A02
            X.0sH r6 = r2.A0A(r4)
            r12 = 2131886941(0x7f12035d, float:1.9408475E38)
            r10 = 2131232582(0x7f080746, float:1.8081277E38)
            if (r1 == 0) goto L_0x0ff5
            r12 = 2131886935(0x7f120357, float:1.9408463E38)
            r10 = 2131232583(0x7f080747, float:1.808128E38)
        L_0x0ff5:
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r23 = 0
            X.0sP r2 = r3.A03
            java.lang.String r2 = r2.A08(r6)
            r9[r23] = r2
            X.3y9 r6 = new X.3y9
            r6.<init>(r9, r12)
            r22 = 2131101698(0x7f060802, float:1.7815813E38)
            if (r11 == 0) goto L_0x100e
            r22 = 2131101144(0x7f0605d8, float:1.781469E38)
        L_0x100e:
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            r9 = 2131101126(0x7f0605c6, float:1.7814653E38)
            X.4Ht r2 = new X.4Ht
            r2.<init>(r10, r9)
            android.widget.ImageView$ScaleType r15 = android.widget.ImageView.ScaleType.CENTER
            r21 = 7
            r24 = 0
            r25 = 0
            X.2Tv r14 = new X.2Tv
            r17 = r6
            r19 = r18
            r16 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3.A0A(r14)
            goto L_0x0fcb
        L_0x1032:
            X.26b r0 = r0.A0T
            r0.A07(r7)
            return r8
        L_0x1038:
            java.lang.Object r6 = r10.obj
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            int r2 = r10.arg1
            if (r2 != r8) goto L_0x1041
            r1 = 1
        L_0x1041:
            X.AnonymousClass00B.A06(r6)
            X.26b r2 = r0.A0T
            if (r2 == 0) goto L_0x1163
            com.whatsapp.voipcalling.CallInfo r5 = r2.A05(r15)
            if (r5 == 0) goto L_0x10c7
            java.lang.Iterable r2 = r2.A01()
            java.util.Iterator r12 = r2.iterator()
        L_0x1056:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x10c7
            java.lang.Object r4 = r12.next()
            X.2Tu r4 = (X.C49562Tu) r4
            boolean r10 = r5.videoEnabled
            boolean r2 = r4 instanceof com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r2 == 0) goto L_0x1056
            com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r4 = (com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r4
            X.0sG r2 = r4.A02
            X.0sH r3 = r2.A0A(r6)
            r11 = 2131886940(0x7f12035c, float:1.9408473E38)
            if (r1 == 0) goto L_0x1078
            r11 = 2131886934(0x7f120356, float:1.940846E38)
        L_0x1078:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            X.0sP r2 = r4.A03
            java.lang.String r3 = r2.A08(r3)
            r2 = 0
            r7[r2] = r3
            X.3y9 r9 = new X.3y9
            r9.<init>(r7, r11)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 2131892970(0x7f121aea, float:1.9420703E38)
            X.3y9 r7 = new X.3y9
            r7.<init>(r3, r2)
            r24 = 2131101698(0x7f060802, float:1.7815813E38)
            if (r10 == 0) goto L_0x109a
            r24 = 2131101144(0x7f0605d8, float:1.781469E38)
        L_0x109a:
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            r10 = 2131232623(0x7f08076f, float:1.808136E38)
            r2 = 2131101343(0x7f06069f, float:1.7815093E38)
            X.4Ht r3 = new X.4Ht
            r3.<init>(r10, r2)
            android.widget.ImageView$ScaleType r17 = android.widget.ImageView.ScaleType.CENTER
            r23 = 6
            r25 = 0
            r26 = 0
            r27 = 0
            X.2Tv r2 = new X.2Tv
            r16 = r2
            r18 = r3
            r19 = r9
            r20 = r7
            r21 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4.A0A(r2)
            goto L_0x1056
        L_0x10c7:
            X.26b r0 = r0.A0T
            goto L_0x10eb
        L_0x10ca:
            X.1ZF r1 = r0.A0a
            if (r1 == 0) goto L_0x10e7
            java.lang.String r3 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r3 == 0) goto L_0x10e7
            X.1ZF r2 = r0.A0a
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.String r1 = r2.A1g
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x10e7
            com.whatsapp.voipcalling.CallInfo r1 = r2.A3B()
            r2.A3o(r1)
        L_0x10e7:
            X.26b r0 = r0.A0T
            if (r0 == 0) goto L_0x1163
        L_0x10eb:
            r0.A07(r15)
            return r8
        L_0x10ef:
            int r4 = r10.arg1
            java.lang.Object r3 = r10.obj
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "voip/commonHandler/HANDLER_WHAT_CLEAN_UP_SELF_MANAGED_CONNECTION disconnectCause="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r4)
            java.lang.String r1 = ", callId="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r2 < r1) goto L_0x1163
            X.3M9 r0 = r0.A0B(r3)
            if (r0 == 0) goto L_0x1163
            r0.A01(r4)
            return r8
        L_0x111f:
            int r4 = r10.arg1
            java.lang.Object r3 = r10.obj
            java.lang.String r3 = (java.lang.String) r3
            if (r4 == 0) goto L_0x1128
            r1 = 1
        L_0x1128:
            java.lang.String r2 = "voiceservice/end call with dialog/ Reason not set"
            X.AnonymousClass00B.A0B(r2, r1)
            com.whatsapp.voipcalling.CallInfo r1 = X.C30341cC.A06()
            r0.A0n(r1, r3, r4)
            return r8
        L_0x1136:
            X.1ZF r1 = r0.A0a
            if (r1 == 0) goto L_0x1163
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            boolean r1 = r1.A1y
            if (r1 != 0) goto L_0x1163
            java.lang.String r1 = "default"
            r0.A0t(r1)
            return r8
        L_0x1146:
            java.lang.Object r1 = r10.obj
            X.AnonymousClass00B.A06(r1)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            int r2 = r10.arg1
            if (r2 != r8) goto L_0x1164
            X.1ZF r4 = r0.A0a
            if (r4 == 0) goto L_0x1163
            X.0pP r4 = (X.C14570pP) r4
            X.0sq r3 = r4.A05
            r2 = 30
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9
            r0.<init>(r4, r2, r1)
            r3.Acl(r0)
        L_0x1163:
            return r8
        L_0x1164:
            X.26b r0 = r0.A0T
            if (r0 == 0) goto L_0x1163
            X.3AY r2 = r0.A04()
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r7 = r0.iterator()
        L_0x1174:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x1163
            java.lang.Object r0 = r7.next()
            X.2Tu r0 = (X.C49562Tu) r0
            boolean r6 = r2.A0F
            boolean r3 = r0 instanceof com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel
            if (r3 == 0) goto L_0x1174
            com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = (com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r0
            X.0sG r3 = r0.A02
            X.0sH r4 = r3.A0A(r1)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            X.0sP r3 = r0.A03
            java.lang.String r3 = r3.A08(r4)
            r4 = 0
            r5[r4] = r3
            r3 = 2131886936(0x7f120358, float:1.9408465E38)
            X.3y9 r13 = new X.3y9
            r13.<init>(r5, r3)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r3 = 2131886952(0x7f120368, float:1.9408497E38)
            X.3y9 r14 = new X.3y9
            r14.<init>(r4, r3)
            r18 = 2131101698(0x7f060802, float:1.7815813E38)
            if (r6 == 0) goto L_0x11b3
            r18 = 2131101144(0x7f0605d8, float:1.781469E38)
        L_0x11b3:
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            r4 = 2131232582(0x7f080746, float:1.8081277E38)
            r3 = 2131101126(0x7f0605c6, float:1.7814653E38)
            X.4Ht r12 = new X.4Ht
            r12.<init>(r4, r3)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.CENTER
            r17 = 4
            r19 = 0
            r20 = 0
            r21 = 0
            X.2Tv r10 = new X.2Tv
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.A0A(r10)
            goto L_0x1174
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A07(android.os.Message, X.25g):boolean");
    }

    public static /* synthetic */ boolean A08(C447225g r2) {
        PowerManager A0I2 = r2.A2C.A0I();
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if (A0I2 != null) {
            return A0I2.isPowerSaveMode();
        }
        Log.w("voip/service/start pm=null");
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:61|62) */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00cd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C38591r2 A09(com.whatsapp.jid.UserJid r10, java.lang.String r11) {
        /*
            r9 = this;
            X.198 r4 = r9.A1m
            monitor-enter(r4)
            X.196 r5 = r4.A00     // Catch:{ all -> 0x00ce }
            boolean r0 = r5.containsKey(r11)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r5.get(r11)     // Catch:{ all -> 0x00ce }
            X.1r2 r0 = (X.C38591r2) r0     // Catch:{ all -> 0x00ce }
            goto L_0x0066
        L_0x0012:
            X.0tq r0 = r4.A02     // Catch:{ all -> 0x00ce }
            X.0tf r7 = r0.get()     // Catch:{ all -> 0x00ce }
            X.0tg r3 = r7.A02     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "SELECT _id, token, creator_jid_row_id FROM call_link WHERE token = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00c9 }
            r0 = 0
            r1[r0] = r11     // Catch:{ all -> 0x00c9 }
            android.database.Cursor r8 = r3.A08(r2, r1)     // Catch:{ all -> 0x00c9 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00c2 }
            r1 = 0
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "_id"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c2 }
            int r0 = r8.getInt(r0)     // Catch:{ all -> 0x00c2 }
            long r2 = (long) r0     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "creator_jid_row_id"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c2 }
            int r0 = r8.getInt(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x004f
            X.14v r6 = r4.A01     // Catch:{ all -> 0x00c2 }
            long r0 = (long) r0     // Catch:{ all -> 0x00c2 }
            com.whatsapp.jid.Jid r0 = r6.A03(r0)     // Catch:{ all -> 0x00c2 }
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x00c2 }
        L_0x004f:
            X.1r2 r0 = new X.1r2     // Catch:{ all -> 0x00c2 }
            r0.<init>(r1, r11, r2)     // Catch:{ all -> 0x00c2 }
            r5.put(r11, r0)     // Catch:{ all -> 0x00c2 }
            r8.close()     // Catch:{ all -> 0x00c9 }
            r7.close()     // Catch:{ all -> 0x00ce }
            goto L_0x0066
        L_0x005e:
            r8.close()     // Catch:{ all -> 0x00c9 }
            r7.close()     // Catch:{ all -> 0x00ce }
            monitor-exit(r4)
            goto L_0x0069
        L_0x0066:
            monitor-exit(r4)
            if (r0 != 0) goto L_0x00c1
        L_0x0069:
            monitor-enter(r4)
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x00ce }
            X.0tq r0 = r4.A02     // Catch:{ all -> 0x00ce }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x00ce }
            X.1cj r7 = r3.A00()     // Catch:{ all -> 0x00b6 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x00b1 }
            r6.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "token"
            r6.put(r0, r11)     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "creator_jid_row_id"
            if (r10 == 0) goto L_0x00a7
            X.14v r0 = r4.A01     // Catch:{ all -> 0x00b1 }
            long r0 = r0.A01(r10)     // Catch:{ all -> 0x00b1 }
        L_0x008c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b1 }
            r6.put(r2, r0)     // Catch:{ all -> 0x00b1 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "call_link"
            long r1 = r1.A03(r6, r0)     // Catch:{ all -> 0x00b1 }
            X.1r2 r0 = new X.1r2     // Catch:{ all -> 0x00b1 }
            r0.<init>(r10, r11, r1)     // Catch:{ all -> 0x00b1 }
            r5.put(r11, r0)     // Catch:{ all -> 0x00b1 }
            r7.A00()     // Catch:{ all -> 0x00b1 }
            goto L_0x00aa
        L_0x00a7:
            r0 = 0
            goto L_0x008c
        L_0x00aa:
            r7.close()     // Catch:{ all -> 0x00b6 }
            r3.close()     // Catch:{ all -> 0x00ce }
            goto L_0x00bb
        L_0x00b1:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00cd }
            goto L_0x00cd
        L_0x00bb:
            monitor-exit(r4)
            X.1r2 r0 = new X.1r2
            r0.<init>(r10, r11, r1)
        L_0x00c1:
            return r0
        L_0x00c2:
            r0 = move-exception
            if (r8 == 0) goto L_0x00c8
            r8.close()     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A09(com.whatsapp.jid.UserJid, java.lang.String):X.1r2");
    }

    public final AnonymousClass4HS A0A(String str) {
        Map map = this.A2i;
        AnonymousClass4HS r0 = (AnonymousClass4HS) map.get(str);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass4HS r02 = new AnonymousClass4HS();
        map.put(str, r02);
        return r02;
    }

    public AnonymousClass3M9 A0B(String str) {
        if (str == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        return this.A1v.A03(str);
    }

    public C52242dN A0C() {
        return new C59932zR(this);
    }

    public final C37831po A0D(String str) {
        C38571r0 A042 = this.A2M.A04(C30341cC.A0B(str));
        if (A042 != null) {
            return this.A2L.A02(A042.A00);
        }
        return null;
    }

    public String A0E(String str, String str2) {
        C37831po A0D2 = A0D(str);
        if (A0D2 != null) {
            String str3 = A0D2.A07;
            if (str3 != null || str2 == null) {
                return str3;
            }
            synchronized (A0D2) {
                if (A0D2.A07 != null) {
                    AnonymousClass00B.A08("CallRandomId cannot be set twice!");
                } else {
                    A0D2.A0J = true;
                    A0D2.A07 = str2;
                }
            }
            this.A2L.A08(A0D2);
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A0F(java.util.Map r15, int r16, boolean r17) {
        /*
            r14 = this;
            X.39S r3 = r14.A1y
            boolean r0 = r15.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x00a8
            java.util.Set r0 = r15.keySet()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x001b:
            boolean r0 = r11.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x008c
            java.lang.Object r5 = r11.next()
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5
            byte r1 = r5.device
            r0 = 0
            if (r1 != 0) goto L_0x002e
            r0 = 1
        L_0x002e:
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0071
            com.whatsapp.jid.UserJid r10 = r5.getUserJid()
            com.whatsapp.jid.DeviceJid r9 = r10.getPrimaryDevice()
            X.11s r1 = r3.A08
            X.1Yb r0 = X.C28851Ya.A02(r9)
            boolean r0 = r1.A0d(r0)
            if (r0 != 0) goto L_0x0071
            java.util.Set r0 = r3.A0K
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0071
            java.lang.String r1 = "voip/encryption/schedule usync for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.16U r8 = r3.A05
            r0 = 1
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r0]
            r1[r6] = r10
            r0 = 4
            r8.A01(r1, r0)
            r4.add(r9)
            r7.add(r5)
        L_0x0071:
            X.11s r1 = r3.A08
            X.1Yb r0 = X.C28851Ya.A02(r5)
            boolean r0 = r1.A0d(r0)
            if (r0 != 0) goto L_0x001b
            java.util.Set r0 = r3.A0K
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x001b
            r4.add(r5)
            r7.add(r5)
            goto L_0x001b
        L_0x008c:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00a0
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r6]
            java.lang.Object[] r4 = r4.toArray(r0)
            com.whatsapp.jid.DeviceJid[] r4 = (com.whatsapp.jid.DeviceJid[]) r4
            X.1HD r1 = r3.A03
            r0 = 6
            r1.A04(r4, r0, r6)
        L_0x00a0:
            if (r17 != 0) goto L_0x00c3
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00c3
        L_0x00a8:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r2)
        L_0x00af:
            java.lang.Object r0 = r1.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00be
            r0 = 30
            r14.A0W(r0, r2)
        L_0x00be:
            java.lang.Object r0 = r1.second
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x00c3:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Set r0 = r15.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x00d0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x024a
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getKey()
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8
            java.lang.Object r4 = r0.getValue()
            byte[] r4 = (byte[]) r4
            boolean r0 = r7.contains(r8)
            if (r0 != 0) goto L_0x00d0
            X.1iD r12 = X.C33211iD.A0o     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1Wr r9 = r12.A0U()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1iE r9 = (X.C33221iE) r9     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1Wm r0 = r9.A00     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1iD r0 = (X.C33211iD) r0     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.2In r0 = r0.A05     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r0 != 0) goto L_0x0100
            X.2In r0 = X.C47332In.A05     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
        L_0x0100:
            X.1Wr r5 = r0.A0U()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.2Im r5 = (X.C47322Im) r5     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            int r1 = r4.length     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r0 = 0
            X.1Ww r4 = X.C28631Ww.A01(r4, r0, r1)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r5.A03()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1Wm r1 = r5.A00     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.2In r1 = (X.C47332In) r1     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            int r0 = r1.A00     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r0 = r0 | 1
            r1.A00 = r0     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r1.A02 = r4     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r16 != 0) goto L_0x0150
            X.0pd r1 = r3.A0H     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r0 = 520(0x208, float:7.29E-43)
            X.0tM r4 = X.C16620tM.A02     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            boolean r0 = r1.A0E(r4, r0)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r0 == 0) goto L_0x0150
            X.1GG r0 = r3.A0D     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1Hs r11 = r0.A01()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            com.whatsapp.jid.UserJid r10 = r8.getUserJid()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1Hp r0 = r11.A05     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            boolean r0 = r0.A00()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r0 == 0) goto L_0x0197
            X.1Hr r0 = r11.A00     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.0pd r1 = r0.A00     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r0 = 823(0x337, float:1.153E-42)
            boolean r0 = r1.A0E(r4, r0)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r0 == 0) goto L_0x0184
            X.0zO r1 = r11.A01     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.21U r0 = r1.A00(r10)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r1.A05(r0, r5)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
        L_0x0150:
            r9.A03()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1Wm r1 = r9.A00     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1iD r1 = (X.C33211iD) r1     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1Wm r0 = r5.A02()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.2In r0 = (X.C47332In) r0     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r1.A05 = r0     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            int r0 = r1.A00     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.A00 = r0     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.137 r1 = r3.A0G     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            com.whatsapp.jid.UserJid r0 = r8.getUserJid()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.27R r4 = r1.A04(r0)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r4 == 0) goto L_0x01ff
            X.1Wm r1 = r9.A02()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1iD r1 = (X.C33211iD) r1     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1Wr r0 = r12.A0U()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r0.A04(r1)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1iE r0 = (X.C33221iE) r0     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.C41061vA.A0B(r4, r0)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            goto L_0x01fc
        L_0x0184:
            X.1Hn r1 = r11.A08     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            android.util.LruCache r0 = r1.A00     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.2IP r0 = (X.AnonymousClass2IP) r0     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r0 != 0) goto L_0x0194
            X.2IP r0 = r1.A00(r10)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
        L_0x0194:
            r11.A01(r10, r0)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
        L_0x0197:
            X.1Hn r1 = r11.A08     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            android.util.LruCache r0 = r1.A00     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            java.lang.Object r4 = r0.get(r10)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.2IP r4 = (X.AnonymousClass2IP) r4     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r4 != 0) goto L_0x01a7
            X.2IP r4 = r1.A00(r10)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
        L_0x01a7:
            X.1Hq r0 = r11.A06     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            boolean r0 = r0.A01()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r0 == 0) goto L_0x0150
            if (r4 == 0) goto L_0x0150
            java.lang.String r1 = r4.A04     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r1 == 0) goto L_0x0150
            java.lang.String r4 = r4.A05     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            if (r4 == 0) goto L_0x0150
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            X.1Wu r10 = new X.1Wu     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r10.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r5.A03()     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            X.1Wm r1 = r5.A00     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            X.2In r1 = (X.C47332In) r1     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            int r0 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r0 = r0 | 4
            r1.A00 = r0     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r1.A03 = r10     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r5.A03()     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            X.1Wm r1 = r5.A00     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            X.2In r1 = (X.C47332In) r1     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            int r0 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r0 = r0 | 2
            r1.A00 = r0     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            r1.A04 = r4     // Catch:{ UnsupportedEncodingException -> 0x01e4 }
            goto L_0x0150
        L_0x01e4:
            r4 = move-exception
            java.lang.String r0 = "CTWA: LoggingDataMigrationUtils/attachAdsDataToCallV1/UnsupportedEncodingException="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r1.<init>(r0)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            java.lang.String r0 = r4.getMessage()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r1.append(r0)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            java.lang.String r0 = r1.toString()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            goto L_0x0150
        L_0x01fc:
            if (r0 == 0) goto L_0x01ff
            goto L_0x0204
        L_0x01ff:
            X.1Wm r5 = r9.A02()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            goto L_0x0208
        L_0x0204:
            X.1Wm r5 = r0.A02()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
        L_0x0208:
            X.1iD r5 = (X.C33211iD) r5     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.16P r4 = r3.A09     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r0 = 0
            com.facebook.redex.IDxCallableShape28S0300000_2_I0 r1 = new com.facebook.redex.IDxCallableShape28S0300000_2_I0     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r1.<init>(r3, r8, r5, r0)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            java.util.concurrent.ThreadPoolExecutor r0 = r4.A00     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r3.A0L = r0     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            java.util.concurrent.Future r0 = r3.A0L     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            java.lang.Object r0 = r0.get()     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            X.1d1 r0 = (X.C30821d1) r0     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r6.put(r8, r0)     // Catch:{ CancellationException -> 0x0238, InterruptedException -> 0x0229, ExecutionException -> 0x0253 }
            r3.A0L = r2
            goto L_0x00d0
        L_0x0229:
            r1 = move-exception
            java.lang.String r0 = "voip/encryption/encryptE2EKey interrupted"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x025a }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x025a }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x025a }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x025a }
            goto L_0x0246
        L_0x0238:
            r1 = move-exception
            java.lang.String r0 = "voip/encryption/encryptE2EKey cancelled"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x025a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x025a }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x025a }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x025a }
        L_0x0246:
            r3.A0L = r2
            goto L_0x00af
        L_0x024a:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r6)
            goto L_0x00af
        L_0x0253:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x025a }
            r0.<init>(r1)     // Catch:{ all -> 0x025a }
            throw r0     // Catch:{ all -> 0x025a }
        L_0x025a:
            r0 = move-exception
            r3.A0L = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0F(java.util.Map, int, boolean):java.util.Map");
    }

    public void A0G() {
        StringBuilder sb = new StringBuilder("voip/service/create ");
        sb.append(this);
        Log.i(sb.toString());
        this.A0M = new Handler(new IDxCallbackShape186S0100000_1_I0(this, 1));
        this.A0K = new Handler(new IDxCallbackShape187S0100000_2_I0(this, 1));
        this.A0N = new Handler(new IDxCallbackShape187S0100000_2_I0(this, 2));
        this.A0L = new Handler(new IDxCallbackShape187S0100000_2_I0(this, 3));
        C46682Fl r0 = new C46682Fl((C23291Bk) this.A2c, new C46672Fk("VoIP Signaling Thread"));
        r0.allowCoreThreadTimeOut(false);
        this.A14 = r0;
        AnonymousClass01V r4 = this.A2C;
        this.A0f = new AnonymousClass4L9(r4);
        this.A0Q = new C56492nk(this);
        this.A0F = new IDxBReceiverShape7S0100000_2_I0(this, 6);
        this.A0G = new IDxBReceiverShape7S0100000_2_I0(this, 7);
        this.A0U = new C82534De(this);
        AnonymousClass26Z r2 = this.A1k;
        Log.i("voip/audio_route/init");
        r2.A0G.A03 = new WeakReference(r2);
        if (AnonymousClass26Z.A0J) {
            r2.A0D.A08(r2.A0C);
        }
        C84804Ly r02 = this.A1l;
        AnonymousClass00B.A01();
        AnonymousClass023 r22 = r02.A01;
        if (r22 != null) {
            AnonymousClass0NN r03 = r02.A00;
            (r03 == null ? new AnonymousClass027(0) : r03.A00).A07(r22);
        }
        AnonymousClass39S r23 = this.A1y;
        r23.A07.A02(r23.A06);
        r23.A01.A02(r23.A00);
        r23.A0F.A02(r23.A0E);
        this.A2Z.A02(this.A2Y);
        C100044v0 r1 = new C100044v0(this);
        this.A0R = r1;
        this.A1g.A0x.add(r1);
        AnonymousClass51Y r12 = new AnonymousClass51Y(this);
        this.A0e = r12;
        this.A2X.A02(r12);
        if (Build.VERSION.SDK_INT >= 28) {
            C52242dN A0C2 = A0C();
            this.A0b = A0C2;
            this.A1v.A08(A0C2);
        } else {
            this.A0b = null;
        }
        Voip.nativeRegisterJNIUtils(this.A2e);
        Voip.nativeRegisterEventCallback(this.A1t);
        if (Voip.A00 == null) {
            DefaultCryptoCallback defaultCryptoCallback = new DefaultCryptoCallback(this.A1d);
            Voip.nativeRegisterCryptoCallback(defaultCryptoCallback);
            Voip.A00 = defaultCryptoCallback;
        }
        VoiceService$DefaultSignalingXmppCallback voiceService$DefaultSignalingXmppCallback = new VoiceService$DefaultSignalingXmppCallback(this, this.A2D, this.A1d, this.A1r);
        Voip.nativeRegisterSignalingXmppCallback(voiceService$DefaultSignalingXmppCallback);
        Voip.A02 = voiceService$DefaultSignalingXmppCallback;
        if (Build.VERSION.SDK_INT >= 22) {
            C55282jD r04 = new C55282jD(r4.A0H(), this.A1i);
            this.A0S = r04;
            r04.A08();
        } else {
            this.A0S = null;
        }
        Log.i("voip/service/created");
    }

    public void A0H() {
        int intValue;
        C55282jD r0;
        StringBuilder sb = new StringBuilder("voip/service/destroy ");
        sb.append(this);
        Log.i(sb.toString());
        try {
            A0K();
        } catch (Exception e2) {
            Log.e((Throwable) e2);
        }
        A0S();
        SoundPool soundPool = this.A0I;
        if (soundPool != null) {
            this.A0s = null;
            soundPool.release();
            this.A0I = null;
        }
        AnonymousClass26Z r2 = this.A1k;
        Log.i("voip/audio_route/deinit");
        r2.A02 = true;
        if (AnonymousClass26Z.A0J) {
            r2.A0D.A09(r2.A0C);
        }
        r2.A0G.A03 = null;
        C84804Ly r02 = this.A1l;
        AnonymousClass00B.A01();
        AnonymousClass023 r22 = r02.A01;
        if (r22 != null) {
            AnonymousClass0NN r03 = r02.A00;
            (r03 == null ? new AnonymousClass027(0) : r03.A00).A08(r22);
        }
        A0U();
        if (Build.VERSION.SDK_INT >= 22 && (r0 = this.A0S) != null) {
            r0.A07();
            this.A0S = null;
        }
        Voip.nativeUnregisterJNIUtils();
        Voip.nativeUnregisterEventCallback();
        Voip.nativeUnregisterSignalingXmppCallback();
        Voip.A02 = null;
        AnonymousClass39S r23 = this.A1y;
        r23.A07.A03(r23.A06);
        r23.A01.A03(r23.A00);
        r23.A0F.A03(r23.A0E);
        this.A2Z.A03(this.A2Y);
        ScheduledExecutorService scheduledExecutorService = this.A14;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.A14 = null;
        }
        Integer num = this.A0m;
        ((num == null || (intValue = num.intValue()) == 0) ? this.A2G.A0K().remove("call_offer_ack_timeout") : this.A2G.A0K().putInt("call_offer_ack_timeout", intValue * 1000)).apply();
        StringBuilder sb2 = new StringBuilder("voip/service/destroyed pendingCommands: ");
        List<C204710g> list = this.A2h;
        sb2.append(list.size());
        Log.i(sb2.toString());
        for (C204710g A002 : list) {
            this.A1u.A00(A002);
        }
        list.clear();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28 && this.A0b != null) {
            C216514x r24 = this.A1v;
            boolean z2 = false;
            if (r24.A00() == 0) {
                z2 = true;
            }
            AnonymousClass00B.A0B("Self managed connections are not disconnected when VoiceService is being destroyed", z2);
            r24.A05();
            r24.A09(this.A0b);
            this.A0b = null;
        }
        this.A1g.A0x.remove(this.A0R);
        this.A2X.A03(this.A0e);
        if (this.A1H && i2 >= 28) {
            for (StatusBarNotification id : this.A2T.A0M()) {
                if (id.getId() == 23) {
                    this.A1a.AcB("VoiceService/onDestroy", "voip/orphannotification", true);
                }
            }
        }
    }

    public void A0I() {
        long j2 = this.A0C;
        if (j2 != -1) {
            this.A0E += System.currentTimeMillis() - j2;
            this.A0C = -1;
            Log.i("VoiceService:onExitPictureInPicture");
        }
    }

    public void A0J() {
        A0V();
        this.A2f.setRequestedCamera2SupportLevel(this.A1j.A02(), this.A1i);
        this.A0L.removeMessages(23);
        this.A0L.sendEmptyMessageDelayed(23, 45000);
        this.A14.execute(new RunnableRunnableShape0S0000000_I0(5));
    }

    public void A0K() {
        if (this.A1V != null) {
            Log.i("voip/vibrate/stop");
            Vibrator A0K2 = this.A2C.A0K();
            AnonymousClass00B.A06(A0K2);
            A0K2.cancel();
            this.A1V = null;
        }
        this.A0J = null;
        C78733yb r1 = this.A0c;
        if (r1 != null) {
            r1.A06(true);
            this.A0c = null;
        }
        if (this.A0H != null) {
            Log.i("voip/ringtone/stop");
            this.A0H.stop();
            this.A0H = null;
        }
    }

    public void A0L() {
        this.A14.execute(new RunnableRunnableShape0S0000000_I0(6));
    }

    public final void A0M() {
        this.A0N.removeMessages(0);
        this.A0N.sendEmptyMessageDelayed(0, 15000);
    }

    public final void A0N() {
        ((C19110xm) this.A2g.get()).A00(AnonymousClass11C.class);
    }

    public final void A0O() {
        if (this.A0J != null) {
            Ringtone ringtone = this.A0H;
            if (ringtone != null) {
                try {
                    if (!ringtone.isPlaying()) {
                        A0R();
                    }
                } catch (NullPointerException e2) {
                    if (Build.VERSION.SDK_INT != 22 || !"oppo".equalsIgnoreCase(Build.MANUFACTURER)) {
                        throw e2;
                    }
                    Log.e("voip/loadAndPlayRingtone error while playing existing ringtone", e2);
                }
            } else if (this.A0c == null) {
                C78733yb r4 = new C78733yb(this.A1X, this.A1s);
                this.A0c = r4;
                this.A2c.Ack(r4, this.A0J);
            }
        }
    }

    public final void A0P() {
        AnonymousClass1ZF r0;
        Log.i("voip/ear-far");
        AnonymousClass00B.A01();
        this.A1A = false;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && callInfo.isEitherSideRequestingUpgrade()) {
            AnonymousClass1ZF r02 = this.A0a;
            if (r02 != null) {
                r02.Ahj(callInfo);
            }
            this.A1k.A06(callInfo, (Boolean) null);
        }
        if ((this.A0P == null || Build.VERSION.SDK_INT < 21) && (r0 = this.A0a) != null) {
            r0.AVT(false);
        }
    }

    public final void A0Q() {
        AnonymousClass1ZF r0;
        Log.i("voip/ear-near");
        AnonymousClass00B.A01();
        this.A1A = true;
        CallInfo callInfo = Voip.getCallInfo();
        if (this.A1S || (callInfo != null && callInfo.isEitherSideRequestingUpgrade())) {
            AnonymousClass26Z r2 = this.A1k;
            boolean z2 = true;
            if (r2.A00 != 1) {
                z2 = false;
            }
            if (z2) {
                r2.A09(callInfo, false);
            }
            this.A1S = false;
        }
        if ((this.A0P == null || Build.VERSION.SDK_INT < 21) && (r0 = this.A0a) != null) {
            r0.AVT(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r0.getRingerMode() != 2) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R() {
        /*
            r7 = this;
            android.media.Ringtone r0 = r7.A0H
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.isPlaying()
            if (r0 != 0) goto L_0x003d
            android.media.Ringtone r0 = r7.A0H
            r0.play()
            int r0 = r7.A05
            r4 = 1
            int r0 = r0 + 1
            r7.A05 = r0
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 == 0) goto L_0x003d
            boolean r0 = r6.isGroupCall
            if (r0 == 0) goto L_0x003d
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x003d
            X.01V r5 = r7.A2C
            android.media.AudioManager r0 = r5.A0G()
            if (r0 == 0) goto L_0x0036
            int r1 = r0.getRingerMode()
            r0 = 2
            r3 = 1
            if (r1 == r0) goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            long[] r0 = r7.A1V
            if (r0 == 0) goto L_0x003e
            if (r3 != 0) goto L_0x003e
        L_0x003d:
            return
        L_0x003e:
            boolean r2 = r7.A11(r6)
            long[] r0 = r7.A1V
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = "voip/vibrate/stop"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Vibrator r0 = r5.A0K()
            X.AnonymousClass00B.A06(r0)
            r0.cancel()
            r0 = 0
            r7.A1V = r0
        L_0x0059:
            com.whatsapp.jid.UserJid r0 = r6.getPeerJid()
            X.AnonymousClass00B.A06(r0)
            com.whatsapp.jid.UserJid r1 = r6.getPeerJid()
            com.whatsapp.jid.UserJid r0 = r6.getPeerJid()
            long[] r0 = r7.A13(r0, r2, r3)
            if (r2 != 0) goto L_0x0074
            if (r3 != 0) goto L_0x0074
        L_0x0070:
            r7.A0h(r1, r0, r4)
            return
        L_0x0074:
            r4 = 0
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0R():void");
    }

    public final void A0S() {
        Object obj = this.A0x;
        if (obj != null) {
            try {
                ((AcousticEchoCanceler) obj).release();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
        this.A0x = null;
        Object obj2 = this.A0y;
        if (obj2 != null) {
            try {
                ((AutomaticGainControl) obj2).release();
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        this.A0y = null;
        Object obj3 = this.A0z;
        if (obj3 != null) {
            try {
                ((NoiseSuppressor) obj3).release();
            } catch (Throwable th3) {
                Log.e(th3);
            }
        }
        this.A0z = null;
    }

    public final void A0T() {
        AnonymousClass00B.A01();
        try {
            if (this.A0P != null) {
                Log.i("voip/service/releaseProximityWakeLock");
                this.A0P.release();
                this.A0P = null;
            }
        } catch (Exception e2) {
            Log.e((Throwable) e2);
            this.A0P = null;
        }
        AnonymousClass4L9 r3 = this.A0f;
        SensorEventListener sensorEventListener = r3.A00;
        if (sensorEventListener != null) {
            r3.A02.unregisterListener(sensorEventListener, r3.A01);
            r3.A00 = null;
        }
        this.A1A = false;
    }

    public final void A0U() {
        A0T();
        AnonymousClass00B.A01();
        try {
            if (this.A0O != null) {
                Log.i("voip/service/releasePartialWakeLock");
                this.A0O.release();
                this.A0O = null;
            }
        } catch (Exception e2) {
            Log.e((Throwable) e2);
            this.A0O = null;
        }
    }

    public final void A0V() {
        Point point = new Point();
        this.A2C.A0O().getDefaultDisplay().getSize(point);
        Voip.setScreenSize(point.x, point.y);
    }

    public void A0W(int i2, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("end_call_reason", i2);
        if (str != null) {
            bundle.putString("end_call_string", str);
        }
        this.A1u.A00(new C204710g("hangup_call", bundle));
    }

    public final void A0X(int i2, String str, boolean z2) {
        CallInfo callInfo = Voip.getCallInfo();
        if (!Voip.A08(callInfo)) {
            Log.w("voip/service/acceptCall No active call");
            return;
        }
        boolean equals = str.equals(callInfo.callWaitingInfo.A04);
        if (i2 != 0) {
            A0A(str).A00 = Integer.valueOf(i2);
        }
        if (!equals) {
            this.A16 = true;
            A0K();
            AnonymousClass26Z r1 = this.A1k;
            if (r1.A00 == 1) {
                r1.A09(callInfo, false);
            }
            A0s(CallState.ACCEPT_SENT, str);
        }
        this.A14.schedule(new C1044655m(this, str, equals, z2), 100, TimeUnit.MILLISECONDS);
    }

    public void A0Y(long j2) {
        StringBuilder sb = new StringBuilder("VoiceService/delayShowingIncomingCall delay = ");
        sb.append(j2);
        Log.i(sb.toString());
        this.A0L.removeMessages(1);
        this.A0L.sendEmptyMessageDelayed(1, j2);
    }

    public final void A0Z(C613638p r14) {
        C613638p r5 = r14;
        Jid jid = r14.A01;
        String str = r14.A04;
        VoipStanzaChildNode voipStanzaChildNode = r14.A03;
        String A002 = C224718b.A00(this.A1d, this.A2D, false);
        this.A10 = A002;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : r14.A05.entrySet()) {
            Object key = entry.getKey();
            if (entry.getValue() != null) {
                hashMap.put(key, entry.getValue());
            }
        }
        Set keySet = hashMap.keySet();
        boolean z2 = !keySet.isEmpty();
        if (z2) {
            for (Object next : keySet) {
                if (this.A1y.A0K.contains(next)) {
                    StringBuilder sb = new StringBuilder("VoiceService:sendOfferStanza waiting for PreKey job finishes with ");
                    sb.append(next);
                    Log.i(sb.toString());
                    this.A2q = r14;
                    return;
                }
            }
        }
        AnonymousClass3I4 r4 = new AnonymousClass3I4(r5, this, jid, voipStanzaChildNode, str, A002, hashMap, z2);
        if (z2) {
            this.A02 = this.A1j.A01().getInt("call_start_delay", 0);
            CallInfo callInfo = Voip.getCallInfo();
            int i2 = this.A02;
            if (i2 <= 0 || i2 >= 3000 || callInfo == null || callInfo.callState != CallState.CALLING || r14.A00 != 0) {
                Log.i("VoiceService:sendOfferStanza without delay");
                this.A14.execute(r4);
                return;
            }
            StringBuilder sb2 = new StringBuilder("VoiceService:sendOfferStanza with ");
            sb2.append(i2);
            sb2.append(" ms delay");
            Log.i(sb2.toString());
            this.A2u = true;
            this.A14.schedule(r4, (long) this.A02, TimeUnit.MILLISECONDS);
            return;
        }
        r4.run();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02e5, code lost:
        if (r0.A1B != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e7, code lost:
        A0m(com.whatsapp.voipcalling.Voip.getCallInfo(), 1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02f0, code lost:
        r2 = r12.A01;
        X.AnonymousClass00B.A06(r2);
        r5 = r2.obj;
        X.AnonymousClass00B.A06(r5);
        r0.A14.execute(new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1(r0, 43, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0308, code lost:
        r2 = r12.A01;
        X.AnonymousClass00B.A06(r2);
        r4 = r2.obj;
        X.AnonymousClass00B.A06(r4);
        r4 = (java.lang.String) r4;
        r6 = r2.arg2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0318, code lost:
        if (r2.arg1 != 1) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x031a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0322, code lost:
        if (com.whatsapp.voipcalling.Voip.getCurrentCallState() == com.whatsapp.voipcalling.CallState.NONE) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0324, code lost:
        r2 = com.whatsapp.voipcalling.Voip.getCurrentCallId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0328, code lost:
        if (r2 == null) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x032a, code lost:
        r3 = A0D(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x032e, code lost:
        if (r3 == null) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0332, code lost:
        if (r3.A0G == null) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x033c, code lost:
        if (r3.A0G.A02.equals(r4) == false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x033e, code lost:
        r3 = r0.A1X;
        r3.startActivity(X.C14750ph.A0b(r3, java.lang.Boolean.valueOf(!r0.A1Z.A00), (java.lang.Boolean) null, java.lang.Boolean.TRUE, (java.lang.Boolean) null, (java.util.List) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0358, code lost:
        r3 = r0.A1c;
        r2 = com.obwhatsapp.R.string.str083c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0364, code lost:
        if (r0.A26.A0A() != false) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0366, code lost:
        r3 = r0.A1c;
        r2 = com.obwhatsapp.R.string.str034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x036b, code lost:
        r3.A09(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0370, code lost:
        r2 = new java.lang.StringBuilder("voip/actionPreviewCallLink starting token:");
        r2.append(r4);
        com.whatsapp.util.Log.i(r2.toString());
        r0.A14.execute(new com.facebook.redex.RunnableRunnableShape0S1111000_I0(r0, r4, r6, 1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0394, code lost:
        r2 = r12.A01;
        X.AnonymousClass00B.A06(r2);
        r5 = r2.obj;
        X.AnonymousClass00B.A06(r5);
        r5 = (X.AnonymousClass2R6) r5;
        r3 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03a4, code lost:
        if (r3 <= 0) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a6, code lost:
        r0.A0u = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03ac, code lost:
        r6 = r5.A04;
        X.AnonymousClass00B.A06(r6);
        r5 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03b9, code lost:
        if (com.whatsapp.voipcalling.Voip.getCurrentCallState() == com.whatsapp.voipcalling.CallState.NONE) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03bb, code lost:
        com.whatsapp.util.Log.e("voip/actionStartFromCallLog can't start, a call is already ongoing");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03c3, code lost:
        r4 = X.C30341cC.A0A(r6.A0C.A02);
        r2 = new java.lang.StringBuilder("voip/actionStartFromCallLog starting callId:");
        r2.append(r4);
        com.whatsapp.util.Log.i(r2.toString());
        r0.A14.execute(new com.facebook.redex.RunnableRunnableShape0S1301000_I0(r0, r6.A04(), r6, r4, r5, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03f2, code lost:
        A0m(com.whatsapp.voipcalling.Voip.getCallInfo(), r6.getInt("notification_type", 2), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0403, code lost:
        if (r0.A1P == false) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0405, code lost:
        r3 = r0.A24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x040b, code lost:
        if (r3.A00() != false) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0411, code lost:
        if (r3.A01() == false) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0413, code lost:
        r3 = r0.A1X;
        r3.startActivity(X.C14750ph.A0b(r3, java.lang.Boolean.valueOf(!r0.A1Z.A00), (java.lang.Boolean) null, java.lang.Boolean.TRUE, (java.lang.Boolean) null, (java.util.List) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x042e, code lost:
        if (r0.A1P != false) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0436, code lost:
        if (r0.A24.A01() == false) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0438, code lost:
        r2 = com.whatsapp.voipcalling.Voip.getCallLinkInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x043c, code lost:
        if (r2 == null) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x043e, code lost:
        r2 = r2.linkState;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0440, code lost:
        if (r2 == 1) goto L_0x0444;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0442, code lost:
        if (r2 != 2) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0444, code lost:
        r0.A0L.removeMessages(50);
        r0.A0L.obtainMessage(50).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0454, code lost:
        r0.A1P = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0458, code lost:
        A2x.getAndIncrement();
        r5 = r12.A01;
        X.AnonymousClass00B.A06(r5);
        r0.A14.execute(new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1(r0, 39, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0470, code lost:
        r2 = r12.A01;
        X.AnonymousClass00B.A06(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0477, code lost:
        if (r2.arg1 != 1) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0479, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x047a, code lost:
        r0.A14.execute(new com.facebook.redex.RunnableRunnableShape0S0110000_I0(r0, 7, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        com.whatsapp.util.Log.w("voip/service/cmd/unknown-action");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        r4 = new java.lang.StringBuilder("voip/service/cmd/");
        r4.append(r1);
        r4.append(" elapsed ");
        r4.append(android.os.SystemClock.elapsedRealtime() - r16);
        r4.append(" ms");
        com.whatsapp.util.Log.i(r4.toString());
        r2 = r0.A24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c9, code lost:
        if (r2.A00() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
        if (r2.A01() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        A0M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (com.whatsapp.voipcalling.Voip.A07() == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        if (r1.equals("start_foreground_service_from_push") == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
        if (r1.equals("check_ongoing_calls") == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f2, code lost:
        if (r1.equals("preview_call_link") == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        if (r1.equals("refresh_notification") == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010c, code lost:
        if (r1.equals("reject_call") == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0116, code lost:
        if (r1.equals("show_voip_activity") == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011d, code lost:
        if (r1.equals("receive_message") == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0125, code lost:
        if (r1.equals("create_call_link") == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0134, code lost:
        switch(r2) {
            case 0: goto L_0x0176;
            case 1: goto L_0x02e3;
            case 2: goto L_0x02f0;
            case 3: goto L_0x0308;
            case 4: goto L_0x0394;
            case 5: goto L_0x03f2;
            case 6: goto L_0x0148;
            case 7: goto L_0x0401;
            case 8: goto L_0x0458;
            case 9: goto L_0x0470;
            default: goto L_0x0137;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0137, code lost:
        A0n((com.whatsapp.voipcalling.CallInfo) null, r6.getString("end_call_string"), r6.getInt("end_call_reason"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0148, code lost:
        r2 = com.whatsapp.voipcalling.Voip.getCallInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014c, code lost:
        if (r2 == null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014e, code lost:
        r4 = r2.groupJid;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0150, code lost:
        if (r4 != null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0152, code lost:
        r4 = r2.getCreatorJid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0156, code lost:
        if (r4 == null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0158, code lost:
        r0.A2A.A09(r4, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015e, code lost:
        A0w(r6.getString("call_id"), (java.lang.String) null, r6.getInt("call_ui_action", 0));
        r0.A2E.A03(7, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0176, code lost:
        r2 = r12.A01;
        X.AnonymousClass00B.A06(r2);
        r5 = r2.obj;
        X.AnonymousClass00B.A06(r5);
        r5 = (X.AnonymousClass2R6) r5;
        r0.A0l = java.lang.Integer.valueOf(r5.A01);
        r2 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018e, code lost:
        if (r2 <= 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0190, code lost:
        r0.A0u = java.lang.Long.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0196, code lost:
        r3 = r5.A05;
        r40 = r5.A06;
        r13 = r5.A07;
        r12 = r5.A03;
        r6 = new java.util.ArrayList(r40.keySet());
        X.AnonymousClass00B.A0B("Trying start a call with empty list of jids", !r6.isEmpty());
        r5 = new java.lang.StringBuilder("voip/actionStartNewOutgoingCall callId: ");
        r5.append(r3);
        r5.append(" groupJid: ");
        r5.append(r12);
        com.whatsapp.util.Log.i(r5.toString());
        r8 = (com.whatsapp.jid.UserJid) r6.get(0);
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01db, code lost:
        if (r6.size() <= 1) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01dd, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01df, code lost:
        A0e(r12, r8, r3, true, r13, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f0, code lost:
        if (r0.A1Q == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f2, code lost:
        if (r13 == false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f4, code lost:
        A0V();
        r0.A2f.setRequestedCamera2SupportLevel(r0.A1j.A02(), r0.A1i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0204, code lost:
        r2 = r0.A2L;
        r10 = X.C30341cC.A0B(r3);
        r31 = r0.A2D.A00();
        r4.A0B();
        r15 = r4.A04;
        X.AnonymousClass00B.A06(r15);
        r4 = new X.C35011lE(-1, r8, r10, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0228, code lost:
        if (r2.A0I.A0E(X.C16620tM.A02, 2843) == false) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022a, code lost:
        r2.A05.A01(new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4(r2, 6, r4), 61);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0237, code lost:
        r20 = r15;
        r2.A05.A01(new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4(r2, 7, new X.C37831po((X.C38591r2) null, r20, (com.whatsapp.jid.GroupJid) null, (X.C38601r3) null, r4, (X.C38571r0) null, (java.lang.String) null, java.util.Collections.emptyList(), 0, 0, -1, r31, 0, r13, false, false, false, false)), 15);
        r8 = com.whatsapp.voipcalling.Voip.startCall(r3, (com.whatsapp.voipcalling.CallParticipantJid[]) r40.values().toArray(new com.whatsapp.voipcalling.CallParticipantJid[0]), r13, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x027d, code lost:
        if (r8 == 0) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027f, code lost:
        r2 = new java.lang.StringBuilder("voip/actionStartNewOutgoingCall failed to start call ");
        r2.append(r3);
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0295, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0297, code lost:
        r3 = A0B(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029b, code lost:
        if (r3 == null) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029d, code lost:
        r3.A01(9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a5, code lost:
        if (r8 == 670001) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a7, code lost:
        A0r(com.whatsapp.voipcalling.CallState.NONE, (com.whatsapp.voipcalling.CallInfo) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ae, code lost:
        r2.A07(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b2, code lost:
        r4 = r0.A1X;
        r9 = java.lang.Boolean.valueOf(!r0.A1Z.A00);
        r10 = java.lang.Boolean.valueOf(r13);
        r11 = java.lang.Boolean.TRUE;
        r4.startActivity(X.C14750ph.A0b(r4, r9, r10, r11, r11, r6));
        r0.A14.execute(new com.facebook.redex.RunnableRunnableShape0S1200000_I0(r6, r3, r0, 17));
        A0m(com.whatsapp.voipcalling.Voip.getCallInfo(), 2, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(X.C204710g r42) {
        /*
            r41 = this;
            r12 = r42
            java.lang.String r1 = r12.A02
            java.lang.String r2 = "voip/service/cmd command="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r41
            X.0pd r2 = r0.A2O
            X.0sK r4 = r0.A1d
            boolean r2 = X.C32601gl.A04(r4, r2)
            r5 = 0
            r9 = 1
            if (r2 == 0) goto L_0x002b
            boolean r2 = com.whatsapp.voipcalling.Voip.A07()
            r7 = 1
            if (r2 != 0) goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r6 = r0.A1Q
            java.lang.String r14 = "hangup_call"
            java.lang.String r13 = "create_call_link"
            java.lang.String r11 = "start_from_call_log"
            java.lang.String r10 = "preview_call_link"
            java.lang.String r8 = "check_ongoing_calls"
            java.lang.String r3 = "start_call"
            java.lang.String r2 = "receive_message"
            if (r6 != 0) goto L_0x0073
            if (r7 != 0) goto L_0x0073
            boolean r6 = r2.equals(r1)
            if (r6 != 0) goto L_0x0073
            boolean r6 = r3.equals(r1)
            if (r6 != 0) goto L_0x0073
            boolean r6 = r11.equals(r1)
            if (r6 != 0) goto L_0x0073
            boolean r6 = r14.equals(r1)
            if (r6 != 0) goto L_0x0073
            boolean r6 = r8.equals(r1)
            if (r6 != 0) goto L_0x0073
            boolean r6 = r13.equals(r1)
            if (r6 != 0) goto L_0x0073
            boolean r6 = r10.equals(r1)
            if (r6 != 0) goto L_0x0073
            java.lang.String r0 = "voip/service/cmd/not-started"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0072:
            return
        L_0x0073:
            boolean r6 = r0.A1R
            if (r6 == 0) goto L_0x0083
            java.lang.String r1 = "voip/service/cmd VoiceService is stopping, restart the service with the same command later."
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.util.List r0 = r0.A2h
            r0.add(r12)
            return
        L_0x0083:
            android.os.Bundle r6 = r12.A00
            if (r6 != 0) goto L_0x008c
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L_0x008c:
            long r16 = android.os.SystemClock.elapsedRealtime()
            int r15 = r1.hashCode()
            r7 = 2
            switch(r15) {
                case -1573659621: goto L_0x00d5;
                case -1233448890: goto L_0x00dd;
                case -1026884326: goto L_0x00e7;
                case -921141884: goto L_0x00ee;
                case 76499387: goto L_0x00f5;
                case 1281366991: goto L_0x00fd;
                case 1331833598: goto L_0x0106;
                case 1377948940: goto L_0x010f;
                case 1444513451: goto L_0x0119;
                case 1591822776: goto L_0x0121;
                case 2138982608: goto L_0x0129;
                default: goto L_0x0098;
            }
        L_0x0098:
            java.lang.String r2 = "voip/service/cmd/unknown-action"
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x009e:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r16
            java.lang.String r5 = "voip/service/cmd/"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = " elapsed "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = " ms"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0vQ r2 = r0.A24
            boolean r1 = r2.A00()
            if (r1 != 0) goto L_0x0072
            boolean r1 = r2.A01()
            if (r1 != 0) goto L_0x0072
            r0.A0M()
            return
        L_0x00d5:
            boolean r2 = r1.equals(r3)
            if (r2 == 0) goto L_0x0098
            r2 = 0
            goto L_0x0131
        L_0x00dd:
            java.lang.String r2 = "start_foreground_service_from_push"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x02e3
            goto L_0x0098
        L_0x00e7:
            boolean r2 = r1.equals(r8)
            if (r2 != 0) goto L_0x02f0
            goto L_0x0098
        L_0x00ee:
            boolean r2 = r1.equals(r10)
            if (r2 != 0) goto L_0x0308
            goto L_0x0098
        L_0x00f5:
            boolean r2 = r1.equals(r11)
            if (r2 == 0) goto L_0x0098
            r2 = 4
            goto L_0x0131
        L_0x00fd:
            java.lang.String r2 = "refresh_notification"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x03f2
            goto L_0x0098
        L_0x0106:
            java.lang.String r2 = "reject_call"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0148
            goto L_0x0098
        L_0x010f:
            java.lang.String r2 = "show_voip_activity"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0401
            goto L_0x0098
        L_0x0119:
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0458
            goto L_0x0098
        L_0x0121:
            boolean r2 = r1.equals(r13)
            if (r2 != 0) goto L_0x0470
            goto L_0x0098
        L_0x0129:
            boolean r2 = r1.equals(r14)
            if (r2 == 0) goto L_0x0098
            r2 = 10
        L_0x0131:
            r14 = 0
            r33 = 0
            switch(r2) {
                case 0: goto L_0x0176;
                case 1: goto L_0x02e3;
                case 2: goto L_0x02f0;
                case 3: goto L_0x0308;
                case 4: goto L_0x0394;
                case 5: goto L_0x03f2;
                case 6: goto L_0x0148;
                case 7: goto L_0x0401;
                case 8: goto L_0x0458;
                case 9: goto L_0x0470;
                default: goto L_0x0137;
            }
        L_0x0137:
            java.lang.String r2 = "end_call_string"
            java.lang.String r3 = r6.getString(r2)
            java.lang.String r2 = "end_call_reason"
            int r2 = r6.getInt(r2)
            r0.A0n(r14, r3, r2)
            goto L_0x009e
        L_0x0148:
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r2 == 0) goto L_0x015e
            com.whatsapp.jid.GroupJid r4 = r2.groupJid
            if (r4 != 0) goto L_0x0158
            com.whatsapp.jid.UserJid r4 = r2.getCreatorJid()
            if (r4 == 0) goto L_0x015e
        L_0x0158:
            X.15I r3 = r0.A2A
            r2 = 6
            r3.A09(r4, r2)
        L_0x015e:
            java.lang.String r2 = "call_id"
            java.lang.String r3 = r6.getString(r2)
            java.lang.String r2 = "call_ui_action"
            int r2 = r6.getInt(r2, r5)
            r4 = 0
            r0.A0w(r3, r4, r2)
            X.0yL r3 = r0.A2E
            r2 = 7
            r3.A03(r2, r4)
            goto L_0x009e
        L_0x0176:
            android.os.Message r2 = r12.A01
            X.AnonymousClass00B.A06(r2)
            java.lang.Object r5 = r2.obj
            X.AnonymousClass00B.A06(r5)
            X.2R6 r5 = (X.AnonymousClass2R6) r5
            int r2 = r5.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.A0l = r2
            long r2 = r5.A00
            int r6 = (r2 > r33 ? 1 : (r2 == r33 ? 0 : -1))
            if (r6 <= 0) goto L_0x0196
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.A0u = r2
        L_0x0196:
            java.lang.String r3 = r5.A05
            java.util.LinkedHashMap r2 = r5.A06
            r40 = r2
            boolean r13 = r5.A07
            com.whatsapp.jid.GroupJid r12 = r5.A03
            java.util.Set r2 = r40.keySet()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r2)
            boolean r2 = r6.isEmpty()
            r5 = r2 ^ 1
            java.lang.String r2 = "Trying start a call with empty list of jids"
            X.AnonymousClass00B.A0B(r2, r5)
            java.lang.String r2 = "voip/actionStartNewOutgoingCall callId: "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            r5.append(r3)
            java.lang.String r2 = " groupJid: "
            r5.append(r2)
            r5.append(r12)
            java.lang.String r2 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r5 = 0
            java.lang.Object r8 = r6.get(r5)
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            int r2 = r6.size()
            r24 = 0
            if (r2 <= r9) goto L_0x01df
            r24 = 1
        L_0x01df:
            r22 = 1
            r18 = r0
            r19 = r12
            r20 = r8
            r21 = r3
            r23 = r13
            r18.A0e(r19, r20, r21, r22, r23, r24)
            boolean r2 = r0.A1Q
            if (r2 == 0) goto L_0x009e
            if (r13 == 0) goto L_0x0204
            r0.A0V()
            com.whatsapp.voipcalling.camera.VoipCameraManager r11 = r0.A2f
            X.1OL r2 = r0.A1j
            java.lang.String r10 = r2.A02()
            X.1Bz r2 = r0.A1i
            r11.setRequestedCamera2SupportLevel(r10, r2)
        L_0x0204:
            X.1D0 r2 = r0.A2L
            java.lang.String r10 = X.C30341cC.A0B(r3)
            X.0t3 r11 = r0.A2D
            long r31 = r11.A00()
            r4.A0B()
            X.1Za r15 = r4.A04
            X.AnonymousClass00B.A06(r15)
            r11 = -1
            X.1lE r4 = new X.1lE
            r4.<init>(r11, r8, r10, r9)
            X.0pd r10 = r2.A0I
            r9 = 2843(0xb1b, float:3.984E-42)
            X.0tM r8 = X.C16620tM.A02
            boolean r8 = r10.A0E(r8, r9)
            if (r8 == 0) goto L_0x02ae
            X.126 r10 = r2.A05
            r8 = 6
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r9 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r9.<init>(r2, r8, r4)
            r8 = 61
            r10.A01(r9, r8)
        L_0x0237:
            java.util.List r26 = java.util.Collections.emptyList()
            r29 = -1
            X.1po r8 = new X.1po
            r22 = r14
            r24 = r14
            r25 = r14
            r27 = 0
            r28 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r19 = r14
            r23 = r4
            r35 = r13
            r18 = r8
            r20 = r15
            r21 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r36, r37, r38, r39)
            X.126 r9 = r2.A05
            r10 = 7
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r4 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r4.<init>(r2, r10, r8)
            r2 = 15
            r9.A01(r4, r2)
            java.util.Collection r4 = r40.values()
            com.whatsapp.voipcalling.CallParticipantJid[] r2 = new com.whatsapp.voipcalling.CallParticipantJid[r5]
            java.lang.Object[] r2 = r4.toArray(r2)
            com.whatsapp.voipcalling.CallParticipantJid[] r2 = (com.whatsapp.voipcalling.CallParticipantJid[]) r2
            int r8 = com.whatsapp.voipcalling.Voip.startCall(r3, r2, r13, r12)
            if (r8 == 0) goto L_0x02b2
            java.lang.String r4 = "voip/actionStartNewOutgoingCall failed to start call "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r4 < r2) goto L_0x02a2
            X.3M9 r3 = r0.A0B(r3)
            if (r3 == 0) goto L_0x02a2
            r2 = 9
            r3.A01(r2)
        L_0x02a2:
            r2 = 670001(0xa3931, float:9.38871E-40)
            if (r8 == r2) goto L_0x009e
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.NONE
            r0.A0r(r2, r14)
            goto L_0x009e
        L_0x02ae:
            r2.A07(r4)
            goto L_0x0237
        L_0x02b2:
            android.content.Context r4 = r0.A1X
            X.0tH r2 = r0.A1Z
            boolean r2 = r2.A00
            r2 = r2 ^ 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r13)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r12 = r11
            r13 = r6
            r8 = r4
            android.content.Intent r2 = X.C14750ph.A0b(r8, r9, r10, r11, r12, r13)
            r4.startActivity(r2)
            java.util.concurrent.ScheduledExecutorService r8 = r0.A14
            r4 = 17
            com.facebook.redex.RunnableRunnableShape0S1200000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S1200000_I0
            r2.<init>(r6, r3, r0, r4)
            r8.execute(r2)
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0.A0m(r2, r7, r5)
            goto L_0x009e
        L_0x02e3:
            boolean r2 = r0.A1B
            if (r2 != 0) goto L_0x009e
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0.A0m(r2, r9, r5)
            goto L_0x009e
        L_0x02f0:
            android.os.Message r2 = r12.A01
            X.AnonymousClass00B.A06(r2)
            java.lang.Object r5 = r2.obj
            X.AnonymousClass00B.A06(r5)
            java.util.concurrent.ScheduledExecutorService r4 = r0.A14
            r3 = 43
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r2 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1
            r2.<init>(r0, r3, r5)
            r4.execute(r2)
            goto L_0x009e
        L_0x0308:
            android.os.Message r2 = r12.A01
            X.AnonymousClass00B.A06(r2)
            java.lang.Object r4 = r2.obj
            X.AnonymousClass00B.A06(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.arg2
            int r2 = r2.arg1
            if (r2 != r9) goto L_0x031b
            r5 = 1
        L_0x031b:
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.NONE
            r7 = 0
            if (r3 == r2) goto L_0x035e
            java.lang.String r2 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r2 == 0) goto L_0x0358
            X.1po r3 = r0.A0D(r2)
            if (r3 == 0) goto L_0x0358
            X.1r2 r2 = r3.A0G
            if (r2 == 0) goto L_0x0358
            X.1r2 r2 = r3.A0G
            java.lang.String r2 = r2.A02
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0358
            android.content.Context r3 = r0.A1X
            r5 = 0
            X.0tH r2 = r0.A1Z
            boolean r2 = r2.A00
            r2 = r2 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r8 = r5
            r7 = r5
            android.content.Intent r2 = X.C14750ph.A0b(r3, r4, r5, r6, r7, r8)
            r3.startActivity(r2)
            goto L_0x009e
        L_0x0358:
            X.0pt r3 = r0.A1c
            r2 = 2131888188(0x7f12083c, float:1.9411004E38)
            goto L_0x036b
        L_0x035e:
            X.0wP r2 = r0.A26
            boolean r2 = r2.A0A()
            if (r2 != 0) goto L_0x0370
            X.0pt r3 = r0.A1c
            r2 = 2131886923(0x7f12034b, float:1.9408439E38)
        L_0x036b:
            r3.A09(r2, r7)
            goto L_0x009e
        L_0x0370:
            java.lang.String r3 = "voip/actionPreviewCallLink starting token:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.util.concurrent.ScheduledExecutorService r3 = r0.A14
            com.facebook.redex.RunnableRunnableShape0S1111000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S1111000_I0
            r11 = 1
            r7 = r2
            r8 = r0
            r9 = r4
            r10 = r6
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r3.execute(r2)
            goto L_0x009e
        L_0x0394:
            android.os.Message r2 = r12.A01
            X.AnonymousClass00B.A06(r2)
            java.lang.Object r5 = r2.obj
            X.AnonymousClass00B.A06(r5)
            X.2R6 r5 = (X.AnonymousClass2R6) r5
            long r3 = r5.A00
            int r2 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
            if (r2 <= 0) goto L_0x03ac
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r0.A0u = r2
        L_0x03ac:
            X.1po r6 = r5.A04
            X.AnonymousClass00B.A06(r6)
            int r5 = r5.A02
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r2) goto L_0x03c3
            java.lang.String r2 = "voip/actionStartFromCallLog can't start, a call is already ongoing"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x009e
        L_0x03c3:
            X.1lE r2 = r6.A0C
            java.lang.String r2 = r2.A02
            java.lang.String r4 = X.C30341cC.A0A(r2)
            java.lang.String r3 = "voip/actionStartFromCallLog starting callId:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.util.List r9 = r6.A04()
            java.util.concurrent.ScheduledExecutorService r2 = r0.A14
            r13 = 0
            com.facebook.redex.RunnableRunnableShape0S1301000_I0 r7 = new com.facebook.redex.RunnableRunnableShape0S1301000_I0
            r8 = r0
            r10 = r6
            r11 = r4
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r2.execute(r7)
            goto L_0x009e
        L_0x03f2:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            java.lang.String r2 = "notification_type"
            int r2 = r6.getInt(r2, r7)
            r0.A0m(r3, r2, r5)
            goto L_0x009e
        L_0x0401:
            boolean r2 = r0.A1P
            if (r2 == 0) goto L_0x042c
            X.0vQ r3 = r0.A24
            boolean r2 = r3.A00()
            if (r2 != 0) goto L_0x0413
            boolean r2 = r3.A01()
            if (r2 == 0) goto L_0x042c
        L_0x0413:
            android.content.Context r3 = r0.A1X
            r12 = 0
            X.0tH r2 = r0.A1Z
            boolean r2 = r2.A00
            r2 = r2 ^ 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r15 = r12
            r14 = r12
            r10 = r3
            android.content.Intent r2 = X.C14750ph.A0b(r10, r11, r12, r13, r14, r15)
            r3.startActivity(r2)
        L_0x042c:
            boolean r2 = r0.A1P
            if (r2 != 0) goto L_0x0454
            X.0vQ r2 = r0.A24
            boolean r2 = r2.A01()
            if (r2 == 0) goto L_0x0454
            com.whatsapp.voipcalling.CallLinkInfo r2 = com.whatsapp.voipcalling.Voip.getCallLinkInfo()
            if (r2 == 0) goto L_0x0454
            int r2 = r2.linkState
            if (r2 == r9) goto L_0x0444
            if (r2 != r7) goto L_0x0454
        L_0x0444:
            android.os.Handler r2 = r0.A0L
            r3 = 50
            r2.removeMessages(r3)
            android.os.Handler r2 = r0.A0L
            android.os.Message r2 = r2.obtainMessage(r3)
            r2.sendToTarget()
        L_0x0454:
            r0.A1P = r5
            goto L_0x009e
        L_0x0458:
            java.util.concurrent.atomic.AtomicInteger r2 = A2x
            r2.getAndIncrement()
            android.os.Message r5 = r12.A01
            X.AnonymousClass00B.A06(r5)
            java.util.concurrent.ScheduledExecutorService r4 = r0.A14
            r3 = 39
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r2 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1
            r2.<init>(r0, r3, r5)
            r4.execute(r2)
            goto L_0x009e
        L_0x0470:
            android.os.Message r2 = r12.A01
            X.AnonymousClass00B.A06(r2)
            int r2 = r2.arg1
            if (r2 != r9) goto L_0x047a
            r5 = 1
        L_0x047a:
            java.util.concurrent.ScheduledExecutorService r4 = r0.A14
            r3 = 7
            com.facebook.redex.RunnableRunnableShape0S0110000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0110000_I0
            r2.<init>(r0, r3, r5)
            r4.execute(r2)
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0a(X.10g):void");
    }

    public void A0b(AnonymousClass1ZF r3) {
        StringBuilder sb = new StringBuilder("voip/service/resetVoipUiIfEquals ");
        sb.append(this);
        Log.i(sb.toString());
        if (this.A0a == r3) {
            this.A0a = null;
        }
    }

    public void A0c(AnonymousClass1ZF r8) {
        this.A0a = r8;
        if (Build.VERSION.SDK_INT >= 23) {
            for (StatusBarNotification statusBarNotification : this.A2T.A0M()) {
                if (statusBarNotification.getId() == 27) {
                    this.A2E.A03(27, statusBarNotification.getTag());
                }
            }
            return;
        }
        for (String A032 : this.A1j.A03()) {
            this.A2E.A03(27, A032);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d(com.whatsapp.fieldstats.events.WamCall r8, com.whatsapp.jid.UserJid r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15) {
        /*
            r7 = this;
            X.0wP r0 = r7.A26
            r1 = 1
            int r0 = r0.A04(r1)
            if (r0 != 0) goto L_0x0039
            r1 = 3
        L_0x000a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.callNetwork = r0
            X.0tK r2 = r7.A1f
            boolean r1 = r2.A08()
            r0 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x0029
            r8.xmppStatus = r3
        L_0x0024:
            java.lang.Boolean r0 = r7.A0h
            if (r0 != 0) goto L_0x004d
            goto L_0x003d
        L_0x0029:
            int r1 = r2.A03
            r0 = 1
            if (r1 != r0) goto L_0x0036
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.xmppStatus = r0
            goto L_0x0024
        L_0x0036:
            r8.xmppStatus = r4
            goto L_0x0024
        L_0x0039:
            if (r0 != r1) goto L_0x000a
            r1 = 2
            goto L_0x000a
        L_0x003d:
            boolean r0 = android.media.audiofx.AcousticEchoCanceler.isAvailable()     // Catch:{ all -> 0x0042 }
            goto L_0x0047
        L_0x0042:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x0047:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0h = r0
        L_0x004d:
            java.lang.Boolean r0 = r7.A0i
            if (r0 != 0) goto L_0x0061
            boolean r0 = android.media.audiofx.AutomaticGainControl.isAvailable()     // Catch:{ all -> 0x0056 }
            goto L_0x005b
        L_0x0056:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x005b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0i = r0
        L_0x0061:
            java.lang.Boolean r1 = r7.A0j
            if (r1 != 0) goto L_0x0075
            boolean r0 = android.media.audiofx.NoiseSuppressor.isAvailable()     // Catch:{ all -> 0x006a }
            goto L_0x006f
        L_0x006a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x006f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r7.A0j = r1
        L_0x0075:
            java.lang.Boolean r0 = r7.A0h
            r8.builtinAecAvailable = r0
            java.lang.Boolean r0 = r7.A0i
            r8.builtinAgcAvailable = r0
            r8.builtinNsAvailable = r1
            r8.callOfferElapsedT = r13
            r8.callFromUi = r10
            r8.callWakeupSource = r12
            r8.callPeerPlatform = r14
            r8.callPeerAppVersion = r15
            r1 = 0
            if (r9 == 0) goto L_0x00b8
            X.125 r0 = r7.A2U
            long r5 = r0.A01(r9)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            r8.peerXmppStatus = r3
        L_0x009f:
            if (r11 == 0) goto L_0x00ab
            long r0 = r11.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.callAndroidAudioMode = r0
        L_0x00ab:
            int r0 = android.os.Build.VERSION.SDK_INT
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.androidApiLevel = r0
            return
        L_0x00b5:
            r8.peerXmppStatus = r4
            goto L_0x009f
        L_0x00b8:
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.peerXmppStatus = r0
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0d(com.whatsapp.fieldstats.events.WamCall, com.whatsapp.jid.UserJid, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0367, code lost:
        if (r6 != null) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03c4, code lost:
        if (r6.A06(r1, java.lang.Boolean.valueOf(r5.A0a.A0D(r1))) == false) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x011a, code lost:
        if (r6 == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0288, code lost:
        if (r1.equals(r9.getString(com.obwhatsapp.R.string.str15c8)) != false) goto L_0x028a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0181 A[SYNTHETIC, Splitter:B:35:0x0181] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0e(com.whatsapp.jid.GroupJid r18, com.whatsapp.jid.UserJid r19, java.lang.String r20, boolean r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            X.AnonymousClass00B.A01()
            r3 = r17
            r0 = r22
            r3.A1M = r0
            java.lang.String r1 = "voip/service/start "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.A1Q
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = "voip/start/started, do nothing"
        L_0x0022:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0025:
            return
        L_0x0026:
            r4 = r20
            boolean r6 = r3.A12(r4)
            if (r6 != 0) goto L_0x0059
            android.telephony.TelephonyManager r5 = r3.A1Y
            X.0sj r0 = r3.A2F
            int r2 = X.C30341cC.A01(r5, r0)
            if (r21 == 0) goto L_0x004a
            if (r2 == 0) goto L_0x004a
            java.lang.String r1 = "voip/start/cellularCallInProgress "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x0022
        L_0x004a:
            if (r5 == 0) goto L_0x0059
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x0059
            android.telephony.PhoneStateListener r1 = r3.A0Q
            r0 = 32
            r5.listen(r1, r0)
        L_0x0059:
            long r14 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = "voip/device_info MANUFACTURER: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r2.append(r0)
            java.lang.String r0 = ", MODEL: "
            r2.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r2.append(r0)
            java.lang.String r0 = ", Device: "
            r2.append(r0)
            java.lang.String r0 = android.os.Build.DEVICE
            r2.append(r0)
            java.lang.String r0 = ", Board: "
            r2.append(r0)
            java.lang.String r0 = android.os.Build.BOARD
            r2.append(r0)
            java.lang.String r0 = ", Hardware: "
            r2.append(r0)
            java.lang.String r0 = android.os.Build.HARDWARE
            r2.append(r0)
            java.lang.String r0 = ", CPU_API: "
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass1U8.A02()
            r2.append(r0)
            java.lang.String r0 = ", OS: "
            r2.append(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r2.append(r0)
            java.lang.String r0 = ", Build: "
            r2.append(r0)
            java.lang.String r0 = android.os.Build.DISPLAY
            r2.append(r0)
            java.lang.String r0 = ", App: "
            r2.append(r0)
            java.lang.String r0 = "2.23.1.76"
            r2.append(r0)
            java.lang.String r0 = ", PowerSaving: "
            r2.append(r0)
            X.01V r7 = r3.A2C
            android.os.PowerManager r1 = r7.A0I()
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r10 < r0) goto L_0x00d5
            if (r1 != 0) goto L_0x017b
            java.lang.String r0 = "voip/service/start pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.media.AudioManager r16 = r7.A0G()
            r5 = 0
            r3.A1A = r5
            r3.A1S = r5
            r3.A1N = r5
            com.whatsapp.voipcalling.Voip.DebugTapType.values()
            r8 = 0
            r3.A2q = r8
            java.util.Map r0 = r3.A2k
            r0.clear()
            java.util.Map r0 = r3.A2l
            r0.clear()
            X.39S r0 = r3.A1y
            java.util.Set r0 = r0.A0K
            r0.clear()
            android.content.Context r9 = r3.A1X
            android.content.BroadcastReceiver r2 = r3.A0F
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r9.registerReceiver(r2, r0)
            X.26Z r1 = r3.A1k
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r2 = 1
            if (r10 < r0) goto L_0x011c
            r11 = 1
            if (r6 != 0) goto L_0x011d
        L_0x011c:
            r11 = 0
        L_0x011d:
            java.lang.String r10 = "voip/audio_route/onCallStart using telecom:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A05 = r11
            r1.A04 = r5
            r1.A07 = r5
            if (r11 != 0) goto L_0x0161
            X.4Wm r10 = r1.A09
            boolean r0 = r10.A03()
            r10.A01 = r0
            r10.A00()
            X.1B1 r0 = r1.A0G
            r0.A04(r1)
            android.content.Context r13 = r1.A08
            X.2nD r11 = r1.A0A
            java.lang.String r10 = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r10)
            android.content.Intent r11 = r13.registerReceiver(r11, r0)
            if (r11 == 0) goto L_0x0161
            r10 = -1
            java.lang.String r0 = "android.media.extra.SCO_AUDIO_STATE"
            int r0 = r11.getIntExtra(r0, r10)
            r1.A01 = r0
        L_0x0161:
            r1.A03 = r5
            r0 = 21
            if (r12 < r0) goto L_0x0173
            android.content.BroadcastReceiver r11 = r3.A0G
            java.lang.String r10 = "android.intent.action.USER_PRESENT"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r10)
            r9.registerReceiver(r11, r0)
        L_0x0173:
            X.AnonymousClass00B.A01()
            android.os.PowerManager$WakeLock r0 = r3.A0O
            if (r0 != 0) goto L_0x01a8
            goto L_0x0181
        L_0x017b:
            boolean r0 = r1.isPowerSaveMode()
            goto L_0x00d6
        L_0x0181:
            android.os.PowerManager r10 = r7.A0I()     // Catch:{ Exception -> 0x01a2 }
            if (r10 != 0) goto L_0x018e
            java.lang.String r0 = "voip/service/acquirePartialWakeLock pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x01a2 }
            goto L_0x01a8
        L_0x018e:
            java.lang.String r0 = "VoiceService"
            android.os.PowerManager$WakeLock r0 = X.C43421zy.A00(r10, r0, r2)     // Catch:{ Exception -> 0x01a2 }
            r3.A0O = r0     // Catch:{ Exception -> 0x01a2 }
            if (r0 == 0) goto L_0x01a8
            r0.acquire()     // Catch:{ Exception -> 0x01a2 }
            java.lang.String r0 = "voip/service/acquirePartialWakeLock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x01a2 }
            goto L_0x01a8
        L_0x01a2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r3.A0O = r8
        L_0x01a8:
            if (r16 == 0) goto L_0x01cf
            if (r6 != 0) goto L_0x01cf
            java.lang.String r0 = "audioManager "
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            int r0 = r16.getMode()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01V r0 = r1.A0E
            android.media.AudioManager r10 = r0.A0G()
            if (r10 != 0) goto L_0x02e2
            java.lang.String r0 = "result of audio focus for voice call: 0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01cf:
            if (r21 != 0) goto L_0x02dc
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x01f1
            boolean r0 = r3.A16
            if (r0 != 0) goto L_0x01f1
            boolean r12 = r3.A11(r8)
            r3.A05 = r5
            r10 = r19
            if (r6 == 0) goto L_0x021b
            int r0 = r3.A07
            if (r0 == 0) goto L_0x021b
            if (r23 != 0) goto L_0x0216
            r0 = r8
        L_0x01ee:
            r3.A0h(r10, r0, r5)
        L_0x01f1:
            r3.A0l = r8
        L_0x01f3:
            android.os.Handler r6 = r3.A0M
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.sendEmptyMessageDelayed(r5, r0)
            android.media.SoundPool r0 = r3.A0I
            if (r0 == 0) goto L_0x020a
            r3.A0s = r8
            java.util.Map r0 = r3.A2m
            r0.clear()
            android.media.SoundPool r0 = r3.A0I
            r0.release()
        L_0x020a:
            android.media.SoundPool r1 = new android.media.SoundPool
            r1.<init>(r2, r5, r5)
            r3.A0I = r1
            r0 = 2131820548(0x7f110004, float:1.9273814E38)
            goto L_0x0301
        L_0x0216:
            long[] r0 = r3.A13(r10, r12, r2)
            goto L_0x01ee
        L_0x021b:
            com.whatsapp.jid.UserJid r13 = com.whatsapp.voipcalling.Voip.getPeerJid()
            java.lang.String r1 = "voip/ringtone/play, telecom: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 != 0) goto L_0x023f
            java.lang.String r0 = "voip/ringtone/play/error/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0239:
            if (r23 != 0) goto L_0x01f1
            r3.A0h(r10, r8, r2)
            goto L_0x01f1
        L_0x023f:
            android.media.AudioManager r11 = r7.A0G()
            if (r11 == 0) goto L_0x0256
            int r1 = r11.getRingerMode()
            if (r1 == 0) goto L_0x0264
            if (r1 == r2) goto L_0x0260
            r0 = 2
            if (r1 != r0) goto L_0x0256
            java.lang.String r0 = "voip/ringtone/ringer_mode/normal"
        L_0x0253:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0256:
            boolean r0 = r3.A1K
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = "VoiceService/playRingtone Silencing ringtone for DND"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0239
        L_0x0260:
            java.lang.String r0 = "voip/ringtone/ringer_mode/vibrate"
            goto L_0x0253
        L_0x0264:
            java.lang.String r0 = "voip/ringtone/ringer_mode/silent"
            goto L_0x0253
        L_0x0268:
            X.0sf r1 = r3.A2a
            java.lang.String r0 = r13.getRawString()
            X.1WS r0 = r1.A07(r0)
            java.lang.String r1 = r0.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x028a
            r0 = 2131891656(0x7f1215c8, float:1.9418038E38)
            java.lang.String r0 = r9.getString(r0)
            boolean r0 = r1.equals(r0)
            r13 = 0
            if (r0 == 0) goto L_0x028b
        L_0x028a:
            r13 = 1
        L_0x028b:
            android.net.Uri r0 = r3.A0J
            if (r0 != 0) goto L_0x0239
            if (r13 != 0) goto L_0x0239
            if (r23 == 0) goto L_0x02c9
            java.lang.String r0 = "android.resource://"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r9.getPackageName()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r0 = 2131820551(0x7f110007, float:1.927382E38)
            if (r12 == 0) goto L_0x02ae
            r0 = 2131820557(0x7f11000d, float:1.9273832E38)
        L_0x02ae:
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L_0x02b5:
            android.net.Uri r0 = android.net.Uri.parse(r1)
            r3.A0J = r0
            if (r0 == 0) goto L_0x0239
            if (r11 == 0) goto L_0x02c4
            if (r6 != 0) goto L_0x02c4
            r11.setMode(r2)
        L_0x02c4:
            r3.A0O()
            goto L_0x0239
        L_0x02c9:
            java.lang.String r12 = "voip/ringtone/ "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x02b5
        L_0x02dc:
            r3.A0t = r8
            r3.A0n = r8
            goto L_0x01f3
        L_0x02e2:
            r0 = 41
            com.facebook.redex.RunnableRunnableShape4S0100000_I0_3 r11 = new com.facebook.redex.RunnableRunnableShape4S0100000_I0_3
            r11.<init>(r10, r0)
            X.0pd r12 = r1.A0F
            r10 = 2894(0xb4e, float:4.055E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r12.A0E(r0, r10)
            if (r0 == 0) goto L_0x02fc
            X.1WA r0 = r1.A0H
            r0.execute(r11)
            goto L_0x01cf
        L_0x02fc:
            r11.run()
            goto L_0x01cf
        L_0x0301:
            int r0 = r1.load(r9, r0, r2)     // Catch:{ NotFoundException -> 0x034a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x034a }
            r3.A0s = r0     // Catch:{ NotFoundException -> 0x034a }
            java.util.Map r10 = r3.A2m     // Catch:{ NotFoundException -> 0x034a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ NotFoundException -> 0x034a }
            android.media.SoundPool r1 = r3.A0I     // Catch:{ NotFoundException -> 0x034a }
            r0 = 2131820553(0x7f110009, float:1.9273824E38)
            int r0 = r1.load(r9, r0, r2)     // Catch:{ NotFoundException -> 0x034a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x034a }
            r10.put(r6, r0)     // Catch:{ NotFoundException -> 0x034a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ NotFoundException -> 0x034a }
            android.media.SoundPool r1 = r3.A0I     // Catch:{ NotFoundException -> 0x034a }
            r0 = 2131820556(0x7f11000c, float:1.927383E38)
            int r0 = r1.load(r9, r0, r2)     // Catch:{ NotFoundException -> 0x034a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x034a }
            r10.put(r6, r0)     // Catch:{ NotFoundException -> 0x034a }
            r0 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x034a }
            android.media.SoundPool r1 = r3.A0I     // Catch:{ NotFoundException -> 0x034a }
            r0 = 2131820544(0x7f110000, float:1.9273806E38)
            int r0 = r1.load(r9, r0, r2)     // Catch:{ NotFoundException -> 0x034a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x034a }
            r10.put(r6, r0)     // Catch:{ NotFoundException -> 0x034a }
            goto L_0x0358
        L_0x034a:
            r1 = move-exception
            java.lang.String r0 = "voip/service/start failed to load call sound set"
            com.whatsapp.util.Log.w(r0, r1)
            r3.A0s = r8
            java.util.Map r0 = r3.A2m
            r0.clear()
        L_0x0358:
            android.net.wifi.WifiManager r6 = r7.A0E
            if (r6 != 0) goto L_0x0369
            java.lang.String r0 = "wifi"
            java.lang.Object r6 = r7.A0S(r0, r5)
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6
            r7.A0E = r6
            if (r6 == 0) goto L_0x0419
        L_0x0369:
            boolean r0 = r6.isWifiEnabled()
            if (r0 == 0) goto L_0x0419
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x0419
            android.net.wifi.WifiInfo r0 = r6.getConnectionInfo()
            int r0 = r0.getRssi()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0w = r0
        L_0x0384:
            r0 = 0
            r3.A0E = r0
            r0 = -1
            r3.A0C = r0
            r3.A03 = r5
            r3.A1Q = r2
            X.C804844a.A00 = r2
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A09 = r0
            X.0rz r0 = r3.A2G
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "voip_call_id"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r4)
            r0.apply()
            X.14s r6 = r3.A2b
            X.0ul r5 = r3.A2P
            r0 = r18
            r1 = r0
            X.0sL r1 = (X.C16050sL) r1
            boolean r0 = r0 instanceof X.C16050sL
            if (r0 == 0) goto L_0x03c6
            X.0sO r0 = r5.A0a
            boolean r0 = r0.A0D(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r6.A06(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x03c7
        L_0x03c6:
            r0 = 0
        L_0x03c7:
            r3.A1C = r0
            long r5 = r3.A09
            long r5 = r5 - r14
            java.lang.String r0 = "voip/service/start elapsed "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = " ms"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 4
            java.lang.String r0 = "voip/service/start"
            A06(r0)
            boolean r0 = X.C30341cC.A0L(r7)
            r3.A1H = r0
            boolean r0 = r3.A1M
            if (r0 == 0) goto L_0x0412
            X.0xj r0 = r3.A1h
            r0.A00(r1, r2)
        L_0x03f9:
            X.0pd r2 = r3.A2O
            r1 = 2843(0xb1b, float:3.984E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0025
            X.0sq r2 = r3.A2c
            r1 = 22
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r0.<init>(r1, r4, r3)
            r2.Acl(r0)
            return
        L_0x0412:
            X.0xj r1 = r3.A1h
            r0 = 3
            r1.A00(r0, r2)
            goto L_0x03f9
        L_0x0419:
            r3.A0w = r8
            goto L_0x0384
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0e(com.whatsapp.jid.GroupJid, com.whatsapp.jid.UserJid, java.lang.String, boolean, boolean, boolean):void");
    }

    public final void A0f(GroupJid groupJid, C37831po r13) {
        C15830rv r0;
        C38571r0 r02 = r13.A06;
        if (r02 != null && !C34901l3.A00(r02.A01, groupJid)) {
            Log.w("VoiceService/setGroupJidInCallLog: mismatched groupJid in joinableCallLog and callLog");
        } else if (r13.A04 == null && groupJid != null) {
            synchronized (r13) {
                if (r13.A04 != groupJid) {
                    r13.A0J = true;
                }
                r13.A04 = groupJid;
            }
            AnonymousClass1D0 r2 = this.A2L;
            GroupJid groupJid2 = r13.A04;
            if (groupJid2 != null && r2.A09.A06(groupJid2) != null) {
                AnonymousClass122 r4 = r2.A0K;
                GroupJid groupJid3 = r13.A04;
                long j2 = r13.A0A;
                C39421sS r3 = (C39421sS) AnonymousClass122.A00(r4.A00, r4.A03.A02(groupJid3, true), (C30641ci) null, 70, j2);
                C35011lE r1 = r13.A0C;
                if (r1.A03) {
                    C16040sK r03 = r4.A01;
                    r03.A0B();
                    r0 = r03.A05;
                } else {
                    r0 = r1.A01;
                }
                r3.A0b(r0);
                r3.A01 = r13.A0I;
                r3.A00 = C30341cC.A0A(r1.A02);
                r2.A0A.A0W(r3);
            }
        }
    }

    public final void A0g(Jid jid, String str, boolean z2) {
        VoipStanzaChildNode A032;
        if (str != null) {
            StringBuilder sb = new StringBuilder("voip/sendPendingCallOfferStanza jid=");
            sb.append(jid);
            sb.append(" callId=");
            sb.append(str);
            sb.append(" callTerminated=");
            sb.append(z2);
            sb.append(" pendingCallOfferStanza=(");
            sb.append(this.A2q);
            sb.append("), this = ");
            sb.append(this);
            Log.i(sb.toString());
        }
        C613638p r5 = this.A2q;
        if (r5 != null) {
            String str2 = r5.A04;
            if (str2.equals(str)) {
                Jid jid2 = r5.A01;
                Jid jid3 = jid2;
                if (jid2 instanceof DeviceJid) {
                    jid2 = ((DeviceJid) jid2).getUserJid();
                }
                if (jid instanceof DeviceJid) {
                    jid = ((DeviceJid) jid).getUserJid();
                }
                if (jid2.equals(jid)) {
                    if (z2) {
                        if (r5.A02 != null) {
                            A032 = C30341cC.A04(r5.A03, (Map) null, r5.A05.keySet());
                        } else {
                            A032 = C30341cC.A03((C30821d1) null, r5.A03, r5.A00);
                        }
                        r5 = new C613638p(jid3, str2, A032);
                    }
                    this.A2q = null;
                    A0Z(r5);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        com.whatsapp.util.Log.e("voip/ringtone/vibrate/UNKNOWN");
        r0 = new java.lang.StringBuilder("unknown vibrate preference ");
        r0.append(r4);
        X.AnonymousClass00B.A08(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        if (r4.equals("2") == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        r0 = new long[]{0, 300, 200};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        switch(r3) {
            case 0: goto L_0x00cf;
            case 1: goto L_0x00d8;
            default: goto L_0x00c3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c3, code lost:
        r0 = {0, 750, 250} // fill-array;
        r5.A1V = r0;
        r0 = "voip/ringtone/vibrate/LONG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cb, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
        r0 = {0, 750, 1500} // fill-array;
        r5.A1V = r0;
        r0 = "voip/ringtone/vibrate/DEFAULT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d8, code lost:
        r0 = {0, 300, 200} // fill-array;
        r5.A1V = r0;
        r0 = "voip/ringtone/vibrate/SHORT";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0h(com.whatsapp.jid.UserJid r6, long[] r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = "voip/vibrate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r6 != 0) goto L_0x000f
            java.lang.String r0 = "voip/vibrate/error/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000e:
            return
        L_0x000f:
            long[] r0 = r5.A1V
            if (r0 != 0) goto L_0x000e
            boolean r0 = r5.A1K
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "VoiceService/playRingtone Silencing vibration for DND"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x001d:
            X.01V r2 = r5.A2C
            android.media.AudioManager r4 = r2.A0G()
            if (r4 == 0) goto L_0x000e
            int r1 = r4.getRingerMode()
            r3 = 1
            r0 = 2
            if (r1 == r0) goto L_0x0033
            int r0 = r4.getRingerMode()
            if (r0 != r3) goto L_0x000e
        L_0x0033:
            X.0sf r1 = r5.A2a
            java.lang.String r0 = r6.getRawString()
            X.1WS r0 = r1.A07(r0)
            java.lang.String r4 = r0.A04()
            if (r4 == 0) goto L_0x000e
            java.lang.String r0 = "0"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x000e
            r1 = 0
            if (r7 == 0) goto L_0x0081
            r5.A1V = r7
        L_0x0050:
            long[] r0 = r5.A1V
            if (r0 == 0) goto L_0x000e
            android.os.Vibrator r3 = r2.A0K()
            X.AnonymousClass00B.A06(r3)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L_0x00e1
            android.media.AudioAttributes$Builder r2 = new android.media.AudioAttributes$Builder
            r2.<init>()
            r0 = 4
            android.media.AudioAttributes$Builder r2 = r2.setContentType(r0)
            r0 = 6
            android.media.AudioAttributes$Builder r0 = r2.setUsage(r0)
            android.media.AudioAttributes r2 = r0.build()
            long[] r0 = r5.A1V
            if (r8 != 0) goto L_0x0079
            r1 = -1
        L_0x0079:
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createWaveform(r0, r1)
            r3.vibrate(r0, r2)
            return
        L_0x0081:
            int r0 = r4.hashCode()
            switch(r0) {
                case 49: goto L_0x00a1;
                case 50: goto L_0x00ab;
                case 51: goto L_0x00b4;
                default: goto L_0x0088;
            }
        L_0x0088:
            java.lang.String r0 = "voip/ringtone/vibrate/UNKNOWN"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r3 = "unknown vibrate preference "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A08(r0)
            goto L_0x0050
        L_0x00a1:
            java.lang.String r0 = "1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 0
            goto L_0x00bd
        L_0x00ab:
            java.lang.String r0 = "2"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x0088
        L_0x00b4:
            java.lang.String r0 = "3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 2
        L_0x00bd:
            r0 = 3
            long[] r0 = new long[r0]
            switch(r3) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00d8;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            r0 = {0, 750, 250} // fill-array
            r5.A1V = r0
            java.lang.String r0 = "voip/ringtone/vibrate/LONG"
        L_0x00cb:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0050
        L_0x00cf:
            r0 = {0, 750, 1500} // fill-array
            r5.A1V = r0
            java.lang.String r0 = "voip/ringtone/vibrate/DEFAULT"
            goto L_0x00cb
        L_0x00d8:
            r0 = {0, 300, 200} // fill-array
            r5.A1V = r0
            java.lang.String r0 = "voip/ringtone/vibrate/SHORT"
            goto L_0x00cb
        L_0x00e1:
            long[] r0 = r5.A1V
            if (r8 != 0) goto L_0x00e6
            r1 = -1
        L_0x00e6:
            r3.vibrate(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0h(com.whatsapp.jid.UserJid, long[], boolean):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:201|202|203|204|205) */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x051f, code lost:
        if (r25.A0D() == false) goto L_0x0521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x06af, code lost:
        if (r0.A1v.A0D() == false) goto L_0x06b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0799, code lost:
        if (android.text.TextUtils.isEmpty(r1.A01) != false) goto L_0x079b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x07d2, code lost:
        if (r3 == 70004) goto L_0x07d4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:199:0x05b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:204:0x05b8 */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0715  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0719  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0766  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0785  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07c9  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x07cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0i(X.C78093x7 r60) {
        /*
            r59 = this;
            r21 = 0
            r0 = r59
            X.0yg r1 = r0.A25
            boolean r1 = r1.A05()
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = "voip/service/onCallIncomingStanza dropping incoming call stanza (isInCompanionMode)"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0012:
            return
        L_0x0013:
            r1 = r60
            com.whatsapp.protocol.VoipStanzaChildNode r2 = r1.A01
            r58 = r2
            java.lang.String r3 = r2.tag
            int r2 = r3.hashCode()
            r47 = 1
            r8 = 3
            switch(r2) {
                case -1423461112: goto L_0x0048;
                case -934710369: goto L_0x00ac;
                case 105650780: goto L_0x00fe;
                case 112202875: goto L_0x027f;
                case 1063018407: goto L_0x02e4;
                case 2035990113: goto L_0x0398;
                default: goto L_0x0025;
            }
        L_0x0025:
            com.whatsapp.jid.Jid r9 = r1.A00
            java.lang.String r8 = r1.A05
            java.lang.String r7 = r1.A04
            long r5 = r1.A01
            long r3 = r1.A00
            boolean r2 = r1.A06
            r10 = r58
            r11 = r8
            r12 = r7
            r13 = r5
            r15 = r3
            r17 = r2
            int r3 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingSignalingXmpp(r9, r10, r11, r12, r13, r15, r17)
            r2 = 70004(0x11174, float:9.8096E-41)
            if (r3 != r2) goto L_0x0012
            java.lang.String r1 = r1.A02
            r0.A0v(r1)
            return
        L_0x0048:
            java.lang.String r2 = "accept"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0025
            X.11o r2 = r0.A2S
            long r11 = r1.A02
            X.1d2 r3 = r2.A00(r8, r11)
            if (r3 == 0) goto L_0x005d
            r3.A00(r8)
        L_0x005d:
            com.whatsapp.jid.DeviceJid r7 = r1.A03
            if (r7 != 0) goto L_0x006b
            X.0sK r2 = r0.A1d
            r2.A0B()
            X.1Za r7 = r2.A04
            X.AnonymousClass00B.A06(r7)
        L_0x006b:
            com.whatsapp.jid.Jid r8 = r1.A00
            boolean r2 = r8 instanceof com.whatsapp.jid.DeviceJid
            if (r2 != 0) goto L_0x0072
            r8 = 0
        L_0x0072:
            X.AnonymousClass00B.A06(r8)
            if (r3 == 0) goto L_0x007b
            r2 = 4
            r3.A00(r2)
        L_0x007b:
            X.1SI r2 = r0.A1r
            java.lang.String r9 = r1.A03
            java.lang.String r10 = r1.A02
            X.0ug r5 = r2.A01
            r2 = 4
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>(r2)
            A01(r6, r7, r8, r9, r10, r11)
            r4 = 0
            r3 = 72
            r2 = r21
            android.os.Message r2 = android.os.Message.obtain(r2, r4, r3, r4, r6)
            r5.A08(r2, r9, r4)
            java.lang.String r2 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x0025
            java.lang.String r2 = r1.A05
            r0.A12 = r2
            java.lang.String r2 = r1.A04
            r0.A11 = r2
            goto L_0x0025
        L_0x00ac:
            java.lang.String r2 = "reject"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0025
            X.11o r2 = r0.A2S
            long r11 = r1.A02
            X.1d2 r3 = r2.A00(r8, r11)
            if (r3 == 0) goto L_0x00c1
            r3.A00(r8)
        L_0x00c1:
            com.whatsapp.jid.DeviceJid r7 = r1.A03
            if (r7 != 0) goto L_0x00cf
            X.0sK r2 = r0.A1d
            r2.A0B()
            X.1Za r7 = r2.A04
            X.AnonymousClass00B.A06(r7)
        L_0x00cf:
            com.whatsapp.jid.Jid r8 = r1.A00
            boolean r2 = r8 instanceof com.whatsapp.jid.DeviceJid
            if (r2 != 0) goto L_0x00d6
            r8 = 0
        L_0x00d6:
            X.AnonymousClass00B.A06(r8)
            if (r3 == 0) goto L_0x00df
            r2 = 4
            r3.A00(r2)
        L_0x00df:
            X.1SI r2 = r0.A1r
            java.lang.String r9 = r1.A03
            java.lang.String r10 = r1.A02
            X.0ug r5 = r2.A01
            r2 = 4
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>(r2)
            A01(r6, r7, r8, r9, r10, r11)
            r4 = 0
            r3 = 73
            r2 = r21
            android.os.Message r2 = android.os.Message.obtain(r2, r4, r3, r4, r6)
            r5.A08(r2, r9, r4)
            goto L_0x0025
        L_0x00fe:
            java.lang.String r2 = "offer"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0025
            X.1An r2 = r0.A1q
            r57 = r2
            java.lang.String r9 = r1.A02
            r3 = 726210665(0x2b491869, float:7.144342E-13)
            r2.A04(r9, r3)
            X.11o r12 = r0.A2S
            long r4 = r1.A02
            X.1d2 r2 = r12.A00(r8, r4)
            if (r2 == 0) goto L_0x011f
            r2.A00(r8)
        L_0x011f:
            java.lang.String r11 = r1.A03
            com.whatsapp.jid.Jid r3 = r1.A00
            boolean r2 = r3 instanceof com.whatsapp.jid.DeviceJid
            if (r2 == 0) goto L_0x026e
            r2 = r3
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            r22 = r2
            if (r2 == 0) goto L_0x026e
            com.whatsapp.jid.DeviceJid r2 = r1.A03
            r23 = r2
            r27 = r2
            if (r2 != 0) goto L_0x0138
            r27 = r22
        L_0x0138:
            boolean r2 = r1.A06
            r24 = r2
            if (r2 != 0) goto L_0x0264
            r10 = 5
        L_0x013f:
            java.lang.String r2 = r1.A05
            r56 = r2
            java.lang.String r2 = r1.A04
            r55 = r2
            long r2 = r1.A00
            r53 = r2
            X.0sK r2 = r0.A1d
            r52 = r2
            r52.A0B()
            X.1Zb r2 = r2.A01
            r7 = 0
            if (r2 != 0) goto L_0x0165
            java.lang.String r0 = "voip/receive_message/call-offer ignoring call due to invalid registration"
        L_0x015a:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x015d:
            r1 = 7952(0x1f10, float:1.1143E-41)
            r0 = r57
            r0.A03(r9, r1)
            return
        L_0x0165:
            java.util.Set r2 = r0.A2n
            boolean r2 = r2.add(r11)
            r13 = r2 ^ 1
            java.lang.String r2 = "voip/receive_message/call-offer, id: "
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r2)
            r14.append(r11)
            java.lang.String r2 = ", from: "
            r14.append(r2)
            r2 = r22
            r14.append(r2)
            java.lang.String r2 = ", call id: "
            r14.append(r2)
            r14.append(r9)
            java.lang.String r2 = ", duplicatedCallOffer: "
            r14.append(r2)
            r14.append(r13)
            java.lang.String r2 = ", callOfferElapsedTimeInMillisOnServer: "
            r14.append(r2)
            r2 = r53
            r14.append(r2)
            java.lang.String r6 = "ms"
            r14.append(r6)
            java.lang.String r2 = r14.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.1d2 r3 = r12.A00(r8, r4)
            if (r3 == 0) goto L_0x01b2
            r2 = 4
            r3.A00(r2)
        L_0x01b2:
            X.1SI r2 = r0.A1r
            X.0ug r12 = r2.A01
            r2 = 4
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>(r2)
            r14 = r3
            r15 = r27
            r16 = r22
            r17 = r11
            r18 = r9
            r19 = r4
            A01(r14, r15, r16, r17, r18, r19)
            r4 = 71
            r2 = r21
            android.os.Message r2 = android.os.Message.obtain(r2, r7, r4, r7, r3)
            r12.A08(r2, r11, r7)
            if (r13 != 0) goto L_0x015d
            X.0ua r2 = r0.A1e
            r2.A06(r7)
            android.telephony.TelephonyManager r3 = r0.A1Y
            X.0sj r2 = r0.A2F
            int r2 = X.C30341cC.A01(r3, r2)
            r0.A07 = r2
            X.0vQ r2 = r0.A24
            boolean r2 = r2.A00()
            if (r2 != 0) goto L_0x023f
            r0.A0V()
            com.whatsapp.voipcalling.camera.VoipCameraManager r4 = r0.A2f
            X.1OL r2 = r0.A1j
            java.lang.String r3 = r2.A02()
            X.1Bz r2 = r0.A1i
            r4.setRequestedCamera2SupportLevel(r3, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r0.A0n = r2
            r2 = 4
            if (r10 != r2) goto L_0x022d
            X.19v r2 = r0.A2W
            long r4 = r2.A00
            r10 = 0
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x022d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r4
            r0.A0A = r2
            java.lang.String r5 = "voip/receive_message/call-offer/pushToCallOfferDelay "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x022d:
            java.lang.Long r2 = java.lang.Long.valueOf(r53)
            r0.A0t = r2
            r2 = r24
            r0.A18 = r2
            r2 = r56
            r0.A12 = r2
            r2 = r55
            r0.A11 = r2
        L_0x023f:
            r2 = 1
            com.whatsapp.voipcalling.CallOfferInfo[] r4 = new com.whatsapp.voipcalling.CallOfferInfo[r2]
            long r2 = r1.A01
            r50 = r2
            r10 = r4
            r11 = r22
            r12 = r58
            r13 = r56
            r14 = r55
            r15 = r2
            r17 = r53
            r19 = r24
            int r2 = com.whatsapp.voipcalling.Voip.nativeParseXmppOffer(r10, r11, r12, r13, r14, r15, r17, r19)
            if (r2 == 0) goto L_0x0412
            r1 = 70004(0x11174, float:9.8096E-41)
            if (r2 != r1) goto L_0x015d
            r0.A0v(r9)
            goto L_0x015d
        L_0x0264:
            X.19v r2 = r0.A2W
            boolean r2 = r2.A01
            r10 = 1
            if (r2 == 0) goto L_0x013f
            r10 = 4
            goto L_0x013f
        L_0x026e:
            java.lang.String r1 = "voip/receive_message/call-offer dropping stanza: invalid fromJid: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x015a
        L_0x027f:
            java.lang.String r2 = "video"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0025
            com.whatsapp.jid.Jid r6 = r1.A00
            boolean r2 = r6 instanceof com.whatsapp.jid.DeviceJid
            if (r2 != 0) goto L_0x028f
            r6 = 0
        L_0x028f:
            X.AnonymousClass00B.A06(r6)
            java.lang.String r4 = r1.A02
            long r2 = r1.A01
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "_"
            r5.append(r4)
            java.lang.String r4 = r6.getRawString()
            r5.append(r4)
            java.lang.String r9 = r5.toString()
            java.util.Map r8 = r0.A2j
            java.lang.Object r7 = r8.get(r9)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x02db
            long r5 = r7.longValue()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x02db
            java.lang.String r0 = "voip/receive_message/call-video-changed ignore this message. epochTimeMillis = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = ", latest = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x02db:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.put(r9, r2)
            goto L_0x0025
        L_0x02e4:
            java.lang.String r2 = "enc_rekey"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0025
            X.11o r2 = r0.A2S
            long r14 = r1.A02
            X.1d2 r3 = r2.A00(r8, r14)
            if (r3 == 0) goto L_0x02f9
            r3.A00(r8)
        L_0x02f9:
            com.whatsapp.jid.DeviceJid r10 = r1.A03
            if (r10 != 0) goto L_0x0303
            java.lang.String r0 = "call creator can not be null in call rekey request"
            X.AnonymousClass00B.A08(r0)
            return
        L_0x0303:
            com.whatsapp.jid.Jid r11 = r1.A00
            boolean r2 = r11 instanceof com.whatsapp.jid.DeviceJid
            if (r2 != 0) goto L_0x030a
            r11 = 0
        L_0x030a:
            X.AnonymousClass00B.A06(r11)
            X.39S r2 = r0.A1y
            X.4aL r4 = r2.A00(r1)
            if (r3 == 0) goto L_0x0319
            r2 = 4
            r3.A00(r2)
        L_0x0319:
            X.1SI r6 = r0.A1r
            java.lang.String r12 = r1.A03
            java.lang.String r13 = r1.A02
            int r3 = r4.A01
            r2 = 0
            if (r3 != r8) goto L_0x0325
            r2 = 1
        L_0x0325:
            byte r5 = r4.A00
            if (r2 == 0) goto L_0x0389
            X.11s r2 = r6.A00
            X.1d4 r2 = r2.A07
            int r7 = r2.A01()
            java.lang.String r8 = "voip/call-send-methods sending e2e reject with retry: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            int r5 = r5 + 1
            r2.append(r5)
            java.lang.String r8 = " message.id="
            r2.append(r8)
            r2.append(r12)
            java.lang.String r8 = " localRegistrationId="
            r2.append(r8)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            byte[] r7 = X.C28641Wx.A02(r7)
            X.0ug r6 = r6.A01
            byte r5 = (byte) r5
            java.lang.String r2 = "enc_rekey_retry"
        L_0x035e:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            A01(r9, r10, r11, r12, r13, r14)
            java.lang.String r8 = "type"
            r9.putString(r8, r2)
            java.lang.String r2 = "registrationId"
            r9.putByteArray(r2, r7)
            java.lang.String r2 = "retry"
            r9.putByte(r2, r5)
            r7 = 0
            r5 = 157(0x9d, float:2.2E-43)
            r2 = r21
            android.os.Message r2 = android.os.Message.obtain(r2, r7, r5, r7, r9)
            r6.A08(r2, r12, r7)
            if (r3 == 0) goto L_0x038e
            r1 = 1
            if (r3 == r1) goto L_0x07fe
            return
        L_0x0389:
            X.0ug r6 = r6.A01
            r2 = 0
            r7 = r2
            goto L_0x035e
        L_0x038e:
            byte[] r2 = r4.A06
            if (r2 == 0) goto L_0x07fe
            com.whatsapp.protocol.VoipStanzaChildNode r2 = r4.A03
            r58 = r2
            goto L_0x0025
        L_0x0398:
            java.lang.String r2 = "terminate"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0025
            X.11o r4 = r0.A2S
            long r2 = r1.A02
            X.1d2 r4 = r4.A00(r8, r2)
            if (r4 == 0) goto L_0x03ae
            r4.A00(r8)
        L_0x03ae:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.whatsapp.jid.Jid r8 = r1.A00
            java.lang.String r13 = "call"
            java.lang.String r7 = r1.A03
            r4 = r58
            java.lang.String r6 = r4.tag
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x0408
            r5 = 0
        L_0x03c4:
            r12 = r21
            r16 = r12
            X.1ci r9 = new X.1ci
            r10 = r8
            r11 = r12
            r14 = r7
            r15 = r6
            r17 = r12
            r18 = r5
            r19 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.whatsapp.jid.DeviceJid r8 = r1.A03
            java.lang.String r10 = r1.A02
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r2 = com.whatsapp.voipcalling.Voip.A08(r3)
            if (r2 == 0) goto L_0x0403
            java.lang.String r2 = r3.callId
            boolean r2 = android.text.TextUtils.equals(r10, r2)
            if (r2 == 0) goto L_0x0403
            long r11 = r3.audioDuration
            long r13 = r3.videoDuration
            android.os.Handler r3 = r0.A0L
            r2 = 1
            r3.removeMessages(r2)
        L_0x03f7:
            X.124 r2 = r0.A2R
            X.3x8 r7 = new X.3x8
            r7.<init>(r8, r9, r10, r11, r13)
            r2.A02(r7)
            goto L_0x0025
        L_0x0403:
            r11 = 0
            r13 = 0
            goto L_0x03f7
        L_0x0408:
            java.util.Collection r4 = r5.values()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            goto L_0x03c4
        L_0x0412:
            r20 = 0
            r3 = r4[r7]
            X.AnonymousClass00B.A06(r3)
            boolean r5 = r3.isVideoCall
            com.whatsapp.voipcalling.CallGroupInfo r2 = r3.callGroupInfo
            if (r2 != 0) goto L_0x04b5
            r4 = 1
        L_0x0420:
            r2 = r57
            r2.A01(r9, r4, r5, r7)
            com.whatsapp.voipcalling.CallGroupInfo r2 = r3.callGroupInfo
            if (r2 == 0) goto L_0x04b2
            int r13 = r2.transactionId
        L_0x042b:
            X.4HS r5 = r0.A0A(r9)
            X.195 r4 = r0.A2M
            java.lang.String r2 = X.C30341cC.A0B(r9)
            X.1r0 r4 = r4.A04(r2)
            r2 = 0
            if (r4 == 0) goto L_0x043d
            r2 = 1
        L_0x043d:
            r5.A01 = r2
            com.whatsapp.jid.UserJid r12 = r3.fromJid
            java.lang.String r10 = r3.callId
            long r4 = r3.epochTimeMillis
            r48 = r4
            boolean r5 = r3.isVideoCall
            X.1D0 r6 = r0.A2L
            java.lang.String r4 = X.C30341cC.A0B(r10)
            X.1lE r2 = new X.1lE
            r2.<init>(r13, r12, r4, r7)
            X.1po r2 = r6.A03(r2)
            if (r2 != 0) goto L_0x0639
            X.1po r11 = r0.A0D(r10)
            java.lang.String r2 = X.C30341cC.A0B(r10)
            if (r11 == 0) goto L_0x05ca
            X.1lE r10 = new X.1lE
            r10.<init>(r13, r12, r2, r7)
            int r2 = r11.A01
            if (r2 != 0) goto L_0x05c5
            X.1po r2 = r6.A03(r10)
            r5 = 0
            if (r2 != 0) goto L_0x0475
            r5 = 1
        L_0x0475:
            java.lang.String r4 = "CallsMessageStore/replaceCallLogOnCurrentThread callLog already exists for this key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            X.AnonymousClass00B.A0C(r2, r5)
            java.util.List r4 = r11.A04()
            int r2 = r4.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            java.util.Iterator r14 = r4.iterator()
        L_0x0497:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x04ba
            java.lang.Object r2 = r14.next()
            X.1r1 r2 = (X.C38581r1) r2
            com.whatsapp.jid.UserJid r13 = r2.A02
            int r12 = r2.A00
            r4 = -1
            X.1r1 r2 = new X.1r1
            r2.<init>(r13, r12, r4)
            r7.add(r2)
            goto L_0x0497
        L_0x04b2:
            r13 = -1
            goto L_0x042b
        L_0x04b5:
            com.whatsapp.voipcalling.CallParticipant[] r2 = r2.participants
            int r4 = r2.length
            goto L_0x0420
        L_0x04ba:
            X.1r3 r2 = r11.A05
            r29 = r2
            r36 = -1
            boolean r2 = r11.A0I
            r42 = r2
            int r2 = r11.A01
            r34 = r2
            int r2 = r11.A00
            r35 = r2
            boolean r2 = r11.A09
            r19 = r2
            long r4 = r11.A02
            boolean r2 = r11.A0E
            r18 = r2
            com.whatsapp.jid.GroupJid r2 = r11.A04
            r17 = r2
            boolean r2 = r11.A0H
            r16 = r2
            com.whatsapp.jid.DeviceJid r2 = r11.A0B
            r15 = r2
            java.lang.String r14 = r11.A07
            X.1r0 r13 = r11.A06
            X.1r2 r12 = r11.A0G
            X.1po r2 = new X.1po
            r44 = 0
            r25 = r2
            r26 = r12
            r27 = r15
            r28 = r17
            r30 = r10
            r31 = r13
            r32 = r14
            r33 = r7
            r38 = r48
            r40 = r4
            r43 = r19
            r45 = r18
            r46 = r16
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40, r42, r43, r44, r45, r46)
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r6.A0M
            r25 = r4
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r25.writeLock()
            r4.lock()
            X.199 r12 = r6.A07     // Catch:{ all -> 0x05bc }
            monitor-enter(r12)     // Catch:{ all -> 0x05bc }
            boolean r4 = r2.A0E     // Catch:{ all -> 0x05b9 }
            if (r4 != 0) goto L_0x0521
            boolean r4 = r2.A0D()     // Catch:{ all -> 0x05b9 }
            r5 = 1
            if (r4 != 0) goto L_0x0522
        L_0x0521:
            r5 = 0
        L_0x0522:
            java.lang.String r4 = "Only regular call log is stored here"
            X.AnonymousClass00B.A0C(r4, r5)     // Catch:{ all -> 0x05b9 }
            X.0tq r4 = r12.A03     // Catch:{ all -> 0x05b9 }
            X.0tf r19 = r4.A02()     // Catch:{ all -> 0x05b9 }
            X.1cj r18 = r19.A00()     // Catch:{ all -> 0x05b4 }
            r4 = r19
            X.0tg r14 = r4.A02     // Catch:{ all -> 0x05af }
            java.lang.String r13 = "call_log"
            java.lang.String r17 = "jid_row_id = ? AND from_me = ? AND call_id = ? AND transaction_id = ?"
            r4 = 4
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x05af }
            X.14v r4 = r12.A01     // Catch:{ all -> 0x05af }
            X.1lE r7 = r11.A0C     // Catch:{ all -> 0x05af }
            com.whatsapp.jid.UserJid r15 = r7.A01     // Catch:{ all -> 0x05af }
            long r15 = r4.A01(r15)     // Catch:{ all -> 0x05af }
            java.lang.String r4 = java.lang.Long.toString(r15)     // Catch:{ all -> 0x05af }
            r5[r20] = r4     // Catch:{ all -> 0x05af }
            boolean r4 = r7.A03     // Catch:{ all -> 0x05af }
            if (r4 == 0) goto L_0x058e
            java.lang.String r4 = "1"
        L_0x0552:
            r5[r47] = r4     // Catch:{ all -> 0x05af }
            r15 = 2
            java.lang.String r4 = r7.A02     // Catch:{ all -> 0x05af }
            r5[r15] = r4     // Catch:{ all -> 0x05af }
            int r4 = r7.A00     // Catch:{ all -> 0x05af }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x05af }
            r5[r8] = r4     // Catch:{ all -> 0x05af }
            r4 = r17
            r14.A01(r13, r4, r5)     // Catch:{ all -> 0x05af }
            X.1lE r4 = r2.A0C     // Catch:{ all -> 0x05af }
            android.content.ContentValues r4 = r12.A00(r4, r2)     // Catch:{ all -> 0x05af }
            long r4 = r14.A03(r4, r13)     // Catch:{ all -> 0x05af }
            r2.A06(r4)     // Catch:{ all -> 0x05af }
            X.1r0 r13 = r2.A06     // Catch:{ all -> 0x05af }
            if (r13 == 0) goto L_0x0584
            long r4 = r2.A02()     // Catch:{ all -> 0x05af }
            r13.A00 = r4     // Catch:{ all -> 0x05af }
            X.195 r5 = r12.A02     // Catch:{ all -> 0x05af }
            X.1r0 r4 = r2.A06     // Catch:{ all -> 0x05af }
            r5.A06(r4)     // Catch:{ all -> 0x05af }
        L_0x0584:
            r2.A05()     // Catch:{ all -> 0x05af }
            r12.A03(r2)     // Catch:{ all -> 0x05af }
            r18.A00()     // Catch:{ all -> 0x05af }
            goto L_0x0591
        L_0x058e:
            java.lang.String r4 = "0"
            goto L_0x0552
        L_0x0591:
            r18.close()     // Catch:{ all -> 0x05b4 }
            r19.close()     // Catch:{ all -> 0x05b9 }
            monitor-exit(r12)     // Catch:{ all -> 0x05bc }
            X.2ED r4 = r6.A00     // Catch:{ all -> 0x05bc }
            r4.A01(r11)     // Catch:{ all -> 0x05bc }
            r4.A00(r2)     // Catch:{ all -> 0x05bc }
            X.126 r12 = r6.A05     // Catch:{ all -> 0x05bc }
            r4 = 8
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r5 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ all -> 0x05bc }
            r5.<init>(r6, r4, r2)     // Catch:{ all -> 0x05bc }
            r4 = 16
            r12.A01(r5, r4)     // Catch:{ all -> 0x05bc }
            goto L_0x0601
        L_0x05af:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x05b3 }
        L_0x05b3:
            throw r0     // Catch:{ all -> 0x05b4 }
        L_0x05b4:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x05b8 }
        L_0x05b8:
            throw r0     // Catch:{ all -> 0x05b9 }
        L_0x05b9:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x05bc }
            throw r0     // Catch:{ all -> 0x05bc }
        L_0x05bc:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r25.writeLock()
            r0.unlock()
            throw r1
        L_0x05c5:
            X.1po r2 = r6.A04(r10, r11)
            goto L_0x0639
        L_0x05ca:
            X.1lE r4 = new X.1lE
            r4.<init>(r13, r12, r2, r7)
            r6.A07(r4)
            java.util.List r33 = java.util.Collections.emptyList()
            r36 = -1
            r40 = 0
            X.1po r2 = new X.1po
            r28 = r21
            r29 = r21
            r31 = r21
            r32 = r21
            r34 = 0
            r35 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r25 = r2
            r26 = r21
            r30 = r4
            r38 = r48
            r42 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40, r42, r43, r44, r45, r46)
            r6.A0A(r2)
            goto L_0x0639
        L_0x0601:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r25.writeLock()
            r4.unlock()
            java.lang.String r4 = "CallsMessageStore/replaceCallLogOnCurrentThread; callLog.key="
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r4)
            r12.append(r7)
            java.lang.String r4 = "; callLog.row_id="
            r12.append(r4)
            long r4 = r11.A02()
            r12.append(r4)
            java.lang.String r4 = "; new key="
            r12.append(r4)
            r12.append(r10)
            java.lang.String r4 = "; new row_id="
            r12.append(r4)
            long r4 = r2.A02()
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
        L_0x0639:
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            com.whatsapp.jid.GroupJid r4 = r3.getGroupJid(r4)
            r0.A0f(r4, r2)
            X.0pd r5 = r0.A2O
            r4 = r52
            java.lang.String r5 = r3.getLinkToken(r5, r4)
            X.1r2 r4 = r2.A0G
            if (r4 != 0) goto L_0x0663
            if (r5 == 0) goto L_0x0663
            r4 = r21
            X.1r2 r4 = r0.A09(r4, r5)
            monitor-enter(r2)
            r2.A0G = r4     // Catch:{ all -> 0x065f }
            r4 = 1
            r2.A0J = r4     // Catch:{ all -> 0x065f }
            goto L_0x0662
        L_0x065f:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0662:
            monitor-exit(r2)
        L_0x0663:
            boolean r4 = r3.isJoinableGroupCall()
            if (r4 == 0) goto L_0x068e
            r4 = 1
            r0.A0q(r2, r4)
            com.whatsapp.voipcalling.CallGroupInfo r4 = r3.callGroupInfo
            X.AnonymousClass00B.A06(r4)
            com.whatsapp.voipcalling.CallParticipant[] r10 = r4.participants
            int r7 = r10.length
        L_0x0675:
            r4 = r20
            if (r4 >= r7) goto L_0x068e
            r11 = r10[r20]
            com.whatsapp.jid.UserJid r5 = r11.jid
            r4 = r52
            boolean r4 = r4.A0I(r5)
            if (r4 != 0) goto L_0x068b
            com.whatsapp.jid.UserJid r5 = r11.jid
            r4 = 2
            r2.A07(r5, r4)
        L_0x068b:
            int r20 = r20 + 1
            goto L_0x0675
        L_0x068e:
            java.lang.String r4 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x069e
            r5 = 4
            r4 = r57
            r4.A03(r9, r5)
        L_0x069e:
            com.whatsapp.jid.UserJid r5 = r22.getUserJid()
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r7 < r4) goto L_0x06b1
            X.14x r4 = r0.A1v
            boolean r4 = r4.A0D()
            r7 = 1
            if (r4 != 0) goto L_0x06b2
        L_0x06b1:
            r7 = 0
        L_0x06b2:
            java.lang.String r4 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L_0x07fb
            int r10 = r0.A07
            r4 = 1
            if (r10 == r4) goto L_0x06c5
            if (r10 == 0) goto L_0x07fb
            if (r7 != 0) goto L_0x07fb
        L_0x06c5:
            java.lang.String r4 = "voip/receive_message/stanza-call-offer/ignored-phone-call-in-progress "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            r4 = 1
            if (r10 == r4) goto L_0x07f7
            r4 = 2
            if (r10 == r4) goto L_0x07f3
            java.lang.String r4 = "UNKNOWN_TELEPHONY_CALL_STATE"
        L_0x06d5:
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r4 = 5
        L_0x06e0:
            X.39S r7 = r0.A1y
            X.4aL r12 = r7.A00(r1)
            int r11 = r12.A01
            r10 = 16
            r7 = 0
            if (r11 == 0) goto L_0x07e5
            r1 = 1
            if (r11 == r1) goto L_0x07d4
            r1 = 2
            if (r11 == r1) goto L_0x0777
            if (r11 == r8) goto L_0x076f
            r1 = 4
            if (r11 == r1) goto L_0x0777
            r11 = r7
        L_0x06f9:
            r1 = 0
        L_0x06fa:
            X.0y8 r13 = r0.A2K
            X.0sq r8 = r13.A02
            r48 = 0
            r25 = 0
            com.facebook.redex.RunnableRunnableShape0S1400000_I0 r12 = new com.facebook.redex.RunnableRunnableShape0S1400000_I0
            r18 = 0
            r14 = r5
            r15 = r21
            r16 = r7
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r8.Acl(r12)
            if (r24 != 0) goto L_0x0766
            r47 = 5
        L_0x0717:
            if (r4 != r10) goto L_0x0785
            boolean r7 = r3.uploadFieldStat
            com.whatsapp.voipcalling.CallGroupInfo r4 = r3.callGroupInfo
            if (r23 != 0) goto L_0x0721
            r23 = r22
        L_0x0721:
            boolean r5 = r3.isVideoCall
            boolean r27 = r3.isJoinableGroupCall()
            X.11s r3 = r0.A2I
            X.1d4 r3 = r3.A07
            int r15 = r3.A01()
            java.lang.String r13 = "enc"
            if (r4 == 0) goto L_0x073a
            com.whatsapp.voipcalling.CallParticipant[] r3 = r4.participants
            int r3 = r3.length
            if (r3 <= 0) goto L_0x073a
            r48 = 1
        L_0x073a:
            r10 = r48
            r11 = r22
            r12 = r23
            r14 = r1
            com.whatsapp.voipcalling.Voip.rejectCallWithoutCallContext(r9, r10, r11, r12, r13, r14, r15)
            r3 = 4
            if (r1 <= r3) goto L_0x0762
            java.lang.Integer r17 = java.lang.Integer.valueOf(r47)
            r21 = 16
            r28 = 0
            r14 = r0
            r15 = r4
            r16 = r2
            r18 = r9
            r19 = r56
            r20 = r55
            r22 = r53
            r24 = r7
            r26 = r5
            r14.A0j(r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28)
        L_0x0762:
            r6.A09(r2)
            return
        L_0x0766:
            X.19v r7 = r0.A2W
            boolean r7 = r7.A01
            if (r7 == 0) goto L_0x0717
            r47 = 4
            goto L_0x0717
        L_0x076f:
            byte r1 = r12.A00
            int r1 = r1 + 1
            r11 = r7
            r4 = 16
            goto L_0x06fa
        L_0x0777:
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x07d7
            com.whatsapp.voipcalling.Voip.clearVoipParam(r9)
            goto L_0x07d7
        L_0x0785:
            X.0sG r1 = r0.A27
            X.0sH r1 = r1.A08(r5)
            if (r1 == 0) goto L_0x079b
            X.1ko r1 = r1.A0D
            if (r1 == 0) goto L_0x079b
            java.lang.String r1 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r46 = 0
            if (r1 == 0) goto L_0x079d
        L_0x079b:
            r46 = 1
        L_0x079d:
            X.15q r1 = r0.A2T
            boolean r1 = r1.A0L(r5)
            r0.A1K = r1
            if (r4 == 0) goto L_0x07e2
            r48 = 1
            r1 = 5
            if (r4 == r1) goto L_0x07df
            r1 = 15
            if (r4 != r1) goto L_0x07e2
            java.lang.String r49 = "tos"
        L_0x07b3:
            r37 = r22
            r38 = r58
            r39 = r56
            r40 = r55
            r41 = r50
            r43 = r53
            r45 = r24
            com.whatsapp.jid.UserJid r3 = r3.fromJid
            int r3 = com.obwhatsapp.yo.yo.callControl_blockincome(r3)
            if (r3 == 0) goto L_0x07cd
            int r3 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingXmppOffer(r37, r38, r39, r40, r41, r43, r45, r46, r47, r48, r49)
        L_0x07cd:
            if (r3 == 0) goto L_0x0762
            r1 = 70004(0x11174, float:9.8096E-41)
            if (r3 != r1) goto L_0x0762
        L_0x07d4:
            r0.A0v(r9)
        L_0x07d7:
            r1 = 7952(0x1f10, float:1.1143E-41)
            r0 = r57
            r0.A03(r9, r1)
            goto L_0x0762
        L_0x07df:
            java.lang.String r49 = "busy"
            goto L_0x07b3
        L_0x07e2:
            r49 = 0
            goto L_0x07b3
        L_0x07e5:
            com.whatsapp.protocol.VoipStanzaChildNode r1 = r12.A03
            r58 = r1
            byte[] r1 = r12.A05
            r21 = r1
            java.lang.String r11 = r12.A04
            X.21U r7 = r12.A02
            goto L_0x06f9
        L_0x07f3:
            java.lang.String r4 = "CALL_STATE_OFFHOOK"
            goto L_0x06d5
        L_0x07f7:
            java.lang.String r4 = "CALL_STATE_RINGING"
            goto L_0x06d5
        L_0x07fb:
            r4 = 0
            goto L_0x06e0
        L_0x07fe:
            r0.A0v(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0i(X.3x7):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        if (r5.A06(r3, java.lang.Boolean.valueOf(r4.A0a.A0D(r3))) == false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0j(com.whatsapp.voipcalling.CallGroupInfo r24, X.C37831po r25, java.lang.Integer r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, long r31, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            r23 = this;
            r1 = r25
            X.1lE r2 = r1.A0C
            boolean r0 = r2.A03
            r3 = r0 ^ 1
            java.lang.String r0 = "processMissedIncomingCall should only be called on callee side"
            X.AnonymousClass00B.A0B(r0, r3)
            r14 = r23
            X.1An r3 = r14.A1q
            r0 = 4
            r7 = r27
            r3.A03(r7, r0)
            java.lang.String r0 = "test.name"
            java.lang.String r8 = com.whatsapp.voipcalling.Voip.getVoipParamForCall(r0, r7)
            if (r8 == 0) goto L_0x0026
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r8 = 0
        L_0x0027:
            com.whatsapp.voipcalling.Voip.clearVoipParam(r7)
            r9 = 2
            monitor-enter(r1)
            int r0 = r1.A00     // Catch:{ all -> 0x018c }
            if (r0 == r9) goto L_0x0033
            r0 = 1
            r1.A0J = r0     // Catch:{ all -> 0x018c }
        L_0x0033:
            r1.A00 = r9     // Catch:{ all -> 0x018c }
            monitor-exit(r1)
            r6 = 0
            r0 = r24
            if (r24 == 0) goto L_0x005a
            com.whatsapp.voipcalling.CallParticipant[] r5 = r0.participants
            int r4 = r5.length
            if (r4 <= 0) goto L_0x005a
            r11 = 0
        L_0x0041:
            r10 = r5[r6]
            java.lang.String r3 = r10.state
            java.lang.String r0 = "connected"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0055
            com.whatsapp.jid.UserJid r3 = r10.jid
            r0 = 5
            r1.A07(r3, r0)
            int r11 = r11 + 1
        L_0x0055:
            int r6 = r6 + 1
            if (r6 < r4) goto L_0x0041
            r6 = r11
        L_0x005a:
            boolean r3 = X.AnonymousClass01E.A01()
            X.1D0 r0 = r14.A2L
            if (r3 == 0) goto L_0x0187
            r0.A08(r1)
        L_0x0065:
            com.whatsapp.jid.GroupJid r0 = r1.A04
            X.14s r5 = r14.A2b
            X.0ul r4 = r14.A2P
            r3 = r0
            X.0sL r3 = (X.C16050sL) r3
            boolean r0 = r0 instanceof X.C16050sL
            if (r0 == 0) goto L_0x0083
            X.0sO r0 = r4.A0a
            boolean r0 = r0.A0D(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r5.A06(r3, r0)
            r13 = 1
            if (r0 != 0) goto L_0x0084
        L_0x0083:
            r13 = 0
        L_0x0084:
            r5 = 0
            r4 = 5
            if (r36 != 0) goto L_0x0093
            android.os.Handler r0 = r14.A0L
            r3 = r34
            android.os.Message r0 = android.os.Message.obtain(r0, r4, r3, r5, r1)
            r0.sendToTarget()
        L_0x0093:
            com.whatsapp.jid.UserJid r10 = r2.A01
            com.whatsapp.jid.GroupJid r0 = r1.A04
            r12 = 0
            if (r0 == 0) goto L_0x009b
            r12 = 1
        L_0x009b:
            X.4HS r3 = r14.A0A(r7)
            X.0pd r2 = r14.A2O
            r1 = 1939(0x793, float:2.717E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0180
            com.whatsapp.fieldstats.extension.WamCallExtended r15 = new com.whatsapp.fieldstats.extension.WamCallExtended
            r15.<init>()
        L_0x00b0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r30)
            r15.callResult = r2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15.callSide = r9
            if (r6 <= 0) goto L_0x00cd
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r15.groupCallIsLastSegment = r0
            r15.groupCallIsGroupCallInvitee = r0
            long r0 = (long) r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.numConnectedParticipants = r0
            r15.fieldStatsRowType = r9
        L_0x00cd:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r35)
            r15.videoEnabled = r9
            r15.callTestBucket = r8
            java.lang.Integer r0 = r3.A00
            r15.incomingCallUiAction = r0
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r15.joinableNewUi = r8
            if (r36 == 0) goto L_0x00e1
            r15.joinableDuringCall = r8
        L_0x00e1:
            if (r37 == 0) goto L_0x00e5
            r15.isPendingCall = r8
        L_0x00e5:
            if (r12 == 0) goto L_0x00e9
            r15.isLinkedGroupCall = r8
        L_0x00e9:
            java.lang.Long r20 = java.lang.Long.valueOf(r31)
            r17 = 0
            r19 = r26
            r21 = r28
            r22 = r29
            r18 = r17
            r16 = r10
            r14.A0d(r15, r16, r17, r18, r19, r20, r21, r22)
            if (r36 == 0) goto L_0x010d
            X.0t3 r10 = r14.A2D
            X.0sK r1 = r14.A1d
            r0 = 1
            java.lang.String r0 = X.C224718b.A00(r1, r10, r0)
            java.lang.String r0 = r14.A0E(r7, r0)
            r15.callRandomId = r0
        L_0x010d:
            X.15I r10 = r14.A2A
            X.1po r1 = r14.A0D(r7)
            java.lang.Integer r0 = r15.callResult
            r10.A0B(r1, r0)
            X.0w0 r1 = r14.A1x
            r10 = r33
            r1.A02(r15, r10)
            if (r6 <= 0) goto L_0x0164
            com.whatsapp.fieldstats.events.WamJoinableCall r0 = new com.whatsapp.fieldstats.events.WamJoinableCall
            r0.<init>()
            if (r36 == 0) goto L_0x012c
            java.lang.String r11 = r15.callRandomId
            r0.callRandomId = r11
        L_0x012c:
            boolean r3 = r3.A01
            if (r3 == 0) goto L_0x0132
            r0.isRering = r8
        L_0x0132:
            if (r36 == 0) goto L_0x0136
            r0.joinableDuringCall = r8
        L_0x0136:
            if (r12 == 0) goto L_0x013a
            r0.isLinkedGroupCall = r8
        L_0x013a:
            long r11 = (long) r6
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r0.numConnectedPeers = r3
            r0.videoEnabled = r9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.lobbyEntryPoint = r3
            r3 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.lobbyExit = r3
            r0.legacyCallResult = r2
            if (r37 == 0) goto L_0x0156
            r0.isPendingCall = r8
        L_0x0156:
            if (r13 == 0) goto L_0x015a
            r0.hasSpamDialog = r8
        L_0x015a:
            X.0t9 r1 = r1.A01
            r1.A05(r0)
            if (r33 == 0) goto L_0x0164
            r1.A01()
        L_0x0164:
            java.util.Map r0 = r14.A2i
            r0.remove(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x017f
            android.os.Handler r0 = r14.A0L
            r1 = 48
            r0.removeMessages(r1)
            android.os.Handler r0 = r14.A0L
            android.os.Message r0 = r0.obtainMessage(r1, r4, r5, r7)
            r0.sendToTarget()
        L_0x017f:
            return
        L_0x0180:
            com.whatsapp.fieldstats.events.WamCall r15 = new com.whatsapp.fieldstats.events.WamCall
            r15.<init>()
            goto L_0x00b0
        L_0x0187:
            r0.A09(r1)
            goto L_0x0065
        L_0x018c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0j(com.whatsapp.voipcalling.CallGroupInfo, X.1po, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, long, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r6.A1A != false) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069 A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070 A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0k(com.whatsapp.voipcalling.CallInfo r7) {
        /*
            r6 = this;
            boolean r0 = r6.A19
            r3 = 0
            if (r0 == 0) goto L_0x000a
            boolean r0 = r6.A1A
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            r6.A19 = r2
            X.26Z r0 = r6.A1k
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x0024
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r7)
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r7.videoEnabled
            if (r0 != 0) goto L_0x0024
            boolean r0 = X.C41971wz.A07()
            if (r0 == 0) goto L_0x00b6
        L_0x0024:
            boolean r0 = r7.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6.A1S
            if (r0 != 0) goto L_0x0034
            if (r3 != 0) goto L_0x0034
            r6.A0T()
        L_0x0033:
            return
        L_0x0034:
            X.AnonymousClass00B.A01()
            android.os.PowerManager$WakeLock r0 = r6.A0P
            if (r0 != 0) goto L_0x0033
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x008b }
            r0 = 21
            if (r1 < r0) goto L_0x0044
            r2 = 32
            goto L_0x0061
        L_0x0044:
            java.lang.Class<android.os.PowerManager> r1 = android.os.PowerManager.class
            java.lang.String r0 = "PROXIMITY_SCREEN_OFF_WAKE_LOCK"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x005a, IllegalAccessException -> 0x0052 }
            r0 = 0
            int r2 = r1.getInt(r0)     // Catch:{ NoSuchFieldException -> 0x005a, IllegalAccessException -> 0x0052 }
            goto L_0x0061
        L_0x0052:
            r1 = move-exception
            java.lang.String r0 = "unable to access PROXIMITY_SCREEN_OFF_WAKE_LOCK field in PowerManager"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x008b }
            goto L_0x0060
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "no PROXIMITY_SCREEN_OFF_WAKE_LOCK field in PowerManager"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x008b }
        L_0x0060:
            r2 = -1
        L_0x0061:
            X.01V r0 = r6.A2C     // Catch:{ Exception -> 0x008b }
            android.os.PowerManager r1 = r0.A0I()     // Catch:{ Exception -> 0x008b }
            if (r1 != 0) goto L_0x0070
            java.lang.String r0 = "voip/service/acquireProximityWakeLock pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x008b }
            goto L_0x0092
        L_0x0070:
            android.os.PowerManager$WakeLock r0 = r6.A0P     // Catch:{ Exception -> 0x008b }
            if (r0 != 0) goto L_0x0092
            r0 = -1
            if (r2 == r0) goto L_0x0092
            java.lang.String r0 = "VoiceService Proximity"
            android.os.PowerManager$WakeLock r0 = X.C43421zy.A00(r1, r0, r2)     // Catch:{ Exception -> 0x008b }
            r6.A0P = r0     // Catch:{ Exception -> 0x008b }
            if (r0 == 0) goto L_0x0092
            r0.acquire()     // Catch:{ Exception -> 0x008b }
            java.lang.String r0 = "voip/service/acquireProximityWakeLock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x008b }
            goto L_0x0092
        L_0x008b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            r6.A0P = r0
        L_0x0092:
            X.4L9 r5 = r6.A0f
            X.4De r4 = r6.A0U
            android.hardware.SensorEventListener r2 = r5.A00
            if (r2 == 0) goto L_0x00a4
            android.hardware.SensorManager r1 = r5.A02
            android.hardware.Sensor r0 = r5.A01
            r1.unregisterListener(r2, r0)
            r0 = 0
            r5.A00 = r0
        L_0x00a4:
            if (r4 == 0) goto L_0x0033
            X.4gN r3 = new X.4gN
            r3.<init>(r4, r5)
            r5.A00 = r3
            android.hardware.SensorManager r2 = r5.A02
            android.hardware.Sensor r1 = r5.A01
            r0 = 2
            r2.registerListener(r3, r1, r0)
            return
        L_0x00b6:
            if (r2 != 0) goto L_0x0024
            boolean r0 = r7.isCaller
            if (r0 != 0) goto L_0x00c4
            com.whatsapp.voipcalling.CallState r0 = r7.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r0)
            if (r0 != 0) goto L_0x0024
        L_0x00c4:
            boolean r0 = r7.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x0024
            r3 = 1
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0k(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r1.A03((X.C15830rv) r0) != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r7.A1Z.A00 != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ec, code lost:
        if (r7.A16 == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
        if (r6 != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0l(com.whatsapp.voipcalling.CallInfo r19) {
        /*
            r18 = this;
            X.AnonymousClass00B.A01()
            r2 = r19
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r2)
            r7 = r18
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_START_ACTIVITY_FOR_INCOMING_CALL no active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r19 == 0) goto L_0x001d
            X.1An r3 = r7.A1q
            java.lang.String r1 = r2.callId
            r0 = 4
            r3.A03(r1, r0)
        L_0x001d:
            return
        L_0x001e:
            java.lang.String r0 = "voip/service/startActivityForIncomingCall Enter"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1fV r0 = r2.callWaitingInfo
            int r1 = r0.A01
            r11 = 0
            r0 = 1
            r6 = 0
            if (r1 != r0) goto L_0x002e
            r6 = 1
        L_0x002e:
            com.whatsapp.jid.UserJid r5 = r2.getInitialPeerJid()
            X.AnonymousClass00B.A06(r5)
            com.whatsapp.voipcalling.CallState r3 = r2.callState
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 23
            if (r1 < r0) goto L_0x00a5
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r3 == r0) goto L_0x00a5
            if (r6 != 0) goto L_0x0101
            r0 = 29
            if (r1 >= r0) goto L_0x0101
            X.0sG r0 = r7.A27
            X.0sH r3 = r0.A08(r5)
            X.0sf r0 = r7.A2a
            boolean r0 = r0.A0Q(r5)
            if (r0 != 0) goto L_0x0073
            if (r3 == 0) goto L_0x009e
            X.1ko r0 = r3.A0D
            if (r0 != 0) goto L_0x009e
            boolean r0 = r7.A1I
            if (r0 != 0) goto L_0x009e
            X.14s r1 = r7.A2b
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r3.A08(r0)
            X.AnonymousClass00B.A06(r0)
            X.0rv r0 = (X.C15830rv) r0
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x009e
        L_0x0073:
            r4 = 1
        L_0x0074:
            com.whatsapp.jid.UserJid r9 = r2.getPeerJid()
            X.AnonymousClass00B.A06(r9)
            boolean r12 = r2.videoEnabled
            java.lang.String r10 = r2.callId
            boolean r13 = r2.isGroupCall
            com.whatsapp.jid.GroupJid r8 = r2.groupJid
            r7.A0e(r8, r9, r10, r11, r12, r13)
            X.26Z r0 = r7.A1k
            r0.A04(r2)
        L_0x008b:
            r0 = 2
            if (r4 == 0) goto L_0x008f
            r0 = 1
        L_0x008f:
            if (r6 == 0) goto L_0x0094
            if (r4 == 0) goto L_0x0094
            r11 = 1
        L_0x0094:
            r7.A0m(r2, r0, r11)
            java.lang.String r0 = "voip/service/startActivityForIncomingCall Exit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x009e:
            X.0tH r0 = r7.A1Z
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00a5
            goto L_0x0073
        L_0x00a5:
            X.15A r1 = r7.A2d
            java.lang.String r0 = "voip/notifyShowingIncomingCallUI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Iterable r0 = r1.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x00b5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r0 = r1.next()
            X.0y9 r0 = (X.C19270y9) r0
            r0.A00()
            goto L_0x00b5
        L_0x00c5:
            r14 = 0
            android.content.Context r12 = r7.A1X
            X.0tH r0 = r7.A1Z
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r16 = r15
            r17 = r14
            android.content.Intent r3 = X.C14750ph.A0b(r12, r13, r14, r15, r16, r17)
            if (r6 == 0) goto L_0x00fe
            X.1fV r0 = r2.callWaitingInfo
            java.lang.String r1 = r0.A04
        L_0x00e2:
            java.lang.String r0 = "call_id"
            r3.putExtra(r0, r1)
            if (r6 != 0) goto L_0x00ee
            boolean r0 = r7.A16
            r1 = 1
            if (r0 != 0) goto L_0x00ef
        L_0x00ee:
            r1 = 0
        L_0x00ef:
            java.lang.String r0 = "callAccepted"
            r3.putExtra(r0, r1)
            r1 = 6
            java.lang.String r0 = "lobbyEntryPoint"
            r3.putExtra(r0, r1)
            r12.startActivity(r3)
            goto L_0x0102
        L_0x00fe:
            java.lang.String r1 = r2.callId
            goto L_0x00e2
        L_0x0101:
            r4 = 1
        L_0x0102:
            if (r6 != 0) goto L_0x008b
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0l(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r3.A1G == false) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0m(com.whatsapp.voipcalling.CallInfo r23, int r24, boolean r25) {
        /*
            r22 = this;
            X.AnonymousClass00B.A01()
            r5 = r23
            if (r23 == 0) goto L_0x00ca
            boolean r0 = r5.callEnding
            if (r0 != 0) goto L_0x00ca
            X.1fV r1 = r5.callWaitingInfo
            int r0 = r1.A01
            r7 = 0
            r4 = 1
            r3 = r22
            r6 = 1
            if (r0 == r4) goto L_0x001f
            r6 = 0
            boolean r0 = r3.A1B
            if (r0 != 0) goto L_0x002b
            boolean r0 = r3.A1G
            if (r0 != 0) goto L_0x002b
        L_0x001f:
            r7 = 1
            X.1An r2 = r3.A1q
            if (r6 == 0) goto L_0x00c3
            java.lang.String r1 = r1.A04
        L_0x0026:
            java.lang.String r0 = "build_voip_notification"
            r2.A02(r1, r0)
        L_0x002b:
            boolean r1 = r3.A1N
            r0 = -1
            X.2dA r12 = X.C52122dA.A00(r5, r0, r1)
            X.1SK r10 = r3.A1p
            android.content.Context r11 = r3.A1X
            r15 = 0
            X.0wb r13 = r3.A1u
            r14 = r24
            android.app.Notification r8 = r10.A00(r11, r12, r13, r14, r15)
            if (r7 == 0) goto L_0x0050
            X.1An r2 = r3.A1q
            java.lang.String r1 = r12.A05
            java.lang.String r0 = "start_foreground_service"
            r2.A02(r1, r0)
            if (r6 == 0) goto L_0x0050
            r2.A00(r1)
        L_0x0050:
            boolean r0 = r3.A1H
            r2 = 23
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "VoiceService/startForegroundService Background restrictions on"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yL r0 = r3.A2E
            r0.A02(r2, r8)
        L_0x0060:
            com.whatsapp.jid.GroupJid r1 = r5.groupJid
            if (r1 != 0) goto L_0x006a
            com.whatsapp.jid.UserJid r1 = r5.getCreatorJid()
            if (r1 == 0) goto L_0x006f
        L_0x006a:
            X.15I r0 = r3.A2A
            r0.A09(r1, r15)
        L_0x006f:
            r3.A1G = r4
        L_0x0071:
            return
        L_0x0072:
            monitor-enter(r3)
            X.0tz r0 = r13.A0e     // Catch:{ all -> 0x00c7 }
            android.content.Context r7 = r0.A00     // Catch:{ all -> 0x00c7 }
            X.116 r6 = r13.A18     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "voicefgservice/start-service notifcation:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c7 }
            r0.append(r8)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "com.obwhatsapp.service.VoiceFgService.START"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00c7 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "com.obwhatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID"
            android.content.Intent r1 = r1.putExtra(r0, r2)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "com.obwhatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE"
            r9 = r25
            android.content.Intent r1 = r1.putExtra(r0, r9)     // Catch:{ all -> 0x00c7 }
            com.obwhatsapp.calling.service.VoiceFGService.A02 = r8     // Catch:{ all -> 0x00c7 }
            java.lang.Class<com.obwhatsapp.calling.service.VoiceFGService> r0 = com.obwhatsapp.calling.service.VoiceFGService.class
            boolean r0 = r6.A03(r7, r1, r0)     // Catch:{ all -> 0x00c7 }
            r3.A1B = r0     // Catch:{ all -> 0x00c7 }
            monitor-exit(r3)
            if (r0 != 0) goto L_0x0071
            r21 = 1
            r16 = r10
            r17 = r11
            r18 = r12
            r19 = r13
            r20 = r14
            android.app.Notification r1 = r16.A00(r17, r18, r19, r20, r21)
            X.0yL r0 = r3.A2E
            r0.A02(r2, r1)
            goto L_0x0060
        L_0x00c3:
            java.lang.String r1 = r5.callId
            goto L_0x0026
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00ca:
            java.lang.String r0 = "do not create notification, we are not in a active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0m(com.whatsapp.voipcalling.CallInfo, int, boolean):void");
    }

    public final void A0n(CallInfo callInfo, String str, int i2) {
        String obj;
        Context context;
        int i3;
        AnonymousClass1ZF r0;
        String str2;
        C46812Gi r02;
        C19470yU r2 = this.A2Q;
        if (r2 instanceof AnonymousClass11B) {
            AnonymousClass11B r22 = (AnonymousClass11B) r2;
            if (r22.A04.A00.A05(C15910s6.A11)) {
                for (AnonymousClass1V3 r5 : r22.A05.A00()) {
                    if (r5 instanceof C46802Gh) {
                        C46802Gh r52 = (C46802Gh) r5;
                        try {
                            C15880s3 A022 = r52.A07.A02("com.facebook.stella");
                            AnonymousClass112 r1 = r52.A03;
                            CallInfo callInfo2 = Voip.getCallInfo();
                            switch (i2) {
                                case 1:
                                case 2:
                                case 14:
                                case 18:
                                    str2 = "user_ended_call";
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                case 11:
                                case 13:
                                case 15:
                                case 16:
                                case 17:
                                case 20:
                                case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                                case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                                case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                                    str2 = "call_failed";
                                    break;
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                                case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                                    str2 = "not_accepted";
                                    break;
                                case 12:
                                    str2 = "rejected";
                                    break;
                                case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                                    str2 = "missing_voip_permissions";
                                    break;
                                default:
                                    str2 = "other";
                                    break;
                            }
                            String A032 = callInfo2 == null ? null : r1.A00.A03(A022, callInfo2.callId);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("call_ended_reason", str2);
                                jSONObject.put("call_id", A032);
                                r02 = new C46812Gi("call_ended", jSONObject);
                            } catch (JSONException unused) {
                                r02 = null;
                            }
                            r52.A01(r02);
                        } catch (SecurityException e2) {
                            Log.e("StellaEventHandler/cannot create event for untrusted package", e2);
                        }
                    }
                }
            }
        }
        if (callInfo == null && (callInfo = C30341cC.A06()) == null) {
            obj = "voip/call/end without call info";
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass00B.A01();
            if (i2 == 25 || i2 == 24) {
                str = null;
            } else {
                if (!TextUtils.isEmpty(str) || !callInfo.isCaller || callInfo.callState != CallState.CALLING || this.A17 || SystemClock.elapsedRealtime() - this.A09 <= 10000) {
                    if (TextUtils.isEmpty(str) && i2 == 30) {
                        int i4 = (callInfo.callDuration > 0 ? 1 : (callInfo.callDuration == 0 ? 0 : -1));
                        context = this.A1X;
                        i3 = R.string.str1a8a;
                        if (i4 > 0) {
                            i3 = R.string.str1a79;
                        }
                    }
                    if (!(str == null || (r0 = this.A0a) == null)) {
                        ((VoipActivityV2) r0).A1f = str;
                        this.A2s = -1;
                    }
                } else {
                    context = this.A1X;
                    i3 = R.string.str1a80;
                }
                str = context.getString(i3);
                ((VoipActivityV2) r0).A1f = str;
                this.A2s = -1;
            }
            if (!callInfo.isCaller || callInfo.callState != CallState.CALLING || !this.A2u) {
                this.A2p = i2;
            } else {
                this.A2p = 14;
            }
            StringBuilder sb = new StringBuilder("voip/call/end without text=");
            sb.append(str);
            sb.append(", reason code=");
            sb.append(this.A2p);
            Log.i(sb.toString());
            Future future = this.A1y.A0L;
            if (future != null) {
                future.cancel(true);
            }
            this.A14.execute(new RunnableRunnableShape0S0101000_I0((Object) this, i2, 8));
            StringBuilder sb2 = new StringBuilder("voip/call/end elapsed ");
            sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            sb2.append(" ms");
            obj = sb2.toString();
        }
        Log.i(obj);
    }

    public final void A0o(CallInfo callInfo, boolean z2, boolean z3) {
        String obj;
        CallState callState;
        AnonymousClass00B.A01();
        StringBuilder sb = new StringBuilder("voip/phone-call-in-progress-changed: ");
        sb.append(z2);
        if (callInfo == null) {
            obj = null;
        } else {
            StringBuilder sb2 = new StringBuilder(", call state: ");
            sb2.append(callInfo.callState);
            obj = sb2.toString();
        }
        sb.append(obj);
        Log.i(sb.toString());
        if (callInfo != null && (callState = callInfo.callState) != CallState.NONE) {
            if (!z2) {
                if (!z3) {
                    Message obtainMessage = this.A0L.obtainMessage(38);
                    this.A0L.removeMessages(38);
                    this.A0L.sendMessageDelayed(obtainMessage, 2000);
                } else {
                    boolean z4 = callInfo.videoEnabled;
                    AnonymousClass26Z r1 = this.A1k;
                    Boolean bool = Boolean.TRUE;
                    if (z4) {
                        r1.A06(callInfo, bool);
                    } else {
                        r1.A07(callInfo, bool);
                    }
                }
                this.A1k.A03();
            } else if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING) {
                A0W(4, (String) null);
                return;
            } else {
                AnonymousClass26Z r0 = this.A1k;
                r0.A05(callInfo);
                r0.A01();
                this.A1D = true;
            }
            RunnableRunnableShape0S0210000_I0 runnableRunnableShape0S0210000_I0 = new RunnableRunnableShape0S0210000_I0(this, callInfo, 4, z2);
            if (this.A2O.A0E(C16620tM.A02, 2903)) {
                this.A14.execute(runnableRunnableShape0S0210000_I0);
            } else {
                runnableRunnableShape0S0210000_I0.run();
            }
        }
    }

    public final void A0p(C37831po r35, boolean z2) {
        AnonymousClass1D0 r3 = this.A2L;
        C37831po r4 = r35;
        if (r4.A04 == null) {
            C15810rt r1 = r3.A09;
            UserJid userJid = r4.A0C.A01;
            if (r1.A06(userJid) != null) {
                C38771rO r2 = new C38771rO(new C28381Vw(userJid, C224718b.A00(r3.A02, r3.A03, false), false), r4.A0A);
                ArrayList arrayList = new ArrayList();
                C28381Vw r5 = r2.A11;
                C15830rv r6 = r5.A00;
                UserJid of = UserJid.of(r6);
                if (!C16030sJ.A0O(of)) {
                    StringBuilder sb = new StringBuilder("CallLog/fromFMessageMissedCall bad UserJid: ");
                    sb.append(r6);
                    Log.e(sb.toString());
                } else {
                    C35011lE r7 = new C35011lE(0, of, r5.A01, r5.A02);
                    long j2 = r2.A0I;
                    boolean z3 = r4.A0I;
                    GroupJid groupJid = r4.A04;
                    boolean z4 = r4.A0H;
                    List emptyList = Collections.emptyList();
                    DeviceJid deviceJid = r4.A0B;
                    C38571r0 r12 = r4.A06;
                    boolean z5 = z3;
                    boolean z6 = r4.A09;
                    boolean z7 = z4;
                    DeviceJid deviceJid2 = deviceJid;
                    C38591r2 r13 = r4.A0G;
                    C37831po r122 = new C37831po(r13, deviceJid2, groupJid, r2, r7, r12, (String) null, emptyList, 0, 2, -1, j2, 0, z5, z6, false, true, z7);
                    for (C38581r1 r72 : r4.A04()) {
                        Map map = r122.A0D;
                        UserJid userJid2 = r72.A02;
                        map.put(userJid2, new C38581r1(userJid2, r72.A00, -1));
                    }
                    arrayList.add(r122);
                }
                r2.A14(arrayList);
                r3.A0A.A0W(r2);
            }
        }
        AnonymousClass15A r14 = this.A2d;
        Log.i("voip/notifyCallMissed");
        for (C19270y9 A042 : r14.A01()) {
            A042.A04(r4, z2);
        }
    }

    public final void A0q(C37831po r10, boolean z2) {
        C38571r0 r3;
        synchronized (r10) {
            if (r10.A0H != z2) {
                r10.A0J = true;
            }
            r10.A0H = z2;
        }
        String str = r10.A0C.A02;
        String A0A2 = C30341cC.A0A(str);
        StringBuilder sb = new StringBuilder("voip/setCallLogIsJoinableGroupCall callId:");
        sb.append(A0A2);
        sb.append(" joinable:");
        sb.append(z2);
        Log.i(sb.toString());
        if (z2) {
            boolean z3 = false;
            if (r10.A0B != null) {
                z3 = true;
            }
            AnonymousClass00B.A0B("Can't rejoin from call logs missing call creator", z3);
            C15850ry r32 = this.A20;
            r32.A05.execute(new RunnableRunnableShape3S0200000_I0_1(r32, 47, r10));
            if (r10.A06 == null) {
                GroupJid groupJid = r10.A04;
                if (groupJid != null) {
                    this.A2c.Acn(new C78803yi(new AnonymousClass3FL(this, str), this.A2M, groupJid), new Void[0]);
                }
                r3 = new C38571r0(r10.A04, str, r10.A02(), r10.A0I);
            } else {
                return;
            }
        } else {
            C15850ry r33 = this.A20;
            r33.A05.execute(new RunnableRunnableShape3S0200000_I0_1(r33, 48, r10));
            if (r10.A06 != null) {
                r3 = null;
            } else {
                SharedPreferences.Editor edit = this.A1j.A01().edit();
                StringBuilder sb2 = new StringBuilder("joinable_");
                sb2.append(A0A2);
                edit.remove(sb2.toString()).apply();
                return;
            }
        }
        r10.A08(r3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x018c: MOVE  (r1v9 com.whatsapp.voipcalling.CallState) = (r19v0 com.whatsapp.voipcalling.CallState)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    public final void A0r(com.whatsapp.voipcalling.CallState r19, com.whatsapp.voipcalling.CallInfo r20) {
        /*
            r18 = this;
            java.lang.String r1 = "voip/service/stop "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r2 = r18
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass00B.A01()
            monitor-enter(r2)
            boolean r0 = r2.A1B     // Catch:{ all -> 0x024b }
            r4 = 0
            if (r0 == 0) goto L_0x0032
            X.0wb r1 = r2.A1u     // Catch:{ all -> 0x024b }
            X.0tz r0 = r1.A0e     // Catch:{ all -> 0x024b }
            android.content.Context r3 = r0.A00     // Catch:{ all -> 0x024b }
            X.116 r1 = r1.A18     // Catch:{ all -> 0x024b }
            java.lang.String r0 = "voicefgservice/stop-service"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x024b }
            java.lang.Class<com.obwhatsapp.calling.service.VoiceFGService> r0 = com.obwhatsapp.calling.service.VoiceFGService.class
            r1.A01(r3, r0)     // Catch:{ all -> 0x024b }
            r2.A1B = r4     // Catch:{ all -> 0x024b }
        L_0x0032:
            boolean r0 = r2.A1G     // Catch:{ all -> 0x024b }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "VoiceService/stopForegroundService cancel via waNotificationManager"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x024b }
            X.0yL r3 = r2.A2E     // Catch:{ all -> 0x024b }
            r1 = 23
            r0 = 0
            r3.A03(r1, r0)     // Catch:{ all -> 0x024b }
            r2.A1G = r4     // Catch:{ all -> 0x024b }
        L_0x0045:
            monitor-exit(r2)
            r8 = r20
            if (r20 == 0) goto L_0x0053
            java.lang.String r3 = r8.callId
            X.0yL r1 = r2.A2E
            r0 = 51
            r1.A03(r0, r3)
        L_0x0053:
            boolean r0 = r2.A1Q
            if (r0 == 0) goto L_0x024a
            long r9 = android.os.SystemClock.elapsedRealtime()
            r15 = 0
            r2.A1Q = r4
            X.C804844a.A00 = r4
            r6 = 0
            r2.A0D = r6
            r4 = 0
            r2.A0u = r4
            r2.A16 = r15
            r2.A1A = r15
            r2.A1N = r15
            r2.A2s = r4
            r2.A2t = r4
            r2.A0d = r4
            r2.A0k = r4
            r0 = 1500(0x5dc, float:2.102E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0o = r0
            r2.A0J = r4
            r2.A0n = r4
            r2.A0l = r4
            r2.A0t = r4
            r2.A18 = r15
            r2.A0A = r6
            r2.A0Z = r4
            r2.A0V = r4
            r2.A0Y = r4
            r2.A0X = r4
            r2.A0W = r4
            r2.A12 = r4
            r2.A11 = r4
            r5 = 1
            r2.A1T = r5
            r2.A0r = r4
            r2.A0p = r4
            r2.A17 = r15
            r2.A09 = r6
            r2.A1F = r15
            r2.A15 = r15
            r2.A08 = r15
            r2.A2p = r15
            r2.A2q = r4
            java.util.Map r0 = r2.A2k
            r0.clear()
            java.util.Map r0 = r2.A2l
            r0.clear()
            X.39S r0 = r2.A1y
            java.util.Set r0 = r0.A0K
            r0.clear()
            java.util.Map r0 = r2.A2j
            r0.clear()
            r2.A1O = r15
            r2.A19 = r15
            r0 = 30
            r2.A06 = r0
            r2.A02 = r15
            r2.A2u = r15
            X.4RX r3 = r2.A1w
            r3.A02 = r6
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r3.A01 = r0
            r3.A00 = r0
            r2.A0E = r6
            r0 = -1
            r2.A0C = r0
            r2.A03 = r15
            r2.A0v = r4
            r2.A1E = r15
            r2.A0q = r4
            r2.A0B = r6
            r2.A1D = r15
            r2.A1I = r15
            X.1SO r0 = r2.A1z
            r0.clear()
            r2.A1L = r15
            java.util.Set r0 = r2.A13
            r0.clear()
            android.telephony.TelephonyManager r1 = r2.A1Y
            if (r1 != 0) goto L_0x0148
            java.lang.String r0 = "voip/service/stop telephonyManager=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0102:
            android.content.Context r6 = r2.A1X
            android.content.BroadcastReceiver r0 = r2.A0F
            r6.unregisterReceiver(r0)
            X.26Z r3 = r2.A1k
            java.lang.String r0 = "voip/audio_route/onCallStop using telecom:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            boolean r0 = r3.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0134
            X.4Wm r0 = r3.A09
            r0.A01()
            X.1B1 r0 = r3.A0G
            r0.A05(r3)
            android.content.Context r1 = r3.A08
            X.2nD r0 = r3.A0A
            r1.unregisterReceiver(r0)
        L_0x0134:
            r3.A03 = r15
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0141
            android.content.BroadcastReceiver r0 = r2.A0G
            r6.unregisterReceiver(r0)
        L_0x0141:
            r2.A0P()
            r2.A0U()
            goto L_0x0156
        L_0x0148:
            X.0sj r0 = r2.A2F
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x0102
            android.telephony.PhoneStateListener r0 = r2.A0Q
            r1.listen(r0, r15)
            goto L_0x0102
        L_0x0156:
            X.01V r0 = r2.A2C     // Catch:{ Exception -> 0x017f }
            android.os.PowerManager r7 = r0.A0I()     // Catch:{ Exception -> 0x017f }
            if (r7 != 0) goto L_0x0165
            java.lang.String r0 = "voice/service/turn-on-screen pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x017f }
            goto L_0x0183
        L_0x0165:
            boolean r0 = r7.isScreenOn()     // Catch:{ Exception -> 0x017f }
            if (r0 != 0) goto L_0x0183
            r1 = 268435466(0x1000000a, float:2.524358E-29)
            java.lang.String r0 = "VoiceService end call"
            android.os.PowerManager$WakeLock r7 = X.C43421zy.A00(r7, r0, r1)     // Catch:{ Exception -> 0x017f }
            if (r7 == 0) goto L_0x0183
            r0 = 1
            r7.acquire(r0)     // Catch:{ Exception -> 0x017f }
            r7.release()     // Catch:{ Exception -> 0x017f }
            goto L_0x0183
        L_0x017f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0183:
            r2.A0K()
            android.media.SoundPool r0 = r2.A0I
            if (r0 == 0) goto L_0x0240
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            r1 = r19
            if (r1 == r0) goto L_0x0194
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0240
        L_0x0194:
            if (r20 == 0) goto L_0x0240
            X.1fV r0 = r8.callWaitingInfo
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0240
            r0 = 2131820547(0x7f110003, float:1.9273812E38)
            android.media.MediaPlayer r0 = android.media.MediaPlayer.create(r6, r0)
            if (r0 != 0) goto L_0x023a
            r6 = 500(0x1f4, float:7.0E-43)
        L_0x01a7:
            java.lang.String r1 = "voip/service/playEndCallTone duration: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r3.A00
            r0 = 2
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r1 != r0) goto L_0x01c2
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x01c2:
            java.lang.Integer r0 = r2.A0s
            if (r0 == 0) goto L_0x0234
            android.media.SoundPool r11 = r2.A0I
            int r12 = r0.intValue()
            r17 = 1065353216(0x3f800000, float:1.0)
            r16 = 0
            r14 = r13
            r11.play(r12, r13, r14, r15, r16, r17)
        L_0x01d4:
            android.os.Handler r0 = r2.A0N
            r0.removeMessages(r5)
            android.os.Handler r3 = r2.A0N
            int r0 = r6 + 100
            long r0 = (long) r0
            r3.sendEmptyMessageDelayed(r5, r0)
        L_0x01e1:
            android.os.Handler r0 = r2.A0M
            r0.removeCallbacksAndMessages(r4)
            X.0rz r3 = r2.A2G
            android.content.SharedPreferences$Editor r1 = r3.A0K()
            java.lang.String r0 = "voip_call_id"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            android.content.SharedPreferences$Editor r1 = r3.A0K()
            java.lang.String r0 = "voip_call_ab_test_bucket"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            r2.A0M()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r9
            java.lang.String r0 = "voip/service/stop elapsed "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " ms"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 4
            java.lang.String r0 = "voip/service/stop"
            A06(r0)
            boolean r0 = r2.A1M
            if (r0 == 0) goto L_0x0244
            X.0xj r0 = r2.A1h
            r0.A00(r1, r15)
            return
        L_0x0234:
            java.lang.String r0 = "VoiceService:playEndCallTone sound pool has not been loaded successfully"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01d4
        L_0x023a:
            int r6 = r0.getDuration()
            goto L_0x01a7
        L_0x0240:
            r3.A02()
            goto L_0x01e1
        L_0x0244:
            X.0xj r1 = r2.A1h
            r0 = 3
            r1.A00(r0, r15)
        L_0x024a:
            return
        L_0x024b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447225g.A0r(com.whatsapp.voipcalling.CallState, com.whatsapp.voipcalling.CallInfo):void");
    }

    public void A0s(CallState callState, String str) {
        AudioManager A0G2 = this.A2C.A0G();
        int i2 = 3;
        switch (callState.ordinal()) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 11:
                if (A0G2 != null && !A12(str)) {
                    int mode = A0G2.getMode();
                    Integer num = this.A0k;
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    if (mode != i2) {
                        A0G2.setMode(i2);
                    }
                    StringBuilder sb = new StringBuilder("voip/updateAudioModeForCallState ");
                    sb.append(callState);
                    sb.append(" to ");
                    sb.append(i2);
                    Log.i(sb.toString());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A0t(String str) {
        Log.i("voip/call/reject");
        this.A14.execute(new RunnableRunnableShape0S2000000_I0(str, "", 0));
    }

    public void A0u(String str) {
        AnonymousClass00B.A0B("must be called for self managed connection", A12(str));
        AnonymousClass3M9 A0B2 = A0B(str);
        if (Build.VERSION.SDK_INT >= 28 && A0B2 != null && A0B2.getState() == 5) {
            A0B2.onUnhold();
        }
    }

    public final void A0v(String str) {
        if (str == null || str.equals(Voip.getCurrentCallId())) {
            A0W(13, this.A1X.getString(R.string.str1a80));
        } else {
            Voip.clearVoipParam(str);
        }
    }

    public void A0w(String str, String str2, int i2) {
        Log.i("voip/call/reject");
        if (i2 != 0) {
            A0A(str).A00 = Integer.valueOf(i2);
        }
        this.A14.execute(new RunnableRunnableShape0S2000000_I0(str, str2, 1));
    }

    public void A0x(List list) {
        DeviceJid deviceJid;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C37831po A0D2 = A0D(str);
            if (!(A0D2 == null || (deviceJid = A0D2.A0B) == null)) {
                arrayList.add(str);
                arrayList2.add(deviceJid);
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder("VoiceService/actionCheckOngoingCalls: ongoing calls count=");
            sb.append(arrayList.size());
            Log.i(sb.toString());
            Voip.checkOngoingCalls((String[]) arrayList.toArray(new String[0]), (DeviceJid[]) arrayList2.toArray(new DeviceJid[0]));
        }
    }

    public final void A0y(List list, int i2) {
        this.A1c.Acq(new RunnableRunnableShape0S0201000_I0((Object) this, i2, (Object) list, 10));
    }

    public final boolean A0z(AudioManager audioManager) {
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        AnonymousClass26Z r3 = this.A1k;
        boolean z2 = true;
        if (r3.A00 != 1) {
            z2 = false;
        }
        if (z2 == isSpeakerphoneOn) {
            return false;
        }
        StringBuilder sb = new StringBuilder("VoiceService:callEnding audio route mismatch detectecd. current = ");
        sb.append(audioManager.isSpeakerphoneOn());
        sb.append(", Expected = ");
        boolean z3 = true;
        if (r3.A00 != 1) {
            z3 = false;
        }
        sb.append(z3);
        Log.w(sb.toString());
        return true;
    }

    public boolean A10(GroupJid groupJid, String str, List list, boolean z2) {
        if (list.isEmpty()) {
            Log.e("voip/service/addIncomingCallToTelecom peerJids is empty");
        } else if (Build.VERSION.SDK_INT >= 28) {
            C216514x r3 = this.A1v;
            if (r3.A0F()) {
                Context context = this.A1X;
                C16000sG r7 = this.A27;
                C16080sP r5 = this.A28;
                String A092 = C30341cC.A09(r7, r5, this.A2P, groupJid, this.A2b);
                if (A092 == null) {
                    boolean z3 = false;
                    if (list.size() == 1) {
                        z3 = true;
                    }
                    AnonymousClass2Wj A022 = C52142dD.A02(r7, r5, list, 2, z3);
                    A092 = C40651uT.A03(A022 == null ? null : A022.A00(context));
                    if (A092 == null) {
                        Log.w("voip/service/addIncomingCallToTelecom displayName is null");
                        return false;
                    }
                }
                return r3.A0G((UserJid) list.get(0), str, A092, z2);
            }
        }
        return false;
    }

    public final boolean A11(CallInfo callInfo) {
        if (callInfo == null) {
            callInfo = Voip.getCallInfo();
        }
        return this.A1W > 0 && callInfo != null && callInfo.groupJid != null && callInfo.isJoinableGroupCall && !A0A(callInfo.callId).A01;
    }

    public boolean A12(String str) {
        return A0B(str) != null;
    }

    public final long[] A13(UserJid userJid, boolean z2, boolean z3) {
        int i2;
        if ("0".equals(this.A2a.A07(userJid.getRawString()).A04())) {
            return new long[]{0, 0, 0};
        }
        if (!z2) {
            return new long[]{0, 50, 50, 70, 30, 70, 30, 50, 50, 70, 30, 70, 30, 50, 50, 70, 30, 70, 4000};
        }
        long[] jArr = {0, 150, 83, 50, 67, 20, 97, 20, 96, 50, 67, 35, 195, 50, 78, 300, 4000};
        if (z3 || (i2 = this.A1W) <= 1) {
            return jArr;
        }
        long[] jArr2 = new long[((i2 << 4) + 1)];
        int i3 = 0;
        do {
            System.arraycopy(jArr, 1, jArr2, (i3 << 4) + 1, 16);
            i3++;
        } while (i3 < i2);
        return jArr2;
    }

    public final synchronized void YoEndCall() {
        synchronized (this) {
            if (this.A1B) {
                C18380wb r1 = this.A1u;
                Context context = r1.A0e.A00;
                AnonymousClass116 r12 = r1.A18;
                Log.i("voicefgservice/stop-service");
                r12.A01(context, VoiceFGService.class);
                this.A1B = false;
            }
            if (this.A1G) {
                Log.i("VoiceService/stopForegroundService cancel via waNotificationManager");
                this.A2E.A03(23, (String) null);
                this.A1G = false;
            }
        }
    }
}
