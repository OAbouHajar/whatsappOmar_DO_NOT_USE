package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4;
import com.obwhatsapp.PagerSlidingTabStrip;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.obwhatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.obwhatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.util.Log;

/* renamed from: X.342  reason: invalid class name */
public abstract class AnonymousClass342 extends C70543h9 implements C14650pX, C107935Ma {
    public Uri A00;
    public ImageView A01;
    public ViewPager A02;
    public C23101Am A03;
    public AnonymousClass1G1 A04;
    public C208811y A05;
    public C17090uW A06;
    public PagerSlidingTabStrip A07;
    public C24961Hy A08;
    public C17180uf A09;
    public C16000sG A0A;
    public AnonymousClass156 A0B;
    public C17030uP A0C;
    public C16080sP A0D;
    public C23181Au A0E;
    public C15800rs A0F;
    public C17120uZ A0G;
    public C16260sj A0H;
    public AnonymousClass013 A0I;
    public C19820z3 A0J;
    public C226818w A0K;
    public C16490t9 A0L;
    public C17190ug A0M;
    public C18090w8 A0N;
    public C18290wS A0O;
    public C86434Sr A0P;
    public C51202bB A0Q;
    public C57162qN A0R;
    public ContactQrMyCodeFragment A0S;
    public QrScanCodeFragment A0T;
    public AnonymousClass1A9 A0U;
    public C23201Aw A0V;
    public String A0W;
    public boolean A0X;
    public boolean A0Y = false;
    public boolean A0Z;
    public boolean A0a;
    public final AnonymousClass5QC A0b = new C63203Gn(this);

    public static void A02(AnonymousClass342 r7) {
        if (r7.A0T == null) {
            return;
        }
        if (r7.A0H.A03("android.permission.CAMERA") != 0) {
            C54932iV r5 = new C54932iV(r7);
            r5.A01 = R.drawable.permission_cam;
            int[] iArr = {R.string.str1cf7};
            r5.A06 = R.string.str119e;
            r5.A0I = iArr;
            int[] iArr2 = {R.string.str1cf7};
            r5.A09 = R.string.str119d;
            r5.A0G = iArr2;
            r5.A0K = new String[]{"android.permission.CAMERA"};
            r5.A0D = true;
            r7.startActivityForResult(r5.A00(), 1);
            return;
        }
        r7.A0T.A1C();
    }

    public void A1R(AnonymousClass01A r4) {
        super.A1R(r4);
        if (r4 instanceof ContactQrMyCodeFragment) {
            ContactQrMyCodeFragment contactQrMyCodeFragment = (ContactQrMyCodeFragment) r4;
            this.A0S = contactQrMyCodeFragment;
            String str = this.A0W;
            if (str != null) {
                contactQrMyCodeFragment.A02 = str;
                ContactQrContactCardView contactQrContactCardView = contactQrMyCodeFragment.A01;
                if (contactQrContactCardView != null) {
                    contactQrContactCardView.setQrCode(C13680ns.A0h("https://wa.me/qr/", str));
                }
            }
        } else if (r4 instanceof QrScanCodeFragment) {
            this.A0T = (QrScanCodeFragment) r4;
            ViewPager viewPager = this.A02;
            if (viewPager == null) {
                Log.e("BaseQrActivity/onAttachFragment/viewPagerNull");
            } else if (1 == viewPager.getCurrentItem()) {
                A02(this);
            }
        }
    }

    public void A35() {
        C434920f.A04(this, R.color.color04f1);
        setTitle(getString(R.string.str058a));
        setContentView((int) R.layout.layout0148);
        Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(this, R.id.toolbar);
        C14530pL.A0W(this, toolbar, this.A0I);
        toolbar.setTitle((CharSequence) getString(R.string.str058a));
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape19S0100000_I1_4(this, 19));
        Aem(toolbar);
        this.A0P = new C86434Sr();
        this.A02 = (ViewPager) AnonymousClass00T.A05(this, R.id.contact_qr_pager);
        this.A07 = (PagerSlidingTabStrip) AnonymousClass00T.A05(this, R.id.contact_qr_tab_strip);
        ImageView imageView = (ImageView) AnonymousClass00T.A05(this, R.id.contact_qr_preview);
        this.A01 = imageView;
        C004601z.A0d(imageView, 2);
        C16440t3 r32 = this.A05;
        C14710pd r36 = this.A0C;
        C14870pt r47 = this.A05;
        C16040sK r46 = this.A01;
        C16320sq r41 = this.A05;
        C16490t9 r26 = this.A0L;
        C23101Am r24 = this.A03;
        C15900s5 r23 = this.A06;
        C17090uW r22 = this.A06;
        C17190ug r21 = this.A0M;
        C16000sG r25 = this.A0A;
        AnonymousClass01V r20 = this.A08;
        C16080sP r19 = this.A0D;
        C208811y r18 = this.A05;
        C18290wS r17 = this.A0O;
        AnonymousClass1G1 r15 = this.A04;
        C226818w r14 = this.A0K;
        C17030uP r13 = this.A0C;
        C15800rs r11 = this.A0F;
        C23201Aw r10 = this.A0V;
        C18090w8 r9 = this.A0N;
        C17180uf r8 = this.A09;
        C18260wP r7 = this.A07;
        AnonymousClass156 r6 = this.A0B;
        C19820z3 r5 = this.A0J;
        int i2 = 0;
        C51202bB r132 = new C51202bB(r24, r15, r18, this, r47, r22, r46, r23, this.A08, r8, r7, r25, r6, r13, r19, this.A0E, r11, r20, r32, this.A0G, r5, r14, r36, r26, r21, r9, r17, r41, r10, C13680ns.A0a(), false, true);
        this.A0Q = r132;
        r132.A02 = true;
        C57162qN r3 = new C57162qN(AGM(), this);
        this.A0R = r3;
        this.A02.setAdapter(r3);
        this.A02.A0G(new C57802rp(this));
        C004601z.A0f(this.A07, 0);
        this.A07.setViewPager(this.A02);
        String stringExtra = getIntent().getStringExtra("qrcode");
        if (stringExtra != null) {
            this.A0X = true;
            A38(stringExtra, false, 5);
        }
        if (!this.A0X) {
            A37(false);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("scan", false);
        this.A0a = booleanExtra;
        AnonymousClass013 r0 = this.A0I;
        boolean z2 = !(booleanExtra ? r0.A0T() : C13680ns.A1Z(r0));
        this.A02.A0F(z2 ? 1 : 0, false);
        C57162qN r33 = this.A0R;
        do {
            r33.A00[i2].A00.setSelected(AnonymousClass000.A1R(i2, z2));
            i2++;
        } while (i2 < 2);
    }

    public void A36() {
        int i2;
        if (!this.A0H.A0B()) {
            AnonymousClass00B.A06(this);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                i2 = R.string.str1250;
            } else {
                i2 = R.string.str1253;
                if (i3 < 33) {
                    i2 = R.string.str1252;
                }
            }
            Ag3(RequestPermissionActivity.A02(this, R.string.str1251, i2, 0, 0, false, false), 4);
        } else if (this.A0W == null) {
            Log.e("BaseQrActivity/shareFailed/noQr");
            this.A05.A09(R.string.str15fd, 0);
        } else {
            Afq(R.string.str058f);
            C16320sq r4 = this.A05;
            C14870pt r7 = this.A05;
            C16040sK r6 = this.A01;
            boolean z2 = true;
            C14870pt r15 = r7;
            C16040sK r16 = r6;
            AnonymousClass36N r12 = new AnonymousClass36N(this, this.A04, r15, r16, C13680ns.A0d(this, C13680ns.A0h("https://wa.me/qr/", this.A0W), new Object[1], 0, R.string.str0572));
            Bitmap[] bitmapArr = new Bitmap[1];
            C16040sK r0 = this.A01;
            r0.A0B();
            C28881Zb r3 = r0.A01;
            AnonymousClass00B.A06(r3);
            if (this.A09.A0C() != 0) {
                z2 = false;
            }
            bitmapArr[0] = new C613138k(r3, getString(R.string.str0588), C13680ns.A0h("https://wa.me/qr/", this.A0W), z2).A00(this);
            r4.Ack(r12, bitmapArr);
        }
    }

    public abstract void A37(boolean z2);

    public boolean A38(String str, boolean z2, int i2) {
        if (this.A0Q.A0a || this.A0Z) {
            return false;
        }
        return this.A0Q.A02(str, i2, z2, false);
    }

    public void AVW() {
        if (AnonymousClass29T.A03(this)) {
            return;
        }
        if (this.A0X) {
            finish();
            return;
        }
        this.A01.setVisibility(8);
        this.A01.setImageBitmap((Bitmap) null);
        if (this.A0T != null) {
            this.A0Q.A0a = false;
            this.A0T.A08 = null;
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 1) {
            if (i2 == 2) {
                if (i3 == -1) {
                    if (intent != null) {
                        Uri data = intent.getData();
                        this.A00 = data;
                        if (data != null) {
                            Afq(R.string.str058f);
                            C13700nu.A0W(new AnonymousClass36O(this.A00, this, this.A0U, this.A01.getWidth(), this.A01.getHeight()), this.A05);
                            return;
                        }
                        this.A05.A09(R.string.str0848, 0);
                    } else {
                        return;
                    }
                }
                this.A0Z = false;
            } else if (i2 == 3) {
                this.A0T.A08 = null;
            } else if (i2 == 4 && i3 == -1) {
                A36();
            }
        } else if (i3 != 0) {
            this.A0T.A1C();
        } else if (this.A0a) {
            finish();
        } else {
            this.A02.A0F(C13680ns.A1Z(this.A0I) ^ true ? 1 : 0, true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A35();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        int currentItem = this.A02.getCurrentItem();
        char A1Z = C13680ns.A1Z(this.A0I);
        if (currentItem == 0) {
            A1Z ^= 1;
        } else if (currentItem != 1) {
            A1Z = 65535;
        }
        if (A1Z != 0) {
            if (A1Z == 1) {
                menu.setGroupVisible(0, false);
            }
            return true;
        }
        menu.setGroupVisible(0, true);
        return true;
    }

    public void onStart() {
        super.onStart();
        this.A0P.A01(getWindow(), this.A08);
        this.A01.setVisibility(8);
        this.A01.setImageBitmap((Bitmap) null);
    }

    public void onStop() {
        this.A0P.A00(getWindow());
        super.onStop();
    }
}
