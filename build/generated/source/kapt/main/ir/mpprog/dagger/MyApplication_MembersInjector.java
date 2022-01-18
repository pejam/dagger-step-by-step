package ir.mpprog.dagger;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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

  public MyApplication_MembersInjector(Provider<IRepository> iRepositoryProvider) {
    this.iRepositoryProvider = iRepositoryProvider;
  }

  public static MembersInjector<MyApplication> create(Provider<IRepository> iRepositoryProvider) {
    return new MyApplication_MembersInjector(iRepositoryProvider);
  }

  @Override
  public void injectMembers(MyApplication instance) {
    injectIRepository(instance, iRepositoryProvider.get());
  }

  @InjectedFieldSignature("ir.mpprog.dagger.MyApplication.iRepository")
  public static void injectIRepository(MyApplication instance, IRepository iRepository) {
    instance.iRepository = iRepository;
  }
}
