package com.whatsapp.voipcalling;

import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass01A;
import X.AnonymousClass01J;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass027;
import X.AnonymousClass050;
import X.AnonymousClass0PG;
import X.AnonymousClass15A;
import X.AnonymousClass15I;
import X.AnonymousClass15P;
import X.AnonymousClass195;
import X.AnonymousClass1B1;
import X.AnonymousClass1BL;
import X.AnonymousClass1D0;
import X.AnonymousClass1OL;
import X.AnonymousClass1SN;
import X.AnonymousClass1ZA;
import X.AnonymousClass1ZC;
import X.AnonymousClass1ZD;
import X.AnonymousClass1ZE;
import X.AnonymousClass1ZG;
import X.AnonymousClass1ZH;
import X.AnonymousClass1ZT;
import X.AnonymousClass267;
import X.AnonymousClass26d;
import X.AnonymousClass2Ao;
import X.AnonymousClass2JP;
import X.AnonymousClass2OJ;
import X.AnonymousClass2OY;
import X.AnonymousClass2PE;
import X.AnonymousClass2Qx;
import X.AnonymousClass2Rf;
import X.AnonymousClass2Tr;
import X.AnonymousClass2zT;
import X.AnonymousClass3AO;
import X.AnonymousClass3C5;
import X.AnonymousClass3K2;
import X.AnonymousClass3K4;
import X.AnonymousClass3P9;
import X.AnonymousClass3oU;
import X.AnonymousClass46C;
import X.AnonymousClass49O;
import X.AnonymousClass4FR;
import X.AnonymousClass4HP;
import X.AnonymousClass4SA;
import X.AnonymousClass4Y8;
import X.AnonymousClass5P7;
import X.C004601z;
import X.C005702l;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14760pi;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16210se;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16570tH;
import X.C16620tM;
import X.C17120uZ;
import X.C17140ub;
import X.C17200uh;
import X.C17220uj;
import X.C17240ul;
import X.C17250um;
import X.C17650vQ;
import X.C18010w0;
import X.C18260wP;
import X.C18380wb;
import X.C19270y9;
import X.C19380yL;
import X.C19490yW;
import X.C19760yx;
import X.C19950zG;
import X.C19980zJ;
import X.C204310c;
import X.C204710g;
import X.C216014s;
import X.C23061Ai;
import X.C23071Aj;
import X.C23111An;
import X.C25671Kr;
import X.C26801Pf;
import X.C26811Ph;
import X.C26821Pi;
import X.C30341cC;
import X.C32001fU;
import X.C32241fu;
import X.C32601gl;
import X.C33481ie;
import X.C34901l3;
import X.C37921px;
import X.C447225g;
import X.C448926b;
import X.C49132Rg;
import X.C49592Tx;
import X.C50032Xj;
import X.C52142dD;
import X.C52302dW;
import X.C59942zS;
import X.C616839w;
import X.C62043Bk;
import X.C72883mr;
import X.C72893ms;
import X.C75003rS;
import X.C78783yg;
import X.C91494g0;
import X.C93464jF;
import X.C99874uj;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.Rational;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape126S0100000_1_I1;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import com.facebook.redex.IDxCallbackShape428S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxPDisplayerShape297S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0000000_I0;
import com.facebook.redex.RunnableRunnableShape0S0001000_I0;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.calling.CallDetailsLayout;
import com.obwhatsapp.calling.avatar.CallAvatarViewModel;
import com.obwhatsapp.calling.callgrid.view.CallGrid;
import com.obwhatsapp.calling.callgrid.view.CallGridLayoutManager;
import com.obwhatsapp.calling.callgrid.view.FocusViewContainer;
import com.obwhatsapp.calling.callgrid.view.MenuBottomSheet;
import com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel;
import com.obwhatsapp.calling.callheader.viewmodel.CallHeaderViewModel;
import com.obwhatsapp.calling.camera.IDxEListenerShape62S0100000_2_I0;
import com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout;
import com.obwhatsapp.calling.views.AppSettingsWarningDialogFragment;
import com.obwhatsapp.calling.views.VoipCallFooter;
import com.obwhatsapp.calling.views.VoipContactPickerDialogFragment;
import com.obwhatsapp.components.AnimatingArrowsLayout;
import com.obwhatsapp.consumer.di.bridge.calling.IDxCListenerShape65S0100000_2_I0;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VoipActivityV2 extends AnonymousClass1ZA implements AnonymousClass1ZC, AnonymousClass1ZD, AnonymousClass1ZE, ViewTreeObserver.OnGlobalLayoutListener, AnonymousClass1ZG, AnonymousClass1ZH {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public PictureInPictureParams.Builder A0B;
    public Drawable A0C;
    public Drawable A0D;
    public Drawable A0E;
    public Handler A0F;
    public View.OnClickListener A0G;
    public View.OnClickListener A0H;
    public View.OnClickListener A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public ViewGroup A0S;
    public ImageButton A0T;
    public ImageView A0U;
    public ImageView A0V;
    public ImageView A0W;
    public TextView A0X;
    public TextView A0Y;
    public TextView A0Z;
    public TextView A0a;
    public TextView A0b;
    public TextView A0c;
    public TextView A0d;
    public DialogFragment A0e;
    public DialogFragment A0f;
    public DialogFragment A0g;
    public DialogFragment A0h;
    public C16570tH A0i;
    public WaImageView A0j;
    public AnonymousClass01Y A0k;
    public CallDetailsLayout A0l;
    public C25671Kr A0m;
    public AnonymousClass1OL A0n;
    public CallAvatarViewModel A0o;
    public CallGrid A0p;
    public MenuBottomSheet A0q;
    public AnonymousClass4SA A0r;
    public VoipInCallNotifBanner A0s;
    public CallGridViewModel A0t;
    public InCallBannerViewModel A0u;
    public MenuBottomSheetViewModel A0v;
    public OrientationViewModel A0w;
    public CallHeaderViewModel A0x;
    public C78783yg A0y;
    public C49592Tx A0z;
    public C23111An A10;
    public C204310c A11;
    public C447225g A12;
    public C18380wb A13;
    public C18010w0 A14;
    public MaximizedParticipantVideoDialogFragment A15;
    public VideoCallParticipantView A16;
    public VideoCallParticipantViewLayout A17;
    public C616839w A18;
    public C26801Pf A19;
    public C26811Ph A1A;
    public AppSettingsWarningDialogFragment A1B;
    public AnonymousClass1SN A1C;
    public C17650vQ A1D;
    public C16000sG A1E;
    public C33481ie A1F;
    public C17140ub A1G;
    public C16080sP A1H;
    public AnonymousClass2Ao A1I;
    public C17200uh A1J;
    public C99874uj A1K;
    public ContactPickerFragment A1L;
    public AnonymousClass15I A1M;
    public C17120uZ A1N;
    public C19380yL A1O;
    public C16260sj A1P;
    public AnonymousClass1D0 A1Q;
    public AnonymousClass195 A1R;
    public C16490t9 A1S;
    public C17240ul A1T;
    public UserJid A1U;
    public C14760pi A1V;
    public AnonymousClass1BL A1W;
    public C19760yx A1X;
    public C16210se A1Y;
    public C216014s A1Z;
    public AnonymousClass1B1 A1a;
    public AnonymousClass15A A1b;
    public AnonymousClass2PE A1c;
    public VoipCallControlBottomSheetV2 A1d;
    public VoipCameraManager A1e;
    public String A1f;
    public String A1g;
    public Map A1h;
    public AnonymousClass01J A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public boolean A1n;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;
    public boolean A1v;
    public boolean A1w;
    public boolean A1x;
    public boolean A1y;
    public boolean A1z;
    public boolean A20;
    public boolean A21;
    public boolean A22;
    public boolean A23;
    public boolean A24;
    public boolean A25;
    public final AnonymousClass5P7 A26;
    public final AnonymousClass2OY A27;
    public final C19270y9 A28;
    public final AnonymousClass4FR A29;
    public final C26821Pi A2A;

    public class MessageDialogFragment extends Hilt_VoipActivityV2_MessageDialogFragment {
        public C17650vQ A00;

        public static DialogFragment A01(String str) {
            MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle A0D = C13690nt.A0D();
            A0D.putString("message", str);
            messageDialogFragment.A0T(A0D);
            return messageDialogFragment;
        }

        public Dialog A1B(Bundle bundle) {
            Context A02 = A02();
            String string = A04().getString("message");
            C32241fu A002 = C32241fu.A00(A02);
            A002.A06(string);
            A002.A07(true);
            C13680ns.A1H(A002, this, 118, R.string.str0e87);
            return A002.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (A0C() != null && !this.A00.A00()) {
                A0C().finish();
            }
        }
    }

    public class ReplyWithMessageDialogFragment extends Hilt_VoipActivityV2_ReplyWithMessageDialogFragment {
        public static final int[] A02 = {R.string.str0b69, R.string.str0b6a, R.string.str0b6b, R.string.str0b6c, R.string.str0b6d};
        public C16440t3 A00;
        public final UserJid A01;

        public ReplyWithMessageDialogFragment(UserJid userJid) {
            this.A01 = userJid;
        }

        public Dialog A1B(Bundle bundle) {
            C32241fu A002 = C32241fu.A00(A02());
            String[] A0U = this.A02.A0U(A02);
            AnonymousClass3C5 r1 = new AnonymousClass3C5(this, A0U);
            AnonymousClass0PG r0 = A002.A01;
            r0.A0M = A0U;
            r0.A05 = r1;
            C005702l create = A002.create();
            create.setCanceledOnTouchOutside(true);
            return create;
        }
    }

    public class E2EEInfoDialogFragment extends Hilt_VoipActivityV2_E2EEInfoDialogFragment {
        public int A00 = 11;
        public C19980zJ A01;
        public C16490t9 A02;
        public AnonymousClass1BL A03;
        public C17220uj A04;

        public static E2EEInfoDialogFragment A01(int i2) {
            E2EEInfoDialogFragment e2EEInfoDialogFragment = new E2EEInfoDialogFragment();
            Bundle A0D = C13690nt.A0D();
            A0D.putInt("entry_point", i2);
            e2EEInfoDialogFragment.A0T(A0D);
            return e2EEInfoDialogFragment;
        }

        public Dialog A1B(Bundle bundle) {
            int i2;
            C32241fu A0R = AnonymousClass3K2.A0R(this);
            Bundle bundle2 = this.A05;
            if (!(bundle2 == null || (i2 = bundle2.getInt("entry_point", -1)) == -1)) {
                this.A00 = i2;
                if (this.A04.A0C(1071)) {
                    this.A03.A00(i2, 1);
                }
            }
            boolean A0C = this.A04.A0C(1071);
            int i3 = R.string.str07eb;
            if (A0C) {
                i3 = R.string.str02b9;
            }
            A0R.A01(i3);
            C13690nt.A1H(A0R, this, 115, R.string.str0e87);
            A0R.A0B(new IDxCListenerShape128S0100000_2_I1(this, 114), R.string.str1cf6);
            return A0R.create();
        }
    }

    public class EndCallConfirmationDialogFragment extends Hilt_VoipActivityV2_EndCallConfirmationDialogFragment {
        public static DialogFragment A01(String str) {
            EndCallConfirmationDialogFragment endCallConfirmationDialogFragment = new EndCallConfirmationDialogFragment();
            Bundle A0D = C13690nt.A0D();
            A0D.putString("message", str);
            endCallConfirmationDialogFragment.A0T(A0D);
            return endCallConfirmationDialogFragment;
        }

        public Dialog A1B(Bundle bundle) {
            String string = A04().getString("message");
            C32241fu A0R = AnonymousClass3K2.A0R(this);
            A0R.A06(string);
            A0R.A07(true);
            C13680ns.A1H(A0R, this, 117, R.string.str02ac);
            C13690nt.A1H(A0R, this, 116, R.string.str0b21);
            return A0R.create();
        }
    }

    public class NonActivityDismissDialogFragment extends Hilt_VoipActivityV2_NonActivityDismissDialogFragment {
        public static DialogFragment A01(String str, boolean z2) {
            NonActivityDismissDialogFragment nonActivityDismissDialogFragment = new NonActivityDismissDialogFragment();
            Bundle A0D = C13690nt.A0D();
            A0D.putString("text", str);
            A0D.putBoolean("dismiss", z2);
            nonActivityDismissDialogFragment.A0T(A0D);
            return nonActivityDismissDialogFragment;
        }

        public Dialog A1B(Bundle bundle) {
            Context A02 = A02();
            Bundle A04 = A04();
            C32241fu A00 = C32241fu.A00(A02);
            A00.A06(A04.getString("text"));
            A00.A07(true);
            if (A04.getBoolean("dismiss", false)) {
                C13680ns.A1H(A00, this, 119, R.string.str0e87);
            }
            return A00.create();
        }
    }

    public class RemoveUserConfirmationDialogFragment extends Hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment {
        public C447225g A00;
        public C16000sG A01;
        public C16080sP A02;

        public RemoveUserConfirmationDialogFragment(C447225g r1) {
            this.A00 = r1;
        }

        public Dialog A1B(Bundle bundle) {
            Context A022 = A02();
            C15830rv r5 = (C15830rv) A04().getParcelable("user_jid");
            AnonymousClass00B.A06(r5);
            String A0C = this.A02.A0C(this.A01.A0A(r5));
            AnonymousClass00B.A06(A0C);
            C32241fu A002 = C32241fu.A00(A022);
            A002.setTitle(C13690nt.A0c(this, A0C, new Object[1], 0, R.string.str035a));
            A002.A06(C13690nt.A0c(this, A0C, new Object[1], 0, R.string.str035b));
            A002.A07(true);
            AnonymousClass3K4.A0n(A002, r5, this, 36, R.string.str0359);
            A002.setNegativeButton(R.string.str0355, new IDxCListenerShape29S0200000_2_I1(r5, 35, this));
            A002.A0B(new IDxCListenerShape128S0100000_2_I1(this, 120), R.string.str0394);
            return A002.create();
        }
    }

    public class SwitchCameraForPersonalizedAvatarDialogFragment extends Hilt_VoipActivityV2_SwitchCameraForPersonalizedAvatarDialogFragment {
        public Dialog A1B(Bundle bundle) {
            C32241fu A0R = AnonymousClass3K2.A0R(this);
            A0R.A02(R.string.str1732);
            A0R.A01(R.string.str1731);
            C13690nt.A1H(A0R, this, 122, R.string.str0394);
            C13680ns.A1H(A0R, this, 121, R.string.str0e87);
            return A0R.create();
        }
    }

    public class SwitchConfirmationFragment extends Hilt_VoipActivityV2_SwitchConfirmationFragment {
        public C15860rz A00;

        public Dialog A1B(Bundle bundle) {
            C32241fu A0R = AnonymousClass3K2.A0R(this);
            A0R.A01(R.string.str1b11);
            C005702l A0O = AnonymousClass3K2.A0O(new IDxCListenerShape126S0100000_1_I1(this, 5), A0R, R.string.str1b10);
            A0O.setCanceledOnTouchOutside(true);
            return A0O;
        }
    }

    public VoipActivityV2() {
        this(0);
        this.A25 = false;
        this.A00 = -1.0f;
        this.A1U = null;
        this.A28 = new IDxCObserverShape111S0100000_2_I0(this, 11);
        this.A2A = new IDxEListenerShape62S0100000_2_I0(this, 1);
        this.A29 = new AnonymousClass4FR(this);
        this.A23 = true;
        this.A01 = 3;
        this.A26 = new IDxCallbackShape428S0100000_2_I0(this, 1);
        this.A27 = new IDxPDisplayerShape297S0100000_2_I0(this, 1);
        this.A1F = null;
    }

    public VoipActivityV2(int i2) {
        this.A1s = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 109));
    }

    public static C93464jF A02(Context context, String str, boolean z2) {
        if (str == null) {
            return null;
        }
        int i2 = R.string.str0360;
        if (z2) {
            i2 = R.string.str035f;
        }
        return new C93464jF(context.getString(i2, new Object[]{C62043Bk.A02(str, z2)}), context.getString(R.string.str035e), z2);
    }

    public static final List A03(CallInfo callInfo) {
        ArrayList arrayList = new ArrayList();
        for (C32001fU r1 : callInfo.participants.values()) {
            if (!r1.A0G) {
                arrayList.add(r1.A07);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void A09(Pair pair, VoipActivityV2 voipActivityV2) {
        C18010w0 r2;
        C75003rS r1;
        if (pair != null) {
            AnonymousClass4HP r22 = (AnonymousClass4HP) pair.first;
            int intValue = ((Number) pair.second).intValue();
            MenuBottomSheet menuBottomSheet = voipActivityV2.A0q;
            if (menuBottomSheet != null) {
                menuBottomSheet.A1D();
                voipActivityV2.A0q = null;
            }
            if (intValue == 6) {
                String str = r22.A00;
                boolean z2 = r22.A01;
                C93464jF A022 = A02(voipActivityV2, str, z2);
                if (A022 != null) {
                    voipActivityV2.startActivity(C14750ph.A0c(voipActivityV2, A022.A01));
                }
                r2 = voipActivityV2.A14;
                r1 = C52142dD.A01((String) null, 3, 5, z2);
            } else if (intValue == 7) {
                String str2 = r22.A00;
                boolean z3 = r22.A01;
                AnonymousClass4Y8.A01(voipActivityV2.A05, voipActivityV2.A08, C62043Bk.A02(str2, z3));
                r2 = voipActivityV2.A14;
                r1 = C52142dD.A01((String) null, 1, 5, z3);
            } else if (intValue == 8) {
                String str3 = r22.A00;
                boolean z4 = r22.A01;
                C93464jF A023 = A02(voipActivityV2, str3, z4);
                if (Build.VERSION.SDK_INT < 22) {
                    C18010w0 r23 = voipActivityV2.A14;
                    r23.A01.A06(C52142dD.A01((String) null, 2, 5, z4));
                }
                if (A023 != null) {
                    voipActivityV2.startActivity(C52142dD.A00(voipActivityV2, A023.A01, A023.A00, 5, z4));
                    return;
                }
                return;
            } else {
                return;
            }
            r2.A01.A06(r1);
        }
    }

    public static void A0A(View view) {
        StringBuilder sb = new StringBuilder("calling/VoipUiUtils/animateButtonIn delay:");
        sb.append(100);
        Log.i(sb.toString());
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(1.0f));
        scaleAnimation.setDuration(300);
        scaleAnimation.setStartOffset((long) 100);
        view.startAnimation(scaleAnimation);
    }

    public static /* synthetic */ void A0T(UserJid userJid, VoipActivityV2 voipActivityV2) {
        C447225g r3;
        CallInfo A3B = voipActivityV2.A3B();
        if (A3B != null && A3B.callState != CallState.NONE && (r3 = voipActivityV2.A12) != null) {
            r3.A14.execute(new RunnableRunnableShape3S0200000_I0_1(r3, 41, userJid));
        }
    }

    public static /* synthetic */ void A0p(VoipActivityV2 voipActivityV2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i2 != i6 || i4 != i8 || i3 != i7 || i5 != i9) {
            Rect rect = new Rect();
            voipActivityV2.A0p.getGlobalVisibleRect(rect);
            if (voipActivityV2.A3z() && voipActivityV2.A01 == 3) {
                PictureInPictureParams.Builder builder = voipActivityV2.A0B;
                AnonymousClass00B.A07(builder, "PiP Params Builder is null");
                builder.setSourceRectHint(rect);
                voipActivityV2.setPictureInPictureParams(voipActivityV2.A0B.build());
            }
        }
    }

    public static /* synthetic */ boolean A0r(View.OnClickListener onClickListener, View view, VoipActivityV2 voipActivityV2) {
        Drawable drawable;
        View view2 = view;
        Log.i("voip/VoipActivityV2/videoParticipantView/onLongClick");
        if (!(view2 instanceof VideoCallParticipantView)) {
            AnonymousClass00B.A08("long click on non VideoCallParticipantView");
            return false;
        }
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        VideoCallParticipantView videoCallParticipantView = (VideoCallParticipantView) view2;
        UserJid userJid = videoCallParticipantView.A0F;
        VoipActivityV2 voipActivityV22 = voipActivityV2;
        CallInfo A3B = voipActivityV22.A3B();
        boolean z2 = true;
        if (userJid != null) {
            if (A3B != null && videoCallParticipantView.A08()) {
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = voipActivityV22.A15;
                if (maximizedParticipantVideoDialogFragment != null) {
                    maximizedParticipantVideoDialogFragment.A1O(true);
                }
                C91494g0 r15 = new C91494g0(userJid, voipActivityV22);
                int[] iArr = new int[2];
                videoCallParticipantView.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                int width = videoCallParticipantView.getWidth();
                int height = videoCallParticipantView.getHeight();
                if (AnonymousClass49O.A00 || Build.VERSION.SDK_INT < 21) {
                    drawable = new ColorDrawable(-16777216);
                } else {
                    Bitmap cachedViewBitmap = voipActivityV22.A17.getCachedViewBitmap();
                    Canvas canvas = new Canvas(cachedViewBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(new LightingColorFilter(-10066330, 0));
                    for (C616839w r2 : voipActivityV22.A1h.values()) {
                        Bitmap A002 = r2.A00();
                        if (!(A002 == null || r2.A00 == null)) {
                            int[] iArr2 = new int[2];
                            int[] iArr3 = new int[2];
                            voipActivityV22.A17.getLocationOnScreen(iArr3);
                            VideoCallParticipantView videoCallParticipantView2 = r2.A00;
                            videoCallParticipantView2.getLocationOnScreen(iArr2);
                            iArr2[0] = iArr2[0] - iArr3[0];
                            int i4 = iArr2[1] - iArr3[1];
                            iArr2[1] = i4;
                            int i5 = iArr2[0];
                            canvas.drawBitmap(A002, (Rect) null, new Rect(i5, i4, i5 + videoCallParticipantView2.getWidth(), iArr2[1] + videoCallParticipantView2.getHeight()), paint);
                            A002.recycle();
                        }
                    }
                    FilterUtils.blurNative(cachedViewBitmap, voipActivityV22.getResources().getDimensionPixelSize(R.dimen.dimen050e), 2);
                    drawable = new BitmapDrawable(voipActivityV22.getResources(), cachedViewBitmap);
                }
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment2 = new MaximizedParticipantVideoDialogFragment(r15, drawable, onClickListener, new RunnableRunnableShape16S0100000_I0_15(voipActivityV22, 30), i2, i3, width, height);
                voipActivityV22.A15 = maximizedParticipantVideoDialogFragment2;
                maximizedParticipantVideoDialogFragment2.A08 = userJid != voipActivityV22.A18.A04 ? new AnonymousClass2zT(maximizedParticipantVideoDialogFragment2, userJid, voipActivityV22) : new C59942zS(maximizedParticipantVideoDialogFragment2, userJid, voipActivityV22, "max_preview");
                if (voipActivityV22.A23) {
                    voipActivityV22.A23 = false;
                    if (voipActivityV22.A1d == null) {
                        View decorView = voipActivityV22.getWindow().getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4);
                        voipActivityV22.getWindow().setFlags(1024, 1024);
                    }
                    voipActivityV22.A3N();
                } else {
                    MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment3 = voipActivityV22.A15;
                    if (!maximizedParticipantVideoDialogFragment3.A0c()) {
                        maximizedParticipantVideoDialogFragment3.A1G(voipActivityV22.AGM(), "maximized_video");
                        return true;
                    }
                }
                return true;
            }
        } else if (A3B != null) {
            z2 = false;
        }
        AnonymousClass00B.A0B("null jid or callinfo on long clicked VideoCallParticipantView", z2);
        return false;
    }

    public static final boolean A0u(CallInfo callInfo) {
        return callInfo != null && callInfo.videoEnabled;
    }

    public void A1q() {
        if (!this.A1s) {
            this.A1s = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A01 = r2.A0F();
            this.A1S = (C16490t9) r1.AQz.get();
            this.A1Z = (C216014s) r1.AMr.get();
            this.A11 = (C204310c) r1.A3O.get();
            this.A10 = (C23111An) r1.AQ3.get();
            this.A1b = (AnonymousClass15A) r1.A3J.get();
            this.A1J = (C17200uh) r1.A52.get();
            this.A1D = C16150sX.A0J(r1);
            this.A1E = (C16000sG) r1.A4x.get();
            this.A1H = (C16080sP) r1.AQ9.get();
            this.A0k = (AnonymousClass01Y) r1.A1w.get();
            this.A1G = (C17140ub) r1.A4y.get();
            this.A1T = (C17240ul) r1.ABK.get();
            this.A19 = (C26801Pf) r1.APr.get();
            this.A1A = (C26811Ph) r1.APs.get();
            this.A1Y = (C16210se) r1.AQr.get();
            this.A1Q = (AnonymousClass1D0) r1.A3P.get();
            this.A1M = (AnonymousClass15I) r1.A3r.get();
            this.A1e = (VoipCameraManager) r1.APz.get();
            this.A0z = r2.A0B();
            this.A1X = (C19760yx) r1.AKx.get();
            this.A13 = C16150sX.A0H(r1);
            this.A1P = (C16260sj) r1.AQe.get();
            this.A1R = (AnonymousClass195) r1.ACz.get();
            this.A0m = (C25671Kr) r1.A3D.get();
            this.A14 = C16150sX.A0I(r1);
            this.A0n = (AnonymousClass1OL) r1.AQ4.get();
            this.A1O = (C19380yL) r1.AQd.get();
            this.A1V = (C14760pi) r1.AFo.get();
            this.A1a = (AnonymousClass1B1) r1.A2F.get();
            this.A0i = (C16570tH) r1.A0e.get();
            this.A1W = (AnonymousClass1BL) r1.AJE.get();
            this.A1C = (AnonymousClass1SN) r1.AD0.get();
            this.A1N = (C17120uZ) r1.AQT.get();
            this.A1i = r1.AJw;
        }
    }

    public void A29() {
        CallInfo A3B = A3B();
        if (A3B != null) {
            boolean z2 = true;
            if (!A3B.videoEnabled) {
                z2 = false;
            }
            if (this.A0C.A0E(C16620tM.A02, 1071)) {
                int i2 = 10;
                if (z2) {
                    i2 = 11;
                }
                this.A1W.A00(i2, 0);
            }
        }
    }

    public boolean A2A() {
        return true;
    }

    public void A2S(int i2) {
        ContactPickerFragment contactPickerFragment = this.A1L;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1V(i2);
        }
    }

    public boolean A34() {
        return false;
    }

    public final Rational A39() {
        int width;
        int height;
        if (this.A1x) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            width = displayMetrics.widthPixels;
            height = displayMetrics.heightPixels;
        } else {
            CallInfo A3B = A3B();
            if (Voip.A08(A3B)) {
                Iterator it = this.A1h.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C616839w r2 = (C616839w) it.next();
                    VideoCallParticipantView videoCallParticipantView = r2.A00;
                    if (videoCallParticipantView != null && videoCallParticipantView.A03 == 0) {
                        Map map = A3B.participants;
                        UserJid userJid = r2.A04;
                        C32001fU r0 = (C32001fU) map.get(userJid);
                        if (r0 != null && r0.A0H) {
                            C32001fU infoByJid = A3B.getInfoByJid(userJid);
                            AnonymousClass00B.A06(infoByJid);
                            Point A012 = r2.A01(infoByJid);
                            if (A012 != null) {
                                width = A012.x;
                                height = A012.y;
                            }
                        }
                    }
                }
            }
            width = this.A17.getWidth();
            height = this.A17.getHeight();
        }
        Rational rational = new Rational(width, height);
        Rational rational2 = new Rational(100, 239);
        Rational rational3 = new Rational(239, 100);
        if (rational.compareTo(rational2) < 0) {
            StringBuilder sb = new StringBuilder("voip/VoipActivityV2/aspect ratio too small ");
            sb.append(rational);
            Log.w(sb.toString());
            rational = rational2;
        }
        if (rational.compareTo(rational3) <= 0) {
            return rational;
        }
        StringBuilder sb2 = new StringBuilder("voip/VoipActivityV2/aspect ratio too large ");
        sb2.append(rational);
        Log.w(sb2.toString());
        return rational3;
    }

    public final C616839w A3A(UserJid userJid) {
        C616839w r1 = (C616839w) this.A1h.get(userJid);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass2zT r12 = new AnonymousClass2zT(this.A17, userJid, this);
        this.A1h.put(userJid, r12);
        return r12;
    }

    public final CallInfo A3B() {
        if (!C32601gl.A04(this.A01, this.A0C) || !Voip.A07()) {
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null) {
                return null;
            }
            String str = this.A1g;
            return (str == null || !str.equals(callInfo.callWaitingInfo.A04)) ? callInfo : CallInfo.convertCallWaitingInfoToCallInfo(callInfo);
        }
        CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
        if (callLinkInfo != null) {
            return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
        }
        return null;
    }

    public final CallState A3C(CallInfo callInfo) {
        CallState callState = callInfo.callState;
        if (Voip.A09(callState) && this.A1k) {
            return CallState.ACCEPT_SENT;
        }
        if (!callInfo.hasOutgoingParticipantInActiveOneToOneCall()) {
            return callState;
        }
        C32001fU defaultPeerInfo = callInfo.getDefaultPeerInfo();
        AnonymousClass00B.A06(defaultPeerInfo);
        return defaultPeerInfo.A01 == 2 ? CallState.CALLING : callInfo.getDefaultPeerInfo().A01 == 3 ? CallState.PRE_ACCEPT_RECEIVED : callState;
    }

    public final String A3D(C32001fU r7, CallInfo callInfo) {
        int i2;
        if (!this.A20 || CallGridViewModel.A01(r7) == 0) {
            String A0C2 = this.A1H.A0C(this.A1E.A0A(r7.A07));
            if (!r7.A0G && callInfo.callState == CallState.ACTIVE) {
                int i3 = r7.A05;
                if (i3 == 3) {
                    return getString(R.string.str1b0e, new Object[]{A0C2});
                }
                if (callInfo.isGroupCall) {
                    int i4 = r7.A01;
                    i2 = R.string.str037d;
                    if (i4 != 2) {
                        if (i4 == 3) {
                            i2 = R.string.str147a;
                        }
                    }
                    return getString(i2);
                }
                C32001fU r0 = callInfo.self;
                if ((r0 == null || !r0.A0A) && !r7.A0A) {
                    if (r7.A0E) {
                        i2 = R.string.str1b0c;
                    } else if (callInfo.videoEnabled && i3 != 6 && !r7.A0L && i3 != 2) {
                        i2 = R.string.str1a8e;
                    }
                    return getString(i2);
                }
                i2 = R.string.str1afd;
                return getString(i2);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r8.getConnectedParticipantsCount() == 2) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r7.A0D != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A3E(X.C32001fU r7, com.whatsapp.voipcalling.CallInfo r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.A20
            r5 = 0
            if (r0 == 0) goto L_0x000c
            int r0 = com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel.A01(r7)
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            return r5
        L_0x000c:
            com.whatsapp.jid.UserJid r2 = r7.A07
            X.0sP r1 = r6.A1H
            X.0sG r0 = r6.A1E
            X.0sH r0 = r0.A0A(r2)
            java.lang.String r4 = r1.A0C(r0)
            boolean r0 = r8.videoEnabled
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0032
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x000b
        L_0x0024:
            if (r9 == 0) goto L_0x0076
            r1 = 2131892992(0x7f121b00, float:1.9420748E38)
        L_0x0029:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r4
            java.lang.String r0 = r6.getString(r1, r0)
            return r0
        L_0x0032:
            int r1 = r7.A05
            r0 = 6
            if (r1 != r0) goto L_0x004b
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x0045
            boolean r0 = r8.isGroupCall
            if (r0 != 0) goto L_0x0045
            if (r9 == 0) goto L_0x008f
            r1 = 2131892993(0x7f121b01, float:1.942075E38)
            goto L_0x0029
        L_0x0045:
            if (r9 == 0) goto L_0x007a
            r1 = 2131892998(0x7f121b06, float:1.942076E38)
            goto L_0x0029
        L_0x004b:
            r0 = 2
            if (r1 != r0) goto L_0x0062
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x005c
            boolean r0 = r8.isGroupCall
            if (r0 != 0) goto L_0x005c
            if (r9 == 0) goto L_0x007e
            r1 = 2131892994(0x7f121b02, float:1.9420752E38)
            goto L_0x0029
        L_0x005c:
            if (r9 == 0) goto L_0x0082
            r1 = 2131892997(0x7f121b05, float:1.9420758E38)
            goto L_0x0029
        L_0x0062:
            boolean r0 = r7.A0J
            if (r0 != 0) goto L_0x0086
            boolean r0 = r7.A0I
            if (r0 != 0) goto L_0x0086
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x000b
            int r1 = r8.getConnectedParticipantsCount()
            r0 = 2
            if (r1 != r0) goto L_0x000b
            goto L_0x0024
        L_0x0076:
            r0 = 2131893000(0x7f121b08, float:1.9420764E38)
            goto L_0x0092
        L_0x007a:
            r0 = 2131893003(0x7f121b0b, float:1.942077E38)
            goto L_0x0092
        L_0x007e:
            r0 = 2131892995(0x7f121b03, float:1.9420754E38)
            goto L_0x0092
        L_0x0082:
            r0 = 2131893002(0x7f121b0a, float:1.9420768E38)
            goto L_0x0092
        L_0x0086:
            r0 = 2131890921(0x7f1212e9, float:1.9416547E38)
            if (r9 == 0) goto L_0x0092
            r0 = 2131892669(0x7f1219bd, float:1.9420093E38)
            goto L_0x0092
        L_0x008f:
            r0 = 2131893001(0x7f121b09, float:1.9420766E38)
        L_0x0092:
            java.lang.String r0 = r6.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3E(X.1fU, com.whatsapp.voipcalling.CallInfo, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r7 != 10) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r0.A2p == 7) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A3F(com.whatsapp.jid.UserJid r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            r1 = 2131892879(0x7f121a8f, float:1.9420519E38)
            if (r7 == r0) goto L_0x0031
            r0 = 17
            if (r7 == r0) goto L_0x002e
            r0 = 25
            if (r7 == r0) goto L_0x0021
            r0 = 4
            r1 = 2131892979(0x7f121af3, float:1.9420722E38)
            if (r7 == r0) goto L_0x0031
            r0 = 5
            if (r7 == r0) goto L_0x0036
            r0 = 9
            r2 = 0
            if (r7 == r0) goto L_0x0025
            r0 = 10
            if (r7 == r0) goto L_0x0021
        L_0x0020:
            return r2
        L_0x0021:
            r1 = 2131892860(0x7f121a7c, float:1.942048E38)
            goto L_0x0031
        L_0x0025:
            X.25g r0 = r5.A12
            if (r0 == 0) goto L_0x0020
            int r1 = r0.A2p
            r0 = 7
            if (r1 != r0) goto L_0x0020
        L_0x002e:
            r1 = 2131893012(0x7f121b14, float:1.9420789E38)
        L_0x0031:
            java.lang.String r0 = r5.getString(r1)
            return r0
        L_0x0036:
            r4 = 2131890582(0x7f121196, float:1.941586E38)
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            X.0sP r1 = r5.A1H
            X.0sG r0 = r5.A1E
            X.0sH r0 = r0.A0A(r6)
            java.lang.String r0 = r1.A08(r0)
            r3[r2] = r0
            java.lang.String r0 = r5.getString(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3F(com.whatsapp.jid.UserJid, int):java.lang.String");
    }

    public void A3G() {
        DialogFragment dialogFragment = this.A0g;
        if (dialogFragment != null) {
            dialogFragment.A1D();
            this.A0g = null;
            this.A1f = null;
        }
        DialogFragment dialogFragment2 = (DialogFragment) AGM().A0B(VoipErrorDialogFragment.class.getName());
        if (dialogFragment2 != null) {
            dialogFragment2.A1D();
        }
    }

    public void A3H() {
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/showCallFailedMessage");
        sb.append(this.A1f);
        Log.i(sb.toString());
        if (this.A1f != null) {
            A3G();
            DialogFragment A012 = MessageDialogFragment.A01(this.A1f);
            this.A0g = A012;
            A012.A1G(AGM(), (String) null);
            return;
        }
        AnonymousClass00B.A08("call failed message not defined");
    }

    public final void A3I() {
        this.A0Z.setText("");
        this.A0O.setVisibility(8);
    }

    public final void A3J() {
        boolean z2 = false;
        if (this.A1L != null) {
            z2 = true;
        }
        AnonymousClass00B.A0B("contact picker fragment should not be null", z2);
        ContactPickerFragment contactPickerFragment = this.A1L;
        if (contactPickerFragment != null) {
            AnonymousClass267 r0 = contactPickerFragment.A0R;
            if (r0 != null) {
                r0.A05(false);
            }
            this.A1L = null;
            A3P();
            A2e("VoipContactPickerDialogFragment");
        }
    }

    public final void A3K() {
        AnonymousClass01A A0B2 = AGM().A0B("permission_request");
        if (A0B2 != null) {
            AnonymousClass050 r0 = new AnonymousClass050(AGM());
            r0.A07(A0B2);
            r0.A04();
        }
    }

    public final void A3L() {
        Log.i("voip/VoipActivityV2/call/end");
        C447225g r2 = this.A12;
        if (r2 != null) {
            r2.A0n((CallInfo) null, (String) null, 1);
        }
        this.A1o = true;
    }

    public final void A3M() {
        if (this.A0J != null) {
            Log.i("voip/VoipActivityV2/hideAnswerCallView");
            View view = this.A0J;
            if (view != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(125);
                alphaAnimation.setStartOffset((long) 0);
                alphaAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(view, 5));
                view.startAnimation(alphaAnimation);
            }
        }
    }

    public final void A3N() {
        AnonymousClass2Tr r1;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1d;
        if (voipCallControlBottomSheetV2 != null && (r1 = voipCallControlBottomSheetV2.A0H) != null && r1.A0F.A0J) {
            r1.A02(5);
            voipCallControlBottomSheetV2.A1M();
        }
    }

    public final void A3O() {
        Log.i("voip/VoipActivityV2/hideInCallControls");
        this.A23 = false;
        this.A0R.setVisibility(8);
        this.A0R.setTranslationY(0.0f);
        this.A0O.setVisibility(8);
        A2e("CallControlSheet");
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A17;
        for (int i2 = 0; i2 < videoCallParticipantViewLayout.A01; i2++) {
            videoCallParticipantViewLayout.A01(i2).A01();
            videoCallParticipantViewLayout.A01(i2).A07(false, false);
        }
    }

    public final void A3P() {
        if (this.A1v) {
            ContactPickerFragment contactPickerFragment = this.A1L;
            if (contactPickerFragment == null || contactPickerFragment.A0g) {
                this.A0B.A01(this.A0Q);
            }
        }
    }

    public final void A3Q() {
        Dialog dialog;
        if (this.A1L != null) {
            Log.i("contact picker is already shown, ignore new events");
            return;
        }
        CallInfo A3B = A3B();
        if (A3B != null) {
            Map map = A3B.participants;
            KeyguardManager A072 = this.A08.A07();
            if (A072 != null && (A072.isKeyguardLocked() || A072.inKeyguardRestrictedInputMode())) {
                getWindow().clearFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1d;
                if (!(voipCallControlBottomSheetV2 == null || (dialog = voipCallControlBottomSheetV2.A03) == null || dialog.getWindow() == null)) {
                    voipCallControlBottomSheetV2.A03.getWindow().clearFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                }
            }
            VoipContactPickerDialogFragment A012 = VoipContactPickerDialogFragment.A01(A02(this, A3B.callLinkToken, A3B.videoEnabled), map, A3B.videoEnabled);
            this.A1L = A012.A00;
            Afb(A012, "VoipContactPickerDialogFragment");
        }
    }

    public final void A3R() {
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1d;
        if (voipCallControlBottomSheetV2 != null && voipCallControlBottomSheetV2.A0c()) {
            voipCallControlBottomSheetV2.A1D();
        }
        this.A1d = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3S() {
        /*
            r4 = this;
            com.whatsapp.voipcalling.CallInfo r2 = r4.A3B()
            if (r2 == 0) goto L_0x0048
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0048
            boolean r0 = r4.A23
            if (r0 == 0) goto L_0x0048
            boolean r0 = r4.A1z
            if (r0 == 0) goto L_0x0048
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0048
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x0048
            java.util.Map r0 = r2.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x0026:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r2.next()
            X.1fU r1 = (X.C32001fU) r1
            boolean r0 = r1.A0L
            if (r0 != 0) goto L_0x003b
            int r1 = r1.A05
            r0 = 6
            if (r1 != r0) goto L_0x0026
        L_0x003b:
            android.os.Handler r0 = r4.A0F
            r3 = 3
            r0.removeMessages(r3)
            android.os.Handler r2 = r4.A0F
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.sendEmptyMessageDelayed(r3, r0)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3S():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r2.videoEnabled == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3T() {
        /*
            r4 = this;
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1d
            if (r0 != 0) goto L_0x0056
            com.whatsapp.voipcalling.CallInfo r2 = r4.A3B()
            if (r2 == 0) goto L_0x000f
            boolean r1 = r2.videoEnabled
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A02(r0)
            r4.A1d = r0
            android.view.View r1 = r4.A0R
            r0 = 0
            r1.setTranslationY(r0)
            if (r2 == 0) goto L_0x0056
            boolean r0 = r2.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r2.isGroupCall
            if (r0 != 0) goto L_0x0030
            com.whatsapp.voipcalling.CallState r0 = r2.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r0)
            if (r0 != 0) goto L_0x0056
        L_0x0030:
            r4.A3U()
            com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner r3 = r4.A0s
            if (r3 == 0) goto L_0x0053
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            java.lang.String r0 = "VoipCallNewParticipantBanner/resetBannerYPosition"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165477(0x7f070125, float:1.7945172E38)
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            r2.bottomMargin = r0
            r3.setLayoutParams(r2)
        L_0x0053:
            r4.A3M()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3T():void");
    }

    public final void A3U() {
        if (this.A1d != null && !isFinishing()) {
            this.A1d.A1G(AGM(), "CallControlSheet");
        }
    }

    public final void A3V() {
        Log.i("voip/VoipActivityV2/showInCallControls");
        this.A23 = true;
        if (this.A1d != null) {
            A3U();
            A3a();
            VoipInCallNotifBanner voipInCallNotifBanner = this.A0s;
            if (voipInCallNotifBanner != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) voipInCallNotifBanner.getLayoutParams();
                Log.i("VoipCallNewParticipantBanner/resetBannerYPosition");
                marginLayoutParams.bottomMargin = (int) voipInCallNotifBanner.getResources().getDimension(R.dimen.dimen0125);
                voipInCallNotifBanner.setLayoutParams(marginLayoutParams);
            }
        }
        this.A0R.setVisibility(0);
        this.A0R.setTranslationY(0.0f);
        if (this.A0Z.length() > 0) {
            this.A0O.setVisibility(0);
        }
    }

    public final void A3W() {
        if (this.A20) {
            CallGridViewModel callGridViewModel = this.A0t;
            AnonymousClass00B.A06(callGridViewModel);
            callGridViewModel.A0D.A09((VideoPort) null);
            return;
        }
        this.A1e.removeCameraErrorListener(this.A2A);
        this.A0F.removeMessages(6);
        Voip.setVideoPreviewPort((VideoPort) null);
        Voip.setVideoPreviewSize(0, 0);
    }

    public final void A3X() {
        Log.i("VoipActivityV2 vm unbindService");
        try {
            this.A13.A00.obtainMessage(5, this).sendToTarget();
        } catch (IllegalArgumentException e2) {
            Log.e((Throwable) e2);
        }
        C447225g r0 = this.A12;
        if (r0 != null) {
            r0.A0b(this);
            this.A12.A0T = null;
            this.A12 = null;
        }
    }

    public final void A3Y() {
        Rect rect;
        AnonymousClass2OJ r0;
        CallInfo A3B = A3B();
        if (this.A0t != null && A3B != null) {
            if (this.A1u || (!this.A1t && A3B.videoEnabled && this.A1x && A3B.getConnectedParticipantsCount() <= 2)) {
                CallGridViewModel callGridViewModel = this.A0t;
                rect = new Rect(0, 0, 0, 0);
                if (!C34901l3.A00(callGridViewModel.A01, rect)) {
                    callGridViewModel.A01 = rect;
                    r0 = callGridViewModel.A0T;
                } else {
                    return;
                }
            } else {
                int i2 = this.A1t ? 0 : this.A03;
                CallGridViewModel callGridViewModel2 = this.A0t;
                rect = new Rect(0, this.A04, 0, i2);
                if (!C34901l3.A00(callGridViewModel2.A01, rect)) {
                    callGridViewModel2.A01 = rect;
                    r0 = callGridViewModel2.A0T;
                } else {
                    return;
                }
            }
            r0.A0B(rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        if (r0 == 1) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r11.A20 != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r11.A1k != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025c, code lost:
        if (com.whatsapp.voipcalling.Voip.A09(r4.callState) == false) goto L_0x025e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3Z() {
        /*
            r11 = this;
            X.AnonymousClass00B.A01()
            com.whatsapp.voipcalling.CallInfo r4 = r11.A3B()
            if (r4 == 0) goto L_0x02a0
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x02a0
            com.whatsapp.voipcalling.CallState r6 = r11.A3C(r4)
            boolean r0 = r4.isEitherSideRequestingUpgrade()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r11.A1k
            r10 = 1
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r10 = 0
        L_0x0021:
            boolean r0 = r4.videoEnabled
            r1 = 21
            r5 = 8
            if (r0 == 0) goto L_0x015e
            boolean r0 = X.AnonymousClass49O.A00
            r0 = r0 ^ 1
            r11.A1n = r0
            r0 = 2131893013(0x7f121b15, float:1.942079E38)
            r11.setTitle(r0)
            java.lang.String r0 = r11.getString(r0)
            r11.A3v(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x005d
            android.view.Window r1 = r11.getWindow()
            r0 = 2131101586(0x7f060792, float:1.7815586E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            android.view.Window r1 = r11.getWindow()
            r0 = 2131099794(0x7f060092, float:1.7811951E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            int r0 = com.obwhatsapp.yo.yo.getUniversalColor()
            r1.setNavigationBarColor(r0)
        L_0x005d:
            android.view.View r0 = r11.A0M
            r0.setBackgroundResource(r2)
            com.obwhatsapp.WaImageView r0 = r11.A0j
            if (r0 == 0) goto L_0x0069
            r0.setVisibility(r5)
        L_0x0069:
            r11.A3p(r4)
            com.obwhatsapp.calling.CallDetailsLayout r9 = r11.A0l
            boolean r8 = r9.A07(r4)
            int r0 = r11.A01
            if (r0 == 0) goto L_0x0079
            r7 = 0
            if (r0 != r3) goto L_0x007a
        L_0x0079:
            r7 = 1
        L_0x007a:
            boolean r0 = r4.isInLonelyState()
            if (r0 == 0) goto L_0x0085
            boolean r1 = r11.A20
            r0 = 1
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            r9.A04(r6, r8, r7, r0)
            r0 = 2131366915(0x7f0a1403, float:1.8353737E38)
            android.view.View r1 = r11.findViewById(r0)
            if (r10 != 0) goto L_0x009e
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 != r0) goto L_0x009e
            boolean r0 = r4.isInLonelyState()
            if (r0 != 0) goto L_0x009e
            r2 = 8
        L_0x009e:
            r1.setVisibility(r2)
            X.0rz r6 = r11.A09
            X.0pd r2 = r11.A0C
            int r1 = r4.getConnectedParticipantsCount()
            X.01J r0 = r11.A1i
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r2 = X.C30341cC.A0N(r6, r2, r1, r0)
            boolean r0 = r11.A20
            if (r2 == r0) goto L_0x0236
            r11.A20 = r2
            java.lang.String r1 = "VoipActivityV2/maybeToggleCallGrids/useNewGrid "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r4.videoEnabled
            r11.A3x(r0)
            boolean r0 = r11.A20
            r6 = 0
            if (r0 == 0) goto L_0x0115
            com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment r0 = r11.A15
            if (r0 == 0) goto L_0x00e1
            r0.A1O(r6)
        L_0x00e1:
            r11.A3Y()
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = r11.A0p
            X.AnonymousClass00B.A04(r0)
            r0.setVisibility(r6)
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r11.A17
            r0.setVisibility(r5)
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r11.A17
            r0.A05(r6, r6)
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r11.A17
            r0.setIsEnabled(r6)
            java.util.Map r0 = r11.A1h
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0105:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0225
            java.lang.Object r0 = r1.next()
            X.39w r0 = (X.C616839w) r0
            r0.A05()
            goto L_0x0105
        L_0x0115:
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r11.A0t
            if (r0 == 0) goto L_0x012d
            r0.A0I(r6)
            X.0pd r2 = r11.A0C
            r1 = 2222(0x8ae, float:3.114E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x012d
            X.1Pf r0 = r11.A19
            r0.A01()
        L_0x012d:
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = r11.A0p
            if (r0 == 0) goto L_0x0134
            r0.setVisibility(r5)
        L_0x0134:
            X.0sK r0 = r11.A01
            r0.A0B()
            X.1ZT r5 = r0.A05
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r2 = r11.A17
            java.lang.String r0 = "preview"
            X.2zS r1 = new X.2zS
            r1.<init>(r2, r5, r11, r0)
            r11.A18 = r1
            java.util.Map r0 = r11.A1h
            r0.put(r5, r1)
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r11.A17
            r0.setIsEnabled(r3)
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r11.A17
            r0.setVisibility(r6)
            X.1fU r1 = r4.self
            X.39w r0 = r11.A18
            r11.A3k(r1, r0)
            goto L_0x0231
        L_0x015e:
            r0 = 2131892841(0x7f121a69, float:1.9420442E38)
            r11.setTitle(r0)
            java.lang.String r0 = r11.getString(r0)
            r11.A3v(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x018c
            android.view.Window r1 = r11.getWindow()
            r0 = 2131101586(0x7f060792, float:1.7815586E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            android.view.Window r1 = r11.getWindow()
            r0 = 2131101666(0x7f0607e2, float:1.7815748E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            int r0 = com.obwhatsapp.yo.yo.getUniversalColor()
            r1.setNavigationBarColor(r0)
        L_0x018c:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r11.A1d
            if (r0 != 0) goto L_0x01aa
            android.view.Window r0 = r11.getWindow()
            android.view.View r1 = r0.getDecorView()
            int r0 = r1.getSystemUiVisibility()
            r0 = r0 & -5
            r1.setSystemUiVisibility(r0)
            android.view.Window r1 = r11.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r1.clearFlags(r0)
        L_0x01aa:
            r11.A3p(r4)
            r11.A3I()
            com.obwhatsapp.calling.CallDetailsLayout r1 = r11.A0l
            boolean r0 = r1.A07(r4)
            r1.A03(r6, r0, r2)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 == r0) goto L_0x0221
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r6 == r0) goto L_0x0221
            int r0 = r1.A01
            r1.setBackgroundColor(r0)
            r1.setVisibility(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            X.1cU r0 = r1.A07
            com.obwhatsapp.TextEmojiLabel r0 = r0.A02
            r0.setVisibility(r2)
            android.widget.TextView r0 = r1.A04
            r0.setVisibility(r2)
        L_0x01da:
            r0 = 2131366915(0x7f0a1403, float:1.8353737E38)
            android.view.View r0 = r11.findViewById(r0)
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r11.A0V
            r0.setVisibility(r5)
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = r11.A0p
            X.AnonymousClass00B.A04(r0)
            r0.setVisibility(r2)
            android.view.View r1 = r11.A0R
            r0 = 2131101586(0x7f060792, float:1.7815586E38)
            r1.setBackgroundResource(r0)
            android.view.View r1 = r11.A0M
            r0 = 2131101667(0x7f0607e3, float:1.781575E38)
            int r0 = com.obwhatsapp.yo.yo.getUniversalColor()
            r1.setBackgroundColor(r0)
            com.obwhatsapp.WaImageView r0 = r11.A0j
            if (r0 == 0) goto L_0x020c
            r0.setVisibility(r2)
        L_0x020c:
            r11.A23 = r3
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r11.A1d
            if (r0 == 0) goto L_0x0219
            com.obwhatsapp.calling.views.VoipCallFooter r0 = r0.A0P
            if (r0 == 0) goto L_0x0219
            r0.A00()
        L_0x0219:
            boolean r0 = r11.A20
            if (r0 != 0) goto L_0x0251
            r11.A3t(r4)
            goto L_0x0251
        L_0x0221:
            r1.setVisibility(r5)
            goto L_0x01da
        L_0x0225:
            java.util.Map r0 = r11.A1h
            r0.clear()
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r11.A0t
            if (r0 == 0) goto L_0x0231
            r0.A0I(r3)
        L_0x0231:
            int r0 = r11.A01
            r11.A3h(r0, r3)
        L_0x0236:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r11.A1d
            if (r0 == 0) goto L_0x0241
            com.obwhatsapp.calling.views.VoipCallFooter r0 = r0.A0P
            if (r0 == 0) goto L_0x0241
            r0.A01()
        L_0x0241:
            boolean r0 = r11.A20
            if (r0 != 0) goto L_0x0251
            android.view.View r2 = r11.A0M
            r1 = 31
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9
            r0.<init>(r11, r1, r4)
            r2.post(r0)
        L_0x0251:
            boolean r0 = r4.isCaller
            if (r0 != 0) goto L_0x025e
            com.whatsapp.voipcalling.CallState r0 = r4.callState
            boolean r1 = com.whatsapp.voipcalling.Voip.A09(r0)
            r0 = 1
            if (r1 != 0) goto L_0x025f
        L_0x025e:
            r0 = 0
        L_0x025f:
            r2 = 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0273
            boolean r1 = com.whatsapp.voipcalling.Voip.A08(r4)
            if (r1 == 0) goto L_0x028d
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x0273
            boolean r0 = X.C41971wz.A07()
            if (r0 == 0) goto L_0x028d
        L_0x0273:
            android.view.Window r0 = r11.getWindow()
            r0.addFlags(r2)
        L_0x027a:
            X.01J r0 = r11.A1i
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0289
            r3 = 2
        L_0x0289:
            r11.setRequestedOrientation(r3)
            return
        L_0x028d:
            if (r1 == 0) goto L_0x0298
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x0298
            boolean r0 = r4.isGroupCall
            if (r0 == 0) goto L_0x0298
            goto L_0x0273
        L_0x0298:
            android.view.Window r0 = r11.getWindow()
            r0.clearFlags(r2)
            goto L_0x027a
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3Z():void");
    }

    public final void A3a() {
        CallInfo A3B = A3B();
        if (!A0u(A3B)) {
            return;
        }
        if (this.A20) {
            A3b();
            return;
        }
        for (C616839w r2 : this.A1h.values()) {
            VideoCallParticipantView videoCallParticipantView = r2.A00;
            if (videoCallParticipantView != null && videoCallParticipantView.A03 == 1) {
                A3b();
                C32001fU infoByJid = A3B.getInfoByJid(r2.A04);
                r2.A07(infoByJid);
                r2.A09(infoByJid, A3B);
                return;
            }
        }
    }

    public final void A3b() {
        float f2;
        if (this.A20) {
            this.A0r.A00();
            return;
        }
        int i2 = this.A04;
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A17;
        if (this.A1u) {
            f2 = 0.4f;
            if (this.A1x) {
                f2 = 0.3f;
            }
        } else {
            f2 = 0.225f;
        }
        videoCallParticipantViewLayout.A00 = f2;
        boolean z2 = this.A23;
        videoCallParticipantViewLayout.A02 = (!z2 || this.A1d == null) ? 0 : this.A02;
        if (!z2) {
            i2 = 0;
        }
        videoCallParticipantViewLayout.A04 = i2;
    }

    public final void A3c() {
        if (!this.A1l) {
            AnonymousClass2OJ r1 = this.A0o.A04;
            if (!(r1.A01() instanceof C72893ms) && !(r1.A01() instanceof C72883mr)) {
                Voip.startVideoCaptureStream();
                return;
            }
        }
        Voip.stopVideoCaptureStream();
    }

    public final void A3d(float f2) {
        CallGrid callGrid;
        if (f2 <= 0.0f && (callGrid = this.A0p) != null && callGrid.getHeight() != 0) {
            this.A00 = f2;
            if (this.A1t) {
                f2 = -1.0f;
            }
            float f3 = f2 + 1.0f;
            float height = 1.0f - ((((float) (this.A07 + this.A02)) / ((float) this.A0p.getHeight())) * f3);
            this.A0p.setScaleY(height);
            this.A0p.setScaleX(height);
            this.A0p.setTranslationY(f3 * (((float) (this.A07 - this.A02)) / 2.0f));
        }
    }

    public final void A3e(int i2) {
        int i3;
        Log.i("voip/VoipActivityV2/call/accept");
        CallInfo A3B = A3B();
        if (A3B != null && A3B.callState != CallState.NONE) {
            if (!this.A1k) {
                A3M();
                A3U();
            } else {
                Log.w("callAccepted is true when calling acceptCall()");
            }
            boolean z2 = true;
            this.A1k = true;
            if (this.A12 != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    boolean z3 = false;
                    if (this.A1P.A00.A00.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                        z3 = true;
                    }
                    boolean z4 = !z3;
                    if (!A3B.videoEnabled || this.A1P.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") == 0) {
                        z2 = false;
                    }
                    if (z4 || z2) {
                        StringBuilder sb = new StringBuilder("voip/service/accept noRecordPermission = ");
                        sb.append(z4);
                        sb.append(", noCameraPermission = ");
                        sb.append(z2);
                        Log.w(sb.toString());
                        if (z2) {
                            i3 = R.string.str038d;
                            if (z4) {
                                i3 = R.string.str038e;
                            }
                        } else {
                            i3 = R.string.str0393;
                        }
                        this.A12.A0W(30, getString(i3));
                        return;
                    }
                }
                this.A12.A0K();
                UserJid peerJid = A3B.getPeerJid();
                AnonymousClass00B.A06(peerJid);
                boolean z5 = A3B.videoEnabled;
                int i4 = -1;
                if (A3B.isPeerRequestingUpgrade()) {
                    i4 = 2;
                }
                if (!A42(peerJid, i4, z5)) {
                    return;
                }
                if (Voip.A09(A3B.callState)) {
                    this.A12.A0X(i2, this.A1g, false);
                } else if (A3B.isPeerRequestingUpgrade()) {
                    C447225g r3 = this.A12;
                    r3.A0V();
                    r3.A2f.setRequestedCamera2SupportLevel(r3.A1j.A02(), r3.A1i);
                    r3.A14.execute(new RunnableRunnableShape0S0000000_I0(3));
                }
            } else {
                Log.e("voip/VoipActivityV2/call/accept voiceService is null");
            }
        }
    }

    public final void A3f(int i2) {
        Log.i("voip/VoipActivityV2/call/reject");
        CallInfo A3B = A3B();
        if (A3B != null && A3B.callState != CallState.NONE) {
            A3M();
            C447225g r2 = this.A12;
            if (r2 == null) {
                return;
            }
            if (Voip.A09(A3B.callState)) {
                r2.A0w(A3B.callId, (String) null, i2);
            } else if (A3B.isPeerRequestingUpgrade()) {
                this.A12.A14.execute(new RunnableRunnableShape0S0001000_I0(0, 3));
            }
        }
    }

    public final void A3g(int i2, int i3) {
        VideoCallParticipantView videoCallParticipantView;
        CallGridViewModel callGridViewModel;
        C32001fU r0;
        VoipCallFooter voipCallFooter;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1d;
        if (!(voipCallControlBottomSheetV2 == null || (voipCallFooter = voipCallControlBottomSheetV2.A0P) == null)) {
            float f2 = (float) i3;
            voipCallFooter.A03.setRotation(f2);
            voipCallFooter.A06.setRotation(f2);
            voipCallFooter.A05.setRotation(f2);
            voipCallFooter.A07.setRotation(f2);
            voipCallFooter.A04.setRotation(f2);
        }
        float f3 = (float) i3;
        this.A0S.setRotation(f3);
        this.A0T.setRotation(f3);
        this.A0O.setRotation(f3);
        if (!this.A20 || (callGridViewModel = this.A0t) == null) {
            VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A17;
            for (int i4 = 0; i4 < videoCallParticipantViewLayout.A01; i4++) {
                VideoCallParticipantView A012 = videoCallParticipantViewLayout.A01(i4);
                A012.A0C.setRotation(f3);
                A012.A0I.setRotation(f3);
                A012.A0G.setRotation(f3);
            }
        } else {
            callGridViewModel.A00 = i2;
            if (!(callGridViewModel.A02 == null || (r0 = (C32001fU) callGridViewModel.A0D.A04().A01.get(callGridViewModel.A02)) == null)) {
                callGridViewModel.A0C(r0);
            }
            LinkedHashMap linkedHashMap = callGridViewModel.A0a;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                AnonymousClass3AO r1 = new AnonymousClass3AO((C37921px) entry.getValue());
                r1.A02 = callGridViewModel.A00 * -90;
                linkedHashMap.put(entry.getKey(), r1.A00());
            }
            callGridViewModel.A09();
        }
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A15;
        if (maximizedParticipantVideoDialogFragment != null && (videoCallParticipantView = maximizedParticipantVideoDialogFragment.A07) != null) {
            videoCallParticipantView.A0C.setRotation(f3);
            videoCallParticipantView.A0I.setRotation(f3);
            videoCallParticipantView.A0G.setRotation(f3);
        }
    }

    public final void A3h(int i2, boolean z2) {
        CallGridViewModel callGridViewModel;
        AnonymousClass2OJ r1;
        Boolean bool;
        if (z2 || this.A01 != i2) {
            this.A01 = i2;
            this.A0z.AUk();
            if (this.A20 && (callGridViewModel = this.A0t) != null) {
                boolean z3 = false;
                if (i2 == 1) {
                    z3 = true;
                }
                callGridViewModel.A04 = z3;
                AnonymousClass027 r3 = callGridViewModel.A0C;
                Object A012 = r3.A01();
                AnonymousClass00B.A06(A012);
                C50032Xj r2 = (C50032Xj) A012;
                boolean z4 = callGridViewModel.A04;
                r2.A06 = z4;
                float f2 = 0.225f;
                if (z4) {
                    f2 = 0.33f;
                }
                r2.A00 = f2;
                r3.A0B(r2);
                callGridViewModel.A08();
                callGridViewModel.A0A();
                if (i2 == 0) {
                    r1 = callGridViewModel.A0P;
                    bool = Boolean.FALSE;
                } else {
                    r1 = callGridViewModel.A0P;
                    if (i2 == 2) {
                        bool = Boolean.TRUE;
                    } else {
                        r1.A0B(Boolean.valueOf(true ^ callGridViewModel.A04));
                        Rect rect = callGridViewModel.A01;
                        if (rect != null) {
                            callGridViewModel.A0T.A0B(rect);
                        }
                        callGridViewModel.A0E(callGridViewModel.A0D.A04(), false);
                    }
                }
                r1.A0B(bool);
            }
            InCallBannerViewModel inCallBannerViewModel = this.A0u;
            if (inCallBannerViewModel != null) {
                boolean z5 = false;
                if (i2 != 3) {
                    z5 = true;
                }
                inCallBannerViewModel.A00 = z5;
                inCallBannerViewModel.A06.A0B(Boolean.valueOf(z5));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r1.A04.equals(r3) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3i(android.content.Intent r5, com.whatsapp.voipcalling.CallInfo r6) {
        /*
            r4 = this;
            java.lang.String r1 = "com.obwhatsapp.intent.action.ACCEPT_CALL"
            java.lang.String r0 = r5.getAction()
            boolean r1 = r1.equals(r0)
            java.lang.String r0 = "should only be called if intent action is ACTION_ACCEPT_INCOMING_CALL"
            X.AnonymousClass00B.A0B(r0, r1)
            java.lang.String r0 = "call_id"
            java.lang.String r3 = r5.getStringExtra(r0)
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r6)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r6.callId
            boolean r0 = r0.equals(r3)
            r2 = 1
            if (r0 != 0) goto L_0x0033
            X.1fV r1 = r6.callWaitingInfo
            int r0 = r1.A01
            if (r0 != r2) goto L_0x0045
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0045
        L_0x0033:
            r4.A1k = r2
            r1 = 0
            r4.A05 = r1
            X.25g r0 = r4.A12
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "call_ui_action"
            int r0 = r5.getIntExtra(r0, r1)
            r4.A3e(r0)
        L_0x0045:
            com.whatsapp.jid.GroupJid r2 = r6.groupJid
            if (r2 != 0) goto L_0x004f
            com.whatsapp.jid.UserJid r2 = r6.getCreatorJid()
            if (r2 == 0) goto L_0x0055
        L_0x004f:
            X.15I r1 = r4.A1M
            r0 = 5
            r1.A09(r2, r0)
        L_0x0055:
            return
        L_0x0056:
            r4.A1j = r2
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3i(android.content.Intent, com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A3j(Intent intent, CallInfo callInfo) {
        AnonymousClass00B.A0B("should only be called if intent action is ACTION_SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL", "com.obwhatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL".equals(intent.getAction()));
        if (callInfo.callState == CallState.ACTIVE) {
            NonActivityDismissDialogFragment.A01(intent.getStringExtra("alertMessage"), false).A1G(AGM(), "VoipAlertDialog");
            return;
        }
        Log.i("voip/VoipActivityV2/new-intent call is gone, ignore the request to show alert message");
        finish();
    }

    public final void A3k(C32001fU r6, C616839w r7) {
        if (!this.A20) {
            this.A0F.removeMessages(6);
            CallInfo A3B = A3B();
            if (A3B == null) {
                return;
            }
            if ((A3B.callState != CallState.RECEIVED_CALL || !this.A24) && this.A1z && this.A1P.A03("android.permission.CAMERA") == 0) {
                StringBuilder sb = new StringBuilder("voip/VoipActivityV2/startCameraPreview/setting preview surface to presenter ");
                sb.append(r7.A07);
                sb.append(" retry: ");
                int i2 = this.A05;
                this.A05 = i2 + 1;
                sb.append(i2);
                Log.i(sb.toString());
                if (Voip.setVideoPreviewPort(r7.A01) == 0) {
                    VideoPort videoPort = r7.A01;
                    Point point = new Point(0, 0);
                    if (videoPort != null) {
                        point = videoPort.getWindowSize();
                    }
                    Voip.setVideoPreviewSize(point.x, point.y);
                    this.A05 = 0;
                    r7.A07(r6);
                    this.A1e.addCameraErrorListener(this.A2A);
                } else if (this.A05 >= 10) {
                    C447225g r2 = this.A12;
                    if (r2 != null) {
                        r2.A0n((CallInfo) null, (String) null, 15);
                    }
                } else {
                    this.A0F.sendEmptyMessageDelayed(6, 500);
                }
            }
        } else if (this.A0C.A0E(C16620tM.A02, 2222)) {
            C26811Ph r4 = this.A1A;
            C16040sK r0 = r4.A03;
            r0.A0B();
            AnonymousClass1ZT r22 = r0.A05;
            Map map = r4.A08;
            if (!map.containsKey(r22)) {
                Log.w("voip/VideoPortManager/startCameraPreview no self video port");
                return;
            }
            AnonymousClass2Qx r3 = (AnonymousClass2Qx) map.get(r22);
            if (((Boolean) AnonymousClass46C.A00(r3.A06, Boolean.FALSE, new IDxCallableShape148S0100000_2_I0(r3, 3))).booleanValue()) {
                r4.A01(r3);
            } else {
                r3.A05 = false;
            }
        } else {
            CallGridViewModel callGridViewModel = this.A0t;
            AnonymousClass00B.A06(callGridViewModel);
            C448926b r1 = callGridViewModel.A0D;
            VideoPort videoPort2 = r1.A05;
            if (videoPort2 == null) {
                Log.i("voip/CallDatasource/startCameraPreview selfVideoPort not set");
            } else {
                r1.A09(videoPort2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r6.A00 != 2) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3l(X.C49872Wg r6) {
        /*
            r5 = this;
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r5.A0t
            if (r0 == 0) goto L_0x000b
            if (r6 == 0) goto L_0x000b
            X.2OJ r0 = r0.A0N
            r0.A0B(r6)
        L_0x000b:
            r4 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0015
            int r3 = r6.A00
            r0 = 2
            r2 = 1
            if (r3 == r0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            r5.A1t = r2
            X.4SA r0 = r5.A0r
            if (r0 == 0) goto L_0x001f
            r4 = r4 ^ r2
            r0.A02 = r4
        L_0x001f:
            if (r6 == 0) goto L_0x0063
            android.view.View r0 = r5.A0M
            if (r0 == 0) goto L_0x0063
            android.view.ViewParent r4 = r0.getParent()
            android.view.View r4 = (android.view.View) r4
            android.content.res.Resources r2 = r5.getResources()
            r0 = 2131165441(0x7f070101, float:1.79451E38)
            int r3 = r2.getDimensionPixelSize(r0)
            android.view.View r0 = r5.A0M
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            boolean r0 = r5.A1t
            if (r0 == 0) goto L_0x004c
            int r1 = r4.getHeight()
            android.graphics.Rect r0 = r6.A02
            int r0 = r0.top
            int r1 = r1 - r0
            int r1 = r1 + r3
        L_0x004c:
            r2.bottomMargin = r1
            android.view.View r0 = r5.A0M
            r0.setLayoutParams(r2)
            boolean r0 = r5.A1m
            if (r0 == 0) goto L_0x0063
            android.view.View r2 = r5.A0M
            r1 = 28
            com.facebook.redex.RunnableRunnableShape16S0100000_I0_15 r0 = new com.facebook.redex.RunnableRunnableShape16S0100000_I0_15
            r0.<init>(r5, r1)
            r2.post(r0)
        L_0x0063:
            com.whatsapp.voipcalling.CallInfo r0 = r5.A3B()
            r5.A3Y()
            r5.A3r(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3l(X.2Wg):void");
    }

    public final void A3m(CallInfo callInfo) {
        C32001fU r0;
        C447225g r1 = this.A12;
        if (r1 != null && r1.A12(callInfo.callId) && callInfo.callState == CallState.ACTIVE && (r0 = callInfo.self) != null && r0.A0A) {
            Log.i("voip/VoipActivityV2/checkToShowResumeCallButton");
            String string = getString(R.string.str1afd);
            String string2 = getString(R.string.str1b12);
            View.OnClickListener onClickListener = this.A0I;
            this.A0Z.setText(string);
            this.A0O.setVisibility(0);
            this.A0Z.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            if (string2 == null) {
                this.A0O.setBackground((Drawable) null);
                this.A0N.setVisibility(8);
                this.A0Y.setVisibility(8);
                return;
            }
            boolean z2 = false;
            if (onClickListener != null) {
                z2 = true;
            }
            AnonymousClass00B.A0B("buttonOnClickListener must be set together with buttonText", z2);
            this.A0O.setBackground(this.A0C);
            this.A0N.setVisibility(0);
            this.A0Y.setVisibility(0);
            this.A0Y.setText(string2);
            this.A0Y.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I0_1(this, 6, onClickListener));
        }
    }

    public final void A3n(CallInfo callInfo) {
        AnonymousClass00B.A0B("can be called only for video call", A0u(callInfo));
        for (C616839w r2 : this.A1h.values()) {
            C32001fU infoByJid = callInfo.getInfoByJid(r2.A04);
            r2.A07(infoByJid);
            r2.A09(infoByJid, callInfo);
            MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A15;
            if (maximizedParticipantVideoDialogFragment != null) {
                maximizedParticipantVideoDialogFragment.A1N(infoByJid, callInfo);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r0 = r9.A0l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r1 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r0.A05(r5, r1);
        A3m(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0127, code lost:
        r2 = r10.getPeerJid();
        X.AnonymousClass00B.A06(r2);
        r6 = getString(com.obwhatsapp.R.string.str1196, new java.lang.Object[]{r9.A1H.A08(r9.A1E.A0A(r2))});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014b, code lost:
        if (r0 != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014d, code lost:
        r1 = com.obwhatsapp.R.string.str1ae5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0184, code lost:
        r1 = null;
        r5 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3o(com.whatsapp.voipcalling.CallInfo r10) {
        /*
            r9 = this;
            X.AnonymousClass00B.A01()
            int r0 = r9.A09
            if (r0 == 0) goto L_0x0054
            int r0 = r9.A08
            if (r0 == 0) goto L_0x0054
            boolean r0 = r9.A1r
            if (r0 != 0) goto L_0x0054
            com.obwhatsapp.calling.CallDetailsLayout r0 = r9.A0l
            int r1 = r0.A00
            r0 = 1
            if (r1 == r0) goto L_0x0054
            if (r10 == 0) goto L_0x0054
            boolean r0 = r10.callEnding
            if (r0 != 0) goto L_0x0054
            com.whatsapp.voipcalling.CallState r1 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0054
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0054
            boolean r0 = r10.isInLonelyState()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r9.A20
            if (r0 != 0) goto L_0x0054
        L_0x0030:
            X.1fU r0 = r10.self
            if (r0 == 0) goto L_0x0054
            com.whatsapp.voipcalling.CallState r0 = r9.A3C(r10)
            int r0 = r0.ordinal()
            r5 = 0
            r7 = 0
            r8 = 1
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x011f;
                case 2: goto L_0x0113;
                case 3: goto L_0x0151;
                case 4: goto L_0x0055;
                case 5: goto L_0x0055;
                case 6: goto L_0x005a;
                case 7: goto L_0x0054;
                case 8: goto L_0x0042;
                case 9: goto L_0x0151;
                case 10: goto L_0x0042;
                case 11: goto L_0x014d;
                default: goto L_0x0042;
            }
        L_0x0042:
            java.lang.String r0 = "voip/VoipActivityV2/updateCallStatusBar/unknownCallState"
            X.AnonymousClass00B.A08(r0)
            r1 = r5
        L_0x0049:
            com.obwhatsapp.calling.CallDetailsLayout r0 = r9.A0l
            if (r1 != 0) goto L_0x004e
            r1 = r5
        L_0x004e:
            r0.A05(r5, r1)
            r9.A3m(r10)
        L_0x0054:
            return
        L_0x0055:
            r1 = 2131892878(0x7f121a8e, float:1.9420517E38)
            goto L_0x0196
        L_0x005a:
            boolean r0 = r10.isInLonelyState()
            if (r0 != 0) goto L_0x014d
            boolean r0 = r10.videoEnabled
            if (r0 == 0) goto L_0x00b6
            r9.A3I()
            boolean r0 = r10.videoEnabled
            r1 = 1
            if (r0 != 0) goto L_0x006d
            r1 = 0
        L_0x006d:
            java.lang.String r0 = "can be called only for video call"
            X.AnonymousClass00B.A0B(r0, r1)
            java.util.Map r0 = r9.A1h
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x007c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r2 = r3.next()
            X.39w r2 = (X.C616839w) r2
            com.whatsapp.jid.UserJid r0 = r2.A04
            X.1fU r1 = r10.getInfoByJid(r0)
            r2.A09(r1, r10)
            com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment r0 = r9.A15
            if (r0 == 0) goto L_0x007c
            r0.A1N(r1, r10)
            goto L_0x007c
        L_0x0099:
            r9.A3m(r10)
            boolean r0 = r9.A1p
            if (r0 != 0) goto L_0x0054
            long r5 = r9.A0A
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r5
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a4
            r9.A1p = r8
            return
        L_0x00b6:
            boolean r0 = r10.isCallOnHold()
            if (r0 == 0) goto L_0x00fb
            r0 = 2131892989(0x7f121afd, float:1.9420742E38)
            java.lang.String r6 = r9.getString(r0)
        L_0x00c3:
            boolean r0 = r9.A1p
            if (r0 != 0) goto L_0x00dc
            long r1 = r9.A0A
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r1
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f3
            r9.A1p = r8
        L_0x00dc:
            if (r6 != 0) goto L_0x0184
            X.013 r4 = r9.A01
            long r2 = r10.callDuration
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.String r5 = X.C28961Zl.A04(r4, r2)
            X.013 r2 = r9.A01
            long r0 = r10.callDuration
            java.lang.String r1 = X.C28961Zl.A06(r2, r0)
            goto L_0x0049
        L_0x00f3:
            r0 = 2131892844(0x7f121a6c, float:1.9420448E38)
            java.lang.String r6 = r9.getString(r0)
            goto L_0x00dc
        L_0x00fb:
            boolean r0 = r10.isGroupCall
            if (r0 != 0) goto L_0x0111
            X.1fU r0 = r10.getDefaultPeerInfo()
            X.AnonymousClass00B.A06(r0)
            java.lang.String r6 = r9.A3D(r0, r10)
            if (r6 != 0) goto L_0x00c3
            java.lang.String r6 = r9.A3E(r0, r10, r8)
            goto L_0x00c3
        L_0x0111:
            r6 = r5
            goto L_0x00c3
        L_0x0113:
            X.25g r0 = r9.A12
            if (r0 == 0) goto L_0x011b
            boolean r0 = r0.A1N
            if (r0 != 0) goto L_0x0127
        L_0x011b:
            r1 = 2131892873(0x7f121a89, float:1.9420507E38)
            goto L_0x0196
        L_0x011f:
            X.25g r0 = r9.A12
            if (r0 == 0) goto L_0x0146
            boolean r0 = r0.A1N
            if (r0 == 0) goto L_0x0146
        L_0x0127:
            r4 = 2131890582(0x7f121196, float:1.941586E38)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            com.whatsapp.jid.UserJid r2 = r10.getPeerJid()
            X.AnonymousClass00B.A06(r2)
            X.0sP r1 = r9.A1H
            X.0sG r0 = r9.A1E
            X.0sH r0 = r0.A0A(r2)
            java.lang.String r0 = r1.A08(r0)
            r3[r7] = r0
            java.lang.String r6 = r9.getString(r4, r3)
            goto L_0x0184
        L_0x0146:
            boolean r0 = r10.isJoinableGroupCall
            r1 = 2131892872(0x7f121a88, float:1.9420505E38)
            if (r0 == 0) goto L_0x0196
        L_0x014d:
            r1 = 2131892965(0x7f121ae5, float:1.9420693E38)
            goto L_0x0196
        L_0x0151:
            com.whatsapp.jid.GroupJid r3 = r10.groupJid
            X.0sG r2 = r9.A1E
            X.14s r1 = r9.A1Z
            X.0ul r0 = r9.A1T
            X.0sH r0 = X.C30341cC.A02(r2, r0, r3, r1)
            if (r0 == 0) goto L_0x0188
            X.0sG r1 = r9.A1E
            com.whatsapp.jid.UserJid r0 = r10.getPeerJid()
            X.AnonymousClass00B.A06(r0)
            X.0sH r3 = r1.A0A(r0)
            boolean r0 = r10.videoEnabled
            r2 = 2131888345(0x7f1208d9, float:1.9411323E38)
            if (r0 != 0) goto L_0x0176
            r2 = 2131888346(0x7f1208da, float:1.9411325E38)
        L_0x0176:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.0sP r0 = r9.A1H
            java.lang.String r0 = r0.A0C(r3)
            r1[r7] = r0
            java.lang.String r6 = r9.getString(r2, r1)
        L_0x0184:
            r1 = r5
            r5 = r6
            goto L_0x0049
        L_0x0188:
            boolean r1 = r10.isGroupCall
            boolean r0 = r10.videoEnabled
            if (r1 == 0) goto L_0x019b
            r1 = 2131888923(0x7f120b1b, float:1.9412495E38)
            if (r0 != 0) goto L_0x0196
            r1 = 2131888924(0x7f120b1c, float:1.9412497E38)
        L_0x0196:
            java.lang.String r6 = r9.getString(r1)
            goto L_0x0184
        L_0x019b:
            r1 = 2131892667(0x7f1219bb, float:1.9420089E38)
            if (r0 != 0) goto L_0x0196
            r1 = 2131892868(0x7f121a84, float:1.9420496E38)
            goto L_0x0196
        L_0x01a4:
            r0 = 2131892844(0x7f121a6c, float:1.9420448E38)
            java.lang.String r0 = r9.getString(r0)
            r9.A3u(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3o(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r9.A1m != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3p(com.whatsapp.voipcalling.CallInfo r10) {
        /*
            r9 = this;
            android.view.View r0 = r9.A0R
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            com.whatsapp.jid.GroupJid r0 = r10.groupJid
            r8 = 1
            r4 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0010
            r3 = 1
        L_0x0010:
            boolean r0 = r10.videoEnabled
            if (r0 == 0) goto L_0x001d
            boolean r0 = r9.A20
            if (r0 == 0) goto L_0x001d
            boolean r0 = r9.A1m
            r7 = 1
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r7 = 0
        L_0x001e:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131166389(0x7f0704b5, float:1.7947022E38)
            if (r7 == 0) goto L_0x002a
            r0 = 2131165491(0x7f070133, float:1.79452E38)
        L_0x002a:
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r9.A06
            int r1 = r1 + r0
            r2.height = r1
            android.view.View r0 = r9.A0R
            r0.setLayoutParams(r2)
            android.view.View r6 = r9.A0R
            int r5 = r6.getPaddingLeft()
            int r2 = r9.A06
            android.view.View r0 = r9.A0R
            int r1 = r0.getPaddingRight()
            android.view.View r0 = r9.A0R
            int r0 = r0.getPaddingBottom()
            r6.setPadding(r5, r2, r1, r0)
            android.widget.ImageButton r2 = r9.A0T
            X.013 r0 = r9.A01
            boolean r0 = r0.A0T()
            r1 = r0 ^ 1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x005f
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x005f:
            r2.setScaleX(r0)
            boolean r0 = r10.videoEnabled
            r5 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x00de
            r0 = 2131099807(0x7f06009f, float:1.7811978E38)
            if (r7 == 0) goto L_0x0070
            r0 = 2131099813(0x7f0600a5, float:1.781199E38)
        L_0x0070:
            int r7 = X.AnonymousClass00T.A00(r9, r0)
            int r7 = com.obwhatsapp.yo.yo.getUniversalColor()
            android.view.View r6 = r9.A0R
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r0 = 2
            int[] r1 = new int[r0]
            r1[r4] = r7
            r0 = 2131101586(0x7f060792, float:1.7815586E38)
            int r0 = X.AnonymousClass00T.A00(r9, r0)
            r1[r8] = r0
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r2, r1)
            r6.setBackground(r0)
            android.widget.ImageView r0 = r9.A0U
            r0.setImageAlpha(r5)
            android.widget.TextView r1 = r9.A0b
            r0 = 2131102000(0x7f060930, float:1.7816426E38)
            int r0 = X.AnonymousClass00T.A00(r9, r0)
            r1.setTextColor(r0)
        L_0x00a3:
            int r1 = r10.getConnectedParticipantsCount()
            r0 = 8
            if (r1 <= r0) goto L_0x00d2
            r2 = 1
            r1 = 2131232636(0x7f08077c, float:1.8081387E38)
        L_0x00af:
            android.widget.ImageView r0 = r9.A0W
            r0.setImageResource(r1)
            android.widget.TextView r1 = r9.A0d
            if (r2 == 0) goto L_0x00cc
            int r0 = r10.getConnectedParticipantsCount()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            android.widget.TextView r0 = r9.A0d
            r0.setVisibility(r4)
        L_0x00c8:
            r9.A3y(r3)
            return
        L_0x00cc:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00c8
        L_0x00d2:
            r2 = 0
            com.whatsapp.jid.GroupJid r0 = r10.groupJid
            r1 = 2131231039(0x7f08013f, float:1.8078148E38)
            if (r0 == 0) goto L_0x00af
            r1 = 2131232639(0x7f08077f, float:1.8081393E38)
            goto L_0x00af
        L_0x00de:
            X.0pd r2 = r9.A0C
            r1 = 1540(0x604, float:2.158E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            android.widget.ImageView r1 = r9.A0U
            if (r0 == 0) goto L_0x0101
            r1.setImageAlpha(r5)
            android.widget.TextView r1 = r9.A0b
            r0 = 2131101963(0x7f06090b, float:1.781635E38)
        L_0x00f4:
            int r0 = X.AnonymousClass00T.A00(r9, r0)
            r1.setTextColor(r0)
            android.view.View r0 = r9.A0R
            r0.setVisibility(r4)
            goto L_0x00a3
        L_0x0101:
            r0 = 153(0x99, float:2.14E-43)
            r1.setImageAlpha(r0)
            android.widget.TextView r1 = r9.A0b
            r0 = 2131101992(0x7f060928, float:1.781641E38)
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3p(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        r1 = r13.callState;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3q(com.whatsapp.voipcalling.CallInfo r13) {
        /*
            r12 = this;
            com.whatsapp.voipcalling.CallState r1 = r13.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x006a
            boolean r0 = r13.isInLonelyState()
            if (r0 == 0) goto L_0x0010
            boolean r0 = r12.A20
            if (r0 != 0) goto L_0x006a
        L_0x0010:
            com.obwhatsapp.calling.CallDetailsLayout r10 = r12.A0l
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Map r0 = r13.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x0026:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r3 = r4.next()
            X.1fU r3 = (X.C32001fU) r3
            boolean r0 = r3.A0G
            if (r0 != 0) goto L_0x0026
            int r2 = r3.A01
            r1 = 1
            com.whatsapp.jid.UserJid r0 = r3.A07
            if (r2 != r1) goto L_0x0041
            r7.add(r0)
            goto L_0x0026
        L_0x0041:
            r5.add(r0)
            goto L_0x0026
        L_0x0045:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r7)
            r6.addAll(r5)
            r10.setCallDetailsDescription(r6, r13)
            com.whatsapp.jid.GroupJid r2 = r13.groupJid
            X.0sG r5 = r10.A09
            X.0sP r8 = r10.A0A
            X.14s r1 = r10.A0I
            X.0ul r0 = r10.A0G
            java.lang.String r9 = X.C30341cC.A09(r5, r8, r0, r2, r1)
            int r11 = r6.size()
            boolean r0 = r13.isInLonelyState()
            if (r0 != 0) goto L_0x006b
            if (r11 != 0) goto L_0x006b
        L_0x006a:
            return
        L_0x006b:
            com.whatsapp.jid.UserJid r0 = r13.getInitialPeerJid()
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r13.isInLonelyState()
            r7 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b1
            com.whatsapp.voipcalling.CallState r1 = r13.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0088
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 == r0) goto L_0x0088
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_RECEIVED
            if (r1 != r0) goto L_0x00b1
        L_0x0088:
            r3 = 1
        L_0x0089:
            X.1cU r2 = r10.A07
            android.graphics.Typeface r1 = r10.A02
            com.obwhatsapp.TextEmojiLabel r0 = r2.A02
            r0.setTypeface(r1, r4)
            if (r11 != r7) goto L_0x00b3
            com.whatsapp.jid.UserJid r0 = r13.getInitialPeerJid()
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x00aa
            com.whatsapp.jid.UserJid r0 = r13.getInitialPeerJid()
        L_0x00a2:
            X.0sH r0 = r5.A0A(r0)
            r2.A0A(r0)
            return
        L_0x00aa:
            java.lang.Object r0 = r6.get(r4)
            X.0rv r0 = (X.C15830rv) r0
            goto L_0x00a2
        L_0x00b1:
            r3 = 0
            goto L_0x0089
        L_0x00b3:
            if (r9 != 0) goto L_0x00c6
            boolean r0 = r13.videoEnabled
            if (r0 != 0) goto L_0x00cb
            if (r3 == 0) goto L_0x00cb
            android.content.Context r1 = r10.getContext()
            r0 = 2131888925(0x7f120b1d, float:1.94125E38)
            java.lang.String r9 = r1.getString(r0)
        L_0x00c6:
            r0 = 0
            r2.A0F(r0, r9)
            return
        L_0x00cb:
            android.content.Context r1 = r10.getContext()
            r0 = 3
            X.2Wj r0 = X.C52142dD.A02(r5, r8, r6, r0, r4)
            if (r0 != 0) goto L_0x00d8
            r9 = 0
            goto L_0x00c6
        L_0x00d8:
            java.lang.String r9 = r0.A00(r1)
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3q(com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A3r(CallInfo callInfo) {
        if (callInfo != null) {
            boolean z2 = callInfo.videoEnabled;
            OrientationViewModel orientationViewModel = this.A0w;
            if (z2) {
                if (orientationViewModel != null) {
                    orientationViewModel.A08(this);
                }
            } else if (orientationViewModel != null && orientationViewModel.A09()) {
                A3g(0, 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02e2, code lost:
        if (r3.A1d != null) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0337, code lost:
        if (r4.isEitherSideRequestingUpgrade() == false) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0507, code lost:
        if (r6 == false) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0117, code lost:
        if (r4.isGroupCallEnabled == false) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0365  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3s(com.whatsapp.voipcalling.CallInfo r18) {
        /*
            r17 = this;
            r3 = r17
            boolean r0 = r3.isFinishing()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "voip/VoipActivityV2/updateUiState finishing do not update"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x000e:
            return
        L_0x000f:
            r4 = r18
            if (r18 == 0) goto L_0x000e
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x000e
            boolean r0 = r3.A1u
            r2 = 1
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = "com.obwhatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN"
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0044
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "voip/VoipActivityV2/updateUiState leave PIP mode due to voice call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0pt r1 = r3.A05
            r0 = 2131892843(0x7f121a6b, float:1.9420446E38)
            r1.A09(r0, r2)
            r3.finish()
            return
        L_0x0044:
            boolean r0 = r4.hasOutgoingParticipantInActiveOneToOneCall()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r4.isInLonelyState()
            if (r0 == 0) goto L_0x007e
            int r0 = r3.A01
            if (r0 == 0) goto L_0x007e
            if (r0 == r2) goto L_0x007e
        L_0x0056:
            boolean r0 = r3.A23
            if (r0 != 0) goto L_0x007e
            boolean r0 = r4.videoEnabled
            if (r0 == 0) goto L_0x007e
            r3.A23 = r2
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r3.A1d
            if (r0 != 0) goto L_0x007e
            android.view.Window r0 = r3.getWindow()
            android.view.View r1 = r0.getDecorView()
            int r0 = r1.getSystemUiVisibility()
            r0 = r0 & -5
            r1.setSystemUiVisibility(r0)
            android.view.Window r1 = r3.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r1.clearFlags(r0)
        L_0x007e:
            java.util.List r2 = A03(r4)
            r3.A3Z()
            r3.A3q(r4)
            r3.A3o(r4)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r3.A1d
            if (r0 == 0) goto L_0x00ef
            boolean r1 = r4.videoEnabled
            boolean r0 = r0.A1V()
            if (r1 == r0) goto L_0x00ef
            X.0rz r6 = r3.A09
            X.0pd r5 = r3.A0C
            int r1 = r4.getConnectedParticipantsCount()
            X.01J r0 = r3.A1i
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = X.C30341cC.A0N(r6, r5, r1, r0)
            if (r0 != 0) goto L_0x00c8
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r5 = r3.A0t
            if (r5 == 0) goto L_0x00c8
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = r3.A0p
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r4.videoEnabled
            r1 = 0
            if (r0 == 0) goto L_0x051a
            r5.A0I(r1)
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = r3.A0p
            r1 = 8
        L_0x00c5:
            r0.setVisibility(r1)
        L_0x00c8:
            r3.A3R()
            java.lang.Class<com.whatsapp.voipcalling.VoipActivityV2$SwitchConfirmationFragment> r0 = com.whatsapp.voipcalling.VoipActivityV2.SwitchConfirmationFragment.class
            java.lang.String r0 = r0.getName()
            r3.A2e(r0)
            java.lang.Class<com.whatsapp.voipcalling.VoipActivityV2$E2EEInfoDialogFragment> r0 = com.whatsapp.voipcalling.VoipActivityV2.E2EEInfoDialogFragment.class
            java.lang.String r0 = r0.getName()
            r3.A2e(r0)
            java.lang.Class<com.whatsapp.voipcalling.VoipActivityV2$SwitchCameraForPersonalizedAvatarDialogFragment> r0 = com.whatsapp.voipcalling.VoipActivityV2.SwitchCameraForPersonalizedAvatarDialogFragment.class
            java.lang.String r0 = r0.getName()
            r3.A2e(r0)
            android.view.View r1 = r3.A0R
            r0 = 0
            r1.setTranslationY(r0)
            r3.A3T()
        L_0x00ef:
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            android.view.View r0 = r3.A0K
            r5 = 8
            if (r0 == 0) goto L_0x00fa
            r0.setVisibility(r5)
        L_0x00fa:
            boolean r0 = r3.A23
            if (r0 != 0) goto L_0x02cc
            android.view.View r0 = r3.A0J
            if (r0 == 0) goto L_0x0105
            r0.setVisibility(r5)
        L_0x0105:
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            r5 = 0
            if (r1 == r0) goto L_0x0114
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 == r0) goto L_0x0114
            boolean r0 = r3.A1k
            if (r0 == 0) goto L_0x0119
        L_0x0114:
            boolean r0 = r4.isGroupCallEnabled
            r1 = 1
            if (r0 != 0) goto L_0x011a
        L_0x0119:
            r1 = 0
        L_0x011a:
            android.view.ViewGroup r0 = r3.A0S
            if (r1 != 0) goto L_0x0120
            r5 = 8
        L_0x0120:
            r0.setVisibility(r5)
            boolean r5 = r3.A44(r4)
            android.view.View r1 = r3.A0P
            r8 = 0
            r0 = 8
            if (r5 == 0) goto L_0x012f
            r0 = 0
        L_0x012f:
            r1.setVisibility(r0)
            if (r5 == 0) goto L_0x0164
            boolean r0 = r4.isGroupCall
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x025f
            boolean r0 = r4.isInLonelyState()
            if (r0 == 0) goto L_0x025f
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x025f
            android.view.View r5 = r3.A0P
            com.obwhatsapp.calling.CallDetailsLayout r0 = r3.A0l
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0256
            com.obwhatsapp.calling.CallDetailsLayout r0 = r3.A0l
            java.lang.String r0 = r0.getNameViewContentDescription()
            if (r0 == 0) goto L_0x0256
            com.obwhatsapp.calling.CallDetailsLayout r0 = r3.A0l
            java.lang.String r1 = r0.getNameViewContentDescription()
        L_0x015c:
            X.3P9 r0 = new X.3P9
            r0.<init>(r5, r1, r7, r6)
            X.C004601z.A0j(r5, r0)
        L_0x0164:
            r3.AhR(r4)
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x01cd
            com.obwhatsapp.WaImageView r0 = r3.A0j
            if (r0 == 0) goto L_0x0251
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0251
            X.0pd r5 = r3.A0C
            r1 = 1540(0x604, float:2.158E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 == 0) goto L_0x0218
            boolean r0 = r4.isGroupCall
            if (r0 == 0) goto L_0x0218
            com.whatsapp.jid.GroupJid r6 = r4.groupJid
            if (r6 == 0) goto L_0x0218
            com.obwhatsapp.WaImageView r0 = r3.A0j
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01cd
            X.0se r0 = r3.A1Y
            X.4Ul r5 = r0.A06(r3, r6)
            java.lang.String r1 = r5.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1770733785: goto L_0x0202;
                case 175331287: goto L_0x01ff;
                default: goto L_0x01a6;
            }
        L_0x01a6:
            r0 = 2131232690(0x7f0807b2, float:1.8081496E38)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass00T.A04(r3, r0)
            X.AnonymousClass00B.A06(r5)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131101668(0x7f0607e4, float:1.7815752E38)
            int r0 = r1.getColor(r0)
            int r0 = com.obwhatsapp.yo.yo.getUniversalColor()
            android.graphics.drawable.Drawable r1 = X.AnonymousClass2SR.A06(r5, r0)
        L_0x01c3:
            com.obwhatsapp.WaImageView r0 = r3.A0j
            r0.setImageDrawable(r1)
            com.obwhatsapp.WaImageView r0 = r3.A0j
            r0.setTag(r6)
        L_0x01cd:
            X.2Tx r0 = r3.A0z
            X.028 r0 = r0.AAM()
            java.lang.Object r0 = r0.A01()
            X.2Wg r0 = (X.C49872Wg) r0
            r3.A3l(r0)
            boolean r0 = r4.isGroupCall
            com.obwhatsapp.calling.CallDetailsLayout r1 = r3.A0l
            if (r0 == 0) goto L_0x01fb
            com.whatsapp.jid.GroupJid r0 = r4.groupJid
            r1.A02(r0)
        L_0x01e7:
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x01f1
            android.view.View$OnClickListener r0 = r3.A0G
            if (r0 != 0) goto L_0x000e
        L_0x01f1:
            r1 = 13
            com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0
            r0.<init>(r3, r2, r4, r1)
            r3.A0G = r0
            return
        L_0x01fb:
            r1.A06(r2)
            goto L_0x01e7
        L_0x01ff:
            java.lang.String r0 = "USER_PROVIDED"
            goto L_0x0204
        L_0x0202:
            java.lang.String r0 = "DOWNLOADED"
        L_0x0204:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01a6
            X.0se r0 = r3.A1Y
            android.graphics.drawable.Drawable r1 = r0.A03(r5)
            if (r1 == 0) goto L_0x01a6
            r0 = 25
            X.C62063Bm.A04(r3, r1, r0)
            goto L_0x01c3
        L_0x0218:
            r1 = 2131232690(0x7f0807b2, float:1.8081496E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            com.obwhatsapp.WaImageView r0 = r3.A0j
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x01cd
            com.obwhatsapp.WaImageView r6 = r3.A0j
            android.graphics.drawable.Drawable r5 = X.AnonymousClass00T.A04(r3, r1)
            X.AnonymousClass00B.A06(r5)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131101668(0x7f0607e4, float:1.7815752E38)
            int r0 = r1.getColor(r0)
            int r0 = com.obwhatsapp.yo.yo.getUniversalColor()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A06(r5, r0)
            r6.setImageDrawable(r0)
            com.obwhatsapp.WaImageView r0 = r3.A0j
            r0.setTag(r7)
            goto L_0x01cd
        L_0x0251:
            r0 = 0
            r3.A0j = r0
            goto L_0x01cd
        L_0x0256:
            r0 = 2131892881(0x7f121a91, float:1.9420523E38)
            java.lang.String r1 = r3.getString(r0)
            goto L_0x015c
        L_0x025f:
            com.whatsapp.jid.GroupJid r10 = r4.groupJid
            X.0sG r9 = r3.A1E
            X.0sP r5 = r3.A1H
            X.14s r1 = r3.A1Z
            X.0ul r0 = r3.A1T
            java.lang.String r5 = X.C30341cC.A09(r9, r5, r0, r10, r1)
            if (r5 != 0) goto L_0x027b
            X.0sG r5 = r3.A1E
            X.0sP r1 = r3.A1H
            r0 = 3
            X.2Wj r0 = X.C52142dD.A02(r5, r1, r2, r0, r8)
            if (r0 != 0) goto L_0x02c7
            r5 = 0
        L_0x027b:
            android.view.View r9 = r3.A0P
            com.obwhatsapp.calling.CallDetailsLayout r0 = r3.A0l
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x02b7
            if (r5 == 0) goto L_0x02b7
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x02b3
            r1 = 2131892885(0x7f121a95, float:1.942053E38)
        L_0x028e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r5
            java.lang.String r8 = r3.getString(r1, r0)
        L_0x0296:
            X.0pd r5 = r3.A0C
            r1 = 2541(0x9ed, float:3.56E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 == 0) goto L_0x02a9
            r0 = 2131892880(0x7f121a90, float:1.942052E38)
            java.lang.String r7 = r3.getString(r0)
        L_0x02a9:
            X.3P9 r0 = new X.3P9
            r0.<init>(r9, r8, r7, r6)
            X.C004601z.A0j(r9, r0)
            goto L_0x0164
        L_0x02b3:
            r1 = 2131892883(0x7f121a93, float:1.9420527E38)
            goto L_0x028e
        L_0x02b7:
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x02c3
            r0 = 2131892884(0x7f121a94, float:1.9420529E38)
        L_0x02be:
            java.lang.String r8 = r3.getString(r0)
            goto L_0x0296
        L_0x02c3:
            r0 = 2131892882(0x7f121a92, float:1.9420525E38)
            goto L_0x02be
        L_0x02c7:
            java.lang.String r5 = r0.A00(r3)
            goto L_0x027b
        L_0x02cc:
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r1)
            if (r0 == 0) goto L_0x02e9
            boolean r0 = r3.A1k
            if (r0 != 0) goto L_0x02e9
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates/answerCallView/visible RECEIVED_CALL"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r4.isGroupCall
            if (r0 == 0) goto L_0x0300
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r3.A1d
            if (r0 == 0) goto L_0x0300
        L_0x02e4:
            r3.A3U()
            goto L_0x0105
        L_0x02e9:
            boolean r0 = r4.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x050b
            X.1fU r0 = r4.self
            int r1 = r0.A05
            r0 = 3
            if (r1 == r0) goto L_0x050b
            boolean r0 = r3.A1k
            if (r0 != 0) goto L_0x050b
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates/answerCallView/visible kVideoStateUpgradeRequest"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0300:
            java.lang.String r0 = "voip/VoipActivityV2/showAnswerCallView"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.View r0 = r3.A0J
            if (r0 != 0) goto L_0x032b
            r0 = 2131362038(0x7f0a00f6, float:1.8343845E38)
            android.view.View r5 = r3.findViewById(r0)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            java.lang.String r1 = "voip/VoipActivityV2/inflateAnswerCallViewIfNull found answerCallViewStub:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.View r0 = r5.inflate()
            r3.A0J = r0
        L_0x032b:
            com.obwhatsapp.calling.CallDetailsLayout r8 = r3.A0l
            boolean r0 = r4.videoEnabled
            r1 = 0
            if (r0 == 0) goto L_0x0339
            boolean r0 = r4.isEitherSideRequestingUpgrade()
            r7 = 0
            if (r0 != 0) goto L_0x033a
        L_0x0339:
            r7 = 1
        L_0x033a:
            android.widget.FrameLayout r6 = r8.A03
            r5 = 8
            r0 = 8
            if (r7 == 0) goto L_0x0343
            r0 = 0
        L_0x0343:
            r6.setVisibility(r0)
            X.1cU r0 = r8.A07
            if (r7 == 0) goto L_0x034b
            r5 = 0
        L_0x034b:
            com.obwhatsapp.TextEmojiLabel r0 = r0.A02
            r0.setVisibility(r5)
            r8.A00 = r1
            android.view.View r0 = r3.A0J
            r0.clearAnimation()
            android.view.View r0 = r3.A0J
            r13 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r3.A0J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x04d3
            boolean r16 = r4.isPeerRequestingUpgrade()
            java.lang.String r14 = "com.obwhatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN"
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getAction()
            boolean r7 = r14.equals(r0)
            r0 = 2131361818(0x7f0a001a, float:1.83434E38)
            android.view.View r15 = r3.findViewById(r0)
            com.obwhatsapp.calling.views.CallResponseLayout r15 = (com.obwhatsapp.calling.views.CallResponseLayout) r15
            com.facebook.redex.IDxRListenerShape4S0110000_2_I0 r0 = new com.facebook.redex.IDxRListenerShape4S0110000_2_I0
            r0.<init>(r3, r1, r7)
            r15.A02 = r0
            r0 = 1
            r15.A06 = r0
            r0 = 2131363098(0x7f0a051a, float:1.8345995E38)
            android.view.View r1 = r3.findViewById(r0)
            com.obwhatsapp.calling.views.CallResponseLayout r1 = (com.obwhatsapp.calling.views.CallResponseLayout) r1
            r12 = 1
            com.facebook.redex.IDxRListenerShape4S0110000_2_I0 r0 = new com.facebook.redex.IDxRListenerShape4S0110000_2_I0
            r0.<init>(r3, r12, r7)
            r1.A02 = r0
            r0 = 2131365728(0x7f0a0f60, float:1.835133E38)
            android.view.View r0 = r3.findViewById(r0)
            com.obwhatsapp.calling.views.CallResponseLayout r0 = (com.obwhatsapp.calling.views.CallResponseLayout) r0
            r11 = 8
            r5 = 0
            if (r16 == 0) goto L_0x03ab
            r5 = 8
        L_0x03ab:
            r0.setVisibility(r5)
            X.4wo r5 = new X.4wo
            r5.<init>(r4, r3)
            r0.A02 = r5
            r0.A07 = r12
            r5 = 2131361820(0x7f0a001c, float:1.8343403E38)
            android.view.View r10 = r3.findViewById(r5)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            boolean r6 = r4.videoEnabled
            if (r7 == 0) goto L_0x0504
            r5 = 2131231791(0x7f08042f, float:1.8079673E38)
            if (r6 == 0) goto L_0x03cc
            r5 = 2131231790(0x7f08042e, float:1.807967E38)
        L_0x03cc:
            r10.setImageResource(r5)
        L_0x03cf:
            r5 = 2131363100(0x7f0a051c, float:1.8346E38)
            android.view.View r9 = r3.findViewById(r5)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r5 = 2131365729(0x7f0a0f61, float:1.8351332E38)
            android.view.View r8 = r3.findViewById(r5)
            r5 = 2131361819(0x7f0a001b, float:1.8343401E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.A0X = r5
            r5 = 2131363099(0x7f0a051b, float:1.8345997E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.A0a = r5
            r5 = 2131363102(0x7f0a051e, float:1.8346003E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.A0c = r5
            r15.A01 = r10
            r1.A01 = r9
            r0.A01 = r8
            r5 = 2131361817(0x7f0a0019, float:1.8343397E38)
            android.view.View r7 = r3.findViewById(r5)
            r5 = 2131363097(0x7f0a0519, float:1.8345993E38)
            android.view.View r6 = r3.findViewById(r5)
            r5 = 2131365727(0x7f0a0f5f, float:1.8351327E38)
            android.view.View r5 = r3.findViewById(r5)
            r3.hideView(r6)
            r3.hideView(r5)
            r15.A00 = r7
            r1.A00 = r6
            r0.A00 = r5
            r10.clearAnimation()
            r9.clearAnimation()
            r8.clearAnimation()
            android.widget.TextView r0 = r3.A0X
            r0.clearAnimation()
            android.widget.TextView r0 = r3.A0a
            r0.clearAnimation()
            android.widget.TextView r0 = r3.A0c
            r0.clearAnimation()
            if (r16 == 0) goto L_0x04da
            r1 = 2131892003(0x7f121723, float:1.9418742E38)
            r14 = 2131886094(0x7f12000e, float:1.9406757E38)
        L_0x0447:
            r10.setVisibility(r13)
            android.view.animation.AnimationSet r0 = X.C62043Bk.A01(r10)
            r10.startAnimation(r0)
            java.lang.String r0 = r3.getString(r14)
            r10.setContentDescription(r0)
            android.widget.TextView r0 = r3.A0X
            r0.setVisibility(r13)
            android.widget.TextView r0 = r3.A0X
            r0.setText(r1)
            r3.showView(r7)
            r10 = 2131892004(0x7f121724, float:1.9418744E38)
            r1 = 2131887699(0x7f120653, float:1.9410012E38)
            if (r16 == 0) goto L_0x0473
            r10 = 2131892005(0x7f121725, float:1.9418746E38)
            r1 = 2131887702(0x7f120656, float:1.9410019E38)
        L_0x0473:
            r9.setVisibility(r13)
            r0 = 2131231556(0x7f080344, float:1.8079196E38)
            if (r16 == 0) goto L_0x047e
            r0 = 2131231554(0x7f080342, float:1.8079192E38)
        L_0x047e:
            r9.setImageResource(r0)
            java.lang.String r0 = r3.getString(r1)
            r9.setContentDescription(r0)
            android.widget.TextView r1 = r3.A0a
            r0 = 4
            r1.setVisibility(r0)
            android.widget.TextView r0 = r3.A0a
            r0.setText(r10)
            r1 = 2
            com.facebook.redex.IDxTListenerShape32S0300000_2_I0 r0 = new com.facebook.redex.IDxTListenerShape32S0300000_2_I0
            r0.<init>(r6, r3, r7, r1)
            r9.setOnTouchListener(r0)
            r8.setVisibility(r13)
            android.widget.TextView r0 = r3.A0c
            if (r16 != 0) goto L_0x04a4
            r11 = 4
        L_0x04a4:
            r0.setVisibility(r11)
            com.facebook.redex.IDxTListenerShape32S0300000_2_I0 r0 = new com.facebook.redex.IDxTListenerShape32S0300000_2_I0
            r0.<init>(r5, r3, r7, r12)
            r8.setOnTouchListener(r0)
            X.01V r0 = r3.A08
            android.view.accessibility.AccessibilityManager r0 = r0.A0P()
            boolean r0 = X.AnonymousClass2JP.A06(r0)
            if (r0 == 0) goto L_0x04d3
            android.widget.TextView r1 = r3.A0X
            r0 = 2131886090(0x7f12000a, float:1.940675E38)
            r1.setText(r0)
            android.widget.TextView r1 = r3.A0a
            r0 = 2131887700(0x7f120654, float:1.9410014E38)
            r1.setText(r0)
            android.widget.TextView r1 = r3.A0c
            r0 = 2131891204(0x7f121404, float:1.9417121E38)
            r1.setText(r0)
        L_0x04d3:
            java.lang.String r0 = "CallControlSheet"
            r3.A2e(r0)
            goto L_0x0105
        L_0x04da:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getAction()
            boolean r0 = r14.equals(r0)
            r1 = 2131892002(0x7f121722, float:1.941874E38)
            if (r0 == 0) goto L_0x04ee
            r1 = 2131892006(0x7f121726, float:1.9418748E38)
        L_0x04ee:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getAction()
            boolean r0 = r14.equals(r0)
            r14 = 2131886089(0x7f120009, float:1.9406747E38)
            if (r0 == 0) goto L_0x0447
            r14 = 2131888108(0x7f1207ec, float:1.9410842E38)
            goto L_0x0447
        L_0x0504:
            r5 = 2131231549(0x7f08033d, float:1.8079182E38)
            if (r6 != 0) goto L_0x03cc
            goto L_0x03cf
        L_0x050b:
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.View r0 = r3.A0J
            if (r0 == 0) goto L_0x02e4
            r0.setVisibility(r5)
            goto L_0x02e4
        L_0x051a:
            r0 = 1
            r5.A0I(r0)
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = r3.A0p
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3s(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
        if (r7 > 1) goto L_0x026d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02e1 A[LOOP:12: B:155:0x02db->B:157:0x02e1, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3t(com.whatsapp.voipcalling.CallInfo r15) {
        /*
            r14 = this;
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r14.A17
            int r0 = r0.getWidth()
            if (r0 == 0) goto L_0x0354
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r14.A17
            int r0 = r0.getHeight()
            if (r0 == 0) goto L_0x0354
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r14.A17
            java.util.List r13 = r0.getActiveChildUserJids()
            java.util.Map r0 = r14.A1h
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
            r10 = 0
            r4 = 0
        L_0x0022:
            boolean r0 = r5.hasNext()
            r9 = 1
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.Object r3 = r0.getValue()
            X.39w r3 = (X.C616839w) r3
            X.1fU r1 = r15.getInfoByJid(r2)
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0022
            int r0 = r1.A01
            if (r0 != r9) goto L_0x004a
            goto L_0x0022
        L_0x004a:
            java.lang.String r0 = "voip/VoipActivityV2/updateLayoutForAudioAndVideoCall "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " left group call"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A05()
            r5.remove()
            com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment r1 = r14.A15
            if (r1 == 0) goto L_0x0080
            boolean r0 = r1.A0c()
            if (r0 == 0) goto L_0x0080
            X.39w r0 = r1.A08
            if (r0 == 0) goto L_0x0080
            com.whatsapp.jid.UserJid r0 = r0.A04
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0080
            r1.A1O(r10)
        L_0x0080:
            r4 = 1
            goto L_0x0022
        L_0x0082:
            boolean r0 = r15.videoEnabled
            if (r0 != 0) goto L_0x00a5
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r14.A17
            r0.A05(r10, r10)
            java.util.Map r0 = r14.A1h
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0095:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0354
            java.lang.Object r0 = r1.next()
            X.39w r0 = (X.C616839w) r0
            r0.A05()
            goto L_0x0095
        L_0x00a5:
            r14.A3b()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.whatsapp.voipcalling.CallState r1 = r14.A3C(r15)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x00db
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 == r0) goto L_0x00db
            java.util.Map r0 = r15.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x00c3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r1 = r2.next()
            X.1fU r1 = (X.C32001fU) r1
            int r0 = r1.A01
            if (r0 != r9) goto L_0x00c3
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x00c3
            r8.add(r1)
            goto L_0x00c3
        L_0x00db:
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r14.A17
            int r2 = r0.A01
            com.whatsapp.voipcalling.CallState r1 = r15.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0351
            boolean r0 = r15.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x0351
            int r0 = r8.size()
            int r7 = r0 + 1
        L_0x00f1:
            if (r2 != r9) goto L_0x0129
            r0 = 2
            if (r7 != r0) goto L_0x0129
            boolean r0 = r14.A1n
            if (r0 == 0) goto L_0x026d
            boolean r0 = r14.A1u
            if (r0 != 0) goto L_0x026d
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r0 = r14.A16
            int r0 = r0.A03
            if (r0 != 0) goto L_0x026d
            java.lang.String r0 = "voip/VoipActivityV2/shrinkPreviewToPip Enter."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r4 = r14.A16
            int r0 = r4.A03
            r1 = 0
            if (r0 != 0) goto L_0x0112
            r1 = 1
        L_0x0112:
            java.lang.String r0 = "can only be called when pipView is in full mode"
            X.AnonymousClass00B.A0B(r0, r1)
            android.widget.ImageView r0 = r14.A0V
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0229
            java.lang.String r0 = "voip/VoipActivityV2/shrinkPreviewToPip still in animation"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0125:
            r14.A3n(r15)
            return
        L_0x0129:
            if (r2 != r7) goto L_0x0133
            if (r4 != 0) goto L_0x0133
            X.39w r0 = r14.A18
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r0 = r0.A00
            if (r0 != 0) goto L_0x0125
        L_0x0133:
            if (r7 <= r9) goto L_0x0137
            goto L_0x026d
        L_0x0137:
            int r0 = r13.size()
            if (r0 <= r9) goto L_0x027a
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r2 = r8.iterator()
        L_0x0150:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r1 = r2.next()
            X.1fU r1 = (X.C32001fU) r1
            com.whatsapp.jid.UserJid r0 = r1.A07
            r5.put(r0, r1)
            goto L_0x0150
        L_0x0162:
            java.util.Iterator r4 = r13.iterator()
            r3 = 0
        L_0x0167:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r2 = r4.next()
            int r1 = r3 % 2
            r0 = r6
            if (r1 != 0) goto L_0x0177
            r0 = r11
        L_0x0177:
            r0.add(r2)
            int r3 = r3 + 1
            goto L_0x0167
        L_0x017d:
            r3 = 0
        L_0x017e:
            r4 = r11
        L_0x017f:
            r2 = 0
        L_0x0180:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x01c7
            java.lang.Object r0 = r4.get(r2)
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L_0x01c4
            if (r3 != 0) goto L_0x01aa
            r11.remove(r2)
            int r1 = r11.size()
            int r0 = r6.size()
            if (r1 >= r0) goto L_0x0180
            java.lang.Object r0 = r6.get(r2)
            r11.add(r2, r0)
            r6.remove(r2)
            goto L_0x0180
        L_0x01aa:
            r6.remove(r2)
            int r1 = r6.size()
            int r0 = r11.size()
            int r0 = r0 + -1
            if (r1 >= r0) goto L_0x0180
            java.lang.Object r0 = r11.get(r2)
            r6.add(r2, r0)
            r11.remove(r2)
            goto L_0x0180
        L_0x01c4:
            int r2 = r2 + 1
            goto L_0x0180
        L_0x01c7:
            int r3 = r3 + 1
            r4 = 2
            if (r3 >= r4) goto L_0x01d0
            r4 = r6
            if (r3 != 0) goto L_0x017f
            goto L_0x017e
        L_0x01d0:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r3 = 0
        L_0x01d6:
            int r0 = r11.size()
            if (r3 >= r0) goto L_0x0221
            r2 = 0
        L_0x01dd:
            r1 = r11
        L_0x01de:
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x01fa
            java.lang.Object r12 = r1.get(r3)
            com.whatsapp.jid.Jid r12 = (com.whatsapp.jid.Jid) r12
            boolean r0 = r5.containsKey(r12)
            if (r0 == 0) goto L_0x0205
            java.lang.Object r0 = r5.get(r12)
            r8.add(r0)
            r5.remove(r12)
        L_0x01fa:
            int r2 = r2 + 1
            if (r2 >= r4) goto L_0x0202
            r1 = r6
            if (r2 != 0) goto L_0x01de
            goto L_0x01dd
        L_0x0202:
            int r3 = r3 + 1
            goto L_0x01d6
        L_0x0205:
            java.lang.String r0 = "voip/VoipUtil/addPeersAndBuildPeerParticipantList failed to load jid "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r12.getRawString()
            r1.append(r0)
            java.lang.String r0 = "in updated peers list"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A08(r0)
            goto L_0x01fa
        L_0x0221:
            java.util.Collection r0 = r5.values()
            r8.addAll(r0)
            goto L_0x027a
        L_0x0229:
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "GT-I9305"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x026d
            java.lang.String r0 = "GT-N7105"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x026d
            java.lang.String r0 = "GT-N7100"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x026d
            int r12 = r4.getWidth()
            int r11 = r4.getHeight()
            if (r12 == 0) goto L_0x026d
            if (r11 == 0) goto L_0x026d
            com.whatsapp.voipcalling.camera.VoipCameraManager r1 = r14.A1e
            X.53L r0 = X.AnonymousClass53L.A00
            android.graphics.Point r1 = r1.getAdjustedCameraPreviewSize(r0)
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r14.A17
            android.view.ViewGroup$MarginLayoutParams r2 = r0.A00(r1)
            if (r2 == 0) goto L_0x026d
            X.39w r0 = r14.A18
            android.graphics.Bitmap r1 = r0.A00()
            if (r1 != 0) goto L_0x02f7
            java.lang.String r0 = "voip/VoipActivityV2/shrinkPreviewToPip/ no cached frame bitmap"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x026d:
            int r1 = r8.size()
            r0 = 7
            if (r1 <= r0) goto L_0x0137
            java.util.List r8 = r8.subList(r10, r0)
            r7 = 8
        L_0x027a:
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r1 = r14.A17
            android.animation.ValueAnimator r0 = r1.A07
            if (r0 == 0) goto L_0x028b
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x028b
            android.animation.ValueAnimator r0 = r1.A07
            r0.cancel()
        L_0x028b:
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r14.A17
            r0.A05(r7, r10)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            X.39w r1 = r14.A18
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r14.A17
            int r7 = r7 - r9
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r0 = r0.A01(r7)
            if (r0 == 0) goto L_0x02cf
            r4.put(r1, r0)
        L_0x02a3:
            java.util.Iterator r3 = r8.iterator()
        L_0x02a7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02d3
            java.lang.Object r2 = r3.next()
            X.1fU r2 = (X.C32001fU) r2
            if (r10 < r7) goto L_0x02c8
            r1 = 0
        L_0x02b6:
            int r10 = r10 + 1
            com.whatsapp.jid.UserJid r0 = r2.A07
            X.39w r0 = r14.A3A(r0)
            if (r1 == 0) goto L_0x02c4
            r4.put(r0, r1)
            goto L_0x02a7
        L_0x02c4:
            r0.A05()
            goto L_0x02a7
        L_0x02c8:
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r14.A17
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r1 = r0.A01(r10)
            goto L_0x02b6
        L_0x02cf:
            r1.A05()
            goto L_0x02a3
        L_0x02d3:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x02db:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            X.39w r1 = (X.C616839w) r1
            java.lang.Object r0 = r0.getValue()
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r0 = (com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView) r0
            r1.A0A(r0)
            goto L_0x02db
        L_0x02f7:
            X.013 r0 = r14.A01
            boolean r0 = r0.A0T()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x034e
            int r3 = r2.leftMargin
        L_0x0303:
            int r6 = r2.topMargin
            android.widget.ImageView r0 = r14.A0V
            r0.setImageBitmap(r1)
            android.widget.ImageView r0 = r14.A0V
            r0.setVisibility(r10)
            android.view.animation.AnimationSet r5 = new android.view.animation.AnimationSet
            r5.<init>(r9)
            r5.setFillAfter(r9)
            r0 = 500(0x1f4, double:2.47E-321)
            r5.setDuration(r0)
            int r0 = r2.width
            float r7 = (float) r0
            float r0 = (float) r12
            float r7 = r7 / r0
            int r0 = r2.height
            float r2 = (float) r0
            float r0 = (float) r11
            float r2 = r2 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.ScaleAnimation r0 = new android.view.animation.ScaleAnimation
            r0.<init>(r1, r7, r1, r2)
            r5.addAnimation(r0)
            float r3 = (float) r3
            float r2 = (float) r6
            r1 = 0
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            r0.<init>(r1, r3, r1, r2)
            r5.addAnimation(r0)
            r1 = 10
            com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0 r0 = new com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0
            r0.<init>(r4, r1, r14)
            r5.setAnimationListener(r0)
            r14.A22 = r9
            android.widget.ImageView r0 = r14.A0V
            r0.startAnimation(r5)
            goto L_0x0125
        L_0x034e:
            int r3 = r2.rightMargin
            goto L_0x0303
        L_0x0351:
            r7 = 1
            goto L_0x00f1
        L_0x0354:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A3t(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void A3u(CharSequence charSequence, boolean z2) {
        this.A0Z.setText(charSequence);
        this.A0O.setVisibility(0);
        Drawable drawable = null;
        this.A0Z.setCompoundDrawables((Drawable) null, z2 ? this.A0E : null, (Drawable) null, (Drawable) null);
        View view = this.A0O;
        if (z2) {
            drawable = this.A0D;
        }
        view.setBackground(drawable);
        this.A0N.setVisibility(8);
        this.A0Y.setVisibility(8);
    }

    public final void A3v(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            setTaskDescription(new ActivityManager.TaskDescription(str));
        }
    }

    public final void A3w(boolean z2) {
        int i2;
        C52302dW iDxCListenerShape65S0100000_2_I0;
        CallInfo A3B = A3B();
        if (A3B == null) {
            return;
        }
        if (this.A1d == null || (A3B.groupJid == null && (!z2 || A3B.getConnectedParticipantsCount() <= 8))) {
            if (64 == A3B.participants.size()) {
                i2 = 4;
                iDxCListenerShape65S0100000_2_I0 = new C52302dW();
            } else if (A3B.isCallFull()) {
                i2 = 5;
                iDxCListenerShape65S0100000_2_I0 = new IDxCListenerShape65S0100000_2_I0(this, 0);
            } else {
                A3Q();
                return;
            }
            VoipErrorDialogFragment.A02(iDxCListenerShape65S0100000_2_I0, i2).A1G(AGM(), (String) null);
            return;
        }
        AnonymousClass2Tr r1 = this.A1d.A0H;
        if (r1 != null) {
            r1.A02(3);
        }
    }

    public final void A3x(boolean z2) {
        this.A04 = this.A06;
        this.A03 = 0;
        int dimensionPixelSize = (this.A02 - getResources().getDimensionPixelSize(R.dimen.dimen0103)) - (getResources().getDimensionPixelSize(R.dimen.dimen010b) >> 1);
        if (!z2 || !this.A20) {
            this.A04 += this.A07;
        } else if (!AnonymousClass2JP.A06(this.A08.A0P())) {
            return;
        }
        this.A03 += dimensionPixelSize;
    }

    public final void A3y(boolean z2) {
        String string;
        int i2;
        ViewGroup viewGroup = this.A0S;
        if (z2) {
            string = getString(R.string.str1abb);
            i2 = R.string.str1aba;
        } else {
            string = getString(R.string.str1aa1);
            i2 = R.string.str1aa0;
        }
        C004601z.A0j(viewGroup, new AnonymousClass3P9(viewGroup, string, getString(i2), true));
    }

    public final boolean A3z() {
        return Build.VERSION.SDK_INT >= 26 && this.A08.A0T("android.software.picture_in_picture") && A40();
    }

    public final boolean A40() {
        AppOpsManager A062 = this.A08.A06();
        AnonymousClass00B.A06(A062);
        try {
            return A062.checkOp("android:picture_in_picture", Process.myUid(), getPackageName()) == 0;
        } catch (SecurityException e2) {
            StringBuilder sb = new StringBuilder("voip/VoipActivityV2/isPictureInPictureAllowed");
            sb.append(e2);
            Log.w(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0073, code lost:
        if (r8.getRepeatCount() == 0) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A41(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            com.whatsapp.voipcalling.CallInfo r0 = r6.A3B()
            X.25g r4 = r6.A12
            r5 = 0
            if (r4 == 0) goto L_0x003c
            if (r0 == 0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r2 = r0.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r2 == r0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            r1 = 1
            if (r2 != r0) goto L_0x003d
            r0 = 24
            if (r7 == r0) goto L_0x0097
            r0 = 25
            if (r7 == r0) goto L_0x0097
            r0 = 91
            if (r7 == r0) goto L_0x0097
            r0 = 164(0xa4, float:2.3E-43)
            if (r7 == r0) goto L_0x0097
            r0 = 5
            if (r7 == r0) goto L_0x008b
            r0 = 126(0x7e, float:1.77E-43)
            if (r7 == r0) goto L_0x008b
            r0 = 79
            if (r7 == r0) goto L_0x008b
            r0 = 85
            if (r7 == r0) goto L_0x008b
            r0 = 6
            if (r7 == r0) goto L_0x007f
            r0 = 86
            if (r7 == r0) goto L_0x007f
        L_0x003c:
            return r5
        L_0x003d:
            r0 = 6
            if (r7 == r0) goto L_0x0075
            r0 = 86
            if (r7 == r0) goto L_0x0075
            r0 = 79
            if (r7 == r0) goto L_0x006f
            r0 = 85
            if (r7 == r0) goto L_0x006f
            r0 = 24
            if (r7 == r0) goto L_0x009b
            r0 = 25
            if (r7 == r0) goto L_0x009c
            r0 = 131(0x83, float:1.84E-43)
            if (r7 != r0) goto L_0x0063
            java.lang.String r0 = "Should be used for automation only"
            X.AnonymousClass00B.A0B(r0, r5)
            java.lang.String r0 = "it can only be used in smoke or automation"
            X.AnonymousClass00B.A0B(r0, r5)
            return r5
        L_0x0063:
            r0 = 4
            if (r7 != r0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r2 != r0) goto L_0x003c
            r0 = 2
            r6.A3f(r0)
            return r5
        L_0x006f:
            int r0 = r8.getRepeatCount()
            if (r0 != 0) goto L_0x003c
        L_0x0075:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon end call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A3L()
            return r1
        L_0x007f:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon reject call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 9
            r6.A3f(r0)
            return r1
        L_0x008b:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon accept call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 8
            r6.A3e(r0)
            return r1
        L_0x0097:
            r4.A0K()
            return r1
        L_0x009b:
            r5 = 1
        L_0x009c:
            r1 = 0
            X.01V r0 = r4.A2C     // Catch:{ all -> 0x0135 }
            android.media.AudioManager r0 = r0.A0G()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0139
            int r3 = r0.getStreamMaxVolume(r1)     // Catch:{ all -> 0x0135 }
            int r2 = r0.getStreamVolume(r1)     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r1.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = "voip/audio_route/adjustVoipStackAudioLevel direction "
            r1.append(r0)     // Catch:{ all -> 0x0135 }
            if (r5 == 0) goto L_0x00bd
            java.lang.String r0 = " UP"
            goto L_0x00bf
        L_0x00bd:
            java.lang.String r0 = "DOWN"
        L_0x00bf:
            r1.append(r0)     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = ", volume "
            r1.append(r0)     // Catch:{ all -> 0x0135 }
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = ", max volume "
            r1.append(r0)     // Catch:{ all -> 0x0135 }
            r1.append(r3)     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0135 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0135 }
            if (r5 == 0) goto L_0x010d
            if (r2 != r3) goto L_0x0139
            short r1 = r4.A15     // Catch:{ all -> 0x0135 }
            int r0 = r4.A08     // Catch:{ all -> 0x0135 }
            int r0 = r0 + 192
            if (r1 < r0) goto L_0x00ec
            java.lang.String r0 = "voip/audio_route/adjustVoipStackAudioLevel no-op, auido level is 192"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0135 }
            goto L_0x0139
        L_0x00ec:
            int r0 = r1 + 32
            short r0 = (short) r0     // Catch:{ all -> 0x0135 }
            r4.A15 = r0     // Catch:{ all -> 0x0135 }
            r0 = 5
            com.facebook.redex.RunnableRunnableShape5S0100000_I0_4 r3 = new com.facebook.redex.RunnableRunnableShape5S0100000_I0_4     // Catch:{ all -> 0x0135 }
            r3.<init>((java.lang.Object) r4, (int) r0)     // Catch:{ all -> 0x0135 }
            X.0pd r2 = r4.A2O     // Catch:{ all -> 0x0135 }
            r1 = 2903(0xb57, float:4.068E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x0135 }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0109
            java.util.concurrent.ScheduledExecutorService r0 = r4.A14     // Catch:{ all -> 0x0135 }
            r0.execute(r3)     // Catch:{ all -> 0x0135 }
            goto L_0x0139
        L_0x0109:
            r3.run()     // Catch:{ all -> 0x0135 }
            goto L_0x0139
        L_0x010d:
            short r1 = r4.A15     // Catch:{ all -> 0x0135 }
            int r0 = r4.A08     // Catch:{ all -> 0x0135 }
            if (r1 <= r0) goto L_0x0139
            int r0 = r1 + -32
            short r0 = (short) r0     // Catch:{ all -> 0x0135 }
            r4.A15 = r0     // Catch:{ all -> 0x0135 }
            r0 = 5
            com.facebook.redex.RunnableRunnableShape5S0100000_I0_4 r3 = new com.facebook.redex.RunnableRunnableShape5S0100000_I0_4     // Catch:{ all -> 0x0135 }
            r3.<init>((java.lang.Object) r4, (int) r0)     // Catch:{ all -> 0x0135 }
            X.0pd r2 = r4.A2O     // Catch:{ all -> 0x0135 }
            r1 = 2903(0xb57, float:4.068E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x0135 }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0130
            java.util.concurrent.ScheduledExecutorService r0 = r4.A14     // Catch:{ all -> 0x0135 }
            r0.execute(r3)     // Catch:{ all -> 0x0135 }
            goto L_0x0133
        L_0x0130:
            r3.run()     // Catch:{ all -> 0x0135 }
        L_0x0133:
            r0 = 1
            return r0
        L_0x0135:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0139:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A41(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r6.A1P.A03("android.permission.CAMERA") == 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A42(com.whatsapp.jid.UserJid r7, int r8, boolean r9) {
        /*
            r6 = this;
            r6.A3K()
            X.0sj r1 = r6.A1P
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r0 = r1.A03(r0)
            r5 = 1
            r4 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0011
            r3 = 1
        L_0x0011:
            if (r9 == 0) goto L_0x001e
            X.0sj r1 = r6.A1P
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r1.A03(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            X.0sj r0 = r6.A1P
            boolean r1 = r0.A0D()
            if (r2 != 0) goto L_0x002c
            if (r3 != 0) goto L_0x002c
            if (r1 != 0) goto L_0x002c
            return r5
        L_0x002c:
            r0 = -1
            if (r8 != r0) goto L_0x0035
            if (r3 != 0) goto L_0x0034
            r8 = 3
            if (r2 == 0) goto L_0x0035
        L_0x0034:
            r8 = 0
        L_0x0035:
            com.obwhatsapp.calling.views.PermissionDialogFragment r2 = com.obwhatsapp.calling.views.PermissionDialogFragment.A01(r7, r8, r3, r2, r1)
            X.02C r0 = r6.AGM()
            X.050 r1 = new X.050
            r1.<init>(r0)
            java.lang.String r0 = "permission_request"
            r1.A0C(r2, r0)
            r1.A04()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A42(com.whatsapp.jid.UserJid, int, boolean):boolean");
    }

    public final boolean A43(CallInfo callInfo) {
        if (A0u(callInfo) && this.A01 != 0 && (((A3C(callInfo) == CallState.ACTIVE && !callInfo.isInLonelyState()) || callInfo.callState == CallState.CONNECTED_LONELY) && !callInfo.isEitherSideRequestingUpgrade())) {
            PictureInPictureParams.Builder builder = this.A0B;
            AnonymousClass00B.A07(builder, "PiP Params Builder is null");
            try {
                if (enterPictureInPictureMode(builder.build())) {
                    A3h(0, false);
                    return true;
                }
            } catch (IllegalArgumentException | IllegalStateException e2) {
                Log.w("voip/VoipActivityV2/minimize exception trying to enter PIP mode", e2);
            }
            Log.w("voip/VoipActivityV2/minimize failed to enter PIP mode");
        }
        return false;
    }

    public final boolean A44(CallInfo callInfo) {
        CallState callState;
        boolean A0E2 = this.A0C.A0E(C16620tM.A02, 1071);
        CallState callState2 = callInfo.callState;
        CallState callState3 = CallState.ACTIVE;
        if (A0E2) {
            if (!(callState2 == callState3 || callState2 == CallState.CONNECTED_LONELY || callState2 == CallState.LINK || callState2 == CallState.CALLING)) {
                callState = CallState.PRE_ACCEPT_RECEIVED;
            }
        }
        if (!(callState2 == callState3 || callState2 == CallState.CONNECTED_LONELY)) {
            callState = CallState.LINK;
        }
        return callState2 == callState || this.A1k;
    }

    public C99874uj ACf() {
        C99874uj r0 = this.A1K;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3oU r02 = new AnonymousClass3oU(this, this);
        this.A1K = r02;
        return r02;
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A01;
    }

    public void AUi(int i2) {
        C447225g r2;
        String str;
        A3K();
        if (this.A12 != null) {
            int intExtra = getIntent().getIntExtra("call_ui_action", 0);
            if (i2 == 0) {
                r2 = this.A12;
                str = this.A1g;
            } else if (i2 == 1) {
                return;
            } else {
                if (i2 == 2) {
                    this.A12.A14.execute(new RunnableRunnableShape0S0001000_I0(0, 3));
                    return;
                } else if (i2 != 3) {
                    AnonymousClass00B.A0B("Unknown request code", false);
                    return;
                } else {
                    r2 = this.A12;
                    str = this.A1g;
                    r2.A1J = true;
                }
            }
            r2.A0w(str, (String) null, intExtra);
        }
    }

    public void AUj(String[] strArr, int i2) {
        C447225g r6;
        boolean z2;
        A3K();
        CallInfo A3B = A3B();
        if (Voip.A08(A3B) && (r6 = this.A12) != null) {
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                } else if ("android.permission.CAMERA".equals(strArr[i3])) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (i2 == 0) {
                if (A3B.videoEnabled && z2) {
                    Voip.refreshVideoDevice();
                    A3k(A3B.self, this.A18);
                }
                if (Voip.A09(A3B.callState)) {
                    UserJid peerJid = A3B.getPeerJid();
                    AnonymousClass00B.A06(peerJid);
                    if (A42(peerJid, -1, A3B.videoEnabled)) {
                        this.A12.A0X(1, this.A1g, false);
                    }
                }
            } else if (i2 == 1) {
                Log.i("voip/VoipActivityV2/onPermissionsGranted switching to video call");
                this.A12.A0J();
            } else if (i2 != 2) {
                if (i2 != 3) {
                    AnonymousClass00B.A0B("Unknown request code", false);
                } else if (Voip.A09(A3B.callState)) {
                    String str = this.A1g;
                    if (!r6.A12(str)) {
                        TelephonyManager telephonyManager = r6.A1Y;
                        int A012 = C30341cC.A01(telephonyManager, r6.A2F);
                        if (A012 != 0) {
                            StringBuilder sb = new StringBuilder("voip/acceptCall/cellularCallInProgress ");
                            sb.append(A012);
                            Log.w(sb.toString());
                            r6.A0w(str, "busy", 1);
                            return;
                        } else if (telephonyManager != null) {
                            telephonyManager.listen(r6.A0Q, 32);
                        }
                    }
                    r6.A0X(1, str, false);
                }
            } else if (A3B.isPeerRequestingUpgrade()) {
                Voip.refreshVideoDevice();
                A3k(A3B.self, this.A18);
                C447225g r3 = this.A12;
                r3.A0V();
                r3.A2f.setRequestedCamera2SupportLevel(r3.A1j.A02(), r3.A1i);
                r3.A14.execute(new RunnableRunnableShape0S0000000_I0(3));
            }
        }
    }

    public void AVT(boolean z2) {
        AnonymousClass00B.A01();
        Window window = getWindow();
        View childAt = ((ViewGroup) window.getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt == null) {
            Log.w("voip/voipactivity/ear-near - failed to get view.");
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z2) {
            Log.i("voip/voipactivity/ear-near. changing visibility of the window.");
            if (childAt.getVisibility() == 0) {
                attributes.flags |= 1024;
                attributes.screenBrightness = 0.1f;
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
                childAt.setVisibility(4);
                window.setAttributes(attributes);
            }
            this.A0F.removeMessages(2);
            this.A0F.sendEmptyMessageDelayed(2, 3000);
            return;
        }
        Log.i("voip/voipactivity/ear-far. changing visibility of the window.");
        if (childAt.getVisibility() == 4) {
            attributes.flags &= -1025;
            attributes.screenBrightness = -1.0f;
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -3);
            childAt.setVisibility(0);
            window.setAttributes(attributes);
        }
        this.A0F.removeMessages(2);
    }

    public void AcY(C32001fU r4) {
        Log.i("VoipActivityV2/restartCameraPreview ");
        this.A0F.removeMessages(12);
        if (!this.A0C.A0E(C16620tM.A02, 2222) || !this.A20) {
            A3W();
            A3k(r4, this.A18);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if ((r1.A01() instanceof X.C72883mr) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AhO(com.whatsapp.voipcalling.CallInfo r4, int r5, boolean r6) {
        /*
            r3 = this;
            X.AnonymousClass00B.A01()
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r3.A1d
            if (r0 == 0) goto L_0x0024
            com.obwhatsapp.calling.views.VoipCallFooter r2 = r0.A0P
            if (r2 == 0) goto L_0x0024
            com.obwhatsapp.calling.avatar.CallAvatarViewModel r0 = r3.A0o
            X.2OJ r1 = r0.A04
            java.lang.Object r0 = r1.A01()
            boolean r0 = r0 instanceof X.C72893ms
            if (r0 != 0) goto L_0x0020
            java.lang.Object r0 = r1.A01()
            boolean r1 = r0 instanceof X.C72883mr
            r0 = 0
            if (r1 == 0) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            r2.A02(r4, r5, r6, r0)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.AhO(com.whatsapp.voipcalling.CallInfo, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r0.A0A(r8) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if ((r1.A01() instanceof X.C72883mr) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AhR(com.whatsapp.voipcalling.CallInfo r8) {
        /*
            r7 = this;
            com.whatsapp.voipcalling.CallState r1 = r7.A3C(r8)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x007b
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r1)
            if (r0 != 0) goto L_0x007b
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r7.A1d
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0041
            com.obwhatsapp.calling.views.VoipCallFooter r6 = r0.A0P
            if (r6 == 0) goto L_0x0041
            X.25g r0 = r7.A12
            if (r0 == 0) goto L_0x0081
            X.26Z r0 = r0.A1k
            int r5 = r0.A00
            boolean r0 = r0.A0A(r8)
            r2 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            com.obwhatsapp.calling.avatar.CallAvatarViewModel r0 = r7.A0o
            X.2OJ r1 = r0.A04
            java.lang.Object r0 = r1.A01()
            boolean r0 = r0 instanceof X.C72893ms
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r1.A01()
            boolean r1 = r0 instanceof X.C72883mr
            r0 = 0
            if (r1 == 0) goto L_0x003e
        L_0x003d:
            r0 = 1
        L_0x003e:
            r6.A02(r8, r5, r2, r0)
        L_0x0041:
            android.view.ViewGroup r0 = r7.A0S
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0062
            android.view.ViewGroup r2 = r7.A0S
            com.whatsapp.jid.GroupJid r0 = r8.groupJid
            if (r0 != 0) goto L_0x005f
            com.whatsapp.voipcalling.CallState r1 = r8.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0059
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x007f
        L_0x0059:
            boolean r0 = r8.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x007f
        L_0x005f:
            X.C62043Bk.A05(r2, r4)
        L_0x0062:
            android.widget.ImageButton r2 = r7.A0T
            com.whatsapp.voipcalling.CallState r1 = r8.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0072
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 == r0) goto L_0x0072
            boolean r0 = r7.A1k
            if (r0 == 0) goto L_0x007c
        L_0x0072:
            X.1fU r0 = r8.self
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x007c
        L_0x0078:
            r2.setVisibility(r3)
        L_0x007b:
            return
        L_0x007c:
            r3 = 8
            goto L_0x0078
        L_0x007f:
            r4 = 0
            goto L_0x005f
        L_0x0081:
            r5 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.AhR(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void Ahj(CallInfo callInfo) {
        if (callInfo.callId.equals(this.A1g)) {
            this.A1r = false;
            this.A0F.removeMessages(10);
            if (callInfo.callState != CallState.NONE && !callInfo.callEnding) {
                this.A0l.clearAnimation();
                if (callInfo.isEitherSideRequestingUpgrade()) {
                    this.A1k = false;
                }
                A3r(callInfo);
                if (!callInfo.isGroupCall || !this.A20 || !this.A0C.A0E(C16620tM.A02, 2269)) {
                    A3s(callInfo);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0159, code lost:
        if (r1 == 1) goto L_0x015b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0243  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callStateChanged(com.whatsapp.voipcalling.CallState r12, com.whatsapp.voipcalling.CallInfo r13) {
        /*
            r11 = this;
            if (r13 != 0) goto L_0x000c
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged info == NULL finishing current activity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0008:
            r11.finish()
        L_0x000b:
            return
        L_0x000c:
            com.whatsapp.voipcalling.CallState r9 = r11.A3C(r13)
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.LINK
            if (r12 != r2) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r9 == r0) goto L_0x001c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r9 != r0) goto L_0x0020
        L_0x001c:
            java.lang.String r0 = r13.callId
            r11.A1g = r0
        L_0x0020:
            java.lang.String r1 = r13.callId
            java.lang.String r0 = r11.A1g
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged from "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r12 != r0) goto L_0x004b
            r11.A3G()
        L_0x004b:
            if (r9 != r0) goto L_0x02a9
            androidx.fragment.app.DialogFragment r0 = r11.A0f
            if (r0 == 0) goto L_0x0057
            r0.A1D()
            r0 = 0
            r11.A0f = r0
        L_0x0057:
            android.view.Window r1 = r11.getWindow()
            r0 = 128(0x80, float:1.794E-43)
            r1.clearFlags(r0)
            int r5 = r13.callResult
            java.lang.String r4 = r11.A1f
            r3 = 0
            r2 = 1
            if (r4 == 0) goto L_0x00e8
            java.lang.String r1 = "voip/VoipActivityV2/callStateChanged state == NONE showing text: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r11.A1v
            if (r0 == 0) goto L_0x0097
            r11.A3H()
        L_0x0081:
            X.1fV r1 = r13.callWaitingInfo
            int r0 = r1.A01
            if (r0 != r2) goto L_0x0094
            java.lang.String r1 = r1.A04
            r11.A1g = r1
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r11.A0t
            if (r0 == 0) goto L_0x0094
            X.26b r0 = r0.A0D
            r0.A0A(r1)
        L_0x0094:
            r11.A1k = r3
            return
        L_0x0097:
            X.0tH r0 = r11.A0i
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00a9
            X.0pt r1 = r11.A05
            X.0pS r0 = r1.A00
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r11.A1f
            r1.A0N(r0, r2)
            goto L_0x0081
        L_0x00a9:
            X.25g r5 = r11.A12
            if (r5 == 0) goto L_0x00e2
            java.lang.String r4 = r11.A1f
            java.lang.String r1 = "voip/showCallFailedMessage "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tH r0 = r5.A1Z
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            android.content.Context r5 = r5.A1X
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r7 = 0
            r10 = r7
            r9 = r7
            android.content.Intent r1 = X.C14750ph.A0b(r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "showCallFailedMessage"
            r1.putExtra(r0, r4)
            r5.startActivity(r1)
            goto L_0x0081
        L_0x00e2:
            java.lang.String r0 = "can not show call failed message because voice service is null."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0081
        L_0x00e8:
            com.whatsapp.voipcalling.CallState r8 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            r6 = 10
            if (r12 != r8) goto L_0x011c
            if (r5 == r6) goto L_0x00f4
            r0 = 25
            if (r5 != r0) goto L_0x011c
        L_0x00f4:
            X.25g r0 = r11.A12
            if (r0 == 0) goto L_0x011c
            int r1 = r0.A2p
            r0 = 26
            if (r1 != r0) goto L_0x011c
            r4 = 7
        L_0x00ff:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "finish"
            r1.putBoolean(r0, r2)
            com.obwhatsapp.consumer.di.bridge.calling.IDxCListenerShape65S0100000_2_I0 r0 = new com.obwhatsapp.consumer.di.bridge.calling.IDxCListenerShape65S0100000_2_I0
            r0.<init>(r11, r2)
            com.whatsapp.voipcalling.VoipErrorDialogFragment r4 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A01(r1, r0, r4)
            X.02C r1 = r11.AGM()
            r0 = 0
            r4.A1G(r1, r0)
            goto L_0x0081
        L_0x011c:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r12 == r0) goto L_0x0130
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r12 == r0) goto L_0x0130
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r12 == r0) goto L_0x0130
            if (r12 == r8) goto L_0x0130
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r12 != r0) goto L_0x0261
            if (r5 == r2) goto L_0x0261
        L_0x0130:
            boolean r0 = r11.A1o
            if (r0 != 0) goto L_0x0261
            X.25g r0 = r11.A12
            if (r0 == 0) goto L_0x0261
            java.lang.String r1 = "voip/VoipActivityV2/callStateChanged state == NONE showing call failed screen, result="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r13.videoEnabled
            if (r0 == 0) goto L_0x015f
            com.obwhatsapp.calling.CallDetailsLayout r7 = r11.A0l
            boolean r4 = r7.A07(r13)
            int r1 = r11.A01
            if (r1 == 0) goto L_0x015b
            r0 = 0
            if (r1 != r2) goto L_0x015c
        L_0x015b:
            r0 = 1
        L_0x015c:
            r7.A04(r9, r4, r0, r3)
        L_0x015f:
            r4 = 17
            r1 = 2
            if (r5 == r1) goto L_0x0206
            if (r5 == r4) goto L_0x0206
            r0 = 4
            if (r5 != r0) goto L_0x0202
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r12 == r0) goto L_0x0206
        L_0x016d:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r12 == r0) goto L_0x028d
            com.whatsapp.jid.UserJid r0 = r13.getPeerJid()
            X.AnonymousClass00B.A06(r0)
            boolean r7 = r13.videoEnabled
            if (r0 != 0) goto L_0x0186
            java.lang.String r0 = "VoipActivityV2 vm showCallFailedScreen: cannot show buttons. got null jid"
        L_0x017e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.finish()
            goto L_0x0081
        L_0x0186:
            r11.A3X()
            java.lang.String r1 = r11.A3F(r0, r5)
            com.obwhatsapp.calling.CallDetailsLayout r0 = r11.A0l
            r0.A05(r1, r1)
            if (r1 == 0) goto L_0x0199
            X.01V r0 = r11.A08
            X.AnonymousClass2JP.A00(r11, r0, r1)
        L_0x0199:
            java.lang.String r0 = "CallControlSheet"
            r11.A2e(r0)
            android.view.View r0 = r11.A0K
            if (r0 != 0) goto L_0x01c3
            r0 = 2131362500(0x7f0a02c4, float:1.8344782E38)
            android.view.View r4 = r11.findViewById(r0)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            java.lang.String r1 = "voip/VoipActivityV2/showCallFailedScreen found callFailedButtonsStub:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.View r0 = r4.inflate()
            r11.A0K = r0
        L_0x01c3:
            r0 = 2131362573(0x7f0a030d, float:1.834493E38)
            android.view.View r6 = r11.findViewById(r0)
            r0 = 2131362481(0x7f0a02b1, float:1.8344744E38)
            android.view.View r5 = r11.findViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.view.View r4 = r11.A0K
            if (r7 == 0) goto L_0x01fb
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131101641(0x7f0607c9, float:1.7815697E38)
            int r0 = r1.getColor(r0)
            int r0 = com.obwhatsapp.yo.yo.getUniversalColor()
            r4.setBackgroundColor(r0)
            r0 = 2131231549(0x7f08033d, float:1.8079182E38)
        L_0x01ec:
            r5.setImageResource(r0)
            java.lang.String r0 = "VoipActivityV2 vm showing call failed screen"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.View$OnClickListener r0 = r11.A0G
            if (r0 != 0) goto L_0x0273
            java.lang.String r0 = "VoipActivityV2 vm showCallFailedScreen: cannot show buttons. got null call back button click listener"
            goto L_0x017e
        L_0x01fb:
            r4.setBackgroundColor(r3)
            r0 = 2131231550(0x7f08033e, float:1.8079184E38)
            goto L_0x01ec
        L_0x0202:
            if (r5 != r6) goto L_0x016d
            if (r12 != r8) goto L_0x016d
        L_0x0206:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r12 != r0) goto L_0x0249
            boolean r0 = r13.isEndedByMe
            if (r0 != 0) goto L_0x0008
            r0 = 2131892901(0x7f121aa5, float:1.9420563E38)
        L_0x0211:
            java.lang.String r1 = r11.getString(r0)
        L_0x0215:
            X.01V r0 = r11.A08
            X.AnonymousClass2JP.A00(r11, r0, r1)
            android.view.View r0 = r11.A0O
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0243
            r11.A3u(r1, r3)
        L_0x0225:
            X.01V r0 = r11.A08
            android.os.Vibrator r4 = r0.A0K()
            X.AnonymousClass00B.A06(r4)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.vibrate(r0)
            android.os.Handler r0 = r11.A0F
            r5 = 9
            r0.removeMessages(r5)
            android.os.Handler r4 = r11.A0F
            r0 = 2000(0x7d0, double:9.88E-321)
            r4.sendEmptyMessageDelayed(r5, r0)
            goto L_0x0081
        L_0x0243:
            com.obwhatsapp.calling.CallDetailsLayout r0 = r11.A0l
            r0.A05(r1, r1)
            goto L_0x0225
        L_0x0249:
            if (r5 != r4) goto L_0x024f
            r0 = 2131893012(0x7f121b14, float:1.9420789E38)
            goto L_0x0211
        L_0x024f:
            if (r5 != r1) goto L_0x0255
            r0 = 2131892879(0x7f121a8f, float:1.9420519E38)
            goto L_0x0211
        L_0x0255:
            com.whatsapp.jid.UserJid r0 = r13.getPeerJid()
            X.AnonymousClass00B.A06(r0)
            java.lang.String r1 = r11.A3F(r0, r5)
            goto L_0x0215
        L_0x0261:
            if (r12 != r8) goto L_0x0292
            boolean r0 = r13.isGroupCall
            if (r0 == 0) goto L_0x0292
            boolean r0 = r13.isEndedByMe
            if (r0 != 0) goto L_0x0292
            int r0 = r13.callResult
            if (r0 != r6) goto L_0x0292
            r4 = 8
            goto L_0x00ff
        L_0x0273:
            r5.setOnClickListener(r0)
            r1 = 28
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r0 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7
            r0.<init>(r11, r1)
            r6.setOnClickListener(r0)
            android.view.View r0 = r11.A0K
            r0.setVisibility(r3)
            A0A(r5)
            A0A(r6)
            goto L_0x0081
        L_0x028d:
            r11.finish()
            goto L_0x0081
        L_0x0292:
            boolean r0 = r11.A1u
            if (r0 == 0) goto L_0x029e
            X.0pt r1 = r11.A05
            r0 = 2131892842(0x7f121a6a, float:1.9420444E38)
            r1.A09(r0, r2)
        L_0x029e:
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged state == NONE finishing current activity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.finish()
            goto L_0x0081
        L_0x02a9:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r9 != r0) goto L_0x02d5
            boolean r0 = r13.videoEnabled
            if (r0 == 0) goto L_0x02be
            boolean r0 = r11.A24
            if (r0 != 0) goto L_0x02b7
            if (r12 != r2) goto L_0x02be
        L_0x02b7:
            X.1fU r1 = r13.self
            X.39w r0 = r11.A18
            r11.A3k(r1, r0)
        L_0x02be:
            com.whatsapp.voipcalling.CallState r0 = r13.callState
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x02cd;
                case 1: goto L_0x02cb;
                case 2: goto L_0x02cb;
                case 3: goto L_0x02d0;
                case 4: goto L_0x02cb;
                case 5: goto L_0x02cb;
                case 6: goto L_0x02cb;
                case 7: goto L_0x02c7;
                case 8: goto L_0x02c7;
                case 9: goto L_0x02c7;
                case 10: goto L_0x02c7;
                case 11: goto L_0x02cb;
                default: goto L_0x02c7;
            }
        L_0x02c7:
            r11.A3s(r13)
            return
        L_0x02cb:
            r0 = 0
            goto L_0x02d1
        L_0x02cd:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x02d1
        L_0x02d0:
            r0 = 2
        L_0x02d1:
            r11.setVolumeControlStream(r0)
            goto L_0x02c7
        L_0x02d5:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r9 != r0) goto L_0x02be
            boolean r0 = r13.videoEnabled
            if (r0 == 0) goto L_0x02be
            goto L_0x02b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.callStateChanged(com.whatsapp.voipcalling.CallState, com.whatsapp.voipcalling.CallInfo):void");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C447225g r1;
        if (Build.VERSION.SDK_INT >= 21 || (r1 = this.A12) == null || r1.A1k.A00 == 1 || !r1.A1A) {
            return super.dispatchTouchEvent(motionEvent);
        }
        Log.i("voip/VoipActivityV2/dispatchTouchEvent Touch event ignored");
        return true;
    }

    public void hideView(View view) {
        view.clearAnimation();
        view.setVisibility(4);
    }

    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A1L;
        if (contactPickerFragment == null) {
            CallGridViewModel callGridViewModel = this.A0t;
            if (callGridViewModel != null) {
                AnonymousClass027 r1 = callGridViewModel.A08;
                if (r1.A01() != null) {
                    callGridViewModel.A0G((UserJid) r1.A01());
                    return;
                }
            }
            if (!A3z() || !A43(A3B())) {
                super.onBackPressed();
            }
        } else if (!contactPickerFragment.A1p()) {
            A3J();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CallGridViewModel callGridViewModel = this.A0t;
        if (callGridViewModel != null && (((Boolean) callGridViewModel.A0c.get()).booleanValue() || ((Boolean) callGridViewModel.A0d.get()).booleanValue())) {
            boolean z2 = false;
            if (configuration.orientation == 2) {
                z2 = true;
            }
            AnonymousClass2OJ r1 = callGridViewModel.A0O;
            if (((Boolean) r1.A01()).booleanValue() != z2) {
                r1.A0B(Boolean.valueOf(z2));
                callGridViewModel.A08();
                callGridViewModel.A0E(callGridViewModel.A0D.A04(), true);
            }
        }
        OrientationViewModel orientationViewModel = this.A0w;
        if (orientationViewModel != null) {
            orientationViewModel.A02 = ((Boolean) orientationViewModel.A08.get()).booleanValue();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0596, code lost:
        if ((r1 & 2) == 0) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02c1, code lost:
        if (r2.equalsIgnoreCase("OP4A57") == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0331, code lost:
        if (r2.startsWith("PD1818") == false) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x034b, code lost:
        if (r1.equalsIgnoreCase("davinciin") == false) goto L_0x034f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0403 A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x040f A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0451 A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x04c3 A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0534 A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x056d A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x058d A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x063a A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0667 A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0685 A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x06c7 A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03f1 A[Catch:{ all -> 0x07dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0402 A[Catch:{ all -> 0x07dd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r7 = r25
            r0 = r26
            super.onCreate(r0)
            X.0pd r1 = r7.A0C
            r0 = 1807(0x70f, float:2.532E-42)
            X.0tM r13 = X.C16620tM.A02
            boolean r16 = r1.A0E(r13, r0)
            java.lang.String r14 = "VoipActivityV2"
            java.lang.String r6 = "VoipActivityV2_onCreate"
            if (r16 == 0) goto L_0x0021
            X.10F r0 = r7.A02     // Catch:{ all -> 0x07dd }
            r0.A09(r14)     // Catch:{ all -> 0x07dd }
            X.10F r0 = r7.A02     // Catch:{ all -> 0x07dd }
            r0.A08(r6)     // Catch:{ all -> 0x07dd }
        L_0x0021:
            r0 = 2131892841(0x7f121a69, float:1.9420442E38)
            r7.setTitle(r0)     // Catch:{ all -> 0x07dd }
            X.1Kr r0 = r7.A0m     // Catch:{ all -> 0x07dd }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x07dd }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x07dd }
        L_0x002f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x07dd }
            X.5P5 r0 = (X.AnonymousClass5P5) r0     // Catch:{ all -> 0x07dd }
            r0.A94()     // Catch:{ all -> 0x07dd }
            goto L_0x002f
        L_0x003f:
            android.content.Intent r1 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "call_id"
            java.lang.String r0 = r1.getStringExtra(r0)     // Catch:{ all -> 0x07dd }
            r7.A1g = r0     // Catch:{ all -> 0x07dd }
            com.whatsapp.voipcalling.CallInfo r12 = r7.A3B()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = r7.A1g     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x0059
            if (r12 == 0) goto L_0x0059
            java.lang.String r0 = r12.callId     // Catch:{ all -> 0x07dd }
            r7.A1g = r0     // Catch:{ all -> 0x07dd }
        L_0x0059:
            r8 = 1
            r11 = 0
            if (r12 == 0) goto L_0x06e1
            com.whatsapp.voipcalling.CallState r1 = r12.callState     // Catch:{ all -> 0x07dd }
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE     // Catch:{ all -> 0x07dd }
            if (r1 == r0) goto L_0x06e1
            android.content.Intent r2 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            java.lang.String r1 = "lobbyEntryPoint"
            r0 = -1
            int r1 = r2.getIntExtra(r1, r0)     // Catch:{ all -> 0x07dd }
            java.lang.String r10 = "com.obwhatsapp.intent.action.ACCEPT_CALL"
            android.content.Intent r0 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = r0.getAction()     // Catch:{ all -> 0x07dd }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x07dd }
            r9 = 2
            if (r0 != 0) goto L_0x0087
            r0 = 7
            if (r1 == r0) goto L_0x0087
            if (r1 == r9) goto L_0x0087
            if (r1 == r8) goto L_0x0087
            goto L_0x008f
        L_0x0087:
            X.1An r1 = r7.A10     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = r7.A1g     // Catch:{ all -> 0x07dd }
            r1.A00(r0)     // Catch:{ all -> 0x07dd }
            goto L_0x0099
        L_0x008f:
            X.1An r2 = r7.A10     // Catch:{ all -> 0x07dd }
            java.lang.String r1 = r7.A1g     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "voipactivity_oncreate_start"
            r2.A02(r1, r0)     // Catch:{ all -> 0x07dd }
        L_0x0099:
            r7.A0C = r11     // Catch:{ all -> 0x07dd }
            r2 = 524288(0x80000, float:7.34684E-40)
            android.view.Window r0 = r7.getWindow()     // Catch:{ all -> 0x07dd }
            r0.addFlags(r2)     // Catch:{ all -> 0x07dd }
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r7.A1d     // Catch:{ all -> 0x07dd }
            if (r1 == 0) goto L_0x00bb
            android.app.Dialog r0 = r1.A03     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x00bb
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x00bb
            android.app.Dialog r0 = r1.A03     // Catch:{ all -> 0x07dd }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x07dd }
            r0.addFlags(r2)     // Catch:{ all -> 0x07dd }
        L_0x00bb:
            android.view.Window r1 = r7.getWindow()     // Catch:{ all -> 0x07dd }
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1.addFlags(r0)     // Catch:{ all -> 0x07dd }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x07dd }
            r0 = 27
            if (r1 < r0) goto L_0x00cd
            r7.setTurnScreenOn(r8)     // Catch:{ all -> 0x07dd }
        L_0x00cd:
            r0 = 2131559915(0x7f0d05eb, float:1.8745188E38)
            r7.setContentView((int) r0)     // Catch:{ all -> 0x07dd }
            r0 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            r7.A0M = r0     // Catch:{ all -> 0x07dd }
            r0 = 2131362528(0x7f0a02e0, float:1.834484E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            r7.A0L = r0     // Catch:{ all -> 0x07dd }
            r0 = 2131362482(0x7f0a02b2, float:1.8344746E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.WaImageView r0 = (com.obwhatsapp.WaImageView) r0     // Catch:{ all -> 0x07dd }
            r7.A0j = r0     // Catch:{ all -> 0x07dd }
            android.view.Window r0 = r7.getWindow()     // Catch:{ all -> 0x07dd }
            android.view.View r1 = r0.getDecorView()     // Catch:{ all -> 0x07dd }
            int r0 = r1.getSystemUiVisibility()     // Catch:{ all -> 0x07dd }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.setSystemUiVisibility(r0)     // Catch:{ all -> 0x07dd }
            android.content.res.Resources r3 = r7.getResources()     // Catch:{ all -> 0x07dd }
            java.lang.String r2 = "status_bar_height"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r1 = r3.getIdentifier(r2, r1, r0)     // Catch:{ all -> 0x07dd }
            if (r1 <= 0) goto L_0x0150
            android.content.res.Resources r0 = r7.getResources()     // Catch:{ all -> 0x07dd }
            int r0 = r0.getDimensionPixelSize(r1)     // Catch:{ all -> 0x07dd }
        L_0x011a:
            r7.A06 = r0     // Catch:{ all -> 0x07dd }
            X.0rz r1 = r7.A09     // Catch:{ all -> 0x07dd }
            X.0pd r0 = r7.A0C     // Catch:{ all -> 0x07dd }
            boolean r0 = X.C30341cC.A0M(r1, r0)     // Catch:{ all -> 0x07dd }
            r7.A1x = r0     // Catch:{ all -> 0x07dd }
            X.0pd r1 = r7.A0C     // Catch:{ all -> 0x07dd }
            r0 = 1943(0x797, float:2.723E-42)
            boolean r0 = r1.A0E(r13, r0)     // Catch:{ all -> 0x07dd }
            r7.A1m = r0     // Catch:{ all -> 0x07dd }
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ all -> 0x07dd }
            r0 = 2131166389(0x7f0704b5, float:1.7947022E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x07dd }
            r7.A07 = r0     // Catch:{ all -> 0x07dd }
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ all -> 0x07dd }
            r0 = 2131165437(0x7f0700fd, float:1.7945091E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x07dd }
            r7.A02 = r0     // Catch:{ all -> 0x07dd }
            boolean r1 = r12.videoEnabled     // Catch:{ all -> 0x07dd }
            r0 = 1
            if (r1 != 0) goto L_0x0154
            goto L_0x0153
        L_0x0150:
            r0 = 25
            goto L_0x011a
        L_0x0153:
            r0 = 0
        L_0x0154:
            r7.A3x(r0)     // Catch:{ all -> 0x07dd }
            boolean r0 = r7.A3z()     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x0164
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder     // Catch:{ all -> 0x07dd }
            r0.<init>()     // Catch:{ all -> 0x07dd }
            r7.A0B = r0     // Catch:{ all -> 0x07dd }
        L_0x0164:
            X.02z r1 = new X.02z     // Catch:{ all -> 0x07dd }
            r1.<init>(r7)     // Catch:{ all -> 0x07dd }
            java.lang.Class<com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel> r0 = com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel.class
            X.01n r0 = r1.A01(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r0 = (com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel) r0     // Catch:{ all -> 0x07dd }
            r7.A0v = r0     // Catch:{ all -> 0x07dd }
            X.027 r2 = r0.A04     // Catch:{ all -> 0x07dd }
            r1 = 299(0x12b, float:4.19E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r0 = r7.A0v     // Catch:{ all -> 0x07dd }
            X.1cy r2 = r0.A0C     // Catch:{ all -> 0x07dd }
            r1 = 63
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x07dd }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r0 = r7.A0v     // Catch:{ all -> 0x07dd }
            X.1cy r2 = r0.A0B     // Catch:{ all -> 0x07dd }
            r1 = 298(0x12a, float:4.18E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            X.02z r1 = new X.02z     // Catch:{ all -> 0x07dd }
            r1.<init>(r7)     // Catch:{ all -> 0x07dd }
            java.lang.Class<com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel> r0 = com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel.class
            X.01n r0 = r1.A01(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = (com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel) r0     // Catch:{ all -> 0x07dd }
            r7.A0w = r0     // Catch:{ all -> 0x07dd }
            X.027 r2 = r0.A06     // Catch:{ all -> 0x07dd }
            r1 = 304(0x130, float:4.26E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            r0 = 2131362501(0x7f0a02c5, float:1.8344784E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = (com.obwhatsapp.calling.callgrid.view.CallGrid) r0     // Catch:{ all -> 0x07dd }
            r7.A0p = r0     // Catch:{ all -> 0x07dd }
            X.04p r1 = r7.A06     // Catch:{ all -> 0x07dd }
            X.05T r0 = r0.A0P     // Catch:{ all -> 0x07dd }
            r1.A00(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.view.CallGrid r2 = r7.A0p     // Catch:{ all -> 0x07dd }
            r1 = 5
            com.facebook.redex.IDxCListenerShape243S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape243S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x07dd }
            r2.addOnLayoutChangeListener(r0)     // Catch:{ all -> 0x07dd }
            X.02z r1 = new X.02z     // Catch:{ all -> 0x07dd }
            r1.<init>(r7)     // Catch:{ all -> 0x07dd }
            java.lang.Class<com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel> r0 = com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel.class
            X.01n r0 = r1.A01(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = (com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel) r0     // Catch:{ all -> 0x07dd }
            r7.A0t = r0     // Catch:{ all -> 0x07dd }
            java.lang.String r1 = r7.A1g     // Catch:{ all -> 0x07dd }
            X.26b r0 = r0.A0D     // Catch:{ all -> 0x07dd }
            r0.A0A(r1)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r7.A0t     // Catch:{ all -> 0x07dd }
            X.027 r2 = r0.A08     // Catch:{ all -> 0x07dd }
            r1 = 308(0x134, float:4.32E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r7.A0t     // Catch:{ all -> 0x07dd }
            X.027 r2 = r0.A0A     // Catch:{ all -> 0x07dd }
            r1 = 65
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x07dd }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r7.A0t     // Catch:{ all -> 0x07dd }
            X.1cy r2 = r0.A0Y     // Catch:{ all -> 0x07dd }
            r1 = 307(0x133, float:4.3E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r7.A0t     // Catch:{ all -> 0x07dd }
            X.2OJ r2 = r0.A0R     // Catch:{ all -> 0x07dd }
            r1 = 302(0x12e, float:4.23E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r7.A0t     // Catch:{ all -> 0x07dd }
            X.1cy r2 = r0.A0X     // Catch:{ all -> 0x07dd }
            r1 = 303(0x12f, float:4.25E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r7.A0t     // Catch:{ all -> 0x07dd }
            X.027 r2 = r0.A09     // Catch:{ all -> 0x07dd }
            r1 = 306(0x132, float:4.29E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            X.02z r1 = new X.02z     // Catch:{ all -> 0x07dd }
            r1.<init>(r7)     // Catch:{ all -> 0x07dd }
            java.lang.Class<com.obwhatsapp.calling.avatar.CallAvatarViewModel> r0 = com.obwhatsapp.calling.avatar.CallAvatarViewModel.class
            X.01n r0 = r1.A01(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.avatar.CallAvatarViewModel r0 = (com.obwhatsapp.calling.avatar.CallAvatarViewModel) r0     // Catch:{ all -> 0x07dd }
            r7.A0o = r0     // Catch:{ all -> 0x07dd }
            X.2OJ r2 = r0.A04     // Catch:{ all -> 0x07dd }
            r1 = 64
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x07dd }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.view.CallGrid r1 = r7.A0p     // Catch:{ all -> 0x07dd }
            X.4wZ r0 = new X.4wZ     // Catch:{ all -> 0x07dd }
            r0.<init>(r7)     // Catch:{ all -> 0x07dd }
            r1.A02 = r0     // Catch:{ all -> 0x07dd }
            X.2Tx r0 = r7.A0z     // Catch:{ all -> 0x07dd }
            X.028 r2 = r0.AAM()     // Catch:{ all -> 0x07dd }
            r1 = 301(0x12d, float:4.22E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            android.view.Window r0 = r7.getWindow()     // Catch:{ all -> 0x07dd }
            android.view.View r1 = r0.getDecorView()     // Catch:{ all -> 0x07dd }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ all -> 0x07dd }
            r0.<init>()     // Catch:{ all -> 0x07dd }
            r1.getWindowVisibleDisplayFrame(r0)     // Catch:{ all -> 0x07dd }
            int r5 = r0.height()     // Catch:{ all -> 0x07dd }
            int r4 = r0.width()     // Catch:{ all -> 0x07dd }
            boolean r0 = r12.isCaller     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034f
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "asus"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x02a1
            java.lang.String r2 = android.os.Build.DEVICE     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "ASUS_I01WD"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
        L_0x02a1:
            java.lang.String r0 = "oppo"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x02c3
            java.lang.String r2 = android.os.Build.DEVICE     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "OP4863"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "OP4B65L1"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "OP4A57"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
        L_0x02c3:
            java.lang.String r0 = "Realme"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x02d5
            java.lang.String r2 = android.os.Build.DEVICE     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "RMX1901"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
        L_0x02d5:
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x02e8
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "r1q"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
        L_0x02e8:
            java.lang.String r0 = "vivo"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x0333
            java.lang.String r2 = android.os.Build.DEVICE     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "1805"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "PD1805"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "1909"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "1910"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "1910N"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "1819"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "1818"
            boolean r0 = r2.startsWith(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "PD1818"
            boolean r0 = r2.startsWith(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
        L_0x0333:
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x034f
            java.lang.String r1 = android.os.Build.DEVICE     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "raphaelin"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "davinciin"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x034f
        L_0x034d:
            r0 = 1
            goto L_0x0350
        L_0x034f:
            r0 = 0
        L_0x0350:
            r7.A24 = r0     // Catch:{ all -> 0x07dd }
            r0 = 2131362670(0x7f0a036e, float:1.8345127E38)
            android.view.View r1 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            r7.A0O = r1     // Catch:{ all -> 0x07dd }
            r0 = 2131362671(0x7f0a036f, float:1.834513E38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x07dd }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x07dd }
            r7.A0Z = r0     // Catch:{ all -> 0x07dd }
            android.view.View r1 = r7.A0O     // Catch:{ all -> 0x07dd }
            r0 = 2131362669(0x7f0a036d, float:1.8345125E38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x07dd }
            r7.A0N = r0     // Catch:{ all -> 0x07dd }
            android.view.View r1 = r7.A0O     // Catch:{ all -> 0x07dd }
            r0 = 2131362668(0x7f0a036c, float:1.8345123E38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x07dd }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x07dd }
            r7.A0Y = r0     // Catch:{ all -> 0x07dd }
            X.AnonymousClass1UP.A06(r0)     // Catch:{ all -> 0x07dd }
            r0 = 2131232654(0x7f08078e, float:1.8081423E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r7, r0)     // Catch:{ all -> 0x07dd }
            r7.A0C = r0     // Catch:{ all -> 0x07dd }
            r1 = 26
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r0 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7     // Catch:{ all -> 0x07dd }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x07dd }
            r7.A0H = r0     // Catch:{ all -> 0x07dd }
            r1 = 25
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r0 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7     // Catch:{ all -> 0x07dd }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x07dd }
            r7.A0I = r0     // Catch:{ all -> 0x07dd }
            r0 = 2131362497(0x7f0a02c1, float:1.8344776E38)
            android.view.View r1 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.CallDetailsLayout r1 = (com.obwhatsapp.calling.CallDetailsLayout) r1     // Catch:{ all -> 0x07dd }
            r7.A0l = r1     // Catch:{ all -> 0x07dd }
            int r0 = r7.A06     // Catch:{ all -> 0x07dd }
            r1.setPadding(r11, r0, r11, r11)     // Catch:{ all -> 0x07dd }
            X.0uh r2 = r7.A1J     // Catch:{ all -> 0x07dd }
            r1 = 0
            java.lang.String r0 = "voip-activity-picture-grid"
            X.2Ao r0 = r2.A05(r0, r1, r4)     // Catch:{ all -> 0x07dd }
            r7.A1I = r0     // Catch:{ all -> 0x07dd }
            android.view.View r1 = r7.A0M     // Catch:{ all -> 0x07dd }
            r0 = 2131366685(0x7f0a131d, float:1.835327E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)     // Catch:{ all -> 0x07dd }
            r7.A0R = r0     // Catch:{ all -> 0x07dd }
            r0 = 2131363351(0x7f0a0617, float:1.8346508E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x07dd }
            r7.A0b = r0     // Catch:{ all -> 0x07dd }
            r0 = 2131363353(0x7f0a0619, float:1.8346512E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ all -> 0x07dd }
            r7.A0U = r0     // Catch:{ all -> 0x07dd }
            r0 = 2131363347(0x7f0a0613, float:1.83465E38)
            android.view.View r2 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            r7.A0P = r2     // Catch:{ all -> 0x07dd }
            r1 = 7
            com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1     // Catch:{ all -> 0x07dd }
            r0.<init>(r7, r1, r12)     // Catch:{ all -> 0x07dd }
            r2.setOnClickListener(r0)     // Catch:{ all -> 0x07dd }
            android.view.View r2 = r7.A0P     // Catch:{ all -> 0x07dd }
            boolean r0 = r12.videoEnabled     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x0403
            r0 = 2131892884(0x7f121a94, float:1.9420529E38)
            java.lang.String r3 = r7.getString(r0)     // Catch:{ all -> 0x07dd }
        L_0x03f8:
            X.0pd r1 = r7.A0C     // Catch:{ all -> 0x07dd }
            r0 = 2541(0x9ed, float:3.56E-42)
            boolean r0 = r1.A0E(r13, r0)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x040f
            goto L_0x040b
        L_0x0403:
            r0 = 2131892882(0x7f121a92, float:1.9420525E38)
            java.lang.String r3 = r7.getString(r0)     // Catch:{ all -> 0x07dd }
            goto L_0x03f8
        L_0x040b:
            r0 = 2131892880(0x7f121a90, float:1.942052E38)
            goto L_0x0411
        L_0x040f:
            r1 = 0
            goto L_0x0415
        L_0x0411:
            java.lang.String r1 = r7.getString(r0)     // Catch:{ all -> 0x07dd }
        L_0x0415:
            X.3P9 r0 = new X.3P9     // Catch:{ all -> 0x07dd }
            r0.<init>(r2, r3, r1, r8)     // Catch:{ all -> 0x07dd }
            X.C004601z.A0j(r2, r0)     // Catch:{ all -> 0x07dd }
            r0 = 2131366692(0x7f0a1324, float:1.8353285E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0     // Catch:{ all -> 0x07dd }
            r7.A0T = r0     // Catch:{ all -> 0x07dd }
            android.view.View r1 = r7.A0M     // Catch:{ all -> 0x07dd }
            r0 = 2131366683(0x7f0a131b, float:1.8353266E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)     // Catch:{ all -> 0x07dd }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x07dd }
            r7.A0S = r0     // Catch:{ all -> 0x07dd }
            android.view.View r1 = r7.A0M     // Catch:{ all -> 0x07dd }
            r0 = 2131361965(0x7f0a00ad, float:1.8343697E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)     // Catch:{ all -> 0x07dd }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ all -> 0x07dd }
            r7.A0W = r0     // Catch:{ all -> 0x07dd }
            android.view.View r1 = r7.A0M     // Catch:{ all -> 0x07dd }
            r0 = 2131361964(0x7f0a00ac, float:1.8343695E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)     // Catch:{ all -> 0x07dd }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x07dd }
            r7.A0d = r0     // Catch:{ all -> 0x07dd }
            if (r16 == 0) goto L_0x0460
            X.10F r13 = r7.A02     // Catch:{ all -> 0x07dd }
            android.view.View r3 = r7.A0R     // Catch:{ all -> 0x07dd }
            r2 = 4
            r1 = 31
            com.facebook.redex.RunnableRunnableShape16S0100000_I0_15 r0 = new com.facebook.redex.RunnableRunnableShape16S0100000_I0_15     // Catch:{ all -> 0x07dd }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x07dd }
            r13.A04(r3, r0, r14, r2)     // Catch:{ all -> 0x07dd }
        L_0x0460:
            r0 = 24
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r3 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7     // Catch:{ all -> 0x07dd }
            r3.<init>(r7, r0)     // Catch:{ all -> 0x07dd }
            r7.A3R()     // Catch:{ all -> 0x07dd }
            r7.A3T()     // Catch:{ all -> 0x07dd }
            X.02z r1 = new X.02z     // Catch:{ all -> 0x07dd }
            r1.<init>(r7)     // Catch:{ all -> 0x07dd }
            java.lang.Class<com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel> r0 = com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel.class
            X.01n r0 = r1.A01(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = (com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r0     // Catch:{ all -> 0x07dd }
            r7.A0u = r0     // Catch:{ all -> 0x07dd }
            X.1cy r2 = r0.A09     // Catch:{ all -> 0x07dd }
            r1 = 66
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r0 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x07dd }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r7.A0u     // Catch:{ all -> 0x07dd }
            X.1cy r2 = r0.A07     // Catch:{ all -> 0x07dd }
            r1 = 305(0x131, float:4.27E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            android.view.View r1 = r7.A0M     // Catch:{ all -> 0x07dd }
            r0 = 2131364102(0x7f0a0906, float:1.8348032E38)
            android.view.View r13 = X.C004601z.A0E(r1, r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner r13 = (com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner) r13     // Catch:{ all -> 0x07dd }
            r7.A0s = r13     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r14 = r7.A0u     // Catch:{ all -> 0x07dd }
            r13.A04 = r14     // Catch:{ all -> 0x07dd }
            X.1cy r2 = r14.A08     // Catch:{ all -> 0x07dd }
            r1 = 86
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((java.lang.Object) r13, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            X.1cy r2 = r14.A06     // Catch:{ all -> 0x07dd }
            r1 = 87
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((java.lang.Object) r13, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
            boolean r0 = r7.A1x     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x0506
            int r2 = r7.A02     // Catch:{ all -> 0x07dd }
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ all -> 0x07dd }
            r0 = 2131167293(0x7f07083d, float:1.7948856E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x07dd }
            int r2 = r2 - r0
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r14 = r7.A0t     // Catch:{ all -> 0x07dd }
            X.AnonymousClass00B.A06(r14)     // Catch:{ all -> 0x07dd }
            boolean r0 = r7.A1m     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x04de
            r19 = 0
            r1 = 0
            goto L_0x04e2
        L_0x04de:
            r19 = r2
            int r1 = r7.A07     // Catch:{ all -> 0x07dd }
        L_0x04e2:
            int r13 = r7.A07     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner r0 = r7.A0s     // Catch:{ all -> 0x07dd }
            X.AnonymousClass00B.A04(r0)     // Catch:{ all -> 0x07dd }
            int r23 = r0.getBannerHeight()     // Catch:{ all -> 0x07dd }
            boolean r0 = r7.A1t     // Catch:{ all -> 0x07dd }
            r24 = 0
            if (r0 != 0) goto L_0x04f5
            r24 = 1
        L_0x04f5:
            X.4SA r0 = new X.4SA     // Catch:{ all -> 0x07dd }
            r18 = r14
            r20 = r1
            r21 = r2
            r22 = r13
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x07dd }
            r7.A0r = r0     // Catch:{ all -> 0x07dd }
        L_0x0506:
            android.widget.ImageButton r0 = r7.A0T     // Catch:{ all -> 0x07dd }
            r0.setOnClickListener(r3)     // Catch:{ all -> 0x07dd }
            android.widget.ImageButton r3 = r7.A0T     // Catch:{ all -> 0x07dd }
            r0 = 2131892936(0x7f121ac8, float:1.9420634E38)
            java.lang.String r2 = r7.getString(r0)     // Catch:{ all -> 0x07dd }
            r0 = 2131892935(0x7f121ac7, float:1.9420632E38)
            java.lang.String r1 = r7.getString(r0)     // Catch:{ all -> 0x07dd }
            X.3P9 r0 = new X.3P9     // Catch:{ all -> 0x07dd }
            r0.<init>(r3, r2, r1, r8)     // Catch:{ all -> 0x07dd }
            X.C004601z.A0j(r3, r0)     // Catch:{ all -> 0x07dd }
            android.view.ViewGroup r2 = r7.A0S     // Catch:{ all -> 0x07dd }
            r1 = 17
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r0 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7     // Catch:{ all -> 0x07dd }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x07dd }
            r2.setOnClickListener(r0)     // Catch:{ all -> 0x07dd }
            com.whatsapp.jid.GroupJid r1 = r12.groupJid     // Catch:{ all -> 0x07dd }
            r0 = 0
            if (r1 == 0) goto L_0x0535
            r0 = 1
        L_0x0535:
            r7.A3y(r0)     // Catch:{ all -> 0x07dd }
            r0 = 3
            com.facebook.redex.IDxTListenerShape166S0100000_1_I0 r15 = new com.facebook.redex.IDxTListenerShape166S0100000_1_I0     // Catch:{ all -> 0x07dd }
            r15.<init>(r7, r0)     // Catch:{ all -> 0x07dd }
            r0 = 21
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r14 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7     // Catch:{ all -> 0x07dd }
            r14.<init>(r7, r0)     // Catch:{ all -> 0x07dd }
            r0 = 19
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r13 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7     // Catch:{ all -> 0x07dd }
            r13.<init>(r7, r0)     // Catch:{ all -> 0x07dd }
            com.facebook.redex.IDxCListenerShape52S0200000_2_I0 r3 = new com.facebook.redex.IDxCListenerShape52S0200000_2_I0     // Catch:{ all -> 0x07dd }
            r3.<init>(r13, r9, r7)     // Catch:{ all -> 0x07dd }
            r0 = 2131366920(0x7f0a1408, float:1.8353747E38)
            android.view.View r2 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r2 = (com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout) r2     // Catch:{ all -> 0x07dd }
            r7.A17 = r2     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r0 = r2.A0Q     // Catch:{ all -> 0x07dd }
            r7.A16 = r0     // Catch:{ all -> 0x07dd }
            r2.A06 = r4     // Catch:{ all -> 0x07dd }
            r2.A05 = r5     // Catch:{ all -> 0x07dd }
            X.4wn r1 = new X.4wn     // Catch:{ all -> 0x07dd }
            r1.<init>(r7)     // Catch:{ all -> 0x07dd }
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r7.A1d     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x0570
            r2.setCommonViewListeners(r15, r13, r3)     // Catch:{ all -> 0x07dd }
        L_0x0570:
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r7.A17     // Catch:{ all -> 0x07dd }
            r0.setPipViewListeners(r1, r14)     // Catch:{ all -> 0x07dd }
            X.013 r0 = r7.A01     // Catch:{ all -> 0x07dd }
            boolean r0 = r0.A0T()     // Catch:{ all -> 0x07dd }
            r3 = r0 ^ 1
            X.1OL r0 = r7.A0n     // Catch:{ all -> 0x07dd }
            android.content.SharedPreferences r2 = r0.A01()     // Catch:{ all -> 0x07dd }
            java.lang.String r1 = "video_call_pip_position"
            r0 = -1
            int r1 = r2.getInt(r1, r0)     // Catch:{ all -> 0x07dd }
            if (r1 < 0) goto L_0x0598
            r0 = r1 & 1
            r3 = 0
            if (r0 != 0) goto L_0x0593
            r3 = 1
        L_0x0593:
            r0 = r1 & 2
            r2 = 0
            if (r0 != 0) goto L_0x0599
        L_0x0598:
            r2 = 1
        L_0x0599:
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r1 = r7.A17     // Catch:{ all -> 0x07dd }
            boolean r0 = r1.A0N     // Catch:{ all -> 0x07dd }
            if (r3 != r0) goto L_0x05a3
            boolean r0 = r1.A0M     // Catch:{ all -> 0x07dd }
            if (r2 == r0) goto L_0x05a7
        L_0x05a3:
            r1.A0N = r3     // Catch:{ all -> 0x07dd }
            r1.A0M = r2     // Catch:{ all -> 0x07dd }
        L_0x05a7:
            X.0sK r0 = r7.A01     // Catch:{ all -> 0x07dd }
            r0.A0B()     // Catch:{ all -> 0x07dd }
            X.1ZT r3 = r0.A05     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "MeContact/Jid can not be null at this point"
            X.AnonymousClass00B.A07(r3, r0)     // Catch:{ all -> 0x07dd }
            java.lang.String r2 = "preview"
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r0 = r7.A17     // Catch:{ all -> 0x07dd }
            X.2zS r1 = new X.2zS     // Catch:{ all -> 0x07dd }
            r1.<init>(r0, r3, r7, r2)     // Catch:{ all -> 0x07dd }
            r7.A18 = r1     // Catch:{ all -> 0x07dd }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x07dd }
            r0.<init>()     // Catch:{ all -> 0x07dd }
            r7.A1h = r0     // Catch:{ all -> 0x07dd }
            r0.put(r3, r1)     // Catch:{ all -> 0x07dd }
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            r7.A0Q = r0     // Catch:{ all -> 0x07dd }
            r0 = 2131366921(0x7f0a1409, float:1.835375E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07dd }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ all -> 0x07dd }
            r7.A0V = r0     // Catch:{ all -> 0x07dd }
            r7.A3Z()     // Catch:{ all -> 0x07dd }
            android.content.Intent r2 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            r7.setIntent(r2)     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "callAccepted"
            boolean r0 = r2.getBooleanExtra(r0, r11)     // Catch:{ all -> 0x07dd }
            r7.A1k = r0     // Catch:{ all -> 0x07dd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07dd }
            r1.<init>()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "voip/VoipActivityV2/create intent: "
            r1.append(r0)     // Catch:{ all -> 0x07dd }
            r1.append(r2)     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = ", call info: "
            r1.append(r0)     // Catch:{ all -> 0x07dd }
            r1.append(r12)     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07dd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07dd }
            r0 = 8
            com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0 r1 = new com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0     // Catch:{ all -> 0x07dd }
            r1.<init>(r7, r0)     // Catch:{ all -> 0x07dd }
            r7.A1F = r1     // Catch:{ all -> 0x07dd }
            X.0ub r0 = r7.A1G     // Catch:{ all -> 0x07dd }
            r0.A02(r1)     // Catch:{ all -> 0x07dd }
            r0 = 4
            com.facebook.redex.IDxCallbackShape186S0100000_1_I0 r1 = new com.facebook.redex.IDxCallbackShape186S0100000_1_I0     // Catch:{ all -> 0x07dd }
            r1.<init>(r7, r0)     // Catch:{ all -> 0x07dd }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x07dd }
            r0.<init>(r1)     // Catch:{ all -> 0x07dd }
            r7.A0F = r0     // Catch:{ all -> 0x07dd }
            r0 = 2131232653(0x7f08078d, float:1.8081421E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r7, r0)     // Catch:{ all -> 0x07dd }
            r7.A0D = r0     // Catch:{ all -> 0x07dd }
            r0 = 2131232657(0x7f080791, float:1.808143E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass00T.A04(r7, r0)     // Catch:{ all -> 0x07dd }
            r7.A0E = r4     // Catch:{ all -> 0x07dd }
            if (r4 == 0) goto L_0x0656
            int r0 = r4.getIntrinsicWidth()     // Catch:{ all -> 0x07dd }
            float r0 = (float) r0     // Catch:{ all -> 0x07dd }
            r3 = 1063256064(0x3f600000, float:0.875)
            float r0 = r0 * r3
            int r1 = (int) r0     // Catch:{ all -> 0x07dd }
            android.graphics.drawable.Drawable r0 = r7.A0E     // Catch:{ all -> 0x07dd }
            int r0 = r0.getIntrinsicHeight()     // Catch:{ all -> 0x07dd }
            float r0 = (float) r0     // Catch:{ all -> 0x07dd }
            float r0 = r0 * r3
            int r0 = (int) r0     // Catch:{ all -> 0x07dd }
            r4.setBounds(r11, r11, r1, r0)     // Catch:{ all -> 0x07dd }
            android.graphics.drawable.Drawable r1 = r7.A0E     // Catch:{ all -> 0x07dd }
            r0 = 230(0xe6, float:3.22E-43)
            r1.setAlpha(r0)     // Catch:{ all -> 0x07dd }
        L_0x0656:
            android.view.Window r0 = r7.getWindow()     // Catch:{ all -> 0x07dd }
            X.C19980zJ.A05(r0)     // Catch:{ all -> 0x07dd }
            java.lang.String r1 = r2.getAction()     // Catch:{ all -> 0x07dd }
            boolean r0 = r10.equals(r1)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x06c7
            r7.A3i(r2, r12)     // Catch:{ all -> 0x07dd }
        L_0x066a:
            X.15A r1 = r7.A1b     // Catch:{ all -> 0x07dd }
            X.0y9 r0 = r7.A28     // Catch:{ all -> 0x07dd }
            r1.A02(r0)     // Catch:{ all -> 0x07dd }
            X.1An r2 = r7.A10     // Catch:{ all -> 0x07dd }
            java.lang.String r1 = r7.A1g     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "voipactivity_oncreate_done"
            r2.A02(r1, r0)     // Catch:{ all -> 0x07dd }
            X.0pd r1 = r7.A0C     // Catch:{ all -> 0x07dd }
            X.0sK r0 = r7.A01     // Catch:{ all -> 0x07dd }
            boolean r0 = X.C32601gl.A04(r0, r1)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x06a0
            X.02z r1 = new X.02z     // Catch:{ all -> 0x07dd }
            r1.<init>(r7)     // Catch:{ all -> 0x07dd }
            java.lang.Class<com.obwhatsapp.calling.callheader.viewmodel.CallHeaderViewModel> r0 = com.obwhatsapp.calling.callheader.viewmodel.CallHeaderViewModel.class
            X.01n r0 = r1.A01(r0)     // Catch:{ all -> 0x07dd }
            com.obwhatsapp.calling.callheader.viewmodel.CallHeaderViewModel r0 = (com.obwhatsapp.calling.callheader.viewmodel.CallHeaderViewModel) r0     // Catch:{ all -> 0x07dd }
            r7.A0x = r0     // Catch:{ all -> 0x07dd }
            X.027 r2 = r0.A00     // Catch:{ all -> 0x07dd }
            r1 = 300(0x12c, float:4.2E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x07dd }
            r0.<init>((com.whatsapp.voipcalling.VoipActivityV2) r7, (int) r1)     // Catch:{ all -> 0x07dd }
            r2.A0A(r7, r0)     // Catch:{ all -> 0x07dd }
        L_0x06a0:
            X.01J r0 = r7.A1i     // Catch:{ all -> 0x07dd }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x07dd }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x07dd }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x07d5
            android.content.res.Resources r0 = r7.getResources()     // Catch:{ all -> 0x07dd }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x07dd }
            int r0 = r0.orientation     // Catch:{ all -> 0x07dd }
            if (r0 != r9) goto L_0x07d5
            android.content.res.Resources r0 = r7.getResources()     // Catch:{ all -> 0x07dd }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x07dd }
            r7.onConfigurationChanged(r0)     // Catch:{ all -> 0x07dd }
            goto L_0x07d5
        L_0x06c7:
            java.lang.String r0 = "com.obwhatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x06d3
            r7.A3j(r2, r12)     // Catch:{ all -> 0x07dd }
            goto L_0x066a
        L_0x06d3:
            java.lang.String r0 = "com.obwhatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x066a
            r7.A1l = r8     // Catch:{ all -> 0x07dd }
            r7.A3c()     // Catch:{ all -> 0x07dd }
            goto L_0x066a
        L_0x06e1:
            android.content.Intent r1 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "joinable"
            boolean r0 = r1.getBooleanExtra(r0, r11)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x0710
            java.lang.String r0 = r7.A1g     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x06f6
            r7.finish()     // Catch:{ all -> 0x07dd }
            goto L_0x07d5
        L_0x06f6:
            X.5P7 r2 = r7.A26     // Catch:{ all -> 0x07dd }
            X.1D0 r1 = r7.A1Q     // Catch:{ all -> 0x07dd }
            X.1SN r0 = r7.A1C     // Catch:{ all -> 0x07dd }
            X.3yg r3 = new X.3yg     // Catch:{ all -> 0x07dd }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x07dd }
            r7.A0y = r3     // Catch:{ all -> 0x07dd }
            X.0sq r2 = r7.A05     // Catch:{ all -> 0x07dd }
            java.lang.String[] r1 = new java.lang.String[r8]     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = r7.A1g     // Catch:{ all -> 0x07dd }
            r1[r11] = r0     // Catch:{ all -> 0x07dd }
            r2.Ack(r3, r1)     // Catch:{ all -> 0x07dd }
            goto L_0x07d5
        L_0x0710:
            r7.finish()     // Catch:{ all -> 0x07dd }
            android.content.Intent r1 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "fromCallNotification"
            boolean r0 = r1.getBooleanExtra(r0, r11)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x078b
            X.0pi r0 = r7.A1V     // Catch:{ all -> 0x07dd }
            r0.A01()     // Catch:{ all -> 0x07dd }
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            android.content.Intent r1 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "jid"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)     // Catch:{ all -> 0x07dd }
            java.util.List r0 = X.C16030sJ.A08(r2, r0)     // Catch:{ all -> 0x07dd }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x07dd }
            r2.<init>()     // Catch:{ all -> 0x07dd }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x07dd }
        L_0x073d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x0753
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x07dd }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x07dd }
            X.0sG r0 = r7.A1E     // Catch:{ all -> 0x07dd }
            X.0sH r0 = r0.A0A(r1)     // Catch:{ all -> 0x07dd }
            r2.add(r0)     // Catch:{ all -> 0x07dd }
            goto L_0x073d
        L_0x0753:
            int r0 = r2.size()     // Catch:{ all -> 0x07dd }
            if (r0 <= 0) goto L_0x076e
            int r0 = r2.size()     // Catch:{ all -> 0x07dd }
            int r0 = r0 - r8
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x07dd }
            X.0sH r0 = (X.C16010sH) r0     // Catch:{ all -> 0x07dd }
            X.0rv r3 = r0.A0E     // Catch:{ all -> 0x07dd }
            if (r3 == 0) goto L_0x076e
            X.15I r1 = r7.A1M     // Catch:{ all -> 0x07dd }
            r0 = 3
            r1.A09(r3, r0)     // Catch:{ all -> 0x07dd }
        L_0x076e:
            X.10c r9 = r7.A11     // Catch:{ all -> 0x07dd }
            android.content.Intent r1 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "video_call"
            boolean r15 = r1.getBooleanExtra(r0, r11)     // Catch:{ all -> 0x07dd }
            r14 = 5
            r11 = 0
            X.0t3 r1 = r9.A0H     // Catch:{ all -> 0x07dd }
            X.0sK r0 = r9.A05     // Catch:{ all -> 0x07dd }
            java.lang.String r12 = X.C224718b.A00(r0, r1, r8)     // Catch:{ all -> 0x07dd }
            r10 = r7
            r13 = r2
            r9.A02(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x07dd }
            goto L_0x07d5
        L_0x078b:
            java.lang.String r0 = "voip/VoipActivityV2/create/call_not_active"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07dd }
            android.content.Intent r1 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "fgservice_start_failed"
            boolean r0 = r1.getBooleanExtra(r0, r11)     // Catch:{ all -> 0x07dd }
            if (r0 == 0) goto L_0x07d5
            X.3qn r2 = new X.3qn     // Catch:{ all -> 0x07dd }
            r2.<init>()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = "voip_call_lobby_open_fail_fgservice_restriction"
            r2.A00 = r0     // Catch:{ all -> 0x07dd }
            java.lang.String r1 = "com.obwhatsapp.intent.action.ACCEPT_CALL"
            android.content.Intent r0 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = r0.getAction()     // Catch:{ all -> 0x07dd }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x07d1
            java.lang.String r1 = "join_call"
            android.content.Intent r0 = r7.getIntent()     // Catch:{ all -> 0x07dd }
            java.lang.String r0 = r0.getAction()     // Catch:{ all -> 0x07dd }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x07dd }
            if (r0 != 0) goto L_0x07d1
            java.lang.String r0 = "false"
        L_0x07c9:
            r2.A01 = r0     // Catch:{ all -> 0x07dd }
            X.0t9 r0 = r7.A1S     // Catch:{ all -> 0x07dd }
            r0.A06(r2)     // Catch:{ all -> 0x07dd }
            goto L_0x07d5
        L_0x07d1:
            java.lang.String r0 = "true"
            goto L_0x07c9
        L_0x07d5:
            if (r16 == 0) goto L_0x07dc
            X.10F r0 = r7.A02
            r0.A07(r6)
        L_0x07dc:
            return
        L_0x07dd:
            r1 = move-exception
            if (r16 == 0) goto L_0x07e5
            X.10F r0 = r7.A02
            r0.A07(r6)
        L_0x07e5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.A1B(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r2) {
        /*
            r1 = this;
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r1.A1L
            if (r0 == 0) goto L_0x000b
            android.app.Dialog r0 = r0.A1B(r2)
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.app.Dialog r0 = super.onCreateDialog(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onCreateDialog(int):android.app.Dialog");
    }

    public void onDestroy() {
        AnonymousClass2Ao r0;
        super.onDestroy();
        CallGrid callGrid = this.A0p;
        if (callGrid != null) {
            this.A06.A01(callGrid.A0P);
        }
        Handler handler = this.A0F;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        CallDetailsLayout callDetailsLayout = this.A0l;
        if (!(callDetailsLayout == null || (r0 = callDetailsLayout.A08.A05) == null)) {
            r0.A00();
        }
        C33481ie r1 = this.A1F;
        if (r1 != null) {
            this.A1G.A03(r1);
        }
        C447225g r02 = this.A12;
        if (r02 != null) {
            r02.A0b(this);
            this.A12.A0T = null;
        }
        OrientationViewModel orientationViewModel = this.A0w;
        if (orientationViewModel != null) {
            orientationViewModel.A09();
        }
        AnonymousClass2Ao r03 = this.A1I;
        if (r03 != null) {
            r03.A00();
        }
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A17;
        if (videoCallParticipantViewLayout != null) {
            Map map = videoCallParticipantViewLayout.A0R;
            for (VideoPort release : map.values()) {
                release.release();
            }
            map.clear();
        }
        this.A19.A01();
        A3R();
        VoipInCallNotifBanner voipInCallNotifBanner = this.A0s;
        if (voipInCallNotifBanner != null) {
            voipInCallNotifBanner.A01();
            this.A0s.A0J.A00();
        }
        this.A1b.A03(this.A28);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0092, code lost:
        r2 = r4.A17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r4 = this;
            android.view.View r0 = r4.A0Q
            int r1 = r0.getWidth()
            int r0 = r4.A09
            if (r1 != r0) goto L_0x0015
            android.view.View r0 = r4.A0Q
            int r1 = r0.getHeight()
            int r0 = r4.A08
            if (r1 != r0) goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            java.lang.String r0 = "voip/VoipActivityV2/onGlobalLayout size: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            android.view.View r0 = r4.A0Q
            int r0 = r0.getWidth()
            r1.append(r0)
            java.lang.String r0 = "x"
            r1.append(r0)
            android.view.View r0 = r4.A0Q
            int r0 = r0.getHeight()
            r1.append(r0)
            java.lang.String r0 = ", orientation: "
            r1.append(r0)
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.View r0 = r4.A0Q
            int r0 = r0.getWidth()
            r4.A09 = r0
            android.view.View r0 = r4.A0Q
            int r0 = r0.getHeight()
            r4.A08 = r0
            X.2Tx r0 = r4.A0z
            r0.onGlobalLayout()
            com.whatsapp.voipcalling.CallInfo r3 = r4.A3B()
            r4.A3s(r3)
            boolean r0 = r4.A3z()
            if (r0 == 0) goto L_0x0080
            android.app.PictureInPictureParams$Builder r1 = r4.A0B
            java.lang.String r0 = "PiP Params Builder is null"
            X.AnonymousClass00B.A07(r1, r0)
            android.util.Rational r1 = r4.A39()
            android.app.PictureInPictureParams$Builder r0 = r4.A0B
            r0.setAspectRatio(r1)
        L_0x0080:
            boolean r0 = r4.A1z
            if (r0 == 0) goto L_0x00aa
            boolean r0 = A0u(r3)
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r3.isGroupCall
            if (r0 == 0) goto L_0x009d
            boolean r0 = r3.videoEnabled
            if (r0 == 0) goto L_0x009d
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout r2 = r4.A17
            int r1 = r2.A01
            r0 = 2
            if (r1 <= r0) goto L_0x009d
            r0 = 1
            r2.A05(r1, r0)
        L_0x009d:
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r4.A1e
            r0.updateCameraPreviewOrientation()
            boolean r0 = r4.A20
            if (r0 != 0) goto L_0x0014
            r4.A3n(r3)
            return
        L_0x00aa:
            com.obwhatsapp.calling.callgrid.view.CallGrid r1 = r4.A0p
            X.26d r0 = r1.A03
            r0.A01()
            X.2Xk r0 = r1.A04
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onGlobalLayout():void");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/onKeyDown ");
        sb.append(keyEvent);
        Log.i(sb.toString());
        boolean A41 = A41(i2, keyEvent);
        this.A21 = true;
        return A41 || super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/onKeyUp ");
        sb.append(keyEvent);
        sb.append(", keyDownPressed: ");
        sb.append(this.A21);
        Log.i(sb.toString());
        if (!this.A21) {
            return A41(i2, keyEvent) || super.onKeyUp(i2, keyEvent);
        }
        this.A21 = false;
        return super.onKeyUp(i2, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        String str;
        C447225g r1;
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/onNewIntent ");
        sb.append(intent);
        sb.append(", action ");
        sb.append(action);
        sb.append(", is finishing ");
        sb.append(isFinishing());
        Log.i(sb.toString());
        super.onNewIntent(intent);
        setIntent(intent);
        this.A1r = false;
        this.A1j = false;
        this.A1g = intent.getStringExtra("call_id");
        CallInfo A3B = A3B();
        if (A3B != null) {
            String str2 = this.A1g;
            if (str2 == null) {
                str2 = A3B.callId;
                this.A1g = str2;
            }
            CallGridViewModel callGridViewModel = this.A0t;
            if (callGridViewModel != null) {
                callGridViewModel.A0D.A0A(str2);
            }
            if (this.A12 == null) {
                this.A13.A00.obtainMessage(4, this).sendToTarget();
            }
            A3r(A3B);
            if ("com.obwhatsapp.intent.action.ACCEPT_CALL".equals(action)) {
                A3i(intent, A3B);
            } else if ("com.obwhatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN".equals(action) || "join_call".equals(action)) {
                this.A10.A00(A3B.callId);
                this.A1k = false;
                this.A23 = true;
                if (this.A1L != null) {
                    A3J();
                }
                A3R();
                A3T();
                if (!this.A20) {
                    this.A1l = true;
                    A3c();
                }
                A3s(A3B);
                this.A13.A00(new C204710g("refresh_notification"));
            } else if ("com.obwhatsapp.intent.action.SHOW_END_CALL_CONFIRMATION".equals(action)) {
                String stringExtra = intent.getStringExtra("confirmationString");
                if (this.A0f == null && this.A1D.A00()) {
                    Log.w("voip/VoipActivityV2/showEndCallConfirmationDialog.");
                    DialogFragment A012 = EndCallConfirmationDialogFragment.A01(stringExtra);
                    this.A0f = A012;
                    A012.A1G(AGM(), (String) null);
                }
            } else {
                int i2 = 2;
                if ("com.obwhatsapp.intent.action.END_CALL_AFTER_CONFIRMATION".equals(action)) {
                    C447225g r2 = this.A12;
                    if (r2 != null) {
                        r2.A0n((CallInfo) null, (String) null, 2);
                    }
                } else if ("com.obwhatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL".equals(action)) {
                    A3j(intent, A3B);
                } else if ("ACTION_AUTOMATION_BRING_TO_FRONT".equals(action)) {
                    AnonymousClass00B.A0B("it can only be used in smoke or automation", false);
                } else if ("com.obwhatsapp.intent.action.CALL_BACK".equals(action) && this.A1D.A00()) {
                    this.A05.A09(R.string.str083c, 1);
                } else if ("com.obwhatsapp.intent.action.REJECT_CALL_FROM_VOIP_UI".equals(action)) {
                    if (intent.getBooleanExtra("pendingCall", false)) {
                        i2 = 7;
                    }
                    if (A3B.isCallLinkLobbyOrJoiningState()) {
                        C447225g r12 = this.A12;
                        if (r12 != null) {
                            r12.A0t(A3B.callId);
                        }
                        finish();
                    } else {
                        A3f(i2);
                    }
                } else if ("com.obwhatsapp.intent.action.JOIN_CALL_LINK".equals(action)) {
                    if (C32601gl.A04(this.A01, this.A0C) && (r1 = this.A12) != null) {
                        Log.i("voip/call/join call link");
                        if (!r1.A26.A0A()) {
                            r1.A1c.A07(R.string.str034b, 0);
                        } else {
                            r1.A14.execute(new RunnableRunnableShape0S0000000_I0(4));
                        }
                    }
                } else {
                    if (isFinishing()) {
                        str = "voip/VoipActivityV2/new-intent activity is finishing, do nothing";
                    } else if (Voip.A08(A3B)) {
                        str = "voip/VoipActivityV2/new-intent the WhatsApp call is not active, do nothing";
                    } else {
                        if (this.A01 != 3) {
                            A3h(3, false);
                        }
                        A3s(A3B);
                        if (intent.getBooleanExtra("newCall", false)) {
                            Log.i("voip/VoipActivityV2/onNewIntent/NewCall clearing states");
                            this.A1k = intent.getBooleanExtra("callAccepted", false);
                            this.A05 = 0;
                            this.A0F.removeMessages(9);
                            A3G();
                        }
                    }
                    Log.e(str);
                    return;
                }
            }
            this.A1O.A03(7, (String) null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A1L == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A3J();
        return true;
    }

    public void onPause() {
        super.onPause();
        this.A1v = false;
        this.A1o = false;
        if (this.A01 == 0) {
            A3O();
        }
        AppSettingsWarningDialogFragment appSettingsWarningDialogFragment = this.A1B;
        if (appSettingsWarningDialogFragment == null) {
            return;
        }
        if (appSettingsWarningDialogFragment.A0c()) {
            A2e(AppSettingsWarningDialogFragment.class.getName());
        } else {
            this.A1B = null;
        }
    }

    public void onPictureInPictureModeChanged(boolean z2) {
        int i2;
        super.onPictureInPictureModeChanged(z2);
        AnonymousClass00B.A07(this.A0B, "PiP params builder is null");
        if (z2) {
            i2 = 1;
            this.A1u = true;
            MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A15;
            if (maximizedParticipantVideoDialogFragment != null) {
                maximizedParticipantVideoDialogFragment.A1O(false);
            }
            CallGridViewModel callGridViewModel = this.A0t;
            if (callGridViewModel != null) {
                AnonymousClass027 r1 = callGridViewModel.A08;
                if (r1.A01() != null) {
                    callGridViewModel.A0G((UserJid) r1.A01());
                }
            }
            A3O();
            A2e(E2EEInfoDialogFragment.class.getName());
            A2e(SwitchCameraForPersonalizedAvatarDialogFragment.class.getName());
            VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A17;
            Boolean A002 = Voip.A00("options.android_pip_lock_surfaceview");
            videoCallParticipantViewLayout.A0J = A002;
            if (A002 != null && A002.booleanValue()) {
                for (Map.Entry entry : videoCallParticipantViewLayout.A0R.entrySet()) {
                    View view = (View) entry.getKey();
                    SurfaceHolder surfaceHolder = ((VideoPort) entry.getValue()).getSurfaceHolder();
                    if (surfaceHolder != null) {
                        surfaceHolder.setFixedSize(view.getWidth(), view.getHeight());
                    }
                }
            }
            C447225g r2 = this.A12;
            if (r2 != null) {
                Log.i("VoiceService:onEnterPictureInPicture");
                r2.A0C = System.currentTimeMillis();
            }
            DialogFragment dialogFragment = this.A0h;
            if (dialogFragment != null) {
                dialogFragment.A1D();
                this.A0h = null;
            }
            if (this.A1w && getIntent().getBooleanExtra("isTaskRoot", true)) {
                startActivity(C14750ph.A02(this));
            }
        } else {
            this.A1u = false;
            A3V();
            this.A17.A03();
            C447225g r0 = this.A12;
            if (r0 != null) {
                r0.A0I();
            }
            this.A1w = false;
            i2 = 2;
        }
        A3h(i2, false);
        CallInfo A3B = A3B();
        if (A3B != null && A3B.videoEnabled) {
            if (!this.A20 || this.A0t == null) {
                A3b();
                A3n(A3B);
            } else {
                A3Y();
                AnonymousClass4SA r12 = this.A0r;
                r12.A01 = 0.0f;
                r12.A00();
            }
            Voip.processPipModeChange(z2);
        }
    }

    public void onRestart() {
        if (this.A0C.A0E(C16620tM.A02, 1807)) {
            this.A02.A05(this.A0R, new RunnableRunnableShape16S0100000_I0_15(this, 29), "VoipActivityV2", 4);
        }
        super.onRestart();
    }

    public void onResume() {
        CallGridViewModel callGridViewModel;
        C447225g r0;
        boolean A0E2 = this.A0C.A0E(C16620tM.A02, 1807);
        if (A0E2) {
            try {
                this.A02.A08("VoipActivityV2_onResume");
            } catch (Throwable th) {
                if (A0E2) {
                    this.A02.A07("VoipActivityV2_onResume");
                }
                throw th;
            }
        }
        super.onResume();
        this.A1w = false;
        if (this.A0Q != null) {
            this.A1v = true;
            this.A1y = true;
            CallInfo A3B = A3B();
            if (!(A3B == null || A3B.callState == CallState.NONE)) {
                A3P();
                this.A0F.sendEmptyMessageDelayed(1, 500);
                if (A3B.videoEnabled) {
                    if (A3B.self.A05 != 6) {
                        if (!A3B.videoPreviewReady && !this.A20) {
                            this.A18.A06();
                        }
                        if (A3B.videoCaptureStarted) {
                            Log.i("voip/VoipActivityV2/videoCaptureStarted.");
                        }
                        UserJid peerJid = A3B.getPeerJid();
                        if (!A3B.isCallLinkLobbyOrJoiningState()) {
                            AnonymousClass00B.A06(peerJid);
                            C32001fU infoByJid = A3B.getInfoByJid(peerJid);
                            if (infoByJid != null && infoByJid.A0L) {
                                videoRenderStarted(peerJid);
                            }
                        }
                        A3s(A3B);
                    } else if (this.A25 && (r0 = this.A12) != null) {
                        r0.A14.execute(new RunnableRunnableShape0S0000000_I0(7));
                    }
                }
                CallGrid callGrid = this.A0p;
                if (!(callGrid == null || (callGridViewModel = this.A0t) == null)) {
                    MenuBottomSheetViewModel menuBottomSheetViewModel = this.A0v;
                    if (callGrid.A05 == null) {
                        callGrid.A05 = callGridViewModel;
                        callGridViewModel.A0B.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 70));
                        callGrid.A05.A0P.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 84));
                        callGrid.A05.A09.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 69));
                        callGrid.A05.A0C.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid.A0b, 75));
                        AnonymousClass027 r5 = callGrid.A05.A07;
                        FocusViewContainer focusViewContainer = callGrid.A0a;
                        r5.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) focusViewContainer, 74));
                        callGrid.A05.A08.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 79));
                        callGrid.A05.A0N.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 78));
                        callGrid.A05.A0R.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 80));
                        callGrid.A05.A0O.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 81));
                        AnonymousClass2OJ r52 = callGrid.A05.A0Q;
                        CallGridLayoutManager callGridLayoutManager = callGrid.A0Y;
                        r52.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGridLayoutManager, 72));
                        callGrid.A05.A0S.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGridLayoutManager, 73));
                        callGrid.A05.A0T.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 76));
                        callGrid.A05.A0M.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 77));
                        callGrid.A05.A0U.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 82));
                        callGrid.A05.A0V.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 83));
                        callGrid.A05.A06.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) callGrid, 68));
                        AnonymousClass2OJ r6 = callGrid.A05.A0W;
                        AnonymousClass26d r53 = callGrid.A03;
                        r6.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) r53, 71));
                        r53.A05 = callGridViewModel;
                        callGrid.A04.A05 = callGridViewModel;
                        focusViewContainer.setMenuViewModel(this, menuBottomSheetViewModel);
                    }
                }
                if (this.A25) {
                    this.A25 = false;
                }
                if (A3z() && isInPictureInPictureMode()) {
                    onPictureInPictureModeChanged(true);
                }
                if (this.A01 == 2) {
                    A3h(3, false);
                    this.A17.A03();
                    if (!"com.obwhatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN".equals(getIntent().getAction())) {
                        A3V();
                    }
                }
                AppSettingsWarningDialogFragment appSettingsWarningDialogFragment = this.A1B;
                if (appSettingsWarningDialogFragment != null && !appSettingsWarningDialogFragment.A0c()) {
                    Afc(appSettingsWarningDialogFragment);
                }
            }
        }
        if (A0E2) {
            this.A02.A07("VoipActivityV2_onResume");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A15;
        if (maximizedParticipantVideoDialogFragment != null) {
            maximizedParticipantVideoDialogFragment.A1D();
        }
        if (this.A1L != null) {
            A3J();
        }
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A1L;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A0R.A02();
        return true;
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A1L;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A0R.A02();
        return true;
    }

    public void onStart() {
        super.onStart();
        View view = this.A0Q;
        if (view != null) {
            this.A1z = true;
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            C447225g r0 = this.A12;
            if (r0 != null) {
                r0.A1P = false;
            }
            this.A0z.AXR(this.A0M);
            CallInfo A3B = A3B();
            if (A3B != null && A3B.callState != CallState.NONE) {
                if (A3B.isPeerRequestingUpgrade()) {
                    this.A1k = false;
                }
                A3r(A3B);
                A3s(A3B);
                if (this.A1q || ("join_call".equals(getIntent().getAction()) && Voip.A09(A3B.callState))) {
                    this.A13.A00(new C204710g("refresh_notification"));
                    this.A1q = false;
                }
                if (A3B.videoEnabled) {
                    if (!"com.obwhatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN".equals(getIntent().getAction()) && A3B.self.A05 != 6) {
                        this.A1l = false;
                        A3c();
                    }
                    if (!this.A20) {
                        this.A18.A06();
                    }
                    C447225g r2 = this.A12;
                    if (r2 != null && this.A1u) {
                        Log.i("VoiceService:onEnterPictureInPicture");
                        r2.A0C = System.currentTimeMillis();
                    }
                }
                Log.i("voip/VoipActivityV2/bindService");
                this.A13.A00.obtainMessage(4, this).sendToTarget();
            } else if (getIntent().hasExtra("showCallFailedMessage")) {
                A3H();
            } else {
                finish();
                Log.e("voip/VoipActivityV2/onStart call_not_active, finishing");
            }
        }
    }

    public void onStop() {
        CallState callState;
        CallState callState2;
        super.onStop();
        C78783yg r0 = this.A0y;
        if (r0 != null) {
            r0.A06(true);
        }
        this.A0z.AXv();
        if (!getIntent().getBooleanExtra("joinable", false)) {
            OrientationViewModel orientationViewModel = this.A0w;
            if (orientationViewModel != null) {
                orientationViewModel.A09();
            }
            this.A1z = false;
            View view = this.A0Q;
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A15;
            if (maximizedParticipantVideoDialogFragment != null) {
                maximizedParticipantVideoDialogFragment.A1O(true);
            }
            VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A17;
            if (videoCallParticipantViewLayout != null) {
                AnonymousClass1OL r4 = this.A0n;
                if (videoCallParticipantViewLayout.A0O) {
                    int i2 = 0;
                    videoCallParticipantViewLayout.A0O = false;
                    boolean z2 = !videoCallParticipantViewLayout.A0N;
                    if (!videoCallParticipantViewLayout.A0M) {
                        i2 = 2;
                    }
                    r4.A01().edit().putInt("video_call_pip_position", (z2 ? 1 : 0) + i2).apply();
                }
            }
            Handler handler = this.A0F;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            CallInfo A3B = A3B();
            if (!(A3B == null || (callState = A3B.callState) == (callState2 = CallState.NONE))) {
                if (callState == CallState.RECEIVED_CALL && Build.VERSION.SDK_INT >= 21 && !this.A0A.A00 && !this.A1k) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("notification_type", 1);
                    StringBuilder sb = new StringBuilder("voip/VoipActivityV2/onStop post ");
                    sb.append("NOTIFICATION_HEADS_UP");
                    Log.i(sb.toString());
                    this.A13.A00(new C204710g("refresh_notification", bundle));
                    this.A1q = true;
                }
                C447225g r1 = this.A12;
                if (r1 != null && this.A1u) {
                    r1.A0I();
                }
                if (A3B.videoEnabled) {
                    this.A1l = true;
                    A3c();
                    if (A3B.callState != callState2 && Build.VERSION.SDK_INT < 19 && this.A16.A03 == 1) {
                        Log.i("voip/VoipActivityV2/onStop finish current activity, will recreate on foreground");
                        C447225g r02 = this.A12;
                        if (r02 != null) {
                            r02.A0b(this);
                            this.A12.A0T = null;
                        }
                        finish();
                    }
                }
                if (this.A12 != null && !this.A0i.A00) {
                    Log.i("voip/VoipActivityV2/onStop. App is put to background, mark to show VoipActivity again when foregrounded.");
                    this.A12.A1P = true;
                }
            }
            A3X();
        }
    }

    public void onUserInteraction() {
        this.A1y = true;
    }

    public void onUserLeaveHint() {
        Log.i("voip/VoipActivityV2/onUserLeaveHint");
        if (this.A1L != null || !A3z() || !A43(A3B())) {
            this.A1y = false;
        }
    }

    public void recreate() {
        if (this.A01 == 3) {
            super.recreate();
        }
    }

    public void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        try {
            super.setPictureInPictureParams(pictureInPictureParams);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            Log.e("voip/VoipActivityV2/setPictureInPictureParams", e2);
        }
    }

    public void showView(View view) {
        view.setVisibility(0);
        ((AnimatingArrowsLayout) view).A03.start();
    }

    public void videoRenderStarted(UserJid userJid) {
        AnonymousClass00B.A01();
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/videoRenderStarted ");
        sb.append(userJid);
        Log.i(sb.toString());
        A3A(userJid).A06();
        CallInfo A3B = A3B();
        if (A3B != null && (!A3B.isGroupCall || !this.A20 || !this.A0C.A0E(C16620tM.A02, 2269))) {
            A3s(A3B);
        }
        A3S();
    }
}
