package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.gifvideopreview.GifVideoPreviewActivity;
import com.obwhatsapp.mediacomposer.bottombar.recipients.RecipientsView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Si  reason: invalid class name and case insensitive filesystem */
public abstract class C49302Si extends C49312Sj implements C49322Sk, AnonymousClass1w8, C456529x {
    public View A00;
    public View A01;
    public FrameLayout A02;
    public ImageView A03;
    public C49332Sl A04;
    public C16000sG A05;
    public C16080sP A06;
    public C15810rt A07;
    public C35541m6 A08;
    public AnonymousClass11G A09;
    public C206711d A0A;
    public AnonymousClass1BQ A0B;
    public C613938s A0C;
    public AnonymousClass4UK A0D;
    public C17020u3 A0E;
    public AnonymousClass1BU A0F;
    public AnonymousClass2P5 A0G;
    public AnonymousClass1A9 A0H;
    public AnonymousClass01D A0I;
    public File A0J;
    public List A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;

    public void A35() {
        View A052 = AnonymousClass00T.A05(this, R.id.input_container);
        boolean z2 = false;
        if (this.A0L.size() > 0) {
            z2 = true;
        }
        this.A0C.A00(this.A08, this.A0L, true);
        AnonymousClass013 r0 = this.A01;
        if (z2) {
            AnonymousClass4Xy.A00(A052, r0);
        } else {
            AnonymousClass4Xy.A01(A052, r0);
        }
        this.A0D.A01(z2);
    }

    public void A36(File file) {
        if (this.A0L.size() == 0) {
            A37(false);
            return;
        }
        Intent intent = new Intent();
        if (file != null) {
            intent.putExtra("file_path", file.getPath());
        }
        intent.putExtra("uri", getIntent().getParcelableExtra("uri"));
        intent.putExtra(FacebookFacade.RequestParameter.CAPTION, this.A0G.A05.getStringText());
        intent.putStringArrayListExtra("mentions", C16030sJ.A06(this.A0G.A05.getMentions()));
        intent.putStringArrayListExtra("jids", C16030sJ.A06(this.A0L));
        intent.putExtra("clear_message_after_send", getIntent().getBooleanExtra("clear_message_after_send", false));
        setResult(-1, intent);
        finish();
    }

    public void A37(boolean z2) {
        AnonymousClass391 r2 = new AnonymousClass391(this);
        r2.A0D = true;
        r2.A0F = true;
        r2.A0T = this.A0L;
        r2.A0R = new ArrayList(Collections.singleton(Integer.valueOf(this instanceof GifVideoPreviewActivity ? 13 : 9)));
        r2.A0G = Boolean.valueOf(z2);
        Intent A002 = r2.A00();
        this.A0F.A01(A002, this.A08);
        startActivityForResult(A002, 1);
    }

    public void ATN(File file, String str) {
        this.A0J = file;
        if (TextUtils.isEmpty(getIntent().getStringExtra("media_url")) && file == null) {
            Log.e("MediaPreviewActivity/onMediaFileLoaded neither file nor media url provided");
            finish();
        }
    }

    public void AVs(boolean z2) {
        this.A0M = true;
        A37(z2);
    }

    public void AWy() {
        this.A0I.get();
        A36(this.A0J);
        this.A0J = null;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            this.A0L = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
            AnonymousClass00B.A06(intent);
            C35541m6 A002 = this.A0F.A00(intent.getExtras());
            AnonymousClass00B.A06(A002);
            this.A08 = A002;
            A35();
            if (i3 == -1) {
                A36(this.A0J);
                this.A0J = null;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            x2.A0P(false);
        }
        this.A0N = this.A0C.A0E(C16620tM.A01, 815);
        LayoutInflater layoutInflater = getLayoutInflater();
        boolean z2 = this.A0N;
        int i2 = R.layout.layout03cc;
        if (z2) {
            i2 = R.layout.layout0408;
        }
        C16010sH r11 = null;
        View inflate = layoutInflater.inflate(i2, (ViewGroup) null, false);
        this.A00 = inflate;
        setContentView(inflate);
        this.A02 = (FrameLayout) C004601z.A0E(this.A00, R.id.preview_holder);
        this.A01 = AnonymousClass00T.A05(this, R.id.loading_progress);
        this.A03 = (ImageView) AnonymousClass00T.A05(this, R.id.thumb_view);
        this.A01.setVisibility(0);
        this.A03.setVisibility(0);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("uri");
        if (parcelableExtra == null) {
            ATN((File) null, (String) null);
        } else {
            this.A05.Acn(new C608436i(this, this, this.A0H), parcelableExtra);
        }
        C15830rv A022 = C15830rv.A02(getIntent().getStringExtra("jid"));
        List singletonList = A022 != null ? Collections.singletonList(A022) : C16030sJ.A08(C15830rv.class, getIntent().getStringArrayListExtra("jids"));
        this.A0K = singletonList;
        this.A0L = singletonList;
        if (this.A0N) {
            this.A0C = this.A04.A00((RecipientsView) AnonymousClass00T.A05(this, R.id.media_recipients), this.A0N);
            this.A0D = new AnonymousClass4UK((WaImageButton) AnonymousClass00T.A05(this, R.id.send), this.A01);
            boolean booleanExtra = getIntent().getBooleanExtra("usage_quote", false);
            C613938s r0 = this.A0C;
            if (!booleanExtra) {
                r0.A03.setRecipientsListener(this);
            } else {
                RecipientsView recipientsView = r0.A03;
                recipientsView.A04 = false;
                recipientsView.A00 = R.color.color0059;
            }
            AnonymousClass4UK r4 = this.A0D;
            r4.A01.setOnClickListener(new ViewOnClickCListenerShape1S0200000_I1(r4, 49, this));
            this.A08 = new C35541m6(this.A09.A08(), this.A09.A09(), this.A09.A02(), false);
            A35();
        } else {
            if (!singletonList.isEmpty()) {
                A2f(this.A0L.size() == 1 ? this.A06.A08(this.A05.A0A((C15830rv) this.A0L.get(0))) : Resources.getSystem().getQuantityString(R.plurals.plurals0009, this.A0L.size(), new Object[]{Integer.valueOf(this.A0L.size())}));
            }
            ImageView imageView = (ImageView) AnonymousClass00T.A05(this, R.id.send);
            imageView.setImageDrawable(new C447725m(AnonymousClass00T.A04(this, R.drawable.input_send), this.A01));
            imageView.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 5));
        }
        C14710pd r16 = this.A0C;
        C23061Ai r15 = this.A0B;
        C16300so r10 = this.A03;
        C15810rt r9 = this.A07;
        C17250um r8 = this.A0B;
        C206711d r7 = this.A0A;
        AnonymousClass01V r6 = this.A08;
        AnonymousClass013 r5 = this.A01;
        AnonymousClass1BQ r42 = this.A0B;
        C15860rz r3 = this.A09;
        C17020u3 r2 = this.A0E;
        View view = this.A00;
        if (A022 != null) {
            r11 = this.A05.A0A(A022);
        }
        C23061Ai r27 = r15;
        C16300so r162 = r10;
        AnonymousClass01V r17 = r6;
        View view2 = view;
        this.A0G = new AnonymousClass2P5(this, view2, r162, r17, r3, r5, r9, r11, r7, r8, r42, r16, r2, r27, getIntent().getStringExtra(FacebookFacade.RequestParameter.CAPTION), C16030sJ.A08(UserJid.class, getIntent().getStringArrayListExtra("mentions")));
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A0J != null && isFinishing()) {
            this.A0J.getPath();
            AnonymousClass1XI.A0N(this.A0J);
        }
    }
}
