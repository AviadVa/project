package hackeru.lesson.project.service;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lhackeru/lesson/project/service/TMDBService;", "", "getMovies", "Lhackeru/lesson/project/service/dto/MovieResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface TMDBService {
    @org.jetbrains.annotations.NotNull
    public static final hackeru.lesson.project.service.TMDBService.Companion Companion = null;
    
    @retrofit2.http.GET(value = "discover/movie")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super hackeru.lesson.project.service.dto.MovieResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lhackeru/lesson/project/service/TMDBService$Companion;", "", "()V", "create", "Lhackeru/lesson/project/service/TMDBService;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final hackeru.lesson.project.service.TMDBService create() {
            return null;
        }
    }
}