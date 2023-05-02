package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.DataSetObserver;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TextKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.OM7753.SideBar.quick.Edge;
import com.OM7753.SideBar.quick.QuickReplyDialog;
import com.facebook.redex.IDxAnimationShape2S0101000_2_I0;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.IDxCallbackShape333S0100000_1_I0;
import com.facebook.redex.IDxConsumerShape209S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape190S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.IDxListenerShape380S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape307S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0600000_I0;
import com.facebook.redex.RunnableRunnableShape1S0201000_I1;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.audioRecording.AudioRecordFactory;
import com.obwhatsapp.audioRecording.OpusRecorderFactory;
import com.obwhatsapp.biz.IDxPObserverShape57S0100000_2_I0;
import com.obwhatsapp.community.ConversationCommunityViewModel;
import com.obwhatsapp.conversation.ConversationListView;
import com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.obwhatsapp.ctwa.icebreaker.ui.IcebreakerBubbleView;
import com.obwhatsapp.dialogs.ProgressDialogFragment;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.payments.IDxAObserverShape91S0100000_2_I0;
import com.obwhatsapp.payments.model.BipProcessActionViewModel;
import com.obwhatsapp.pnh.RequestPhoneNumberViewModel;
import com.obwhatsapp.text.IDxWAdapterShape101S0100000_1_I0;
import com.obwhatsapp.text.IDxWAdapterShape102S0100000_2_I0;
import com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel;
import com.obwhatsapp.voicerecorder.IDxNObserverShape110S0100000_2_I0;
import com.obwhatsapp.yo.Conversation;
import com.obwhatsapp.yo.shp;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.stickers.IDxSObserverShape100S0100000_2_I0;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;
import com.whatsapp.voipcalling.IDxCObserverShape111S0100000_2_I0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.1yj  reason: invalid class name and case insensitive filesystem */
public class C42821yj {
    public static final C74113ps A5L = new C74113ps(true, true);
    public static final HashMap A5M = new HashMap();
    public static final HashMap A5N = new HashMap();
    public int A00 = 0;
    public int A01;
    public long A02 = -1;
    public ObjectAnimator A03 = null;
    public BroadcastReceiver A04;
    public Handler A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public ViewGroup A0J;
    public ViewGroup A0K;
    public ViewGroup A0L;
    public ViewGroup A0M;
    public ViewGroup A0N;
    public FrameLayout A0O;
    public FrameLayout A0P;
    public ImageButton A0Q;
    public ImageButton A0R;
    public ImageButton A0S;
    public ImageButton A0T;
    public ImageView A0U;
    public ImageView A0V;
    public TextView A0W;
    public TextView A0X;
    public C005702l A0Y;
    public C009804r A0Z;
    public AnonymousClass05J A0a;
    public C25731Kx A0b;
    public AnonymousClass12E A0c;
    public AnonymousClass1G1 A0d;
    public C50622aA A0e;
    public C50662aF A0f;
    public C50722aL A0g;
    public C50812aU A0h;
    public AnonymousClass2aV A0i;
    public C50202Yj A0j;
    public C50822aW A0k;
    public C50832aX A0l;
    public C50842aY A0m;
    public C50852aZ A0n;
    public C50862aa A0o;
    public C50872ab A0p;
    public C50882ac A0q;
    public C50892ad A0r;
    public C50902ae A0s;
    public C50912af A0t;
    public C50922ag A0u;
    public C50932ah A0v;
    public AnonymousClass2SO A0w;
    public C50942ai A0x;
    public C14870pt A0y;
    public KeyboardPopupLayout A0z;
    public C16040sK A10;
    public C18900xR A11;
    public AnonymousClass1KO A12;
    public AnonymousClass10X A13;
    public C25951Lt A14;
    public C25941Ls A15;
    public C17130ua A16;
    public TextEmojiLabel A17;
    public TextEmojiLabel A18;
    public C18890xQ A19;
    public WaEditText A1A;
    public C19740yv A1B;
    public AnonymousClass12J A1C;
    public AnonymousClass2XB A1D;
    public C25751Kz A1E;
    public AnonymousClass13V A1F;
    public C24511Gf A1G;
    public AnonymousClass2XA A1H;
    public AnonymousClass1KY A1I;
    public AnonymousClass1KX A1J;
    public C17170ue A1K;
    public AnonymousClass1KE A1L;
    public C23081Ak A1M;
    public C50262Yq A1N;
    public AnonymousClass1ME A1O;
    public C25821Lg A1P;
    public AnonymousClass01Y A1Q;
    public C204310c A1R;
    public C18380wb A1S;
    public C17650vQ A1T;
    public AnonymousClass127 A1U;
    public C17760vb A1V;
    public C17230uk A1W;
    public AnonymousClass1L3 A1X;
    public ConversationCommunityViewModel A1Y;
    public C49622Uk A1Z;
    public C17160ud A1a;
    public C17140ub A1b;
    public C17030uP A1c;
    public AnonymousClass2Ao A1d;
    public AnonymousClass152 A1e;
    public C220516l A1f;
    public C19230xz A1g;
    public AnonymousClass1BZ A1h;
    public C55472jf A1i;
    public AnonymousClass2VZ A1j;
    public C25831Lh A1k;
    public C50802aT A1l;
    public AnonymousClass1M3 A1m;
    public ConversationListView A1n;
    public AnonymousClass1MD A1o;
    public AnonymousClass1LD A1p;
    public AnonymousClass376 A1q;
    public AnonymousClass10Y A1r;
    public C30511cT A1s;
    public AnonymousClass2a9 A1t;
    public AnonymousClass1M1 A1u;
    public C25931Lr A1v;
    public AnonymousClass15I A1w;
    public C85174Nk A1x;
    public AnonymousClass1B3 A1y;
    public C25801Le A1z;
    public C18180wH A20;
    public AnonymousClass4MA A21;
    public AnonymousClass1yV A22;
    public AnonymousClass2KS A23;
    public AnonymousClass4O9 A24;
    public AnonymousClass2VQ A25;
    public AnonymousClass1MZ A26;
    public C20270zm A27;
    public AnonymousClass39M A28;
    public C25761La A29;
    public AnonymousClass2VT A2A;
    public AnonymousClass2ZO A2B;
    public C34621kZ A2C;
    public C41681wN A2D;
    public C70673hW A2E;
    public AnonymousClass12W A2F;
    public AnonymousClass01V A2G;
    public AnonymousClass1H9 A2H;
    public C16440t3 A2I;
    public C19380yL A2J;
    public C15860rz A2K;
    public AnonymousClass013 A2L;
    public CountryGatingViewModel A2M;
    public C24891Hr A2N;
    public C19820z3 A2O;
    public AnonymousClass1HU A2P;
    public AnonymousClass1T1 A2Q;
    public AnonymousClass3BB A2R;
    public C614739b A2S;
    public C25811Lf A2T;
    public C20070zS A2U;
    public C18200wJ A2V;
    public C26021Ma A2W;
    public C26011Lz A2X;
    public C24881Hq A2Y;
    public AnonymousClass1MJ A2Z;
    public C27421Rr A2a;
    public C18910xS A2b;
    public C15810rt A2c;
    public C216114t A2d;
    public C18560wt A2e;
    public AnonymousClass17F A2f;
    public C42391xi A2g;
    public C19780yz A2h;
    public C16900tq A2i;
    public AnonymousClass15B A2j;
    public AnonymousClass119 A2k;
    public C16010sH A2l;
    public C17580vJ A2m;
    public C19410yO A2n;
    public ProgressDialogFragment A2o;
    public C18600wx A2p;
    public C206711d A2q;
    public AnonymousClass15S A2r;
    public C14710pd A2s;
    public C20260zl A2t;
    public C26151Mn A2u;
    public C47572Jn A2v;
    public C47562Jm A2w;
    public C25841Li A2x;
    public C93544jN A2y;
    public C25861Lk A2z;
    public AnonymousClass1VD A30;
    public AnonymousClass18R A31;
    public C19240y6 A32;
    public C15830rv A33;
    public AnonymousClass1P7 A34;
    public C18210wK A35;
    public C18220wL A36;
    public MentionableEntry A37;
    public C24851Hn A38;
    public C222717h A39;
    public C19090xk A3A;
    public WhatsAppLibLoader A3B;
    public C14770pj A3C;
    public C14760pi A3D;
    public C218415q A3E;
    public AnonymousClass1B4 A3F;
    public C17800vf A3G;
    public AnonymousClass1KS A3H;
    public AnonymousClass1GP A3I;
    public AnonymousClass174 A3J;
    public C209612g A3K;
    public AnonymousClass1MB A3L;
    public BipProcessActionViewModel A3M;
    public AnonymousClass3Q5 A3N;
    public AnonymousClass1M5 A3O;
    public C218315p A3P;
    public AnonymousClass1DX A3Q;
    public AnonymousClass1DY A3R;
    public C24671Gv A3S;
    public AnonymousClass3H7 A3T;
    public AnonymousClass2X0 A3U;
    public RequestPhoneNumberViewModel A3V;
    public C17020u3 A3W;
    public AnonymousClass125 A3X;
    public C23091Al A3Y;
    public C16740tZ A3Z;
    public C222617g A3a;
    public AnonymousClass122 A3b;
    public C18990xa A3c;
    public C16220sf A3d;
    public C16210se A3e;
    public AnonymousClass15V A3f;
    public AnonymousClass1BU A3g;
    public C212613k A3h;
    public AnonymousClass14W A3i;
    public AnonymousClass1CX A3j;
    public AnonymousClass1M9 A3k;
    public C26161Mo A3l;
    public C86084Rd A3m;
    public AnonymousClass1M7 A3n;
    public C27651Sp A3o;
    public C41791wf A3p;
    public C216014s A3q;
    public AnonymousClass18K A3r;
    public AnonymousClass135 A3s;
    public ToSGatingViewModel A3t;
    public C18050w4 A3u;
    public C25691Kt A3v;
    public AnonymousClass15O A3w;
    public AnonymousClass1M4 A3x;
    public C25721Kw A3y;
    public AnonymousClass1A9 A3z;
    public C25791Ld A40;
    public C28921Zf A41 = null;
    public C28921Zf A42;
    public C20180zd A43;
    public C33741j5 A44;
    public C33741j5 A45;
    public C33741j5 A46;
    public C33741j5 A47;
    public C33741j5 A48;
    public C55322jK A49;
    public AnonymousClass1ZQ A4A;
    public AnonymousClass36H A4B;
    public C25971Lv A4C;
    public C25981Lw A4D;
    public AnonymousClass1B2 A4E;
    public AnonymousClass1ZK A4F;
    public AnonymousClass2ZR A4G;
    public AnonymousClass15A A4H;
    public C23631Ct A4I;
    public AnonymousClass01D A4J;
    public AnonymousClass01D A4K;
    public AnonymousClass01D A4L;
    public AnonymousClass01D A4M;
    public AnonymousClass01D A4N;
    public Boolean A4O;
    public Runnable A4P;
    public String A4Q;
    public String A4R;
    public String A4S;
    public String A4T;
    public boolean A4U;
    public boolean A4V;
    public boolean A4W;
    public boolean A4X;
    public boolean A4Y;
    public boolean A4Z;
    public boolean A4a = false;
    public boolean A4b;
    public boolean A4c;
    public boolean A4d;
    public boolean A4e;
    public boolean A4f;
    public boolean A4g;
    public boolean A4h = true;
    public boolean A4i;
    public boolean A4j;
    public boolean A4k;
    public boolean A4l = false;
    public boolean A4m;
    public final DataSetObserver A4n = new AnonymousClass3Kv(this);
    public final Handler A4o = new Handler(Looper.getMainLooper());
    public final Handler A4p = new Handler(Looper.getMainLooper());
    public final TextWatcher A4q = new IDxWAdapterShape102S0100000_2_I0(this, 0);
    public final TextWatcher A4r = new IDxWAdapterShape101S0100000_1_I0(this, 1);
    public final TextWatcher A4s = new IDxWAdapterShape101S0100000_1_I0(this, 0);
    public final View.OnClickListener A4t = new ViewOnClickCListenerShape1S0100000_I0_1(this, 33);
    public final View.OnClickListener A4u = new ViewOnClickCListenerShape9S0100000_I0_2(this, 44);
    public final ViewTreeObserver.OnPreDrawListener A4v = new IDxDListenerShape190S0100000_2_I0(this, 3);
    public final AbsListView.OnScrollListener A4w = new AnonymousClass3DD(this);
    public final TextView.OnEditorActionListener A4x = new C94854la(this);
    public final AnonymousClass04N A4y = new IDxConsumerShape209S0100000_2_I0(this, 5);
    public final AnonymousClass5RN A4z = new IDxCListenerShape203S0100000_2_I0(this, 3);
    public final C439822h A50 = new IDxPObserverShape57S0100000_2_I0(this, 4);
    public final AnonymousClass5PQ A51 = new IDxRCallbackShape307S0100000_2_I0(this, 2);
    public final AnonymousClass2e4 A52 = new AnonymousClass2e4(this);
    public final C47212Ia A53 = new C47212Ia(this);
    public final C47552Jl A54 = new C47552Jl(this);
    public final AnonymousClass4E8 A55 = new AnonymousClass4E8(this);
    public final AnonymousClass2KT A56 = new AnonymousClass2KT(this);
    public final C14750ph A57 = new C14750ph();
    public final AnonymousClass4PY A58 = new IDxAObserverShape91S0100000_2_I0(this, 0);
    public final AnonymousClass5Q6 A59 = new AnonymousClass50D(this);
    public final C41781we A5A = new IDxSObserverShape100S0100000_2_I0(this, 0);
    public final AnonymousClass5QT A5B = new AnonymousClass3H6(this);
    public final C54272h7 A5C = new IDxNObserverShape110S0100000_2_I0(this, 1);
    public final C19270y9 A5D = new IDxCObserverShape111S0100000_2_I0(this, 5);
    public final Runnable A5E = new RunnableRunnableShape8S0100000_I0_7(this, 2);
    public final Set A5F = new HashSet();
    public final Set A5G = new HashSet();
    public final Set A5H = new HashSet();
    public final Set A5I = new HashSet();
    public final Stack A5J = new Stack();
    public final int[] A5K = new int[2];
    public boolean isReaction;
    public boolean isStyle;
    public QuickReplyDialog mQuickDialog;
    public int style;

    public static /* synthetic */ void A00(Bundle bundle, C42821yj r5) {
        if (bundle.getInt("dialogAction") == 1) {
            C16050sL r2 = (C16050sL) bundle.getParcelable("parentGroupJid");
            AnonymousClass00B.A06(r2);
            C86224Rt A002 = r5.A0g.A00((C14530pL) r5.A22, r2, 1);
            C16040sK r0 = ((C14530pL) r5.A22).A01;
            r0.A0B();
            A002.A00(r0.A05);
        }
    }

    public static /* synthetic */ void A01(C42821yj r3, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = r3.A22.getWindow();
            Context context = (Context) r3.A22;
            int i3 = R.color.color064b;
            if (i2 == 0) {
                i3 = R.color.color00dd;
            }
            int A002 = AnonymousClass00T.A00(context, i3);
        }
    }

    public static /* synthetic */ void A02(C42821yj r11, boolean z2) {
        boolean isEmpty = TextUtils.isEmpty(r11.A2C.A0E);
        C34621kZ r1 = r11.A2C;
        if (isEmpty) {
            r1.A0E = null;
            r1.A0G = null;
            return;
        }
        r1.A0F = r1.A0E;
        MentionableEntry mentionableEntry = r11.A37;
        if (mentionableEntry != null) {
            mentionableEntry.A03();
        }
        int firstPosition = r11.A1n.getFirstPosition();
        StringBuilder sb = new StringBuilder("conversation/search/ first-visible:");
        sb.append(r11.A1n.getFirstVisiblePosition());
        sb.append(" header-count:");
        sb.append(r11.A1n.getHeaderViewsCount());
        sb.append(" first-pos:");
        sb.append(firstPosition);
        sb.append(" up:");
        boolean z3 = z2;
        sb.append(z2);
        Log.i(sb.toString());
        if (firstPosition < 0) {
            r11.A0J();
            return;
        }
        C48952Qa conversationCursorAdapter = r11.A1n.getConversationCursorAdapter();
        C16740tZ A052 = conversationCursorAdapter.getItem(firstPosition);
        if (A052 != null) {
            if (A052.A11.A00 == null) {
                Log.i("conversation/search/divider-at-search-position");
                A052 = conversationCursorAdapter.getItem(firstPosition + 1);
                if (A052 == null) {
                    Log.w("conversation/search/first-message-is-null");
                    return;
                }
            }
            AnonymousClass376 r0 = r11.A1q;
            if (r0 != null) {
                r0.A06(true);
            }
            C42391xi r7 = r11.A2g;
            if (r7 == null) {
                r7 = r11.A2f.A09(r11.A33);
                r11.A2g = r7;
            }
            C34621kZ r12 = r11.A2C;
            r7.A04(r12.A0E);
            r7.A05(r12.A0G);
            AnonymousClass1yV r3 = r11.A22;
            C16440t3 r4 = ((C14530pL) r3).A05;
            AnonymousClass15B r8 = r11.A2j;
            AnonymousClass376 r2 = new AnonymousClass376(r3, r4, ((AnonymousClass1yR) r3).A00.A0N, r11.A2f, r7, r8, A052, z3);
            r11.A1q = r2;
            ((C14570pP) r11.A22).A05.Acn(r2, new Void[0]);
        }
    }

    private void AQC() {
        if (shp.getBoolean("key_quick_view")) {
            Edge edge = new Edge(this);
            edge.initView();
            edge.initFragment();
        }
    }

    public final int A03() {
        Point point = new Point();
        ((Activity) this.A22).getWindowManager().getDefaultDisplay().getSize(point);
        return (point.y << 1) / ((Context) this.A22).getResources().getDimensionPixelSize(R.dimen.dimen0277);
    }

    public int A04(int i2) {
        if (i2 == 0) {
            return !this.A37.A0H ? R.drawable.ib_new_expanded : R.drawable.ib_new_expanded_bottom;
        }
        if (i2 != 1) {
            if (this.A0K.getVisibility() == 0) {
                return R.drawable.ib_new_expanded;
            }
        } else if (this.A37.A0H) {
            return R.drawable.ib_new_expanded_bottom;
        } else {
            if (this.A0K.getVisibility() != 0) {
                return R.drawable.ib_new_round;
            }
        }
        return this.A0N.getVisibility() == 0 ? R.drawable.ib_new_expanded : R.drawable.ib_new_round;
    }

    public AnonymousClass2Ao A05() {
        AnonymousClass1yV r1 = this.A22;
        return ((AnonymousClass1yR) r1).A00.A0F.A01((Context) r1);
    }

    public final C16740tZ A06() {
        C86144Rj r1 = ((AnonymousClass1yR) this.A22).A00.A0K;
        if (r1 == null || r1.A04.isEmpty()) {
            return null;
        }
        return (C16740tZ) ((Map.Entry) r1.A04.entrySet().iterator().next()).getValue();
    }

    public void A07() {
        int i2;
        if (this.A2S.A01()) {
            RunnableRunnableShape7S0100000_I0_6 runnableRunnableShape7S0100000_I0_6 = new RunnableRunnableShape7S0100000_I0_6(this, 43);
            RunnableRunnableShape7S0100000_I0_6 runnableRunnableShape7S0100000_I0_62 = new RunnableRunnableShape7S0100000_I0_6(this, 45);
            C614739b r4 = this.A2S;
            if (r4.A0F && !r4.A0D && r4.A0I == 2) {
                r4.A0D = true;
                RunnableRunnableShape1S0201000_I1 runnableRunnableShape1S0201000_I1 = r4.A05;
                if (runnableRunnableShape1S0201000_I1 != null) {
                    r4.A0L.A0J(runnableRunnableShape1S0201000_I1);
                }
                AnonymousClass3T3 r5 = r4.A0A;
                AnonymousClass00B.A04(r5);
                int i3 = r4.A02.getLayoutParams().height;
                IDxAnimationShape2S0101000_2_I0 iDxAnimationShape2S0101000_2_I0 = new IDxAnimationShape2S0101000_2_I0(r4, r4.A02.getHeight(), 1);
                iDxAnimationShape2S0101000_2_I0.setDuration(400);
                iDxAnimationShape2S0101000_2_I0.setAnimationListener(new C70393ga(r4, r5, runnableRunnableShape7S0100000_I0_6, runnableRunnableShape7S0100000_I0_62, i3));
                r4.A02.startAnimation(iDxAnimationShape2S0101000_2_I0);
            }
        } else if (this.A0N.getVisibility() == 0 && (i2 = this.A01) >= 0) {
            StringBuilder sb = new StringBuilder("conversation/hidelinkpreview/start ");
            sb.append(i2);
            Log.i(sb.toString());
            A0Z(this.A1x.A05, this.A0N);
            A0n(false);
        }
    }

    public void A08() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 || (i2 == 21 && "samsung".equalsIgnoreCase(Build.MANUFACTURER))) {
            KeyguardManager A072 = ((C14550pN) this.A22).A08.A07();
            AnonymousClass00B.A06(A072);
            if (A072.isKeyguardLocked()) {
                Log.i("conversation/locked");
                IDxBReceiverShape7S0100000_2_I0 iDxBReceiverShape7S0100000_2_I0 = new IDxBReceiverShape7S0100000_2_I0(this, 9);
                this.A04 = iDxBReceiverShape7S0100000_2_I0;
                this.A22.registerReceiver(iDxBReceiverShape7S0100000_2_I0, new IntentFilter("android.intent.action.USER_PRESENT"));
            }
        }
        this.A2H.A01();
        if (((C14550pN) this.A22).A0C.A0E(C16620tM.A02, 1352) && this.A22.getIntent().getBooleanExtra("fromNotification", false) && this.A22.getIntent().getBooleanExtra("last_notification_keep_in_chat", false)) {
            this.A2r.A00("kic_notification_taps");
            if (this.A4b) {
                this.A2r.A00("kic_group_notification_taps");
            }
        }
    }

    public void A09() {
        if (!this.A2w.A02()) {
            AnonymousClass1ZQ r1 = this.A4A;
            if (r1 == null || !r1.ACn() || !r1.ACs()) {
                Class<C15830rv> cls = C15830rv.class;
                if (!(A5M.get(this.A2l.A08(cls)) == null && this.A4Q == null)) {
                    this.A2U.A01(UserJid.of(this.A33), (String) null, 7);
                }
                if (this.A22.isTaskRoot()) {
                    Intent A022 = C14750ph.A02((Context) this.A22);
                    int i2 = Build.VERSION.SDK_INT;
                    AnonymousClass1yV r0 = this.A22;
                    if (i2 >= 21) {
                        r0.finishAndRemoveTask();
                        this.A22.startActivity(A022);
                        return;
                    }
                    r0.startActivity(A022);
                }
                C15810rt r2 = this.A2c;
                C15840rx r02 = (C15840rx) r2.A0C().get(this.A2l.A08(cls));
                if (r02 != null && r02.A0h) {
                    C18910xS r12 = this.A2b;
                    Jid A082 = this.A2l.A08(cls);
                    AnonymousClass00B.A06(A082);
                    r12.A02((C15830rv) A082);
                }
                if (this.A4e) {
                    this.A4L.get();
                }
                this.A22.AYM();
                return;
            }
            r1.A8r(false);
        }
    }

    public void A0A() {
        this.A4m = true;
        A0N();
        if (((AnonymousClass1yR) this.A22).A00.A0J.A0B()) {
            ((AnonymousClass1yR) this.A22).A00.A0J.A03();
        }
        if (this.A4e) {
            AnonymousClass2DE.A07(((AnonymousClass1yR) this.A22).A00.A0J);
            AnonymousClass1B9 r4 = (AnonymousClass1B9) this.A4L.get();
            boolean A002 = AnonymousClass1B9.A00(((C14550pN) this.A22).A00);
            boolean A0B2 = r4.A07.A0B();
            if (A002) {
                r4.A05 = true;
                r4.A04 = true;
            } else if (A0B2) {
                r4.A05 = true;
                r4.A04 = false;
            } else {
                r4.A05 = false;
                r4.A04 = false;
                r4.A03 = false;
            }
            r4.A03 = true;
        }
        Class<C15830rv> cls = C15830rv.class;
        AnonymousClass4B0.A02.put(this.A2l.A08(cls), C40651uT.A05(this.A37.getStringText()));
        A5N.put(this.A2l.A08(cls), C39501sa.A00(this.A37.getMentions()));
        this.A1n.getConversationCursorAdapter().A08.size();
        Handler handler = this.A05;
        if (handler != null && handler.hasMessages(0)) {
            this.A05.removeMessages(0);
            PowerManager A0I2 = ((C14550pN) this.A22).A08.A0I();
            if (A0I2 == null) {
                Log.w("conversation/pause pm=null");
            } else if (A0I2.isScreenOn()) {
                this.A05.sendEmptyMessage(0);
            }
        }
        AnonymousClass1ZQ r1 = this.A4A;
        if (r1 != null && r1.ACn()) {
            r1.AaG();
        }
        if ((Build.VERSION.SDK_INT < 24 || !this.A22.isInMultiWindowMode()) && A0q()) {
            AnonymousClass1ZK r0 = this.A4F;
            AnonymousClass00B.A06(r0);
            r0.A03();
        }
    }

    public void A0B() {
        this.A37.setHint(this.A22.getString(R.string.str0d2e));
    }

    public final void A0C() {
        AnonymousClass36H r1 = this.A4B;
        if (r1 != null) {
            r1.A06(true);
            this.A4B = null;
        }
        AnonymousClass3HN r4 = new AnonymousClass3HN(this);
        C16460t6 r3 = ((AnonymousClass1yR) this.A22).A00.A0N;
        C25981Lw r12 = this.A4D;
        C15830rv r0 = this.A33;
        AnonymousClass00B.A06(r0);
        AnonymousClass36H r2 = new AnonymousClass36H(r3, r0, r4, r12);
        this.A4B = r2;
        ((C14570pP) this.A22).A05.Ack(r2, new Void[0]);
    }

    /* JADX INFO: finally extract failed */
    public final void A0D() {
        MentionableEntry mentionableEntry = this.A37;
        TextWatcher textWatcher = this.A4q;
        mentionableEntry.removeTextChangedListener(textWatcher);
        this.A4Z = false;
        try {
            this.A37.setText("");
            A0B();
            TextKeyListener.clear(this.A37.getText());
            this.A37.addTextChangedListener(textWatcher);
            A0C();
            A0K();
        } catch (Throwable th) {
            this.A37.addTextChangedListener(textWatcher);
            throw th;
        }
    }

    public final void A0E() {
        if (this.A4F == null) {
            this.A22.getLayoutInflater().inflate(R.layout.layout05e7, (ViewGroup) this.A22.findViewById(R.id.voice_note_stub), true);
            IDxListenerShape380S0100000_2_I0 iDxListenerShape380S0100000_2_I0 = new IDxListenerShape380S0100000_2_I0(this, 0);
            AnonymousClass2ZR r1 = this.A4G;
            C14550pN r9 = (C14550pN) this.A22;
            KeyboardPopupLayout keyboardPopupLayout = this.A0z;
            C14750ph r14 = this.A57;
            AnonymousClass1ZL A002 = r1.A01.A00(r9, keyboardPopupLayout);
            C16440t3 r29 = r1.A0D;
            C14710pd r33 = r1.A0H;
            C14870pt r57 = r1.A04;
            AnonymousClass1MV r38 = r1.A0N;
            C16300so r56 = r1.A00;
            C16320sq r41 = r1.A0Q;
            C16180sb r55 = r1.A03;
            C23231Az r39 = r1.A0O;
            C15900s5 r54 = r1.A05;
            C16760tb r53 = r1.A06;
            C18210wK r34 = r1.A0I;
            AnonymousClass15A r25 = r1.A0W;
            C25961Lu r24 = r1.A0S;
            AnonymousClass01V r22 = r1.A0C;
            AnonymousClass013 r21 = r1.A0F;
            C222617g r20 = r1.A0M;
            AnonymousClass1B0 r19 = r1.A0T;
            AudioRecordFactory audioRecordFactory = r1.A07;
            AnonymousClass15N r18 = r1.A0G;
            AnonymousClass1B2 r17 = r1.A0V;
            C15860rz r15 = r1.A0E;
            OpusRecorderFactory opusRecorderFactory = r1.A08;
            C210812s r12 = r1.A09;
            C25981Lw r7 = r1.A0R;
            AnonymousClass1HE r6 = r1.A0J;
            C17020u3 r5 = r1.A0K;
            AnonymousClass1M4 r4 = r1.A0P;
            AnonymousClass15A r50 = r25;
            KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
            C16300so r172 = r56;
            C14550pN r182 = r9;
            C16180sb r192 = r55;
            C14870pt r202 = r57;
            C15900s5 r212 = r54;
            C16760tb r222 = r53;
            OpusRecorderFactory opusRecorderFactory2 = opusRecorderFactory;
            C210812s r252 = r12;
            AnonymousClass1ZK r142 = new AnonymousClass1ZK(keyboardPopupLayout2, r9, r172, r182, r192, r202, r212, r222, audioRecordFactory, opusRecorderFactory2, r252, r1.A0A, r1.A0B, r22, r29, r15, r21, r18, r33, r34, r6, r5, r20, r38, r39, r4, r41, r7, r24, A002, r19, r1.A0U, r17, r1.A02.A00(r9, r14), iDxListenerShape380S0100000_2_I0, r50, true, true);
            this.A4F = r142;
            C15830rv r3 = this.A33;
            boolean z2 = false;
            if (r142.A0P != null) {
                z2 = true;
            }
            AnonymousClass00B.A0D("Do not update the ptt receiver once the recording has started", !z2);
            r142.A0J = r3;
            r142.A0L = this.A2C.A0D;
            AnonymousClass1ZR r2 = this.A2D.A01;
            if (r2 instanceof C70653hS) {
                AnonymousClass3BB r13 = this.A2R;
                r142.A0H = (C70653hS) r2;
                r142.A0I = r13;
            }
        }
    }

    public final void A0F() {
        if (this.A1H != null && ((C14550pN) this.A22).A0C.A0E(C16620tM.A02, 1766)) {
            this.A1H.A06();
        }
    }

    public final void A0G() {
        this.A17.setVisibility(8);
        C005702l r0 = this.A0Y;
        if (r0 != null) {
            r0.dismiss();
            this.A0Y = null;
        }
    }

    public final void A0H() {
        if (this.A2S.A01()) {
            A0R(A04(1));
        }
        this.A2S.A00();
    }

    public final void A0I() {
        AnonymousClass4NG r0 = (AnonymousClass4NG) A5M.get(this.A2l.A08(C15830rv.class));
        if (r0 != null) {
            C614739b r1 = this.A2S;
            boolean z2 = r0.A03;
            C15830rv r02 = r1.A0B;
            if (r02 != null) {
                r1.A0R.A00(1, r02.getRawString(), z2);
            }
        }
    }

    public final void A0J() {
        ((C14550pN) this.A22).A05.A09(R.string.str0e1e, 0);
        this.A1A.sendAccessibilityEvent(8);
        this.A1A.requestFocus();
        this.A1A.A04(false);
    }

    public final void A0K() {
        C614739b r2 = this.A2S;
        if (r2.A0F) {
            if (r2.A0I == 2) {
                AnonymousClass3T3 r0 = r2.A0A;
                AnonymousClass00B.A04(r0);
                if (r0.getVisibility() != 0) {
                    return;
                }
            } else {
                IcebreakerBubbleView icebreakerBubbleView = r2.A09;
                AnonymousClass00B.A04(icebreakerBubbleView);
                if (icebreakerBubbleView.getVisibility() != 0) {
                    return;
                }
            }
            A0n(true);
        }
    }

    public final void A0L() {
        C30011bb A002;
        AnonymousClass2DF r1 = ((AnonymousClass1yR) this.A22).A00;
        if (r1.A01 != null && r1.A0K != null && this.A2C.A0D == null && A06() != null) {
            AnonymousClass1yV r12 = this.A22;
            if (((AnonymousClass1yR) r12).A00.A0K.A04.size() == 1) {
                C14710pd r6 = ((C14550pN) r12).A0C;
                AnonymousClass2DF r0 = ((AnonymousClass1yR) this.A22).A00;
                C16000sG r3 = r0.A07;
                C17240ul r8 = r0.A0Y;
                AnonymousClass135 r10 = this.A3s;
                if (C38621r6.A0X(r3, this.A1c, r0.A0O, r6, this.A2t, r8, (C16740tZ) r0.A0K.A04.values().iterator().next(), r10) && (A002 = this.A1n.A00(A06().A11)) != null) {
                    if (A002.A0j() && A002.A06 == 0) {
                        View view = A002.A0D;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{(float) (A002.getWidth() / 6)});
                        ofFloat.setDuration(600).setInterpolator(new C016007q());
                        ofFloat.addListener(new IDxLAdapterShape3S0100000_2_I0(A002, 17));
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f});
                        ofFloat2.setDuration(200).setInterpolator(new DecelerateInterpolator());
                        ofFloat2.addListener(new IDxLAdapterShape3S0100000_2_I0(A002, 18));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(ofFloat);
                        animatorSet.play(ofFloat2).after(900);
                        animatorSet.start();
                        A002.A06 = 2;
                        A002.invalidate();
                    }
                    ((C14550pN) this.A22).A05.A09(R.string.str1721, 1);
                    this.A22.A96();
                }
            }
        }
    }

    public final void A0M() {
        AnonymousClass12E r4 = this.A0c;
        AnonymousClass1yV r3 = this.A22;
        r4.A00.set(new AnonymousClass1yO(r3, ((C14530pL) r3).A0A, true));
    }

    public final void A0N() {
        AnonymousClass1yO A002 = this.A0c.A00();
        AnonymousClass00B.A06(A002);
        AnonymousClass1yP r0 = A002.A00;
        AnonymousClass1yV r4 = this.A22;
        if (r0 == r4) {
            AnonymousClass12E r3 = this.A0c;
            r3.A00.compareAndSet(A002, new AnonymousClass1yO(r4, ((C14530pL) r4).A0A, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02df, code lost:
        if (r4.A09(r3.A05) != null) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x040a, code lost:
        if (r1 == false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x045a, code lost:
        if (r1 == false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x047b, code lost:
        if (r3 != false) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r1 == false) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O() {
        /*
            r31 = this;
            r7 = r31
            X.0rv r0 = r7.A33
            boolean r0 = r0 instanceof X.AnonymousClass1ZX
            if (r0 != 0) goto L_0x00b3
            X.2VQ r0 = r7.A25
            X.0sH r9 = r7.A2l
            boolean r8 = r7.A4V
            boolean r6 = r7.A4j
            X.1ko r1 = r9.A0D
            r4 = 0
            if (r1 == 0) goto L_0x0016
            r4 = 1
        L_0x0016:
            boolean r2 = r9.A0J()
            r1 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0154
            java.lang.Class<X.0sL> r6 = X.C16050sL.class
            com.whatsapp.jid.Jid r4 = r9.A08(r6)
            X.AnonymousClass00B.A06(r4)
            X.0sL r4 = (X.C16050sL) r4
            X.14s r3 = r0.A0Q
            X.0ul r2 = r0.A0O
            X.0sO r2 = r2.A0a
            boolean r2 = r2.A0D(r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r3.A06(r4, r2)
            if (r2 == 0) goto L_0x0151
            r0.A00(r9, r5)
        L_0x0040:
            X.2VS r2 = r0.A03
            if (r2 == 0) goto L_0x004f
            int r8 = r2.getType()
            X.2jc r4 = r0.A0J
            if (r1 != 0) goto L_0x00e8
            r2.AHp()
        L_0x004f:
            r3 = r1
        L_0x0050:
            r0.A08 = r5
            boolean r1 = r0.A07
            if (r3 == r1) goto L_0x00e6
            java.lang.String r2 = "conversation/spam/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r0.A07 = r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
        L_0x006d:
            X.2VQ r0 = r7.A25
            X.2VS r0 = r0.A03
            if (r0 == 0) goto L_0x007a
            boolean r1 = r0.isVisible()
            r0 = 1
            if (r1 != 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            X.4O9 r9 = r7.A24
            if (r0 == 0) goto L_0x00b4
            X.0pd r2 = r9.A03
            r1 = 2481(0x9b1, float:3.477E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x009d
            X.2of r1 = r9.A00
            if (r1 == 0) goto L_0x009d
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x009d
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r9.A01 = r0
        L_0x009d:
            if (r4 == 0) goto L_0x00b3
            X.3hW r3 = r7.A2E
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x052d
            r0 = 0
            r3.A00(r0)
            android.view.ViewGroup r1 = r3.A01
            r0 = 2131232334(0x7f08064e, float:1.8080774E38)
            r1.setBackgroundResource(r0)
        L_0x00b3:
            return
        L_0x00b4:
            X.0rv r10 = r7.A33
            X.1yV r1 = r7.A22
            r0 = 2131362099(0x7f0a0133, float:1.834397E38)
            android.view.View r12 = r1.findViewById(r0)
            X.1yV r11 = r7.A22
            if (r12 == 0) goto L_0x009d
            boolean r0 = r10 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x009d
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x009d
            X.0pd r2 = r9.A03
            r1 = 2481(0x9b1, float:3.477E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x009d
            r0 = 1
            r9.A01 = r0
            X.0sq r0 = r9.A06
            r13 = 6
            com.facebook.redex.RunnableRunnableShape1S0400000_I1 r8 = new com.facebook.redex.RunnableRunnableShape1S0400000_I1
            r8.<init>(r9, r10, r11, r12, r13)
            r0.Acl(r8)
            goto L_0x009d
        L_0x00e6:
            r4 = 0
            goto L_0x006d
        L_0x00e8:
            X.0sH r2 = r4.A00
            if (r2 != 0) goto L_0x0142
            java.lang.String r2 = "Contact is unexpected null"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x00f1:
            r6 = 0
        L_0x00f2:
            java.lang.String r2 = r4.A01(r8)
            r3 = 0
            if (r2 == 0) goto L_0x00fa
            r3 = 1
        L_0x00fa:
            r2 = 1
            r17 = 2131888685(0x7f120a2d, float:1.9412012E38)
            r20 = 2131888883(0x7f120af3, float:1.9412414E38)
            if (r8 != r2) goto L_0x0109
            r17 = 2131888686(0x7f120a2e, float:1.9412014E38)
            r20 = 2131888884(0x7f120af4, float:1.9412416E38)
        L_0x0109:
            r9 = 0
            r15 = 8
            r10 = 8
            if (r3 == 0) goto L_0x0111
            r10 = 0
        L_0x0111:
            r14 = 0
            if (r6 != 0) goto L_0x0116
            r14 = 8
        L_0x0116:
            X.0rz r2 = r4.A07
            X.01D r2 = r2.A01
            java.lang.Object r3 = r2.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "privacy_groupadd"
            int r2 = r3.getInt(r2, r5)
            if (r2 != 0) goto L_0x0129
            r15 = 0
        L_0x0129:
            r12 = 8
            r18 = -1
            r13 = 8
            r16 = 8
            r19 = -1
            r21 = 0
            r11 = 0
            X.4P5 r8 = new X.4P5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2VS r2 = r0.A03
            r2.Ac8(r8)
            goto L_0x004f
        L_0x0142:
            com.whatsapp.jid.Jid r3 = r2.A08(r6)
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            if (r3 == 0) goto L_0x00f1
            X.0sO r2 = r4.A08
            boolean r6 = r2.A09(r3)
            goto L_0x00f2
        L_0x0151:
            r1 = 0
            goto L_0x0040
        L_0x0154:
            X.0zl r3 = r0.A0N
            X.0rv r2 = r0.A0P
            boolean r3 = X.C40561uK.A01(r3, r2)
            if (r3 != 0) goto L_0x01f7
            X.0pd r10 = r0.A0M
            boolean r3 = X.C40571uL.A00(r10, r2)
            if (r3 != 0) goto L_0x01f7
            X.0rv r3 = r9.A0E
            boolean r3 = X.C16030sJ.A0G(r3)
            if (r3 != 0) goto L_0x01d1
            if (r8 != 0) goto L_0x0190
            if (r4 == 0) goto L_0x017a
            X.14s r3 = r0.A0Q
            boolean r3 = r3.A04(r2)
            if (r3 == 0) goto L_0x01d1
        L_0x017a:
            java.util.ArrayList r3 = r0.A06
            if (r3 != 0) goto L_0x025a
            X.38l r4 = r0.A0R     // Catch:{ all -> 0x0565 }
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r3 = r9.A08(r3)     // Catch:{ all -> 0x0565 }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x0565 }
            java.util.ArrayList r3 = r4.A00(r3)     // Catch:{ all -> 0x0565 }
            r0.A06 = r3     // Catch:{ all -> 0x0565 }
            goto L_0x025a
        L_0x0190:
            X.3pF r1 = r0.A04
            if (r1 != 0) goto L_0x01a2
            X.00k r1 = r0.A0C
            X.3pF r3 = new X.3pF
            r3.<init>(r1)
            r0.A04 = r3
            android.widget.ListView r1 = r0.A0B
            r1.addFooterView(r3)
        L_0x01a2:
            X.3pF r8 = r0.A04
            X.AnonymousClass00B.A04(r8)
            X.4E7 r3 = r0.A0I
            r1 = 3
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r6 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r6.<init>(r3, r1)
            android.view.ViewGroup r4 = r8.A01
            r3 = 21
            com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1 r1 = new com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1
            r1.<init>(r8, r3)
            r4.setOnClickListener(r1)
            android.view.ViewGroup r4 = r8.A02
            r3 = 12
            com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1 r1 = new com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1
            r1.<init>(r8, r2, r6, r3)
            r4.setOnClickListener(r1)
            android.widget.TextView r2 = r8.A03
            r1 = 2131887495(0x7f120587, float:1.9409599E38)
            r2.setText(r1)
            goto L_0x02bb
        L_0x01d1:
            X.2VR r1 = r0.A01
            r2 = 8
            if (r1 == 0) goto L_0x01dc
            android.view.View r1 = r1.A00
            r1.setVisibility(r2)
        L_0x01dc:
            X.2VS r1 = r0.A03
            if (r1 == 0) goto L_0x01e3
            r1.AHp()
        L_0x01e3:
            X.3pG r1 = r0.A05
            if (r1 == 0) goto L_0x01ec
            android.view.ViewGroup r1 = r1.A00
            r1.setVisibility(r2)
        L_0x01ec:
            X.3pF r1 = r0.A04
            if (r1 == 0) goto L_0x02bb
            android.view.ViewGroup r1 = r1.A00
            r1.setVisibility(r2)
            goto L_0x02bb
        L_0x01f7:
            r0.A00(r9, r5)
            X.2VS r1 = r0.A03
            if (r1 == 0) goto L_0x02bb
            X.2jc r3 = r0.A0J
            X.0zl r2 = r3.A0B
            X.0rv r1 = r9.A0E
            boolean r1 = X.C40561uK.A01(r2, r1)
            if (r1 == 0) goto L_0x0252
            X.0rz r1 = r3.A07
            X.01D r1 = r1.A01
            java.lang.Object r2 = r1.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "wac_consent_shown"
            boolean r1 = r2.getBoolean(r1, r5)
            if (r1 != 0) goto L_0x0252
            X.01Y r2 = r3.A04
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r9.A08(r1)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r1 = r2.A0V(r1)
            r18 = 2131886630(0x7f120226, float:1.9407844E38)
            if (r1 == 0) goto L_0x0233
            r18 = 2131892338(0x7f121872, float:1.9419421E38)
        L_0x0233:
            r9 = 0
            r10 = 8
            r17 = 2131893031(0x7f121b27, float:1.9420827E38)
            r19 = 2131886764(0x7f1202ac, float:1.9408116E38)
            r20 = -1
            r21 = 2131886765(0x7f1202ad, float:1.9408118E38)
            r11 = 0
            r12 = 0
            r13 = 8
            r14 = 8
            r15 = 8
            r16 = 8
            X.4P5 r8 = new X.4P5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0345
        L_0x0252:
            X.2VS r1 = r0.A03
            if (r1 == 0) goto L_0x02bb
            r1.AHp()
            goto L_0x02bb
        L_0x025a:
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x02fb
            X.17m r6 = r0.A0L
            X.0rt r3 = r6.A06
            X.0rx r3 = r3.A06(r2)
            if (r3 == 0) goto L_0x02be
            int r3 = r3.A09
            if (r3 != r1) goto L_0x02be
            r1 = 0
        L_0x026f:
            X.3pG r6 = r0.A05
            if (r6 == 0) goto L_0x02bb
            X.00k r8 = r0.A0C
            java.util.ArrayList r10 = r0.A06
            android.view.ViewGroup r4 = r6.A00
            r3 = 8
            if (r1 == 0) goto L_0x027e
            r3 = 0
        L_0x027e:
            r4.setVisibility(r3)
            if (r1 == 0) goto L_0x02bb
            android.view.ViewGroup r4 = r6.A01
            r3 = 38
            com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1 r1 = new com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1
            r1.<init>(r6, r3, r2)
            r4.setOnClickListener(r1)
            android.view.ViewGroup r4 = r6.A02
            r3 = 13
            com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1 r1 = new com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1
            r1.<init>(r6, r8, r2, r3)
            r4.setOnClickListener(r1)
            android.widget.TextView r9 = r6.A03
            X.013 r8 = r6.A04
            r6 = 2131755196(0x7f1000bc, float:1.9141264E38)
            int r1 = r10.size()
            long r2 = (long) r1
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            int r1 = r10.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r5] = r1
            java.lang.String r1 = r8.A0J(r4, r6, r2)
            r9.setText(r1)
        L_0x02bb:
            r3 = 0
            goto L_0x0050
        L_0x02be:
            X.0sK r4 = r0.A0E
            X.0rv r3 = r9.A0E
            boolean r3 = r4.A0I(r3)
            if (r3 == 0) goto L_0x02e2
            r4 = 1967(0x7af, float:2.756E-42)
            X.0tM r3 = X.C16620tM.A02
            boolean r3 = r10.A0E(r3, r4)
            if (r3 == 0) goto L_0x02e2
            X.0sG r4 = r0.A0H
            X.0sK r3 = r4.A01
            r3.A0B()
            X.1ZT r3 = r3.A05
            X.0sH r3 = r4.A09(r3)
            if (r3 == 0) goto L_0x02e2
            goto L_0x026f
        L_0x02e2:
            X.3pG r3 = r0.A05
            if (r3 != 0) goto L_0x026f
            X.00k r3 = r0.A0C
            X.3pG r4 = new X.3pG
            r4.<init>(r3)
            r0.A05 = r4
            X.38l r3 = r0.A0R
            r4.setup(r6, r3)
            android.widget.ListView r3 = r0.A0B
            r3.addFooterView(r4)
            goto L_0x026f
        L_0x02fb:
            if (r6 == 0) goto L_0x034c
            r0.A00(r9, r5)
            X.2VS r2 = r0.A03
            if (r2 == 0) goto L_0x02bb
            X.2jc r3 = r0.A0J
            X.0rv r2 = r9.A0E
            if (r2 == 0) goto L_0x02bb
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            com.whatsapp.jid.Jid r2 = r9.A08(r2)
            X.0rv r2 = (X.C15830rv) r2
            if (r2 == 0) goto L_0x02bb
            java.lang.String r4 = X.C24561Gk.A04(r2)
            X.00k r2 = r3.A02
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131892598(0x7f121976, float:1.9419949E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r4
            java.lang.String r9 = r3.getString(r2, r1)
            r10 = 8
            r17 = -1
            r11 = 8
            r12 = 8
            r13 = 0
            r14 = 8
            r15 = 8
            r16 = 0
            r18 = -1
            r19 = -1
            r20 = -1
            r21 = 0
            X.4P5 r8 = new X.4P5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0345:
            X.2VS r1 = r0.A03
            r1.Ac8(r8)
            goto L_0x02bb
        L_0x034c:
            X.0sK r8 = r0.A0E
            boolean r3 = r8.A0G()
            if (r3 != 0) goto L_0x02bb
            X.14s r4 = r0.A0Q
            java.lang.Class<X.0rv> r3 = X.C15830rv.class
            com.whatsapp.jid.Jid r3 = r9.A08(r3)
            X.AnonymousClass00B.A06(r3)
            X.0rv r3 = (X.C15830rv) r3
            int r6 = r4.A00(r3)
            r3 = -1
            if (r6 != r3) goto L_0x04be
            r0.A00(r9, r5)
            r3 = 1
        L_0x036c:
            r16 = 0
            if (r3 != 0) goto L_0x04ca
            boolean r6 = r9.A0K()
            if (r6 != 0) goto L_0x04ca
            X.0rv r6 = r9.A0E
            boolean r6 = r8.A0I(r6)
            if (r6 == 0) goto L_0x047e
            r8 = 1967(0x7af, float:2.756E-42)
            X.0tM r6 = X.C16620tM.A02
            boolean r6 = r10.A0E(r6, r8)
            if (r6 == 0) goto L_0x047e
        L_0x0388:
            X.2VR r8 = r0.A01
            if (r8 == 0) goto L_0x03d7
            android.view.View r10 = r8.A00
            r6 = 8
            r5 = 8
            if (r1 == 0) goto L_0x0395
            r5 = 0
        L_0x0395:
            r10.setVisibility(r5)
            if (r1 == 0) goto L_0x03d7
            X.01Y r5 = r8.A04
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r2)
            boolean r10 = r5.A0V(r1)
            android.content.Context r5 = r8.getContext()
            r1 = 2131886630(0x7f120226, float:1.9407844E38)
            if (r10 == 0) goto L_0x03b0
            r1 = 2131892338(0x7f121872, float:1.9419421E38)
        L_0x03b0:
            java.lang.String r1 = r5.getString(r1)
            android.widget.TextView r5 = r8.A03
            r5.setText(r1)
            if (r10 != 0) goto L_0x03d7
            X.0rt r1 = r8.A05
            java.lang.String r1 = r1.A09(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03d7
            r5.setVisibility(r6)
            android.widget.TextView r5 = r8.A02
            r1 = 2131886246(0x7f1200a6, float:1.9407065E38)
            r5.setText(r1)
            android.view.View r1 = r8.A01
            r1.setVisibility(r6)
        L_0x03d7:
            X.2VS r1 = r0.A03
            if (r1 == 0) goto L_0x047b
            int r11 = r1.getType()
            X.2jc r8 = r0.A0J
            X.0rv r1 = r9.A0E
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.of(r1)
            if (r5 == 0) goto L_0x0472
            boolean r1 = r9.A0H()
            if (r1 == 0) goto L_0x0472
            X.0uP r1 = r8.A06
            boolean r10 = r1.A02(r5)
        L_0x03f5:
            X.01Y r5 = r8.A04
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r9.A08(r1)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r1 = r5.A0V(r1)
            r6 = 1
            r22 = 0
            if (r3 == 0) goto L_0x0474
            if (r10 == 0) goto L_0x0457
            if (r1 != 0) goto L_0x0474
        L_0x040c:
            r27 = 2131886630(0x7f120226, float:1.9407844E38)
            if (r10 == 0) goto L_0x045d
            r26 = 2131886856(0x7f120308, float:1.9408303E38)
        L_0x0414:
            boolean r1 = r8.A01
            if (r1 == 0) goto L_0x041b
            r26 = 2131892272(0x7f121830, float:1.9419288E38)
        L_0x041b:
            if (r11 == 0) goto L_0x041e
            r6 = 0
        L_0x041e:
            r18 = 0
            r19 = 8
            if (r6 == 0) goto L_0x0426
            r19 = 0
        L_0x0426:
            r20 = 8
            if (r10 == 0) goto L_0x042e
            r20 = 0
            r22 = 8
        L_0x042e:
            r23 = 8
            r28 = 2131886764(0x7f1202ac, float:1.9408116E38)
            r29 = -1
            r30 = 2131889697(0x7f120e21, float:1.9414065E38)
            X.4P5 r1 = new X.4P5
            r21 = 0
            r24 = 8
            r25 = 8
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.2VS r5 = r0.A03
            r5.Ac8(r1)
        L_0x044a:
            boolean r1 = r0.A07
            if (r1 != 0) goto L_0x0529
            X.17a r13 = r4.A01
            X.0t3 r1 = r4.A03
            long r5 = r1.A00()
            goto L_0x04d0
        L_0x0457:
            r27 = 2131892338(0x7f121872, float:1.9419421E38)
            if (r1 != 0) goto L_0x045d
            goto L_0x040c
        L_0x045d:
            int r5 = r9.A06
            if (r5 == r6) goto L_0x046e
            r1 = 2
            if (r5 == r1) goto L_0x046e
            r1 = 3
            r26 = 2131891460(0x7f121504, float:1.941764E38)
            if (r5 == r1) goto L_0x0414
            r26 = 2131891459(0x7f121503, float:1.9417639E38)
            goto L_0x0414
        L_0x046e:
            r26 = 2131891461(0x7f121505, float:1.9417643E38)
            goto L_0x0414
        L_0x0472:
            r10 = 0
            goto L_0x03f5
        L_0x0474:
            X.2VS r1 = r0.A03
            if (r1 == 0) goto L_0x047b
            r1.AHp()
        L_0x047b:
            if (r3 == 0) goto L_0x0529
            goto L_0x044a
        L_0x047e:
            boolean r6 = r2 instanceof X.AnonymousClass1ZX
            if (r6 != 0) goto L_0x0388
            X.2VR r6 = r0.A01
            if (r6 != 0) goto L_0x0388
            X.00k r14 = r0.A0C
            X.2VR r13 = new X.2VR
            r13.<init>(r14)
            r0.A01 = r13
            X.0rt r6 = r0.A0K
            r17 = r6
            X.0pS r15 = r0.A0D
            X.0s5 r12 = r0.A0F
            X.01Y r11 = r0.A0G
            X.4E7 r10 = r0.A0I
            r8 = 49
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r6 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6
            r6.<init>(r10, r8)
            r18 = r14
            r19 = r17
            r20 = r15
            r21 = r12
            r22 = r11
            r23 = r6
            r24 = r9
            r17 = r13
            r17.setup(r18, r19, r20, r21, r22, r23, r24)
            android.view.ViewGroup r8 = r0.A09
            X.2VR r6 = r0.A01
            r8.addView(r6, r5)
            goto L_0x0388
        L_0x04be:
            boolean r3 = r4.A04(r2)
            if (r3 == 0) goto L_0x04cd
            r0.A00(r9, r1)
            r3 = 1
            r16 = 1
        L_0x04ca:
            r1 = 0
            goto L_0x0388
        L_0x04cd:
            r3 = 0
            goto L_0x036c
        L_0x04d0:
            org.json.JSONObject r12 = r13.A01(r2)     // Catch:{ JSONException -> 0x0506 }
            if (r12 == 0) goto L_0x04fe
            java.lang.String r9 = "tb_last_shown_ts"
            boolean r1 = r12.has(r9)     // Catch:{ JSONException -> 0x0506 }
            if (r1 == 0) goto L_0x04f4
            java.lang.String r8 = "tb_last_action_ts"
            boolean r1 = r12.has(r8)     // Catch:{ JSONException -> 0x0506 }
            if (r1 == 0) goto L_0x0504
            long r10 = r12.getLong(r9)     // Catch:{ JSONException -> 0x0506 }
            long r8 = r12.getLong(r8)     // Catch:{ JSONException -> 0x0506 }
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0504
        L_0x04f4:
            java.lang.String r1 = "tb_last_shown_ts"
            r12.put(r1, r5)     // Catch:{ JSONException -> 0x0506 }
            r13.A02(r2, r12)     // Catch:{ JSONException -> 0x0506 }
            goto L_0x0508
        L_0x04fe:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0506 }
            r12.<init>()     // Catch:{ JSONException -> 0x0506 }
            goto L_0x04f4
        L_0x0504:
            r1 = 0
            goto L_0x0509
        L_0x0506:
            r1 = 0
            goto L_0x0509
        L_0x0508:
            r1 = 1
        L_0x0509:
            if (r16 == 0) goto L_0x0529
            if (r1 == 0) goto L_0x0529
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.1uM r5 = new X.1uM
            r5.<init>()
            r5.A00 = r1
            r5.A01 = r1
            java.lang.String r1 = r2.getRawString()
            r5.A02 = r1
            X.0t9 r1 = r4.A09
            r1.A06(r5)
            r1.A01()
        L_0x0529:
            r5 = r16
            goto L_0x0050
        L_0x052d:
            X.0se r2 = r3.A04
            X.0rv r1 = r3.A03
            android.app.Activity r0 = r3.A00
            X.4Ul r0 = r2.A06(r0, r1)
            android.graphics.drawable.Drawable r0 = r2.A03(r0)
            if (r0 == 0) goto L_0x0540
            r3.A00(r0)
        L_0x0540:
            X.14s r2 = r7.A3q
            X.0sH r1 = r7.A2l
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r1.A08(r0)
            X.AnonymousClass00B.A06(r1)
            X.0rv r1 = (X.C15830rv) r1
            r0 = 1
            r2.A05(r1, r0)
            com.obwhatsapp.conversation.ConversationListView r0 = r7.A1n
            X.2Qa r1 = r0.getConversationCursorAdapter()
            int r0 = r1.A02
            int r0 = r0 + 1
            r1.A02 = r0
            com.obwhatsapp.conversation.ConversationListView r0 = r7.A1n
            r0.A02()
            return
        L_0x0565:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42821yj.A0O():void");
    }

    public final void A0P() {
        C49692Vb r2 = (C49692Vb) this.A1j.A00.get(AnonymousClass306.class);
        AnonymousClass00B.A06(r2);
        AnonymousClass306 r22 = (AnonymousClass306) r2;
        r22.A00 = this.A2l;
        boolean A032 = r22.A03();
        boolean A042 = r22.A04();
        if (A032) {
            if (A042) {
                r22.A06();
            } else {
                r22.A00();
            }
        } else if (A042) {
            r22.A02(false);
        }
    }

    public final void A0Q() {
        C49682Va r6 = (C49682Va) ((C49692Vb) this.A1j.A00.get(C49682Va.class));
        if (r6 != null) {
            C16010sH r7 = this.A2l;
            r6.A01 = r7;
            C27421Rr r5 = r6.A08;
            Jid A082 = r7.A08(UserJid.class);
            AnonymousClass00B.A06(A082);
            C15840rx A062 = r5.A03.A06((C15830rv) A082);
            if (A062 != null && A062.A0A != -1) {
                r6.A0A.Ack(new C78833yl(r6, r5, r7), new Void[0]);
            } else if (r6.A04()) {
                r6.A02(true);
            }
        }
    }

    public void A0R(int i2) {
        AnonymousClass013 r2 = this.A2L;
        Drawable A042 = AnonymousClass00T.A04((Context) this.A22, i2);
        new C447725m(A042, r2);
        AnonymousClass3LG.A00(Conversation.checkEntryBK((com.obwhatsapp.Conversation) this.A22, i2, A042), this.A08);
    }

    public final void A0S(int i2) {
        View view;
        if (((C14550pN) this.A22).A0C.A0E(C16620tM.A02, 834) && A0u(i2) && (view = this.A0A) != null && view.getVisibility() != 8) {
            C15860rz r0 = ((C14550pN) this.A22).A09;
            r0.A0K().putString("payment_chat_composer_entry_nux_shown", r0.A0Q()).apply();
            ObjectAnimator objectAnimator = this.A03;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.A0A.setVisibility(8);
        }
    }

    public final void A0T(int i2) {
        if (((C14550pN) this.A22).A0C.A0E(C16620tM.A02, 834) && A0u(i2)) {
            C15860rz r0 = ((C14550pN) this.A22).A09;
            if (!r0.A0Q().equals(((SharedPreferences) r0.A01.get()).getString("payment_chat_composer_entry_nux_shown", ""))) {
                View view = this.A0A;
                if (view != null) {
                    view.setVisibility(0);
                }
                ObjectAnimator objectAnimator = this.A03;
                if (objectAnimator == null) {
                    objectAnimator = ObjectAnimator.ofPropertyValuesHolder(this.A0A, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.4f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.4f}), PropertyValuesHolder.ofFloat("alpha", new float[]{0.4f, 0.0f})});
                    this.A03 = objectAnimator;
                }
                objectAnimator.setDuration(1500);
                this.A03.setRepeatCount(-1);
                this.A03.setRepeatMode(1);
                this.A03.start();
                return;
            }
            A0S(i2);
        }
    }

    public final void A0U(long j2, boolean z2, boolean z3) {
        C16010sH A052;
        AnonymousClass1yV r0 = this.A22;
        if (z3) {
            C16040sK r02 = ((C14530pL) r0).A01;
            r02.A0B();
            A052 = r02.A01;
        } else {
            A052 = ((AnonymousClass1yR) r0).A00.A07.A05(j2);
        }
        if (A052 != null) {
            Jid A082 = A052.A08(C15830rv.class);
            AnonymousClass00B.A06(A082);
            A0c(A052, (C15830rv) A082, z2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e A[SYNTHETIC, Splitter:B:14:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(android.app.assist.AssistContent r5) {
        /*
            r4 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x002d
            X.0rv r3 = r4.A33
            r0 = 1
            X.AnonymousClass00B.A0F(r0)
            java.lang.String r1 = "Invalid"
            if (r3 == 0) goto L_0x004c
            boolean r0 = X.C16030sJ.A0L(r3)
            if (r0 != 0) goto L_0x0049
            boolean r0 = X.C16030sJ.A0G(r3)
            if (r0 != 0) goto L_0x0049
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x004c
            java.lang.String r2 = "Individual"
        L_0x0022:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "conversation/provide-assist-content/invalid-conversation-id"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002d:
            return
        L_0x002e:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0056 }
            r1.<init>()     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r0 = "conversation_type"
            org.json.JSONObject r2 = r1.put(r0, r2)     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r1 = "conversation_id"
            X.AnonymousClass00B.A06(r3)     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r0 = r3.getRawString()     // Catch:{ JSONException -> 0x0056 }
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0056 }
            if (r0 == 0) goto L_0x002d
            goto L_0x004e
        L_0x0049:
            java.lang.String r2 = "Group"
            goto L_0x0022
        L_0x004c:
            r2 = r1
            goto L_0x0022
        L_0x004e:
            java.lang.String r0 = r0.toString()
            r5.setStructuredData(r0)
            return
        L_0x0056:
            r1 = move-exception
            java.lang.String r0 = "assistant-utils/get-conversation-structured-data/exception"
            com.whatsapp.util.Log.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42821yj.A0V(android.app.assist.AssistContent):void");
    }

    public void A0W(Configuration configuration) {
        MentionableEntry mentionableEntry;
        AnonymousClass1ZQ r2;
        ConversationListView conversationListView = this.A1n;
        if (conversationListView.A0D) {
            conversationListView.setTranscriptMode(2);
            conversationListView.A0K.sendEmptyMessageDelayed(0, 1000);
        } else {
            conversationListView.setSelection(conversationListView.A00);
        }
        if (Build.VERSION.SDK_INT >= 19 && (r2 = this.A4A) != null) {
            int i2 = configuration.orientation;
            r2.Adm(i2);
            if (!r2.ACs()) {
                r2.AeE(i2);
            }
        }
        AnonymousClass1ZK r1 = this.A4F;
        if (r1 != null) {
            AnonymousClass1ZL r4 = r1.A1G;
            r4.A0J.clear();
            File file = r1.A0R;
            if (file != null) {
                r4.A04(r1.A0N, file, false, true);
            }
        }
        int i3 = configuration.orientation;
        MentionableEntry mentionableEntry2 = this.A37;
        if (i3 == 1) {
            AnonymousClass1UP.A05(mentionableEntry2);
        } else {
            mentionableEntry2.setMaxLines(2);
            AnonymousClass1ZQ r12 = this.A4A;
            if (r12 != null && r12.ACn() && !r12.ACs()) {
                r12.A8Z();
                this.A4A.AeE(1);
            }
            AnonymousClass1ZK r0 = this.A4F;
            if (!(r0 == null || r0.A1G.A0B.getVisibility() != 0 || (mentionableEntry = this.A37) == null)) {
                mentionableEntry.A03();
            }
        }
        C614739b r3 = this.A2S;
        if (r3.A0F) {
            boolean z2 = false;
            if (configuration.orientation == 2) {
                z2 = true;
            }
            r3.A0E = z2;
            if (r3.A0I == 2 && z2) {
                r3.A00();
            }
        }
        this.A2C.A00 = A03();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.1yj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v2, resolved type: X.30B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v3, resolved type: X.30A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v6, resolved type: X.2ks} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v7, resolved type: X.2ks} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v7, resolved type: X.2ks} */
    /* JADX WARNING: type inference failed for: r58v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x08a6, code lost:
        if (r7.contains(X.C18450wi.A06("banner_payload_", java.lang.Integer.valueOf(r4.hashCode()))) != false) goto L_0x08a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0937, code lost:
        if (r15 == null) goto L_0x0939;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0d65, code lost:
        if (A5M.get(r0.A2l.A08(X.C15830rv.class)) != null) goto L_0x0d67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x051b, code lost:
        if (r7 != false) goto L_0x051d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0962 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0970 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x098e A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x09a8 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x09c2 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0a2b A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0ace A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0ad9 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0b34 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0b67 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0d55 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0d56 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0d72 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0e64 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0ec7 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0ecd A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0efc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0f2c A[SYNTHETIC, Splitter:B:228:0x0f2c] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x10a7 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x1102 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x1114 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x1131 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x1167 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x11ee A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x15d6 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x1a57 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x1ac6 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x1b9e A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x1de8 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }, LOOP:1: B:357:0x1de2->B:359:0x1de8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x1e47 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x1e5a A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x1fb1 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x1fbb A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x1fe2 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x21b6 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x21db A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x21fd A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x2246 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x228c A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x22ca A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x2313 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x2350 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x235e A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x23b2 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x2429 A[ADDED_TO_REGION, Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x06e3 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0727 A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x079e A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x087e A[Catch:{ 25G -> 0x106e, all -> 0x2544 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(android.os.Bundle r115) {
        /*
            r114 = this;
            java.lang.String r30 = "error_message"
            java.lang.String r26 = "composer_has_text"
            java.lang.String r25 = "lifecycle_callbacks"
            java.lang.String r21 = "on_create_conversation"
            java.lang.String r4 = "inflateViews"
            java.lang.String r16 = "Conversation"
            java.lang.String r29 = "on_create"
            r0 = r114
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pP r1 = (X.C14570pP) r1     // Catch:{ all -> 0x2544 }
            X.10F r2 = r1.A02     // Catch:{ all -> 0x2544 }
            r1 = r16
            r2.A09(r1)     // Catch:{ all -> 0x2544 }
            X.0y6 r1 = r0.A32     // Catch:{ all -> 0x2544 }
            boolean r1 = r1.A07()     // Catch:{ all -> 0x2544 }
            r18 = r115
            if (r1 == 0) goto L_0x0074
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            android.content.Intent r6 = r1.getIntent()     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = "primary_container_class"
            java.lang.String r1 = r6.getStringExtra(r5)     // Catch:{ all -> 0x2544 }
            if (r1 != 0) goto L_0x0074
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            android.view.Window r3 = r1.getWindow()     // Catch:{ all -> 0x2544 }
            r2 = 0
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable     // Catch:{ all -> 0x2544 }
            r1.<init>(r2)     // Catch:{ all -> 0x2544 }
            r3.setBackgroundDrawable(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r2 = r0.A22     // Catch:{ all -> 0x2544 }
            r1 = r18
            r2.AYN(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1     // Catch:{ all -> 0x2544 }
            android.content.Intent r3 = X.C14750ph.A02(r1)     // Catch:{ all -> 0x2544 }
            android.net.Uri r1 = r6.getData()     // Catch:{ all -> 0x2544 }
            r3.setData(r1)     // Catch:{ all -> 0x2544 }
            r3.putExtras(r6)     // Catch:{ all -> 0x2544 }
            java.lang.String r1 = "com.obwhatsapp.HomeActivity"
            r3.putExtra(r5, r1)     // Catch:{ all -> 0x2544 }
            java.lang.String r2 = "secondary_container_class"
            java.lang.String r1 = "com.obwhatsapp.Conversation"
            r3.putExtra(r2, r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.startActivity(r3)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.finish()     // Catch:{ all -> 0x2544 }
            goto L_0x253c
        L_0x0074:
            java.lang.String r2 = "conversation/create"
            X.1Zf r28 = new X.1Zf     // Catch:{ all -> 0x2544 }
            r1 = r28
            r1.<init>((java.lang.String) r2)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            android.view.Window r3 = r1.getWindow()     // Catch:{ all -> 0x2544 }
            r2 = 0
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable     // Catch:{ all -> 0x2544 }
            r1.<init>(r2)     // Catch:{ all -> 0x2544 }
            r3.setBackgroundDrawable(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            android.view.Window r2 = r1.getWindow()     // Catch:{ all -> 0x2544 }
            boolean r1 = X.C455529g.A00     // Catch:{ all -> 0x2544 }
            if (r1 == 0) goto L_0x00a5
            r1 = 13
            r2.requestFeature(r1)     // Catch:{ all -> 0x2544 }
            r1 = 12
            r2.requestFeature(r1)     // Catch:{ all -> 0x2544 }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r1)     // Catch:{ all -> 0x2544 }
        L_0x00a5:
            X.1yV r2 = r0.A22     // Catch:{ all -> 0x2544 }
            r1 = r18
            r2.AYN(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r2 = r0.A22     // Catch:{ all -> 0x2544 }
            r1 = r29
            r2.AKw(r1)     // Catch:{ all -> 0x2544 }
            X.2aU r2 = r0.A0h     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pQ r1 = (X.C14580pQ) r1     // Catch:{ all -> 0x2544 }
            X.2Kc r1 = r1.A01     // Catch:{ all -> 0x2544 }
            X.39M r1 = r2.A00(r1)     // Catch:{ all -> 0x2544 }
            r0.A28 = r1     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pP r1 = (X.C14570pP) r1     // Catch:{ all -> 0x2544 }
            X.0sq r5 = r1.A05     // Catch:{ all -> 0x2544 }
            X.1H9 r3 = r0.A2H     // Catch:{ all -> 0x2544 }
            r2 = 1
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r1 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x2544 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x2544 }
            r5.Acl(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            android.view.Window r1 = r1.getWindow()     // Catch:{ all -> 0x2544 }
            X.C19980zJ.A05(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1     // Catch:{ all -> 0x2544 }
            X.02z r2 = new X.02z     // Catch:{ all -> 0x2544 }
            r2.<init>(r1)     // Catch:{ all -> 0x2544 }
            java.lang.Class<com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel> r1 = com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel.class
            X.01n r1 = r2.A01(r1)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r1 = (com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel) r1     // Catch:{ all -> 0x2544 }
            r0.A3t = r1     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1     // Catch:{ all -> 0x2544 }
            X.02z r2 = new X.02z     // Catch:{ all -> 0x2544 }
            r2.<init>(r1)     // Catch:{ all -> 0x2544 }
            java.lang.Class<com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel> r1 = com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel.class
            X.01n r1 = r2.A01(r1)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel r1 = (com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel) r1     // Catch:{ all -> 0x2544 }
            r0.A2M = r1     // Catch:{ all -> 0x2544 }
            X.1yV r7 = r0.A22     // Catch:{ all -> 0x2544 }
            r6 = r7
            com.obwhatsapp.Conversation r6 = (com.obwhatsapp.Conversation) r6     // Catch:{ all -> 0x2544 }
            X.2ac r5 = r0.A0q     // Catch:{ all -> 0x2544 }
            android.os.Handler r3 = r0.A4p     // Catch:{ all -> 0x2544 }
            r2 = 0
            com.facebook.redex.IDxFactoryShape37S0300000_1_I0 r1 = new com.facebook.redex.IDxFactoryShape37S0300000_1_I0     // Catch:{ all -> 0x2544 }
            r1.<init>(r3, r5, r7, r2)     // Catch:{ all -> 0x2544 }
            X.02z r3 = new X.02z     // Catch:{ all -> 0x2544 }
            r3.<init>((X.AnonymousClass04o) r1, (X.C001500q) r6)     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.1wN> r1 = X.C41681wN.class
            X.01n r1 = r3.A01(r1)     // Catch:{ all -> 0x2544 }
            X.1wN r1 = (X.C41681wN) r1     // Catch:{ all -> 0x2544 }
            r0.A2D = r1     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1     // Catch:{ all -> 0x2544 }
            X.02z r3 = new X.02z     // Catch:{ all -> 0x2544 }
            r3.<init>(r1)     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.3Q5> r27 = X.AnonymousClass3Q5.class
            r1 = r27
            X.01n r1 = r3.A01(r1)     // Catch:{ all -> 0x2544 }
            X.3Q5 r1 = (X.AnonymousClass3Q5) r1     // Catch:{ all -> 0x2544 }
            r0.A3N = r1     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1     // Catch:{ all -> 0x2544 }
            X.02z r3 = new X.02z     // Catch:{ all -> 0x2544 }
            r3.<init>(r1)     // Catch:{ all -> 0x2544 }
            java.lang.Class<com.obwhatsapp.community.ConversationCommunityViewModel> r1 = com.obwhatsapp.community.ConversationCommunityViewModel.class
            X.01n r1 = r3.A01(r1)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.community.ConversationCommunityViewModel r1 = (com.obwhatsapp.community.ConversationCommunityViewModel) r1     // Catch:{ all -> 0x2544 }
            r0.A1Y = r1     // Catch:{ all -> 0x2544 }
            X.027 r6 = r1.A02     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r3 = 160(0xa0, float:2.24E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>((java.lang.Object) r0, (int) r3)     // Catch:{ all -> 0x2544 }
            r6.A0A(r5, r1)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.community.ConversationCommunityViewModel r1 = r0.A1Y     // Catch:{ all -> 0x2544 }
            X.027 r6 = r1.A01     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r3 = 159(0x9f, float:2.23E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>((java.lang.Object) r0, (int) r3)     // Catch:{ all -> 0x2544 }
            r6.A0A(r5, r1)     // Catch:{ all -> 0x2544 }
            X.1yV r7 = r0.A22     // Catch:{ all -> 0x2544 }
            X.02C r5 = r7.AGM()     // Catch:{ all -> 0x2544 }
            java.lang.String r3 = "NewCommunityAdminBottomSheetFragment"
            com.obwhatsapp.Conversation r7 = (com.obwhatsapp.Conversation) r7     // Catch:{ all -> 0x2544 }
            r6 = 1
            com.facebook.redex.IDxRListenerShape303S0100000_2_I0 r1 = new com.facebook.redex.IDxRListenerShape303S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x2544 }
            r5.A0f(r1, r7, r3)     // Catch:{ all -> 0x2544 }
            X.1wN r1 = r0.A2D     // Catch:{ all -> 0x2544 }
            X.028 r7 = r1.A0A     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r3 = 153(0x99, float:2.14E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>((java.lang.Object) r0, (int) r3)     // Catch:{ all -> 0x2544 }
            r7.A0A(r5, r1)     // Catch:{ all -> 0x2544 }
            X.1wN r1 = r0.A2D     // Catch:{ all -> 0x2544 }
            X.027 r7 = r1.A0D     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r3 = 161(0xa1, float:2.26E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>((java.lang.Object) r0, (int) r3)     // Catch:{ all -> 0x2544 }
            r7.A0A(r5, r1)     // Catch:{ all -> 0x2544 }
            X.1wN r1 = r0.A2D     // Catch:{ all -> 0x2544 }
            X.027 r7 = r1.A0C     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r3 = 152(0x98, float:2.13E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>((java.lang.Object) r0, (int) r3)     // Catch:{ all -> 0x2544 }
            r7.A0A(r5, r1)     // Catch:{ all -> 0x2544 }
            X.1CX r11 = r0.A3j     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = r1
            X.0pP r3 = (X.C14570pP) r3     // Catch:{ all -> 0x2544 }
            X.0sq r12 = r3.A05     // Catch:{ all -> 0x2544 }
            X.13k r9 = r0.A3h     // Catch:{ all -> 0x2544 }
            X.14W r10 = r0.A3i     // Catch:{ all -> 0x2544 }
            r3 = r1
            X.0pN r3 = (X.C14550pN) r3     // Catch:{ all -> 0x2544 }
            X.0rz r8 = r3.A09     // Catch:{ all -> 0x2544 }
            X.1wf r7 = new X.1wf     // Catch:{ all -> 0x2544 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x2544 }
            r0.A3p = r7     // Catch:{ all -> 0x2544 }
            X.3H7 r3 = new X.3H7     // Catch:{ all -> 0x2544 }
            r3.<init>(r7)     // Catch:{ all -> 0x2544 }
            r0.A3T = r3     // Catch:{ all -> 0x2544 }
            r3 = 0
            if (r115 == 0) goto L_0x01d6
            r3 = 1
        L_0x01d6:
            r0.A4U = r3     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1     // Catch:{ all -> 0x2544 }
            X.0pd r3 = r1.A0C     // Catch:{ all -> 0x2544 }
            r1 = 1154(0x482, float:1.617E-42)
            X.0tM r23 = X.C16620tM.A02     // Catch:{ all -> 0x2544 }
            r5 = r23
            boolean r1 = r3.A0E(r5, r1)     // Catch:{ all -> 0x2544 }
            r0.A4g = r1     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1     // Catch:{ all -> 0x2544 }
            X.0pd r3 = r1.A0C     // Catch:{ all -> 0x2544 }
            r1 = 931(0x3a3, float:1.305E-42)
            boolean r1 = r3.A0E(r5, r1)     // Catch:{ all -> 0x2544 }
            r0.A4e = r1     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1     // Catch:{ all -> 0x2544 }
            X.0pd r3 = r1.A0C     // Catch:{ all -> 0x2544 }
            r1 = 1395(0x573, float:1.955E-42)
            boolean r1 = r3.A0E(r5, r1)     // Catch:{ all -> 0x2544 }
            r0.A4f = r1     // Catch:{ all -> 0x2544 }
            boolean r1 = r0.A4U     // Catch:{ all -> 0x2544 }
            if (r1 != 0) goto L_0x020d
            X.197 r1 = X.AnonymousClass2DT.A0y     // Catch:{ all -> 0x2544 }
            r1.clear()     // Catch:{ all -> 0x2544 }
        L_0x020d:
            com.whatsapp.nativelibloader.WhatsAppLibLoader r1 = r0.A3B     // Catch:{ all -> 0x2544 }
            boolean r1 = r1.A03()     // Catch:{ all -> 0x2544 }
            r7 = 3
            if (r1 != 0) goto L_0x022e
            java.lang.String r1 = "conversation/aborting due to native libraries missing"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x2544 }
            X.1yV r2 = r0.A22     // Catch:{ all -> 0x2544 }
            java.lang.String r1 = "on_create_whatsapp_lib_failure"
            r2.AL7(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.AL0(r7)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.finish()     // Catch:{ all -> 0x2544 }
            goto L_0x253c
        L_0x022e:
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pL r1 = (X.C14530pL) r1     // Catch:{ all -> 0x2544 }
            X.0sK r1 = r1.A01     // Catch:{ all -> 0x2544 }
            r1.A0B()     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Me r1 = r1.A00     // Catch:{ all -> 0x2544 }
            if (r1 == 0) goto L_0x2519
            X.0tq r1 = r0.A2i     // Catch:{ all -> 0x2544 }
            r1.A04()     // Catch:{ all -> 0x2544 }
            boolean r1 = r1.A01     // Catch:{ all -> 0x2544 }
            if (r1 == 0) goto L_0x2519
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pL r1 = (X.C14530pL) r1     // Catch:{ all -> 0x2544 }
            X.0sC r1 = r1.A09     // Catch:{ all -> 0x2544 }
            boolean r1 = r1.A01()     // Catch:{ all -> 0x2544 }
            if (r1 == 0) goto L_0x2519
            X.2aT r5 = r0.A1l     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            android.content.Intent r3 = r1.getIntent()     // Catch:{ all -> 0x2544 }
            boolean r1 = r0.A4U     // Catch:{ all -> 0x2544 }
            r8 = r18
            X.4PI r1 = r5.A00(r3, r8, r1)     // Catch:{ all -> 0x2544 }
            X.3BB r3 = r1.A06     // Catch:{ all -> 0x2544 }
            r0.A2R = r3     // Catch:{ all -> 0x2544 }
            int r5 = r1.A02     // Catch:{ all -> 0x2544 }
            if (r5 == r6) goto L_0x2507
            r9 = 2
            if (r5 == r9) goto L_0x24eb
            if (r5 == r7) goto L_0x24a0
            X.0rv r5 = r1.A08     // Catch:{ all -> 0x2544 }
            r24 = r5
            X.AnonymousClass00B.A06(r24)     // Catch:{ all -> 0x2544 }
            r0.A33 = r5     // Catch:{ all -> 0x2544 }
            X.0sH r10 = r1.A07     // Catch:{ all -> 0x2544 }
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x2544 }
            r0.A2l = r10     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            X.2aZ r7 = r0.A0n     // Catch:{ all -> 0x2544 }
            android.content.Intent r32 = r8.getIntent()     // Catch:{ all -> 0x2544 }
            X.2qS r5 = new X.2qS     // Catch:{ all -> 0x2544 }
            r31 = r5
            r33 = r8
            r34 = r7
            r35 = r10
            r36 = r24
            r31.<init>(r32, r33, r34, r35, r36)     // Catch:{ all -> 0x2544 }
            X.02z r7 = new X.02z     // Catch:{ all -> 0x2544 }
            r7.<init>((X.AnonymousClass04o) r5, (X.C001500q) r8)     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.1kZ> r5 = X.C34621kZ.class
            X.01n r7 = r7.A01(r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r7 = (X.C34621kZ) r7     // Catch:{ all -> 0x2544 }
            r0.A2C = r7     // Catch:{ all -> 0x2544 }
            int r5 = r0.A03()     // Catch:{ all -> 0x2544 }
            r7.A00 = r5     // Catch:{ all -> 0x2544 }
            X.1kZ r7 = r0.A2C     // Catch:{ all -> 0x2544 }
            r5 = 8
            r7.A03 = r5     // Catch:{ all -> 0x2544 }
            X.027 r10 = r7.A0N     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 41
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r5 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x2544 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.027 r10 = r5.A0M     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 155(0x9b, float:2.17E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.1cy r10 = r5.A0r     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 43
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r5 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x2544 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.027 r10 = r5.A0O     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 156(0x9c, float:2.19E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.1cy r10 = r5.A0s     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 164(0xa4, float:2.3E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.1cy r10 = r5.A0t     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 157(0x9d, float:2.2E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.1cy r10 = r5.A0n     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 39
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r5 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x2544 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.1cy r10 = r5.A0o     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 40
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r5 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x2544 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.027 r10 = r5.A0P     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 162(0xa2, float:2.27E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.1cy r10 = r5.A0m     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 154(0x9a, float:2.16E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.1cy r10 = r5.A0p     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 42
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r5 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x2544 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.1cy r10 = r5.A0q     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 44
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r5 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x2544 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            X.02z r7 = new X.02z     // Catch:{ all -> 0x2544 }
            r7.<init>(r5)     // Catch:{ all -> 0x2544 }
            java.lang.Class<com.obwhatsapp.payments.model.BipProcessActionViewModel> r5 = com.obwhatsapp.payments.model.BipProcessActionViewModel.class
            X.01n r5 = r7.A01(r5)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.payments.model.BipProcessActionViewModel r5 = (com.obwhatsapp.payments.model.BipProcessActionViewModel) r5     // Catch:{ all -> 0x2544 }
            r0.A3M = r5     // Catch:{ all -> 0x2544 }
            X.027 r10 = r5.A01     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 171(0xab, float:2.4E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r10.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1yV r10 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r10 = (com.obwhatsapp.Conversation) r10     // Catch:{ all -> 0x2544 }
            X.2Yj r8 = r0.A0j     // Catch:{ all -> 0x2544 }
            X.0rv r7 = r0.A33     // Catch:{ all -> 0x2544 }
            r22 = 2
            com.facebook.redex.IDxFactoryShape55S0200000_2_I0 r5 = new com.facebook.redex.IDxFactoryShape55S0200000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>(r7, r9, r8)     // Catch:{ all -> 0x2544 }
            X.02z r7 = new X.02z     // Catch:{ all -> 0x2544 }
            r7.<init>((X.AnonymousClass04o) r5, (X.C001500q) r10)     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.2Yl> r5 = X.C50222Yl.class
            X.01n r5 = r7.A01(r5)     // Catch:{ all -> 0x2544 }
            X.2Yl r5 = (X.C50222Yl) r5     // Catch:{ all -> 0x2544 }
            X.1cy r9 = r5.A04     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 158(0x9e, float:2.21E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r9.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1yV r13 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r13 = (com.obwhatsapp.Conversation) r13     // Catch:{ all -> 0x2544 }
            X.2aW r12 = r0.A0k     // Catch:{ all -> 0x2544 }
            X.0rv r11 = r0.A33     // Catch:{ all -> 0x2544 }
            X.1wN r10 = r0.A2D     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel r9 = r0.A2M     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r8 = r0.A3t     // Catch:{ all -> 0x2544 }
            X.0sH r7 = r0.A2l     // Catch:{ all -> 0x2544 }
            X.3Di r5 = new X.3Di     // Catch:{ all -> 0x2544 }
            r31 = r5
            r32 = r12
            r33 = r10
            r34 = r9
            r35 = r7
            r36 = r11
            r37 = r8
            r31.<init>(r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x2544 }
            X.02z r7 = new X.02z     // Catch:{ all -> 0x2544 }
            r7.<init>((X.AnonymousClass04o) r5, (X.C001500q) r13)     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.2VT> r5 = X.AnonymousClass2VT.class
            X.01n r5 = r7.A01(r5)     // Catch:{ all -> 0x2544 }
            X.2VT r5 = (X.AnonymousClass2VT) r5     // Catch:{ all -> 0x2544 }
            r0.A2A = r5     // Catch:{ all -> 0x2544 }
            X.1cy r9 = r5.A0U     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 165(0xa5, float:2.31E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r9.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.2VT r5 = r0.A2A     // Catch:{ all -> 0x2544 }
            X.027 r9 = r5.A02     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 38
            com.facebook.redex.IDxObserverShape113S0100000_1_I0 r5 = new com.facebook.redex.IDxObserverShape113S0100000_1_I0     // Catch:{ all -> 0x2544 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x2544 }
            r9.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.2VT r5 = r0.A2A     // Catch:{ all -> 0x2544 }
            X.1cy r9 = r5.A0V     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 167(0xa7, float:2.34E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r9.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.2VT r5 = r0.A2A     // Catch:{ all -> 0x2544 }
            X.1cy r9 = r5.A0T     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 166(0xa6, float:2.33E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r9.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1yV r9 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r9 = (com.obwhatsapp.Conversation) r9     // Catch:{ all -> 0x2544 }
            X.2aF r8 = r0.A0f     // Catch:{ all -> 0x2544 }
            X.0sH r7 = r0.A2l     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxFactoryShape54S0200000_1_I0 r5 = new com.facebook.redex.IDxFactoryShape54S0200000_1_I0     // Catch:{ all -> 0x2544 }
            r5.<init>(r7, r6, r8)     // Catch:{ all -> 0x2544 }
            X.02z r7 = new X.02z     // Catch:{ all -> 0x2544 }
            r7.<init>((X.AnonymousClass04o) r5, (X.C001500q) r9)     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.2AM> r5 = X.AnonymousClass2AM.class
            X.01n r5 = r7.A01(r5)     // Catch:{ all -> 0x2544 }
            X.2AM r5 = (X.AnonymousClass2AM) r5     // Catch:{ all -> 0x2544 }
            X.1cy r9 = r5.A05     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            r7 = 163(0xa3, float:2.28E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r0, (int) r7)     // Catch:{ all -> 0x2544 }
            r9.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            X.02z r7 = new X.02z     // Catch:{ all -> 0x2544 }
            r7.<init>(r5)     // Catch:{ all -> 0x2544 }
            java.lang.Class<com.obwhatsapp.pnh.RequestPhoneNumberViewModel> r5 = com.obwhatsapp.pnh.RequestPhoneNumberViewModel.class
            X.01n r8 = r7.A01(r5)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.pnh.RequestPhoneNumberViewModel r8 = (com.obwhatsapp.pnh.RequestPhoneNumberViewModel) r8     // Catch:{ all -> 0x2544 }
            r0.A3V = r8     // Catch:{ all -> 0x2544 }
            X.2aA r7 = r0.A0e     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            X.2X0 r10 = r7.A00(r5, r8)     // Catch:{ all -> 0x2544 }
            r0.A3U = r10     // Catch:{ all -> 0x2544 }
            X.0sH r5 = r0.A2l     // Catch:{ all -> 0x2544 }
            X.0rv r7 = r5.A0E     // Catch:{ all -> 0x2544 }
            boolean r5 = r7 instanceof X.AnonymousClass1ZX     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x04b3
            X.1ZX r7 = (X.AnonymousClass1ZX) r7     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.pnh.RequestPhoneNumberViewModel r5 = r10.A05     // Catch:{ all -> 0x2544 }
            X.028 r9 = r5.A05(r7)     // Catch:{ all -> 0x2544 }
            X.0pL r8 = r10.A01     // Catch:{ all -> 0x2544 }
            r7 = 212(0xd4, float:2.97E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>((java.lang.Object) r10, (int) r7)     // Catch:{ all -> 0x2544 }
            r9.A0A(r8, r5)     // Catch:{ all -> 0x2544 }
        L_0x04b3:
            X.39M r7 = r0.A28     // Catch:{ all -> 0x2544 }
            X.0sH r5 = r0.A2l     // Catch:{ all -> 0x2544 }
            r7.A00(r5)     // Catch:{ all -> 0x2544 }
            X.39M r10 = r0.A28     // Catch:{ all -> 0x2544 }
            X.1yV r9 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r9 = (com.obwhatsapp.Conversation) r9     // Catch:{ all -> 0x2544 }
            X.0rv r8 = r0.A33     // Catch:{ all -> 0x2544 }
            boolean r5 = r10.A01()     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x04da
            X.2Kc r7 = r10.A08     // Catch:{ all -> 0x2544 }
            X.51V r5 = new X.51V     // Catch:{ all -> 0x2544 }
            r5.<init>(r9, r10, r8)     // Catch:{ all -> 0x2544 }
            X.1dR r7 = r7.A01     // Catch:{ all -> 0x2544 }
            X.0yX r8 = r7.A08     // Catch:{ all -> 0x2544 }
            X.1dS r7 = r7.A06     // Catch:{ all -> 0x2544 }
            int r7 = r7.A05     // Catch:{ all -> 0x2544 }
            r8.AKu(r5, r7)     // Catch:{ all -> 0x2544 }
        L_0x04da:
            boolean r5 = r1.A0W     // Catch:{ all -> 0x2544 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x2544 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x2544 }
            r0.A4Y = r5     // Catch:{ all -> 0x2544 }
            boolean r5 = r1.A0Y     // Catch:{ all -> 0x2544 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x2544 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x2544 }
            r0.A4Z = r5     // Catch:{ all -> 0x2544 }
            boolean r5 = r1.A0Q     // Catch:{ all -> 0x2544 }
            r0.A4V = r5     // Catch:{ all -> 0x2544 }
            X.1kZ r7 = r0.A2C     // Catch:{ all -> 0x2544 }
            boolean r5 = r1.A0P     // Catch:{ all -> 0x2544 }
            r7.A0H = r5     // Catch:{ all -> 0x2544 }
            X.1Hq r9 = r0.A2Y     // Catch:{ all -> 0x2544 }
            X.0pt r8 = r9.A02     // Catch:{ all -> 0x2544 }
            r7 = 33
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r5 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x2544 }
            r5.<init>(r9, r7)     // Catch:{ all -> 0x2544 }
            r8.Acq(r5)     // Catch:{ all -> 0x2544 }
            boolean r7 = r3.A09     // Catch:{ all -> 0x2544 }
            X.1Lz r5 = r0.A2X     // Catch:{ all -> 0x2544 }
            if (r7 != 0) goto L_0x051d
            X.1Ly r5 = r5.A00     // Catch:{ all -> 0x2544 }
            X.0pd r7 = r5.A00     // Catch:{ all -> 0x2544 }
            r5 = 976(0x3d0, float:1.368E-42)
            r8 = r23
            boolean r7 = r7.A0E(r8, r5)     // Catch:{ all -> 0x2544 }
            r5 = 0
            if (r7 == 0) goto L_0x051e
        L_0x051d:
            r5 = 1
        L_0x051e:
            java.lang.String r9 = "ctwa"
            r10 = 0
            if (r5 == 0) goto L_0x0560
            X.1Lz r5 = r0.A2X     // Catch:{ all -> 0x2544 }
            X.135 r7 = r5.A01     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = "20210210"
            int r5 = r7.A00(r5)     // Catch:{ all -> 0x2544 }
            if (r5 == r6) goto L_0x0560
            java.lang.String r8 = r1.A0F     // Catch:{ all -> 0x2544 }
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x2544 }
            if (r5 != 0) goto L_0x0546
            boolean r5 = r8.contains(r9)     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x0546
            X.0wJ r9 = r0.A2V     // Catch:{ all -> 0x2544 }
            X.0rv r7 = r0.A33     // Catch:{ all -> 0x2544 }
            r5 = 10
            r9.A01(r7, r5)     // Catch:{ all -> 0x2544 }
        L_0x0546:
            r0.A4Q = r10     // Catch:{ all -> 0x2544 }
            r0.A4R = r10     // Catch:{ all -> 0x2544 }
            X.0rv r5 = r0.A33     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.UserJid r7 = com.whatsapp.jid.UserJid.of(r5)     // Catch:{ all -> 0x2544 }
            if (r7 == 0) goto L_0x057f
            X.1T1 r5 = r0.A2Q     // Catch:{ all -> 0x2544 }
            X.21V r7 = r5.A07(r7)     // Catch:{ all -> 0x2544 }
            if (r7 == 0) goto L_0x057f
            X.1T1 r5 = r0.A2Q     // Catch:{ all -> 0x2544 }
            r5.A02(r7)     // Catch:{ all -> 0x2544 }
            goto L_0x057f
        L_0x0560:
            java.lang.String r8 = r1.A0F     // Catch:{ all -> 0x2544 }
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x2544 }
            if (r5 != 0) goto L_0x0577
            boolean r5 = r8.contains(r9)     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x0577
            X.0wJ r9 = r0.A2V     // Catch:{ all -> 0x2544 }
            X.0rv r7 = r0.A33     // Catch:{ all -> 0x2544 }
            r5 = 9
            r9.A01(r7, r5)     // Catch:{ all -> 0x2544 }
        L_0x0577:
            java.lang.String r5 = r3.A03     // Catch:{ all -> 0x2544 }
            r0.A4Q = r5     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = r3.A06     // Catch:{ all -> 0x2544 }
            r0.A4R = r5     // Catch:{ all -> 0x2544 }
        L_0x057f:
            r0.A4T = r8     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = r1.A0E     // Catch:{ all -> 0x2544 }
            r0.A4S = r5     // Catch:{ all -> 0x2544 }
            X.4MA r11 = r0.A21     // Catch:{ all -> 0x2544 }
            X.0rv r9 = r0.A33     // Catch:{ all -> 0x2544 }
            X.3BB r7 = r0.A2R     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = r7.A03     // Catch:{ all -> 0x2544 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x2544 }
            if (r5 != 0) goto L_0x05d2
            java.lang.String r5 = r7.A06     // Catch:{ all -> 0x2544 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x2544 }
            if (r5 != 0) goto L_0x05d2
            X.0rt r5 = r11.A02     // Catch:{ all -> 0x2544 }
            boolean r5 = r5.A0F(r9)     // Catch:{ all -> 0x2544 }
            if (r5 != 0) goto L_0x05d2
            X.0pd r8 = r11.A03     // Catch:{ all -> 0x2544 }
            r7 = 2666(0xa6a, float:3.736E-42)
            r5 = r23
            boolean r5 = r8.A0E(r5, r7)     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x05d2
            X.0sG r5 = r11.A00     // Catch:{ all -> 0x2544 }
            X.0sH r5 = r5.A0A(r9)     // Catch:{ all -> 0x2544 }
            X.0xS r8 = r11.A01     // Catch:{ all -> 0x2544 }
            java.lang.String r35 = r5.A09()     // Catch:{ all -> 0x2544 }
            X.126 r7 = r8.A07     // Catch:{ all -> 0x2544 }
            com.facebook.redex.RunnableRunnableShape0S1310000_I0 r5 = new com.facebook.redex.RunnableRunnableShape0S1310000_I0     // Catch:{ all -> 0x2544 }
            r36 = 2
            r37 = 1
            r31 = r5
            r32 = r8
            r33 = r9
            r34 = r10
            r31.<init>(r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x2544 }
            r8 = 6
            r7.A01(r5, r8)     // Catch:{ all -> 0x2544 }
        L_0x05d2:
            X.2aV r7 = r0.A0i     // Catch:{ all -> 0x2544 }
            X.1wN r5 = r0.A2D     // Catch:{ all -> 0x2544 }
            r17 = r5
            X.1Ma r5 = r0.A2W     // Catch:{ all -> 0x2544 }
            r15 = r5
            X.2Yk r7 = r7.A00     // Catch:{ all -> 0x2544 }
            X.2Rg r5 = r7.A01     // Catch:{ all -> 0x2544 }
            android.app.Activity r14 = r5.A1p     // Catch:{ all -> 0x2544 }
            X.0sX r7 = r7.A03     // Catch:{ all -> 0x2544 }
            X.01J r8 = r7.AB3     // Catch:{ all -> 0x2544 }
            java.lang.Object r13 = r8.get()     // Catch:{ all -> 0x2544 }
            X.0pt r13 = (X.C14870pt) r13     // Catch:{ all -> 0x2544 }
            X.01J r8 = r7.AN9     // Catch:{ all -> 0x2544 }
            java.lang.Object r12 = r8.get()     // Catch:{ all -> 0x2544 }
            X.0ua r12 = (X.C17130ua) r12     // Catch:{ all -> 0x2544 }
            X.01J r8 = r7.ABt     // Catch:{ all -> 0x2544 }
            java.lang.Object r11 = r8.get()     // Catch:{ all -> 0x2544 }
            X.1Lf r11 = (X.C25811Lf) r11     // Catch:{ all -> 0x2544 }
            X.01J r8 = r7.ABs     // Catch:{ all -> 0x2544 }
            java.lang.Object r10 = r8.get()     // Catch:{ all -> 0x2544 }
            X.1MU r10 = (X.AnonymousClass1MU) r10     // Catch:{ all -> 0x2544 }
            X.01J r8 = r7.A4I     // Catch:{ all -> 0x2544 }
            java.lang.Object r9 = r8.get()     // Catch:{ all -> 0x2544 }
            X.0uk r9 = (X.C17230uk) r9     // Catch:{ all -> 0x2544 }
            X.0sX r5 = r5.A1s     // Catch:{ all -> 0x2544 }
            X.01J r5 = r5.A05     // Catch:{ all -> 0x2544 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0pd r5 = (X.C14710pd) r5     // Catch:{ all -> 0x2544 }
            X.2ZO r8 = new X.2ZO     // Catch:{ all -> 0x2544 }
            r8.<init>(r5)     // Catch:{ all -> 0x2544 }
            X.01J r5 = r7.AC0     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r5.get()     // Catch:{ all -> 0x2544 }
            X.1Ai r7 = (X.C23061Ai) r7     // Catch:{ all -> 0x2544 }
            X.39b r5 = new X.39b     // Catch:{ all -> 0x2544 }
            r31 = r5
            r32 = r14
            r33 = r13
            r34 = r12
            r35 = r9
            r36 = r8
            r37 = r17
            r38 = r3
            r39 = r10
            r40 = r11
            r41 = r15
            r42 = r7
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x2544 }
            r0.A2S = r5     // Catch:{ all -> 0x2544 }
            X.1Hr r5 = r0.A2N     // Catch:{ all -> 0x2544 }
            X.0pd r7 = r5.A00     // Catch:{ all -> 0x2544 }
            r5 = 823(0x337, float:1.153E-42)
            r8 = r23
            boolean r5 = r7.A0E(r8, r5)     // Catch:{ all -> 0x2544 }
            if (r5 != 0) goto L_0x0667
            X.0rv r5 = r0.A33     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.UserJid r9 = com.whatsapp.jid.UserJid.of(r5)     // Catch:{ all -> 0x2544 }
            if (r9 == 0) goto L_0x0667
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pP r5 = (X.C14570pP) r5     // Catch:{ all -> 0x2544 }
            X.0sq r8 = r5.A05     // Catch:{ all -> 0x2544 }
            r7 = 24
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r5 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3     // Catch:{ all -> 0x2544 }
            r5.<init>(r0, r7, r9)     // Catch:{ all -> 0x2544 }
            r8.Acl(r5)     // Catch:{ all -> 0x2544 }
        L_0x0667:
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            X.0pd r7 = r5.A0C     // Catch:{ all -> 0x2544 }
            r5 = 508(0x1fc, float:7.12E-43)
            r8 = r23
            boolean r5 = r7.A0E(r8, r5)     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x0693
            java.lang.String r5 = r0.A4T     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x0693
            X.0rv r5 = r0.A33     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.UserJid r9 = com.whatsapp.jid.UserJid.of(r5)     // Catch:{ all -> 0x2544 }
            if (r9 == 0) goto L_0x0693
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pP r5 = (X.C14570pP) r5     // Catch:{ all -> 0x2544 }
            X.0sq r8 = r5.A05     // Catch:{ all -> 0x2544 }
            r7 = 25
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r5 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3     // Catch:{ all -> 0x2544 }
            r5.<init>(r0, r7, r9)     // Catch:{ all -> 0x2544 }
            r8.Acl(r5)     // Catch:{ all -> 0x2544 }
        L_0x0693:
            X.0sH r5 = r0.A2l     // Catch:{ all -> 0x2544 }
            boolean r5 = r5.A0J()     // Catch:{ all -> 0x2544 }
            r0.A4b = r5     // Catch:{ all -> 0x2544 }
            X.0sH r5 = r0.A2l     // Catch:{ all -> 0x2544 }
            X.0rv r5 = r5.A0E     // Catch:{ all -> 0x2544 }
            boolean r5 = X.C16030sJ.A0G(r5)     // Catch:{ all -> 0x2544 }
            r0.A4c = r5     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.17R r5 = r5.A0a     // Catch:{ all -> 0x2544 }
            r7 = r18
            r5.A00(r7)     // Catch:{ all -> 0x2544 }
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.1yV r7 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r7 = (com.obwhatsapp.Conversation) r7     // Catch:{ all -> 0x2544 }
            java.lang.String r8 = r7.getLocalClassName()     // Catch:{ all -> 0x2544 }
            X.11K r7 = r5.A0b     // Catch:{ all -> 0x2544 }
            X.0rv r5 = r5.A0h     // Catch:{ all -> 0x2544 }
            r7.A02(r5, r8)     // Catch:{ all -> 0x2544 }
            X.0rv r8 = r0.A33     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.UserJid r9 = com.whatsapp.jid.UserJid.of(r8)     // Catch:{ all -> 0x2544 }
            X.0rt r7 = r0.A2c     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r5 = (X.AnonymousClass1yR) r5     // Catch:{ all -> 0x2544 }
            X.2DF r5 = r5.A00     // Catch:{ all -> 0x2544 }
            X.0sG r5 = r5.A07     // Catch:{ all -> 0x2544 }
            int r5 = X.C40491uD.A00(r5, r7, r8)     // Catch:{ all -> 0x2544 }
            if (r5 <= 0) goto L_0x06ee
            if (r9 == 0) goto L_0x06ee
            X.0zl r8 = r0.A2t     // Catch:{ all -> 0x2544 }
            X.0uP r7 = r0.A1c     // Catch:{ all -> 0x2544 }
            X.2a9 r5 = r0.A1t     // Catch:{ all -> 0x2544 }
            boolean r5 = X.AnonymousClass2BX.A02(r7, r5, r8, r9)     // Catch:{ all -> 0x2544 }
            if (r5 != 0) goto L_0x06ee
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r5 = (X.AnonymousClass1yR) r5     // Catch:{ all -> 0x2544 }
            X.2DF r5 = r5.A00     // Catch:{ all -> 0x2544 }
            X.0tb r5 = r5.A03     // Catch:{ all -> 0x2544 }
            r5.A0K(r9, r2)     // Catch:{ all -> 0x2544 }
        L_0x06ee:
            r0.A4d = r6     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r5.AKw(r4)     // Catch:{ all -> 0x2544 }
            X.1yV r7 = r0.A22     // Catch:{ all -> 0x2544 }
            r5 = 2131558734(0x7f0d014e, float:1.8742792E38)
            int r5 = com.obwhatsapp.yo.yo.ConvoStyle()     // Catch:{ all -> 0x2544 }
            r7.setContentView(r5)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r7 = (com.obwhatsapp.Conversation) r7     // Catch:{ all -> 0x2544 }
            com.mod.bomfab.bomb.AutoText.fabBomb(r7)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.yo.ConvoTra.A00(r7)     // Catch:{ all -> 0x2544 }
            r0.AQC()     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r5.AKv(r4)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 2131366673(0x7f0a1311, float:1.8353246E38)
            android.view.View r5 = X.AnonymousClass00T.A05(r5, r4)     // Catch:{ all -> 0x2544 }
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5     // Catch:{ all -> 0x2544 }
            r5.A07()     // Catch:{ all -> 0x2544 }
            boolean r4 = X.C15450qv.A03()     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x072a
            r5.setTouchscreenBlocksFocus(r2)     // Catch:{ all -> 0x2544 }
        L_0x072a:
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r4.Aem(r5)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            X.02i r4 = r4.AGK()     // Catch:{ all -> 0x2544 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x2544 }
            r4.A0N(r2)     // Catch:{ all -> 0x2544 }
            r4.A0Q(r2)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131362968(0x7f0a0498, float:1.8345732E38)
            android.view.View r7 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.KeyboardPopupLayout r7 = (com.obwhatsapp.KeyboardPopupLayout) r7     // Catch:{ all -> 0x2544 }
            r0.A0z = r7     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 2131100149(0x7f0601f5, float:1.7812671E38)
            int r4 = X.AnonymousClass00T.A00(r5, r4)     // Catch:{ all -> 0x2544 }
            r7.setKeyboardPopupBackgroundColor(r4)     // Catch:{ all -> 0x2544 }
            X.01D r4 = r0.A4K     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0xm r4 = (X.C19110xm) r4     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.2Zl> r9 = X.C50432Zl.class
            X.0vg r8 = r4.A00(r9)     // Catch:{ all -> 0x2544 }
            X.2Zl r8 = (X.C50432Zl) r8     // Catch:{ all -> 0x2544 }
            X.1yV r7 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r7 = (com.obwhatsapp.Conversation) r7     // Catch:{ all -> 0x2544 }
            X.0rv r5 = r0.A33     // Catch:{ all -> 0x2544 }
            X.2AN r4 = new X.2AN     // Catch:{ all -> 0x2544 }
            r4.<init>(r7)     // Catch:{ all -> 0x2544 }
            r4.A0A = r5     // Catch:{ all -> 0x2544 }
            r8.A00 = r4     // Catch:{ all -> 0x2544 }
            r0.A0D = r4     // Catch:{ all -> 0x2544 }
            X.01D r4 = r0.A4K     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0xm r4 = (X.C19110xm) r4     // Catch:{ all -> 0x2544 }
            X.0vg r4 = r4.A00(r9)     // Catch:{ all -> 0x2544 }
            X.2Zl r4 = (X.C50432Zl) r4     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxCListenerShape357S0100000_2_I0 r5 = new com.facebook.redex.IDxCListenerShape357S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r5.<init>(r0, r6)     // Catch:{ all -> 0x2544 }
            X.2AN r4 = r4.A00     // Catch:{ all -> 0x2544 }
            r4.A01 = r5     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131362972(0x7f0a049c, float:1.834574E38)
            android.view.View r5 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x07a3
            android.view.View r4 = r0.A0D     // Catch:{ all -> 0x2544 }
            r5.addView(r4, r2)     // Catch:{ all -> 0x2544 }
        L_0x07a3:
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131363361(0x7f0a0621, float:1.8346529E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            r0.A07 = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131365666(0x7f0a0f22, float:1.8351204E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.TextEmojiLabel r4 = (com.obwhatsapp.TextEmojiLabel) r4     // Catch:{ all -> 0x2544 }
            r0.A18 = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131365667(0x7f0a0f23, float:1.8351206E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch:{ all -> 0x2544 }
            r0.A0V = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131365668(0x7f0a0f24, float:1.8351208E38)
            android.view.View r8 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.widget.ImageView r8 = (android.widget.ImageView) r8     // Catch:{ all -> 0x2544 }
            r0.A0U = r8     // Catch:{ all -> 0x2544 }
            X.013 r7 = r0.A2L     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 2131231078(0x7f080166, float:1.8078227E38)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass00T.A04(r5, r4)     // Catch:{ all -> 0x2544 }
            X.25m r4 = new X.25m     // Catch:{ all -> 0x2544 }
            r4.<init>(r5, r7)     // Catch:{ all -> 0x2544 }
            r8.setImageDrawable(r4)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131365669(0x7f0a0f25, float:1.835121E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            r0.A0C = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131362842(0x7f0a041a, float:1.8345476E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.TextEmojiLabel r4 = (com.obwhatsapp.TextEmojiLabel) r4     // Catch:{ all -> 0x2544 }
            r0.A17 = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131363059(0x7f0a04f3, float:1.8345916E38)
            android.view.View r5 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            X.1j5 r4 = new X.1j5     // Catch:{ all -> 0x2544 }
            r4.<init>(r5)     // Catch:{ all -> 0x2544 }
            r0.A44 = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131362172(0x7f0a017c, float:1.8344117E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x2544 }
            r0.A0J = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131367110(0x7f0a14c6, float:1.8354133E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x2544 }
            r0.A0N = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131365616(0x7f0a0ef0, float:1.8351102E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x2544 }
            r0.A0K = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131365617(0x7f0a0ef1, float:1.8351104E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x2544 }
            r0.A0L = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131367000(0x7f0a1458, float:1.835391E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x2544 }
            r0.A0M = r4     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.KeyboardPopupLayout r5 = r0.A0z     // Catch:{ all -> 0x2544 }
            r4 = 2131362858(0x7f0a042a, float:1.8345508E38)
            X.C004601z.A0E(r5, r4)     // Catch:{ all -> 0x2544 }
            org.json.JSONObject r5 = r3.A08     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            X.4Vi r11 = new X.4Vi     // Catch:{ all -> 0x2544 }
            r11.<init>(r4, r5)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            X.0pd r7 = r4.A0C     // Catch:{ all -> 0x2544 }
            X.0u3 r5 = r0.A3W     // Catch:{ all -> 0x2544 }
            X.C18450wi.A0H(r7, r2)     // Catch:{ all -> 0x2544 }
            r4 = r22
            X.C18450wi.A0H(r5, r4)     // Catch:{ all -> 0x2544 }
            r4 = 2285(0x8ed, float:3.202E-42)
            r8 = r23
            boolean r4 = r7.A0E(r8, r4)     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x09f3
            org.json.JSONObject r10 = r11.A01     // Catch:{ all -> 0x2544 }
            if (r10 != 0) goto L_0x08a8
            java.lang.String r4 = "ctwa_trust_banner_file"
            android.content.SharedPreferences r7 = r5.A00(r4)     // Catch:{ all -> 0x2544 }
            X.C18450wi.A0B(r7)     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r11.A00     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = r4.getRawString()     // Catch:{ all -> 0x2544 }
            X.C18450wi.A0B(r4)     // Catch:{ all -> 0x2544 }
            int r4 = r4.hashCode()     // Catch:{ all -> 0x2544 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = "banner_payload_"
            java.lang.String r4 = X.C18450wi.A06(r4, r5)     // Catch:{ all -> 0x2544 }
            boolean r4 = r7.contains(r4)     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x09f3
        L_0x08a8:
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131362963(0x7f0a0493, float:1.8345721E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.view.ViewStub r4 = (android.view.ViewStub) r4     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x09f3
            r4.inflate()     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131366684(0x7f0a131c, float:1.8353268E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.ctwa.trustsignal.TopBannerView r4 = (com.obwhatsapp.ctwa.trustsignal.TopBannerView) r4     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x09f3
            com.obwhatsapp.ctwa.trustsignal.viewmodel.TopBannerViewModel r9 = r4.A00     // Catch:{ all -> 0x2544 }
            r9.A00 = r11     // Catch:{ all -> 0x2544 }
            java.lang.String r13 = "none"
            r9.A02 = r13     // Catch:{ all -> 0x2544 }
            r12 = 0
            r9.A01 = r12     // Catch:{ all -> 0x2544 }
            if (r10 != 0) goto L_0x08fb
            X.0rv r4 = r11.A00     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = r4.getRawString()     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x098f
            X.0qW r4 = r9.A08     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r4.getValue()     // Catch:{ all -> 0x2544 }
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7     // Catch:{ all -> 0x2544 }
            int r4 = r5.hashCode()     // Catch:{ all -> 0x2544 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = "banner_payload_"
            java.lang.String r4 = X.C18450wi.A06(r4, r5)     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = r7.getString(r4, r12)     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x098f
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x2544 }
            r10.<init>(r4)     // Catch:{ all -> 0x2544 }
        L_0x08fb:
            java.lang.String r4 = "biz_creation_date"
            r7 = -1
            long r4 = r10.optLong(r4, r7)     // Catch:{ all -> 0x2544 }
            int r14 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x0939
            java.lang.String r7 = "creation_date_only"
            r9.A02 = r7     // Catch:{ all -> 0x2544 }
            X.013 r7 = r9.A04     // Catch:{ all -> 0x2544 }
            r8 = 177(0xb1, float:2.48E-43)
            java.lang.String r14 = r7.A08(r8)     // Catch:{ all -> 0x2544 }
            android.content.Context r7 = r7.A00     // Catch:{ all -> 0x2544 }
            java.util.Locale r8 = X.AnonymousClass013.A00(r7)     // Catch:{ all -> 0x2544 }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x2544 }
            r7.<init>(r14, r8)     // Catch:{ all -> 0x2544 }
            java.util.Date r8 = new java.util.Date     // Catch:{ all -> 0x2544 }
            r8.<init>(r4)     // Catch:{ all -> 0x2544 }
            java.lang.String r8 = r7.format(r8)     // Catch:{ all -> 0x2544 }
            X.C18450wi.A0B(r8)     // Catch:{ all -> 0x2544 }
            android.app.Application r7 = r9.A00     // Catch:{ all -> 0x2544 }
            r5 = 2131886450(0x7f120172, float:1.940748E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x2544 }
            r4[r2] = r8     // Catch:{ all -> 0x2544 }
            java.lang.String r15 = r7.getString(r5, r4)     // Catch:{ all -> 0x2544 }
            if (r15 != 0) goto L_0x0953
        L_0x0939:
            java.lang.String r4 = "biz_location"
            java.lang.String r15 = X.C812147h.A00(r4, r10)     // Catch:{ all -> 0x2544 }
            if (r15 != 0) goto L_0x096b
            java.lang.String r4 = "biz_category"
            java.lang.String r15 = X.C812147h.A00(r4, r10)     // Catch:{ all -> 0x2544 }
            if (r15 == 0) goto L_0x0969
            int r4 = r15.length()     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0969
            java.lang.String r4 = "category_only"
        L_0x0951:
            r9.A02 = r4     // Catch:{ all -> 0x2544 }
        L_0x0953:
            java.lang.String r4 = "fb_follower_count"
            java.lang.String r14 = X.C812147h.A00(r4, r10)     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = "ig_follower_count"
            java.lang.String r8 = X.C812147h.A00(r4, r10)     // Catch:{ all -> 0x2544 }
            r7 = 1
            if (r14 == 0) goto L_0x096e
            int r4 = r14.length()     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x0977
            goto L_0x096e
        L_0x0969:
            r15 = 0
            goto L_0x0953
        L_0x096b:
            java.lang.String r4 = "location_only"
            goto L_0x0951
        L_0x096e:
            if (r8 == 0) goto L_0x0979
            int r4 = r8.length()     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x0977
            goto L_0x0979
        L_0x0977:
            r5 = 1
            goto L_0x097a
        L_0x0979:
            r5 = 0
        L_0x097a:
            if (r15 == 0) goto L_0x0982
            int r4 = r15.length()     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x0986
        L_0x0982:
            if (r5 != 0) goto L_0x0986
            r7 = 0
            goto L_0x09e9
        L_0x0986:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x2544 }
            r9.A01 = r4     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x09a0
            goto L_0x0995
        L_0x098f:
            X.4WL r4 = new X.4WL     // Catch:{ all -> 0x2544 }
            r4.<init>(r12, r12, r12, r2)     // Catch:{ all -> 0x2544 }
            goto L_0x09ee
        L_0x0995:
            java.lang.String r4 = r9.A02     // Catch:{ all -> 0x2544 }
            int r5 = r4.hashCode()     // Catch:{ all -> 0x2544 }
            switch(r5) {
                case -1796750858: goto L_0x0b37;
                case 3387192: goto L_0x0b43;
                case 263267389: goto L_0x0b4d;
                case 338725453: goto L_0x0b59;
                default: goto L_0x099e;
            }     // Catch:{ all -> 0x2544 }
        L_0x099e:
            r9.A02 = r4     // Catch:{ all -> 0x2544 }
        L_0x09a0:
            X.0zS r4 = r9.A06     // Catch:{ all -> 0x2544 }
            r17 = r4
            X.4Vi r4 = r9.A00     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x09aa
            X.0rv r12 = r4.A00     // Catch:{ all -> 0x2544 }
        L_0x09aa:
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.of(r12)     // Catch:{ all -> 0x2544 }
            java.lang.String r13 = r9.A02     // Catch:{ all -> 0x2544 }
            X.C18450wi.A0H(r13, r6)     // Catch:{ all -> 0x2544 }
            r4 = 18
            r12 = r17
            r12.A01(r5, r13, r4)     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r11.A00     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = r4.getRawString()     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x09e6
            X.0qW r4 = r9.A08     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x2544 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ all -> 0x2544 }
            android.content.SharedPreferences$Editor r11 = r4.edit()     // Catch:{ all -> 0x2544 }
            int r4 = r5.hashCode()     // Catch:{ all -> 0x2544 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = "banner_payload_"
            java.lang.String r4 = X.C18450wi.A06(r4, r5)     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x2544 }
            r11.putString(r4, r5)     // Catch:{ all -> 0x2544 }
            r11.commit()     // Catch:{ all -> 0x2544 }
        L_0x09e6:
            r9.A05()     // Catch:{ all -> 0x2544 }
        L_0x09e9:
            X.4WL r4 = new X.4WL     // Catch:{ all -> 0x2544 }
            r4.<init>(r15, r14, r8, r7)     // Catch:{ all -> 0x2544 }
        L_0x09ee:
            X.027 r5 = r9.A03     // Catch:{ all -> 0x2544 }
            r5.A09(r4)     // Catch:{ all -> 0x2544 }
        L_0x09f3:
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 2131362954(0x7f0a048a, float:1.8345703E38)
            android.view.View r17 = X.AnonymousClass00T.A05(r5, r4)     // Catch:{ all -> 0x2544 }
            r4 = r17
            com.obwhatsapp.settings.chat.wallpaper.WallPaperView r4 = (com.obwhatsapp.settings.chat.wallpaper.WallPaperView) r4     // Catch:{ all -> 0x2544 }
            r17 = r4
            X.51o r4 = new X.51o     // Catch:{ all -> 0x2544 }
            r4.<init>(r0)     // Catch:{ all -> 0x2544 }
            r5 = r17
            r5.A01 = r4     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            android.widget.ListView r4 = r4.ADA()     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r4 = (com.obwhatsapp.conversation.ConversationListView) r4     // Catch:{ all -> 0x2544 }
            r0.A1n = r4     // Catch:{ all -> 0x2544 }
            r4.setDividerHeight(r2)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n     // Catch:{ all -> 0x2544 }
            android.view.ViewTreeObserver r5 = r4.getViewTreeObserver()     // Catch:{ all -> 0x2544 }
            android.view.ViewTreeObserver$OnPreDrawListener r4 = r0.A4v     // Catch:{ all -> 0x2544 }
            r5.addOnPreDrawListener(r4)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r7 = r0.A1n     // Catch:{ all -> 0x2544 }
            boolean r4 = r0.A4g     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0a35
            r5 = 12
            com.facebook.redex.IDxDCompatShape22S0100000_2_I0 r4 = new com.facebook.redex.IDxDCompatShape22S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r4.<init>(r0, r5)     // Catch:{ all -> 0x2544 }
            X.C004601z.A0j(r7, r4)     // Catch:{ all -> 0x2544 }
        L_0x0a35:
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pP r4 = (X.C14570pP) r4     // Catch:{ all -> 0x2544 }
            X.10F r8 = r4.A02     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r7 = r0.A1n     // Catch:{ all -> 0x2544 }
            r5 = 39
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r4 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6     // Catch:{ all -> 0x2544 }
            r4.<init>(r0, r5)     // Catch:{ all -> 0x2544 }
            r5 = r16
            r9 = r22
            r8.A04(r7, r4, r5, r9)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131366071(0x7f0a10b7, float:1.8352025E38)
            android.view.View r4 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4     // Catch:{ all -> 0x2544 }
            r0.A0S = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131363293(0x7f0a05dd, float:1.834639E38)
            android.view.View r16 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            r4 = r16
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4     // Catch:{ all -> 0x2544 }
            r16 = r4
            r9 = 2131232064(0x7f080540, float:1.8080227E38)
            android.widget.ImageButton r8 = r0.A0S     // Catch:{ all -> 0x2544 }
            X.013 r7 = r0.A2L     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            android.graphics.drawable.Drawable r5 = X.AnonymousClass00T.A04(r4, r9)     // Catch:{ all -> 0x2544 }
            X.25m r4 = new X.25m     // Catch:{ all -> 0x2544 }
            r4.<init>(r5, r7)     // Catch:{ all -> 0x2544 }
            r8.setImageDrawable(r4)     // Catch:{ all -> 0x2544 }
            X.013 r5 = r0.A2L     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            android.graphics.drawable.Drawable r7 = X.AnonymousClass00T.A04(r4, r9)     // Catch:{ all -> 0x2544 }
            X.25m r4 = new X.25m     // Catch:{ all -> 0x2544 }
            r4.<init>(r7, r5)     // Catch:{ all -> 0x2544 }
            r5 = r16
            r5.setImageDrawable(r4)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 2131364133(0x7f0a0925, float:1.8348094E38)
            android.view.View r5 = X.AnonymousClass00T.A05(r5, r4)     // Catch:{ all -> 0x2544 }
            r0.A08 = r5     // Catch:{ all -> 0x2544 }
            r4 = 2131231387(0x7f08029b, float:1.8078854E38)
            android.view.View r4 = r0.A08     // Catch:{ all -> 0x2544 }
            r4.setPadding(r2, r2, r2, r2)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 2131366596(0x7f0a12c4, float:1.835309E38)
            android.view.View r8 = X.AnonymousClass00T.A05(r5, r4)     // Catch:{ all -> 0x2544 }
            int r5 = r8.getPaddingLeft()     // Catch:{ all -> 0x2544 }
            int r4 = r8.getPaddingRight()     // Catch:{ all -> 0x2544 }
            int r7 = java.lang.Math.max(r5, r4)     // Catch:{ all -> 0x2544 }
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()     // Catch:{ all -> 0x2544 }
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5     // Catch:{ all -> 0x2544 }
            X.013 r4 = r0.A2L     // Catch:{ all -> 0x2544 }
            boolean r4 = r4.A0T()     // Catch:{ all -> 0x2544 }
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0b34
            r5.rightMargin = r7     // Catch:{ all -> 0x2544 }
        L_0x0ad0:
            r8.setLayoutParams(r5)     // Catch:{ all -> 0x2544 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x2544 }
            r4 = 21
            if (r5 < r4) goto L_0x0ae3
            X.3N8 r5 = new X.3N8     // Catch:{ all -> 0x2544 }
            r5.<init>(r0)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r4 = r0.A0S     // Catch:{ all -> 0x2544 }
            r4.setOutlineProvider(r5)     // Catch:{ all -> 0x2544 }
        L_0x0ae3:
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 2131364130(0x7f0a0922, float:1.8348088E38)
            android.view.View r4 = X.AnonymousClass00T.A05(r5, r4)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4     // Catch:{ all -> 0x2544 }
            r0.A0R = r4     // Catch:{ all -> 0x2544 }
            r4.setVisibility(r2)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r7 = r0.A0R     // Catch:{ all -> 0x2544 }
            r5 = 32
            com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1 r4 = new com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1     // Catch:{ all -> 0x2544 }
            r4.<init>(r0, r5)     // Catch:{ all -> 0x2544 }
            r7.setOnClickListener(r4)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 2131366995(0x7f0a1453, float:1.83539E38)
            android.view.View r7 = X.AnonymousClass00T.A05(r5, r4)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r7 = (android.widget.ImageButton) r7     // Catch:{ all -> 0x2544 }
            r0.A0T = r7     // Catch:{ all -> 0x2544 }
            r5 = 6
            com.facebook.redex.IDxTListenerShape167S0100000_2_I0 r4 = new com.facebook.redex.IDxTListenerShape167S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r4.<init>(r0, r5)     // Catch:{ all -> 0x2544 }
            r7.setOnTouchListener(r4)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r7 = r0.A0T     // Catch:{ all -> 0x2544 }
            r5 = 11
            com.facebook.redex.IDxDCompatShape22S0100000_2_I0 r4 = new com.facebook.redex.IDxDCompatShape22S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r4.<init>(r0, r5)     // Catch:{ all -> 0x2544 }
            X.C004601z.A0j(r7, r4)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pN r4 = (X.C14550pN) r4     // Catch:{ all -> 0x2544 }
            X.01V r5 = r4.A08     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = "android.hardware.type.featurephone"
            boolean r4 = r5.A0T(r4)     // Catch:{ all -> 0x2544 }
            r0.A4a = r4     // Catch:{ all -> 0x2544 }
            goto L_0x0b65
        L_0x0b34:
            r5.leftMargin = r7     // Catch:{ all -> 0x2544 }
            goto L_0x0ad0
        L_0x0b37:
            java.lang.String r5 = "location_only"
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x099e
            java.lang.String r4 = "location_and_follower"
            goto L_0x099e
        L_0x0b43:
            boolean r5 = r4.equals(r13)     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x099e
            java.lang.String r4 = "follower_only"
            goto L_0x099e
        L_0x0b4d:
            java.lang.String r5 = "creation_date_only"
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x099e
            java.lang.String r4 = "creation_date_and_follower"
            goto L_0x099e
        L_0x0b59:
            java.lang.String r5 = "category_only"
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x099e
            java.lang.String r4 = "category_and_follower"
            goto L_0x099e
        L_0x0b65:
            if (r4 == 0) goto L_0x0b73
            android.widget.ImageButton r5 = r0.A0T     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxKListenerShape254S0100000_2_I0 r4 = new com.facebook.redex.IDxKListenerShape254S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r7 = r22
            r4.<init>(r0, r7)     // Catch:{ all -> 0x2544 }
            r5.setOnKeyListener(r4)     // Catch:{ all -> 0x2544 }
        L_0x0b73:
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 2131362555(0x7f0a02fb, float:1.8344894E38)
            android.view.View r7 = X.AnonymousClass00T.A05(r5, r4)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r7 = (android.widget.ImageButton) r7     // Catch:{ all -> 0x2544 }
            r0.A0Q = r7     // Catch:{ all -> 0x2544 }
            r5 = 42
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r4 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2     // Catch:{ all -> 0x2544 }
            r4.<init>(r0, r5)     // Catch:{ all -> 0x2544 }
            r7.setOnClickListener(r4)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r5 = r0.A0Q     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxCListenerShape177S0100000_2_I0 r4 = new com.facebook.redex.IDxCListenerShape177S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r7 = r22
            r4.<init>(r0, r7)     // Catch:{ all -> 0x2544 }
            r5.setOnLongClickListener(r4)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131362254(0x7f0a01ce, float:1.8344283E38)
            android.view.View r20 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            r4 = r20
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x2544 }
            r20 = r4
            X.4E7 r13 = new X.4E7     // Catch:{ all -> 0x2544 }
            r13.<init>(r0)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r5 = r4
            X.0pP r5 = (X.C14570pP) r5     // Catch:{ all -> 0x2544 }
            X.0sq r5 = r5.A05     // Catch:{ all -> 0x2544 }
            r31 = r5
            X.14s r5 = r0.A3q     // Catch:{ all -> 0x2544 }
            r19 = r5
            X.0zl r5 = r0.A2t     // Catch:{ all -> 0x2544 }
            r15 = r5
            r5 = r4
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r34 = r5
            X.01Y r14 = r0.A1Q     // Catch:{ all -> 0x2544 }
            X.119 r12 = r0.A2k     // Catch:{ all -> 0x2544 }
            X.0uP r11 = r0.A1c     // Catch:{ all -> 0x2544 }
            r5 = r4
            X.0pN r5 = (X.C14550pN) r5     // Catch:{ all -> 0x2544 }
            X.0rz r10 = r5.A09     // Catch:{ all -> 0x2544 }
            X.0uk r9 = r0.A1W     // Catch:{ all -> 0x2544 }
            X.0yO r8 = r0.A2n     // Catch:{ all -> 0x2544 }
            X.1yR r4 = (X.AnonymousClass1yR) r4     // Catch:{ all -> 0x2544 }
            X.2DF r4 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0sO r7 = r4.A0O     // Catch:{ all -> 0x2544 }
            r4 = 49
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r5 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6     // Catch:{ all -> 0x2544 }
            r5.<init>(r13, r4)     // Catch:{ all -> 0x2544 }
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r4 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x2544 }
            r4.<init>(r13, r2)     // Catch:{ all -> 0x2544 }
            r43 = r34
            X.2jc r41 = new X.2jc     // Catch:{ all -> 0x2544 }
            r42 = r34
            r44 = r14
            r45 = r9
            r46 = r11
            r47 = r10
            r48 = r7
            r49 = r12
            r50 = r8
            r51 = r15
            r52 = r19
            r53 = r31
            r54 = r5
            r55 = r4
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x2544 }
            X.2aY r5 = r0.A0m     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            r48 = r4
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n     // Catch:{ all -> 0x2544 }
            r33 = r4
            X.2Yk r5 = r5.A00     // Catch:{ all -> 0x2544 }
            X.0sX r4 = r5.A03     // Catch:{ all -> 0x2544 }
            X.01J r7 = r4.A05     // Catch:{ all -> 0x2544 }
            java.lang.Object r19 = r7.get()     // Catch:{ all -> 0x2544 }
            r7 = r19
            X.0pd r7 = (X.C14710pd) r7     // Catch:{ all -> 0x2544 }
            r19 = r7
            X.01J r7 = r4.ADr     // Catch:{ all -> 0x2544 }
            java.lang.Object r14 = r7.get()     // Catch:{ all -> 0x2544 }
            X.0sK r14 = (X.C16040sK) r14     // Catch:{ all -> 0x2544 }
            X.01J r7 = r4.A43     // Catch:{ all -> 0x2544 }
            java.lang.Object r12 = r7.get()     // Catch:{ all -> 0x2544 }
            X.0rt r12 = (X.C15810rt) r12     // Catch:{ all -> 0x2544 }
            X.01J r7 = r4.ALm     // Catch:{ all -> 0x2544 }
            java.lang.Object r11 = r7.get()     // Catch:{ all -> 0x2544 }
            X.0s5 r11 = (X.C15900s5) r11     // Catch:{ all -> 0x2544 }
            X.01J r7 = r4.AMr     // Catch:{ all -> 0x2544 }
            java.lang.Object r10 = r7.get()     // Catch:{ all -> 0x2544 }
            X.14s r10 = (X.C216014s) r10     // Catch:{ all -> 0x2544 }
            X.2Rg r5 = r5.A01     // Catch:{ all -> 0x2544 }
            X.0zl r46 = r5.A0I()     // Catch:{ all -> 0x2544 }
            X.01J r5 = r4.A4x     // Catch:{ all -> 0x2544 }
            java.lang.Object r9 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0sG r9 = (X.C16000sG) r9     // Catch:{ all -> 0x2544 }
            X.01J r5 = r4.A1w     // Catch:{ all -> 0x2544 }
            java.lang.Object r8 = r5.get()     // Catch:{ all -> 0x2544 }
            X.01Y r8 = (X.AnonymousClass01Y) r8     // Catch:{ all -> 0x2544 }
            X.01J r5 = r4.ABK     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0ul r7 = (X.C17240ul) r7     // Catch:{ all -> 0x2544 }
            X.01J r5 = r4.APl     // Catch:{ all -> 0x2544 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x2544 }
            X.17m r5 = (X.C223217m) r5     // Catch:{ all -> 0x2544 }
            X.01J r4 = r4.A3B     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0th r4 = (X.C16820th) r4     // Catch:{ all -> 0x2544 }
            X.2VQ r15 = new X.2VQ     // Catch:{ all -> 0x2544 }
            r31 = r15
            r32 = r20
            r35 = r34
            r36 = r14
            r37 = r11
            r38 = r8
            r39 = r9
            r40 = r13
            r42 = r4
            r43 = r12
            r44 = r5
            r45 = r19
            r47 = r7
            r49 = r10
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x2544 }
            r0.A25 = r15     // Catch:{ all -> 0x2544 }
            X.46a r47 = new X.46a     // Catch:{ all -> 0x2544 }
            r47.<init>()     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r14 = r5
            com.obwhatsapp.Conversation r14 = (com.obwhatsapp.Conversation) r14     // Catch:{ all -> 0x2544 }
            r8 = r5
            X.0pL r8 = (X.C14530pL) r8     // Catch:{ all -> 0x2544 }
            X.0t3 r4 = r8.A05     // Catch:{ all -> 0x2544 }
            r48 = r4
            X.0pd r4 = r14.A0C     // Catch:{ all -> 0x2544 }
            r56 = r4
            X.0xQ r4 = r0.A19     // Catch:{ all -> 0x2544 }
            r38 = r4
            r7 = r5
            X.0pN r7 = (X.C14550pN) r7     // Catch:{ all -> 0x2544 }
            X.0pt r4 = r7.A05     // Catch:{ all -> 0x2544 }
            r36 = r4
            r4 = r5
            X.0pP r4 = (X.C14570pP) r4     // Catch:{ all -> 0x2544 }
            X.0sq r4 = r4.A05     // Catch:{ all -> 0x2544 }
            r66 = r4
            X.1yR r5 = (X.AnonymousClass1yR) r5     // Catch:{ all -> 0x2544 }
            X.2DF r4 = r5.A00     // Catch:{ all -> 0x2544 }
            X.0t9 r5 = r4.A0W     // Catch:{ all -> 0x2544 }
            r58 = r5
            X.0um r5 = r7.A0B     // Catch:{ all -> 0x2544 }
            r55 = r5
            X.0tb r5 = r4.A03     // Catch:{ all -> 0x2544 }
            r39 = r5
            X.0zl r5 = r0.A2t     // Catch:{ all -> 0x2544 }
            r57 = r5
            X.0zJ r5 = r8.A00     // Catch:{ all -> 0x2544 }
            r33 = r5
            X.0sG r5 = r4.A07     // Catch:{ all -> 0x2544 }
            r41 = r5
            X.0w2 r5 = r4.A0U     // Catch:{ all -> 0x2544 }
            r54 = r5
            X.0uj r5 = r4.A0q     // Catch:{ all -> 0x2544 }
            r64 = r5
            X.0sP r5 = r4.A09     // Catch:{ all -> 0x2544 }
            r42 = r5
            X.013 r5 = r0.A2L     // Catch:{ all -> 0x2544 }
            r50 = r5
            X.01Y r5 = r0.A1Q     // Catch:{ all -> 0x2544 }
            r40 = r5
            X.0yz r5 = r0.A2h     // Catch:{ all -> 0x2544 }
            r53 = r5
            X.0ul r5 = r4.A0Y     // Catch:{ all -> 0x2544 }
            r60 = r5
            X.1Lr r5 = r0.A1v     // Catch:{ all -> 0x2544 }
            r44 = r5
            X.15W r5 = r4.A0Z     // Catch:{ all -> 0x2544 }
            r61 = r5
            X.1Lt r5 = r0.A14     // Catch:{ all -> 0x2544 }
            r37 = r5
            X.0w3 r5 = r4.A0X     // Catch:{ all -> 0x2544 }
            r20 = r5
            X.0rz r5 = r7.A09     // Catch:{ all -> 0x2544 }
            r19 = r5
            X.1M1 r5 = r0.A1u     // Catch:{ all -> 0x2544 }
            r15 = r5
            X.1Kw r13 = r0.A3y     // Catch:{ all -> 0x2544 }
            X.0sO r12 = r4.A0O     // Catch:{ all -> 0x2544 }
            X.14t r11 = r0.A2d     // Catch:{ all -> 0x2544 }
            X.1L9 r10 = r4.A0e     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxDListenerShape340S0100000_2_I0 r9 = new com.facebook.redex.IDxDListenerShape340S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r9.<init>(r0, r6)     // Catch:{ all -> 0x2544 }
            X.4E3 r8 = new X.4E3     // Catch:{ all -> 0x2544 }
            r8.<init>(r4)     // Catch:{ all -> 0x2544 }
            X.2KT r7 = r0.A56     // Catch:{ all -> 0x2544 }
            X.0rv r5 = r0.A33     // Catch:{ all -> 0x2544 }
            X.2KS r4 = new X.2KS     // Catch:{ all -> 0x2544 }
            r35 = r14
            r31 = r4
            r32 = r14
            r34 = r9
            r43 = r15
            r45 = r8
            r46 = r7
            r49 = r19
            r51 = r11
            r52 = r12
            r59 = r20
            r62 = r5
            r63 = r10
            r65 = r13
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ all -> 0x2544 }
            r0.A23 = r4     // Catch:{ all -> 0x2544 }
            java.util.Set r5 = r0.A5G     // Catch:{ all -> 0x2544 }
            r113 = r5
            r5.add(r4)     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = r1.A0D     // Catch:{ all -> 0x2544 }
            r15 = r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x0d56
            java.lang.String r4 = r3.A07     // Catch:{ all -> 0x2544 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x0d56
            goto L_0x0d67
        L_0x0d56:
            java.util.HashMap r7 = A5M     // Catch:{ all -> 0x2544 }
            X.0sH r5 = r0.A2l     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.0rv> r4 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r5.A08(r4)     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r7.get(r4)     // Catch:{ all -> 0x2544 }
            r7 = 0
            if (r4 == 0) goto L_0x0d68
        L_0x0d67:
            r7 = 1
        L_0x0d68:
            X.0zS r5 = r0.A2U     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r4)     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0d78
            X.4bp r4 = r5.A00(r4)     // Catch:{ all -> 0x2544 }
            r4.A01 = r7     // Catch:{ all -> 0x2544 }
        L_0x0d78:
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r5 = r21
            r4.AKw(r5)     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = "conversation/createconversation"
            X.1Zf r20 = new X.1Zf     // Catch:{ all -> 0x2544 }
            r5 = r20
            r5.<init>((java.lang.String) r4)     // Catch:{ all -> 0x2544 }
            r0.A0M()     // Catch:{ all -> 0x2544 }
            X.1yV r14 = r0.A22     // Catch:{ all -> 0x2544 }
            r13 = r14
            com.obwhatsapp.Conversation r13 = (com.obwhatsapp.Conversation) r13     // Catch:{ all -> 0x2544 }
            X.0rv r12 = r0.A33     // Catch:{ all -> 0x2544 }
            r4 = r14
            X.1yR r4 = (X.AnonymousClass1yR) r4     // Catch:{ all -> 0x2544 }
            X.2DF r4 = r4.A00     // Catch:{ all -> 0x2544 }
            X.1ba r11 = r4.A0F     // Catch:{ all -> 0x2544 }
            r5 = r14
            X.0pL r5 = (X.C14530pL) r5     // Catch:{ all -> 0x2544 }
            X.0t3 r10 = r5.A05     // Catch:{ all -> 0x2544 }
            X.0pd r9 = r13.A0C     // Catch:{ all -> 0x2544 }
            r5 = r14
            X.0pN r5 = (X.C14550pN) r5     // Catch:{ all -> 0x2544 }
            X.0so r8 = r5.A03     // Catch:{ all -> 0x2544 }
            X.17g r7 = r0.A3a     // Catch:{ all -> 0x2544 }
            X.0t6 r5 = r4.A0N     // Catch:{ all -> 0x2544 }
            X.17h r4 = r0.A39     // Catch:{ all -> 0x2544 }
            X.2Qa r19 = new X.2Qa     // Catch:{ all -> 0x2544 }
            r31 = r19
            r32 = r13
            r33 = r8
            r34 = r11
            r35 = r14
            r36 = r10
            r37 = r5
            r38 = r9
            r39 = r12
            r40 = r4
            r41 = r7
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x2544 }
            android.database.DataSetObserver r4 = r0.A4n     // Catch:{ all -> 0x2544 }
            r5 = r19
            r5.registerDataSetObserver(r4)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131363497(0x7f0a06a9, float:1.8346804E38)
            android.view.View r7 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r7 = (com.obwhatsapp.mentions.MentionableEntry) r7     // Catch:{ all -> 0x2544 }
            r0.A37 = r7     // Catch:{ all -> 0x2544 }
            X.4ag r5 = new X.4ag     // Catch:{ all -> 0x2544 }
            r5.<init>()     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxCListenerShape93S0200000_1_I0 r4 = new com.facebook.redex.IDxCListenerShape93S0200000_1_I0     // Catch:{ all -> 0x2544 }
            r4.<init>(r5, r2, r0)     // Catch:{ all -> 0x2544 }
            r7.A0D = r4     // Catch:{ all -> 0x2544 }
            r4 = 2131231387(0x7f08029b, float:1.8078854E38)
            r0.A0R(r4)     // Catch:{ all -> 0x2544 }
            boolean r4 = r0.A4b     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0e25
            X.0rt r5 = r0.A2c     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            X.0sL r4 = X.C16050sL.A03(r4)     // Catch:{ all -> 0x2544 }
            int r5 = r5.A03(r4)     // Catch:{ all -> 0x2544 }
            r4 = 3
            if (r5 == r4) goto L_0x0e25
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 2131364561(0x7f0a0ad1, float:1.8348963E38)
            android.view.View r5 = X.AnonymousClass00T.A05(r5, r4)     // Catch:{ all -> 0x2544 }
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5     // Catch:{ all -> 0x2544 }
            r0.A0O = r5     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r4 = r0.A37     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxCListenerShape431S0100000_2_I0 r7 = new com.facebook.redex.IDxCListenerShape431S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r7.<init>(r0, r2)     // Catch:{ all -> 0x2544 }
            r4.A0A = r7     // Catch:{ all -> 0x2544 }
            X.0rv r7 = r0.A33     // Catch:{ all -> 0x2544 }
            X.0sL r9 = X.C16050sL.A03(r7)     // Catch:{ all -> 0x2544 }
            r10 = 0
            r11 = 0
            r12 = 1
            r7 = r4
            r8 = r5
            r7.A0D(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x2544 }
        L_0x0e25:
            r0.A0B()     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r8 = r0.A37     // Catch:{ all -> 0x2544 }
            android.text.InputFilter[] r7 = new android.text.InputFilter[r6]     // Catch:{ all -> 0x2544 }
            X.1ZK r5 = r0.A4F     // Catch:{ all -> 0x2544 }
            X.4ji r4 = new X.4ji     // Catch:{ all -> 0x2544 }
            r4.<init>(r5)     // Catch:{ all -> 0x2544 }
            r7[r2] = r4     // Catch:{ all -> 0x2544 }
            r8.setFilters(r7)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r5 = r0.A37     // Catch:{ all -> 0x2544 }
            X.1yV r7 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131364133(0x7f0a0925, float:1.8348094E38)
            android.view.View r4 = r7.findViewById(r4)     // Catch:{ all -> 0x2544 }
            r5.A05 = r4     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = 2131365605(0x7f0a0ee5, float:1.835108E38)
            android.view.View r5 = r5.findViewById(r4)     // Catch:{ all -> 0x2544 }
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5     // Catch:{ all -> 0x2544 }
            r0.A0P = r5     // Catch:{ all -> 0x2544 }
            r4 = 8
            r5.setVisibility(r4)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n     // Catch:{ all -> 0x2544 }
            r5 = r19
            r4.setAdapter(r5)     // Catch:{ all -> 0x2544 }
            boolean r4 = r1.A0V     // Catch:{ all -> 0x2544 }
            X.0pj r5 = r0.A3C     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0ecd
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            r5.A09(r4)     // Catch:{ all -> 0x2544 }
            r0.A4i = r6     // Catch:{ all -> 0x2544 }
            X.15I r5 = r0.A1w     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            r5.A09(r4, r6)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            X.0pd r5 = r4.A0C     // Catch:{ all -> 0x2544 }
            r10 = 2005(0x7d5, float:2.81E-42)
            r4 = r23
            boolean r4 = r5.A0E(r4, r10)     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0ec3
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            android.content.Intent r5 = r4.getIntent()     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = "fromNotification"
            boolean r4 = r5.getBooleanExtra(r4, r2)     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0ec3
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            android.content.Intent r5 = r4.getIntent()     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = "last_notification_keep_in_chat"
            boolean r4 = r5.getBooleanExtra(r4, r2)     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0ec3
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = r5
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            X.0pd r9 = r4.A0C     // Catch:{ all -> 0x2544 }
            X.0pN r5 = (X.C14550pN) r5     // Catch:{ all -> 0x2544 }
            X.0rz r8 = r5.A09     // Catch:{ all -> 0x2544 }
            X.02C r7 = r4.AGM()     // Catch:{ all -> 0x2544 }
            X.0rv r5 = r0.A33     // Catch:{ all -> 0x2544 }
            r11 = 0
            r4 = r23
            boolean r4 = r9.A0E(r4, r10)     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0ec3
            boolean r4 = com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A02(r7, r8)     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0ec3
            com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A01(r7, r5, r6)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A0P = r11     // Catch:{ all -> 0x2544 }
        L_0x0ec3:
            boolean r4 = r1.A0U     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0edb
            X.0pi r4 = r0.A3D     // Catch:{ all -> 0x2544 }
            r4.A01()     // Catch:{ all -> 0x2544 }
            goto L_0x0ed1
        L_0x0ecd:
            r5.A0E(r6)     // Catch:{ all -> 0x2544 }
            goto L_0x0ec3
        L_0x0ed1:
            if (r24 == 0) goto L_0x0edb
            X.15I r7 = r0.A1w     // Catch:{ all -> 0x2544 }
            r5 = 4
            r4 = r24
            r7.A09(r4, r5)     // Catch:{ all -> 0x2544 }
        L_0x0edb:
            r14 = 0
            r0.A4k = r2     // Catch:{ all -> 0x2544 }
            boolean r4 = r1.A0X     // Catch:{ all -> 0x2544 }
            r9 = 0
            if (r4 == 0) goto L_0x1091
            boolean r4 = r0.A4U     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x1091
            boolean r4 = r1.A0R     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x1091
            X.1LD r4 = r0.A1p     // Catch:{ all -> 0x2544 }
            java.util.HashMap r5 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            r5.remove(r4)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n     // Catch:{ all -> 0x2544 }
            r4.A0I = r6     // Catch:{ all -> 0x2544 }
            java.util.ArrayList r12 = r1.A0N     // Catch:{ all -> 0x2544 }
            if (r12 == 0) goto L_0x0f2c
            X.10X r11 = r0.A13     // Catch:{ all -> 0x1100 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x1100 }
            java.util.List r37 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x1100 }
            java.lang.String r10 = r1.A0G     // Catch:{ all -> 0x1100 }
            int r8 = r1.A01     // Catch:{ all -> 0x1100 }
            boolean r7 = r1.A0T     // Catch:{ all -> 0x1100 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x1100 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x1100 }
            X.4ur r4 = new X.4ur     // Catch:{ all -> 0x1100 }
            r4.<init>(r0)     // Catch:{ all -> 0x1100 }
            r33 = r5
            r40 = 0
            r31 = r11
            r32 = r5
            r34 = r4
            r35 = r9
            r36 = r10
            r38 = r12
            r39 = r8
            r41 = r7
            r31.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x1100 }
            goto L_0x1091
        L_0x0f2c:
            byte r5 = r1.A00     // Catch:{ all -> 0x2544 }
            r4 = 4
            if (r5 != r4) goto L_0x0f86
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r5 = r4
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            X.2DF r5 = r5.A00     // Catch:{ all -> 0x2544 }
            X.0tz r8 = r5.A0L     // Catch:{ all -> 0x2544 }
            X.1yR r4 = (X.AnonymousClass1yR) r4     // Catch:{ all -> 0x2544 }
            X.2DF r4 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0sG r7 = r4.A07     // Catch:{ all -> 0x2544 }
            X.013 r4 = r0.A2L     // Catch:{ all -> 0x2544 }
            X.1st r5 = new X.1st     // Catch:{ all -> 0x2544 }
            r5.<init>(r7, r8, r4)     // Catch:{ all -> 0x2544 }
            X.1G1 r7 = r0.A0d     // Catch:{ all -> 0x2544 }
            java.lang.String r11 = r1.A0M     // Catch:{ all -> 0x2544 }
            X.013 r4 = r5.A02     // Catch:{ 25G -> 0x106e }
            X.25O r12 = new X.25O     // Catch:{ 25G -> 0x106e }
            r12.<init>(r7, r4)     // Catch:{ 25G -> 0x106e }
            r5.A06(r11)     // Catch:{ 25G -> 0x106e }
            X.1sv r10 = r5.A03     // Catch:{ 25G -> 0x106e }
            java.util.List r4 = r10.A05     // Catch:{ 25G -> 0x106e }
            if (r4 == 0) goto L_0x1079
            X.0sG r8 = r5.A00     // Catch:{ 25G -> 0x106e }
            java.util.Iterator r13 = r4.iterator()     // Catch:{ 25G -> 0x106e }
        L_0x0f61:
            boolean r4 = r13.hasNext()     // Catch:{ 25G -> 0x106e }
            if (r4 == 0) goto L_0x0f80
            java.lang.Object r7 = r13.next()     // Catch:{ 25G -> 0x106e }
            X.1sw r7 = (X.C39711sw) r7     // Catch:{ 25G -> 0x106e }
            java.lang.String r4 = r7.A02     // Catch:{ 25G -> 0x106e }
            X.0sH r5 = r8.A0C(r4)     // Catch:{ 25G -> 0x106e }
            if (r5 == 0) goto L_0x0f61
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r4 = r5.A08(r4)     // Catch:{ 25G -> 0x106e }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ 25G -> 0x106e }
            r7.A01 = r4     // Catch:{ 25G -> 0x106e }
            goto L_0x0f61
        L_0x0f80:
            java.lang.String r11 = r12.A00(r10)     // Catch:{ 25G -> 0x106e }
            goto L_0x1079
        L_0x0f86:
            r4 = 14
            if (r5 != r4) goto L_0x0fa1
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r4 = (X.AnonymousClass1yR) r4     // Catch:{ all -> 0x2544 }
            X.2DF r4 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0tb r8 = r4.A03     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            java.util.ArrayList r7 = r1.A0O     // Catch:{ all -> 0x2544 }
            boolean r5 = r0.A4Y     // Catch:{ all -> 0x2544 }
            java.util.List r4 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x2544 }
            r8.A0T(r9, r4, r7, r5)     // Catch:{ all -> 0x2544 }
            goto L_0x1091
        L_0x0fa1:
            boolean r4 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x101e
            java.lang.String r10 = r3.A07     // Catch:{ all -> 0x2544 }
            boolean r4 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x101e
            X.0zS r5 = r0.A2U     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r4)     // Catch:{ all -> 0x2544 }
            r5.A01(r4, r9, r6)     // Catch:{ all -> 0x2544 }
            java.lang.String r8 = r3.A04     // Catch:{ all -> 0x2544 }
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x1010
            X.39b r5 = r0.A2S     // Catch:{ all -> 0x2544 }
            boolean r4 = r5.A0U     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0fd2
            boolean r4 = r3.A0A     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x0fd2
            int r5 = r5.A0I     // Catch:{ all -> 0x2544 }
            r4 = r22
            if (r5 == r4) goto L_0x0fdf
        L_0x0fd2:
            java.util.HashMap r7 = X.AnonymousClass4B0.A02     // Catch:{ all -> 0x2544 }
            X.0sH r5 = r0.A2l     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.0rv> r4 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r5.A08(r4)     // Catch:{ all -> 0x2544 }
            r7.put(r4, r8)     // Catch:{ all -> 0x2544 }
        L_0x0fdf:
            com.whatsapp.jid.UserJid r4 = r3.A01     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x1009
            java.lang.String r8 = r4.user     // Catch:{ all -> 0x2544 }
        L_0x0fe5:
            boolean r7 = r3.A0A     // Catch:{ all -> 0x2544 }
            boolean r5 = r3.A0B     // Catch:{ all -> 0x2544 }
            X.4NG r4 = new X.4NG     // Catch:{ all -> 0x2544 }
            r31 = r4
            r32 = r8
            r33 = r15
            r34 = r10
            r35 = r7
            r36 = r5
            r31.<init>(r32, r33, r34, r35, r36)     // Catch:{ all -> 0x2544 }
            java.util.HashMap r8 = A5M     // Catch:{ all -> 0x2544 }
            X.0sH r7 = r0.A2l     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.0rv> r5 = X.C15830rv.class
            com.whatsapp.jid.Jid r5 = r7.A08(r5)     // Catch:{ all -> 0x2544 }
            r8.put(r5, r4)     // Catch:{ all -> 0x2544 }
            goto L_0x1091
        L_0x1009:
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            java.lang.String r8 = r4.getRawString()     // Catch:{ all -> 0x2544 }
            goto L_0x0fe5
        L_0x1010:
            java.util.HashMap r7 = X.AnonymousClass4B0.A02     // Catch:{ all -> 0x2544 }
            X.0sH r5 = r0.A2l     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.0rv> r4 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r5.A08(r4)     // Catch:{ all -> 0x2544 }
            r7.remove(r4)     // Catch:{ all -> 0x2544 }
            goto L_0x0fdf
        L_0x101e:
            java.lang.String r8 = r1.A0J     // Catch:{ all -> 0x2544 }
            if (r8 == 0) goto L_0x1091
            int r4 = r8.length()     // Catch:{ all -> 0x2544 }
            if (r4 <= 0) goto L_0x1091
            boolean r4 = r1.A0S     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x103a
            java.util.HashMap r7 = X.AnonymousClass4B0.A02     // Catch:{ all -> 0x2544 }
            X.0sH r5 = r0.A2l     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.0rv> r4 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r5.A08(r4)     // Catch:{ all -> 0x2544 }
            r7.put(r4, r8)     // Catch:{ all -> 0x2544 }
            goto L_0x1091
        L_0x103a:
            java.lang.String r4 = X.C30931dC.A01(r8)     // Catch:{ all -> 0x2544 }
            X.1ZR r32 = X.C87664Ya.A00(r4)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r4 = (X.AnonymousClass1yR) r4     // Catch:{ all -> 0x2544 }
            X.2DF r4 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0tb r7 = r4.A03     // Catch:{ all -> 0x2544 }
            X.0sH r5 = r0.A2l     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.0rv> r4 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r5.A08(r4)     // Catch:{ all -> 0x2544 }
            java.util.List r36 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x2544 }
            boolean r5 = r0.A4Y     // Catch:{ all -> 0x2544 }
            boolean r4 = r0.A4Z     // Catch:{ all -> 0x2544 }
            r34 = r9
            r37 = r9
            r31 = r7
            r33 = r9
            r35 = r8
            r38 = r5
            r39 = r4
            r31.A0A(r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x2544 }
            r0.A4Z = r2     // Catch:{ all -> 0x2544 }
            goto L_0x1091
        L_0x106e:
            r4 = move-exception
            X.25H r5 = new X.25H     // Catch:{ all -> 0x2544 }
            r5.<init>(r4)     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = "addWaIdsToVCard"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ all -> 0x2544 }
        L_0x1079:
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r4 = (X.AnonymousClass1yR) r4     // Catch:{ all -> 0x2544 }
            X.2DF r4 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0tb r7 = r4.A03     // Catch:{ all -> 0x2544 }
            X.0rv r8 = r0.A33     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = r1.A0L     // Catch:{ all -> 0x2544 }
            boolean r4 = r0.A4Y     // Catch:{ all -> 0x2544 }
            java.util.List r12 = java.util.Collections.singletonList(r8)     // Catch:{ all -> 0x2544 }
            r8 = r7
            r10 = r5
            r13 = r4
            r8.A0S(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x2544 }
        L_0x1091:
            java.util.HashMap r5 = X.AnonymousClass4B0.A02     // Catch:{ all -> 0x2544 }
            X.0sH r4 = r0.A2l     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.0rv> r8 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r4.A08(r8)     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r5.get(r4)     // Catch:{ all -> 0x2544 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x2544 }
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x1102
            java.util.HashMap r5 = A5N     // Catch:{ all -> 0x2544 }
            X.0sH r4 = r0.A2l     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.Jid r4 = r4.A08(r8)     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x2544 }
            java.util.List r5 = X.C39501sa.A01(r4)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r4 = r0.A37     // Catch:{ all -> 0x2544 }
            r4.setMentionableText(r7, r5)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r10 = r4
            com.obwhatsapp.Conversation r10 = (com.obwhatsapp.Conversation) r10     // Catch:{ all -> 0x2544 }
            X.0pN r4 = (X.C14550pN) r4     // Catch:{ all -> 0x2544 }
            X.0um r9 = r4.A0B     // Catch:{ all -> 0x2544 }
            X.01V r5 = r4.A08     // Catch:{ all -> 0x2544 }
            X.0u3 r4 = r0.A3W     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r11 = r0.A37     // Catch:{ all -> 0x2544 }
            android.text.Editable r33 = r11.getEditableText()     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r11 = r0.A37     // Catch:{ all -> 0x2544 }
            android.text.TextPaint r32 = r11.getPaint()     // Catch:{ all -> 0x2544 }
            r31 = r10
            r34 = r5
            r35 = r9
            r36 = r4
            X.C45922Bq.A06(r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x2544 }
            java.lang.String r11 = X.C30931dC.A01(r7)     // Catch:{ all -> 0x2544 }
            X.1wN r4 = r0.A2D     // Catch:{ all -> 0x2544 }
            r4.A0A(r11)     // Catch:{ all -> 0x2544 }
            X.1wN r10 = r0.A2D     // Catch:{ all -> 0x1100 }
            X.2Yq r9 = r0.A1N     // Catch:{ all -> 0x1100 }
            if (r9 != 0) goto L_0x10fc
            X.1Ak r5 = r0.A1M     // Catch:{ all -> 0x1100 }
            X.1Al r4 = r0.A3Y     // Catch:{ all -> 0x1100 }
            X.2Yq r9 = new X.2Yq     // Catch:{ all -> 0x1100 }
            r9.<init>(r5, r4)     // Catch:{ all -> 0x1100 }
            r0.A1N = r9     // Catch:{ all -> 0x1100 }
        L_0x10fc:
            r10.A08(r9, r11)     // Catch:{ all -> 0x1100 }
            goto L_0x110a
        L_0x1100:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x2544 }
        L_0x1102:
            com.obwhatsapp.mentions.MentionableEntry r4 = r0.A37     // Catch:{ all -> 0x2544 }
            r4.setText(r9)     // Catch:{ all -> 0x2544 }
            r0.A0C()     // Catch:{ all -> 0x2544 }
        L_0x110a:
            boolean r7 = X.AnonymousClass1ZW.A0E(r7)     // Catch:{ all -> 0x2544 }
            r5 = 8
            android.widget.ImageButton r4 = r0.A0T     // Catch:{ all -> 0x2544 }
            if (r7 == 0) goto L_0x1167
            r4.setVisibility(r2)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r4 = r0.A0Q     // Catch:{ all -> 0x2544 }
            r4.setVisibility(r2)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r4 = r0.A0S     // Catch:{ all -> 0x2544 }
        L_0x111e:
            r4.setVisibility(r5)     // Catch:{ all -> 0x2544 }
            java.util.HashMap r5 = A5M     // Catch:{ all -> 0x2544 }
            X.0sH r4 = r0.A2l     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.Jid r4 = r4.A08(r8)     // Catch:{ all -> 0x2544 }
            java.lang.Object r11 = r5.get(r4)     // Catch:{ all -> 0x2544 }
            X.4NG r11 = (X.AnonymousClass4NG) r11     // Catch:{ all -> 0x2544 }
            if (r11 == 0) goto L_0x11df
            X.1Ma r4 = r0.A2W     // Catch:{ all -> 0x2544 }
            X.17S r4 = r4.A01     // Catch:{ all -> 0x2544 }
            r5 = 1029386189(0x3d5b2fcd, float:0.053512383)
            X.0yX r4 = r4.A01     // Catch:{ all -> 0x2544 }
            boolean r4 = r4.AJC(r5)     // Catch:{ all -> 0x2544 }
            if (r4 != 0) goto L_0x1147
            X.1Ma r5 = r0.A2W     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = "chats_list_screen"
            r5.A01(r4)     // Catch:{ all -> 0x2544 }
        L_0x1147:
            X.0zS r8 = r0.A2U     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.UserJid r7 = com.whatsapp.jid.UserJid.of(r4)     // Catch:{ all -> 0x2544 }
            r5 = 0
            r4 = r22
            r8.A01(r7, r5, r4)     // Catch:{ all -> 0x2544 }
            X.1wN r5 = r0.A2D     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = r11.A02     // Catch:{ all -> 0x2544 }
            r5.A0A(r4)     // Catch:{ all -> 0x2544 }
            X.1Ma r7 = r0.A2W     // Catch:{ all -> 0x2544 }
            boolean r4 = r11.A03     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x1174
            boolean r4 = r11.A04     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x1174
            goto L_0x1173
        L_0x1167:
            r4.setVisibility(r5)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r4 = r0.A0Q     // Catch:{ all -> 0x2544 }
            r4.setVisibility(r5)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r4 = r0.A0S     // Catch:{ all -> 0x2544 }
            r5 = 0
            goto L_0x111e
        L_0x1173:
            r14 = 1
        L_0x1174:
            java.lang.String r5 = "preview_load_starts"
            if (r14 == 0) goto L_0x117e
            java.lang.String r4 = "icebreaker_"
            java.lang.String r5 = X.C18450wi.A06(r4, r5)     // Catch:{ all -> 0x2544 }
        L_0x117e:
            r7.A00(r5)     // Catch:{ all -> 0x2544 }
            X.1wN r10 = r0.A2D     // Catch:{ all -> 0x2544 }
            X.0ua r4 = r10.A0F     // Catch:{ all -> 0x2544 }
            X.3hS r5 = new X.3hS     // Catch:{ all -> 0x2544 }
            r5.<init>((X.C17130ua) r4, (X.AnonymousClass4NG) r11)     // Catch:{ all -> 0x2544 }
            r10.A01 = r5     // Catch:{ all -> 0x2544 }
            X.027 r4 = r10.A0B     // Catch:{ all -> 0x2544 }
            r4.A0B(r5)     // Catch:{ all -> 0x2544 }
            X.4RZ r9 = new X.4RZ     // Catch:{ all -> 0x2544 }
            r9.<init>(r10, r3, r11)     // Catch:{ all -> 0x2544 }
            X.0pt r12 = r10.A0E     // Catch:{ all -> 0x2544 }
            X.0sq r7 = r10.A0U     // Catch:{ all -> 0x2544 }
            X.0ug r5 = r10.A0S     // Catch:{ all -> 0x2544 }
            X.0tK r4 = r10.A0H     // Catch:{ all -> 0x2544 }
            X.3Gk r8 = new X.3Gk     // Catch:{ all -> 0x2544 }
            r31 = r8
            r32 = r12
            r33 = r4
            r34 = r9
            r35 = r5
            r36 = r7
            r31.<init>(r32, r33, r34, r35, r36)     // Catch:{ all -> 0x2544 }
            X.0sq r7 = r8.A07     // Catch:{ all -> 0x2544 }
            r5 = 15
            com.facebook.redex.RunnableRunnableShape14S0200000_I1_2 r4 = new com.facebook.redex.RunnableRunnableShape14S0200000_I1_2     // Catch:{ all -> 0x2544 }
            r4.<init>(r8, r5, r11)     // Catch:{ all -> 0x2544 }
            r7.Acl(r4)     // Catch:{ all -> 0x2544 }
            java.util.List r7 = r10.A0V     // Catch:{ all -> 0x2544 }
            r5 = 5
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r4 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x2544 }
            r4.<init>(r8, r5)     // Catch:{ all -> 0x2544 }
            r7.add(r4)     // Catch:{ all -> 0x2544 }
            X.027 r8 = r9.A00     // Catch:{ all -> 0x2544 }
            X.1yV r7 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r7 = (com.obwhatsapp.Conversation) r7     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxObserverShape34S0200000_1_I0 r5 = new com.facebook.redex.IDxObserverShape34S0200000_1_I0     // Catch:{ all -> 0x2544 }
            r4 = r22
            r5.<init>(r11, r4, r0)     // Catch:{ all -> 0x2544 }
            r8.A0A(r7, r5)     // Catch:{ all -> 0x2544 }
            boolean r3 = r3.A0D     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x11df
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A37     // Catch:{ all -> 0x2544 }
            r3.A04(r2)     // Catch:{ all -> 0x2544 }
        L_0x11df:
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            X.2hp r22 = new X.2hp     // Catch:{ all -> 0x2544 }
            r4 = r22
            r4.<init>(r3)     // Catch:{ all -> 0x2544 }
            boolean r3 = r0.A4b     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x15d6
            X.0rv r3 = r0.A33     // Catch:{ all -> 0x2544 }
            X.0sL r60 = X.C16050sL.A03(r3)     // Catch:{ all -> 0x2544 }
            X.AnonymousClass00B.A06(r60)     // Catch:{ all -> 0x2544 }
            boolean r3 = r0.A4f     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x120b
            X.3tw r4 = new X.3tw     // Catch:{ all -> 0x2544 }
            r5 = r19
            r3 = r60
            r4.<init>(r5, r0, r3)     // Catch:{ all -> 0x2544 }
            r0.A30 = r4     // Catch:{ all -> 0x2544 }
            X.18R r3 = r0.A31     // Catch:{ all -> 0x2544 }
            r3.A02(r4)     // Catch:{ all -> 0x2544 }
        L_0x120b:
            X.2ai r4 = r0.A0x     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            r44 = r3
            r3 = r44
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            r44 = r3
            X.2Ao r76 = r0.A05()     // Catch:{ all -> 0x2544 }
            X.0sH r3 = r0.A2l     // Catch:{ all -> 0x2544 }
            r45 = r3
            X.2Yk r3 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0sX r3 = r3.A03     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.AP2     // Catch:{ all -> 0x2544 }
            java.lang.Object r43 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r43
            X.0t3 r4 = (X.C16440t3) r4     // Catch:{ all -> 0x2544 }
            r43 = r4
            X.01J r4 = r3.A05     // Catch:{ all -> 0x2544 }
            java.lang.Object r42 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r42
            X.0pd r4 = (X.C14710pd) r4     // Catch:{ all -> 0x2544 }
            r42 = r4
            X.01J r4 = r3.AB3     // Catch:{ all -> 0x2544 }
            java.lang.Object r41 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r41
            X.0pt r4 = (X.C14870pt) r4     // Catch:{ all -> 0x2544 }
            r41 = r4
            X.01J r4 = r3.ADr     // Catch:{ all -> 0x2544 }
            java.lang.Object r40 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r40
            X.0sK r4 = (X.C16040sK) r4     // Catch:{ all -> 0x2544 }
            r40 = r4
            X.01J r4 = r3.ARB     // Catch:{ all -> 0x2544 }
            java.lang.Object r39 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r39
            X.0sq r4 = (X.C16320sq) r4     // Catch:{ all -> 0x2544 }
            r39 = r4
            X.01J r4 = r3.A43     // Catch:{ all -> 0x2544 }
            java.lang.Object r38 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r38
            X.0rt r4 = (X.C15810rt) r4     // Catch:{ all -> 0x2544 }
            r38 = r4
            X.01J r4 = r3.A7e     // Catch:{ all -> 0x2544 }
            java.lang.Object r37 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r37
            X.0um r4 = (X.C17250um) r4     // Catch:{ all -> 0x2544 }
            r37 = r4
            X.01J r4 = r3.A4t     // Catch:{ all -> 0x2544 }
            java.lang.Object r36 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r36
            X.0ud r4 = (X.C17160ud) r4     // Catch:{ all -> 0x2544 }
            r36 = r4
            X.01J r4 = r3.A4x     // Catch:{ all -> 0x2544 }
            java.lang.Object r35 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r35
            X.0sG r4 = (X.C16000sG) r4     // Catch:{ all -> 0x2544 }
            r35 = r4
            X.01J r4 = r3.A54     // Catch:{ all -> 0x2544 }
            java.lang.Object r34 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r34
            X.1Kx r4 = (X.C25731Kx) r4     // Catch:{ all -> 0x2544 }
            r34 = r4
            X.01J r4 = r3.AQ9     // Catch:{ all -> 0x2544 }
            java.lang.Object r33 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r33
            X.0sP r4 = (X.C16080sP) r4     // Catch:{ all -> 0x2544 }
            r33 = r4
            X.01J r4 = r3.AR8     // Catch:{ all -> 0x2544 }
            java.lang.Object r32 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r32
            X.013 r4 = (X.AnonymousClass013) r4     // Catch:{ all -> 0x2544 }
            r32 = r4
            X.01J r4 = r3.A4y     // Catch:{ all -> 0x2544 }
            java.lang.Object r31 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r31
            X.0ub r4 = (X.C17140ub) r4     // Catch:{ all -> 0x2544 }
            r31 = r4
            X.01J r4 = r3.ABK     // Catch:{ all -> 0x2544 }
            java.lang.Object r15 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0ul r15 = (X.C17240ul) r15     // Catch:{ all -> 0x2544 }
            X.1Lc r91 = new X.1Lc     // Catch:{ all -> 0x2544 }
            r91.<init>()     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.AOG     // Catch:{ all -> 0x2544 }
            java.lang.Object r14 = r4.get()     // Catch:{ all -> 0x2544 }
            X.15l r14 = (X.C217915l) r14     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A3z     // Catch:{ all -> 0x2544 }
            java.lang.Object r13 = r4.get()     // Catch:{ all -> 0x2544 }
            X.127 r13 = (X.AnonymousClass127) r13     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A4N     // Catch:{ all -> 0x2544 }
            java.lang.Object r12 = r4.get()     // Catch:{ all -> 0x2544 }
            X.1L3 r12 = (X.AnonymousClass1L3) r12     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A4I     // Catch:{ all -> 0x2544 }
            java.lang.Object r11 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0uk r11 = (X.C17230uk) r11     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A35     // Catch:{ all -> 0x2544 }
            java.lang.Object r10 = r4.get()     // Catch:{ all -> 0x2544 }
            X.13V r10 = (X.AnonymousClass13V) r10     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.ABN     // Catch:{ all -> 0x2544 }
            java.lang.Object r9 = r4.get()     // Catch:{ all -> 0x2544 }
            X.18O r9 = (X.AnonymousClass18O) r9     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.ABY     // Catch:{ all -> 0x2544 }
            java.lang.Object r8 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0sO r8 = (X.C16070sO) r8     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.ABS     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x2544 }
            X.18Q r7 = (X.AnonymousClass18Q) r7     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A51     // Catch:{ all -> 0x2544 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2544 }
            X.152 r5 = (X.AnonymousClass152) r5     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A5O     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2544 }
            X.14t r4 = (X.C216114t) r4     // Catch:{ all -> 0x2544 }
            X.01J r3 = r3.ABZ     // Catch:{ all -> 0x2544 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x2544 }
            X.18R r3 = (X.AnonymousClass18R) r3     // Catch:{ all -> 0x2544 }
            X.2Qc r24 = new X.2Qc     // Catch:{ all -> 0x2544 }
            r62 = r44
            r63 = r34
            r64 = r41
            r65 = r40
            r66 = r22
            r67 = r10
            r68 = r13
            r69 = r11
            r70 = r12
            r71 = r36
            r72 = r35
            r73 = r31
            r74 = r7
            r75 = r33
            r77 = r5
            r78 = r43
            r79 = r32
            r80 = r38
            r81 = r4
            r82 = r8
            r83 = r45
            r84 = r37
            r85 = r42
            r86 = r15
            r87 = r9
            r88 = r3
            r89 = r14
            r90 = r60
            r92 = r39
            r61 = r24
            r61.<init>(r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92)     // Catch:{ all -> 0x2544 }
            r3 = r24
            r0.A1s = r3     // Catch:{ all -> 0x2544 }
            X.2af r4 = r0.A0t     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            r59 = r3
            r3 = r59
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            r61 = r3
            X.0sH r3 = r0.A2l     // Catch:{ all -> 0x2544 }
            r93 = r3
            X.2Yk r5 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0sX r3 = r5.A03     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.AP2     // Catch:{ all -> 0x2544 }
            java.lang.Object r57 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r57
            X.0t3 r4 = (X.C16440t3) r4     // Catch:{ all -> 0x2544 }
            r57 = r4
            X.01J r4 = r3.A05     // Catch:{ all -> 0x2544 }
            java.lang.Object r56 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r56
            X.0pd r4 = (X.C14710pd) r4     // Catch:{ all -> 0x2544 }
            r56 = r4
            X.01J r4 = r3.AB3     // Catch:{ all -> 0x2544 }
            java.lang.Object r55 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r55
            X.0pt r4 = (X.C14870pt) r4     // Catch:{ all -> 0x2544 }
            r55 = r4
            X.01J r4 = r3.A5p     // Catch:{ all -> 0x2544 }
            java.lang.Object r54 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r54
            X.0so r4 = (X.C16300so) r4     // Catch:{ all -> 0x2544 }
            r54 = r4
            X.01J r4 = r3.ADr     // Catch:{ all -> 0x2544 }
            java.lang.Object r53 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r53
            X.0sK r4 = (X.C16040sK) r4     // Catch:{ all -> 0x2544 }
            r53 = r4
            X.01J r4 = r3.ARB     // Catch:{ all -> 0x2544 }
            java.lang.Object r52 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r52
            X.0sq r4 = (X.C16320sq) r4     // Catch:{ all -> 0x2544 }
            r52 = r4
            X.01J r4 = r3.A43     // Catch:{ all -> 0x2544 }
            java.lang.Object r51 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r51
            X.0rt r4 = (X.C15810rt) r4     // Catch:{ all -> 0x2544 }
            r51 = r4
            X.15V r108 = new X.15V     // Catch:{ all -> 0x2544 }
            r108.<init>()     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.ALm     // Catch:{ all -> 0x2544 }
            java.lang.Object r50 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r50
            X.0s5 r4 = (X.C15900s5) r4     // Catch:{ all -> 0x2544 }
            r50 = r4
            X.01J r4 = r3.APV     // Catch:{ all -> 0x2544 }
            java.lang.Object r49 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r49
            X.0tb r4 = (X.C16760tb) r4     // Catch:{ all -> 0x2544 }
            r49 = r4
            X.2Rg r4 = r5.A01     // Catch:{ all -> 0x2544 }
            X.0zl r98 = r4.A0I()     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.ANy     // Catch:{ all -> 0x2544 }
            java.lang.Object r48 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r48
            X.0pf r5 = (X.C14730pf) r5     // Catch:{ all -> 0x2544 }
            r48 = r5
            X.0vQ r70 = X.C16150sX.A0J(r3)     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A4x     // Catch:{ all -> 0x2544 }
            java.lang.Object r47 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r47
            X.0sG r5 = (X.C16000sG) r5     // Catch:{ all -> 0x2544 }
            r47 = r5
            X.01J r5 = r3.AR8     // Catch:{ all -> 0x2544 }
            java.lang.Object r46 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r46
            X.013 r5 = (X.AnonymousClass013) r5     // Catch:{ all -> 0x2544 }
            r46 = r5
            X.01J r5 = r3.AJ5     // Catch:{ all -> 0x2544 }
            java.lang.Object r45 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r45
            X.125 r5 = (X.AnonymousClass125) r5     // Catch:{ all -> 0x2544 }
            r45 = r5
            X.01J r5 = r3.A3G     // Catch:{ all -> 0x2544 }
            java.lang.Object r44 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r44
            X.1SP r5 = (X.AnonymousClass1SP) r5     // Catch:{ all -> 0x2544 }
            r44 = r5
            X.01J r5 = r3.ABK     // Catch:{ all -> 0x2544 }
            java.lang.Object r43 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r43
            X.0ul r5 = (X.C17240ul) r5     // Catch:{ all -> 0x2544 }
            r43 = r5
            X.01J r5 = r3.A3m     // Catch:{ all -> 0x2544 }
            java.lang.Object r42 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r42
            X.0vb r5 = (X.C17760vb) r5     // Catch:{ all -> 0x2544 }
            r42 = r5
            X.01J r5 = r3.A4y     // Catch:{ all -> 0x2544 }
            java.lang.Object r41 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r41
            X.0ub r5 = (X.C17140ub) r5     // Catch:{ all -> 0x2544 }
            r41 = r5
            X.01J r5 = r3.AQW     // Catch:{ all -> 0x2544 }
            java.lang.Object r40 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r40
            X.0vJ r5 = (X.C17580vJ) r5     // Catch:{ all -> 0x2544 }
            r40 = r5
            X.1Lc r107 = new X.1Lc     // Catch:{ all -> 0x2544 }
            r107.<init>()     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A3P     // Catch:{ all -> 0x2544 }
            java.lang.Object r39 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r39
            X.1D0 r5 = (X.AnonymousClass1D0) r5     // Catch:{ all -> 0x2544 }
            r39 = r5
            X.01J r5 = r3.A3r     // Catch:{ all -> 0x2544 }
            java.lang.Object r38 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r38
            X.15I r5 = (X.AnonymousClass15I) r5     // Catch:{ all -> 0x2544 }
            r38 = r5
            X.01J r5 = r3.A3y     // Catch:{ all -> 0x2544 }
            java.lang.Object r37 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r37
            X.0sf r5 = (X.C16220sf) r5     // Catch:{ all -> 0x2544 }
            r37 = r5
            X.01J r5 = r3.AEM     // Catch:{ all -> 0x2544 }
            java.lang.Object r36 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r36
            X.12W r5 = (X.AnonymousClass12W) r5     // Catch:{ all -> 0x2544 }
            r36 = r5
            X.01J r5 = r3.AQi     // Catch:{ all -> 0x2544 }
            java.lang.Object r35 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r35
            X.0yv r5 = (X.C19740yv) r5     // Catch:{ all -> 0x2544 }
            r35 = r5
            X.01J r5 = r3.A3z     // Catch:{ all -> 0x2544 }
            java.lang.Object r34 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r34
            X.127 r5 = (X.AnonymousClass127) r5     // Catch:{ all -> 0x2544 }
            r34 = r5
            X.01J r5 = r3.APO     // Catch:{ all -> 0x2544 }
            java.lang.Object r33 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r33
            X.119 r5 = (X.AnonymousClass119) r5     // Catch:{ all -> 0x2544 }
            r33 = r5
            X.01J r5 = r3.APp     // Catch:{ all -> 0x2544 }
            java.lang.Object r32 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r32
            X.0uP r5 = (X.C17030uP) r5     // Catch:{ all -> 0x2544 }
            r32 = r5
            X.01J r5 = r3.AMk     // Catch:{ all -> 0x2544 }
            java.lang.Object r31 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r31
            X.15X r5 = (X.AnonymousClass15X) r5     // Catch:{ all -> 0x2544 }
            r31 = r5
            X.01J r5 = r3.AQh     // Catch:{ all -> 0x2544 }
            java.lang.Object r24 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r24
            X.0rz r5 = (X.C15860rz) r5     // Catch:{ all -> 0x2544 }
            r24 = r5
            X.01J r5 = r3.A4I     // Catch:{ all -> 0x2544 }
            java.lang.Object r15 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0uk r15 = (X.C17230uk) r15     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.ACz     // Catch:{ all -> 0x2544 }
            java.lang.Object r14 = r5.get()     // Catch:{ all -> 0x2544 }
            X.195 r14 = (X.AnonymousClass195) r14     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A86     // Catch:{ all -> 0x2544 }
            java.lang.Object r13 = r5.get()     // Catch:{ all -> 0x2544 }
            X.1M1 r13 = (X.AnonymousClass1M1) r13     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A4T     // Catch:{ all -> 0x2544 }
            java.lang.Object r12 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0yO r12 = (X.C19410yO) r12     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A6Z     // Catch:{ all -> 0x2544 }
            java.lang.Object r11 = r5.get()     // Catch:{ all -> 0x2544 }
            X.1Kw r11 = (X.C25721Kw) r11     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.ABY     // Catch:{ all -> 0x2544 }
            java.lang.Object r10 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0sO r10 = (X.C16070sO) r10     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A3o     // Catch:{ all -> 0x2544 }
            java.lang.Object r9 = r5.get()     // Catch:{ all -> 0x2544 }
            X.1M4 r9 = (X.AnonymousClass1M4) r9     // Catch:{ all -> 0x2544 }
            X.01J r4 = r4.A0F     // Catch:{ all -> 0x2544 }
            java.lang.Object r8 = r4.get()     // Catch:{ all -> 0x2544 }
            X.2a9 r8 = (X.AnonymousClass2a9) r8     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A5O     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x2544 }
            X.14t r7 = (X.C216114t) r7     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.ABZ     // Catch:{ all -> 0x2544 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2544 }
            X.18R r5 = (X.AnonymousClass18R) r5     // Catch:{ all -> 0x2544 }
            X.47S r106 = new X.47S     // Catch:{ all -> 0x2544 }
            r106.<init>()     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A5v     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0zm r4 = (X.C20270zm) r4     // Catch:{ all -> 0x2544 }
            X.01J r3 = r3.AOG     // Catch:{ all -> 0x2544 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x2544 }
            X.15l r3 = (X.C217915l) r3     // Catch:{ all -> 0x2544 }
            X.47G r103 = new X.47G     // Catch:{ all -> 0x2544 }
            r103.<init>()     // Catch:{ all -> 0x2544 }
            X.2ks r58 = new X.2ks     // Catch:{ all -> 0x2544 }
            r63 = r61
            r62 = r54
            r64 = r55
            r65 = r53
            r66 = r50
            r67 = r49
            r68 = r35
            r69 = r22
            r71 = r34
            r72 = r42
            r73 = r15
            r74 = r47
            r75 = r41
            r76 = r32
            r77 = r59
            r78 = r8
            r79 = r13
            r80 = r38
            r81 = r4
            r82 = r36
            r83 = r57
            r84 = r24
            r85 = r46
            r86 = r48
            r87 = r39
            r88 = r51
            r89 = r7
            r90 = r10
            r91 = r14
            r92 = r33
            r94 = r40
            r95 = r12
            r96 = r31
            r97 = r56
            r99 = r43
            r100 = r5
            r101 = r3
            r102 = r60
            r104 = r45
            r105 = r37
            r109 = r9
            r110 = r11
            r111 = r52
            r112 = r44
            r60 = r58
            r60.<init>(r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112)     // Catch:{ all -> 0x2544 }
        L_0x15aa:
            X.1cT r4 = r0.A1s     // Catch:{ all -> 0x2544 }
            r3 = r113
            r3.add(r4)     // Catch:{ all -> 0x2544 }
            r4 = r3
            r3 = r58
            r4.add(r3)     // Catch:{ all -> 0x2544 }
            java.util.Set r4 = r0.A5H     // Catch:{ all -> 0x2544 }
            r4.add(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A37     // Catch:{ all -> 0x2544 }
            r3.requestFocus()     // Catch:{ all -> 0x2544 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x2544 }
            r14.<init>()     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            X.0pd r4 = r3.A0C     // Catch:{ all -> 0x2544 }
            r3 = 2449(0x991, float:3.432E-42)
            r5 = r23
            boolean r3 = r4.A0E(r5, r3)     // Catch:{ all -> 0x2544 }
            goto L_0x1a55
        L_0x15d6:
            boolean r3 = r0.A4c     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x171a
            X.0rv r15 = r0.A33     // Catch:{ all -> 0x2544 }
            boolean r3 = r15 instanceof X.C34841kx     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x1717
            X.1kx r15 = (X.C34841kx) r15     // Catch:{ all -> 0x2544 }
        L_0x15e2:
            X.AnonymousClass00B.A06(r15)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r14 = r4
            com.obwhatsapp.Conversation r14 = (com.obwhatsapp.Conversation) r14     // Catch:{ all -> 0x2544 }
            X.0pd r3 = r14.A0C     // Catch:{ all -> 0x2544 }
            r48 = r3
            r5 = r4
            X.0pN r5 = (X.C14550pN) r5     // Catch:{ all -> 0x2544 }
            X.0pt r3 = r5.A05     // Catch:{ all -> 0x2544 }
            r34 = r3
            r3 = r4
            X.0pL r3 = (X.C14530pL) r3     // Catch:{ all -> 0x2544 }
            X.0sK r3 = r3.A01     // Catch:{ all -> 0x2544 }
            r35 = r3
            r3 = r4
            X.0pP r3 = (X.C14570pP) r3     // Catch:{ all -> 0x2544 }
            X.0sq r3 = r3.A05     // Catch:{ all -> 0x2544 }
            r53 = r3
            X.0rt r3 = r0.A2c     // Catch:{ all -> 0x2544 }
            r44 = r3
            X.0um r3 = r5.A0B     // Catch:{ all -> 0x2544 }
            r31 = r3
            X.0ud r3 = r0.A1a     // Catch:{ all -> 0x2544 }
            r24 = r3
            X.1Kx r13 = r0.A0b     // Catch:{ all -> 0x2544 }
            X.1yR r4 = (X.AnonymousClass1yR) r4     // Catch:{ all -> 0x2544 }
            X.2DF r3 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0sP r12 = r3.A09     // Catch:{ all -> 0x2544 }
            X.013 r11 = r0.A2L     // Catch:{ all -> 0x2544 }
            X.0ub r10 = r0.A1b     // Catch:{ all -> 0x2544 }
            X.0ul r9 = r3.A0Y     // Catch:{ all -> 0x2544 }
            r0.A05()     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = r8
            X.1yR r3 = (X.AnonymousClass1yR) r3     // Catch:{ all -> 0x2544 }
            X.2DF r7 = r3.A00     // Catch:{ all -> 0x2544 }
            X.1Lc r3 = r7.A0l     // Catch:{ all -> 0x2544 }
            r52 = r3
            X.127 r3 = r0.A1U     // Catch:{ all -> 0x2544 }
            r56 = r3
            X.13V r5 = r0.A1F     // Catch:{ all -> 0x2544 }
            X.152 r4 = r0.A1e     // Catch:{ all -> 0x2544 }
            X.14t r3 = r0.A2d     // Catch:{ all -> 0x2544 }
            r55 = r3
            X.18R r3 = r0.A31     // Catch:{ all -> 0x2544 }
            r50 = r3
            X.0sH r3 = r0.A2l     // Catch:{ all -> 0x2544 }
            r54 = r3
            X.30C r3 = new X.30C     // Catch:{ all -> 0x2544 }
            r32 = r14
            r33 = r13
            r36 = r22
            r37 = r5
            r38 = r56
            r39 = r24
            r40 = r10
            r41 = r12
            r42 = r4
            r43 = r11
            r45 = r55
            r46 = r54
            r47 = r31
            r49 = r9
            r51 = r15
            r31 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x2544 }
            r0.A1s = r3     // Catch:{ all -> 0x2544 }
            r13 = r8
            com.obwhatsapp.Conversation r13 = (com.obwhatsapp.Conversation) r13     // Catch:{ all -> 0x2544 }
            X.0pd r3 = r13.A0C     // Catch:{ all -> 0x2544 }
            r46 = r3
            r3 = r8
            X.0pN r3 = (X.C14550pN) r3     // Catch:{ all -> 0x2544 }
            X.0pt r4 = r3.A05     // Catch:{ all -> 0x2544 }
            r45 = r4
            r5 = r8
            X.0pL r5 = (X.C14530pL) r5     // Catch:{ all -> 0x2544 }
            X.0sK r4 = r5.A01     // Catch:{ all -> 0x2544 }
            r44 = r4
            r4 = r8
            X.0pP r4 = (X.C14570pP) r4     // Catch:{ all -> 0x2544 }
            X.0sq r4 = r4.A05     // Catch:{ all -> 0x2544 }
            r43 = r4
            X.0rt r4 = r0.A2c     // Catch:{ all -> 0x2544 }
            r42 = r4
            X.15V r4 = r0.A3f     // Catch:{ all -> 0x2544 }
            r41 = r4
            X.0s5 r4 = r3.A06     // Catch:{ all -> 0x2544 }
            r40 = r4
            X.0tb r4 = r7.A03     // Catch:{ all -> 0x2544 }
            r39 = r4
            X.0zl r4 = r0.A2t     // Catch:{ all -> 0x2544 }
            r38 = r4
            X.0pf r4 = r5.A06     // Catch:{ all -> 0x2544 }
            r37 = r4
            X.0vQ r4 = r0.A1T     // Catch:{ all -> 0x2544 }
            r36 = r4
            X.013 r4 = r0.A2L     // Catch:{ all -> 0x2544 }
            r35 = r4
            X.0vb r4 = r0.A1V     // Catch:{ all -> 0x2544 }
            r34 = r4
            X.0ub r4 = r0.A1b     // Catch:{ all -> 0x2544 }
            r33 = r4
            X.0vJ r4 = r0.A2m     // Catch:{ all -> 0x2544 }
            r32 = r4
            X.15I r4 = r0.A1w     // Catch:{ all -> 0x2544 }
            r31 = r4
            X.0sf r4 = r0.A3d     // Catch:{ all -> 0x2544 }
            r24 = r4
            X.12W r14 = r0.A2F     // Catch:{ all -> 0x2544 }
            X.0yv r12 = r0.A1B     // Catch:{ all -> 0x2544 }
            X.0uP r11 = r0.A1c     // Catch:{ all -> 0x2544 }
            X.0rz r10 = r3.A09     // Catch:{ all -> 0x2544 }
            X.1M1 r9 = r0.A1u     // Catch:{ all -> 0x2544 }
            X.0yO r7 = r0.A2n     // Catch:{ all -> 0x2544 }
            X.1Kw r5 = r0.A3y     // Catch:{ all -> 0x2544 }
            X.2a9 r4 = r0.A1t     // Catch:{ all -> 0x2544 }
            X.0zm r3 = r0.A27     // Catch:{ all -> 0x2544 }
            r60 = r13
            X.30A r58 = new X.30A     // Catch:{ all -> 0x2544 }
            r59 = r13
            r61 = r45
            r62 = r44
            r63 = r40
            r64 = r39
            r65 = r12
            r66 = r22
            r67 = r36
            r68 = r56
            r69 = r34
            r70 = r33
            r71 = r11
            r72 = r8
            r73 = r4
            r74 = r9
            r75 = r31
            r76 = r3
            r77 = r14
            r78 = r10
            r79 = r35
            r80 = r37
            r81 = r42
            r82 = r55
            r83 = r54
            r84 = r32
            r85 = r7
            r86 = r46
            r87 = r38
            r88 = r50
            r89 = r15
            r90 = r24
            r91 = r52
            r92 = r41
            r93 = r5
            r94 = r43
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94)     // Catch:{ all -> 0x2544 }
            goto L_0x15aa
        L_0x1717:
            r15 = 0
            goto L_0x15e2
        L_0x171a:
            X.2ae r4 = r0.A0s     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            r36 = r3
            r3 = r36
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            r36 = r3
            r0.A05()     // Catch:{ all -> 0x2544 }
            X.14t r3 = r0.A2d     // Catch:{ all -> 0x2544 }
            r51 = r3
            X.0rv r3 = r0.A33     // Catch:{ all -> 0x2544 }
            r58 = r3
            X.AnonymousClass00B.A06(r58)     // Catch:{ all -> 0x2544 }
            X.0sH r3 = r0.A2l     // Catch:{ all -> 0x2544 }
            r52 = r3
            X.2Yk r3 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0sX r13 = r3.A03     // Catch:{ all -> 0x2544 }
            X.01J r4 = r13.AP2     // Catch:{ all -> 0x2544 }
            java.lang.Object r35 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r35
            X.0t3 r4 = (X.C16440t3) r4     // Catch:{ all -> 0x2544 }
            r35 = r4
            X.01J r4 = r13.A05     // Catch:{ all -> 0x2544 }
            java.lang.Object r34 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r34
            X.0pd r4 = (X.C14710pd) r4     // Catch:{ all -> 0x2544 }
            r34 = r4
            X.01J r4 = r13.AB3     // Catch:{ all -> 0x2544 }
            java.lang.Object r33 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r33
            X.0pt r4 = (X.C14870pt) r4     // Catch:{ all -> 0x2544 }
            r33 = r4
            X.01J r4 = r13.ADr     // Catch:{ all -> 0x2544 }
            java.lang.Object r32 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r32
            X.0sK r4 = (X.C16040sK) r4     // Catch:{ all -> 0x2544 }
            r32 = r4
            X.01J r4 = r13.ARB     // Catch:{ all -> 0x2544 }
            java.lang.Object r31 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r31
            X.0sq r4 = (X.C16320sq) r4     // Catch:{ all -> 0x2544 }
            r31 = r4
            X.01J r4 = r13.A43     // Catch:{ all -> 0x2544 }
            java.lang.Object r24 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r24
            X.0rt r4 = (X.C15810rt) r4     // Catch:{ all -> 0x2544 }
            r24 = r4
            X.01J r4 = r13.A7e     // Catch:{ all -> 0x2544 }
            java.lang.Object r15 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0um r15 = (X.C17250um) r15     // Catch:{ all -> 0x2544 }
            X.2Rg r3 = r3.A01     // Catch:{ all -> 0x2544 }
            X.0zl r55 = r3.A0I()     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.A4t     // Catch:{ all -> 0x2544 }
            java.lang.Object r14 = r3.get()     // Catch:{ all -> 0x2544 }
            X.0ud r14 = (X.C17160ud) r14     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.A54     // Catch:{ all -> 0x2544 }
            java.lang.Object r12 = r3.get()     // Catch:{ all -> 0x2544 }
            X.1Kx r12 = (X.C25731Kx) r12     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.AQ9     // Catch:{ all -> 0x2544 }
            java.lang.Object r11 = r3.get()     // Catch:{ all -> 0x2544 }
            X.0sP r11 = (X.C16080sP) r11     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.AR8     // Catch:{ all -> 0x2544 }
            java.lang.Object r10 = r3.get()     // Catch:{ all -> 0x2544 }
            X.013 r10 = (X.AnonymousClass013) r10     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.A4y     // Catch:{ all -> 0x2544 }
            java.lang.Object r9 = r3.get()     // Catch:{ all -> 0x2544 }
            X.0ub r9 = (X.C17140ub) r9     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.ABK     // Catch:{ all -> 0x2544 }
            java.lang.Object r8 = r3.get()     // Catch:{ all -> 0x2544 }
            X.0ul r8 = (X.C17240ul) r8     // Catch:{ all -> 0x2544 }
            X.1Lc r59 = new X.1Lc     // Catch:{ all -> 0x2544 }
            r59.<init>()     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.A3z     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x2544 }
            X.127 r7 = (X.AnonymousClass127) r7     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.A35     // Catch:{ all -> 0x2544 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x2544 }
            X.13V r5 = (X.AnonymousClass13V) r5     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.ABY     // Catch:{ all -> 0x2544 }
            r3.get()     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.A51     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x2544 }
            X.152 r4 = (X.AnonymousClass152) r4     // Catch:{ all -> 0x2544 }
            X.01J r3 = r13.ABZ     // Catch:{ all -> 0x2544 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x2544 }
            X.18R r3 = (X.AnonymousClass18R) r3     // Catch:{ all -> 0x2544 }
            X.0zS r49 = r13.A1U()     // Catch:{ all -> 0x2544 }
            X.1cS r13 = new X.1cS     // Catch:{ all -> 0x2544 }
            r37 = r12
            r38 = r33
            r39 = r32
            r40 = r22
            r41 = r5
            r42 = r7
            r43 = r14
            r44 = r9
            r45 = r11
            r46 = r4
            r47 = r35
            r48 = r10
            r50 = r24
            r53 = r15
            r54 = r34
            r56 = r8
            r57 = r3
            r60 = r31
            r35 = r13
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)     // Catch:{ all -> 0x2544 }
            r0.A1s = r13     // Catch:{ all -> 0x2544 }
            X.2aX r4 = r0.A0l     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            r57 = r3
            r3 = r57
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            r59 = r3
            X.0rv r3 = r0.A33     // Catch:{ all -> 0x2544 }
            r102 = r3
            X.0sH r3 = r0.A2l     // Catch:{ all -> 0x2544 }
            r93 = r3
            X.2Yk r5 = r4.A00     // Catch:{ all -> 0x2544 }
            X.0sX r3 = r5.A03     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A05     // Catch:{ all -> 0x2544 }
            java.lang.Object r56 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r56
            X.0pd r4 = (X.C14710pd) r4     // Catch:{ all -> 0x2544 }
            r56 = r4
            X.01J r4 = r3.AB3     // Catch:{ all -> 0x2544 }
            java.lang.Object r55 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r55
            X.0pt r4 = (X.C14870pt) r4     // Catch:{ all -> 0x2544 }
            r55 = r4
            X.01J r4 = r3.ADr     // Catch:{ all -> 0x2544 }
            java.lang.Object r54 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r54
            X.0sK r4 = (X.C16040sK) r4     // Catch:{ all -> 0x2544 }
            r54 = r4
            X.01J r4 = r3.ARB     // Catch:{ all -> 0x2544 }
            java.lang.Object r53 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r53
            X.0sq r4 = (X.C16320sq) r4     // Catch:{ all -> 0x2544 }
            r53 = r4
            X.01J r4 = r3.A43     // Catch:{ all -> 0x2544 }
            java.lang.Object r52 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r52
            X.0rt r4 = (X.C15810rt) r4     // Catch:{ all -> 0x2544 }
            r52 = r4
            X.15V r106 = new X.15V     // Catch:{ all -> 0x2544 }
            r106.<init>()     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.AQz     // Catch:{ all -> 0x2544 }
            java.lang.Object r51 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r51
            X.0t9 r4 = (X.C16490t9) r4     // Catch:{ all -> 0x2544 }
            r51 = r4
            X.01J r4 = r3.ALm     // Catch:{ all -> 0x2544 }
            java.lang.Object r50 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r50
            X.0s5 r4 = (X.C15900s5) r4     // Catch:{ all -> 0x2544 }
            r50 = r4
            X.01J r4 = r3.APV     // Catch:{ all -> 0x2544 }
            java.lang.Object r49 = r4.get()     // Catch:{ all -> 0x2544 }
            r4 = r49
            X.0tb r4 = (X.C16760tb) r4     // Catch:{ all -> 0x2544 }
            r49 = r4
            X.2Rg r4 = r5.A01     // Catch:{ all -> 0x2544 }
            X.0zl r98 = r4.A0I()     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.ANy     // Catch:{ all -> 0x2544 }
            java.lang.Object r48 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r48
            X.0pf r5 = (X.C14730pf) r5     // Catch:{ all -> 0x2544 }
            r48 = r5
            X.01J r5 = r3.ADM     // Catch:{ all -> 0x2544 }
            java.lang.Object r47 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r47
            X.0uW r5 = (X.C17090uW) r5     // Catch:{ all -> 0x2544 }
            r47 = r5
            X.01J r5 = r3.A0P     // Catch:{ all -> 0x2544 }
            java.lang.Object r46 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r46
            X.0zJ r5 = (X.C19980zJ) r5     // Catch:{ all -> 0x2544 }
            r46 = r5
            X.0vQ r73 = X.C16150sX.A0J(r3)     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.AQ9     // Catch:{ all -> 0x2544 }
            java.lang.Object r45 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r45
            X.0sP r5 = (X.C16080sP) r5     // Catch:{ all -> 0x2544 }
            r45 = r5
            X.01J r5 = r3.AR8     // Catch:{ all -> 0x2544 }
            java.lang.Object r44 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r44
            X.013 r5 = (X.AnonymousClass013) r5     // Catch:{ all -> 0x2544 }
            r44 = r5
            X.01J r5 = r3.AMT     // Catch:{ all -> 0x2544 }
            java.lang.Object r43 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r43
            X.19m r5 = (X.C228419m) r5     // Catch:{ all -> 0x2544 }
            r43 = r5
            X.01J r5 = r3.A3m     // Catch:{ all -> 0x2544 }
            java.lang.Object r42 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r42
            X.0vb r5 = (X.C17760vb) r5     // Catch:{ all -> 0x2544 }
            r42 = r5
            X.01J r5 = r3.A4y     // Catch:{ all -> 0x2544 }
            java.lang.Object r41 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r41
            X.0ub r5 = (X.C17140ub) r5     // Catch:{ all -> 0x2544 }
            r41 = r5
            X.01J r5 = r3.A1w     // Catch:{ all -> 0x2544 }
            java.lang.Object r40 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r40
            X.01Y r5 = (X.AnonymousClass01Y) r5     // Catch:{ all -> 0x2544 }
            r40 = r5
            X.01J r5 = r3.AQW     // Catch:{ all -> 0x2544 }
            java.lang.Object r39 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r39
            X.0vJ r5 = (X.C17580vJ) r5     // Catch:{ all -> 0x2544 }
            r39 = r5
            X.01J r5 = r3.ADI     // Catch:{ all -> 0x2544 }
            java.lang.Object r38 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r38
            X.0yz r5 = (X.C19780yz) r5     // Catch:{ all -> 0x2544 }
            r38 = r5
            X.1Lc r105 = new X.1Lc     // Catch:{ all -> 0x2544 }
            r105.<init>()     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A3r     // Catch:{ all -> 0x2544 }
            java.lang.Object r37 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r37
            X.15I r5 = (X.AnonymousClass15I) r5     // Catch:{ all -> 0x2544 }
            r37 = r5
            X.01J r5 = r3.A3y     // Catch:{ all -> 0x2544 }
            java.lang.Object r36 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r36
            X.0sf r5 = (X.C16220sf) r5     // Catch:{ all -> 0x2544 }
            r36 = r5
            X.01J r5 = r3.AEM     // Catch:{ all -> 0x2544 }
            java.lang.Object r35 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r35
            X.12W r5 = (X.AnonymousClass12W) r5     // Catch:{ all -> 0x2544 }
            r35 = r5
            X.01J r5 = r3.AQi     // Catch:{ all -> 0x2544 }
            java.lang.Object r34 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r34
            X.0yv r5 = (X.C19740yv) r5     // Catch:{ all -> 0x2544 }
            r34 = r5
            X.01J r5 = r3.A3z     // Catch:{ all -> 0x2544 }
            java.lang.Object r33 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r33
            X.127 r5 = (X.AnonymousClass127) r5     // Catch:{ all -> 0x2544 }
            r33 = r5
            X.2Yr r101 = X.C49132Rg.A01(r4)     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.APp     // Catch:{ all -> 0x2544 }
            java.lang.Object r32 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r32
            X.0uP r5 = (X.C17030uP) r5     // Catch:{ all -> 0x2544 }
            r32 = r5
            X.01J r5 = r3.AMk     // Catch:{ all -> 0x2544 }
            java.lang.Object r31 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r31
            X.15X r5 = (X.AnonymousClass15X) r5     // Catch:{ all -> 0x2544 }
            r31 = r5
            X.01J r5 = r3.AQh     // Catch:{ all -> 0x2544 }
            java.lang.Object r24 = r5.get()     // Catch:{ all -> 0x2544 }
            r5 = r24
            X.0rz r5 = (X.C15860rz) r5     // Catch:{ all -> 0x2544 }
            r24 = r5
            X.01J r5 = r3.A33     // Catch:{ all -> 0x2544 }
            java.lang.Object r15 = r5.get()     // Catch:{ all -> 0x2544 }
            X.1Kz r15 = (X.C25751Kz) r15     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A86     // Catch:{ all -> 0x2544 }
            java.lang.Object r14 = r5.get()     // Catch:{ all -> 0x2544 }
            X.1M1 r14 = (X.AnonymousClass1M1) r14     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A34     // Catch:{ all -> 0x2544 }
            java.lang.Object r13 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0uc r13 = (X.C17150uc) r13     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A3W     // Catch:{ all -> 0x2544 }
            java.lang.Object r12 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0ue r12 = (X.C17170ue) r12     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A4w     // Catch:{ all -> 0x2544 }
            java.lang.Object r11 = r5.get()     // Catch:{ all -> 0x2544 }
            X.18c r11 = (X.C224818c) r11     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A4T     // Catch:{ all -> 0x2544 }
            java.lang.Object r10 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0yO r10 = (X.C19410yO) r10     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A6Z     // Catch:{ all -> 0x2544 }
            java.lang.Object r9 = r5.get()     // Catch:{ all -> 0x2544 }
            X.1Kw r9 = (X.C25721Kw) r9     // Catch:{ all -> 0x2544 }
            X.01J r5 = r3.A3o     // Catch:{ all -> 0x2544 }
            java.lang.Object r8 = r5.get()     // Catch:{ all -> 0x2544 }
            X.1M4 r8 = (X.AnonymousClass1M4) r8     // Catch:{ all -> 0x2544 }
            X.01J r4 = r4.A0F     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x2544 }
            X.2a9 r7 = (X.AnonymousClass2a9) r7     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A5O     // Catch:{ all -> 0x2544 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2544 }
            X.14t r5 = (X.C216114t) r5     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.ABZ     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2544 }
            X.18R r4 = (X.AnonymousClass18R) r4     // Catch:{ all -> 0x2544 }
            X.0zS r89 = r3.A1U()     // Catch:{ all -> 0x2544 }
            X.47S r104 = new X.47S     // Catch:{ all -> 0x2544 }
            r104.<init>()     // Catch:{ all -> 0x2544 }
            X.01J r3 = r3.A5v     // Catch:{ all -> 0x2544 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x2544 }
            X.0zm r3 = (X.C20270zm) r3     // Catch:{ all -> 0x2544 }
            r61 = r59
            X.30B r58 = new X.30B     // Catch:{ all -> 0x2544 }
            r60 = r46
            r62 = r55
            r63 = r47
            r64 = r54
            r65 = r50
            r66 = r49
            r67 = r34
            r68 = r22
            r69 = r15
            r70 = r13
            r71 = r12
            r72 = r40
            r74 = r33
            r75 = r42
            r76 = r11
            r77 = r41
            r78 = r32
            r79 = r45
            r80 = r57
            r81 = r7
            r82 = r14
            r83 = r37
            r84 = r3
            r85 = r35
            r86 = r24
            r87 = r44
            r88 = r48
            r90 = r52
            r91 = r5
            r92 = r38
            r94 = r39
            r95 = r10
            r96 = r31
            r97 = r56
            r99 = r51
            r100 = r4
            r103 = r36
            r107 = r8
            r108 = r9
            r109 = r53
            r110 = r43
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110)     // Catch:{ all -> 0x2544 }
            goto L_0x15aa
        L_0x1a55:
            if (r3 == 0) goto L_0x1a84
            X.1yV r10 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.KeyboardPopupLayout r9 = r0.A0z     // Catch:{ all -> 0x2544 }
            X.0sH r8 = r0.A2l     // Catch:{ all -> 0x2544 }
            r3 = r10
            X.0pP r3 = (X.C14570pP) r3     // Catch:{ all -> 0x2544 }
            X.0sq r7 = r3.A05     // Catch:{ all -> 0x2544 }
            r3 = r10
            X.0pL r3 = (X.C14530pL) r3     // Catch:{ all -> 0x2544 }
            X.0zJ r5 = r3.A00     // Catch:{ all -> 0x2544 }
            r3 = r10
            X.1yR r3 = (X.AnonymousClass1yR) r3     // Catch:{ all -> 0x2544 }
            X.2DF r3 = r3.A00     // Catch:{ all -> 0x2544 }
            X.0sG r4 = r3.A07     // Catch:{ all -> 0x2544 }
            X.309 r3 = new X.309     // Catch:{ all -> 0x2544 }
            r32 = r9
            r33 = r5
            r34 = r4
            r35 = r10
            r36 = r8
            r37 = r7
            r31 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x2544 }
            r14.add(r3)     // Catch:{ all -> 0x2544 }
        L_0x1a84:
            X.1yV r15 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = r15
            X.1yR r3 = (X.AnonymousClass1yR) r3     // Catch:{ all -> 0x2544 }
            X.2DF r3 = r3.A00     // Catch:{ all -> 0x2544 }
            X.0uY r13 = r3.A0s     // Catch:{ all -> 0x2544 }
            X.0rt r12 = r0.A2c     // Catch:{ all -> 0x2544 }
            r3 = r15
            X.0pN r3 = (X.C14550pN) r3     // Catch:{ all -> 0x2544 }
            X.0um r11 = r3.A0B     // Catch:{ all -> 0x2544 }
            X.0s5 r10 = r3.A06     // Catch:{ all -> 0x2544 }
            X.01V r9 = r3.A08     // Catch:{ all -> 0x2544 }
            X.0u3 r8 = r0.A3W     // Catch:{ all -> 0x2544 }
            X.0sH r7 = r0.A2l     // Catch:{ all -> 0x2544 }
            android.view.ViewGroup r5 = r0.A0J     // Catch:{ all -> 0x2544 }
            boolean r4 = r0.A4b     // Catch:{ all -> 0x2544 }
            X.306 r3 = new X.306     // Catch:{ all -> 0x2544 }
            r32 = r5
            r33 = r10
            r34 = r15
            r35 = r9
            r36 = r12
            r37 = r7
            r38 = r11
            r39 = r8
            r40 = r13
            r41 = r4
            r31 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x2544 }
            r14.add(r3)     // Catch:{ all -> 0x2544 }
            X.0rv r3 = r0.A33     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.UserJid r39 = com.whatsapp.jid.UserJid.of(r3)     // Catch:{ all -> 0x2544 }
            if (r39 == 0) goto L_0x1b03
            X.1yV r13 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = r13
            X.0pL r3 = (X.C14530pL) r3     // Catch:{ all -> 0x2544 }
            X.0sK r15 = r3.A01     // Catch:{ all -> 0x2544 }
            r3 = r13
            X.0pP r3 = (X.C14570pP) r3     // Catch:{ all -> 0x2544 }
            X.0sq r12 = r3.A05     // Catch:{ all -> 0x2544 }
            r3 = r13
            X.1yR r3 = (X.AnonymousClass1yR) r3     // Catch:{ all -> 0x2544 }
            X.2DF r3 = r3.A00     // Catch:{ all -> 0x2544 }
            X.0sG r11 = r3.A07     // Catch:{ all -> 0x2544 }
            X.0sP r10 = r3.A09     // Catch:{ all -> 0x2544 }
            X.1Rr r9 = r0.A2a     // Catch:{ all -> 0x2544 }
            X.0sH r8 = r0.A2l     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.KeyboardPopupLayout r7 = r0.A0z     // Catch:{ all -> 0x2544 }
            boolean r5 = r0.A4b     // Catch:{ all -> 0x2544 }
            boolean r4 = r0.A4c     // Catch:{ all -> 0x2544 }
            X.2Va r3 = new X.2Va     // Catch:{ all -> 0x2544 }
            r32 = r7
            r33 = r15
            r34 = r11
            r35 = r10
            r36 = r13
            r37 = r9
            r38 = r8
            r40 = r12
            r41 = r5
            r42 = r4
            r31 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x2544 }
            r14.add(r3)     // Catch:{ all -> 0x2544 }
        L_0x1b03:
            boolean r3 = r0.A4b     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x1b84
            r5 = 3
            X.0rt r4 = r0.A2c     // Catch:{ all -> 0x2544 }
            X.0rv r3 = r0.A33     // Catch:{ all -> 0x2544 }
            X.0sL r3 = X.C16050sL.A03(r3)     // Catch:{ all -> 0x2544 }
            int r3 = r4.A02(r3)     // Catch:{ all -> 0x2544 }
            if (r5 != r3) goto L_0x1b84
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            X.0pd r4 = r3.A0C     // Catch:{ all -> 0x2544 }
            r3 = 2433(0x981, float:3.41E-42)
            r5 = r23
            boolean r3 = r4.A0E(r5, r3)     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x1b84
            X.2ag r3 = r0.A0u     // Catch:{ all -> 0x2544 }
            X.1yV r13 = r0.A22     // Catch:{ all -> 0x2544 }
            android.view.ViewGroup r12 = r0.A0J     // Catch:{ all -> 0x2544 }
            X.2Yk r3 = r3.A00     // Catch:{ all -> 0x2544 }
            X.0sX r3 = r3.A03     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.APS     // Catch:{ all -> 0x2544 }
            java.lang.Object r11 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0xQ r11 = (X.C18890xQ) r11     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.AB3     // Catch:{ all -> 0x2544 }
            java.lang.Object r10 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0pt r10 = (X.C14870pt) r10     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.ADM     // Catch:{ all -> 0x2544 }
            java.lang.Object r9 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0uW r9 = (X.C17090uW) r9     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.AOi     // Catch:{ all -> 0x2544 }
            java.lang.Object r8 = r4.get()     // Catch:{ all -> 0x2544 }
            X.01V r8 = (X.AnonymousClass01V) r8     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A05     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0pd r7 = (X.C14710pd) r7     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.AQz     // Catch:{ all -> 0x2544 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0t9 r5 = (X.C16490t9) r5     // Catch:{ all -> 0x2544 }
            X.01J r3 = r3.AQh     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x2544 }
            X.0rz r4 = (X.C15860rz) r4     // Catch:{ all -> 0x2544 }
            X.307 r3 = new X.307     // Catch:{ all -> 0x2544 }
            r32 = r12
            r33 = r10
            r34 = r9
            r35 = r11
            r36 = r13
            r37 = r8
            r38 = r4
            r39 = r7
            r40 = r5
            r31 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x2544 }
            r14.add(r3)     // Catch:{ all -> 0x2544 }
        L_0x1b84:
            X.2VZ r3 = new X.2VZ     // Catch:{ all -> 0x2544 }
            r3.<init>(r14)     // Catch:{ all -> 0x2544 }
            r0.A1j = r3     // Catch:{ all -> 0x2544 }
            r0.A0Q()     // Catch:{ all -> 0x2544 }
            X.2VZ r3 = r0.A1j     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.307> r4 = X.AnonymousClass307.class
            java.util.Map r3 = r3.A00     // Catch:{ all -> 0x2544 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x2544 }
            X.2Vb r3 = (X.C49692Vb) r3     // Catch:{ all -> 0x2544 }
            X.307 r3 = (X.AnonymousClass307) r3     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x1bb8
            boolean r5 = r3.A03()     // Catch:{ all -> 0x2544 }
            boolean r4 = r3.A04()     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x1baf
            if (r4 == 0) goto L_0x1bab
            goto L_0x1bb5
        L_0x1bab:
            r3.A00()     // Catch:{ all -> 0x2544 }
            goto L_0x1bb8
        L_0x1baf:
            if (r4 == 0) goto L_0x1bb8
            r3.A02(r2)     // Catch:{ all -> 0x2544 }
            goto L_0x1bb8
        L_0x1bb5:
            r3.A06()     // Catch:{ all -> 0x2544 }
        L_0x1bb8:
            X.1MB r3 = r0.A3L     // Catch:{ all -> 0x2544 }
            r4 = r19
            java.util.List r4 = r4.A0V     // Catch:{ all -> 0x2544 }
            r4.add(r3)     // Catch:{ all -> 0x2544 }
            r20.A01()     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            r4 = r21
            r3.AKv(r4)     // Catch:{ all -> 0x2544 }
            X.15p r4 = r0.A3P     // Catch:{ all -> 0x2544 }
            X.0rv r3 = r0.A33     // Catch:{ all -> 0x2544 }
            int r5 = r4.A0B(r3)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            r3 = 2131365060(0x7f0a0cc4, float:1.8349975E38)
            android.view.View r3 = X.AnonymousClass00T.A05(r4, r3)     // Catch:{ all -> 0x2544 }
            X.1j5 r4 = new X.1j5     // Catch:{ all -> 0x2544 }
            r4.<init>(r3)     // Catch:{ all -> 0x2544 }
            r0.A46 = r4     // Catch:{ all -> 0x2544 }
            X.52m r3 = new X.52m     // Catch:{ all -> 0x2544 }
            r3.<init>(r0, r5)     // Catch:{ all -> 0x2544 }
            r4.A05(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A37     // Catch:{ all -> 0x2544 }
            android.text.Editable r3 = r3.getText()     // Catch:{ all -> 0x2544 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x1c07
            boolean r3 = r0.A0u(r5)     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x1c07
            r0.A0T(r5)     // Catch:{ all -> 0x2544 }
            X.1j5 r3 = r0.A46     // Catch:{ all -> 0x2544 }
            r3.A03(r2)     // Catch:{ all -> 0x2544 }
        L_0x1c07:
            X.46U r49 = new X.46U     // Catch:{ all -> 0x2544 }
            r49.<init>()     // Catch:{ all -> 0x2544 }
            X.1yV r14 = r0.A22     // Catch:{ all -> 0x2544 }
            r13 = r14
            com.obwhatsapp.Conversation r13 = (com.obwhatsapp.Conversation) r13     // Catch:{ all -> 0x2544 }
            X.0pd r3 = r13.A0C     // Catch:{ all -> 0x2544 }
            r57 = r3
            r7 = r14
            X.0pN r7 = (X.C14550pN) r7     // Catch:{ all -> 0x2544 }
            X.0pt r3 = r7.A05     // Catch:{ all -> 0x2544 }
            r35 = r3
            r5 = r14
            X.0pL r5 = (X.C14530pL) r5     // Catch:{ all -> 0x2544 }
            X.1Ai r3 = r5.A0B     // Catch:{ all -> 0x2544 }
            r67 = r3
            X.0sK r3 = r5.A01     // Catch:{ all -> 0x2544 }
            r36 = r3
            X.10X r3 = r0.A13     // Catch:{ all -> 0x2544 }
            r37 = r3
            X.0sb r3 = r13.A04     // Catch:{ all -> 0x2544 }
            r34 = r3
            r3 = r14
            X.1yR r3 = (X.AnonymousClass1yR) r3     // Catch:{ all -> 0x2544 }
            X.2DF r4 = r3.A00     // Catch:{ all -> 0x2544 }
            X.0t9 r3 = r4.A0W     // Catch:{ all -> 0x2544 }
            r58 = r3
            X.0s5 r3 = r7.A06     // Catch:{ all -> 0x2544 }
            r38 = r3
            X.1KE r3 = r0.A1L     // Catch:{ all -> 0x2544 }
            r43 = r3
            X.0tb r3 = r4.A03     // Catch:{ all -> 0x2544 }
            r39 = r3
            X.1KX r3 = r0.A1J     // Catch:{ all -> 0x2544 }
            r42 = r3
            X.0pf r3 = r5.A06     // Catch:{ all -> 0x2544 }
            r56 = r3
            X.1P7 r3 = r0.A34     // Catch:{ all -> 0x2544 }
            r60 = r3
            X.1Lg r3 = r0.A1P     // Catch:{ all -> 0x2544 }
            r45 = r3
            X.1A9 r3 = r0.A3z     // Catch:{ all -> 0x2544 }
            r68 = r3
            X.01V r3 = r7.A08     // Catch:{ all -> 0x2544 }
            r53 = r3
            X.01Y r3 = r0.A1Q     // Catch:{ all -> 0x2544 }
            r46 = r3
            X.1DX r3 = r0.A3Q     // Catch:{ all -> 0x2544 }
            r64 = r3
            X.12W r3 = r0.A2F     // Catch:{ all -> 0x2544 }
            r52 = r3
            X.19Y r3 = r4.A06     // Catch:{ all -> 0x2544 }
            r31 = r3
            X.0sj r3 = r4.A0M     // Catch:{ all -> 0x2544 }
            r24 = r3
            X.0rz r3 = r7.A09     // Catch:{ all -> 0x2544 }
            r22 = r3
            X.1Kz r3 = r0.A1E     // Catch:{ all -> 0x2544 }
            r21 = r3
            X.0uc r3 = r4.A04     // Catch:{ all -> 0x2544 }
            r20 = r3
            X.0yW r3 = r5.A0A     // Catch:{ all -> 0x2544 }
            r19 = r3
            X.0u3 r15 = r0.A3W     // Catch:{ all -> 0x2544 }
            X.0yi r12 = r4.A0J     // Catch:{ all -> 0x2544 }
            X.4xk r11 = new X.4xk     // Catch:{ all -> 0x2544 }
            r11.<init>(r13)     // Catch:{ all -> 0x2544 }
            X.0rv r10 = r0.A33     // Catch:{ all -> 0x2544 }
            boolean r9 = r0.A4Y     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r8 = r0.A37     // Catch:{ all -> 0x2544 }
            X.3Q5 r7 = r0.A3N     // Catch:{ all -> 0x2544 }
            X.1M5 r5 = r0.A3O     // Catch:{ all -> 0x2544 }
            X.1ME r4 = r0.A1O     // Catch:{ all -> 0x2544 }
            X.2jf r3 = new X.2jf     // Catch:{ all -> 0x2544 }
            r33 = r13
            r32 = r13
            r40 = r21
            r41 = r20
            r44 = r4
            r47 = r31
            r48 = r14
            r50 = r12
            r51 = r11
            r54 = r24
            r55 = r22
            r59 = r10
            r61 = r8
            r62 = r7
            r63 = r5
            r65 = r15
            r66 = r19
            r69 = r9
            r31 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)     // Catch:{ all -> 0x2544 }
            r0.A1i = r3     // Catch:{ all -> 0x2544 }
            r4 = r113
            r4.add(r3)     // Catch:{ all -> 0x2544 }
            java.util.Set r12 = r0.A5F     // Catch:{ all -> 0x2544 }
            X.2jf r3 = r0.A1i     // Catch:{ all -> 0x2544 }
            r12.add(r3)     // Catch:{ all -> 0x2544 }
            java.util.Set r4 = r0.A5I     // Catch:{ all -> 0x2544 }
            X.2jf r3 = r0.A1i     // Catch:{ all -> 0x2544 }
            r4.add(r3)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = 2131363305(0x7f0a05e9, float:1.8346415E38)
            android.view.View r13 = r4.findViewById(r3)     // Catch:{ all -> 0x2544 }
            if (r13 == 0) goto L_0x1d8a
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            X.0pd r4 = r3.A0C     // Catch:{ all -> 0x2544 }
            r3 = 1416(0x588, float:1.984E-42)
            r5 = r23
            boolean r3 = r4.A0E(r5, r3)     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x1d8a
            X.2aa r3 = r0.A0o     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r4 = r0.A37     // Catch:{ all -> 0x2544 }
            r19 = r4
            X.0rv r15 = r0.A33     // Catch:{ all -> 0x2544 }
            X.2Yk r3 = r3.A00     // Catch:{ all -> 0x2544 }
            X.2Rg r4 = r3.A01     // Catch:{ all -> 0x2544 }
            android.app.Activity r14 = r4.A1p     // Catch:{ all -> 0x2544 }
            X.0sX r3 = r3.A03     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.ALc     // Catch:{ all -> 0x2544 }
            java.lang.Object r11 = r4.get()     // Catch:{ all -> 0x2544 }
            X.10X r11 = (X.AnonymousClass10X) r11     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.AB3     // Catch:{ all -> 0x2544 }
            java.lang.Object r10 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0pt r10 = (X.C14870pt) r10     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.AQe     // Catch:{ all -> 0x2544 }
            java.lang.Object r9 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0sj r9 = (X.C16260sj) r9     // Catch:{ all -> 0x2544 }
            X.0vv r41 = X.C16150sX.A0r(r3)     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A4x     // Catch:{ all -> 0x2544 }
            java.lang.Object r8 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0sG r8 = (X.C16000sG) r8     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.AQ9     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0sP r7 = (X.C16080sP) r7     // Catch:{ all -> 0x2544 }
            X.01J r4 = r3.A7e     // Catch:{ all -> 0x2544 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2544 }
            X.0um r5 = (X.C17250um) r5     // Catch:{ all -> 0x2544 }
            X.01J r3 = r3.AQz     // Catch:{ all -> 0x2544 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x2544 }
            X.0t9 r4 = (X.C16490t9) r4     // Catch:{ all -> 0x2544 }
            X.4v1 r3 = new X.4v1     // Catch:{ all -> 0x2544 }
            r32 = r14
            r33 = r10
            r34 = r11
            r35 = r8
            r36 = r7
            r37 = r9
            r38 = r5
            r39 = r4
            r40 = r15
            r42 = r19
            r31 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x2544 }
            X.2ab r4 = r0.A0p     // Catch:{ all -> 0x2544 }
            X.2Yk r4 = r4.A00     // Catch:{ all -> 0x2544 }
            X.2Rg r5 = r4.A01     // Catch:{ all -> 0x2544 }
            android.app.Activity r8 = r5.A1p     // Catch:{ all -> 0x2544 }
            X.0sX r4 = r4.A03     // Catch:{ all -> 0x2544 }
            X.01J r5 = r4.AP2     // Catch:{ all -> 0x2544 }
            java.lang.Object r7 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0t3 r7 = (X.C16440t3) r7     // Catch:{ all -> 0x2544 }
            X.01J r5 = r4.AQz     // Catch:{ all -> 0x2544 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x2544 }
            X.0t9 r5 = (X.C16490t9) r5     // Catch:{ all -> 0x2544 }
            X.0vv r36 = X.C16150sX.A0r(r4)     // Catch:{ all -> 0x2544 }
            X.4kL r4 = new X.4kL     // Catch:{ all -> 0x2544 }
            r31 = r4
            r32 = r8
            r33 = r3
            r34 = r7
            r35 = r5
            r31.<init>(r32, r33, r34, r35, r36)     // Catch:{ all -> 0x2544 }
            r13.setOnDragListener(r4)     // Catch:{ all -> 0x2544 }
            r12.add(r3)     // Catch:{ all -> 0x2544 }
        L_0x1d8a:
            X.46b r36 = new X.46b     // Catch:{ all -> 0x2544 }
            r36.<init>()     // Catch:{ all -> 0x2544 }
            X.0rv r13 = r0.A33     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r11 = r4
            com.obwhatsapp.Conversation r11 = (com.obwhatsapp.Conversation) r11     // Catch:{ all -> 0x2544 }
            r3 = r4
            X.0pN r3 = (X.C14550pN) r3     // Catch:{ all -> 0x2544 }
            X.0pt r10 = r3.A05     // Catch:{ all -> 0x2544 }
            X.0pP r4 = (X.C14570pP) r4     // Catch:{ all -> 0x2544 }
            X.0sq r9 = r4.A05     // Catch:{ all -> 0x2544 }
            X.01V r8 = r3.A08     // Catch:{ all -> 0x2544 }
            X.0se r7 = r0.A3e     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n     // Catch:{ all -> 0x2544 }
            r3 = 37
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r5 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6     // Catch:{ all -> 0x2544 }
            r5.<init>(r4, r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.KeyboardPopupLayout r4 = r0.A0z     // Catch:{ all -> 0x2544 }
            X.3hW r3 = new X.3hW     // Catch:{ all -> 0x2544 }
            r34 = r11
            r32 = r11
            r33 = r4
            r35 = r10
            r37 = r8
            r38 = r13
            r39 = r7
            r40 = r17
            r41 = r9
            r42 = r5
            r31 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x2544 }
            r0.A2E = r3     // Catch:{ all -> 0x2544 }
            r4 = r113
            r4.add(r3)     // Catch:{ all -> 0x2544 }
            X.3hW r3 = r0.A2E     // Catch:{ all -> 0x2544 }
            X.3Ek r3 = r3.A02     // Catch:{ all -> 0x2544 }
            r12.add(r3)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = r25
            r4.AKw(r3)     // Catch:{ all -> 0x2544 }
            java.util.Iterator r7 = r113.iterator()     // Catch:{ all -> 0x2544 }
        L_0x1de2:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x1df8
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x2544 }
            android.app.Application$ActivityLifecycleCallbacks r5 = (android.app.Application.ActivityLifecycleCallbacks) r5     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            r3 = r18
            r5.onActivityCreated(r4, r3)     // Catch:{ all -> 0x2544 }
            goto L_0x1de2
        L_0x1df8:
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = r25
            r4.AKv(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r3 = r0.A1n     // Catch:{ all -> 0x2544 }
            X.2Qa r7 = r3.getConversationCursorAdapter()     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            android.content.res.Resources r4 = r3.getResources()     // Catch:{ all -> 0x2544 }
            r3 = 2131165832(0x7f070288, float:1.7945892E38)
            int r5 = r4.getDimensionPixelSize(r3)     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            android.content.res.Resources r4 = r3.getResources()     // Catch:{ all -> 0x2544 }
            r3 = 2131165831(0x7f070287, float:1.794589E38)
            int r3 = r4.getDimensionPixelSize(r3)     // Catch:{ all -> 0x2544 }
            int r5 = r5 << 1
            int r5 = r5 + r3
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            android.content.res.Resources r4 = r3.getResources()     // Catch:{ all -> 0x2544 }
            r3 = 2131166513(0x7f070531, float:1.7947273E38)
            int r3 = r4.getDimensionPixelSize(r3)     // Catch:{ all -> 0x2544 }
            int r5 = r5 + r3
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics     // Catch:{ all -> 0x2544 }
            r4.<init>()     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch:{ all -> 0x2544 }
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch:{ all -> 0x2544 }
            r3.getMetrics(r4)     // Catch:{ all -> 0x2544 }
            int r4 = r4.widthPixels     // Catch:{ all -> 0x2544 }
            r3 = 0
            if (r4 <= r5) goto L_0x1e48
            r3 = 1
        L_0x1e48:
            r7.A0E = r3     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            X.0pd r5 = r3.A0C     // Catch:{ all -> 0x2544 }
            r4 = 1766(0x6e6, float:2.475E-42)
            r3 = r23
            boolean r3 = r5.A0E(r3, r4)     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x1ef8
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            r3 = 2131361935(0x7f0a008f, float:1.8343636E38)
            android.view.View r3 = X.AnonymousClass00T.A05(r4, r3)     // Catch:{ all -> 0x2544 }
            r0.A06 = r3     // Catch:{ all -> 0x2544 }
            X.AnonymousClass2JP.A02(r3)     // Catch:{ all -> 0x2544 }
            android.view.View r5 = r0.A06     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = 2131893276(0x7f121c1c, float:1.9421324E38)
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x2544 }
            r5.setContentDescription(r3)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            r3 = 2131361936(0x7f0a0090, float:1.8343638E38)
            X.AnonymousClass00T.A05(r4, r3)     // Catch:{ all -> 0x2544 }
            X.0sH r4 = r0.A2l     // Catch:{ all -> 0x2544 }
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r9 = r4.A08(r3)     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ all -> 0x2544 }
            X.0sH r3 = r0.A2l     // Catch:{ all -> 0x2544 }
            boolean r3 = r3.A0H()     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x1ef8
            if (r9 == 0) goto L_0x1ef8
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            r8 = r3
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            X.0pP r3 = (X.C14570pP) r3     // Catch:{ all -> 0x2544 }
            X.0sq r7 = r3.A05     // Catch:{ all -> 0x2544 }
            X.1Gf r5 = r0.A1G     // Catch:{ all -> 0x2544 }
            X.0ue r4 = r0.A1K     // Catch:{ all -> 0x2544 }
            X.2Xb r3 = new X.2Xb     // Catch:{ all -> 0x2544 }
            r3.<init>(r5, r4, r9, r7)     // Catch:{ all -> 0x2544 }
            X.2ad r4 = r0.A0r     // Catch:{ all -> 0x2544 }
            X.4mH r5 = new X.4mH     // Catch:{ all -> 0x2544 }
            r5.<init>(r4, r3)     // Catch:{ all -> 0x2544 }
            X.02z r4 = new X.02z     // Catch:{ all -> 0x2544 }
            r4.<init>((X.AnonymousClass04o) r5, (X.C001500q) r8)     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.2XB> r3 = X.AnonymousClass2XB.class
            X.01n r3 = r4.A01(r3)     // Catch:{ all -> 0x2544 }
            X.2XB r3 = (X.AnonymousClass2XB) r3     // Catch:{ all -> 0x2544 }
            r0.A1D = r3     // Catch:{ all -> 0x2544 }
            X.027 r7 = r3.A00     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 173(0xad, float:2.42E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r3 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r3.<init>((java.lang.Object) r0, (int) r4)     // Catch:{ all -> 0x2544 }
            r7.A0A(r5, r3)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            X.2SO r4 = r0.A0w     // Catch:{ all -> 0x2544 }
            X.3De r3 = new X.3De     // Catch:{ all -> 0x2544 }
            r3.<init>(r4, r9)     // Catch:{ all -> 0x2544 }
            X.02z r4 = new X.02z     // Catch:{ all -> 0x2544 }
            r4.<init>((X.AnonymousClass04o) r3, (X.C001500q) r5)     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.2XA> r3 = X.AnonymousClass2XA.class
            X.01n r3 = r4.A01(r3)     // Catch:{ all -> 0x2544 }
            X.2XA r3 = (X.AnonymousClass2XA) r3     // Catch:{ all -> 0x2544 }
            r0.A1H = r3     // Catch:{ all -> 0x2544 }
            X.027 r7 = r3.A00     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 169(0xa9, float:2.37E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r3 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r3.<init>((java.lang.Object) r0, (int) r4)     // Catch:{ all -> 0x2544 }
            r7.A0A(r5, r3)     // Catch:{ all -> 0x2544 }
        L_0x1ef8:
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            r3 = 2131365899(0x7f0a100b, float:1.8351676E38)
            android.view.View r3 = X.AnonymousClass00T.A05(r4, r3)     // Catch:{ all -> 0x2544 }
            com.OM7753.GOLD.AOS(r4, r0, r3)     // Catch:{ all -> 0x2544 }
            X.1j5 r4 = new X.1j5     // Catch:{ all -> 0x2544 }
            r4.<init>(r3)     // Catch:{ all -> 0x2544 }
            r0.A47 = r4     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxIListenerShape256S0100000_2_I0 r3 = new com.facebook.redex.IDxIListenerShape256S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r3.<init>((X.C42821yj) r0, (int) r6)     // Catch:{ all -> 0x2544 }
            r4.A05(r3)     // Catch:{ all -> 0x2544 }
            r0.A0o(r6)     // Catch:{ all -> 0x2544 }
            X.1j5 r5 = r0.A47     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            r3 = 2131364836(0x7f0a0be4, float:1.834952E38)
            android.view.View r3 = X.AnonymousClass00T.A05(r4, r3)     // Catch:{ all -> 0x2544 }
            X.1j5 r4 = new X.1j5     // Catch:{ all -> 0x2544 }
            r4.<init>(r3)     // Catch:{ all -> 0x2544 }
            r0.A48 = r4     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxIListenerShape256S0100000_2_I0 r3 = new com.facebook.redex.IDxIListenerShape256S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r3.<init>((X.C42821yj) r0, (int) r2)     // Catch:{ all -> 0x2544 }
            r4.A05(r3)     // Catch:{ all -> 0x2544 }
            X.1j5 r5 = r0.A48     // Catch:{ all -> 0x2544 }
            r4 = 41
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r3 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2     // Catch:{ all -> 0x2544 }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x2544 }
            r5.A04(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r3 = r0.A1n     // Catch:{ all -> 0x2544 }
            r3.setScrollbarFadingEnabled(r6)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n     // Catch:{ all -> 0x2544 }
            android.widget.AbsListView$OnScrollListener r3 = r0.A4w     // Catch:{ all -> 0x2544 }
            r4.setOnScrollListener(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A37     // Catch:{ all -> 0x2544 }
            r3.setScrollbarFadingEnabled(r6)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r4 = r0.A37     // Catch:{ all -> 0x2544 }
            android.text.TextWatcher r3 = r0.A4s     // Catch:{ all -> 0x2544 }
            r4.addTextChangedListener(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r4 = r0.A37     // Catch:{ all -> 0x2544 }
            android.text.TextWatcher r3 = r0.A4q     // Catch:{ all -> 0x2544 }
            r4.addTextChangedListener(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r4 = r0.A37     // Catch:{ all -> 0x2544 }
            android.widget.TextView$OnEditorActionListener r3 = r0.A4x     // Catch:{ all -> 0x2544 }
            r4.setOnEditorActionListener(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r4 = r0.A37     // Catch:{ all -> 0x2544 }
            android.view.View$OnClickListener r3 = r0.A4u     // Catch:{ all -> 0x2544 }
            r4.setOnClickListener(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r4 = r0.A37     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pN r3 = (X.C14550pN) r3     // Catch:{ all -> 0x2544 }
            X.0rz r3 = r3.A09     // Catch:{ all -> 0x2544 }
            boolean r3 = r3.A1W()     // Catch:{ all -> 0x2544 }
            r4.setInputEnterSend(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r4 = r0.A37     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxKListenerShape254S0100000_2_I0 r3 = new com.facebook.redex.IDxKListenerShape254S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r3.<init>(r0, r6)     // Catch:{ all -> 0x2544 }
            r4.setOnKeyListener(r3)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r5 = r0.A0S     // Catch:{ all -> 0x2544 }
            r4 = 40
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r3 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2     // Catch:{ all -> 0x2544 }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x2544 }
            r5.setOnClickListener(r3)     // Catch:{ all -> 0x2544 }
            r3 = 45
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r4 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2     // Catch:{ all -> 0x2544 }
            r4.<init>(r0, r3)     // Catch:{ all -> 0x2544 }
            r3 = r16
            r3.setOnClickListener(r4)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A37     // Catch:{ all -> 0x2544 }
            android.text.Editable r3 = r3.getText()     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r7 = r0.A0S     // Catch:{ all -> 0x2544 }
            boolean r4 = X.AnonymousClass1ZW.A0E(r5)     // Catch:{ all -> 0x2544 }
            r3 = 0
            if (r4 != 0) goto L_0x1fb2
            r3 = 1
        L_0x1fb2:
            r7.setEnabled(r3)     // Catch:{ all -> 0x2544 }
            boolean r3 = X.AnonymousClass1ZW.A0E(r5)     // Catch:{ all -> 0x2544 }
            if (r3 != 0) goto L_0x1fd7
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pP r3 = (X.C14570pP) r3     // Catch:{ all -> 0x2544 }
            X.0yX r7 = r3.A04     // Catch:{ all -> 0x2544 }
            r4 = 703934026(0x29f52e4a, float:1.08882155E-13)
            r3 = r26
            r7.AKj(r4, r3, r6)     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pP r3 = (X.C14570pP) r3     // Catch:{ all -> 0x2544 }
            X.0yX r7 = r3.A04     // Catch:{ all -> 0x2544 }
            r4 = 703926750(0x29f511de, float:1.0883285E-13)
            r3 = r26
            r7.AKj(r4, r3, r6)     // Catch:{ all -> 0x2544 }
        L_0x1fd7:
            X.1M9 r3 = r0.A3k     // Catch:{ all -> 0x2544 }
            r3.A00()     // Catch:{ all -> 0x2544 }
            X.1M9 r3 = r0.A3k     // Catch:{ all -> 0x2544 }
            boolean r3 = r3.A00     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x2030
            X.1yV r7 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r7 = (com.obwhatsapp.Conversation) r7     // Catch:{ all -> 0x2544 }
            X.1M7 r4 = r0.A3n     // Catch:{ all -> 0x2544 }
            X.4mG r3 = new X.4mG     // Catch:{ all -> 0x2544 }
            r3.<init>(r4)     // Catch:{ all -> 0x2544 }
            X.02z r4 = new X.02z     // Catch:{ all -> 0x2544 }
            r4.<init>((X.AnonymousClass04o) r3, (X.C001500q) r7)     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.1Mo> r3 = X.C26161Mo.class
            X.01n r8 = r4.A01(r3)     // Catch:{ all -> 0x2544 }
            X.1Mo r8 = (X.C26161Mo) r8     // Catch:{ all -> 0x2544 }
            r0.A3l = r8     // Catch:{ all -> 0x2544 }
            X.1wf r3 = r0.A3p     // Catch:{ all -> 0x2544 }
            r3.A01 = r8     // Catch:{ all -> 0x2544 }
            X.1yV r7 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = r7
            X.0pN r3 = (X.C14550pN) r3     // Catch:{ all -> 0x2544 }
            X.0pt r4 = r3.A05     // Catch:{ all -> 0x2544 }
            X.4Rd r3 = new X.4Rd     // Catch:{ all -> 0x2544 }
            r3.<init>(r4, r8)     // Catch:{ all -> 0x2544 }
            r0.A3m = r3     // Catch:{ all -> 0x2544 }
            X.1yR r7 = (X.AnonymousClass1yR) r7     // Catch:{ all -> 0x2544 }
            X.2DF r3 = r7.A00     // Catch:{ all -> 0x2544 }
            X.1BQ r3 = r3.A0V     // Catch:{ all -> 0x2544 }
            r3.A01()     // Catch:{ all -> 0x2544 }
            boolean r3 = X.AnonymousClass1ZW.A0E(r5)     // Catch:{ all -> 0x2544 }
            if (r3 != 0) goto L_0x2030
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r3 = (X.AnonymousClass1yR) r3     // Catch:{ all -> 0x2544 }
            X.2DF r3 = r3.A00     // Catch:{ all -> 0x2544 }
            X.1BQ r3 = r3.A0V     // Catch:{ all -> 0x2544 }
            boolean r3 = r3.A02     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x2030
            X.4Rd r4 = r0.A3m     // Catch:{ all -> 0x2544 }
            r3 = 500(0x1f4, float:7.0E-43)
            r4.A00(r5, r3)     // Catch:{ all -> 0x2544 }
        L_0x2030:
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            r3 = 2131363403(0x7f0a064b, float:1.8346614E38)
            android.view.View r5 = X.AnonymousClass00T.A05(r4, r3)     // Catch:{ all -> 0x2544 }
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            java.lang.String r15 = "emojiPopup"
            r3.AKw(r15)     // Catch:{ all -> 0x2544 }
            X.1Mn r11 = r0.A2u     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            r11.A00 = r3     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.KeyboardPopupLayout r4 = r0.A0z     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A37     // Catch:{ all -> 0x2544 }
            r11.A02 = r4     // Catch:{ all -> 0x2544 }
            r11.A01 = r5     // Catch:{ all -> 0x2544 }
            r11.A03 = r3     // Catch:{ all -> 0x2544 }
            X.1MJ r3 = r0.A2Z     // Catch:{ all -> 0x2544 }
            X.4OB r4 = r3.A00()     // Catch:{ all -> 0x2544 }
            r11.A05 = r4     // Catch:{ all -> 0x2544 }
            X.1Li r7 = r3.A0B     // Catch:{ all -> 0x2544 }
            X.1Lk r5 = r3.A0C     // Catch:{ all -> 0x2544 }
            X.1MH r10 = r3.A05     // Catch:{ all -> 0x2544 }
            X.3Fe r4 = new X.3Fe     // Catch:{ all -> 0x2544 }
            r4.<init>(r10, r7, r5)     // Catch:{ all -> 0x2544 }
            r11.A06 = r4     // Catch:{ all -> 0x2544 }
            X.1Mo r9 = r0.A3l     // Catch:{ all -> 0x2544 }
            X.1wf r4 = r0.A3p     // Catch:{ all -> 0x2544 }
            X.39R r4 = r3.A01(r9, r4)     // Catch:{ all -> 0x2544 }
            r11.A07 = r4     // Catch:{ all -> 0x2544 }
            X.1CX r8 = r3.A0J     // Catch:{ all -> 0x2544 }
            X.1MF r7 = r3.A0H     // Catch:{ all -> 0x2544 }
            X.1MG r5 = r3.A0L     // Catch:{ all -> 0x2544 }
            X.1M9 r4 = r3.A0K     // Catch:{ all -> 0x2544 }
            X.2Jp r3 = new X.2Jp     // Catch:{ all -> 0x2544 }
            r20 = r10
            r21 = r7
            r22 = r8
            r23 = r4
            r24 = r9
            r25 = r5
            r19 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x2544 }
            r11.A04 = r3     // Catch:{ all -> 0x2544 }
            X.2Jn r4 = r11.A00()     // Catch:{ all -> 0x2544 }
            r0.A2v = r4     // Catch:{ all -> 0x2544 }
            X.1M4 r3 = r0.A3x     // Catch:{ all -> 0x2544 }
            r4.A0D = r3     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r3 = (X.AnonymousClass1yR) r3     // Catch:{ all -> 0x2544 }
            X.2DF r3 = r3.A00     // Catch:{ all -> 0x2544 }
            android.widget.PopupWindow$OnDismissListener r3 = r3.A00     // Catch:{ all -> 0x2544 }
            r4.setOnDismissListener(r3)     // Catch:{ all -> 0x2544 }
            X.1Li r3 = r0.A2x     // Catch:{ all -> 0x2544 }
            r20 = r3
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = r4
            X.0pL r3 = (X.C14530pL) r3     // Catch:{ all -> 0x2544 }
            X.1Ai r3 = r3.A0B     // Catch:{ all -> 0x2544 }
            r19 = r3
            r3 = r4
            X.1yR r3 = (X.AnonymousClass1yR) r3     // Catch:{ all -> 0x2544 }
            X.2DF r3 = r3.A00     // Catch:{ all -> 0x2544 }
            X.0t9 r3 = r3.A0W     // Catch:{ all -> 0x2544 }
            r17 = r3
            r3 = r4
            X.0pN r3 = (X.C14550pN) r3     // Catch:{ all -> 0x2544 }
            X.01V r3 = r3.A08     // Catch:{ all -> 0x2544 }
            r16 = r3
            X.1Lk r14 = r0.A2z     // Catch:{ all -> 0x2544 }
            r3 = 2131363863(0x7f0a0817, float:1.8347547E38)
            android.view.View r13 = r4.findViewById(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.gifsearch.GifSearchContainer r13 = (com.obwhatsapp.gifsearch.GifSearchContainer) r13     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = r4
            X.0pN r3 = (X.C14550pN) r3     // Catch:{ all -> 0x2544 }
            X.0rz r12 = r3.A09     // Catch:{ all -> 0x2544 }
            r3 = 2131363408(0x7f0a0650, float:1.8346624E38)
            android.view.View r11 = r4.findViewById(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.emoji.search.EmojiSearchContainer r11 = (com.obwhatsapp.emoji.search.EmojiSearchContainer) r11     // Catch:{ all -> 0x2544 }
            X.2Jn r10 = r0.A2v     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            r9 = r3
            com.obwhatsapp.Conversation r9 = (com.obwhatsapp.Conversation) r9     // Catch:{ all -> 0x2544 }
            X.0pN r3 = (X.C14550pN) r3     // Catch:{ all -> 0x2544 }
            X.0um r8 = r3.A0B     // Catch:{ all -> 0x2544 }
            X.11d r7 = r0.A2q     // Catch:{ all -> 0x2544 }
            X.013 r5 = r0.A2L     // Catch:{ all -> 0x2544 }
            X.0u3 r4 = r0.A3W     // Catch:{ all -> 0x2544 }
            X.2Jm r3 = new X.2Jm     // Catch:{ all -> 0x2544 }
            r32 = r9
            r33 = r16
            r34 = r12
            r35 = r5
            r36 = r7
            r37 = r8
            r38 = r11
            r39 = r17
            r40 = r10
            r41 = r20
            r42 = r13
            r43 = r14
            r44 = r4
            r45 = r19
            r31 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x2544 }
            r0.A2w = r3     // Catch:{ all -> 0x2544 }
            X.3H7 r3 = r0.A3T     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            X.2Jn r7 = r0.A2v     // Catch:{ all -> 0x2544 }
            r3.A02 = r8     // Catch:{ all -> 0x2544 }
            r3.A00 = r7     // Catch:{ all -> 0x2544 }
            r7.A03 = r3     // Catch:{ all -> 0x2544 }
            X.5RN r3 = r0.A4z     // Catch:{ all -> 0x2544 }
            r7.A0C(r3)     // Catch:{ all -> 0x2544 }
            r4 = 44
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r3 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6     // Catch:{ all -> 0x2544 }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x2544 }
            r7.A0E = r3     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxICheckerShape379S0100000_2_I0 r3 = new com.facebook.redex.IDxICheckerShape379S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x2544 }
            r7.A0A = r3     // Catch:{ all -> 0x2544 }
            X.5QT r5 = r0.A5B     // Catch:{ all -> 0x2544 }
            r7.A0J(r5)     // Catch:{ all -> 0x2544 }
            r8.AKv(r15)     // Catch:{ all -> 0x2544 }
            X.2Jm r4 = r0.A2w     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            r4.A00 = r3     // Catch:{ all -> 0x2544 }
            r4.A00 = r3     // Catch:{ all -> 0x2544 }
            X.3H7 r4 = r0.A3T     // Catch:{ all -> 0x2544 }
            com.facebook.redex.IDxSListenerShape430S0100000_2_I0 r3 = new com.facebook.redex.IDxSListenerShape430S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x2544 }
            r4.A01 = r3     // Catch:{ all -> 0x2544 }
            r4.A04 = r5     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.mentions.MentionableEntry r3 = r0.A37     // Catch:{ all -> 0x2544 }
            X.AnonymousClass1UP.A05(r3)     // Catch:{ all -> 0x2544 }
            X.15A r4 = r0.A4H     // Catch:{ all -> 0x2544 }
            X.0y9 r3 = r0.A5D     // Catch:{ all -> 0x2544 }
            r4.A02(r3)     // Catch:{ all -> 0x2544 }
            X.1B2 r4 = r0.A4E     // Catch:{ all -> 0x2544 }
            X.2h7 r3 = r0.A5C     // Catch:{ all -> 0x2544 }
            r4.A02(r3)     // Catch:{ all -> 0x2544 }
            X.1B3 r4 = r0.A1y     // Catch:{ all -> 0x2544 }
            X.2e4 r3 = r0.A52     // Catch:{ all -> 0x2544 }
            r4.A02(r3)     // Catch:{ all -> 0x2544 }
            X.1Lv r4 = r0.A4C     // Catch:{ all -> 0x2544 }
            X.4E8 r3 = r0.A55     // Catch:{ all -> 0x2544 }
            r4.A02(r3)     // Catch:{ all -> 0x2544 }
            X.1GP r4 = r0.A3I     // Catch:{ all -> 0x2544 }
            X.4PY r3 = r0.A58     // Catch:{ all -> 0x2544 }
            r4.A02(r3)     // Catch:{ all -> 0x2544 }
            X.13V r4 = r0.A1F     // Catch:{ all -> 0x2544 }
            X.22h r3 = r0.A50     // Catch:{ all -> 0x2544 }
            r4.A02(r3)     // Catch:{ all -> 0x2544 }
            X.14W r4 = r0.A3i     // Catch:{ all -> 0x2544 }
            X.1we r3 = r0.A5A     // Catch:{ all -> 0x2544 }
            r4.A02(r3)     // Catch:{ all -> 0x2544 }
            X.1wf r3 = r0.A3p     // Catch:{ all -> 0x2544 }
            X.14W r4 = r3.A0A     // Catch:{ all -> 0x2544 }
            X.1we r3 = r3.A09     // Catch:{ all -> 0x2544 }
            r4.A02(r3)     // Catch:{ all -> 0x2544 }
            X.1Sp r4 = r0.A3o     // Catch:{ all -> 0x2544 }
            X.2Jl r3 = r0.A54     // Catch:{ all -> 0x2544 }
            r4.A02(r3)     // Catch:{ all -> 0x2544 }
            X.12g r4 = r0.A3K     // Catch:{ all -> 0x2544 }
            X.2Ia r3 = r0.A53     // Catch:{ all -> 0x2544 }
            r4.A02(r3)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r3 = r0.A3t     // Catch:{ all -> 0x2544 }
            X.027 r7 = r3.A01     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            r4 = 172(0xac, float:2.41E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r3 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r3.<init>((java.lang.Object) r0, (int) r4)     // Catch:{ all -> 0x2544 }
            r7.A0A(r5, r3)     // Catch:{ all -> 0x2544 }
            boolean r3 = X.C18900xR.A00()     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x21fd
            java.lang.String r3 = "conversation/device-not-supported"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment r3 = new com.obwhatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment     // Catch:{ all -> 0x2544 }
            r3.<init>()     // Catch:{ all -> 0x2544 }
            r4.Afc(r3)     // Catch:{ all -> 0x2544 }
        L_0x21c5:
            X.1kZ r5 = r0.A2C     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            X.1mM r7 = r1.A05     // Catch:{ all -> 0x2544 }
            X.1LD r3 = r5.A0S     // Catch:{ all -> 0x2544 }
            java.util.HashMap r8 = r3.A00     // Catch:{ all -> 0x2544 }
            X.0rv r3 = r5.A0h     // Catch:{ all -> 0x2544 }
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x2544 }
            X.0tZ r8 = (X.C16740tZ) r8     // Catch:{ all -> 0x2544 }
            if (r7 == 0) goto L_0x2246
            X.0ta r8 = new X.0ta     // Catch:{ all -> 0x2544 }
            r8.<init>()     // Catch:{ all -> 0x2544 }
            java.io.File r3 = r1.A0B     // Catch:{ all -> 0x2544 }
            r8.A0F = r3     // Catch:{ all -> 0x2544 }
            X.4MB r9 = new X.4MB     // Catch:{ all -> 0x2544 }
            r9.<init>(r8, r7, r1, r5)     // Catch:{ all -> 0x2544 }
            X.0sq r7 = r5.A0u     // Catch:{ all -> 0x2544 }
            X.1A9 r3 = r5.A0l     // Catch:{ all -> 0x2544 }
            X.35x r5 = new X.35x     // Catch:{ all -> 0x2544 }
            r5.<init>(r4, r9, r3)     // Catch:{ all -> 0x2544 }
            java.io.File[] r4 = new java.io.File[r6]     // Catch:{ all -> 0x2544 }
            java.io.File r3 = r8.A0F     // Catch:{ all -> 0x2544 }
            r4[r2] = r3     // Catch:{ all -> 0x2544 }
            r7.Ack(r5, r4)     // Catch:{ all -> 0x2544 }
            goto L_0x228a
        L_0x21fd:
            X.0xR r3 = r0.A11     // Catch:{ all -> 0x2544 }
            boolean r3 = r3.A03()     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x2216
            java.lang.String r3 = "conversation/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            X.0xk r4 = r0.A3A     // Catch:{ all -> 0x2544 }
            X.0pj r3 = r0.A3C     // Catch:{ all -> 0x2544 }
            X.C46052Cd.A02(r5, r4, r3)     // Catch:{ all -> 0x2544 }
            goto L_0x21c5
        L_0x2216:
            X.0xR r3 = r0.A11     // Catch:{ all -> 0x2544 }
            boolean r3 = r3.A02()     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x222f
            java.lang.String r3 = "conversation/software-expired"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x2544 }
            X.1yV r5 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r5 = (com.obwhatsapp.Conversation) r5     // Catch:{ all -> 0x2544 }
            X.0xk r4 = r0.A3A     // Catch:{ all -> 0x2544 }
            X.0pj r3 = r0.A3C     // Catch:{ all -> 0x2544 }
            X.C46052Cd.A03(r5, r4, r3)     // Catch:{ all -> 0x2544 }
            goto L_0x21c5
        L_0x222f:
            X.1Ls r3 = r0.A15     // Catch:{ all -> 0x2544 }
            int r3 = r3.A00()     // Catch:{ all -> 0x2544 }
            if (r3 <= 0) goto L_0x21c5
            java.lang.String r3 = "conversation/software-about-to-expire"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r4 = (com.obwhatsapp.Conversation) r4     // Catch:{ all -> 0x2544 }
            r3 = 115(0x73, float:1.61E-43)
            X.AnonymousClass29T.A01(r4, r3)     // Catch:{ all -> 0x2544 }
            goto L_0x21c5
        L_0x2246:
            if (r8 == 0) goto L_0x2259
            long r3 = r8.A13     // Catch:{ all -> 0x2544 }
            X.0t6 r7 = r5.A0Z     // Catch:{ all -> 0x2288 }
            X.0th r7 = r7.A0K     // Catch:{ all -> 0x2288 }
            X.0tZ r3 = r7.A00(r3)     // Catch:{ all -> 0x2288 }
            if (r3 == 0) goto L_0x2255
            r8 = r3
        L_0x2255:
            r5.A0J(r8)     // Catch:{ all -> 0x2544 }
            goto L_0x228a
        L_0x2259:
            X.0sL r9 = r1.A09     // Catch:{ all -> 0x2544 }
            if (r9 == 0) goto L_0x2274
            X.0t3 r3 = r5.A0V     // Catch:{ all -> 0x2544 }
            long r3 = r3.A00()     // Catch:{ all -> 0x2544 }
            java.lang.String r8 = r1.A0I     // Catch:{ all -> 0x2544 }
            java.lang.String r7 = r1.A0H     // Catch:{ all -> 0x2544 }
            X.1rC r4 = X.C222617g.A00(r9, r8, r7, r3)     // Catch:{ all -> 0x2544 }
            java.lang.String r3 = ""
            r4.A0k(r3)     // Catch:{ all -> 0x2544 }
            r5.A0J(r4)     // Catch:{ all -> 0x2544 }
            goto L_0x228a
        L_0x2274:
            java.lang.Long r3 = r1.A0C     // Catch:{ all -> 0x2544 }
            if (r3 == 0) goto L_0x228a
            long r3 = r3.longValue()     // Catch:{ all -> 0x2544 }
            X.0t6 r7 = r5.A0Z     // Catch:{ all -> 0x2288 }
            X.0th r7 = r7.A0K     // Catch:{ all -> 0x2288 }
            X.0tZ r3 = r7.A00(r3)     // Catch:{ all -> 0x2288 }
            r5.A0J(r3)     // Catch:{ all -> 0x2544 }
            goto L_0x228a
        L_0x2288:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x2544 }
        L_0x228a:
            if (r115 == 0) goto L_0x229a
            java.lang.String r4 = "keyboard_visible"
            r3 = r18
            boolean r3 = r3.getBoolean(r4)     // Catch:{ all -> 0x2544 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x2544 }
            r0.A4O = r3     // Catch:{ all -> 0x2544 }
        L_0x229a:
            r28.A01()     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            X.02z r4 = new X.02z     // Catch:{ all -> 0x2544 }
            r4.<init>(r3)     // Catch:{ all -> 0x2544 }
            r3 = r27
            X.01n r3 = r4.A01(r3)     // Catch:{ all -> 0x2544 }
            X.3Q5 r3 = (X.AnonymousClass3Q5) r3     // Catch:{ all -> 0x2544 }
            r0.A3N = r3     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.conversation.ConversationListView r3 = r0.A1n     // Catch:{ all -> 0x2544 }
            X.2Qa r7 = r3.getConversationCursorAdapter()     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pQ r3 = (X.C14580pQ) r3     // Catch:{ all -> 0x2544 }
            X.2Kc r5 = r3.A01     // Catch:{ all -> 0x2544 }
            X.2T8 r4 = r5.A00     // Catch:{ all -> 0x2544 }
            X.39M r3 = r0.A28     // Catch:{ all -> 0x2544 }
            r7.A0B = r4     // Catch:{ all -> 0x2544 }
            r7.A0A = r5     // Catch:{ all -> 0x2544 }
            r7.A09 = r3     // Catch:{ all -> 0x2544 }
            android.os.Bundle r5 = r1.A04     // Catch:{ all -> 0x2544 }
            if (r5 == 0) goto L_0x2303
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x2544 }
            r0.A4O = r1     // Catch:{ all -> 0x2544 }
            boolean r1 = r0.A0s()     // Catch:{ all -> 0x2544 }
            if (r1 == 0) goto L_0x22df
            r1 = 53
            com.obwhatsapp.invites.PromptSendGroupInviteDialogFragment r3 = com.obwhatsapp.invites.PromptSendGroupInviteDialogFragment.A01(r5, r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.Afc(r3)     // Catch:{ all -> 0x2544 }
        L_0x22df:
            r1 = r30
            boolean r1 = r5.containsKey(r1)     // Catch:{ all -> 0x2544 }
            if (r1 == 0) goto L_0x2303
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1     // Catch:{ all -> 0x2544 }
            X.1fu r4 = new X.1fu     // Catch:{ all -> 0x2544 }
            r4.<init>(r1)     // Catch:{ all -> 0x2544 }
            r1 = r30
            java.lang.String r1 = r5.getString(r1)     // Catch:{ all -> 0x2544 }
            r4.A06(r1)     // Catch:{ all -> 0x2544 }
            r3 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 0
            r4.setPositiveButton(r3, r1)     // Catch:{ all -> 0x2544 }
            r4.A00()     // Catch:{ all -> 0x2544 }
        L_0x2303:
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r1 = (X.AnonymousClass1yR) r1     // Catch:{ all -> 0x2544 }
            X.2DF r1 = r1.A00     // Catch:{ all -> 0x2544 }
            X.0ul r3 = r1.A0Y     // Catch:{ all -> 0x2544 }
            X.0sH r1 = r0.A2l     // Catch:{ all -> 0x2544 }
            boolean r1 = r3.A0e(r1)     // Catch:{ all -> 0x2544 }
            if (r1 == 0) goto L_0x2342
            X.0sH r3 = r0.A2l     // Catch:{ all -> 0x2544 }
            java.lang.Class<X.0sL> r1 = X.C16050sL.class
            com.whatsapp.jid.Jid r5 = r3.A08(r1)     // Catch:{ all -> 0x2544 }
            X.0sL r5 = (X.C16050sL) r5     // Catch:{ all -> 0x2544 }
            X.AnonymousClass00B.A06(r5)     // Catch:{ all -> 0x2544 }
            X.1yV r4 = r0.A22     // Catch:{ all -> 0x2544 }
            r1 = r4
            X.1yR r1 = (X.AnonymousClass1yR) r1     // Catch:{ all -> 0x2544 }
            X.2DF r1 = r1.A00     // Catch:{ all -> 0x2544 }
            X.0ul r3 = r1.A0Y     // Catch:{ all -> 0x2544 }
            X.0sH r1 = r0.A2l     // Catch:{ all -> 0x2544 }
            boolean r3 = r3.A0f(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r1 = (X.AnonymousClass1yR) r1     // Catch:{ all -> 0x2544 }
            X.2DF r1 = r1.A00     // Catch:{ all -> 0x2544 }
            X.0sO r1 = r1.A0O     // Catch:{ all -> 0x2544 }
            boolean r1 = r1.A09(r5)     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.groupsuspend.CreateGroupSuspendDialog r1 = com.obwhatsapp.groupsuspend.CreateGroupSuspendDialog.A01(r5, r3, r1)     // Catch:{ all -> 0x2544 }
            r4.Afc(r1)     // Catch:{ all -> 0x2544 }
        L_0x2342:
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pP r1 = (X.C14570pP) r1     // Catch:{ all -> 0x2544 }
            X.0sq r5 = r1.A05     // Catch:{ all -> 0x2544 }
            X.0rv r1 = r0.A33     // Catch:{ all -> 0x2544 }
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r1)     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x235a
            r3 = 26
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r1 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3     // Catch:{ all -> 0x2544 }
            r1.<init>(r0, r3, r4)     // Catch:{ all -> 0x2544 }
            r5.Acl(r1)     // Catch:{ all -> 0x2544 }
        L_0x235a:
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            if (r4 == 0) goto L_0x2384
            X.0rt r3 = r0.A2c     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r1 = (X.AnonymousClass1yR) r1     // Catch:{ all -> 0x2544 }
            X.2DF r1 = r1.A00     // Catch:{ all -> 0x2544 }
            X.0sG r1 = r1.A07     // Catch:{ all -> 0x2544 }
            int r3 = X.C40491uD.A00(r1, r3, r4)     // Catch:{ all -> 0x2544 }
            X.013 r1 = r0.A2L     // Catch:{ all -> 0x2544 }
            java.lang.String r4 = X.C40491uD.A04(r1, r3)     // Catch:{ all -> 0x2544 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x2544 }
            if (r1 != 0) goto L_0x2384
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r3 = r1
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            X.0pN r1 = (X.C14550pN) r1     // Catch:{ all -> 0x2544 }
            X.01V r1 = r1.A08     // Catch:{ all -> 0x2544 }
            X.AnonymousClass2JP.A00(r3, r1, r4)     // Catch:{ all -> 0x2544 }
        L_0x2384:
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pN r1 = (X.C14550pN) r1     // Catch:{ all -> 0x2544 }
            X.0rz r1 = r1.A09     // Catch:{ all -> 0x2544 }
            X.01D r1 = r1.A01     // Catch:{ all -> 0x2544 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x2544 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x2544 }
            java.lang.String r1 = "ptt_fast_playback_player_state"
            int r1 = r3.getInt(r1, r2)     // Catch:{ all -> 0x2544 }
            X.AnonymousClass2DT.A0x = r1     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            android.content.Intent r4 = r1.getIntent()     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r1 = (X.AnonymousClass1yR) r1     // Catch:{ all -> 0x2544 }
            X.2DF r1 = r1.A00     // Catch:{ all -> 0x2544 }
            X.0wS r1 = r1.A0g     // Catch:{ all -> 0x2544 }
            X.19r r1 = r1.A03()     // Catch:{ all -> 0x2544 }
            X.2X2 r3 = r1.ADU()     // Catch:{ all -> 0x2544 }
            if (r3 != 0) goto L_0x2429
            java.lang.String r1 = "PAY: BrazilSMBPaymentActivity/shouldShowUpsell : paymentsMerchantUpsellHelper is null"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x2544 }
        L_0x23b7:
            X.0zl r3 = r0.A2t     // Catch:{ all -> 0x2544 }
            X.0rv r1 = r0.A33     // Catch:{ all -> 0x2544 }
            boolean r1 = X.C40561uK.A01(r3, r1)     // Catch:{ all -> 0x2544 }
            if (r1 == 0) goto L_0x23f3
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pN r1 = (X.C14550pN) r1     // Catch:{ all -> 0x2544 }
            X.0rz r1 = r1.A09     // Catch:{ all -> 0x2544 }
            X.01D r1 = r1.A01     // Catch:{ all -> 0x2544 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x2544 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x2544 }
            java.lang.String r3 = "wac_intro_shown"
            boolean r1 = r1.getBoolean(r3, r2)     // Catch:{ all -> 0x2544 }
            if (r1 != 0) goto L_0x23f3
            X.1yV r2 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.WAChatIntroBottomSheet r1 = new com.obwhatsapp.WAChatIntroBottomSheet     // Catch:{ all -> 0x2544 }
            r1.<init>()     // Catch:{ all -> 0x2544 }
            r2.Afc(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.0pN r1 = (X.C14550pN) r1     // Catch:{ all -> 0x2544 }
            X.0rz r1 = r1.A09     // Catch:{ all -> 0x2544 }
            android.content.SharedPreferences$Editor r1 = r1.A0K()     // Catch:{ all -> 0x2544 }
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r3, r6)     // Catch:{ all -> 0x2544 }
            r1.apply()     // Catch:{ all -> 0x2544 }
        L_0x23f3:
            X.2Uk r1 = r0.A1Z     // Catch:{ all -> 0x2544 }
            X.2OJ r4 = r1.A08     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            r2 = 170(0xaa, float:2.38E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>((java.lang.Object) r0, (int) r2)     // Catch:{ all -> 0x2544 }
            r4.A0A(r3, r1)     // Catch:{ all -> 0x2544 }
            X.2Uk r1 = r0.A1Z     // Catch:{ all -> 0x2544 }
            X.2OJ r4 = r1.A09     // Catch:{ all -> 0x2544 }
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3     // Catch:{ all -> 0x2544 }
            r2 = 168(0xa8, float:2.35E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>((java.lang.Object) r0, (int) r2)     // Catch:{ all -> 0x2544 }
            r4.A0A(r3, r1)     // Catch:{ all -> 0x2544 }
            X.2Uk r5 = r0.A1Z     // Catch:{ all -> 0x2544 }
            X.0rv r4 = r0.A33     // Catch:{ all -> 0x2544 }
            X.0sq r3 = r5.A0B     // Catch:{ all -> 0x2544 }
            r2 = 14
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r1 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2     // Catch:{ all -> 0x2544 }
            r1.<init>(r5, r2, r4)     // Catch:{ all -> 0x2544 }
            r3.Acl(r1)     // Catch:{ all -> 0x2544 }
            goto L_0x253c
        L_0x2429:
            if (r4 == 0) goto L_0x23b7
            java.lang.String r1 = "extra_merchant_upsell_enabled"
            boolean r1 = r4.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x2544 }
            if (r1 == 0) goto L_0x23b7
            boolean r1 = r3.A02()     // Catch:{ all -> 0x2544 }
            if (r1 == 0) goto L_0x23b7
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            X.1yR r1 = (X.AnonymousClass1yR) r1     // Catch:{ all -> 0x2544 }
            X.2DF r1 = r1.A00     // Catch:{ all -> 0x2544 }
            X.0wS r1 = r1.A0g     // Catch:{ all -> 0x2544 }
            X.19r r1 = r1.A03()     // Catch:{ all -> 0x2544 }
            X.2X2 r9 = r1.ADU()     // Catch:{ all -> 0x2544 }
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x2544 }
            X.1yV r8 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r8 = (com.obwhatsapp.Conversation) r8     // Catch:{ all -> 0x2544 }
            java.lang.String r7 = "chat"
            X.69a r5 = r9.A02     // Catch:{ all -> 0x2544 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x2544 }
            r4 = 0
            java.lang.String r1 = "merchant_upsell_prompt"
            r5.AKS(r3, r4, r1, r7)     // Catch:{ all -> 0x2544 }
            android.view.LayoutInflater r3 = r8.getLayoutInflater()     // Catch:{ all -> 0x2544 }
            r1 = 2131559392(0x7f0d03e0, float:1.8744127E38)
            android.view.View r7 = r3.inflate(r1, r4)     // Catch:{ all -> 0x2544 }
            X.1fu r5 = new X.1fu     // Catch:{ all -> 0x2544 }
            r5.<init>(r8)     // Catch:{ all -> 0x2544 }
            r4 = 2131889695(0x7f120e1f, float:1.941406E38)
            r3 = 210(0xd2, float:2.94E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>((java.lang.Object) r9, (int) r3)     // Catch:{ all -> 0x2544 }
            r5.A0E(r8, r1, r4)     // Catch:{ all -> 0x2544 }
            r4 = 2131890011(0x7f120f5b, float:1.9414702E38)
            r3 = 7
            com.facebook.redex.IDxObserverShape36S0200000_2_I0 r1 = new com.facebook.redex.IDxObserverShape36S0200000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>(r8, r3, r9)     // Catch:{ all -> 0x2544 }
            r5.A0F(r8, r1, r4)     // Catch:{ all -> 0x2544 }
            r3 = 211(0xd3, float:2.96E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r1 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0     // Catch:{ all -> 0x2544 }
            r1.<init>((java.lang.Object) r9, (int) r3)     // Catch:{ all -> 0x2544 }
            r5.A0D(r8, r1)     // Catch:{ all -> 0x2544 }
            r5.A07(r6)     // Catch:{ all -> 0x2544 }
            r5.setView(r7)     // Catch:{ all -> 0x2544 }
            X.02l r1 = r5.create()     // Catch:{ all -> 0x2544 }
            r1.show()     // Catch:{ all -> 0x2544 }
            goto L_0x23b7
        L_0x24a0:
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            java.lang.String r2 = "fail_tell_a_friend"
            r3.AL7(r2)     // Catch:{ all -> 0x2544 }
            X.1yV r2 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r2 = (com.obwhatsapp.Conversation) r2     // Catch:{ all -> 0x2544 }
            java.lang.String r5 = r1.A0K     // Catch:{ all -> 0x2544 }
            android.net.Uri r4 = r1.A03     // Catch:{ all -> 0x2544 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x2544 }
            r3.<init>()     // Catch:{ all -> 0x2544 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ all -> 0x2544 }
            java.lang.String r1 = "com.obwhatsapp.conversationslist.SmsDefaultAppWarning"
            r3.setClassName(r2, r1)     // Catch:{ all -> 0x2544 }
            r3.setData(r4)     // Catch:{ all -> 0x2544 }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x2544 }
            if (r1 != 0) goto L_0x24cc
            java.lang.String r1 = "sms_body"
            r3.putExtra(r1, r5)     // Catch:{ all -> 0x2544 }
        L_0x24cc:
            r3.setData(r4)     // Catch:{ all -> 0x2544 }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x2544 }
            if (r1 != 0) goto L_0x24db
            java.lang.String r1 = "sms_body"
            r3.putExtra(r1, r5)     // Catch:{ all -> 0x2544 }
        L_0x24db:
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.startActivity(r3)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.finish()     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.AL0(r7)     // Catch:{ all -> 0x2544 }
            goto L_0x253c
        L_0x24eb:
            X.1yV r3 = r0.A22     // Catch:{ all -> 0x2544 }
            java.lang.String r2 = "fail_display_name"
            r3.AL7(r2)     // Catch:{ all -> 0x2544 }
            X.10Y r2 = r0.A1r     // Catch:{ all -> 0x2544 }
            X.0rv r1 = r1.A08     // Catch:{ all -> 0x2544 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x2544 }
            r2.A00(r1, r6, r6, r6)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.finish()     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.AL0(r7)     // Catch:{ all -> 0x2544 }
            goto L_0x253c
        L_0x2507:
            X.1yV r2 = r0.A22     // Catch:{ all -> 0x2544 }
            java.lang.String r1 = "fail"
            r2.AL7(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.finish()     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.AL0(r7)     // Catch:{ all -> 0x2544 }
            goto L_0x253c
        L_0x2519:
            java.lang.String r1 = "conversation/create/no-me-or-msgstore-db"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x2544 }
            X.1yV r2 = r0.A22     // Catch:{ all -> 0x2544 }
            java.lang.String r1 = "no_msg_store"
            r2.AL7(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1     // Catch:{ all -> 0x2544 }
            android.content.Intent r2 = X.C14750ph.A04(r1)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.startActivity(r2)     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.finish()     // Catch:{ all -> 0x2544 }
            X.1yV r1 = r0.A22     // Catch:{ all -> 0x2544 }
            r1.AL0(r7)     // Catch:{ all -> 0x2544 }
        L_0x253c:
            X.1yV r1 = r0.A22
            r0 = r29
            r1.AKv(r0)
            return
        L_0x2544:
            r2 = move-exception
            X.1yV r1 = r0.A22
            r0 = r29
            r1.AKv(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42821yj.A0X(android.os.Bundle):void");
    }

    public void A0Y(Bundle bundle) {
        this.A4O = Boolean.valueOf(C23061Ai.A00(this.A07));
        bundle.putBoolean("added_by_qr_code", this.A4V);
        bundle.putBoolean("has_number_from_url", this.A4Y);
        bundle.putBoolean("has_text_from_url", this.A4Z);
        bundle.putBoolean("keyboard_visible", this.A4O.booleanValue());
        bundle.putBoolean("added_by_number_search", this.A2C.A0H);
        this.A2C.A0a.A01(bundle);
    }

    public final void A0Z(View view, ViewGroup viewGroup) {
        A0R(A04(1));
        ConversationListView conversationListView = this.A1n;
        boolean A0C2 = conversationListView == null ? false : conversationListView.A0C();
        this.A01 = -1;
        this.A0z.setClipChildren(false);
        int transcriptMode = this.A1n.getTranscriptMode();
        ViewGroup viewGroup2 = viewGroup;
        int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height);
        translateAnimation.setDuration(250);
        View view2 = view;
        view.startAnimation(translateAnimation);
        if (viewGroup == this.A0N && this.A0K.getVisibility() == 0) {
            this.A0K.startAnimation(translateAnimation);
        }
        if (this.A37.A0H) {
            this.A0O.startAnimation(translateAnimation);
        }
        if (A0C2) {
            this.A1n.setTranscriptMode(2);
            this.A1n.startAnimation(translateAnimation);
        }
        Drawable background = this.A08.getBackground();
        if (!(background instanceof AnonymousClass3LG)) {
            AnonymousClass3LG.A00(new AnonymousClass3LG(background), this.A08);
        }
        IDxAnimationShape2S0101000_2_I0 iDxAnimationShape2S0101000_2_I0 = new IDxAnimationShape2S0101000_2_I0(this, height, 0);
        iDxAnimationShape2S0101000_2_I0.setDuration(250);
        this.A08.startAnimation(iDxAnimationShape2S0101000_2_I0);
        iDxAnimationShape2S0101000_2_I0.setAnimationListener(new C70343gV(view2, viewGroup2, this, transcriptMode, A0C2));
    }

    public final void A0a(View view, ViewGroup viewGroup) {
        ConversationListView conversationListView = this.A1n;
        boolean A0C2 = conversationListView == null ? false : conversationListView.A0C();
        this.A01 = 1;
        this.A0z.setClipChildren(false);
        int transcriptMode = this.A1n.getTranscriptMode();
        ConversationListView conversationListView2 = this.A1n;
        if (A0C2) {
            conversationListView2.setTranscriptMode(2);
        } else {
            conversationListView2.setTranscriptMode(0);
        }
        A0R(A04(0));
        viewGroup.setVisibility(0);
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C94454kw(view, viewGroup, this, transcriptMode, A0C2));
    }

    public final void A0b(AnonymousClass1ZR r14) {
        AnonymousClass1ZR r1;
        if (!AnonymousClass29T.A03((Activity) this.A22)) {
            C41681wN r2 = this.A2D;
            r2.A06(r14);
            AnonymousClass1ZR r0 = r2.A01;
            if (r0 == null || !TextUtils.equals(r2.A05, r0.A0W) || !r2.A01.A0F() || !r2.A06) {
                A07();
                return;
            }
            Log.i("conversation/showLinkPreviewShell");
            if (this.A1x == null) {
                AnonymousClass4E6 r5 = new AnonymousClass4E6(this);
                AnonymousClass1yV r12 = this.A22;
                C14550pN r3 = (C14550pN) r12;
                C85174Nk r22 = new C85174Nk(r3, r3.A04, r5, this.A2D, ((C14570pP) r12).A05, ((AnonymousClass1yR) r12).A00.A0Y.A0c());
                this.A1x = r22;
                this.A0N.addView(r22.A05);
                C612138a r4 = new C612138a(this);
                C614739b r32 = this.A2S;
                C15830rv r23 = this.A33;
                ConversationListView conversationListView = this.A1n;
                MentionableEntry mentionableEntry = this.A37;
                ViewGroup viewGroup = this.A0N;
                C85174Nk r52 = this.A1x;
                KeyboardPopupLayout keyboardPopupLayout = this.A0z;
                if (r32.A0U && !r32.A0F) {
                    r32.A0B = r23;
                    r32.A08 = r4;
                    r32.A03 = conversationListView;
                    r32.A04 = mentionableEntry;
                    r32.A02 = viewGroup;
                    r32.A07 = r52;
                    r32.A00 = keyboardPopupLayout;
                    Activity activity = r32.A0J;
                    boolean z2 = false;
                    if (activity.getResources().getConfiguration().orientation == 2) {
                        z2 = true;
                    }
                    if (r32.A0I != 2) {
                        r32.A09 = (IcebreakerBubbleView) AnonymousClass00T.A05(activity, r32.A0H);
                    } else if (!z2) {
                        View inflate = LayoutInflater.from(activity).inflate(R.layout.layout0169, viewGroup, false);
                        r32.A01 = inflate;
                        AnonymousClass00B.A04(inflate);
                        r32.A06 = (ShimmerFrameLayout) C004601z.A0E(inflate, R.id.shimmer);
                        r32.A01.setVisibility(8);
                        viewGroup.addView(r32.A01);
                        AnonymousClass3T3 r6 = new AnonymousClass3T3(activity, keyboardPopupLayout, viewGroup, mentionableEntry, new C83644Hm(r52, r32), r32.A0C);
                        r32.A0A = r6;
                        r6.setVisibility(8);
                        r32.A0G = false;
                        viewGroup.addView(r32.A0A);
                        mentionableEntry.addTextChangedListener(r32.A0K);
                    }
                    r32.A0F = true;
                }
                AnonymousClass4NG r13 = (AnonymousClass4NG) A5M.get(this.A2l.A08(C15830rv.class));
                if (r13 != null && (r13.A03 || r13.A04)) {
                    C614739b r24 = this.A2S;
                    if (r24.A0F) {
                        if (r24.A0I == 2) {
                            r24.A07.A05.setVisibility(8);
                            View view = r24.A01;
                            AnonymousClass00B.A04(view);
                            view.setVisibility(0);
                            ShimmerFrameLayout shimmerFrameLayout = r24.A06;
                            AnonymousClass00B.A04(shimmerFrameLayout);
                            shimmerFrameLayout.A01();
                        } else {
                            IcebreakerBubbleView icebreakerBubbleView = r24.A09;
                            AnonymousClass00B.A04(icebreakerBubbleView);
                            icebreakerBubbleView.removeAllViews();
                            ((ShimmerFrameLayout) C004601z.A0E(LayoutInflater.from(icebreakerBubbleView.getContext()).inflate(R.layout.layout0169, icebreakerBubbleView, true), R.id.shimmer)).A01();
                            icebreakerBubbleView.setVisibility(0);
                        }
                    }
                }
            }
            if (this.A0N.getVisibility() != 0 || this.A01 < 0) {
                Log.i("conversation/showLinkPreviewShell/start");
                A0a(this.A1x.A05, this.A0N);
            }
            AnonymousClass1ZR r15 = this.A2D.A01;
            if (r15 instanceof C70653hS) {
                C40531uH r42 = ((C70653hS) r15).A00;
                C20070zS r33 = this.A2U;
                UserJid of = UserJid.of(this.A33);
                int i2 = 4;
                if (r42 != null) {
                    i2 = 17;
                }
                r33.A01(of, (String) null, i2);
            }
            C85174Nk r16 = this.A1x;
            r16.A05.A08(this.A2D.A01, (List) null, false, r16.A00);
            AnonymousClass1ZK r25 = this.A4F;
            if (r25 != null) {
                AnonymousClass1ZR r17 = this.A2D.A01;
                if (r17 instanceof C70653hS) {
                    AnonymousClass3BB r02 = this.A2R;
                    r25.A0H = (C70653hS) r17;
                    r25.A0I = r02;
                }
            }
            C41681wN r26 = this.A2D;
            if (r26.A00 == 1 && (r1 = r26.A01) != null && r1.A0U != null && r26.A06 && !(r1 instanceof C70653hS)) {
                ((C14570pP) this.A22).A05.Acl(new RunnableRunnableShape7S0100000_I0_6(this, 41));
            }
        }
    }

    public final void A0c(C16010sH r6, C15830rv r7, boolean z2) {
        try {
            this.A22.startActivityForResult(this.A3v.A00(r6, r7, z2), 13);
            C20070zS r4 = this.A2U;
            UserJid of = UserJid.of(r7);
            if (r4.A03.A0E(C16620tM.A02, 2805)) {
                int i2 = 22;
                if (z2) {
                    i2 = 21;
                }
                r4.A01(of, (String) null, i2);
            }
            ((AnonymousClass1yR) this.A22).A00.A0r.A02(z2, 5);
        } catch (ActivityNotFoundException unused) {
            AnonymousClass29T.A01((Activity) this.A22, 12);
        }
    }

    public void A0d(C16010sH r10, boolean z2) {
        AnonymousClass2X1 r1;
        AnonymousClass2X0 r2 = this.A3U;
        boolean z3 = z2;
        if (!(r10.A0E instanceof AnonymousClass1ZX) || (r1 = r2.A00) == null || (r1.A03 && r1.A02)) {
            C14550pN r4 = (C14550pN) this.A22;
            C15860rz r22 = r4.A09;
            int i2 = 8;
            if (this.A4b) {
                i2 = 25;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (((SharedPreferences) r22.A01.get()).getInt("call_confirmation_dialog_count", 0) < 5 || r10.A0J()) {
                C30341cC.A0G(r4, r10, valueOf, z2);
            } else if (r10.A0J()) {
                Jid A082 = r10.A08(C16050sL.class);
                AnonymousClass00B.A06(A082);
                C204310c r3 = this.A1R;
                AnonymousClass1yV r12 = this.A22;
                AnonymousClass2DF r0 = ((AnonymousClass1yR) r12).A00;
                List A0C2 = C30341cC.A0C(((C14530pL) r12).A01, r0.A07, r0.A0O, r10);
                r3.A03((Context) this.A22, (GroupJid) A082, A0C2, 25, z3);
            } else {
                this.A1R.A01((Context) this.A22, r10, 8, z2);
            }
        } else {
            int i3 = 3;
            if (z2) {
                i3 = 4;
            }
            r2.A01(Integer.valueOf(i3));
        }
    }

    public void A0e(C93544jN r6) {
        int i2;
        if (!((AnonymousClass1yR) this.A22).A00.A0M.A0B()) {
            this.A2y = r6;
            Activity activity = (Activity) this.A22;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                i2 = R.string.str1247;
            } else {
                i2 = R.string.str124b;
                if (i3 < 33) {
                    i2 = R.string.str124a;
                }
            }
            RequestPermissionActivity.A0L(activity, R.string.str1249, i2, 811);
            return;
        }
        A0f(r6);
    }

    public final void A0f(C93544jN r18) {
        if (this.A1Q.A0V((UserJid) this.A2l.A08(UserJid.class))) {
            AnonymousClass29T.A01((Activity) this.A22, 106);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A33);
        C93544jN r6 = r18;
        C93534jM r7 = r6.A01;
        int i2 = r7.A01;
        if (i2 <= 0) {
            i2 = r6.A02.A01;
        }
        int i3 = r7.A00;
        if (i3 <= 0) {
            i3 = r6.A02.A00;
        }
        String A052 = C40651uT.A05(this.A37.getStringText());
        boolean z2 = false;
        if (this.A2C.A0D != null) {
            z2 = true;
        }
        this.A22.startActivityForResult(C14750ph.A0j((Context) this.A22, r6.A02.A02, r7.A02, r6.A03.A02, arrayList, r6.A00, 22, this.A4Y, false).putExtra("media_width", i2).putExtra("media_height", i3).putExtra("jid", C16030sJ.A03(this.A33)).putExtra(FacebookFacade.RequestParameter.CAPTION, A052).putExtra("mentions", C16030sJ.A06(this.A37.getMentions())).putExtra("clear_message_after_send", !TextUtils.isEmpty(A052)).putExtra("usage_quote", z2), 25);
    }

    public void A0g(C16740tZ r10) {
        if (!this.A2A.A07() && this.A37 != null) {
            AnonymousClass1ZK r0 = this.A4F;
            C16740tZ r5 = r10;
            if (r0 != null) {
                r0.A0L = r10;
            }
            if (r10 == null) {
                this.A0K.setVisibility(8);
                this.A0L.setVisibility(8);
                A0R(R.drawable.ib_new_round);
                return;
            }
            AnonymousClass05J r02 = this.A0a;
            if (r02 != null) {
                r02.A05();
            }
            if (this.A0B == null) {
                View inflate = this.A22.getLayoutInflater().inflate(R.layout.layout04e5, (ViewGroup) null, false);
                this.A0B = inflate;
                ((FrameLayout) inflate.findViewById(R.id.quoted_message_frame)).setForeground(AnonymousClass2SR.A02((Context) this.A22, R.drawable.balloon_incoming_frame, R.color.color0183));
                this.A0K.addView(this.A0B);
                C45902Bo.A08(this.A0B.findViewById(R.id.quoted_title_frame), this.A2L, 0, this.A22.getResources().getDimensionPixelSize(R.dimen.dimen029c));
                this.A0B.findViewById(R.id.cancel).setVisibility(0);
                this.A0B.findViewById(R.id.cancel).setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 31));
                View view = this.A0B;
                Conversation.setQView(view);
                TextView textView = (TextView) view.findViewById(R.id.quoted_title);
                textView.setTextSize(this.A1k.A01(this.A22.getResources()));
                AnonymousClass1UP.A06(textView);
            }
            this.A1z.A01(this.A0B, A05(), this.A33, r5, ((AnonymousClass1yR) this.A22).A00.A0o, false, false);
            int visibility = this.A0B.findViewById(R.id.quoted_thumb).getVisibility();
            View findViewById = this.A0B.findViewById(R.id.cancel_image);
            if (visibility == 0) {
                findViewById.setBackgroundResource(R.drawable.semi_white_circle);
            } else {
                findViewById.setBackgroundColor(0);
            }
            if (this.A0K.getVisibility() != 0 || this.A01 < 0) {
                Log.i("conversation/replypreview/start");
                A0a(this.A0B, this.A0K);
            }
            C47572Jn r03 = this.A2v;
            if (r03 != null && !r03.isShowing()) {
                AnonymousClass1ZK r04 = this.A4F;
                if (r04 == null || r04.A1G.A0B.getVisibility() != 0) {
                    this.A37.A04(false);
                }
            }
        }
    }

    public final void A0h(C16740tZ r7) {
        int i2;
        int height;
        ConversationListView conversationListView = this.A1n;
        int firstVisiblePosition = conversationListView.getFirstVisiblePosition();
        int lastVisiblePosition = conversationListView.getLastVisiblePosition();
        int A032 = conversationListView.getConversationCursorAdapter().A03(r7);
        if (A032 >= 0 && (i2 = A032 + 1) >= firstVisiblePosition) {
            if (i2 <= lastVisiblePosition) {
                View childAt = conversationListView.getChildAt(i2 - firstVisiblePosition);
                if (childAt == null || childAt.getTop() <= (height = (conversationListView.getHeight() >> 1) - (childAt.getHeight() >> 1))) {
                    return;
                }
            } else {
                height = conversationListView.getHeight() >> 1;
            }
            conversationListView.smoothScrollToPositionFromTop(i2, height);
            if (!conversationListView.A0D) {
                conversationListView.setTranscriptMode(0);
                conversationListView.setVisibility(0);
                this.A47.A03(0);
                this.A2C.A03 = 0;
                A0o(false);
            }
        }
    }

    public void A0i(C16740tZ r11, int i2) {
        C48952Qa conversationCursorAdapter = this.A1n.getConversationCursorAdapter();
        C34621kZ r2 = this.A2C;
        int A012 = conversationCursorAdapter.A01();
        int firstVisiblePosition = this.A1n.getFirstVisiblePosition();
        int count = conversationCursorAdapter.getCount();
        ArrayList arrayList = new ArrayList();
        arrayList.add(r11.A11);
        r2.A0K(r11, arrayList, i2, A012, firstVisiblePosition, count, true);
    }

    public void A0j(C16740tZ r21, boolean z2) {
        MentionableEntry mentionableEntry = this.A37;
        AnonymousClass05J r1 = this.A0a;
        KeyboardPopupLayout keyboardPopupLayout = this.A0z;
        ConversationListView conversationListView = this.A1n;
        ViewGroup viewGroup = this.A0M;
        ViewGroup viewGroup2 = this.A0K;
        ViewGroup viewGroup3 = this.A0L;
        C25801Le r10 = this.A1z;
        AnonymousClass1MF r15 = ((AnonymousClass1yR) this.A22).A00.A0o;
        C16740tZ r14 = r21;
        if (r21 != null && !this.A2A.A07() && mentionableEntry != null) {
            if (r1 != null) {
                r1.A05();
            }
            this.A2C.A0J(r14);
            View view = this.A0I;
            if (view == null) {
                view = new AnonymousClass33z((Context) this.A22, new RunnableRunnableShape0S0600000_I0(this, viewGroup3, keyboardPopupLayout, conversationListView, viewGroup, viewGroup2, 2));
                this.A0I = view;
                viewGroup3.addView(view);
            }
            boolean z3 = false;
            r10.A01(view, A05(), this.A33, r14, r15, false, false);
            ConversationListView conversationListView2 = this.A1n;
            if (conversationListView2 != null) {
                z3 = conversationListView2.A0C();
            }
            if (!z2) {
                viewGroup3.setVisibility(0);
                return;
            }
            keyboardPopupLayout.setClipChildren(false);
            int transcriptMode = conversationListView.getTranscriptMode();
            if (z3) {
                conversationListView.setTranscriptMode(2);
            } else {
                conversationListView.setTranscriptMode(0);
            }
            viewGroup3.setVisibility(0);
            viewGroup3.getViewTreeObserver().addOnGlobalLayoutListener(new C94474ky(view, viewGroup3, viewGroup, conversationListView, keyboardPopupLayout, transcriptMode, z3));
        }
    }

    public void A0k(C38701rH r4, long j2, boolean z2) {
        if (z2) {
            this.A02 = r4.A13;
        }
        if (j2 == 0) {
            this.A1n.removeCallbacks(this.A4P);
        }
        RunnableRunnableShape5S0200000_I0_3 runnableRunnableShape5S0200000_I0_3 = new RunnableRunnableShape5S0200000_I0_3(this, 27, r4);
        this.A4P = runnableRunnableShape5S0200000_I0_3;
        this.A1n.postDelayed(runnableRunnableShape5S0200000_I0_3, j2);
    }

    public final void A0l(Boolean bool, List list) {
        String obj;
        if (list == null || list.isEmpty() || !Boolean.TRUE.equals(bool)) {
            this.A06.setVisibility(8);
            return;
        }
        TextView textView = (TextView) AnonymousClass00T.A05((Activity) this.A22, R.id.active_cart_badge);
        this.A06.setOnClickListener(this.A4t);
        this.A06.setVisibility(0);
        AnonymousClass013 r6 = this.A2L;
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = (int) (((long) i2) + ((C50102Xy) it.next()).A00);
        }
        if (i2 == 0) {
            obj = "";
        } else if (i2 <= 99) {
            obj = r6.A0K().format((long) i2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(r6.A0K().format(99));
            sb.append("+");
            obj = sb.toString();
        }
        textView.setText(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0m(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            X.01Y r3 = r0.A1Q
            X.0sH r2 = r0.A2l
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A08(r1)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r1 = r3.A0V(r1)
            if (r1 == 0) goto L_0x001e
            X.1yV r1 = r0.A22
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 106(0x6a, float:1.49E-43)
        L_0x001a:
            X.AnonymousClass29T.A01(r1, r0)
        L_0x001d:
            return
        L_0x001e:
            X.1ZK r2 = r0.A4F
            r5 = 8
            r6 = 1
            if (r2 == 0) goto L_0x0053
            X.1cz r1 = r2.A0P
            if (r1 == 0) goto L_0x0038
            boolean r1 = r0.A4Y
            r2.A0T(r6, r1)
            X.05J r1 = r0.A0a
            if (r1 == 0) goto L_0x001d
            android.view.View r0 = r0.A07
            r0.setVisibility(r5)
            return
        L_0x0038:
            X.1ZL r1 = r2.A1G
            android.view.ViewGroup r1 = r1.A0B
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0053
            X.1ZK r2 = r0.A4F
            java.io.File r1 = r2.A0Q
            if (r1 == 0) goto L_0x0053
            boolean r1 = r0.A4Y
            r2.A0Q(r1)
            X.1ZK r0 = r0.A4F
            r0.A0N(r6)
            return
        L_0x0053:
            com.obwhatsapp.mentions.MentionableEntry r1 = r0.A37
            java.lang.String r4 = r1.getStringText()
            boolean r7 = r0.A4Z
            java.lang.String r2 = ""
            if (r4 == 0) goto L_0x0088
            java.lang.String r3 = "⠀"
            boolean r1 = r4.contains(r3)
            if (r1 == 0) goto L_0x006e
            java.lang.String r1 = " "
            java.lang.String r4 = r4.replace(r3, r1)
        L_0x006e:
            java.lang.String r4 = r4.trim()
            if (r7 == 0) goto L_0x0087
            boolean r1 = X.C41971wz.A05()
            if (r1 == 0) goto L_0x0087
            java.lang.String r3 = "­"
            boolean r1 = r4.contains(r3)
            if (r1 == 0) goto L_0x0087
            java.lang.String r4 = r4.replace(r3, r2)
        L_0x0087:
            r2 = r4
        L_0x0088:
            X.1yV r1 = r0.A22
            X.0pN r1 = (X.C14550pN) r1
            X.01V r3 = r1.A08
            X.0u3 r1 = r0.A3W
            boolean r1 = X.C45922Bq.A0B(r3, r1, r2)
            if (r1 != 0) goto L_0x00a3
            X.1yV r0 = r0.A22
            X.0pN r0 = (X.C14550pN) r0
            X.0pt r1 = r0.A05
            r0 = 2131887011(0x7f1203a3, float:1.9408617E38)
            r1.A09(r0, r6)
            return
        L_0x00a3:
            r4 = 65536(0x10000, float:9.18355E-41)
            r3 = 0
            if (r19 == 0) goto L_0x01d0
            java.lang.String r2 = X.AnonymousClass1ZW.A04(r4, r2)
        L_0x00ac:
            X.1wN r1 = r0.A2D
            r9 = 0
            r1.A0B(r9)
            android.view.ViewGroup r1 = r0.A0N
            r1.setVisibility(r5)
            android.view.ViewGroup r1 = r0.A0K
            r1.setVisibility(r5)
            r1 = 2131231387(0x7f08029b, float:1.8078854E38)
            r0.A0R(r1)
            android.view.ViewGroup r1 = r0.A0L
            r1.setVisibility(r5)
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x0150
            java.util.HashMap r3 = A5M
            X.0sH r1 = r0.A2l
            java.lang.Class<X.0rv> r4 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r1.A08(r4)
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L_0x01cd
            r0.A0I()
            X.1wN r1 = r0.A2D
            X.1ZR r5 = r1.A01
            boolean r1 = r5 instanceof X.C70653hS
            if (r1 == 0) goto L_0x01ca
            X.2ZO r3 = r0.A2B
            X.3hS r5 = (X.C70653hS) r5
            X.3BB r1 = r0.A2R
            X.1uH r10 = r3.A00(r5, r1)
            X.1wN r1 = r0.A2D
            r1.A0A(r9)
            r0.A0n(r6)
        L_0x00fa:
            X.1kZ r1 = r0.A2C
            X.0tZ r8 = r1.A0D
            boolean r1 = r8 instanceof X.C38891ra
            if (r1 == 0) goto L_0x0115
            X.1ra r8 = (X.C38891ra) r8
            X.0ue r7 = r0.A1K
            r6 = 36
            r1 = 48
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = r8.A06
            com.whatsapp.jid.UserJid r1 = r8.A01
            r7.A04(r1, r5, r3, r6)
        L_0x0115:
            X.1wN r1 = r0.A2D
            X.1ZR r7 = r1.A01
            boolean r1 = r7 instanceof X.C70643hR
            if (r1 == 0) goto L_0x019c
            X.3hR r7 = (X.C70643hR) r7
            X.4jX r3 = r7.A00
            if (r3 == 0) goto L_0x014a
            X.1yV r1 = r0.A22
            X.1yR r1 = (X.AnonymousClass1yR) r1
            X.2DF r1 = r1.A00
            X.0tb r5 = r1.A03
            X.0sH r1 = r0.A2l
            com.whatsapp.jid.Jid r1 = r1.A08(r4)
            java.util.List r11 = java.util.Collections.singletonList(r1)
            java.lang.String r7 = r3.A00
            java.lang.String r8 = r3.A04
            java.lang.String r9 = r3.A02
            java.lang.String r10 = X.C40651uT.A05(r2)
            byte[] r12 = r3.A00()
            X.1kZ r1 = r0.A2C
            X.0tZ r6 = r1.A0D
            r5.A0R(r6, r7, r8, r9, r10, r11, r12)
        L_0x014a:
            r0.A0D()
            r0.A0H()
        L_0x0150:
            X.1yV r1 = r0.A22
            X.0pN r1 = (X.C14550pN) r1
            X.01V r1 = r1.A08
            android.view.inputmethod.InputMethodManager r1 = r1.A0Q()
            X.AnonymousClass00B.A06(r1)
            boolean r1 = r1.isFullscreenMode()
            if (r1 != 0) goto L_0x0191
            com.obwhatsapp.mentions.MentionableEntry r1 = r0.A37
            int r2 = r1.getHeight()
            com.obwhatsapp.conversation.ConversationListView r1 = r0.A1n
            int r1 = r1.getHeight()
            int r2 = r2 + r1
            int r2 = r2 << 2
            X.1yV r1 = r0.A22
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            int r1 = r1.getHeight()
            if (r2 >= r1) goto L_0x001d
            X.1yV r1 = r0.A22
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r2 = r1.orientation
            r1 = 2
            if (r2 != r1) goto L_0x001d
        L_0x0191:
            com.obwhatsapp.mentions.MentionableEntry r1 = r0.A37
            if (r1 == 0) goto L_0x0198
            r1.A03()
        L_0x0198:
            r0.A0t()
            return
        L_0x019c:
            X.1yV r1 = r0.A22
            X.1yR r1 = (X.AnonymousClass1yR) r1
            X.2DF r1 = r1.A00
            X.0tb r6 = r1.A03
            X.0sH r1 = r0.A2l
            com.whatsapp.jid.Jid r1 = r1.A08(r4)
            java.util.List r13 = java.util.Collections.singletonList(r1)
            java.lang.String r12 = X.C40651uT.A05(r2)
            X.1wN r8 = r0.A2D
            X.1kZ r1 = r0.A2C
            X.0tZ r11 = r1.A0D
            com.obwhatsapp.mentions.MentionableEntry r1 = r0.A37
            java.util.List r14 = r1.getMentions()
            boolean r15 = r0.A4Y
            boolean r1 = r0.A4Z
            r17 = 0
            r16 = r1
            r6.A09(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x014a
        L_0x01ca:
            r0.A0K()
        L_0x01cd:
            r10 = r9
            goto L_0x00fa
        L_0x01d0:
            int r1 = r2.length()
            int r1 = r2.codePointCount(r3, r1)
            if (r1 <= r4) goto L_0x00ac
            X.1yV r1 = r0.A22
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 17
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42821yj.A0m(boolean):void");
    }

    public final void A0n(boolean z2) {
        Jid A082 = this.A2l.A08(C15830rv.class);
        A5M.remove(A082);
        C20070zS r0 = this.A2U;
        UserJid of = UserJid.of(A082);
        if (of != null) {
            r0.A00(of).A01 = false;
        }
        AnonymousClass1ZK r1 = this.A4F;
        if (r1 != null) {
            r1.A0H = null;
            r1.A0I = null;
        }
        C20070zS r02 = this.A2U;
        if (of != null) {
            r02.A00(of).A02 = false;
        }
        if (z2) {
            C614739b r03 = this.A2S;
            C15830rv r12 = r03.A0B;
            if (r12 != null) {
                AnonymousClass1MU r04 = r03.A0R;
                r04.A02.remove(r12.getRawString());
            }
            A0H();
        }
    }

    public final void A0o(boolean z2) {
        if (this.A06 != null) {
            int dimensionPixelSize = this.A22.getResources().getDimensionPixelSize(R.dimen.dimen0060);
            int dimensionPixelSize2 = this.A22.getResources().getDimensionPixelSize(R.dimen.dimen005f);
            View view = this.A06;
            int i2 = 0;
            if (!z2) {
                i2 = dimensionPixelSize2;
                dimensionPixelSize2 = 0;
            }
            view.setPadding(dimensionPixelSize, i2, dimensionPixelSize, dimensionPixelSize2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0.A11.A02 != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0p(boolean r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0009
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r5.A3t
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            X.02l r0 = r5.A0Y
            if (r0 == 0) goto L_0x0010
            r0.dismiss()
        L_0x0010:
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r2 = r5.A3t
            X.0rv r0 = r5.A33
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r0)
            X.0yz r0 = r2.A04
            X.0tZ r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0027
            X.1Vw r0 = r0.A11
            boolean r0 = r0.A02
            r4 = 1
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            X.1yV r0 = r5.A22
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131558919(0x7f0d0207, float:1.8743167E38)
            r2 = 0
            android.view.View r1 = r1.inflate(r0, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131892151(0x7f1217b7, float:1.9419042E38)
            r1.setText(r0)
            X.1yV r0 = r5.A22
            android.content.Context r0 = (android.content.Context) r0
            X.1fu r3 = new X.1fu
            r3.<init>(r0)
            X.0PG r0 = r3.A01
            r0.A0B = r1
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r5.A3t
            X.0sK r0 = r0.A02
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x009c
            r0 = 2131892150(0x7f1217b6, float:1.941904E38)
            if (r4 == 0) goto L_0x005d
            r0 = 2131892144(0x7f1217b0, float:1.9419028E38)
        L_0x005d:
            r3.A01(r0)
            X.1yV r0 = r5.A22
            X.0pL r0 = (X.C14530pL) r0
            X.0sK r0 = r0.A01
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0081
            r0 = 2131889800(0x7f120e88, float:1.9414274E38)
            r3.setPositiveButton(r0, r2)
        L_0x0072:
            X.02l r0 = r3.create()
            r5.A0Y = r0
            r0.show()
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r1 = r5.A3t
            r0 = 1
            r1.A00 = r0
            return
        L_0x0081:
            r2 = 2131892148(0x7f1217b4, float:1.9419036E38)
            r1 = 55
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r5, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131892147(0x7f1217b3, float:1.9419034E38)
            r1 = 56
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r5, r1)
            r3.setNegativeButton(r2, r0)
            goto L_0x0072
        L_0x009c:
            r0 = 2131892149(0x7f1217b5, float:1.9419038E38)
            if (r4 == 0) goto L_0x005d
            r0 = 2131892143(0x7f1217af, float:1.9419026E38)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42821yj.A0p(boolean):void");
    }

    public boolean A0q() {
        AnonymousClass1ZK r0 = this.A4F;
        return (r0 == null || r0.A0P == null) ? false : true;
    }

    public boolean A0r() {
        if (this.A0a == null) {
            this.A22.A96();
            this.A2g = this.A2f.A09(this.A33);
            ((C14570pP) this.A22).A05.Aco(new RunnableRunnableShape7S0100000_I0_6(this, 48));
            if (this.A0Z == null) {
                this.A0Z = new IDxCallbackShape333S0100000_1_I0(this, 2);
            }
            AnonymousClass1ZK r1 = this.A4F;
            if (r1 == null || (r1.A0P == null && r1.A1G.A0B.getVisibility() != 0)) {
                this.A07.setVisibility(8);
                A0t();
            }
            if (!C23061Ai.A00(this.A07)) {
                InputMethodManager A0Q2 = ((C14550pN) this.A22).A08.A0Q();
                AnonymousClass00B.A06(A0Q2);
                A0Q2.toggleSoftInput(0, 0);
            }
            this.A0a = this.A22.AgA(this.A0Z);
        }
        return false;
    }

    public final boolean A0s() {
        return (this.A22.getIntent() == null || this.A22.getIntent().getBundleExtra("new_group_result_bundle") == null || !this.A22.getIntent().getBundleExtra("new_group_result_bundle").containsKey("invite_intent")) ? false : true;
    }

    public final boolean A0t() {
        this.A3T.A04(false);
        if (!this.A2v.isShowing()) {
            return false;
        }
        this.A2v.dismiss();
        return true;
    }

    public final boolean A0u(int i2) {
        if (!((C14550pN) this.A22).A0C.A0E(C16620tM.A02, 743) || !this.A3P.A0a((Context) this.A22, (UserJid) this.A2l.A08(UserJid.class), i2)) {
            return false;
        }
        return i2 == 2 || i2 == 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        if (X.AnonymousClass476.A00(((X.C14550pN) r12.A22).A0C, r8, r13, r15) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r16 != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0v(X.C38701rH r13, int r14, boolean r15, boolean r16) {
        /*
            r12 = this;
            r5 = r12
            X.1yV r0 = r12.A22
            X.0pN r0 = (X.C14550pN) r0
            X.0pd r0 = r0.A0C
            boolean r11 = X.C30211bx.A01(r0)
            com.obwhatsapp.conversation.ConversationListView r0 = r12.A1n
            X.2Qa r0 = r0.getConversationCursorAdapter()
            r9 = r13
            X.0tZ r8 = X.AnonymousClass46Z.A00(r0, r13)
            r3 = 0
            r2 = 1
            if (r8 == 0) goto L_0x0079
            X.1yV r0 = r12.A22
            X.0pN r0 = (X.C14550pN) r0
            X.0pd r0 = r0.A0C
            boolean r0 = X.AnonymousClass476.A00(r0, r8, r13, r15)
            if (r0 == 0) goto L_0x006d
            r12.A4W = r2
            r7 = r8
            X.1rH r7 = (X.C38701rH) r7
            X.1yV r4 = r12.A22
            r0 = r4
            X.1yR r0 = (X.AnonymousClass1yR) r0
            X.2DF r0 = r0.A00
            X.1B5 r1 = r0.A0I
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r0 = r12.A4e
            if (r0 == 0) goto L_0x003d
            r0 = 0
            if (r16 == 0) goto L_0x003e
        L_0x003d:
            r0 = 1
        L_0x003e:
            X.2DT r6 = r1.A01(r4, r0, r2)
            r6.A0O = r7
            r6.A0A = r2
            int r1 = r7.A0C
            r0 = 9
            if (r1 == r0) goto L_0x0050
            r0 = 10
            if (r1 != r0) goto L_0x0051
        L_0x0050:
            r3 = 1
        L_0x0051:
            r6.A0T = r3
            X.4xL r0 = new X.4xL
            r0.<init>(r6, r12, r7)
            r6.A0J = r0
            X.1yV r0 = r12.A22
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            X.0pN r0 = (X.C14550pN) r0
            X.0pt r0 = r0.A05
            r10 = 4
            com.facebook.redex.RunnableRunnableShape0S0510000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S0510000_I0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.AnonymousClass4Y2.A01(r1, r0, r4, r14)
            return r2
        L_0x006d:
            X.1yV r0 = r12.A22
            X.0pN r0 = (X.C14550pN) r0
            X.0pd r0 = r0.A0C
            boolean r0 = X.AnonymousClass476.A00(r0, r8, r13, r15)
            if (r0 != 0) goto L_0x008b
        L_0x0079:
            if (r11 == 0) goto L_0x008b
            X.1yV r0 = r12.A22
            X.0pN r0 = (X.C14550pN) r0
            X.0s5 r1 = r0.A06
            X.0tC r0 = X.C15910s6.A1u
            int r0 = r1.A02(r0)
            long r0 = (long) r0
            r12.A0k(r13, r0, r2)
        L_0x008b:
            X.1yV r0 = r12.A22
            android.content.Context r0 = (android.content.Context) r0
            X.AnonymousClass4Y2.A00(r0, r14)
            r12.A4X = r3
            r0 = 0
            r12.A3Z = r0
            r12.A4W = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42821yj.A0v(X.1rH, int, boolean, boolean):boolean");
    }
}
