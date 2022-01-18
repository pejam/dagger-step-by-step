package ir.mpprog.dagger;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import ir.mpprog.dagger.util.OsInfo;
import javax.annotation.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyApplication_MembersInjector implements MembersInjector<MyApplication> {
  private final Provider<IRepository> iRepositoryProvider;

  private final Provider<OsInfo> osInfoProvider;

  public MyApplication_MembersInjector(Provider<IRepository> iRepositoryProvider,
      Provider<OsInfo> osInfoProvider) {
    this.iRepositoryProvider = iRepositoryProvider;
    this.osInfoProvider = osInfoProvider;
  }

  public static MembersInjector<MyApplication> create(Provider<IRepository> iRepositoryProvider,
      Provider<OsInfo> osInfoProvider) {
    return new MyApplication_MembersInjector(iRepositoryProvider, osInfoProvider);
  }

  @Override
  public void injectMembers(MyApplication instance) {
    injectIRepository(instance, iRepositoryProvider.get());
    injectOsInfo(instance, osInfoProvider.get());
  }

  @InjectedFieldSignature("ir.mpprog.dagger.MyApplication.iRepository")
  public static void injectIRepository(MyApplication instance, IRepository iRepository) {
    instance.iRepository = iRepository;
  }

  @InjectedFieldSignature("ir.mpprog.dagger.MyApplication.osInfo")
  public static void injectOsInfo(MyApplication instance, OsInfo osInfo) {
    instance.osInfo = osInfo;
  }
}
