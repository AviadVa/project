package hackeru.lesson.project.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0011\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lhackeru/lesson/project/repository/MovieRepository;", "", "movieDao", "Lhackeru/lesson/project/data/MovieDao;", "(Lhackeru/lesson/project/data/MovieDao;)V", "getMovies", "Landroidx/lifecycle/LiveData;", "", "Lhackeru/lesson/project/entity/Movie;", "refreshMovies", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MovieRepository {
    @org.jetbrains.annotations.NotNull
    private final hackeru.lesson.project.data.MovieDao movieDao = null;
    
    public MovieRepository(@org.jetbrains.annotations.NotNull
    hackeru.lesson.project.data.MovieDao movieDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<hackeru.lesson.project.entity.Movie>> getMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refreshMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}