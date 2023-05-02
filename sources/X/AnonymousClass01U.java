package X;

import com.obwhatsapp.bridge.wafflecal.WaffleCalModule;
import com.obwhatsapp.bridge.wafflex.di.WaffleXProductModule;
import com.obwhatsapp.chatinfo.di.ActivityModule;
import com.obwhatsapp.conversation.conversationrow.nativeflow.NativeFlowActionModule;
import com.obwhatsapp.cron.di.CronModule;
import com.obwhatsapp.dailyevent.di.DailyEventModule;
import com.obwhatsapp.data.migration.di.ForceMigrationModule;
import com.obwhatsapp.data.transactionlock.TransactionLockModule;
import com.obwhatsapp.dependencybridge.di.DependencyBridgeModule;
import com.obwhatsapp.di.CompanionModeModule;
import com.obwhatsapp.di.MigrationModule;
import com.obwhatsapp.fmessage.di.FMessageRegistrationsModule;
import com.obwhatsapp.fmessage.factory.di.FMessageFactoryModule;
import com.obwhatsapp.fmessage.platform.di.FMessagePlatformModule;
import com.obwhatsapp.fmessage.platform.registration.di.FMessagePlatformRegistrationModule;
import com.obwhatsapp.instrumentation.di.InstrumentationObserverModule;
import com.obwhatsapp.intents.di.IntentsModule;
import com.obwhatsapp.media.dailyusage.di.MediaDailyUsageModule;
import com.obwhatsapp.p2mlite.di.P2mLiteModule;
import com.obwhatsapp.settings.di.ChatSettingStoreModule;
import com.obwhatsapp.wabloks.commerce.di.CommerceBloksModule;
import com.whatsapp.fieldstats.di.InfraABPropsModule;
import com.whatsapp.stickers.di.RecentStickersModule;

/* renamed from: X.01U  reason: invalid class name */
public final class AnonymousClass01U {
    public WaffleCalModule A00;
    public WaffleXProductModule A01;
    public ActivityModule A02;
    public NativeFlowActionModule A03;
    public CronModule A04;
    public DailyEventModule A05;
    public ForceMigrationModule A06;
    public TransactionLockModule A07;
    public DependencyBridgeModule A08;
    public CompanionModeModule A09;
    public MigrationModule A0A;
    public InfraABPropsModule A0B;
    public FMessageRegistrationsModule A0C;
    public FMessageFactoryModule A0D;
    public FMessagePlatformModule A0E;
    public FMessagePlatformRegistrationModule A0F;
    public InstrumentationObserverModule A0G;
    public IntentsModule A0H;
    public MediaDailyUsageModule A0I;
    public P2mLiteModule A0J;
    public ChatSettingStoreModule A0K;
    public RecentStickersModule A0L;
    public CommerceBloksModule A0M;
    public AnonymousClass01L A0N;

    public AnonymousClass01F A00() {
        if (this.A02 == null) {
            this.A02 = new ActivityModule();
        }
        C16340ss.A00(AnonymousClass01L.class, this.A0N);
        ChatSettingStoreModule chatSettingStoreModule = this.A0K;
        ChatSettingStoreModule chatSettingStoreModule2 = chatSettingStoreModule;
        if (chatSettingStoreModule == null) {
            chatSettingStoreModule2 = new ChatSettingStoreModule();
            this.A0K = chatSettingStoreModule2;
        }
        CommerceBloksModule commerceBloksModule = this.A0M;
        CommerceBloksModule commerceBloksModule2 = commerceBloksModule;
        if (commerceBloksModule == null) {
            commerceBloksModule2 = new CommerceBloksModule();
            this.A0M = commerceBloksModule2;
        }
        CompanionModeModule companionModeModule = this.A09;
        CompanionModeModule companionModeModule2 = companionModeModule;
        if (companionModeModule == null) {
            companionModeModule2 = new CompanionModeModule();
            this.A09 = companionModeModule2;
        }
        CronModule cronModule = this.A04;
        CronModule cronModule2 = cronModule;
        if (cronModule == null) {
            cronModule2 = new CronModule();
            this.A04 = cronModule2;
        }
        DailyEventModule dailyEventModule = this.A05;
        DailyEventModule dailyEventModule2 = dailyEventModule;
        if (dailyEventModule == null) {
            dailyEventModule2 = new DailyEventModule();
            this.A05 = dailyEventModule2;
        }
        DependencyBridgeModule dependencyBridgeModule = this.A08;
        DependencyBridgeModule dependencyBridgeModule2 = dependencyBridgeModule;
        if (dependencyBridgeModule == null) {
            dependencyBridgeModule2 = new DependencyBridgeModule();
            this.A08 = dependencyBridgeModule2;
        }
        FMessageFactoryModule fMessageFactoryModule = this.A0D;
        FMessageFactoryModule fMessageFactoryModule2 = fMessageFactoryModule;
        if (fMessageFactoryModule == null) {
            fMessageFactoryModule2 = new FMessageFactoryModule();
            this.A0D = fMessageFactoryModule2;
        }
        FMessagePlatformModule fMessagePlatformModule = this.A0E;
        FMessagePlatformModule fMessagePlatformModule2 = fMessagePlatformModule;
        if (fMessagePlatformModule == null) {
            fMessagePlatformModule2 = new FMessagePlatformModule();
            this.A0E = fMessagePlatformModule2;
        }
        FMessagePlatformRegistrationModule fMessagePlatformRegistrationModule = this.A0F;
        if (fMessagePlatformRegistrationModule == null) {
            fMessagePlatformRegistrationModule = new FMessagePlatformRegistrationModule();
            this.A0F = fMessagePlatformRegistrationModule;
        }
        FMessageRegistrationsModule fMessageRegistrationsModule = this.A0C;
        if (fMessageRegistrationsModule == null) {
            fMessageRegistrationsModule = new FMessageRegistrationsModule();
            this.A0C = fMessageRegistrationsModule;
        }
        ForceMigrationModule forceMigrationModule = this.A06;
        if (forceMigrationModule == null) {
            forceMigrationModule = new ForceMigrationModule();
            this.A06 = forceMigrationModule;
        }
        InfraABPropsModule infraABPropsModule = this.A0B;
        if (infraABPropsModule == null) {
            infraABPropsModule = new InfraABPropsModule();
            this.A0B = infraABPropsModule;
        }
        InstrumentationObserverModule instrumentationObserverModule = this.A0G;
        if (instrumentationObserverModule == null) {
            instrumentationObserverModule = new InstrumentationObserverModule();
            this.A0G = instrumentationObserverModule;
        }
        IntentsModule intentsModule = this.A0H;
        if (intentsModule == null) {
            intentsModule = new IntentsModule();
            this.A0H = intentsModule;
        }
        MediaDailyUsageModule mediaDailyUsageModule = this.A0I;
        if (mediaDailyUsageModule == null) {
            mediaDailyUsageModule = new MediaDailyUsageModule();
            this.A0I = mediaDailyUsageModule;
        }
        MigrationModule migrationModule = this.A0A;
        if (migrationModule == null) {
            migrationModule = new MigrationModule();
            this.A0A = migrationModule;
        }
        NativeFlowActionModule nativeFlowActionModule = this.A03;
        if (nativeFlowActionModule == null) {
            nativeFlowActionModule = new NativeFlowActionModule();
            this.A03 = nativeFlowActionModule;
        }
        P2mLiteModule p2mLiteModule = this.A0J;
        if (p2mLiteModule == null) {
            p2mLiteModule = new P2mLiteModule();
            this.A0J = p2mLiteModule;
        }
        RecentStickersModule recentStickersModule = this.A0L;
        if (recentStickersModule == null) {
            recentStickersModule = new RecentStickersModule();
            this.A0L = recentStickersModule;
        }
        TransactionLockModule transactionLockModule = this.A07;
        if (transactionLockModule == null) {
            transactionLockModule = new TransactionLockModule();
            this.A07 = transactionLockModule;
        }
        WaffleCalModule waffleCalModule = this.A00;
        if (waffleCalModule == null) {
            waffleCalModule = new WaffleCalModule();
            this.A00 = waffleCalModule;
        }
        WaffleXProductModule waffleXProductModule = this.A01;
        if (waffleXProductModule == null) {
            waffleXProductModule = new WaffleXProductModule();
            this.A01 = waffleXProductModule;
        }
        return new C16150sX(waffleCalModule, waffleXProductModule, this.A02, nativeFlowActionModule, cronModule2, dailyEventModule2, forceMigrationModule, transactionLockModule, dependencyBridgeModule2, companionModeModule2, migrationModule, infraABPropsModule, fMessageRegistrationsModule, fMessageFactoryModule2, fMessagePlatformModule2, fMessagePlatformRegistrationModule, instrumentationObserverModule, intentsModule, mediaDailyUsageModule, p2mLiteModule, chatSettingStoreModule2, recentStickersModule, commerceBloksModule2, this.A0N);
    }
}
