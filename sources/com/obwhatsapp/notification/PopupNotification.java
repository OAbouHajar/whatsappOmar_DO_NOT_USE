package com.obwhatsapp.notification;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass10Y;
import X.AnonymousClass125;
import X.AnonymousClass127;
import X.AnonymousClass135;
import X.AnonymousClass150;
import X.AnonymousClass152;
import X.AnonymousClass15O;
import X.AnonymousClass15Z;
import X.AnonymousClass18R;
import X.AnonymousClass1B5;
import X.AnonymousClass1BQ;
import X.AnonymousClass1MF;
import X.AnonymousClass1RV;
import X.AnonymousClass1VD;
import X.AnonymousClass1ZK;
import X.AnonymousClass1ZR;
import X.AnonymousClass29I;
import X.AnonymousClass29T;
import X.AnonymousClass2Ao;
import X.AnonymousClass2DT;
import X.AnonymousClass2JH;
import X.AnonymousClass2Rf;
import X.AnonymousClass2Sv;
import X.AnonymousClass2ZR;
import X.AnonymousClass3TE;
import X.AnonymousClass3TI;
import X.AnonymousClass5RN;
import X.C14550pN;
import X.C14710pd;
import X.C14750ph;
import X.C14770pj;
import X.C14850pr;
import X.C14870pt;
import X.C15800rs;
import X.C15810rt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16220sf;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16740tZ;
import X.C16760tb;
import X.C16980tz;
import X.C17020u3;
import X.C17030uP;
import X.C17140ub;
import X.C17150uc;
import X.C17160ud;
import X.C17200uh;
import X.C17240ul;
import X.C17250um;
import X.C18260wP;
import X.C18890xQ;
import X.C18940xV;
import X.C19150xq;
import X.C19210xw;
import X.C19430yQ;
import X.C19490yW;
import X.C19610yi;
import X.C19780yz;
import X.C19950zG;
import X.C19980zJ;
import X.C19990zK;
import X.C20260zl;
import X.C206711d;
import X.C216114t;
import X.C218315p;
import X.C23061Ai;
import X.C25731Kx;
import X.C25781Lc;
import X.C25791Ld;
import X.C25801Le;
import X.C25831Lh;
import X.C25941Ls;
import X.C25951Lt;
import X.C28381Vw;
import X.C30521cU;
import X.C32241fu;
import X.C33481ie;
import X.C34151jm;
import X.C35541m6;
import X.C38641rB;
import X.C40651uT;
import X.C40781ug;
import X.C43421zy;
import X.C436420x;
import X.C447725m;
import X.C45922Bq;
import X.C46142Cp;
import X.C49132Rg;
import X.C60032zq;
import X.C62393Dj;
import X.C82824Eh;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.InputFilter;
import android.text.method.TextKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxAListenerShape211S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.IDxEListenerShape200S0100000_2_I0;
import com.facebook.redex.IDxICheckerShape379S0100000_2_I0;
import com.facebook.redex.IDxIFilterShape446S0100000_2_I0;
import com.facebook.redex.IDxListenerShape380S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape167S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.text.IDxWAdapterShape101S0100000_1_I0;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PopupNotification extends C14550pN {
    public float A00;
    public int A01;
    public Sensor A02;
    public SensorEventListener A03;
    public SensorManager A04;
    public PowerManager.WakeLock A05;
    public View.OnClickListener A06;
    public View A07;
    public View A08;
    public View A09;
    public Button A0A;
    public ImageButton A0B;
    public ImageButton A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public C19980zJ A0G;
    public C25731Kx A0H;
    public AnonymousClass5RN A0I;
    public C25951Lt A0J;
    public C25941Ls A0K;
    public AnonymousClass15Z A0L;
    public C30521cU A0M;
    public C18890xQ A0N;
    public C16760tb A0O;
    public C17150uc A0P;
    public AnonymousClass01Y A0Q;
    public AnonymousClass127 A0R;
    public AnonymousClass3TI A0S;
    public C17160ud A0T;
    public C16000sG A0U;
    public C17140ub A0V;
    public C17030uP A0W;
    public C16080sP A0X;
    public AnonymousClass2Ao A0Y;
    public C17200uh A0Z;
    public AnonymousClass152 A0a;
    public C25831Lh A0b;
    public AnonymousClass10Y A0c;
    public C46142Cp A0d;
    public C15800rs A0e;
    public AnonymousClass1B5 A0f;
    public C19610yi A0g;
    public C25801Le A0h;
    public C16440t3 A0i;
    public C16980tz A0j;
    public AnonymousClass013 A0k;
    public C15810rt A0l;
    public C216114t A0m;
    public C16070sO A0n;
    public C19780yz A0o;
    public C19150xq A0p;
    public C16010sH A0q;
    public C206711d A0r;
    public AnonymousClass29I A0s;
    public AnonymousClass1BQ A0t;
    public C20260zl A0u;
    public C17240ul A0v;
    public AnonymousClass18R A0w;
    public C15830rv A0x;
    public C19430yQ A0y;
    public C19990zK A0z;
    public C14770pj A10;
    public AnonymousClass150 A11;
    public PopupNotificationViewPager A12;
    public C218315p A13;
    public C17020u3 A14;
    public C19210xw A15;
    public C14850pr A16;
    public AnonymousClass125 A17;
    public C16740tZ A18;
    public AnonymousClass1RV A19;
    public C19490yW A1A;
    public C16220sf A1B;
    public C25781Lc A1C;
    public AnonymousClass1MF A1D;
    public AnonymousClass135 A1E;
    public AnonymousClass15O A1F;
    public C23061Ai A1G;
    public C25791Ld A1H;
    public AnonymousClass1ZK A1I;
    public AnonymousClass2ZR A1J;
    public Integer A1K;
    public HashSet A1L;
    public HashSet A1M;
    public HashSet A1N;
    public List A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public final Handler A1S;
    public final Handler A1T;
    public final C40781ug A1U;
    public final C33481ie A1V;
    public final C18940xV A1W;
    public final AnonymousClass1VD A1X;
    public final C82824Eh A1Y;
    public final Runnable A1Z;
    public final Runnable A1a;

    public PopupNotification() {
        this(0);
        this.A1O = new ArrayList();
        this.A1N = new HashSet();
        this.A1M = new HashSet();
        this.A1L = new HashSet();
        this.A1Y = new C82824Eh(this);
        this.A1W = new IDxMObserverShape74S0100000_2_I0(this, 9);
        this.A1V = new IDxCObserverShape68S0100000_2_I0(this, 23);
        this.A1U = new IDxSObserverShape63S0100000_2_I0(this, 19);
        this.A1X = new IDxPObserverShape81S0100000_2_I0(this, 21);
        this.A0I = new IDxCListenerShape203S0100000_2_I0(this, 8);
        this.A00 = 5.0f;
        this.A1S = new Handler(Looper.getMainLooper());
        this.A1Z = new RunnableRunnableShape11S0100000_I0_10(this, 44);
        this.A1T = new Handler(Looper.getMainLooper());
        this.A1a = new RunnableRunnableShape11S0100000_I0_10(this, 45);
    }

    public PopupNotification(int i2) {
        this.A1P = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 65));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.obwhatsapp.TextEmojiLabel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.obwhatsapp.components.button.ThumbnailButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.30e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.2zq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.obwhatsapp.TextEmojiLabel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.313} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.2zq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.2zq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: X.315} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: X.315} */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0528, code lost:
        r2 = r0.A01.A09;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ android.view.View A02(com.obwhatsapp.notification.PopupNotification r18, X.C16740tZ r19) {
        /*
            r5 = r19
            byte r1 = r5.A10
            r6 = 0
            r3 = 1
            r4 = r18
            if (r1 == 0) goto L_0x061d
            if (r1 == r3) goto L_0x05fb
            r0 = 2
            if (r1 == r0) goto L_0x05d0
            r0 = 3
            if (r1 == r0) goto L_0x0580
            r0 = 4
            if (r1 == r0) goto L_0x04e6
            r14 = 5
            if (r1 == r14) goto L_0x03cb
            r0 = 7
            if (r1 == r0) goto L_0x061d
            r0 = 9
            if (r1 == r0) goto L_0x030b
            r0 = 20
            if (r1 == r0) goto L_0x02ec
            r0 = 37
            if (r1 == r0) goto L_0x05fb
            r0 = 23
            if (r1 == r0) goto L_0x05fb
            r0 = 24
            if (r1 == r0) goto L_0x02b2
            switch(r1) {
                case 13: goto L_0x0269;
                case 14: goto L_0x020e;
                case 15: goto L_0x00ce;
                case 16: goto L_0x0121;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r1) {
                case 42: goto L_0x00c2;
                case 43: goto L_0x00c2;
                case 44: goto L_0x0047;
                default: goto L_0x0035;
            }
        L_0x0035:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r4)
        L_0x003a:
            boolean r11 = X.C30921dB.A05(r5)
            if (r11 != 0) goto L_0x0699
            X.0tZ r0 = r5.A0D()
            if (r0 != 0) goto L_0x0699
            return r2
        L_0x0047:
            r9 = r5
            X.1rn r9 = (X.C39021rn) r9
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131558832(0x7f0d01b0, float:1.874299E38)
            r11 = 0
            android.view.View r2 = r1.inflate(r0, r6, r11)
            r0 = 2131366613(0x7f0a12d5, float:1.8353124E38)
            android.view.View r8 = r2.findViewById(r0)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 2131364705(0x7f0a0b61, float:1.8349255E38)
            android.view.View r10 = r2.findViewById(r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2131364944(0x7f0a0c50, float:1.834974E38)
            android.view.View r1 = r2.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131364943(0x7f0a0c4f, float:1.8349737E38)
            android.view.View r12 = r2.findViewById(r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
            X.013 r0 = r4.A0k
            java.lang.String r0 = X.C47612Jr.A02(r0, r9)
            r1.setText(r0)
            X.013 r0 = r4.A0k
            java.lang.String r7 = X.C47612Jr.A01(r4, r0, r9)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 8
            if (r0 == 0) goto L_0x00bb
            r12.setVisibility(r1)
        L_0x0094:
            java.lang.String r0 = r9.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b7
            r10.setVisibility(r11)
            java.lang.String r0 = r9.A05
            r10.setText(r0)
        L_0x00a4:
            X.1Ld r7 = r4.A1H
            r1 = 2131231681(0x7f0803c1, float:1.807945E38)
            X.52Y r0 = new X.52Y
            r0.<init>(r8, r7, r1)
            r7.A07(r8, r9, r0)
            android.view.View$OnClickListener r0 = r4.A06
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x00b7:
            r10.setVisibility(r1)
            goto L_0x00a4
        L_0x00bb:
            r12.setText(r7)
            r12.setVisibility(r11)
            goto L_0x0094
        L_0x00c2:
            r1 = r5
            X.0tY r1 = (X.C16730tY) r1
            android.view.View$OnClickListener r0 = r4.A06
            X.313 r2 = new X.313
            r2.<init>(r4, r0, r1)
            goto L_0x003a
        L_0x00ce:
            com.obwhatsapp.TextEmojiLabel r2 = new com.obwhatsapp.TextEmojiLabel
            r2.<init>(r4)
            r0 = 2131365415(0x7f0a0e27, float:1.8350695E38)
            r2.setId(r0)
            r0 = 2131891317(0x7f121475, float:1.941735E38)
            java.lang.String r8 = r4.getString(r0)
            X.1Lh r7 = r4.A0b
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r7.A02
            float r0 = r7.A02(r1, r0)
            r2.setTextSize(r0)
            r0 = 17
            r2.setGravity(r0)
            r0 = 2131101280(0x7f060660, float:1.7814965E38)
            int r0 = X.AnonymousClass00T.A00(r4, r0)
            r2.setTextColor(r0)
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131165524(0x7f070154, float:1.7945268E38)
            int r7 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r4.getResources()
            int r1 = r0.getDimensionPixelSize(r1)
            r0 = 0
            r2.setPadding(r7, r0, r1, r0)
            r2.A0H(r8, r6, r0, r3)
            X.3MF r0 = new X.3MF
            r0.<init>()
            r2.A07 = r0
            goto L_0x003a
        L_0x0121:
            r8 = r5
            X.1rV r8 = (X.C38841rV) r8
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r4)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131558818(0x7f0d01a2, float:1.8742963E38)
            android.view.View r7 = r1.inflate(r0, r2, r3)
            r0 = 2131364360(0x7f0a0a08, float:1.8348555E38)
            android.view.View r1 = r7.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r8.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r15 = 8
            if (r0 != 0) goto L_0x0209
            java.lang.String r0 = r8.A03
            r1.setText(r0)
        L_0x0151:
            r0 = 2131364363(0x7f0a0a0b, float:1.834856E38)
            android.view.View r14 = r7.findViewById(r0)
            r0 = 2131364364(0x7f0a0a0c, float:1.8348563E38)
            android.view.View r12 = r7.findViewById(r0)
            r0 = 2131364365(0x7f0a0a0d, float:1.8348565E38)
            android.view.View r11 = r7.findViewById(r0)
            r0 = 2131364368(0x7f0a0a10, float:1.8348571E38)
            android.view.View r9 = r7.findViewById(r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            X.0t3 r0 = r4.A0i
            long r16 = r0.A00()
            X.0yQ r0 = r4.A0y
            long r0 = r0.A04(r8)
            r13 = 0
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x01eb
            r14.setVisibility(r13)
            r12.setVisibility(r13)
            r11.setVisibility(r13)
            android.content.res.Resources r11 = r4.getResources()
            r10 = 2131100066(0x7f0601a2, float:1.7812503E38)
            int r10 = r11.getColor(r10)
            r9.setTextColor(r10)
            r12 = 2131889270(0x7f120c76, float:1.9413199E38)
            java.lang.Object[] r11 = new java.lang.Object[r3]
            X.013 r10 = r4.A0k
            java.lang.String r0 = X.C47672Jx.A00(r10, r0)
            r11[r13] = r0
            java.lang.String r0 = r4.getString(r12, r11)
            r9.setText(r0)
        L_0x01ab:
            r0 = 2131366613(0x7f0a12d5, float:1.8353124E38)
            android.view.View r9 = r7.findViewById(r0)
            com.obwhatsapp.components.button.ThumbnailButton r9 = (com.obwhatsapp.components.button.ThumbnailButton) r9
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166274(0x7f070442, float:1.7946789E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r9.setPadding(r0, r0, r0, r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131167189(0x7f0707d5, float:1.7948645E38)
            float r0 = r1.getDimension(r0)
            r9.A02 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.A01 = r0
            r0 = 1711276032(0x66000000, float:1.5111573E23)
            r9.A03 = r0
            X.1Ld r7 = r4.A1H
            r1 = 2131232138(0x7f08058a, float:1.8080377E38)
            X.52Y r0 = new X.52Y
            r0.<init>(r9, r7, r1)
            r7.A08(r9, r8, r0)
            android.view.View$OnClickListener r0 = r4.A06
            r9.setOnClickListener(r0)
            goto L_0x003a
        L_0x01eb:
            r14.setVisibility(r15)
            r12.setVisibility(r15)
            r11.setVisibility(r15)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131100952(0x7f060518, float:1.78143E38)
            int r0 = r1.getColor(r0)
            r9.setTextColor(r0)
            r0 = 2131889282(0x7f120c82, float:1.9413223E38)
            r9.setText(r0)
            goto L_0x01ab
        L_0x0209:
            r1.setVisibility(r15)
            goto L_0x0151
        L_0x020e:
            r1 = r5
            X.1rS r1 = (X.C38811rS) r1
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r4)
            X.013 r0 = r4.A0k
            java.lang.String r0 = X.C41061vA.A08(r0, r1)
            r8.setText(r0)
            X.1Lh r2 = r4.A0b
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r2.A02
            float r0 = r2.A02(r1, r0)
            r8.setTextSize(r0)
            r7 = 17
            r8.setGravity(r7)
            r0 = 2131101280(0x7f060660, float:1.7814965E38)
            int r0 = X.AnonymousClass00T.A00(r4, r0)
            r8.setTextColor(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131232452(0x7f0806c4, float:1.8081014E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r8.setCompoundDrawablesWithIntrinsicBounds(r0, r6, r6, r6)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166274(0x7f070442, float:1.7946789E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.setCompoundDrawablePadding(r0)
            r8.setPadding(r0, r0, r0, r0)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r4)
            r2.setGravity(r7)
            r2.addView(r8)
            goto L_0x003a
        L_0x0269:
            r8 = r5
            X.0tY r8 = (X.C16730tY) r8
            X.2zq r2 = new X.2zq
            r2.<init>(r4)
            r0 = 2131365412(0x7f0a0e24, float:1.8350689E38)
            r2.setId(r0)
            r4.A2t(r2)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131232132(0x7f080584, float:1.8080365E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A08 = r0
            X.1Ld r7 = r4.A1H
            r10 = 0
            r1 = 2131232139(0x7f08058b, float:1.8080379E38)
            X.52Y r0 = new X.52Y
            r0.<init>(r2, r7, r1)
            r7.A08(r2, r8, r0)
            int r0 = r8.A00     // Catch:{ IllegalArgumentException -> 0x05c9 }
            if (r0 == 0) goto L_0x02a2
            X.013 r7 = r4.A0k     // Catch:{ IllegalArgumentException -> 0x05c9 }
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x05c9 }
            java.lang.String r10 = X.C28961Zl.A04(r7, r0)     // Catch:{ IllegalArgumentException -> 0x05c9 }
            goto L_0x05b7
        L_0x02a2:
            long r0 = r8.A01     // Catch:{ IllegalArgumentException -> 0x05c9 }
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x05b7
            X.013 r7 = r4.A0k     // Catch:{ IllegalArgumentException -> 0x05c9 }
            java.lang.String r10 = X.AnonymousClass2GQ.A03(r7, r0)     // Catch:{ IllegalArgumentException -> 0x05c9 }
            goto L_0x05b7
        L_0x02b2:
            r9 = r5
            X.1bh r9 = (X.C30071bh) r9
            android.view.LayoutInflater r2 = r4.getLayoutInflater()
            r1 = 2131558804(0x7f0d0194, float:1.8742934E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r1, r6, r0)
            r0 = 2131363966(0x7f0a087e, float:1.8347756E38)
            android.view.View r1 = r2.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131362105(0x7f0a0139, float:1.8343981E38)
            android.view.View r8 = r2.findViewById(r0)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            java.lang.String r0 = r9.A05
            r1.setText(r0)
            X.1Ld r7 = r4.A1H
            r1 = 2131230913(0x7f0800c1, float:1.8077892E38)
            X.52Y r0 = new X.52Y
            r0.<init>(r8, r7, r1)
            r7.A07(r8, r9, r0)
            android.view.View$OnClickListener r0 = r4.A06
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x02ec:
            r7 = r5
            X.1rB r7 = (X.C38641rB) r7
            android.view.LayoutInflater r2 = r4.getLayoutInflater()
            r1 = 2131558857(0x7f0d01c9, float:1.8743042E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r1, r6, r0)
            r0 = 2131365422(0x7f0a0e2e, float:1.8350709E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            if (r0 == 0) goto L_0x003a
            r4.A2v(r7, r0)
            goto L_0x003a
        L_0x030b:
            r10 = r5
            X.1rA r10 = (X.C38631rA) r10
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r4)
            r0 = 2131365411(0x7f0a0e23, float:1.8350687E38)
            r2.setId(r0)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131558798(0x7f0d018e, float:1.8742922E38)
            android.view.View r7 = r1.inflate(r0, r2, r3)
            r0 = 2131364067(0x7f0a08e3, float:1.834796E38)
            android.view.View r12 = r7.findViewById(r0)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.view.View r8 = r7.findViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 2131364120(0x7f0a0918, float:1.8348068E38)
            android.view.View r9 = r7.findViewById(r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 2131362355(0x7f0a0233, float:1.8344488E38)
            android.view.View r11 = r7.findViewById(r0)
            r0 = 2131363684(0x7f0a0764, float:1.8347184E38)
            android.view.View r13 = r7.findViewById(r0)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 2131362353(0x7f0a0231, float:1.8344484E38)
            android.view.View r1 = r7.findViewById(r0)
            r0 = 2131363685(0x7f0a0765, float:1.8347186E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4Y6.A00(r4, r10)
            r12.setImageDrawable(r0)
            java.lang.String r0 = r10.A13()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03c3
            r0 = 2131892391(0x7f1218a7, float:1.9419529E38)
            r8.setText(r0)
        L_0x037b:
            r12 = 0
            r13.setVisibility(r12)
            r1.setVisibility(r12)
            X.013 r8 = r4.A0k
            long r0 = r10.A01
            java.lang.String r0 = X.AnonymousClass2GQ.A03(r8, r0)
            r13.setText(r0)
            int r0 = r10.A00
            if (r0 == 0) goto L_0x03ba
            r9.setVisibility(r12)
            r11.setVisibility(r12)
            X.013 r8 = r4.A0k
            java.lang.String r1 = r10.A06
            int r0 = r10.A00
            java.lang.String r0 = X.C18820xJ.A05(r8, r1, r0)
            r9.setText(r0)
        L_0x03a4:
            java.lang.String r0 = r10.A06
            java.lang.String r1 = X.C221516v.A00(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            r7.setText(r0)
            android.view.View$OnClickListener r0 = r4.A06
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x03ba:
            r0 = 8
            r9.setVisibility(r0)
            r11.setVisibility(r0)
            goto L_0x03a4
        L_0x03c3:
            java.lang.String r0 = r10.A13()
            r8.setText(r0)
            goto L_0x037b
        L_0x03cb:
            r13 = r5
            X.1rM r13 = (X.C38751rM) r13
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r4)
            r0 = 2131365414(0x7f0a0e26, float:1.8350693E38)
            r2.setId(r0)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131558823(0x7f0d01a7, float:1.8742973E38)
            android.view.View r12 = r1.inflate(r0, r2, r3)
            r0 = 2131365343(0x7f0a0ddf, float:1.8350549E38)
            android.view.View r11 = r12.findViewById(r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2131365342(0x7f0a0dde, float:1.8350547E38)
            android.view.View r10 = r12.findViewById(r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.String r0 = r13.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r9 = 8
            if (r0 == 0) goto L_0x044b
            r11.setVisibility(r9)
            r10.setVisibility(r9)
        L_0x040b:
            r0 = 2131366613(0x7f0a12d5, float:1.8353124E38)
            android.view.View r8 = r12.findViewById(r0)
            com.obwhatsapp.components.button.ThumbnailButton r8 = (com.obwhatsapp.components.button.ThumbnailButton) r8
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166274(0x7f070442, float:1.7946789E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.setPadding(r0, r0, r0, r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131167189(0x7f0707d5, float:1.7948645E38)
            float r0 = r1.getDimension(r0)
            r8.A02 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.A01 = r0
            r0 = 1711276032(0x66000000, float:1.5111573E23)
            r8.A03 = r0
            X.1Ld r7 = r4.A1H
            r1 = 2131232138(0x7f08058a, float:1.8080377E38)
            X.52Y r0 = new X.52Y
            r0.<init>(r8, r7, r1)
            r7.A08(r8, r13, r0)
            android.view.View$OnClickListener r0 = r4.A06
            r8.setOnClickListener(r0)
            goto L_0x003a
        L_0x044b:
            r8 = 0
            r11.setVisibility(r8)
            java.lang.String r0 = r13.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x04e3
            java.lang.String r0 = "https://maps.google.com/maps?q="
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r15 = r13.A15()
            java.lang.String r1 = "\\s+"
            java.lang.String r0 = "+"
            java.lang.String r0 = r15.replaceAll(r1, r0)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r7.append(r0)
            java.lang.String r0 = "&sll="
            r7.append(r0)
            double r0 = r13.A00
            r7.append(r0)
            java.lang.String r0 = ","
            r7.append(r0)
            double r0 = r13.A01
            r7.append(r0)
            java.lang.String r1 = r7.toString()
        L_0x0489:
            r11.setAutoLinkMask(r8)
            java.lang.String r0 = "<a href=\""
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r1)
            java.lang.String r0 = "\">"
            r7.append(r0)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = r13.A01
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            java.lang.String r0 = android.text.Html.escapeHtml(r0)
            r7.append(r0)
            java.lang.String r0 = "</a>"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            android.text.Spanned r0 = X.AnonymousClass1ZW.A01(r7, r0)
            r11.setText(r0)
            java.lang.String r0 = r13.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04df
            r10.setVisibility(r8)
            java.lang.String r0 = r13.A00
            r10.setText(r0)
        L_0x04d2:
            com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0
            r0.<init>(r14, r1, r4)
            r11.setOnClickListener(r0)
            r10.setOnClickListener(r0)
            goto L_0x040b
        L_0x04df:
            r10.setVisibility(r9)
            goto L_0x04d2
        L_0x04e3:
            java.lang.String r1 = r13.A02
            goto L_0x0489
        L_0x04e6:
            r10 = r5
            X.1rL r10 = (X.C38741rL) r10
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r4)
            java.lang.String r1 = r10.A00
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r0, r1)
            r8.setText(r0)
            X.1Lh r2 = r4.A0b
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r2.A02
            float r0 = r2.A02(r1, r0)
            r8.setTextSize(r0)
            r7 = 17
            r8.setGravity(r7)
            r0 = 2131101280(0x7f060660, float:1.7814965E38)
            int r0 = X.AnonymousClass00T.A00(r4, r0)
            r8.setTextColor(r0)
            X.0tz r9 = r4.A0j
            X.0sG r2 = r4.A0U
            X.013 r1 = r4.A0k
            X.1st r0 = new X.1st
            r0.<init>(r2, r9, r1)
            X.1su r0 = r0.A04(r10)
            if (r0 == 0) goto L_0x057e
            X.1sv r0 = r0.A01
            byte[] r2 = r0.A09
            if (r2 == 0) goto L_0x057e
            r1 = 0
            int r0 = r2.length
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0)
        L_0x0534:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131232452(0x7f0806c4, float:1.8081014E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            if (r9 == 0) goto L_0x055d
            int r2 = r2.getIntrinsicWidth()
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131167189(0x7f0707d5, float:1.7948645E38)
            float r0 = r1.getDimension(r0)
            android.graphics.Bitmap r1 = X.C17970vw.A06(r9, r0, r2)
            android.content.res.Resources r0 = r4.getResources()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r0, r1)
        L_0x055d:
            r8.setCompoundDrawablesWithIntrinsicBounds(r2, r6, r6, r6)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166274(0x7f070442, float:1.7946789E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.setCompoundDrawablePadding(r0)
            r8.setPadding(r0, r0, r0, r0)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r4)
            r2.setGravity(r7)
            r2.addView(r8)
            goto L_0x003a
        L_0x057e:
            r9 = r6
            goto L_0x0534
        L_0x0580:
            r8 = r5
            X.0tY r8 = (X.C16730tY) r8
            X.2zq r2 = new X.2zq
            r2.<init>(r4)
            r0 = 2131365416(0x7f0a0e28, float:1.8350697E38)
            r2.setId(r0)
            r4.A2t(r2)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131232133(0x7f080585, float:1.8080367E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A08 = r0
            X.1Ld r7 = r4.A1H
            r10 = 0
            r1 = 2131232139(0x7f08058b, float:1.8080379E38)
            X.52Y r0 = new X.52Y
            r0.<init>(r2, r7, r1)
            r7.A08(r2, r8, r0)
            int r0 = r8.A00     // Catch:{ IllegalArgumentException -> 0x05c9 }
            if (r0 == 0) goto L_0x05ba
            X.013 r7 = r4.A0k     // Catch:{ IllegalArgumentException -> 0x05c9 }
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x05c9 }
            java.lang.String r10 = X.C28961Zl.A04(r7, r0)     // Catch:{ IllegalArgumentException -> 0x05c9 }
        L_0x05b7:
            r2.A0A = r10     // Catch:{ IllegalArgumentException -> 0x05c9 }
            goto L_0x05c9
        L_0x05ba:
            long r0 = r8.A01     // Catch:{ IllegalArgumentException -> 0x05c9 }
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x05b7
            X.013 r7 = r4.A0k     // Catch:{ IllegalArgumentException -> 0x05c9 }
            java.lang.String r10 = X.AnonymousClass2GQ.A03(r7, r0)     // Catch:{ IllegalArgumentException -> 0x05c9 }
            goto L_0x05b7
        L_0x05c9:
            android.view.View$OnClickListener r0 = r4.A06
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x05d0:
            r7 = r5
            X.1rH r7 = (X.C38701rH) r7
            int r0 = r7.A08
            if (r0 != r3) goto L_0x05f4
            X.2Ao r1 = r4.A0Y
            if (r1 != 0) goto L_0x05e5
            X.0uh r1 = r4.A0Z
            java.lang.String r0 = "popup-notification"
            X.2Ao r1 = r1.A04(r4, r0)
            r4.A0Y = r1
        L_0x05e5:
            X.0yi r0 = r4.A0g
            X.315 r2 = new X.315
            r12 = r4
            r8 = r2
            r9 = r4
            r10 = r1
            r11 = r0
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x003a
        L_0x05f4:
            X.30e r2 = new X.30e
            r2.<init>(r4, r4, r7)
            goto L_0x003a
        L_0x05fb:
            com.obwhatsapp.components.button.ThumbnailButton r2 = new com.obwhatsapp.components.button.ThumbnailButton
            r2.<init>(r4)
            r0 = 2131365413(0x7f0a0e25, float:1.835069E38)
            r2.setId(r0)
            r4.A2t(r2)
            X.1Ld r7 = r4.A1H
            r1 = 2131232137(0x7f080589, float:1.8080375E38)
            X.52Y r0 = new X.52Y
            r0.<init>(r2, r7, r1)
            r7.A08(r2, r5, r0)
            android.view.View$OnClickListener r0 = r4.A06
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x061d:
            com.obwhatsapp.TextEmojiLabel r2 = new com.obwhatsapp.TextEmojiLabel
            r2.<init>(r4)
            r0 = 2131365417(0x7f0a0e29, float:1.8350699E38)
            r2.setId(r0)
            X.1Vt r0 = r5.A0L
            r8 = 0
            if (r0 == 0) goto L_0x0686
            X.15p r0 = r4.A13
            java.lang.String r9 = r0.A0V(r5, r3)
        L_0x0633:
            boolean r0 = r5.A0y()
            if (r0 == 0) goto L_0x0646
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r9)
            X.0zK r1 = r4.A0z
            java.util.List r0 = r5.A0q
            r1.A02(r4, r7, r0)
            r9 = r7
        L_0x0646:
            X.1Lh r7 = r4.A0b
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r7.A02
            float r0 = r7.A02(r1, r0)
            r2.setTextSize(r0)
            r0 = 17
            r2.setGravity(r0)
            r0 = 2131101280(0x7f060660, float:1.7814965E38)
            int r0 = X.AnonymousClass00T.A00(r4, r0)
            r2.setTextColor(r0)
            android.content.res.Resources r0 = r4.getResources()
            r7 = 2131165524(0x7f070154, float:1.7945268E38)
            int r1 = r0.getDimensionPixelSize(r7)
            android.content.res.Resources r0 = r4.getResources()
            int r0 = r0.getDimensionPixelSize(r7)
            r2.setPadding(r1, r8, r0, r8)
            r2.A0H(r9, r6, r8, r3)
            X.3MF r0 = new X.3MF
            r0.<init>()
            r2.A07 = r0
            goto L_0x003a
        L_0x0686:
            boolean r0 = r5 instanceof X.AnonymousClass1WU
            if (r0 == 0) goto L_0x0694
            X.15Z r1 = r4.A0L
            r0 = r5
            X.1WU r0 = (X.AnonymousClass1WU) r0
            java.lang.String r9 = r1.A0C(r0, r8)
            goto L_0x0633
        L_0x0694:
            java.lang.String r9 = r5.A0I()
            goto L_0x0633
        L_0x0699:
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131559654(0x7f0d04e6, float:1.8744658E38)
            r7 = 0
            android.view.View r6 = r1.inflate(r0, r6, r7)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0 = 2131365614(0x7f0a0eee, float:1.8351098E38)
            android.view.View r13 = r6.findViewById(r0)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            X.0tZ r0 = r5.A0D()
            if (r0 == 0) goto L_0x07c6
            r13.setVisibility(r7)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4Y4.A00(r4)
            r13.setForeground(r0)
            r0 = 2131365626(0x7f0a0efa, float:1.8351123E38)
            android.view.View r10 = r13.findViewById(r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2131365612(0x7f0a0eec, float:1.8351094E38)
            android.view.View r9 = r13.findViewById(r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 2131365623(0x7f0a0ef7, float:1.8351117E38)
            android.view.View r8 = r13.findViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            X.1Lh r1 = r4.A0b
            android.content.res.Resources r0 = r4.getResources()
            float r0 = r1.A01(r0)
            r10.setTextSize(r0)
            r9.setTextSize(r0)
            r8.setTextSize(r0)
            X.AnonymousClass1UP.A06(r10)
            X.AnonymousClass1UP.A06(r9)
            X.AnonymousClass1UP.A06(r8)
            X.1Le r12 = r4.A0h
            X.1Vw r0 = r5.A11
            X.0rv r15 = r0.A00
            X.0tZ r16 = r5.A0D()
            X.1MF r5 = r4.A1D
            X.2Ao r14 = r4.A0Y
            if (r14 != 0) goto L_0x0711
            X.0uh r1 = r4.A0Z
            java.lang.String r0 = "popup-notification"
            X.2Ao r14 = r1.A04(r4, r0)
            r4.A0Y = r14
        L_0x0711:
            r19 = 0
            r18 = 0
            r17 = r5
            r12.A01(r13, r14, r15, r16, r17, r18, r19)
        L_0x071a:
            if (r11 == 0) goto L_0x07be
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165857(0x7f0702a1, float:1.7945943E38)
            int r13 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165856(0x7f0702a0, float:1.794594E38)
            int r12 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165858(0x7f0702a2, float:1.7945945E38)
            int r11 = r1.getDimensionPixelSize(r0)
            r0 = -1
            r10 = -2
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r0, r10)
            r0 = 3
            r9.gravity = r0
            android.content.Context r0 = r4.getApplicationContext()
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r0)
            r8.setOrientation(r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = X.AnonymousClass01S.A06
            r5.append(r1)
            r0 = 2131888405(0x7f120915, float:1.9411444E38)
            java.lang.String r0 = r4.getString(r0)
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            com.obwhatsapp.TextEmojiLabel r5 = new com.obwhatsapp.TextEmojiLabel
            r5.<init>(r4)
            r5.setText(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131101578(0x7f06078a, float:1.781557E38)
            int r0 = r1.getColor(r0)
            r5.setTextColor(r0)
            android.graphics.Typeface r1 = r5.getTypeface()
            r0 = 2
            r5.setTypeface(r1, r0)
            r5.setSingleLine()
            r5.setLines(r3)
            X.1Lh r1 = r4.A0b
            android.content.res.Resources r0 = r4.getResources()
            float r0 = r1.A01(r0)
            r5.setTextSize(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r5.setEllipsize(r0)
            r5.setCompoundDrawablePadding(r12)
            r8.setPadding(r13, r11, r13, r7)
            r8.addView(r5, r10, r10)
            r6.addView(r8, r7, r9)
            X.013 r0 = r4.A0k
            boolean r1 = r0.A0T()
            r0 = 2131231657(0x7f0803a9, float:1.8079401E38)
            if (r1 == 0) goto L_0x07c2
            r5.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r0, r7)
        L_0x07be:
            r6.addView(r2)
            return r6
        L_0x07c2:
            r5.setCompoundDrawablesWithIntrinsicBounds(r0, r7, r7, r7)
            goto L_0x07be
        L_0x07c6:
            r0 = 8
            r13.setVisibility(r0)
            goto L_0x071a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.notification.PopupNotification.A02(com.obwhatsapp.notification.PopupNotification, X.0tZ):android.view.View");
    }

    public static /* synthetic */ void A03(PopupNotification popupNotification) {
        if (!popupNotification.A1O.isEmpty()) {
            popupNotification.A2s(popupNotification.A12.getCurrentItem());
        }
    }

    public void A1q() {
        if (!this.A1P) {
            this.A1P = true;
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
            this.A0j = (C16980tz) r1.AQB.get();
            this.A0i = (C16440t3) r1.AP2.get();
            this.A0N = (C18890xQ) r1.APS.get();
            this.A1G = (C23061Ai) r1.AC0.get();
            this.A0z = (C19990zK) r1.AEZ.get();
            this.A0h = (C25801Le) r1.AFa.get();
            this.A0l = (C15810rt) r1.A43.get();
            this.A0O = (C16760tb) r1.APV.get();
            this.A0u = r2.A0I();
            this.A0r = (C206711d) r1.AKp.get();
            this.A0G = (C19980zJ) r1.A0P.get();
            this.A0Z = (C17200uh) r1.A52.get();
            this.A13 = (C218315p) r1.AIL.get();
            this.A0T = (C17160ud) r1.A4t.get();
            this.A0U = (C16000sG) r1.A4x.get();
            this.A0H = (C25731Kx) r1.A54.get();
            this.A0k = (AnonymousClass013) r1.AR8.get();
            this.A0X = (C16080sP) r1.AQ9.get();
            this.A16 = (C14850pr) r1.AG3.get();
            this.A17 = (AnonymousClass125) r1.AJ5.get();
            this.A1F = (AnonymousClass15O) r1.A0k.get();
            this.A0Q = (AnonymousClass01Y) r1.A1w.get();
            this.A0b = (C25831Lh) r1.A5Q.get();
            this.A0v = (C17240ul) r1.ABK.get();
            this.A0o = (C19780yz) r1.ADI.get();
            this.A1C = new C25781Lc();
            this.A1B = (C16220sf) r1.A3y.get();
            this.A19 = (AnonymousClass1RV) r1.AF6.get();
            this.A1H = (C25791Ld) r1.AFY.get();
            this.A15 = (C19210xw) r1.AG2.get();
            this.A0R = (AnonymousClass127) r1.A3z.get();
            this.A0J = (C25951Lt) r1.AMp.get();
            this.A0t = (AnonymousClass1BQ) r1.A7f.get();
            this.A10 = (C14770pj) r1.AF9.get();
            this.A1E = (AnonymousClass135) r1.AP7.get();
            this.A0W = (C17030uP) r1.APp.get();
            this.A0e = (C15800rs) r1.A5c.get();
            this.A0P = (C17150uc) r1.A34.get();
            this.A0y = (C19430yQ) r1.ADa.get();
            this.A1D = (AnonymousClass1MF) r1.ANa.get();
            this.A0c = (AnonymousClass10Y) r1.A5X.get();
            this.A1A = (C19490yW) r1.ALQ.get();
            this.A0n = (C16070sO) r1.ABY.get();
            this.A11 = (AnonymousClass150) r1.AIw.get();
            this.A14 = (C17020u3) r1.AMG.get();
            this.A0K = (C25941Ls) r1.AMo.get();
            this.A0L = (AnonymousClass15Z) r1.AOg.get();
            this.A0a = (AnonymousClass152) r1.A51.get();
            this.A0f = (AnonymousClass1B5) r1.AEp.get();
            this.A0g = (C19610yi) r1.AEq.get();
            this.A0m = (C216114t) r1.A5O.get();
            this.A0w = (AnonymousClass18R) r1.ABZ.get();
            this.A1J = r2.A0i();
            this.A0p = (C19150xq) r1.AFC.get();
            this.A0V = (C17140ub) r1.A4y.get();
        }
    }

    public void A2Z(AnonymousClass2Sv r2, int i2, int i3, int i4) {
        Afj(new Object[0], i2, i3);
    }

    public void A2b(AnonymousClass2Sv r2, int i2, int i3, int i4, int i5) {
        Afj(new Object[0], i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (A2w() != false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2m() {
        /*
            r9 = this;
            java.lang.String r0 = "popupnotification/initpopup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 0
            r9.A1R = r2
            r0 = 0
            r9.A1K = r0
            com.obwhatsapp.notification.PopupNotificationViewPager r0 = r9.A12
            int r0 = r0.getCurrentItem()
            r1 = 1
            if (r0 != 0) goto L_0x001b
            boolean r0 = r9.A2w()
            r8 = 1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r9.A01 = r2
            X.0rs r0 = r9.A0e
            java.util.List r0 = r0.A05()
            java.util.Iterator r7 = r0.iterator()
        L_0x002d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r6 = r7.next()
            X.0rv r6 = (X.C15830rv) r6
            X.0rt r0 = r9.A0l
            int r5 = r0.A00(r6)
            if (r5 <= 0) goto L_0x002d
            X.0sf r3 = r9.A1B
            java.lang.String r0 = r6.getRawString()
            X.1WS r3 = r3.A07(r0)
            X.0rv r0 = r9.A0x
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0066
        L_0x0055:
            boolean r0 = r3.A09()
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r3.A06()
            int r0 = java.lang.Integer.parseInt(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x002d
        L_0x0066:
            X.0yz r0 = r9.A0o
            java.util.ArrayList r0 = r0.A03(r6, r5)
            java.util.Iterator r6 = r0.iterator()
        L_0x0070:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r5 = r6.next()
            X.0tZ r5 = (X.C16740tZ) r5
            java.util.HashSet r3 = r9.A1M
            X.1Vw r0 = r5.A11
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0070
            r4.add(r5)
            goto L_0x0070
        L_0x008a:
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            goto L_0x002d
        L_0x0091:
            java.lang.String r0 = "popupnotification/count:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            int r0 = r4.size()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00b0
            r9.finish()
        L_0x00af:
            return
        L_0x00b0:
            int r0 = r4.size()
            if (r0 != r1) goto L_0x01c0
            r9.A2n()
        L_0x00b9:
            r3 = 35
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r3)
            java.util.Collections.sort(r4, r0)
            r9.A1O = r4
            X.3TI r0 = r9.A0S
            r0.A06()
            com.obwhatsapp.notification.PopupNotificationViewPager r3 = r9.A12
            X.3TI r0 = r9.A0S
            r3.setAdapter(r0)
            X.0tZ r0 = r9.A18
            if (r0 == 0) goto L_0x01b6
            if (r8 == 0) goto L_0x0181
            boolean r0 = r9.A1Q
            if (r0 == 0) goto L_0x01b6
            com.obwhatsapp.notification.PopupNotificationViewPager r0 = r9.A12
            r0.A0O(r1, r2, r1)
            r9.A2s(r1)
            java.util.List r0 = r9.A1O
            int r0 = r0.size()
            if (r1 < r0) goto L_0x017e
            java.util.List r0 = r9.A1O
            int r0 = r0.size()
            int r0 = -r0
        L_0x00f2:
            com.obwhatsapp.notification.PopupNotificationViewPager r4 = r9.A12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4.A01 = r3
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x010a
            if (r3 == 0) goto L_0x010a
            int r0 = r3.intValue()
            r4.A0F(r0, r1)
            r0 = 0
            r4.A01 = r0
        L_0x010a:
            r0 = 2130772023(0x7f010037, float:1.7147153E38)
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r9, r0)
            r5 = 2
            r0 = 2
            if (r8 == 0) goto L_0x0116
            r0 = 1
        L_0x0116:
            int r0 = r0 * 200
            long r3 = (long) r0
            r6.setDuration(r3)
            r6.setFillAfter(r1)
            android.widget.TextView r0 = r9.A0D
            r0.startAnimation(r6)
            java.util.List r0 = r9.A1O
            java.lang.Object r0 = r0.get(r2)
            X.0tZ r0 = (X.C16740tZ) r0
            X.0sf r1 = r9.A1B
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.getRawString()
            X.1WS r0 = r1.A07(r0)
            java.lang.String r0 = r0.A06()
            int r1 = java.lang.Integer.parseInt(r0)
            if (r1 == r5) goto L_0x014a
            r0 = 3
            if (r1 != r0) goto L_0x00af
        L_0x014a:
            android.view.Window r1 = r9.getWindow()
            r0 = 524288(0x80000, float:7.34684E-40)
            r1.addFlags(r0)
            java.lang.String r0 = "popupnotification/wakeupifneeded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            r9.A00 = r0
            android.os.Handler r3 = r9.A1T
            java.lang.Runnable r2 = r9.A1a
            r3.removeCallbacks(r2)
            r0 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r2, r0)
            android.hardware.SensorEventListener r0 = r9.A03
            if (r0 != 0) goto L_0x00af
            android.hardware.Sensor r3 = r9.A02
            if (r3 == 0) goto L_0x00af
            X.4gL r2 = new X.4gL
            r2.<init>(r9)
            r9.A03 = r2
            android.hardware.SensorManager r1 = r9.A04
            r0 = 0
            r1.registerListener(r2, r3, r0)
            return
        L_0x017e:
            r0 = 0
            goto L_0x00f2
        L_0x0181:
            java.util.List r0 = r9.A1O
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L_0x0188:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r0 = r5.next()
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r3 = r0.A11
            X.0tZ r0 = r9.A18
            X.1Vw r0 = r0.A11
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01a3
            int r4 = r4 + 1
            goto L_0x0188
        L_0x01a3:
            java.util.List r0 = r9.A1O
            int r0 = r0.size()
            if (r4 != r0) goto L_0x01ac
            r4 = 0
        L_0x01ac:
            com.obwhatsapp.notification.PopupNotificationViewPager r0 = r9.A12
            r0.A0F(r4, r2)
            r9.A2s(r4)
            goto L_0x010a
        L_0x01b6:
            com.obwhatsapp.notification.PopupNotificationViewPager r0 = r9.A12
            r0.A0F(r2, r2)
            r9.A2s(r2)
            goto L_0x010a
        L_0x01c0:
            r0 = 2131364812(0x7f0a0bcc, float:1.8349472E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setVisibility(r2)
            r0 = 2131364810(0x7f0a0bca, float:1.8349468E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setVisibility(r2)
            android.view.View r0 = r9.A07
            r0.setVisibility(r2)
            android.view.View r0 = r9.A08
            r0.setVisibility(r2)
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.notification.PopupNotification.A2m():void");
    }

    public final void A2n() {
        findViewById(R.id.navigation_holder).setVisibility(8);
        findViewById(R.id.navigation_divider).setVisibility(8);
        this.A07.setVisibility(8);
        this.A08.setVisibility(8);
    }

    public final void A2o() {
        Class<C15830rv> cls = C15830rv.class;
        this.A0c.A00((C15830rv) this.A0q.A08(cls), 2, true, true);
        InputMethodManager A0Q2 = this.A08.A0Q();
        if (A0Q2 != null && A0Q2.isFullscreenMode()) {
            A0Q2.hideSoftInputFromWindow(this.A0d.getWindowToken(), 0);
        }
        int currentItem = this.A12.getCurrentItem();
        StringBuilder sb = new StringBuilder("popupnotification/moveToNextMessageOrExit/ message_pos:");
        sb.append(currentItem);
        sb.append(" messages.size:");
        sb.append(this.A1O.size());
        Log.i(sb.toString());
        this.A1M.add(((C16740tZ) this.A1O.get(currentItem)).A11);
        if (this.A1O.size() == 1 || (this.A0x != null && this.A01 == 1)) {
            A2p();
            finish();
            return;
        }
        int i2 = currentItem + 1;
        if (currentItem == this.A1O.size() - 1) {
            i2 = currentItem - 1;
        }
        this.A1K = Integer.valueOf(currentItem);
        this.A12.A0F(i2, true);
        if (this.A1O.size() == 1) {
            A2n();
        }
        C16740tZ r0 = this.A18;
        if (r0 != null) {
            this.A1N.add(r0.A11);
        }
        C16010sH r02 = this.A0q;
        if (r02 != null) {
            this.A1L.add(r02.A08(cls));
        }
    }

    public final void A2p() {
        StringBuilder sb = new StringBuilder("popupnotification/clearnotifications:");
        HashSet hashSet = this.A1L;
        sb.append(hashSet.size());
        Log.i(sb.toString());
        this.A15.A01(true);
        this.A0x = null;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C15830rv r5 = (C15830rv) it.next();
            ArrayList arrayList = new ArrayList();
            int A002 = this.A0l.A00(r5);
            HashSet hashSet2 = this.A1N;
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C28381Vw r1 = (C28381Vw) it2.next();
                C15830rv r0 = r1.A00;
                if (r0 != null && r0.equals(r5)) {
                    arrayList.add(r1);
                }
            }
            StringBuilder sb2 = new StringBuilder("popupnotification/msg:");
            sb2.append(arrayList.size());
            sb2.append("/");
            sb2.append(A002);
            Log.i(sb2.toString());
            if (arrayList.size() == A002) {
                this.A0c.A00(r5, 2, true, true);
                hashSet2.removeAll(arrayList);
            }
        }
        this.A11.A00 = null;
        this.A10.A08();
    }

    public final void A2q() {
        C16010sH r2 = this.A0q;
        if (r2 == null) {
            return;
        }
        if (this.A0Q.A0V((UserJid) r2.A08(UserJid.class))) {
            AnonymousClass29T.A01(this, 106);
            return;
        }
        String trim = this.A0d.getText().toString().trim();
        if (trim.length() > 0) {
            if (C45922Bq.A0B(this.A08, this.A14, trim)) {
                this.A0O.A0A((AnonymousClass1ZR) null, (C35541m6) null, (C16740tZ) null, C40651uT.A05(trim), Collections.singletonList(this.A0q.A08(C15830rv.class)), (List) null, false, false);
                TextKeyListener.clear(this.A0d.getText());
            } else {
                this.A05.A09(R.string.str03a3, 1);
            }
            A2o();
            return;
        }
        StringBuilder sb = new StringBuilder("popupnotification/sendentry/empty text ");
        sb.append(this.A1O.size());
        Log.i(sb.toString());
    }

    public final void A2r() {
        C16010sH r4 = this.A0q;
        if (r4 != null) {
            Bitmap A012 = this.A0a.A01(this, r4, yo.setSQPC(getResources().getDimension(R.dimen.dimen0748)), getResources().getDimensionPixelSize(R.dimen.dimen074a));
            if (A012 == null) {
                C17160ud r1 = this.A0T;
                A012 = r1.A03(this, r1.A01(this.A0q));
            }
            ((ImageView) findViewById(R.id.popup_thumb)).setImageBitmap(A012);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A2s(int r9) {
        /*
            r8 = this;
        L_0x0000:
            java.util.List r0 = r8.A1O
            int r0 = r0.size()
            if (r9 >= 0) goto L_0x000a
            int r9 = r9 + r0
            goto L_0x0000
        L_0x000a:
            int r9 = r9 % r0
            java.util.List r0 = r8.A1O
            java.lang.Object r0 = r0.get(r9)
            X.0tZ r0 = (X.C16740tZ) r0
            r8.A18 = r0
            X.1Vw r0 = r0.A11
            X.0rv r2 = r0.A00
            X.1ZK r3 = r8.A1I
            X.1cz r0 = r3.A0P
            if (r0 != 0) goto L_0x0027
            r1 = 1
            java.lang.String r0 = "Do not update the ptt receiver once the recording has started"
            X.AnonymousClass00B.A0D(r0, r1)
            r3.A0J = r2
        L_0x0027:
            X.14t r0 = r8.A0m
            X.0sH r0 = r0.A01(r2)
            r8.A0q = r0
            boolean r0 = r0.A0J()
            r6 = 1
            r5 = 8
            r4 = 0
            if (r0 == 0) goto L_0x017e
            X.0sO r0 = r8.A0n
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            boolean r0 = r0.A09(r2)
            if (r0 != 0) goto L_0x0143
            android.view.View r0 = r8.A09
            r0.setVisibility(r5)
            android.widget.TextView r0 = r8.A0E
            r0.setVisibility(r4)
            android.widget.TextView r3 = r8.A0E
            X.0sH r0 = r8.A0q
            boolean r1 = r0.A0a
            r0 = 2131887012(0x7f1203a4, float:1.940862E38)
            if (r1 == 0) goto L_0x005b
            r0 = 2131887010(0x7f1203a2, float:1.9408615E38)
        L_0x005b:
            java.lang.String r0 = r8.getString(r0)
        L_0x005f:
            r3.setText(r0)
        L_0x0062:
            X.0pr r0 = r8.A16
            int r0 = r0.A00
            r2 = 3
            if (r0 == r2) goto L_0x0082
            X.0sH r0 = r8.A0q
            boolean r0 = r0.A0J()
            if (r0 != 0) goto L_0x0082
            X.0sH r1 = r8.A0q
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r1.A08(r0)
            X.0rv r1 = (X.C15830rv) r1
            if (r1 == 0) goto L_0x0082
            X.125 r0 = r8.A17
            r0.A05(r1)
        L_0x0082:
            java.util.List r0 = r8.A1O
            int r0 = r0.size()
            if (r0 == r6) goto L_0x008e
            boolean r0 = r8.A1R
            if (r0 == 0) goto L_0x00a6
        L_0x008e:
            java.util.HashSet r1 = r8.A1N
            X.0tZ r0 = r8.A18
            X.1Vw r0 = r0.A11
            r1.add(r0)
            java.util.HashSet r3 = r8.A1L
            X.0sH r1 = r8.A0q
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            r3.add(r0)
            r8.A1R = r4
        L_0x00a6:
            r8.A2r()
            r1 = 2131892685(0x7f1219cd, float:1.9420125E38)
            X.0tZ r0 = r8.A18
            byte r0 = r0.A10
            if (r0 != r2) goto L_0x00b5
            r1 = 2131893113(0x7f121b79, float:1.9420993E38)
        L_0x00b5:
            android.widget.Button r0 = r8.A0A
            r0.setText(r1)
            X.1cU r1 = r8.A0M
            X.0sH r0 = r8.A0q
            r1.A0A(r0)
            X.0sH r0 = r8.A0q
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x0124
            X.0tZ r0 = r8.A18
            X.0rv r3 = r0.A0B()
            if (r3 == 0) goto L_0x013d
            X.AnonymousClass00B.A06(r3)
            android.widget.TextView r2 = r8.A0F
            X.0sP r1 = r8.A0X
            X.0sG r0 = r8.A0U
            X.0sH r0 = r0.A0A(r3)
            java.lang.String r0 = r1.A08(r0)
            r2.setText(r0)
            android.widget.TextView r0 = r8.A0F
            r0.setVisibility(r4)
        L_0x00ea:
            android.widget.TextView r3 = r8.A0D
            r2 = 2131889394(0x7f120cf2, float:1.941345E38)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r0 = r9 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
            java.util.List r0 = r8.A1O
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r6] = r0
            java.lang.String r0 = r8.getString(r2, r1)
            r3.setText(r0)
            android.widget.ImageButton r1 = r8.A0B
            X.2Cp r0 = r8.A0d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0120
            r6 = 0
        L_0x0120:
            r1.setEnabled(r6)
            return
        L_0x0124:
            X.1Kx r1 = r8.A0H
            X.0sH r0 = r8.A0q
            java.lang.String r1 = r1.A00(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x013d
            android.widget.TextView r0 = r8.A0F
            r0.setVisibility(r4)
            android.widget.TextView r0 = r8.A0F
            r0.setText(r1)
            goto L_0x00ea
        L_0x013d:
            android.widget.TextView r0 = r8.A0F
            r0.setVisibility(r5)
            goto L_0x00ea
        L_0x0143:
            X.0sO r0 = r8.A0n
            boolean r0 = r0.A09(r2)
            if (r0 == 0) goto L_0x017e
            X.0sH r0 = r8.A0q
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L_0x017e
            X.0sO r0 = r8.A0n
            boolean r0 = r0.A0A(r2)
            if (r0 != 0) goto L_0x017e
            android.view.View r0 = r8.A09
            r0.setVisibility(r5)
            android.widget.TextView r0 = r8.A0E
            r0.setVisibility(r4)
            android.widget.TextView r3 = r8.A0E
            r2 = 2131888692(0x7f120a34, float:1.9412027E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "000000"
            r1[r4] = r0
            java.lang.String r1 = r8.getString(r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            android.text.Spanned r0 = X.AnonymousClass1ZW.A01(r1, r0)
            java.lang.String r0 = r0.toString()
            goto L_0x005f
        L_0x017e:
            X.0ul r1 = r8.A0v
            X.0sH r0 = r8.A0q
            boolean r0 = r1.A0e(r0)
            if (r0 != 0) goto L_0x01be
            X.0pd r3 = r8.A0C
            X.0uP r2 = r8.A0W
            X.0sH r0 = r8.A0q
            X.0rv r0 = r0.A0E
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r0)
            X.0zl r0 = r8.A0u
            boolean r0 = X.C41861wm.A01(r2, r3, r0, r1)
            if (r0 != 0) goto L_0x01be
            X.0pd r7 = r8.A0C
            X.0zl r3 = r8.A0u
            X.135 r2 = r8.A1E
            X.0uP r1 = r8.A0W
            X.0sH r0 = r8.A0q
            X.0rv r0 = r0.A0E
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            boolean r0 = X.C41871wn.A00(r1, r7, r3, r0, r2)
            if (r0 != 0) goto L_0x01be
            android.view.View r0 = r8.A09
            r0.setVisibility(r4)
            android.widget.TextView r0 = r8.A0E
            r0.setVisibility(r5)
            goto L_0x0062
        L_0x01be:
            android.view.View r0 = r8.A09
            r0.setVisibility(r5)
            android.widget.TextView r0 = r8.A0E
            r0.setVisibility(r5)
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.notification.PopupNotification.A2s(int):void");
    }

    public final void A2t(ThumbnailButton thumbnailButton) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0622);
        thumbnailButton.setMinimumHeight(dimensionPixelSize);
        thumbnailButton.setMaxHeight(dimensionPixelSize);
        thumbnailButton.setAdjustViewBounds(true);
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen0442);
        thumbnailButton.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        thumbnailButton.A02 = getResources().getDimension(R.dimen.dimen07d5);
        if (thumbnailButton instanceof C60032zq) {
            C60032zq r4 = (C60032zq) thumbnailButton;
            r4.A00 = ((float) dimensionPixelSize) / 7.0f;
            r4.A04 = 5;
        }
    }

    public void A2u(C15830rv r3) {
        StringBuilder sb = new StringBuilder("popupnotification/set-quick-reply-jid:");
        sb.append(r3);
        Log.i(sb.toString());
        this.A0x = r3;
    }

    public final void A2v(C38641rB r11, StickerView stickerView) {
        C34151jm A1A2 = r11.A1A();
        StickerView stickerView2 = stickerView;
        if (A1A2.A09 == null) {
            stickerView.setImageResource(R.drawable.sticker_error_in_conversation);
        }
        int dimensionPixelSize = stickerView.getContext().getResources().getDimensionPixelSize(R.dimen.dimen0624);
        this.A1D.A04(stickerView2, A1A2, (C436420x) null, 1, dimensionPixelSize, dimensionPixelSize, false, false);
    }

    public final boolean A2w() {
        return this.A0d.getText().toString().length() > 0 || this.A1I.A0P != null;
    }

    public boolean AIm() {
        return false;
    }

    public void Ac1() {
    }

    public void Afb(DialogFragment dialogFragment, String str) {
    }

    public void Afc(DialogFragment dialogFragment) {
    }

    public void Afg(int i2) {
        this.A05.A09(i2, 0);
    }

    public void Afh(String str) {
        this.A05.A0H(str, 0);
    }

    public void Afi(AnonymousClass2Sv r1, Object[] objArr, int i2, int i3, int i4) {
        Afj(objArr, i2, i3);
    }

    public void Afj(Object[] objArr, int i2, int i3) {
        this.A05.A0H(getString(i3, objArr), 0);
    }

    public void Afr(int i2, int i3) {
    }

    public void AhY(String str) {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AnonymousClass2DT r0 = this.A0g.A00;
        return (r0 == null || !r0.A0R) && super.dispatchTouchEvent(motionEvent);
    }

    public void onBackPressed() {
        A2p();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            getWindow().getDecorView().setLayoutDirection(3);
            if (i2 >= 21) {
                Window window = getWindow();
                int A002 = AnonymousClass00T.A00(this, 17170445);
            }
        }
        super.onCreate(bundle);
        boolean z2 = this.A1A.A00;
        int i3 = R.color.color0647;
        if (z2) {
            i3 = R.color.color0092;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass00T.A00(this, i3)));
        SensorManager A0D2 = this.A08.A0D();
        AnonymousClass00B.A06(A0D2);
        this.A04 = A0D2;
        this.A02 = A0D2.getDefaultSensor(8);
        PowerManager A0I2 = this.A08.A0I();
        if (A0I2 == null) {
            Log.w("popupnotification/create pm=null");
        } else {
            this.A05 = C43421zy.A00(A0I2, "popupnotification", 268435466);
        }
        setContentView(getLayoutInflater().inflate(R.layout.layout04a8, (ViewGroup) null, false));
        this.A12 = (PopupNotificationViewPager) findViewById(R.id.message_view_pager);
        C46142Cp r3 = (C46142Cp) findViewById(R.id.entry);
        this.A0d = r3;
        r3.setFilters(new InputFilter[]{new IDxIFilterShape446S0100000_2_I0(this, 0)});
        this.A0A = (Button) findViewById(R.id.popup_action_btn);
        C16080sP r32 = this.A0X;
        C16080sP r11 = r32;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.popup_title);
        this.A0M = new C30521cU((Context) this, textEmojiLabel, r11, this.A0k, this.A1C);
        this.A0F = (TextView) findViewById(R.id.conversation_contact_status);
        this.A0D = (TextView) findViewById(R.id.popup_count);
        ImageView imageView = (ImageView) findViewById(R.id.next_btn);
        imageView.setImageDrawable(new C447725m(getResources().getDrawable(R.drawable.selector_media_next), this.A0k));
        this.A07 = findViewById(R.id.next_btn_ext);
        ImageView imageView2 = (ImageView) findViewById(R.id.prev_btn);
        imageView2.setImageDrawable(new C447725m(getResources().getDrawable(R.drawable.selector_media_prev), this.A0k));
        this.A08 = findViewById(R.id.prev_btn_ext);
        this.A0E = (TextView) findViewById(R.id.read_only_chat_info);
        this.A09 = findViewById(R.id.emoji_popup_anchor);
        this.A0B = (ImageButton) findViewById(R.id.send);
        ImageButton imageButton = (ImageButton) findViewById(R.id.voice_note_btn);
        this.A0C = imageButton;
        imageButton.setLongClickable(true);
        AnonymousClass3TI r1 = new AnonymousClass3TI(new AnonymousClass3TE(this));
        this.A0S = r1;
        this.A12.setAdapter(r1);
        this.A12.setOnTouchListener(new IDxTListenerShape167S0100000_2_I0(this, 10));
        this.A12.A0G(new C62393Dj(this));
        findViewById(R.id.popup_ok_btn).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 14));
        ViewOnClickCListenerShape11S0100000_I0_4 viewOnClickCListenerShape11S0100000_I0_4 = new ViewOnClickCListenerShape11S0100000_I0_4(this, 17);
        this.A06 = viewOnClickCListenerShape11S0100000_I0_4;
        this.A0A.setOnClickListener(viewOnClickCListenerShape11S0100000_I0_4);
        ViewOnClickCListenerShape11S0100000_I0_4 viewOnClickCListenerShape11S0100000_I0_42 = new ViewOnClickCListenerShape11S0100000_I0_4(this, 15);
        imageView.setOnClickListener(viewOnClickCListenerShape11S0100000_I0_42);
        this.A07.setOnClickListener(viewOnClickCListenerShape11S0100000_I0_42);
        ViewOnClickCListenerShape11S0100000_I0_4 viewOnClickCListenerShape11S0100000_I0_43 = new ViewOnClickCListenerShape11S0100000_I0_4(this, 16);
        imageView2.setOnClickListener(viewOnClickCListenerShape11S0100000_I0_43);
        this.A08.setOnClickListener(viewOnClickCListenerShape11S0100000_I0_43);
        this.A0B.setImageDrawable(new C447725m(AnonymousClass00T.A04(this, R.drawable.input_send), this.A0k));
        View findViewById = findViewById(R.id.input_layout);
        findViewById.setBackgroundResource(R.drawable.ib_new_round);
        findViewById.setPadding(0, 0, 0, 0);
        View A052 = AnonymousClass00T.A05(this, R.id.text_entry_layout);
        int max = Math.max(A052.getPaddingLeft(), A052.getPaddingRight());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) A052.getLayoutParams();
        if (!this.A0k.A0T()) {
            layoutParams.rightMargin = max;
        } else {
            layoutParams.leftMargin = max;
        }
        A052.setLayoutParams(layoutParams);
        this.A0d.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 18));
        getLayoutInflater().inflate(R.layout.layout05e7, (ViewGroup) findViewById(R.id.voice_note_stub), true);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.root_layout);
        this.A1I = this.A1J.A01(this, keyboardPopupLayout, new C14750ph(), new IDxListenerShape380S0100000_2_I0(this, 1));
        this.A0C.setOnTouchListener(new IDxTListenerShape167S0100000_2_I0(this, 11));
        this.A0C.setVisibility(0);
        this.A0B.setVisibility(8);
        this.A0d.addTextChangedListener(new IDxWAdapterShape101S0100000_1_I0(this, 3));
        this.A0d.setOnEditorActionListener(new IDxAListenerShape211S0100000_2_I0(this, 3));
        this.A0B.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 13));
        C14710pd r16 = this.A0C;
        C23061Ai r15 = this.A1G;
        C16300so r12 = this.A03;
        C17250um r112 = this.A0B;
        C206711d r10 = this.A0r;
        AnonymousClass01V r8 = this.A08;
        AnonymousClass013 r5 = this.A0k;
        AnonymousClass1BQ r4 = this.A0t;
        C15860rz r33 = this.A09;
        C17020u3 r13 = this.A14;
        C23061Ai r25 = r15;
        C15860rz r18 = r33;
        AnonymousClass01V r17 = r8;
        C46142Cp r162 = this.A0d;
        KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
        C16300so r14 = r12;
        AnonymousClass2JH r113 = new AnonymousClass2JH(this, (ImageButton) findViewById(R.id.emoji_picker_btn), r14, keyboardPopupLayout2, r162, r17, r18, r5, r10, r112, r4, r16, r13, r25);
        r113.A0C(this.A0I);
        r113.A0A = new IDxICheckerShape379S0100000_2_I0(this, 1);
        C17250um r52 = this.A0B;
        C206711d r42 = this.A0r;
        AnonymousClass29I r9 = new AnonymousClass29I(this, this.A0k, r113, r42, r52, (EmojiSearchContainer) findViewById(R.id.popup_search_container), this.A14);
        this.A0s = r9;
        r9.A00 = new IDxEListenerShape200S0100000_2_I0(this, 6);
        if (getIntent().getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
            this.A10.A0E(false);
            this.A15.A01(true);
        }
        A2u(C15830rv.A02(getIntent().getStringExtra("popup_notification_extra_quick_reply_jid")));
        A2m();
        this.A0p.A02(this.A1W);
        this.A0V.A02(this.A1V);
        this.A0R.A02(this.A1U);
        this.A0w.A02(this.A1X);
        if (this.A0K.A00() > 0) {
            AnonymousClass29T.A01(this, 115);
        }
        if (this.A0x != null) {
            getWindow().setSoftInputMode(4);
        }
        this.A11.A00 = this.A1Y;
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 == 106) {
            C32241fu r5 = new C32241fu(this);
            r5.A06(getString(R.string.str03a5, new Object[]{this.A0X.A08(this.A0q)}));
            r5.setPositiveButton(R.string.str1872, new IDxCListenerShape127S0100000_2_I0(this, 81));
            r5.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 82));
            return r5.create();
        } else if (i2 != 115) {
            return super.onCreateDialog(i2);
        } else {
            Log.i("popupnotification/dialog-software-about-to-expire");
            return this.A0J.A01(this, this.A0N);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1MF r0 = this.A1D;
        if (r0 != null) {
            r0.A03();
        }
        AnonymousClass2Ao r02 = this.A0Y;
        if (r02 != null) {
            r02.A00();
            this.A0Y = null;
        }
        AnonymousClass1ZK r03 = this.A1I;
        if (r03 != null) {
            r03.A02();
        }
        this.A0x = null;
        this.A1S.removeCallbacks(this.A1Z);
        this.A1T.removeCallbacks(this.A1a);
        PowerManager.WakeLock wakeLock = this.A05;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.A05.release();
        }
        SensorEventListener sensorEventListener = this.A03;
        if (sensorEventListener != null) {
            this.A04.unregisterListener(sensorEventListener);
        }
        this.A0g.A06();
        this.A0p.A03(this.A1W);
        this.A0V.A03(this.A1V);
        this.A0R.A03(this.A1U);
        this.A0w.A03(this.A1X);
        this.A11.A00 = null;
    }

    public void onNewIntent(Intent intent) {
        Log.i("popupnotification/new-intent");
        super.onNewIntent(intent);
        setIntent(intent);
        A2u(C15830rv.A02(getIntent().getStringExtra("popup_notification_extra_quick_reply_jid")));
        if (intent.getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
            this.A10.A0E(false);
            this.A15.A01(true);
        }
        A2m();
    }

    public void onPause() {
        super.onPause();
        this.A1I.A0T(false, false);
        this.A15.A00();
    }

    public void onStart() {
        super.onStart();
        this.A1Q = true;
    }

    public void onStop() {
        super.onStop();
        this.A1Q = false;
        this.A1I.A0T(false, false);
    }
}
