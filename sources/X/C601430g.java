package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.data.ProfilePhotoChange;

/* renamed from: X.30g  reason: invalid class name and case insensitive filesystem */
public class C601430g extends AnonymousClass2QC {
    public boolean A00;
    public final ImageView A01;
    public final ImageView A02 = C13680ns.A0K(this, R.id.photo_new);
    public final ImageView A03 = C13680ns.A0K(this, R.id.photo_old);

    public C601430g(Context context, AnonymousClass1YG r5, AnonymousClass1WU r6) {
        super(context, r5, r6);
        A0g();
        ImageView A0K = C13680ns.A0K(this, R.id.arrow);
        this.A01 = A0K;
        C447725m.A01(context, A0K, this.A0K, R.drawable.ic_chat_icon_change_arrow);
        A0f();
    }

    private void A0f() {
        ProfilePhotoChange profilePhotoChange;
        byte[] bArr;
        ImageView imageView;
        ImageView imageView2;
        AnonymousClass1WU r2 = (AnonymousClass1WU) this.A0O;
        C28381Vw r3 = r2.A11;
        if (!(!r3.A02 || r2.A00 != 6 || (profilePhotoChange = ((C39321sH) r2).A00) == null || (bArr = profilePhotoChange.newPhoto) == null || profilePhotoChange.oldPhoto == null)) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            byte[] bArr2 = profilePhotoChange.oldPhoto;
            Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
            if (!(decodeByteArray == null || decodeByteArray2 == null)) {
                if (this.A1B.A0m(C16050sL.A03(r3.A00))) {
                    Bitmap A002 = C17200uh.A00(decodeByteArray2, -2.14748365E9f, decodeByteArray2.getWidth());
                    Bitmap A003 = C17200uh.A00(decodeByteArray, -2.14748365E9f, decodeByteArray.getWidth());
                    imageView = this.A03;
                    imageView.setImageBitmap(A002);
                    imageView2 = this.A02;
                    imageView2.setImageBitmap(A003);
                } else {
                    Resources A0D = C13680ns.A0D(this);
                    int i2 = Build.VERSION.SDK_INT;
                    C02170Ac r32 = i2 >= 21 ? new AnonymousClass0EE(A0D, decodeByteArray2) : new AnonymousClass0ED(A0D, decodeByteArray2);
                    Resources A0D2 = C13680ns.A0D(this);
                    C02170Ac r22 = i2 >= 21 ? new AnonymousClass0EE(A0D2, decodeByteArray) : new AnonymousClass0ED(A0D2, decodeByteArray);
                    r32.A06 = true;
                    r32.A05 = true;
                    r32.A00 = (float) (Math.min(r32.A01, r32.A02) >> 1);
                    r32.A0A.setShader(r32.A08);
                    r32.invalidateSelf();
                    r22.A06 = true;
                    r22.A05 = true;
                    r22.A00 = (float) (Math.min(r22.A01, r22.A02) >> 1);
                    r22.A0A.setShader(r22.A08);
                    r22.invalidateSelf();
                    imageView = this.A03;
                    imageView.setImageDrawable(r32);
                    imageView2 = this.A02;
                    imageView2.setImageDrawable(r22);
                }
                imageView.setVisibility(0);
                imageView2.setVisibility(0);
                this.A01.setVisibility(0);
                return;
            }
        }
        this.A03.setVisibility(8);
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
    }

    public void A0g() {
        if (!this.A00) {
            this.A00 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
            this.A09 = C16150sX.A0m(A06);
            C30011bb.A0N(A05, A06, A07, this, A06.A3P);
        }
    }

    public void A0t() {
        A0f();
        super.A0t();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A0f();
        }
    }

    public int getBackgroundResource() {
        return 0;
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01bc;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01bc;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01bc;
    }
}
