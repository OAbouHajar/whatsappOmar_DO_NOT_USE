package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxAListenerShape2S0201000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape378S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape340S0100000_2_I0;
import com.facebook.redex.IDxEListenerShape200S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.conversation.congratulations.CongratulationsImpl;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.obwhatsapp.conversation.conversationrow.message.KeptMessagesActivity;
import com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.payments.model.BipProcessActionViewModel;
import com.obwhatsapp.reactions.ReactionsTrayViewModel;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.1yR  reason: invalid class name */
public abstract class AnonymousClass1yR extends AnonymousClass1yS implements AnonymousClass1YG, AnonymousClass1yT, AnonymousClass1yU {
    public AnonymousClass2DF A00;
    public List A01 = new ArrayList();

    public /* synthetic */ void A4o(Drawable drawable, View view) {
        if (this instanceof Conversation) {
            C42821yj r3 = ((Conversation) this).A00;
            ImageView imageView = new ImageView((Context) r3.A22);
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(4);
            imageView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3D6(view, imageView, r3));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            r3.A0z.addView(imageView, layoutParams);
        }
    }

    public void A96() {
        this.A00.A96();
    }

    public void A9J(C16740tZ r2) {
        this.A00.A9J(r2);
    }

    public /* synthetic */ int AAs() {
        return this instanceof C45692Af ? ((C45692Af) this) instanceof StarredMessagesActivity ? 1 : 4 : this instanceof MediaAlbumActivity ? 2 : 0;
    }

    public Object AAy(Class cls) {
        if (this instanceof C45692Af) {
            C45692Af r1 = (C45692Af) this;
            return cls == AnonymousClass5PQ.class ? r1.A0T : r1.A00.AAy(cls);
        } else if (this instanceof MediaAlbumActivity) {
            MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this;
            return cls == AnonymousClass5PQ.class ? mediaAlbumActivity.A0Q : mediaAlbumActivity.A00.AAy(cls);
        } else if (!(this instanceof Conversation)) {
            return this.A00.AAy(cls);
        } else {
            C42821yj r12 = ((Conversation) this).A00;
            if (cls == BipProcessActionViewModel.class) {
                return r12.A3M;
            }
            if (cls == AnonymousClass5PQ.class) {
                return r12.A51;
            }
            if (cls == CongratulationsImpl.class) {
                return null;
            }
            return ((Conversation) r12.A22).A00.AAy(cls);
        }
    }

    public C616339r AAz() {
        if (!(this instanceof C45692Af)) {
            return this.A00.A0E.A02;
        }
        C45692Af r0 = (C45692Af) this;
        boolean z2 = r0 instanceof KeptMessagesActivity;
        AnonymousClass1L8 r02 = r0.A00.A0E;
        return z2 ? r02.A01 : r02.A00;
    }

    public AnonymousClass2JH ABw() {
        if (this instanceof MediaAlbumActivity) {
            MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this;
            AnonymousClass2JH r2 = mediaAlbumActivity.A0E;
            if (r2 != null) {
                return r2;
            }
            C14710pd r3 = mediaAlbumActivity.A0C;
            C23061Ai r22 = mediaAlbumActivity.A0B;
            C16300so r8 = mediaAlbumActivity.A03;
            C17250um r15 = mediaAlbumActivity.A0B;
            C206711d r14 = mediaAlbumActivity.A0F;
            AnonymousClass01V r11 = mediaAlbumActivity.A08;
            AnonymousClass013 r13 = mediaAlbumActivity.A01;
            AnonymousClass1BQ r1 = mediaAlbumActivity.A00.A0V;
            AnonymousClass2JH r5 = new AnonymousClass2JH(mediaAlbumActivity, (ImageButton) null, r8, (KeyboardPopupLayout) mediaAlbumActivity.A00, new WaEditText(mediaAlbumActivity), r11, mediaAlbumActivity.A09, r13, r14, r15, r1, r3, mediaAlbumActivity.A0J, r22);
            mediaAlbumActivity.A0E = r5;
            r5.setOnDismissListener(mediaAlbumActivity.A00.A00);
            AnonymousClass2JH r4 = mediaAlbumActivity.A0E;
            C17250um r32 = mediaAlbumActivity.A0B;
            C206711d r23 = mediaAlbumActivity.A0F;
            AnonymousClass29I r7 = new AnonymousClass29I(mediaAlbumActivity, mediaAlbumActivity.A01, r4, r23, r32, (EmojiSearchContainer) AnonymousClass00T.A05(mediaAlbumActivity, R.id.emoji_search_container), mediaAlbumActivity.A0J);
            mediaAlbumActivity.A0G = r7;
            AnonymousClass2JH r24 = mediaAlbumActivity.A0E;
            r24.A0E = new RunnableRunnableShape7S0100000_I0_6(mediaAlbumActivity, 33);
            r24.A0C = r7;
            r24.A0C(new IDxCListenerShape203S0100000_2_I0(mediaAlbumActivity, 2));
            r7.A00 = new IDxEListenerShape200S0100000_2_I0(mediaAlbumActivity, 2);
            return r24;
        } else if (this instanceof Conversation) {
            return ((Conversation) this).A00.A2v;
        } else {
            return null;
        }
    }

    public Collection ACQ() {
        AnonymousClass2DF r3 = this.A00;
        ArrayList arrayList = new ArrayList();
        C86144Rj r0 = r3.A0K;
        if (r0 != null) {
            arrayList.addAll(r0.A04.values());
        } else {
            C16740tZ r1 = r3.A0h;
            if (r1 != null) {
                C16460t6 r02 = r3.A0N;
                if (r02.A0K.A03(r1.A11) != null) {
                    arrayList.add(r3.A0h);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public /* synthetic */ ArrayList AFm() {
        if (this instanceof C45692Af) {
            return ((C45692Af) this).A0P;
        }
        if (this instanceof Conversation) {
            return ((Conversation) this).A00.A2C.A0G;
        }
        return null;
    }

    public int AGW(C16740tZ r2) {
        return this.A00.AGW(r2);
    }

    public boolean AHi() {
        return this.A00.A0K != null;
    }

    public /* synthetic */ boolean AJH() {
        return (this instanceof Conversation) && ((Conversation) this).A00.A2C.A0D != null;
    }

    public boolean AJI(C16740tZ r2) {
        return this.A00.AJI(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((com.obwhatsapp.Conversation) r1).A00.A4F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ boolean AJU() {
        /*
            r1 = this;
            boolean r0 = r1 instanceof com.obwhatsapp.Conversation
            if (r0 == 0) goto L_0x0019
            r0 = r1
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            X.1yj r0 = r0.A00
            X.1ZK r0 = r0.A4F
            if (r0 == 0) goto L_0x0019
            X.1ZL r0 = r0.A1G
            android.view.ViewGroup r0 = r0.A0B
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0019
            r0 = 1
            return r0
        L_0x0019:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1yR.AJU():boolean");
    }

    public boolean AJX() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A00.A0j;
        return reactionsTrayViewModel != null && ((Number) reactionsTrayViewModel.A09.A01()).intValue() == 2;
    }

    public /* synthetic */ boolean AJn(C16740tZ r4) {
        if (!(this instanceof Conversation)) {
            return false;
        }
        C42821yj r2 = ((Conversation) this).A00;
        if (((AnonymousClass1yR) r2.A22).A00.A0w.contains(r4.A11)) {
            return false;
        }
        C48952Qa conversationCursorAdapter = r2.A1n.getConversationCursorAdapter();
        if (conversationCursorAdapter.A03(r4) > conversationCursorAdapter.A01()) {
            return true;
        }
        return conversationCursorAdapter.A08.contains(r4);
    }

    public void AVf(int i2) {
        AnonymousClass2JH ABw;
        int i3;
        int i4;
        AnonymousClass2DF r2 = this.A00;
        ReactionsTrayViewModel reactionsTrayViewModel = r2.A0j;
        AnonymousClass00B.A06(reactionsTrayViewModel);
        int i5 = i2;
        if (i2 == 0) {
            C56962pX r0 = ((AnonymousClass1yR) r2.A0G).A00.A0H;
            if (r0 != null) {
                r0.dismiss();
            }
            if (r2.A0j.A04 && (ABw = r2.A0G.ABw()) != null) {
                ABw.dismiss();
            }
        } else if (i5 == 1) {
            C56962pX r9 = r2.A0H;
            if (r9 != null) {
                int i6 = reactionsTrayViewModel.A00;
                int dimensionPixelSize = r9.getContentView().getResources().getDimensionPixelSize(R.dimen.dimen0675);
                int dimensionPixelOffset = r9.getContentView().getResources().getDimensionPixelOffset(R.dimen.dimen0769);
                C53802gK r14 = r9.A02;
                int i7 = ((FrameLayout.LayoutParams) r14.getLayoutParams()).gravity & 7;
                int i8 = 3;
                if (!r9.A03.A0T()) {
                    i8 = 5;
                }
                boolean z2 = false;
                if (i7 == i8) {
                    z2 = true;
                }
                r14.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredWidth = r14.getMeasuredWidth();
                View view = r9.A00;
                if (measuredWidth > view.getWidth()) {
                    float width = ((float) view.getWidth()) / ((float) r14.getMeasuredWidth());
                    r14.setPivotX(z2 ? (float) view.getWidth() : 0.0f);
                    r14.setScaleX(width);
                    r14.setScaleY(width);
                }
                int i9 = -(((view.getHeight() + (r14.getMeasuredHeight() - (dimensionPixelSize << 1))) + dimensionPixelOffset) - i6);
                C14550pN r5 = r9.A01;
                Window window = r5.getWindow();
                if ((window.getDecorView().getSystemUiVisibility() & 1024) != 0) {
                    Rect rect = new Rect();
                    window.getDecorView().getWindowVisibleDisplayFrame(rect);
                    i3 = rect.top;
                    Toolbar toolbar = r5.A02;
                    if (toolbar != null) {
                        i4 = toolbar.getHeight();
                    }
                    i4 = 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int dimensionPixelOffset2 = r9.getContentView().getResources().getDimensionPixelOffset(R.dimen.dimen0762);
                int top2 = (view.getTop() - i4) - i3;
                if (i6 + top2 < r14.getMeasuredHeight() + dimensionPixelOffset) {
                    i9 = -(((view.getHeight() + top2) + dimensionPixelSize) - dimensionPixelOffset2);
                }
                r9.showAsDropDown(view, 0, i9);
                int measuredWidth2 = r14.getMeasuredWidth();
                int measuredHeight = r14.getMeasuredHeight();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(120);
                duration.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(r14, 13));
                duration.addListener(new IDxLAdapterShape3S0100000_2_I0(r14, 19));
                Interpolator interpolator = C56092kx.A01;
                duration.setInterpolator(interpolator);
                ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(120);
                duration2.addUpdateListener(new C91104fN(r14, measuredHeight, measuredWidth2, z2));
                duration2.setInterpolator(C53802gK.A0B);
                C91144fR r13 = new C91144fR(r14, measuredWidth2 - measuredHeight, measuredHeight, measuredWidth2, z2);
                ValueAnimator duration3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.05f}).setDuration(150);
                ValueAnimator duration4 = ValueAnimator.ofFloat(new float[]{1.05f, 1.0f}).setDuration(70);
                duration3.addUpdateListener(r13);
                duration3.setInterpolator(interpolator);
                duration3.addListener(new C56172mz(r14, z2));
                duration4.addUpdateListener(r13);
                duration4.setInterpolator(interpolator);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(new Animator[]{duration3, duration4});
                AnimatorSet animatorSet2 = r14.A08;
                animatorSet2.playTogether(new Animator[]{duration, duration2});
                animatorSet2.playSequentially(new Animator[]{duration2, animatorSet});
                animatorSet2.start();
                C16740tZ r02 = r2.A0j.A02;
                AnonymousClass00B.A06(r02);
                C15830rv r1 = r02.A11.A00;
                if (r1 != null) {
                    r2.A0d.A00(r1);
                }
            }
        } else if (i5 == 2) {
            AnonymousClass4EI r12 = C56092kx.A02;
            AnonymousClass2JH ABw2 = r2.A0G.ABw();
            if (ABw2 != null) {
                ABw2.A09 = r12;
                ABw2.A06();
            }
            C56962pX r03 = ((AnonymousClass1yR) r2.A0G).A00.A0H;
            if (r03 != null) {
                r03.dismiss();
            }
        }
    }

    public /* synthetic */ void AW7(C16740tZ r2, boolean z2) {
        if (this instanceof Conversation) {
            ((Conversation) this).A00.A0j(r2, z2);
        }
    }

    public Dialog AYO(int i2) {
        return super.onCreateDialog(i2);
    }

    public void AYQ() {
        super.onDestroy();
    }

    public void AYX(AnonymousClass05J r3) {
        super.AYX(r3);
        others.actionbarbk(this);
        C434920f.A03((Activity) this.A00.A0G, R.color.color064b);
    }

    public void AYY(AnonymousClass05J r3) {
        super.AYY(r3);
        others.actionbarbk(this);
        C434920f.A03((Activity) this.A00.A0G, R.color.right_side);
    }

    public void Ad8(C16740tZ r2) {
        this.A00.Ad8(r2);
    }

    public /* synthetic */ void AeT(C16740tZ r2) {
        if (this instanceof Conversation) {
            ((Conversation) this).A00.A2C.A0J(r2);
        }
    }

    public void Aec(List list, boolean z2) {
        this.A00.Aec(list, z2);
    }

    public void Aeq(C16740tZ r2, int i2) {
        this.A00.Aeq(r2, i2);
    }

    public /* synthetic */ boolean AfN() {
        return this instanceof Conversation;
    }

    public void AfX(Bitmap bitmap, C39701sv r3) {
        this.A00.AfX(bitmap, r3);
    }

    public /* synthetic */ boolean Afe() {
        return this instanceof Conversation;
    }

    public void Afs(View view, C16740tZ r3, int i2, boolean z2) {
        this.A00.Afs(view, r3, i2, z2);
    }

    public void Ag8(C16740tZ r2) {
        this.A00.Ag8(r2);
    }

    public boolean Agy(C16740tZ r2) {
        return this.A00.Agy(r2);
    }

    public void Ahb(C16740tZ r2) {
        this.A00.Ahb(r2);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        String str;
        List<C39711sw> list;
        super.onActivityResult(i2, i3, intent);
        AnonymousClass2DF r4 = this.A00;
        if (i2 == 41) {
            if (i3 == -1) {
                if (intent != null) {
                    Uri data = intent.getData();
                    AnonymousClass00B.A06(data);
                    str = data.getLastPathSegment();
                } else {
                    str = null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                C39701sv r0 = r4.A0x;
                if (!(r0 == null || (list = r0.A05) == null)) {
                    for (C39711sw r1 : list) {
                        arrayList2.add(r1.A02);
                        UserJid userJid = r1.A01;
                        if (userJid != null) {
                            arrayList.add(userJid);
                        } else {
                            arrayList.add((Object) null);
                        }
                    }
                    r4.A08.A02(r4.A0x.A02(), str, arrayList2, arrayList);
                }
            }
            r4.A0r.A00();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i2;
        super.onConfigurationChanged(configuration);
        AnonymousClass2DF r2 = this.A00;
        r2.A0E.A00((Context) r2.A0G);
        ReactionsTrayViewModel reactionsTrayViewModel = r2.A0j;
        if (reactionsTrayViewModel != null && (i2 = configuration.orientation) != reactionsTrayViewModel.A01) {
            reactionsTrayViewModel.A01 = i2;
            reactionsTrayViewModel.A05(0);
        }
    }

    public void onCreate(Bundle bundle) {
        if (this.A00 == null) {
            C49132Rg r4 = (C49132Rg) ((AnonymousClass2Rf) C004501y.A00(AnonymousClass2Rf.class, this));
            AnonymousClass2DF r1 = new AnonymousClass2DF();
            C16150sX r2 = r4.A1s;
            r1.A0L = (C16980tz) r2.AQB.get();
            r1.A0c = (C19990zK) r2.AEZ.get();
            r1.A0m = new AnonymousClass47T();
            r1.A0s = (C17110uY) r2.ADT.get();
            r1.A0W = (C16490t9) r2.AQz.get();
            r1.A0d = (C27661Sq) r2.AAP.get();
            r1.A05 = (C18930xU) r2.AOL.get();
            r1.A03 = (C16760tb) r2.APV.get();
            r1.A0t = (AnonymousClass1QZ) r2.APn.get();
            r1.A0B = (C17200uh) r2.A52.get();
            r1.A07 = (C16000sG) r2.A4x.get();
            r1.A0U = (C18030w2) r2.A6W.get();
            r1.A0R = (C18550ws) r2.ADB.get();
            r1.A0q = (C17220uj) r2.A9x.get();
            r1.A09 = (C16080sP) r2.AQ9.get();
            r1.A0g = (C18290wS) r2.AIB.get();
            r1.A0i = (AnonymousClass1RV) r2.AF6.get();
            r1.A0p = (C50772aQ) r4.A02.get();
            r1.A0P = (AnonymousClass10B) r2.AD5.get();
            r1.A0N = (C16460t6) r2.A5k.get();
            r1.A0S = (C19150xq) r2.AFC.get();
            r1.A08 = (AnonymousClass1L6) r2.AMC.get();
            r1.A0l = new C25781Lc();
            r1.A0Q = (C25701Ku) r2.AD6.get();
            r1.A0X = (C18040w3) r2.AR0.get();
            r1.A06 = (AnonymousClass19Y) r2.A4r.get();
            r1.A0V = (AnonymousClass1BQ) r2.A7f.get();
            r1.A0T = (AnonymousClass10G) r2.AN1.get();
            r1.A0M = (C16260sj) r2.AQe.get();
            r1.A0Y = (C17240ul) r2.ABK.get();
            r1.A0r = (C25681Ks) r2.A0Q.get();
            r1.A0k = r2.A1d();
            r1.A0Z = (AnonymousClass15W) r2.AOC.get();
            r1.A0A = (AnonymousClass120) r2.A4z.get();
            r1.A0b = (C209212c) r2.AE1.get();
            r1.A0f = (C18090w8) r2.AI6.get();
            r1.A04 = (C17150uc) r2.A34.get();
            r1.A0o = (AnonymousClass1MF) r2.ANa.get();
            r1.A0a = (AnonymousClass1HE) r2.ALb.get();
            r1.A0O = (C16070sO) r2.ABY.get();
            r1.A02 = (C16570tH) r2.A0e.get();
            r1.A0I = (AnonymousClass1B5) r2.AEp.get();
            r1.A0J = (C19610yi) r2.AEq.get();
            r1.A0E = (AnonymousClass1L8) r2.A5W.get();
            r1.A0e = (AnonymousClass1L9) r2.AFI.get();
            r1.A0C = (AnonymousClass1LA) r2.AIg.get();
            r1.A0u = (AnonymousClass1LB) r2.A7z.get();
            this.A00 = r1;
            r1.A0G = this;
            List list = this.A01;
            if (list != null && 0 < list.size()) {
                list.get(0);
                throw new NullPointerException("onCreate");
            }
        }
        super.onCreate(bundle);
        AnonymousClass2DF r0 = this.A00;
        C14550pN r12 = (C14550pN) r0.A0G;
        r0.A0D = new C613738q(r12.A05, r12.A09, r0.A0s);
        C16980tz r42 = r0.A0L;
        AnonymousClass1QZ r3 = r0.A0t;
        C16000sG r14 = r0.A07;
        C14570pP r13 = (C14570pP) r0.A0G;
        C43331zp r132 = new C43331zp(r14, r0.A0A, r42, r13.A01, r3, C43331zp.A00(r13.A05));
        AnonymousClass1yT r32 = r0.A0G;
        C14550pN r22 = (C14550pN) r32;
        C14710pd r8 = r22.A0C;
        C16320sq r122 = ((C14570pP) r32).A05;
        C15900s5 r43 = r22.A06;
        C17200uh r5 = r0.A0B;
        r0.A0F = new C30001ba(((C001000l) r32).AGM(), r43, r5, r0.A0I, r0.A0J, r8, r0.A0i, r0.A0o, r0.A0p, r122, r132);
        r0.A0E.A00((Context) r0.A0G);
    }

    public Dialog onCreateDialog(int i2) {
        AnonymousClass2DF r1 = this.A00;
        int i3 = i2;
        if (i3 != 13) {
            AnonymousClass1yT r0 = r1.A0G;
            if (i3 != 19) {
                switch (i2) {
                    case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                        C14530pL r5 = (C14530pL) r0;
                        return C807745l.A00(r5, r5.A00, new IDxAListenerShape2S0201000_2_I0(r5, ((C14550pN) r0).A09, i3, 1), r1.A0q, true);
                    case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                        C14530pL r7 = (C14530pL) r0;
                        return C807745l.A00(r7, r7.A00, new IDxAListenerShape2S0201000_2_I0(r7, ((C14550pN) r0).A09, i3, 1), r1.A0q, false);
                    case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                        C14530pL r72 = (C14530pL) r0;
                        return C807745l.A00(r72, r72.A00, new IDxAListenerShape2S0201000_2_I0(r72, ((C14550pN) r0).A09, i3, 0), r1.A0q, true);
                    default:
                        return r0.AYO(i3);
                }
            } else {
                C14530pL r52 = (C14530pL) r0;
                return C807745l.A00(r52, r52.A00, new IDxAListenerShape2S0201000_2_I0(r52, ((C14550pN) r0).A09, 19, 0), r1.A0q, false);
            }
        } else {
            C86144Rj r3 = r1.A0K;
            if (r3 == null || r3.A04.isEmpty()) {
                Log.e("conversation/dialog/delete no messages");
                return r1.A0G.AYO(i3);
            }
            StringBuilder sb = new StringBuilder("conversation/dialog/delete/");
            sb.append(r3.A04.size());
            Log.i(sb.toString());
            AnonymousClass1yT r32 = r1.A0G;
            C14530pL r13 = (C14530pL) r32;
            C16440t3 r21 = r13.A05;
            C14550pN r2 = (C14550pN) r32;
            C14710pd r20 = r2.A0C;
            C14870pt r36 = r2.A05;
            C14570pP r33 = (C14570pP) r32;
            C16320sq r19 = r33.A05;
            C16490t9 r18 = r1.A0W;
            C17250um r17 = r2.A0B;
            C16760tb r16 = r1.A03;
            C16000sG r12 = r1.A07;
            C18030w2 r15 = r1.A0U;
            C16080sP r11 = r1.A09;
            AnonymousClass013 r10 = r33.A01;
            C17240ul r9 = r1.A0Y;
            AnonymousClass15W r8 = r1.A0Z;
            C18040w3 r73 = r1.A0X;
            C15860rz r6 = r2.A09;
            C16070sO r53 = r1.A0O;
            AnonymousClass1L9 r4 = r1.A0e;
            HashSet hashSet = new HashSet(r1.A0K.A04.values());
            AnonymousClass1yT r14 = r1.A0G;
            IDxDListenerShape340S0100000_2_I0 iDxDListenerShape340S0100000_2_I0 = new IDxDListenerShape340S0100000_2_I0(r14, 0);
            AnonymousClass4E3 r110 = new AnonymousClass4E3(((AnonymousClass1yR) r14).A00);
            C17250um r25 = r17;
            C14710pd r26 = r20;
            C16490t9 r27 = r18;
            C18040w3 r28 = r73;
            C17240ul r29 = r9;
            AnonymousClass15W r30 = r8;
            AnonymousClass1L9 r31 = r4;
            C16320sq r322 = r19;
            C16000sG r172 = r12;
            C16080sP r182 = r11;
            AnonymousClass4E3 r192 = r110;
            C16440t3 r202 = r21;
            C15860rz r212 = r6;
            AnonymousClass013 r22 = r10;
            C16070sO r23 = r53;
            C18030w2 r24 = r15;
            return AnonymousClass3BP.A00(r13, new C99824ue(r13), iDxDListenerShape340S0100000_2_I0, r36, r16, r172, r182, r192, r202, r212, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r322, AnonymousClass3BP.A01(r13, r12, r11, (C15830rv) null, hashSet), hashSet, true);
        }
    }

    public void onDestroy() {
        AnonymousClass2DF r3 = this.A00;
        C86144Rj r0 = r3.A0K;
        if (r0 != null) {
            r0.A00();
            r3.A0K = null;
        }
        C30001ba r1 = r3.A0F;
        AnonymousClass2Ao r02 = r1.A00;
        if (r02 != null) {
            r02.A00();
        }
        AnonymousClass1MF r03 = r1.A01;
        if (r03 != null) {
            r03.A03();
        }
        C43331zp r04 = r1.A0C;
        if (r04 != null) {
            r04.A06();
        }
        C613738q r2 = r3.A0D;
        AnonymousClass37Z r12 = r2.A00;
        if (r12 != null) {
            r12.A02 = true;
            r12.interrupt();
            r2.A00 = null;
        }
        r3.A0C.A00.clear();
        r3.A0G.AYQ();
        this.A01.clear();
    }

    public void onPause() {
        super.onPause();
        AnonymousClass2DF r2 = this.A00;
        C86374Sl r1 = r2.A0y;
        synchronized (r1) {
            Map map = r1.A00;
            if (map != null) {
                map.clear();
            }
        }
        r2.A0u.A00();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        AnonymousClass2DF r3 = this.A00;
        if (bundle != null) {
            List<C28381Vw> A04 = AnonymousClass1yL.A04(bundle);
            if (A04 != null) {
                AnonymousClass1yT r6 = r3.A0G;
                C14870pt r5 = ((C14550pN) r6).A05;
                C19150xq r4 = r3.A0S;
                r3.A0K = new C86144Rj(r5, new IDxCListenerShape378S0100000_2_I0(r6, 0), r3.A0K, r4);
                for (C28381Vw r2 : A04) {
                    C16740tZ A03 = r3.A0N.A0K.A03(r2);
                    if (A03 != null) {
                        r3.A0K.A04.put(r2, A03);
                    }
                }
                r3.A0G.AWw();
                r3.A00();
            }
            C28381Vw A032 = AnonymousClass1yL.A03(bundle, "");
            if (A032 != null) {
                r3.A0h = r3.A0N.A0K.A03(A032);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass2DF r3 = this.A00;
        C86144Rj r0 = r3.A0K;
        if (r0 != null) {
            ArrayList arrayList = new ArrayList();
            for (C16740tZ r02 : r0.A04.values()) {
                arrayList.add(r02.A11);
            }
            AnonymousClass1yL.A0A(bundle, arrayList);
        }
        C16740tZ r03 = r3.A0h;
        if (r03 != null) {
            AnonymousClass1yL.A09(bundle, r03.A11, "");
        }
    }
}
