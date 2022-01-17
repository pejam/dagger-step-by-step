package ir.mpprog.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<Capitalizer> capitalizerProvider;

  public Repository_Factory(Provider<Capitalizer> capitalizerProvider) {
    this.capitalizerProvider = capitalizerProvider;
  }

  @Override
  public Repository get() {
    return newInstance(capitalizerProvider.get());
  }

  public static Repository_Factory create(Provider<Capitalizer> capitalizerProvider) {
    return new Repository_Factory(capitalizerProvider);
  }

  public static Repository newInstance(Capitalizer capitalizer) {
    return new Repository(capitalizer);
  }
}
