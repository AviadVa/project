package hackeru.lesson.project.ui.home;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lhackeru/lesson/project/ui/home/HomeViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "context", "Landroid/app/Application;", "(Landroid/app/Application;)V", "dao", "Lhackeru/lesson/project/data/MovieDao;", "db", "Lhackeru/lesson/project/data/AppDatabase;", "movies", "Landroidx/lifecycle/LiveData;", "", "Lhackeru/lesson/project/entity/Movie;", "getMovies", "()Landroidx/lifecycle/LiveData;", "repo", "Lhackeru/lesson/project/repository/MovieRepository;", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.app.Application context = null;
    @org.jetbrains.annotations.NotNull
    private final hackeru.lesson.project.data.AppDatabase db = null;
    @org.jetbrains.annotations.NotNull
    private final hackeru.lesson.project.data.MovieDao dao = null;
    @org.jetbrains.annotations.NotNull
    private final hackeru.lesson.project.repository.MovieRepository repo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<hackeru.lesson.project.entity.Movie>> movies = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<hackeru.lesson.project.entity.Movie>> getMovies() {
        return null;
    }
}