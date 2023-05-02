package X;

/* renamed from: X.5Ex  reason: invalid class name and case insensitive filesystem */
public final class C106715Ex extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass5N1 $batchStickerDownloadListener;
    public final /* synthetic */ C1041354b $downloadedStickerCount;
    public final /* synthetic */ C37771pi $stickerPack;
    public final /* synthetic */ int $totalStickerCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106715Ex(C37771pi r2, AnonymousClass5N1 r3, C1041354b r4, int i2) {
        super(0);
        this.$downloadedStickerCount = r4;
        this.$totalStickerCount = i2;
        this.$batchStickerDownloadListener = r3;
        this.$stickerPack = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        C1041354b r1 = this.$downloadedStickerCount;
        int i2 = r1.element + 1;
        r1.element = i2;
        int i3 = (int) (((double) (((float) i2) / ((float) this.$totalStickerCount))) * 100.0d);
        AnonymousClass5N1 r12 = this.$batchStickerDownloadListener;
        String str = this.$stickerPack.A0F;
        AnonymousClass37M r2 = ((AnonymousClass528) r12).A00;
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = str;
        AnonymousClass000.A1L(A1Z, i3);
        r2.A07(A1Z);
        return AnonymousClass22M.A00;
    }
}
