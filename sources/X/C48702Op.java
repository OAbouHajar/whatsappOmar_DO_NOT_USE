package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2Op  reason: invalid class name and case insensitive filesystem */
public class C48702Op {
    public Context A00;
    public LayoutInflater A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public RecyclerView A0B;
    public TextEmojiLabel A0C;
    public TextEmojiLabel A0D;
    public AnonymousClass2Ao A0E;
    public C57472rE A0F;
    public boolean A0G;
    public final C16000sG A0H;
    public final C16080sP A0I;
    public final C16440t3 A0J;
    public final AnonymousClass013 A0K;
    public final C15810rt A0L;
    public final C17240ul A0M;

    public C48702Op(Context context, ViewGroup viewGroup, C16000sG r5, C16080sP r6, AnonymousClass2Ao r7, C16440t3 r8, AnonymousClass013 r9, C15810rt r10, C17240ul r11) {
        this.A00 = context;
        this.A0J = r8;
        this.A0L = r10;
        this.A01 = LayoutInflater.from(context);
        this.A0H = r5;
        this.A0I = r6;
        this.A0K = r9;
        this.A0M = r11;
        this.A0E = r7;
        this.A07 = (TextView) viewGroup.findViewById(R.id.group_creator);
        this.A0D = (TextEmojiLabel) viewGroup.findViewById(R.id.group_name);
        this.A0C = (TextEmojiLabel) viewGroup.findViewById(R.id.group_description_preview);
        this.A05 = (ViewGroup) viewGroup.findViewById(R.id.participants_no_known_contacts);
        this.A0A = (TextView) viewGroup.findViewById(R.id.participants_header);
        this.A09 = (TextView) viewGroup.findViewById(R.id.participant_count);
        this.A06 = (ImageView) viewGroup.findViewById(R.id.group_photo);
        this.A08 = (TextView) viewGroup.findViewById(R.id.invite_expiration_time);
        this.A04 = viewGroup.findViewById(R.id.group_photo_container);
        this.A03 = viewGroup.findViewById(R.id.group_info);
        this.A02 = viewGroup.findViewById(R.id.background);
        this.A0B = (RecyclerView) viewGroup.findViewById(R.id.group_participants);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.A1P(0);
        this.A0B.setLayoutManager(linearLayoutManager);
        C57472rE r1 = new C57472rE(this);
        this.A0F = r1;
        this.A0B.setAdapter(r1);
    }

    public void A00(Bitmap bitmap) {
        if (bitmap == null) {
            Log.e("GroupInviteInfoViewController/decode-photo-bytes-returns-null");
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(100);
        alphaAnimation.setAnimationListener(new IDxLAdapterShape11S0200000_2_I0(bitmap, 4, this));
        this.A06.startAnimation(alphaAnimation);
    }

    public void A01(C85534Ov r14, long j2) {
        UserJid userJid = r14.A06;
        C16010sH A0A2 = userJid != null ? this.A0H.A0A(userJid) : null;
        this.A0D.A0I((List) null, r14.A09);
        if (A0A2 == null || !this.A0G) {
            this.A07.setVisibility(8);
        } else {
            TextView textView = this.A07;
            textView.setVisibility(0);
            boolean A0d = this.A0M.A0d(r14.A02);
            int i2 = R.string.str0bd8;
            if (A0d) {
                i2 = R.string.str0bdc;
            }
            textView.setText(this.A00.getString(i2, new Object[]{this.A0I.A0E(A0A2)}));
        }
        C30371cF r0 = r14.A07;
        String str = r0 == null ? null : r0.A02;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextEmojiLabel textEmojiLabel = this.A0C;
        if (!isEmpty) {
            textEmojiLabel.A0I((List) null, str);
            textEmojiLabel.setVisibility(0);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        List list = r14.A0A;
        boolean z2 = !list.isEmpty();
        TextView textView2 = this.A0A;
        int i3 = 8;
        if (z2) {
            i3 = 0;
        }
        textView2.setVisibility(i3);
        ViewGroup viewGroup = this.A05;
        int i4 = 0;
        if (z2) {
            i4 = 8;
        }
        viewGroup.setVisibility(i4);
        RecyclerView recyclerView = this.A0B;
        int i5 = 8;
        if (z2) {
            i5 = 0;
        }
        recyclerView.setVisibility(i5);
        AnonymousClass013 r6 = this.A0K;
        int i6 = r14.A03;
        long j3 = (long) i6;
        Integer valueOf = Integer.valueOf(i6);
        textView2.setText(r6.A0J(new Object[]{valueOf}, R.plurals.plurals0100, j3));
        this.A09.setText(r6.A0J(new Object[]{valueOf}, R.plurals.plurals0100, j3));
        C57472rE r02 = this.A0F;
        r02.A01 = list;
        r02.A01();
        r02.A00 = i6;
        r02.A01();
        int i7 = r14.A02;
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            TextView textView3 = this.A08;
            textView3.setVisibility(0);
            textView3.setText(R.string.str0be6);
            textView3.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            long j4 = j2;
            long A002 = j2 - this.A0J.A00();
            if (A002 > 0) {
                double d2 = (double) A002;
                int ceil = (int) Math.ceil(d2 / 8.64E7d);
                int floor = (int) Math.floor(d2 / 3600000.0d);
                TextView textView4 = this.A08;
                textView4.setText(floor < 12 ? this.A00.getString(R.string.str0bb3, new Object[]{C47672Jx.A00(r6, j4)}) : r6.A0J(new Object[]{Integer.valueOf(ceil)}, R.plurals.plurals00c0, (long) ceil));
                textView4.setVisibility(0);
            } else {
                this.A08.setVisibility(8);
            }
        }
        View view = this.A02;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new C94334kk(this, (float) view.getHeight()));
        this.A04.setVisibility(0);
    }
}
