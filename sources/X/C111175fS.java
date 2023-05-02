package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import com.mod.bomfab.R$styleable;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5fS  reason: invalid class name and case insensitive filesystem */
public final class C111175fS extends AnonymousClass5wI implements Cloneable {
    public Rect A00;
    public Rect A01;
    public AnonymousClass5vQ A02;
    public AnonymousClass5vQ A03;
    public AnonymousClass5vQ A04;
    public AnonymousClass5vQ A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Double A0C;
    public Double A0D;
    public Double A0E;
    public Float A0F;
    public Float A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Long A0X;
    public String A0Y;
    public String A0Z;
    public List A0a;
    public List A0b;
    public final C111155fQ A0c;
    public final int[] A0d = new int[2];

    public C111175fS(Camera.Parameters parameters, C111155fQ r7) {
        int i2;
        Camera.Size size;
        Camera.Size size2;
        Boolean bool = Boolean.FALSE;
        this.A07 = bool;
        this.A08 = bool;
        Integer A0X2 = C13680ns.A0X();
        this.A0J = A0X2;
        this.A0S = A0X2;
        this.A0B = bool;
        Double valueOf = Double.valueOf(0.0d);
        this.A0C = valueOf;
        this.A0E = valueOf;
        this.A0D = valueOf;
        this.A0X = AnonymousClass3K2.A0Z();
        this.A0P = A0X2;
        this.A0M = A0X2;
        this.A09 = bool;
        this.A0U = A0X2;
        this.A06 = Boolean.TRUE;
        this.A0Z = parameters.flatten();
        this.A0c = r7;
        this.A0L = Integer.valueOf(AnonymousClass5xX.A03(parameters.getFocusMode()));
        this.A0H = Integer.valueOf(AnonymousClass5xX.A00(parameters.getAntibanding()));
        this.A0I = Integer.valueOf(AnonymousClass5xX.A01(parameters.getColorEffect()));
        if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A02, r7)) {
            this.A07 = Boolean.valueOf(parameters.getAutoExposureLock());
        }
        if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A05, r7)) {
            this.A08 = Boolean.valueOf(parameters.getAutoWhiteBalanceLock());
        }
        this.A0K = Integer.valueOf(AnonymousClass5xX.A02(parameters.getFlashMode()));
        if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0C, r7)) {
            this.A0J = Integer.valueOf(parameters.getExposureCompensation());
        }
        this.A0a = AnonymousClass5wJ.A02(AnonymousClass5wJ.A0O, r7) ? C119115vz.A00(C119385xd.A03(parameters.get("focus-areas"))) : Collections.emptyList();
        this.A0F = Float.valueOf(parameters.getHorizontalViewAngle());
        this.A0G = Float.valueOf(parameters.getVerticalViewAngle());
        this.A0N = Integer.valueOf(parameters.getJpegQuality());
        try {
            i2 = parameters.getJpegThumbnailQuality();
        } catch (NumberFormatException e2) {
            Log.e("ParametersHelper", AnonymousClass000.A0h(parameters.get("jpeg-thumbnail-quality"), AnonymousClass000.A0r("Invalid jpeg thumbnail quality parameter string=")), e2);
            i2 = 85;
        }
        this.A0O = Integer.valueOf(i2);
        try {
            Camera.Size jpegThumbnailSize = parameters.getJpegThumbnailSize();
            this.A02 = new AnonymousClass5vQ(jpegThumbnailSize.width, jpegThumbnailSize.height);
        } catch (NumberFormatException unused) {
        }
        this.A0b = AnonymousClass5wJ.A02(AnonymousClass5wJ.A0P, r7) ? C119115vz.A00(C119385xd.A03(parameters.get("metering-areas"))) : Collections.emptyList();
        this.A0Q = Integer.valueOf(parameters.getPictureFormat());
        AnonymousClass5vQ r3 = null;
        try {
            size = parameters.getPictureSize();
        } catch (NumberFormatException unused2) {
            size = null;
        }
        A07(AnonymousClass5wI.A0g, size != null ? new AnonymousClass5vQ(size.width, size.height) : null);
        this.A0R = Integer.valueOf(parameters.getPreviewFormat());
        parameters.getPreviewFpsRange(this.A0d);
        if (!r7.A0Y.isEmpty()) {
            this.A0S = Integer.valueOf(parameters.getPreviewFrameRate());
        }
        this.A0T = Integer.valueOf(AnonymousClass5xX.A04(parameters.getSceneMode()));
        this.A0A = Boolean.valueOf(parameters.getVideoStabilization());
        this.A0V = Integer.valueOf(AnonymousClass5xX.A05(parameters.getWhiteBalance()));
        this.A0W = Integer.valueOf(parameters.getZoom());
        try {
            size2 = parameters.getPreviewSize();
        } catch (NumberFormatException unused3) {
            size2 = null;
        }
        A07(AnonymousClass5wI.A0m, size2 != null ? new AnonymousClass5vQ(size2.width, size2.height) : r3);
    }

    public String A06() {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("mFocusMode");
        sb.append('=');
        sb.append(this.A0L);
        sb.append(",mAntibanding");
        sb.append('=');
        sb.append(this.A0H);
        sb.append(",mColorEffect");
        sb.append('=');
        sb.append(this.A0I);
        sb.append(",mIsAutoExposureLock");
        sb.append('=');
        sb.append(this.A07);
        sb.append(",mIsAutoWhiteBalanceLock");
        sb.append('=');
        sb.append(this.A08);
        sb.append(",mFlashMode");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mExposureCompensation");
        sb.append('=');
        sb.append(this.A0J);
        sb.append(",mFocusAreas");
        sb.append('=');
        sb.append(C119385xd.A01(this.A0a));
        sb.append(",mHorizontalViewAngle");
        sb.append('=');
        sb.append(this.A0F);
        sb.append(",mVerticalViewAngle");
        sb.append('=');
        sb.append(this.A0G);
        sb.append(",mJpegQuality");
        sb.append('=');
        sb.append(this.A0N);
        sb.append(",mJpegThumbnailQuality");
        sb.append('=');
        sb.append(this.A0O);
        sb.append(",mJpegThumbnailSize");
        sb.append('=');
        AnonymousClass5vQ r3 = this.A02;
        String str = "null";
        if (r3 != null) {
            AnonymousClass5vQ.A01(r3, sb);
        } else {
            sb.append(str);
        }
        sb.append(",mMeteringAreas");
        sb.append('=');
        sb.append(C119385xd.A01(this.A0b));
        sb.append(",mPictureFormat");
        sb.append('=');
        sb.append(this.A0Q);
        sb.append(",mPictureSize");
        sb.append('=');
        AnonymousClass5vQ r0 = this.A03;
        if (r0 != null) {
            AnonymousClass5vQ.A01(r0, sb);
        } else {
            sb.append(str);
        }
        sb.append(",mYuvPictureSize");
        sb.append('=');
        sb.append(str);
        sb.append(",mPreviewFormat");
        sb.append('=');
        sb.append(this.A0R);
        sb.append(",mPreviewFpsRange");
        sb.append('=');
        int[] iArr = this.A0d;
        sb.append(iArr[0]);
        sb.append('-');
        sb.append(iArr[1]);
        sb.append(",mPreviewSize");
        sb.append('=');
        AnonymousClass5vQ r02 = this.A04;
        if (r02 != null) {
            AnonymousClass5vQ.A01(r02, sb);
        } else {
            sb.append(str);
        }
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0M);
        sb.append(",mSceneMode");
        sb.append('=');
        sb.append(this.A0T);
        sb.append(",mIsVideoStabilizationEnabled");
        sb.append('=');
        sb.append(this.A0A);
        sb.append(",mIsPreviewStabilizationEnabled");
        sb.append('=');
        sb.append(false);
        sb.append(",mVideoSize");
        sb.append('=');
        AnonymousClass5vQ r03 = this.A05;
        if (r03 != null) {
            AnonymousClass5vQ.A01(r03, sb);
        } else {
            sb.append(str);
        }
        sb.append(",mWhiteBalance");
        sb.append('=');
        sb.append(this.A0V);
        sb.append(",mZoom");
        sb.append('=');
        sb.append(this.A0W);
        sb.append(",mPreviewRect");
        sb.append("=(");
        Rect rect = this.A01;
        sb.append(rect != null ? rect.flattenToString() : str);
        sb.append(')');
        sb.append(",mPictureRect");
        sb.append("=(");
        Rect rect2 = this.A00;
        if (rect2 != null) {
            str = rect2.flattenToString();
        }
        sb.append(str);
        sb.append(')');
        sb.append(",mRecordingHint");
        sb.append('=');
        sb.append(this.A0B);
        sb.append(",mGpsAltitude");
        sb.append('=');
        sb.append(this.A0C);
        sb.append(",mGpsLongitude");
        sb.append('=');
        sb.append(this.A0E);
        sb.append(",mGpsLatitude");
        sb.append('=');
        sb.append(this.A0D);
        sb.append(",mGpsProcessingMethod");
        sb.append('=');
        sb.append(this.A0Y);
        sb.append(",mGpsTimestamp");
        sb.append('=');
        sb.append(this.A0X);
        sb.append(",mPhotoRotation");
        sb.append('=');
        sb.append(this.A0P);
        sb.append(",mVideoRotation");
        sb.append('=');
        sb.append(this.A0U);
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0M);
        sb.append(",mSourceConfig");
        sb.append('=');
        return AnonymousClass000.A0h(this.A0Z, sb);
    }

    public void A07(C115835qO r7, Object obj) {
        int i2 = r7.A00;
        if (i2 == 3) {
            this.A0A = (Boolean) obj;
        } else if (i2 == 27) {
            this.A0X = (Long) obj;
        } else if (i2 == 42) {
            this.A0Y = (String) obj;
        } else if (i2 == 45) {
            this.A06 = (Boolean) obj;
        } else if (i2 == 52) {
        } else {
            if (i2 == 57) {
                this.A09 = (Boolean) obj;
            } else if (i2 != 59) {
                switch (i2) {
                    case 8:
                        this.A0B = (Boolean) obj;
                        return;
                    case 9:
                        this.A0L = (Integer) obj;
                        return;
                    case 10:
                        this.A0K = (Integer) obj;
                        return;
                    case 11:
                        this.A0H = (Integer) obj;
                        return;
                    case 12:
                        this.A0I = (Integer) obj;
                        return;
                    case 13:
                        this.A0J = (Integer) obj;
                        return;
                    case 14:
                        this.A0N = (Integer) obj;
                        return;
                    case 15:
                        this.A0O = (Integer) obj;
                        return;
                    default:
                        switch (i2) {
                            case 17:
                                this.A0Q = (Integer) obj;
                                return;
                            case 18:
                                this.A0R = (Integer) obj;
                                return;
                            case 19:
                                this.A0S = (Integer) obj;
                                return;
                            default:
                                switch (i2) {
                                    case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                                        this.A0P = (Integer) obj;
                                        return;
                                    case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                                        this.A0M = (Integer) obj;
                                        return;
                                    case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                                        this.A0T = (Integer) obj;
                                        return;
                                    case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                                        this.A0V = (Integer) obj;
                                        return;
                                    case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                                        this.A0W = (Integer) obj;
                                        return;
                                    default:
                                        Rect rect = null;
                                        switch (i2) {
                                            case 30:
                                                this.A0C = (Double) obj;
                                                return;
                                            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                                                this.A0E = (Double) obj;
                                                return;
                                            case 32:
                                                this.A0D = (Double) obj;
                                                return;
                                            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                                                AnonymousClass5vQ r8 = (AnonymousClass5vQ) obj;
                                                this.A04 = r8;
                                                if (r8 != null) {
                                                    rect = new Rect(0, 0, r8.A02, r8.A01);
                                                }
                                                this.A01 = rect;
                                                return;
                                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                                AnonymousClass5vQ r82 = (AnonymousClass5vQ) obj;
                                                this.A03 = r82;
                                                if (r82 != null) {
                                                    rect = new Rect(0, 0, r82.A02, r82.A01);
                                                }
                                                this.A00 = rect;
                                                return;
                                            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                                                this.A05 = (AnonymousClass5vQ) obj;
                                                return;
                                            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                                                this.A02 = (AnonymousClass5vQ) obj;
                                                return;
                                            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                                                this.A0a = C119115vz.A00((List) obj);
                                                return;
                                            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                                                this.A0b = C119115vz.A00((List) obj);
                                                return;
                                            case 39:
                                                int[] iArr = (int[]) obj;
                                                if (iArr != null && iArr.length == 2) {
                                                    int[] iArr2 = this.A0d;
                                                    iArr2[0] = iArr[0];
                                                    iArr2[1] = iArr[1];
                                                    return;
                                                }
                                                return;
                                            default:
                                                throw AnonymousClass000.A0a(C13680ns.A0c(i2, "Cannot directly set: "));
                                        }
                                }
                        }
                }
            } else {
                this.A0U = (Integer) obj;
            }
        }
    }

    public Object clone() {
        return super.clone();
    }
}
