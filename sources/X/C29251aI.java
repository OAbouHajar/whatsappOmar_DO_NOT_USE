package X;

import android.animation.AnimatorSet;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape177S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxLazyShape245S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape167S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.facebook.redex.RunnableRunnableShape1S0110000_I1;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.camera.CameraActivity;
import com.obwhatsapp.camera.mode.CameraModeTabLayout;
import com.obwhatsapp.camera.overlays.AutofocusOverlay;
import com.obwhatsapp.camera.recording.RecordingView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1aI  reason: invalid class name and case insensitive filesystem */
public class C29251aI {
    public int A00;
    public int A01 = 0;
    public int A02;
    public long A03;
    public SoundPool A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public C14550pN A0A;
    public AnonymousClass2VA A0B;
    public AnonymousClass2Qt A0C;
    public C29261aJ A0D;
    public C54762iC A0E;
    public AnonymousClass2V5 A0F;
    public AnonymousClass2V7 A0G;
    public AnonymousClass2V9 A0H;
    public AnonymousClass2VD A0I;
    public AnonymousClass2DG A0J;
    public C16050sL A0K;
    public C51202bB A0L;
    public File A0M;
    public File A0N;
    public String A0O;
    public List A0P = Collections.emptyList();
    public List A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V = true;
    public boolean A0W;
    public boolean A0X = false;
    public boolean A0Y;
    public boolean A0Z;
    public final long A0a;
    public final AnonymousClass01A A0b;
    public final C16180sb A0c;
    public final C14870pt A0d;
    public final C15900s5 A0e;
    public final C23651Cv A0f;
    public final C17650vQ A0g;
    public final C23171At A0h;
    public final C23151Ar A0i;
    public final C23161As A0j;
    public final AnonymousClass01V A0k;
    public final C16440t3 A0l;
    public final C16980tz A0m;
    public final C15860rz A0n;
    public final AnonymousClass013 A0o;
    public final C14710pd A0p;
    public final C49172Rk A0q;
    public final C17020u3 A0r;
    public final C16320sq A0s;
    public final C19270y9 A0t = new IDxCObserverShape111S0100000_2_I0(this, 3);
    public final AnonymousClass15A A0u;
    public final Runnable A0v = new RunnableRunnableShape17S0100000_I1(this, 30);
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final /* synthetic */ C51952cZ A0z;
    public final /* synthetic */ C50412Zj A10;

    public C29251aI(AnonymousClass01A r4, C16180sb r5, C14870pt r6, C15900s5 r7, C23651Cv r8, C17650vQ r9, C51952cZ r10, C23171At r11, C50412Zj r12, C23151Ar r13, C23161As r14, AnonymousClass01V r15, C16440t3 r16, C16980tz r17, C15860rz r18, AnonymousClass013 r19, C14710pd r20, C49172Rk r21, C17020u3 r22, C51202bB r23, C16320sq r24, AnonymousClass15A r25, boolean z2) {
        this.A10 = r12;
        this.A0z = r10;
        this.A0m = r17;
        this.A0l = r16;
        this.A0f = r8;
        C14710pd r2 = r20;
        this.A0p = r2;
        this.A0d = r6;
        this.A0s = r24;
        this.A0c = r5;
        this.A0e = r7;
        this.A0q = r21;
        this.A0u = r25;
        this.A0g = r9;
        this.A0k = r15;
        this.A0o = r19;
        this.A0b = r4;
        this.A0n = r18;
        this.A0i = r13;
        this.A0j = r14;
        this.A0h = r11;
        this.A0r = r22;
        this.A0L = r23;
        C16620tM r1 = C16620tM.A02;
        this.A0x = r2.A0E(r1, 125);
        this.A0w = r2.A0E(r1, 2182);
        this.A02 = r2.A03(r1, 2614);
        this.A0a = System.currentTimeMillis();
        this.A0y = z2;
    }

    public static String A00(int i2) {
        switch (i2) {
            case 1:
                return "camera_tab";
            case 2:
                return "chat_button";
            case 3:
                return "chat_menu";
            case 4:
                return "status_tab";
            case 5:
                return "status_reply";
            case 6:
                return "smb_quick_reply_edit";
            case 7:
                return "smb_quick_reply_send";
            default:
                return "unknown";
        }
    }

    public static final void A01(View view, int i2, int i3) {
        AnonymousClass06X r1 = (AnonymousClass06X) view.getLayoutParams();
        r1.A0o = i2;
        r1.A0B = 0;
        r1.setMargins(0, 0, 0, i3);
        view.setLayoutParams(r1);
    }

    public final int A02() {
        int i2 = 0;
        if (!this.A0x && this.A0E != null && Settings.System.getInt(this.A0m.A00.getContentResolver(), "accelerometer_rotation", 0) == 0 && this.A0E.A00 != -1) {
            i2 = ((this.A0E.A00 - ((4 - A03().getWindowManager().getDefaultDisplay().getRotation()) % 4)) * 90) % 360;
            while (i2 < 0) {
                i2 += 360;
            }
        }
        return i2;
    }

    public final C14550pN A03() {
        C14550pN r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw new NullPointerException("Host activity is NULL");
    }

    public void A04() {
        C23161As r4 = this.A0j;
        r4.A01 = 0;
        if (r4.A0B) {
            r4.A09.AKi(554251647, "error_message", "permission");
            r4.A05(4);
        }
    }

    public void A05() {
        if (this.A0A != null) {
            AnonymousClass2DG r3 = this.A0J;
            Handler handler = r3.A01;
            handler.removeMessages(0);
            handler.removeMessages(1);
            r3.A01(false, false, false);
            this.A0u.A03(this.A0t);
            AnonymousClass2V7 r32 = this.A0G;
            if (r32 != null) {
                C16690tT r1 = r32.A06;
                if (r1 != null) {
                    r1.A06(true);
                    r32.A06 = null;
                }
                AnonymousClass2OM r0 = r32.A05;
                if (r0 != null) {
                    r0.A00();
                    r32.A05 = null;
                }
                C54852iN r12 = r32.A04;
                if (r12 != null) {
                    AnonymousClass2BC r02 = r12.A00;
                    if (r02 != null) {
                        r02.close();
                        r12.A00 = null;
                    }
                    r32.A04 = null;
                }
            }
            this.A0A = null;
        }
    }

    public void A06() {
        if (this.A0A != null) {
            if (this.A0C.AJZ()) {
                A0V(this.A0J.A02());
            }
            if (this.A08.getVisibility() == 0) {
                AnonymousClass2V5 r1 = this.A0F;
                if (r1.A0L) {
                    r1.A07(false);
                    r1.A00();
                }
                this.A08.setVisibility(8);
                this.A0F.A0I.setEnabled(false);
            }
            this.A0C.pause();
            C54762iC r0 = this.A0E;
            if (r0 != null) {
                r0.disable();
            }
        }
    }

    public void A07() {
        CircularProgressBar circularProgressBar;
        if (this.A0A != null && this.A0S) {
            AnonymousClass2V7 r0 = this.A0G;
            if ((r0 == null || r0.A0B.A0B != 3) && !this.A0w) {
                A03().findViewById(R.id.root_view).setSystemUiVisibility(4);
            }
            this.A0C.Acc();
            if (this.A08.getVisibility() == 8) {
                this.A08.setVisibility(0);
            }
            C54762iC r02 = this.A0E;
            if (r02 != null) {
                r02.enable();
            }
            this.A0F.A07(true);
            this.A0F.A00();
            if (this.A0w) {
                AnonymousClass2V5 r1 = this.A0F;
                if (r1.A0L && (circularProgressBar = r1.A06) != null) {
                    circularProgressBar.setProgress(0);
                }
            }
            if (this.A0I.A03.getVisibility() == 0) {
                AutofocusOverlay autofocusOverlay = this.A0I.A03;
                autofocusOverlay.A03 = false;
                autofocusOverlay.invalidate();
                autofocusOverlay.postDelayed(autofocusOverlay.A07, 0);
            }
        }
    }

    public void A08() {
        boolean A0X2 = A0X();
        boolean z2 = false;
        if (this.A0D.A00 == 2) {
            z2 = true;
        }
        if (A0X2) {
            if (z2) {
                A0W(this.A0J.A02());
            }
        } else if (z2) {
            A0D();
        } else {
            A0F();
        }
    }

    public void A09() {
        AnonymousClass2V7 r6 = this.A0G;
        C14550pN A032 = A03();
        C49172Rk r4 = this.A0q;
        C54892iR r3 = new C54892iR(this);
        C16320sq r2 = this.A0s;
        C16690tT r1 = r6.A06;
        if (r1 != null) {
            r1.A06(true);
        }
        C54902iS r12 = new C54902iS(A032, r3, r4);
        r6.A06 = r12;
        r2.Ack(r12, new Void[0]);
    }

    public void A0A() {
        int i2;
        View view;
        C23161As r2 = this.A0j;
        C51952cZ r5 = this.A0z;
        r2.A04("warm", A00(r5.AE4()));
        r2.A02(554251647, "showCamera");
        C14550pN r4 = this.A0A;
        if (r4 != null) {
            boolean z2 = this.A0w;
            int i3 = R.color.color0792;
            if (z2) {
                i3 = R.color.color00ec;
            }
            C434920f.A05(r4, i3, 2);
            if (Build.MANUFACTURER.equals("OnePlus")) {
                String str = Build.MODEL;
                if ((str.equals("ONEPLUS A3000") || str.equals("ONEPLUS A3003") || str.equals("ONEPLUS A3010")) && this.A0g.A02()) {
                    this.A0d.A09(R.string.str083d, 1);
                    r5.ANy();
                    r2.A01(554251647, "showCamera");
                    r2.A05(4);
                    return;
                }
            }
            this.A0S = true;
            C54762iC r0 = this.A0E;
            if (r0 != null) {
                r0.enable();
            }
            r2.A02 = SystemClock.elapsedRealtime();
            C23151Ar r1 = this.A0i;
            switch (r5.AE4()) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 9:
                    i2 = 10;
                    break;
                case 10:
                    i2 = 11;
                    break;
                case 11:
                    i2 = 12;
                    break;
                case 12:
                    i2 = 13;
                    break;
                case 13:
                    i2 = 14;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            r1.A01(i2);
            this.A0C.Acc();
            this.A08.removeCallbacks(this.A0v);
            int i4 = 0;
            this.A06.setVisibility(0);
            this.A0H.A01(0);
            if (this.A08.getVisibility() == 0) {
                view = this.A07;
                i4 = 8;
            } else {
                view = this.A08;
            }
            view.setVisibility(i4);
            A0U(true);
            this.A0b.A0o(true);
            r2.A01(554251647, "showCamera");
            return;
        }
        r2.A01(554251647, "showCamera");
        r2.A05(87);
        throw new IllegalStateException("need to call onCreate first");
    }

    public final void A0B() {
        C14550pN r7 = this.A0A;
        if (r7 != null) {
            AnonymousClass01V r6 = this.A0k;
            AnonymousClass013 r8 = this.A0o;
            long size = (long) this.A0D.A07.size();
            AnonymousClass2JP.A00(r7, r6, r8.A0J(new Object[]{Integer.valueOf(this.A0D.A07.size())}, R.plurals.plurals00dc, size));
        }
    }

    public final void A0C() {
        if (this.A0w && this.A0D.A01 == 1) {
            AnimatorSet animatorSet = this.A0G.A00;
            if (animatorSet == null || !animatorSet.isStarted()) {
                C29261aJ r1 = this.A0D;
                r1.A01 = 2;
                if (!r1.A07.isEmpty()) {
                    AnonymousClass2V5 r2 = this.A0F;
                    boolean z2 = true;
                    if (this.A0D.A01 != 1) {
                        z2 = false;
                    }
                    r2.A08(z2);
                }
                this.A0G.A03(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0181, code lost:
        if (r2 == 1) goto L_0x0183;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D() {
        /*
            r10 = this;
            X.1At r0 = r10.A0h
            X.0sj r0 = r0.A02
            java.lang.String r4 = "android.permission.RECORD_AUDIO"
            int r0 = r0.A03(r4)
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "cameraui/startvideocapture"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1aJ r0 = r10.A0D
            java.util.Set r0 = r0.A07
            int r1 = r0.size()
            int r0 = r10.A02
            if (r1 < r0) goto L_0x0029
            X.0pd r2 = r10.A0p
            r1 = 2693(0xa85, float:3.774E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            r10.A02 = r0
        L_0x0029:
            X.1aJ r0 = r10.A0D
            java.util.Set r0 = r0.A07
            int r1 = r0.size()
            int r0 = r10.A02
            r6 = 1
            r5 = 0
            if (r1 < r0) goto L_0x0050
            X.0pt r4 = r10.A0d
            X.0pN r3 = r10.A03()
            r2 = 2131891734(0x7f121616, float:1.9418196E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r5] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            r4.A0H(r0, r5)
            return
        L_0x0050:
            X.0vQ r0 = r10.A0g
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0066
            X.0pt r1 = r10.A0d
            r0 = 2131888189(0x7f12083d, float:1.9411006E38)
            r1.A09(r0, r6)
            X.2cZ r0 = r10.A0z
            r0.ANy()
            return
        L_0x0066:
            X.1As r4 = r10.A0j
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x007a
            X.0yX r0 = r4.A09
            r1 = 554249147(0x21092bbb, float:4.647528E-19)
            r0.ALE(r1)
            java.lang.String r0 = "start_video_capture"
            r4.A02(r1, r0)
        L_0x007a:
            X.0sb r9 = r10.A0c
            X.0u3 r8 = r10.A0r
            X.1XK r3 = X.AnonymousClass1XK.A0X
            X.0pd r2 = r10.A0p
            r1 = 401(0x191, float:5.62E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r7 = 4
            r1 = 1
            if (r0 == 0) goto L_0x008f
            r1 = 4
        L_0x008f:
            java.lang.String r0 = ".mp4"
            java.io.File r0 = X.AnonymousClass20J.A00(r9, r8, r3, r0, r1)
            r10.A0N = r0
            boolean r0 = r10.A0y
            if (r0 != 0) goto L_0x00a6
            boolean r0 = r10.A0w
            if (r0 == 0) goto L_0x015e
            X.2iC r0 = r10.A0E
            if (r0 == 0) goto L_0x00a6
            r0.disable()
        L_0x00a6:
            int r3 = r10.A02()
            X.2Qt r0 = r10.A0C
            boolean r0 = r0.ALf()
            if (r0 == 0) goto L_0x00d6
            X.0pN r0 = r10.A0A
            if (r0 == 0) goto L_0x00d6
            X.2V5 r1 = r10.A0F
            X.0pN r0 = r10.A03()
            android.view.Window r8 = r0.getWindow()
            android.view.WindowManager$LayoutParams r2 = r8.getAttributes()
            android.view.View r1 = r1.A0B
            r1.setVisibility(r5)
            r0 = -855638017(0xffffffffccffffff, float:-1.3421772E8)
            r1.setBackgroundColor(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.screenBrightness = r0
            r8.setAttributes(r2)
        L_0x00d6:
            X.1aJ r0 = r10.A0D
            int r0 = r0.A00
            r2 = 2
            r1 = 0
            if (r0 != r2) goto L_0x00df
            r1 = 1
        L_0x00df:
            X.2V5 r8 = r10.A0F
            boolean r0 = r8.A0L
            if (r1 == 0) goto L_0x0141
            if (r0 == 0) goto L_0x00ee
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1067450368(0x3fa00000, float:1.25)
            r8.A02(r1, r0)
        L_0x00ee:
            android.view.View r0 = r10.A08
            r0.setKeepScreenOn(r6)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A05 = r0
            X.2Qt r4 = r10.A0C
            java.io.File r1 = r10.A0N
            boolean r0 = r4.AIs()
            if (r0 == 0) goto L_0x0105
            int r3 = 360 - r3
        L_0x0105:
            r4.AgF(r1, r3)
            X.2DG r4 = r10.A0J
            X.1aJ r0 = r10.A0D
            int r0 = r0.A00
            r3 = 0
            if (r0 != r2) goto L_0x0112
            r3 = 1
        L_0x0112:
            long r0 = java.lang.System.currentTimeMillis()
            r4.A00 = r0
            android.os.Handler r0 = r4.A01
            r0.sendEmptyMessage(r5)
            r0 = r3 ^ 1
            r4.A01(r6, r6, r0)
            X.2V5 r1 = r10.A0F
            X.1aJ r0 = r10.A0D
            int r0 = r0.A00
            if (r0 != r2) goto L_0x013f
            boolean r0 = r10.A0x
            if (r0 == 0) goto L_0x013f
        L_0x012e:
            r1.A06(r6)
            X.2V9 r0 = r10.A0H
            r0.A01(r7)
            r10.A0U(r5)
            X.01V r0 = r10.A0k
            X.C41631wI.A02(r0)
            return
        L_0x013f:
            r6 = 0
            goto L_0x012e
        L_0x0141:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0158
            r0 = 1058642330(0x3f19999a, float:0.6)
            r8.A03(r1, r0, r6)
            r0 = 1073741824(0x40000000, float:2.0)
            r8.A02(r1, r0)
        L_0x0150:
            X.2V5 r0 = r10.A0F
            com.obwhatsapp.WaImageView r0 = r0.A0I
            r0.setPressed(r5)
            goto L_0x00ee
        L_0x0158:
            r0 = 1069547520(0x3fc00000, float:1.5)
            r8.A04(r1, r0, r6)
            goto L_0x0150
        L_0x015e:
            X.0pN r3 = r10.A03()
            android.view.WindowManager r0 = r3.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r2 = r0.getRotation()
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            if (r1 == r6) goto L_0x0189
            r0 = 2
            if (r1 != r0) goto L_0x00a6
            if (r2 == 0) goto L_0x0183
            r0 = 8
            if (r2 != r6) goto L_0x0184
        L_0x0183:
            r0 = 0
        L_0x0184:
            r3.setRequestedOrientation(r0)
            goto L_0x00a6
        L_0x0189:
            if (r2 == 0) goto L_0x0190
            if (r2 == r6) goto L_0x0190
            r0 = 9
            goto L_0x0184
        L_0x0190:
            r3.setRequestedOrientation(r6)
            goto L_0x00a6
        L_0x0195:
            X.2V5 r0 = r10.A0F
            r0.A00()
            X.0pN r3 = r10.A03()
            X.0pN r0 = r10.A03()
            r1 = 0
            X.2iV r2 = new X.2iV
            r2.<init>(r0)
            r0 = 2131232303(0x7f08062f, float:1.8080711E38)
            r2.A01 = r0
            r0 = 2131890656(0x7f1211e0, float:1.941601E38)
            r2.A06 = r0
            r2.A0I = r1
            r0 = 2131890655(0x7f1211df, float:1.9416008E38)
            r2.A09 = r0
            r2.A0G = r1
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r4
            r2.A0K = r1
            android.content.Intent r0 = r2.A00()
            r3.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29251aI.A0D():void");
    }

    public final void A0E() {
        Animation r7;
        if (!A0X() || (this.A0D.A00 == 2 && this.A0x)) {
            boolean z2 = false;
            if (this.A0I.A03.getVisibility() == 0) {
                z2 = true;
            }
            if (z2) {
                AutofocusOverlay autofocusOverlay = this.A0I.A03;
                autofocusOverlay.A03 = false;
                autofocusOverlay.invalidate();
                autofocusOverlay.postDelayed(autofocusOverlay.A07, 0);
            }
            if (!this.A0W) {
                this.A0W = true;
                C23161As r2 = this.A0j;
                boolean AIs = this.A0C.AIs();
                r2.A03 = SystemClock.elapsedRealtime();
                if (r2.A0B) {
                    C19500yX r3 = r2.A09;
                    r3.ALE(554250848);
                    r3.AKi(554250848, "origin", AIs ? "front" : "back");
                }
                this.A0C.ALm();
                AnonymousClass2V5 r5 = this.A0F;
                boolean AIs2 = this.A0C.AIs();
                if (r5.A0L) {
                    int i2 = r5.A00;
                    int i3 = i2 - 180;
                    if (AIs2) {
                        i3 = i2 + 180;
                    }
                    r7 = new RotateAnimation((float) i2, (float) i3, 1, 0.5f, 1, 0.5f);
                    r7.setInterpolator(new LinearInterpolator());
                    r7.setDuration(100);
                    r7.setFillAfter(true);
                    r7.setInterpolator(AnonymousClass2V5.A0N);
                    r7.setDuration(200);
                    r7.setStartOffset(100);
                } else {
                    float f2 = 180.0f;
                    if (AIs2) {
                        f2 = -180.0f;
                    }
                    WaImageView waImageView = r5.A0J;
                    r7 = new C54962iY(f2, (float) (waImageView.getWidth() >> 1), (float) (waImageView.getHeight() >> 1), (float) (-waImageView.getWidth()));
                    r7.setInterpolator(new LinearInterpolator());
                    r7.setDuration(360);
                }
                r7.setAnimationListener(new C54952iX(r5, AIs2));
                r5.A0J.startAnimation(r7);
            }
        }
    }

    public final void A0F() {
        SoundPool soundPool;
        Log.i("cameraui/takepicture");
        if (this.A0Z && (soundPool = this.A04) != null) {
            soundPool.play(this.A00, 1.0f, 1.0f, 0, 0, 1.0f);
        }
        if (this.A0D.A07.size() >= this.A02) {
            this.A02 = this.A0p.A03(C16620tM.A02, 2693);
        }
        int size = this.A0D.A07.size();
        int i2 = this.A02;
        if (size >= i2) {
            this.A0d.A0H(A03().getString(R.string.str1616, new Object[]{Integer.valueOf(i2)}), 0);
            return;
        }
        C23161As r2 = this.A0j;
        r2.A00 = SystemClock.elapsedRealtime();
        if (r2.A0B) {
            r2.A09.ALE(554240366);
        }
        AnonymousClass2V5 r1 = this.A0F;
        r1.A0I.setEnabled(false);
        r1.A0J.setEnabled(false);
        r1.A0G.setEnabled(false);
        if (!(!this.A0D.A07.isEmpty())) {
            this.A0G.A02();
            this.A0F.A06(false);
            this.A0H.A01(4);
        }
        if (this.A0C.ALf()) {
            if (this.A0A != null) {
                AnonymousClass2V5 r12 = this.A0F;
                Window window = A03().getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                View view = r12.A0B;
                view.setVisibility(0);
                view.setBackgroundColor(-3886);
                attributes.screenBrightness = 1.0f;
                window.setAttributes(attributes);
            }
            this.A08.postDelayed(new RunnableRunnableShape17S0100000_I1(this, 29), 300);
            return;
        }
        boolean z2 = false;
        if (this.A0D.A07.size() > 0) {
            z2 = true;
        }
        this.A0C.Age(new AnonymousClass2VC(this), z2);
    }

    public final void A0G(int i2) {
        AnonymousClass2V7 r2 = this.A0G;
        r2.A0B.A0L(i2 + this.A0m.A00.getResources().getDimensionPixelSize(R.dimen.dimen013b) + r2.A0A.getMeasuredHeight());
    }

    public final void A0H(int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A05.getLayoutParams();
        marginLayoutParams.setMargins(0, i2, 0, i3);
        this.A05.setLayoutParams(marginLayoutParams);
    }

    public void A0I(int i2, int i3, Intent intent) {
        if (i2 != 90 && i2 != 101) {
            return;
        }
        if (i3 == -1) {
            C51952cZ r5 = this.A0z;
            r5.AE4();
            for (C54972iZ r4 : this.A0D.A06) {
                if (!this.A0D.A07.isEmpty()) {
                    C29261aJ r0 = this.A0D;
                    if (!r0.A07.contains(r4.A9L())) {
                        File ACD = r4.ACD();
                        if (!ACD.delete()) {
                            StringBuilder sb = new StringBuilder("cameraui/cannot-delete-file ");
                            sb.append(ACD);
                            Log.w(sb.toString());
                        }
                    }
                }
                C17970vw.A0K(A03(), r4.A9L());
            }
            this.A0D.A00();
            AnonymousClass2V7 r02 = this.A0G;
            if (r02 != null) {
                r02.A00();
            }
            List A082 = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
            if (A082.size() == 1 && !A082.equals(this.A0P)) {
                Context context = this.A0m.A00;
                Intent A0x2 = new C14750ph().A0x(context, (C15830rv) A082.get(0));
                AnonymousClass22U.A00(A0x2, "CameraUi");
                context.startActivity(A0x2);
            }
            r5.AWx();
        } else if (i3 == 1) {
            this.A0D.A03.A01(intent.getExtras());
            if (this.A0U) {
                this.A0P = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
            }
            A0S(intent.getParcelableArrayListExtra("android.intent.extra.STREAM"));
        } else if (i3 == 0) {
            if (!(!this.A0D.A07.isEmpty()) && !this.A0D.A06.isEmpty()) {
                this.A0D.A01();
                AnonymousClass2V7 r03 = this.A0G;
                if (r03 != null) {
                    r03.A00();
                }
            }
            A0T(true);
        }
    }

    public void A0J(long j2) {
        AnonymousClass2V7 r0;
        C14550pN r1 = this.A0A;
        if (r1 != null) {
            boolean z2 = true;
            C434920f.A05(r1, R.color.color04f0, 1);
            C51202bB r12 = this.A0L;
            AnonymousClass2RO r02 = r12.A00;
            if (r02 != null) {
                r02.A00();
                r12.A00 = null;
            }
            this.A0C.A6D();
            this.A0S = false;
            C54762iC r03 = this.A0E;
            if (r03 != null) {
                r03.disable();
            }
            this.A0G.A0B.A0M(4);
            View view = this.A08;
            Runnable runnable = this.A0v;
            view.removeCallbacks(runnable);
            if (this.A08.getVisibility() != 4) {
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                View view2 = this.A08;
                if (i2 == 0) {
                    view2.setVisibility(4);
                } else {
                    view2.postDelayed(runnable, j2);
                }
            }
            this.A07.setVisibility(0);
            this.A0C.pause();
            if (!(!this.A0D.A07.isEmpty()) && this.A0D.A06.isEmpty()) {
                z2 = false;
            }
            this.A0D.A00();
            this.A0D.A01();
            if (z2 && (r0 = this.A0G) != null) {
                r0.A00();
            }
            this.A0b.A0o(false);
        }
    }

    public void A0K(Configuration configuration) {
        if (this.A0A != null) {
            if (this.A0w && !(A03() instanceof CameraActivity)) {
                View A0E2 = C004601z.A0E(A03().A00, R.id.camera_mode_tab_layout);
                View A0E3 = C004601z.A0E(A03().A00, R.id.camera_view_holder);
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                A0E3.getLocalVisibleRect(rect);
                A0E3.getGlobalVisibleRect(rect);
                this.A09.getLocalVisibleRect(rect2);
                this.A09.getGlobalVisibleRect(rect2);
                int i2 = 0;
                if (!A0Z()) {
                    i2 = this.A01;
                }
                A01(A0E2, -1, i2);
                A0H(i2, A0E2.getMeasuredHeight() + i2);
                A0G(A0E2.getMeasuredHeight() + i2);
            }
            this.A0G.A04(true);
            if (this.A0y) {
                int i3 = configuration.orientation;
                View findViewById = A03().findViewById(R.id.camera_view_holder);
                AnonymousClass06X r1 = (AnonymousClass06X) findViewById.getLayoutParams();
                r1.A0t = i3 == 1 ? "9:16" : "16:9";
                findViewById.setLayoutParams(r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0099, code lost:
        if (r2 == 5) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(android.graphics.Bitmap r14, X.AnonymousClass01A r15, X.AnonymousClass2BF r16, java.util.Collection r17, java.util.List r18, int r19, boolean r20) {
        /*
            r13 = this;
            r0 = 4
            r6 = r17
            r1 = r19
            r4 = r20
            if (r1 != r0) goto L_0x0109
            X.1Ar r1 = r13.A0i
            int r0 = r6.size()
            r1.A03(r4, r0)
        L_0x0012:
            X.1aJ r0 = r13.A0D
            boolean r5 = r0.A02(r6)
            int r1 = r13.A02
            int r0 = r6.size()
            int r1 = r1 - r0
            r4 = 1
            if (r1 != 0) goto L_0x0042
            boolean r0 = r13.A0X
            if (r0 != 0) goto L_0x0042
            X.0pd r7 = r13.A0p
            r0 = 2693(0xa85, float:3.774E-42)
            X.0tM r3 = X.C16620tM.A02
            int r2 = r7.A03(r3, r0)
            r0 = 2614(0xa36, float:3.663E-42)
            int r0 = r7.A03(r3, r0)
            int r2 = r2 - r0
            int r1 = r1 + r2
            r0 = 2693(0xa85, float:3.774E-42)
            int r0 = r7.A03(r3, r0)
            r13.A02 = r0
            r13.A0X = r4
        L_0x0042:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r6)
            X.0pN r0 = r13.A03()
            X.2KC r7 = new X.2KC
            r7.<init>(r0)
            r7.A0E = r8
            java.util.List r0 = r13.A0P
            java.util.ArrayList r0 = X.C16030sJ.A06(r0)
            r7.A0D = r0
            X.1aJ r0 = r13.A0D
            java.util.Set r0 = r0.A07
            int r0 = r0.size()
            int r1 = r1 - r0
            r7.A01 = r1
            boolean r0 = r13.A0X
            r7.A0J = r0
            X.2cZ r9 = r13.A0z
            int r0 = r9.AE4()
            int r0 = X.C55012id.A00(r0, r5)
            r7.A02 = r0
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r13.A0a
            long r2 = r2 - r0
            r7.A04 = r2
            long r0 = r13.A03
            r7.A06 = r0
            X.0sL r0 = r13.A0K
            java.lang.String r0 = X.C16030sJ.A03(r0)
            r7.A0B = r0
            boolean r0 = r13.A0T
            r7.A0F = r0
            r7.A0G = r5
            int r2 = r9.AE4()
            r0 = 4
            if (r2 == r0) goto L_0x009b
            r1 = 5
            r0 = 1
            if (r2 != r1) goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            r7.A0H = r0
            boolean r10 = r13.A0w
            if (r10 == 0) goto L_0x00c9
            X.0pN r0 = r13.A03()
            boolean r0 = r0 instanceof com.obwhatsapp.camera.CameraActivity
            if (r0 == 0) goto L_0x0104
            r1 = 2131362566(0x7f0a0306, float:1.8344916E38)
            X.0pN r0 = r13.A03()
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            r7.A03 = r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.bottomMargin
        L_0x00c7:
            r7.A00 = r0
        L_0x00c9:
            r9.AE4()
            r3 = 0
            r7.A0I = r4
            boolean r0 = r13.A0R
            if (r0 != 0) goto L_0x015e
            X.1aJ r9 = r13.A0D
            java.lang.Object r1 = r8.get(r3)
            android.net.Uri r1 = (android.net.Uri) r1
            java.util.List r8 = r13.A0Q
            java.lang.String r2 = r13.A0O
            X.29Q r0 = r9.A03
            java.util.Map r0 = r0.A00
            java.util.Collection r11 = r0.values()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r11)
            java.util.Iterator r12 = r0.iterator()
        L_0x00f0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0146
            java.lang.Object r11 = r12.next()
            X.20I r11 = (X.AnonymousClass20I) r11
            r0 = 0
            r11.A0D(r0)
            r11.A0E(r0)
            goto L_0x00f0
        L_0x0104:
            int r0 = r13.A01
            r7.A03 = r0
            goto L_0x00c7
        L_0x0109:
            r0 = 3
            if (r1 != r0) goto L_0x0012
            X.1Ar r3 = r13.A0i
            int r1 = r6.size()
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x0012
            X.2da r2 = new X.2da
            r2.<init>()
            X.1Aq r0 = r3.A02
            java.lang.Long r0 = r0.A00
            r2.A0G = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A03 = r0
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A09 = r0
            r0 = 1
            if (r20 == 0) goto L_0x0132
            r0 = 2
        L_0x0132:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0B = r0
            long r0 = (long) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0F = r0
            X.0t9 r0 = r3.A01
            r0.A04(r2)
            goto L_0x0012
        L_0x0146:
            X.29Q r0 = r9.A03
            X.20I r1 = r0.A00(r1)
            if (r8 == 0) goto L_0x0155
            java.lang.String r0 = X.C39501sa.A00(r8)
            r1.A0E(r0)
        L_0x0155:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x015e
            r1.A0D(r2)
        L_0x015e:
            X.1aJ r0 = r13.A0D
            X.29Q r1 = r0.A03
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.A02(r0)
            r7.A08 = r0
            boolean r0 = X.C455529g.A00
            if (r0 == 0) goto L_0x01e1
            int r0 = r6.size()
            if (r0 != r4) goto L_0x01e1
            r2 = r18
            if (r18 == 0) goto L_0x01e1
            if (r14 == 0) goto L_0x01e1
            if (r16 == 0) goto L_0x01e1
            long r11 = r16.getContentLength()
            r8 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x01e1
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object r9 = r0.next()
            android.net.Uri r9 = (android.net.Uri) r9
            r7.A07 = r9
            X.1Cv r0 = r13.A0f
            X.1kk r8 = r0.A02()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r0 = "-gallery_thumb"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.A03(r0, r14)
            X.0pN r1 = r13.A03()
            X.01Q[] r0 = new X.AnonymousClass01Q[r3]
            java.lang.Object[] r0 = r2.toArray(r0)
            X.01Q[] r0 = (X.AnonymousClass01Q[]) r0
            X.09N r0 = X.AnonymousClass09N.A02(r1, r0)
            android.os.Bundle r2 = r0.A03()
        L_0x01c3:
            android.content.Intent r1 = r7.A00()
            r0 = 101(0x65, float:1.42E-43)
            r15.A0O(r1, r0, r2)
            if (r5 == 0) goto L_0x01e0
            int r0 = r6.size()
            if (r0 != r4) goto L_0x01e0
            X.0pN r2 = r13.A03()
            if (r10 == 0) goto L_0x01e3
            r0 = 2130772015(0x7f01002f, float:1.7147136E38)
            r2.overridePendingTransition(r0, r3)
        L_0x01e0:
            return
        L_0x01e1:
            r2 = 0
            goto L_0x01c3
        L_0x01e3:
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            r0 = 17432577(0x10a0001, float:2.53466E-38)
            r2.overridePendingTransition(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29251aI.A0L(android.graphics.Bitmap, X.01A, X.2BF, java.util.Collection, java.util.List, int, boolean):void");
    }

    public void A0M(Bundle bundle) {
        Object r1;
        C29261aJ r5 = this.A0D;
        if (r5 != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("multi_selected");
            r5.A04 = true;
            Set set = r5.A07;
            set.clear();
            if (parcelableArrayList != null) {
                set.addAll(parcelableArrayList);
            }
            r5.A03.A01(bundle);
            List list = r5.A06;
            list.clear();
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("captured_media");
            if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
                ContentResolver contentResolver = r5.A05.getContentResolver();
                ArrayList arrayList = new ArrayList(parcelableArrayList2.size());
                Iterator it = parcelableArrayList2.iterator();
                while (it.hasNext()) {
                    C35351lm r12 = (C35351lm) it.next();
                    byte b2 = r12.A00;
                    if (b2 == 1) {
                        r1 = new C54992ib(contentResolver, r12.A02, r12.A01, r12.A03);
                    } else if (b2 == 3) {
                        r1 = new C55002ic(r12.A02);
                    } else {
                        StringBuilder sb = new StringBuilder("Unsupported media type: ");
                        sb.append(b2);
                        throw new AssertionError(sb.toString());
                    }
                    arrayList.add(r1);
                }
                list.addAll(arrayList);
            }
            r5.A04 = !list.isEmpty();
            AnonymousClass2V5 r2 = this.A0F;
            if (r2 != null) {
                r2.A09(!this.A0D.A07.isEmpty(), this.A0D.A07.size());
            }
        }
        AnonymousClass2V7 r0 = this.A0G;
        if (r0 != null) {
            r0.A00();
            this.A0G.A01();
            boolean z2 = false;
            if (this.A0G.A0B.A0B == 3) {
                z2 = true;
            }
            View view = this.A05;
            if (z2) {
                view.setVisibility(4);
                this.A0H.A01(4);
                AnonymousClass2VD r22 = this.A0I;
                r22.A01.setBackgroundColor(A03().getResources().getColor(R.color.color087c));
                return;
            }
            view.setVisibility(0);
            this.A0H.A01(0);
        }
    }

    public void A0N(Bundle bundle) {
        C29261aJ r2 = this.A0D;
        if (r2 != null) {
            bundle.putParcelableArrayList("multi_selected", new ArrayList(r2.A07));
            AnonymousClass29Q r0 = r2.A03;
            Bundle bundle2 = new Bundle();
            r0.A02(bundle2);
            bundle.putBundle("media_preview_params", bundle2);
            List<C54972iZ> list = r2.A06;
            ArrayList arrayList = new ArrayList(list.size());
            for (C54972iZ r1 : list) {
                arrayList.add(new C35351lm(r1));
            }
            bundle.putParcelableArrayList("captured_media", arrayList);
        }
    }

    public void A0O(ViewGroup viewGroup, C14550pN r25, AnonymousClass29Q r26, C16050sL r27, String str, ArrayList arrayList, List list, List list2, long j2, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass2Qt r1;
        AnonymousClass06X r12;
        String str2;
        ViewGroup viewGroup2 = viewGroup;
        C14550pN r4 = r25;
        List list3 = list;
        if (viewGroup != null) {
            r4.getLayoutInflater().inflate(R.layout.layout00e7, viewGroup2, true);
        }
        try {
            C23161As r6 = this.A0j;
            r6.A04("cold", A00(this.A0z.AE4()));
            r6.A01 = SystemClock.elapsedRealtime();
            r6.A02(554251647, "onCreate");
            this.A0A = r4;
            if (list == null) {
                list3 = Collections.emptyList();
            }
            this.A0P = list3;
            this.A03 = j2;
            this.A0K = r27;
            this.A0T = z2;
            this.A0O = str;
            this.A0Q = list2;
            this.A0U = z5;
            this.A09 = A03().findViewById(R.id.root_view);
            this.A06 = A03().findViewById(R.id.camera_layout);
            this.A07 = A03().findViewById(R.id.camera_protection);
            this.A0u.A02(this.A0t);
            Context context = this.A0m.A00;
            this.A0D = new C29261aJ(context);
            int A022 = C42971z5.A02(this.A0k, this.A0r);
            C14550pN A032 = A03();
            if (!this.A0x || (r1 = C54772iD.A00(A032, A022)) == null) {
                Log.i("camera/CameraInterface/CameraView");
                r1 = new C49062Qp(A032);
            } else {
                Log.i("camera/CameraInterface/LiteCameraView/");
            }
            this.A0C = r1;
            r1.setQrScanningEnabled(z3);
            View view = (View) this.A0C;
            this.A08 = view;
            view.setVisibility(8);
            ViewGroup viewGroup3 = (ViewGroup) A03().findViewById(R.id.camera_view_holder);
            viewGroup3.addView(this.A08, new FrameLayout.LayoutParams(-2, -2, 17));
            boolean z6 = this.A0w;
            if (z6 && (A03() instanceof CameraActivity)) {
                if (!A0Z() || !this.A0y) {
                    r12 = (AnonymousClass06X) viewGroup3.getLayoutParams();
                    str2 = "9:16";
                } else {
                    r12 = (AnonymousClass06X) viewGroup3.getLayoutParams();
                    str2 = "16:9";
                }
                r12.A0t = str2;
            }
            Resources resources = context.getResources();
            int i2 = R.color.color087c;
            if (z6) {
                i2 = R.color.color00ec;
            }
            int color = resources.getColor(i2);
            this.A06.setBackgroundColor(color);
            this.A07.setBackgroundColor(color);
            View view2 = A03().A00;
            View findViewById = A03().findViewById(R.id.camera_actions);
            this.A05 = findViewById;
            AnonymousClass2V5 r10 = new AnonymousClass2V5(findViewById, this.A0C, z6);
            this.A0F = r10;
            WaImageView waImageView = r10.A0I;
            waImageView.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(r10, 11, this));
            waImageView.setOnLongClickListener(new IDxCListenerShape177S0100000_2_I0(this, 0));
            waImageView.setOnTouchListener(new IDxTListenerShape167S0100000_2_I0(this, 4));
            r10.A0J.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 22));
            r10.A0G.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 19));
            r10.A0C.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(this, 12, r10));
            r10.A0H.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 20));
            r10.A0F.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 21));
            if (z6) {
                View A0E2 = C004601z.A0E(A03().A00, R.id.camera_layout_parent);
                A0E2.setFitsSystemWindows(false);
                A0E2.invalidate();
                this.A08.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 6));
            }
            this.A0H = new AnonymousClass2V9(new C54782iE(this), (CameraModeTabLayout) C004601z.A0E(view2, R.id.camera_mode_tab_layout), z6);
            List list4 = this.A0P;
            C15900s5 r11 = this.A0e;
            AnonymousClass013 r15 = this.A0o;
            this.A0J = new AnonymousClass2DG(r11, new C54802iH(this), (RecordingView) C004601z.A0E(A03().A00, R.id.recording_view), this.A0l, r15, list4, z6);
            this.A0I = new AnonymousClass2VD((ViewGroup) C004601z.A0E(view2, R.id.camera_overlays_holder), this.A0C, z6);
            this.A0B = new AnonymousClass2VA(A03(), new C54812iJ(this), z6);
            this.A08.setOnTouchListener(new IDxTListenerShape167S0100000_2_I0(this, 3));
            AnonymousClass2V9 r0 = this.A0H;
            CameraModeTabLayout cameraModeTabLayout = r0.A01;
            cameraModeTabLayout.setOnTouchListener(new IDxTListenerShape167S0100000_2_I0(new AnonymousClass09P(cameraModeTabLayout.getContext(), new C54832iL(new C54822iK(r0))), 5));
            this.A0C.setCameraCallback(new AnonymousClass2V2(this));
            boolean z7 = this.A0y;
            if (!z7 && z6 && (this.A0A instanceof CameraActivity)) {
                C54762iC r02 = new C54762iC(A03(), new C54842iM(this));
                this.A0E = r02;
                if (r02.canDetectOrientation()) {
                    this.A0E.enable();
                } else {
                    this.A0E = null;
                }
            }
            boolean A0E3 = this.A0p.A0E(C16620tM.A02, 789);
            this.A0Z = A0E3;
            if (A0E3) {
                this.A0F.A0I.setSoundEffectsEnabled(false);
                SoundPool soundPool = new SoundPool(1, 1, 0);
                this.A04 = soundPool;
                this.A00 = soundPool.load(this.A0A, R.raw.wa_ptt_start_record, 0);
            }
            AnonymousClass2V7 r122 = new AnonymousClass2V7(C004601z.A0E(A03().A00, R.id.bottom_sheet), z6, z7);
            this.A0G = r122;
            C23651Cv r112 = this.A0f;
            C14550pN A033 = A03();
            C29261aJ r13 = this.A0D;
            Set set = r13.A07;
            IDxLazyShape245S0100000_2_I0 iDxLazyShape245S0100000_2_I0 = new IDxLazyShape245S0100000_2_I0(this, 2);
            List list5 = r13.A06;
            AnonymousClass2OM r03 = new AnonymousClass2OM(A033.getContentResolver(), new Handler(Looper.getMainLooper()), r112, "camera-ui");
            r122.A05 = r03;
            C54852iN r16 = new C54852iN(A033, this, r03, iDxLazyShape245S0100000_2_I0, list5, set);
            r122.A04 = r16;
            RecyclerView recyclerView = r122.A0A;
            recyclerView.setAdapter(r16);
            recyclerView.A0h = true;
            recyclerView.A0m(new C54862iO(r122, r15, r122.A07.getDimensionPixelSize(R.dimen.dimen0143)));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.A1P(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            AnonymousClass2V7 r123 = this.A0G;
            r123.A0B.A0E = new C54872iP(A03(), this, r123);
            C14550pN A034 = A03();
            C49172Rk r102 = this.A0q;
            C54892iR r9 = new C54892iR(this);
            C16320sq r8 = this.A0s;
            C16690tT r14 = r123.A06;
            if (r14 != null) {
                r14.A06(true);
            }
            C54902iS r17 = new C54902iS(A034, r9, r102);
            r123.A06 = r17;
            r8.Ack(r17, new Void[0]);
            ((ViewGroup) A03().findViewById(R.id.camera_coordinator)).addView(new C54912iT(this.A0A, this), 0);
            AnonymousClass050 r82 = new AnonymousClass050(A03().AGM());
            r82.A0E(this.A0b, "cameraMediaPickerFragment", R.id.gallery_container);
            r82.A02();
            if (z6) {
                View findViewById2 = A03().findViewById(R.id.gallery_container);
                int paddingLeft = findViewById2.getPaddingLeft();
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                findViewById2.setPadding(paddingLeft, identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : AnonymousClass1UP.A02(A03(), AnonymousClass01V.A02(A03())), findViewById2.getPaddingRight(), findViewById2.getPaddingBottom());
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList != null && arrayList2.size() > 0) {
                AnonymousClass29Q r3 = r26;
                if (r26 != null && z4) {
                    Map map = this.A0D.A03.A00;
                    map.clear();
                    map.putAll(r3.A00);
                    A0S(arrayList2);
                }
            }
            r6.A01(554251647, "onCreate");
        } catch (Throwable th) {
            this.A0j.A01(554251647, "onCreate");
            throw th;
        }
    }

    public final void A0P(AnonymousClass2BF r9) {
        if (r9 != null) {
            C29261aJ r7 = this.A0D;
            Uri A9L = r9.A9L();
            C14710pd r5 = this.A0p;
            Set set = r7.A07;
            if (set.contains(A9L)) {
                set.remove(A9L);
                r7.A03.A00.remove(A9L);
            } else {
                C16620tM r2 = C16620tM.A02;
                int A032 = r5.A03(r2, 2614);
                if (set.size() >= A032) {
                    A032 = r5.A03(r2, 2693);
                }
                if (set.size() >= A032) {
                    this.A0d.A0H(A03().getString(R.string.str1616, new Object[]{Integer.valueOf(this.A02)}), 0);
                } else {
                    set.add(A9L);
                    if (set.size() > 1) {
                        r7.A04 = true;
                    }
                    r7.A03.A03(new AnonymousClass20I(A9L));
                }
            }
            if (!this.A0D.A07.isEmpty()) {
                A0B();
            }
            this.A0F.A09(!this.A0D.A07.isEmpty(), this.A0D.A07.size());
            AnonymousClass2V7 r0 = this.A0G;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    public final void A0Q(AnonymousClass2BF r5, C54502hd r6, boolean z2) {
        if (r5 == null) {
            Log.i("cameraui/showpreview/media-is-null");
            return;
        }
        Uri A9L = r5.A9L();
        StringBuilder sb = new StringBuilder("cameraui/showpreview ");
        sb.append(A9L);
        Log.i(sb.toString());
        C14550pN r0 = this.A0A;
        if (r0 != null && !r0.AIm()) {
            if (z2) {
                this.A0D.A06.add(0, r5);
            }
            this.A0D.A03.A03(new AnonymousClass20I(A9L));
            if (this.A0D.A07.size() > 0) {
                C29261aJ r2 = this.A0D;
                Set set = r2.A07;
                set.add(A9L);
                if (set.size() > 1) {
                    r2.A04 = true;
                }
                AnonymousClass2V7 r02 = this.A0G;
                if (r02 != null) {
                    r02.A00();
                }
                this.A0F.A09(true, this.A0D.A07.size());
                A0B();
                this.A0C.AcZ();
                A0U(true);
                return;
            }
            A0R(r6, Collections.singletonList(A9L));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x008b, code lost:
        if (r11.A0D.A07.size() != 0) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(X.C54502hd r12, java.util.Collection r13) {
        /*
            r11 = this;
            boolean r0 = X.C455529g.A00
            r8 = 0
            r3 = r11
            if (r0 == 0) goto L_0x009e
            if (r12 == 0) goto L_0x009e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r1 = X.C004601z.A0L(r12)
            X.01Q r0 = new X.01Q
            r0.<init>(r12, r1)
            r8.add(r0)
            r1 = 2131364021(0x7f0a08b5, float:1.8347867E38)
            X.0pN r0 = r11.A03()
            android.view.View r2 = r0.findViewById(r1)
            java.lang.String r1 = X.C004601z.A0L(r2)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r8.add(r0)
            r1 = 2131363750(0x7f0a07a6, float:1.8347318E38)
            X.0pN r0 = r11.A03()
            android.view.View r2 = r0.findViewById(r1)
            java.lang.String r1 = X.C004601z.A0L(r2)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r8.add(r0)
            r1 = 2131363699(0x7f0a0773, float:1.8347214E38)
            X.0pN r0 = r11.A03()
            android.view.View r2 = r0.findViewById(r1)
            java.lang.String r1 = X.C004601z.A0L(r2)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r8.add(r0)
            r1 = 2131366076(0x7f0a10bc, float:1.8352035E38)
            X.0pN r0 = r11.A03()
            android.view.View r2 = r0.findViewById(r1)
            java.lang.String r1 = X.C004601z.A0L(r2)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r8.add(r0)
            android.graphics.Bitmap r4 = r12.A00
            X.2BF r6 = r12.A05
        L_0x0079:
            X.1aJ r0 = r11.A0D
            r7 = r13
            boolean r0 = r0.A02(r13)
            if (r0 == 0) goto L_0x008d
            X.1aJ r0 = r11.A0D
            java.util.Set r0 = r0.A07
            int r0 = r0.size()
            r9 = 2
            if (r0 == 0) goto L_0x008e
        L_0x008d:
            r9 = 3
        L_0x008e:
            X.01A r5 = r11.A0b
            X.1aJ r0 = r11.A0D
            java.util.Set r0 = r0.A07
            boolean r0 = r0.isEmpty()
            r10 = r0 ^ 1
            r3.A0L(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x009e:
            r4 = r8
            r6 = r8
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29251aI.A0R(X.2hd, java.util.Collection):void");
    }

    public final void A0S(ArrayList arrayList) {
        C29261aJ r1 = this.A0D;
        r1.A04 = true;
        Set set = r1.A07;
        set.clear();
        if (arrayList != null) {
            set.addAll(arrayList);
        }
        this.A0R = true;
        this.A0F.A09(!this.A0D.A07.isEmpty(), this.A0D.A07.size());
        if (this.A0D.A01 != 1) {
            this.A0F.A08(false);
        }
        AnonymousClass2V7 r0 = this.A0G;
        if (r0 != null) {
            r0.A00();
        }
        A0T(true);
        this.A0i.A01(9);
    }

    public void A0T(boolean z2) {
        CircularProgressBar circularProgressBar;
        Log.i("cameraui/restoreui");
        A0U(true);
        if (z2 && this.A08.getVisibility() != 0) {
            this.A08.setVisibility(0);
        }
        boolean AIv = this.A0C.AIv();
        if (z2 && !AIv) {
            this.A08.requestLayout();
            this.A08.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 5));
        }
        AnonymousClass2DG r4 = this.A0J;
        boolean z3 = false;
        if (this.A0D.A00 == 2) {
            z3 = true;
        }
        r4.A01(z3, A0X(), false);
        AnonymousClass2V5 r6 = this.A0F;
        boolean A0Z2 = A0Z();
        WaImageView waImageView = r6.A0I;
        waImageView.setVisibility(0);
        waImageView.setEnabled(AIv);
        boolean z4 = r6.A0L;
        if (z4 && (circularProgressBar = r6.A06) != null) {
            circularProgressBar.setVisibility(0);
        }
        WaImageView waImageView2 = r6.A0J;
        waImageView2.setEnabled(AIv);
        boolean z5 = false;
        if (waImageView2.getVisibility() == 0) {
            z5 = true;
        }
        int i2 = 8;
        if (r6.A0M) {
            i2 = 0;
        }
        waImageView2.setVisibility(i2);
        boolean z6 = false;
        if (waImageView2.getVisibility() == 0) {
            z6 = true;
        }
        if (!z5 && z6) {
            waImageView2.startAnimation(r6.A04);
        }
        WaImageView waImageView3 = r6.A0G;
        waImageView3.setEnabled(AIv);
        boolean z7 = false;
        if (waImageView3.getVisibility() == 0) {
            z7 = true;
        }
        r6.A01();
        boolean z8 = false;
        if (waImageView3.getVisibility() == 0) {
            z8 = true;
        }
        if (!z7 && z8) {
            waImageView3.startAnimation(r6.A04);
        }
        r6.A0H.setVisibility(0);
        WaImageView waImageView4 = r6.A0F;
        if (waImageView4 != null) {
            waImageView4.setVisibility(0);
        }
        boolean z9 = !A0Z2;
        if (!z4) {
            TextView textView = r6.A0E;
            int i3 = 4;
            if (z9) {
                i3 = 0;
            }
            textView.setVisibility(i3);
        }
        if (this.A0G.A0B.A0B != 3) {
            this.A0H.A01(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (A0Z() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(boolean r4) {
        /*
            r3 = this;
            X.2V7 r0 = r3.A0G
            r0.A04(r4)
            X.2V5 r2 = r3.A0F
            X.1aJ r0 = r3.A0D
            java.util.Set r0 = r0.A07
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            r1 = r1 & r4
            X.1aJ r0 = r3.A0D
            java.util.Set r0 = r0.A07
            int r0 = r0.size()
            r2.A09(r1, r0)
            X.2V5 r1 = r3.A0F
            if (r4 == 0) goto L_0x0028
            boolean r0 = r3.A0Z()
            r2 = 1
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            boolean r0 = r1.A0L
            if (r0 != 0) goto L_0x0036
            android.widget.TextView r1 = r1.A0E
            r0 = 4
            if (r2 == 0) goto L_0x0033
            r0 = 0
        L_0x0033:
            r1.setVisibility(r0)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29251aI.A0U(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x018d, code lost:
        if (r15 == false) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(boolean r15) {
        /*
            r14 = this;
            X.01V r0 = r14.A0k
            X.C41631wI.A02(r0)
            X.1As r2 = r14.A0j
            r3 = 554249147(0x21092bbb, float:4.647528E-19)
            java.lang.String r0 = "video_record"
            r2.A01(r3, r0)
            java.lang.String r1 = "cameraui/stopvideocapture "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.View r0 = r14.A08
            r5 = 0
            r0.setKeepScreenOn(r5)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A06 = r0
            java.lang.String r7 = "stop_video_recording"
            r2.A02(r3, r7)
            X.2Qt r0 = r14.A0C
            r0.AgO()
            X.2Qt r1 = r14.A0C
            int r0 = r1.getCameraApi()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r4 = r1.getCameraType()
            boolean r0 = r1.AIs()
            r3 = r0 ^ 1
            long r0 = r1.getVideoResolution()
            java.lang.String r10 = java.lang.Long.toString(r0)
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r0 = r2.A06
            long r11 = r11 - r0
            long r0 = r2.A04
            X.2ie r9 = new X.2ie
            r9.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r9.A02 = r8
            r9.A00 = r6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r9.A01 = r8
            r9.A05 = r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A03 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r9.A04 = r0
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0087
            X.0t9 r0 = r2.A08
            r0.A06(r9)
        L_0x0087:
            boolean r1 = r2.A0B
            if (r1 == 0) goto L_0x0097
            r0 = 554249147(0x21092bbb, float:4.647528E-19)
            r2.A01(r0, r7)
            r2.A03(r6, r0, r4)
            r2.A00(r0, r3)
        L_0x0097:
            X.1Ar r6 = r14.A0i
            X.2Qt r0 = r14.A0C
            boolean r12 = r0.AIs()
            int r8 = r0.getZoomLevel()
            X.2Qt r0 = r14.A0C
            java.lang.String r7 = r0.getFlashMode()
            boolean r13 = r14.A0Z()
            java.io.File r4 = r14.A0N
            r10 = 0
            if (r4 == 0) goto L_0x00d0
            X.1xA r0 = new X.1xA     // Catch:{ 1xB -> 0x00bb }
            r0.<init>(r4)     // Catch:{ 1xB -> 0x00bb }
            long r10 = r0.A04     // Catch:{ 1xB -> 0x00bb }
            goto L_0x00d0
        L_0x00bb:
            java.lang.String r0 = "loggerutils/failed to get duration of video: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r4.getAbsolutePath()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00d0:
            r9 = 2
            r6.A02(r7, r8, r9, r10, r12, r13)
            X.0pN r0 = r14.A0A
            if (r0 == 0) goto L_0x0128
            X.2V5 r3 = r14.A0F
            X.0pN r0 = r14.A03()
            android.view.Window r6 = r0.getWindow()
            android.view.WindowManager$LayoutParams r4 = r6.getAttributes()
            android.view.View r3 = r3.A0B
            r0 = 4
            r3.setVisibility(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.screenBrightness = r0
            r6.setAttributes(r4)
            boolean r6 = r14.A0w
            if (r6 != 0) goto L_0x018d
            X.0pN r3 = r14.A03()
            r0 = -1
            r3.setRequestedOrientation(r0)
        L_0x00ff:
            X.2V5 r0 = r14.A0F
            r0.A00()
            X.2DG r4 = r14.A0J
            X.1aJ r0 = r14.A0D
            int r3 = r0.A00
            r0 = 0
            if (r3 != r9) goto L_0x010e
            r0 = 1
        L_0x010e:
            r4.A01(r0, r5, r5)
            X.2DG r4 = r14.A0J
            android.os.Handler r3 = r4.A01
            r3.removeMessages(r5)
            r0 = 1
            r3.removeMessages(r0)
            r4.A01(r5, r5, r5)
            if (r6 == 0) goto L_0x0128
            X.2iC r0 = r14.A0E
            if (r0 == 0) goto L_0x0128
            r0.enable()
        L_0x0128:
            r5 = 1
            r4 = 0
            if (r15 == 0) goto L_0x0151
            java.io.File r0 = r14.A0N
            if (r0 == 0) goto L_0x0151
            r7 = 554249147(0x21092bbb, float:4.647528E-19)
            java.lang.String r6 = "show_media_preview"
            r2.A02(r7, r6)
            java.io.File r3 = r14.A0N
            X.2ic r0 = new X.2ic
            r0.<init>(r3)
            r14.A0Q(r0, r4, r5)
            r2.A01(r7, r6)
        L_0x0146:
            if (r1 == 0) goto L_0x0150
            X.0yX r1 = r2.A09
            r0 = 554249147(0x21092bbb, float:4.647528E-19)
            r1.AKz(r0, r9)
        L_0x0150:
            return
        L_0x0151:
            java.io.File r0 = r14.A0N
            if (r0 == 0) goto L_0x0180
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0180
            java.io.File r0 = r14.A0N
            boolean r0 = r0.delete()
            if (r0 != 0) goto L_0x017a
            java.lang.String r0 = "cameraui/failed to delete video "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.io.File r0 = r14.A0N
            java.lang.String r0 = r0.getAbsolutePath()
            r3.append(r0)
        L_0x0173:
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x017a:
            r14.A0N = r4
            r14.A0T(r5)
            goto L_0x0146
        L_0x0180:
            java.lang.String r0 = "cameraui/video file doesn't exist: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.io.File r0 = r14.A0N
            r3.append(r0)
            goto L_0x0173
        L_0x018d:
            if (r15 != 0) goto L_0x0128
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29251aI.A0V(boolean):void");
    }

    public final void A0W(boolean z2) {
        AnonymousClass2V5 r3 = this.A0F;
        if (r3.A0L) {
            float f2 = 2.0f;
            if (r3.A08) {
                f2 = 1.25f;
            }
            r3.A02(f2, 1.0f);
        } else {
            r3.A04(1.5f, 1.0f, false);
        }
        this.A08.postDelayed(new RunnableRunnableShape1S0110000_I1(this, 1, z2), 220);
    }

    public boolean A0X() {
        AnonymousClass2Qt r0 = this.A0C;
        if (r0 != null && r0.AJZ()) {
            return true;
        }
        AnonymousClass2DG r02 = this.A0J;
        if (r02 == null) {
            return false;
        }
        Handler handler = r02.A01;
        return handler.hasMessages(0) || handler.hasMessages(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fe, code lost:
        if (r7 == 0) goto L_0x0100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Y() {
        /*
            r11 = this;
            X.0pN r1 = r11.A0A
            r0 = 0
            if (r1 == 0) goto L_0x0006
            r0 = 1
        L_0x0006:
            r3 = 0
            if (r0 == 0) goto L_0x0133
            boolean r0 = r11.A0X()
            r6 = 1
            if (r0 == 0) goto L_0x001a
            X.2DG r0 = r11.A0J
            boolean r0 = r0.A02()
            r11.A0W(r0)
        L_0x0019:
            return r6
        L_0x001a:
            X.2V7 r0 = r11.A0G
            com.obwhatsapp.camera.CameraBottomSheetBehavior r0 = r0.A0B
            int r1 = r0.A0B
            r0 = 3
            if (r1 != r0) goto L_0x0075
            X.01A r1 = r11.A0b
            boolean r0 = r1 instanceof com.obwhatsapp.camera.bottomsheet.CameraMediaPickerFragment
            if (r0 == 0) goto L_0x0035
            com.obwhatsapp.camera.bottomsheet.CameraMediaPickerFragment r1 = (com.obwhatsapp.camera.bottomsheet.CameraMediaPickerFragment) r1
            boolean r0 = r1.A1K()
            if (r0 == 0) goto L_0x0035
            r1.A1O()
            return r6
        L_0x0035:
            X.2V7 r0 = r11.A0G
            com.obwhatsapp.camera.CameraBottomSheetBehavior r1 = r0.A0B
            r0 = 4
            r1.A0M(r0)
            X.1Ar r3 = r11.A0i
            X.1aJ r0 = r11.A0D
            java.util.Set r0 = r0.A07
            boolean r0 = r0.isEmpty()
            r2 = r0 ^ 1
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x0019
            X.2da r1 = new X.2da
            r1.<init>()
            X.1Aq r0 = r3.A02
            java.lang.Long r0 = r0.A00
            r1.A0G = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A01 = r0
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09 = r0
            r0 = 1
            if (r2 == 0) goto L_0x0069
            r0 = 2
        L_0x0069:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B = r0
            X.0t9 r0 = r3.A01
            r0.A04(r1)
            return r6
        L_0x0075:
            X.1aJ r0 = r11.A0D
            java.util.Set r0 = r0.A07
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            X.1aJ r0 = r11.A0D
            if (r1 == 0) goto L_0x00b2
            r0.A00()
            X.2V5 r1 = r11.A0F
            X.1aJ r0 = r11.A0D
            java.util.Set r0 = r0.A07
            int r0 = r0.size()
            r1.A09(r3, r0)
            X.2V5 r5 = r11.A0F
            boolean r0 = r5.A0L
            if (r0 == 0) goto L_0x00ac
            android.view.View r0 = r5.A0C
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            int r3 = r4.leftMargin
            int r2 = r4.topMargin
            int r1 = r4.rightMargin
            int r0 = r5.A02
            r4.setMargins(r3, r2, r1, r0)
        L_0x00ac:
            X.2V7 r0 = r11.A0G
            r0.A00()
            return r6
        L_0x00b2:
            r0.A01()
            X.2V7 r0 = r11.A0G
            r0.A00()
            X.1Ar r4 = r11.A0i
            X.2Qt r0 = r11.A0C
            boolean r10 = r0.AIs()
            int r7 = r0.getZoomLevel()
            X.2Qt r0 = r11.A0C
            java.lang.String r9 = r0.getFlashMode()
            boolean r8 = r11.A0Z()
            X.2cZ r0 = r11.A0z
            int r5 = r0.AE4()
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x0133
            X.2da r2 = new X.2da
            r2.<init>()
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A09 = r0
            X.1Aq r1 = r4.A02
            java.lang.Long r0 = r1.A00
            r2.A0G = r0
            r6 = 2
            r0 = 2
            if (r10 == 0) goto L_0x00f3
            r0 = 1
        L_0x00f3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A07 = r0
            r0 = 100
            if (r7 == r0) goto L_0x0100
            r0 = 1
            if (r7 != 0) goto L_0x0101
        L_0x0100:
            r0 = 0
        L_0x0101:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05 = r0
            int r0 = X.C23151Ar.A00(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            if (r8 == 0) goto L_0x0114
            r6 = 1
        L_0x0114:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.A0D = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A00 = r0
            r0 = 1
            if (r5 == r0) goto L_0x012b
            r0 = 2
            if (r5 == r0) goto L_0x012b
            r0 = 3
            if (r5 != r0) goto L_0x012e
        L_0x012b:
            r0 = 0
            r1.A00 = r0
        L_0x012e:
            X.0t9 r0 = r4.A01
            r0.A04(r2)
        L_0x0133:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29251aI.A0Y():boolean");
    }

    public final boolean A0Z() {
        return this.A0m.A00.getResources().getConfiguration().orientation == 2;
    }

    public boolean A0a(int i2) {
        boolean z2 = false;
        if (this.A0A != null) {
            z2 = true;
        }
        if (!z2 || this.A0D.A00 == 2 || (i2 != 25 && i2 != 24)) {
            return false;
        }
        AnonymousClass2DG r3 = this.A0J;
        Handler handler = r3.A01;
        handler.removeMessages(0);
        handler.removeMessages(1);
        r3.A01(false, false, false);
        if (this.A0C.AJZ()) {
            Log.i("cameraui/volume-key-up/stop-video-capture");
            A0W(this.A0J.A02());
        } else if (this.A0G.A0B.A0B == 4 && this.A0C.AIv()) {
            Log.i("cameraui/volume-key-up/take-picture");
            A0F();
        }
        AnonymousClass2V5 r1 = this.A0F;
        if (r1.A0L) {
            return true;
        }
        r1.A0I.setActivated(false);
        return true;
    }

    public boolean A0b(int i2, KeyEvent keyEvent) {
        boolean z2 = false;
        if (this.A0A != null) {
            z2 = true;
        }
        if (z2 && ((i2 == 25 || i2 == 24) && this.A0C.AIv())) {
            if (keyEvent.getRepeatCount() <= 0) {
                if (A0X()) {
                    if (this.A0D.A00 == 2) {
                        A0W(this.A0J.A02());
                    }
                } else if (this.A0G.A0B.A0B == 4) {
                    Log.i("cameraui/volume-key-down");
                    if (this.A0D.A00 == 2) {
                        A0D();
                        return true;
                    }
                    AnonymousClass2V5 r1 = this.A0F;
                    if (!r1.A0L) {
                        r1.A0I.setActivated(true);
                    }
                    Handler handler = this.A0J.A01;
                    handler.sendMessageDelayed(handler.obtainMessage(1), 500);
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
