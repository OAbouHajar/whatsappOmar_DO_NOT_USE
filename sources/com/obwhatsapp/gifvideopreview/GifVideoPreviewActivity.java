package com.obwhatsapp.gifvideopreview;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01J;
import X.AnonymousClass20S;
import X.AnonymousClass2P5;
import X.AnonymousClass322;
import X.AnonymousClass4I6;
import X.C004601z;
import X.C018808t;
import X.C102244yd;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16030sJ;
import X.C16150sX;
import X.C16440t3;
import X.C16490t9;
import X.C16740tZ;
import X.C16750ta;
import X.C16760tb;
import X.C18210wK;
import X.C18830xK;
import X.C25791Ld;
import X.C25841Li;
import X.C34771kq;
import X.C37661pW;
import X.C38411qk;
import X.C40651uT;
import X.C49132Rg;
import X.C49302Si;
import X.C74323qM;
import X.C76263td;
import X.C91874gd;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import com.obwhatsapp.videoplayback.VideoSurfaceView;
import com.whatsapp.jid.Jid;
import java.io.File;
import java.util.List;

public class GifVideoPreviewActivity extends C49302Si {
    public int A00;
    public View A01;
    public C16760tb A02;
    public C16490t9 A03;
    public C25841Li A04;
    public C18210wK A05;
    public AnonymousClass4I6 A06;
    public VideoSurfaceView A07;
    public boolean A08;

    public GifVideoPreviewActivity() {
        this(0);
    }

    public GifVideoPreviewActivity(int i2) {
        this.A08 = false;
        C13680ns.A1G(this, 68);
    }

    public void A1q() {
        if (!this.A08) {
            this.A08 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r3 = A1T.A1s;
            C14550pN.A15(r3, this);
            this.A0A = C14550pN.A0v(r3);
            AnonymousClass01J A0R = C14530pL.A0R(A1T, r3, this);
            C14530pL.A0a(A1T, r3, this);
            this.A04 = (C25841Li) r3.AB1.get();
            AnonymousClass01J r1 = r3.AQz;
            this.A03 = (C16490t9) r1.get();
            this.A02 = (C16760tb) r3.APV.get();
            this.A05 = (C18210wK) r3.AE4.get();
            this.A06 = new AnonymousClass4I6((C16440t3) A0R.get(), (C16490t9) r1.get());
        }
    }

    public void A36(File file) {
        Uri parse;
        byte[] bArr;
        File file2 = this.A0J;
        String path = file2 == null ? null : file2.getPath();
        if (this.A0L.size() == 0) {
            A37(false);
            return;
        }
        VideoSurfaceView videoSurfaceView = this.A07;
        MediaPlayer mediaPlayer = videoSurfaceView.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            videoSurfaceView.A0C.release();
            videoSurfaceView.A0C = null;
            videoSurfaceView.A02 = 0;
        }
        if (getIntent().getBooleanExtra("send", false)) {
            C16750ta r11 = new C16750ta();
            byte[] bArr2 = null;
            if (path != null) {
                File A0D = C13700nu.A0D(path);
                r11.A0F = A0D;
                bArr = C18830xK.A03(C18830xK.A01(A0D), 100);
                parse = null;
            } else {
                parse = Uri.parse(getIntent().getStringExtra("media_url"));
                r11.A08 = getIntent().getIntExtra("media_width", -1);
                r11.A06 = getIntent().getIntExtra("media_height", -1);
                String stringExtra = getIntent().getStringExtra("preview_media_url");
                if (stringExtra != null) {
                    bArr2 = this.A04.A03(stringExtra);
                }
                bArr = bArr2;
            }
            r11.A05 = this.A00;
            this.A02.A07(this.A05.A00(parse, r11, this.A08, (C16740tZ) null, C40651uT.A05(this.A0G.A05.getStringText()), this.A0L, this.A0G.A05.getMentions(), (List) null, (byte) 13, 0, 0, getIntent().getBooleanExtra("number_from_url", false)), bArr, this.A0M, !this.A0K.equals(this.A0L));
            int i2 = r11.A05;
            if (i2 != 0) {
                C74323qM r5 = new C74323qM();
                int i3 = 0;
                if (i2 != 1) {
                    if (i2 == 2) {
                        i3 = 1;
                    } else {
                        throw AnonymousClass000.A0T(C13680ns.A0c(i2, "Unexpected provider type "));
                    }
                }
                r5.A00 = Integer.valueOf(i3);
                this.A03.A06(r5);
            }
            if (this.A0L.size() > 1 || (this.A0L.size() == 1 && C16030sJ.A0Q((Jid) this.A0L.get(0)))) {
                Agv(this.A0L);
            }
            setResult(-1);
        } else {
            Intent A09 = C13680ns.A09();
            A09.putExtra("file_path", path);
            A09.putExtra("jids", C16030sJ.A06(this.A0L));
            this.A0F.A01(A09, this.A08);
            A09.putExtra("audience_clicked", this.A0M);
            A09.putExtra("audience_updated", !this.A0K.equals(this.A0L));
            if (path == null) {
                A09.putExtra("media_url", getIntent().getStringExtra("media_url"));
                A09.putExtra("media_width", getIntent().getIntExtra("media_width", -1));
                A09.putExtra("media_height", getIntent().getIntExtra("media_height", -1));
                A09.putExtra("preview_media_url", getIntent().getStringExtra("preview_media_url"));
            }
            A09.putExtra("provider", getIntent().getIntExtra("provider", 0));
            A09.putExtra(FacebookFacade.RequestParameter.CAPTION, C40651uT.A05(this.A0G.A05.getStringText()));
            A09.putStringArrayListExtra("mentions", C16030sJ.A06(this.A0G.A05.getMentions()));
            A09.putExtra("clear_message_after_send", getIntent().getBooleanExtra("clear_message_after_send", false));
            setResult(-1, A09);
        }
        int intExtra = getIntent().getIntExtra("origin", 23);
        boolean contains = this.A0L.contains(C34771kq.A00);
        int A002 = C13700nu.A00(this.A0L, contains ? 1 : 0);
        AnonymousClass4I6 r6 = this.A06;
        boolean z2 = this.A0N;
        boolean z3 = this.A0M;
        boolean z4 = !this.A0K.equals(this.A0L);
        AnonymousClass322 r1 = new AnonymousClass322();
        r1.A05 = 11;
        r1.A04 = Integer.valueOf(intExtra);
        r1.A0I = C13690nt.A0W(contains);
        r1.A06 = C13690nt.A0W(A002);
        Long A0W = C13690nt.A0W(1);
        r1.A0C = A0W;
        r1.A0D = A0W;
        Long A0W2 = C13690nt.A0W(0);
        r1.A07 = A0W2;
        r1.A09 = A0W2;
        r1.A08 = A0W2;
        r1.A0A = A0W2;
        r1.A0E = A0W2;
        r1.A0G = A0W2;
        r1.A03 = false;
        r1.A02 = false;
        if (z2) {
            r1.A00 = Boolean.valueOf(z3);
            r1.A01 = Boolean.valueOf(z4);
        }
        r6.A01.A05(r1);
        finish();
    }

    public void ATN(File file, String str) {
        byte[] A032;
        super.ATN(file, str);
        if (!isFinishing()) {
            File file2 = this.A0J;
            String path = file2 == null ? null : file2.getPath();
            if (TextUtils.isEmpty(path)) {
                String stringExtra = getIntent().getStringExtra("preview_media_url");
                if (stringExtra == null || (A032 = this.A04.A03(stringExtra)) == null) {
                    this.A04.A02(this.A03, getIntent().getStringExtra("static_preview_url"));
                } else {
                    this.A03.setImageBitmap(BitmapFactory.decodeByteArray(A032, 0, A032.length, C25791Ld.A07));
                }
                C25841Li r2 = this.A04;
                String stringExtra2 = getIntent().getStringExtra("media_url");
                C102244yd r11 = new C102244yd(this);
                AnonymousClass00B.A01();
                C37661pW A002 = r2.A00();
                AnonymousClass20S A9Y = A002.A9Y(stringExtra2);
                if (A9Y != null) {
                    String str2 = A9Y.A00;
                    if (C13700nu.A0D(str2).exists() && A9Y.A02 != null) {
                        r11.ARL(C13700nu.A0D(str2), stringExtra2, A9Y.A02);
                    }
                }
                new C76263td(r2.A03, r2.A05, r2.A07, r2.A08, r2.A09, r2.A0A, A002, r11, stringExtra2).A02.executeOnExecutor(r2.A01(), new Void[0]);
                return;
            }
            this.A07.setVideoPath(path);
            this.A07.start();
            this.A01.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str14f1);
        ImageView imageView = (ImageView) AnonymousClass00T.A05(this, R.id.view_once_toggle);
        View A052 = AnonymousClass00T.A05(this, R.id.view_once_toggle_spacer);
        C13700nu.A0L(this, imageView, R.drawable.view_once_selector);
        C018808t.A00(AnonymousClass00T.A03(this, R.color.color06e6), imageView);
        imageView.setEnabled(false);
        imageView.setVisibility(0);
        A052.setVisibility(8);
        View view = new View(this);
        this.A01 = view;
        view.setId(R.id.gif_preview_shutter);
        C13680ns.A0u(this, this.A01, R.color.color0092);
        C13680ns.A0t(this, this.A01, R.string.str09b8);
        this.A01.setLayoutParams(C13690nt.A0M());
        this.A02.addView(this.A01, 0);
        VideoSurfaceView videoSurfaceView = new VideoSurfaceView(this);
        this.A07 = videoSurfaceView;
        videoSurfaceView.setId(R.id.gif_preview_video);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.dimen040b));
        this.A07.setLayoutParams(layoutParams);
        VideoSurfaceView videoSurfaceView2 = this.A07;
        videoSurfaceView2.A0B = new C91874gd();
        this.A02.addView(videoSurfaceView2, 0);
        int intExtra = getIntent().getIntExtra("provider", 0);
        int i2 = 1;
        if (intExtra != 1) {
            i2 = 2;
            if (intExtra != 2) {
                i2 = 0;
            }
        }
        this.A00 = i2;
        C004601z.A0d(this.A07, 2);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass2P5 r2 = this.A0G;
        if (r2 != null) {
            r2.A00.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A01);
            r2.A05.A08();
            r2.A03.dismiss();
            this.A0G = null;
        }
        C25841Li r22 = this.A04;
        C38411qk r0 = r22.A01;
        if (r0 != null) {
            r0.A02.A02(false);
            r22.A01 = null;
        }
    }

    public void onStop() {
        super.onStop();
        this.A07.A00();
    }
}
