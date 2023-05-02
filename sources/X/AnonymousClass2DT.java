package X;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.accessibility.AccessibilityManager;
import androidx.core.app.NotificationCompat$DecoratedCustomViewStyle;
import com.obwhatsapp.R;
import com.obwhatsapp.voicerecorder.IDxNObserverShape110S0100000_2_I0;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2DT  reason: invalid class name */
public class AnonymousClass2DT implements C448826a, C19620yj {
    public static int A0x;
    public static AnonymousClass197 A0y = new AnonymousClass197(250);
    public static byte[] A0z;
    public static String[] A10 = {"GT-I9505", "GT-I9506", "GT-I9505G", "SGH-I337", "SGH-M919", "SCH-I545", "SPH-L720", "SCH-R970", "GT-I9508", "SGH-N045", "SC-04E"};
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A = 0;
    public long A0B;
    public Activity A0C;
    public Sensor A0D;
    public SensorEventListener A0E;
    public SensorManager A0F;
    public AudioManager.OnAudioFocusChangeListener A0G;
    public MediaPlayer A0H;
    public Visualizer A0I;
    public AnonymousClass5PK A0J;
    public C52032cr A0K;
    public AnonymousClass5PL A0L;
    public C15860rz A0M;
    public C84554Kz A0N;
    public C38701rH A0O;
    public C30211bx A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final Handler A0a = new C56442ne(Looper.getMainLooper(), this);
    public final PowerManager.WakeLock A0b;
    public final C16300so A0c;
    public final C14870pt A0d;
    public final AnonymousClass1B3 A0e;
    public final C19610yi A0f;
    public final AnonymousClass01V A0g;
    public final C16980tz A0h;
    public final C16260sj A0i;
    public final C19150xq A0j;
    public final C14710pd A0k;
    public final AnonymousClass1B4 A0l;
    public final AnonymousClass1B1 A0m;
    public final AnonymousClass15M A0n;
    public final AnonymousClass15O A0o;
    public final C23231Az A0p;
    public final AnonymousClass1B0 A0q;
    public final C54272h7 A0r = new IDxNObserverShape110S0100000_2_I0(this, 0);
    public final AnonymousClass1B2 A0s;
    public final AnonymousClass01D A0t;
    public final boolean A0u;
    public final boolean A0v;
    public volatile boolean A0w;

    public AnonymousClass2DT(Activity activity, C16300so r5, C14870pt r6, AnonymousClass1B3 r7, C19610yi r8, AnonymousClass01V r9, C16980tz r10, C16260sj r11, C15860rz r12, C19150xq r13, C14710pd r14, AnonymousClass1B4 r15, AnonymousClass1B1 r16, AnonymousClass15M r17, AnonymousClass15O r18, C23231Az r19, AnonymousClass1B0 r20, AnonymousClass1B2 r21, AnonymousClass01D r22, boolean z2, boolean z3) {
        this.A0C = activity;
        this.A0h = r10;
        this.A0k = r14;
        this.A0d = r6;
        this.A0c = r5;
        this.A0p = r19;
        this.A0g = r9;
        this.A0o = r18;
        this.A0j = r13;
        this.A0q = r20;
        this.A0s = r21;
        this.A0i = r11;
        this.A0M = r12;
        this.A0e = r7;
        this.A0m = r16;
        this.A0l = r15;
        this.A0n = r17;
        this.A0f = r8;
        this.A0t = r22;
        this.A0Y = z2;
        this.A0u = z3;
        if (A00() != -1) {
            PowerManager A0I2 = r9.A0I();
            if (A0I2 == null) {
                Log.w("messageaudioplayer pm=null");
            } else {
                this.A0b = C43421zy.A00(A0I2, "OBWhatsApp MessageAudioPlayer ProximityWakeLock", A00());
            }
        }
        this.A0v = C30211bx.A01(r14);
    }

    public static final int A00() {
        if (Build.VERSION.SDK_INT >= 21) {
            return 32;
        }
        try {
            return PowerManager.class.getDeclaredField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").getInt((Object) null);
        } catch (NoSuchFieldException e2) {
            Log.w("no PROXIMITY_SCREEN_OFF_WAKE_LOCK field in PowerManager", e2);
            return -1;
        } catch (IllegalAccessException e3) {
            Log.w("unable to access PROXIMITY_SCREEN_OFF_WAKE_LOCK field in PowerManager", e3);
            return -1;
        }
    }

    public static void A01(C38701rH r3, int i2) {
        A0y.put(r3.A11, Integer.valueOf(i2));
    }

    public static boolean A02(BluetoothHeadset bluetoothHeadset, AudioManager audioManager) {
        AudioDeviceInfo communicationDevice;
        try {
            if (C15450qv.A0A()) {
                if (audioManager == null || (communicationDevice = audioManager.getCommunicationDevice()) == null) {
                    return false;
                }
                int type = communicationDevice.getType();
                if (!(type == 7 || type == 8 || type == 26)) {
                    return false;
                }
            } else if (bluetoothHeadset == null) {
                return false;
            } else {
                for (BluetoothDevice bluetoothClass : bluetoothHeadset.getConnectedDevices()) {
                    if (bluetoothClass.getBluetoothClass().getMajorDeviceClass() != 1024) {
                    }
                }
                return false;
            }
            return true;
        } catch (Exception e2) {
            Log.e((Throwable) e2);
            return false;
        }
    }

    public int A03() {
        C30211bx r0 = this.A0P;
        if (r0 == null) {
            return 0;
        }
        return Math.max(this.A04, r0.A02());
    }

    public final void A04() {
        AudioManager A0G2 = this.A0g.A0G();
        if (A0G2 != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A0G;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new C91754gR(this.A0f);
                this.A0G = onAudioFocusChangeListener;
            }
            A0G2.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public final void A05() {
        AnonymousClass2DT A002 = this.A0f.A00();
        if (A002 != this && A002 != null) {
            if (this.A0k.A0E(C16620tM.A02, 952)) {
                A002.A0I(false, false);
            } else {
                A002.A0I(true, false);
            }
        }
    }

    public final void A06() {
        int i2;
        if (this.A0I == null && !this.A0u && this.A0L != null && (i2 = Build.VERSION.SDK_INT) != 26) {
            if ((i2 != 28 || !Build.MANUFACTURER.equals("Xiaomi") || !Build.MODEL.equals("Mi 9 Lite")) && this.A0i.A00.A00.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                try {
                    Visualizer visualizer = new Visualizer(0);
                    this.A0I = visualizer;
                    visualizer.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
                    this.A0I.setDataCaptureListener(new C91914gh(this), Visualizer.getMaxCaptureRate() / 2, true, true);
                    this.A0I.setEnabled(true);
                } catch (RuntimeException e2) {
                    Log.e("visualmediaplayer/start ", e2);
                }
            }
        }
    }

    public final void A07() {
        if (this.A0Y) {
            boolean z2 = this.A0Q;
            AnonymousClass1B4 r1 = this.A0l;
            if (z2) {
                r1.A01(this);
            } else {
                r1.A06 = true;
                r1.A0F.A03(14, (String) null);
            }
        }
        C52032cr r0 = this.A0K;
        if (r0 != null && A0L(r0.AC8())) {
            this.A0K.AUS(A03());
        }
        A01(this.A0O, A03());
        this.A0w = false;
        this.A0m.A05(this);
        this.A0n.A02.remove(this);
    }

    public final void A08() {
        BluetoothHeadset bluetoothHeadset = this.A0m.A01;
        AudioManager A0G2 = this.A0g.A0G();
        PowerManager.WakeLock wakeLock = this.A0b;
        if (wakeLock != null && !wakeLock.isHeld() && !this.A0n.A00 && !A02(bluetoothHeadset, A0G2) && this.A0P.A0D() && !this.A0Q) {
            wakeLock.acquire();
            Log.i("messageaudioplayer/startProximityListener acquired proximityWakeLock");
        }
    }

    public final void A09() {
        PowerManager.WakeLock wakeLock = this.A0b;
        if (wakeLock != null && wakeLock.isHeld()) {
            if (Build.VERSION.SDK_INT >= 21) {
                wakeLock.release(1);
            } else {
                wakeLock.release();
            }
            Log.i("messageaudioplayer/stopproximitylistener released proximityWakeLock");
        }
    }

    public void A0A(int i2) {
        try {
            C30211bx r0 = this.A0P;
            if (r0 != null) {
                r0.A0A(i2);
            }
            this.A04 = i2;
        } catch (IOException e2) {
            Log.e((Throwable) e2);
        }
    }

    public void A0B(int i2, boolean z2, boolean z3) {
        String string;
        int AFH;
        int i3;
        A05();
        this.A0o.A00();
        if (this.A0C != null && !this.A0p.A02(R.string.str12ac)) {
            this.A0C.setVolumeControlStream(3);
        }
        AudioManager A0G2 = this.A0g.A0G();
        if (A0G2 != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A0G;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new C91754gR(this.A0f);
                this.A0G = onAudioFocusChangeListener;
            }
            int i4 = 1;
            if (this.A0O.A08 == 1) {
                i4 = 3;
            }
            A0G2.requestAudioFocus(onAudioFocusChangeListener, 3, i4);
        }
        this.A0V = false;
        this.A0B = System.currentTimeMillis();
        if (this.A0P == null) {
            Log.i("messageaudioplayer/start");
            if (this.A0L != null && (i3 = Build.VERSION.SDK_INT) >= 17 && i3 <= 18 && "samsung".equals(Build.MANUFACTURER)) {
                if (C43041zF.A03(Build.MODEL, A10)) {
                    try {
                        C16750ta r2 = this.A0O.A02;
                        AnonymousClass00B.A06(r2);
                        if (r2.A0F != null) {
                            MediaPlayer mediaPlayer = new MediaPlayer();
                            this.A0H = mediaPlayer;
                            mediaPlayer.setDataSource(r2.A0F.getAbsolutePath());
                            this.A0H.setAudioStreamType(3);
                            this.A0H.prepare();
                        }
                    } catch (IOException e2) {
                        Log.e((Throwable) e2);
                        this.A0c.AcB("messageaudioplayer/failed to prepare silentPlayer ", e2.toString(), true);
                    }
                }
            }
            try {
                C16750ta r0 = this.A0O.A02;
                AnonymousClass00B.A06(r0);
                File file = r0.A0F;
                if (file != null) {
                    this.A02 = 3;
                    C30211bx A002 = C30211bx.A00(this.A0h, this.A0k, file, 3);
                    this.A0P = A002;
                    A002.A05();
                    if (!A0K(i2)) {
                        A0x = 0;
                    }
                    if (z2 && (AFH = ((AnonymousClass1B7) this.A0t.get()).AFH(this.A0O.A13)) >= 0) {
                        this.A04 = AFH;
                    }
                    this.A0P.A0A(this.A04);
                    this.A0P.A08();
                    C30211bx r1 = this.A0P;
                    if (r1 instanceof C78603yM) {
                        this.A03 = this.A0O.A00 * 1000;
                        r1.A0C(new AnonymousClass4E4(this));
                    } else {
                        this.A03 = r1.A03();
                    }
                    this.A0a.sendEmptyMessage(0);
                    C38701rH r22 = this.A0O;
                    if (C218615s.A02(r22)) {
                        this.A0j.A08(r22, 25);
                    }
                    A06();
                    if (this.A0Y) {
                        AnonymousClass1B4 r10 = this.A0l;
                        C38701rH r9 = this.A0O;
                        if (r9 != null && r9.A10 == 2) {
                            boolean z4 = true;
                            if (r10.A02 != r9) {
                                r10.A02 = r9;
                                Bitmap bitmap = null;
                                r10.A03 = null;
                                Context context = r10.A0E.A00;
                                C007503l A003 = C218415q.A00(context);
                                A003.A0J = "media_playback@1";
                                A003.A08(new NotificationCompat$DecoratedCustomViewStyle());
                                A003.A0V = false;
                                r10.A01 = A003;
                                A003.A07.icon = yo.getNIcon(R.drawable.notifybar);
                                int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
                                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(17104902);
                                if (r9.A11.A02) {
                                    C16040sK r02 = r10.A07;
                                    r02.A0B();
                                    C28881Zb r12 = r02.A01;
                                    if (r12 != null) {
                                        bitmap = r10.A0B.A02(context, r12, dimensionPixelSize, dimensionPixelSize2);
                                    }
                                    int i5 = r9.A08;
                                    int i6 = R.string.str05d5;
                                    if (i5 == 1) {
                                        i6 = R.string.str05ed;
                                    }
                                    string = context.getString(i6);
                                } else {
                                    C16000sG r13 = r10.A09;
                                    UserJid A0C2 = r9.A0C();
                                    AnonymousClass00B.A06(A0C2);
                                    C16010sH A0A2 = r13.A0A(A0C2);
                                    bitmap = r10.A0B.A02(context, A0A2, dimensionPixelSize, dimensionPixelSize2);
                                    String A0C3 = r10.A0A.A0C(A0A2);
                                    int i7 = r9.A08;
                                    int i8 = R.string.str0e26;
                                    if (i7 == 1) {
                                        i8 = R.string.str0e6b;
                                    }
                                    string = context.getString(i8, new Object[]{A0C3});
                                }
                                r10.A03 = string;
                                if (bitmap == null) {
                                    bitmap = C17160ud.A00(r10.A08.A01.A00, (float) dimensionPixelSize2, R.drawable.avatar_contact, dimensionPixelSize);
                                }
                                r10.A01.A06(bitmap);
                            }
                            r10.A02 = r9;
                            AccessibilityManager A0P2 = r10.A0D.A0P();
                            if (A0P2 == null || !A0P2.isTouchExplorationEnabled()) {
                                z4 = false;
                            }
                            r10.A04 = z4;
                            r10.A06 = false;
                            r10.A05 = false;
                        }
                        r10.A01(this);
                    }
                    C52032cr r03 = this.A0K;
                    if (r03 != null && A0L(r03.AC8())) {
                        this.A0K.AXQ(this.A03);
                    }
                    A0y.remove(this.A0O.A11);
                    this.A0s.A02(this.A0r);
                    this.A0m.A04(this);
                    this.A0n.A02.add(this);
                    this.A0e.A04();
                    this.A0w = true;
                    A0C(this);
                    this.A0f.A09(this, z3);
                    return;
                }
            } catch (IOException | IllegalStateException e3) {
                this.A0c.AcB("messageaudioplayer/failed to prepare mediaplayer", e3.toString(), true);
                throw e3;
            } catch (IOException | IllegalStateException e4) {
                Log.e(e4);
            }
            this.A0d.A09(R.string.str0925, 0);
            this.A0V = true;
            A0I(true, false);
            return;
        }
        Log.i("messageaudioplayer/resume");
        try {
            this.A0P.A0A(this.A04);
            if (!A0K(i2)) {
                A0x = 0;
            }
            this.A0P.A08();
            this.A0U = false;
            this.A0a.sendEmptyMessage(0);
            A0C(this);
            A06();
            if (this.A0Y) {
                this.A0l.A01(this);
            }
            C52032cr r04 = this.A0K;
            if (r04 != null && A0L(r04.AC8())) {
                this.A0K.AWY();
            }
            A0y.remove(this.A0O.A11);
            this.A0e.A04();
            this.A0w = true;
            this.A0m.A04(this);
            this.A0n.A02.add(this);
        } catch (IOException | IllegalStateException unused) {
            this.A0d.A09(R.string.str0925, 0);
            this.A0V = true;
            A0I(true, false);
        }
    }

    public final void A0C(AnonymousClass2DT r5) {
        A08();
        if (this.A0F == null) {
            SensorManager A0D2 = this.A0g.A0D();
            this.A0F = A0D2;
            if (A0D2 != null) {
                Sensor defaultSensor = A0D2.getDefaultSensor(8);
                this.A0D = defaultSensor;
                if (defaultSensor != null) {
                    C91704gM r2 = new C91704gM(this, r5);
                    this.A0E = r2;
                    this.A0F.registerListener(r2, defaultSensor, 2);
                }
            }
        }
    }

    public void A0D(C38701rH r3) {
        Number number = (Number) A0y.get(r3.A11);
        if (number != null) {
            A0A(number.intValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (com.obwhatsapp.yo.yo.Audio_ears() == false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(boolean r8) {
        /*
            r7 = this;
            X.1B1 r0 = r7.A0m
            android.bluetooth.BluetoothHeadset r1 = r0.A01
            X.01V r0 = r7.A0g
            android.media.AudioManager r6 = r0.A0G()
            X.15M r0 = r7.A0n
            boolean r0 = r0.A00
            r5 = 0
            if (r0 != 0) goto L_0x0017
            boolean r0 = A02(r1, r6)
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r8 = 0
        L_0x0018:
            boolean r0 = r7.A0R
            if (r0 == r8) goto L_0x0028
            if (r8 == 0) goto L_0x0029
            X.1bx r0 = r7.A0P
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            boolean r1 = com.obwhatsapp.yo.yo.Audio_sensor()
            if (r1 != 0) goto L_0x0030
            return
        L_0x0030:
            java.lang.String r1 = "messageaudioplayer/onearproximity "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.A0R = r8
            android.os.PowerManager$WakeLock r0 = r7.A0b
            if (r0 != 0) goto L_0x0061
            android.app.Activity r0 = r7.A0C
            if (r0 == 0) goto L_0x0061
            android.view.Window r2 = r0.getWindow()
            android.view.WindowManager$LayoutParams r1 = r2.getAttributes()
            if (r8 == 0) goto L_0x008c
            float r0 = r1.screenBrightness
            r7.A01 = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
        L_0x005c:
            r1.screenBrightness = r0
            r2.setAttributes(r1)
        L_0x0061:
            X.2cr r0 = r7.A0K
            if (r0 == 0) goto L_0x0068
            r0.AQF(r8)
        L_0x0068:
            X.1bx r0 = r7.A0P
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0028
            X.1bx r0 = r7.A0P
            int r4 = r0.A02()
            X.1bx r0 = r7.A0P
            r0.A06()
            r0 = 0
            r7.A0P = r0
            X.1rH r0 = r7.A0O
            X.0ta r0 = r0.A02
            X.AnonymousClass00B.A06(r0)
            r3 = 3
            if (r8 == 0) goto L_0x008f
            r3 = 0
            goto L_0x008f
        L_0x008c:
            float r0 = r7.A01
            goto L_0x005c
        L_0x008f:
            r7.A02 = r3     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            X.0tz r2 = r7.A0h     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            java.io.File r1 = r0.A0F     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            X.0pd r0 = r7.A0k     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            X.1bx r0 = X.C30211bx.A00(r2, r0, r1, r3)     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            r7.A0P = r0     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            android.app.Activity r1 = r7.A0C     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            if (r1 == 0) goto L_0x00ac
            int r0 = r7.A02     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            r1.setVolumeControlStream(r0)     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            boolean r0 = com.obwhatsapp.yo.yo.Audio_ears()     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            if (r0 != 0) goto L_0x00b3
        L_0x00ac:
            if (r8 == 0) goto L_0x00b3
            if (r6 == 0) goto L_0x00b3
            r6.setSpeakerphoneOn(r5)     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
        L_0x00b3:
            X.1bx r0 = r7.A0P     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            r0.A05()     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            int r0 = r4 + -1000
            int r1 = java.lang.Math.max(r5, r0)     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            r7.A04 = r1     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            X.1bx r0 = r7.A0P     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            r0.A0A(r1)     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            if (r8 != 0) goto L_0x00e1
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            long r0 = r7.A0B     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            long r3 = r3 - r0
            r1 = 1500(0x5dc, double:7.41E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00e1
            r0 = 1
            r7.A0U = r0     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            r7.A07()     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            r7.A09()     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            r7.A04()     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            return
        L_0x00e1:
            int r0 = A0x     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            boolean r0 = r7.A0K(r0)     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            if (r0 != 0) goto L_0x00eb
            A0x = r5     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
        L_0x00eb:
            X.1bx r0 = r7.A0P     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            r0.A08()     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            return
        L_0x00f1:
            X.0pt r1 = r7.A0d
            r0 = 2131888421(0x7f120925, float:1.9411477E38)
            r1.A09(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2DT.A0E(boolean):void");
    }

    public void A0F(boolean z2) {
        C30211bx r0 = this.A0P;
        if (r0 != null && r0.A0D()) {
            this.A0P.A04();
            ((AnonymousClass1B7) this.A0t.get()).Adn();
            this.A0U = true;
            Visualizer visualizer = this.A0I;
            if (visualizer != null) {
                visualizer.setEnabled(false);
                this.A0I.release();
                this.A0I = null;
            }
            A07();
            A09();
            if (!z2) {
                A0H(false);
            } else {
                float min = Math.min(((float) A03()) / ((float) this.A03), 1.0f);
                if (min > this.A00) {
                    this.A00 = min;
                }
            }
        }
        A04();
    }

    public void A0G(boolean z2) {
        A05();
        C30211bx r0 = this.A0P;
        if (r0 == null || !r0.A0D()) {
            int i2 = 0;
            if (z2) {
                i2 = A0x;
            }
            A0B(i2, true, false);
            return;
        }
        A0F(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r0 instanceof X.C78593yL) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(boolean r23) {
        /*
            r22 = this;
            r10 = r22
            X.1rH r1 = r10.A0O
            int r0 = r1.A08
            r2 = 1
            if (r0 == r2) goto L_0x000e
            boolean r0 = r10.A0X
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            X.0ta r0 = r1.A02
            if (r0 == 0) goto L_0x000d
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x000d
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r0 = ".opus"
            boolean r0 = r1.endsWith(r0)
            r18 = 0
            if (r0 == 0) goto L_0x0026
            r18 = 5
        L_0x0026:
            X.1bx r0 = r10.A0P
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0 instanceof X.C78593yL
            r17 = 3
            if (r0 != 0) goto L_0x0032
        L_0x0030:
            r17 = 5
        L_0x0032:
            int r1 = A0x
            r0 = 2
            if (r1 == r2) goto L_0x0132
            r16 = 2
            if (r1 == r0) goto L_0x003d
            r16 = 0
        L_0x003d:
            int r0 = r10.A03()
            float r1 = (float) r0
            int r0 = r10.A03
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r1, r0)
            float r1 = r10.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0055
            r10.A00 = r2
            r1 = r2
        L_0x0055:
            X.1B0 r11 = r10.A0q
            boolean r13 = r10.A0V
            int r0 = r10.A0A
            r21 = r0
            int r0 = r10.A09
            long r14 = (long) r0
            double r8 = (double) r1
            int r0 = r10.A08
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            X.1rH r2 = r10.A0O
            int r2 = r2.A00
            long r2 = (long) r2
            long r6 = r4.toMillis(r2)
            boolean r2 = r10.A0X
            r20 = r2
            int r2 = r10.A05
            long r4 = (long) r2
            boolean r2 = r10.A0W
            r19 = r2
            int r2 = r10.A06
            long r2 = (long) r2
            X.3sv r12 = new X.3sv
            r12.<init>()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12.A01 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r21)
            r12.A06 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r12.A05 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r18)
            r12.A07 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            r12.A04 = r13
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r12.A0B = r13
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r12.A03 = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.A0C = r0
            double r0 = (double) r6
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r6
            long r6 = java.lang.Math.round(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r12.A08 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r20)
            r12.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r12.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r12.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r12.A0A = r0
            X.0t9 r0 = r11.A00
            r0.A05(r12)
            r0 = 0
            r10.A00 = r0
            r0 = 0
            r10.A06 = r0
            r10.A05 = r0
            r10.A0W = r0
            r10.A0X = r0
            if (r23 == 0) goto L_0x000d
            X.1rH r0 = r10.A0O
            X.1Vw r0 = r0.A11
            X.0rv r1 = r0.A00
            boolean r0 = X.C16030sJ.A0G(r1)
            boolean r1 = X.C16030sJ.A0L(r1)
            r5 = 1
            X.0rz r4 = r10.A0M
            if (r0 == 0) goto L_0x0122
            X.01D r0 = r4.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r3 = "ptt_fast_playback_broadcast"
        L_0x010f:
            r0 = 0
            long r1 = r2.getLong(r3, r0)
            long r1 = r1 + r5
            android.content.SharedPreferences$Editor r0 = r4.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r1)
            r0.apply()
            return
        L_0x0122:
            X.01D r0 = r4.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            if (r1 == 0) goto L_0x012f
            java.lang.String r3 = "ptt_fast_playback_group"
            goto L_0x010f
        L_0x012f:
            java.lang.String r3 = "ptt_fast_playback_individual"
            goto L_0x010f
        L_0x0132:
            r16 = 1
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2DT.A0H(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if ((A03() + 50) > r9.A03) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(boolean r10, boolean r11) {
        /*
            r9 = this;
            int r1 = r9.A03
            int r0 = r9.A03()
            r6 = 0
            if (r1 == r0) goto L_0x0014
            int r0 = r9.A03()
            int r1 = r0 + 50
            int r0 = r9.A03
            r3 = 0
            if (r1 <= r0) goto L_0x0015
        L_0x0014:
            r3 = 1
        L_0x0015:
            java.lang.String r0 = "messageaudioplayer/stop playbackCompleted: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " duration: "
            r1.append(r0)
            int r0 = r9.A03
            r1.append(r0)
            java.lang.String r0 = " position: "
            r1.append(r0)
            int r0 = r9.A03()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A0H(r3)
            X.01D r0 = r9.A0t
            java.lang.Object r2 = r0.get()
            X.1B7 r2 = (X.AnonymousClass1B7) r2
            if (r3 == 0) goto L_0x016d
            X.1rH r0 = r9.A0O
            long r0 = r0.A13
            r2.Ac2(r0)
        L_0x0050:
            X.1bx r0 = r9.A0P
            r5 = 0
            if (r0 == 0) goto L_0x005a
            r0.A06()
            r9.A0P = r5
        L_0x005a:
            android.media.MediaPlayer r0 = r9.A0H
            if (r0 == 0) goto L_0x0068
            r0.reset()
            android.media.MediaPlayer r0 = r9.A0H
            r0.release()
            r9.A0H = r5
        L_0x0068:
            android.media.audiofx.Visualizer r0 = r9.A0I
            if (r0 == 0) goto L_0x0076
            r0.setEnabled(r6)
            android.media.audiofx.Visualizer r0 = r9.A0I
            r0.release()
            r9.A0I = r5
        L_0x0076:
            android.os.PowerManager$WakeLock r0 = r9.A0b
            if (r0 != 0) goto L_0x007e
            boolean r0 = r9.A0R
            if (r0 != 0) goto L_0x0092
        L_0x007e:
            android.hardware.SensorManager r2 = r9.A0F
            if (r2 == 0) goto L_0x008f
            android.hardware.SensorEventListener r1 = r9.A0E
            if (r1 == 0) goto L_0x008f
            android.hardware.Sensor r0 = r9.A0D
            if (r0 == 0) goto L_0x008f
            r2.unregisterListener(r1, r0)
            r9.A0F = r5
        L_0x008f:
            r9.A09()
        L_0x0092:
            r9.A04()
            android.app.Activity r1 = r9.A0C
            if (r1 == 0) goto L_0x009e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.setVolumeControlStream(r0)
        L_0x009e:
            if (r10 == 0) goto L_0x00a2
            r9.A04 = r6
        L_0x00a2:
            r9.A0U = r6
            android.os.Handler r0 = r9.A0a
            r0.removeMessages(r6)
            if (r3 == 0) goto L_0x00b4
            X.5PK r1 = r9.A0J
            if (r1 == 0) goto L_0x00b4
            int r0 = r9.A02
            r1.AUn(r0)
        L_0x00b4:
            X.0yi r7 = r9.A0f
            X.2DT r0 = r7.A00
            if (r0 != r9) goto L_0x0109
            boolean r0 = r9.A0Y
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r9.A0S
            X.1B4 r4 = r9.A0l
            if (r0 != 0) goto L_0x0121
            r0 = 1
            r4.A06 = r0
            X.0yL r1 = r4.A0F
            r0 = 14
            r1.A03(r0, r5)
        L_0x00ce:
            X.2cr r0 = r9.A0K
            if (r0 == 0) goto L_0x00e9
            X.1rH r0 = r0.AC8()
            boolean r0 = r9.A0L(r0)
            if (r0 == 0) goto L_0x00e9
            X.1rH r0 = r9.A0O
            int r0 = r0.A00
            if (r0 == 0) goto L_0x011e
            int r1 = r0 * 1000
        L_0x00e4:
            X.2cr r0 = r9.A0K
            r0.AXw(r1, r10)
        L_0x00e9:
            if (r10 == 0) goto L_0x00f4
            X.197 r1 = A0y
            X.1rH r0 = r9.A0O
            X.1Vw r0 = r0.A11
            r1.remove(r0)
        L_0x00f4:
            X.1B2 r1 = r9.A0s
            X.2h7 r0 = r9.A0r
            r1.A03(r0)
            X.1B1 r0 = r9.A0m
            r0.A05(r9)
            X.15M r0 = r9.A0n
            java.util.Set r0 = r0.A02
            r0.remove(r9)
            r9.A0w = r6
        L_0x0109:
            r7.A08(r5)
            if (r11 == 0) goto L_0x011d
            X.4Kz r0 = r9.A0N
            if (r0 == 0) goto L_0x011d
            android.view.View r2 = r0.A00
            X.0yi r1 = r0.A01
            X.01D r0 = r0.A02
            if (r2 != 0) goto L_0x0172
            X.AnonymousClass2DE.A09(r1, r0)
        L_0x011d:
            return
        L_0x011e:
            int r1 = r9.A03
            goto L_0x00e4
        L_0x0121:
            boolean r0 = r4.A04
            r3 = 1
            if (r0 != 0) goto L_0x0152
            X.0tz r0 = r4.A0E
            android.content.Context r0 = r0.A00
            java.lang.String r1 = r0.getPackageName()
            r0 = 2131559462(0x7f0d0426, float:1.8744269E38)
            android.widget.RemoteViews r8 = new android.widget.RemoteViews
            r8.<init>(r1, r0)
            r1 = 2131364908(0x7f0a0c2c, float:1.8349666E38)
            int r0 = r9.A03
            r8.setProgressBar(r1, r0, r0, r6)
            r2 = 2131364912(0x7f0a0c30, float:1.8349674E38)
            int r0 = r9.A03
            int r0 = r0 / 1000
            long r0 = (long) r0
            java.lang.String r0 = android.text.format.DateUtils.formatElapsedTime(r0)
            r8.setTextViewText(r2, r0)
            r4.A00(r8, r3)
            goto L_0x00ce
        L_0x0152:
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x00ce
            X.0tz r0 = r4.A0E
            android.content.Context r0 = r0.A00
            java.lang.String r2 = r0.getPackageName()
            r1 = 2131559463(0x7f0d0427, float:1.874427E38)
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            r0.<init>(r2, r1)
            r4.A00(r0, r3)
            r4.A06 = r6
            goto L_0x00ce
        L_0x016d:
            r2.Adn()
            goto L_0x0050
        L_0x0172:
            X.AnonymousClass2DE.A04(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2DT.A0I(boolean, boolean):void");
    }

    public boolean A0J() {
        C30211bx r0 = this.A0P;
        return r0 != null && r0.A0D();
    }

    public boolean A0K(int i2) {
        float f2;
        if (i2 == 0) {
            f2 = 1.0f;
        } else if (i2 == 1) {
            f2 = 1.5f;
        } else if (i2 == 2) {
            f2 = 2.0f;
        } else {
            StringBuilder sb = new StringBuilder("setFastPlaybackPlayerState: Did not handle FastPlaybackPlayerState: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("messageaudioplayer/setFastPlaybackPlayerState fastPlaybackPlayerState: ");
        sb2.append(i2);
        Log.i(sb2.toString());
        C30211bx r1 = this.A0P;
        if (r1 == null || !(r1 instanceof C78603yM) || !this.A0v) {
            return true;
        }
        return r1.A0E(this.A0c, f2);
    }

    public boolean A0L(C16740tZ r3) {
        return r3.A11.equals(this.A0O.A11);
    }

    public void ANj(int i2) {
        if (i2 == 0) {
            A08();
        } else if (i2 == 2) {
            A09();
        }
    }

    public void AS3(boolean z2) {
        if (z2) {
            A09();
        } else {
            A08();
        }
    }
}
