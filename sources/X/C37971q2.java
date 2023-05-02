package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import java.io.File;
import org.apache.commons.io.FileUtils;

/* renamed from: X.1q2  reason: invalid class name and case insensitive filesystem */
public class C37971q2 {
    public static void A00(File file, Boolean bool, String str) {
        WebpInfo verifyWebpFileIntegrity = WebpUtils.verifyWebpFileIntegrity(file.getAbsolutePath());
        int length = (int) (file.length() / FileUtils.ONE_KB);
        if (verifyWebpFileIntegrity == null) {
            StringBuilder sb = new StringBuilder("sticker file might be corrupted or invalid, sticker: ");
            sb.append(str);
            throw new C37951q0(sb.toString());
        } else if (verifyWebpFileIntegrity.height != 512) {
            StringBuilder sb2 = new StringBuilder("sticker height should be 512, sticker: ");
            sb2.append(str);
            throw new C37951q0(sb2.toString());
        } else if (verifyWebpFileIntegrity.width == 512) {
            int i2 = verifyWebpFileIntegrity.numFrames;
            if (i2 > 1) {
                if (bool != null && !bool.booleanValue()) {
                    StringBuilder sb3 = new StringBuilder("pack is not marked as animated pack but contains animated stickers. sticker: ");
                    sb3.append(str);
                    throw new C37951q0(sb3.toString());
                } else if (verifyWebpFileIntegrity.minFrameDurationMS < 8) {
                    StringBuilder sb4 = new StringBuilder("frame duration for any frame should exceed ");
                    sb4.append(8);
                    sb4.append(" ms. sticker: ");
                    sb4.append(str);
                    throw new C37951q0(sb4.toString());
                } else if (verifyWebpFileIntegrity.totalAnimationDurationMS > ((long) SearchActionVerificationClientService.NOTIFICATION_ID)) {
                    StringBuilder sb5 = new StringBuilder("total animation duration should be under ");
                    sb5.append(SearchActionVerificationClientService.NOTIFICATION_ID);
                    sb5.append(" ms. sticker: ");
                    sb5.append(str);
                    throw new C37951q0(sb5.toString());
                }
            } else if (bool != null && bool.booleanValue()) {
                StringBuilder sb6 = new StringBuilder("pack is marked as animated pack but contains non animated stickers. All stickers in animated pack should be animated sticker. check sticker: ");
                sb6.append(str);
                throw new C37951q0(sb6.toString());
            }
            long j2 = (long) length;
            long j3 = i2 > 1 ? (long) 500 : 100;
            if (j2 > j3) {
                StringBuilder sb7 = new StringBuilder("sticker file should be less than ");
                sb7.append(j3);
                sb7.append(" kB, file: ");
                sb7.append(str);
                throw new C37951q0(sb7.toString());
            }
        } else {
            StringBuilder sb8 = new StringBuilder("sticker width should be  512, sticker: ");
            sb8.append(str);
            throw new C37951q0(sb8.toString());
        }
    }

    public static boolean A01(String str, String str2) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str2);
        sb.append("/");
        if (!str.startsWith(sb.toString())) {
            StringBuilder sb2 = new StringBuilder("http://");
            sb2.append(str2);
            sb2.append("/");
            return str.startsWith(sb2.toString());
        }
    }
}
