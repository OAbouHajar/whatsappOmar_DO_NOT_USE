package X;

import android.util.Log;

/* renamed from: X.4dw  reason: invalid class name and case insensitive filesystem */
public final class C90314dw {
    public static final String[] A00 = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static C97154pU A00(C90504eH r3, String str, int i2, boolean z2, boolean z3) {
        int i3;
        r3.A0T(4);
        if (r3.A07() == 1684108385) {
            i3 = C90504eH.A01(r3, 8);
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            i3 = -1;
        }
        if (z3) {
            i3 = Math.min(1, i3);
        }
        if (i3 >= 0) {
            String num = Integer.toString(i3);
            return z2 ? new AnonymousClass3V7(str, (String) null, num) : new AnonymousClass3V9("und", str, num);
        }
        Log.w("MetadataUtil", AnonymousClass000.A0h(C88494ab.A00(i2), AnonymousClass000.A0r("Failed to parse uint8 attribute: ")));
        return null;
    }

    public static AnonymousClass3V7 A01(C90504eH r4, String str, int i2) {
        int A07 = r4.A07();
        if (r4.A07() == 1684108385 && A07 >= 22) {
            r4.A0T(10);
            int A0F = r4.A0F();
            if (A0F > 0) {
                String A0c = C13680ns.A0c(A0F, "");
                int A0F2 = r4.A0F();
                if (A0F2 > 0) {
                    A0c = C13680ns.A0i("/", AnonymousClass000.A0q(A0c), A0F2);
                }
                return new AnonymousClass3V7(str, (String) null, A0c);
            }
        }
        Log.w("MetadataUtil", AnonymousClass000.A0h(C88494ab.A00(i2), AnonymousClass000.A0r("Failed to parse index/count attribute: ")));
        return null;
    }

    public static AnonymousClass3V7 A02(C90504eH r4, String str, int i2) {
        int A07 = r4.A07();
        if (r4.A07() == 1684108385) {
            r4.A0T(8);
            return new AnonymousClass3V7(str, (String) null, r4.A0N(A07 - 16));
        }
        Log.w("MetadataUtil", AnonymousClass000.A0h(C88494ab.A00(i2), AnonymousClass000.A0r("Failed to parse text attribute: ")));
        return null;
    }
}
