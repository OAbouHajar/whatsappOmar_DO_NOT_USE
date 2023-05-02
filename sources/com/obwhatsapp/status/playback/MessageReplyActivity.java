package com.obwhatsapp.status.playback;

import X.AnonymousClass01Y;
import X.AnonymousClass10X;
import X.AnonymousClass12W;
import X.AnonymousClass14W;
import X.AnonymousClass19Y;
import X.AnonymousClass1A9;
import X.AnonymousClass1BQ;
import X.AnonymousClass1CX;
import X.AnonymousClass1DX;
import X.AnonymousClass1KE;
import X.AnonymousClass1KX;
import X.AnonymousClass1L1;
import X.AnonymousClass1M5;
import X.AnonymousClass1M7;
import X.AnonymousClass1M9;
import X.AnonymousClass1ME;
import X.AnonymousClass1MF;
import X.AnonymousClass1MJ;
import X.AnonymousClass1P7;
import X.AnonymousClass1SS;
import X.AnonymousClass1ZK;
import X.AnonymousClass1ZR;
import X.AnonymousClass1yW;
import X.AnonymousClass1yX;
import X.AnonymousClass1yZ;
import X.AnonymousClass29T;
import X.AnonymousClass2Ao;
import X.AnonymousClass2DJ;
import X.AnonymousClass2ZR;
import X.AnonymousClass36H;
import X.AnonymousClass3H7;
import X.AnonymousClass3Q5;
import X.AnonymousClass4PH;
import X.AnonymousClass53E;
import X.AnonymousClass5RN;
import X.C004601z;
import X.C04240Lt;
import X.C14750ph;
import X.C15810rt;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16080sP;
import X.C16260sj;
import X.C16460t6;
import X.C16490t9;
import X.C16740tZ;
import X.C16760tb;
import X.C17020u3;
import X.C17150uc;
import X.C17200uh;
import X.C18210wK;
import X.C19610yi;
import X.C19820z3;
import X.C206711d;
import X.C212613k;
import X.C23061Ai;
import X.C25751Kz;
import X.C25791Ld;
import X.C25801Le;
import X.C25821Lg;
import X.C25831Lh;
import X.C25841Li;
import X.C25861Lk;
import X.C25981Lw;
import X.C26151Mn;
import X.C26161Mo;
import X.C32241fu;
import X.C32301g2;
import X.C35541m6;
import X.C39501sa;
import X.C40651uT;
import X.C41791wf;
import X.C434420a;
import X.C47132Hs;
import X.C47482Jd;
import X.C47502Jf;
import X.C47562Jm;
import X.C47572Jn;
import X.C55472jf;
import X.C61953Bb;
import X.C85384Of;
import X.C86084Rd;
import X.C93534jM;
import X.C93544jN;
import android.animation.AnimatorSet;
import android.app.Application;
import android.app.Dialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape161S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape28S0200000_2_I0;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.facebook.redex.IDxSCallbackShape221S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0202000_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.facebook.redex.ViewOnClickCListenerShape1S0500000_I0;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MessageReplyActivity extends AnonymousClass2DJ implements AnonymousClass1yW, AnonymousClass1yX, AnonymousClass1yZ {
    public static final Interpolator A1H = C04240Lt.A00(0.32f, 0.0f, 0.67f, 0.0f);
    public static final Interpolator A1I = C04240Lt.A00(0.33f, 1.0f, 0.68f, 1.0f);
    public static final HashMap A1J = new HashMap();
    public static final HashMap A1K = new HashMap();
    public AnimatorSet A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public FrameLayout A06;
    public ImageButton A07;
    public ImageButton A08;
    public ImageButton A09;
    public ImageButton A0A;
    public ImageButton A0B;
    public AnonymousClass10X A0C;
    public C16760tb A0D;
    public C25751Kz A0E;
    public C17150uc A0F;
    public AnonymousClass1KX A0G;
    public AnonymousClass1KE A0H;
    public AnonymousClass1ME A0I;
    public C25821Lg A0J;
    public AnonymousClass01Y A0K;
    public AnonymousClass1SS A0L;
    public AnonymousClass19Y A0M;
    public C16000sG A0N;
    public C16080sP A0O;
    public AnonymousClass2Ao A0P;
    public C17200uh A0Q;
    public C55472jf A0R;
    public C25831Lh A0S;
    public C19610yi A0T;
    public C25801Le A0U;
    public AnonymousClass12W A0V;
    public C16260sj A0W;
    public C19820z3 A0X;
    public AnonymousClass1MJ A0Y;
    public C15810rt A0Z;
    public C16460t6 A0a;
    public C206711d A0b;
    public AnonymousClass1BQ A0c;
    public C16490t9 A0d;
    public C26151Mn A0e;
    public C47572Jn A0f;
    public C47562Jm A0g;
    public C25841Li A0h;
    public C25861Lk A0i;
    public C15830rv A0j;
    public AnonymousClass1P7 A0k;
    public C18210wK A0l;
    public MentionableEntry A0m;
    public AnonymousClass3Q5 A0n;
    public AnonymousClass1M5 A0o;
    public AnonymousClass1DX A0p;
    public AnonymousClass3H7 A0q;
    public C17020u3 A0r;
    public C16740tZ A0s;
    public C212613k A0t;
    public AnonymousClass1MF A0u;
    public AnonymousClass14W A0v;
    public AnonymousClass1CX A0w;
    public AnonymousClass1M9 A0x;
    public C26161Mo A0y;
    public C86084Rd A0z;
    public AnonymousClass1M7 A10;
    public C41791wf A11;
    public AnonymousClass1A9 A12;
    public C25791Ld A13;
    public AnonymousClass36H A14;
    public C25981Lw A15;
    public AnonymousClass1ZK A16;
    public AnonymousClass2ZR A17;
    public boolean A18 = false;
    public boolean A19;
    public boolean A1A;
    public final AnonymousClass5RN A1B = new IDxCListenerShape203S0100000_2_I0(this, 11);
    public final C32301g2 A1C = new IDxSCallbackShape221S0100000_2_I0(this, 6);
    public final Set A1D = new HashSet();
    public final Set A1E = new HashSet();
    public final Set A1F = new HashSet();
    public final int[] A1G = new int[2];

    public static /* synthetic */ void A02(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, WaTextView waTextView, MessageReplyActivity messageReplyActivity, int[] iArr, boolean z2) {
        MessageReplyActivity messageReplyActivity2 = messageReplyActivity;
        C17020u3 r0 = messageReplyActivity.A0r;
        if (z2) {
            C61953Bb.A01(r0, iArr);
        } else {
            C61953Bb.A02(r0, iArr);
        }
        messageReplyActivity2.A39(resources, view, viewGroup, imageView, waTextView, (int[]) iArr.clone());
    }

    public void A35() {
        if (this instanceof StatusReplyActivity) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this;
            AnonymousClass1L1 r2 = statusReplyActivity.A02;
            r2.A0F.Acl(new RunnableRunnableShape0S0202000_I0((Object) r2, 2, (Object) statusReplyActivity.A0s, 1, 7));
        }
    }

    public final void A36() {
        this.A01.setVisibility(8);
        MentionableEntry mentionableEntry = this.A0m;
        if (mentionableEntry != null && C23061Ai.A00(mentionableEntry)) {
            this.A0B.A01(this.A0m);
        }
        finish();
    }

    public final void A37() {
        A1K.put(this.A0s.A11, C40651uT.A05(this.A0m.getStringText()));
        A1J.put(this.A0s.A11, C39501sa.A00(this.A0m.getMentions()));
    }

    public final void A38(int i2) {
        int i3;
        C85384Of r0;
        AnonymousClass4PH r1;
        if (this instanceof StatusReplyActivity) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this;
            AnonymousClass1L1 r2 = statusReplyActivity.A02;
            C16740tZ r4 = statusReplyActivity.A0s;
            switch (i2) {
                case 2:
                    i3 = 2;
                    break;
                case 3:
                    i3 = 3;
                    break;
                case 4:
                    i3 = 4;
                    break;
                case 5:
                    i3 = 5;
                    break;
                case 6:
                    i3 = 6;
                    break;
                case 7:
                    i3 = 7;
                    break;
                case 8:
                    i3 = 8;
                    break;
                case 9:
                    i3 = 9;
                    break;
                case 10:
                    i3 = 10;
                    break;
                case 11:
                    i3 = 11;
                    break;
                case 12:
                    i3 = 12;
                    break;
                case 13:
                    i3 = 13;
                    break;
                case 14:
                    i3 = 14;
                    break;
                case 15:
                    i3 = 15;
                    break;
                default:
                    i3 = 16;
                    break;
            }
            C47482Jd r12 = r2.A00;
            if (r12 != null) {
                r12.A02++;
            }
            C47502Jf r02 = r2.A01;
            if (!(r02 == null || (r0 = (C85384Of) r02.A0D.get(AnonymousClass1L1.A01(r4))) == null || (r1 = (AnonymousClass4PH) r0.A08.get(r4.A11)) == null)) {
                r1.A00++;
            }
            r2.A0F.Acl(new RunnableRunnableShape0S0202000_I0((Object) r2, 1, (Object) r4, i3, 7));
        }
        if (this.A19) {
            String string = getString(R.string.str150d);
            View inflate = getLayoutInflater().inflate(R.layout.layout0208, (ViewGroup) null);
            ((TextView) C004601z.A0E(inflate, R.id.toast_text)).setText(string);
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(87, 0, 0);
            toast.setDuration(1);
            toast.setView(inflate);
            toast.show();
        } else {
            this.A05.A09(R.string.str150d, 0);
        }
        A1K.remove(this.A0s.A11);
        A1J.remove(this.A0s.A11);
        A36();
    }

    public final void A39(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, WaTextView waTextView, int[] iArr) {
        int[] iArr2 = iArr;
        ImageView imageView2 = imageView;
        imageView2.setImageDrawable(this.A0B.A04(resources, new C434420a(iArr2), 1.0f, -1));
        C004601z.A0j(view, new IDxDCompatShape22S0100000_2_I0(this, 13));
        view.setOnClickListener(new ViewOnClickCListenerShape1S0500000_I0(this, view, viewGroup, waTextView, iArr2, 3));
    }

    public void A3A(C93544jN r15) {
        if (this.A0K.A0V(UserJid.of(this.A0j))) {
            AnonymousClass29T.A01(this, 106);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C15830rv r4 = this.A0j;
        arrayList.add(r4);
        C93534jM r1 = r15.A01;
        int i2 = r1.A01;
        if (i2 <= 0) {
            i2 = r15.A02.A01;
        }
        int i3 = r1.A00;
        if (i3 <= 0) {
            i3 = r15.A02.A00;
        }
        String str = r15.A02.A02;
        String str2 = r1.A02;
        String str3 = r15.A03.A02;
        int i4 = r15.A00;
        int i5 = 22;
        if (C16030sJ.A0Q(r4)) {
            i5 = 24;
        }
        startActivityForResult(C14750ph.A0j(this, str, str2, str3, arrayList, i4, i5, false, false).putExtra("jid", this.A0j.getRawString()).putExtra("media_width", i2).putExtra("media_height", i3).putExtra("mentions", C16030sJ.A06(this.A0m.getMentions())).putExtra(FacebookFacade.RequestParameter.CAPTION, C40651uT.A05(this.A0m.getStringText())).putExtra("usage_quote", true), 25);
    }

    public final void A3B(String str, int i2) {
        C16010sH A082 = this.A0N.A08(this.A0j);
        if (A082 != null && A082.A0H()) {
            this.A05.Acl(new RunnableRunnableShape14S0100000_I0_13((Object) this, 47));
        }
        setResult(-1);
        C16760tb r1 = this.A0D;
        List singletonList = Collections.singletonList(this.A0j);
        r1.A0A((AnonymousClass1ZR) null, (C35541m6) null, this.A0s, C40651uT.A05(str), singletonList, this.A0m.getMentions(), false, false);
        A38(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r2.codePointCount(0, r2.length()) <= 65536) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3C(boolean r6) {
        /*
            r5 = this;
            X.01Y r1 = r5.A0K
            X.0rv r0 = r5.A0j
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x0014
            r3 = 106(0x6a, float:1.49E-43)
        L_0x0010:
            X.AnonymousClass29T.A01(r5, r3)
            return
        L_0x0014:
            X.1ZK r2 = r5.A16
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0037
            X.1cz r1 = r2.A0P
            r0 = 0
            if (r1 == 0) goto L_0x0020
            r0 = 1
        L_0x0020:
            r1 = 4
            if (r0 == 0) goto L_0x002a
            r2.A0T(r3, r4)
        L_0x0026:
            r5.A38(r1)
            return
        L_0x002a:
            java.io.File r0 = r2.A0Q
            if (r0 == 0) goto L_0x0037
            r2.A0Q(r4)
            X.1ZK r0 = r5.A16
            r0.A0N(r3)
            goto L_0x0026
        L_0x0037:
            android.widget.ImageButton r0 = r5.A0A
            r0.setEnabled(r4)
            com.obwhatsapp.mentions.MentionableEntry r0 = r5.A0m
            java.lang.String r0 = r0.getStringText()
            java.lang.String r2 = r0.trim()
            X.01V r1 = r5.A08
            X.0u3 r0 = r5.A0r
            boolean r0 = X.C45922Bq.A0B(r1, r0, r2)
            if (r0 != 0) goto L_0x0059
            X.0pt r1 = r5.A05
            r0 = 2131887011(0x7f1203a3, float:1.9408617E38)
            r1.A09(r0, r3)
            return
        L_0x0059:
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r6 == 0) goto L_0x0066
            java.lang.String r2 = X.AnonymousClass1ZW.A04(r1, r2)
        L_0x0061:
            r0 = 2
            r5.A3B(r2, r0)
            return
        L_0x0066:
            int r0 = r2.length()
            int r0 = r2.codePointCount(r4, r0)
            r3 = 17
            if (r0 > r1) goto L_0x0010
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.MessageReplyActivity.A3C(boolean):void");
    }

    public final boolean A3D() {
        Rect rect = new Rect();
        this.A05.getWindowVisibleDisplayFrame(rect);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int height = this.A05.getRootView().getHeight() - (rect.bottom - rect.top);
        if (((int) (((float) height) / displayMetrics.density)) <= 100) {
            return false;
        }
        int dimensionPixelSize = (displayMetrics.heightPixels - height) + getResources().getDimensionPixelSize(R.dimen.dimen0240);
        ViewGroup.LayoutParams layoutParams = this.A06.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        this.A06.setLayoutParams(layoutParams);
        this.A00.start();
        return true;
    }

    public void A5F() {
    }

    public void A5G(int i2) {
        A38(i2);
    }

    public C16740tZ AFJ() {
        return this.A0s;
    }

    public void AUl(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A0q.A02(pickerSearchDialogFragment);
    }

    public void AVt() {
        this.A0R.A01();
    }

    public void AYl() {
        this.A0R.A00();
    }

    public void AcQ() {
    }

    public void Afa(DialogFragment dialogFragment) {
        Afc(dialogFragment);
        getWindow().setSoftInputMode(1);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A0g.A01()) {
            View view = this.A02;
            int[] iArr = this.A1G;
            view.getLocationOnScreen(iArr);
            if (motionEvent.getRawY() >= ((float) iArr[1]) && motionEvent.getRawY() < ((float) (iArr[1] + this.A02.getHeight()))) {
                if (motionEvent.getAction() == 0) {
                    this.A1A = true;
                } else if (motionEvent.getAction() == 1) {
                    if (this.A1A) {
                        this.A0g.A00(true);
                        this.A02.requestFocus();
                    }
                    this.A1A = false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ab, code lost:
        if (r9.A0F != null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ad, code lost:
        r5 = r4.getIntExtra("provider", 0);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b5, code lost:
        if (r5 == 1) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b7, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b8, code lost:
        if (r5 == 2) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ba, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bb, code lost:
        r9.A05 = r0;
        r2.A0D.A07(new X.C43241zg(java.util.Collections.singletonList(r2.A0l.A03(r8, r9, (X.C35541m6) null, r2.A0j, r2.A0s, r4.getStringExtra(com.mod2.fblibs.FacebookFacade.RequestParameter.CAPTION), (java.lang.String) null, X.C16030sJ.A08(com.whatsapp.jid.UserJid.class, r4.getStringArrayListExtra("mentions")), (java.util.List) null, (byte) 13, 0, 0, false))), r3, false, false);
        r2.A0g.A00(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f8, code lost:
        A38(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0126, code lost:
        if (r8 == null) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r22, int r23, android.content.Intent r24) {
        /*
            r21 = this;
            r2 = r21
            r7 = r22
            r5 = r23
            r4 = r24
            super.onActivityResult(r7, r5, r4)
            java.util.Set r0 = r2.A1D
            java.util.Iterator r1 = r0.iterator()
        L_0x0011:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r1.next()
            X.2Su r0 = (X.AnonymousClass2Su) r0
            boolean r0 = r0.AM4(r4, r7, r5)
            if (r0 == 0) goto L_0x0011
        L_0x0023:
            return
        L_0x0024:
            r3 = 8
            r6 = -1
            if (r7 == r3) goto L_0x005c
            r1 = 9
            if (r7 == r1) goto L_0x0057
            r0 = 22
            if (r7 == r0) goto L_0x0052
            r0 = 25
            if (r7 == r0) goto L_0x0071
            r0 = 77
            if (r7 == r0) goto L_0x006b
            r0 = 802(0x322, float:1.124E-42)
            if (r7 == r0) goto L_0x0061
            r0 = 806(0x326, float:1.13E-42)
            if (r7 == r0) goto L_0x004d
            r0 = 858(0x35a, float:1.202E-42)
            if (r7 != r0) goto L_0x0023
            if (r5 != r6) goto L_0x0023
            r0 = 16
        L_0x0049:
            r2.A38(r0)
            return
        L_0x004d:
            if (r5 != r6) goto L_0x0023
            r0 = 12
            goto L_0x0049
        L_0x0052:
            if (r5 != r6) goto L_0x0023
            r0 = 13
            goto L_0x0049
        L_0x0057:
            if (r5 != r6) goto L_0x0023
            r0 = 11
            goto L_0x0049
        L_0x005c:
            if (r5 != r6) goto L_0x0023
            r0 = 10
            goto L_0x0049
        L_0x0061:
            if (r5 == r6) goto L_0x0067
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r0) goto L_0x0023
        L_0x0067:
            r2.A38(r3)
            return
        L_0x006b:
            if (r5 != r6) goto L_0x0023
            r2.A38(r1)
            return
        L_0x0071:
            if (r5 != r6) goto L_0x0023
            java.lang.String r0 = "file_path"
            java.lang.String r3 = r4.getStringExtra(r0)
            java.lang.String r0 = "media_url"
            java.lang.String r1 = r4.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00fd
        L_0x008b:
            X.0ta r9 = new X.0ta
            r9.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r0 != 0) goto L_0x0103
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r9.A0F = r0
            android.graphics.Bitmap r1 = X.C18830xK.A01(r0)
            r0 = 100
            byte[] r3 = X.C18830xK.A03(r1, r0)
            r8 = r5
        L_0x00a9:
            java.io.File r0 = r9.A0F
            if (r0 == 0) goto L_0x00f8
        L_0x00ad:
            java.lang.String r0 = "provider"
            r1 = 0
            int r5 = r4.getIntExtra(r0, r1)
            r0 = 1
            if (r5 == r0) goto L_0x00bb
            r0 = 2
            if (r5 == r0) goto L_0x00bb
            r0 = 0
        L_0x00bb:
            r9.A05 = r0
            X.0tb r0 = r2.A0D
            X.0wK r7 = r2.A0l
            X.0rv r11 = r2.A0j
            java.lang.String r5 = "caption"
            java.lang.String r13 = r4.getStringExtra(r5)
            X.0tZ r12 = r2.A0s
            r10 = 0
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            java.lang.String r5 = "mentions"
            java.util.ArrayList r4 = r4.getStringArrayListExtra(r5)
            java.util.List r15 = X.C16030sJ.A08(r6, r4)
            r17 = 13
            r16 = r10
            r19 = 0
            r20 = 0
            r18 = 0
            r14 = r10
            X.0tY r4 = r7.A03(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.List r5 = java.util.Collections.singletonList(r4)
            X.1zg r4 = new X.1zg
            r4.<init>(r5)
            r0.A07(r4, r3, r1, r1)
            X.2Jm r0 = r2.A0g
            r0.A00(r1)
        L_0x00f8:
            r0 = 14
            r2.A38(r0)
        L_0x00fd:
            X.2Jn r0 = r2.A0f
            r0.dismiss()
            return
        L_0x0103:
            android.net.Uri r8 = android.net.Uri.parse(r1)
            java.lang.String r0 = "media_width"
            int r0 = r4.getIntExtra(r0, r6)
            r9.A08 = r0
            java.lang.String r0 = "media_height"
            int r0 = r4.getIntExtra(r0, r6)
            r9.A06 = r0
            java.lang.String r0 = "preview_media_url"
            java.lang.String r1 = r4.getStringExtra(r0)
            if (r1 == 0) goto L_0x0125
            X.1Li r0 = r2.A0h
            byte[] r5 = r0.A03(r1)
        L_0x0125:
            r3 = r5
            if (r8 != 0) goto L_0x00ad
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.MessageReplyActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A19) {
            boolean z2 = true;
            int i2 = 0;
            boolean z3 = false;
            if (configuration.orientation == 2) {
                z3 = true;
            }
            if (this.A0L.A00() != C47132Hs.TABLET) {
                z2 = false;
            }
            FrameLayout frameLayout = this.A06;
            if (frameLayout != null) {
                if (z3 && !z2) {
                    i2 = 8;
                }
                frameLayout.setVisibility(i2);
            }
            if (!z3 || z2) {
                A3D();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r0.A0C.A0E(X.C16620tM.A02, 1455) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r60) {
        /*
            r59 = this;
            r0 = r59
            r58 = r60
            r1 = r58
            super.onCreate(r1)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "isStatusReply"
            r11 = 0
            boolean r1 = r2.getBooleanExtra(r1, r11)
            r3 = 1
            if (r1 == 0) goto L_0x0024
            X.0pd r4 = r0.A0C
            r2 = 1455(0x5af, float:2.039E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r2 = r4.A0E(r1, r2)
            r1 = 1
            if (r2 != 0) goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            r0.A19 = r1
            X.1CX r8 = r0.A0w
            X.0sq r9 = r0.A05
            X.13k r6 = r0.A0t
            X.14W r7 = r0.A0v
            X.0rz r5 = r0.A09
            X.1wf r4 = new X.1wf
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A11 = r4
            X.3H7 r1 = new X.3H7
            r1.<init>(r4)
            r0.A0q = r1
            X.02z r2 = new X.02z
            r2.<init>(r0)
            java.lang.Class<X.3Q5> r1 = X.AnonymousClass3Q5.class
            X.01n r1 = r2.A01(r1)
            X.3Q5 r1 = (X.AnonymousClass3Q5) r1
            r0.A0n = r1
            r1 = 2131559404(0x7f0d03ec, float:1.8744151E38)
            r0.setContentView((int) r1)
            android.content.Intent r1 = r0.getIntent()
            X.1Vw r5 = X.AnonymousClass1yL.A02(r1)
            X.0t6 r1 = r0.A0a
            X.0th r1 = r1.A0K
            X.0tZ r4 = r1.A03(r5)
            r0.A0s = r4
            if (r4 == 0) goto L_0x05fb
            boolean r1 = r4 instanceof X.AnonymousClass1WU
            if (r1 != 0) goto L_0x05fb
            X.1Vw r1 = r4.A11
            X.0rv r2 = r1.A00
            boolean r1 = X.C16030sJ.A0Q(r2)
            r0.A18 = r1
            if (r1 == 0) goto L_0x05f4
            X.0rv r2 = r4.A0B()
            X.AnonymousClass00B.A06(r2)
        L_0x007f:
            r0.A0j = r2
            r6 = 2131364432(0x7f0a0a50, float:1.83487E38)
            android.view.View r1 = r0.findViewById(r6)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.A05 = r1
            r1 = 2131364431(0x7f0a0a4f, float:1.8348699E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r0, r1)
            r0.A04 = r1
            r1 = 2131362318(0x7f0a020e, float:1.8344413E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r0, r1)
            r0.A01 = r1
            r1 = 2131362964(0x7f0a0494, float:1.8345723E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r0, r1)
            r0.A03 = r1
            r1 = 2131366372(0x7f0a11e4, float:1.8352636E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r0, r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.A06 = r1
            r1 = 2131363361(0x7f0a0621, float:1.8346529E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.A02 = r1
            r1 = 2131366071(0x7f0a10b7, float:1.8352025E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r0, r1)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r0.A0A = r1
            r1 = 2131363293(0x7f0a05dd, float:1.834639E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r0, r1)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r0.A09 = r1
            r1 = 2131366995(0x7f0a1453, float:1.83539E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r0, r1)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r0.A0B = r1
            r1.setLongClickable(r3)
            android.widget.ImageButton r2 = r0.A0B
            r5 = 13
            com.facebook.redex.IDxTListenerShape167S0100000_2_I0 r1 = new com.facebook.redex.IDxTListenerShape167S0100000_2_I0
            r1.<init>(r0, r5)
            r2.setOnTouchListener(r1)
            r1 = 2131362555(0x7f0a02fb, float:1.8344894E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r0, r1)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r0.A07 = r1
            r1.setVisibility(r11)
            android.widget.ImageButton r4 = r0.A07
            r2 = 12
            com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6 r1 = new com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6
            r1.<init>(r0, r2)
            r4.setOnClickListener(r1)
            r1 = 2131364130(0x7f0a0922, float:1.8348088E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r0, r1)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r0.A08 = r1
            r1.setVisibility(r11)
            android.widget.ImageButton r4 = r0.A08
            r2 = 41
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r1 = new com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2
            r1.<init>(r0, r2)
            r4.setOnClickListener(r1)
            android.view.LayoutInflater r4 = r0.getLayoutInflater()
            r2 = 2131559911(0x7f0d05e7, float:1.874518E38)
            r1 = 2131367019(0x7f0a146b, float:1.8353948E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4.inflate(r2, r1, r3)
            r2 = 2
            com.facebook.redex.IDxListenerShape380S0100000_2_I0 r8 = new com.facebook.redex.IDxListenerShape380S0100000_2_I0
            r8.<init>(r0, r2)
            X.2ZR r7 = r0.A17
            android.view.View r4 = r0.A04
            X.AnonymousClass00B.A04(r4)
            X.0ph r1 = new X.0ph
            r1.<init>()
            X.1ZK r8 = r7.A00(r4, r0, r1, r8)
            r0.A16 = r8
            X.0rv r7 = r0.A0j
            X.1cz r4 = r8.A0P
            r1 = 0
            if (r4 == 0) goto L_0x0152
            r1 = 1
        L_0x0152:
            r4 = r1 ^ 1
            java.lang.String r1 = "Do not update the ptt receiver once the recording has started"
            X.AnonymousClass00B.A0D(r1, r4)
            r8.A0J = r7
            X.0tZ r1 = r0.A0s
            r8.A0L = r1
            r1 = 2131363497(0x7f0a06a9, float:1.8346804E38)
            android.view.View r8 = X.AnonymousClass00T.A05(r0, r1)
            com.obwhatsapp.mentions.MentionableEntry r8 = (com.obwhatsapp.mentions.MentionableEntry) r8
            r0.A0m = r8
            android.text.InputFilter[] r7 = new android.text.InputFilter[r3]
            r1 = 1
            com.facebook.redex.IDxIFilterShape446S0100000_2_I0 r4 = new com.facebook.redex.IDxIFilterShape446S0100000_2_I0
            r4.<init>(r0, r3)
            r7[r11] = r4
            r8.setFilters(r7)
            X.4ag r8 = new X.4ag
            r8.<init>()
            com.obwhatsapp.mentions.MentionableEntry r7 = r0.A0m
            X.4zh r4 = new X.4zh
            r4.<init>(r8, r0)
            r7.A0D = r4
            r4 = 2131364133(0x7f0a0925, float:1.8348094E38)
            android.view.View r4 = r0.findViewById(r4)
            r7 = 2131231384(0x7f080298, float:1.8078847E38)
            r4.setBackgroundResource(r7)
            r4.setPadding(r11, r11, r11, r11)
            X.0rv r8 = r0.A0j
            boolean r7 = X.C16030sJ.A0L(r8)
            if (r7 == 0) goto L_0x01c4
            X.0rt r7 = r0.A0Z
            boolean r7 = r7.A0H(r8)
            if (r7 != 0) goto L_0x01c4
            com.obwhatsapp.mentions.MentionableEntry r8 = r0.A0m
            r8.A05 = r4
            com.facebook.redex.IDxCListenerShape431S0100000_2_I0 r7 = new com.facebook.redex.IDxCListenerShape431S0100000_2_I0
            r7.<init>(r4, r3)
            r8.A0A = r7
            r7 = 2131364561(0x7f0a0ad1, float:1.8348963E38)
            android.view.View r9 = X.AnonymousClass00T.A05(r0, r7)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.0rv r7 = r0.A0j
            X.0sL r10 = X.C16050sL.A03(r7)
            r12 = 0
            r13 = r3
            r8.A0D(r9, r10, r11, r12, r13)
        L_0x01c4:
            java.util.HashMap r7 = A1K
            X.0tZ r3 = r0.A0s
            X.1Vw r3 = r3.A11
            java.lang.Object r10 = r7.get(r3)
            java.lang.String r10 = (java.lang.String) r10
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L_0x020d
            android.widget.FrameLayout r7 = r0.A06
            r3 = 8
            r7.setVisibility(r3)
            java.util.HashMap r7 = A1J
            X.0tZ r3 = r0.A0s
            X.1Vw r3 = r3.A11
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r7 = X.C39501sa.A01(r3)
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A0m
            r3.setMentionableText(r10, r7)
            X.0um r9 = r0.A0B
            X.01V r8 = r0.A08
            X.0u3 r7 = r0.A0r
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A0m
            android.text.Editable r14 = r3.getEditableText()
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A0m
            android.text.TextPaint r13 = r3.getPaint()
            r12 = r0
            r15 = r8
            r16 = r9
            r17 = r7
            X.C45922Bq.A06(r12, r13, r14, r15, r16, r17)
        L_0x020d:
            boolean r8 = X.AnonymousClass1ZW.A0E(r10)
            r7 = 8
            android.widget.ImageButton r3 = r0.A0B
            if (r8 == 0) goto L_0x05e5
            r3.setVisibility(r11)
            android.widget.ImageButton r3 = r0.A07
            r3.setVisibility(r11)
            android.widget.ImageButton r3 = r0.A0A
            r3.setVisibility(r7)
        L_0x0224:
            r3 = 2131232064(0x7f080540, float:1.8080227E38)
            android.widget.ImageButton r10 = r0.A0A
            X.013 r9 = r0.A01
            android.graphics.drawable.Drawable r8 = X.AnonymousClass00T.A04(r0, r3)
            X.25m r3 = new X.25m
            r3.<init>(r8, r9)
            r10.setImageDrawable(r3)
            r3 = 2131366596(0x7f0a12c4, float:1.835309E38)
            android.view.View r10 = X.AnonymousClass00T.A05(r0, r3)
            int r8 = r10.getPaddingLeft()
            int r3 = r10.getPaddingRight()
            int r9 = java.lang.Math.max(r8, r3)
            android.view.ViewGroup$LayoutParams r8 = r10.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r8 = (android.widget.RelativeLayout.LayoutParams) r8
            X.013 r3 = r0.A01
            boolean r3 = r3.A0T()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x05e1
            r8.rightMargin = r9
        L_0x025c:
            r10.setLayoutParams(r8)
            X.0sG r8 = r0.A0N
            X.0rv r3 = r0.A0j
            X.0sH r3 = r8.A0A(r3)
            X.35P r8 = new X.35P
            r8.<init>(r3, r0)
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A0m
            r3.addTextChangedListener(r8)
            com.obwhatsapp.mentions.MentionableEntry r9 = r0.A0m
            com.facebook.redex.IDxIListenerShape444S0100000_2_I0 r3 = new com.facebook.redex.IDxIListenerShape444S0100000_2_I0
            r3.<init>(r0, r1)
            r9.A00 = r3
            r8 = 5
            com.facebook.redex.IDxAListenerShape211S0100000_2_I0 r3 = new com.facebook.redex.IDxAListenerShape211S0100000_2_I0
            r3.<init>(r0, r8)
            r9.setOnEditorActionListener(r3)
            android.widget.ImageButton r8 = r0.A0A
            com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6 r3 = new com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6
            r3.<init>(r0, r5)
            r8.setOnClickListener(r3)
            android.widget.ImageButton r8 = r0.A09
            r5 = 11
            com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6 r3 = new com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6
            r3.<init>(r0, r5)
            r8.setOnClickListener(r3)
            r3 = 2131363403(0x7f0a064b, float:1.8346614E38)
            android.view.View r9 = X.AnonymousClass00T.A05(r0, r3)
            android.widget.ImageButton r9 = (android.widget.ImageButton) r9
            X.1M9 r3 = r0.A0x
            r3.A00()
            X.1M9 r3 = r0.A0x
            boolean r3 = r3.A00
            if (r3 == 0) goto L_0x02d5
            X.1M7 r5 = r0.A10
            X.4mG r3 = new X.4mG
            r3.<init>(r5)
            X.02z r5 = new X.02z
            r5.<init>((X.AnonymousClass04o) r3, (X.C001500q) r0)
            java.lang.Class<X.1Mo> r3 = X.C26161Mo.class
            X.01n r8 = r5.A01(r3)
            X.1Mo r8 = (X.C26161Mo) r8
            r0.A0y = r8
            X.1wf r3 = r0.A11
            r3.A01 = r8
            X.0pt r5 = r0.A05
            X.4Rd r3 = new X.4Rd
            r3.<init>(r5, r8)
            r0.A0z = r3
            X.1BQ r3 = r0.A0c
            r3.A01()
        L_0x02d5:
            X.1Mn r10 = r0.A0e
            r10.A00 = r0
            android.view.View r5 = r0.findViewById(r6)
            com.obwhatsapp.KeyboardPopupLayout r5 = (com.obwhatsapp.KeyboardPopupLayout) r5
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A0m
            r10.A02 = r5
            r10.A01 = r9
            r10.A03 = r3
            X.1MJ r9 = r0.A0Y
            X.4OB r3 = r9.A00()
            r10.A05 = r3
            X.1Li r8 = r9.A0B
            X.1Lk r6 = r9.A0C
            X.1MH r5 = r9.A05
            X.3Fe r3 = new X.3Fe
            r3.<init>(r5, r8, r6)
            r10.A06 = r3
            X.1Mo r5 = r0.A0y
            X.1wf r3 = r0.A11
            X.39R r3 = r9.A01(r5, r3)
            r10.A07 = r3
            X.2Jn r5 = r10.A00()
            r0.A0f = r5
            X.3H7 r3 = r0.A0q
            r3.A02 = r0
            r3.A00 = r5
            r5.A03 = r3
            X.5RN r3 = r0.A1B
            r5.A0C(r3)
            com.facebook.redex.IDxICheckerShape379S0100000_2_I0 r3 = new com.facebook.redex.IDxICheckerShape379S0100000_2_I0
            r3.<init>(r0, r2)
            r5.A0A = r3
            X.1Li r3 = r0.A0h
            r22 = r3
            X.1Ai r3 = r0.A0B
            r17 = r3
            X.0t9 r3 = r0.A0d
            r16 = r3
            X.01V r15 = r0.A08
            X.1Lk r14 = r0.A0i
            r3 = 2131363863(0x7f0a0817, float:1.8347547E38)
            android.view.View r13 = r0.findViewById(r3)
            com.obwhatsapp.gifsearch.GifSearchContainer r13 = (com.obwhatsapp.gifsearch.GifSearchContainer) r13
            X.0rz r12 = r0.A09
            r3 = 2131363408(0x7f0a0650, float:1.8346624E38)
            android.view.View r11 = r0.findViewById(r3)
            com.obwhatsapp.emoji.search.EmojiSearchContainer r11 = (com.obwhatsapp.emoji.search.EmojiSearchContainer) r11
            X.2Jn r10 = r0.A0f
            X.0um r9 = r0.A0B
            X.11d r8 = r0.A0b
            X.013 r5 = r0.A01
            X.0u3 r3 = r0.A0r
            X.2Jm r6 = new X.2Jm
            r18 = r9
            r19 = r11
            r20 = r16
            r21 = r10
            r23 = r13
            r24 = r14
            r25 = r3
            r26 = r17
            r13 = r0
            r14 = r15
            r15 = r12
            r16 = r5
            r17 = r8
            r12 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.A0g = r6
            r5 = 9
            com.facebook.redex.IDxEListenerShape200S0100000_2_I0 r3 = new com.facebook.redex.IDxEListenerShape200S0100000_2_I0
            r3.<init>(r0, r5)
            r6.A00 = r3
            X.4yb r3 = new X.4yb
            r3.<init>(r0)
            r6.A00 = r3
            X.2Jn r5 = r0.A0f
            com.facebook.redex.IDxSListenerShape276S0100000_2_I0 r3 = new com.facebook.redex.IDxSListenerShape276S0100000_2_I0
            r3.<init>(r0, r1)
            r5.A0J(r3)
            X.3H7 r5 = r0.A0q
            com.facebook.redex.IDxSListenerShape430S0100000_2_I0 r3 = new com.facebook.redex.IDxSListenerShape430S0100000_2_I0
            r3.<init>(r0, r1)
            r5.A01 = r3
            com.facebook.redex.IDxSListenerShape276S0100000_2_I0 r3 = new com.facebook.redex.IDxSListenerShape276S0100000_2_I0
            r3.<init>(r0, r1)
            r5.A04 = r3
            X.1wf r3 = r0.A11
            X.14W r5 = r3.A0A
            X.1we r3 = r3.A09
            r5.A02(r3)
            boolean r3 = r0.A19
            if (r3 != 0) goto L_0x05ba
            android.widget.FrameLayout r3 = r0.A06
            r3.setVisibility(r7)
            android.view.LayoutInflater r6 = r0.getLayoutInflater()
            r4 = 2131559653(0x7f0d04e5, float:1.8744656E38)
            r3 = 0
            r5 = 0
            android.view.View r9 = r6.inflate(r4, r3, r5)
            r3 = 2131365614(0x7f0a0eee, float:1.8351098E38)
            android.view.View r4 = r9.findViewById(r3)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            android.graphics.drawable.Drawable r3 = X.AnonymousClass4Y4.A00(r0)
            r4.setForeground(r3)
            r3 = 2131365616(0x7f0a0ef0, float:1.8351102E38)
            android.view.View r3 = X.AnonymousClass00T.A05(r0, r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.setVisibility(r5)
            r3.addView(r9)
            r3 = 2131365626(0x7f0a0efa, float:1.8351123E38)
            android.view.View r8 = r9.findViewById(r3)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r3 = 2131365612(0x7f0a0eec, float:1.8351094E38)
            android.view.View r7 = r9.findViewById(r3)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3 = 2131365623(0x7f0a0ef7, float:1.8351117E38)
            android.view.View r6 = r9.findViewById(r3)
            android.widget.TextView r6 = (android.widget.TextView) r6
            X.1Lh r4 = r0.A0S
            android.content.res.Resources r3 = r0.getResources()
            float r3 = r4.A01(r3)
            r8.setTextSize(r3)
            r7.setTextSize(r3)
            r6.setTextSize(r3)
            X.AnonymousClass1UP.A06(r8)
            X.AnonymousClass1UP.A06(r7)
            X.AnonymousClass1UP.A06(r6)
            X.1Le r8 = r0.A0U
            X.0rv r11 = r0.A0j
            X.0tZ r7 = r0.A0s
            X.1MF r6 = r0.A0u
            X.2Ao r10 = r0.A0P
            if (r10 != 0) goto L_0x0422
            X.0uh r4 = r0.A0Q
            java.lang.String r3 = "message-reply-activity"
            X.2Ao r10 = r4.A04(r0, r3)
            r0.A0P = r10
        L_0x0422:
            r14 = 0
            r15 = 0
            r12 = r7
            r13 = r6
            r8.A01(r9, r10, r11, r12, r13, r14, r15)
        L_0x0429:
            boolean r3 = r0.A19
            if (r3 == 0) goto L_0x058d
            android.view.View r3 = r0.A03
            r4 = 0
            r3.setAlpha(r4)
            android.widget.FrameLayout r3 = r0.A06
            r3.setAlpha(r4)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r0.A00 = r3
            android.widget.FrameLayout r4 = r0.A06
            android.util.Property r11 = android.view.View.ALPHA
            float[] r3 = new float[r1]
            r10 = 1065353216(0x3f800000, float:1.0)
            r3[r5] = r10
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r4, r11, r3)
            r3 = 150(0x96, double:7.4E-322)
            r9.setDuration(r3)
            android.view.animation.Interpolator r8 = A1H
            r9.setInterpolator(r8)
            android.view.View r7 = r0.A03
            float[] r6 = new float[r1]
            r6[r5] = r10
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r7, r11, r6)
            r6.setDuration(r3)
            r6.setInterpolator(r8)
            android.animation.AnimatorSet r3 = r0.A00
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r2[r5] = r6
            r2[r1] = r9
            r3.playTogether(r2)
            android.view.ViewGroup r1 = r0.A05
            android.view.ViewTreeObserver r3 = r1.getViewTreeObserver()
            r2 = 26
            com.facebook.redex.IDxLListenerShape144S0100000_2_I0 r1 = new com.facebook.redex.IDxLListenerShape144S0100000_2_I0
            r1.<init>(r0, r2)
            r3.addOnGlobalLayoutListener(r1)
        L_0x0482:
            com.obwhatsapp.status.playback.MessageReplyActivity$7 r3 = new com.obwhatsapp.status.playback.MessageReplyActivity$7
            r3.<init>()
            android.view.View r1 = r0.A01
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            X.0Bo r1 = (X.AnonymousClass0Bo) r1
            r1.A01(r3)
            r2 = 4
            com.google.android.material.bottomsheet.IDxSCallbackShape45S0100000_2_I0 r1 = new com.google.android.material.bottomsheet.IDxSCallbackShape45S0100000_2_I0
            r1.<init>(r0, r2)
            r3.A0E = r1
            android.view.View r3 = r0.A01
            r2 = 42
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r1 = new com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2
            r1.<init>(r0, r2)
            r3.setOnClickListener(r1)
            X.01Y r2 = r0.A0K
            X.0rv r1 = r0.A0j
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r1)
            boolean r1 = r2.A0V(r1)
            if (r1 == 0) goto L_0x04b9
            r1 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass29T.A01(r0, r1)
        L_0x04b9:
            X.46U r33 = new X.46U
            r33.<init>()
            X.0pd r1 = r0.A0C
            r41 = r1
            X.0pt r1 = r0.A05
            r57 = r1
            X.1Ai r1 = r0.A0B
            r51 = r1
            X.0sK r1 = r0.A01
            r56 = r1
            X.10X r1 = r0.A0C
            r55 = r1
            X.0sb r1 = r0.A04
            r54 = r1
            X.0t9 r1 = r0.A0d
            r42 = r1
            X.0s5 r1 = r0.A06
            r22 = r1
            X.1KE r1 = r0.A0H
            r27 = r1
            X.0tb r1 = r0.A0D
            r23 = r1
            X.1KX r1 = r0.A0G
            r26 = r1
            X.0pf r1 = r0.A06
            r40 = r1
            X.1P7 r1 = r0.A0k
            r44 = r1
            X.1Lg r1 = r0.A0J
            r29 = r1
            X.1A9 r1 = r0.A12
            r21 = r1
            X.01V r1 = r0.A08
            r20 = r1
            X.01Y r1 = r0.A0K
            r19 = r1
            X.1DX r1 = r0.A0p
            r18 = r1
            X.12W r1 = r0.A0V
            r17 = r1
            X.19Y r15 = r0.A0M
            X.0sj r14 = r0.A0W
            X.0rz r13 = r0.A09
            X.1Kz r12 = r0.A0E
            X.0uc r11 = r0.A0F
            X.0yW r10 = r0.A0A
            X.0u3 r9 = r0.A0r
            X.0yi r8 = r0.A0T
            X.1g2 r7 = r0.A1C
            X.0rv r6 = r0.A0j
            r53 = 0
            com.obwhatsapp.mentions.MentionableEntry r5 = r0.A0m
            X.3Q5 r4 = r0.A0n
            X.1M5 r3 = r0.A0o
            X.1ME r2 = r0.A0I
            X.2jf r1 = new X.2jf
            r32 = r0
            r16 = r0
            r24 = r12
            r25 = r11
            r28 = r2
            r30 = r19
            r31 = r15
            r34 = r8
            r35 = r7
            r36 = r17
            r37 = r20
            r38 = r14
            r39 = r13
            r43 = r6
            r45 = r5
            r46 = r4
            r47 = r3
            r48 = r18
            r49 = r9
            r50 = r10
            r52 = r21
            r15 = r1
            r17 = r0
            r18 = r54
            r19 = r57
            r20 = r56
            r21 = r55
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r0.A0R = r1
            java.util.Set r3 = r0.A1E
            r3.add(r1)
            java.util.Set r2 = r0.A1D
            X.2jf r1 = r0.A0R
            r2.add(r1)
            java.util.Set r2 = r0.A1F
            X.2jf r1 = r0.A0R
            r2.add(r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x057b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0617
            java.lang.Object r2 = r3.next()
            android.app.Application$ActivityLifecycleCallbacks r2 = (android.app.Application.ActivityLifecycleCallbacks) r2
            r1 = r58
            r2.onActivityCreated(r0, r1)
            goto L_0x057b
        L_0x058d:
            r6 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            r7 = 1
            r8 = 0
            r9 = 1
            r11 = 1
            r12 = 0
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = 200(0xc8, double:9.9E-322)
            r4.setDuration(r2)
            r2 = 300(0x12c, double:1.48E-321)
            r4.setStartOffset(r2)
            r4.setFillBefore(r1)
            r4.setFillAfter(r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r4.setInterpolator(r1)
            android.view.View r1 = r0.A03
            r1.startAnimation(r4)
            goto L_0x0482
        L_0x05ba:
            r5 = 0
            r3 = 2131231387(0x7f08029b, float:1.8078854E38)
            r4.setBackgroundResource(r3)
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A0m
            android.text.Editable r3 = r3.getText()
            if (r3 == 0) goto L_0x05d5
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A0m
            android.text.Editable r3 = r3.getText()
            int r3 = android.text.TextUtils.getTrimmedLength(r3)
            if (r3 != 0) goto L_0x05da
        L_0x05d5:
            android.widget.FrameLayout r3 = r0.A06
            r3.setVisibility(r5)
        L_0x05da:
            android.widget.FrameLayout r3 = r0.A06
            r0.setStatusReactionsEmojiLayout(r3)
            goto L_0x0429
        L_0x05e1:
            r8.leftMargin = r9
            goto L_0x025c
        L_0x05e5:
            r3.setVisibility(r7)
            android.widget.ImageButton r3 = r0.A07
            r3.setVisibility(r7)
            android.widget.ImageButton r3 = r0.A0A
            r3.setVisibility(r11)
            goto L_0x0224
        L_0x05f4:
            java.lang.String r1 = "chatJid must not be null"
            X.AnonymousClass00B.A07(r2, r1)
            goto L_0x007f
        L_0x05fb:
            java.lang.String r2 = "messagereply/message-deleted/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0pt r2 = r0.A05
            r1 = 2131891842(0x7f121682, float:1.9418415E38)
            r2.A09(r1, r11)
            r0.finish()
        L_0x0617:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.MessageReplyActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r5;
        if (i2 == 17) {
            r5 = new C32241fu(this);
            r5.A06(getString(R.string.str03ae, new Object[]{Integer.valueOf(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED)}));
            r5.setPositiveButton(R.string.str14e6, new IDxCListenerShape127S0100000_2_I0(this, 131));
            r5.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 130));
        } else if (i2 != 106) {
            return super.onCreateDialog(i2);
        } else {
            C16010sH A0A2 = this.A0N.A0A(this.A0j);
            r5 = new C32241fu(this);
            r5.A06(getString(R.string.str03a5, new Object[]{this.A0O.A08(A0A2)}));
            r5.setPositiveButton(R.string.str1872, new IDxCListenerShape28S0200000_2_I0(this, 12, A0A2));
            r5.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 129));
            r5.A03(new IDxCListenerShape161S0100000_2_I0(this, 12));
        }
        return r5.create();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0q.A01();
        AnonymousClass1ZK r0 = this.A16;
        if (r0 != null) {
            r0.A02();
            this.A16 = null;
        }
        C47572Jn r02 = this.A0f;
        if (r02 != null) {
            r02.A0E();
        }
        AnonymousClass1MF r03 = this.A0u;
        if (r03 != null) {
            r03.A03();
        }
        AnonymousClass2Ao r04 = this.A0P;
        if (r04 != null) {
            r04.A00();
            this.A0P = null;
        }
        AnonymousClass36H r1 = this.A14;
        if (r1 != null) {
            r1.A06(true);
            this.A14 = null;
        }
        Set<Application.ActivityLifecycleCallbacks> set = this.A1E;
        for (Application.ActivityLifecycleCallbacks onActivityDestroyed : set) {
            onActivityDestroyed.onActivityDestroyed(this);
        }
        set.clear();
        this.A1D.clear();
        this.A1F.clear();
        this.A11.A03();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Iterator it = this.A1F.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public void onPause() {
        super.onPause();
        AnonymousClass1ZK r1 = this.A16;
        if (r1 != null && r1.A0P != null) {
            r1.A03();
        }
    }

    public void onResume() {
        super.onResume();
        for (Application.ActivityLifecycleCallbacks onActivityResumed : this.A1E) {
            onActivityResumed.onActivityResumed(this);
        }
    }

    public void onStart() {
        super.onStart();
        Window window = getWindow();
        int i2 = 4;
        if (this.A0f.isShowing()) {
            i2 = 2;
        }
        window.setSoftInputMode(i2 | 1);
        if (!this.A0f.isShowing()) {
            this.A0m.A04(true);
        }
        AnonymousClass36H r1 = this.A14;
        if (r1 != null) {
            r1.A06(true);
            this.A14 = null;
        }
        AnonymousClass53E r4 = new AnonymousClass53E(this);
        AnonymousClass36H r2 = new AnonymousClass36H(this.A0a, this.A0j, r4, this.A15);
        this.A14 = r2;
        this.A05.Ack(r2, new Void[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c8, code lost:
        if (r7 != false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setStatusReactionsEmojiLayout(android.view.View r21) {
        /*
            r20 = this;
            r0 = 2131363394(0x7f0a0642, float:1.8346596E38)
            r4 = r21
            android.view.View r13 = X.C004601z.A0E(r4, r0)
            android.widget.GridLayout r13 = (android.widget.GridLayout) r13
            r0 = 2131366373(0x7f0a11e5, float:1.8352638E38)
            android.view.View r15 = X.C004601z.A0E(r4, r0)
            com.obwhatsapp.WaTextView r15 = (com.obwhatsapp.WaTextView) r15
            r3 = r20
            X.0rz r0 = r3.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "status_reactions_nux_shown_count"
            r2 = 0
            int r1 = r1.getInt(r0, r2)
            r0 = 2
            if (r1 > r0) goto L_0x002c
            r2 = 1
        L_0x002c:
            r11 = 0
            r0 = 8
            if (r2 == 0) goto L_0x0032
            r0 = 0
        L_0x0032:
            r15.setVisibility(r0)
            X.0pd r2 = r3.A0C
            r1 = 1852(0x73c, float:2.595E-42)
            X.0tM r0 = X.C16620tM.A02
            java.lang.String r0 = r2.A06(r0, r1)
            java.util.List r10 = X.C31021dL.A00(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r1 = r10.size()
            java.util.List r8 = X.C87724Yh.A00
            int r0 = r8.size()
            int r7 = java.lang.Math.min(r1, r0)
            r6 = 0
        L_0x0057:
            if (r6 >= r7) goto L_0x008a
            java.lang.Object r0 = r8.get(r6)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            java.lang.Object r0 = r8.get(r6)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r10.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.4Ke r0 = new X.4Ke
            r0.<init>(r5, r2, r1)
            r9.add(r0)
            int r6 = r6 + 1
            goto L_0x0057
        L_0x008a:
            java.util.Iterator r8 = r9.iterator()
        L_0x008e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0139
            java.lang.Object r5 = r8.next()
            X.4Ke r5 = (X.C84344Ke) r5
            int r0 = r5.A00
            android.view.View r2 = X.C004601z.A0E(r4, r0)
            com.obwhatsapp.emoji.EmojiContainerView r2 = (com.obwhatsapp.emoji.EmojiContainerView) r2
            int r0 = r5.A02
            android.view.View r14 = X.C004601z.A0E(r4, r0)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r12 = r0.getResources()
            r1 = 1
            int[] r0 = new int[r1]
            int r6 = r5.A01
            r0[r11] = r6
            boolean r7 = X.C62153Bw.A02(r0)
            int[] r0 = new int[r1]
            r0[r11] = r6
            boolean r5 = X.C62153Bw.A03(r0)
            if (r5 != 0) goto L_0x00ca
            r0 = 0
            if (r7 == 0) goto L_0x00cb
        L_0x00ca:
            r0 = 1
        L_0x00cb:
            r2.A04 = r0
            if (r7 == 0) goto L_0x0111
            X.0u3 r5 = r3.A0r
            int[] r0 = new int[r1]
            r0[r11] = r6
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r0 = X.C61953Bb.A03(r5, r0)
            X.1pj r5 = new X.1pj
            r5.<init>((int[]) r0)
            r19 = 1
        L_0x00e6:
            com.facebook.redex.IDxCListenerShape0S0700000_2_I0 r11 = new com.facebook.redex.IDxCListenerShape0S0700000_2_I0
            r18 = r3
            r16 = r5
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r2.setOnLongClickListener(r11)
        L_0x00f4:
            java.lang.String r0 = r5.toString()
            r14.setContentDescription(r0)
            r2.setClickable(r1)
            int[] r0 = r5.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            r10 = r3
            r11 = r12
            r12 = r2
            r16 = r0
            r10.A39(r11, r12, r13, r14, r15, r16)
            r11 = 0
            goto L_0x008e
        L_0x0111:
            if (r5 == 0) goto L_0x012b
            X.0u3 r5 = r3.A0r
            int[] r0 = new int[r1]
            r0[r11] = r6
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r0 = X.C61953Bb.A04(r5, r0)
            X.1pj r5 = new X.1pj
            r5.<init>((int[]) r0)
            r19 = 0
            goto L_0x00e6
        L_0x012b:
            int[] r0 = new int[r1]
            r0[r11] = r6
            X.1pj r5 = new X.1pj
            r5.<init>((int[]) r0)
            r0 = 0
            r2.setOnLongClickListener(r0)
            goto L_0x00f4
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.MessageReplyActivity.setStatusReactionsEmojiLayout(android.view.View):void");
    }
}
