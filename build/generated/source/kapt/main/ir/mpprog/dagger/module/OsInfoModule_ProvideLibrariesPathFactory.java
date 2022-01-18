package ir.mpprog.dagger.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.mpprog.dagger.util.OsInfo;
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
public final class OsInfoModule_ProvideLibrariesPathFactory implements Factory<OsInfo> {
  private final OsInfoModule module;

  public OsInfoModule_ProvideLibrariesPathFactory(OsInfoModule module) {
    this.module = module;
  }

  @Override
  public OsInfo get() {
    return provideLibrariesPath(module);
  }

  public static OsInfoModule_ProvideLibrariesPathFactory create(OsInfoModule module) {
    return new OsInfoModule_ProvideLibrariesPathFactory(module);
  }

  public static OsInfo provideLibrariesPath(OsInfoModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideLibrariesPath());
  }
}
