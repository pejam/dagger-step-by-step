package ir.mpprog.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import ir.mpprog.dagger.module.AppModule;
import ir.mpprog.dagger.module.AppModule_ProvideCapitalizerFactory;
import ir.mpprog.dagger.module.OsInfoModule;
import ir.mpprog.dagger.module.OsInfoModule_ProvideLibrariesPathFactory;
import javax.annotation.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final AppModule appModule;

  private final OsInfoModule osInfoModule;

  private final DaggerAppComponent appComponent = this;

  private DaggerAppComponent(AppModule appModuleParam, OsInfoModule osInfoModuleParam) {
    this.appModule = appModuleParam;
    this.osInfoModule = osInfoModuleParam;

  }

  public static Builder builder() {
    return new Builder();
  }

  private RepositoryImpl repositoryImpl() {
    return new RepositoryImpl(AppModule_ProvideCapitalizerFactory.provideCapitalizer(appModule));
  }

  @Override
  public void inject(MyApplication app) {
    injectMyApplication(app);
  }

  private MyApplication injectMyApplication(MyApplication instance) {
    MyApplication_MembersInjector.injectIRepository(instance, repositoryImpl());
    MyApplication_MembersInjector.injectOsInfo(instance, OsInfoModule_ProvideLibrariesPathFactory.provideLibrariesPath(osInfoModule));
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private OsInfoModule osInfoModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder osInfoModule(OsInfoModule osInfoModule) {
      this.osInfoModule = Preconditions.checkNotNull(osInfoModule);
      return this;
    }

    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      Preconditions.checkBuilderRequirement(osInfoModule, OsInfoModule.class);
      return new DaggerAppComponent(appModule, osInfoModule);
    }
  }
}
