package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4OZ  reason: invalid class name */
public class AnonymousClass4OZ {
    public int A00;
    public int A01;
    public String A02;
    public ArrayList A03;
    public final C17130ua A04;
    public final C19950zG A05;
    public final File A06;
    public final List A07 = Arrays.asList(new String[]{"es-AR", "en-AU", "de-AT", "nl-BE", "fr-BE", "pt-BR", "en-CA", "fr-CA", "es-CL", "da-DK", "fi-FI", "fr-FR", "de-DE", "zh-HK", "en-IN", "en-ID", "en-IE", "it-IT", "ja-JP", "ko-KR", "en-MY", "es-MX", "nl-NL", "en-NZ", "no-NO", "zh-CN", "pl-PL", "pt-PT", "en-PH", "ru-RU", "ar-SA", "en-ZA", "es-ES", "sv-SE", "fr-CH", "de-CH", "zh-TW", "tr-TR", "en-GB", "en-US", "es-US"});

    public AnonymousClass4OZ(C17130ua r4, C16980tz r5, C19950zG r6, String str) {
        this.A04 = r4;
        this.A05 = r6;
        this.A02 = str;
        File file = new File(r5.A00.getCacheDir(), "Bing");
        this.A06 = file;
        file.mkdirs();
    }
}
