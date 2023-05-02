package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.facebook.redex.ViewOnClickCListenerShape2S0400000_I0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape45S0100000_2_I0;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.obwhatsapp.status.playback.page.StatusPlaybackPageItem$2;
import com.obwhatsapp.status.playback.page.StatusPlaybackPageItem$4;
import com.obwhatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.obwhatsapp.ui.media.MediaCaptionTextView;
import com.obwhatsapp.yo.SS;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1wh  reason: invalid class name and case insensitive filesystem */
public abstract class C41811wh extends C41821wi implements C41831wj {
    public BottomSheetBehavior A00;
    public C55722kE A01;
    public StatusPlaybackProgressView A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = true;
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final C17100uX A09;
    public final C19980zJ A0A;
    public final C14870pt A0B;
    public final AnonymousClass10X A0C;
    public final C16760tb A0D;
    public final AnonymousClass01V A0E;
    public final C16440t3 A0F;
    public final AnonymousClass013 A0G;
    public final C16460t6 A0H;
    public final C26081Mg A0I;
    public final AnonymousClass1HF A0J;
    public final AnonymousClass11G A0K;
    public final C14710pd A0L;
    public final AnonymousClass1P7 A0M;
    public final AnonymousClass1P8 A0N;
    public final C16220sf A0O;
    public final AnonymousClass1L1 A0P;
    public final AnonymousClass5QO A0Q = new AnonymousClass3H3(this);
    public final AnonymousClass4L6 A0R;
    public final C108175My A0S = new C1035451u(this);
    public final AnonymousClass1PD A0T;
    public final C28921Zf A0U = new C28921Zf(true);
    public final C28921Zf A0V = new C28921Zf(true);
    public final C28921Zf A0W = new C28921Zf(true);
    public final C16320sq A0X;
    public final C25981Lw A0Y;
    public final Runnable A0Z = new RunnableRunnableShape15S0100000_I0_14(this, 4);

    public C41811wh(C17100uX r3, C19980zJ r4, C14870pt r5, AnonymousClass10X r6, C16760tb r7, AnonymousClass01V r8, C16440t3 r9, AnonymousClass013 r10, C16460t6 r11, C26081Mg r12, AnonymousClass1HF r13, AnonymousClass11G r14, C14710pd r15, AnonymousClass1P7 r16, AnonymousClass1P8 r17, C16220sf r18, AnonymousClass1L1 r19, AnonymousClass4L6 r20, AnonymousClass1PD r21, C16320sq r22, C25981Lw r23) {
        this.A0F = r9;
        this.A0L = r15;
        this.A0T = r21;
        this.A0B = r5;
        this.A0C = r6;
        this.A0X = r22;
        this.A0K = r14;
        this.A0D = r7;
        this.A0A = r4;
        this.A0M = r16;
        this.A0J = r13;
        this.A0G = r10;
        this.A0N = r17;
        this.A0I = r12;
        this.A09 = r3;
        this.A0H = r11;
        this.A0O = r18;
        this.A0Y = r23;
        this.A0P = r19;
        this.A0E = r8;
        this.A0R = r20;
    }

    public void A00() {
        super.A00();
        A09().A03();
    }

    public void A01() {
        C613038j r0;
        super.A01();
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView != null) {
            if (statusPlaybackProgressView.A03 == this.A0S) {
                statusPlaybackProgressView.A03 = null;
            }
            statusPlaybackProgressView.invalidate();
        }
        C41841wk A092 = A09();
        if (A092 instanceof AnonymousClass34y) {
            AnonymousClass34y r4 = (AnonymousClass34y) A092;
            C56482nj r3 = r4.A01;
            if (r3 != null) {
                Handler handler = r3.A02;
                if (handler != null) {
                    handler.post(new RunnableRunnableShape20S0100000_I1_3(r3, 12));
                }
                r4.A01 = null;
            }
            r4.A0B.A02(r4);
            r4.A02 = false;
            return;
        }
        if (A092 instanceof C606934x) {
            C606934x r42 = (C606934x) A092;
            r42.A0F();
            r42.A0I.A02(r42);
            r42.A03 = false;
            r0 = r42.A01;
        } else if (!(A092 instanceof C606534t) && !(A092 instanceof C606734v) && (A092 instanceof C606634u)) {
            r0 = ((C606634u) A092).A00;
        } else {
            return;
        }
        if (r0 != null) {
            r0.A02.dismiss();
        }
    }

    public void A02() {
        super.A02();
        A0C();
        if (this.A04) {
            this.A0W.A01();
            this.A0V.A01();
        }
    }

    public void A03() {
        super.A03();
        A0D();
        if (this.A04) {
            this.A0W.A03();
        }
    }

    public void A04() {
        super.A04();
        AnonymousClass2B3 r0 = (AnonymousClass2B3) this;
        this.A06 = r0.A0K.A0J(r0.A0B);
        C28921Zf r2 = this.A0U;
        r2.A01 = 0;
        r2.A00 = 0;
        if (A0O(true)) {
            r2.A03();
        }
        A0H();
        A0E();
    }

    public void A05() {
        super.A05();
        this.A0W.A01();
        this.A0U.A01();
        StringBuilder sb = new StringBuilder("playbackPage/stopPlayback page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(this.A0R.A01);
        Log.i(sb.toString());
        this.A05 = false;
        this.A04 = false;
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView.A03 == this.A0S) {
            statusPlaybackProgressView.A03 = null;
        }
        statusPlaybackProgressView.invalidate();
        A09().A0A();
        A0G();
        A0G();
    }

    public void A07(Rect rect) {
        super.A07(rect);
        C55722kE A0A2 = A0A();
        A0A2.A01.setPadding(rect.left, 0, rect.right, rect.bottom);
        A0A2.A05.setPadding(rect.left, 0, rect.right, rect.bottom);
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        View view = this.A00;
        AnonymousClass00B.A04(view);
        bottomSheetBehavior.A0L(view.getContext().getResources().getDimensionPixelSize(R.dimen.dimen0775) + rect.bottom);
        ViewGroup viewGroup = A0A2.A08;
        viewGroup.setPadding(rect.left, viewGroup.getPaddingTop(), rect.right, A0A2.A08.getPaddingBottom());
        C41841wk A092 = A09();
        if (A092 instanceof C606734v) {
            C606734v r2 = (C606734v) A092;
            int dimensionPixelSize = r2.A01().getResources().getDimensionPixelSize(R.dimen.dimen0797);
            r2.A0e.setPadding(rect.left, rect.top + dimensionPixelSize, rect.right, dimensionPixelSize + rect.bottom);
        }
    }

    public View A08(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        AnonymousClass1L1 r6 = this.A0P;
        C16740tZ r1 = ((AnonymousClass2B3) this).A0B;
        C28381Vw r2 = r1.A11;
        int hashCode = r2.A01.hashCode();
        byte b2 = r1.A10;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 13) {
                            if (b2 != 15) {
                                if (b2 != 25) {
                                    switch (b2) {
                                        case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                                            break;
                                        case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                                            break;
                                        case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                                            break;
                                        default:
                                            str = "UNKNOWN";
                                            break;
                                    }
                                }
                            } else {
                                str = "DELETING";
                            }
                        }
                        str = "GIF";
                    }
                    str = "VIDEO";
                } else {
                    str = "VOICE";
                }
                boolean z2 = r2.A02;
                AnonymousClass17S r22 = r6.A0B;
                r22.ALF(453119185, hashCode);
                r22.AKq("is_outgoing", 453119185, hashCode, z2);
                r22.AKp("media_type", str, 453119185, hashCode);
                r22.AL9(453119185, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_START", hashCode);
                this.A02 = (StatusPlaybackProgressView) this.A0R.A01.A06().findViewById(R.id.playback_progress);
                View inflate = layoutInflater.inflate(R.layout.layout0573, (ViewGroup) null, false);
                SS.setVw(inflate);
                C55722kE A0A2 = A0A();
                A0A2.A03 = inflate.findViewById(R.id.content_sheet);
                A0A2.A09 = (ViewGroup) inflate.findViewById(R.id.content);
                A0A2.A07 = inflate.findViewById(R.id.click_handler);
                A0A2.A0B = (TextView) inflate.findViewById(R.id.control_btn);
                A0A2.A04 = inflate.findViewById(R.id.control_frame);
                A0A2.A0F = (MediaCaptionTextView) inflate.findViewById(R.id.caption);
                A0A2.A01 = inflate.findViewById(R.id.caption_container);
                A0A2.A02 = inflate.findViewById(R.id.caption_padding);
                A0A2.A08 = (ViewGroup) inflate.findViewById(R.id.bottom_sheet);
                A0A2.A06 = inflate.findViewById(R.id.status_details_background);
                A0A2.A00 = inflate.findViewById(R.id.cancel_btn);
                A0A2.A0E = (CircularProgressBar) inflate.findViewById(R.id.progress_bar);
                A0A2.A0C = (TextView) inflate.findViewById(R.id.error);
                A0A2.A0A = (ViewGroup) inflate.findViewById(R.id.info);
                A0A2.A0D = (TextView) inflate.findViewById(R.id.info_btn);
                A0A2.A05 = inflate.findViewById(R.id.extra_padding);
                r22.AL9(453119185, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_END", hashCode);
                return inflate;
            }
            str = "IMAGE";
            boolean z22 = r2.A02;
            AnonymousClass17S r222 = r6.A0B;
            r222.ALF(453119185, hashCode);
            r222.AKq("is_outgoing", 453119185, hashCode, z22);
            r222.AKp("media_type", str, 453119185, hashCode);
            r222.AL9(453119185, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_START", hashCode);
            this.A02 = (StatusPlaybackProgressView) this.A0R.A01.A06().findViewById(R.id.playback_progress);
            View inflate2 = layoutInflater.inflate(R.layout.layout0573, (ViewGroup) null, false);
            SS.setVw(inflate2);
            C55722kE A0A22 = A0A();
            A0A22.A03 = inflate2.findViewById(R.id.content_sheet);
            A0A22.A09 = (ViewGroup) inflate2.findViewById(R.id.content);
            A0A22.A07 = inflate2.findViewById(R.id.click_handler);
            A0A22.A0B = (TextView) inflate2.findViewById(R.id.control_btn);
            A0A22.A04 = inflate2.findViewById(R.id.control_frame);
            A0A22.A0F = (MediaCaptionTextView) inflate2.findViewById(R.id.caption);
            A0A22.A01 = inflate2.findViewById(R.id.caption_container);
            A0A22.A02 = inflate2.findViewById(R.id.caption_padding);
            A0A22.A08 = (ViewGroup) inflate2.findViewById(R.id.bottom_sheet);
            A0A22.A06 = inflate2.findViewById(R.id.status_details_background);
            A0A22.A00 = inflate2.findViewById(R.id.cancel_btn);
            A0A22.A0E = (CircularProgressBar) inflate2.findViewById(R.id.progress_bar);
            A0A22.A0C = (TextView) inflate2.findViewById(R.id.error);
            A0A22.A0A = (ViewGroup) inflate2.findViewById(R.id.info);
            A0A22.A0D = (TextView) inflate2.findViewById(R.id.info_btn);
            A0A22.A05 = inflate2.findViewById(R.id.extra_padding);
            r222.AL9(453119185, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_END", hashCode);
            return inflate2;
        }
        str = "TEXT";
        boolean z222 = r2.A02;
        AnonymousClass17S r2222 = r6.A0B;
        r2222.ALF(453119185, hashCode);
        r2222.AKq("is_outgoing", 453119185, hashCode, z222);
        r2222.AKp("media_type", str, 453119185, hashCode);
        r2222.AL9(453119185, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_START", hashCode);
        this.A02 = (StatusPlaybackProgressView) this.A0R.A01.A06().findViewById(R.id.playback_progress);
        View inflate22 = layoutInflater.inflate(R.layout.layout0573, (ViewGroup) null, false);
        SS.setVw(inflate22);
        C55722kE A0A222 = A0A();
        A0A222.A03 = inflate22.findViewById(R.id.content_sheet);
        A0A222.A09 = (ViewGroup) inflate22.findViewById(R.id.content);
        A0A222.A07 = inflate22.findViewById(R.id.click_handler);
        A0A222.A0B = (TextView) inflate22.findViewById(R.id.control_btn);
        A0A222.A04 = inflate22.findViewById(R.id.control_frame);
        A0A222.A0F = (MediaCaptionTextView) inflate22.findViewById(R.id.caption);
        A0A222.A01 = inflate22.findViewById(R.id.caption_container);
        A0A222.A02 = inflate22.findViewById(R.id.caption_padding);
        A0A222.A08 = (ViewGroup) inflate22.findViewById(R.id.bottom_sheet);
        A0A222.A06 = inflate22.findViewById(R.id.status_details_background);
        A0A222.A00 = inflate22.findViewById(R.id.cancel_btn);
        A0A222.A0E = (CircularProgressBar) inflate22.findViewById(R.id.progress_bar);
        A0A222.A0C = (TextView) inflate22.findViewById(R.id.error);
        A0A222.A0A = (ViewGroup) inflate22.findViewById(R.id.info);
        A0A222.A0D = (TextView) inflate22.findViewById(R.id.info_btn);
        A0A222.A05 = inflate22.findViewById(R.id.extra_padding);
        r2222.AL9(453119185, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_END", hashCode);
        return inflate22;
    }

    /* JADX WARNING: type inference failed for: r13v3, types: [X.1wk] */
    /* JADX WARNING: type inference failed for: r16v2, types: [X.34v] */
    /* JADX WARNING: type inference failed for: r17v8, types: [X.34u] */
    /* JADX WARNING: type inference failed for: r17v9, types: [X.34y] */
    /* JADX WARNING: type inference failed for: r17v10, types: [X.34t] */
    /* JADX WARNING: type inference failed for: r17v11, types: [X.34x] */
    /* JADX WARNING: type inference failed for: r17v12, types: [X.34w] */
    /* JADX WARNING: type inference failed for: r17v13, types: [X.34s] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C41841wk A09() {
        /*
            r36 = this;
            r14 = r36
            X.2B3 r14 = (X.AnonymousClass2B3) r14
            X.1wk r13 = r14.A01
            if (r13 != 0) goto L_0x0074
            X.1PB r0 = r14.A0E
            X.0tZ r1 = r14.A0B
            r28 = r1
            X.4Ta r16 = new X.4Ta
            r1 = r16
            r1.<init>(r14)
            X.2Ao r4 = r14.A06
            X.0tz r1 = r14.A07
            r25 = r1
            X.0t9 r1 = r14.A09
            r17 = r1
            X.0zJ r1 = r14.A0A
            r18 = r1
            com.whatsapp.Mp4Ops r15 = r14.A03
            X.0so r12 = r14.A02
            X.0ua r11 = r14.A04
            r1 = r28
            byte r2 = r1.A10
            if (r2 == 0) goto L_0x0185
            r1 = 1
            if (r2 == r1) goto L_0x015c
            r1 = 2
            if (r2 == r1) goto L_0x0121
            r1 = 3
            if (r2 == r1) goto L_0x00de
            r1 = 13
            if (r2 == r1) goto L_0x009c
            r1 = 15
            if (r2 == r1) goto L_0x0075
            r1 = 25
            if (r2 == r1) goto L_0x015c
            switch(r2) {
                case 27: goto L_0x0185;
                case 28: goto L_0x00de;
                case 29: goto L_0x009c;
                default: goto L_0x0047;
            }
        L_0x0047:
            X.0pd r7 = r0.A0E
            X.0xQ r6 = r0.A07
            X.0pt r5 = r0.A04
            X.0uW r4 = r0.A05
            X.01V r3 = r0.A0A
            X.013 r2 = r0.A0B
            X.1P8 r1 = r0.A0H
            X.1Lh r0 = r0.A09
            X.34t r13 = new X.34t
            r17 = r13
            r18 = r5
            r19 = r4
            r20 = r6
            r21 = r0
            r22 = r3
            r23 = r2
            r24 = r7
            r25 = r1
            r26 = r28
            r27 = r16
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0072:
            r14.A01 = r13
        L_0x0074:
            return r13
        L_0x0075:
            X.0pt r7 = r0.A04
            X.0uW r6 = r0.A05
            X.01V r5 = r0.A0A
            X.013 r4 = r0.A0B
            X.1P8 r3 = r0.A0H
            r1 = 4500(0x1194, double:2.2233E-320)
            X.4WP r0 = new X.4WP
            r0.<init>(r1)
            X.34s r13 = new X.34s
            r17 = r13
            r18 = r7
            r19 = r6
            r20 = r5
            r21 = r4
            r22 = r3
            r23 = r0
            r24 = r16
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0072
        L_0x009c:
            X.0pd r15 = r0.A0E
            X.0pt r12 = r0.A04
            X.0sq r11 = r0.A0M
            X.0sb r10 = r0.A03
            X.0um r9 = r0.A0D
            X.0s5 r8 = r0.A06
            X.1P7 r7 = r0.A0F
            X.01V r6 = r0.A0A
            X.013 r5 = r0.A0B
            X.1P8 r4 = r0.A0H
            X.1Ld r3 = r0.A0L
            X.1P9 r2 = r0.A0N
            X.1MF r1 = r0.A0J
            X.1PA r0 = r0.A0I
            X.34w r13 = new X.34w
            r17 = r13
            r19 = r10
            r20 = r12
            r21 = r8
            r22 = r6
            r23 = r5
            r24 = r9
            r25 = r15
            r26 = r7
            r27 = r4
            r29 = r16
            r30 = r0
            r31 = r1
            r32 = r3
            r33 = r11
            r34 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0072
        L_0x00de:
            X.0pd r15 = r0.A0E
            X.0pt r12 = r0.A04
            X.0sq r11 = r0.A0M
            X.0sb r10 = r0.A03
            X.0um r9 = r0.A0D
            X.0s5 r8 = r0.A06
            X.1P7 r7 = r0.A0F
            X.01V r6 = r0.A0A
            X.013 r5 = r0.A0B
            X.1P8 r4 = r0.A0H
            X.1Ld r3 = r0.A0L
            X.1P9 r2 = r0.A0N
            X.1MF r1 = r0.A0J
            X.1PA r0 = r0.A0I
            X.34x r13 = new X.34x
            r17 = r13
            r19 = r10
            r20 = r12
            r21 = r8
            r22 = r6
            r23 = r5
            r24 = r9
            r25 = r15
            r26 = r7
            r27 = r4
            r29 = r16
            r30 = r0
            r31 = r1
            r32 = r3
            r33 = r11
            r34 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0072
        L_0x0121:
            X.0pd r3 = r0.A0E
            X.0tM r2 = X.C16620tM.A01
            r1 = 1875(0x753, float:2.627E-42)
            boolean r1 = r3.A0E(r2, r1)
            if (r1 == 0) goto L_0x0047
            X.0pt r8 = r0.A04
            X.01V r7 = r0.A0A
            X.013 r6 = r0.A0B
            X.1P8 r5 = r0.A0H
            X.0uW r3 = r0.A05
            X.1PA r2 = r0.A0I
            X.1P6 r1 = r0.A01
            X.1Az r0 = r0.A0K
            X.34y r13 = new X.34y
            r17 = r13
            r18 = r3
            r19 = r1
            r20 = r8
            r21 = r4
            r22 = r7
            r23 = r6
            r24 = r5
            r25 = r28
            r26 = r16
            r27 = r2
            r28 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0072
        L_0x015c:
            X.0pd r6 = r0.A0E
            X.0pt r5 = r0.A04
            X.1P7 r4 = r0.A0F
            X.01V r3 = r0.A0A
            X.013 r2 = r0.A0B
            X.1P8 r1 = r0.A0H
            X.1Ld r0 = r0.A0L
            X.34u r13 = new X.34u
            r17 = r13
            r19 = r5
            r20 = r3
            r21 = r2
            r22 = r6
            r23 = r4
            r24 = r1
            r25 = r28
            r26 = r16
            r27 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0072
        L_0x0185:
            X.0pd r10 = r0.A0E
            X.0pt r9 = r0.A04
            X.0uW r8 = r0.A05
            X.01V r7 = r0.A0A
            X.013 r6 = r0.A0B
            X.1P8 r5 = r0.A0H
            X.1Mg r4 = r0.A0C
            X.0uk r3 = r0.A08
            X.0sq r2 = r0.A0M
            X.1Ld r1 = r0.A0L
            X.1Gj r0 = r0.A0G
            X.34v r13 = new X.34v
            r29 = r17
            r30 = r0
            r31 = r5
            r32 = r28
            r33 = r16
            r34 = r1
            r35 = r2
            r16 = r13
            r17 = r18
            r18 = r12
            r19 = r9
            r20 = r8
            r21 = r15
            r22 = r11
            r23 = r3
            r24 = r7
            r26 = r6
            r27 = r4
            r28 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41811wh.A09():X.1wk");
    }

    public C55722kE A0A() {
        if (this instanceof AnonymousClass2B2) {
            return ((AnonymousClass2B2) this).A0Q();
        }
        C55722kE r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C55722kE r02 = new C55722kE(this);
        this.A01 = r02;
        return r02;
    }

    public void A0B() {
        this.A03 = true;
        AnonymousClass4L6 r1 = this.A0R;
        StatusPlaybackContactFragment statusPlaybackContactFragment = r1.A02;
        C26941Pv r5 = statusPlaybackContactFragment.A0a;
        r5.A02.A01(new RunnableRunnableShape2S0300000_I0_2(r5, statusPlaybackContactFragment.A0k, r1.A00, 10), 51);
    }

    public void A0C() {
        if (this.A05 && !this.A04) {
            StringBuilder sb = new StringBuilder("playbackPage/pausePlayback page=");
            sb.append(this);
            sb.append("; host=");
            sb.append(this.A0R.A01);
            Log.i(sb.toString());
            this.A04 = true;
            A09().A04();
            this.A0V.A03();
        }
    }

    public void A0D() {
        if (this.A04 && this.A05 && !this.A02 && this.A00.A0B == 4 && !this.A01.A0F.A0K()) {
            A09();
            StringBuilder sb = new StringBuilder("playbackPage/resumePlayback page=");
            sb.append(this);
            sb.append("; host=");
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A0R.A01;
            sb.append(statusPlaybackBaseFragment);
            Log.i(sb.toString());
            C001000l A0C2 = statusPlaybackBaseFragment.A0C();
            if (A0C2 instanceof StatusPlaybackActivity) {
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) A0C2;
                if (statusPlaybackActivity.A0L) {
                    statusPlaybackActivity.A0L = false;
                    new Handler().postDelayed(new RunnableRunnableShape15S0100000_I0_14(this, 5), 1000);
                    return;
                }
            }
            this.A04 = false;
            A09().A05();
            this.A0V.A01();
            A0G();
        }
    }

    public void A0E() {
        if (!this.A04 || this.A05 || !A09().A07()) {
            StringBuilder sb = new StringBuilder("playbackPage/startPlayback not possible page=");
            sb.append(this);
            sb.append("; host=");
            sb.append(this.A0R.A01);
            Log.w(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("playbackPage/startPlayback page=");
        sb2.append(this);
        sb2.append("; host=");
        sb2.append(this.A0R.A01);
        Log.i(sb2.toString());
        this.A05 = true;
        this.A04 = false;
        A09().A09();
        this.A02.setProgressProvider(this.A0S);
        A0G();
        this.A0U.A01();
        this.A0W.A03();
        if (this.A02 || !this.A03 || this.A00.A0B != 4 || this.A01.A0F.A0K()) {
            A0C();
        } else {
            A09();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1.A0P == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F() {
        /*
            r17 = this;
            r0 = r17
            X.1wk r2 = r0.A09()
            boolean r1 = r2 instanceof X.AnonymousClass34y
            if (r1 == 0) goto L_0x003f
            X.34y r2 = (X.AnonymousClass34y) r2
            X.1rH r1 = r2.A09
            X.0ta r1 = r1.A02
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.A0P
            r3 = 0
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r3 = 1
        L_0x0018:
            X.3OC r1 = r2.A0A
            r1.setBlurEnabled(r3)
        L_0x001d:
            boolean r3 = r0.A0N()
            X.2kE r1 = r0.A0A()
            android.view.ViewGroup r2 = r1.A0A
            if (r3 == 0) goto L_0x003d
            android.view.View r0 = r0.A00
            X.AnonymousClass00B.A04(r0)
            android.content.Context r1 = r0.getContext()
            r0 = 2131231577(0x7f080359, float:1.8079239E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r1, r0)
        L_0x0039:
            r2.setBackground(r0)
            return
        L_0x003d:
            r0 = 0
            goto L_0x0039
        L_0x003f:
            boolean r1 = r2 instanceof X.C606934x
            if (r1 == 0) goto L_0x0058
            X.34x r2 = (X.C606934x) r2
            boolean r1 = r2.A07()
            if (r1 != 0) goto L_0x0054
            r2.A0F()
            r2.A0H()
            r2.A0E()
        L_0x0054:
            r2.A0C()
            goto L_0x001d
        L_0x0058:
            boolean r1 = r2 instanceof X.C606534t
            if (r1 == 0) goto L_0x00cd
            X.34t r2 = (X.C606534t) r2
            X.0xQ r1 = r2.A02
            android.net.Uri r6 = r1.A00()
            X.0tZ r1 = r2.A05
            X.1Vw r1 = r1.A11
            boolean r1 = r1.A02
            r3 = 2131888419(0x7f120923, float:1.9411473E38)
            if (r1 == 0) goto L_0x0072
            r3 = 2131888418(0x7f120922, float:1.941147E38)
        L_0x0072:
            android.content.Context r1 = r2.A01()
            java.lang.String r3 = X.C25951Lt.A00(r1, r6, r3)
            r9 = 0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            android.text.Spanned r1 = X.AnonymousClass1ZW.A01(r3, r1)
            android.text.SpannableString r8 = android.text.SpannableString.valueOf(r1)
            int r3 = r3.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            java.lang.Object[] r7 = r8.getSpans(r9, r3, r1)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            int r5 = r7.length
            r4 = 0
        L_0x0093:
            if (r4 >= r5) goto L_0x00bd
            r11 = r7[r4]
            int r3 = r8.getSpanStart(r11)
            int r1 = r8.getSpanEnd(r11)
            r8.removeSpan(r11)
            com.obwhatsapp.TextEmojiLabel r10 = r2.A01
            android.content.Context r12 = r10.getContext()
            X.0pt r14 = r2.A01
            X.01V r15 = r2.A02
            X.0uX r13 = r2.A00
            java.lang.String r16 = r11.getURL()
            X.2uk r11 = new X.2uk
            r11.<init>(r12, r13, r14, r15, r16)
            r8.setSpan(r11, r3, r1, r9)
            int r4 = r4 + 1
            goto L_0x0093
        L_0x00bd:
            com.obwhatsapp.TextEmojiLabel r4 = r2.A01
            r4.setText(r8)
            r3 = 3
            com.whatsapp.util.ViewOnClickCListenerShape2S0200000_I1_1 r1 = new com.whatsapp.util.ViewOnClickCListenerShape2S0200000_I1_1
            r1.<init>(r2, r3, r6)
            r4.setOnClickListener(r1)
            goto L_0x001d
        L_0x00cd:
            boolean r1 = r2 instanceof X.C606734v
            if (r1 != 0) goto L_0x001d
            boolean r1 = r2 instanceof X.C606634u
            if (r1 == 0) goto L_0x001d
            X.34u r2 = (X.C606634u) r2
            com.obwhatsapp.mediaview.PhotoView r4 = r2.A05
            android.content.Context r1 = r4.getContext()
            android.app.Activity r1 = X.C19980zJ.A00(r1)
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            int r1 = java.lang.Math.max(r3, r1)
            r9 = 1
            com.facebook.redex.IDxTRendererShape14S0101000_2_I1 r6 = new com.facebook.redex.IDxTRendererShape14S0101000_2_I1
            r6.<init>(r2, r1, r9)
            boolean r1 = r2.A02
            X.1Ld r3 = r2.A08
            X.1rF r5 = r2.A06
            X.1Vw r7 = r5.A11
            if (r1 == 0) goto L_0x010b
            r8 = 1
            r3.A0B(r4, r5, r6, r7, r8)
            goto L_0x001d
        L_0x010b:
            r10 = 0
            r8 = 100
            r3.A0A(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41811wh.A0F():void");
    }

    public final void A0G() {
        AnonymousClass00B.A04(this.A00);
        this.A08.removeCallbacks(this.A0Z);
        if (this.A01.A08.getVisibility() != 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            if (this.A01.A01.getVisibility() != 0) {
                this.A01.A01.startAnimation(alphaAnimation);
                this.A01.A01.setVisibility(0);
            }
            if (this.A01.A0F.getVisibility() == 0 && this.A01.A02.getVisibility() != 0) {
                this.A01.A02.startAnimation(alphaAnimation);
                this.A01.A02.setVisibility(0);
            }
            if (this.A01.A08.getVisibility() == 4) {
                this.A01.A08.startAnimation(alphaAnimation);
                this.A01.A08.setVisibility(0);
            }
            AnonymousClass2B0 r4 = this.A0R.A01.A03;
            AnonymousClass00B.A07(r4, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
            AnonymousClass00B.A06(r4);
            View view = r4.A06;
            if (view.getVisibility() != 0) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation2.setDuration(300);
                view.startAnimation(alphaAnimation2);
                StatusPlaybackProgressView statusPlaybackProgressView = r4.A0E;
                statusPlaybackProgressView.startAnimation(alphaAnimation2);
                view.setVisibility(0);
                statusPlaybackProgressView.setVisibility(0);
                Button button = r4.A00;
                if (button != null) {
                    button.startAnimation(alphaAnimation2);
                    r4.A00.setVisibility(0);
                }
            }
            this.A00.setSystemUiVisibility(1792);
        }
    }

    public abstract void A0H();

    public void A0I(int i2) {
        C55722kE A0A2 = A0A();
        if (i2 == 4) {
            A0A2.A06.setVisibility(8);
            A0A2.A0A.setAlpha(1.0f);
            A0D();
        } else if (i2 != 3) {
            A0C();
        }
    }

    public void A0J(int i2) {
        String str;
        StringBuilder sb = new StringBuilder("playbackPage/reportStatusExitStats exit-method=");
        switch (i2) {
            case 1:
                str = "SWIPE_DOWN";
                break;
            case 2:
                str = "BACK_ARROW_TAP";
                break;
            case 3:
                str = "BACK_BUTTON_TAP";
                break;
            case 4:
                str = "STATUS_TIMEOUT";
                break;
            case 5:
                str = "STATUS_DISMISSED";
                break;
            case 6:
                str = "BACKWARD_SWIPE";
                break;
            case 7:
                str = "FORWARD_SWIPE";
                break;
            case 8:
                str = "BACKWARD_TAP";
                break;
            case 9:
                str = "FORWARD_TAP";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        sb.append("; page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(this.A0R.A01);
        Log.i(sb.toString());
    }

    public void A0K(int i2, boolean z2) {
        String str;
        StringBuilder sb = new StringBuilder("playbackPage/reportStatusEnterStats entry-method=");
        switch (i2) {
            case 1:
                str = "DIRECT_TAP";
                break;
            case 2:
                str = "BACKWARD_SWIPE";
                break;
            case 3:
                str = "FORWARD_SWIPE";
                break;
            case 4:
                str = "BACKWARD_TAP";
                break;
            case 5:
                str = "FORWARD_TAP";
                break;
            case 6:
                str = "PREVIOUS_STATUS_TIMEOUT";
                break;
            case 7:
                str = "PREVIOUS_STATUS_DISMISSED";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        sb.append("; page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(this.A0R.A01);
        Log.i(sb.toString());
    }

    public void A0L(View view) {
        StringBuilder sb = new StringBuilder("playbackPage/onViewCreated page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(this.A0R.A01);
        Log.i(sb.toString());
        AnonymousClass1L1 r1 = this.A0P;
        C16740tZ r4 = ((AnonymousClass2B3) this).A0B;
        int hashCode = r4.A11.A01.hashCode();
        AnonymousClass17S r2 = r1.A0B;
        r2.AL9(453119185, "PLAYBACK_PAGE_ITEM_ON_VIEW_CREATED_START", hashCode);
        C55722kE r10 = this.A01;
        AnonymousClass00B.A06(r10);
        String str = null;
        r10.A0F.setOnClickListener((View.OnClickListener) null);
        r10.A0F.setClickable(false);
        r10.A0F.A02 = new AnonymousClass52E(r10, this);
        this.A00 = new StatusPlaybackPageItem$2(this);
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        ((AnonymousClass0Bo) r10.A08.getLayoutParams()).A01(bottomSheetBehavior);
        bottomSheetBehavior.A0E = new IDxSCallbackShape45S0100000_2_I0(this, 5);
        StatusPlaybackPageItem$4 statusPlaybackPageItem$4 = new StatusPlaybackPageItem$4(this);
        ((AnonymousClass0Bo) r10.A03.getLayoutParams()).A01(statusPlaybackPageItem$4);
        statusPlaybackPageItem$4.A0E = new C58092si(r10, this);
        r10.A0E.setMax(100);
        r10.A09.addView(A09().A02());
        if (!(A09() instanceof C606734v) && ((r4 instanceof C30591cd) || !(r4 instanceof C16730tY) || (str = ((C16730tY) r4).A13()) == null)) {
            str = r4 instanceof C30581cc ? ((C30581cc) r4).A06 : null;
        }
        r10.A0F.A0L(this.A0Q, AnonymousClass1ZW.A05(1024, str), this.A0L.A0E(C16620tM.A02, 2032));
        r10.A02.setVisibility(r10.A0F.getVisibility());
        PointF pointF = new PointF();
        AtomicLong atomicLong = new AtomicLong();
        r10.A07.setOnTouchListener(new AnonymousClass3D0(pointF, this, atomicLong));
        A09().A02().setOnClickListener(new ViewOnClickCListenerShape2S0400000_I0(this, atomicLong, r10, pointF, 2));
        r2.AL9(453119185, "PLAYBACK_PAGE_ITEM_ON_VIEW_CREATED_END", hashCode);
        r2.AKy(453119185, hashCode, 2);
    }

    public final void A0M(boolean z2, boolean z3) {
        C55722kE A0A2 = A0A();
        AnonymousClass00B.A04(this.A00);
        if (A0A2.A08.getVisibility() != 4 || A0A2.A01.getVisibility() != 4) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            if (z2) {
                A0A2.A01.startAnimation(alphaAnimation);
                A0A2.A01.setVisibility(4);
            }
            if (z3) {
                this.A00.setSystemUiVisibility(1798);
                if (A0A2.A02.getVisibility() == 0) {
                    A0A2.A02.startAnimation(alphaAnimation);
                    A0A2.A02.setVisibility(4);
                }
            }
            if (A0A2.A08.getVisibility() == 0) {
                A0A2.A08.startAnimation(alphaAnimation);
                A0A2.A08.setVisibility(4);
            }
            AnonymousClass2B0 r6 = this.A0R.A01.A03;
            AnonymousClass00B.A07(r6, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
            AnonymousClass00B.A06(r6);
            View view = r6.A06;
            if (view.getVisibility() != 4) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(300);
                view.startAnimation(alphaAnimation2);
                StatusPlaybackProgressView statusPlaybackProgressView = r6.A0E;
                statusPlaybackProgressView.startAnimation(alphaAnimation2);
                view.setVisibility(4);
                statusPlaybackProgressView.setVisibility(4);
                Button button = r6.A00;
                if (button != null) {
                    button.startAnimation(alphaAnimation2);
                    r6.A00.setVisibility(4);
                }
            }
        }
    }

    public boolean A0N() {
        if (!(A09() instanceof C606734v)) {
            C16740tZ r2 = ((AnonymousClass2B3) this).A0B;
            String str = null;
            if (!(r2 instanceof C30591cd) && (r2 instanceof C16730tY)) {
                str = ((C16730tY) r2).A13();
            }
            return TextUtils.isEmpty(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O(boolean r12) {
        /*
            r11 = this;
            r0 = r11
            X.2B3 r0 = (X.AnonymousClass2B3) r0
            X.1BM r4 = r0.A0D
            X.0tZ r6 = r0.A0B
            X.4FF r1 = new X.4FF
            r1.<init>(r0)
            boolean r0 = r6 instanceof X.C16730tY
            r3 = 0
            if (r0 == 0) goto L_0x0043
            java.util.concurrent.ConcurrentHashMap r5 = r4.A05
            r5.put(r6, r1)
            r2 = r6
            X.0tY r2 = (X.C16730tY) r2
            X.1Vw r0 = r6.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0045
            boolean r0 = r2.A18()
            if (r0 == 0) goto L_0x0045
            boolean r0 = r2 instanceof X.C38711rI
            if (r0 == 0) goto L_0x0032
            r0 = r2
            X.1rK r0 = (X.C38731rK) r0
            boolean r0 = X.AnonymousClass20C.A03(r0)
            if (r0 != 0) goto L_0x0045
        L_0x0032:
            X.1et r1 = X.AnonymousClass1BM.A07
        L_0x0034:
            java.lang.Object r0 = r5.get(r2)
            X.4FF r0 = (X.AnonymousClass4FF) r0
            if (r0 == 0) goto L_0x0043
            X.2B3 r0 = r0.A00
            r0.A00 = r1
            r5.remove(r2)
        L_0x0043:
            r0 = 0
            return r0
        L_0x0045:
            X.0ta r1 = r2.A02
            X.AnonymousClass00B.A06(r1)
            boolean r0 = r1.A0P
            if (r0 == 0) goto L_0x005a
            int r1 = r1.A07
            r0 = 1
            if (r1 == r0) goto L_0x0057
            java.lang.String r0 = r2.A08
            if (r0 != 0) goto L_0x0032
        L_0x0057:
            X.1et r1 = X.AnonymousClass1BM.A08
            goto L_0x0034
        L_0x005a:
            java.lang.String r0 = "statusdownload/downloadifneeded "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r6 = " "
            r1.append(r6)
            X.1Vw r5 = r2.A11
            java.lang.String r0 = r5.A01
            r1.append(r0)
            r1.append(r6)
            X.0rv r0 = r2.A0B()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r12 == 0) goto L_0x00e3
            X.12c r7 = r4.A03
            java.util.Collection r0 = r7.A04()
            java.util.Iterator r10 = r0.iterator()
        L_0x008e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r8 = r10.next()
            X.0tY r8 = (X.C16730tY) r8
            X.1Vw r9 = r8.A11
            X.0rv r0 = r9.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto L_0x00d4
            r7.A0B(r8, r3, r3)
            java.util.ArrayList r0 = r4.A04
            r0.add(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "statusdownload/cancel "
        L_0x00ba:
            r1.append(r0)
            java.lang.String r0 = r9.A01
            r1.append(r0)
            r1.append(r6)
            X.0rv r0 = r8.A0B()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x008e
        L_0x00d4:
            boolean r0 = r9.equals(r5)
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "statusdownload/is-current "
            goto L_0x00ba
        L_0x00e3:
            X.0tY r0 = r4.A00
            if (r0 != 0) goto L_0x00f5
            X.0pd r0 = r4.A02
            boolean r0 = X.AnonymousClass20C.A01(r0, r2)
            if (r0 == 0) goto L_0x00f0
            r3 = 3
        L_0x00f0:
            r4.A00(r2, r3)
        L_0x00f3:
            r0 = 1
            return r0
        L_0x00f5:
            java.util.ArrayList r0 = r4.A04
            r0.add(r2)
            goto L_0x00f3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41811wh.A0O(boolean):boolean");
    }

    public void AOd() {
    }

    public void APi() {
        A0D();
    }
}
