package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.voipcalling.H26xSupportResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1OL  reason: invalid class name */
public class AnonymousClass1OL {
    public SharedPreferences A00;
    public final C14710pd A01;
    public final C17020u3 A02;

    public AnonymousClass1OL(C14710pd r1, C17020u3 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public static final String A00(int i2, int i3) {
        if (i3 == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("voip_camera_info_");
            sb.append(i2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip_camera_info_");
        sb2.append(i2);
        sb2.append("_api_");
        sb2.append(i3);
        return sb2.toString();
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("voip_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public String A02() {
        String A06 = this.A01.A06(C16620tM.A02, 151);
        return TextUtils.isEmpty(A06) ? A01().getString("camera2_required_hardware_support_level", (String) null) : A06;
    }

    public List A03() {
        Map<String, ?> all = A01().getAll();
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            if (next.startsWith("joinable_")) {
                arrayList.add(next.substring(9));
            }
        }
        return arrayList;
    }

    public void A04(H26xSupportResult h26xSupportResult) {
        A01().edit().putBoolean("video_codec_h264_hw_supported", h26xSupportResult.isH264HwSupported).putBoolean("video_codec_h264_sw_supported", h26xSupportResult.isH264SwSupported).putBoolean("video_codec_h265_hw_supported", h26xSupportResult.isH265HwSupported).putBoolean("video_codec_h265_sw_supported", h26xSupportResult.isH265SwSupported).apply();
    }
}
